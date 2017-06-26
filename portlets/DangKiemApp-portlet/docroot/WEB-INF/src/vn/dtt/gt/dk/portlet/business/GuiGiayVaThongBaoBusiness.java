/**
 * 
 */
package vn.dtt.gt.dk.portlet.business;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucImpl;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.util.PortalUtil;

/**
 * @author binhnt
 *
 */
public class GuiGiayVaThongBaoBusiness {
	private static Log _log = LogFactoryUtil.getLog(GuiGiayVaThongBaoBusiness.class);
//	MotCuaBusiness motCuaBusiness = new MotCuaBusiness();

	public void guiGiayChungNhan(ActionRequest request, ActionResponse response) {
		NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();

		// get data tu form
		long userId = PortalUtil.getUserId(request);
		long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY).trim();
		String dieuKienChuyenDich = ParamUtil.getString(request, Constants.DIEU_KIEN_CHUYEN_DICH);
		
		String ykienXacNhan = ParamUtil.getString(request, "ykienXacNhan");
		String listVehicleRecordId = ParamUtil.getString(request, "listVehicleRecordId");

		TthcHoSoThuTuc hoSoThuTuc = new TthcHoSoThuTucImpl();
		VehicleGroup vehicleGroup = new VehicleGroupImpl();
		CertificateRecord certificateRecord = new CertificateRecordImpl();
		if(idHoSoThuTuc > 0){
			try {
				hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(idHoSoThuTuc);
			} catch (SystemException e) {
				_log.error(e);
			}
		}
		_log.debug("guiGiayChungNhan--ykienXacNhan--"+ykienXacNhan);
		_log.debug(" hoSoThuTucId=== " + idHoSoThuTuc + " ===dieuKienChuyenDich=== " + dieuKienChuyenDich + " =====idPhieuXuLyPhu=== " + idPhieuXuLyPhu);
		_log.debug(" hoSoThuTucId=== " + idHoSoThuTuc + " ===dieuKienChuyenDich=== " + dieuKienChuyenDich + " =====idPhieuXuLyPhu=== " + idPhieuXuLyPhu);
		_log.debug("listVehicleRecordId===" + listVehicleRecordId);

