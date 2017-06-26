package vn.dtt.gt.dk.portlet.business;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.ResourceRequest;

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.sendmessage.SendMessgaeFunctions;
import vn.dtt.gt.dk.utils.codec.FileKySoUtils;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;

public class ToTiepNhanBusiness {
	
	MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
	NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
	private Log _log = LogFactoryUtil.getLog(ToTiepNhanBusiness.class);
	
	public void dongDauChungChi(ActionRequest request, ActionResponse response) {

		// get data tu form
		long userId = PortalUtil.getUserId(request);
		long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY).trim();
		String dieuKienChuyenDich = ParamUtil.getString(request, Constants.DIEU_KIEN_CHUYEN_DICH);
		
		String listVehicleRecordId = ParamUtil.getString(request, "listVehicleRecordId");

		_log.info("hoSoThuTucId===" + idHoSoThuTuc + "===dieuKienChuyenDich===" + dieuKienChuyenDich+" idPhieuXuLyPhu   "+idPhieuXuLyPhu);
		_log.info("listVehicleRecordId===" + listVehicleRecordId);

		try {
			if (listVehicleRecordId != null) {
				List<VehicleRecord> liVehicleRecords = getListVehicleRecord(listVehicleRecordId);
				SendMessgaeFunctions messgaeFunctions = new  SendMessgaeFunctions();
				FunctionNghiepVu functionNghiepVu = new FunctionNghiepVu();
				String messageId= functionNghiepVu.getRamdomMessage();
//				messgaeFunctions.insertKeHoachChuyenDich(idPhieuXuLyPhu,idHoSoThuTuc, dieuKienChuyenDich, null,messageId );
//				long kq1 = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(idHoSoThuTuc, idPhieuXuLyPhu, dieuKienChuyenDich,
//						userId);
				///19/11/2015
				boolean flagAnChiCapLai = false;
				if (liVehicleRecords!=null && liVehicleRecords.size()>0){					
					for (VehicleRecord item: liVehicleRecords){
//						String urlFile=ParamUtil.getString(request, "vehicleRecord_kySo_"+item.getId());
//						_log.info("--==========urlFile-111111111-----"+urlFile);
//						TthcNoidungHoSo tthcNoidungHoSo=null;
						CertificateRecord certificateRecord=CertificateRecordLocalServiceUtil.fetchCertificateRecord(item.getCertificateRecordId());

						long doDaiCertificateNumber = DKConfigurationManager.getIntProp("VR_SIZE_SO_TU_TANG_CHUNG_CHI_GCN", 12);
						_log.info("==========certificateRecord.getStampStatus()======" + certificateRecord.getStampStatus());
						
						if(certificateRecord !=null && certificateRecord.getCertificateNumber().trim().length() > doDaiCertificateNumber 
								&& ((certificateRecord.getStampStatus() == Constants.AN_CHI_SUA_DOI_CHUA_IN) || (certificateRecord.getStampStatus() == Constants.AN_CHI_SUA_DOI_DA_IN_LIEN_1) )){
							flagAnChiCapLai = true;

							certificateRecord.setDigitalIssued(1);
							CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
						}
					}
					
					if(!flagAnChiCapLai){
						/////////////// gui Message 205-30
//						_log.info("----gui Message 205-30=====DONG DAU ");
						RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
						NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
						boolean kq = nghiepVuBusiness.guiMessage205va30SauKhiDongDau(idHoSoThuTuc, userId, 
								registeredInspection.getRegisteredNumber(),liVehicleRecords , registeredInspection.getId(),messageId); 
//						_log.info("--END--gui Message 205-30=====DONG DAU ");
					}
					// end gui
				}
				
				long check = TthcNoidungHoSoLocalServiceUtil.countSoLuongDaDongDau(idPhieuXuLyPhu);
				_log.info("check  "+check);
				if(check==0){
					if(!flagAnChiCapLai){
						messgaeFunctions.insertKeHoachChuyenDich(idPhieuXuLyPhu,idHoSoThuTuc, dieuKienChuyenDich, null,messageId ,null,"30","205" );
					}
					long kq1 = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(idHoSoThuTuc, idPhieuXuLyPhu, dieuKienChuyenDich,
							userId);
				}
				
			}
		} catch (Exception e) {
			_log.error(e);
		}

		response.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
		response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public  List<VehicleRecord> getListVehicleRecord(String listVehicleRecordId) {
		String[] vehicleId = listVehicleRecordId.split(",");
		List<VehicleRecord> liVehicleRecords = new ArrayList<VehicleRecord>();
		if (vehicleId != null && vehicleId.length > 0) {
			VehicleRecord vehicleRecord = null;
			for (int i = 0; i < vehicleId.length; i++) {
				try {
					vehicleRecord = VehicleRecordLocalServiceUtil.fetchVehicleRecord(ConvertUtil.convertToLong(vehicleId[i]));
					liVehicleRecords.add(vehicleRecord);
				} catch (Exception e) {
					_log.error(e);
				}
			}
		}
		
		return liVehicleRecords;
	}
	
	
	
	
	
	
		
	
	
	
	
}
