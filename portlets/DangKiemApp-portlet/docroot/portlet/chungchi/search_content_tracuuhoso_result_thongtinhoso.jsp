<%@page import="vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TimKiemHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TimKiemHoSo"%>
<%@page import="vn.dtt.gt.dk.portlet.chungchi.TraCuuChungChiAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
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
	
	//Thanh phan ben trai
	
	String idMotCuaTrangThaiHoSoHS = ParamUtil.getString(request, Constants.ID_MOTCUA_TRANGTHAIHOSO); //chua tim dc
	String trangThaiPhieuXuLyHS = ParamUtil.getString(request, Constants.TRANG_THAI_PHIEU_XU_LY);
	String soDangKiKiemTraHS = ParamUtil.getString(request, Constants.SO_DANGKI_KIEMTRA);
	String ngayCapDangKiFromHS = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_FROM);
	String ngayCapDangKiToHS = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_TO);
	
	String soBienBanKiemTraHS = ParamUtil.getString(request, Constants.SO_BIENBAN_KIEMTRA);
	String ngayKiemTraFromHS = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_FROM);
	String ngayKiemTraToHS = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_TO);
	String donViKiemTraHS = ParamUtil.getString(request, Constants.DON_VI_KIEM_TRA);
	String dangKiemVienKiemTraHS = ParamUtil.getString(request, Constants.ID_DANG_KIEM_VIEN_KIEMTRA);
	
	String soToKhaiHaiQuanHS = ParamUtil.getString(request, Constants.SO_TO_KHAI_HAI_QUAN);
	String ngayToKhaiHaiQuanFromHS = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_FROM);
	String ngayToKhaiHaiQuanToHS = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_TO);
	
	String nguoiNhapKhauHS = ParamUtil.getString(request, Constants.NGUOI_NHAP_KHAU);
	
	String soHoSoHS = ParamUtil.getString(request, Constants.SO_HO_SO);
	String ngayNopHsFromHS = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
	String ngayNopHsToHS = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
	String doiTuongThucHienHS = ParamUtil.getString(request, Constants.DOI_TUONG_THUC_HIEN);
	
	String tenThuTucHS = ParamUtil.getString(request, Constants.TEN_THU_TUC);
	String soInvoiceHs = ParamUtil.getString(request, Constants.SO_INVOICE);	
	
	String tinhThanhHS = ParamUtil.getString(request, Constants.TINH_THANH);
	String quanHuyenHS = ParamUtil.getString(request, Constants.QUAN_HUYEN);
	
	//thanh phan ben phai
	long idMotCuaTrangThaiXeHS = ParamUtil.getLong(request, Constants.TRANG_THAI_CUA_XE);
	String loaiThuTucHS = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
	String soKhungHS = ParamUtil.getString(request, Constants.SO_KHUNG);
	String soDongCoHS = ParamUtil.getString(request, Constants.SO_DONG_CO);
	String mauSonHS = ParamUtil.getString(request, Constants.MAU_SON);
	String tinhTrangPhuongTienHS = ParamUtil.getString(request, Constants.TINH_TRANG_PHUONG_TIEN);
	String namNhapHS = ParamUtil.getString(request, Constants.NAM_NHAP);
	
	PortletURL portletUrlHoSo = renderResponse.createRenderURL();
	portletUrlHoSo.setParameter("mvcPath", "/portlet/chungchi/search_content_tracuuhoso_thongtinhoso.jsp");
	portletUrlHoSo.setParameter("pathTab", "/portlet/chungchi/search_content_tracuuhoso_thongtinhoso.jsp");
	portletUrlHoSo.setParameter(SearchContainer.DEFAULT_CUR_PARAM, ParamUtil.getString(request, Constants.CUR_THONGTIN_HOSO));
	
	LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==thongtinhoso.jsp==cur==dangKiemVienKiemTraHS====" + dangKiemVienKiemTraHS);
	LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==thongtinhoso.jsp==cur==" + ParamUtil.getString(request, SearchContainer.DEFAULT_CUR_PARAM));
	//ben trai
	portletUrlHoSo.setParameter(Constants.ID_MOTCUA_TRANGTHAIHOSO, idMotCuaTrangThaiHoSoHS + "");
	if (trangThaiPhieuXuLyHS != null) { portletUrlHoSo.setParameter(Constants.TRANG_THAI_PHIEU_XU_LY, trangThaiPhieuXuLyHS); }
	
	if (soDangKiKiemTraHS != null) { portletUrlHoSo.setParameter(Constants.SO_DANGKI_KIEMTRA, soDangKiKiemTraHS); }
	if (ngayCapDangKiFromHS != null) { portletUrlHoSo.setParameter(Constants.NGAY_CAP_DANG_KI_FROM, ngayCapDangKiFromHS); }
	if (ngayCapDangKiToHS != null) { portletUrlHoSo.setParameter(Constants.NGAY_CAP_DANG_KI_TO, ngayCapDangKiToHS); }
	
	if (soBienBanKiemTraHS != null) { portletUrlHoSo.setParameter(Constants.SO_BIENBAN_KIEMTRA, soBienBanKiemTraHS); }
	if (ngayKiemTraFromHS != null) { portletUrlHoSo.setParameter(Constants.NGAY_KIEM_TRA_FROM, ngayKiemTraFromHS); }
	if (ngayKiemTraToHS != null) { portletUrlHoSo.setParameter(Constants.NGAY_KIEM_TRA_TO, ngayKiemTraToHS); }
	if (donViKiemTraHS != null) { portletUrlHoSo.setParameter(Constants.DON_VI_KIEM_TRA, donViKiemTraHS); }
	if (dangKiemVienKiemTraHS != null) { portletUrlHoSo.setParameter(Constants.ID_DANG_KIEM_VIEN_KIEMTRA, dangKiemVienKiemTraHS); }
	
	if (soToKhaiHaiQuanHS != null) { portletUrlHoSo.setParameter(Constants.SO_TO_KHAI_HAI_QUAN, soToKhaiHaiQuanHS); }
	if (ngayToKhaiHaiQuanFromHS != null) { portletUrlHoSo.setParameter(Constants.NGAY_TOKHAI_HAIQUAN_FROM, ngayToKhaiHaiQuanFromHS); }
	if (ngayToKhaiHaiQuanToHS != null) { portletUrlHoSo.setParameter(Constants.NGAY_TOKHAI_HAIQUAN_TO, ngayToKhaiHaiQuanToHS); }
	
	if (nguoiNhapKhauHS != null) { portletUrlHoSo.setParameter(Constants.NGUOI_NHAP_KHAU, nguoiNhapKhauHS); }
	if (doiTuongThucHienHS != null) { portletUrlHoSo.setParameter(Constants.DOI_TUONG_THUC_HIEN, doiTuongThucHienHS); }
	
	if (ngayNopHsFromHS != null) { portletUrlHoSo.setParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFromHS); }
	if (ngayNopHsToHS != null) { portletUrlHoSo.setParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsToHS); }
	if(soInvoiceHs!=null){ portletUrlHoSo.setParameter(Constants.SO_INVOICE, soInvoiceHs); }
	
	if (tenThuTucHS != null) { portletUrlHoSo.setParameter(Constants.TEN_THU_TUC, tenThuTucHS); }
	if (soHoSoHS != null) { portletUrlHoSo.setParameter(Constants.SO_HO_SO, soHoSoHS); }
	
	if (tinhThanhHS != null) { portletUrlHoSo.setParameter(Constants.TINH_THANH, tinhThanhHS); }
	if (quanHuyenHS != null) { portletUrlHoSo.setParameter(Constants.QUAN_HUYEN, quanHuyenHS); }
	
	//ben phai
	portletUrlHoSo.setParameter(Constants.TRANG_THAI_CUA_XE, idMotCuaTrangThaiXeHS + "");
	portletUrlHoSo.setParameter(Constants.LOAI_THU_TUC, loaiThuTucHS);
	portletUrlHoSo.setParameter(Constants.SO_KHUNG, soKhungHS);
	portletUrlHoSo.setParameter(Constants.SO_DONG_CO, soDongCoHS);
	portletUrlHoSo.setParameter(Constants.MAU_SON, mauSonHS);
	portletUrlHoSo.setParameter(Constants.TINH_TRANG_PHUONG_TIEN, tinhTrangPhuongTienHS);
	portletUrlHoSo.setParameter(Constants.NAM_NHAP, namNhapHS);
	
	
	String cur_Param = ParamUtil.getString(request, Constants.CUR_THONGTIN_HOSO);
	if (cur_Param.length() == 0) {
		cur_Param = SearchContainer.DEFAULT_CUR_PARAM;
	}
	
	SearchContainer<TimKiemHoSo> searchContainerHoSo = new SearchContainer<TimKiemHoSo>(renderRequest, null, null, cur_Param, 5, portletUrlHoSo, null, "");
	List<TimKiemHoSo> lstHoSoThuTuc = null;
	long totalHoSoThuTuc = 0;
	
	if (organizationId > 0) {
		/*lstHoSoThuTuc= TthcHoSoThuTucLocalServiceUtil.searchTraCuuThongTinHoSo("", soDangKiKiemTraHS, ngayCapDangKiFromHS, ngayCapDangKiToHS,
			organizationId, tenThuTucHS, soHoSoHS, ngayNopHsFromHS, ngayNopHsToHS, nguoiNhapKhauHS, searchContainerHoSo.getStart(), searchContainerHoSo.getEnd());
		*/
		ThongTinTimKiemHoSo	thongTinTimKiemHoSo = new ThongTinTimKiemHoSo();
		
		thongTinTimKiemHoSo.setTrangThaiPhieuXuLy(trangThaiPhieuXuLyHS);
		thongTinTimKiemHoSo.setMaSoHoSo(soHoSoHS);
		thongTinTimKiemHoSo.setNgayNopFrom(ngayNopHsFromHS);
		thongTinTimKiemHoSo.setNgayNopTo(ngayNopHsToHS);
		thongTinTimKiemHoSo.setSoDangKiKiemTra(soDangKiKiemTraHS);
		thongTinTimKiemHoSo.setNgayCapDangKiFrom(ngayCapDangKiFromHS);
		thongTinTimKiemHoSo.setNgayCapDangKiTo(ngayCapDangKiToHS);
		thongTinTimKiemHoSo.setSoBienBanKiemTra(soBienBanKiemTraHS);
		thongTinTimKiemHoSo.setNgayKiemTraFrom(ngayKiemTraFromHS);
		thongTinTimKiemHoSo.setNgayKiemTraTo(ngayKiemTraToHS);
		thongTinTimKiemHoSo.setTinhThanh(tinhThanhHS);
		thongTinTimKiemHoSo.setQuanHuyen(quanHuyenHS);
		
		thongTinTimKiemHoSo.setNguoiNhapKhau(nguoiNhapKhauHS);
		thongTinTimKiemHoSo.setDonViKiemTra(donViKiemTraHS);
		thongTinTimKiemHoSo.setDangKiemVienKiemTra(dangKiemVienKiemTraHS);
		thongTinTimKiemHoSo.setSoToKhaiHaiQuan(soToKhaiHaiQuanHS);
		thongTinTimKiemHoSo.setNgayToKhaiHaiQuanFrom(ngayToKhaiHaiQuanFromHS);
		thongTinTimKiemHoSo.setNgayToKhaiHaiQuanTo(ngayToKhaiHaiQuanToHS);
		
		thongTinTimKiemHoSo.setStart(searchContainerHoSo.getStart());
		thongTinTimKiemHoSo.setEnd(searchContainerHoSo.getEnd());
		thongTinTimKiemHoSo.setSoInvoice(soInvoiceHs);
		
		thongTinTimKiemHoSo.setOrganizationId(organizationId);
		thongTinTimKiemHoSo.setThuTucHanhChinhId(tenThuTucHS);
		
		if(idMotCuaTrangThaiHoSoHS!=null&&idMotCuaTrangThaiHoSoHS.length()>0&& Long.valueOf(idMotCuaTrangThaiHoSoHS)>0){
		thongTinTimKiemHoSo.setTrangThaiHoSoId(idMotCuaTrangThaiHoSoHS);
		}
		
		lstHoSoThuTuc= TimKiemHoSoLocalServiceUtil.searchTraCuuThongTinHoSo(thongTinTimKiemHoSo);
			
		//totalHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.countSearchTraCuuThongTinHoSo("", soDangKiKiemTraHS, ngayCapDangKiFromHS, ngayCapDangKiToHS,
			//organizationId, tenThuTucHS, soHoSoHS, ngayNopHsFromHS, ngayNopHsToHS, nguoiNhapKhauHS);
		totalHoSoThuTuc = TimKiemHoSoLocalServiceUtil.countTraCuuThongTinHoSo(thongTinTimKiemHoSo);
		
		searchContainerHoSo.setResults(lstHoSoThuTuc);
		searchContainerHoSo.setTotal(Integer.parseInt(String.valueOf(totalHoSoThuTuc)));
	}
	
	if (lstHoSoThuTuc == null) { lstHoSoThuTuc = new ArrayList<TimKiemHoSo>(); }
