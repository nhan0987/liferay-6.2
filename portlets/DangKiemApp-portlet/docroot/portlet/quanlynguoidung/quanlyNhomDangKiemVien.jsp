<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
	CorporationInspector corporationInspector = null;
	List<CorporationTeam> lCorporationTeams = null;
	try {
		corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(user.getUserId());
		if (corporationInspector != null) {
			lCorporationTeams = CorporationTeamLocalServiceUtil.findByCorporationId(corporationInspector.getCorporationId());
		}
	} catch (Exception es) {
		//es.printStackTrace();
	}
	if (lCorporationTeams == null) { lCorporationTeams = new ArrayList<CorporationTeam>(); }
	if (corporationInspector == null) { corporationInspector = new CorporationInspectorImpl(); }
	
	PortletURL urlThemNhomKiemTra =  renderResponse.createRenderURL();
	urlThemNhomKiemTra.setParameter(Constants.CORPORATION_ID, corporationInspector.getCorporationId());
	urlThemNhomKiemTra.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
	urlThemNhomKiemTra.setParameter("jspPage", "/portlet/quanlynguoidung/createCorporationTeam.jsp");
	
	PortletURL urlDangKiemVien =  renderResponse.createRenderURL();
	urlDangKiemVien.setParameter(Constants.CORPORATION_ID, corporationInspector.getCorporationId());
	urlDangKiemVien.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
	urlDangKiemVien.setParameter("jspPage", "/portlet/quanlynguoidung/quanlyDangKiemVien.jsp");
	
	// Ghi actionlog
		String noidungthaotac = "Mở xem Danh sách nhóm đăng kiểm viên thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
		String tenmanhinhdaidien = "Danh sách nhóm đăng kiểm viên";
		String importername = "";
		String inspectorname = user.getScreenName();
		long inspectorid = user.getUserId();
		QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);


%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<button type="button" style="margin-bottom: 8px; margin-top: 8px;" class="fa-right bt btxanhduong btn btn-default" onclick="javascript: window.location = '<%=urlThemNhomKiemTra%>'">
			<liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.searchcontent.themnhomkiemtra"/>
		</button>
		<table class="wd-table table">
			<caption style = "font-size: 13px;color:black;"><b><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.searchcontent.danhsachnhomdangkiemvien"/></b></caption>
			<thead>
				<tr>
					<th style="width: 8%;">STT</th>
					<th><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.searchcontent.tennhom"/></th>
					<th style="width: 30%;"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.searchcontent.dangkiemvienchinh"/></th>
					<th style="width: 15%;"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.searchcontent.thaotac"/></th>
				</tr>
			</thead>
			<tbody>
				<%
				int index = 1;
				for (CorporationTeam corporationTeam : lCorporationTeams) {
					PortletURL editNhomKiemTra =  renderResponse.createRenderURL();
					editNhomKiemTra.setParameter(Constants.CORPORATION_ID, corporationInspector.getCorporationId());
					editNhomKiemTra.setParameter("jspPage", "/portlet/quanlynguoidung/createCorporationTeam.jsp");
					editNhomKiemTra.setParameter(Constants.INSPECTOR_TEAM, String.valueOf(corporationTeam.getId()));
					editNhomKiemTra.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
					
					PortletURL addMemberNhomKiemTra =  renderResponse.createRenderURL();
					addMemberNhomKiemTra.setParameter(Constants.CORPORATION_ID, corporationInspector.getCorporationId());
					addMemberNhomKiemTra.setParameter("jspPage", "/portlet/quanlynguoidung/editCorporationTeam.jsp");
					addMemberNhomKiemTra.setParameter(Constants.INSPECTOR_TEAM, String.valueOf(corporationTeam.getId()));
					addMemberNhomKiemTra.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
					
					PortletURL ActiveNhomKiemTra =  renderResponse.createActionURL();
					ActiveNhomKiemTra.setParameter("MarkUpDelete", Constants.MarkUpDelete_chua_xoa+ "");
					ActiveNhomKiemTra.setParameter(ActionRequest.ACTION_NAME, "editCorporationTeam");
					ActiveNhomKiemTra.setParameter(Constants.INSPECTOR_TEAM, String.valueOf(corporationTeam.getId()));
					
					PortletURL DeleteNhomKiemTra =  renderResponse.createActionURL();
					DeleteNhomKiemTra.setParameter(Constants.CORPORATION_ID, corporationInspector.getCorporationId());
					DeleteNhomKiemTra.setParameter(ActionRequest.ACTION_NAME, "editCorporationTeam");
					DeleteNhomKiemTra.setParameter("MarkUpDelete", Constants.MarkUpDelete_da_xoa+ "");
					DeleteNhomKiemTra.setParameter(Constants.INSPECTOR_TEAM, String.valueOf(corporationTeam.getId()));
				%>
				<tr>
					<td class="text-center"><%=index++ %></td>
					<td class="text-center"><%=corporationTeam.getTeamName() %></td>
					<td class="text-center"><%=corporationTeam.getTeamName() %></td>
					<td class="text-center">
						<a href="<%=editNhomKiemTra.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a>
						<%
						if (corporationTeam.getMarkUpDelete() == Constants.MarkUpDelete_da_xoa) {
						%>
						<a href="<%=ActiveNhomKiemTra.toString() %>"><img src="<%=request.getContextPath()%>/img/accept.png"></a>
						<%
						}
						%>
						<%
						if (corporationTeam.getMarkUpDelete() == Constants.MarkUpDelete_chua_xoa) {
						%>
						<a href="<%=addMemberNhomKiemTra.toString() %>"><img src="<%=request.getContextPath()%>/img/icon_them.png"></a>
						<a href="<%=DeleteNhomKiemTra.toString() %>"><img src="<%=request.getContextPath()%>/img/huy.png"></a>
						<%} %>
					</td>
				</tr>
				<%
				}
				%>
			</tbody> 
		</table>
		<button type="button" style="margin-bottom: 8px; margin-top: 8px; margin-right: 10px;" class="fa-right bt btxanhduong btn btn-default" onclick="javascript: window.location = '<%=urlDangKiemVien%>'">
			Quay lại
		</button>
	</div>
</div>