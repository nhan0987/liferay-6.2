<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<% 
String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);

if (Validator.isNull(returnURL) || (Validator.isNotNull(returnURL) && !returnURL.trim().contains("group"))) {
	PortletURL returnUrlB =  renderResponse.createRenderURL();
	returnUrlB.setParameter("jspPage", "/portlet/quanlyruiro/view.jsp");
	returnURL = returnUrlB.toString();
}

List<String> allYears = CommonUtils.getTenYearRecently();
String assessmentYear = ParamUtil.getString(request, "assessmentYear");
String evaluationPeriod = ParamUtil.getString(request, "evaluationPeriod");

PortletURL viewURL = renderResponse.createRenderURL();
viewURL.setParameter("jspPage", "/portlet/quanlyruiro/viewthietlapkhuonkho.jsp");

if (Validator.isNotNull(assessmentYear)) {
	viewURL.setParameter("assessmentYear", assessmentYear);
}

if (Validator.isNotNull(evaluationPeriod)) {
	viewURL.setParameter("evaluationPeriod", evaluationPeriod);
}

PortletURL addURL = renderResponse.createRenderURL();
addURL.setParameter("jspPage", "/portlet/quanlyruiro/edit_assessmentofinspectionmethod.jsp");
addURL.setParameter("returnURL", themeDisplay.getURLCurrent());

SearchContainer<AssessmentofInspectionMethod> searchContainer = new SearchContainer<AssessmentofInspectionMethod>(renderRequest, 
		null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, viewURL, null, "");

List<AssessmentofInspectionMethod> list = AssessmentofInspectionMethodLocalServiceUtil.findByAssessmentYear_EvaluationPeriod(assessmentYear, evaluationPeriod,
	searchContainer.getStart(), searchContainer.getEnd());
int total = AssessmentofInspectionMethodLocalServiceUtil.countByAssessmentYear_EvaluationPeriod(assessmentYear, evaluationPeriod);

searchContainer.setTotal(total);
searchContainer.setResults(list);


	// Ghi actionlog
	String noidungthaotac = "Mở xem Danh sách Thiết lập khuôn khổ, phân luồng đánh giá thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Danh sách Thiết lập khuôn khổ, phân luồng đánh giá";
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
						Thiết lập khuôn khổ, phân luồng đánh giá
						<i class="fa-right fa fa-angle-down"></i>
					</h5>
				</div>
				
				<div class="CollapsiblePanelContent" style="display: block;">
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel">Kế hoạch đánh giá</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<div class="row">
							
								<div class="col-xs-3 col-sm-3 col-md-3">
									<input type="text" name="evaluationPeriod" value="<%=HtmlUtil.escape(evaluationPeriod) %>" placeholder="Nhập kế hoạch đánh giá" class="form-control-find">
								</div>
								<div class="col-xs-2 col-sm-2 col-md-2">
									<label class="textlabel">Năm đánh giá</label>							
								</div>
								<div class="col-xs-3 col-sm-3 col-md-3">
									<select name="assessmentYear" size="1" class="form-control-find">
										<option style="width: 50%" selected value="">Nhập năm đánh giá</option>
										<%for (String year : allYears) {%>
										<option <%=year.trim().equals(assessmentYear) ? "selected" : ""%> value="<%=year%>"><%=year%></option>
										<%}%>
									</select>
								</div>
								
							</div>
						</div>
					</div>
					<div class="row">
						<div style="margin-left: 400px">
							<button type="button" class="fa-left btnThuLyHS form-control" onclick="javascript: window.location = '<%=addURL%>'">Tạo mới</button>
							<button type="submit" class="fa-left btnThuLyHS form-control" style="margin-left: 15px">Tìm kiếm</button>
							<button type="button" class="fa-left btnThuLyHS form-control" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">Quay lại</button>
						</div> 
					</div>
				</div>	
			</div>
			
			<table class="wd-table table">
				<caption style = "font-size: 20px">Danh sách khuôn khổ, phân luồng đánh giá</caption>
				<thead>
					<tr>
						<th>STT</th>
						<th>Mã</th>
						<th>Tên</th>
						<th>Kỳ đánh giá</th>
						<th>Kế hoạch đánh giá</th>
						<th>Thao tác</th>
					</tr>
				</thead>
				<tbody>
				<%
				int index = 1;
				for (AssessmentofInspectionMethod item : list) {
					%>
					<tr>
						<td class="text-center"><%=(index++) + searchContainer.getStart() %></td>
						<td class="text-left"><%=item.getMethodcode() %></td>
						<td class="text-left"><%=item.getMethodname() %></td>
						<td class="text-center"><%=item.getAssessmentyear() %></td>
						<td class="text-center"><%=item.getEvaluationperiod() %></td>
						<td class="text-center">
							<%
							PortletURL editURL = renderResponse.createRenderURL();
							editURL.setParameter("jspPage", "/portlet/quanlyruiro/edit_assessmentofinspectionmethod.jsp");
							editURL.setParameter(Constants.ID_ASSESSMENTOFINSPECTIONMETHOD, String.valueOf(item.getId()));
							editURL.setParameter("assessmentid", item.getAssessmentid());
							editURL.setParameter("assessmentyear", item.getAssessmentyear());
							editURL.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
						
							PortletURL deleteURL = renderResponse.createActionURL();
							deleteURL.setParameter(Constants.ID_ASSESSMENTOFINSPECTIONMETHOD, String.valueOf(item.getId()));
							deleteURL.setParameter("assessmentid", item.getAssessmentid());
							deleteURL.setParameter("assessmentyear", item.getAssessmentyear());
							deleteURL.setParameter(ActionRequest.ACTION_NAME, "deleteAssessmentofInspectionMethod");
							deleteURL.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
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