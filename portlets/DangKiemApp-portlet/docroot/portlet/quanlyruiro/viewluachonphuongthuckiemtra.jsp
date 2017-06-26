<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterControlLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
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

long assessmentPeriodId = ParamUtil.getLong(request, Constants.ID_ASSESSMENT_PERIOD);
String importercode = ParamUtil.getString(request, "importercode");
String importername = ParamUtil.getString(request, "importername");
long assessmentofProductId = ParamUtil.getLong(request, Constants.ID_ASSESSMENTOFPRODUCT);

String PurposeRiskCode = ParamUtil.getString(request, "PurposeRiskCode");
String CertifiedRiskCode = ParamUtil.getString(request, "CertifiedRiskCode");
String UsageRiskCode = ParamUtil.getString(request, "UsageRiskCode");
String TransportRiskCode = ParamUtil.getString(request, "TransportRiskCode");

PortletURL viewURL = renderResponse.createRenderURL();
viewURL.setParameter("jspPage", "/portlet/quanlyruiro/viewluachonphuongthuckiemtra.jsp");

viewURL.setParameter(Constants.ID_ASSESSMENT_PERIOD, String.valueOf(assessmentPeriodId));
viewURL.setParameter("importercode", importercode);
viewURL.setParameter("importername", importername);
viewURL.setParameter(Constants.ID_ASSESSMENTOFPRODUCT, String.valueOf(assessmentofProductId));
viewURL.setParameter("PurposeRiskCode", PurposeRiskCode);
viewURL.setParameter("CertifiedRiskCode", CertifiedRiskCode);
viewURL.setParameter("UsageRiskCode", UsageRiskCode);
viewURL.setParameter("TransportRiskCode", TransportRiskCode);

String assessmentid = "";
String assessmentyear = "";

