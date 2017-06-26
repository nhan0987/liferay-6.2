<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.DaKiemTra"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.DaKiemTraLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ include file="/portlet/init.jsp"%>
<%
HttpSession httpSession = null;
try {
	httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
} catch (Exception es) { }

//-------------- phan nhom ho so
String idPhanNhomHoSo = "";
if (httpSession != null) {
	Object obj = httpSession.getAttribute(Constants.MAPHANNHOMHOSO);
	if (obj != null) {
		idPhanNhomHoSo = obj.toString();
	} else {
		idPhanNhomHoSo = "";
	}
}


String tenPhanNhomHoSo = "";
TthcPhanNhomHoSo tthcPhanNhomHoSo = TthcPhanNhomHoSoLocalServiceUtil.fetchTthcPhanNhomHoSo(ConvertUtil.convertToLong(idPhanNhomHoSo));
if(tthcPhanNhomHoSo != null){
	tenPhanNhomHoSo = tthcPhanNhomHoSo.getTenPhanNhom();
}

//-------------- Organization
long organizationId = 0;
if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
	organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
}
String loaiThuTuc = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
String tenThuTuc = ParamUtil.getString(request, Constants.TEN_THU_TUC);
String soHoSo = ParamUtil.getString(request, Constants.SO_HO_SO);
String doanhNghiep = ParamUtil.getString(request, Constants.DOANH_NGHIEP);
String ngayNopHsFrom = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
String namNhap = ParamUtil.getString(request, Constants.NAM_NHAP);
String soDKKT = ParamUtil.getString(request, Constants.SO_DKKT);

PortletURL portletUrl = renderResponse.createRenderURL();
if (loaiThuTuc != null) {
	portletUrl.setParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
}
if (tenThuTuc != null) {
	portletUrl.setParameter(Constants.TEN_THU_TUC, tenThuTuc);
}
if (soHoSo != null) {
	portletUrl.setParameter(Constants.SO_HO_SO, soHoSo);
}
if (doanhNghiep != null) {
	portletUrl.setParameter(Constants.DOANH_NGHIEP, doanhNghiep);
}
if (ngayNopHsFrom != null) {
	portletUrl.setParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
}
if (ngayNopHsTo != null) {
	portletUrl.setParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
}
if (namNhap != null) {
	portletUrl.setParameter(Constants.NAM_NHAP, namNhap);
}
if (soDKKT != null) {
	portletUrl.setParameter(Constants.SO_DKKT, soDKKT);
}

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, portletUrl, null, "");

List<TthcHoSoThuTuc> results = null;
List<DaKiemTra> resultsDaKiemTras = null;

long longTotal = 0;

if(organizationId > 0) {
	if (Constants.LOAIPHIEUXULY_PHIEU_PHU == tthcPhanNhomHoSo.getLoaiPhieuXuLy()) {
		String liRoleSelected = CommonUtils.checkRole(themeDisplay);
		
		List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findTthcPhanNhomHoSoVaiTroByPhanNhomHoSoAndVaiTroXuLy(ConvertUtil.convertToLong(idPhanNhomHoSo), liRoleSelected);
		String listNhomPhieuXuLy =  CommonUtils.getNhomPhieuXuLy(liTthcPhanNhomHoSoVaiTros);

		//resultsDaKiemTras = DaKiemTraLocalServiceUtil.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(loaiThuTuc, soDKKT,PortalUtil.getUserId(request), listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap), searchContainer.getStart(), searchContainer.getEnd());
		resultsDaKiemTras = DaKiemTraLocalServiceUtil.findByMotCuaPhieuXuLyPhu(loaiThuTuc, soDKKT,PortalUtil.getUserId(request), listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap), searchContainer.getStart(), searchContainer.getEnd());
		//longTotal = DaKiemTraLocalServiceUtil.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(loaiThuTuc, soDKKT, PortalUtil.getUserId(request),listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap));
		longTotal = DaKiemTraLocalServiceUtil.countByMotCuaPhieuXuLyPhu(loaiThuTuc, soDKKT, PortalUtil.getUserId(request),listNhomPhieuXuLy, organizationId, ConvertUtil.convertToLong(idPhanNhomHoSo), tenThuTuc, soHoSo, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, ConvertUtil.convertToInt(namNhap));
		searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
	}
}
if (results == null) { 
	results = new ArrayList<TthcHoSoThuTuc>(); 
}

PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(renderRequest);
String loadDataBaseMotCua = resourcePrefs.getValue(Constants.LOAD_DATABASE_MOTCUA, "");

%>
<aui:form action="" method="POST" name="formPhanCong" id="formPhanCong">
<table class="wd-table table">
	<thead>
		<tr>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.stt" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.maso.biennhan" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.maso" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.ngaynop" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.tendoanhnghiep" /></th>
			<th width="15%"><liferay-ui:message key="vn.gt.dk.qlhs.noidung" /></th>
			<th width="30%"><liferay-ui:message key="vn.gt.dk.qlhs.ghichu" /></th>
			<th>Chọn</th>
		</tr>
	</thead>
	<tbody>
	<%
		if(resultsDaKiemTras!=null&&resultsDaKiemTras.size()>0){
				int index = 1;
				for (DaKiemTra motCuaPhieuXuLyPhu : resultsDaKiemTras) {
					%>
					<tr>
						<td class="text-center"><%= (index++) + searchContainer.getStart() %></td>
						<td class="text-center"><%=motCuaPhieuXuLyPhu.getMaBienNhan() %></td>
						<td class="text-center"><%=motCuaPhieuXuLyPhu.getMaSoHoSo() %></td>
						<td class="text-center"><%=DateUtils.dateToString("dd/MM/yyyy HH:mm", motCuaPhieuXuLyPhu.getNgayGuiHoSo())%></td>
						<td><span class="text-left"><%=motCuaPhieuXuLyPhu.getTenChuHoSo()%></span></td>
						<td class="text-left"><%=motCuaPhieuXuLyPhu.getTrichYeuNoiDung() %></td>
						<td class="text-left"><%=motCuaPhieuXuLyPhu.getGhiChu() %></td>
						<td class="text-center"><input type="checkbox"></td>
					</tr>
					<%
				}
			}	
	%>
	</tbody> 
</table>
<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />

<aui:button-row>
	<button type="button" id="phanCong" class="btnThuLyHS form-control" style="width: 200px;float: left;">Chuyển tổ nghiệp vụ</button>
</aui:button-row>

</aui:form>