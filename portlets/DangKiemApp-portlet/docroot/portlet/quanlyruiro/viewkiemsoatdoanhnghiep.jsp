<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlLocalServiceUtil"%>
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
	String specificationgroupcode = DanhMucKey.A2_CODE;
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);
	
	if (Validator.isNull(returnURL) || (Validator.isNotNull(returnURL) && !returnURL.trim().contains("group"))) {
		PortletURL returnUrlB =  renderResponse.createRenderURL();
		returnUrlB.setParameter("jspPage", "/portlet/quanlyruiro/view.jsp");
		returnURL = returnUrlB.toString();
	}
	
	String AssessmentYear = ParamUtil.getString(request, "AssessmentYear");
	String EvaluationPeriod = ParamUtil.getString(request, "EvaluationPeriod");
	String importercode = ParamUtil.getString(request, "importercode");
	String importername = ParamUtil.getString(request, "importername");
	
	PortletURL viewURL = renderResponse.createRenderURL();
	viewURL.setParameter("jspPage", "/portlet/quanlyruiro/viewkiemsoatdoanhnghiep.jsp");
	if (AssessmentYear != null) {
		viewURL.setParameter("AssessmentYear", AssessmentYear);
	}
	if (EvaluationPeriod != null) {
		viewURL.setParameter("EvaluationPeriod", EvaluationPeriod);
	}
	if (importercode != null) {
		viewURL.setParameter("importercode", importercode);
	}
	if (importername != null) {
		viewURL.setParameter("importername", importername);
	}
	
	SearchContainer<AssessmentofImporterControl> searchContainer = new SearchContainer<AssessmentofImporterControl>(renderRequest, 
			null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, viewURL, null, "");
	
	List<AssessmentofImporterControl> list = AssessmentofImporterControlLocalServiceUtil.findDanhSachKiemSoatDoanhNghiep(importercode, importername, 
		searchContainer.getStart(), searchContainer.getEnd());
	int total = AssessmentofImporterControlLocalServiceUtil.countDanhSachKiemSoatDoanhNghiep(importercode, importername);
	
	searchContainer.setTotal(total);
	searchContainer.setResults(list);	
	
	// Ghi actionlog
	String noidungthaotac = "Mở xem Danh sách Kiểm soát doanh nghiệp thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Danh sách Kiểm soát doanh nghiệp";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<aui:form action="" name="myForm" id="myForm" method="POST">
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" >	
			<div tabindex="0" class="CollapsiblePanelTab">
			<h5 class="tieude">
				Kiểm soát doanh nghiệp
				<i class="fa-right fa fa-angle-down"></i>
			</h5>
			<h5></h5>
		</div>
		<div class="CollapsiblePanelContent" style="display: block;">
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Mã số thuế</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<input type="text" placeholder="Nhập mã số thuế" class="form-control-find" name="importercode" id="importercode" value="<%=importercode %>" />
						</div>
						<div class="col-xs-3 col-sm-3 col-md-14">
							<label class="textlabel">Doanh nghiệp</label>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-4" style="margin-left: -35px;width: 48%;">
							<div>
							<input type="text" name="importername" id="importername" value="<%=importername %>" placeholder="Nhập tên doanh nghiệp" class="form-control-find">
							</div>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-2">
							
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div style="margin-left: 400px">
							<button type="submit" class="fa-right btnThuLyHS form-control">Tìm kiếm</button>
							<button type="button" class="fa-left btnThuLyHS form-control" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">Quay lại</button>
				</div> 
						
			</div>
			<div class="row"><br></div>
		</div>
			
		</div>	
			
			<table class="wd-table table">
				<caption style = "font-size: 20px">Danh sách Kiểm soát doanh nghiệp</caption>
				<thead>
					<tr>
						<th>STT</th>
						<th>Doanh nghiệp</th>
						<th>Mã số thuế</th>
						<th hidden="true">Mã kế hoạch</th>
						<th>Năm đánh giá</th>
						<th>Kế hoạch đánh giá</th>
						<th>Điểm kiểm soát DN</th>
						<th>Thao tác</th>
					</tr>
				</thead>
				<tbody>
				<%
				int index = 1;
				for (AssessmentofImporterControl item : list) {
					%>
					<tr>
						<td class="text-center"><%=(index++) + searchContainer.getStart() %></td>
						<td class="text-left"><%=item.getImportername() %></td>
						<td class="text-left"><%=item.getImportercode() %></td>
						<td class="text-left" hidden="true"><%=item.getAssessmentid() %></td>
						<td class="text-left"><%=item.getAssessmentyear() %></td>
						<td class="text-center"><%=item.getEvaluationperiod() %></td>
						<td class="text-center"><%=String.valueOf(item.getSumMark()) %></td>
						<td class="text-center">
							<%
							PortletURL editURL = renderResponse.createRenderURL();
							editURL.setParameter("jspPage", "/portlet/quanlyruiro/edit_assessment_importer_control_specification.jsp");
							editURL.setParameter("specificationgroupcode", specificationgroupcode);
							editURL.setParameter(Constants.ID_ASSESSMENTOFIMPORTER, String.valueOf(item.getId()));
							editURL.setParameter("assessmentid", item.getAssessmentid());
							editURL.setParameter("assessmentyear", item.getAssessmentyear());
							editURL.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
							
							PortletURL addURL = renderResponse.createRenderURL();
							addURL.setParameter("jspPage", "/portlet/quanlyruiro/edit_assessment_importer_control_specification.jsp");
							addURL.setParameter("specificationgroupcode", specificationgroupcode);
							addURL.setParameter(Constants.ID_ASSESSMENTOFIMPORTER, String.valueOf(item.getId()));
							addURL.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
							
							PortletURL deleteURL = renderResponse.createActionURL();
							deleteURL.setParameter(Constants.ID_ASSESSMENTOFIMPORTER, String.valueOf(item.getId()));
							deleteURL.setParameter("specificationgroupcode", specificationgroupcode);
							deleteURL.setParameter("assessmentid", item.getAssessmentid());
							deleteURL.setParameter("assessmentyear", item.getAssessmentyear());
							deleteURL.setParameter(ActionRequest.ACTION_NAME, "deleteTieuChiKiemSoatDoanhNghiep");
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