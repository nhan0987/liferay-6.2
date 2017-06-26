
package vn.dtt.gt.dk.portlet.chungchi;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.service.CfgTechnicalspecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleCertificateLocalServiceUtil;
import vn.dtt.gt.dk.portlet.DangKiemAction;
import vn.dtt.gt.dk.report.ReportConstant;
import vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;

/**
 * Portlet implementation class TraCuuChungChiAction
 */
public class TraCuuChungChiAction extends DangKiemAction {
	
	private static Log _log = LogFactoryUtil.getLog(TraCuuChungChiAction.class);
	
	public TraCuuChungChiAction() {
	}
	
	public void timKiemChungChi(ActionRequest resourceRequest, ActionResponse httpReq) {
		String loaiThuTuc = ParamUtil.getString(resourceRequest, Constants.LOAI_THU_TUC).trim();
		String thanhPhanXuLy = ParamUtil.getString(resourceRequest, Constants.THANH_PHAN_XU_LY).trim();
		String tenThuTuc = ParamUtil.getString(resourceRequest, Constants.TEN_THU_TUC).trim();
		String soHoSo = ParamUtil.getString(resourceRequest, Constants.SO_HO_SO).trim();
		String ngayNopHsFrom = ParamUtil.getString(resourceRequest, Constants.NGAY_NOP_HO_SO_FROM).trim();
		String ngayNopHsTo = ParamUtil.getString(resourceRequest, Constants.NGAY_NOP_HO_SO_TO).trim();
		String namNhap = ParamUtil.getString(resourceRequest, Constants.NAM_NHAP).trim();
		String doanhNghiep = ParamUtil.getString(resourceRequest, Constants.DOANH_NGHIEP).trim();
		String soChungChi = ParamUtil.getString(resourceRequest, Constants.SO_CHUNG_CHI);
		
		httpReq.setRenderParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
		httpReq.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		httpReq.setRenderParameter(Constants.TEN_THU_TUC, tenThuTuc);
		httpReq.setRenderParameter(Constants.SO_HO_SO, soHoSo);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
		httpReq.setRenderParameter(Constants.NAM_NHAP, namNhap);
		httpReq.setRenderParameter(Constants.DOANH_NGHIEP, doanhNghiep);
		httpReq.setRenderParameter(Constants.SO_CHUNG_CHI, soChungChi);
		
		httpReq.setRenderParameter("jspPage", "/portlet/chungchi/search_content_chungchi.jsp");
		
		PortletConfig portletConfig = (PortletConfig) resourceRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(resourceRequest, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public void timKiemPhuongTienNhapKhau(ActionRequest request, ActionResponse httpReq) {
		
		String loaiThuTuc = ParamUtil.getString(request, Constants.LOAI_THU_TUC).trim();				
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY).trim();
		String tenThuTuc = ParamUtil.getString(request, Constants.TEN_THU_TUC).trim();
		String soHoSo = ParamUtil.getString(request, Constants.SO_HO_SO).trim();
		String ngayNopHsFrom = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM).trim();
		String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO).trim();
		String namNhap = ParamUtil.getString(request, Constants.NAM_NHAP).trim();
		String doanhNghiep = ParamUtil.getString(request, Constants.DOANH_NGHIEP).trim();
		String soChungChi = ParamUtil.getString(request, Constants.SO_CHUNG_CHI);
		
		
		//Thanh phan ben trai
		String trangThaiHoSo = ParamUtil.getString(request, Constants.ID_MOTCUA_TRANGTHAIHOSO);
		
