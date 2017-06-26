<%@page import="java.net.PortUnreachableException"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="vn.dtt.gt.dk.portlet.chungchi.TraCuuChungChiAction"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="vn.dtt.gt.dk.utils.VRNghiepVuUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoConfiguration"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ include file="/portlet/init.jsp"%>



<%
	//-------------- Organization
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	long userId = PortalUtil.getUserId(request);
	CorporationInspector corporationInspectorOnline = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
	
	//Thanh phan ben trai
	String idMotCuaTrangThaiHoSoTab = ParamUtil.getString(request, Constants.ID_MOTCUA_TRANGTHAIHOSO);
	String soDangKiKiemTraTab = ParamUtil.getString(request, Constants.SO_DANGKI_KIEMTRA);
	String ngayCapDangKiFromTab = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_FROM);
	String ngayCapDangKiToTab = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_TO);
	
	String soBienBanKiemTraTab = ParamUtil.getString(request, Constants.SO_BIENBAN_KIEMTRA);
	String ngayKiemTraFromTab = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_FROM);
	String ngayKiemTraToTab = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_TO);
	String donViKiemTraTab = ParamUtil.getString(request, Constants.DON_VI_KIEM_TRA);
	String dangKiemVienKiemTraTab = ParamUtil.getString(request, Constants.ID_DANG_KIEM_VIEN_KIEMTRA);
	
	String soToKhaiHaiQuanTab = ParamUtil.getString(request, Constants.SO_TO_KHAI_HAI_QUAN);
	String ngayToKhaiHaiQuanFromTab = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_FROM);
	String ngayToKhaiHaiQuanToTab = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_TO);
	
	String nguoiNhapKhauTab = ParamUtil.getString(request, Constants.NGUOI_NHAP_KHAU);
	
	String soHoSoTab = ParamUtil.getString(request, Constants.SO_HO_SO);
	String ngayNopHsFromTab = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
	String ngayNopHsToTab = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
	String doiTuongThucHienTab = ParamUtil.getString(request, Constants.DOI_TUONG_THUC_HIEN);
	String loaiThuTucTab = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
	String tenThuTucTab = ParamUtil.getString(request, Constants.TEN_THU_TUC);
	String soInvoiceTab = ParamUtil.getString(request, Constants.SO_INVOICE);	
	
	//thanh phan ben phai
	String idMotCuaTrangThaiXeTab = ParamUtil.getString(request, Constants.TRANG_THAI_CUA_XE);
	String soKhungTab = ParamUtil.getString(request, Constants.SO_KHUNG);
	String soDongCoTab = ParamUtil.getString(request, Constants.SO_DONG_CO);
	String mauSonTab = ParamUtil.getString(request, Constants.MAU_SON);
	String tinhTrangPhuongTienTab = ParamUtil.getString(request, Constants.TINH_TRANG_PHUONG_TIEN);
	String namNhapTab = ParamUtil.getString(request, Constants.NAM_NHAP);
	String thongSoKiThuatPhuongTienTab = ParamUtil.getString(request, Constants.THONGSO_KITHUAT_PHUONGTIEN);
	
%>


