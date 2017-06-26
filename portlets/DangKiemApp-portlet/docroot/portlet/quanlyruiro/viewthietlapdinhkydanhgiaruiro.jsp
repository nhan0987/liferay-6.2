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
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
	//String specificationgroupcode = DanhMucKey.A5_CODE;
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);
	
	if (Validator.isNull(returnURL) || (Validator.isNotNull(returnURL) && !returnURL.trim().contains("group"))) {
		PortletURL returnUrlB =  renderResponse.createRenderURL();
		returnUrlB.setParameter("jspPage", "/portlet/quanlyruiro/view.jsp");
		returnURL = returnUrlB.toString();
	}
	
	List<String> allYears = CommonUtils.getTenYearRecently();
	String AssessmentYear = ParamUtil.getString(request, "AssessmentYear");
	String EvaluationPeriod = ParamUtil.getString(request, "EvaluationPeriod");
	
	PortletURL viewURL = renderResponse.createRenderURL();
	viewURL.setParameter("jspPage", "/portlet/quanlyruiro/viewthietlapdinhkydanhgiaruiro.jsp");
	if (AssessmentYear != null) {
		viewURL.setParameter("AssessmentYear", AssessmentYear);
	}
	if (EvaluationPeriod != null) {
		viewURL.setParameter("EvaluationPeriod", EvaluationPeriod);
	}
	
	
	SearchContainer<AssessmentPeriod> searchContainer = new SearchContainer<AssessmentPeriod>(renderRequest, 
			null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, viewURL, null, "");
	
	List<AssessmentPeriod> list = AssessmentPeriodLocalServiceUtil.findDanhSachKehoachdanhgiaruiro(AssessmentYear, EvaluationPeriod,
		searchContainer.getStart(), searchContainer.getEnd());
	int total = AssessmentPeriodLocalServiceUtil.countDanhSachKehoachdanhgiaruiro(AssessmentYear, EvaluationPeriod);
	
	searchContainer.setTotal(total);
	searchContainer.setResults(list);
	
	
	
	
	// Ghi actionlog
	String noidungthaotac = "Mở xem Danh sách Thiết lập định kỳ đánh giá rủi ro thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Danh sách Thiết lập định kỳ đánh giá rủi ro";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

	
%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<aui:form action="" name="myForm" id="myForm" method="POST">		
			<%-- <button type="button" class="fa-left bt btxanhduong btn btn-default" style = "margin-bottom: 5px;" onclick="javascript: window.location = '<%=addURL%>'">
				Tạo mới
			</button> --%>
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" >	
			<div tabindex="0" class="CollapsiblePanelTab">
			<h5 class="tieude">
				Thiết lập định kỳ đánh giá rủi ro
				<i class="fa-right fa fa-angle-down"></i>
			</h5>
			<h5></h5>
		</div>
		<div class="CollapsiblePanelContent" style="display: block;">
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Kế hoạch đánh giá</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
					
						<div class="col-xs-3 col-sm-3 col-md-3">
							<input type="text" name="EvaluationPeriod" id="EvaluationPeriod" value="<%=EvaluationPeriod %>" placeholder="Nhập kế hoạch đánh giá" class="form-control-find">
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel">Năm đánh giá</label>							
						</div>
						<div class="col-xs-3 col-sm-3 col-md-3">
							<select name="AssessmentYear" id="AssessmentYear" size="1" class="form-control-find">
								<option style="width: 50%" selected value="">Nhập năm đánh giá</option>
								<%for (String year : allYears) {%>
								<option <%=year.trim().equals(AssessmentYear) ? "selected" : ""%> value="<%=year%>"><%=year%></option>
								<%}%>
							</select>
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
				<caption style = "font-size: 20px">Danh sách Kế hoạch định kỳ đánh giá rủi ro</caption>
				<thead>
					<tr>
						<th>STT</th>
						<th>Mã kế hoạch</th>
						<th>Năm đánh giá</th>
						<th>Kế hoạch đánh giá</th>
						<th>L/q Doanh nghiệp</th>
						<th>L/q Đăng kiểm viên</th>
						<th>L/q Sản phẩm</th>
						<th>Thao tác</th>
					</tr>
				</thead>
				<tbody>
				<%
				int index = 1;
				for (AssessmentPeriod item : list) {
					%>
					<tr>
						<td class="text-center"><%=(index++) + searchContainer.getStart() %></td>
						<td class="text-left"><%=item.getAssessmentid() %></td>
						<td class="text-center"><%=item.getAssessmentyear() %></td>
						<td class="text-center"><%=item.getEvaluationperiod() %></td>
						<%
						if(item.getImporterchecked() == 1) {
							%>
							<td class="text-center"><%="Có" %></td>
							<%
						} else {
							%>
							<td class="text-center"><%="Không" %></td>
							<%
						} 
							%>
							
							<%
						if(item.getInspectorchecked() == 1) {
							%>
							<td class="text-center"><%="Có" %></td>
							<%
						} else {
							%>
							<td class="text-center"><%="Không" %></td>
							<%
						} 
							%>
							
							<%
						if(item.getProductionchecked() == 1) {
							%>
							<td class="text-center"><%="Có" %></td>
							<%
						} else {
							%>
							<td class="text-center"><%="Không" %></td>
							<%
						} 
							%>
						<td class="text-center">
							<%							
							
							PortletURL urlThemkehoachdanhgiaruiro = renderResponse.createRenderURL();
							urlThemkehoachdanhgiaruiro.setParameter(Constants.ID_ASSESSMENT_PERIOD, String.valueOf(item.getId()));
							urlThemkehoachdanhgiaruiro.setParameter("assessmentid", StringPool.BLANK);
							urlThemkehoachdanhgiaruiro.setParameter("assessmentyear", StringPool.BLANK);
							urlThemkehoachdanhgiaruiro.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
							urlThemkehoachdanhgiaruiro.setParameter("jspPage", "/portlet/quanlyruiro/quanlykehoachdanhgiaruiro.jsp");	
							
							PortletURL editURL = renderResponse.createRenderURL();
							editURL.setParameter("jspPage", "/portlet/quanlyruiro/quanlykehoachdanhgiaruiro.jsp");							
							editURL.setParameter(Constants.ID_ASSESSMENT_PERIOD, String.valueOf(item.getId()));
							editURL.setParameter("assessmentid", item.getAssessmentid());
							editURL.setParameter("assessmentyear", item.getAssessmentyear());
							editURL.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
						
						
							PortletURL deleteURL = renderResponse.createActionURL();
							deleteURL.setParameter(Constants.ID_ASSESSMENT_PERIOD, String.valueOf(item.getId()));							
							deleteURL.setParameter("assessmentid", item.getAssessmentid());
							deleteURL.setParameter("assessmentyear", item.getAssessmentyear());
							deleteURL.setParameter(ActionRequest.ACTION_NAME, "deleteKehoachDanhgiaRuiro");
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