		String soDangKiKiemTra = ParamUtil.getString(request, Constants.SO_DANGKI_KIEMTRA);		
		String ngayCapDangKiFrom = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_FROM);
		String ngayCapDangKiTo = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_TO);
		
		String soBienBanKiemTra = ParamUtil.getString(request, Constants.SO_BIENBAN_KIEMTRA);
		String ngayKiemTraFrom = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_FROM);
		String ngayKiemTraTo = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_TO);
		
		String soToKhaiHaiQuan = ParamUtil.getString(request, Constants.SO_TO_KHAI_HAI_QUAN);
		String ngayToKhaiHaiQuanFrom = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_FROM);
		String ngayToKhaiHaiQuanTo = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_TO);
		
		String masothue = ParamUtil.getString(request, Constants.MASO_THUE);
		String soInvoice = ParamUtil.getString(request, Constants.SO_INVOICE);		
		String donViKiemTra = ParamUtil.getString(request, Constants.DON_VI_KIEM_TRA);
		String dangKiemVienKiemTra = ParamUtil.getString(request, Constants.ID_DANG_KIEM_VIEN_KIEMTRA);		
		String nguoiNhapKhau = ParamUtil.getString(request, Constants.NGUOI_NHAP_KHAU);
		String doiTuongThucHien = ParamUtil.getString(request, Constants.DOI_TUONG_THUC_HIEN);
		
		
		//thanh phan ben phai
		String trangThaiPhieuXuLy = ParamUtil.getString(request, Constants.TRANG_THAI_PHIEU_XU_LY);		
		String trangThaiCuaXe = ParamUtil.getString(request, Constants.TRANG_THAI_CUA_XE);
		
		String soVin = ParamUtil.getString(request, Constants.SO_VIN);
		String soKhung = ParamUtil.getString(request, Constants.SO_KHUNG);
		String soDongCo = ParamUtil.getString(request, Constants.SO_DONG_CO);
		String mauSon = ParamUtil.getString(request, Constants.MAU_SON);
		String tinhTrangPhuongTien = ParamUtil.getString(request, Constants.TINH_TRANG_PHUONG_TIEN);
		String thongSoKiThuatPhuongTien = ParamUtil.getString(request, Constants.THONGSO_KITHUAT_PHUONGTIEN);
		String loaiPhuongTienNK = ParamUtil.getString(request, Constants.LOAI_PHUONG_TIEN_NK);
		String nhanhieu = ParamUtil.getString(request, Constants.NHAN_HIEU);
		String tenthuongmai = ParamUtil.getString(request, Constants.TEN_THUONG_MAI);		
		String makieuloai = ParamUtil.getString(request, Constants.MA_KIEU_LOAI);
		String nuocsanxuat = ParamUtil.getString(request, Constants.NUOC_SAN_XUAT);
		String namSanXuat = ParamUtil.getString(request, Constants.NAM_SAN_XUAT);
		String quanHuyen = ParamUtil.getString(request, Constants.QUAN_HUYEN);
		String tinhThanh = ParamUtil.getString(request, Constants.TINH_THANH);
		
			
		httpReq.setRenderParameter(Constants.LOAI_THU_TUC, loaiThuTuc);		
		httpReq.setRenderParameter(Constants.THANH_PHAN_XU_LY, thanhPhanXuLy);
		httpReq.setRenderParameter(Constants.TEN_THU_TUC, tenThuTuc);
		httpReq.setRenderParameter(Constants.SO_HO_SO, soHoSo);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
		httpReq.setRenderParameter(Constants.NAM_NHAP, namNhap);
		httpReq.setRenderParameter(Constants.DOANH_NGHIEP, doanhNghiep);
		httpReq.setRenderParameter(Constants.SO_CHUNG_CHI, soChungChi);
		
		
				
		//Thanh phan ben trai
		httpReq.setRenderParameter(Constants.ID_MOTCUA_TRANGTHAIHOSO, trangThaiHoSo);
		httpReq.setRenderParameter(Constants.SO_DANGKI_KIEMTRA, soDangKiKiemTra);
		
		httpReq.setRenderParameter(Constants.NGAY_CAP_DANG_KI_FROM, ngayCapDangKiFrom);
		httpReq.setRenderParameter(Constants.NGAY_CAP_DANG_KI_TO, ngayCapDangKiTo);
		
		httpReq.setRenderParameter(Constants.SO_BIENBAN_KIEMTRA, soBienBanKiemTra);
		httpReq.setRenderParameter(Constants.NGAY_KIEM_TRA_FROM, ngayKiemTraFrom);
		httpReq.setRenderParameter(Constants.NGAY_KIEM_TRA_TO, ngayKiemTraTo);
		
	
		
		httpReq.setRenderParameter(Constants.SO_TO_KHAI_HAI_QUAN, soToKhaiHaiQuan);
		httpReq.setRenderParameter(Constants.NGAY_TOKHAI_HAIQUAN_FROM, ngayToKhaiHaiQuanFrom);
		httpReq.setRenderParameter(Constants.NGAY_TOKHAI_HAIQUAN_TO, ngayToKhaiHaiQuanTo);
		
		httpReq.setRenderParameter(Constants.DON_VI_KIEM_TRA, donViKiemTra);
		httpReq.setRenderParameter(Constants.ID_DANG_KIEM_VIEN_KIEMTRA, dangKiemVienKiemTra);
		
		httpReq.setRenderParameter(Constants.NGUOI_NHAP_KHAU, nguoiNhapKhau);
		httpReq.setRenderParameter(Constants.DOI_TUONG_THUC_HIEN, doiTuongThucHien);
		httpReq.setRenderParameter(Constants.TEN_THU_TUC, tenThuTuc);
		httpReq.setRenderParameter(Constants.SO_HO_SO, soHoSo);
		
		//thanh phan ben phai
		httpReq.setRenderParameter(Constants.TRANG_THAI_PHIEU_XU_LY, trangThaiPhieuXuLy);
		httpReq.setRenderParameter(Constants.TRANG_THAI_CUA_XE, trangThaiCuaXe);
		httpReq.setRenderParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
		
		httpReq.setRenderParameter(Constants.SO_VIN, soVin);
		httpReq.setRenderParameter(Constants.SO_KHUNG, soKhung);
		httpReq.setRenderParameter(Constants.SO_DONG_CO, soDongCo);
		httpReq.setRenderParameter(Constants.MAU_SON, mauSon);
		httpReq.setRenderParameter(Constants.TINH_TRANG_PHUONG_TIEN, tinhTrangPhuongTien);
		
		httpReq.setRenderParameter(Constants.LOAI_PHUONG_TIEN_NK, loaiPhuongTienNK);
		httpReq.setRenderParameter(Constants.NHAN_HIEU, nhanhieu);		
		httpReq.setRenderParameter(Constants.TEN_THUONG_MAI, tenthuongmai);
		httpReq.setRenderParameter(Constants.MA_KIEU_LOAI, makieuloai);
		httpReq.setRenderParameter(Constants.NUOC_SAN_XUAT, nuocsanxuat);
		httpReq.setRenderParameter(Constants.NAM_SAN_XUAT, namSanXuat);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
		httpReq.setRenderParameter(Constants.SO_INVOICE, soInvoice);
		httpReq.setRenderParameter(Constants.MASO_THUE, masothue);
		
		httpReq.setRenderParameter(Constants.QUAN_HUYEN, quanHuyen);
		httpReq.setRenderParameter(Constants.TINH_THANH, tinhThanh);
		
		
		httpReq.setRenderParameter("jspPage", "/portlet/chungchi/search_content_tracuu_phuongtien.jsp");
		//_log.info("START==setRenderParameter====done");
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
	
	public void timKiemHoSoVaPhuongTien(ActionRequest request, ActionResponse httpReq) {
		
		//Thanh phan ben trai
		String trangThaiHoSo = ParamUtil.getString(request, Constants.ID_MOTCUA_TRANGTHAIHOSO);
		String soDangKiKiemTra = ParamUtil.getString(request, Constants.SO_DANGKI_KIEMTRA);
		
		String ngayCapDangKiFrom = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_FROM);
		String ngayCapDangKiTo = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_TO);
		
		String soBienBanKiemTra = ParamUtil.getString(request, Constants.SO_BIENBAN_KIEMTRA);
		String ngayKiemTraFrom = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_FROM);
		String ngayKiemTraTo = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_TO);
		
		String soInvoice = ParamUtil.getString(request, Constants.SO_INVOICE);
		
		String donViKiemTra = ParamUtil.getString(request, Constants.DON_VI_KIEM_TRA);
		String ngayToKhaiHaiQuanFrom = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_FROM);
		String ngayToKhaiHaiQuanTo = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_TO);
		String dangKiemVienKiemTra = ParamUtil.getString(request, Constants.ID_DANG_KIEM_VIEN_KIEMTRA);
		String soToKhaiHaiQuan = ParamUtil.getString(request, Constants.SO_TO_KHAI_HAI_QUAN);
		String nguoiNhapKhau = ParamUtil.getString(request, Constants.NGUOI_NHAP_KHAU);
		String doiTuongThucHien = ParamUtil.getString(request, Constants.DOI_TUONG_THUC_HIEN);
		String tenThuTuc = ParamUtil.getString(request, Constants.TEN_THU_TUC);
		String soHoSo = ParamUtil.getString(request, Constants.SO_HO_SO);
		
		//thanh phan ben phai
		String trangThaiPhieuXuLy = ParamUtil.getString(request, Constants.TRANG_THAI_PHIEU_XU_LY);
		
		String trangThaiCuaXe = ParamUtil.getString(request, Constants.TRANG_THAI_CUA_XE);
		String loaiThuTuc = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
		String soKhung = ParamUtil.getString(request, Constants.SO_KHUNG);
		String soDongCo = ParamUtil.getString(request, Constants.SO_DONG_CO);
		String mauSon = ParamUtil.getString(request, Constants.MAU_SON);
		String tinhTrangPhuongTien = ParamUtil.getString(request, Constants.TINH_TRANG_PHUONG_TIEN);
		
		String ngayNopHsFrom = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
		String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
		
		String quanHuyen = ParamUtil.getString(request, Constants.QUAN_HUYEN);
		String tinhThanh = ParamUtil.getString(request, Constants.TINH_THANH);
		String namNhap = ParamUtil.getString(request, Constants.NAM_NHAP);
		
		//Thanh phan ben trai
		httpReq.setRenderParameter(Constants.ID_MOTCUA_TRANGTHAIHOSO, trangThaiHoSo);
		httpReq.setRenderParameter(Constants.SO_DANGKI_KIEMTRA, soDangKiKiemTra);
		
		httpReq.setRenderParameter(Constants.NGAY_CAP_DANG_KI_FROM, ngayCapDangKiFrom);
		httpReq.setRenderParameter(Constants.NGAY_CAP_DANG_KI_TO, ngayCapDangKiTo);
		
		httpReq.setRenderParameter(Constants.SO_BIENBAN_KIEMTRA, soBienBanKiemTra);
		httpReq.setRenderParameter(Constants.NGAY_KIEM_TRA_FROM, ngayKiemTraFrom);
		httpReq.setRenderParameter(Constants.NGAY_KIEM_TRA_TO, ngayKiemTraTo);
		
	
		httpReq.setRenderParameter(Constants.DON_VI_KIEM_TRA, donViKiemTra);
		httpReq.setRenderParameter(Constants.NGAY_TOKHAI_HAIQUAN_FROM, ngayToKhaiHaiQuanFrom);
		httpReq.setRenderParameter(Constants.NGAY_TOKHAI_HAIQUAN_TO, ngayToKhaiHaiQuanTo);
		httpReq.setRenderParameter(Constants.ID_DANG_KIEM_VIEN_KIEMTRA, dangKiemVienKiemTra);
		httpReq.setRenderParameter(Constants.SO_TO_KHAI_HAI_QUAN, soToKhaiHaiQuan);
		httpReq.setRenderParameter(Constants.NGUOI_NHAP_KHAU, nguoiNhapKhau);
		httpReq.setRenderParameter(Constants.DOI_TUONG_THUC_HIEN, doiTuongThucHien);
		httpReq.setRenderParameter(Constants.TEN_THU_TUC, tenThuTuc);
		httpReq.setRenderParameter(Constants.SO_HO_SO, soHoSo);
		
		//thanh phan ben phai
		httpReq.setRenderParameter(Constants.TRANG_THAI_PHIEU_XU_LY, trangThaiPhieuXuLy);
		httpReq.setRenderParameter(Constants.TRANG_THAI_CUA_XE, trangThaiCuaXe);
		httpReq.setRenderParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
		httpReq.setRenderParameter(Constants.SO_KHUNG, soKhung);
		httpReq.setRenderParameter(Constants.SO_DONG_CO, soDongCo);
		httpReq.setRenderParameter(Constants.MAU_SON, mauSon);
		httpReq.setRenderParameter(Constants.TINH_TRANG_PHUONG_TIEN, tinhTrangPhuongTien);
		
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
		httpReq.setRenderParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
		httpReq.setRenderParameter(Constants.SO_INVOICE, soInvoice);
		
		httpReq.setRenderParameter(Constants.QUAN_HUYEN, quanHuyen);
		httpReq.setRenderParameter(Constants.TINH_THANH, tinhThanh);
		httpReq.setRenderParameter(Constants.NAM_NHAP, namNhap);
		
		String currentTab = ParamUtil.getString(request, Constants.CURRENT_TAB);
		if (currentTab.equalsIgnoreCase(Constants.TAB_DS_PHUONGTIEN)) {
			httpReq.setRenderParameter("jspPage", "/portlet/chungchi/search_content_tracuuhoso_dsphuongtien.jsp");
		} else {
			httpReq.setRenderParameter("jspPage", "/portlet/chungchi/search_content_tracuuhoso_thongtinhoso.jsp");
		}
		
		
		
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}

	@Override
	public void serveResource(ResourceRequest request, ResourceResponse response) throws IOException, PortletException {
		String type = ParamUtil.getString(request, "type");
		_log.info("START==serveResource==TYPE==" + type);
		
		if ((type != null) && (type.trim().equals("getTenThuTuc"))) {
			getTenThuTucByCodeDoiTuong(request, response);
		} else if ((type != null) && (type.trim().equals("getDangKiemVienKiemTra"))) {
			getDangKiemVienKiemTraByCodeDoi(request, response);
		} else if (type != null && type.trim().equalsIgnoreCase("findCfgTechnicalspecByVehicleTypeCode")) {
			findCfgTechnicalspecByVehicleTypeCode(request, response);
		} else if (type != null && type.trim().equalsIgnoreCase("findThongSoKiThuatDanhMucByDataGroupId")) {
			findThongSoKiThuatDanhMucByDataGroupId(request, response);
		} else if (type != null && type.trim().equalsIgnoreCase("findQuanHuyenTinhThanh")) {
			findQuanHuyenTinhThanh(request, response);
		} else if (type != null && type.trim().equalsIgnoreCase("findTrangThaiPhieuXuLy")) {
			findTrangThaiPhieuXuLy(request, response);
		} else if (type != null && type.trim().equalsIgnoreCase("findThongSoKyThuatByLoaiPhuongTien")) {
			findThongSoKyThuatByLoaiPhuongTien(request, response);
		} 
	}
	
	public void findTrangThaiPhieuXuLy(ResourceRequest request, ResourceResponse response) {
		try{
		String idMotCuaTrangThai = ParamUtil.getString(request, "idMotCuaTrangThai");
		
		// Process Jason feed
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONArray _trangThai = JSONFactoryUtil.getJSONFactory().createJSONArray();
		
		//
		
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(ConvertUtil.convertToLong(idMotCuaTrangThai));
		
		if(motCuaTrangThaiHoSo != null){
			_trangThai.put(motCuaTrangThaiHoSo.getKieuTrangThai());
		}
		jsonFeed.put("trangThai", _trangThai);
		
		
		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	public void findQuanHuyenTinhThanh(ResourceRequest request, ResourceResponse response) {
		try{
		String portRegionRef = ParamUtil.getString(request, "portRegionRef");
		
		// Process Jason feed
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONArray _name = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray _id = JSONFactoryUtil.getJSONFactory().createJSONArray();
		
		//
		List<DmDataItem> dsPortRegion = DmDataItemLocalServiceUtil.findByDataGroupIdAndLevelAndAlterName(ReportConstant.ADMINISTRATIVE_UNITS, 2, portRegionRef);
		if (dsPortRegion == null) {
			dsPortRegion = new ArrayList<DmDataItem>();
		}
		
		for (DmDataItem item : dsPortRegion) {
			_id.put(item.getCode0());
			_name.put(item.getName());
		}
		
		jsonFeed.put("id", _id);
		jsonFeed.put("name", _name);
		
		PrintWriter out = response.getWriter();
		out.print(jsonFeed.toString());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	private void findThongSoKiThuatDanhMucByDataGroupId(ResourceRequest request, ResourceResponse response) {
		try {
			String dataGroupId = ParamUtil.getString(request, "dataGroupId");
			String alterName = ParamUtil.getString(request, "alterName");
			_log.info("==dataGroupId==" + dataGroupId + "==alterName==" + alterName);
			List<DmDataItem> lstThongSo = DmDataItemLocalServiceUtil.findByDataGroupIdAndAlterName(ConvertUtil.convertToLong(dataGroupId), alterName);
			if (lstThongSo == null) {
				lstThongSo = new ArrayList<DmDataItem>();
			}
			JSONArray array = JSONFactoryUtil.createJSONArray();
			JSONObject obj = null;
			for (DmDataItem item : lstThongSo) {
				obj = JSONFactoryUtil.createJSONObject();
				obj.put("code", item.getCode0());
				obj.put("name", item.getName());
				array.put(obj);
			}
			PrintWriter out = response.getWriter();
			out.print(array.toString());
		} catch (Exception e) {
			_log.error(e);
		}
		
	}

	private void findCfgTechnicalspecByVehicleTypeCode(ResourceRequest request, ResourceResponse response) {
		try {
			String codeLoaiThuTuc = ParamUtil.getString(request, "codeLoaiThuTuc");
			List<CfgTechnicalspec> lst = CfgTechnicalspecLocalServiceUtil.findByLikeVehicleTypeCode(codeLoaiThuTuc, 0, 20);
			if (lst == null) {
				lst = new ArrayList<CfgTechnicalspec>();
			}
			
			JSONArray array = JSONFactoryUtil.createJSONArray();
			JSONObject obj = null;
			
			for (CfgTechnicalspec item : lst) {
				obj = JSONFactoryUtil.createJSONObject();
				obj.put("id", item.getId() + "," + (Validator.isNotNull(item.getDatagroupid()) ? item.getDatagroupid() + "" : "-1"));
				obj.put("specDescription", item.getSpecDescription());
				obj.put("dataGroupId", (Validator.isNotNull(item.getDatagroupid()) ? item.getDatagroupid() + "" : ""));
				array.put(obj);
			}
			PrintWriter out = response.getWriter();
			out.print(array.toString());
		} catch (Exception e) {
			_log.error(e);
		}
		
	}
	
	private void findThongSoKyThuatByLoaiPhuongTien(ResourceRequest request, ResourceResponse response) {
		try {
			String codeLoaiPhuongTien = ParamUtil.getString(request, "loaiPhuongTien");
			List<CfgTechnicalspec> lst = CfgTechnicalspecLocalServiceUtil.findByLikeVehicleTypeCode(codeLoaiPhuongTien, -1, -1);
			if (lst == null) {
				lst = new ArrayList<CfgTechnicalspec>();
			}
			
			JSONArray array = JSONFactoryUtil.createJSONArray();
			JSONObject obj = null;
			
			for (CfgTechnicalspec item : lst) {
				obj = JSONFactoryUtil.createJSONObject();
				obj.put("specCode", item.getSpecificationCode());
				obj.put("specDescription", item.getSpecDescription());
				obj.put("dataGroupId", (Validator.isNotNull(item.getDatagroupid()) ? item.getDatagroupid() + "" : ""));
				array.put(obj);
			}
			PrintWriter out = response.getWriter();
			out.print(array.toString());
		} catch (Exception e) {
			_log.error(e);
		}
		
	}


	private void getDangKiemVienKiemTraByCodeDoi(ResourceRequest request, ResourceResponse response) {
		try {
			String codeDonViKiemTra = ParamUtil.getString(request, "codeDonViKiemTra");
			_log.info("====ResourceRequest==codeDonViKiemTra===" + codeDonViKiemTra);
			if(codeDonViKiemTra.equals("-1")){
				JSONArray array = JSONFactoryUtil.createJSONArray();
				JSONObject obj = null;
				List<CorporationInspector> lstDangKiemVienKt = CorporationInspectorLocalServiceUtil.findDanhSachDangKiemVien(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				if (lstDangKiemVienKt == null) {
					lstDangKiemVienKt = new ArrayList<CorporationInspector>();
				}
				
				for (CorporationInspector item : lstDangKiemVienKt) {
					obj = JSONFactoryUtil.createJSONObject();
					obj.put("id", item.getInspectorid());
					obj.put("name", Validator.isNotNull(item) ? item.getInspectorName() : "---");
					array.put(obj);
				}
				PrintWriter out = response.getWriter();
				out.print(array.toString());
			} else {
				JSONArray array = JSONFactoryUtil.createJSONArray();
				JSONObject obj = null;
				List<CorporationView> lstCorporationViews = CorporationViewLocalServiceUtil.findByDanhSachDangKiemVienTheoDoi(codeDonViKiemTra);
				if (lstCorporationViews == null) {
					lstCorporationViews = new ArrayList<CorporationView>();
				}
				
				for (CorporationView item : lstCorporationViews) {
					CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(item.getInspectorId());
					obj = JSONFactoryUtil.createJSONObject();
					obj.put("id", item.getInspectorId());
					obj.put("name", Validator.isNotNull(corporationInspector) ? corporationInspector.getInspectorName() : "---");
					array.put(obj);
				}
				PrintWriter out = response.getWriter();
				out.print(array.toString());
			}
			
		} catch (Exception e) {
			_log.error(e);
		}
	}

	private void getTenThuTucByCodeDoiTuong(ResourceRequest request, ResourceResponse response) {
		try {
			String codeLoaiThuTuc = ParamUtil.getString(request, "loaiThuTuc");
			
			//List<TthcThuTucHanhChinh> lstTthc = TthcThuTucHanhChinhLocalServiceUtil.findByLinhVuc(Long.parseLong(codeLoaiThuTuc));
			List<TthcThuTucHanhChinh> lstTthc = TthcThuTucHanhChinhLocalServiceUtil.findByLinhVuc(1);
			if (lstTthc == null) {
				lstTthc = new ArrayList<TthcThuTucHanhChinh>();
			}
			
			JSONArray array = JSONFactoryUtil.createJSONArray();
			JSONObject obj = null;
			
			for (TthcThuTucHanhChinh item : lstTthc) {
				obj = JSONFactoryUtil.createJSONObject();
				obj.put("id", item.getId());
				obj.put("name", item.getTenThuTuc());
				array.put(obj);
			}
			PrintWriter out = response.getWriter();
			out.print(array.toString());
		} catch (Exception e) {
			_log.error(e);
		}
	}
	
	public void exportExcelPhuongTienNhapKhau(ActionRequest request, ActionResponse response) 
			throws PortalException, SystemException, IOException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		long organizationId = 0;
		
		if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
			organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
		}
		
		String loaiThuTuc = ParamUtil.getString(request, Constants.LOAI_THU_TUC).trim();				
		String thanhPhanXuLy = ParamUtil.getString(request, Constants.THANH_PHAN_XU_LY).trim();
		String tenThuTuc = ParamUtil.getString(request, Constants.TEN_THU_TUC).trim();
		String soHoSo = ParamUtil.getString(request, Constants.SO_HO_SO).trim();
		String ngayNopHsFrom = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM).trim();
		String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO).trim();
		String namNhap = ParamUtil.getString(request, Constants.NAM_NHAP).trim();
		String doanhNghiep = ParamUtil.getString(request, Constants.DOANH_NGHIEP).trim();
		String soChungChi = ParamUtil.getString(request, Constants.SO_CHUNG_CHI);
		
		//Thanh phan ben trai
		String trangThaiHoSo = ParamUtil.getString(request, Constants.ID_MOTCUA_TRANGTHAIHOSO);
		
		String soDangKiKiemTra = ParamUtil.getString(request, Constants.SO_DANGKI_KIEMTRA);		
		String ngayCapDangKiFrom = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_FROM);
		String ngayCapDangKiTo = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_TO);
		
		String soBienBanKiemTra = ParamUtil.getString(request, Constants.SO_BIENBAN_KIEMTRA);
		String ngayKiemTraFrom = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_FROM);
		String ngayKiemTraTo = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_TO);
		
		String soToKhaiHaiQuan = ParamUtil.getString(request, Constants.SO_TO_KHAI_HAI_QUAN);
		String ngayToKhaiHaiQuanFrom = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_FROM);
		String ngayToKhaiHaiQuanTo = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_TO);
		
		String masothue = ParamUtil.getString(request, Constants.MASO_THUE);
		String soInvoice = ParamUtil.getString(request, Constants.SO_INVOICE);		
		String donViKiemTra = ParamUtil.getString(request, Constants.DON_VI_KIEM_TRA);
		String dangKiemVienKiemTra = ParamUtil.getString(request, Constants.ID_DANG_KIEM_VIEN_KIEMTRA);		
		String nguoiNhapKhau = ParamUtil.getString(request, Constants.NGUOI_NHAP_KHAU);
		String doiTuongThucHien = ParamUtil.getString(request, Constants.DOI_TUONG_THUC_HIEN);
		
		//thanh phan ben phai
		String trangThaiPhieuXuLy = ParamUtil.getString(request, Constants.TRANG_THAI_PHIEU_XU_LY);		
		String trangThaiCuaXe = ParamUtil.getString(request, Constants.TRANG_THAI_CUA_XE);
		
		String soVin = ParamUtil.getString(request, Constants.SO_VIN);
		String soKhung = ParamUtil.getString(request, Constants.SO_KHUNG);
		String soDongCo = ParamUtil.getString(request, Constants.SO_DONG_CO);
		String mauSon = ParamUtil.getString(request, Constants.MAU_SON);
		String tinhTrangPhuongTien = ParamUtil.getString(request, Constants.TINH_TRANG_PHUONG_TIEN);
		String thongSoKiThuatPhuongTien = ParamUtil.getString(request, Constants.THONGSO_KITHUAT_PHUONGTIEN);
		String loaiPhuongTienNK = ParamUtil.getString(request, Constants.LOAI_PHUONG_TIEN_NK);
		String nhanhieu = ParamUtil.getString(request, Constants.NHAN_HIEU);
		String tenthuongmai = ParamUtil.getString(request, Constants.TEN_THUONG_MAI);		
		String makieuloai = ParamUtil.getString(request, Constants.MA_KIEU_LOAI);
		String nuocsanxuat = ParamUtil.getString(request, Constants.NUOC_SAN_XUAT);
		String namSanXuat = ParamUtil.getString(request, Constants.NAM_SAN_XUAT);
		String quanHuyen = ParamUtil.getString(request, Constants.QUAN_HUYEN);
		String tinhThanh = ParamUtil.getString(request, Constants.TINH_THANH);
		
		String vehicleClass = ParamUtil.getString(request, "exportVehicleClass");
		
		tenThuTuc = "";
		
		if("DCX".equalsIgnoreCase(vehicleClass) || "XMY".equalsIgnoreCase(vehicleClass)) {
			tenThuTuc = "1";
		} else if("XCG".equalsIgnoreCase(vehicleClass)) {
			tenThuTuc = "2";
		} else if("XCD".equalsIgnoreCase(vehicleClass)) {
			tenThuTuc = "3";
		} else if("XDD".equalsIgnoreCase(vehicleClass)) {
			tenThuTuc = "4";
		} else if("XBB".equalsIgnoreCase(vehicleClass)) {
			tenThuTuc = "5";
		}
		
		String doiTuong = null;
		if (loaiThuTuc.contains("DCX")
				|| loaiThuTuc.contains("XDD")
				|| loaiThuTuc.contains("XCD")
				|| loaiThuTuc.contains("XCG")
				|| loaiThuTuc.contains("XBB")
				|| loaiThuTuc.contains("XMY"))
		{
			doiTuong = loaiThuTuc;
		}
		
		int start = 0;
		int end = 1000;//TODO:
		
		ThongTinTimKiemHoSo	thongTinTimKiemHoSo = new ThongTinTimKiemHoSo();
		
		thongTinTimKiemHoSo.setLoaiThuTuc(loaiThuTuc);
		thongTinTimKiemHoSo.setMaSoHoSo(soHoSo);
		thongTinTimKiemHoSo.setNgayNopFrom(ngayNopHsFrom);
		thongTinTimKiemHoSo.setNgayNopTo(ngayNopHsTo);
		thongTinTimKiemHoSo.setSoDangKiKiemTra(soDangKiKiemTra);
		thongTinTimKiemHoSo.setNgayCapDangKiFrom(ngayCapDangKiFrom);
		thongTinTimKiemHoSo.setNgayCapDangKiTo(ngayCapDangKiTo);
		thongTinTimKiemHoSo.setSoBienBanKiemTra(soBienBanKiemTra);
		thongTinTimKiemHoSo.setNgayKiemTraFrom(ngayKiemTraFrom);
		thongTinTimKiemHoSo.setNgayKiemTraTo(ngayKiemTraTo);
		thongTinTimKiemHoSo.setTinhThanh(tinhThanh);
		thongTinTimKiemHoSo.setQuanHuyen(quanHuyen);
		
		thongTinTimKiemHoSo.setNguoiNhapKhau(doanhNghiep);
		thongTinTimKiemHoSo.setDonViKiemTra(donViKiemTra);
		thongTinTimKiemHoSo.setDangKiemVienKiemTra(dangKiemVienKiemTra);
		thongTinTimKiemHoSo.setSoToKhaiHaiQuan(soToKhaiHaiQuan);
		thongTinTimKiemHoSo.setNgayToKhaiHaiQuanFrom(ngayToKhaiHaiQuanFrom);
		thongTinTimKiemHoSo.setNgayToKhaiHaiQuanTo(ngayToKhaiHaiQuanTo);
		
		thongTinTimKiemHoSo.setStart(start);
		thongTinTimKiemHoSo.setEnd(end);
		thongTinTimKiemHoSo.setSoInvoice(soInvoice);
		
		thongTinTimKiemHoSo.setOrganizationId(organizationId);
		thongTinTimKiemHoSo.setThuTucHanhChinhId(tenThuTuc);
		
		thongTinTimKiemHoSo.setSoVin(soVin);
		thongTinTimKiemHoSo.setSoKhung(soKhung);
		thongTinTimKiemHoSo.setSoDongCo(soDongCo);
		thongTinTimKiemHoSo.setMauSon(mauSon);
		thongTinTimKiemHoSo.setTinhTrangPhuongTien(tinhTrangPhuongTien);
		thongTinTimKiemHoSo.setThongSoKiThuatPhuongTien(thongSoKiThuatPhuongTien);
		thongTinTimKiemHoSo.setNamSanXuat(namSanXuat);
		thongTinTimKiemHoSo.setLoaiPhuongTienNK(loaiPhuongTienNK);
		thongTinTimKiemHoSo.setNhanhieu(nhanhieu);
		thongTinTimKiemHoSo.setTenThuongMai(tenthuongmai);
		thongTinTimKiemHoSo.setMaKieuLoai(makieuloai);
		thongTinTimKiemHoSo.setNuocSanXuat(nuocsanxuat);
		
		XSSFWorkbook wb = null;
		
		if(Validator.isNotNull(vehicleClass)) {
			List<VehicleCertificate> lstVehicleCertificate = VehicleCertificateLocalServiceUtil
					.findVehicleCertificate(soChungChi, organizationId, tenThuTuc,
							doiTuong, soHoSo, ngayNopHsFrom, ngayNopHsTo,
							doanhNghiep, ConvertUtil.convertToInt(namNhap),
							thongTinTimKiemHoSo, start, end);
			
			wb = TraCuuChungChiUtil.exportExcel(lstVehicleCertificate, vehicleClass);
		}

		if(wb == null) {
			wb = new XSSFWorkbook();
		}
		
		// write it as an excel attachment
		ByteArrayOutputStream outByteStream = new ByteArrayOutputStream();
		wb.write(outByteStream);

		byte[] outArray = outByteStream.toByteArray();

		HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(request);
		HttpServletResponse httpResponse = PortalUtil.getHttpServletResponse(response);
		
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyyMMddHHmm");
		Date now = new Date();
		
		String fileName = vehicleClass + "_" + formatDate.format(now) + ".xlsx";

		httpResponse.setContentType("application/vnd.ms-excel");
		httpResponse.setHeader("Content-Disposition", "attachment;filename=" + fileName);
		httpResponse.setContentLength(outArray.length);

		ServletResponseUtil.sendFile(httpRequest, httpResponse, fileName, outArray, ContentTypes.APPLICATION_VND_MS_EXCEL);

		FileOutputStream output = new FileOutputStream(new File(fileName));

		wb.write(output);
		output.flush();
		output.close();
		
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
}