<%
	String mvcPath = ParamUtil.getString(request, "mvcPath");
	LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==tabs.jsp==mvcPath==" + mvcPath);
	
	String curTab = ParamUtil.getString(request, SearchContainer.DEFAULT_CUR_PARAM);
	LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==tabs.jsp==cur==" + curTab);
	
	List<String> names = new ArrayList<String>();
	List<String> urls = new ArrayList<String>();
	String value = null;
	
	PortletURL portletURL = renderResponse.createRenderURL();
	
	//trai
	portletURL.setParameter(Constants.ID_MOTCUA_TRANGTHAIHOSO, idMotCuaTrangThaiHoSoTab + "");
	portletURL.setParameter(Constants.SO_DANGKI_KIEMTRA, soDangKiKiemTraTab);
	portletURL.setParameter(Constants.NGAY_CAP_DANG_KI_FROM, ngayCapDangKiFromTab);
	portletURL.setParameter(Constants.NGAY_CAP_DANG_KI_TO, ngayCapDangKiToTab);
	portletURL.setParameter(Constants.SO_BIENBAN_KIEMTRA, soBienBanKiemTraTab);
	portletURL.setParameter(Constants.NGAY_KIEM_TRA_FROM, ngayKiemTraFromTab);
	portletURL.setParameter(Constants.NGAY_KIEM_TRA_TO, ngayKiemTraToTab);
	portletURL.setParameter(Constants.DON_VI_KIEM_TRA, donViKiemTraTab);
	portletURL.setParameter(Constants.ID_DANG_KIEM_VIEN_KIEMTRA, dangKiemVienKiemTraTab);
	portletURL.setParameter(Constants.SO_TO_KHAI_HAI_QUAN, soToKhaiHaiQuanTab);
	portletURL.setParameter(Constants.NGAY_TOKHAI_HAIQUAN_FROM, ngayToKhaiHaiQuanFromTab);
	portletURL.setParameter(Constants.NGAY_TOKHAI_HAIQUAN_TO, ngayToKhaiHaiQuanToTab);
	portletURL.setParameter(Constants.NGUOI_NHAP_KHAU, nguoiNhapKhauTab);
	portletURL.setParameter(Constants.DOI_TUONG_THUC_HIEN, doiTuongThucHienTab);
	portletURL.setParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFromTab);
	portletURL.setParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsToTab);
	portletURL.setParameter(Constants.TEN_THU_TUC, tenThuTucTab);
	portletURL.setParameter(Constants.SO_HO_SO, soHoSoTab);
	portletURL.setParameter(Constants.SO_INVOICE, soInvoiceTab);
	
	//phai
	portletURL.setParameter(Constants.TRANG_THAI_CUA_XE, idMotCuaTrangThaiXeTab + "");
	portletURL.setParameter(Constants.LOAI_THU_TUC, loaiThuTucTab);
	portletURL.setParameter(Constants.SO_KHUNG, soKhungTab);
	portletURL.setParameter(Constants.SO_DONG_CO, soDongCoTab);
	portletURL.setParameter(Constants.MAU_SON, mauSonTab);
	portletURL.setParameter(Constants.TINH_TRANG_PHUONG_TIEN, tinhTrangPhuongTienTab);
	portletURL.setParameter(Constants.NAM_NHAP, namNhapTab);
	portletURL.setParameter(Constants.THONGSO_KITHUAT_PHUONGTIEN, thongSoKiThuatPhuongTienTab);
	
	//index pag cua dsphuongtien
	String pathTab = ParamUtil.getString(request, "pathTab");
	LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==tabs==pathTab====" + pathTab);
	
	//current tab
		portletURL.setParameter("mvcPath", "/portlet/chungchi/search_content_tracuuhoso_thongtinhoso.jsp");
		portletURL.setParameter(Constants.CURRENT_TAB, Constants.TAB_THONGTIN_HOSO);
		
		names.add("thong_tin_ho_so");
		urls.add(portletURL.toString());
		
		portletURL.setParameter("mvcPath", "/portlet/chungchi/search_content_tracuuhoso_dsphuongtien.jsp");
		portletURL.setParameter(Constants.CURRENT_TAB, Constants.TAB_DS_PHUONGTIEN);
		
		
		names.add("danh_sach_phuong_tien");
		urls.add(portletURL.toString());
		
	if (pathTab.contains("search_content_tracuuhoso_thongtinhoso.jsp")) {
		LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==tabs==thongtinhoso==curTab==" + ParamUtil.getString(request, Constants.CUR_THONGTIN_HOSO));
		portletURL.setParameter(Constants.CUR_THONGTIN_HOSO, curTab);
		portletURL.setParameter(Constants.CUR_DS_PHUONGTIEN, SearchContainer.DEFAULT_CUR_PARAM);
				
	} else if (pathTab.contains("search_content_tracuuhoso_dsphuongtien.jsp")) {
		LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==tabs==dsphuongtien==curTab==" + ParamUtil.getString(request, Constants.CUR_DS_PHUONGTIEN));
		portletURL.setParameter(Constants.CUR_DS_PHUONGTIEN, curTab);
		portletURL.setParameter(Constants.CUR_THONGTIN_HOSO, SearchContainer.DEFAULT_CUR_PARAM);		
	}
	
	if (mvcPath.contains("search_content_tracuuhoso_thongtinhoso.jsp")) {
		value = names.get(0);
	} else if (mvcPath.contains("search_content_tracuuhoso_dsphuongtien.jsp")) {
		value = names.get(1);
	} 	
	else {
		if ((corporationInspectorOnline != null) && (corporationInspectorOnline.getSearchVehicle() > 0))
		{
			value = names.get(1); 
		}
		else
		{
			value = names.get(0);
		}
		
	}
	
	LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==tabs.jsp==value==" + value);
	LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==tabs.jsp==urls==size==" + urls.size());
%>

<liferay-ui:tabs names="<%=StringUtil.merge(names)%>" param="topTabs"
	url0="<%=(urls.size() > 0) ? urls.get(0) : null%>"
	url1="<%=(urls.size() > 1) ? urls.get(1) : null%>"
	value="<%=value%>"/>