%>

<liferay-util:include page='<%="/portlet/chungchi/search_content_tracuuhoso_tabs.jsp"%>' servletContext="<%=application%>" />
<table class="wd-table table">
	<thead>
		<tr>
			<th>STT</th>
			<th>TTHC</th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.maso" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.ngaynop" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.tendoanhnghiep" /></th>
			<th width="25%"><liferay-ui:message key="vn.gt.dk.qlhs.noidung" /></th>
			<th width="20%"><liferay-ui:message key="vn.gt.dk.qlhs.ghichu" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thaotac" /></th>
		</tr>
	</thead>
	<tbody>
	<%
	int index = 1;
	TthcThuTucHanhChinh tthcThuTucHanhChinh = null;
	for (TimKiemHoSo hoSoThuTuc : lstHoSoThuTuc) {
		tthcThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(hoSoThuTuc.getThuTucHanhChinhId());
		PortletURL viewHoSoUrl = renderResponse.createRenderURL();
		viewHoSoUrl.setParameter("jspPage", "/portlet/quanlyhs/hoso_detail.jsp");
		viewHoSoUrl.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(hoSoThuTuc.getId()));		
		viewHoSoUrl.setParameter(Constants.ID_PHIEU_XU_LY_CHINH, String.valueOf(hoSoThuTuc.getId()));
		viewHoSoUrl.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TPHS);
		viewHoSoUrl.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, String.valueOf(tthcThuTucHanhChinh.getId()));
		%>
		<tr>
			<td class="text-center"><%=(index++) + searchContainerHoSo.getStart()%></td>
			<td><span class="text-left"><%=tthcThuTucHanhChinh.getTenThuTuc()%></span></td>
			<td class="text-center"><%=hoSoThuTuc.getMaSoHoSo()%><br><%=hoSoThuTuc.getMaBienNhan() %></td>
			<td><%=ConvertUtil.parsefulldateToString(hoSoThuTuc.getNgayGuiHoSo())%></td>
			<td class="text-center"><%=hoSoThuTuc.getTenChuHoSo() %></td>
			<td><span class="text-left"><%=hoSoThuTuc.getTrichYeuNoiDung()%></span></td>
			<td><span class="text-left"><%=hoSoThuTuc.getTrangThaiHoSo() %></span></td>
			<td class="text-center"><a href="<%=viewHoSoUrl.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a></td>
		</tr>
		<%
	}
	%>
	</tbody> 
</table>
<liferay-ui:search-paginator searchContainer="<%= searchContainerHoSo %>" />
<br><br><br>