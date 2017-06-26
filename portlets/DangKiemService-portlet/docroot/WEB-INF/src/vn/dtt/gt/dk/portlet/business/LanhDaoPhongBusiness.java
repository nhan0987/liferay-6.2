/**
 * 
 */

package vn.dtt.gt.dk.portlet.business;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.ResourceRequest;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil;
import vn.dtt.gt.dk.utils.codec.FileKySoUtils;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.util.PortalUtil;

/**
 * @author binhnt
 *
 */
public class LanhDaoPhongBusiness {
	
	private static Log log = LogFactoryUtil.getLog(LanhDaoPhongBusiness.class);
	
	public void timKiemDebitNote(ActionRequest request, ActionResponse response) {
		String dieuKienChuyenDich = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
		
		response.setRenderParameter(Constants.LOAI_THU_TUC, dieuKienChuyenDich);
		response.setRenderParameter("jspPage", "/portlet/quanlyhs/thulyhs/tonghiepvu/listDebitNote.jsp");
		
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public void lanhDaoPhongKyXacNhan(ActionRequest request, ActionResponse response) {
		NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
		log.info("lanhDaoPhongKyXacNhan  anhnt");
		// get data tu form
		long userId = PortalUtil.getUserId(request);
		long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY).trim();
		String dieuKienChuyenDich = ParamUtil.getString(request, Constants.DIEU_KIEN_CHUYEN_DICH);
		
		String ykienXacNhan = ParamUtil.getString(request, "ykienXacNhan");
		String listVehicleRecordId = ParamUtil.getString(request, "listVehicleRecordId");
		
		log.debug("hoSoThuTucId===" + idHoSoThuTuc + "===dieuKienChuyenDich===" + dieuKienChuyenDich);
		log.debug("listVehicleRecordId===" + listVehicleRecordId);
		log.info("=====================LANH DAO PHONG KY XAC NHANNNNNNNNNN=========================" + idHoSoThuTuc + "===idPhieuXuLyPhu===" + idPhieuXuLyPhu);
		
		try {
			if (listVehicleRecordId != null) {
				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
				List<VehicleRecord> liVehicleRecords = getListVehicleRecord(listVehicleRecordId);
//				log.info("listVehicleRecordId "+listVehicleRecordId);
//				log.info("liVehicleRecords "+liVehicleRecords.size());
				Boolean kq =
					nghiepVuBusiness.kyDuyetChungChi(idHoSoThuTuc, idPhieuXuLyPhu, dieuKienChuyenDich, userId, registeredInspection.getRegisteredNumber(), liVehicleRecords, "editorName",
						registeredInspection.getId(), "signName", "signTitle", "signPlace", request, Constants.CHON_KY_SO);
				
				if (kq) {
//					long check = TthcNoidungHoSoLocalServiceUtil.countSoLuongKySo(idPhieuXuLyPhu);
//					if(check==0){
						nghiepVuBusiness.chuyenDichBBKTSauKyDuyetCC(idHoSoThuTuc, idPhieuXuLyPhu, dieuKienChuyenDich, userId);
					//}
					log.info("----------lanhDaoPhongKyXacNhan---------chuyenDichBBKTSauKyDuyetCC----");
				}
			}
		} catch (Exception e) {
			log.error(e);
		}
		
		response.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
		response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public void lanhDaoPhongKySo(ActionRequest request, ActionResponse response) {
		// get data tu form
		long userId = PortalUtil.getUserId(request);
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
		long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY).trim();
		String dieuKienChuyenDich = ParamUtil.getString(request, Constants.DIEU_KIEN_CHUYEN_DICH);
		
		String listVehicleRecordId = ParamUtil.getString(request, "listVehicleRecordId");
		log.info("=====================LANH DAO PHONG KY SO=========================" + idHoSoThuTuc + "===idPhieuXuLyPhu===" + idPhieuXuLyPhu);
		
		log.info("hoSoThuTucId===" + idHoSoThuTuc + "===dieuKienChuyenDich===" + dieuKienChuyenDich);
		log.info("listVehicleRecordId===" + listVehicleRecordId);
		
		try {
//			if (listVehicleRecordId != null) {
//				List<VehicleRecord> liVehicleRecords = getListVehicleRecord(listVehicleRecordId);
//				if (liVehicleRecords != null && liVehicleRecords.size() > 0) {
//					for (VehicleRecord item : liVehicleRecords) {
//						
//						String urlFile = ParamUtil.getString(request, "vehicleRecord_kySo_" + item.getId());
//						if (urlFile.trim().length() > 0) {
////							log.info("--==========urlFile--" + urlFile);
//							log.info("urlFile.trim().length() > 0");
//							TthcNoidungHoSo tthcNoidungHoSo = null;
//							CertificateRecord certificateRecord = null;
//							try {
//								certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(item.getCertificateRecordId());
//								if (certificateRecord != null && certificateRecord.getAttachedFile() > 0) {
//									tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(certificateRecord.getAttachedFile());
//								}
//								long noiLuuTruTaiLieuId = FileKySoUtils.uploadUrlFile(urlFile, userId, request);
//								log.info("noiLuuTruTaiLieuId  "+noiLuuTruTaiLieuId);
////													log.info("tthcNoidungHoSo.getTaiLieuDinhKem  "+tthcNoidungHoSo.getTaiLieuDinhKem());
//								//if (tthcNoidungHoSo != null && noiLuuTruTaiLieuId > 0 && tthcNoidungHoSo.getTaiLieuDinhKem() == 0) {
//								if (tthcNoidungHoSo != null && noiLuuTruTaiLieuId > 0) {
//									tthcNoidungHoSo.setTaiLieuDinhKem(noiLuuTruTaiLieuId);
//									TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(tthcNoidungHoSo);
//									
//									if(certificateRecord.getCertificateNumber().trim().length() > DKConfigurationManager.getIntProp("VR_SIZE_SO_TU_TANG_CHUNG_CHI_GCN", 12)){
//										certificateRecord.setStampStatus(Constants.AN_CHI_SUA_DOI_CHUA_IN);
//										CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
//									} else {
//										certificateRecord.setStampStatus(Constants.AN_CHI_CAP_MOI_CHUA_IN);
//										CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
//									}
//								}
//									
//							} catch (Exception e) {
//							}
//						}
//					}
//					
//				}
				long check = CertificateRecordLocalServiceUtil.countSoLuongChoDongDau(idPhieuXuLyPhu);
				if(check==0){
					NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
					nghiepVuBusiness.chuyenDichBBKTSauKySoCC(idHoSoThuTuc, idPhieuXuLyPhu, dieuKienChuyenDich, userId);
				}
//			}
		} catch (Exception e) {
			log.error(e);
		}
		
		response.setRenderParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
		response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void upDateKySo(ResourceRequest request, long userId,
			VehicleRecord item, String urlFile) {
		TthcNoidungHoSo tthcNoidungHoSo = null;
		CertificateRecord certificateRecord = null;
		try {
			certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(item.getCertificateRecordId());
			if (certificateRecord != null && certificateRecord.getAttachedFile() > 0) {
				tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(certificateRecord.getAttachedFile());
			}
			long noiLuuTruTaiLieuId = FileKySoUtils.uploadUrlFile(urlFile, userId, request);
//			log.info("noiLuuTruTaiLieuId  "+noiLuuTruTaiLieuId);
//								log.info("tthcNoidungHoSo.getTaiLieuDinhKem  "+tthcNoidungHoSo.getTaiLieuDinhKem());
			//if (tthcNoidungHoSo != null && noiLuuTruTaiLieuId > 0 && tthcNoidungHoSo.getTaiLieuDinhKem() == 0) {
			if (tthcNoidungHoSo != null && noiLuuTruTaiLieuId > 0) {
				tthcNoidungHoSo.setTaiLieuDinhKem(noiLuuTruTaiLieuId);
				TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(tthcNoidungHoSo);
				
				if(certificateRecord.getCertificateNumber().trim().length() > DKConfigurationManager.getIntProp("VR_SIZE_SO_TU_TANG_CHUNG_CHI_GCN", 12)){
					certificateRecord.setStampStatus(Constants.AN_CHI_SUA_DOI_CHUA_IN);
					CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
				} else {
					certificateRecord.setStampStatus(Constants.AN_CHI_CAP_MOI_CHUA_IN);
					CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
				}
			}
				
		} catch (Exception e) {
			log.error(e);
		}
	}
	
	public static List<DebitNote> getListDebitNote(String listDebitNoteId) {
		String[] vehicleId = listDebitNoteId.split(",");
		List<DebitNote> liVehicleRecords = new ArrayList<DebitNote>();
		if (vehicleId != null && vehicleId.length > 0) {
			DebitNote vehicleRecord = null;
			for (int i = 0; i < vehicleId.length; i++) {
				try {
					vehicleRecord = DebitNoteLocalServiceUtil.fetchDebitNote(ConvertUtil.convertToLong(vehicleId[i]));
					if(vehicleRecord != null){
						liVehicleRecords.add(vehicleRecord);
					}
				} catch (Exception e) {
					log.error(e);
				}
			}
		}
		
		return liVehicleRecords;
	}
	
	public List<Long> getListHoSoThuTucId(String listHoSoThuTucId) {
		String[] tthcHoSoThuTucIdArr = listHoSoThuTucId.split(",");
		List<Long> listHoSoThuTuc = new ArrayList<Long>();
		if (tthcHoSoThuTucIdArr != null && tthcHoSoThuTucIdArr.length > 0) {
			
			for (int i = 0; i < tthcHoSoThuTucIdArr.length; i++) {
				try {
					listHoSoThuTuc.add(ConvertUtil.convertToLong(tthcHoSoThuTucIdArr[i]));
				} catch (Exception e) {
					log.error(e);
				}
			}
		}
		
		return listHoSoThuTuc;
	}
	
	public List<TthcHoSoThuTuc> getListHoSoThuTuc(String listHoSoThuTucId) {
		String[] tthcHoSoThuTucIdArr = listHoSoThuTucId.split(",");
		List<TthcHoSoThuTuc> listHoSoThuTuc = new ArrayList<TthcHoSoThuTuc>();
		if (tthcHoSoThuTucIdArr != null && tthcHoSoThuTucIdArr.length > 0) {
			TthcHoSoThuTuc tthcHoSoThuTuc = null;
			for (int i = 0; i < tthcHoSoThuTucIdArr.length; i++) {
				try {
					tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(ConvertUtil.convertToLong(tthcHoSoThuTucIdArr[i]));
					listHoSoThuTuc.add(tthcHoSoThuTuc);
				} catch (Exception e) {
					log.error(e);
				}
			}
		}
		
		return listHoSoThuTuc;
	}
	
	public static boolean uploadFileKy(long vehicleRecordId, String urlFile, long userId, ActionRequest resourceRequest) {
		if (urlFile.trim().length() > 0) {
			log.info("--==========urlFile--" + urlFile);
			
			VehicleRecord vehicleRecord = null;
			TthcNoidungHoSo tthcNoidungHoSo = null;
			CertificateRecord certificateRecord = null;
			
			try {
				vehicleRecord = VehicleRecordLocalServiceUtil.fetchVehicleRecord(vehicleRecordId);
				if (vehicleRecord != null) {
					certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
					if (certificateRecord != null && certificateRecord.getAttachedFile() > 0) {
						tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(certificateRecord.getAttachedFile());
					}
					long noiLuuTruTaiLieuId = FileKySoUtils.uploadUrlFile(urlFile, userId, resourceRequest);
					if (tthcNoidungHoSo != null && noiLuuTruTaiLieuId > 0) {
						tthcNoidungHoSo.setTaiLieuDinhKem(noiLuuTruTaiLieuId);
						
						TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(tthcNoidungHoSo);
					}
				}
				return true;
			} catch (Exception e) {
				log.error(e);
			}
		}
		return false;
	}
	
	public static boolean uploadFileByIdNoiDungHoSo(long idNoiDungHoSo, String urlFile, long userId, ActionRequest resourceRequest) {
		if (urlFile.trim().length() > 0) {
			log.info("--==========uploadFileByIdNoiDungHoSo--" + urlFile);
			
			TthcNoidungHoSo tthcNoidungHoSo = null;
			
			try {
				tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
				long noiLuuTruTaiLieuId = FileKySoUtils.uploadUrlFile(urlFile, userId, resourceRequest);
				
				if (tthcNoidungHoSo != null && noiLuuTruTaiLieuId > 0) {
					tthcNoidungHoSo.setTaiLieuDinhKem(noiLuuTruTaiLieuId);
					TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(tthcNoidungHoSo);
					
					return true;
				}
			} catch (Exception e) {
				log.error(e);
			}
		}
		
		return false;
	}
	
	
	public static boolean uploadFileChoCapGiayDKKT(String urlFile, RegisteredInspection registeredInspection, long userId, ActionRequest resourceRequest) {
		
		boolean result = false;
		
		if (Validator.isNotNull(urlFile) && registeredInspection.getAttachedFile() > 0) {
			
			TthcNoidungHoSo tthcNoidungHoSo = null;
			try {
				tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(registeredInspection.getAttachedFile());
				long noiLuuTruTaiLieuId = FileKySoUtils.uploadUrlFile(urlFile, userId, resourceRequest);
				
				if (tthcNoidungHoSo != null && noiLuuTruTaiLieuId > 0) {
					
					tthcNoidungHoSo.setTaiLieuDinhKem(noiLuuTruTaiLieuId);
					
					TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(tthcNoidungHoSo);
				}
				
				result = true;
			} catch (Exception e) {
				log.error(e);
			}
		}
		
		return result;
	}
	
	public static List<VehicleRecord> getListVehicleRecord(String listVehicleRecordId)
		throws SystemException {
		String[] vehicleId = listVehicleRecordId.split(",");
		StringBuilder builder = new StringBuilder();
		boolean firstCheck = true;
		for (int i = 0; i < vehicleId.length; i++) {
			if (firstCheck) {
				builder.append("'" + vehicleId[i].trim() + "'");
				firstCheck = false;
			} else {
				builder.append(",");
				builder.append("'" + vehicleId[i].trim() + "'");
			}
		}
		List<VehicleRecord> liVehicleRecords = VehicleRecordLocalServiceUtil.findByArrayId(builder.toString());
		return Validator.isNotNull(liVehicleRecords) ? liVehicleRecords : new ArrayList<VehicleRecord>();
	}
	
	public static List<VehiclerecordInitial> getListVehicleRecordInitial(String listVehicleRecordId)
		throws SystemException {
		String[] vehicleId = listVehicleRecordId.split(",");
		StringBuilder builder = new StringBuilder();
		boolean firstCheck = true;
		for (int i = 0; i < vehicleId.length; i++) {
			if (firstCheck) {
				builder.append("'" + vehicleId[i].trim() + "'");
				firstCheck = false;
			} else {
				builder.append(",");
				builder.append("'" + vehicleId[i].trim() + "'");
			}
		}
		List<VehiclerecordInitial> liVehicleRecords = VehiclerecordInitialLocalServiceUtil.findByArrayId(builder.toString());
		return Validator.isNotNull(liVehicleRecords) ? liVehicleRecords : new ArrayList<VehiclerecordInitial>();
	}
	
}
