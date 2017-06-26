package vn.dtt.gt.dk.portlet.business;


import javax.portlet.ActionRequest;

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalServiceUtil;
import vn.dtt.gt.dk.putdataform2object.XacNhanDangKyKiemTraObject;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class XacNhanDKKTBusiness {

	private static Log _log = LogFactoryUtil.getLog(XacNhanDKKTBusiness.class);
	MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
	NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
	
//	public boolean xacNhanDangKyKiemTraB1(long hoSoThuTucId, String dieuKienChuyenDich, long userId,
//			XacNhanDangKyKiemTraObject dangKyKiemTraObject) {
//		boolean result = true;
//		try {
//
//			// TthcHoSoThuTuc hoSoThuTuc =
//			// TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
//			_log.debug("xacNhanDangKyKiemTra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich);
//			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.cap.giay.dkkt", "cap.giay.dkkt");
//			_log.debug("xacNhanDangKyKiemTra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich);
//			_log.debug("xacNhanDangKyKiemTra  " + dangKyKiemTraObject.getRegisteredinspectionId());
//			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
//					.fetchRegisteredInspection(dangKyKiemTraObject.getRegisteredinspectionId());
//			CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.findByInspectorId(userId);
//			if (registeredInspection == null) {
//				return false;
//			}
//			if (corporationInspector != null) {
//				dangKyKiemTraObject.setInspectorSignName(corporationInspector.getInspectorName());
//				dangKyKiemTraObject.setInspectorSignPlace(corporationInspector.getPlace());
//				dangKyKiemTraObject.setInspectorSignTitle(corporationInspector.getTitle());
//			}
//
//			_log.debug("registeredInspection  " + registeredInspection.getId());
//			long trangThaiHoSoId = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(hoSoThuTucId, dieuKienChuyenDich,
//					userId);
////			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
//			if (trangThaiHoSoId > 0) {
//
//				registeredInspection.setInspectorOrganization(DKConfigurationManager.getStrProp("vr_organization",
//						"ORGANIZATION"));
//				registeredInspection
//						.setInspectorDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
//				registeredInspection.setInspectorSigNname(dangKyKiemTraObject.getInspectorSignName());
//				registeredInspection.setInspectorSignTitle(dangKyKiemTraObject.getInspectorSignTitle());
//				registeredInspection.setInspectorSignPlace(dangKyKiemTraObject.getInspectorSignPlace());
//				registeredInspection.setInspectorSignDate(new Date());
//				// registeredInspection.setRegisteredNumber(taoCauTruc.quyDinhSoDangKyKiemTra(TaoCauTrucSoDkAcBB.DONG_CO));
//				// RegisteredInspectionLocalServiceUtil.updateRegisteredInspection(registeredInspection);
//				VehicleStatistics vehicleStatistics = null;
//				List<TthcNoidungHoSo> noidungHoSos = TthcNoidungHoSoLocalServiceUtil.findBieuMauHoSoIdAndHoSoThuTucId(
//						hoSoThuTucId, Constants.MAU_TRUC_TUYEN_THONG_TIN_XE_NK,
//						Constants.MAU_TRUC_TUYEN_THONG_TIN_DONG_CO);
//
//				if (null != noidungHoSos && noidungHoSos.size() > 0) {
//					_log.debug("noidungHoSos.size()   " + noidungHoSos.size());
//					int countNoidungHoSos = noidungHoSos.size();
//					for (int j = 0; j < countNoidungHoSos; j++) {
//
//						TthcNoidungHoSo noidungHoSo = noidungHoSos.get(j);
//
//						String data = MessageUtils.replaceXML(noidungHoSo.getNoiDungXml());
//						// _log.debug("==object===== co noi dung ho so "
//						// + data);
//						Header header = MessageUtils.readXmlMessageHeader(data);
//						if (header != null) {
//							_log.info("header.getSubject().getFunction()   "
//									+ header.getSubject().getFunction());
//						} else {
//							_log.info("header.getSubject().getFunction()   Khong co");
//						}
//						// Update VR_RegisteredInspection
//						// Insert VR_VEHICLEGROUP
//						// Insert VR_PRODUCTIONCOUNTRY
//						// Insert VR_VEHICLERECORD
//						// Insert VR_VEHICLESPECIFICATION
//						// Insert VR_VEHICLESTATISTICS
//						// Gui message phan hoi
//						// MessageType= 200
//						// MessageFunction= 30
//						List<Object> liObjects = MessageFactory.converXMLMessagesContentToObject(data);
//						if (header != null
//								&& (header.getSubject().getFunction().equals(FunctionType.FUNCTION_KHAI_SUA) || header
//										.getSubject().getFunction().equals(FunctionType.FUNCTION_KHAI_BO_SUNG_CHUNG_TU))) {
//							vehicleStatistics = nghiepVuBusiness.khaiSuaHoSo(registeredInspection, vehicleStatistics, liObjects,
//									noidungHoSo);
//						} else {
////							vehicleStatistics = nghiepVuBusiness.khaiMoiHoSo(registeredInspection, vehicleStatistics, liObjects,
////									noidungHoSo.getId());
//							vehicleStatistics = VehicleStatisticsLocalServiceUtil.findByRegisteredInspectionId(registeredInspection
//									.getId());
//						}
//						noidungHoSo.setDaCapNhat(Constants.DA_CAP_NHAP_DB_NGHIEP_VU);
//						TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(noidungHoSo);
//
//					}
//				
//				}
//
//				RegisteredInspectionLocalServiceUtil.updateRegisteredInspection(registeredInspection);
//
//			}
//		} catch (Exception e) {
//			result = false;
//		}
//		return result;
//	}
	public boolean xacNhanDangKyKiemTraB2(long hoSoThuTucId, String dieuKienChuyenDich, long userId,
			XacNhanDangKyKiemTraObject dangKyKiemTraObject, ActionRequest actionRequest,RegisteredInspection registeredInspection) {
		boolean result = true;
		try {
			_log.info("xacNhanDangKyKiemTra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
					+ dieuKienChuyenDich);
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.cap.giay.dkkt", "cap.giay.dkkt");
			_log.info("xacNhanDangKyKiemTra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
					+ dieuKienChuyenDich);
			CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.findByInspectorId(userId);
			if (registeredInspection == null) {
				_log.info("CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.findByInspectorId(userId);");
				return false;
			}
			if (corporationInspector != null) {
				dangKyKiemTraObject.setInspectorSignName(corporationInspector.getInspectorName());
				dangKyKiemTraObject.setInspectorSignPlace(corporationInspector.getPlace());
				dangKyKiemTraObject.setInspectorSignTitle(corporationInspector.getTitle());
			}

			
			// VehicleStatistics vehicleStatistics = null;
			VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil.findByRegisteredInspectionId(registeredInspection.getId());
			
			nghiepVuBusiness.guiXmlKyDuyetChuKySo(hoSoThuTucId, userId, dangKyKiemTraObject, registeredInspection, 
						 vehicleStatistics, actionRequest);

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}
}
