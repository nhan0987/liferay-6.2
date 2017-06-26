<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<%

System.out.println("/cauhinhmotcua/chuyendichtrangthai/search_content_chuyen_dich_tt_result.jsp");
//-------------- Organization
long organizationId = 0;
if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
	organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
}


PortletURL portletUrl = renderResponse.createRenderURL();
if (loaiThuTuc != null) {
	portletUrl.setParameter(Constants.LOAI_THU_TUC, loaiThuTuc);
}
if (tenThuTuc != null) {
	portletUrl.setParameter(Constants.TEN_THU_TUC, tenThuTuc);
}
if (dieuKienDichChuyen != null) {
	portletUrl.setParameter("dieuKienDichChuyen", dieuKienDichChuyen);
}
if (loaiConfig != null) {
	portletUrl.setParameter("loaiConfig", loaiConfig);
}

SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, portletUrl, null, "");

List<MotCuaChuyenDichTrangThai> allMotCuaChuyenDichTrangThai = null;

long longTotal = 0;

if(organizationId > 0) {
	allMotCuaChuyenDichTrangThai = MotCuaChuyenDichTrangThaiLocalServiceUtil.findChuyenDichTrangThai(dieuKienDichChuyen, searchContainer.getStart(), searchContainer.getEnd());
	longTotal = MotCuaChuyenDichTrangThaiLocalServiceUtil.countChuyenDichTrangThai(dieuKienDichChuyen);

	searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
	searchContainer.setResults(allMotCuaChuyenDichTrangThai);
}
if (allMotCuaChuyenDichTrangThai == null) { 
	allMotCuaChuyenDichTrangThai = new ArrayList<MotCuaChuyenDichTrangThai>(); 
}
%>
<table class="wd-table table">
	<thead>
		<tr>
			<th>STT</th>
			<th>Trạng thái nguồn</th>
			<th>Trạng thái đích</th>
			<th>Điều kiện dịch chuyển</th>
			<th>Hành động xử lý</th>
			<th>Phân nhóm hồ sơ</th>
			<th>Thủ tục hành chính</th>
		</tr>
	</thead>
	<tbody>
	<%
	
		MotCuaTrangThaiHoSo trangThaiNguon = null;
		MotCuaTrangThaiHoSo trangThaiDich = null;
		TthcPhanNhomHoSo phanNhomHoSo = null;
		TthcThuTucHanhChinh thuTucHanhChinh = null;
		int index = 1;
		for (MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai : allMotCuaChuyenDichTrangThai) {
			trangThaiNguon = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(motCuaChuyenDichTrangThai.getTrangThaiNguonId());
			trangThaiDich = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(motCuaChuyenDichTrangThai.getTrangThaiDichId());
			phanNhomHoSo = TthcPhanNhomHoSoLocalServiceUtil.fetchTthcPhanNhomHoSo(motCuaChuyenDichTrangThai.getPhanNhomHoSoId());
//			thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(motCuaChuyenDichTrangThai.get)
			
			PortletURL editChuyenDichTrangThai = renderResponse.createRenderURL();
			editChuyenDichTrangThai.setParameter("jspPage", "/portlet/cauhinhmotcua/chuyendichtrangthai/chuyen_dich_trang_thai_edit.jsp");
			editChuyenDichTrangThai.setParameter("chuyenDichTrangThaiId", String.valueOf(motCuaChuyenDichTrangThai.getId()));
			%>
			<tr>
				<td class="text-center"><%= (index++) + searchContainer.getStart() %></td>
				<td class="text-center"><%=(trangThaiNguon == null)? "" : trangThaiNguon.getTenTrangThai() %></td>
				<td class="text-center"><%=(trangThaiDich == null)? "" : trangThaiDich.getTenTrangThai() %></td>
				<td class="text-center"><%= motCuaChuyenDichTrangThai.getDieuKienChuyenDich()%></td>
				<td><span class="text-left"><%=motCuaChuyenDichTrangThai.getHanhDongXuLy()%></span></td>
				<td class="text-center"><%=(phanNhomHoSo == null)? "" : phanNhomHoSo.getTenPhanNhom() %></td>
				<td class="text-center"><%="" %></td>
				<td class="text-center"><a href="<%=editChuyenDichTrangThai.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a></td>
			</tr>
			<%
		}
	%>
	</tbody> 
</table>
<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
<br><br><br>