		try {
//			if (listVehicleRecordId != null && listVehicleRecordId.trim().length() > 0) {
			if (listVehicleRecordId != null) {
				_log.debug("guiGiayChungNhan-33333333333-listVehicleRecordId--"+ykienXacNhan);
				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
				List<VehicleRecord> liVehicleRecords = getListVehicleRecord(listVehicleRecordId);
				if(liVehicleRecords != null && liVehicleRecords.size() > 0){
					for(VehicleRecord vehicleRecord : liVehicleRecords){
						 vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord.getVehicleGroupId());
						 certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
						 nghiepVuBusiness.guiGiayChungNhan(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord, vehicleGroup, Constants.CO_GUI, StringPool.BLANK, StringPool.BLANK,null,null);
					}
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
	public void guiThongBaoMien(ActionRequest request, ActionResponse response) {
		NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();

		// get data tu form
		long userId = PortalUtil.getUserId(request);
		long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY).trim();
		String dieuKienChuyenDich = ParamUtil.getString(request, Constants.DIEU_KIEN_CHUYEN_DICH);
		
		String ykienXacNhan = ParamUtil.getString(request, "ykienXacNhan");
		String listVehicleRecordId = ParamUtil.getString(request, "listVehicleRecordId");

		_log.debug("guiGiayChungNhan--ykienXacNhan--"+ykienXacNhan);
		_log.debug(" hoSoThuTucId=== " + idHoSoThuTuc + " ===dieuKienChuyenDich=== " + dieuKienChuyenDich + " =====idPhieuXuLyPhu=== " + idPhieuXuLyPhu);
		_log.debug(" hoSoThuTucId=== " + idHoSoThuTuc + " ===dieuKienChuyenDich=== " + dieuKienChuyenDich + " =====idPhieuXuLyPhu=== " + idPhieuXuLyPhu);
		_log.debug("listVehicleRecordId===" + listVehicleRecordId);
		
		TthcHoSoThuTuc hoSoThuTuc = new TthcHoSoThuTucImpl();
		VehicleGroup vehicleGroup = new VehicleGroupImpl();
		CertificateRecord certificateRecord = new CertificateRecordImpl();
		
		try {
//			if (listVehicleRecordId != null && listVehicleRecordId.trim().length() > 0) {
			if (listVehicleRecordId != null) {
				_log.debug("guiThongBaoMien-33333333333-listVehicleRecordId--"+ykienXacNhan);
				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
				List<VehicleRecord> liVehicleRecords = getListVehicleRecord(listVehicleRecordId);
				if(liVehicleRecords != null && liVehicleRecords.size() > 0){
					for(VehicleRecord vehicleRecord : liVehicleRecords){
						 vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord.getVehicleGroupId());
						 certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
						nghiepVuBusiness.guiThongBaoMien(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord, vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,null,null);
					}
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
	public void guiThongBaoKhongDat(ActionRequest request, ActionResponse response) {
		NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();

		// get data tu form
		long userId = PortalUtil.getUserId(request);
		long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY).trim();
		String dieuKienChuyenDich = ParamUtil.getString(request, Constants.DIEU_KIEN_CHUYEN_DICH);
		
		String ykienXacNhan = ParamUtil.getString(request, "ykienXacNhan");
		String listVehicleRecordId = ParamUtil.getString(request, "listVehicleRecordId");

		_log.debug("guiGiayChungNhan--ykienXacNhan--"+ykienXacNhan);
		_log.debug(" hoSoThuTucId=== " + idHoSoThuTuc + " ===dieuKienChuyenDich=== " + dieuKienChuyenDich + " =====idPhieuXuLyPhu=== " + idPhieuXuLyPhu);
		_log.debug(" hoSoThuTucId=== " + idHoSoThuTuc + " ===dieuKienChuyenDich=== " + dieuKienChuyenDich + " =====idPhieuXuLyPhu=== " + idPhieuXuLyPhu);
		_log.debug("listVehicleRecordId===" + listVehicleRecordId);

		TthcHoSoThuTuc hoSoThuTuc = new TthcHoSoThuTucImpl();
		VehicleGroup vehicleGroup = new VehicleGroupImpl();
		CertificateRecord certificateRecord = new CertificateRecordImpl();
		
		try {
//			if (listVehicleRecordId != null && listVehicleRecordId.trim().length() > 0) {
			if (listVehicleRecordId != null) {
				_log.debug("guiThongBaoKhongDat-33333333333-listVehicleRecordId--"+ykienXacNhan);
				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
				List<VehicleRecord> liVehicleRecords = getListVehicleRecord(listVehicleRecordId);
				if(liVehicleRecords != null && liVehicleRecords.size() > 0){
					for(VehicleRecord vehicleRecord : liVehicleRecords){
						 vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord.getVehicleGroupId());
						 certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
						nghiepVuBusiness.guiThongBaoKhongDat(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord, vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,null,null);
					}
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
	public void guiThongBaoXacNhanTinhTrang(ActionRequest request, ActionResponse response) {
		NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();

		// get data tu form
		long userId = PortalUtil.getUserId(request);
		long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY).trim();
		String dieuKienChuyenDich = ParamUtil.getString(request, Constants.DIEU_KIEN_CHUYEN_DICH);
		
		String ykienXacNhan = ParamUtil.getString(request, "ykienXacNhan");
		String listVehicleRecordId = ParamUtil.getString(request, "listVehicleRecordId");

		_log.debug("guiGiayChungNhan--ykienXacNhan--"+ykienXacNhan);
		_log.debug(" hoSoThuTucId=== " + idHoSoThuTuc + " ===dieuKienChuyenDich=== " + dieuKienChuyenDich + " =====idPhieuXuLyPhu=== " + idPhieuXuLyPhu);
		_log.debug(" hoSoThuTucId=== " + idHoSoThuTuc + " ===dieuKienChuyenDich=== " + dieuKienChuyenDich + " =====idPhieuXuLyPhu=== " + idPhieuXuLyPhu);
		_log.debug("listVehicleRecordId===" + listVehicleRecordId);

		TthcHoSoThuTuc hoSoThuTuc = new TthcHoSoThuTucImpl();
		VehicleGroup vehicleGroup = new VehicleGroupImpl();
		CertificateRecord certificateRecord = new CertificateRecordImpl();
		
		try {
//			if (listVehicleRecordId != null && listVehicleRecordId.trim().length() > 0) {
			if (listVehicleRecordId != null) {
				_log.debug("guiThongBaoXacNhanTinhTrang-33333333333-listVehicleRecordId--"+ykienXacNhan);
				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
				List<VehicleRecord> liVehicleRecords = getListVehicleRecord(listVehicleRecordId);
				if(liVehicleRecords != null && liVehicleRecords.size() > 0){
					for(VehicleRecord vehicleRecord : liVehicleRecords){
						 vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord.getVehicleGroupId());
						 certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
						nghiepVuBusiness.guiThongBaoXacNhanTinhTrang(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord, vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,null,null);
					}
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
	public void guiThongBaoViPham(ActionRequest request, ActionResponse response) {
		NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();

		// get data tu form
		long userId = PortalUtil.getUserId(request);
		long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
		long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
		String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY).trim();
		String dieuKienChuyenDich = ParamUtil.getString(request, Constants.DIEU_KIEN_CHUYEN_DICH);
		
		String ykienXacNhan = ParamUtil.getString(request, "ykienXacNhan");
		String listVehicleRecordId = ParamUtil.getString(request, "listVehicleRecordId");

		_log.debug("guiGiayChungNhan--ykienXacNhan--"+ykienXacNhan);
		_log.debug(" hoSoThuTucId=== " + idHoSoThuTuc + " ===dieuKienChuyenDich=== " + dieuKienChuyenDich + " =====idPhieuXuLyPhu=== " + idPhieuXuLyPhu);
		_log.debug(" hoSoThuTucId=== " + idHoSoThuTuc + " ===dieuKienChuyenDich=== " + dieuKienChuyenDich + " =====idPhieuXuLyPhu=== " + idPhieuXuLyPhu);
		_log.debug("listVehicleRecordId===" + listVehicleRecordId);

		TthcHoSoThuTuc hoSoThuTuc = new TthcHoSoThuTucImpl();
		VehicleGroup vehicleGroup = new VehicleGroupImpl();
		CertificateRecord certificateRecord = new CertificateRecordImpl();
		
		try {
//			if (listVehicleRecordId != null && listVehicleRecordId.trim().length() > 0) {
			if (listVehicleRecordId != null) {
				_log.debug("guiThongBaoViPham-33333333333-listVehicleRecordId--"+ykienXacNhan);
				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
				List<VehicleRecord> liVehicleRecords = getListVehicleRecord(listVehicleRecordId);
				if(liVehicleRecords != null && liVehicleRecords.size() > 0){
					for(VehicleRecord vehicleRecord : liVehicleRecords){
						 vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord.getVehicleGroupId());
						 certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
						nghiepVuBusiness.guiThongBaoViPham(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord, vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,null,null);
					}
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
					_log.error(e);
				}
			}
		}
		
		return liVehicleRecords;
	}
}
