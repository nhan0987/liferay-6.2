<%@page import="vn.dtt.gt.dk.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo"%>
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
	portletUrl.setParameter("jspPage", "/portlet/cauhinhmotcua/thanhphanhoso/tthc_thanhphanhoso.jsp");
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, portletUrl, null, null);
	
	List<TthcThanhPhanHoSo> resultsThanhPhanHoSo = null;
	
	long longTotal = 0;
	
	if (organizationId > 0) {
		resultsThanhPhanHoSo = TthcThanhPhanHoSoLocalServiceUtil.searchTthcThanhPhanHoSo(thutuchanhchinhid, bieumauhosoid, thutuhienthi, loaithanhphan, mautructuyen, sotailieudinhkem, searchContainer.getStart(), searchContainer.getEnd());
		
		longTotal = TthcThanhPhanHoSoLocalServiceUtil.countTthcThanhPhanHoSo(thutuchanhchinhid, bieumauhosoid, thutuhienthi, loaithanhphan, mautructuyen, sotailieudinhkem);
		
		
		searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
		searchContainer.setResults(resultsThanhPhanHoSo);
	}
	if (resultsThanhPhanHoSo == null) { 
		resultsThanhPhanHoSo = new ArrayList<TthcThanhPhanHoSo>(); 
	}
	
	PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(renderRequest);
	String loadDataBaseMotCua = resourcePrefs.getValue(Constants.LOAD_DATABASE_MOTCUA, "");
%>
<!------------------------- START form ------------------------->
<table class="wd-table table">
	<thead>
		<tr>
			<th><liferay-ui:message key="vn.gt.dk.cauhinhmotcua.stt"/></th>
			<th>Thủ tục hành chính</th>
			<th>Biểu mẫu hồ sơ</th>
			<th>Thứ tự hiển thị</th>
			<th>Loại thành phần</th>
			<th>Mã trực tuyến</th>
			<th>Số liệu đính kèm</th>
		</tr>
	</thead>
	<tbody>
	<%
		TthcThuTucHanhChinh tthcThuTucHanhChinh = null;
		TthcBieuMauHoSo tthcBieuMauHoSo = null;
		for (TthcThanhPhanHoSo item : resultsThanhPhanHoSo) {
			
			int index = 1;
			tthcThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(item.getThuTucHanhChinhId());
			tthcBieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.fetchTthcBieuMauHoSo(item.getBieuMauHoSoId());
			%>
			<tr>
				<td class="text-center"><%=(index) + searchContainer.getStart()%></td>
				<td class="text-center"><%=(tthcThuTucHanhChinh != null) ? tthcThuTucHanhChinh.getTenThuTuc() : ""%></td>
				<td class="text-center"><%=(tthcBieuMauHoSo != null) ? tthcBieuMauHoSo.getTenBieuMau() : ""%></td>
				<td class="text-center"><%=item.getThuTuHienThi()%></td>
				<td class="text-center"><%=Validator.isNotNull(item.getLoaiThanhPhan()) ? item.getLoaiThanhPhan() : ""%></td>
				<td class="text-center"><%=Validator.isNotNull(item.getMauTrucTuyen()) ? item.getMauTrucTuyen() : ""%></td>
				<td class="text-center"><%=Validator.isNotNull(item.getSoTaiLieuDinhKem()) ? item.getSoTaiLieuDinhKem() : ""%></td>
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
