<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
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
String corporationId = ParamUtil.getString(request, Constants.CORPORATION_ID);
String inspectorTeam = ParamUtil.getString(request, Constants.INSPECTOR_TEAM);
String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);

CorporationTeam corporationTeam = null;
if (inspectorTeam != null && inspectorTeam.trim().length() > 0) {
	corporationTeam = CorporationTeamLocalServiceUtil.fetchCorporationTeam(ConvertUtil.convertToLong(inspectorTeam));
}

List<CorporationInspector> lCorporationInspectors = CorporationInspectorLocalServiceUtil.findByTeamId(0);

PortletURL themCorporationTeam = renderResponse.createActionURL();
themCorporationTeam.setParameter(ActionRequest.ACTION_NAME, "themCorporationInspectorToCorporationTeam");
themCorporationTeam.setParameter(Constants.CORPORATION_ID, corporationId);
themCorporationTeam.setParameter(Constants.INSPECTOR_TEAM, inspectorTeam);

//Ghi actionlog
	String noidungthaotac = "Mở xem Danh sách nhóm đăng kiểm viên thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Thêm đăng kiểm viên vào nhóm";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<aui:form action="<%=themCorporationTeam %>" name="myForm" id="myForm" method="POST">
			<table class="wd-table table">
				<caption style = "font-size: 20px"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.listdangkiemvien.themdangkiemvienvaonhom"/> <%=corporationTeam.getTeamName() %></caption>
				<input type="hidden" name="corporationInspector" id="corporationInspector" value="" />
				<thead>
					<tr>
						<th>STT</th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.listdangkiemvien.tendangkiemvien"/></th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.listdangkiemvien.dienthoai"/></th>
						<th>Email</th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.listdangkiemvien.thaotac"/></th>
					</tr>
				</thead>
				<tbody>
				<%
				int index = 1;
				for (CorporationInspector corporationInspector : lCorporationInspectors) {
					%>
					<tr>
						<td class="text-center"><%=index++ %></td>
						<td class="text-left"><%=corporationInspector.getInspectorName() %></td>
						<td class="text-center"><%=corporationInspector.getInspectorPhone() %></td>
						<td class="text-center"><%=corporationInspector.getInspectorEmail() %></td>
						<td class="text-center">
							<input onclick="changeajax('<%=corporationInspector.getId() %>');" type="checkbox" id="<%=corporationInspector.getId() %>" name="<%=corporationInspector.getId() %>" value="<%=corporationInspector.getId() %>"/>
						</td>
					</tr>
					<%
				}
				%>
				</tbody>
			</table>
			<button type="submit" class="fa-left bt btxanhduong btn btn-default" style = "margin-bottom: 5px;"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.listdangkiemvien.capnhatdangkiemvien"/></button>
			<button type="button" class="fa-left bt btxanhduong btn btn-default" style = "margin-bottom: 5px;" onclick="javascript: window.location = '<%=returnURL%>'"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.listdangkiemvien.quaylai"/></button>
		</aui:form>
	</div>
</div>
<script type="text/javascript">
function changeajax(dataId) {
	
	var isCheck = document.getElementById(dataId).checked;
	var listVehicleRecordId = document.getElementById('corporationInspector').value;
	if (isCheck == true){
		//alert("--true");
		listVehicleRecordId = listVehicleRecordId+dataId+", ";
	}else{
		//alert("--false");
		var res = listVehicleRecordId.replace(dataId+", ", "");
		listVehicleRecordId = res;
	}
	document.getElementById('corporationInspector').value = listVehicleRecordId;
}
</script>