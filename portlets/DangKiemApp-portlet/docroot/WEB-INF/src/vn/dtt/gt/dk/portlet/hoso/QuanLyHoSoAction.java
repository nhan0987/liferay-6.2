package vn.dtt.gt.dk.portlet.hoso;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vgca.svrsigner.ServerSigner;
import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuImpl;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote;
import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateCircularImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.ActionLogLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil;
import vn.dtt.gt.dk.nsw.model.HoSoSoanThaoChungChi;
import vn.dtt.gt.dk.nsw.model.HoSoSoanThaoChungChi.YKienDangKiemVien;
import vn.dtt.gt.dk.nsw.model.HoSoSoanThaoChungChi.YKienDoiTruong;
import vn.dtt.gt.dk.portlet.DangKiemAction;
import vn.dtt.gt.dk.portlet.business.BienBanKiemTraBusiness;
import vn.dtt.gt.dk.portlet.business.FunctionNghiepVu;
import vn.dtt.gt.dk.portlet.business.LanhDaoPhongBusiness;
import vn.dtt.gt.dk.portlet.business.LapBanDangKyBusiness;
import vn.dtt.gt.dk.portlet.business.MotCuaBusiness;
import vn.dtt.gt.dk.portlet.business.NghiepVuBoSungBusiness;
import vn.dtt.gt.dk.portlet.business.NghiepVuBusiness;
import vn.dtt.gt.dk.portlet.business.TaoCauTrucSoDkAcBB;
import vn.dtt.gt.dk.portlet.business.ToTiepNhanBusiness;
import vn.dtt.gt.dk.portlet.business.XacNhanDKKTBusiness;
import vn.dtt.gt.dk.portlet.business.bienbankiemtra.LapBienBanKiemTraAction;
import vn.dtt.gt.dk.putdataform2object.XacNhanDangKyKiemTraObject;
import vn.dtt.gt.dk.report.ReportBusinessUtils;
import vn.dtt.gt.dk.report.ReportConstant;
import vn.dtt.gt.dk.report.ReportUtils;
import vn.dtt.gt.dk.report.model.GcnChatLuongDongCoMotoXeMay;
import vn.dtt.gt.dk.utils.ActionKeys;
import vn.dtt.gt.dk.utils.CollectionUtils;
import vn.dtt.gt.dk.utils.DanhMucKey;
import vn.dtt.gt.dk.utils.ExtractTextLocations;
import vn.dtt.gt.dk.utils.PortletUtil;
import vn.dtt.gt.dk.utils.SignatureUtil;
import vn.dtt.gt.dk.utils.codec.FileKySoUtils;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.document.DocumentUtils;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.DateUtils;
import vn.dtt.gt.dk.utils.format.FormatData;
import vn.dtt.gt.dk.utils.format.JsonSerializer;

import com.itextpdf.text.Rectangle;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;


/**
 * Portlet implementation class QuanLyHoSoAction
 */
public class QuanLyHoSoAction extends DangKiemAction {

	private Log log = LogFactoryUtil.getLog(QuanLyHoSoAction.class);
	FunctionNghiepVu functionNghiepVu = new FunctionNghiepVu();
	MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
	NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
	NghiepVuBoSungBusiness nghiepVuBoSungBusiness = new NghiepVuBoSungBusiness();
	TaoCauTrucSoDkAcBB taoCauTruc = new TaoCauTrucSoDkAcBB();
	LanhDaoPhongBusiness lanhDaoPhongBusiness = new LanhDaoPhongBusiness();

	public void timKiemDebitNote(ActionRequest request, ActionResponse response) {
		LanhDaoPhongBusiness lanhDaoPhongBusiness = new LanhDaoPhongBusiness();
		lanhDaoPhongBusiness.timKiemDebitNote(request, response);
	}

