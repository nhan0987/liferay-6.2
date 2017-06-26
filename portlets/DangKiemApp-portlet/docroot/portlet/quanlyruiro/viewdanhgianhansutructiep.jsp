<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
	String specificationgroupcode = DanhMucKey.A4_CODE;
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);
	
	if (Validator.isNull(returnURL) || (Validator.isNotNull(returnURL) && !returnURL.trim().contains("group"))) {
		PortletURL returnUrlB =  renderResponse.createRenderURL();
		returnUrlB.setParameter("jspPage", "/portlet/quanlyruiro/view.jsp");
		returnURL = returnUrlB.toString();
	}
	
	PortletURL viewURL = renderResponse.createRenderURL();
	viewURL.setParameter("jspPage", "/portlet/quanlyruiro/viewdanhgianhansutructiep.jsp");
	
	SearchContainer<AssessmentofInspector> searchContainer = new SearchContainer<AssessmentofInspector>(renderRequest, 
			null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, viewURL, null, "");
	
	List<AssessmentofInspector> list = AssessmentofInspectorLocalServiceUtil.getAssessmentofInspectors(
		searchContainer.getStart(), searchContainer.getEnd());
	int total = AssessmentofInspectorLocalServiceUtil.getAssessmentofInspectorsCount();
	
	searchContainer.setTotal(total);
	searchContainer.setResults(list);
	
	// Ghi actionlog
	String noidungthaotac = "Mở xem Danh sách Nhân viên - Khối trực tiếp thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Danh sách Nhân viên - Khối trực tiếp";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<aui:form action="" name="myForm" id="myForm" method="POST">
		<br>
			<%-- <button type="button" class="fa-left bt btxanhduong btn btn-default" style = "margin-bottom: 5px;" onclick="javascript: window.location = '<%=addURL%>'">
				Tạo mới
			</button> --%>
			
			<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">
				Quay lại
			</button>
			
			<table class="wd-table table">
				<caption style = "font-size: 20px">Danh sách Nhân viên - Khối trực tiếp</caption>
				<thead>
					<tr>
						<th>STT</th>
						<th>Đăng kiểm viên</th>
						<th>Mã ĐKV - Vị trí</th>
						<th>Mã lịch đánh giá</th>
						<th>Năm đánh giá</th>
						<th>Kế hoạch đánh giá</th>
						<th>Điểm đánh giá</th>
						<th>Thao tác</th>
					</tr>
				</thead>
				<tbody>
				<%
				int index = 1;
				for (AssessmentofInspector item : list) {
					%>
					<tr>
						<td class="text-center"><%=(index++) + searchContainer.getStart() %></td>
						<td class="text-left"><%=item.getInspectorname() %></td>
						<td class="text-left"><%=item.getInspectorcontactcode() %> " - " <%=item.getInspectorposition() %></td>						
						<td class="text-left"><%=item.getAssessmentid() %></td>
						<td class="text-left"><%=item.getAssessmentyear() %></td>
						<td class="text-center"><%=item.getEvaluationperiod() %></td>
						<td class="text-center"><%=String.valueOf(item.getSumMark()) %></td>
						<td class="text-center">
							<%
							PortletURL editURL = renderResponse.createRenderURL();
							editURL.setParameter("jspPage", "/portlet/quanlyruiro/edit_inspector_specification.jsp");
							editURL.setParameter("specificationgroupcode", specificationgroupcode);
							editURL.setParameter(Constants.ID_ASSESSMENTOFINSPECTOR, String.valueOf(item.getId()));
							editURL.setParameter("assessmentid", item.getAssessmentid());
							editURL.setParameter("assessmentyear", item.getAssessmentyear());
							editURL.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
							
							PortletURL addURL = renderResponse.createRenderURL();
							addURL.setParameter("jspPage", "/portlet/quanlyruiro/edit_inspector_specification.jsp");
							addURL.setParameter("specificationgroupcode", specificationgroupcode);
							addURL.setParameter(Constants.ID_ASSESSMENTOFINSPECTOR, String.valueOf(item.getId()));
							addURL.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
							
							PortletURL deleteURL = renderResponse.createActionURL();
							deleteURL.setParameter(Constants.ID_ASSESSMENTOFINSPECTOR, String.valueOf(item.getId()));
							deleteURL.setParameter("specificationgroupcode", specificationgroupcode);
							deleteURL.setParameter("assessmentid", item.getAssessmentid());
							deleteURL.setParameter("assessmentyear", item.getAssessmentyear());
							deleteURL.setParameter(ActionRequest.ACTION_NAME, "deleteTieuChiDanhGiaNhanSu");
							%>
							<a href="<%=editURL.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-plus"></i></a>
							<a href="<%=editURL.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a>
							<a onclick="beforSummitForm('myForm', '<%=deleteURL.toString()%>')" class="aicon"><img src="<%=request.getContextPath()%>/img/huy.png"></a>
						</td>
					</tr>
					<%
				}
				%>
				</tbody>
			</table>
			<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
		</aui:form>
	</div>
</div>
<script type="text/javascript">
function changeajax(dataId) {
	
	var isCheck=document.getElementById(dataId).checked;
	var listVehicleRecordId=document.getElementById('corporationInspector').value;
	if (isCheck==true){
		//alert("--true");
		listVehicleRecordId=listVehicleRecordId+dataId+", ";
	}else{
		//alert("--false");
		var res = listVehicleRecordId.replace(dataId+", ", "");
		listVehicleRecordId=res;
	}
	document.getElementById('corporationInspector').value=listVehicleRecordId;
}

function beforSummitForm(idForm, url) {
	var urlAction = document.getElementById('<portlet:namespace/>' + idForm).action;
	
	if (urlAction == '') {
		document.getElementById('<portlet:namespace/>' + idForm).action = url;
	}
	
	var status = confirm("Bạn có muốn tiếp tục xử lý?");
	
	if (status) {
		document.getElementById('<portlet:namespace/>' + idForm).submit(); 
	} else {
		document.getElementById('<portlet:namespace/>' + idForm).action = '';
	}
}
</script>