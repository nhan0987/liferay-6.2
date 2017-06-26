<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ include file="/portlet/init.jsp"%>
<%
	//Khong tim kiem phieuXuLyPhu theo doanh nghiep, ho so
	String doanhNghiep = "";

	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) {}
	
	//----------Phan nhom ho so
	String idPhanNhomHoSo = "";
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MAPHANNHOMHOSO);
		if (obj != null) {
			idPhanNhomHoSo = obj.toString();
		} else {
			idPhanNhomHoSo = "";
		}
	}
	
	//----------organizationId
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	
	PortletURL portletUrl = renderResponse.createRenderURL();
	portletUrl.setParameter("jspPage", "/portlet/cauhinhmotcua/thutuchanhchinh/tthc_thuc_tuc_hanh_chinh.jsp");
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, portletUrl, null, null);
	
	TthcThuTucHanhChinh curentThuTucHanhChinh = null;
	List<TthcThuTucHanhChinh> resultsThuTucHanhChinh = null;
	
	long longTotal = 0;
	
	if (organizationId > 0) {
		resultsThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.searchThuTucHanhChinh(mathutuc, tenthutuc, coquanqlttid, linhvucthutucid, searchContainer.getStart(), searchContainer.getEnd());
		
		longTotal = TthcThuTucHanhChinhLocalServiceUtil.countThuTucHanhChinh(mathutuc, tenthutuc, coquanqlttid, linhvucthutucid);
		
		searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
		searchContainer.setResults(resultsThuTucHanhChinh);
	}
	if (resultsThuTucHanhChinh == null) { 
		resultsThuTucHanhChinh = new ArrayList<TthcThuTucHanhChinh>(); 
	}
	
	PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(renderRequest);
	String loadDataBaseMotCua = resourcePrefs.getValue(Constants.LOAD_DATABASE_MOTCUA, "");
%>
<!------------------------- START form ------------------------->
<table class="wd-table table">
	<thead>
		<tr>
			<th><liferay-ui:message key="vn.gt.dk.cauhinhmotcua.stt"/></th>
			<th>Mã thủ tục</th>
			<th>Tên thủ tục</th>
			<th>Thành phần hồ sơ</th>
			<th>Cơ quan quản lý</th>
			<th>Lĩnh vực thủ tục</th>
			<th>Hướng dẫn thực hiện</th>
		</tr>
	</thead>
	<tbody>
	<%
		for (TthcThuTucHanhChinh item : resultsThuTucHanhChinh) {
			int index = 1;
			%>
			<tr>
				<td class="text-center"><%=(index) + searchContainer.getStart()%></td>
				<td class="text-center"><%=item.getMaThuTuc()%></td>
				<td class="text-center"><%=item.getTenThuTuc()%></td>
				<td class="text-center"><%=item.getThanhPhanHoSo()%></td>
				<td class="text-center"><%=item.getCanCuPhapLy()%></td>
				<td class="text-center"><%=item.getLinhVucThuTucId()%></td>
				<td class="text-center"><%=item.getHuongDanThucHien()%></td>
			</tr>
			<%
			index++;
		}
	%>
	</tbody>
</table>
<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />

<!------------------------- End form ------------------------->

<script type="text/javascript">

</script>