	public void timKiemPhieuThuDaThanhToan(ActionRequest request,
			ActionResponse response) {
		String dieuKienChuyenDich = ParamUtil.getString(request,
				Constants.LOAI_THU_TUC);

		response.setRenderParameter(Constants.LOAI_THU_TUC, dieuKienChuyenDich);
		response.setRenderParameter("jspPage",
				"/portlet/quanlyhs/thulyhs/tonghiepvu/thongkePhieuThu.jsp");

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void timKiemChungChi(ActionRequest request, ActionResponse response) {
		String dieuKienChuyenDich = ParamUtil.getString(request,
				Constants.LOAI_THU_TUC);

		response.setRenderParameter(Constants.LOAI_THU_TUC, dieuKienChuyenDich);
		response.setRenderParameter("jspPage",
				"/portlet/quanlyhs/thulyhs/tonghiepvu/guiChungChiTheoPhieuThu.jsp");

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toTiepNhan_SoatXetBienBanKiemTra(ActionRequest resourceRequest,
			ActionResponse httpReq) throws SystemException {
		long idHoSoThuTuc = ParamUtil.getLong(resourceRequest,
				Constants.ID_HO_SO_THU_TUC);
		long idPhieuXuLyPhu = ParamUtil.getLong(resourceRequest,
				Constants.ID_PHIEU_XU_LY_PHU);
		long idRegisteredInspection = ParamUtil.getLong(resourceRequest,
				Constants.ID_REGISTERED_INSPECTION);
		long idInspectionRecord = ParamUtil.getLong(resourceRequest,
				Constants.ID_INSPECTION_RECORD);
		String lyDo = ParamUtil.getString(resourceRequest, "chuyenToNghiepVu");

		log.info("==idHoSoThuTuc==  " + idHoSoThuTuc + " ==idPhieuXuLyPhu== "
				+ idPhieuXuLyPhu + " ==idRegisteredInspection== "
				+ idRegisteredInspection + " ==idInspectionRecord== "
				+ idInspectionRecord);

		List<VehicleRecord> allVehicleRecord = null;
		if (idInspectionRecord > 0) {
			allVehicleRecord = VehicleRecordLocalServiceUtil
					.findByInspectionRecordId(idInspectionRecord);
		}
		InspectionRecord inspectionRecord = new InspectionRecordImpl();
		if (idInspectionRecord > 0) {
			inspectionRecord = InspectionRecordLocalServiceUtil
					.fetchInspectionRecord(idInspectionRecord);
		}

		Boolean kq = nghiepVuBusiness.soatXetBienBanKiemTra(idHoSoThuTuc,
				idPhieuXuLyPhu, "", PortalUtil.getUserId(resourceRequest),
				idRegisteredInspection, inspectionRecord, allVehicleRecord,
				lyDo);

		log.info("==============Vao soatXetBienBanKiemTra===nghiepVuBusiness.soatXetBienBanKiemTra====="
				+ kq);

		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public void capLaiHoaDon(ActionRequest resourceRequest,
			ActionResponse httpReq) throws SystemException {
		String listDebitNoteId = ParamUtil.getString(resourceRequest, "listId");
		String dieuKienChuyenDich = ParamUtil.getString(resourceRequest,
				Constants.LOAI_THU_TUC);

		log.info("==thanhToanDebitNote=====listId== " + listDebitNoteId);

		List<DebitNote> liDebitNotes = LanhDaoPhongBusiness
				.getListDebitNote(listDebitNoteId);
		long userId = PortalUtil.getUserId(resourceRequest);

		nghiepVuBusiness.capLaiHoaDonTheoPhieuThu(userId, liDebitNotes,
				resourceRequest);

		httpReq.setRenderParameter(Constants.LOAI_THU_TUC, dieuKienChuyenDich);
		httpReq.setRenderParameter("jspPage",
				"/portlet/quanlyhs/thulyhs/tonghiepvu/thongkePhieuThu.jsp");
		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void thanhToanDebitNote(ActionRequest resourceRequest,
			ActionResponse httpReq) throws SystemException {
		String listDebitNoteId = ParamUtil.getString(resourceRequest, "listId");
		String dieuKienChuyenDich = ParamUtil.getString(resourceRequest,
				Constants.LOAI_THU_TUC);

		log.info("==thanhToanDebitNote=====listId== " + listDebitNoteId);

		List<DebitNote> liDebitNotes = LanhDaoPhongBusiness
				.getListDebitNote(listDebitNoteId);
		long userId = PortalUtil.getUserId(resourceRequest);

		nghiepVuBusiness.thanhToanTheoPhieuThu(userId, liDebitNotes,
				resourceRequest);

		httpReq.setRenderParameter(Constants.LOAI_THU_TUC, dieuKienChuyenDich);
		httpReq.setRenderParameter("jspPage",
				"/portlet/quanlyhs/thulyhs/tonghiepvu/listDebitNote.jsp");
		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	// tra? chung chi theo phieu
	// xem danh sach
	// tra chung chi
	public void guiChungChiTheoPhieuThu(ActionRequest resourceRequest,
			ActionResponse httpReq) throws SystemException {

		long userId = PortalUtil.getUserId(resourceRequest);

		String listDebitNoteId = ParamUtil.getString(resourceRequest, "listId");
		String dieuKienChuyenDich = ParamUtil.getString(resourceRequest,
				Constants.LOAI_THU_TUC);

		log.info("==guiChungChiTheoPhieuThu==listDebitNoteId== "
				+ listDebitNoteId);
		log.info("==guiChungChiTheoPhieuThu==dieuKienChuyenDich== "
				+ dieuKienChuyenDich);

		List<DebitNote> liDebitNotes = LanhDaoPhongBusiness
				.getListDebitNote(listDebitNoteId);

		nghiepVuBusiness.guiChungChiTheoPhieuThu(userId, liDebitNotes,
				resourceRequest);

		httpReq.setRenderParameter(Constants.LOAI_THU_TUC, dieuKienChuyenDich);
		httpReq.setRenderParameter("jspPage",
				"/portlet/quanlyhs/thulyhs/tonghiepvu/guiChungChiTheoPhieuThu.jsp");
		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void locPhanCongResult(ActionRequest resourceRequest,
			ActionResponse httpReq) {
		String tenThuTuc = ParamUtil.getString(resourceRequest,
				Constants.TEN_THU_TUC).trim();
		String soHoSo = ParamUtil
				.getString(resourceRequest, Constants.SO_HO_SO).trim();
		String soHoSoOrder = ParamUtil.getString(resourceRequest,
				Constants.SO_HO_SO_ORDER).trim();
		String ngayNopHsFrom = ParamUtil.getString(resourceRequest,
				Constants.NGAY_NOP_HO_SO_FROM).trim();
		String ngayNopHsTo = ParamUtil.getString(resourceRequest,
				Constants.NGAY_NOP_HO_SO_TO).trim();
		String doanhNghiep = ParamUtil.getString(resourceRequest,
				Constants.DOANH_NGHIEP).trim();
		String namNhap = ParamUtil.getString(resourceRequest,
				Constants.NAM_NHAP).trim();
		String soDKKT = ParamUtil.getString(resourceRequest, Constants.SO_DKKT)
				.trim();
		String loaiThuTuc = ParamUtil.getString(resourceRequest,
				Constants.LOAI_THU_TUC).trim();
		String doiKiemTra = ParamUtil.getString(resourceRequest,
				Constants.DOI_DKKT).trim();

		httpReq.setRenderParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
		httpReq.setRenderParameter(Constants.SO_DKKT, soDKKT);
		httpReq.setRenderParameter(Constants.DOI_DKKT, doiKiemTra);
		httpReq.setRenderParameter(Constants.NAM_NHAP, namNhap);
		httpReq.setRenderParameter(Constants.TEN_THU_TUC, tenThuTuc);
		httpReq.setRenderParameter(Constants.SO_HO_SO, soHoSo);
		httpReq.setRenderParameter(Constants.SO_HO_SO_ORDER, soHoSoOrder);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
		httpReq.setRenderParameter(Constants.DOANH_NGHIEP, doanhNghiep);
		httpReq.setRenderParameter("jspPage",
				"/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_phancongkiemtra.jsp");
		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void phanCongResult(ActionRequest resourceRequest,
			ActionResponse httpReq) {
		String tenThuTuc = ParamUtil.getString(resourceRequest,
				Constants.TEN_THU_TUC).trim();
		String soHoSo = ParamUtil
				.getString(resourceRequest, Constants.SO_HO_SO).trim();
		String ngayNopHsFrom = ParamUtil.getString(resourceRequest,
				Constants.NGAY_NOP_HO_SO_FROM).trim();
		String ngayNopHsTo = ParamUtil.getString(resourceRequest,
				Constants.NGAY_NOP_HO_SO_TO).trim();
		String doanhNghiep = ParamUtil.getString(resourceRequest,
				Constants.DOANH_NGHIEP).trim();
		String namNhap = ParamUtil.getString(resourceRequest,
				Constants.NAM_NHAP).trim();
		String soDKKT = ParamUtil.getString(resourceRequest, Constants.SO_DKKT)
				.trim();
		String loaiThuTuc = ParamUtil.getString(resourceRequest,
				Constants.LOAI_THU_TUC).trim();
		String doiKiemTra = ParamUtil.getString(resourceRequest,
				Constants.DOI_DKKT).trim();

		String dangKiemVienChinhId = ParamUtil.getString(resourceRequest,
				"dangKiemVienChinhId");

		String listId = ParamUtil.getString(resourceRequest, "listId");
		log.info("phanCongResult Action================listId Action ========="
				+ listId);

		String dangKiemVienId = ParamUtil.getString(resourceRequest,
				"dangKiemVienId");
		String listDKVPhoiHop = ParamUtil.getString(resourceRequest,
				"listDKVPhoiHop");

		String keyMapDangKiemVien = dangKiemVienId + "-" + listDKVPhoiHop;
		String listMapDangKiemVien = ParamUtil.getString(resourceRequest,
				Constants.LIST_DANG_KIEM_VIEN_).trim();

		log.info("phanCongResult Action---dangKiemVienId===" + dangKiemVienId);
		log.info("phanCongResult Action---listDKVPhoiHop===" + listDKVPhoiHop);
		log.info("phanCongResult Action---listMapDangKiemVien==="
				+ listMapDangKiemVien);

		Map<String, String> listMap = null;
		if (resourceRequest.getPortletSession().getAttribute("listMap") != null) {
			listMap = (Map<String, String>) resourceRequest.getPortletSession()
					.getAttribute("listMap");
		}
		if (listId != null && listId.trim().length() > 0) {
			if (listMap == null) {
				listMap = new HashMap<String, String>();
				listMap.put(keyMapDangKiemVien, listId);
			} else {
				if (listMap.get(keyMapDangKiemVien) != null
						&& listMap.get(keyMapDangKiemVien).trim().length() > 0) {
					listMap.put(keyMapDangKiemVien,
							listMap.get(keyMapDangKiemVien) + listId);
				} else {
					listMap.put(keyMapDangKiemVien, listId);

				}
			}

			if (!listMapDangKiemVien.contains(keyMapDangKiemVien)) {
				listMapDangKiemVien = listMapDangKiemVien + keyMapDangKiemVien
						+ ";";
			}
		}
		resourceRequest.getPortletSession().setAttribute("listMap", listMap);
		log.info("phanCongResult Action===============listMap ========="
				+ resourceRequest.getPortletSession().getAttribute("listMap"));

		httpReq.setRenderParameter(Constants.LIST_DANG_KIEM_VIEN_,
				listMapDangKiemVien);
		httpReq.setRenderParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
		httpReq.setRenderParameter(Constants.SO_DKKT, soDKKT);
		httpReq.setRenderParameter(Constants.DOI_DKKT, doiKiemTra);
		httpReq.setRenderParameter(Constants.NAM_NHAP, namNhap);
		httpReq.setRenderParameter(Constants.TEN_THU_TUC, tenThuTuc);
		httpReq.setRenderParameter(Constants.SO_HO_SO, soHoSo);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
		httpReq.setRenderParameter(Constants.DOANH_NGHIEP, doanhNghiep);
		httpReq.setRenderParameter("jspPage",
				"/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_phancongkiemtra.jsp");
		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void phanCongTatCaResult(ActionRequest resourceRequest,
			ActionResponse httpReq) {
		String tenThuTuc = ParamUtil.getString(resourceRequest,
				Constants.TEN_THU_TUC).trim();
		String soHoSo = ParamUtil
				.getString(resourceRequest, Constants.SO_HO_SO).trim();
		String ngayNopHsFrom = ParamUtil.getString(resourceRequest,
				Constants.NGAY_NOP_HO_SO_FROM).trim();
		String ngayNopHsTo = ParamUtil.getString(resourceRequest,
				Constants.NGAY_NOP_HO_SO_TO).trim();
		String doanhNghiep = ParamUtil.getString(resourceRequest,
				Constants.DOANH_NGHIEP).trim();
		String namNhap = ParamUtil.getString(resourceRequest,
				Constants.NAM_NHAP).trim();
		String soDKKT = ParamUtil.getString(resourceRequest, Constants.SO_DKKT)
				.trim();
		String loaiThuTuc = ParamUtil.getString(resourceRequest,
				Constants.LOAI_THU_TUC).trim();
		String doiKiemTra = ParamUtil.getString(resourceRequest,
				Constants.DOI_DKKT).trim();

		String dangKiemVienChinhId = ParamUtil.getString(resourceRequest,
				"dangKiemVienChinhId");

		// String listId = ParamUtil.getString(resourceRequest, "listId");
		String listId = ParamUtil.getString(resourceRequest, "lstPhieuXuLyPhu");

		log.info("---phanCongTatCaResult Action================listId Action ========="
				+ listId);

		String dangKiemVienId = ParamUtil.getString(resourceRequest,
				"dangKiemVienId");
		String listDKVPhoiHop = ParamUtil.getString(resourceRequest,
				"listDKVPhoiHop");

		String keyMapDangKiemVien = dangKiemVienId + "-" + listDKVPhoiHop;
		String listMapDangKiemVien = ParamUtil.getString(resourceRequest,
				Constants.LIST_DANG_KIEM_VIEN_).trim();

		log.info("---phanCongTatCaResult Action---dangKiemVienId==="
				+ dangKiemVienId);
		log.info("---phanCongTatCaResult Action---listDKVPhoiHop==="
				+ listDKVPhoiHop);
		log.info("---phanCongTatCaResult Action---listMapDangKiemVien==="
				+ listMapDangKiemVien);

		Map<String, String> listMap = null;
		if (resourceRequest.getPortletSession().getAttribute("listMap") != null) {
			listMap = (Map<String, String>) resourceRequest.getPortletSession()
					.getAttribute("listMap");
		}
		if (listId != null && listId.trim().length() > 0) {
			if (listMap == null) {
				listMap = new HashMap<String, String>();
				listMap.put(keyMapDangKiemVien, listId);
			} else {
				if (listMap.get(keyMapDangKiemVien) != null
						&& listMap.get(keyMapDangKiemVien).trim().length() > 0) {
					listMap.put(keyMapDangKiemVien,
							listMap.get(keyMapDangKiemVien) + listId);
				} else {
					listMap.put(keyMapDangKiemVien, listId);

				}
			}

			if (!listMapDangKiemVien.contains(keyMapDangKiemVien)) {
				listMapDangKiemVien = listMapDangKiemVien + keyMapDangKiemVien
						+ ";";
			}
		}
		resourceRequest.getPortletSession().setAttribute("listMap", listMap);
		log.info("phanCongTatCaResult Action===============listMap ========="
				+ resourceRequest.getPortletSession().getAttribute("listMap"));

		httpReq.setRenderParameter(Constants.LIST_DANG_KIEM_VIEN_,
				listMapDangKiemVien);
		httpReq.setRenderParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
		httpReq.setRenderParameter(Constants.SO_DKKT, soDKKT);
		httpReq.setRenderParameter(Constants.DOI_DKKT, doiKiemTra);
		httpReq.setRenderParameter(Constants.NAM_NHAP, namNhap);
		httpReq.setRenderParameter(Constants.TEN_THU_TUC, tenThuTuc);
		httpReq.setRenderParameter(Constants.SO_HO_SO, soHoSo);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
		httpReq.setRenderParameter(Constants.DOANH_NGHIEP, doanhNghiep);
		httpReq.setRenderParameter("jspPage",
				"/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_phancongkiemtra.jsp");
		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void boPhanCongKiemTra(ActionRequest resourceRequest,
			ActionResponse httpReq) {
		String tenThuTuc = ParamUtil.getString(resourceRequest,
				Constants.TEN_THU_TUC).trim();
		String soHoSo = ParamUtil
				.getString(resourceRequest, Constants.SO_HO_SO).trim();
		String ngayNopHsFrom = ParamUtil.getString(resourceRequest,
				Constants.NGAY_NOP_HO_SO_FROM).trim();
		String ngayNopHsTo = ParamUtil.getString(resourceRequest,
				Constants.NGAY_NOP_HO_SO_TO).trim();
		String doanhNghiep = ParamUtil.getString(resourceRequest,
				Constants.DOANH_NGHIEP).trim();
		String namNhap = ParamUtil.getString(resourceRequest,
				Constants.NAM_NHAP).trim();
		String soDKKT = ParamUtil.getString(resourceRequest, Constants.SO_DKKT)
				.trim();
		String loaiThuTuc = ParamUtil.getString(resourceRequest,
				Constants.LOAI_THU_TUC).trim();
		String doiKiemTra = ParamUtil.getString(resourceRequest,
				Constants.DOI_DKKT).trim();

		String listMapDangKiemVien = ParamUtil.getString(resourceRequest,
				Constants.LIST_DANG_KIEM_VIEN_).trim();

		int docCount = ParamUtil.getInteger(resourceRequest, "docCount");
		log.info("========boPhanCongKiemTra========docCount  ========="
				+ docCount);
		log.info("=======get==listMapDangKiemVien  ========="
				+ listMapDangKiemVien);
		Map<String, String> listMap = null;
		log.info("===========get=====Map<String,String> listMap = null;  ========="
				+ resourceRequest.getPortletSession().getAttribute("listMap"));
		for (int i = 1; i <= docCount; i++) {
			String isCheck = ParamUtil.getString(resourceRequest, "check_" + i);
			String key = ParamUtil.getString(resourceRequest, "userGroupId_"
					+ i);
			log.info("================isCheck ==" + i + "======" + isCheck);
			log.info("===============key  ==" + i + "====" + key);
			if (resourceRequest.getPortletSession().getAttribute("listMap") != null) {
				listMap = (Map<String, String>) resourceRequest
						.getPortletSession().getAttribute("listMap");
			}
			log.info("================listMap  =========" + listMap);

			if (isCheck != null && isCheck.trim().length() > 0) {
				log.info("================isCheck=========" + isCheck);
				String listHoSo = listMap.get(key);

				if (listHoSo != null && listHoSo.trim().length() > 0) {
					if (listHoSo.contains(isCheck)) {
						String listChange = listHoSo.replace(isCheck + ",", "");
						log.info("================listChange========="
								+ listChange);
						listMap.put(key, listChange);

						if (listChange.trim().length() == 0
								|| listChange.trim().equals(",")) {
							listMapDangKiemVien = listMapDangKiemVien.replace(
									key + ";", "");
							listMap.remove(key);
						}

					}
				}
			}
			resourceRequest.getPortletSession()
					.setAttribute("listMap", listMap);
			log.info("================listMap for  ========="
					+ resourceRequest.getPortletSession().getAttribute(
							"listMap"));
			log.info("================listMapDangKiemVien for  ========="
					+ listMapDangKiemVien);
		}

		log.info("================listMap End Action ========="
				+ resourceRequest.getPortletSession().getAttribute("listMap"));

		httpReq.setRenderParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
		httpReq.setRenderParameter(Constants.SO_DKKT, soDKKT);
		httpReq.setRenderParameter(Constants.DOI_DKKT, doiKiemTra);
		httpReq.setRenderParameter(Constants.NAM_NHAP, namNhap);
		httpReq.setRenderParameter(Constants.TEN_THU_TUC, tenThuTuc);
		httpReq.setRenderParameter(Constants.SO_HO_SO, soHoSo);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
		httpReq.setRenderParameter(Constants.DOANH_NGHIEP, doanhNghiep);
		httpReq.setRenderParameter(Constants.LIST_DANG_KIEM_VIEN_,
				listMapDangKiemVien);

		httpReq.setRenderParameter("jspPage",
				"/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_phancongkiemtra.jsp");
		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void xacNhanPhanCongKiemTra(ActionRequest resourceRequest,
			ActionResponse httpReq) throws SystemException {
		String tenThuTuc = ParamUtil.getString(resourceRequest,
				Constants.TEN_THU_TUC).trim();
		String soHoSo = ParamUtil
				.getString(resourceRequest, Constants.SO_HO_SO).trim();
		String ngayNopHsFrom = ParamUtil.getString(resourceRequest,
				Constants.NGAY_NOP_HO_SO_FROM).trim();
		String ngayNopHsTo = ParamUtil.getString(resourceRequest,
				Constants.NGAY_NOP_HO_SO_TO).trim();
		String doanhNghiep = ParamUtil.getString(resourceRequest,
				Constants.DOANH_NGHIEP).trim();
		String ngayPhanConKiemTra = ParamUtil.getString(resourceRequest,
				"ngayPhanConKiemTra");
		String namNhap = ParamUtil.getString(resourceRequest,
				Constants.NAM_NHAP).trim();
		String soDKKT = ParamUtil.getString(resourceRequest, Constants.SO_DKKT)
				.trim();
		String loaiThuTuc = ParamUtil.getString(resourceRequest,
				Constants.LOAI_THU_TUC).trim();
		String doiKiemTra = ParamUtil.getString(resourceRequest,
				Constants.DOI_DKKT).trim();

		int docCount = ParamUtil.getInteger(resourceRequest, "docCount");
		RegisteredInspection registeredInspection = null;
		log.info("=========xacNhanPhanCongKiemTra=========docCount  =================="
				+ docCount);
		String dieuKienChuyenDich = ParamUtil.getString(resourceRequest,
				Constants.DIEU_KIEN_CHUYEN_DICH);
		MotCuaPhieuXuLyPhu phieuXuLyPhu = null;
		for (int i = 1; i <= docCount; i++) {
			// long teamId = ParamUtil.getLong(resourceRequest,
			// "userGroupId_"+i);
			String key = ParamUtil.getString(resourceRequest, "userGroupId_"
					+ i);

			String[] listDangKiemVienKey = key.split("-");
			// long idDangKiemVien =
			// CorporationUtils.getIdDangKiemVienChinh(teamId);
			long idDangKiemVien = ConvertUtil
					.convertToLong(listDangKiemVienKey[0].trim());
			log.info("=========listDangKiemVienKey[0].trim()====="
					+ idDangKiemVien);
			CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
					.fetchCorporationInspector(idDangKiemVien);
			if (corporationInspector != null) {
				idDangKiemVien = corporationInspector.getInspectorid();
			}
			log.info("==/===============idDangKiemVien======" + idDangKiemVien);
			String phieuXuLyPhuId = ParamUtil.getString(resourceRequest,
					"phieuXuLyPhuId_" + i);
			phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
					.fetchMotCuaPhieuXuLyPhu(ConvertUtil
							.convertToLong(phieuXuLyPhuId));
			if (phieuXuLyPhu != null) {
				registeredInspection = RegisteredInspectionLocalServiceUtil
						.findByDossierId(phieuXuLyPhu.getPhieuXuLyChinhId());
			}
			log.info("=====registeredInspection=========="
					+ registeredInspection.getRegisteredNumber());
			log.info("dangKiemVienChinhId=" + idDangKiemVien
					+ "  ===========phieuXuLyPhuId :  " + phieuXuLyPhuId);

			log.info("   PortalUtil.getUserId(resourceRequest)  "
					+ PortalUtil.getUserId(resourceRequest));
			if (registeredInspection != null) {
				// Boolean kq =
				// nghiepVuBusiness.deNghiKiemtra(registeredInspection.getDossierId(),
				// dieuKienChuyenDich, PortalUtil.getUserId(resourceRequest),
				// ConvertUtil.convertToLong(phieuXuLyPhuId), idDangKiemVien,
				// teamId,registeredInspection.getInspectionDate(),
				// ConvertUtil.parseStringToDate(ngayPhanConKiemTra),
				// ConvertUtil.parseStringToDate(ngayPhanConKiemTra));
				Boolean kq = nghiepVuBusiness.deNghiKiemtraXN(
						registeredInspection.getDossierId(),
						dieuKienChuyenDich,
						PortalUtil.getUserId(resourceRequest),
						ConvertUtil.convertToLong(phieuXuLyPhuId),
						idDangKiemVien, key,
						registeredInspection.getInspectionDate(),
						ConvertUtil.parseStringToDate(ngayPhanConKiemTra),
						ConvertUtil.parseStringToDate(ngayPhanConKiemTra));

				log.info("==============Vao xNPhanCongKiemTra===nghiepVuBusiness.deNghiKiemtra====="
						+ kq);
				if (kq.booleanValue()
						&& resourceRequest.getPortletSession().getAttribute(
								"listMap") != null) {
					resourceRequest.getPortletSession().removeAttribute(
							"listMap");
				}
			}
		}
		httpReq.setRenderParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
		httpReq.setRenderParameter(Constants.SO_DKKT, soDKKT);
		httpReq.setRenderParameter(Constants.DOI_DKKT, doiKiemTra);
		httpReq.setRenderParameter(Constants.NAM_NHAP, namNhap);
		httpReq.setRenderParameter(Constants.TEN_THU_TUC, tenThuTuc);
		httpReq.setRenderParameter(Constants.SO_HO_SO, soHoSo);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
		httpReq.setRenderParameter(Constants.DOANH_NGHIEP, doanhNghiep);

		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void timKiemHoSo(ActionRequest resourceRequest,
			ActionResponse httpReq) {
		try {
			String loaiThuTuc = ParamUtil.getString(resourceRequest,
					Constants.LOAI_THU_TUC).trim();
			String thanhPhanXuLy = ParamUtil.getString(resourceRequest,
					Constants.THANH_PHAN_XU_LY).trim();
			String tenThuTuc = ParamUtil.getString(resourceRequest,
					Constants.TEN_THU_TUC).trim();
			String soHoSo = ParamUtil.getString(resourceRequest,
					Constants.SO_HO_SO).trim();
			String ngayNopHsFrom = ParamUtil.getString(resourceRequest,
					Constants.NGAY_NOP_HO_SO_FROM).trim();
			String ngayNopHsTo = ParamUtil.getString(resourceRequest,
					Constants.NGAY_NOP_HO_SO_TO).trim();
			String namNhap = ParamUtil.getString(resourceRequest,
					Constants.NAM_NHAP).trim();
			String doanhNghiep = ParamUtil.getString(resourceRequest,
					Constants.DOANH_NGHIEP).trim();
			String soDKKT = ParamUtil.getString(resourceRequest,
					Constants.SO_DKKT).trim();
			long userid = PortalUtil.getUserId(resourceRequest);
			if (tenThuTuc.trim().length() > 0) {
				nghiepVuBusiness.updateCorporationInspectorTTHC(
						Long.valueOf(tenThuTuc), userid);
			} else {
				nghiepVuBusiness.updateCorporationInspectorTTHC(0, userid);
			}
			httpReq.setRenderParameter(Constants.SO_DKKT, soDKKT);
			httpReq.setRenderParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
			httpReq.setRenderParameter(Constants.THANH_PHAN_XU_LY,
					thanhPhanXuLy);
			httpReq.setRenderParameter(Constants.TEN_THU_TUC, tenThuTuc);
			httpReq.setRenderParameter(Constants.SO_HO_SO, soHoSo);
			httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_FROM,
					ngayNopHsFrom);
			httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
			httpReq.setRenderParameter(Constants.NAM_NHAP, namNhap);
			httpReq.setRenderParameter(Constants.DOANH_NGHIEP, doanhNghiep);

			PortletConfig portletConfig = (PortletConfig) resourceRequest
					.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(resourceRequest, portletConfig.getPortletName()
					+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		} catch (SystemException e1) {
			log.error(e1);
		}
	}

	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response)
			throws IOException, PortletException {
		try {

			String type = ParamUtil.getString(request, "type");
			// log.info("type  "+type);
			if (type.equals("findDsKiemTraChatLuongATKTVanBanVMTByVehicleGroupId")) {
				findDsKiemTraChatLuongATKTVanBanVMTByVehicleGroupId(request,
						response);

			} else if (type.equals("callAjaxHienThiBaoCaoReport")) {
				callAjaxHienThiBaoCaoReport(request, response);

			} else if (type.equals("callAjaxHienThiBaoCaoBienBanReport")) {
				callAjaxHienThiBaoCaoBienBanReport(request, response);

			} else if (type.equals("ToNghiepVuKetQuaKT")) {
				toNghiepVuKetQuaKiemTra(request, response);
			} else if (type.equals("deleteCertificate")) {
				signatureComplete(request, response);
			} else if (type.equals("TrungSoDongCo")) {
				checkTrungSoDongCo(request, response);
			} else if (type.equals("GetTenThuTuc")) {
				getTenThuTuc(request, response);
			} else if (type.equals("signatureComplete")) {
				signatureComplete(request, response);
			} else if (type.equals("signatureDongDauComplete")) {
				signatureDongDauComplete(request, response);
			}

			else if (type.equals("lanhDaoPhong")) {

				lanhDaoPhong(request, response);

			} else if (type.equals("lanhDaoPhongBanThaoCC")) {

				lanhDaoPhongBanThaoCC(request, response);

			} else if (type.equals("ToNghiepVuSoanBanThao")) {

				toNghiepVuSoanBanThao(request, response);

			} else if (type.equals("lanhDaoPhongKySo")) {

				lanhDaoPhongKySo(request, response);
			} else if (type.equals("kyDuyetGiayDKKT")) {

				kyDuyetGiayDKKT(request, response);

			} else if (type.equals("getComputerHash")) {
				getComputerHash(request, response);

			} else if (type.equals("kyBCYChungChi")) {
				kyBCYChungChi(request, response);
			} else if (type.equals("dongDauBCYChungChi")) {
				dongDauBCYChungChi(request, response);

			} else if (type.equals("signature")) {
				signature(request, response);
			} else if (type.equals("updateActionLogOnline")) {
				updateActionLogOnline(request, response);

			} else if (type.equals("hienThiGiaTriThayDoiDKV")) {
				hienThiGiaTriThayDoiDKVDuocPhanCong(request, response);

			} else if (type.equals("hienThiGiaTriThayDoiDKVThongTinChung")) {
				hienThiGiaTriThayDoiThongTinChung(request, response);
			} else if (type.equals("deleteFileUploadBBKT")) {
				deleteFileUploadBBKT(request, response);
			} else if (type.equals("hienThiGiaTriThayDoiThongSoChungChi")) {
				hienThiGiaTriThayDoiThongSoChungChi(request, response);
			} else if (type.equals("hienThiGiaTriThayDoiChungChiNotThongSo")) {
				hienThiGiaTriThayDoiChungChiNotThongSo(request, response);
			} else if (type.equals("checkChungChiThamChieuBeforeSubmit")) {
				checkChungChiThamChieuBeforeSubmit(request, response);
			} else if (type.equals("getGiaTriTheoThamChieu")) {
				getGiaTriTheoThamChieu(request, response);
			} else if (type.equals("validateYeuCauBoSungAndHoanKiemTra")) {
				validateYeuCauBoSungAndHoanKiemTra(request, response);
			}

		} catch (SystemException e1) {
			log.error(e1);
		}
	}

	private void deleteCertificate(ResourceRequest request,
			ResourceResponse response) throws IOException {

	}

	private void kyBCYChungChi(ResourceRequest request,
			ResourceResponse response) throws IOException {
		byte[] inHash = null;
		String fieldName = StringPool.BLANK;
		String fullPathSigned = StringPool.BLANK;
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONArray _url_tthcHoSoThuTuc = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray hashComputers = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray signFieldNames = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray fileNames = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray messages = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray _url_vehicle = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray _id_vehicle = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray fullPathOfSignedFiles = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		String listVehicleRecordId = ParamUtil.getString(request,
				"vehicleRecordId");

		log.info("---Lanh Dao Phong Ky So====listVehicleRecordId=="
				+ listVehicleRecordId);

		try {
			if (listVehicleRecordId != null
					&& listVehicleRecordId.trim().length() > 0) {
				String[] list = listVehicleRecordId.trim().split(",");
				// Dich chuyen trang thai
				ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
				
				for (String item : list) {
					if (item != null && item.trim().length() > 0) {
						String urlFile = null;
						String realPath = ReportUtils.getTemplateReportFilePath(request);
						String realExportPath = realPath + "export/";
						long taiLieuDinhKemId = ReportUtils.getUrlFile(
								ConvertUtil.convertToLong(item), 0);
						
						if (taiLieuDinhKemId > 1) {
							urlFile = SignatureUtil.saveAsPdf(realExportPath,
								taiLieuDinhKemId);
						} else if (taiLieuDinhKemId == Constants.DA_KY) {
							continue;
						}
						
						if (urlFile == null || urlFile.length() == 0) {
							urlFile = ReportUtils.getUrlFileExport(request.getPortletSession(), 
								PortalUtil.getPortalURL(request), ConvertUtil.convertToLong(item));
						}

						_id_vehicle.put(item);
						_url_vehicle.put(urlFile);

						User user = themeDisplay.getUser();
						String email = user.getEmailAddress();

						CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
								.fetchByInspectorId(user.getUserId());

						// tinh toa do chu ky

						// String realExportPath = realPath + "export/";
						int lastIndex = urlFile.lastIndexOf("/");
						urlFile = urlFile.substring(lastIndex + 1,
								urlFile.length());
						ExtractTextLocations textLocation = new ExtractTextLocations(
								realExportPath + urlFile);
						if (corporationInspector != null
								&& corporationInspector.getFilechukyId() > 0) {
							long signtureImageId = corporationInspector
									.getFilechukyId();
							FileEntry entry = DLAppLocalServiceUtil
									.getFileEntry(signtureImageId);

							String imageBase64 = SignatureUtil
									.getSignatureImageBase64ByInputStream(entry.getContentStream());
							BufferedImage bufferedImage = SignatureUtil
									.getImageByInputStream(entry.getContentStream());
							// doc file cer tren server
							Certificate cert = SignatureUtil
									.getCertificateByPath(realExportPath
											+ email + ".cer");
							ServerSigner signer = SignatureUtil
									.getServerSigner(realExportPath + urlFile,
											cert, imageBase64);
							// tinh kich thuoc cua anh
							int signatureImageWidth = (bufferedImage != null && bufferedImage
									.getWidth() > 0) ? bufferedImage.getWidth()
									: 80;
							int signatureImageHeight = (bufferedImage != null && bufferedImage
									.getHeight() > 0) ? bufferedImage
									.getHeight() : 80;
							float llx = textLocation.getAnchorX();
							float urx = llx + signatureImageWidth / 3;

							float lly = textLocation.getPageURY()
									- textLocation.getAnchorY()
									- signatureImageHeight / 3;

							float ury = lly + signatureImageHeight / 3;

							inHash = signer.computeHash(
									new Rectangle(llx + 20, lly - 105,
											urx + 94, ury - 70), 1);
							
							fieldName = signer.getSignatureName();
							fullPathSigned = signer.getSignedFile();
							hashComputers.put(Base64.encode(inHash));
							signFieldNames.put(fieldName);
							fileNames.put(urlFile);

							_url_tthcHoSoThuTuc.put(realExportPath + urlFile);
							messages.put("success");
							fullPathOfSignedFiles.put(fullPathSigned);
							log.info("*************KY XONG TTHC**************: "
									+ fullPathSigned);
						}
					}

				}
				
				jsonFeed.put("idvehicle", _id_vehicle);
				jsonFeed.put("urlvehicle", _url_vehicle);
				jsonFeed.put("hashComputers", hashComputers);
				jsonFeed.put("signFieldNames", signFieldNames);
				jsonFeed.put("fileNames", fileNames);
				jsonFeed.put("msg", messages);
				jsonFeed.put("fullPathSigned", fullPathOfSignedFiles);
			}
		} catch (Exception e) {
			hashComputers.put(StringPool.BLANK);
			signFieldNames.put(StringPool.BLANK);
			fileNames.put(StringPool.BLANK);
			fullPathOfSignedFiles.put(StringPool.BLANK);
			log.error("Exception at kyBCYChungChi::::::::::::::: " + e);
		}
		PrintWriter out = response.getWriter();
		log.info("-----CHECK END KYSO-s ANHNT----" + jsonFeed.toString());
		out.print(jsonFeed.toString());
	}

	private void dongDauBCYChungChi(ResourceRequest request,
			ResourceResponse response) throws IOException {
		byte[] inHash = null;
		String fieldName = StringPool.BLANK;
		String fullPathSigned = StringPool.BLANK;
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONArray _url_tthcHoSoThuTuc = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray hashComputers = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray signFieldNames = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray fileNames = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray messages = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray _url_vehicle = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray _id_vehicle = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray fullPathOfSignedFiles = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		String listVehicleRecordId = ParamUtil.getString(request,
				"vehicleRecordId");

		log.info("---dongDauBCYChungChi====listVehicleRecordId=="
				+ listVehicleRecordId);

		try {
			if (listVehicleRecordId != null
					&& listVehicleRecordId.trim().length() > 0) {
				String[] list = listVehicleRecordId.trim().split(",");
				// Dich chuyen trang thai
				ThemeDisplay themeDisplay = (ThemeDisplay) request
						.getAttribute(WebKeys.THEME_DISPLAY);
				log.info("------length of list-----" + list.length);
				for (String item : list) {
					if (item != null && item.trim().length() > 0) {
						String urlFile = null;
						String realPath = ReportUtils
								.getTemplateReportFilePath(request);
						String realExportPath = realPath + "export/";
						long noiDungHoSoId = ReportUtils.getUrlFile(
								ConvertUtil.convertToLong(item), 1);
						// log.info("noiDungHoSoId =  "+noiDungHoSoId);
						if (noiDungHoSoId > 1) {
							urlFile = SignatureUtil.saveAsPdf(realExportPath,
									noiDungHoSoId);
						} else {
							urlFile = ReportUtils.getUrlFileExport(
									request.getPortletSession(),
									PortalUtil.getPortalURL(request),
									ConvertUtil.convertToLong(item));
						}
						// log.info("urlFile =  "+urlFile);
						_id_vehicle.put(item);
						_url_vehicle.put(urlFile);

						User user = themeDisplay.getUser();
						String email = user.getEmailAddress();
						String imageBase64 = StringPool.BLANK;

						CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
								.fetchByInspectorId(user.getUserId());

						// tinh toa do chu ky

						// String realExportPath = realPath + "export/";
						int lastIndex = urlFile.lastIndexOf("/");
						urlFile = urlFile.substring(lastIndex + 1,
								urlFile.length());
						ExtractTextLocations textLocation = new ExtractTextLocations(
								realExportPath + urlFile);

						// if (corporationInspector != null &&
						// corporationInspector.getFilechukyId() > 0) {
						if (corporationInspector != null) {
							String imagePath = realPath + "applet/dangkiem_maucondau.png"; //FileKySoUtils.URL_FILE_
							imageBase64 = SignatureUtil
									.getSignatureImageBase64ByPath(imagePath);
							BufferedImage bufferedImage = SignatureUtil
									.getImageByPath(imagePath);
							// doc file cer tren server
							Certificate cert = SignatureUtil
									.getCertificateByPath(realExportPath
											+ email + ".cer");
							ServerSigner signer = SignatureUtil
									.getServerSigner(realExportPath + urlFile,
											cert, imageBase64);
							// tinh kich thuoc cua anh
							int signatureImageWidth = (bufferedImage != null && bufferedImage
									.getWidth() > 0) ? bufferedImage.getWidth()
									: 80;
							int signatureImageHeight = (bufferedImage != null && bufferedImage
									.getHeight() > 0) ? bufferedImage
									.getHeight() : 80;
							// log.info(" textLocation.getAnchorX()  "+
							// textLocation.getAnchorX()+" textLocation  "+textLocation.getAnchorY());
							// log.info(" textLocation.getPageURX()  "+
							// textLocation.getPageURX()+" textLocation  "+textLocation.getPageURY());
							float llx = textLocation.getAnchorX();
							float urx = llx + signatureImageWidth / 3;
							// float urx = llx + signatureImageWidth;
							float lly = textLocation.getPageURY()
									- textLocation.getAnchorY()
									- signatureImageHeight / 3;
							// float lly = textLocation.getPageURY() -
							// textLocation.getAnchorY() - signatureImageHeight;
							float ury = lly + signatureImageHeight / 3;
							// float ury = lly + signatureImageHeight;
							// inHash = signer.computeHash(new Rectangle(llx,
							// lly, urx, ury), 1);
							// 118, 100, 206, 140 --> 140, 50, 340, 140
								// Anh con dau cu
								// inHash = signer.computeHash(new Rectangle(llx
								// + 20, lly - 115, urx + 114, ury-90), 1);
							inHash = signer.computeHash(
									new Rectangle(llx + 20, lly - 20,
											urx + 94, ury + 15), 1);
							fieldName = signer.getSignatureName();
							fullPathSigned = signer.getSignedFile();
							hashComputers.put(Base64.encode(inHash));
							signFieldNames.put(fieldName);
							fileNames.put(urlFile);

							_url_tthcHoSoThuTuc.put(realExportPath + urlFile);
							messages.put("success");
							fullPathOfSignedFiles.put(fullPathSigned);
							// log.info("*************DONG DAU XONG TTHC**************: "
							// + fullPathSigned);
						}
						// LanhDaoPhongBusiness.uploadFileKy(ConvertUtil.convertToLong(item),
						// urlFile, userId, request);
					}

				}
				jsonFeed.put("idvehicle", _id_vehicle);
				jsonFeed.put("urlvehicle", _url_vehicle);
				jsonFeed.put("hashComputers", hashComputers);
				jsonFeed.put("signFieldNames", signFieldNames);
				jsonFeed.put("fileNames", fileNames);
				jsonFeed.put("msg", messages);
				jsonFeed.put("fullPathSigned", fullPathOfSignedFiles);
			}
		} catch (Exception e) {
			hashComputers.put(StringPool.BLANK);
			signFieldNames.put(StringPool.BLANK);
			fileNames.put(StringPool.BLANK);
			fullPathOfSignedFiles.put(StringPool.BLANK);
			log.error("Exception at kyBCYChungChi::::::::::::::: " + e);
		}
		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
	}

	private void getComputerHash(ResourceRequest request,
			ResourceResponse response) throws IOException {
		log.info("------getComputerHash-----");

		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();

		JSONArray hashComputers = JSONFactoryUtil.getJSONFactory().createJSONArray();

		JSONArray signFieldNames = JSONFactoryUtil.getJSONFactory().createJSONArray();

		JSONArray fileNames = JSONFactoryUtil.getJSONFactory().createJSONArray();

		JSONArray messages = JSONFactoryUtil.getJSONFactory().createJSONArray();

		// Dich chuyen trang thai
		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		String listHoSoThuTucId = ParamUtil.getString(request,
				"listHoSoThuTucId");

		String dieuKienChuyenDich = ParamUtil.getString(request,
				Constants.DIEU_KIEN_CHUYEN_DICH);
		String idthuTucHanhChinh = StringPool.BLANK;

		log.info("kyDuyetGiayDKKT-------------danh sach ho so:----------------"
				+ listHoSoThuTucId);

		LanhDaoPhongBusiness lanhDaoPhongBusiness = new LanhDaoPhongBusiness();

		List<Long> allHoSoThuTucId = lanhDaoPhongBusiness.getListHoSoThuTucId(listHoSoThuTucId);

		if (allHoSoThuTucId != null && allHoSoThuTucId.size() > 0) {

			for (int i = 0; i < allHoSoThuTucId.size(); i++) {
				try {

					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
							.findByDossierId(allHoSoThuTucId.get(i));

					XacNhanDangKyKiemTraObject dangKyKiemTraObject = new XacNhanDangKyKiemTraObject();

					log.info("kyDuyetGiayDKKT-------------tthcHoSoThuTuc.getId():----------------"
							+ allHoSoThuTucId.get(i));
					if (registeredInspection != null) {
						log.info("kyDuyetGiayDKKT-------------registeredInspection.getId():----------------"
								+ registeredInspection.getId());
						dangKyKiemTraObject
								.setRegisteredinspectionId(registeredInspection
										.getId());
						dangKyKiemTraObject
								.setInspectorSignName("InspectorSignName");
						dangKyKiemTraObject
								.setInspectorSignPlace("InspectorSignPlace");
						dangKyKiemTraObject
								.setInspectorSignTitle("InspectorSignTitle");
						Boolean kq = nghiepVuBusiness.xacNhanDangKyKiemTraChuKySo(
							allHoSoThuTucId.get(i), dieuKienChuyenDich, themeDisplay.getUserId(), 
							dangKyKiemTraObject, registeredInspection);
						log.info("===xacNhanDangKyKiemTraChuKySo===" + kq);
					} else {
						log.info("-------------ko co ban ghi registeredInspection tuong ung voi tthcHoSoThuTuc:----------------"
								+ allHoSoThuTucId.get(i));
					}
					TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil
							.fetchTthcHoSoThuTuc(allHoSoThuTucId.get(i));
					if (tthcHoSoThuTuc != null) {
						idthuTucHanhChinh = String.valueOf(tthcHoSoThuTuc
								.getThuTucHanhChinhId());
					}
					// Export to File
					TthcNoidungHoSo tthcNoidungHoSo = null;
					if (idthuTucHanhChinh != null
							&& idthuTucHanhChinh.trim().length() > 0) {
						tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil
								.findBDKByHoSoThuTucIdAndTthcId(
										String.valueOf(allHoSoThuTucId.get(i)),
										idthuTucHanhChinh);
					}

					if (tthcNoidungHoSo != null) {
						log.info("kyDuyetGiayDKKT-------------tthcNoidungHoSo.getId():----------------"
							+ tthcNoidungHoSo.getId());

						long idNoiDungHoSo = tthcNoidungHoSo.getId();

						String tenFileExport = "defaultPDF.pdfs";

						String realPath = ReportUtils.getTemplateReportFilePath(request);
						
						String realExportPath = realPath + "export/";

						String fileName = ReportBusinessUtils.actionExport(realPath, idNoiDungHoSo);

						if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
							tenFileExport = fileName;
						}

						String email = themeDisplay.getUser().getEmailAddress();

						CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
								.fetchByInspectorId(themeDisplay.getUserId());

						// tinh toa do chu ky
						ExtractTextLocations textLocation = new ExtractTextLocations(realExportPath + tenFileExport);
						
						if (corporationInspector != null && corporationInspector.getFilechukyId() > 0) {

							long signtureImageId = corporationInspector.getFilechukyId();

							log.info("===textLocation===getAnchorX===getAnchorY==="
									+ textLocation.getAnchorX() + "-"
									+ textLocation.getAnchorY());

							log.info("===textLocation===getPageLLX===getPageURX===getPageLLY===getPageURY==="
									+ textLocation.getPageLLX() + "-"
									+ textLocation.getPageURX() + "-"
									+ textLocation.getPageLLY() + "-"
									+ textLocation.getPageURY());

							FileEntry entry = DLAppLocalServiceUtil.getFileEntry(signtureImageId);

							/*String signtureImageURL = themeDisplay.getPortalURL()+ DocumentUtils
									.getLinkDownloadFromNoiLuuTruTaiLieuId(signtureImageId);*/

							// doc va base64 anh chu ky
							//File imageFile = new File(realExportPath + email + "." + entry.getExtension());
							
							/*String imagePath = SignatureUtil.saveAsImage(realExportPath, email, 
									entry.getExtension(), entry.getFileEntryId());*/

							String imageBase64 = SignatureUtil.getSignatureImageBase64ByInputStream(entry.getContentStream());

							BufferedImage bufferedImage = SignatureUtil.getImageByInputStream(entry.getContentStream());
							
							log.info("===bufferedImage.getWidth===" + bufferedImage.getWidth());
							log.info("===bufferedImage.getHeight===" + bufferedImage.getHeight());

							// doc file cer tren server
							Certificate cert = SignatureUtil.getCertificateByPath(realExportPath + email + ".cer");
							ServerSigner signer = SignatureUtil.getServerSigner(realExportPath
								+ tenFileExport, cert, imageBase64);

							// tinh kich thuoc cua anh

							int signatureImageWidth = (bufferedImage != null && bufferedImage.getWidth() > 0) ? 
									bufferedImage.getWidth() : 80;

							int signatureImageHeight = (bufferedImage != null && bufferedImage.getHeight() > 0) ? 
									bufferedImage .getHeight() : 80;
							
									float llx = textLocation.getAnchorX();

							float urx = llx + signatureImageWidth / 3;

							float lly = textLocation.getPageURY() - textLocation.getAnchorY() - signatureImageHeight / 3;

							float ury = lly + signatureImageHeight / 3;
							byte[] inHash = signer.computeHash(new Rectangle(llx + 22, lly - 45, urx + 114, ury - 20), 1);
							
							hashComputers.put(Base64.encode(inHash));
							signFieldNames.put(signer.getSignatureName());
							fileNames.put(tenFileExport);
							messages.put("success");
							
							log.info("===KY XONG TTHC===" + allHoSoThuTucId.get(i));

						} else {
							log.info("===CHUA CO FILE ANH CHU KY===");
							messages.put("Chua co file anh chu ky so");
						}
					}
				} catch (Exception e) {
					messages.put("Error signature TTHC:" + allHoSoThuTucId.get(i));
					hashComputers.put(StringPool.BLANK);
					signFieldNames.put(StringPool.BLANK);
					fileNames.put(StringPool.BLANK);
					log.error(e);
					continue;
				}
			}
		}
		
		log.info("kyDuyetGiayDKKT-------------end----------------");

		jsonFeed.put("hashComputers", hashComputers);
		jsonFeed.put("signFieldNames", signFieldNames);
		jsonFeed.put("fileNames", fileNames);
		jsonFeed.put("msg", messages);

		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
		// / End check
		// sign digital by leader of department (Ky BCY)
	}

	private void kyDuyetGiayDKKT(ResourceRequest request,
			ResourceResponse response) throws IOException {
		log.info("------kyDuyetGiayDKKT-----");

		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();

		JSONArray _url_tthcHoSoThuTuc = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray _id_tthcHoSoThuTuc = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();

		// Dich chuyen trang thai
		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		String listHoSoThuTucId = ParamUtil.getString(request,
				"listHoSoThuTucId");
		String dieuKienChuyenDich = ParamUtil.getString(request,
				Constants.DIEU_KIEN_CHUYEN_DICH);
		String idthuTucHanhChinh = "";

		log.info("kyDuyetGiayDKKT-------------danh sach ho so:----------------"
				+ listHoSoThuTucId);

		XacNhanDangKyKiemTraObject dangKyKiemTraObject = null;
		RegisteredInspection registeredInspection;
		LanhDaoPhongBusiness lanhDaoPhongBusiness = new LanhDaoPhongBusiness();
		List<Long> allHoSoThuTucId = lanhDaoPhongBusiness
				.getListHoSoThuTucId(listHoSoThuTucId);
		// List<TthcHoSoThuTuc> allHoSoThuTuc =
		// lanhDaoPhongBusiness.getListHoSoThuTuc(listHoSoThuTucId);
		try {
			if (allHoSoThuTucId != null && allHoSoThuTucId.size() > 0) {
				int size = allHoSoThuTucId.size();
				for (int i = 0; i < size; i++) {
					registeredInspection = RegisteredInspectionLocalServiceUtil
							.findByDossierId(allHoSoThuTucId.get(i));
					dangKyKiemTraObject = new XacNhanDangKyKiemTraObject();

					log.info("kyDuyetGiayDKKT-------------tthcHoSoThuTuc.getId():----------------"
							+ allHoSoThuTucId.get(i));
					if (registeredInspection != null) {
						log.info("kyDuyetGiayDKKT-------------registeredInspection.getId():----------------"
								+ registeredInspection.getId());
						dangKyKiemTraObject
								.setRegisteredinspectionId(registeredInspection
										.getId());
						dangKyKiemTraObject
								.setInspectorSignName("InspectorSignName");
						dangKyKiemTraObject
								.setInspectorSignPlace("InspectorSignPlace");
						dangKyKiemTraObject
								.setInspectorSignTitle("InspectorSignTitle");
						Boolean kq = nghiepVuBusiness
								.xacNhanDangKyKiemTraChuKySo(
										allHoSoThuTucId.get(i),
										dieuKienChuyenDich,
										themeDisplay.getUserId(),
										dangKyKiemTraObject,
										registeredInspection);

					} else {
						log.info("-------------ko co ban ghi registeredInspection tuong ung voi tthcHoSoThuTuc:----------------"
								+ allHoSoThuTucId.get(i));
					}
					TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil
							.fetchTthcHoSoThuTuc(allHoSoThuTucId.get(i));
					if (tthcHoSoThuTuc != null) {
						idthuTucHanhChinh = String.valueOf(tthcHoSoThuTuc
								.getThuTucHanhChinhId());
					}
					// Export to File
					TthcNoidungHoSo tthcNoidungHoSo = null;
					if (idthuTucHanhChinh != null
							&& idthuTucHanhChinh.trim().length() > 0) {
						tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil
								.findBDKByHoSoThuTucIdAndTthcId(
										String.valueOf(allHoSoThuTucId.get(i)),
										idthuTucHanhChinh);
					}
					log.info("kyDuyetGiayDKKT-------------tthcNoidungHoSo.getId():----------------"
							+ tthcNoidungHoSo.getId());

					if (tthcNoidungHoSo != null) {
						String urlFile = "";
						long idNoiDungHoSo = tthcNoidungHoSo.getId();

						// long idNoiDungHoSo = 1;
						String tenFileExport = "defaultPDF.pdfs";

						String fileName = "";

						// if (tthcNoidungHoSo.getTaiLieuDinhKem() > 0)
						// {
						// urlFile =
						// DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(tthcNoidungHoSo.getTaiLieuDinhKem());
						// } else {
						String realPath = ReportUtils
								.getTemplateReportFilePath(request);
						fileName = ReportBusinessUtils.actionExport(realPath,
								idNoiDungHoSo);
						if (fileName
								.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
							tenFileExport = fileName;
						}
						urlFile = request.getContextPath() + "/export/"
								+ tenFileExport;
						System.out
								.println("==/======kyDuyetGiayDKKT=========urlFile =========="
										+ urlFile);
						// }
						log.info("kyDuyetGiayDKKT-----------urlFile====="
								+ urlFile);
						if (urlFile.trim().length() > 0) {
							_id_tthcHoSoThuTuc.put("" + allHoSoThuTucId.get(i));
							_url_tthcHoSoThuTuc.put(urlFile);
						}

					}
					// //

				}
			}

			jsonFeed.put("idtthcHoSoThuTuc", _id_tthcHoSoThuTuc);
			jsonFeed.put("urltthcHoSoThuTuc", _url_tthcHoSoThuTuc);

		} catch (Exception e) {
			log.error(e);
			log.error(e);
		}

		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
		// / End check
	}

	private void lanhDaoPhongKySo(ResourceRequest request,
			ResourceResponse response) throws IOException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();

		JSONArray _url_vehicle = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray _id_vehicle = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();

		String listVehicleRecordId = ParamUtil.getString(request,
				"vehicleRecordId");

		log.info("---Lanh Dao Phong Ky So====listVehicleRecordId=="
				+ listVehicleRecordId);

		// export xml
		long userId = PortalUtil.getUserId(request);
		long idPhieuXuLyPhu = ParamUtil.getLong(request, "idPhieuXuLyPhu");
		long idHoSoThuTuc = ParamUtil.getLong(request, "idHoSoThuTuc");
		String dieuKienChuyenDich = ParamUtil.getString(request,
				"dieuKienChuyenDich");

		boolean check = QuanLyHoSoUtils.lanhDaoPhongKyXacNhan(
				listVehicleRecordId, userId, idPhieuXuLyPhu, idHoSoThuTuc,
				dieuKienChuyenDich, null);

		log.info("------check-----" + check);

		// //////////
		if (listVehicleRecordId != null
				&& listVehicleRecordId.trim().length() > 0) {
			String[] list = listVehicleRecordId.trim().split(",");

			for (String item : list) {
				if (item != null && item.trim().length() > 0) {
					String urlFile = ReportUtils.getUrlFileExport(
							request.getPortletSession(),
							PortalUtil.getPortalURL(request),
							ConvertUtil.convertToLong(item));

					_id_vehicle.put(item);
					_url_vehicle.put(urlFile);
				}
			}

			jsonFeed.put("idvehicle", _id_vehicle);
			jsonFeed.put("urlvehicle", _url_vehicle);
		}
		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
	}

	private void toNghiepVuSoanBanThao(ResourceRequest request,
			ResourceResponse response) throws SystemException, IOException {
		log.info("----serveResource---");
		log.info("----toNghiepVuSoanBanThao---");
		long vehicleGroupId = ParamUtil.getLong(request, "dataId");
		long nhomId = ParamUtil.getLong(request, "nhomId");

		log.info("----vehicleGroupId---" + vehicleGroupId);

		// Process Jason feed
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();

		JSONArray _id_data = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray _nhom_data = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray _nhanHieu_data = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray _soKhung_data = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray _tinhtrang_data = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();

		if (vehicleGroupId > 0) {
			List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil
					.findByVehicleGroupId(vehicleGroupId);
			VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil
					.fetchVehicleGroup(vehicleGroupId);
			if (vehicleGroup == null) {
				vehicleGroup = new VehicleGroupImpl();
			}
			String nhanHieuSoLoai = ReportUtils.getTenDmData(
					ReportConstant.TRADE_MARK, vehicleGroup.getTradeMark())
					+ ReportUtils.getTenDmData(ReportConstant.TRADE_MARK,
							vehicleGroup.getCommercialName());

			if (vehicleRecords != null && vehicleRecords.size() > 0) {
				for (VehicleRecord item : vehicleRecords) {
					if (item.getDraftCertificateId() > 0
							&& item.getCertificateRecordId() == 0) {
						String soKhungDongCo = item.getChassisNumber() + "<br>"
								+ item.getEngineNumber();
						String tinhTrangThamChieu = ReportUtils.getTenDmData(
								ReportConstant.TRADE_MARK,
								item.getVehicleEngineStatus())
								+ "<br>" + item.getCodeNumber();

						_id_data.put(String.valueOf(item.getId()));
						_nhom_data.put(nhomId);
						_nhanHieu_data.put(nhanHieuSoLoai);
						_soKhung_data.put(soKhungDongCo);
						_tinhtrang_data.put(tinhTrangThamChieu);
					}
				}
			}

			jsonFeed.put("iddata", _id_data);
			jsonFeed.put("nhomdata", _nhom_data);
			jsonFeed.put("nhanhieudata", _nhanHieu_data);
			jsonFeed.put("sokhungdata", _soKhung_data);
			jsonFeed.put("tinhtrangdata", _tinhtrang_data);
		}

		jsonFeed.put("urlFile", "/DangKiemApp-portlet/export/"
				+ ReportConstant.TEN_FILE_DEFAULT);

		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
	}

	private void lanhDaoPhongBanThaoCC(ResourceRequest request,
			ResourceResponse response) throws IOException {
		log.info("----serveResource---lanhDaoPhongBanThaoCC =====");
		long vehicleRecordId = ParamUtil.getLong(request, "vehicleRecordId");
		log.info("----vehicleRecordId=====" + vehicleRecordId);

		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		long inspectionRecordId = ParamUtil.getLong(request,
				Constants.ID_INSPECTION_RECORD);
		long certificateType = ParamUtil.getLong(request,
				Constants.CERTIFICATE_TYPE);
		String registeredNumber = ParamUtil.getString(request,
				Constants.REGISTERED_NUMBER);
		String dieuKienChuyenDich = "";

		log.info("----hoSoThuTucId=====" + hoSoThuTucId);
		log.info("----phieuXuLyPhuId=====" + phieuXuLyPhuId);
		log.info("----inspectionRecordId=====" + inspectionRecordId);
		log.info("----certificateType=====" + certificateType);
		log.info("----registeredNumber=====" + registeredNumber);

		GcnChatLuongDongCoMotoXeMay gcnChatLuongModel = GcnChatLuongDongCoMotoXeMay
				.getModelByInspectionRecordId(hoSoThuTucId, inspectionRecordId);
		if (certificateType == 0) {
			certificateType = 1;
		}
		DraftCertificate draftCertificate = gcnChatLuongModel
				.getDraftCertificate();
		draftCertificate.setCertificateType(certificateType);
		InspectionRecord inspectionRecord = gcnChatLuongModel
				.getInspectionRecord();

		long idNoiDungHs = nghiepVuBusiness.xemTruocBanThaoChungChi(
				hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
				PortalUtil.getUserId(request), registeredNumber,
				draftCertificate, inspectionRecord,
				gcnChatLuongModel.getAllDraftCertificateSpec(),
				gcnChatLuongModel.getAllVehicleRecord());

		log.info("----idNoiDungHs=====" + idNoiDungHs);

		// Process Jason feed
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();

		String urlFile = ReportUtils.urlFileJasperExportByIdNDHS(
				request.getPortletSession(), idNoiDungHs);
		jsonFeed.put("urlFile", urlFile);

		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
	}

	private void lanhDaoPhong(ResourceRequest request, ResourceResponse response)
			throws IOException {
		log.info("----serveResource---lanh dao phong=====");
		long vehicleRecordId = ParamUtil.getLong(request, "vehicleRecordId");

		log.info("----vehicleRecordId---" + vehicleRecordId);

		// Process Jason feed
		JSONObject json = JSONFactoryUtil.createJSONObject();

		String urlFile = ReportUtils.getUrlFileExport(
				request.getPortletSession(), PortalUtil.getPortalURL(request),
				vehicleRecordId);
		json.put("urlFile", urlFile);

		PrintWriter out = response.getWriter();
		out.print(json.toString());
	}

	private void getTenThuTuc(ResourceRequest request, ResourceResponse response)
			throws IOException {
		String linhVucThuTucId = ParamUtil.getString(request, "codeLoaiThuTuc");

		List<TthcThuTucHanhChinh> lstTthc = TthcThuTucHanhChinhLocalServiceUtil
				.findByLinhVuc(Long.parseLong(linhVucThuTucId));
		if (lstTthc == null) {
			lstTthc = new ArrayList<TthcThuTucHanhChinh>();
		}

		JSONArray array = JSONFactoryUtil.createJSONArray();
		JSONObject json = null;

		for (TthcThuTucHanhChinh item : lstTthc) {
			json = JSONFactoryUtil.createJSONObject();
			json.put("id", item.getId());
			json.put("name", item.getTenThuTuc());
			array.put(json);
		}
		PrintWriter out = response.getWriter();
		log.debug(array.toString());
		out.print(array.toString());
	}

	private void updateActionLogOnline(ResourceRequest request, ResourceResponse response)
			throws IOException {

		//log.info("call updateActionLogOnline:::::::::::::::::::");
		long hoSoThuTucIdActionLog = ConvertUtil.convertToLong(ParamUtil.getString(request, "hoSoThuTucIdActionLog")); 
		long inspectoridActionLog = ConvertUtil.convertToLong(ParamUtil.getString(request, "inspectoridActionLog")); 
		String inspectornameActionLog = ParamUtil.getString(request, "inspectornameActionLog"); 
		String noidungthaotacActionLog = ParamUtil.getString(request, "noidungthaotacActionLog"); 
		String tenmanhinhdaidienActionLog = ParamUtil.getString(request, "tenmanhinhdaidienActionLog"); 
		String tenPhanNhomHoSoActionLog = ParamUtil.getString(request, "tenPhanNhomHoSoActionLog"); 
		String importername = ""; 

		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		
		if (Validator.isNotNull(noidungthaotacActionLog) && Validator.isNotNull(tenmanhinhdaidienActionLog)) {
			try {
				jsonFeed.put("msg", "success");
				ActionLog newAction = null;
				long actionlogID = CounterLocalServiceUtil.increment(ActionLog.class.getName());
				newAction = ActionLogLocalServiceUtil.createActionLog(actionlogID);
				newAction.setNgayxemhoso(new Date());
				newAction.setHosothutucid(hoSoThuTucIdActionLog);
				newAction.setMabiennhan(null);
				newAction.setMasohoso(null);
				newAction.setNoidungmanhinh(noidungthaotacActionLog);
				newAction.setTitle(tenmanhinhdaidienActionLog);
				newAction.setImportername(importername);
				newAction.setInspectorid(inspectoridActionLog);
				newAction.setInspectorname(inspectornameActionLog);
				
				
				if (inspectoridActionLog > 0) {
					ActionLogLocalServiceUtil.updateActionLog(newAction);
					CorporationInspector corpInspector = CorporationInspectorLocalServiceUtil.findByInspectorId(inspectoridActionLog);
					if (corpInspector != null && corpInspector.getInspectorid() > 0){
						newAction.setCorporationid(corpInspector.getCorporationId());
						newAction.setContactcode(corpInspector.getContactcode());
						newAction.setInspectorphone(corpInspector.getInspectorPhone());
						newAction.setInspectoremail(corpInspector.getInspectorEmail());
						ActionLogLocalServiceUtil.updateActionLog(newAction);
					}
				}
				
				
				log.info("updateActionLogOnline DONE =====" + actionlogID + "===inspectoridActionLog====" + inspectoridActionLog);
			} catch (Exception e) {
				log.error(e);
				jsonFeed.put("msg", "error");
			}
		} else {
			jsonFeed.put("msg", "error");
			log.info("updateActionLogOnline failed");
		}
		
		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
	}
	
	// hoan thanh phan ky so vao pdf
	public void signature(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		log.info("===signature===");
		
		HttpServletRequest request = PortalUtil.getHttpServletRequest(actionRequest);
		
		String sign = ParamUtil.getString(actionRequest, "sign");
		String signFieldName = ParamUtil.getString(actionRequest, "signFieldName");
		String fileName = ParamUtil.getString(actionRequest, "fileName");
		
		long hoSoThuTucId = ParamUtil.getLong(actionRequest, "hoSoThuTucId");
		
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		
		if (Validator.isNotNull(sign) && Validator.isNotNull(fileName)) {
			byte[] signature = Base64.decode(sign);

			String realPath = ReportUtils.getTemplateReportFilePath(request);

			String realExportPath = realPath + "export/";
			
			try {
				fileName = fileName.substring(0, fileName.lastIndexOf(StringPool.PERIOD));
				
				ServerSigner signer = new ServerSigner(realExportPath
						+ fileName + ".pdf", null);

				signer.completeSign(signature, signFieldName);
				
				jsonFeed.put("msg", "success");
				jsonFeed.put("signerURL", signer.getSignedFile());
				jsonFeed.put("hoSoThuTucId", hoSoThuTucId);
				
			} catch (Exception e) {
				log.error(e);
				jsonFeed.put("msg", "error");
			}
		} else {
			jsonFeed.put("msg", "error");
			log.info("Cannot sign the file: " + fileName);
		}
		
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		
		PortletUtil.writeJSON(actionResponse, jsonFeed);
	}

	private void signature(ResourceRequest request, ResourceResponse response)
			throws IOException {

		log.info("call signature:::::::::::::::::::");
		String sign = ParamUtil.getString(request, "sign");
		String signFieldName = ParamUtil.getString(request, "signFieldName");
		String fileName = ParamUtil.getString(request, "fileName");
		fileName = fileName.substring(0,
				fileName.lastIndexOf(StringPool.PERIOD));
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		
		if (Validator.isNotNull(sign) && Validator.isNotNull(fileName)) {
			byte[] signature = Base64.decode(sign);

			String realPath = ReportUtils.getTemplateReportFilePath(request);

			String realExportPath = realPath + "/export/";
			try {
				ServerSigner signer = new ServerSigner(realExportPath
						+ fileName + ".pdf", null);

				signer.completeSign(signature, signFieldName);

				jsonFeed.put("msg", "success");
				jsonFeed.put("signerURL", signer.getSignedFile());
				log.info("success");
			} catch (Exception e) {
				log.error(e);
				jsonFeed.put("msg", "error");
			}
		} else {
			jsonFeed.put("msg", "error");
			log.info("Cannot sign the file: " + fileName);
		}
		
		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
	}

	private void signatureDongDauComplete(ResourceRequest request,
			ResourceResponse response) throws IOException {

		log.info("===call signature===signatureDongDauComplete");
		String sign = ParamUtil.getString(request, "sign");
		String signFieldName = ParamUtil.getString(request, "signFieldName");
		String fileName = ParamUtil.getString(request, "fileName");
		
		long vehicleRecordId = ParamUtil.getLong(request, "vehicleRecordId");
		long idPhieuXuLyPhu = ParamUtil.getLong(request, "idPhieuXuLyPhu");
		long idHoSoThuTuc = ParamUtil.getLong(request, "idHoSoThuTuc");
		String dieuKienChuyenDich = ParamUtil.getString(request,
				"dieuKienChuyenDich");
		// log.info("fileName after::::::::::::::::::: " + fileName);
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		if (Validator.isNotNull(sign) && Validator.isNotNull(fileName)) {
			byte[] signature = Base64.decode(sign);

			String realPath = ReportUtils.getTemplateReportFilePath(request);

			String realExportPath = realPath + "export/";
			try {
				fileName = fileName.substring(0, fileName.lastIndexOf(StringPool.PERIOD));
				
				ServerSigner signer = new ServerSigner(realExportPath
						+ fileName + ".pdf", null);

				signer.completeSign(signature, signFieldName);

				String signedFile = signer.getSignedFile();
				VehicleRecord item = VehicleRecordLocalServiceUtil
						.fetchVehicleRecord(vehicleRecordId);
				ThemeDisplay themeDisplay = (ThemeDisplay) request
						.getAttribute(WebKeys.THEME_DISPLAY);
				dongDau(request, themeDisplay.getUserId(), idPhieuXuLyPhu,
						idHoSoThuTuc, dieuKienChuyenDich, item, signedFile);

				jsonFeed.put("msg", "success");
				log.info("success");
			} catch (Exception e) {
				log.error(e);
				jsonFeed.put("msg", "error");
			}
		} else {
			jsonFeed.put("msg", "error");
			log.info("Cannot sign the file: " + fileName);
		}
		
		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
	}

	private void signatureComplete(ResourceRequest request,
			ResourceResponse response) throws IOException {

		log.info("===call signature===signatureComplete");
		String sign = ParamUtil.getString(request, "sign");
		String signFieldName = ParamUtil.getString(request, "signFieldName");
		String fileName = ParamUtil.getString(request, "fileName");
		
		long vehicleRecordId = ParamUtil.getLong(request, "vehicleRecordId");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		
		if (Validator.isNotNull(sign) && Validator.isNotNull(fileName)) {
			byte[] signature = Base64.decode(sign);

			String realPath = ReportUtils.getTemplateReportFilePath(request);

			String realExportPath = realPath + "/export/";
			try {
				fileName = fileName.substring(0,
						fileName.lastIndexOf(StringPool.PERIOD));
				
				ServerSigner signer = new ServerSigner(realExportPath
						+ fileName + ".pdf", null);

				signer.completeSign(signature, signFieldName);

				String signedFile = signer.getSignedFile();
				VehicleRecord item = VehicleRecordLocalServiceUtil
						.fetchVehicleRecord(vehicleRecordId);
				ThemeDisplay themeDisplay = (ThemeDisplay) request
						.getAttribute(WebKeys.THEME_DISPLAY);
				lanhDaoPhongBusiness.upDateKySo(request,
						themeDisplay.getUserId(), item, signedFile);
				// jsonFeed.put("signerURL", signer.getSignedFile());

				jsonFeed.put("msg", "success");
				log.info("===signatureComplete===success");
			} catch (Exception e) {
				log.error(e);
				jsonFeed.put("msg", "error");
			}
		} else {
			jsonFeed.put("msg", "error");
			log.info("Cannot sign the file: " + fileName);
		}
		
		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
	}

	private void checkChungChiThamChieuBeforeSubmit(ResourceRequest request,
			ResourceResponse response) throws IOException {

		String anChiNo = ParamUtil.getString(request, "anChiNo");

		JSONObject obj = JSONFactoryUtil.createJSONObject();

		log.info("---checkSoAnChiBeforeSubmit=====" + anChiNo);

		CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
				.findByCertificateNumber(anChiNo);

		if (certificateRecord != null
				&& certificateRecord.getStampStatus() != Constants.AN_CHI_HUY) {
			obj.put("checAnChi", true);
		} else {
			obj.put("checAnChi", false);
		}

		PrintWriter out = response.getWriter();
		out.print(obj.toString());
	}

	private void hienThiGiaTriThayDoiChungChiNotThongSo(
			ResourceRequest request, ResourceResponse response)
			throws IOException {

		long dataGroupId = ParamUtil.getLong(request, "datagroupid");
		String vehicleClass = ParamUtil.getString(request, "vehicleClass");

		JSONObject obj = JSONFactoryUtil.createJSONObject();

		JSONArray nameArray = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray codeArray = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();

		log.info("---hienThiGiaTriThayDoiDKVDuocPhanCong====dataGroupId=="
				+ dataGroupId);

		List<DmDataItem> dmDataItems = null;
		if (dataGroupId > 0) {
			if (dataGroupId == 2) {
				dmDataItems = DmDataItemLocalServiceUtil
						.findByVehicleClassAndDatagroupidByLoaiPhuongTien(
								dataGroupId, vehicleClass.trim());
			} else {
				dmDataItems = DmDataItemLocalServiceUtil
						.findByVehicleClassAndDatagroupid(dataGroupId,
								vehicleClass.trim());
			}
		}

		if (dmDataItems != null && dmDataItems.size() > 0) {
			for (DmDataItem item : dmDataItems) {
				codeArray.put(item.getCode0());
				nameArray.put(item.getName());
			}
			obj.put("codedataitem", codeArray);
			obj.put("namedataitem", nameArray);

			log.info("--hienThiGiaTriThayDoiChungChiNotThongSo--size--"
					+ dmDataItems.size());
		} else {
			log.info("--hienThiGiaTriThayDoiChungChiNotThongSo--size--0");
		}

		PrintWriter out = response.getWriter();
		out.print(obj.toString());
	}

	private void hienThiGiaTriThayDoiThongSoChungChi(ResourceRequest request,
			ResourceResponse response) throws IOException {
		String specificationcode = ParamUtil.getString(request,
				"specificationcode");
		String vehicleClass = ParamUtil.getString(request, "vehicleClass");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();

		JSONArray _name_dataitem = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray _code_dataitem = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();

		log.info("---hienThiGiaTriThayDoiThongSoChungChi====specificationcode=="
				+ specificationcode + "=======vehicleClass==" + vehicleClass);

		List<DmDataItem> dmDataItems = null;
		if (specificationcode.trim().length() > 0) {
			dmDataItems = DmDataItemLocalServiceUtil.findBySpecificationCode(
					specificationcode, vehicleClass);
		}

		if (dmDataItems != null && dmDataItems.size() > 0) {
			for (DmDataItem item : dmDataItems) {
				_code_dataitem.put(item.getCode0());
				_name_dataitem.put(item.getName());
			}
			jsonFeed.put("codedataitem", _code_dataitem);
			jsonFeed.put("namedataitem", _name_dataitem);
		}

		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
		log.debug("=hienThiGiaTriThayDoiThongSoChungChi==jsonFeed=="
				+ jsonFeed.toString());
	}

	private void hienThiGiaTriThayDoiDKVDuocPhanCong(ResourceRequest request,
			ResourceResponse response) throws IOException {
		String specificationcode = ParamUtil.getString(request,
				"specificationcode");
		String vehicleClass = ParamUtil.getString(request, "vehicleClass");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();

		JSONArray _name_dataitem = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray _code_dataitem = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();

		log.info("---hienThiGiaTriThayDoiDKVDuocPhanCong====specificationcode=="
				+ specificationcode + "=======vehicleClass==" + vehicleClass);

		List<DmDataItem> dmDataItems = null;
		if (specificationcode.trim().length() > 0) {
			dmDataItems = DmDataItemLocalServiceUtil.findBySpecificationCode(
					specificationcode, vehicleClass);
		}

		if (dmDataItems != null && dmDataItems.size() > 0) {
			for (DmDataItem item : dmDataItems) {
				_code_dataitem.put(item.getCode0());
				_name_dataitem.put(item.getName());
			}
			jsonFeed.put("codedataitem", _code_dataitem);
			jsonFeed.put("namedataitem", _name_dataitem);
		}

		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
		log.debug("=hienThiGiaTriThayDoiDKVDuocPhanCong==jsonFeed=="
				+ jsonFeed.toString());
	}

	private void hienThiGiaTriThayDoiThongTinChung(ResourceRequest request,
			ResourceResponse response) throws IOException {

		long dataGroupId = ParamUtil.getLong(request, "specificationcode");
		String vehicleClass = ParamUtil.getString(request, "vehicleClass");

		JSONObject obj = JSONFactoryUtil.createJSONObject();

		JSONArray nameArray = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray codeArray = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();

		log.info("---hienThiGiaTriThayDoiDKVDuocPhanCong====dataGroupId=="
				+ dataGroupId);

		List<DmDataItem> dmDataItems = null;
		if (dataGroupId > 0) {
			if (dataGroupId == 2) {
				dmDataItems = DmDataItemLocalServiceUtil
						.findByVehicleClassAndDatagroupidByLoaiPhuongTien(
								dataGroupId, vehicleClass.trim());
			} else {
				dmDataItems = DmDataItemLocalServiceUtil
						.findByVehicleClassAndDatagroupid(dataGroupId,
								vehicleClass.trim());
			}
		}

		if (dmDataItems != null && dmDataItems.size() > 0) {
			for (DmDataItem item : dmDataItems) {
				codeArray.put(item.getCode0());
				nameArray.put(item.getName());
			}
			obj.put("codedataitem", codeArray);
			obj.put("namedataitem", nameArray);

			log.info("--hienThiGiaTriThayDoiThongTinChung--size--"
					+ dmDataItems.size());
		} else {
			log.info("--hienThiGiaTriThayDoiThongTinChung--size--0");
		}

		PrintWriter out = response.getWriter();
		out.print(obj.toString());
		log.debug("=hienThiGiaTriThayDoiThongTinChung==jsonFeed=="
				+ obj.toString());
	}

	private void deleteFileUploadBBKT(ResourceRequest request,
			ResourceResponse response) throws IOException {
		long idInspectionRecordAttach = ParamUtil.getLong(request,
				"idInspectionRecordAttach");
		long idInspectionRecord = ParamUtil.getLong(request,
				"idInspectionRecord");

		JSONObject obj = JSONFactoryUtil.createJSONObject();

		JSONArray idInspectionRecordAttachArray = JSONFactoryUtil
				.getJSONFactory().createJSONArray();
		JSONArray idInspectionRecordArray = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray nameArray = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();
		JSONArray urlArray = JSONFactoryUtil.getJSONFactory().createJSONArray();

		List<InspectionRecordAttach> lstInspectionRecordAttachs = null;
		InspectionRecordAttach inspectionRecordAttach = null;
		boolean checkUpdate = false;
		try {
			inspectionRecordAttach = InspectionRecordAttachLocalServiceUtil
					.fetchInspectionRecordAttach(idInspectionRecordAttach);
			if (inspectionRecordAttach != null) {
				inspectionRecordAttach.setMarkUpDelte(1);
				InspectionRecordAttachLocalServiceUtil
						.updateInspectionRecordAttach(inspectionRecordAttach);
				checkUpdate = true;
			}
		} catch (SystemException e) {
			log.error(e);
		}
		if (checkUpdate) {
			lstInspectionRecordAttachs = InspectionRecordAttachLocalServiceUtil
					.findByInspectionRecordAttach(idInspectionRecord);
		}
		if (lstInspectionRecordAttachs != null
				&& lstInspectionRecordAttachs.size() > 0) {
			for (InspectionRecordAttach recordAttach : lstInspectionRecordAttachs) {
				if (recordAttach.getMarkUpDelte() == 0) {
					String urlFile = DocumentUtils
							.getLinkDownloadFromNoiLuuTruTaiLieuId(recordAttach
									.getEnTryId());

					idInspectionRecordAttachArray.put(recordAttach.getId());
					idInspectionRecordArray.put(recordAttach
							.getInspectionRecordId());
					nameArray.put(recordAttach.getEnTryName());
					urlArray.put(urlFile);
				}

			}
			obj.put("idinspectionrecordattach", idInspectionRecordAttachArray);
			obj.put("idinspectionrecord", idInspectionRecordArray);
			obj.put("name", nameArray);
			obj.put("url", urlArray);
		}

		PrintWriter out = response.getWriter();
		out.print(obj.toString());
	}

	private void callAjaxHienThiBaoCaoReport(ResourceRequest request,
			ResourceResponse response) {
		try {
			JSONObject object = null;
			long vehicleGroupId = ParamUtil.getLong(request, "vehicleGroupId");
			String vehicleClass = ParamUtil.getString(request, "vehicleClass");

			log.info("==callAjaxHienThiBaoCaoReport==vehicleGroupId=="
					+ vehicleGroupId);
			log.info("==callAjaxHienThiBaoCaoReport==vehicleClass===="
					+ vehicleClass);

			object = JSONFactoryUtil.createJSONObject();
			// xay ra loi thi hien gia pdf default
			try {
				TthcNoidungHoSo tthcNoiDungHoSo = VehicleGroupLocalServiceUtil
						.getThtcNoiDungHoSoByVehicleGroupId(vehicleGroupId);
				if (tthcNoiDungHoSo != null) {
					String realPath = ReportUtils
							.getTemplateReportFilePath(request);
					String actionExport = ReportBusinessUtils.actionExport(
							realPath, tthcNoiDungHoSo.getId());
					object.put("result", "true");
					object.put("thongSoKiThuat", actionExport);
					object.put("taiLieuThuNghiem", "default.pdf");
					object.put("taiLieuKhiThai", "default.pdf");
				} else {
					object.put("result", "false");
					object.put("thongSoKiThuat", "default.pdf");
					object.put("taiLieuThuNghiem", "default.pdf");
					object.put("taiLieuKhiThai", "default.pdf");
				}
			} catch (Exception e) {
				object.put("result", "false");
				object.put("thongSoKiThuat", "default.pdf");
				object.put("taiLieuThuNghiem", "default.pdf");
				object.put("taiLieuKhiThai", "default.pdf");
			}
			PrintWriter out = response.getWriter();
			out.print(object.toString());
			log.debug("==callAjaxHienThiBaoCaoReport==finish---"
					+ object.toString());
		} catch (Exception e) {
			log.error(e);
		}
	}

	private void callAjaxHienThiBaoCaoBienBanReport(ResourceRequest request,
			ResourceResponse response) {
		try {
			JSONObject object = null;
			long idBienBanKiemTra = ParamUtil.getLong(request,
					"idBienBanKiemTra");
			long idThongSoKiThuat = ParamUtil.getLong(request,
					"idThongSoKiThuat");
			log.info("----------idBienBanKiemTra-----------idBienBanKiemTra--"
					+ idBienBanKiemTra);
			log.info("----------idBienBanKiemTra-----------idBienBanKiemTra--"
					+ idBienBanKiemTra);
			object = JSONFactoryUtil.createJSONObject();
			// xay ra loi thi hien gia pdf default
			if (idBienBanKiemTra > 0) {
				String realPathBienBanKiemTra = ReportUtils
						.getTemplateReportFilePath(request);
				String actionExportBienBanKiemTra = ReportBusinessUtils
						.actionExport(realPathBienBanKiemTra, idBienBanKiemTra);
				object.put("bienBanKiemTra", actionExportBienBanKiemTra);
			} else {
				object.put("bienBanKiemTra", "default.pdf");
			}
			if (idThongSoKiThuat > 0) {
				String realPathThongSoKiThuat = ReportUtils
						.getTemplateReportFilePath(request);
				String actionExportThongSoKiThuat = ReportBusinessUtils
						.actionExport(realPathThongSoKiThuat, idThongSoKiThuat);
				object.put("thongSoKiThuat", actionExportThongSoKiThuat);
			} else {
				object.put("thongSoKiThuat", "default.pdf");
			}
			object.put("taiLieuThuNghiem", "default.pdf");
			object.put("taiLieuKhiThai", "default.pdf");
			object.put("taiLieuAnToan", "default.pdf");
			object.put("taiLieuKhac", "default.pdf");

			PrintWriter out = response.getWriter();
			out.print(object.toString());
			log.debug("==callAjaxHienThiBaoCaoBienBanReport==finish---"
					+ object.toString());
		} catch (Exception e) {
			log.error(e);
		}
	}

	private void toNghiepVuKetQuaKiemTra(ResourceRequest request,
			ResourceResponse response) {
		try {
			long inspectionRecordId = ParamUtil.getLong(request, "dataId");
			InspectionRecord inspectionRecord = null;
			VehicleRecord vehicleRecord = null;
			VehicleGroup vehicleGroup = null;
			inspectionRecord = InspectionRecordLocalServiceUtil
					.fetchInspectionRecord(inspectionRecordId);
			vehicleGroup = VehicleRecordLocalServiceUtil
					.findVehicleGroupByInspectionRecordId(inspectionRecordId);

			log.info("----dataId---" + inspectionRecordId);

			// Process Jason feed
			JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();

			JSONArray _vehicleGroup = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _dkvKetQua = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _dkvNgayKt = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _dkvNguoiKt = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _dkvNoiDung = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();

			JSONArray _dtKetQua = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _dtNgayKt = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _dtNguoiKt = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _dtNoiDung = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();

			JSONArray _cvKetQua = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _cvNgayKt = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _cvNguoiKt = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _cvNoiDung = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();

			JSONArray _ttcSoBienBanKt = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _ttcNgayKt = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _ttcDiaDiemKt = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _ttcLanKt = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _ttcSoThamChieu = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();

			if (vehicleGroup != null) {
				_vehicleGroup.put(vehicleGroup.getId());
			}
			_dkvKetQua
					.put("ÃƒÆ’Ã¢â‚¬Å¾ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚ÂºÃƒâ€šÃ‚Â¡t");
			_dkvNgayKt.put("01/01/2015");
			_dkvNguoiKt.put("TÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Âªn DKV");
			_dkvNoiDung
					.put("NÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚Â»ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢i dung DKV");

			_dtKetQua
					.put("ÃƒÆ’Ã¢â‚¬Å¾ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚ÂºÃƒâ€šÃ‚Â¡t");
			_dtNgayKt.put(" 01/01/2015");
			_dtNguoiKt
					.put(" TÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Âªn ÃƒÆ’Ã¢â‚¬Å¾ÃƒÂ¢Ã¢â€šÂ¬Ã‹Å“ÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚Â»ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢i trÃƒÆ’Ã¢â‚¬Â Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚Â»Ãƒâ€¦Ã‚Â¸ng");
			_dtNoiDung
					.put(" NÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚Â»ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢i dung ÃƒÆ’Ã¢â‚¬Å¾ÃƒÂ¢Ã¢â€šÂ¬Ã‹Å“ÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚Â»ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢i trÃƒÆ’Ã¢â‚¬Â Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚Â»Ãƒâ€¦Ã‚Â¸ng");

			_cvKetQua
					.put("ÃƒÆ’Ã¢â‚¬Å¾ÃƒÂ¯Ã‚Â¿Ã‚Â½ÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚ÂºÃƒâ€šÃ‚Â¡t");
			_cvNgayKt.put(" 01/01/2015");
			_cvNguoiKt
					.put(" TÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Âªn chuyÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Âªn viÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Âªn tÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚Â»ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¢ nghiÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚Â»ÃƒÂ¢Ã¢â€šÂ¬Ã‚Â¡p vÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚Â»Ãƒâ€šÃ‚Â¥");
			_cvNoiDung
					.put(" NÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚Â»ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢i dung ÃƒÆ’Ã¢â‚¬Å¾ÃƒÂ¢Ã¢â€šÂ¬Ã‹Å“ÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚Â»ÃƒÂ¢Ã¢â‚¬Å¾Ã‚Â¢i trÃƒÆ’Ã¢â‚¬Â Ãƒâ€šÃ‚Â°ÃƒÆ’Ã‚Â¡Ãƒâ€šÃ‚Â»Ãƒâ€¦Ã‚Â¸ng");

			_ttcSoBienBanKt.put(inspectionRecord.getInspectionRecordNo());
			_ttcNgayKt.put(inspectionRecord.getInspectionRecordDate()
					.toString());
			_ttcDiaDiemKt.put(inspectionRecord.getInspectionSite());
			_ttcLanKt.put(" ...................");

			if (vehicleGroup != null) {
				_ttcSoThamChieu.put(vehicleGroup.getReferenceCertificateNo());
			}

			jsonFeed.put("vehicleGroupCmp", _vehicleGroup);
			jsonFeed.put("dkvKetQua", _dkvKetQua);
			jsonFeed.put("dkvNgayKt", _dkvNgayKt);
			jsonFeed.put("dkvNguoiKt", _dkvNguoiKt);
			jsonFeed.put("dkvNoiDung", _dkvNoiDung);

			jsonFeed.put("dtKetQua", _dtKetQua);
			jsonFeed.put("dtNgayKt", _dtNgayKt);
			jsonFeed.put("dtNguoiKt", _dtNguoiKt);
			jsonFeed.put("dtNoiDung", _dtNoiDung);

			jsonFeed.put("cvKetQua", _cvKetQua);
			jsonFeed.put("cvNgayKt", _cvNgayKt);
			jsonFeed.put("cvNguoiKt", _cvNguoiKt);
			jsonFeed.put("cvNoiDung", _cvNoiDung);

			jsonFeed.put("ttcSoBienBanKt", _ttcSoBienBanKt);
			jsonFeed.put("ttcNgayKt", _ttcNgayKt);
			jsonFeed.put("ttcDiaDiemKt", _ttcDiaDiemKt);
			jsonFeed.put("ttcLanKt", _ttcLanKt);
			jsonFeed.put("ttcSoThamChieu", _ttcSoThamChieu);

			jsonFeed.put("urlFile", "/DangKiemApp-portlet/export/"
					+ ReportConstant.TEN_FILE_DEFAULT);

			// chuan bi bang chung
			log.info("----chuan bi bang chung---");
			List<VehicleRecord> allVehicleRecord = null;
			if (inspectionRecordId > -1) {

				allVehicleRecord = VehicleRecordLocalServiceUtil
						.findByInspectionRecordId(inspectionRecordId);
				log.info("----So ban ghi VehicleRecord---: "
						+ allVehicleRecord.size());
			}
			if (allVehicleRecord != null && allVehicleRecord.size() > 0) {
				log.info("----vao ---:  + allVehicleRecord");

				JSONArray _dsptktNhanHieuSoLoai = JSONFactoryUtil
						.getJSONFactory().createJSONArray();
				JSONArray _dsptktSoKhung = JSONFactoryUtil.getJSONFactory()
						.createJSONArray();
				JSONArray _dsptktDongCo = JSONFactoryUtil.getJSONFactory()
						.createJSONArray();
				JSONArray _dsptTinhTrang = JSONFactoryUtil.getJSONFactory()
						.createJSONArray();
				JSONArray _dsptSoThamChieu = JSONFactoryUtil.getJSONFactory()
						.createJSONArray();
				JSONArray _id_dspt = JSONFactoryUtil.getJSONFactory()
						.createJSONArray();

				vehicleGroup = null;
				vehicleGroup = VehicleGroupLocalServiceUtil
						.fetchVehicleGroup(allVehicleRecord.get(0)
								.getVehicleGroupId());
				String nhanHieuSoLoai = "<b>"
						+ ReportUtils.getTenDmDataByCode(vehicleGroup
								.getTradeMark()) + "</b>" + "<br>"
						+ vehicleGroup.getCommercialName();
				for (int i = 0; i < allVehicleRecord.size(); i++) {
					_id_dspt.put(i + 1);
					vehicleRecord = allVehicleRecord.get(i);

					_dsptktNhanHieuSoLoai.put(nhanHieuSoLoai);
					_dsptktSoKhung.put(vehicleRecord.getChassisNumber());
					_dsptktDongCo.put(vehicleRecord.getEngineNumber());

					if (vehicleRecord
							.getVehicleEngineStatus()
							.trim()
							.compareToIgnoreCase(
									Constants.Vehicle_Engine_Status_0) == 0) {
						_dsptTinhTrang.put(DKConfigurationManager.getStrProp(
								"Vehicle-Engine-Status-0",
								vehicleRecord.getVehicleEngineStatus()));
					} else if (vehicleRecord
							.getVehicleEngineStatus()
							.trim()
							.compareToIgnoreCase(
									Constants.Vehicle_Engine_Status_1) == 0) {
						_dsptTinhTrang.put(DKConfigurationManager.getStrProp(
								"Vehicle-Engine-Status-1",
								vehicleRecord.getVehicleEngineStatus()));
					} else {
						_dsptTinhTrang.put(DKConfigurationManager.getStrProp(
								"Vehicle-Engine-Status-2",
								vehicleRecord.getVehicleEngineStatus()));
					}

					if (vehicleGroup != null) {
						_dsptSoThamChieu.put(vehicleGroup
								.getReferenceCertificateNo());
					}
					log.info("----so khung---: "
							+ vehicleRecord.getChassisNumber());
					log.info("----so dong co---: "
							+ vehicleRecord.getEngineNumber());

				}

				jsonFeed.put("dsptktNhanHieuSoLoai", _dsptktNhanHieuSoLoai);
				jsonFeed.put("dsptktSoKhung", _dsptktSoKhung);
				jsonFeed.put("dsptktDongCo", _dsptktDongCo);
				jsonFeed.put("dsptTinhTrang", _dsptTinhTrang);
				jsonFeed.put("dsptSoThamChieu", _dsptSoThamChieu);
				jsonFeed.put("id_dspt", _id_dspt);

			}

			// Thong tin kiem tra

			log.info("----Thong tin kiem tra---");
			List<InspectionRecordSpec> allInspectionRecordSpecs = null;
			allInspectionRecordSpecs = InspectionRecordSpecLocalServiceUtil
					.findByInspectionRecordId(inspectionRecordId);
			InspectionRecordSpec inspectionRecordSpec = null;
			VehicleSpecification vehicleSpecification = null;

			JSONArray _ttktName = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _ttktCode = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _ttktGtDangKy = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _ttktGtKiemTra = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _ttktThaoTac = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _ttktColor = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _ttktDat = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _ttktKhongDat = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _ttktSuaDoi = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _ttktKhongApDung = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray _id_ttkt = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			int dat = 0;
			int khongDat = 0;
			int suaDoi = 0;
			int khongApDung = 0;

			List<VehicleSpecification> allVehicleSpecification = VehicleSpecificationLocalServiceUtil
					.findByVehicleGroupId(vehicleGroup.getId());
			if (allInspectionRecordSpecs != null
					&& allInspectionRecordSpecs.size() > 0) {
				for (int i = 0; i < allInspectionRecordSpecs.size(); i++) {
					_id_ttkt.put(i + 1);
					inspectionRecordSpec = allInspectionRecordSpecs.get(i);
					if (inspectionRecordSpec.getEvaluationResult() == 2) {
						khongDat = khongDat + 1;
					} else if (inspectionRecordSpec.getEvaluationResult() == 1) {
						dat = dat + 1;
					} else if (inspectionRecordSpec.getEvaluationResult() == 3) {
						suaDoi = suaDoi + 1;
					} else if (inspectionRecordSpec.getEvaluationResult() == 4) {
						khongApDung = khongApDung + 1;
					}

					vehicleSpecification = QuanLyHoSoUtils
							.getVehicleSpecificationValue(
									allVehicleSpecification,
									inspectionRecordSpec.getSpecificationCode());
					if (vehicleSpecification != null) {
						_ttktName.put(vehicleSpecification
								.getSpecificationName());
						_ttktCode.put(vehicleSpecification
								.getSpecificationCode());
						_ttktGtDangKy.put(vehicleSpecification
								.getSpecificationValue());
					}
					_ttktGtKiemTra.put(inspectionRecordSpec
							.getSpecificationValue());
					_ttktThaoTac
							.put((inspectionRecordSpec.getEvaluationResult() == 1) ? Constants.KET_QUA_DAT
									: ((inspectionRecordSpec
											.getEvaluationResult() == 2) ? Constants.KET_QUA_KHONG_DAT
											: ((inspectionRecordSpec
													.getEvaluationResult() == 3) ? Constants.KET_QUA_SUA_DOI
													: ((inspectionRecordSpec
															.getEvaluationResult() == 4) ? Constants.KET_QUA_KHONG_AP_DUNG
															: ""))));
					_ttktColor
							.put((inspectionRecordSpec.getEvaluationResult() == 1) ? "white"
									: ((inspectionRecordSpec
											.getEvaluationResult() == 2) ? "red"
											: ((inspectionRecordSpec
													.getEvaluationResult() == 3) ? "yellow"
													: ((inspectionRecordSpec
															.getEvaluationResult() == 4) ? "green"
															: ""))));
					log.info("----_ttktName" + "_" + i + "---"
							+ vehicleSpecification.getSpecificationName());
					log.info("----_ttktGtDangKy" + "_" + i + "---"
							+ vehicleSpecification.getSpecificationValue());
					log.info("----_ttktGtKiemTra" + "_" + i + "---"
							+ inspectionRecordSpec.getSpecificationValue());
					log.info("----_ttktThaoTac"
							+ "_"
							+ i
							+ "---"
							+ ((inspectionRecordSpec.getEvaluationResult() == 0) ? "Khong dat"
									: ((inspectionRecordSpec
											.getEvaluationResult() == 1) ? "Dat "
											: ((inspectionRecordSpec
													.getEvaluationResult() == 2) ? "Sua doi"
													: ""))));
				}
			}
			log.info("----khongDat---" + khongDat);

			_ttktDat.put(dat);
			_ttktKhongDat.put(khongDat);
			_ttktSuaDoi.put(suaDoi);
			_ttktKhongApDung.put(khongApDung);
			jsonFeed.put("ttktDat", _ttktDat);
			jsonFeed.put("ttktKhongDat", _ttktKhongDat);
			jsonFeed.put("ttktSuaDoi", _ttktSuaDoi);
			jsonFeed.put("ttktKhongApDung", _ttktKhongApDung);

			jsonFeed.put("ttktName", _ttktName);
			jsonFeed.put("ttktCode", _ttktCode);
			jsonFeed.put("ttktGtDangKy", _ttktGtDangKy);
			jsonFeed.put("ttktGtKiemTra", _ttktGtKiemTra);
			jsonFeed.put("ttktThaoTac", _ttktThaoTac);
			jsonFeed.put("ttktColor", _ttktColor);

			jsonFeed.put("id_ttkt", _id_ttkt);

			PrintWriter out = response.getWriter();
			out.print(jsonFeed.toString());
			log.info("----finish---");
		} catch (Exception e) {
			log.error(e);
		}

	}

	private void findDsKiemTraChatLuongATKTVanBanVMTByVehicleGroupId(
			ResourceRequest request, ResourceResponse response) {
		try {
			long vehiclegroupid = ParamUtil.getLong(request, "vehicleGroupId");
			String vehicleClass = ParamUtil.getString(request, "vehicleClass");
			long idHoSoThuTuc = ParamUtil.getLong(request, "idHoSoThuTuc");
			long idPhieuXyLyPhu = ParamUtil.getLong(request, "idPhieuXyLyPhu");

			VehicleGroupInitial vehicleGroup = new VehicleGroupInitialImpl();
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
					.findByDossierId(idHoSoThuTuc);

			ConfirmedInspection confirmedInspection = null;
			confirmedInspection = ConfirmedInspectionLocalServiceUtil
					.findByPhieuXuLyPhuId(idPhieuXyLyPhu);
			if (confirmedInspection == null) {
				confirmedInspection = new ConfirmedInspectionImpl();
			}
			CustomsDeclaration customsDeclaration = null;
			try {
				customsDeclaration = CustomsDeclarationLocalServiceUtil
						.getCustomsDeclaration(confirmedInspection
								.getCustomsDeclarationId());
			} catch (Exception e) {
				customsDeclaration = null;
			}

			try {
				vehicleGroup = VehicleGroupInitialLocalServiceUtil
						.fetchVehicleGroupInitial(vehiclegroupid);
			} catch (Exception e) {
			}

			log.info("==findDsKiemTraChatLuongATKTVanBanVMTByVehicleGroupId==vehicleGroupId=="
					+ vehiclegroupid);
			log.info("==findDsKiemTraChatLuongATKTVanBanVMTByVehicleGroupId==vehicleClass===="
					+ vehicleClass);

			List<VehicleSpecification> lstVehicleSpecification = VehicleSpecificationLocalServiceUtil
					.findByVehicleGroupId(vehiclegroupid);

			JSONArray arrayRoot = JSONFactoryUtil.createJSONArray();

			JSONArray arrayVehicleSpecification = JSONFactoryUtil
					.createJSONArray();
			JSONObject object = null;

			for (VehicleSpecification temp : lstVehicleSpecification) {
				// object =
				// JSONFactoryUtil.createJSONObject("VehicleSpecification");
				object = JSONFactoryUtil.createJSONObject();
				object.put("id", temp.getId());
				object.put("vehicleGroupId", temp.getVehicleGroupId());
				object.put("specificationVersion",
						temp.getSpecificationVersion());
				object.put("specificationSourceCode",
						temp.getSpecificationSourceCode());
				object.put("specificationCode", temp.getSpecificationCode());
				object.put("specificationName", temp.getSpecificationName());
				object.put("specificationValue", temp.getSpecificationValue());
				object.put("safetyTestReportId", temp.getSafetyTestReportId());
				object.put("inspectionRecordId", temp.getInspectionRecordId());
				object.put("specificResult", temp.getSpecificResult());
				object.put(
						"hienThiSpecificationValue",
						ReportUtils.getNameForDataItem(
								temp.getSpecificationName(),
								temp.getSpecificationValue()));

				arrayVehicleSpecification.put(object);
			}

			// type 2
			JSONArray arraykiemTraChatLuongAnToanKt = JSONFactoryUtil
					.createJSONArray();
			List<InspectionCommonStatus> lstkiemTraChatLuongAnToanKt = InspectionCommonStatusLocalServiceUtil
					.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(
							vehicleClass, 2, -1);
			if (lstkiemTraChatLuongAnToanKt != null
					&& lstkiemTraChatLuongAnToanKt.size() > 0) {
				JSONObject objKiemTraChatLuongAnToanKt = null;
				for (InspectionCommonStatus item : lstkiemTraChatLuongAnToanKt) {
					objKiemTraChatLuongAnToanKt = JSONFactoryUtil
							.createJSONObject();

					objKiemTraChatLuongAnToanKt.put("id", item.getId());
					objKiemTraChatLuongAnToanKt.put("vehicleclass",
							item.getVehicleClass());
					objKiemTraChatLuongAnToanKt.put("sequenceno",
							item.getSequenceNo());
					objKiemTraChatLuongAnToanKt.put("type", item.getType());
					objKiemTraChatLuongAnToanKt.put("groupname",
							item.getGroupName());
					objKiemTraChatLuongAnToanKt.put("itemname",
							item.getItemName());
					objKiemTraChatLuongAnToanKt.put("commonstatus",
							item.getCommonStatus());
					objKiemTraChatLuongAnToanKt.put("inspectionrecordid",
							item.getInspectionRecordId());
					arraykiemTraChatLuongAnToanKt
							.put(objKiemTraChatLuongAnToanKt);
				}
			}

			// type 4
			JSONArray arrayKetCauKhiThai = JSONFactoryUtil.createJSONArray();
			List<InspectionCommonStatus> lstKetCauKhiThai = InspectionCommonStatusLocalServiceUtil
					.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(
							vehicleClass, 4, -1);
			if (lstKetCauKhiThai != null && lstKetCauKhiThai.size() > 0) {
				JSONObject objKetCauKhiThai = null;
				for (InspectionCommonStatus item : lstKetCauKhiThai) {
					objKetCauKhiThai = JSONFactoryUtil.createJSONObject();

					objKetCauKhiThai.put("id", item.getId());
					objKetCauKhiThai
							.put("vehicleclass", item.getVehicleClass());
					objKetCauKhiThai.put("sequenceno", item.getSequenceNo());
					objKetCauKhiThai.put("type", item.getType());
					objKetCauKhiThai.put("groupname", item.getGroupName());
					objKetCauKhiThai.put("itemname", item.getItemName());
					objKetCauKhiThai
							.put("commonstatus", item.getCommonStatus());
					objKetCauKhiThai.put("inspectionrecordid",
							item.getInspectionRecordId());
					arrayKetCauKhiThai.put(objKetCauKhiThai);
				}
			}

			// type 1 - THONG TIN CHUNG
			JSONArray arrayThongTinChung = JSONFactoryUtil.createJSONArray();
			List<InspectionCommonStatus> lstThongTinChung = InspectionCommonStatusLocalServiceUtil
					.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(
							vehicleClass, 1, -1);
			if (lstThongTinChung != null && lstThongTinChung.size() > 0) {
				JSONObject objThongTinChung = null;
				for (InspectionCommonStatus item : lstThongTinChung) {
					objThongTinChung = JSONFactoryUtil.createJSONObject();

					objThongTinChung.put("id", item.getId());
					objThongTinChung
							.put("vehicleclass", item.getVehicleClass());
					objThongTinChung.put("sequenceno", item.getSequenceNo());
					objThongTinChung.put("type", item.getType());
					objThongTinChung.put("allowedit", item.getAllowEdit());
					objThongTinChung.put("groupname", item.getGroupName());
					objThongTinChung
							.put("commonstatus", item.getCommonStatus());
					objThongTinChung.put("commoncode", item.getCommonCode());
					objThongTinChung.put("inspectionrecordid",
							item.getInspectionRecordId());
					objThongTinChung.put("itemname", BienBanKiemTraBusiness
							.getValueThongTinChung(vehicleGroup,
									registeredInspection, customsDeclaration,
									item.getCommonCode()));
					objThongTinChung.put("itemcode", BienBanKiemTraBusiness
							.getCodeThongTinChung(vehicleGroup,
									registeredInspection, customsDeclaration,
									item.getCommonCode()));
					objThongTinChung.put("itemgroupid", BienBanKiemTraBusiness
							.isDanhMuc(item.getCommonCode()));
					arrayThongTinChung.put(objThongTinChung);
				}
			}

			arrayRoot.put(arrayVehicleSpecification);
			arrayRoot.put(arraykiemTraChatLuongAnToanKt);
			arrayRoot.put(arrayKetCauKhiThai);
			arrayRoot.put(arrayThongTinChung);

			PrintWriter out = response.getWriter();
			out.print(arrayRoot.toString());
			log.info("==findDsKiemTraChatLuongATKTVanBanVMTByVehicleGroupId==finish---"
					+ arrayVehicleSpecification.length());
		} catch (Exception e) {
			log.error(e);
		}

	}

	private void getGiaTriTheoThamChieu(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException {
		
		String giaTriThamChieu = ParamUtil.getString(resourceRequest,
				"giaTriThamChieu");

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		JSONArray thamChieuJson = JSONFactoryUtil.getJSONFactory()
				.createJSONArray();

		log.debug("---QuanLyHoSoAction.giaTriThamChieu=====" + giaTriThamChieu);

		CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
				.findByCertificateNumber(giaTriThamChieu);

		boolean result = false;

		if (certificateRecord != null
				&& certificateRecord.getStampStatus() != Constants.AN_CHI_HUY) {
			try {
				// Thong tin chung
				VehicleGroup vehicleGroup = null;

				List<VehicleRecord> listVehicleRecords = VehicleRecordLocalServiceUtil
						.findByCertificateRecordId(certificateRecord.getId());

				if (listVehicleRecords != null && listVehicleRecords.size() > 0) {

					vehicleGroup = VehicleGroupLocalServiceUtil
							.fetchVehicleGroup(listVehicleRecords.get(0)
									.getVehicleGroupId());

					List<ProductionCountry> listProductionCountries = ProductionCountryLocalServiceUtil
							.findByVehicleGroupId(vehicleGroup.getId());

					JSONObject objTTC_1_07 = JSONFactoryUtil.createJSONObject();
					objTTC_1_07.put("referenceCode", "TTC_1_07");
					objTTC_1_07.put("code",
							vehicleGroup.getSafetytestreportNo());
					objTTC_1_07.put("value",
							vehicleGroup.getSafetytestreportNo());

					JSONObject objTTC_1_08 = JSONFactoryUtil.createJSONObject();
					objTTC_1_08.put("referenceCode", "TTC_1_08");
					objTTC_1_08.put("code",
							vehicleGroup.getEmissiontestreportNo());
					objTTC_1_08.put("value",
							vehicleGroup.getEmissiontestreportNo());

					JSONObject objTTC_1_09 = JSONFactoryUtil.createJSONObject();
					objTTC_1_09.put("referenceCode", "TTC_1_09");
					objTTC_1_09.put("code", vehicleGroup.getCopreportNo());
					objTTC_1_09.put("value", vehicleGroup.getCopreportNo());

					JSONObject objTTC_1_10 = JSONFactoryUtil.createJSONObject();
					objTTC_1_10.put("referenceCode", "TTC_1_10");
					objTTC_1_10.put("code", vehicleGroup.getVehicleType());
					DmDataItem dmDataItem10 = DmDataItemLocalServiceUtil
							.findDataItemByDataGroupIdAndItemCode(
									ReportConstant.VEHICLE_TYPE,
									vehicleGroup.getVehicleType());
					if (dmDataItem10 != null) {
						objTTC_1_10.put("value", dmDataItem10.getName());
					} else {
						objTTC_1_10.put("value", vehicleGroup.getVehicleType());
					}

					JSONObject objTTC_1_11 = JSONFactoryUtil.createJSONObject();
					objTTC_1_11.put("referenceCode", "TTC_1_11");
					objTTC_1_11.put("code", vehicleGroup.getTradeMark());
					DmDataItem dmDataItem11 = DmDataItemLocalServiceUtil
							.findDataItemByDataGroupIdAndItemCode(
									ReportConstant.TRADE_MARK,
									vehicleGroup.getTradeMark());
					if (dmDataItem11 != null) {
						objTTC_1_11.put("value", dmDataItem11.getName());
					} else {
						objTTC_1_11.put("value", vehicleGroup.getTradeMark());
					}

					JSONObject objTTC_1_12 = JSONFactoryUtil.createJSONObject();
					objTTC_1_12.put("referenceCode", "TTC_1_12");
					objTTC_1_12.put("code", vehicleGroup.getCommercialName());
					objTTC_1_12.put("value", vehicleGroup.getCommercialName());

					JSONObject objTTC_1_13 = JSONFactoryUtil.createJSONObject();
					objTTC_1_13.put("referenceCode", "TTC_1_13");
					objTTC_1_13.put("code", vehicleGroup.getModelCode());
					objTTC_1_13.put("value", vehicleGroup.getModelCode());

					JSONObject objTTC_1_15 = JSONFactoryUtil.createJSONObject();
					objTTC_1_15.put("referenceCode", "TTC_1_15");
					objTTC_1_15.put("code", vehicleGroup.getProductionPlant());
					objTTC_1_15.put("value", vehicleGroup.getProductionPlant());

					JSONObject objTTC_1_16 = JSONFactoryUtil.createJSONObject();
					objTTC_1_16.put("referenceCode", "TTC_1_16");
					objTTC_1_16.put("code",
							vehicleGroup.getAddressOfProductionPlant());
					objTTC_1_16.put("value",
							vehicleGroup.getAddressOfProductionPlant());

					JSONObject objTTC_1_17 = JSONFactoryUtil.createJSONObject();
					objTTC_1_17.put("referenceCode", "TTC_1_17");
					objTTC_1_17.put("code", vehicleGroup.getEmissionStandard());
					objTTC_1_17
							.put("value", vehicleGroup.getEmissionStandard());

					JSONObject objTTC_1_14 = JSONFactoryUtil.createJSONObject();

					StringBuilder sbCode = new StringBuilder();
					StringBuilder sbValue = new StringBuilder();

					boolean firstCheck = true;
					DmDataItem dataItemState = null;
					for (ProductionCountry item : listProductionCountries) {
						dataItemState = DmDataItemLocalServiceUtil
								.getByDataGroupCodeNameAndDataItemCode0(
										DanhMucKey.State, item.getCountryCode()
												.trim());
						if (dataItemState != null) {
							if (firstCheck) {
								sbValue.append(dataItemState.getName());
								sbCode.append(item.getCountryCode());
								firstCheck = false;
							} else {
								sbValue.append(",");
								sbValue.append(dataItemState.getName());
								sbCode.append(",");
								sbCode.append(item.getCountryCode());
							}
						}
					}

					objTTC_1_14.put("referenceCode", "TTC_1_14");
					objTTC_1_14.put("code", sbCode.toString());
					objTTC_1_14.put("value", sbValue.toString());

					thamChieuJson.put(objTTC_1_07);
					thamChieuJson.put(objTTC_1_08);
					thamChieuJson.put(objTTC_1_09);
					thamChieuJson.put(objTTC_1_10);
					thamChieuJson.put(objTTC_1_11);
					thamChieuJson.put(objTTC_1_12);
					thamChieuJson.put(objTTC_1_13);
					thamChieuJson.put(objTTC_1_14);
					thamChieuJson.put(objTTC_1_15);
					thamChieuJson.put(objTTC_1_16);
					thamChieuJson.put(objTTC_1_17);
				}

				// Ket cau va thong so ky thuat xe
				List<CertificateRecordSpec> listCertificateRecordSpec = CertificateRecordSpecLocalServiceUtil
						.findByCertificateRecordId(certificateRecord.getId());

				for (CertificateRecordSpec certificateRecordSpec : listCertificateRecordSpec) {
					JSONObject certificateRecordSpecObj = JSONFactoryUtil
							.createJSONObject();

					List<DmDataItem> dmDataItems = null;

					String value = "";
					try {
						dmDataItems = DmDataItemLocalServiceUtil
								.findBySpecificationCodeAndspecificationvalue(
										certificateRecordSpec
												.getSpecificationCode(),
										certificateRecordSpec
												.getSpecificationValue(), null);
					} catch (Exception e) {
						log.error(e);
					}
					if (dmDataItems != null && dmDataItems.size() > 0) {
						value = dmDataItems.get(0).getName().trim();
					} else {
						value = certificateRecordSpec.getSpecificationValue();
					}

					certificateRecordSpecObj.put("referenceCode",
							certificateRecordSpec.getSpecificationCode());
					certificateRecordSpecObj.put("code",
							certificateRecordSpec.getSpecificationValue());
					certificateRecordSpecObj.put("value", value);

					thamChieuJson.put(certificateRecordSpecObj);
				}

				result = true;
			} catch (SystemException e) {
				log.error(e);
			}
		}

		// jsonObject.put("certificateRecordSpecs", certificateRecordSpecs);
		jsonObject.put("thamChieuJson", thamChieuJson);
		jsonObject.put("result", result);

		PrintWriter out = resourceResponse.getWriter();
		out.print(jsonObject.toString());
	}

	/**
	 * Kiem tra dieu kien
	 * <p>
	 * 1. Neu co bien ban luu tam thi khong gui YCBS va HKT
	 * <p>
	 * 2. Neu con xe chua kiem tra thi khong gui YCBS va HKT
	 * 
	 * @param resourceRequest
	 * @param resourceResponse
	 * @throws IOException
	 * @throws SystemException
	 */
	private void validateYeuCauBoSungAndHoanKiemTra(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException {

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		boolean valid = true;
		String message = "";

		long confirmedInspectionId = ParamUtil.getLong(resourceRequest,
				Constants.ID_CONFIRMED_INSPECTION);

		try {
			ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
					.fetchConfirmedInspection(confirmedInspectionId);

			List<InspectionRecord> lstInspectionRecords = InspectionRecordLocalServiceUtil
					.findByBienBanLuuTam(confirmedInspection.getId());

			// KT Neu co bien ban luu tam
			if (lstInspectionRecords != null && lstInspectionRecords.size() > 0) {
				valid = false;
				message = "CON_BIEN_BAN_LUU_TAM";
			}

			if (valid) {
				// KT Neu con xe chua kiem tra

				List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil
						.findByConfirmedInspectionId(confirmedInspectionId);
				valid = false;
				for (VehicleRecord vehicleRecord : vehicleRecords) {
					if (vehicleRecord.getInspectionRecordId() == 0) {
						valid = true;
						// message = "CON_XE_CHUA_KIEM_TRA";
						break;
					}
				}
				if (!valid) {
					message = "CON_XE_CHUA_KIEM_TRA";
				}

			}
		} catch (Exception e) {
			log.error(e);
			valid = false;
		}

		jsonObject.put("valid", valid);
		jsonObject.put("message", message);

		PrintWriter out = resourceResponse.getWriter();
		out.print(jsonObject.toString());
	}

	/** Tiep nhan ho so messageType = 90, functionType = 20 */
	public void tiepNhanHoSo(ActionRequest resourceRequest,
			ActionResponse httpReq) {

		String thanhPhanXuLy = ParamUtil.getString(resourceRequest,
				Constants.THANH_PHAN_XU_LY).trim();
		long hoSoThuTucId = ParamUtil.getLong(resourceRequest,
				Constants.ID_HO_SO_THU_TUC);
		String dieuKienChuyenDich = ParamUtil.getString(resourceRequest,
				Constants.DIEU_KIEN_CHUYEN_DICH);
		String registeredNumber = ParamUtil.getString(resourceRequest,
				"registeredNumber");

		log.info("hoSoThuTucId===" + hoSoThuTucId + "===dieuKienChuyenDich==="
				+ dieuKienChuyenDich);
		log.info("==thanhPhanXuLy==" + thanhPhanXuLy + "===registeredNumber==="
				+ registeredNumber);
		log.info("PortalUtil.getUserId(resourceRequest)  "
				+ PortalUtil.getUserId(resourceRequest));
		Boolean kq = nghiepVuBusiness.xemXetTiepNhanHoSo(hoSoThuTucId,
				dieuKienChuyenDich, PortalUtil.getUserId(resourceRequest),
				registeredNumber);
		log.info("kq=" + kq + "=UserId=="
				+ PortalUtil.getUserId(resourceRequest));

		httpReq.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void tiepNhan(ActionRequest resourceRequest, ActionResponse httpReq) {

		String thanhPhanXuLy = ParamUtil.getString(resourceRequest,
				Constants.THANH_PHAN_XU_LY).trim();
		long hoSoThuTucId = ParamUtil.getLong(resourceRequest,
				Constants.ID_HO_SO_THU_TUC);
		String dieuKienChuyenDich = ParamUtil.getString(resourceRequest,
				Constants.DIEU_KIEN_CHUYEN_DICH);
		String registeredNumber = ParamUtil.getString(resourceRequest,
				"registeredNumber");

		log.info("hoSoThuTucId===" + hoSoThuTucId + "===tiepNhan==="
				+ "==thanhPhanXuLy==" + thanhPhanXuLy);
		log.info(" tiepNhan HA MINH PortalUtil.getUserId(resourceRequest)  "
				+ PortalUtil.getUserId(resourceRequest));
		Boolean kq = nghiepVuBoSungBusiness.boSungHSDKKTSauHoan(hoSoThuTucId,
				PortalUtil.getUserId(resourceRequest));
		log.info("kq=" + kq + "=UserId=="
				+ PortalUtil.getUserId(resourceRequest));

		httpReq.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toNghiepVuSoanBanThaoChungChi(ActionRequest resourceRequest,
			ActionResponse httpReq) {

		log.info("--------------------vao toNghiepVuSoanBanThaoChungChi-----------------");
		String thanhPhanXuLy = ParamUtil.getString(resourceRequest,
				Constants.THANH_PHAN_XU_LY).trim();
		long hoSoThuTucId = ParamUtil.getLong(resourceRequest,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(resourceRequest,
				Constants.ID_PHIEU_XU_LY_PHU);
		long inspectionRecordId = ParamUtil.getLong(resourceRequest,
				Constants.ID_INSPECTION_RECORD);
		long certificateType = ParamUtil.getLong(resourceRequest,
				Constants.CERTIFICATE_TYPE);
		String dieuKienChuyenDich = ParamUtil.getString(resourceRequest,
				Constants.DIEU_KIEN_CHUYEN_DICH);
		String registeredNumber = ParamUtil.getString(resourceRequest,
				Constants.REGISTERED_NUMBER);
		String ghiChuBanThao = ParamUtil.getString(resourceRequest,
				"ghiChuBanThao");

		log.info("-------Loai bao cao:  " + certificateType);
		log.info("------ghiChuBanThao:  " + ghiChuBanThao);

		GcnChatLuongDongCoMotoXeMay gcnChatLuongModel = GcnChatLuongDongCoMotoXeMay
				.getModelByInspectionRecordId(hoSoThuTucId, inspectionRecordId);
		if (certificateType == 0) {
			certificateType = 1;
		}
		DraftCertificate draftCertificate = gcnChatLuongModel
				.getDraftCertificate();
		draftCertificate.setCertificateType(certificateType);
		draftCertificate.setRemarks(ghiChuBanThao);
		InspectionRecord inspectionRecord = gcnChatLuongModel
				.getInspectionRecord();
		log.info("hoSoThuTucId===" + hoSoThuTucId + "===dieuKienChuyenDich==="
				+ dieuKienChuyenDich);
		log.info("==thanhPhanXuLy==" + thanhPhanXuLy + "===registeredNumber==="
				+ registeredNumber);
		log.info("PortalUtil.getUserId(resourceRequest)  "
				+ PortalUtil.getUserId(resourceRequest));
		Boolean kq = nghiepVuBusiness.lapBanThaoChungChi(hoSoThuTucId,
				phieuXuLyPhuId, dieuKienChuyenDich,
				PortalUtil.getUserId(resourceRequest), registeredNumber,
				draftCertificate, inspectionRecord,
				gcnChatLuongModel.getAllDraftCertificateSpec(),
				gcnChatLuongModel.getAllVehicleRecord());
		log.info("kq=" + kq + "=UserId=="
				+ PortalUtil.getUserId(resourceRequest));

		httpReq.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toNghiepVuXacNhanChungChi(ActionRequest resourceRequest,
			ActionResponse httpReq) {

		log.info("--------------------vao toNghiepVuSoanBanThaoChungChi-----------------");
		String thanhPhanXuLy = ParamUtil.getString(resourceRequest,
				Constants.THANH_PHAN_XU_LY).trim();
		long hoSoThuTucId = ParamUtil.getLong(resourceRequest,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(resourceRequest,
				Constants.ID_PHIEU_XU_LY_PHU);
		long inspectionRecordId = ParamUtil.getLong(resourceRequest,
				Constants.ID_INSPECTION_RECORD);
		String dieuKienChuyenDich = ParamUtil.getString(resourceRequest,
				Constants.DIEU_KIEN_CHUYEN_DICH);
		String registeredNumber = ParamUtil.getString(resourceRequest,
				Constants.REGISTERED_NUMBER);
		String ghiChuBanThao = ParamUtil.getString(resourceRequest,
				"ghiChuBanThao");
		// GcnChatLuongDongCoMotoXeMay gcnChatLuongModel =
		// GcnChatLuongDongCoMotoXeMay.getModelByInspectionRecordId(hoSoThuTucId,
		// inspectionRecordId);
		DraftCertificate draftCertificate = DraftCertificateLocalServiceUtil
				.fetchByInspectionReportId(inspectionRecordId);
		System.out
				.println("========getModelByInspectionRecordId===draftCertificate======="
						+ draftCertificate);
		if (draftCertificate == null) {
			draftCertificate = new DraftCertificateImpl();
		}

		List<CertificateCircular> certificateCirculars = new ArrayList<CertificateCircular>();
		// du lieu de ra sau phai sua lai
		CertificateCircular certificateCircular = new CertificateCircularImpl();
		certificateCircular.setCircularDate(new Date());
		certificateCircular.setCircularNo("1233232");

		certificateCirculars.add(certificateCircular);
		Boolean kq = nghiepVuBusiness.xacNhanChungChi(hoSoThuTucId,
				phieuXuLyPhuId, dieuKienChuyenDich,
				PortalUtil.getUserId(resourceRequest), registeredNumber,
				draftCertificate, "editorName", certificateCirculars,
				"signName", "signTitle", "signPlace", ghiChuBanThao,
				resourceRequest);
		// log.info("kq=" + kq + "=UserId==" +
		// PortalUtil.getUserId(resourceRequest));

		httpReq.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toNghiepVu_XacNhanHuyChungChi(ActionRequest request,
			ActionResponse response) {
		try {
			long userId = PortalUtil.getUserId(request);
			long hoSoThuTucId = ParamUtil.getLong(request,
					Constants.ID_HO_SO_THU_TUC);
			long phieuXuLyPhuId = ParamUtil.getLong(request,
					Constants.ID_PHIEU_XU_LY_PHU);
			String thanhPhanXuLy = ParamUtil.getString(request,
					Constants.THANH_PHAN_XU_LY).trim();
			String listId = ParamUtil.getString(request, "listId");
			String lyDo = ParamUtil.getString(request, "xacNhanHuy");
			String[] arrListId = listId.split(",");

			List<CertificateRecord> lstCertificateRecord = new ArrayList<CertificateRecord>();

			for (int i = 0; i < arrListId.length; i++) {
				CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
						.fetchCertificateRecord(ConvertUtil
								.convertToLong(arrListId[i]));
				lstCertificateRecord.add(certificateRecord);
			}

			nghiepVuBusiness.xacNhanHuyGNC(hoSoThuTucId, phieuXuLyPhuId, "",
					userId, lstCertificateRecord, lyDo);
			log.info("===toNghiepVu_XacNhanHuyChungChi==="
					+ "========hoSoThuTucId===" + hoSoThuTucId
					+ "===phieuXuLyPhuId===" + phieuXuLyPhuId);

			response.setRenderParameter(Constants.THANH_PHAN_XU_LY,
					thanhPhanXuLy);
			PortletConfig portletConfig = (PortletConfig) request
					.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(request, portletConfig.getPortletName()
					+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		} catch (Exception e) {

		}
	}

	public void toNghiepVu_DongYSuaChungChi(ActionRequest request,
			ActionResponse response) {
		try {
			long userId = PortalUtil.getUserId(request);
			long hoSoThuTucId = ParamUtil.getLong(request,
					Constants.ID_HO_SO_THU_TUC);
			long phieuXuLyPhuId = ParamUtil.getLong(request,
					Constants.ID_PHIEU_XU_LY_PHU);
			long canBoSuLy = ParamUtil.getLong(request, Constants.CAN_BO_SU_LY);
			String thanhPhanXuLy = ParamUtil.getString(request,
					Constants.THANH_PHAN_XU_LY).trim();
			String listId = ParamUtil.getString(request, "listId");
			String lyDo = ParamUtil.getString(request, "dongYSua");
			String[] arrListId = listId.split(",");

			List<CertificateRecord> lstCertificateRecord = new ArrayList<CertificateRecord>();

			for (int i = 0; i < arrListId.length; i++) {
				CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
						.fetchCertificateRecord(ConvertUtil
								.convertToLong(arrListId[i]));
				lstCertificateRecord.add(certificateRecord);
			}
			String messageId = functionNghiepVu.getRamdomMessage();
			nghiepVuBusiness
					.xacNhanSuaDoiGNC(hoSoThuTucId, phieuXuLyPhuId, "", userId,
							lstCertificateRecord, 1, lyDo, canBoSuLy, messageId);
			log.info("===toNghiepVu_DongYSuaChungChi==="
					+ "========hoSoThuTucId===" + hoSoThuTucId
					+ "===phieuXuLyPhuId===" + phieuXuLyPhuId);

			response.setRenderParameter(Constants.THANH_PHAN_XU_LY,
					thanhPhanXuLy);
			PortletConfig portletConfig = (PortletConfig) request
					.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(request, portletConfig.getPortletName()
					+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		} catch (Exception e) {

		}
	}

	public void toNghiepVu_TuChoiSuaChungChi(ActionRequest request,
			ActionResponse response) {
		try {
			long userId = PortalUtil.getUserId(request);
			long hoSoThuTucId = ParamUtil.getLong(request,
					Constants.ID_HO_SO_THU_TUC);
			long phieuXuLyPhuId = ParamUtil.getLong(request,
					Constants.ID_PHIEU_XU_LY_PHU);
			long canBoSuLy = ParamUtil.getLong(request, Constants.CAN_BO_SU_LY);
			String thanhPhanXuLy = ParamUtil.getString(request,
					Constants.THANH_PHAN_XU_LY).trim();
			String listId = ParamUtil.getString(request, "listId");
			String lyDo = ParamUtil.getString(request, "tuChoiSua");
			String[] arrListId = listId.split(",");

			List<CertificateRecord> lstCertificateRecord = new ArrayList<CertificateRecord>();

			for (int i = 0; i < arrListId.length; i++) {
				CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
						.fetchCertificateRecord(ConvertUtil
								.convertToLong(arrListId[i]));
				lstCertificateRecord.add(certificateRecord);
			}
			String messageId = functionNghiepVu.getRamdomMessage();
			nghiepVuBusiness
					.xacNhanSuaDoiGNC(hoSoThuTucId, phieuXuLyPhuId, "", userId,
							lstCertificateRecord, 0, lyDo, canBoSuLy, messageId);

			log.info("===toNghiepVu_TuChoiSuaChungChi==="
					+ "========hoSoThuTucId===" + hoSoThuTucId
					+ "===phieuXuLyPhuId===" + phieuXuLyPhuId);

			response.setRenderParameter(Constants.THANH_PHAN_XU_LY,
					thanhPhanXuLy);
			PortletConfig portletConfig = (PortletConfig) request
					.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(request, portletConfig.getPortletName()
					+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		} catch (Exception e) {

		}
	}

	/*
	 * Chuyen dich trang thai
	 */

	public void dongDauChungChi(ActionRequest request, ActionResponse response) {

		ToTiepNhanBusiness tiepNhanBusiness = new ToTiepNhanBusiness();
		tiepNhanBusiness.dongDauChungChi(request, response);

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void boXungHoSo(ActionRequest request, ActionResponse httpReq) {
		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long idthuTucHanhChinh = ParamUtil.getLong(request,
				Constants.TTHC_THUTUCHANHCHINH_ID);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();
		String dieuKienChuyenDich = ParamUtil.getString(request,
				Constants.DIEU_KIEN_CHUYEN_DICH);
		String noiDungYeuCauBoSung = ParamUtil
				.getString(request, "yKienChiDao");
		String dateNgayChiDao = ParamUtil.getString(request, "ngayChiDao");

		nghiepVuBusiness.messageSuaDoiBoSung(hoSoThuTucId, userId,
				noiDungYeuCauBoSung, dateNgayChiDao);

		httpReq.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		httpReq.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID,
				String.valueOf(idthuTucHanhChinh));
		httpReq.setRenderParameter(Constants.ID_HO_SO_THU_TUC,
				String.valueOf(hoSoThuTucId));

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void kyXacNhanDangKyKiemTra(ActionRequest resourceRequest,
			ActionResponse httpReq) {
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest
				.getAttribute(WebKeys.THEME_DISPLAY);
		String thanhPhanXuLy = ParamUtil.getString(resourceRequest,
				Constants.THANH_PHAN_XU_LY).trim();
		String hoSoThuTucId = ParamUtil.getString(resourceRequest,
				Constants.ID_HO_SO_THU_TUC);
		log.info("  hoSoThuTucId  " + hoSoThuTucId);
		String idthuTucHanhChinh = ParamUtil.getString(resourceRequest,
				Constants.TTHC_THUTUCHANHCHINH_ID);
		String dieuKienChuyenDich = ParamUtil.getString(resourceRequest,
				Constants.DIEU_KIEN_CHUYEN_DICH);
		String registeredNumber = ParamUtil.getString(resourceRequest,
				"registeredNumber");

		XacNhanDangKyKiemTraObject dangKyKiemTraObject = new XacNhanDangKyKiemTraObject();
		RegisteredInspection registeredInspection = null;
		try {
			registeredInspection = RegisteredInspectionLocalServiceUtil
					.findByDossierId(ConvertUtil.convertToLong(hoSoThuTucId));

			dangKyKiemTraObject.setRegisteredinspectionId(registeredInspection
					.getId());
			dangKyKiemTraObject.setInspectorSignName("InspectorSignName");
			dangKyKiemTraObject.setInspectorSignPlace("InspectorSignPlace");
			dangKyKiemTraObject.setInspectorSignTitle("InspectorSignTitle");
			// dangKyKiemTraObject.setInspectorSignName(registeredInspection.getInspectorSigNname());
			// dangKyKiemTraObject.setInspectorSignPlace(registeredInspection.getInspectorSignPlace());
			// dangKyKiemTraObject.setInspectorSignTitle(registeredInspection.getInspectorSignTitle());
			Boolean kq = nghiepVuBusiness.xacNhanDangKyKiemTra(
					ConvertUtil.convertToLong(hoSoThuTucId),
					dieuKienChuyenDich, themeDisplay.getUserId(),
					dangKyKiemTraObject, resourceRequest, registeredInspection);
		} catch (Exception e) {
			log.error(e);
		}

		httpReq.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void kyXacNhanDangKyKiemTraNhieuHoSo(ActionRequest resourceRequest,
			ActionResponse httpReq) {
		log.info("-------------vao kyXacNhanDangKyKiemTraNhieuHoSo----------------");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest
				.getAttribute(WebKeys.THEME_DISPLAY);
		String thanhPhanXuLy = ParamUtil.getString(resourceRequest,
				Constants.THANH_PHAN_XU_LY).trim();
		String listHoSoThuTucId = ParamUtil.getString(resourceRequest,
				"listHoSoThuTucId");
		String dieuKienChuyenDich = ParamUtil.getString(resourceRequest,
				Constants.DIEU_KIEN_CHUYEN_DICH);

		String tenThuTuc = ParamUtil.getString(resourceRequest,
				Constants.TEN_THU_TUC);
		String soHoSo = ParamUtil
				.getString(resourceRequest, Constants.SO_HO_SO);
		String doanhNghiep = ParamUtil.getString(resourceRequest,
				Constants.DOANH_NGHIEP);
		String ngayNopHsFrom = ParamUtil.getString(resourceRequest,
				Constants.NGAY_NOP_HO_SO_FROM);
		String ngayNopHsTo = ParamUtil.getString(resourceRequest,
				Constants.NGAY_NOP_HO_SO_TO);
		String namNhap = ParamUtil.getString(resourceRequest,
				Constants.NAM_NHAP);

		log.info("-------------danh sach ho so:----------------"
				+ listHoSoThuTucId);

		XacNhanDangKyKiemTraObject dangKyKiemTraObject = null;
		RegisteredInspection registeredInspection;
		LanhDaoPhongBusiness lanhDaoPhongBusiness = new LanhDaoPhongBusiness();
		List<Long> allHoSoThuTucId = lanhDaoPhongBusiness
				.getListHoSoThuTucId(listHoSoThuTucId);
		// List<TthcHoSoThuTuc> allHoSoThuTuc =
		// lanhDaoPhongBusiness.getListHoSoThuTuc(listHoSoThuTucId);
		try {
			if (allHoSoThuTucId != null && allHoSoThuTucId.size() > 0) {
				int size = allHoSoThuTucId.size();
				for (int i = 0; i < size; i++) {
					registeredInspection = RegisteredInspectionLocalServiceUtil
							.findByDossierId(allHoSoThuTucId.get(i));
					dangKyKiemTraObject = new XacNhanDangKyKiemTraObject();

					log.info("-------------tthcHoSoThuTuc.getId():----------------"
							+ allHoSoThuTucId.get(i));
					if (registeredInspection != null) {
						log.info("-------------registeredInspection.getId():----------------"
								+ registeredInspection.getId());
						dangKyKiemTraObject
								.setRegisteredinspectionId(registeredInspection
										.getId());
						dangKyKiemTraObject
								.setInspectorSignName("InspectorSignName");
						dangKyKiemTraObject
								.setInspectorSignPlace("InspectorSignPlace");
						dangKyKiemTraObject
								.setInspectorSignTitle("InspectorSignTitle");
						// dangKyKiemTraObject.setInspectorSignName(registeredInspection.getInspectorSigNname());
						// dangKyKiemTraObject.setInspectorSignPlace(registeredInspection.getInspectorSignPlace());
						// dangKyKiemTraObject.setInspectorSignTitle(registeredInspection.getInspectorSignTitle());
						Boolean kq = nghiepVuBusiness.xacNhanDangKyKiemTra(
								allHoSoThuTucId.get(i), dieuKienChuyenDich,
								themeDisplay.getUserId(), dangKyKiemTraObject,
								resourceRequest, registeredInspection);
					} else {
						log.info("-------------ko co ban ghi registeredInspection tuong ung voi tthcHoSoThuTuc:----------------"
								+ allHoSoThuTucId.get(i));
					}

				}
			}

		} catch (Exception e) {
			log.error(e);
			log.error(e);
		}

		log.info("-------------end kyXacNhanDangKyKiemTraNhieuHoSo----------------");

		httpReq.setRenderParameter("jspPage",
				"/portlet/quanlyhs/thulyhs/truongbophantiepnhan/qlhs_hs_chocapgiaynhieuhs.jsp");
		httpReq.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		httpReq.setRenderParameter(Constants.TEN_THU_TUC, tenThuTuc);
		httpReq.setRenderParameter(Constants.SO_HO_SO, soHoSo);
		httpReq.setRenderParameter(Constants.DOANH_NGHIEP, doanhNghiep);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
		httpReq.setRenderParameter(Constants.NAM_NHAP, namNhap);

		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void luanChuyenHoSo(ActionRequest resourceRequest,
			ActionResponse httpReq) {
		String thanhPhanXuLy = ParamUtil.getString(resourceRequest,
				Constants.THANH_PHAN_XU_LY).trim();
		httpReq.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	/** To tiep nhan - Ho so bo sung cho tiep nhan - button yeu cau bo sung */
	public void toTiepNhan_YeuCauBoSung(ActionRequest request,
			ActionResponse response) {

		// Start -----du lieu truyen tu form xuong
		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long idthuTucHanhChinh = ParamUtil.getLong(request,
				Constants.TTHC_THUTUCHANHCHINH_ID);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();
		String dieuKienChuyenDich = ParamUtil.getString(request,
				Constants.DIEU_KIEN_CHUYEN_DICH);

		String noiDungYeuCauBoSung = ParamUtil.getString(request,
				"yeuCauBoSung");
		String ngayThongBao = ParamUtil.getString(request, "ngayThongBao");
		String ngayHoanThienHoSo = ParamUtil.getString(request,
				"ngayHoanThienHoSo");
		// End-----du lieu truyen tu form xuong

		log.info("hoSoThuTucId===" + hoSoThuTucId
				+ "===toTiepNhan_YeuCauBoSung===");

		nghiepVuBusiness.messageSuaDoiBoSung(hoSoThuTucId, userId,
				noiDungYeuCauBoSung, ngayHoanThienHoSo);

		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toTiepNhan_BoSungDoiChieuThieuTaiLieu(ActionRequest request,
			ActionResponse response) {

		// Start -----du lieu truyen tu form xuong
		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();
		long confirmedInspectionId = ParamUtil.getLong(request,
				Constants.ID_CONFIRMED_INSPECTION);

		String reason = ParamUtil.getString(request, "yeuCauBoSung");
		String ngayHoanThienHoSo = ParamUtil.getString(request,
				"ngayHoanThienHoSo");
		// End-----du lieu truyen tu form xuong

		log.info("hoSoThuTucId===" + hoSoThuTucId
				+ "===toTiepNhan_YeuCauBoSung===");

		if (confirmedInspectionId > 0) {
			// bo sung
			nghiepVuBoSungBusiness.boSungDoiChieuThieuTaiLieu(hoSoThuTucId,
					phieuXuLyPhuId, userId, reason, ngayHoanThienHoSo);

			// hoan kiem tra
			nghiepVuBoSungBusiness.thongBaoHoanKiemTra(hoSoThuTucId,
					phieuXuLyPhuId, 1, userId + "", reason,
					confirmedInspectionId);
		} else {
			log.info("====toTiepNhan_BoSungDoiChieuThieuTaiLieu======khong co confirmedInspectionId==============");
		}

		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toTiepNhan_ThongBaoViPham(ActionRequest request,
			ActionResponse response) {
		try {
			// Start -----du lieu truyen tu form xuong
			long hoSoThuTucId = ParamUtil.getLong(request,
					Constants.ID_HO_SO_THU_TUC);
			long idthuTucHanhChinh = ParamUtil.getLong(request,
					Constants.TTHC_THUTUCHANHCHINH_ID);
			String thanhPhanXuLy = ParamUtil.getString(request,
					Constants.THANH_PHAN_XU_LY).trim();
			String dieuKienChuyenDich = ParamUtil.getString(request,
					Constants.DIEU_KIEN_CHUYEN_DICH);
			// nghiepVuBusiness.messageThongBaoViPham(hoSoThuTucId, userId,
			// dieuKienChuyenDich, lyDoTuChoi)
			String noiDungKienNghi = ParamUtil.getString(request,
					"noiDungKienNghi");
			String ngayThongBaoViPham = ParamUtil.getString(request,
					"ngayThongBaoViPham");
			// End-----du lieu truyen tu form xuong

			log.info("==hoSoThuTucId==" + hoSoThuTucId
					+ "==idthuTucHanhChinh==" + idthuTucHanhChinh
					+ "==thanhPhanXuLy==" + thanhPhanXuLy);
			log.info("==dieuKienChuyenDich==" + dieuKienChuyenDich
					+ "==dieuKienChuyenDich==" + dieuKienChuyenDich
					+ "==donViKiemTraKhuVuc==");
			log.info("==noiDungKienNghi==" + noiDungKienNghi
					+ "==ngayThongBaoViPham==" + ngayThongBaoViPham);
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil
					.fetchTthcHoSoThuTuc(hoSoThuTucId);
			nghiepVuBusiness.messageThongBaoViPham(hoSoThuTuc,
					PortalUtil.getUserId(request), dieuKienChuyenDich,
					noiDungKienNghi);

			PortletConfig portletConfig = (PortletConfig) request
					.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(request, portletConfig.getPortletName()
					+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void toTiepNhan_DongYHuy(ActionRequest request,
			ActionResponse response) {
		try {
			long userId = PortalUtil.getUserId(request);
			long hoSoThuTucId = ParamUtil.getLong(request,
					Constants.ID_HO_SO_THU_TUC);
			String thanhPhanXuLy = ParamUtil.getString(request,
					Constants.THANH_PHAN_XU_LY).trim();

			String lyDo = ParamUtil.getString(request, "dongYHuy");
			// TthcHoSoThuTuc tthcHoSoThuTuc =
			// TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			log.info("hoSoThuTucId===" + hoSoThuTucId
					+ "===toTiepNhan_DongYHuy===");

			nghiepVuBoSungBusiness.canBoXacNhanHuyHoSo(hoSoThuTucId, userId, 1,
					lyDo);

			response.setRenderParameter(Constants.THANH_PHAN_XU_LY,
					thanhPhanXuLy);
			PortletConfig portletConfig = (PortletConfig) request
					.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(request, portletConfig.getPortletName()
					+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void toTiepNhan_TuChoiHuy(ActionRequest request,
			ActionResponse response) {
		try {
			long userId = PortalUtil.getUserId(request);
			long hoSoThuTucId = ParamUtil.getLong(request,
					Constants.ID_HO_SO_THU_TUC);
			String thanhPhanXuLy = ParamUtil.getString(request,
					Constants.THANH_PHAN_XU_LY).trim();

			String lyDo = ParamUtil.getString(request, "tuChoiHuy");
			// TthcHoSoThuTuc tthcHoSoThuTuc =
			// TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			log.info("hoSoThuTucId===" + hoSoThuTucId
					+ "===toTiepNhan_DongYHuy===");

			nghiepVuBoSungBusiness.canBoXacNhanHuyHoSo(hoSoThuTucId, userId, 0,
					lyDo);

			response.setRenderParameter(Constants.THANH_PHAN_XU_LY,
					thanhPhanXuLy);
			PortletConfig portletConfig = (PortletConfig) request
					.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(request, portletConfig.getPortletName()
					+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void toTiepNhan_XacNhanHoan(ActionRequest request,
			ActionResponse response) {
		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();

		String lyDo = ParamUtil.getString(request, "xacNhanHoan");
		log.info("===toTiepNhan_XacNhanHoan===" + "========hoSoThuTucId==="
				+ hoSoThuTucId + "===phieuXuLyPhuId===" + phieuXuLyPhuId);

		nghiepVuBoSungBusiness.xacNhanThongBaoHoanKiemTra(hoSoThuTucId,
				phieuXuLyPhuId, 1, userId + "", lyDo);

		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toTiepNhan_TuChoiHoan(ActionRequest request,
			ActionResponse response) {
		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();

		String lyDo = ParamUtil.getString(request, "tuChoiHoan");
		log.info("===toTiepNhan_TuChoiHoan===" + "========hoSoThuTucId==="
				+ hoSoThuTucId + "===phieuXuLyPhuId===" + phieuXuLyPhuId);

		nghiepVuBoSungBusiness.xacNhanThongBaoHoanKiemTra(hoSoThuTucId,
				phieuXuLyPhuId, 0, userId + "", lyDo);

		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toTiepNhan_XacNhanLoaiBo(ActionRequest request,
			ActionResponse response) {
		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();

		String lyDo = ParamUtil.getString(request, "xacNhanLoaiBo");
		log.info("===toTiepNhan_XacNhanLoaiBo===" + "========hoSoThuTucId==="
				+ hoSoThuTucId + "===phieuXuLyPhuId===" + phieuXuLyPhuId);
		log.info("===toTiepNhan_XacNhanLoaiBo===" + "========hoSoThuTucId==="
				+ hoSoThuTucId + "===phieuXuLyPhuId===" + phieuXuLyPhuId);

		nghiepVuBoSungBusiness.xacNhanLoaiBoPhuongTienKiemTra(hoSoThuTucId,
				phieuXuLyPhuId, 1, userId + "", lyDo);

		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toTiepNhan_TuChoiLoaiBo(ActionRequest request,
			ActionResponse response) {
		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();

		String lyDo = ParamUtil.getString(request, "tuChoiLoaiBo");
		log.info("===toTiepNhan_TuChoiLoaiBo===" + "========hoSoThuTucId==="
				+ hoSoThuTucId + "===phieuXuLyPhuId===" + phieuXuLyPhuId);
		log.info("===toTiepNhan_TuChoiLoaiBo===" + "========hoSoThuTucId==="
				+ hoSoThuTucId + "===phieuXuLyPhuId===" + phieuXuLyPhuId);

		nghiepVuBoSungBusiness.xacNhanLoaiBoPhuongTienKiemTra(hoSoThuTucId,
				phieuXuLyPhuId, 0, userId + "", lyDo);

		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toTiepNhan_HoanKiemTra(ActionRequest request,
			ActionResponse response) {
		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();
		long confirmedInspectionId = ParamUtil.getLong(request,
				Constants.ID_CONFIRMED_INSPECTION);
		String lyDo = ParamUtil.getString(request, "lyDoHoanKiemTra");
		log.info("===toTiepNhan_HoanKiemTra===" + "========hoSoThuTucId==="
				+ hoSoThuTucId + "===phieuXuLyPhuId===" + phieuXuLyPhuId);
		log.info("===toTiepNhan_HoanKiemTra===" + "========hoSoThuTucId==="
				+ hoSoThuTucId + "===phieuXuLyPhuId===" + phieuXuLyPhuId
				+ "====confirmedInspectionId==" + confirmedInspectionId);

		if (confirmedInspectionId > 0) {
			nghiepVuBoSungBusiness
					.thongBaoHoanKiemTra(hoSoThuTucId, phieuXuLyPhuId, 1,
							userId + "", lyDo, confirmedInspectionId);
		} else {
			log.info("====toTiepNhan_HoanKiemTra======khong co confirmedInspectionId==============");
		}
		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toTiepNhan_TraLaiDoiTruongPhanCong(ActionRequest request,
			ActionResponse response) {
		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();
		String lyDo = ParamUtil.getString(request, "lyDoTraLai");
		log.info("===toTiepNhan_TraLaiDoiTruongPhanCong==="
				+ "========hoSoThuTucId===" + hoSoThuTucId
				+ "===phieuXuLyPhuId===" + phieuXuLyPhuId);
		log.info("===toTiepNhan_TraLaiDoiTruongPhanCong==="
				+ "========hoSoThuTucId===" + hoSoThuTucId
				+ "===phieuXuLyPhuId===" + phieuXuLyPhuId);

		nghiepVuBoSungBusiness.traLichKiemTraChoLanhDao(hoSoThuTucId,
				phieuXuLyPhuId, 1, userId, lyDo);

		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toTiepNhan_TraLichKiemTraChoToTiepNhan(ActionRequest request,
			ActionResponse response) {
		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();
		String lyDo = ParamUtil.getString(request, "traLichKiemTra");
		log.info("===toTiepNhan_TraLichKiemTraChoToTiepNhan==="
				+ "========hoSoThuTucId===" + hoSoThuTucId
				+ "===phieuXuLyPhuId===" + phieuXuLyPhuId);
		log.info("===toTiepNhan_TraLichKiemTraChoToTiepNhan==="
				+ "========hoSoThuTucId===" + hoSoThuTucId
				+ "===phieuXuLyPhuId===" + phieuXuLyPhuId);

		nghiepVuBoSungBusiness.traLichKiemTraChoToTiepNhan(hoSoThuTucId,
				phieuXuLyPhuId, 1, userId, lyDo);

		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toTiepNhan_YeuCauDKVSoatXetLai(ActionRequest request,
			ActionResponse response) {
		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();
		String lyDo = ParamUtil.getString(request, "yeuCauDKVSoatXetLai");
		log.info("===toTiepNhan_YeuCauDKVSoatXetLai==="
				+ "========hoSoThuTucId===" + hoSoThuTucId
				+ "===phieuXuLyPhuId===" + phieuXuLyPhuId);
		log.info("===toTiepNhan_YeuCauDKVSoatXetLai==="
				+ "========hoSoThuTucId===" + hoSoThuTucId
				+ "===phieuXuLyPhuId===" + phieuXuLyPhuId);

		nghiepVuBoSungBusiness.traBienBanKiemTraChoDangKiemVien(hoSoThuTucId,
				phieuXuLyPhuId, 1, userId, lyDo);

		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toTiepNhan_ToNghiepVuTraLaiHoSo(ActionRequest request,
			ActionResponse response) {
		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();
		String lyDo = ParamUtil.getString(request, "traLaiHoSo");
		log.info("===toTiepNhan_ToNghiepVuTraLaiHoSo==="
				+ "========hoSoThuTucId===" + hoSoThuTucId
				+ "===phieuXuLyPhuId===" + phieuXuLyPhuId);
		log.info("===toTiepNhan_ToNghiepVuTraLaiHoSo==="
				+ "========hoSoThuTucId===" + hoSoThuTucId
				+ "===phieuXuLyPhuId===" + phieuXuLyPhuId);

		nghiepVuBoSungBusiness.traBienBanKiemTraChoLanhDaoDonVi(hoSoThuTucId,
				phieuXuLyPhuId, 1, userId, lyDo);

		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void toNghiepVuTraLaiHoSo(ActionRequest request,
			ActionResponse response) {
		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();
		String taaTraLaiLdvkt = ParamUtil.getString(request, "taaTraLaiLdvkt");
		log.info("=======taaTraLaiLdvkt=======" + taaTraLaiLdvkt);
		nghiepVuBoSungBusiness.traBienBanKiemTraChoLanhDaoDonVi(hoSoThuTucId,
				phieuXuLyPhuId, 1, userId, taaTraLaiLdvkt);

		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	/** Ham phan cong don vi kiem tra */
	public void phanCongDonViKT(ActionRequest request, ActionResponse response) {
		// Start -----du lieu truyen tu form xuong

		String nguoiPhanCong = ParamUtil.getString(request, "nguoiPhanCong");
		String ngayPhanCong = ParamUtil.getString(request, "ngayPhanCong");
		String donViKiemTraKhuVuc = ParamUtil.getString(request,
				"donViKiemTraKhuVuc");
		String slgPhuongTienDNKT = ParamUtil.getString(request,
				"slgPhuongTienDNKT");
		String slgPTDKKT = ParamUtil.getString(request, "slgPTDKKT");
		String slgPTChuaDeNghiDKKT = ParamUtil.getString(request,
				"slgPTChuaDeNghiDKKT");
		String ghiChu = ParamUtil.getString(request, "ghiChu");
		// nghiepVuBusiness.phanCongDonViKiemTra(hoSoThuTucId, phieuXuLyPhuId,
		// dieuKienChuyenDich, userId, corporationId);
		log.info("==nguoiPhanCong==" + nguoiPhanCong + "==ngayPhanCong=="
				+ ngayPhanCong + "==donViKiemTraKhuVuc==" + donViKiemTraKhuVuc);
		log.info("==slgPhuongTienDNKT==" + slgPhuongTienDNKT + "==slgPTDKKT=="
				+ slgPTDKKT + "==slgPTChuaDeNghiDKKT==" + slgPTChuaDeNghiDKKT);
		log.info("==ghiChu==" + ghiChu);

		// End-----du lieu truyen tu form xuong
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	/**
	 * tonghiepvu/qlhs_hs_soanbanthaochungchi.jsp
	 * 
	 * @throws IOException
	 */
	public void xemChiTietBienBanKiemTra(ActionRequest request,
			ActionResponse response) throws IOException {
		try {
			log.info("==Vao==xemChiTietBienBanKiemTra");

			String inspectionRecord = ParamUtil.getString(request,
					"inspectionRecord");
			String nguoiKiemtra = "abc";

			HoSoSoanThaoChungChi hoso = new HoSoSoanThaoChungChi();

			YKienDangKiemVien yKienDKV = new YKienDangKiemVien();
			yKienDKV.setKetQua("chinh xac");

			YKienDoiTruong yKienDoiTuong = new YKienDoiTruong();
			yKienDoiTuong.setKetQua("yKienDoiTuong");

			hoso.setYKienDangKiemVien(yKienDKV);
			hoso.setYKienDoiTruong(yKienDoiTuong);

			JsonSerializer json = new JsonSerializer();
			String sHoSo = json.toString(hoso);

			HttpServletResponse resourceResponse = PortalUtil
					.getHttpServletResponse(response);

			// resourceRequest.setAttribute("portRegionRef", portRegionRef);
			resourceResponse.setContentType("application/json");
			resourceResponse.setCharacterEncoding("UTF-8");
			resourceResponse.getWriter().write(sHoSo);
			resourceResponse.getWriter().close();

		} catch (IOException e) {
			log.error(e);
		}
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	/** ham tim kiem ho so phan cong nhieu don vi kiem tra */
	public void timKiemPhieuXuLyPhuPhanCongNhieuDonViKiemTra(
			ActionRequest request, ActionResponse response) {
		try {

			// Doi tuong xe
			String loaiThuTuc = ParamUtil.getString(request,
					Constants.LOAI_THU_TUC).trim();
			String tenThuTuc = ParamUtil.getString(request,
					Constants.TEN_THU_TUC).trim();
			String soDKKT = ParamUtil.getString(request, Constants.SO_DKKT)
					.trim();
			String soHoSo = ParamUtil.getString(request, Constants.SO_HO_SO)
					.trim();
			String ngayNopHsFrom = ParamUtil.getString(request,
					Constants.NGAY_NOP_HO_SO_FROM).trim();
			String ngayNopHsTo = ParamUtil.getString(request,
					Constants.NGAY_NOP_HO_SO_TO).trim();
			String namNhap = ParamUtil.getString(request, Constants.NAM_NHAP);

			String quanHuyen = ParamUtil.getString(request,
					Constants.QUAN_HUYEN);
			String tinhThanh = ParamUtil.getString(request,
					Constants.TINH_THANH);
			String datNuoc = ParamUtil.getString(request, Constants.DAT_NUOC);

			response.setRenderParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
			response.setRenderParameter(Constants.TEN_THU_TUC, tenThuTuc);
			response.setRenderParameter(Constants.SO_HO_SO, soHoSo);
			response.setRenderParameter(Constants.SO_DKKT, soDKKT);
			response.setRenderParameter(Constants.NGAY_NOP_HO_SO_FROM,
					ngayNopHsFrom);
			response.setRenderParameter(Constants.NGAY_NOP_HO_SO_TO,
					ngayNopHsTo);
			response.setRenderParameter(Constants.NAM_NHAP, namNhap);

			response.setRenderParameter(Constants.QUAN_HUYEN, quanHuyen);
			response.setRenderParameter(Constants.TINH_THANH, tinhThanh);
			response.setRenderParameter(Constants.DAT_NUOC, datNuoc);

			String hoSoThuTucId = ParamUtil.getString(request,
					Constants.ID_HO_SO_THU_TUC);
			String tthc_thutuchanhchinh_id = ParamUtil.getString(request,
					Constants.TTHC_THUTUCHANHCHINH_ID);
			String phieuXuLyPhuId = ParamUtil.getString(request,
					Constants.ID_PHIEU_XU_LY_PHU);

			response.setRenderParameter(Constants.ID_HO_SO_THU_TUC,
					StringUtil.valueOf(hoSoThuTucId));
			response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID,
					tthc_thutuchanhchinh_id);
			response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU,
					StringUtil.valueOf(phieuXuLyPhuId));

			response.setRenderParameter("jspPage",
					"/portlet/quanlyhs/thulyhs/totiepnhan/hs_phancong_nhieu_donvi_kt.jsp");

			PortletConfig portletConfig = (PortletConfig) request
					.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(request, portletConfig.getPortletName()
					+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		} catch (Exception e) {
			log.error(e);
		}
	}

	/** Thuc hien chuc nang phan cong mot don vi kiem tra */
	public void hoSoPhanCongMotDonViKiemTra(ActionRequest request,
			ActionResponse response) {
		try {
			log.info("==START==hoSoPhanCongMotDonViKiemTra");

			String nguoiPhanCong = ParamUtil
					.getString(request, "nguoiPhanCong");
			String ngayPhanCong = ParamUtil.getString(request, "ngayPhanCong");
			String slgPhuongTienDNKT = ParamUtil.getString(request,
					"slgPhuongTienDNKT");
			String slgPTDKKT = ParamUtil.getString(request, "slgPTDKKT");
			String slgPTChuaDeNghiDKKT = ParamUtil.getString(request,
					"slgPTChuaDeNghiDKKT");
			String ghiChu = ParamUtil.getString(request, "ghiChu");

			long hoSoThuTucId = ParamUtil.getLong(request,
					Constants.ID_HO_SO_THU_TUC);
			String dieuKienChuyenDich = ParamUtil.getString(request,
					Constants.DIEU_KIEN_CHUYEN_DICH);
			long userId = PortalUtil.getUserId(request);
			String corporationId = ParamUtil
					.getString(request, "corporationId");

			long phieuXuLyPhuId = ParamUtil.getLong(request,
					Constants.ID_PHIEU_XU_LY_PHU);

			log.info("==hoSoThuTucId==" + hoSoThuTucId + "==phieuXuLyPhuId=="
					+ phieuXuLyPhuId);
			log.info("==dieuKienChuyenDich==" + dieuKienChuyenDich
					+ "==corporationId==" + corporationId);

			boolean kq = nghiepVuBusiness.phanCongDonViKiemTra(hoSoThuTucId,
					phieuXuLyPhuId, dieuKienChuyenDich, userId, corporationId);

			log.info("==kqXyLyMethod==" + kq);

		} catch (Exception e) {
			log.error(e);
		}
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	/**
	 * ham thuc hien phan cong nhieu don vi kiem tra o man hinh Ho So Phan Cong
	 * Don Vi Kiem Tra
	 */
	public void hoSoPhanCongNhieuDonViKiemTra(ActionRequest request,
			ActionResponse response) {
		try {
			// Tham so chua config
			log.info("==START==hoSoPhanCongNhieuDonViKiemTra");

			String dieuKienChuyenDich = ParamUtil.getString(request,
					Constants.DIEU_KIEN_CHUYEN_DICH);

			// don vi kiem tra
			String corporationId = ParamUtil
					.getString(request, "corporationId");

			long userId = PortalUtil.getUserId(request);

			long phieuXuLyPhuId = 0;

			long hoSoThuTucId = 0;

			String sPhieuXyLyId = ParamUtil.getString(request,
					"danhSachPhieuXuLyPhuId");
			sPhieuXyLyId = sPhieuXyLyId.substring(0, sPhieuXyLyId.length());
			log.info("sPhieuXyLyId==" + sPhieuXyLyId);

			String sHoSoThuTucId = ParamUtil.getString(request,
					"danhSachHoSoThuTucId");
			sHoSoThuTucId = sHoSoThuTucId.substring(0, sHoSoThuTucId.length());
			log.info("sHoSoThuTucId==" + sHoSoThuTucId);

			// String[] lstPhieuXuLyPhuId = ((StringUtils.isEmpty(sPhieuXyLyId)
			// == true) ? null : sPhieuXyLyId.split(","));

			// String[] lstHoSoThuTucId = ((StringUtils.isEmpty(sHoSoThuTucId)
			// == true) ? null : sHoSoThuTucId.split(","));

			String[] lstPhieuXuLyPhuId = ParamUtil.getParameterValues(request,
					"lstPhieuXuLyPhuId", null);
			String[] lstHoSoThuTucId = ParamUtil.getParameterValues(request,
					"lstHoSoThuTucId", null);

			log.info("==dieuKienChuyenDich==" + dieuKienChuyenDich);
			log.info("==lstPhieuXuLyPhuId==="
					+ ((lstPhieuXuLyPhuId != null) ? (lstPhieuXuLyPhuId.length)
							: "==null=="));
			log.info("==lstHoSoThuTucId====="
					+ ((lstHoSoThuTucId != null) ? (lstHoSoThuTucId.length)
							: "==null=="));

			if (lstPhieuXuLyPhuId != null) {
				for (int i = 0; i < lstPhieuXuLyPhuId.length; i++) {
					log.info(lstPhieuXuLyPhuId[i]);
				}
			}

			if (lstHoSoThuTucId != null) {
				for (int i = 0; i < lstHoSoThuTucId.length; i++) {
					log.info(lstHoSoThuTucId[i]);
				}
			}

			if (lstPhieuXuLyPhuId != null && lstHoSoThuTucId != null) {
				for (int i = 0; i < lstPhieuXuLyPhuId.length; i++) {
					phieuXuLyPhuId = ConvertUtil
							.convertToLong(lstPhieuXuLyPhuId[i]);
					try {
						hoSoThuTucId = ConvertUtil
								.convertToLong(lstHoSoThuTucId[i]);
						boolean kq = nghiepVuBusiness.phanCongDonViKiemTra(
								hoSoThuTucId, phieuXuLyPhuId,
								dieuKienChuyenDich, userId, corporationId);

						log.info("==hoSoThuTucId==" + hoSoThuTucId
								+ "==phieuXuLyPhuId==" + phieuXuLyPhuId
								+ "==dieuKienChuyenDich==" + dieuKienChuyenDich
								+ "==corporationId==" + corporationId);
						log.info("==kqXyLyMethod==" + kq);
					} catch (Exception e) {
						log.info("==Loi arrayIndexOfBound== lstCorporationId and lstHoSoThuTucId");
					}
				}
			}
		} catch (Exception e) {
			log.error(e);
		}
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void hoSoPhanCongNhieuDonViKiemTraDefaultDoi(ActionRequest request,
			ActionResponse response) {
		try {
			// Tham so chua config
			log.info("==START==hoSoPhanCongNhieuDonViKiemTra");

			String dieuKienChuyenDich = ParamUtil.getString(request,
					Constants.DIEU_KIEN_CHUYEN_DICH);

			// don vi kiem tra
			// String corporationId = ParamUtil.getString(request,
			// "corporationId");

			long userId = PortalUtil.getUserId(request);

			long phieuXuLyPhuId = 0;

			long hoSoThuTucId = 0;

			String sPhieuXyLyId = ParamUtil.getString(request,
					"danhSachPhieuXuLyPhuId");
			sPhieuXyLyId = sPhieuXyLyId.substring(0, sPhieuXyLyId.length());
			log.info("sPhieuXyLyId==" + sPhieuXyLyId);

			String sHoSoThuTucId = ParamUtil.getString(request,
					"danhSachHoSoThuTucId");
			sHoSoThuTucId = sHoSoThuTucId.substring(0, sHoSoThuTucId.length());
			log.info("sHoSoThuTucId==" + sHoSoThuTucId);

			// String[] lstPhieuXuLyPhuId = ((StringUtils.isEmpty(sPhieuXyLyId)
			// == true) ? null : sPhieuXyLyId.split(","));

			// String[] lstHoSoThuTucId = ((StringUtils.isEmpty(sHoSoThuTucId)
			// == true) ? null : sHoSoThuTucId.split(","));

			String[] lstPhieuXuLyPhuId = ParamUtil.getParameterValues(request,
					"lstPhieuXuLyPhuId", null);
			String[] lstHoSoThuTucId = ParamUtil.getParameterValues(request,
					"lstHoSoThuTucId", null);

			log.info("==dieuKienChuyenDich==" + dieuKienChuyenDich);
			log.info("==lstPhieuXuLyPhuId==="
					+ ((lstPhieuXuLyPhuId != null) ? (lstPhieuXuLyPhuId.length)
							: "==null=="));
			log.info("==lstHoSoThuTucId====="
					+ ((lstHoSoThuTucId != null) ? (lstHoSoThuTucId.length)
							: "==null=="));

			if (lstPhieuXuLyPhuId != null) {
				for (int i = 0; i < lstPhieuXuLyPhuId.length; i++) {
					log.info(lstPhieuXuLyPhuId[i]);
				}
			}

			if (lstHoSoThuTucId != null) {
				for (int i = 0; i < lstHoSoThuTucId.length; i++) {
					log.info(lstHoSoThuTucId[i]);
				}
			}

			if (lstPhieuXuLyPhuId != null && lstHoSoThuTucId != null) {
				for (int i = 0; i < lstPhieuXuLyPhuId.length; i++) {
					phieuXuLyPhuId = ConvertUtil
							.convertToLong(lstPhieuXuLyPhuId[i]);
					try {
						String corporationId = "";
						ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
								.findByPhieuXuLyPhuId(phieuXuLyPhuId);
						if (confirmedInspection != null) {
							DmDataItem dmDonVi = DmDataItemLocalServiceUtil
									.getByDmDataGroupCodeNameAndCode0AndLevel(
											DanhMucKey.ADMINISTRATIVE_UNITS,
											confirmedInspection
													.getInspectionProvincecode(),
											1);
							if (dmDonVi != null) {
								DmDataItem dmDonViKiemTra = DmDataItemLocalServiceUtil
										.getByDataGroupCodeNameAndDataItemCode0(
												DanhMucKey.CORPORATION,
												dmDonVi.getCode3());
								if (dmDonViKiemTra != null) {
									corporationId = dmDonViKiemTra.getCode0();
								}
							}
						}

						hoSoThuTucId = ConvertUtil
								.convertToLong(lstHoSoThuTucId[i]);
						boolean kq = nghiepVuBusiness.phanCongDonViKiemTra(
								hoSoThuTucId, phieuXuLyPhuId,
								dieuKienChuyenDich, userId, corporationId);

						log.info("==hoSoThuTucId==" + hoSoThuTucId
								+ "==phieuXuLyPhuId==" + phieuXuLyPhuId
								+ "==dieuKienChuyenDich==" + dieuKienChuyenDich
								+ "==corporationId==" + corporationId);
						log.info("==kqXyLyMethod==" + kq);
					} catch (Exception e) {
						log.info("==Loi arrayIndexOfBound== lstCorporationId and lstHoSoThuTucId");
					}
				}
			}
		} catch (Exception e) {
			log.error(e);
		}
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void updatePhanCongDangKiemVien(ActionRequest request,
			ActionResponse response) {
		LapBanDangKyBusiness lapBanDangKyBusiness = new LapBanDangKyBusiness();
		lapBanDangKyBusiness.updatePhanCongDangKiemVien(request, response);
	}

	/** phan lam thuc te truc tiep lam tren form */
	public void duocPhanCongDangKiemVien(ActionRequest request,
			ActionResponse response) {
		try {
			log.info("===START==duocPhanCongDangKiemVien");

			String fromDate = ParamUtil.getString(request, "formDate").trim();
			if (ActionKeys.checkFromDate(request, fromDate)) {
				return;
			}
			// Phan Lam tren form tab THONG TIN CHUNG
			String[] lstIdVehicleRecordDSphuongtienkiemtra = ParamUtil
					.getParameterValues(request,
							"idVehicleRecordDanhSachPhuongTienKiemTra", null);
			log.info("==lstIdVehicleRecordDanhSachPhuongTienKiemTra==="
					+ ((lstIdVehicleRecordDSphuongtienkiemtra != null) ? (lstIdVehicleRecordDSphuongtienkiemtra.length)
							: "==null=="));
			List<VehicleRecord> lstVehicleRecord = new ArrayList<VehicleRecord>();
			VehicleRecord temVehicle = null;
			if (lstIdVehicleRecordDSphuongtienkiemtra != null) {
				for (int i = 0; i < lstIdVehicleRecordDSphuongtienkiemtra.length; i++) {
					log.info("==IdVehicleRecordDanhSachPhuongTienKiemTra=="
							+ lstIdVehicleRecordDSphuongtienkiemtra[i]);
					temVehicle = VehicleRecordLocalServiceUtil
							.getVehicleRecord(ConvertUtil
									.convertToLong(lstIdVehicleRecordDSphuongtienkiemtra[i]));
					if (temVehicle != null) {
						lstVehicleRecord.add(temVehicle);
					}
				}
			}

			// ---------------Phan lay du lieu tren tab KIEM TRA CHAT LUONG AN
			// TOAN KTV BVMT------------------
			String vehicleclass = ParamUtil.getString(request,
					"inspectionCommonStatusVehicleClass");
			log.info("inspection Common Status Vehicle Class==" + vehicleclass);

			String[] lstSelChatLuongAnToanKt = ParamUtil.getParameterValues(
					request, "selChatLuongAnToanKt", null);
			if (lstSelChatLuongAnToanKt != null
					&& lstSelChatLuongAnToanKt.length > 0) {
				List<InspectionCommonStatus> lstkiemTraChatLuongAnToanKt = InspectionCommonStatusLocalServiceUtil
						.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(
								vehicleclass, 2, -1);
				for (int i = 0; i < lstkiemTraChatLuongAnToanKt.size(); i++) {
					lstkiemTraChatLuongAnToanKt.get(i).setCommonStatus(
							ConvertUtil
									.convertToLong(lstSelChatLuongAnToanKt[i]));
				}
			}

			// gio truyen vao dieu kien de hien thi tren form kia day
			// truong hop nay config sau vay hoi sau vay.
			long hoSoThuTucId = ParamUtil.getLong(request,
					Constants.ID_HO_SO_THU_TUC);
			long phieuXuLyPhuId = ParamUtil.getLong(request,
					Constants.ID_PHIEU_XU_LY_PHU);
			String dieuKienChuyenDich = "";

			long registerInspectionId = 0;
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
					.findByDossierId(hoSoThuTucId);
			if (registeredInspection != null) {
				registerInspectionId = registeredInspection.getId();
			}

			// dang lam den day
			// long idVehicleGroup = ParamUtil.getLong(request,
			// "lap_bien_ban_kt_id_vehicle_group");
			long idConfirmedInspection = ParamUtil.getLong(request,
					Constants.ID_CONFIRMED_INSPECTION);

			String[] lstIdVehicleSpecification = ParamUtil.getParameterValues(
					request, "idVehicleSpecificationTblKiemTraChatLuong", null);
			String[] lstSpecificationCode = ParamUtil.getParameterValues(
					request, "specificationcode", null);
			String[] lstSpecificationName = ParamUtil.getParameterValues(
					request, "specificationname", null);
			String[] lstGiaTriKiemTra = ParamUtil.getParameterValues(request,
					"giaTriKiemTra", null);
			String[] lstGiaTriDangKi = ParamUtil.getParameterValues(request,
					"giaTriDangKi", null);
			String[] lstSelLuaChonKetQua = ParamUtil.getParameterValues(
					request, "selLuaChonKetQua", null);

			InspectionRecord inspectionRecord = new InspectionRecordImpl();
			inspectionRecord.setConfirmedInspectionId(idConfirmedInspection);
			// Tam thoi, demo face
			// inspectionRecord.setId(CounterLocalServiceUtil.createCounter(InspectionRecord.class));

			// Ngay kiem tra: tu ngay -> den ngay, ngay kiem tra thuc the
			Date inspectionDateFrom = DateUtils.stringToDate(
					ParamUtil.getString(request, "ngayKiemTraTuNgay"),
					"dd/MM/yyyy HH:mm");
			Date inspectionDateTo = DateUtils.stringToDate(
					ParamUtil.getString(request, "ngayKiemTraDenNgay"),
					"dd/MM/yyyy HH:mm");
			inspectionRecord
					.setInspectionDateFrom((inspectionDateFrom == null) ? new Date()
							: inspectionDateFrom);
			inspectionRecord
					.setInspectionDateTo((inspectionDateTo == null) ? new Date()
							: inspectionDateTo);

			String noiDungKienNghi = ParamUtil.getString(request,
					"ghiChuInVaoGiayChungChi");
			inspectionRecord
					.setDescription((noiDungKienNghi.length() == 0) ? ""
							: noiDungKienNghi);

			String remarks = ParamUtil.getString(request, "yKienDangKiemVien");
			inspectionRecord.setRemarks(remarks);

			String districtCodAndProvinceCode = ParamUtil.getString(request,
					"districtCodAndProvinceCode");
			String inspectionSite = ParamUtil.getString(request,
					"inspectionSite");
			String diaDiemKiemTra = districtCodAndProvinceCode + " "
					+ inspectionSite;
			if (diaDiemKiemTra == null || diaDiemKiemTra.length() == 0) {
				diaDiemKiemTra = "diaDiemKiemTra";
			}
			inspectionRecord.setInspectionSite(diaDiemKiemTra);

			String chonPhuongThucKT = ParamUtil.getString(request,
					"chonPhuongThucKT");
			inspectionRecord.setInspectionMode(ConvertUtil
					.convertToLong(chonPhuongThucKT));

			String markupControl = ParamUtil
					.getString(request, "markupControl");
			String markupEmissionTest = ParamUtil.getString(request,
					"markupEmissionTest");
			String markupSafeTest = ParamUtil.getString(request,
					"markupSafeTest");

			inspectionRecord.setMarkupControl((markupControl.length() == 0) ? 0
					: 1);
			inspectionRecord
					.setMarkupEmissionTest((markupEmissionTest.length() == 0) ? 0
							: 1);
			inspectionRecord
					.setMarkupSafeTest((markupSafeTest.length() == 0) ? 0 : 1);

			// muc 5- thong bao de nghi xu ly ket qua
			String confirmedResult = ParamUtil.getString(request,
					"selXuLyKetQua");
			inspectionRecord.setConfirmedResult(ConvertUtil
					.convertToLong(confirmedResult));

			inspectionRecord
					.setInspectionRecordDate((inspectionDateFrom == null) ? new Date()
							: inspectionDateFrom);

			// String soBienBanKiemTra = ParamUtil.getString(request,
			// "soBienBanKiemTra");

			String maNhanVien = ParamUtil.getString(request, "maNhanVien");
			if (maNhanVien == null || maNhanVien.length() == 0) {
				maNhanVien = PortalUtil.getUserId(request) + "";
			}

			String soDangKyKiemTra = ParamUtil.getString(request,
					"soBienBanKiemTra");
			inspectionRecord.setInspectionRecordNo(soDangKyKiemTra);

			List<InspectionRecordSpec> lstInspectionRecordSpec = new ArrayList<InspectionRecordSpec>();
			InspectionRecordSpec tempIRspect = null;

			log.info("lstIdVehicleSpecification==size=="
					+ lstIdVehicleSpecification.length
					+ "==lstSpecificationCode==size=="
					+ lstSpecificationCode.length);
			log.info("lstSpecificationName==size=="
					+ lstSpecificationName.length
					+ "==lstGiaTriKiemTra==size==" + lstGiaTriKiemTra.length);
			log.info("lstSelLuaChonKetQua==size==" + lstSelLuaChonKetQua.length);

			if (lstIdVehicleSpecification != null
					&& lstSpecificationCode != null
					&& lstSpecificationName != null && lstGiaTriKiemTra != null
					&& lstSelLuaChonKetQua != null) {

				for (int i = 0; i < lstIdVehicleSpecification.length; i++) {
					tempIRspect = new InspectionRecordSpecImpl();
					tempIRspect.setSpecificationCode(lstSpecificationCode[i]);
					tempIRspect.setSpecificationName(lstSpecificationName[i]);

					if (lstSelLuaChonKetQua[i].equals("1")) {
						tempIRspect.setSpecificationValue(lstGiaTriKiemTra[i]);
					} else if (lstSelLuaChonKetQua[i].equals("2")) {
						try {
							tempIRspect
									.setSpecificationValue(lstGiaTriKiemTra[i]);
						} catch (Exception e) {
							tempIRspect.setSpecificationValue("");
						}
					} else if (lstSelLuaChonKetQua[i].equals("3")) {
						tempIRspect.setSpecificationValue(lstGiaTriKiemTra[i]);
					} else if (lstSelLuaChonKetQua[i].equals("4")) {
						tempIRspect.setSpecificationValue("");
					} else if (lstSelLuaChonKetQua[i].equals("0")) {
						tempIRspect.setSpecificationValue("");
					}

					tempIRspect.setSpecificationValue(lstGiaTriDangKi[i]);
					// log.info("lstGiaTriKiemTra[i]  "+lstGiaTriKiemTra[i]);
					tempIRspect.setSpecificationValue(lstGiaTriKiemTra[i]);
					tempIRspect.setEvaluationResult(ConvertUtil
							.convertToLong(lstSelLuaChonKetQua[i]));
					lstInspectionRecordSpec.add(tempIRspect);
				}
			}

			log.info("lstVehicleRecord==size==" + lstVehicleRecord.size()
					+ "==lstInspectionRecordSpec==size=="
					+ lstInspectionRecordSpec.size());

			if (lstVehicleRecord.size() > 0
					&& lstInspectionRecordSpec.size() > 0
					&& soDangKyKiemTra != null && soDangKyKiemTra.length() > 0) {
				log.info(" quan ly ho so inspectionRecord.getInspectionRecordNo()  "
						+ inspectionRecord.getInspectionRecordNo());
				boolean result = nghiepVuBusiness.lapBienBanKiemtra(
						hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
						PortalUtil.getUserId(request), registerInspectionId,
						inspectionRecord, lstInspectionRecordSpec,
						lstVehicleRecord);
				log.info("=result=" + result);
			}

			log.info("hoSoThuTucId="
					+ hoSoThuTucId
					+ "=tthc_thutuchanhchinh_id="
					+ ParamUtil.getString(request,
							Constants.TTHC_THUTUCHANHCHINH_ID)
					+ "=phieuXuLyPhuId=" + phieuXuLyPhuId
					+ "=thanh_phan_xu_ly="
					+ ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY));

			// ---------------4. Kiem tra doi chieu ket cau khi thai
			String[] lstSelectKiemTraDoiChieuKhiThai = ParamUtil
					.getParameterValues(request, "selKiemTraDoiChieuKhiThai",
							null);

			if (lstSelectKiemTraDoiChieuKhiThai != null
					&& lstSelectKiemTraDoiChieuKhiThai.length > 0) {
				List<InspectionCommonStatus> lstKiemTraDoiChieuKhiThai = InspectionCommonStatusLocalServiceUtil
						.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(
								vehicleclass, 4, -1);
				for (int i = 0; i < lstKiemTraDoiChieuKhiThai.size(); i++) {
					lstKiemTraDoiChieuKhiThai
							.get(i)
							.setCommonStatus(
									ConvertUtil
											.convertToLong(lstSelectKiemTraDoiChieuKhiThai[i]));
				}
			}

			String[] lstSelXuLyKetQua = ParamUtil.getParameterValues(request,
					"selXuLyKetQua", null);
			if (lstSelXuLyKetQua != null && lstSelXuLyKetQua.length > 0) {
				List<InspectionCommonStatus> lstXuLyKetQua = InspectionCommonStatusLocalServiceUtil
						.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(
								vehicleclass, 5, -1);
				for (int i = 0; i < lstXuLyKetQua.size(); i++) {
					lstXuLyKetQua.get(i).setCommonStatus(
							ConvertUtil.convertToLong(lstSelXuLyKetQua[i]));
				}
			}
			response.setRenderParameter(Constants.ID_HO_SO_THU_TUC,
					StringUtil.valueOf(hoSoThuTucId));
			response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID,
					ParamUtil.getString(request,
							Constants.TTHC_THUTUCHANHCHINH_ID));
			response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU,
					StringUtil.valueOf(phieuXuLyPhuId));
			response.setRenderParameter(Constants.THANH_PHAN_XU_LY,
					ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY));

			response.setRenderParameter("jspPage",
					"/portlet/quanlyhs/hoso_detail.jsp");

			PortletConfig portletConfig = (PortletConfig) request
					.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
			SessionMessages.add(request, portletConfig.getPortletName()
					+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		} catch (Exception e) {
			log.error(e);
		}
	}

	/** Ham thuc thi o man hinh dang kiem vien, ho so duoc phan cong */
	public void dangKiemDuocPhanCongDaDoiChieu(ActionRequest request,
			ActionResponse response) {
		try {
			log.info("==START==dangKiemVienHoSoDuocPhanCong");

			// phan test Demo;

			// lay toan bo inspectionRecordSpec trong groupid/ truowng hop test,
			// con truong hop thuc, inspectionRecordSpec truyen xuong
			long idVehicleGroup = ParamUtil.getLong(request,
					Constants.ID_VEHICLE_GROUP);
			log.info("==idVehicleGroup==" + idVehicleGroup);
			List<VehicleSpecification> lstVehicleSpecification = VehicleSpecificationLocalServiceUtil
					.findByVehicleGroupId(idVehicleGroup);
			// VehicleSpecificationLocalServiceUtil.addVehicleSpecification(vehicleSpecification)
			List<InspectionRecordSpec> lstInspectionRecordSpec = new ArrayList<InspectionRecordSpec>();
			InspectionRecordSpec inspectionRecordSpec = null;
			for (VehicleSpecification item : lstVehicleSpecification) {
				inspectionRecordSpec = new InspectionRecordSpecImpl();
				inspectionRecordSpec.setSpecificationCode(item
						.getSpecificationCode());
				inspectionRecordSpec.setSpecificationName(item
						.getSpecificationName());
				inspectionRecordSpec.setSpecificationValue(item
						.getSpecificationValue());
				lstInspectionRecordSpec.add(inspectionRecordSpec);
			}

			// danh sach chon o man hinh chua phan cong
			String[] lstidDsVehicleRecord = ParamUtil.getParameterValues(
					request, "idDsVehicleRecord", null);
			String[] lstsoRowDsVehicleRecord = ParamUtil.getParameterValues(
					request, "soRowDsVehicleRecord", null);
			String[] lstnhomDsVehicleRecord = ParamUtil.getParameterValues(
					request, "nhomDsVehicleRecord", null);
			String[] lstnhanHieuDsVehicleRecord = ParamUtil.getParameterValues(
					request, "nhanHieuDsVehicleRecord", null);
			String[] lstsoLoaiDsVehicleRecord = ParamUtil.getParameterValues(
					request, "soLoaiDsVehicleRecord", null);
			String[] lstsoKhungDsVehicleRecord = ParamUtil.getParameterValues(
					request, "soKhungDsVehicleRecord", null);
			String[] lstsoDongCoDsVehicleRecord = ParamUtil.getParameterValues(
					request, "soDongCoDsVehicleRecord", null);
			String[] lsttinhTrangDsVehicleRecord = ParamUtil
					.getParameterValues(request, "tinhTrangDsVehicleRecord",
							null);
			String[] lstsoThamChieuDsVehicleRecord = ParamUtil
					.getParameterValues(request, "soThamChieuDsVehicleRecord",
							null);

			log.info("==lstidDsVehicleRecord==="
					+ ((lstidDsVehicleRecord != null) ? (lstidDsVehicleRecord.length)
							: "==null=="));
			log.info("==lstsoRowDsVehicleRecord====="
					+ ((lstsoRowDsVehicleRecord != null) ? (lstsoRowDsVehicleRecord.length)
							: "==null=="));
			log.info("==lstnhomDsVehicleRecord==="
					+ ((lstnhomDsVehicleRecord != null) ? (lstnhomDsVehicleRecord.length)
							: "==null=="));
			log.info("==lstnhanHieuDsVehicleRecord====="
					+ ((lstnhanHieuDsVehicleRecord != null) ? (lstnhanHieuDsVehicleRecord.length)
							: "==null=="));
			log.info("==lstsoLoaiDsVehicleRecord==="
					+ ((lstsoLoaiDsVehicleRecord != null) ? (lstsoLoaiDsVehicleRecord.length)
							: "==null=="));
			log.info("==lstsoKhungDsVehicleRecord====="
					+ ((lstsoKhungDsVehicleRecord != null) ? (lstsoKhungDsVehicleRecord.length)
							: "==null=="));
			log.info("==lstsoDongCoDsVehicleRecord==="
					+ ((lstsoDongCoDsVehicleRecord != null) ? (lstsoDongCoDsVehicleRecord.length)
							: "==null=="));
			log.info("==lsttinhTrangDsVehicleRecord====="
					+ ((lsttinhTrangDsVehicleRecord != null) ? (lsttinhTrangDsVehicleRecord.length)
							: "==null=="));
			log.info("==lstsoThamChieuDsVehicleRecord====="
					+ ((lstsoThamChieuDsVehicleRecord != null) ? (lstsoThamChieuDsVehicleRecord.length)
							: "==null=="));

			if (lstidDsVehicleRecord != null) {
				for (int i = 0; i < lstidDsVehicleRecord.length; i++) {
					log.info(lstidDsVehicleRecord[i] + " "
							+ lstsoRowDsVehicleRecord[i] + " "
							+ lstnhomDsVehicleRecord[i]);
					log.info(lstnhanHieuDsVehicleRecord[i] + " "
							+ lstsoLoaiDsVehicleRecord[i] + " "
							+ lstsoKhungDsVehicleRecord[i]);
					log.info(lstsoDongCoDsVehicleRecord[i] + " "
							+ lsttinhTrangDsVehicleRecord[i] + " "
							+ lstsoThamChieuDsVehicleRecord[i]);
				}
			}

			List<VehicleRecord> lstVehicleRecord = new ArrayList<VehicleRecord>();
			VehicleRecord veRecord = null;
			if (lstidDsVehicleRecord != null) {
				for (int i = 0; i < lstidDsVehicleRecord.length; i++) {
					veRecord = VehicleRecordLocalServiceUtil
							.getVehicleRecord(ConvertUtil
									.convertToLong(lstidDsVehicleRecord[i]));
					lstVehicleRecord.add(veRecord);
				}
			}

			// Text box
			// confirmedinspectionId or hoac text box nhap
			long idConfirmedInspection = ParamUtil.getLong(request,
					Constants.ID_CONFIRMED_INSPECTION);
			InspectionRecord inspectionRecord = new InspectionRecordImpl();
			inspectionRecord.setConfirmedInspectionId(idConfirmedInspection);
			// Tam thoi, demo face
			// inspectionRecord.setId(CounterLocalServiceUtil.createCounter(InspectionRecord.class));
			inspectionRecord.setInspectionDateFrom(new Date());
			inspectionRecord.setDescription("test");
			inspectionRecord.setInspectionDateTo(new Date());
			inspectionRecord.setInspectionSite("DANGKIEM");
			inspectionRecord.setMarkupControl(0);
			inspectionRecord.setMarkupEmissionTest(0);
			inspectionRecord.setMarkupSafeTest(0);
			inspectionRecord.setConfirmedResult(1);
			inspectionRecord.setInspectionRecordDate(new Date());
			inspectionRecord.setInspectionRecordNo("cv2015");

			long userId = PortalUtil.getUserId(request);

			long phieuXuLyPhuId = ParamUtil.getLong(request,
					Constants.ID_PHIEU_XU_LY_PHU);
			long hoSoThuTucId = ParamUtil.getLong(request,
					Constants.ID_HO_SO_THU_TUC);
			long registerInspectionId = 0;
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
					.findByDossierId(hoSoThuTucId);
			if (registeredInspection != null) {
				registerInspectionId = registeredInspection.getId();
			}
			String dieuKienChuyenDich = "";

			log.info("==hoSoThuTucId==" + hoSoThuTucId + "==phieuXuLyPhuId=="
					+ phieuXuLyPhuId);
			log.info(inspectionRecord);
			log.info("lstInspectionRecordSpec==size==="
					+ lstInspectionRecordSpec.size());
			log.info("lstVehicleRecord==size===" + lstVehicleRecord.size());
			if (lstVehicleRecord.size() > 0) {
				boolean result = nghiepVuBusiness.lapBienBanKiemtra(
						hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
						userId, registerInspectionId, inspectionRecord,
						lstInspectionRecordSpec, lstVehicleRecord);
				log.info("=result=" + result);
			}
		} catch (Exception e) {
			log.error(e);
		}

		// quay nguoc tro lai trang
		response.setRenderParameter(Constants.ID_HO_SO_THU_TUC,
				ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC));
		response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID,
				ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID));
		response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU,
				ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY_PHU));
		response.setRenderParameter(Constants.THANH_PHAN_XU_LY,
				Constants.XU_LY_TLHS);

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	/** TEST demo / nut click o phan dang kiem vien, duoc phan cong */
	public void lapBienBanKetThucKiemTraHienTruong(ActionRequest request,
			ActionResponse response) {
		long idConfirmedInspection = ParamUtil.getLong(request,
				Constants.ID_CONFIRMED_INSPECTION);
		long userId = PortalUtil.getUserId(request);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);

		log.info("==START===lapBienBanKetThucKiemTraHienTruong==");
		log.info("==idConfirmedInspection==" + idConfirmedInspection);
		log.info("==phieuXuLyPhuId=========" + phieuXuLyPhuId);
		log.info("==hoSoThuTucId===========" + hoSoThuTucId);

		// nghiepVuBusiness.lapBienBanKiemtra(hoSoThuTucId, phieuXuLyPhuId,
		// dieuKienChuyenDich, userId, registerInspectionId, inspectionRecord,
		// inspectionRecordSpecs, vehicleRecords);
		// public boolean ketThucKiemTraHienTruong(long hoSoThuTucId, long
		// phieuXuLyPhuId, long userId,List<InspectionRecord> inspectionRecords)
		boolean result = nghiepVuBusiness.ketThucKiemTraHienTruong(
				hoSoThuTucId, phieuXuLyPhuId, userId, idConfirmedInspection);
		log.info("==END===lapBienBanKetThucKiemTraHienTruong==result=="
				+ result);

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	/*
	 * Lanh Dao Phong
	 */
	public void lanhDaoPhongKyXacNhan(ActionRequest request,
			ActionResponse response) {

		String fromDate = ParamUtil.getString(request, "formDate").trim();
		if (ActionKeys.checkFromDate(request, fromDate)) {
			return;
		}

		LanhDaoPhongBusiness lanhDaoPhongBusiness = new LanhDaoPhongBusiness();
		lanhDaoPhongBusiness.lanhDaoPhongKyXacNhan(request, response);

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void lanhDaoPhongKySo(ActionRequest request, ActionResponse response) {
		// log.info("lanhDaoPhongKySo  Minh ");
		String fromDate = ParamUtil.getString(request, "formDate").trim();
		if (ActionKeys.checkFromDate(request, fromDate)) {
			return;
		}
		LanhDaoPhongBusiness lanhDaoPhongBusiness = new LanhDaoPhongBusiness();
		lanhDaoPhongBusiness.lanhDaoPhongKySo(request, response);

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void lanhDaoPhongChuyenBoPhanKyLai(ActionRequest request,
			ActionResponse response) {

		// get data tu form
		String idHoSoThuTuc = ParamUtil.getString(request,
				Constants.ID_HO_SO_THU_TUC);
		String idthuTucHanhChinh = ParamUtil.getString(request,
				Constants.TTHC_THUTUCHANHCHINH_ID);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();
		String dieuKienChuyenDich = ParamUtil.getString(request,
				Constants.DIEU_KIEN_CHUYEN_DICH);

		String ykienXacNhan = ParamUtil.getString(request, "ykienXacNhan")
				.trim();
		String lyDo = ParamUtil.getString(request, "lyDo").trim();
		String listVehicleRecordId = ParamUtil.getString(request,
				"listVehicleRecordId");

		log.info("--ykienXacNhan--" + ykienXacNhan);
		log.info("--lyDo--" + lyDo);

		response.setRenderParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
		response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID,
				idthuTucHanhChinh);
		response.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void lanhDaoPhongYeuCauThamDinhLai(ActionRequest request,
			ActionResponse response) {
		String fromDate = ParamUtil.getString(request, "formDate").trim();
		if (ActionKeys.checkFromDate(request, fromDate)) {
			return;
		}

		long userId = PortalUtil.getUserId(request);
		long hoSoThuTucId = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		long phieuXuLyPhuId = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		String thanhPhanXuLy = ParamUtil.getString(request,
				Constants.THANH_PHAN_XU_LY).trim();
		log.info("===toTiepNhan_ToNghiepVuTraLaiHoSo==="
				+ "========hoSoThuTucId===" + hoSoThuTucId
				+ "===phieuXuLyPhuId===" + phieuXuLyPhuId);
		log.info("===toTiepNhan_ToNghiepVuTraLaiHoSo==="
				+ "========hoSoThuTucId===" + hoSoThuTucId
				+ "===phieuXuLyPhuId===" + phieuXuLyPhuId);
		String dieuKienChuyenDich = ParamUtil.getString(request,
				Constants.DIEU_KIEN_CHUYEN_DICH);

		String ykienXacNhan = ParamUtil.getString(request, "ykienXacNhan")
				.trim();
		String lyDo = ParamUtil.getString(request, "lyDo").trim();
		String lsVehicleRecordId = ParamUtil.getString(request,
				"lsVehicleRecordId");

		log.info("--ykienXacNhan--" + ykienXacNhan);
		log.info("--lyDo--" + lyDo);

		nghiepVuBoSungBusiness.traHoSoThamDinhLai(hoSoThuTucId, phieuXuLyPhuId,
				lsVehicleRecordId, 1, userId, lyDo);

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);

	}

	public void lapBanDangKyKhiThai(ActionRequest request,
			ActionResponse response) {
		LapBanDangKyBusiness lapBanDangKyBusiness = new LapBanDangKyBusiness();
		lapBanDangKyBusiness.lapBanDangKyKhiThai(request, response);
	}

	public void lapBanDangKyAnToan(ActionRequest request,
			ActionResponse response) {
		LapBanDangKyBusiness lapBanDangKyBusiness = new LapBanDangKyBusiness();
		lapBanDangKyBusiness.lapBanDangKyAnToan(request, response);
	}

	public void lapBanDangKyGiamDinh(ActionRequest request,
			ActionResponse response) {
		LapBanDangKyBusiness lapBanDangKyBusiness = new LapBanDangKyBusiness();
		lapBanDangKyBusiness.lapBanDangKyGiamDinh(request, response);
	}

	public void dakiemtra_banDangKyGuiLanhDao(ActionRequest request,
			ActionResponse response) {
		LapBanDangKyBusiness lapBanDangKyBusiness = new LapBanDangKyBusiness();
		lapBanDangKyBusiness.banDangKyGuiLanhDao(request, response);
	}

	public void dakiemtra_huyBienBanKiemTra(ActionRequest request,
			ActionResponse response) {
		LapBanDangKyBusiness lapBanDangKyBusiness = new LapBanDangKyBusiness();
		lapBanDangKyBusiness.huyBienBanKiemTra(request, response);
	}

	public void guiChungChiHangLoat(ActionRequest request,
			ActionResponse response) throws SystemException {
		long userId = PortalUtil.getUserId(request);
		String listVehicleRecordId = ParamUtil.getString(request,
				"listVehicleRecordId");

		long idPhieuXuLyPhu = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		long idHoSoThuTuc = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		int count_size_xe = ParamUtil.getInteger(request, "count_size_xe");
		log.info("guiChungChiHangLoat listVehicleRecordId "
				+ listVehicleRecordId + "  idPhieuXuLyPhu " + idHoSoThuTuc
				+ "  count_size_xe  " + count_size_xe);
		LanhDaoPhongBusiness lanhDaoPhongBusiness = new LanhDaoPhongBusiness();
		List<VehicleRecord> vehicleRecords = lanhDaoPhongBusiness
				.getListVehicleRecord(listVehicleRecordId);
		nghiepVuBusiness.xacNhanHoanThanhNopLePhi(idHoSoThuTuc, idPhieuXuLyPhu,
				vehicleRecords, userId, 4);
		nghiepVuBusiness.capChungChiHangLoat(null, userId, vehicleRecords,
				count_size_xe, idHoSoThuTuc, idPhieuXuLyPhu, request);

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void guiChungChiNhieuHoSo(ActionRequest request,
			ActionResponse response) throws SystemException {
		long userId = PortalUtil.getUserId(request);
		String listVehicleRecordId = ParamUtil.getString(request,
				"listVehicleRecordId");

		long idPhieuXuLyPhu = ParamUtil.getLong(request,
				Constants.ID_PHIEU_XU_LY_PHU);
		long idHoSoThuTuc = ParamUtil.getLong(request,
				Constants.ID_HO_SO_THU_TUC);
		int count_size_xe = ParamUtil.getInteger(request, "count_size_xe");
		log.info("guiChungChiHangLoat listVehicleRecordId "
				+ listVehicleRecordId + "  idPhieuXuLyPhu " + idHoSoThuTuc
				+ "  count_size_xe  " + count_size_xe);
		LanhDaoPhongBusiness lanhDaoPhongBusiness = new LanhDaoPhongBusiness();
		List<VehicleRecord> vehicleRecords = lanhDaoPhongBusiness
				.getListVehicleRecord(listVehicleRecordId);
		nghiepVuBusiness.xacNhanHoanThanhNopLePhi(idHoSoThuTuc, idPhieuXuLyPhu,
				vehicleRecords, userId, 4);
		nghiepVuBusiness.capChungChiHangLoat(null, userId, vehicleRecords,
				count_size_xe, idHoSoThuTuc, idPhieuXuLyPhu, request);

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	/*
	 * Cho CAP GIAY DKKT
	 */

	public void kyXacNhanDangKyHs(ActionRequest actionRequest,
			ActionResponse httpReq) {
		log.info("ACTION------------kyXacNhanDangKyHs----------------");
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest
				.getAttribute(WebKeys.THEME_DISPLAY);
		String listHoSoThuTucId = ParamUtil.getString(actionRequest,
				"listHoSoThuTucId");
		String dieuKienChuyenDich = ParamUtil.getString(actionRequest,
				Constants.DIEU_KIEN_CHUYEN_DICH);

		long userId = PortalUtil.getUserId(actionRequest);

		log.info("kyXacNhanDangKyHs-------------danh sach ho so:----------------"
				+ listHoSoThuTucId);

		RegisteredInspection registeredInspection = null;
		XacNhanDangKyKiemTraObject dangKyKiemTraObject = null;

		LanhDaoPhongBusiness lanhDaoPhongBusiness = new LanhDaoPhongBusiness();
		// List<TthcHoSoThuTuc> allHoSoThuTuc =
		// lanhDaoPhongBusiness.getListHoSoThuTuc(listHoSoThuTucId);
		List<Long> allHoSoThuTuc = lanhDaoPhongBusiness
				.getListHoSoThuTucId(listHoSoThuTucId);
		try {
			if (allHoSoThuTuc != null && allHoSoThuTuc.size() > 0) {
				int size = allHoSoThuTuc.size();
				
				for (int i = 0; i < size; i++) {
					long hoSoThuTucId = GetterUtil.getLong(allHoSoThuTuc.get(i));
					log.info("kyXacNhanDangKyHs-------------tthcHoSoThuTuc.getId():----------------"
							+ hoSoThuTucId);
					
					String urlFile = ParamUtil.getString(actionRequest,
							"fileContent_" + hoSoThuTucId);
					
					// Nhung ho so da ky xong thi set gia tri cho input fileContent_ + allHoSoThuTuc.get(i);
					if(Validator.isNotNull(urlFile)) {
						registeredInspection = RegisteredInspectionLocalServiceUtil
								.findByDossierId(hoSoThuTucId);
						log.info("kyXacNhanDangKyHs-------------urlFile----------------"
								+ urlFile);
						log.info("kyXacNhanDangKyHs-------------registeredInspection----------------"
								+ registeredInspection);
						if (registeredInspection != null) {
							dangKyKiemTraObject = new XacNhanDangKyKiemTraObject();
	
							LanhDaoPhongBusiness.uploadFileChoCapGiayDKKT(urlFile,
									registeredInspection, userId, actionRequest);
	
							dangKyKiemTraObject
									.setRegisteredinspectionId(registeredInspection
											.getId());
							dangKyKiemTraObject
									.setInspectorSignName("InspectorSignName");
							dangKyKiemTraObject
									.setInspectorSignPlace("InspectorSignPlace");
							dangKyKiemTraObject
									.setInspectorSignTitle("InspectorSignTitle");
	
							log.info("kyXacNhanDangKyHs-------------HAMINH----------------");
	
							Boolean kq = new XacNhanDKKTBusiness()
									.xacNhanDangKyKiemTraB2(hoSoThuTucId,
											dieuKienChuyenDich,
											themeDisplay.getUserId(),
											dangKyKiemTraObject, actionRequest,
											registeredInspection);
							log.info("End kyXacNhanDangKyHs----------------------");
	
						}
					}

				}
			}

		} catch (Exception e) {
			log.error(e);
		}

		log.info("-------------end kyXacNhanDangKyHs----------------");

		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}

	public void kyXacNhanDangKyMotHs(ActionRequest actionRequest,
			ActionResponse httpReq) {
		log.info("ACTION-------------vao kyXacNhanDangKyMotHsssssssssss----------------");
		long idHoSoThuTuc = ParamUtil.getLong(actionRequest,
				Constants.ID_HO_SO_THU_TUC);
		String dieuKienChuyenDich = ParamUtil.getString(actionRequest,
				Constants.DIEU_KIEN_CHUYEN_DICH);

		long userId = PortalUtil.getUserId(actionRequest);

		log.info("kyXacNhanDangKyMotHs-------------danh sach ho so:----------------"
				+ idHoSoThuTuc);

		try {
			if (idHoSoThuTuc > 0) {

				String urlFile = ParamUtil.getString(actionRequest,
						"file_content");
				
				if(Validator.isNotNull(urlFile)) {
					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
							.findByDossierId(idHoSoThuTuc);
					log.info("kyXacNhanDangKyMotHs-------------urlFile----------------"
							+ urlFile);
					log.info("kyXacNhanDangKyMotHs-------------registeredInspection----------------"
							+ registeredInspection);
					if (registeredInspection != null) {
						XacNhanDangKyKiemTraObject dangKyKiemTraObject = new XacNhanDangKyKiemTraObject();
	
						LanhDaoPhongBusiness.uploadFileChoCapGiayDKKT(urlFile,
								registeredInspection, userId, actionRequest);
	
						dangKyKiemTraObject
								.setRegisteredinspectionId(registeredInspection
										.getId());
						dangKyKiemTraObject
								.setInspectorSignName("InspectorSignName");
						dangKyKiemTraObject
								.setInspectorSignPlace("InspectorSignPlace");
						dangKyKiemTraObject
								.setInspectorSignTitle("InspectorSignTitle");
	
						log.info("kyXacNhanDangKyMotHs-------------HAMINH----------------");
	
						Boolean kq = new XacNhanDKKTBusiness()
								.xacNhanDangKyKiemTraB2(idHoSoThuTuc,
										dieuKienChuyenDich, userId,
										dangKyKiemTraObject, actionRequest,
										registeredInspection);
						log.info("End kyXacNhanDangKyMotHssssssssss----------------------");
	
					}
				}

			}

		} catch (Exception e) {
			log.error(e);
		}

		log.info("-------------end kyXacNhanDangKyMotHs----------------");

		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}

	/*
	 * Buoc 1. lap bien ban kiem tra
	 */

	public void buocLapBienBanKiemTra(ActionRequest actionRequest,
			ActionResponse response) {

		log.info("==Vao buocLapBienBanKiemTra=");
		// quay nguoc tro lai trang
		response.setRenderParameter(Constants.ID_HO_SO_THU_TUC,
				ParamUtil.getString(actionRequest, Constants.ID_HO_SO_THU_TUC));
		response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID,
				ParamUtil.getString(actionRequest,
						Constants.TTHC_THUTUCHANHCHINH_ID));
		response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU, ParamUtil
				.getString(actionRequest, Constants.ID_PHIEU_XU_LY_PHU));
		response.setRenderParameter(Constants.THANH_PHAN_XU_LY,
				Constants.XU_LY_TLHS);
		response.setRenderParameter(Constants.ID_CONFIRMED_INSPECTION,
				ParamUtil.getString(actionRequest,
						Constants.ID_CONFIRMED_INSPECTION));
		response.setRenderParameter(Constants.ID_VEHICLE_GROUP,
				ParamUtil.getString(actionRequest, Constants.ID_VEHICLE_GROUP));
		
		/*response.setRenderParameter("danhSachVehicleRecord",
				ParamUtil.getString(actionRequest, "danhSachVehicleRecord"));*/
		
		// Du lieu danhSachVehicleRecord qua nhieu, khong truyen tren parameter
		actionRequest.setAttribute("danhSachVehicleRecord", 
				ParamUtil.getString(actionRequest, "danhSachVehicleRecord"));

		response.setRenderParameter("jspPage",
				"/portlet/quanlyhs/thulyhs/dangkiemvien/lapbienbanktra_dangKiemVien.jsp");

		PortletConfig portletConfig = (PortletConfig) actionRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(actionRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);

	}

	public void dakiemtra_suaBienBanKiemTra(ActionRequest actionRequest,
			ActionResponse response) {

		// quay nguoc tro lai trang
		response.setRenderParameter(Constants.ID_HO_SO_THU_TUC,
				ParamUtil.getString(actionRequest, Constants.ID_HO_SO_THU_TUC));
		response.setRenderParameter(Constants.ID_INSPECTION_RECORD, ParamUtil
				.getString(actionRequest, Constants.ID_INSPECTION_RECORD));
		response.setRenderParameter(Constants.TTHC_THUTUCHANHCHINH_ID,
				ParamUtil.getString(actionRequest,
						Constants.TTHC_THUTUCHANHCHINH_ID));
		response.setRenderParameter(Constants.ID_PHIEU_XU_LY_PHU, ParamUtil
				.getString(actionRequest, Constants.ID_PHIEU_XU_LY_PHU));
		response.setRenderParameter(Constants.THANH_PHAN_XU_LY,
				Constants.XU_LY_TLHS);
		response.setRenderParameter(Constants.ID_CONFIRMED_INSPECTION,
				ParamUtil.getString(actionRequest,
						Constants.ID_CONFIRMED_INSPECTION));
		response.setRenderParameter(Constants.ID_VEHICLE_GROUP,
				ParamUtil.getString(actionRequest, Constants.ID_VEHICLE_GROUP));
		response.setRenderParameter(Constants.ID_VEHICLE_GROUP_INITIAL,
				ParamUtil.getString(actionRequest,
						Constants.ID_VEHICLE_GROUP_INITIAL));

		boolean isView = ParamUtil.getBoolean(actionRequest, "isView");
		if (isView) {
			response.setRenderParameter("isView", String.valueOf(isView));
		}

		String backURL = ParamUtil.getString(actionRequest, "backURL");
		if (Validator.isNotNull(backURL)) {
			response.setRenderParameter("backURL", backURL);
		}
		// response.setRenderParameter("danhSachVehicleRecord",
		// ParamUtil.getString(actionRequest, "danhSachVehicleRecord"));

		log.info("==Vao====dakiemtra_suaBienBanKiemTra====ID_HO_SO_THU_TUC=="
				+ ParamUtil
						.getString(actionRequest, Constants.ID_HO_SO_THU_TUC));
		log.info("==Vao====dakiemtra_suaBienBanKiemTra====ID_INSPECTION_RECORD=="
				+ ParamUtil.getString(actionRequest,
						Constants.ID_INSPECTION_RECORD));
		log.info("==Vao====dakiemtra_suaBienBanKiemTra====TTHC_THUTUCHANHCHINH_ID=="
				+ ParamUtil.getString(actionRequest,
						Constants.TTHC_THUTUCHANHCHINH_ID));
		log.info("==Vao====dakiemtra_suaBienBanKiemTra====ID_PHIEU_XU_LY_PHU=="
				+ ParamUtil.getString(actionRequest,
						Constants.ID_PHIEU_XU_LY_PHU));
		log.info("==Vao====dakiemtra_suaBienBanKiemTra====ID_CONFIRMED_INSPECTION=="
				+ ParamUtil.getString(actionRequest,
						Constants.ID_CONFIRMED_INSPECTION));
		log.info("==Vao====dakiemtra_suaBienBanKiemTra====ID_VEHICLE_GROUP=="
				+ ParamUtil
						.getString(actionRequest, Constants.ID_VEHICLE_GROUP));
		log.info("==Vao====dakiemtra_suaBienBanKiemTra====ID_VEHICLE_GROUP_INITIAL=="
				+ ParamUtil.getString(actionRequest,
						Constants.ID_VEHICLE_GROUP_INITIAL));

		response.setRenderParameter("jspPage",
				"/portlet/quanlyhs/thulyhs/dangkiemvien/suabienbanktra_dangKiemVien.jsp");

		PortletConfig portletConfig = (PortletConfig) actionRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(actionRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);

	}

	public void lapBienBanKiemTra(ActionRequest actionRequest, ActionResponse actionResponse) {
		log.info("START==lapBienBanKiemTra");
		LapBienBanKiemTraAction action = new LapBienBanKiemTraAction();
		action.thucHienLapBienBanKiemTra(actionRequest, actionResponse);

		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + 
				SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void suaBienBanKiemTra(ActionRequest actionRequest, ActionResponse actionResponse) {
		log.info("START==suaBienBanKiemTra");
		LapBienBanKiemTraAction action = new LapBienBanKiemTraAction();
		action.thucHienSuaBienBanKiemTra(actionRequest, actionResponse);

		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + 
			SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void phieuPhanCongDKVKiemTra(ActionRequest resourceRequest,
			ActionResponse httpReq) throws SystemException {

		httpReq.setRenderParameter("ngayKiemTra",
				ParamUtil.getString(resourceRequest, "ngayKiemTra"));
		httpReq.setRenderParameter("type", "PhieuPhanCongDKVKiemTra");
		httpReq.setRenderParameter("jspPage",
				"/portlet/report_export_themmoi.jsp");

		PortletConfig portletConfig = (PortletConfig) resourceRequest
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void suaChungChi(ActionRequest request, ActionResponse response) {
		log.info("START==suaChungChi");

		try {
			String fromDate = ParamUtil.getString(request, "formDate").trim();
			if (ActionKeys.checkFromDate(request, fromDate)) {
				return;
			}

			long idHoSoThuTuc = ParamUtil.getLong(request,
					Constants.ID_HO_SO_THU_TUC);
			long idCertificateRecord = ParamUtil.getLong(request,
					Constants.CERTIFICATE_RECORD_ID);
			long canBoSuLy = ParamUtil.getLong(request, Constants.CAN_BO_SU_LY);

			log.info("====Old==idHoSoThuTuc====" + idHoSoThuTuc);
			log.info("====Old==idCertificateRecord====" + idCertificateRecord);
			log.info("====Old==canBoSuLy====" + canBoSuLy);

			if (idHoSoThuTuc > 0 && idCertificateRecord > 0) {
				TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil
						.fetchTthcHoSoThuTuc(idHoSoThuTuc);
				String tenNguoiNhapKhau = ParamUtil.getString(request,
						"tenNguoiNhapKhau");
				String diaChiNguoiNhapKhau = ParamUtil.getString(request,
						"diaChiNguoiNhapKhau");

				CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
						.fetchCertificateRecord(idCertificateRecord);
				String soChungChiCu = "";
				String ngayChungChiCu = "";
				if (certificateRecord != null) {
					soChungChiCu = certificateRecord.getCertificateNumber();
					ngayChungChiCu = FormatData
							.parseDateToTring(certificateRecord.getSignDate());
				}
				// update lai certificateRecord
				certificateRecord.setStampStatus(Constants.AN_CHI_TAM_THU_HOI);
				CertificateRecordLocalServiceUtil
						.updateCertificateRecord(certificateRecord);

				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
						.fetchInspectionRecord(certificateRecord
								.getInspectionReportId());
				List<VehicleRecord> lstVehicleRecords = VehicleRecordLocalServiceUtil
						.findByCertificateRecordId(idCertificateRecord);

				VehicleRecord vehicleRecord = null;
				VehicleGroup vehicleGroup = null;

				if (lstVehicleRecords != null && lstVehicleRecords.size() > 0) {
					vehicleRecord = lstVehicleRecords.get(0);
					vehicleGroup = VehicleGroupLocalServiceUtil
							.fetchVehicleGroup(vehicleRecord
									.getVehicleGroupId());
				}

				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
						.findByDossierId(idHoSoThuTuc);
				if (registeredInspection == null) {
					registeredInspection = new RegisteredInspectionImpl();
				} else if (registeredInspection != null)

				{
					if ((tenNguoiNhapKhau != null)
							&& (diaChiNguoiNhapKhau != null)
							&& (tenNguoiNhapKhau.trim().length() > 0)
							&& (diaChiNguoiNhapKhau.trim().length() > 0)) {
						registeredInspection.setImporterName(tenNguoiNhapKhau);
						registeredInspection
								.setImporterAddress(diaChiNguoiNhapKhau);
						RegisteredInspectionLocalServiceUtil
								.updateRegisteredInspection(registeredInspection);
					}
				}

				long customsDeclarationId = 0;
				CustomsDeclaration customsDeclaration = null;

				if (vehicleRecord != null) {
					long confirmInspectionId = vehicleRecord
							.getConfirmedInspectionId();
					ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
							.fetchConfirmedInspection(confirmInspectionId);

					if (inspectionRecord != null) {
						// sonvh 20161218 capnhat bosung ngay kiem tra hien truong
						Date InspectionRecordDate = DateUtils.stringToDate(ParamUtil
								.getString(request, "InspectionRecordDate"),
								"dd/MM/yyyy HH:mm");
						
						inspectionRecord.setInspectionRecordDate(InspectionRecordDate);
						InspectionRecordLocalServiceUtil
						.updateInspectionRecord(inspectionRecord);
						
						// Cap nhat ngay,so to khai hai quan
						customsDeclarationId = inspectionRecord
								.getCustomsDeclarationid();

						boolean updateCustomsDeclaration = false;
						// soToKhaiHaiQuan ngayToKhaiHaiQuan

						String soToKhaiHHNK = ParamUtil.getString(request,
								"soToKhaiHaiQuan");
						Date ngayToKhaiHHNK = DateUtils.stringToDate(ParamUtil
								.getString(request, "ngayToKhaiHaiQuan"),
								"dd/MM/yyyy HH:mm");

						if (Validator.isNotNull(soToKhaiHHNK)
								&& soToKhaiHHNK.length() > 0) {
							if (customsDeclarationId == 0) {
								customsDeclarationId = CounterLocalServiceUtil
										.increment(CustomsDeclaration.class
												.getName());

								customsDeclaration = CustomsDeclarationLocalServiceUtil
										.createCustomsDeclaration(customsDeclarationId);

								inspectionRecord
										.setCustomsDeclarationid(customsDeclarationId);
								updateCustomsDeclaration = true;
							} else {
								if (confirmedInspection != null
										&& confirmedInspection
												.getCustomsDeclarationId() > 0) {
									customsDeclarationId = CounterLocalServiceUtil
											.increment(CustomsDeclaration.class
													.getName());

									customsDeclaration = CustomsDeclarationLocalServiceUtil
											.createCustomsDeclaration(customsDeclarationId);

									inspectionRecord
											.setCustomsDeclarationid(customsDeclarationId);
									updateCustomsDeclaration = true;

								} else {
									customsDeclaration = CustomsDeclarationLocalServiceUtil
											.getCustomsDeclaration(customsDeclarationId);
								}
							}

							customsDeclaration
									.setImportCustomDeclareNo(soToKhaiHHNK);
							customsDeclaration
									.setImportCustomDeclareDate(ngayToKhaiHHNK);
							customsDeclaration.setHosothutucId(idHoSoThuTuc);
							customsDeclaration.setCustomsResult(String
									.valueOf(1));
							customsDeclaration.setReleaseDate(ngayToKhaiHHNK);

							CustomsDeclarationLocalServiceUtil
									.updateCustomsDeclaration(customsDeclaration);
						} else if (Validator.isNull(soToKhaiHHNK)
								&& customsDeclarationId > 0) {

							inspectionRecord.setCustomsDeclarationid(0);
							updateCustomsDeclaration = true;
						}

						if (updateCustomsDeclaration) {
							InspectionRecordLocalServiceUtil
									.updateInspectionRecord(inspectionRecord);
						}

					}

				}

				String loaiPhuongTienCode = ParamUtil.getString(request,
						"loaiPhuongTienCode");
				String nhanHieuCode = ParamUtil.getString(request,
						"nhanHieuCode");
				String tenThuongMai = ParamUtil.getString(request,
						"tenThuongMai");
				String maKieuLoai = ParamUtil.getString(request, "maKieuLoai");
				String mauSon = ParamUtil.getString(request, "mauSon");
				String soKhung = ParamUtil.getString(request, "soKhung");
				String soDongCo = ParamUtil.getString(request, "soDongCo");
				String namSanXuat = ParamUtil.getString(request, "namSanXuat");
				String nuocSanXuatCode = ParamUtil.getString(request,
						"nuocSanXuatCode");
				String tinhTrangPhuongTien = ParamUtil.getString(request,
						"tinhTrangPhuongTien");
				String ghiChuInVaoGiayChungChi = ParamUtil.getString(request,
						"ghiChuInVaoGiayChungChi");
				String SoBCTNAnToan = ParamUtil.getString(request, "SoBCTNAnToan");
				String SoBCTNKhiThai = ParamUtil.getString(request, "SoBCTNKhiThai");
				String SoBCCOP = ParamUtil.getString(request, "SoBCCOP");
				String SoKetLuanGiamDinh = ParamUtil.getString(request, "SoKetLuanGiamDinh");
				String TieuChuanKhiThai = ParamUtil.getString(request, "TieuChuanKhiThai");
								
				// Cap nhat lai vehicleGroup chung chi goc
				if (vehicleGroup != null){
					vehicleGroup.setCopreportNo(SoBCCOP);
					vehicleGroup.setControlreportNo(SoKetLuanGiamDinh);
					vehicleGroup.setSafetytestreportNo(SoBCTNAnToan);
					vehicleGroup.setEmissiontestreportNo(SoBCTNKhiThai);
					vehicleGroup.setEmissionStandard(TieuChuanKhiThai);
					vehicleGroup.setSynchDate(new Date());
					VehicleGroupLocalServiceUtil.updateVehicleGroup(vehicleGroup);
				}
				
				CertificateRecord insertCertificateRecord = new CertificateRecordImpl();
				if (certificateRecord.getAttachedFile() > 0) {
					insertCertificateRecord.setAttachedFile(certificateRecord
							.getAttachedFile());
				}
				insertCertificateRecord.setCertificateType(certificateRecord
						.getCertificateType());
				insertCertificateRecord.setCommentInWrongCase(certificateRecord
						.getCommentInWrongCase());
				insertCertificateRecord.setCopReportId(certificateRecord
						.getCopReportId());
				insertCertificateRecord.setCreatedDate(new Date());
				insertCertificateRecord.setDigitalIssued(certificateRecord
						.getDigitalIssued());
				insertCertificateRecord.setDivision(certificateRecord
						.getDivision());
				insertCertificateRecord.setDossierId(certificateRecord
						.getDossierId());
				insertCertificateRecord.setEditorName(certificateRecord
						.getEditorName());
				insertCertificateRecord
						.setEmissionTestReportId(certificateRecord
								.getEmissionTestReportId());
				insertCertificateRecord.setInspectionReportId(certificateRecord
						.getInspectionReportId());
				insertCertificateRecord
						.setOldCertificateNumber(certificateRecord
								.getCertificateNumber());
				insertCertificateRecord.setOrganization(certificateRecord
						.getOrganization());
				insertCertificateRecord.setReason(ghiChuInVaoGiayChungChi);
				insertCertificateRecord.setRemarks(ghiChuInVaoGiayChungChi);
				insertCertificateRecord.setSafetyTestReportId(certificateRecord
						.getSafetyTestReportId());
				insertCertificateRecord.setSignDate(certificateRecord
						.getSignDate());
				insertCertificateRecord.setSignName(certificateRecord
						.getSignName());
				insertCertificateRecord.setSignPlace(certificateRecord
						.getSignPlace());
				insertCertificateRecord.setSignTitle(certificateRecord
						.getSignTitle());
				insertCertificateRecord.setStampStatus(certificateRecord
						.getStampStatus());
				
				TaoCauTrucSoDkAcBB taoCauTruc = new TaoCauTrucSoDkAcBB();
				String soChungChiSuaDoi = taoCauTruc.taoSoSuaChungChiGCN(
						certificateRecord.getCertificateNumber(),
						DKConfigurationManager.getIntProp(
								"VR_SIZE_SO_TU_TANG_CHUNG_CHI_GCN", 12));
				long idCertificateRecordNew = CounterLocalServiceUtil
						.increment(CertificateRecord.class.getName());
				insertCertificateRecord.setId(idCertificateRecordNew);
				insertCertificateRecord.setOldCertificateNumber(soChungChiCu);
				insertCertificateRecord.setCertificateNumber(soChungChiSuaDoi);
				insertCertificateRecord
						.setStampStatus(Constants.AN_CHI_CAP_LAI);
				insertCertificateRecord
						.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_0);

				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
						.fetchByInspectorId(PortalUtil.getUserId(request));
				insertCertificateRecord.setSignDate(new Date());
				insertCertificateRecord.setSignName(corporationInspector
						.getInspectorName());
				insertCertificateRecord.setSignPlace(corporationInspector
						.getPlace());
				insertCertificateRecord.setSignTitle(corporationInspector
						.getTitle());

				CertificateRecordLocalServiceUtil
						.addCertificateRecord(insertCertificateRecord);

				List<CertificateRecordSpec> lstCertificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
						.findByIdCertificateRecordAndVehicleTypeCode(
								idCertificateRecord,
								vehicleGroup.getVehicleClass(),
								vehicleGroup.getVehicleType());
				if (lstCertificateRecordSpecs != null
						&& lstCertificateRecordSpecs.size() > 0) {
					for (CertificateRecordSpec certificateRecordSpec : lstCertificateRecordSpecs) {
						String giaTriKiemTra = ParamUtil.getString(
								request,
								"giaTriSuaDoiKetCauVaThongSoKtXe"
										+ certificateRecordSpec
												.getSpecificationCode());
						if (giaTriKiemTra != null
								&& giaTriKiemTra.trim().length() > 0) {
							CertificateRecordSpec certificateRecordSpec2 = new CertificateRecordSpecImpl();
							certificateRecordSpec2
									.setCertificateRecordId(idCertificateRecordNew);
							certificateRecordSpec2
									.setSpecificationCode(certificateRecordSpec
											.getSpecificationCode());
							certificateRecordSpec2
									.setSpecificationName(certificateRecordSpec
											.getSpecificationName());
							certificateRecordSpec2
									.setSpecificationValue(giaTriKiemTra);
							CertificateRecordSpecLocalServiceUtil
									.addCertificateRecordSpec(certificateRecordSpec2);
						}

					}
				}

				// VehicleGroup insertVehicleGroup = vehicleGroup;
				VehicleGroup insertVehicleGroup = new VehicleGroupImpl();
				insertVehicleGroup.setAddressOfProductionPlant(vehicleGroup
						.getAddressOfProductionPlant());
				insertVehicleGroup.setAttachedFile(vehicleGroup
						.getAttachedFile());
				insertVehicleGroup.setCommercialName(vehicleGroup
						.getCommercialName());
				insertVehicleGroup.setControlreportNo(vehicleGroup.getControlreportNo());
				insertVehicleGroup
						.setCopReportId(vehicleGroup.getCopReportId());
				insertVehicleGroup
						.setCopreportNo(vehicleGroup.getCopreportNo());
				insertVehicleGroup.setEmissionStandard(vehicleGroup
						.getEmissionStandard());
				insertVehicleGroup.setEmissionTestReportId(vehicleGroup
						.getEmissionTestReportId());
				insertVehicleGroup.setEmissiontestreportNo(vehicleGroup
						.getEmissiontestreportNo());
				insertVehicleGroup.setEngineType(vehicleGroup.getEngineType());
				insertVehicleGroup.setHoSoThuTucId(vehicleGroup
						.getHoSoThuTucId());
				insertVehicleGroup.setMarkAsVehicle(vehicleGroup
						.getMarkAsVehicle());
				insertVehicleGroup.setModelCode(vehicleGroup.getModelCode());
				insertVehicleGroup.setProductionPlant(vehicleGroup
						.getProductionPlant());
				insertVehicleGroup.setReferenceCertificateNo(vehicleGroup
						.getReferenceCertificateNo());
				insertVehicleGroup.setRegisteredInspectionId(vehicleGroup
						.getRegisteredInspectionId());
				insertVehicleGroup.setRemarks(vehicleGroup.getRemarks());
				insertVehicleGroup.setSafetyTestReportId(vehicleGroup
						.getSafetyTestReportId());
				insertVehicleGroup.setSafetytestreportNo(vehicleGroup
						.getSafetytestreportNo());
				insertVehicleGroup.setSpecificationVersion(vehicleGroup
						.getSpecificationVersion());
				insertVehicleGroup.setTechnicalSpecCode(vehicleGroup
						.getTechnicalSpecCode() + "*");
				insertVehicleGroup.setTradeMark(vehicleGroup.getTradeMark());
				insertVehicleGroup.setVehicleClass(vehicleGroup
						.getVehicleClass());
				insertVehicleGroup
						.setVehicleType(vehicleGroup.getVehicleType());

				long idVehicleGroupNew = CounterLocalServiceUtil
						.increment(VehicleGroup.class.getName());
				insertVehicleGroup.setId(idVehicleGroupNew);
				insertVehicleGroup.setVehicleType(loaiPhuongTienCode);
				insertVehicleGroup.setTradeMark(nhanHieuCode);
				insertVehicleGroup.setCommercialName(tenThuongMai);
				insertVehicleGroup.setModelCode(maKieuLoai);
				insertVehicleGroup = VehicleGroupLocalServiceUtil
						.addVehicleGroup(insertVehicleGroup);
				log.info("====Insert==idVehicleGroupNew===="
						+ idVehicleGroupNew);
				// Insert CertificateCirculars
				nghiepVuBusiness.fillSuaChungChiByCertificateCirculars(
						certificateRecord, idCertificateRecordNew,
						insertVehicleGroup);

				String[] arrayNuocSanXuat = nuocSanXuatCode.split(",");
				if (arrayNuocSanXuat != null && arrayNuocSanXuat.length > 0) {
					for (int i = 0; i < arrayNuocSanXuat.length; i++) {
						ProductionCountry productionCountry = new ProductionCountryImpl();
						long idProductionCountry = CounterLocalServiceUtil
								.increment(ProductionCountry.class.getName());
						productionCountry.setId(idProductionCountry);
						productionCountry.setVehicleGroupId(idVehicleGroupNew);
						productionCountry.setCountryCode(arrayNuocSanXuat[i]);
						ProductionCountryLocalServiceUtil
								.addProductionCountry(productionCountry);
					}
				}

				// InspectionRecord insertInspectionRecord = inspectionRecord;
				suaDoiData(request, idHoSoThuTuc, canBoSuLy, hoSoThuTuc,
						soChungChiCu, ngayChungChiCu, inspectionRecord,
						vehicleRecord, registeredInspection, mauSon, soKhung,
						soDongCo, namSanXuat, tinhTrangPhuongTien,
						soChungChiSuaDoi, idCertificateRecordNew,
						insertVehicleGroup, idVehicleGroupNew);

				// }
			}
		} catch (Exception e) {
			log.error(e);
		}

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	private void suaDoiData(ActionRequest request, long idHoSoThuTuc,
			long canBoSuLy, TthcHoSoThuTuc hoSoThuTuc, String soChungChiCu,
			String ngayChungChiCu, InspectionRecord inspectionRecord,
			VehicleRecord vehicleRecord,
			RegisteredInspection registeredInspection, String mauSon,
			String soKhung, String soDongCo, String namSanXuat,
			String tinhTrangPhuongTien, String soChungChiSuaDoi,
			long idCertificateRecordNew, VehicleGroup insertVehicleGroup,
			long idVehicleGroupNew) throws SystemException, IOException {
		InspectionRecord insertInspectionRecord = new InspectionRecordImpl();
		insertInspectionRecord.setAttachedFile(inspectionRecord
				.getAttachedFile());
		insertInspectionRecord.setConfirmedInspectionId(inspectionRecord
				.getConfirmedInspectionId());
		insertInspectionRecord.setConfirmedResult(inspectionRecord
				.getConfirmedResult());
		insertInspectionRecord.setCorporationId(inspectionRecord
				.getCorporationId());
		insertInspectionRecord
				.setDescription(inspectionRecord.getDescription());
		insertInspectionRecord.setHoSoThuTucId(inspectionRecord
				.getHoSoThuTucId());
		insertInspectionRecord.setInspectionDateFrom(inspectionRecord
				.getInspectionDateFrom());
		insertInspectionRecord.setInspectionDateTo(inspectionRecord
				.getInspectionDateTo());
		insertInspectionRecord.setInspectionMode(inspectionRecord
				.getInspectionMode());
		insertInspectionRecord.setInspectionRecordDate(inspectionRecord
				.getInspectionRecordDate());
		insertInspectionRecord.setInspectionRecordNo(inspectionRecord
				.getInspectionRecordNo());
		insertInspectionRecord.setInspectionSite(inspectionRecord
				.getInspectionSite());
		insertInspectionRecord
				.setInspectorId(inspectionRecord.getInspectorId());
		insertInspectionRecord.setMarkupControl(inspectionRecord
				.getMarkupControl());
		insertInspectionRecord.setMarkupEmissionTest(inspectionRecord
				.getMarkupEmissionTest());
		insertInspectionRecord.setMarkupPaid(inspectionRecord.getMarkupPaid());
		insertInspectionRecord.setMarkupSafeTest(inspectionRecord
				.getMarkupSafeTest());
		insertInspectionRecord.setOtherCosts(inspectionRecord.getOtherCosts());
		insertInspectionRecord.setPhieuXuLyPhuId(inspectionRecord
				.getPhieuXuLyPhuId());
		insertInspectionRecord.setRegisteredInspectionId(inspectionRecord
				.getRegisteredInspectionId());
		insertInspectionRecord.setRemarks(inspectionRecord.getRemarks());
		insertInspectionRecord.setSignDate(inspectionRecord.getSignDate());
		insertInspectionRecord.setSignName(inspectionRecord.getSignName());
		insertInspectionRecord.setSignPlace(inspectionRecord.getSignPlace());
		insertInspectionRecord.setSignTitle(inspectionRecord.getSignTitle());
		insertInspectionRecord.setCustomsDeclarationid(inspectionRecord
				.getCustomsDeclarationid());

		long idInspectionRecordNew = CounterLocalServiceUtil
				.increment(InspectionRecord.class.getName());
		insertInspectionRecord.setId(idInspectionRecordNew);
		insertInspectionRecord = InspectionRecordLocalServiceUtil
				.addInspectionRecord(insertInspectionRecord);
		log.info("====Insert==idInspectionRecordNew===="
				+ idInspectionRecordNew);

		// VehicleRecord insertVehicleRecord = vehicleRecord;
		VehicleRecord insertVehicleRecord = new VehicleRecordImpl();
		copyInsertVehicleRecord(vehicleRecord, mauSon, soKhung, soDongCo,
				namSanXuat, tinhTrangPhuongTien, idCertificateRecordNew,
				idVehicleGroupNew, idInspectionRecordNew, insertVehicleRecord);
		insertVehicleRecord = VehicleRecordLocalServiceUtil
				.addVehicleRecord(insertVehicleRecord);
		// log.info("====Insert==idVehicleRecordNew===="
		// + idVehicleRecordNew);

		// Lam tiep dong goi noi dung ho so....
		nghiepVuBusiness.createAttachFileForCertificate(
				PortalUtil.getUserId(request), request, idCertificateRecordNew,
				insertVehicleRecord, insertVehicleGroup, hoSoThuTuc,
				registeredInspection, soChungChiCu, ngayChungChiCu);

		// Tao moi phieu xu ly phu cho chung chi sua doi

		if (canBoSuLy > 1) {
			long phieuXuLyPhuId = ParamUtil.getLong(request,
					Constants.ID_PHIEU_XU_LY_PHU);
			log.info("====update==phieuXuLyPhuId====" + phieuXuLyPhuId);
			String dieuKienChuyenDich = DKConfigurationManager.getStrProp(
					"dieukiendichchuyen.xac.nhan.sua.chung.chi",
					"xac.nhan.sua.chung.chi");
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(idHoSoThuTuc,
					phieuXuLyPhuId, dieuKienChuyenDich,
					PortalUtil.getUserId(request));

			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
					.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			String ghiChu = "<font color='red'> "
					+ DKConfigurationManager.getStrProp("xacnhanhuythutuc",
							"DK [  ")
					+ FormatData.parseDateToTringType3(new Date()) + " ]";
			ghiChu = ghiChu
					+ DKConfigurationManager.getStrProp("thu.hoi.chung.chi.cu",
							"So chung chi cu") + soChungChiCu;
			ghiChu = ghiChu
					+ "  "
					+ DKConfigurationManager.getStrProp("chung.chi.sua.doi",
							"So chung chi sua doi") + soChungChiSuaDoi;
			ghiChu = ghiChu + " </font>" + "<br>";

			ghiChu = ghiChu + motCuaPhieuXuLyPhu.getGhiChu();
			motCuaPhieuXuLyPhu.setGhiChu(ghiChu);
			MotCuaPhieuXuLyPhuLocalServiceUtil
					.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);

		}
		// if (canBoSuLy < 2) {
		String ghiChu = "<b>"
				+ DKConfigurationManager.getStrProp("CHO_PHE_DUYET",
						"Cho phe duyet") + "</b><br>";
		String trichYeuNoiDung = "<b>"
				+ DKConfigurationManager.getStrProp("chung.chi.sua.doi",
						"chung.chi.sua.doi") + "</b>" + soChungChiSuaDoi
				+ "<br>";
		trichYeuNoiDung = trichYeuNoiDung
				+ "<b>"
				+ DKConfigurationManager.getStrProp("thu.hoi.chung.chi.cu",
						"thu.hoi.chung.chi.cu") + "</b>" + soChungChiCu;

		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = new MotCuaPhieuXuLyPhuImpl();
		long idMotCuaPhieuXuLyPhu = CounterLocalServiceUtil
				.increment(MotCuaPhieuXuLyPhu.class.getName());
		motCuaPhieuXuLyPhu.setId(idMotCuaPhieuXuLyPhu);
		motCuaPhieuXuLyPhu.setPhieuXuLyChinhId(idHoSoThuTuc);
		motCuaPhieuXuLyPhu
				.setNhomPhieuXuLy(Constants.MAU_TRUC_TUYEN_XAC_NHAN_KE_HOACH);
		motCuaPhieuXuLyPhu.setTrichYeuNoiDung(trichYeuNoiDung);
		motCuaPhieuXuLyPhu.setGhiChu(ghiChu);
		motCuaPhieuXuLyPhu
				.setTrangThaiHienTaiId(Constants.CHO_KY_DUYET_CHUNG_CHI);
		motCuaPhieuXuLyPhu.setPhanNhomHoSoId(52);
		motCuaPhieuXuLyPhu.setNguoiTaoPhieu(PortalUtil.getUserId(request));

		MotCuaPhieuXuLyPhuLocalServiceUtil
				.addMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
		log.info("====Insert==idMotCuaPhieuXuLyPhuNew===="
				+ idMotCuaPhieuXuLyPhu);

		insertInspectionRecord.setPhieuXuLyPhuId(idMotCuaPhieuXuLyPhu);
		InspectionRecordLocalServiceUtil
				.updateInspectionRecord(insertInspectionRecord);
	}

	private long copyInsertVehicleRecord(VehicleRecord vehicleRecord,
			String mauSon, String soKhung, String soDongCo, String namSanXuat,
			String tinhTrangPhuongTien, long idCertificateRecordNew,
			long idVehicleGroupNew, long idInspectionRecordNew,
			VehicleRecord insertVehicleRecord) throws SystemException {
		insertVehicleRecord.setCertificateRecordId(vehicleRecord
				.getCertificateRecordId());
		insertVehicleRecord.setChassisNumber(vehicleRecord.getChassisNumber());
		insertVehicleRecord.setCodeNumber(vehicleRecord.getCodeNumber());
		insertVehicleRecord.setConfirmedInspectionId(vehicleRecord
				.getConfirmedInspectionId());
		insertVehicleRecord.setControlRequirementId(vehicleRecord
				.getControlRequirementId());
		insertVehicleRecord.setCurrency(vehicleRecord.getCurrency());
		insertVehicleRecord.setDebitNoteId(vehicleRecord.getDebitNoteId());
		insertVehicleRecord.setDraftCertificateId(vehicleRecord
				.getDraftCertificateId());
		insertVehicleRecord.setEmissionTestRequirementId(vehicleRecord
				.getEmissionTestRequirementId());
		insertVehicleRecord.setEngineNumber(vehicleRecord.getEngineNumber());
		insertVehicleRecord.setInspectionRecordId(vehicleRecord
				.getInspectionRecordId());
		insertVehicleRecord.setMarkAsSample(vehicleRecord.getMarkAsSample());
		insertVehicleRecord.setMarkUpStatus(vehicleRecord.getMarkUpStatus());
		insertVehicleRecord
				.setProductionYear(vehicleRecord.getProductionYear());
		insertVehicleRecord.setRemarks(vehicleRecord.getRemarks());
		insertVehicleRecord.setSafeTestRequirementId(vehicleRecord
				.getSafeTestRequirementId());
		insertVehicleRecord.setSequenceNo(vehicleRecord.getSequenceNo());
		insertVehicleRecord.setUnitPrice(vehicleRecord.getUnitPrice());
		insertVehicleRecord.setVehicleColor(vehicleRecord.getVehicleColor());
		insertVehicleRecord.setVehicleEngineStatus(vehicleRecord
				.getVehicleEngineStatus());
		insertVehicleRecord
				.setVehicleGroupId(vehicleRecord.getVehicleGroupId());

		long idVehicleRecordNew = CounterLocalServiceUtil
				.increment(VehicleRecord.class.getName());
		insertVehicleRecord.setId(idVehicleRecordNew);
		insertVehicleRecord.setVehicleGroupId(idVehicleGroupNew);
		insertVehicleRecord.setCodeNumber(idVehicleRecordNew);
		insertVehicleRecord.setVehicleColor(mauSon);
		insertVehicleRecord.setChassisNumber(soKhung);
		insertVehicleRecord.setEngineNumber(soDongCo);
		insertVehicleRecord.setProductionYear(namSanXuat);
		insertVehicleRecord.setVehicleEngineStatus(tinhTrangPhuongTien);
		insertVehicleRecord.setInspectionRecordId(idInspectionRecordNew);
		insertVehicleRecord.setCertificateRecordId(idCertificateRecordNew);
		return idVehicleRecordNew;
	}
	
	public void suachungchichoduyetlanN(ActionRequest request, ActionResponse response) {
		log.info("START==suachungchichoduyetlanN");

		try {
//			String fromDate = ParamUtil.getString(request, "formDate").trim();
//			if (ActionKeys.checkFromDate(request, fromDate)) {
//				return;
//			}

			long idHoSoThuTuc = ParamUtil.getLong(request,
					Constants.ID_HO_SO_THU_TUC);
			long idCertificateRecord = ParamUtil.getLong(request,
					Constants.CERTIFICATE_RECORD_ID);
			long canBoSuLy = ParamUtil.getLong(request, Constants.CAN_BO_SU_LY);

			log.info("====Old==idHoSoThuTuc====" + idHoSoThuTuc);
			log.info("====Endorsement==idCertificateRecord====" + idCertificateRecord);
			log.info("====Old==canBoSuLy====" + canBoSuLy);

			if (idHoSoThuTuc > 0 && idCertificateRecord > 0) {
				TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil
						.fetchTthcHoSoThuTuc(idHoSoThuTuc);
				String tenNguoiNhapKhau = ParamUtil.getString(request,
						"tenNguoiNhapKhau");
				String diaChiNguoiNhapKhau = ParamUtil.getString(request,
						"diaChiNguoiNhapKhau");

				CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
						.fetchCertificateRecord(idCertificateRecord);
				
				String soChungChiCu = "";
				String ngayChungChiCu = "";
				if (certificateRecord != null) {
					soChungChiCu = certificateRecord.getOldCertificateNumber();
					CertificateRecord oldcertificateRecord = CertificateRecordLocalServiceUtil
							.findByCertificateNumber(soChungChiCu);
					ngayChungChiCu = FormatData
							.parseDateToTring(oldcertificateRecord.getSignDate());
					if (oldcertificateRecord.getStampStatus() == Constants.AN_CHI_HUY){
						return;
					} else {
						// update lai oldcertificateRecord
						oldcertificateRecord.setStampStatus(Constants.AN_CHI_TAM_THU_HOI);
						CertificateRecordLocalServiceUtil
								.updateCertificateRecord(oldcertificateRecord);
					}
				}				

				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
						.fetchInspectionRecord(certificateRecord
								.getInspectionReportId());
				List<VehicleRecord> lstVehicleRecords = VehicleRecordLocalServiceUtil
						.findByCertificateRecordId(idCertificateRecord);

				VehicleRecord vehicleRecord = null;
				VehicleGroup vehicleGroup = null;

				if (lstVehicleRecords != null && lstVehicleRecords.size() > 0) {
					vehicleRecord = lstVehicleRecords.get(0);
					vehicleGroup = VehicleGroupLocalServiceUtil
							.fetchVehicleGroup(vehicleRecord
									.getVehicleGroupId());
				}

				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
						.findByDossierId(idHoSoThuTuc);
				if (registeredInspection == null) {
					registeredInspection = new RegisteredInspectionImpl();
				} else if (registeredInspection != null)

				{
					if ((tenNguoiNhapKhau != null)
							&& (diaChiNguoiNhapKhau != null)
							&& (tenNguoiNhapKhau.trim().length() > 0)
							&& (diaChiNguoiNhapKhau.trim().length() > 0)) {
						registeredInspection.setImporterName(tenNguoiNhapKhau);
						registeredInspection
								.setImporterAddress(diaChiNguoiNhapKhau);
						RegisteredInspectionLocalServiceUtil
								.updateRegisteredInspection(registeredInspection);
					}
				}

				long customsDeclarationId = 0;
				CustomsDeclaration customsDeclaration = null;

				if (vehicleRecord != null) {
					long confirmInspectionId = vehicleRecord
							.getConfirmedInspectionId();
					ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
							.fetchConfirmedInspection(confirmInspectionId);

					if (inspectionRecord != null) {
						// sonvh 20161218 capnhat lai ngay kiem tra hien truong
						Date InspectionRecordDate = DateUtils.stringToDate(ParamUtil
								.getString(request, "InspectionRecordDate"),
								"dd/MM/yyyy HH:mm");
						
						inspectionRecord.setInspectionRecordDate(InspectionRecordDate);
						InspectionRecordLocalServiceUtil
						.updateInspectionRecord(inspectionRecord);
						
						// Cap nhat ngay,so to khai hai quan
						customsDeclarationId = inspectionRecord
								.getCustomsDeclarationid();

						boolean updateCustomsDeclaration = false;
						// soToKhaiHaiQuan ngayToKhaiHaiQuan

						String soToKhaiHHNK = ParamUtil.getString(request,
								"soToKhaiHaiQuan");
						Date ngayToKhaiHHNK = DateUtils.stringToDate(ParamUtil
								.getString(request, "ngayToKhaiHaiQuan"),
								"dd/MM/yyyy HH:mm");

						if (Validator.isNotNull(soToKhaiHHNK)
								&& soToKhaiHHNK.length() > 0) {
							if (customsDeclarationId == 0) {
								customsDeclarationId = CounterLocalServiceUtil
										.increment(CustomsDeclaration.class
												.getName());

								customsDeclaration = CustomsDeclarationLocalServiceUtil
										.createCustomsDeclaration(customsDeclarationId);

								inspectionRecord
										.setCustomsDeclarationid(customsDeclarationId);
								updateCustomsDeclaration = true;
							} else {
								if (confirmedInspection != null
										&& confirmedInspection
												.getCustomsDeclarationId() > 0) {
									customsDeclarationId = CounterLocalServiceUtil
											.increment(CustomsDeclaration.class
													.getName());

									customsDeclaration = CustomsDeclarationLocalServiceUtil
											.createCustomsDeclaration(customsDeclarationId);

									inspectionRecord
											.setCustomsDeclarationid(customsDeclarationId);
									updateCustomsDeclaration = true;

								} else {
									customsDeclaration = CustomsDeclarationLocalServiceUtil
											.getCustomsDeclaration(customsDeclarationId);
								}
							}

							customsDeclaration
									.setImportCustomDeclareNo(soToKhaiHHNK);
							customsDeclaration
									.setImportCustomDeclareDate(ngayToKhaiHHNK);
							customsDeclaration.setHosothutucId(idHoSoThuTuc);
							customsDeclaration.setCustomsResult(String
									.valueOf(1));
							customsDeclaration.setReleaseDate(ngayToKhaiHHNK);

							CustomsDeclarationLocalServiceUtil
									.updateCustomsDeclaration(customsDeclaration);
						} else if (Validator.isNull(soToKhaiHHNK)
								&& customsDeclarationId > 0) {

							inspectionRecord.setCustomsDeclarationid(0);
							updateCustomsDeclaration = true;
						}

						if (updateCustomsDeclaration) {
							InspectionRecordLocalServiceUtil
									.updateInspectionRecord(inspectionRecord);
						}

					}

				}

				String loaiPhuongTienCode = ParamUtil.getString(request,
						"loaiPhuongTienCode");
				String nhanHieuCode = ParamUtil.getString(request,
						"nhanHieuCode");
				String tenThuongMai = ParamUtil.getString(request,
						"tenThuongMai");
				String maKieuLoai = ParamUtil.getString(request, "maKieuLoai");
				String mauSon = ParamUtil.getString(request, "mauSon");
				String soKhung = ParamUtil.getString(request, "soKhung");
				String soDongCo = ParamUtil.getString(request, "soDongCo");
				String namSanXuat = ParamUtil.getString(request, "namSanXuat");
				String nuocSanXuatCode = ParamUtil.getString(request,
						"nuocSanXuatCode");
				String tinhTrangPhuongTien = ParamUtil.getString(request,
						"tinhTrangPhuongTien");
				String ghiChuInVaoGiayChungChi = ParamUtil.getString(request,
						"ghiChuInVaoGiayChungChi");
				String SoBCTNAnToan = ParamUtil.getString(request, "SoBCTNAnToan");
				String SoBCTNKhiThai = ParamUtil.getString(request, "SoBCTNKhiThai");
				String SoBCCOP = ParamUtil.getString(request, "SoBCCOP");
				String SoKetLuanGiamDinh = ParamUtil.getString(request, "SoKetLuanGiamDinh");
				String TieuChuanKhiThai = ParamUtil.getString(request, "TieuChuanKhiThai");
				
				vehicleRecord.setVehicleColor(mauSon);
				vehicleRecord.setChassisNumber(soKhung);
				vehicleRecord.setEngineNumber(soDongCo);
				vehicleRecord.setProductionYear(namSanXuat);
				vehicleRecord.setVehicleEngineStatus(tinhTrangPhuongTien);	
				vehicleRecord.setSynchDate(new Date());
				VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
				
				// Cap nhat lai vehicleGroup chung chi sua cho duyet
				if (vehicleGroup != null){
					vehicleGroup.setVehicleType(loaiPhuongTienCode);
					vehicleGroup.setTradeMark(nhanHieuCode);
					vehicleGroup.setCommercialName(tenThuongMai);
					vehicleGroup.setModelCode(maKieuLoai);
					
					vehicleGroup.setCopreportNo(SoBCCOP);
					vehicleGroup.setControlreportNo(SoKetLuanGiamDinh);
					vehicleGroup.setSafetytestreportNo(SoBCTNAnToan);
					vehicleGroup.setEmissiontestreportNo(SoBCTNKhiThai);
					vehicleGroup.setEmissionStandard(TieuChuanKhiThai);
					vehicleGroup.setSynchDate(new Date());
					VehicleGroupLocalServiceUtil.updateVehicleGroup(vehicleGroup);

					log.info("====Update lan N == VehicleGroup===="
							+ vehicleGroup.getId());
				}
				
				certificateRecord.setReason(ghiChuInVaoGiayChungChi);
				certificateRecord.setRemarks(ghiChuInVaoGiayChungChi);
				certificateRecord.setStampStatus(Constants.AN_CHI_CAP_LAI);
				certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_0);
						
				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
						.fetchByInspectorId(PortalUtil.getUserId(request));
				certificateRecord.setCreatedDate(new Date());
				certificateRecord.setSignDate(new Date());
				certificateRecord.setSignName(corporationInspector
						.getInspectorName());
				certificateRecord.setSignPlace(corporationInspector
						.getPlace());
				certificateRecord.setSignTitle(corporationInspector
						.getTitle());
				CertificateRecordLocalServiceUtil
				.updateCertificateRecord(certificateRecord);

				List<CertificateRecordSpec> lstCertificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
						.findByIdCertificateRecordAndVehicleTypeCode(
								idCertificateRecord,
								vehicleGroup.getVehicleClass(),
								vehicleGroup.getVehicleType());
				if (lstCertificateRecordSpecs != null
						&& lstCertificateRecordSpecs.size() > 0) {
					CertificateRecordLocalServiceUtil.deleteCertificateSpecWithCertificateId(idCertificateRecord);
					
					for (CertificateRecordSpec certificateRecordSpec : lstCertificateRecordSpecs) {
						String giaTriKiemTra = ParamUtil.getString(
								request,
								"giaTriSuaDoiKetCauVaThongSoKtXe"
										+ certificateRecordSpec
												.getSpecificationCode());
						if (giaTriKiemTra != null
								&& giaTriKiemTra.trim().length() > 0) {
							CertificateRecordSpec certificateRecordSpec2 = new CertificateRecordSpecImpl();
							certificateRecordSpec2
									.setCertificateRecordId(idCertificateRecord);
							certificateRecordSpec2
									.setSpecificationCode(certificateRecordSpec
											.getSpecificationCode());
							certificateRecordSpec2
									.setSpecificationName(certificateRecordSpec
											.getSpecificationName());
							certificateRecordSpec2
									.setSpecificationValue(giaTriKiemTra);
							CertificateRecordSpecLocalServiceUtil
									.addCertificateRecordSpec(certificateRecordSpec2);
						}

					}
				}
				
				
				
				ProductionCountryLocalServiceUtil.deleteProductionCountryWithVehicleGroupId(vehicleGroup.getId());

				String[] arrayNuocSanXuat = nuocSanXuatCode.split(",");
				if (arrayNuocSanXuat != null && arrayNuocSanXuat.length > 0) {
					for (int i = 0; i < arrayNuocSanXuat.length; i++) {
						ProductionCountry productionCountry = new ProductionCountryImpl();
						long idProductionCountry = CounterLocalServiceUtil
								.increment(ProductionCountry.class.getName());
						productionCountry.setId(idProductionCountry);
						productionCountry.setVehicleGroupId(vehicleGroup.getId());
						productionCountry.setCountryCode(arrayNuocSanXuat[i]);
						ProductionCountryLocalServiceUtil
								.addProductionCountry(productionCountry);
					}
				}

				long idNoiDungHoSo = certificateRecord.getAttachedFile();	
				TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo(idNoiDungHoSo);
				// Cuoi cung dong goi noi dung ho so....
				nghiepVuBusiness.createAttachFileForCertificate(
						PortalUtil.getUserId(request), request, idCertificateRecord,
						vehicleRecord, vehicleGroup, hoSoThuTuc,
						registeredInspection, soChungChiCu, ngayChungChiCu);
				
			}
		} catch (Exception e) {
			log.error(e);
		}

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	public void xoaChungchiChoDuyetCapLai(ActionRequest request, ActionResponse response) {
		log.info("START==xoaChungchiChoDuyetCapLai");

		try {
			String fromDate = ParamUtil.getString(request, "formDate").trim();
			if (ActionKeys.checkFromDate(request, fromDate)) {
				return;
			}

			long idHoSoThuTuc = ParamUtil.getLong(request,
					Constants.ID_HO_SO_THU_TUC);
			long idCertificateRecord = ParamUtil.getLong(request,
					Constants.CERTIFICATE_RECORD_ID);
			long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);

			log.info("======idHoSoThuTuc====" + idHoSoThuTuc);
			log.info("====Endorsement==idCertificateRecord====" + idCertificateRecord);
			

			if (idHoSoThuTuc > 0 && idCertificateRecord > 0) {
				

				CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
						.fetchCertificateRecord(idCertificateRecord);
				List<VehicleRecord> lstVehicleRecords = VehicleRecordLocalServiceUtil
						.findByCertificateRecordId(idCertificateRecord);
				
				MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
						.fetchMotCuaPhieuXuLyPhu(idPhieuXuLyPhu);
				long doDaiCertificateNumber = DKConfigurationManager.getIntProp(
						"VR_SIZE_SO_TU_TANG_CHUNG_CHI_GCN", 12);
				if ((motCuaPhieuXuLyPhu != null ) && (certificateRecord.getCertificateNumber().trim().length()  > doDaiCertificateNumber) ) {
					MotCuaPhieuXuLyPhuLocalServiceUtil.deleteMotCuaPhieuXuLyPhu(idPhieuXuLyPhu);
					long idNoiDungHoSo = certificateRecord.getAttachedFile();					
					CertificateRecordLocalServiceUtil.deleteCertificateSpecWithCertificateId(idCertificateRecord);
					CertificateRecordLocalServiceUtil.deleteCertificateCircularWithCertificateId(idCertificateRecord);
					CertificateRecordLocalServiceUtil.deleteCertificateRecord(certificateRecord);
					TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo(idNoiDungHoSo);
				} else {
					return;
				}
				VehicleRecord vehicleRecord = null;
				VehicleGroup vehicleGroup = null;
				InspectionRecord inspectionRecord = null;
				
				if (lstVehicleRecords != null && lstVehicleRecords.size() > 0) {
					vehicleRecord = lstVehicleRecords.get(0);
					vehicleGroup = VehicleGroupLocalServiceUtil
							.fetchVehicleGroup(vehicleRecord
									.getVehicleGroupId());
					inspectionRecord = InspectionRecordLocalServiceUtil
							.fetchInspectionRecord(vehicleRecord
									.getInspectionRecordId()); // inspectionRecord sinh ra khi sua chung chi
					InspectionRecordLocalServiceUtil.deleteInspectionRecord(inspectionRecord);				
					VehicleRecordLocalServiceUtil.deleteVehicleRecord(vehicleRecord);
					VehicleGroupLocalServiceUtil.deleteVehicleGroup(vehicleGroup);				
					ProductionCountryLocalServiceUtil.deleteProductionCountryWithVehicleGroupId(vehicleGroup.getId());
				}
				
				
			}
		} catch (Exception e) {
			log.error(e);
		}

		PortletConfig portletConfig = (PortletConfig) request
				.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	private void dongDau(ResourceRequest request, long userId,
			long idPhieuXuLyPhu, long idHoSoThuTuc, String dieuKienChuyenDich,
			VehicleRecord item, String urlFile) {
		try {

			String messageId = functionNghiepVu.getRamdomMessage();
			List<VehicleRecord> liVehicleRecords = new ArrayList<VehicleRecord>();
			liVehicleRecords.add(item);

			TthcNoidungHoSo tthcNoidungHoSo = null;
			CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
					.fetchCertificateRecord(item.getCertificateRecordId());
			if (urlFile.trim().length() > 0) {
				if (certificateRecord != null
						&& certificateRecord.getAttachedFile() > 0) {
					tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil
							.fetchTthcNoidungHoSo(certificateRecord
									.getAttachedFile());
				}
				if (tthcNoidungHoSo != null
						&& tthcNoidungHoSo.getDaCapNhat() == 1) {
					// Khong lam gi ca
				} else {
					long noiLuuTruTaiLieuId = FileKySoUtils.uploadUrlFile(
							urlFile, userId, request);
					if (tthcNoidungHoSo != null && noiLuuTruTaiLieuId > 0) {
						tthcNoidungHoSo.setDaCapNhat(1);
						tthcNoidungHoSo.setTaiLieuDinhKem(noiLuuTruTaiLieuId);
						TthcNoidungHoSoLocalServiceUtil
								.updateTthcNoidungHoSo(tthcNoidungHoSo);
					}
				}
			}
			long doDaiCertificateNumber = DKConfigurationManager.getIntProp(
					"VR_SIZE_SO_TU_TANG_CHUNG_CHI_GCN", 12);
			System.out
					.println("==========certificateRecord.getStampStatus()======"
							+ certificateRecord.getStampStatus());

			if (certificateRecord != null
					&& certificateRecord.getCertificateNumber().trim().length() > doDaiCertificateNumber
					&& ((certificateRecord.getStampStatus() == Constants.AN_CHI_SUA_DOI_CHUA_IN) || (certificateRecord.getStampStatus() == Constants.AN_CHI_SUA_DOI_DA_IN_LIEN_1) )){

				List<CertificateRecord> lstCertificateRecordSuaDoi = new ArrayList<CertificateRecord>();
				lstCertificateRecordSuaDoi.add(certificateRecord);
				String lyDo = "---";
				nghiepVuBusiness.xacNhanSuaDoiGNC(idHoSoThuTuc, idPhieuXuLyPhu,
						dieuKienChuyenDich, userId, lstCertificateRecordSuaDoi,
						1, lyDo, 1, messageId);

				// log.info("----END Message 217-30=====DONG DAU ");
			}

		} catch (Exception e) {
			log.error(e);
		}
	}

	private void checkTrungSoDongCo(ResourceRequest request,
			ResourceResponse response) throws IOException {

		long idHoSoThuTuc = ParamUtil.getLong(request, "idHoSoThuTuc");
		String urlThongBaoTrungSoKhungSoDongCo = CollectionUtils
				.getStringUrlFileThongBaoTrungSoKhungSoDongCo(request,
						idHoSoThuTuc);
		JSONObject json = null;
		json = JSONFactoryUtil.createJSONObject();
		json.put("msg", "success");
		json.put("urlFile", urlThongBaoTrungSoKhungSoDongCo);
		PrintWriter out = response.getWriter();
		out.print(json.toString());
	}
}