List<AssessmentPeriod> listAssessmentPeriod = AssessmentPeriodLocalServiceUtil.getAssessmentPeriods(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
List<AssessmentofProduct> listAssessmentofProduct = new ArrayList<AssessmentofProduct>(); 

List<DmDataItem> listPurposeRiskCode = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1(GetterUtil.getLong(DanhMucKey.A3_CODE), 0, "A302");
List<DmDataItem> listCertifiedRiskCode = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1(GetterUtil.getLong(DanhMucKey.A3_CODE), 0, "A304");
List<DmDataItem> listUsageRiskCode = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1(GetterUtil.getLong(DanhMucKey.A3_CODE), 0, "A303");
List<DmDataItem> listTransportRiskCode = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1(GetterUtil.getLong(DanhMucKey.A3_CODE), 0, "A305");

Map<String, String> mapPurposeRiskCode = new HashMap<String, String>();
Map<String, String> mapCertifiedRiskCode = new HashMap<String, String>();
Map<String, String> mapUsageRiskCode = new HashMap<String, String>();
Map<String, String> mapTransportRiskCode = new HashMap<String, String>();


if(assessmentPeriodId > 0) {
	AssessmentPeriod assessmentPeriod = AssessmentPeriodLocalServiceUtil.getAssessmentPeriod(assessmentPeriodId);
	assessmentid = assessmentPeriod.getAssessmentid();
	assessmentyear = assessmentPeriod.getAssessmentyear();
	
	if(Validator.isNotNull(assessmentid) && Validator.isNotNull(assessmentyear)) {
		listAssessmentofProduct = AssessmentofProductLocalServiceUtil.findByAssessmentId_AssessmentYear(assessmentid, assessmentyear);
	}
}

/* AssessmentofImporter - Doanh nghiep */

SearchContainer<AssessmentofImporter> searchContainerAssessmentofImporter = new SearchContainer<AssessmentofImporter>(renderRequest, 
		null, null, "cur1", 20, viewURL, null, "");

List<AssessmentofImporter> list1 = AssessmentofImporterLocalServiceUtil.findByIC_IN_AI_AY(importercode, importername, assessmentid, assessmentyear,
		searchContainerAssessmentofImporter.getStart(), searchContainerAssessmentofImporter.getEnd());
int total1 = AssessmentofImporterLocalServiceUtil.countByIC_IN_AI_AY(importercode, importername, assessmentid, assessmentyear);

searchContainerAssessmentofImporter.setTotal(total1);
searchContainerAssessmentofImporter.setResults(list1);


// Ghi actionlog
String noidungthaotac = "Mở xem màn hình Lựa chọn phương thức kiểm tra thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
String tenmanhinhdaidien = "Lựa chọn phương thức kiểm tra";
String importername = "";
String inspectorname = user.getScreenName();
long inspectorid = user.getUserId();
QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

/* AssessmentofProduct - San pham */

//TODO: xem lai cho hien thi danh sach san pham hay chi san pham duoc chon
AssessmentofProduct assessmentofProduct = null;
if(assessmentofProductId > 0) {
	assessmentofProduct = AssessmentofProductLocalServiceUtil.getAssessmentofProduct(assessmentofProductId);
}


double A1Mark = 0;		// ImporterRisk
double A301Mark = 0;	// ProductRisk
double A302Mark = 0;	// PurposeRisk
double A304Mark = 0;	// CertifiedRisk
double A303Mark = 0;	// UsageRisk
double A305Mark = 0;	// TransportRisk
%>

<portlet:resourceURL var="resourceURL" id=""/>

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="jspPage" value="/portlet/quanlyruiro/viewluachonphuongthuckiemtra.jsp" />
</liferay-portlet:renderURL>

<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<aui:form action="<%= searchURL %>" name="myForm" id="myForm" method="GET">
			<liferay-portlet:renderURLParams varImpl="searchURL" />

			<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" >	
				<div tabindex="0" class="CollapsiblePanelTab">
					<h5 class="tieude">
						Lựa chọn phương thức kiểm tra
						<i class="fa-right fa fa-angle-down"></i>
					</h5>
				</div>
			
				<div class="CollapsiblePanelContent" style="display: block;">
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel">Kỳ đánh giá</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<select id="<%= Constants.ID_ASSESSMENT_PERIOD %>" name="<%= Constants.ID_ASSESSMENT_PERIOD %>" size="1" class="form-control-find">
								<option value="">--- Chọn ---</option>
								<%
								for(AssessmentPeriod item : listAssessmentPeriod) {
									String seld = "";
									if(item.getId() == assessmentPeriodId) {
										seld = "selected";
									}
								%>
									<option value="<%= item.getId() %>" <%= seld %>><%= HtmlUtil.escape(item.getEvaluationperiod()) %></option>
								<%	
								}
								%>
							</select>
								
						</div>
					</div>
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel">Mã số doanh nghiệp</label>
						</div>
						<div class="col-xs-4 col-sm-4 col-md-4">
							<input type="text" name="importercode" value="<%= HtmlUtil.escape(importercode) %>" class="form-control-find">
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel">Tên doanh nghiệp</label>
						</div>
						<div class="col-xs-4 col-sm-4 col-md-4">
							<input type="text" name="importername" value="<%= HtmlUtil.escape(importername) %>" class="form-control-find">
						</div>
					</div>
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel">Sản phẩm</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<select id="<%= Constants.ID_ASSESSMENTOFPRODUCT %>" name="<%= Constants.ID_ASSESSMENTOFPRODUCT %>" size="1" class="form-control-find">
								<option value="">--- Chọn ---</option>
								<%
								for(AssessmentofProduct item : listAssessmentofProduct) {
									String seld = "";
									if(item.getId() == assessmentofProductId) {
										seld = "selected";
									}
								%>
									<option value="<%= item.getId() %>" <%= seld %>><%= item.getProductcode() %> - <%= item.getProductname() %></option>
								<%	
								}
								%>
							</select>
								
						</div>
					</div>
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel">Mục đích nhập khẩu</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<select name="PurposeRiskCode" size="1" class="form-control-find">
								<option value="">--- Chọn ---</option>
								<%
								for(DmDataItem item : listPurposeRiskCode) {
									String seld = "";
									if(item.getCode0().equalsIgnoreCase(PurposeRiskCode)) {
										seld = "selected";
									}
									
									mapPurposeRiskCode.put(item.getCode0(), item.getName());
								%>
									<option value="<%= item.getCode0() %>" <%= seld %>><%= item.getName() %></option>
								<%	
								}
								%>
							</select>
								
						</div>
					</div>
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel">Tình trạng chứng nhận</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<select name="CertifiedRiskCode" size="1" class="form-control-find">
								<option value="">--- Chọn ---</option>
								<%
								for(DmDataItem item : listCertifiedRiskCode) {
									String seld = "";
									if(item.getCode0().equalsIgnoreCase(CertifiedRiskCode)) {
										seld = "selected";
									}
									
									mapCertifiedRiskCode.put(item.getCode0(), item.getName());
								%>
									<option value="<%= item.getCode0() %>" <%= seld %>><%= item.getName() %></option>
								<%	
								}
								%>
							</select>
								
						</div>
					</div>
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel">Tình trạng sử dụng</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<select name="UsageRiskCode" size="1" class="form-control-find">
								<option value="">--- Chọn ---</option>
								<%
								for(DmDataItem item : listUsageRiskCode) {
									String seld = "";
									if(item.getCode0().equalsIgnoreCase(UsageRiskCode)) {
										seld = "selected";
									}
									
									mapUsageRiskCode.put(item.getCode0(), item.getName());
								%>
									<option value="<%= item.getCode0() %>" <%= seld %>><%= item.getName() %></option>
								<%	
								}
								%>
							</select>
								
						</div>
					</div>
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel">Phạm vi hoạt động</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<select name="TransportRiskCode" size="1" class="form-control-find">
								<option value="">--- Chọn ---</option>
								<%
								for(DmDataItem item : listTransportRiskCode) {
									String seld = "";
									if(item.getCode0().equalsIgnoreCase(TransportRiskCode)) {
										seld = "selected";
									}
									
									mapTransportRiskCode.put(item.getCode0(), item.getName());
								%>
									<option value="<%= item.getCode0() %>" <%= seld %>><%= item.getName() %></option>
								<%	
								}
								%>
							</select>
								
						</div>
					</div>
					
					<div class="row">
						<div style="margin-left: 400px">
							<button type="submit" class="fa-right btnThuLyHS form-control">Tìm kiếm phương thức kiểm tra</button>
							<button type="button" class="fa-left btnThuLyHS form-control" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">Quay lại</button>
						</div> 
					</div>
				</div>	
			</div>
			
			<table class="wd-table table">
				<caption style = "font-size: 20px">Doanh nghiệp</caption>
				<thead>
					<tr>
						<th>STT</th>
						<th>Tên doanh nghiệp</th>
						<th>Kỳ đánh giá</th>
						<th>Điểm đánh giá</th>
						<th>Điểm kiểm soát</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				<%
					int index = 1;
					for (AssessmentofImporter item : searchContainerAssessmentofImporter.getResults()) {
						List<AssessmentofImporterControl> listAssessmentofImporterControl = AssessmentofImporterControlLocalServiceUtil
								.findByImporterCode(item.getImportercode(), item.getAssessmentid(),
										item.getAssessmentyear());
						
						double importerSummark = item.getSumMark();
						double importerControlSummark = 0d;
						
						if(listAssessmentofImporterControl != null && listAssessmentofImporterControl.size() > 0) {
							AssessmentofImporterControl assessmentofImporterControl = listAssessmentofImporterControl.get(0);
							importerControlSummark = assessmentofImporterControl.getSumMark();
						}
						
						A1Mark = importerSummark + importerControlSummark;
				%>
					<tr>
						<td class="text-center"><%=(index++) + searchContainerAssessmentofImporter.getStart() %></td>
						<td class="text-left"><%=item.getImportername() %></td>
						<td class="text-center"><%=item.getEvaluationperiod() %></td>
						<td class="text-center"><%=importerSummark %></td>
						<td class="text-center"><%=importerControlSummark %></td>
						<td class="text-center">
							<%
							PortletURL detailURL = viewURL;
							detailURL.setParameter("importercode", item.getImportercode());
							detailURL.setParameter("importername", item.getImportername());
							%>
							<a href="<%=detailURL.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-file-o"></i> Chọn</a>
						</td>
					</tr>
					<%
				}
				%>
				</tbody>
			</table>
			
			<liferay-ui:search-paginator searchContainer="<%= searchContainerAssessmentofImporter %>" />
			
			<table class="wd-table table">
				<caption style = "font-size: 20px">Sản phẩm</caption>
				<thead>
					<tr>
						<th>Tên sản phẩm</th>
						<th>Điểm nguy cơ</th>
						<th>Mục đích nhập khẩu</th>
						<th>Tình trạng chứng nhận</th>
						<th>Tình trạng sử dụng</th>
						<th>Phạm vi hoạt động</th>
					</tr>
				</thead>
				<tbody>
				<%
					if(assessmentofProduct != null) {
						A301Mark = assessmentofProduct.getSumMark();
						StringBuilder A302MarkView = new StringBuilder();
						StringBuilder A304MarkView = new StringBuilder();
						StringBuilder A303MarkView = new StringBuilder();
						StringBuilder A305MarkView = new StringBuilder();
						
						if(Validator.isNotNull(PurposeRiskCode)) {
							A302MarkView.append(mapPurposeRiskCode.get(PurposeRiskCode));
							A302MarkView.append("<br>");
							
							String strA302Mark = null;
							
							List<AssessmentSpecification> listAssessmentSpecification = 
									AssessmentSpecificationLocalServiceUtil.findByProductionCodeAndSpecificationCode(
											DanhMucKey.A3_CODE, assessmentofProduct.getProductcode(), PurposeRiskCode, assessmentid, assessmentyear);
							
							if(listAssessmentSpecification != null && listAssessmentSpecification.size() > 0) {
								A302Mark = listAssessmentSpecification.get(0).getAssessmentmark();
								
								int iA302Mark = GetterUtil.getInteger(A302Mark);
								
								if(iA302Mark > 0) {
									List<DmDataItem> items = DmDataItemLocalServiceUtil.findByGC_C0_C1_C2_C3_L_AN(GetterUtil.getLong(DanhMucKey.A3_CODE), null, 
											PurposeRiskCode, null, null, null, String.valueOf(iA302Mark));
									
									if(items != null && items.size() > 0) {
										strA302Mark = items.get(0).getName();
									}
								}
							}
							
							if(strA302Mark != null){
								A302MarkView.append(strA302Mark);
							} else {
								A302MarkView.append("Chưa thẩm định");
							}
						} else {
							A302MarkView.append("---");
						}
						
						if(Validator.isNotNull(CertifiedRiskCode)) {
							A304MarkView.append(mapCertifiedRiskCode.get(CertifiedRiskCode));
							A304MarkView.append("<br>");
							
							String strA304Mark = null;
							
							List<AssessmentSpecification> listAssessmentSpecification = 
									AssessmentSpecificationLocalServiceUtil.findByProductionCodeAndSpecificationCode(
											DanhMucKey.A3_CODE, assessmentofProduct.getProductcode(), CertifiedRiskCode, assessmentid, assessmentyear);
							
							if(listAssessmentSpecification != null && listAssessmentSpecification.size() > 0) {
								A304Mark = listAssessmentSpecification.get(0).getAssessmentmark();
								
								int iA304Mark = GetterUtil.getInteger(A304Mark);
								
								if(iA304Mark > 0) {
									List<DmDataItem> items = DmDataItemLocalServiceUtil.findByGC_C0_C1_C2_C3_L_AN(GetterUtil.getLong(DanhMucKey.A3_CODE), null, 
											CertifiedRiskCode, null, null, null, String.valueOf(iA304Mark));
									
									if(items != null && items.size() > 0) {
										strA304Mark = items.get(0).getName();
									}
								}
							}
							
							if(strA304Mark != null){
								A304MarkView.append(strA304Mark);
							} else {
								A304MarkView.append("Chưa thẩm định");
							}
						} else {
							A304MarkView.append("---");
						}
						
						if(Validator.isNotNull(UsageRiskCode)) {
							A303MarkView.append(mapUsageRiskCode.get(UsageRiskCode));
							A303MarkView.append("<br>");
							
							String strA303Mark = null;
							
							List<AssessmentSpecification> listAssessmentSpecification = 
									AssessmentSpecificationLocalServiceUtil.findByProductionCodeAndSpecificationCode(
											DanhMucKey.A3_CODE, assessmentofProduct.getProductcode(), UsageRiskCode, assessmentid, assessmentyear);
							
							if(listAssessmentSpecification != null && listAssessmentSpecification.size() > 0) {
								A303Mark = listAssessmentSpecification.get(0).getAssessmentmark();
								
								int iA303Mark = GetterUtil.getInteger(A303Mark);
								
								if(iA303Mark > 0) {
									List<DmDataItem> items = DmDataItemLocalServiceUtil.findByGC_C0_C1_C2_C3_L_AN(GetterUtil.getLong(DanhMucKey.A3_CODE), null, 
											UsageRiskCode, null, null, null, String.valueOf(iA303Mark));
									
									if(items != null && items.size() > 0) {
										strA303Mark = items.get(0).getName();
									}
								}
							}
							
							if(strA303Mark != null){
								A303MarkView.append(strA303Mark);
							} else {
								A303MarkView.append("Chưa thẩm định");
							}
						} else {
							A303MarkView.append("---");
						}
						
						if(Validator.isNotNull(TransportRiskCode)) {
							A305MarkView.append(mapTransportRiskCode.get(TransportRiskCode));
							A305MarkView.append("<br>");
							
							String strA305Mark = null;
							
							List<AssessmentSpecification> listAssessmentSpecification = 
									AssessmentSpecificationLocalServiceUtil.findByProductionCodeAndSpecificationCode(
											DanhMucKey.A3_CODE, assessmentofProduct.getProductcode(), TransportRiskCode, assessmentid, assessmentyear);
							
							if(listAssessmentSpecification != null && listAssessmentSpecification.size() > 0) {
								A305Mark = listAssessmentSpecification.get(0).getAssessmentmark();
								
								int iA305Mark = GetterUtil.getInteger(A305Mark);
								
								if(iA305Mark > 0) {
									List<DmDataItem> items = DmDataItemLocalServiceUtil.findByGC_C0_C1_C2_C3_L_AN(GetterUtil.getLong(DanhMucKey.A3_CODE), null, 
											TransportRiskCode, null, null, null, String.valueOf(iA305Mark));
									
									if(items != null && items.size() > 0) {
										strA305Mark = items.get(0).getName();
									}
								}
							}
							
							if(strA305Mark != null){
								A305MarkView.append(strA305Mark);
							} else {
								A305MarkView.append("Chưa thẩm định");
							}
						} else {
							A305MarkView.append("---");
						}
				%>
					<tr>
						<td class="text-left"><%=assessmentofProduct.getProductname() %></td>
						<td class="text-center"><%=A301Mark %></td>
						<td class="text-center"><%=Validator.isNotNull(A302MarkView) ? A302MarkView : "Chưa thẩm định" %></td>
						<td class="text-center"><%=Validator.isNotNull(A304MarkView) ? A304MarkView : "Chưa thẩm định" %></td>
						<td class="text-center"><%=Validator.isNotNull(A303MarkView) ? A303MarkView : "Chưa thẩm định" %></td>
						<td class="text-center"><%=Validator.isNotNull(A305MarkView) ? A305MarkView : "Chưa thẩm định" %></td>
					</tr>
					<%
				}
				%>
				</tbody>
			</table>
			
			<!-- Phuong thuc kiem tra -->
			<c:choose>
				<c:when test="<%= searchContainerAssessmentofImporter.getTotal() != 1 %>">
					<h3 style = "font-size: 20px">Vui lòng chọn duy nhất một doanh nghiệp để hiển thị phương thức kiểm tra</h3>
				</c:when>
				<c:otherwise>
					<%
					SearchContainer<AssessmentofInspectionMethod> searchContainer = new SearchContainer<AssessmentofInspectionMethod>(renderRequest, 
							null, null, SearchContainer.DEFAULT_CUR_PARAM, 20, viewURL, null, "");
		
					List<AssessmentofInspectionMethod> list = AssessmentofInspectionMethodLocalServiceUtil.findByA1Mark_A301Mark(A1Mark, A301Mark, assessmentid, assessmentyear,
						searchContainer.getStart(), searchContainer.getEnd());
					int total = AssessmentofInspectionMethodLocalServiceUtil.countByA1Mark_A301Mark(A1Mark, A301Mark, assessmentid, assessmentyear);
		
					searchContainer.setTotal(total);
					searchContainer.setResults(list);
					%>
					
					<c:choose>
						<c:when test="<%= searchContainer.getTotal() == 0 %>">
							<h3 style = "font-size: 20px">Không chọn được phương thức kiếm tra phù hợp</h3>
						</c:when>
						<c:otherwise>
							<table class="wd-table table">
								<caption style = "font-size: 20px">Phương thức kiểm tra</caption>
								<thead>
									<tr>
										<th>STT</th>
										<th>Mã</th>
										<th>Tên</th>
										<th>Kỳ đánh giá</th>
									</tr>
								</thead>
								<tbody>
								<%
									int index3 = 1;
									for (AssessmentofInspectionMethod item : searchContainer.getResults()) {
										
								%>
									<tr>
										<td class="text-center"><%=(index3++) + searchContainer.getStart() %></td>
										<td class="text-left"><%=item.getMethodcode() %></td>
										<td class="text-center"><%=item.getMethodname() %></td>
										<td class="text-center"><%=item.getEvaluationperiod() %></td>
									</tr>
									<%
								}
								%>
								</tbody>
							</table>
							
							<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
						</c:otherwise>
					</c:choose>
				</c:otherwise>
			</c:choose>
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

$( document ).ready(function() {
	$(document.body).delegate('#<%= Constants.ID_ASSESSMENT_PERIOD %>', "change", function(){
		$.ajax({
			url: '<%=resourceURL%>',
			dataType: 'json',
			data : {
				<%= Constants.ID_ASSESSMENT_PERIOD %> : $(this).val(),
				type: 'findAssessmentofProduct'
			},
			type: 'get',
			success : function(data) {
				var ASSESSMENTOFPRODUCT = $('#<%= Constants.ID_ASSESSMENTOFPRODUCT %>');
				
				ASSESSMENTOFPRODUCT.find('option').remove();
				
				$('<option>').val("").text("--- Chọn ---").appendTo(ASSESSMENTOFPRODUCT);
				
				$.each(data, function(idx, obj) {
					//if(valueSelected == obj.code) {
					//	$('<option>').val(obj.code).text(obj.name).attr("selected","selected").appendTo(ASSESSMENTOFPRODUCT);
					//} else {
						$('<option>').val(obj.code).text(obj.name).appendTo(ASSESSMENTOFPRODUCT);
					//}
				});
			}
		});
	});
});
</script>