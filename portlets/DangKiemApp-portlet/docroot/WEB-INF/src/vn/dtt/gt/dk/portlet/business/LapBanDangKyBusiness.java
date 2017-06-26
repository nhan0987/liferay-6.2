/**
 * 
 */
package vn.dtt.gt.dk.portlet.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement;
import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetestRequirementImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil;
import vn.dtt.gt.dk.report.ReportUtils;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.DateUtils;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

/**
 * @author binhnt
 *
 */
public class LapBanDangKyBusiness {
	private static Log _log = LogFactoryUtil.getLog(LapBanDangKyBusiness.class);
	NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
	LanhDaoPhongBusiness lanhDaoPhongBusiness = new LanhDaoPhongBusiness();

	public void huyBienBanKiemTra(ActionRequest request, ActionResponse response) {
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		long idInspectionRecord = ParamUtil.getLong(request, Constants.ID_INSPECTION_RECORD);
		long userId = PortalUtil.getUserId(request);
		
		long registerInspectionId = 0;
		RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
		if (registeredInspection != null) {
			registerInspectionId = registeredInspection.getId();
		}
		_log.info("idPhieuXuLyPhu" + idPhieuXuLyPhu);
		_log.info("ID_INSPECTION_RECORD" + idInspectionRecord);
		_log.info("huyBienBanKiemtra");
		_log.debug("===huyBienBanKiemTra=====idHoSoThuTuc==  " + idHoSoThuTuc + " ==idPhieuXuLyPhu== " + idPhieuXuLyPhu);

		InspectionRecord inspectionRecord = null;
		if(idInspectionRecord > 0) {
			try {
				inspectionRecord = InspectionRecordLocalServiceUtil.fetchInspectionRecord(idInspectionRecord);
			} catch (SystemException e) {
				_log.error(e);
			}
		} else if(idPhieuXuLyPhu > 0) {
			inspectionRecord = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
		}

		if(inspectionRecord != null) {
			nghiepVuBusiness.huyBienBanKiemtra(idHoSoThuTuc, idPhieuXuLyPhu, "", userId, registerInspectionId, inspectionRecord);
		}
		
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public void banDangKyGuiLanhDao(ActionRequest request, ActionResponse response) {
		try{
			long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
			long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
			long userId = PortalUtil.getUserId(request);
			
			_log.info("===banDangKyGuiLanhDao=====idHoSoThuTuc==  " + idHoSoThuTuc + " ==idPhieuXuLyPhu== " + idPhieuXuLyPhu);
	
			InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
	
			boolean kq = nghiepVuBusiness.deNghiDuyetBienBanKiemtra(idHoSoThuTuc, idPhieuXuLyPhu, userId, inspectionRecord);
			TthcNoidungHoSo tthcNoidungHoSo = null;
			if(inspectionRecord != null){
				tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(inspectionRecord.getAttachedFile());
			}
			if(kq){
				_log.info("===========banDangKyGuiLanhDao===========bo qua upload file dinh kem BBKT"); // Sonvh commented 20160716
//				if (tthcNoidungHoSo != null) {
//					
//					if(tthcNoidungHoSo.getTaiLieuDinhKem() == 0) {
//						String urlFile = ReportUtils.urlFileJasperExport(request.getPortletSession(), tthcNoidungHoSo);
//						
//						if(Validator.isNotNull(urlFile)){
//							boolean kqUpload = LanhDaoPhongBusiness.uploadFileByIdNoiDungHoSo(tthcNoidungHoSo.getId(), urlFile, userId, request);
//							if(!kqUpload){
//								_log.info("===========banDangKyGuiLanhDao===========chua upload duoc");
//							}
//						}
//					}
//					
//				}
			}
			
			PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(request, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		} catch (Exception e) {
			_log.error(e);
		}
	}

	public void updatePhanCongDangKiemVien(ActionRequest request, ActionResponse response) {
		try {
			long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
			long phieuXuLyPhuId = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
			
			//Phan Lam tren form tab THONG TIN CHUNG
			List<VehicleRecord> lstVehicleRecord = null;
			InspectionRecord inspectionRecordOld = null;
			try {
				inspectionRecordOld = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(phieuXuLyPhuId);

				lstVehicleRecord = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecordOld.getId());
			} catch (Exception e) {
				_log.error(e);
			}
			_log.debug("===START==updatePhanCongDangKiemVien===inspectionRecordOld=====" + inspectionRecordOld);
			if (lstVehicleRecord == null) {
				lstVehicleRecord = new ArrayList<VehicleRecord>();
			}
			
			//gio truyen vao dieu kien de hien thi tren form kia day
			//truong hop nay config sau vay hoi sau vay.
			
			String dieuKienChuyenDich = "";
			
			long registerInspectionId = 0;
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(hoSoThuTucId);
			if (registeredInspection != null) {
				registerInspectionId = registeredInspection.getId();
			}
			
			//dang lam den day
			//long idVehicleGroup = ParamUtil.getLong(request, "lap_bien_ban_kt_id_vehicle_group");
			long idConfirmedInspection = ParamUtil.getLong(request, Constants.ID_CONFIRMED_INSPECTION);
			
			String[] lstGiaTriKiemTra = ParamUtil.getParameterValues(request, "giaTriKiemTra", null);
			String[] lstSelLuaChonKetQua = ParamUtil.getParameterValues(request, "selLuaChonKetQua", null);
			
			if (lstGiaTriKiemTra != null) {
				for (int i = 0; i < lstGiaTriKiemTra.length; i++) {
					_log.debug("lstGiaTriKiemTra=" + lstGiaTriKiemTra[i]);
				}
			}
			
			if (lstSelLuaChonKetQua != null) {
				for (int i = 0; i < lstSelLuaChonKetQua.length; i++) {
					_log.debug("lstSelLuaChonKetQua=" + lstSelLuaChonKetQua[i]);
				}
			}
			
			InspectionRecord inspectionRecord = new InspectionRecordImpl();
			inspectionRecord.setConfirmedInspectionId(idConfirmedInspection);
			//Tam thoi, demo face
			//inspectionRecord.setId(CounterLocalServiceUtil.createCounter(InspectionRecord.class));
			
			//Ngay kiem tra: tu ngay -> den ngay
			Date inspectionDateFrom = DateUtils.stringToDate(ParamUtil.getString(request, "ngayktBatDau"), "dd/MM/yyyy HH:mm");
			Date inspectionDateTo = DateUtils.stringToDate(ParamUtil.getString(request, "ngayktKetThuc"), "dd/MM/yyyy HH:mm");
			inspectionRecord.setInspectionDateFrom((inspectionDateFrom == null) ? new Date() : inspectionDateFrom);
			inspectionRecord.setInspectionDateTo((inspectionDateTo == null) ? new Date() : inspectionDateTo);
			
			String noiDungKienNghi = ParamUtil.getString(request, "ghiChuInVaoGiayChungChi");
			inspectionRecord.setDescription((noiDungKienNghi.length() == 0) ? "Ghi chu" : noiDungKienNghi);
			
			String remarks = ParamUtil.getString(request, "yKienDangKiemVien");
			inspectionRecord.setRemarks(remarks);
			
			inspectionRecord.setInspectionSite(ParamUtil.getString(request, "diaDiemKiemTra"));
			
			String markupControl = ParamUtil.getString(request, "markupControl");
			String markupEmissionTest = ParamUtil.getString(request, "markupEmissionTest");
			String markupSafeTest = ParamUtil.getString(request, "markupSafeTest");
			
			inspectionRecord.setMarkupControl((markupControl.length() == 0) ? 0 : 1);
			inspectionRecord.setMarkupEmissionTest((markupEmissionTest.length() == 0) ? 0 : 1);
			inspectionRecord.setMarkupSafeTest((markupSafeTest.length() == 0) ? 0 : 1);
			
			String confirmedResult = ParamUtil.getString(request, "thongBaoKetQua");
			inspectionRecord.setConfirmedResult(ConvertUtil.convertToLong(confirmedResult));
			
			inspectionRecord.setInspectionRecordDate((inspectionDateFrom == null) ? new Date() : inspectionDateFrom);
			
			String soBienBanKiemTra = ParamUtil.getString(request, "soBienBanKiemTra");
			inspectionRecord.setInspectionRecordNo(soBienBanKiemTra);
			inspectionRecord.setPhieuXuLyPhuId(phieuXuLyPhuId);
			
			
			List<InspectionRecordSpec> lstInspectionRecordSpec = new ArrayList<InspectionRecordSpec>();
			InspectionRecordSpec tempIRspect = null;
			_log.debug("========lstSelLuaChonKetQua=updatePhanCongDangKiemVienupdatePhanCongDangKiemVien=size==" + lstSelLuaChonKetQua.length);
			
			List<VehicleSpecification> lstVehicleSpecification = new ArrayList<VehicleSpecification>();
			if (lstVehicleRecord!= null && lstVehicleRecord.size() > 0) {
				lstVehicleSpecification = VehicleSpecificationLocalServiceUtil.findByVehicleGroupId(lstVehicleRecord.get(0).getVehicleGroupId());
			}
			
			_log.debug("===lstVehicleSpecification=updatePhanCongDangKiemVienupdatePhanCongDangKiemVien=size==" + lstVehicleSpecification);
			_log.debug("===lstGiaTriKiemTra=updatePhanCongDangKiemVienupdatePhanCongDangKiemVien=size==" + lstVehicleSpecification);
			_log.debug("===lstSelLuaChonKetQua=updatePhanCongDangKiemVienupdatePhanCongDangKiemVien=size==" + lstVehicleSpecification);
			
			if (lstVehicleSpecification != null) {
				int index = 0;
				int index2 = 0;
				for (VehicleSpecification vehicleSpecification : lstVehicleSpecification) {
					tempIRspect = new InspectionRecordSpecImpl();
					tempIRspect.setSpecificationCode(vehicleSpecification.getSpecificationCode());
					tempIRspect.setSpecificationName(vehicleSpecification.getSpecificationName());
					if (index > (lstGiaTriKiemTra.length - 1)) {
						index = 0;
					}
					if (index2 > (lstSelLuaChonKetQua.length - 1)) {
						index2 = 0;
					}
					tempIRspect.setSpecificationValue(lstGiaTriKiemTra[index]);
					tempIRspect.setEvaluationResult(ConvertUtil.convertToLong(lstSelLuaChonKetQua[index2]));
					lstInspectionRecordSpec.add(tempIRspect);
					index++;
					index2++;
				}
			}
			
			_log.debug("lstVehicleRecord=updatePhanCongDangKiemVienupdatePhanCongDangKiemVien=size==" + lstVehicleRecord.size() + "==lstInspectionRecordSpec==size==" + lstInspectionRecordSpec.size());
			
			if (lstVehicleRecord.size() > 0 && lstInspectionRecordSpec.size() > 0) {
				boolean result = nghiepVuBusiness.lapBienBanKiemtra(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, PortalUtil.getUserId(request),
					registerInspectionId, inspectionRecord, lstInspectionRecordSpec, lstVehicleRecord);
				_log.debug("====updatePhanCongDangKiemVienupdatePhanCongDangKiemVien=========result=======" + result);
			}
			
			_log.debug("==updatePhanCongDangKiemVien=updatePhanCongDangKiemVien===hoSoThuTucId=" + hoSoThuTucId + "=tthc_thutuchanhchinh_id=" + ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID) + "=phieuXuLyPhuId=" + phieuXuLyPhuId + "=thanh_phan_xu_ly=" + ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY));
			
			
			response.setRenderParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(hoSoThuTucId));
			response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID, ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID));
			response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(phieuXuLyPhuId));
			response.setRenderParameter(Constants.THANH_PHAN_XU_LY, ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY));
			
			inspectionRecordOld.setConfirmedInspectionId(0);
			inspectionRecordOld.setPhieuXuLyPhuId(0);
			InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecordOld);
			
			response.setRenderParameter("jspPage", "/portlet/quanlyhs/hoso_detail.jsp");
		} catch (Exception e) {
			_log.error(e);
		}
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void lapBanDangKyKhiThai(ActionRequest request, ActionResponse response) {
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		long idthuTucHanhChinh = ParamUtil.getLong(request, Constants.TTHC_THUTUCHANHCHINH_ID);
		long userId = PortalUtil.getUserId(request);
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
		
		String RequestTestingNumber = ParamUtil.getString(request, "RequestTestingNumber202");
		String ngayThangDeNghi = ParamUtil.getString(request, "ngayThangDeNghi202");
		String ReportTo = ParamUtil.getString(request, "ReportTo202");
		String ContentOfRequest = ParamUtil.getString(request, "ContentOfRequest202");
		String TestingRegisteredPlace = ParamUtil.getString(request, "TestingRegisteredPlace202");
		String TestingPayment = ParamUtil.getString(request, "TestingPayment202");
		String Remarks = ParamUtil.getString(request, "Remarks202");
		//String vehicleRecord = ParamUtil.getString(request, "vehicleRecord202");
		String testingRegistration = ParamUtil.getString(request, "testingRegistration202");
		String attachedFile = ParamUtil.getString(request, "attachedFile202");
		String signName = ParamUtil.getString(request, "signName202");
		String signPlace = ParamUtil.getString(request, "signPlace202");
		String signTitle = ParamUtil.getString(request, "signTitle202");
		

		_log.debug("===lapBanDangKyKhiThai=====idHoSoThuTuc==  " + idHoSoThuTuc + " ==idPhieuXuLyPhu== "+idPhieuXuLyPhu);
		//List<VehicleRecord> liVehicleRecords = lanhDaoPhongBusiness.getListVehicleRecord(vehicleRecord);
		
		List<VehicleRecord> liVehicleRecords = new ArrayList<VehicleRecord>();
		try {
			List<VehicleRecord> lstVehicleRecords = VehicleRecordLocalServiceUtil.findVehicleRecordByPhieuXuLyPhuId(idPhieuXuLyPhu);
			if(lstVehicleRecords != null && lstVehicleRecords.size() >0){
				VehicleRecord vehicleRecordsss = null;
				for (int i = 0; i < lstVehicleRecords.size(); i ++) {
					String vehicleRecord = ParamUtil.getString(request, "vehicleRecord202_" + i);
					vehicleRecordsss = VehicleRecordLocalServiceUtil.fetchVehicleRecord(ConvertUtil.convertToLong(vehicleRecord));
					if(vehicleRecordsss != null){
						liVehicleRecords.add(vehicleRecordsss);
					}
				}
			}
			InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
			
			EmissionTestRequirement emissionTestRequirement = new EmissionTestRequirementImpl();
			emissionTestRequirement.setRegisteredInspectionId(registeredInspection.getId());
			emissionTestRequirement.setRemarks(Remarks);
			emissionTestRequirement.setRequirementNumber(RequestTestingNumber);
			emissionTestRequirement.setTestingPaymentCondition(TestingPayment);
			emissionTestRequirement.setTestingRegisteredPlace(TestingRegisteredPlace);
			emissionTestRequirement.setTestingRegistration(testingRegistration);
			emissionTestRequirement.setCorporationId(ReportTo);
			emissionTestRequirement.setSignName(signName);
			emissionTestRequirement.setSignDate(new Date());
			emissionTestRequirement.setAttachedFile(ConvertUtil.convertToLong(attachedFile));
			emissionTestRequirement.setContentOfRequest(ContentOfRequest);
			emissionTestRequirement.setSignPlace(signPlace);
			emissionTestRequirement.setSignTitle(signTitle);
			emissionTestRequirement.setInspectionRecordId(inspectionRecord.getId());
			emissionTestRequirement.setPhieuXuLyPhuId(idPhieuXuLyPhu);
			_log.info("----------liVehicleRecords---------" + liVehicleRecords);
			if(liVehicleRecords!=null&&liVehicleRecords.size()>0){
				boolean nghiepVu = nghiepVuBusiness.lapDeNghiThuNhiemKhiThai(idHoSoThuTuc, idPhieuXuLyPhu, "", userId, registeredInspection.getRegisteredNumber(), 
						registeredInspection.getId(), emissionTestRequirement, liVehicleRecords, inspectionRecord);
				if (nghiepVu) {
					inspectionRecord.setMarkupEmissionTest(Constants.MARKUP_INSPECTION_RECORD_DA_LAP);
					InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		_log.debug("===lapBanDangKyKhiThai=====nghiepVu==  " + signTitle);
		
		response.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
		response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(idthuTucHanhChinh));
		response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(idPhieuXuLyPhu));
		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		response.setRenderParameter("jspPage", "/portlet/quanlyhs/hoso_detail.jsp");

		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void lapBanDangKyAnToan(ActionRequest request, ActionResponse response) {
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		long idthuTucHanhChinh = ParamUtil.getLong(request, Constants.TTHC_THUTUCHANHCHINH_ID);
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
		long userId = PortalUtil.getUserId(request);
		
		String RequestTestingNumber = ParamUtil.getString(request, "RequestTestingNumber203");
		String ngayThangDeNghi = ParamUtil.getString(request, "ngayThangDeNghi203");
		String ReportTo = ParamUtil.getString(request, "ReportTo203");
		String ContentOfRequest = ParamUtil.getString(request, "ContentOfRequest203");
		String TestingRegisteredPlace = ParamUtil.getString(request, "TestingRegisteredPlace203");
		String TestingPayment = ParamUtil.getString(request, "TestingPayment203");
		String Remarks = ParamUtil.getString(request, "Remarks203");
		//String vehicleRecord = ParamUtil.getString(request, "vehicleRecord203");
		String attachedFile = ParamUtil.getString(request, "attachedFile203");
		String testingRegistration = ParamUtil.getString(request, "testingRegistration203");
		String signName = ParamUtil.getString(request, "signName203");
		String signPlace = ParamUtil.getString(request, "signPlace203");
		String signTitle = ParamUtil.getString(request, "signTitle203");
		
		_log.debug("===lapBanDangKyAnToan=====idHoSoThuTuc==  " + idHoSoThuTuc + " ==idPhieuXuLyPhu== "+idPhieuXuLyPhu);
//		_log.debug("===lapBanDangKyAnToan===== + " ==RequestTestingNumber== "+RequestTestingNumber);
//		List<VehicleRecord> liVehicleRecords = lanhDaoPhongBusiness.getListVehicleRecord(vehicleRecord);
		List<VehicleRecord> liVehicleRecords = new ArrayList<VehicleRecord>();
		try {
			List<VehicleRecord> lstVehicleRecords = VehicleRecordLocalServiceUtil.findVehicleRecordByPhieuXuLyPhuId(idPhieuXuLyPhu);
			if(lstVehicleRecords != null && lstVehicleRecords.size() >0){
				VehicleRecord vehicleRecordsss = null;
				for (int i = 0; i < lstVehicleRecords.size(); i ++) {
					String vehicleRecord = ParamUtil.getString(request, "vehicleRecord203_" + i);
					vehicleRecordsss = VehicleRecordLocalServiceUtil.fetchVehicleRecord(ConvertUtil.convertToLong(vehicleRecord));
					if(vehicleRecordsss != null){
						liVehicleRecords.add(vehicleRecordsss);
					}
				}
			}
			
			InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);

			SafetestRequirement safetestRequirement = new SafetestRequirementImpl();
			safetestRequirement.setRegisteredInspectionId(registeredInspection.getId());
			safetestRequirement.setRemarks(Remarks);
			safetestRequirement.setRequirementNumber(RequestTestingNumber);
			safetestRequirement.setTestingPaymentCondition(TestingPayment);
			safetestRequirement.setTestingRegisteredPlace(TestingRegisteredPlace);
			safetestRequirement.setTestingRegistration(testingRegistration);
			safetestRequirement.setCorporationId(ReportTo);
			safetestRequirement.setAttachedFile(ConvertUtil.convertToLong(attachedFile));
			safetestRequirement.setSignDate(new Date());
			safetestRequirement.setSignName(signName);
			safetestRequirement.setSignPlace(signPlace);
			safetestRequirement.setSignTitle(signTitle);
			safetestRequirement.setInspectionRecordId(inspectionRecord.getId());;
			safetestRequirement.setPhieuXuLyPhuId(idPhieuXuLyPhu);
			safetestRequirement.setContentOfRequest(ContentOfRequest);
			
			if(liVehicleRecords!=null&&liVehicleRecords.size()>0){
				boolean nghiepVu = nghiepVuBusiness.lapDeNghiThuNhiemAnToan(idHoSoThuTuc, idPhieuXuLyPhu, "", 
						userId, safetestRequirement, liVehicleRecords, registeredInspection.getId(), registeredInspection.getRegisteredNumber(), inspectionRecord);
				if (nghiepVu) {
					inspectionRecord.setMarkupSafeTest(Constants.MARKUP_INSPECTION_RECORD_DA_LAP);
					InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		response.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
		response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(idthuTucHanhChinh));
		response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(idPhieuXuLyPhu));
		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		response.setRenderParameter("jspPage", "/portlet/quanlyhs/hoso_detail.jsp");

		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void lapBanDangKyGiamDinh(ActionRequest request, ActionResponse response) {
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		long idthuTucHanhChinh = ParamUtil.getLong(request, Constants.TTHC_THUTUCHANHCHINH_ID);
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY);
		long userId = PortalUtil.getUserId(request);
		
		String requestTestingNumber = ParamUtil.getString(request, "RequestTestingNumber204");
		String requirementNumber = ParamUtil.getString(request, "requirementNumber204");
		String ngayThangDeNghi = ParamUtil.getString(request, "ngayThangDeNghi204");
		String reportTo = ParamUtil.getString(request, "ReportTo204");
		String contentOfRequest = ParamUtil.getString(request, "ContentOfRequest204");
		String testingRegisteredPlace = ParamUtil.getString(request, "TestingRegisteredPlace204");
		String testingPayment = ParamUtil.getString(request, "TestingPayment204");
		String remarks = ParamUtil.getString(request, "Remarks204");
		String attachedFile = ParamUtil.getString(request, "attachedFile204");
		String signName = ParamUtil.getString(request, "signName204");
		String signTitle = ParamUtil.getString(request, "signTitle204");
		
//		String vehicleRecord = ParamUtil.getString(request, "vehicleRecord204");
//		List<VehicleRecord> liVehicleRecords = lanhDaoPhongBusiness.getListVehicleRecord(vehicleRecord);
		List<VehicleRecord> liVehicleRecords = new ArrayList<VehicleRecord>();
		try {
			List<VehicleRecord> lstVehicleRecords = VehicleRecordLocalServiceUtil.findVehicleRecordByPhieuXuLyPhuId(idPhieuXuLyPhu);
			if(lstVehicleRecords != null && lstVehicleRecords.size() >0){
				VehicleRecord vehicleRecordsss = null;
				for (int i = 0; i < lstVehicleRecords.size(); i ++) {
					String vehicleRecord = ParamUtil.getString(request, "vehicleRecord204_" + i);
					vehicleRecordsss = VehicleRecordLocalServiceUtil.fetchVehicleRecord(ConvertUtil.convertToLong(vehicleRecord));
					if(vehicleRecordsss != null){
						liVehicleRecords.add(vehicleRecordsss);
					}
				}
			}
		
		
			InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);

			ControlRequirement controlRequirement = new ControlRequirementImpl();
			controlRequirement.setRegisteredInspectionId(registeredInspection.getId());
			controlRequirement.setInspectionrecordId(inspectionRecord.getId());
			controlRequirement.setRequirementNumber(requirementNumber);
			controlRequirement.setCorporationId(reportTo);
			controlRequirement.setControlContent(contentOfRequest);
			//controlRequirement.setControlReportDeadline(controlReportDeadline);
			controlRequirement.setRemarks(remarks);
			controlRequirement.setAttachedFile(ConvertUtil.convertToInt(attachedFile));
			controlRequirement.setSignName(signName);
			controlRequirement.setSignTitle(signTitle);
			controlRequirement.setSignPlace(testingRegisteredPlace);
			controlRequirement.setSignDate(DateUtils.stringToDate(ngayThangDeNghi, "dd/MM/yyyy HH:mm"));
			controlRequirement.setPhieuxulyphuId(idPhieuXuLyPhu);
			
			String dieuKienChuyenDich = "";
			long registeredInspectionId = registeredInspection.getId();
			if(liVehicleRecords!=null&&liVehicleRecords.size()>0){
				boolean nghiepVu = nghiepVuBusiness.lapDeNghiGiamDinh(idHoSoThuTuc, idPhieuXuLyPhu, dieuKienChuyenDich, userId,
						registeredInspection.getRegisteredNumber(), registeredInspectionId, controlRequirement, liVehicleRecords, inspectionRecord);
				if (nghiepVu) {
					inspectionRecord.setMarkupControl(Constants.MARKUP_INSPECTION_RECORD_DA_LAP);
					InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		_log.debug("===lapBanDangKyGiamDinh=====idHoSoThuTuc==  " + idHoSoThuTuc + " ==idPhieuXuLyPhu== "+idPhieuXuLyPhu);

		response.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
		response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(idthuTucHanhChinh));
		response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(idPhieuXuLyPhu));
		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		response.setRenderParameter("jspPage", "/portlet/quanlyhs/hoso_detail.jsp");

		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
}
