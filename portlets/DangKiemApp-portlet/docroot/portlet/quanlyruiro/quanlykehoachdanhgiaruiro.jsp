<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentSpecificationConfigLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentPeriodLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofImporterLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofProductLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
	String specificationgroupcode = ParamUtil.getString(request, "specificationgroupcode");
	String specificationgroupcodeA1 = DanhMucKey.A1_CODE;
	String specificationgroupcodeA2 = DanhMucKey.A2_CODE;
	String specificationgroupcodeA3 = DanhMucKey.A3_CODE;
	String specificationgroupcodeA4 = DanhMucKey.A4_CODE;
	String specificationgroupcodeA5 = DanhMucKey.A5_CODE;
	long AssessmentPeriodID = ParamUtil.getLong(request, Constants.ID_ASSESSMENT_PERIOD);
	
	AssessmentPeriod assessmentofPeriod = AssessmentPeriodLocalServiceUtil.getAssessmentPeriod(AssessmentPeriodID);
	
	String assessmentid = ParamUtil.getString(request, "assessmentid");
	
	String assessmentyear = ParamUtil.getString(request, "assessmentyear");
	
	String evaluationperiod = assessmentofPeriod.getEvaluationperiod();
	
	if(Validator.isNull(assessmentid) || Validator.isNull(assessmentyear) 
			|| (assessmentid.trim().length() == 0) 
			|| (assessmentyear.trim().length() == 0)) { // tao moi
		AssessmentPeriod assessmentPeriod = AssessmentPeriodLocalServiceUtil.getLatestAssessmentPeriod();
		
		assessmentid = assessmentPeriod.getAssessmentid();
		
		assessmentyear = assessmentPeriod.getAssessmentyear();
		
		evaluationperiod = assessmentPeriod.getEvaluationperiod();
	}
	
	List<AssessmentSpecificationConfig> A1listLevel0 = AssessmentSpecificationConfigLocalServiceUtil
			.findByAssessmentidAndAssessmentyear(specificationgroupcodeA1, assessmentid, assessmentyear);
	List<AssessmentSpecificationConfig> A2listLevel0 = AssessmentSpecificationConfigLocalServiceUtil
			.findByAssessmentidAndAssessmentyear(specificationgroupcodeA2, assessmentid, assessmentyear);
	List<AssessmentSpecificationConfig> A3listLevel0 = AssessmentSpecificationConfigLocalServiceUtil
			.findByAssessmentidAndAssessmentyear(specificationgroupcodeA3, assessmentid, assessmentyear);
	List<AssessmentSpecificationConfig> A4listLevel0 = AssessmentSpecificationConfigLocalServiceUtil
			.findByAssessmentidAndAssessmentyear(specificationgroupcodeA4, assessmentid, assessmentyear);
	List<AssessmentSpecificationConfig> A5listLevel0 = AssessmentSpecificationConfigLocalServiceUtil
			.findByAssessmentidAndAssessmentyear(specificationgroupcodeA5, assessmentid, assessmentyear);
	
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);

	PortletURL addURL = renderResponse.createActionURL();
	addURL.setParameter(ActionRequest.ACTION_NAME, "updateKehoachDanhgiaRuiro");
	addURL.setParameter(Constants.RETURN_URL, returnURL);
	
	
	// Ghi actionlog
	String noidungthaotac = "Mở chức năng Quản lý kế hoạch đánh giá rủi ro thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Quản lý kế hoạch đánh giá rủi ro";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<div class="" style="padding-top: 1%;color: #777;text-align: left;font-size: 20px;padding-left: 10px;"><%=AssessmentPeriodID == 0 ? "Tạo mới" : "Chỉnh sửa"%></div>
		<div class="col-xs-12 col-sm-12 col-md-12" id="cot2"><br>
			<div class="col-md-12" id="main">
				<aui:form action="<%=addURL%>" name="myForm" id="myForm" method="POST">
					<input type="hidden" name='<%= Constants.ID_ASSESSMENT_PERIOD %>' value="<%= AssessmentPeriodID %>">

					<input type="hidden" name='specificationgroupcodeA1' value="<%= specificationgroupcodeA1 %>">
					<input type="hidden" name='specificationgroupcodeA2' value="<%= specificationgroupcodeA2 %>">
					<input type="hidden" name='specificationgroupcodeA3' value="<%= specificationgroupcodeA3 %>">
					<input type="hidden" name='specificationgroupcodeA4' value="<%= specificationgroupcodeA4 %>">
					<input type="hidden" name='specificationgroupcodeA5' value="<%= specificationgroupcodeA5 %>">
					<input type="hidden" name='evaluationperiod' value="<%= HtmlUtil.escape(evaluationperiod) %>">
					
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> Mã lịch đánh giá</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="assessmentid" readonly ="true" value='<%=assessmentid%>'  
								maxlength="200" style="width: 400px" cssClass="form-control-find" type="text" size="30" label="" disabled="<%= true %>">
							</aui:input>
						</div>
					</div>
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> Năm đánh giá</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="assessmentyear" readonly ="true" value='<%=assessmentyear%>'  
								maxlength="200" style="width: 400px" cssClass="form-control-find" type="text" size="30" label="" disabled="<%= true %>">
							</aui:input>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> Kế hoạch đánh giá rủi ro</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="period" value="<%= evaluationperiod %>"  
								maxlength="200" style="width: 400px" cssClass="form-control-find" type="text" size="30" label="" disabled="<%= true %>">
							</aui:input>
						</div>
					</div>
					
					
					<div class="clearfix"></div>
					
					<!-- SPECIFICATION CONFIG -->
					<div class="AccordionPanelContent AssessmentOfImporterSpecificationConfig">
						<table class="table table-condensed table-hover table-bordered hh-table" id="<portlet:namespace/>dataTable"> 
							<thead>
								<tr>
									<th width="5%">STT</th>
									<th width="15%">Tiêu chí đánh giá doanh nghiệp </th>
									<th width="30%">Kết quả đánh giá doanh nghiệp </th>
									<th width="15%">Chỉ số</th>
									<th width="20%">Hệ số</th>
									<th width="12%">Tính điểm</th>
								</tr>
							</thead>
							<tbody>
								<% 
									for(int i = 0; i < A1listLevel0.size(); i++) { 
										AssessmentSpecificationConfig level0 = A1listLevel0.get(i);
										
										String specificationcode = level0.getSpecificationcode();
										String specificationname = level0.getSpecificationname();
										
										
										String specificationvalue = "";
										String specificationdescription = "";
										
										double assessmentindexmin = level0.getAssessmentindexmin();
										double assessmentmarkmin = level0.getAssessmentmarkmin();
										double assessmentindexmax = level0.getAssessmentindexmax();
										double assessmentmarkmax = level0.getAssessmentmarkmax();
										double assessmentcoefficient = level0.getAssessmentcoefficient();
										
										
						
									%>
									
													
									
									<tr>
										<td class="text-center">
											<input type="hidden" name='<portlet:namespace/>rowIndex' class='<portlet:namespace/>rowIndex' value="<%= i+1 %>">
																						
											<input type="text" class="text-center"
												readonly="readonly" name='stt' value="<%= i+1 %>">
											
										</td>
										<td class="text-center">
											<input type="hidden" name='<%= "specificationcode" + (i + 1) %>' value="<%= specificationcode %>" class="text-center">
											<input type="text" readonly="readonly" name='<%= "specificationname" + (i + 1) %>' value="<%= specificationname %>" class="text-left">
										</td>

										<td class="text-center">
											<input type="hidden" class="text-center " id='<%= "specificationdescription" + (i + 1) %>' 
												readonly="readonly" name='<%= "specificationdescription" + (i + 1) %>' value="<%= specificationdescription %>">
											<input type="text" class="text-center " id='<%= "assessmentindexmin" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentindexmin" + (i + 1) %>' value="<%= assessmentindexmin %>">
												<input type="text" class="text-center " id='<%= "assessmentindexmax" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentindexmax" + (i + 1) %>' value="<%= assessmentindexmax %>">
											
										</td>
										
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentcoefficient" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentcoefficient" + (i + 1) %>' value="<%= assessmentcoefficient %>">
										</td>
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentmarkmin" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentmarkmin" + (i + 1) %>' value="<%= assessmentmarkmin %>">
										</td>
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentmarkmax" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentmarkmax" + (i + 1) %>' value="<%= assessmentmarkmax %>">
										</td>
									</tr>
								<%} %>
							</tbody>
							<tfoot>
								<tr>
									<td colspan="5" class="text-right assessmentmarktotal">Tổng: </td>
									<td class="text-right"><span id="assessmentmarktotal"></span></td>
								</tr>
							</tfoot>
						</table>
					</div>
						
						
						
					<div class="clearfix"></div>
					
					<!-- SPECIFICATION CONFIG -->
					<div class="AccordionPanelContent AssessmentOfImporterSpecificationConfig">
						<table class="table table-condensed table-hover table-bordered hh-table" id="<portlet:namespace/>dataTable"> 
							<thead>
								<tr>
									<th width="5%">STT</th>
									<th width="15%">Tiêu chí kiểm soát doanh nghiệp </th>
									<th width="30%">Kết quả kiểm soát doanh nghiệp </th>
									<th width="15%">Chỉ số</th>
									<th width="20%">Hệ số</th>
									<th width="12%">Tính điểm</th>
								</tr>
							</thead>
							<tbody>
								<% 
									for(int i = 0; i < A2listLevel0.size(); i++) { 
										AssessmentSpecificationConfig level0 = A2listLevel0.get(i);
										
										String specificationcode = level0.getSpecificationcode();
										String specificationname = level0.getSpecificationname();
										
										
										String specificationvalue = "";
										String specificationdescription = "";
										
										double assessmentindexmin = level0.getAssessmentindexmin();
										double assessmentmarkmin = level0.getAssessmentmarkmin();
										double assessmentindexmax = level0.getAssessmentindexmax();
										double assessmentmarkmax = level0.getAssessmentmarkmax();
										double assessmentcoefficient = level0.getAssessmentcoefficient();
										
										
						
									%>
									
													
									
									<tr>
										<td class="text-center">
											<input type="hidden" name='<portlet:namespace/>rowIndex' class='<portlet:namespace/>rowIndex' value="<%= i+1 %>">
																						
											<input type="text" class="text-center"
												readonly="readonly" name='stt' value="<%= i+1 %>">
											
										</td>
										<td class="text-center">
											<input type="hidden" name='<%= "specificationcode" + (i + 1) %>' value="<%= specificationcode %>" class="text-center">
											<input type="text" readonly="readonly" name='<%= "specificationname" + (i + 1) %>' value="<%= specificationname %>" class="text-left">
										</td>

										<td class="text-center">
											<input type="hidden" class="text-center " id='<%= "specificationdescription" + (i + 1) %>' 
												readonly="readonly" name='<%= "specificationdescription" + (i + 1) %>' value="<%= specificationdescription %>">
											<input type="text" class="text-center " id='<%= "assessmentindexmin" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentindexmin" + (i + 1) %>' value="<%= assessmentindexmin %>">
												<input type="text" class="text-center " id='<%= "assessmentindexmax" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentindexmax" + (i + 1) %>' value="<%= assessmentindexmax %>">
											
										</td>
										
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentcoefficient" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentcoefficient" + (i + 1) %>' value="<%= assessmentcoefficient %>">
										</td>
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentmarkmin" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentmarkmin" + (i + 1) %>' value="<%= assessmentmarkmin %>">
										</td>
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentmarkmax" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentmarkmax" + (i + 1) %>' value="<%= assessmentmarkmax %>">
										</td>
									</tr>
								<%} %>
							</tbody>
							<tfoot>
								<tr>
									<td colspan="5" class="text-right assessmentmarktotal">Tổng: </td>
									<td class="text-right"><span id="assessmentmarktotal"></span></td>
								</tr>
							</tfoot>
						</table>
					</div>
					
					
					<div class="clearfix"></div>
					
					<!-- SPECIFICATION CONFIG -->
					<div class="AccordionPanelContent AssessmentOfImporterSpecificationConfig">
						<table class="table table-condensed table-hover table-bordered hh-table" id="<portlet:namespace/>dataTable"> 
							<thead>
								<tr>
									<th width="5%">STT</th>
									<th width="15%">Tiêu chí kiểm soát sản phẩm </th>
									<th width="30%">Kết quả kiểm soát sản phẩm </th>
									<th width="15%">Chỉ số</th>
									<th width="20%">Hệ số</th>
									<th width="12%">Tính điểm</th>
								</tr>
							</thead>
							<tbody>
								<% 
									for(int i = 0; i < A3listLevel0.size(); i++) { 
										AssessmentSpecificationConfig level0 = A3listLevel0.get(i);
										
										String specificationcode = level0.getSpecificationcode();
										String specificationname = level0.getSpecificationname();
										
										
										String specificationvalue = "";
										String specificationdescription = "";
										
										double assessmentindexmin = level0.getAssessmentindexmin();
										double assessmentmarkmin = level0.getAssessmentmarkmin();
										double assessmentindexmax = level0.getAssessmentindexmax();
										double assessmentmarkmax = level0.getAssessmentmarkmax();
										double assessmentcoefficient = level0.getAssessmentcoefficient();
										
										
						
									%>
									
													
									
									<tr>
										<td class="text-center">
											<input type="hidden" name='<portlet:namespace/>rowIndex' class='<portlet:namespace/>rowIndex' value="<%= i+1 %>">
																						
											<input type="text" class="text-center"
												readonly="readonly" name='stt' value="<%= i+1 %>">
											
										</td>
										<td class="text-center">
											<input type="hidden" name='<%= "specificationcode" + (i + 1) %>' value="<%= specificationcode %>" class="text-center">
											<input type="text" readonly="readonly" name='<%= "specificationname" + (i + 1) %>' value="<%= specificationname %>" class="text-left">
										</td>

										<td class="text-center">
											<input type="hidden" class="text-center " id='<%= "specificationdescription" + (i + 1) %>' 
												readonly="readonly" name='<%= "specificationdescription" + (i + 1) %>' value="<%= specificationdescription %>">
											<input type="text" class="text-center " id='<%= "assessmentindexmin" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentindexmin" + (i + 1) %>' value="<%= assessmentindexmin %>">
												<input type="text" class="text-center " id='<%= "assessmentindexmax" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentindexmax" + (i + 1) %>' value="<%= assessmentindexmax %>">
											
										</td>
										
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentcoefficient" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentcoefficient" + (i + 1) %>' value="<%= assessmentcoefficient %>">
										</td>
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentmarkmin" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentmarkmin" + (i + 1) %>' value="<%= assessmentmarkmin %>">
										</td>
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentmarkmax" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentmarkmax" + (i + 1) %>' value="<%= assessmentmarkmax %>">
										</td>
									</tr>
								<%} %>
							</tbody>
							<tfoot>
								<tr>
									<td colspan="5" class="text-right assessmentmarktotal">Tổng: </td>
									<td class="text-right"><span id="assessmentmarktotal"></span></td>
								</tr>
							</tfoot>
						</table>
					</div>
					
					<div class="clearfix"></div>
					
					<!-- SPECIFICATION CONFIG -->
					<div class="AccordionPanelContent AssessmentOfImporterSpecificationConfig">
						<table class="table table-condensed table-hover table-bordered hh-table" id="<portlet:namespace/>dataTable"> 
							<thead>
								<tr>
									<th width="5%">STT</th>
									<th width="15%">Tiêu chí đánh giá nhân sự trực tiếp</th>
									<th width="30%">Kết quả đánh giá </th>
									<th width="15%">Chỉ số</th>
									<th width="20%">Hệ số</th>
									<th width="12%">Tính điểm</th>
								</tr>
							</thead>
							<tbody>
								<% 
									for(int i = 0; i < A4listLevel0.size(); i++) { 
										AssessmentSpecificationConfig level0 = A4listLevel0.get(i);
										
										String specificationcode = level0.getSpecificationcode();
										String specificationname = level0.getSpecificationname();
										
										
										String specificationvalue = "";
										String specificationdescription = "";
										
										double assessmentindexmin = level0.getAssessmentindexmin();
										double assessmentmarkmin = level0.getAssessmentmarkmin();
										double assessmentindexmax = level0.getAssessmentindexmax();
										double assessmentmarkmax = level0.getAssessmentmarkmax();
										double assessmentcoefficient = level0.getAssessmentcoefficient();
										
										
						
									%>
									
													
									
									<tr>
										<td class="text-center">
											<input type="hidden" name='<portlet:namespace/>rowIndex' class='<portlet:namespace/>rowIndex' value="<%= i+1 %>">
																						
											<input type="text" class="text-center"
												readonly="readonly" name='stt' value="<%= i+1 %>">
											
										</td>
										<td class="text-center">
											<input type="hidden" name='<%= "specificationcode" + (i + 1) %>' value="<%= specificationcode %>" class="text-center">
											<input type="text" readonly="readonly" name='<%= "specificationname" + (i + 1) %>' value="<%= specificationname %>" class="text-left">
										</td>

										<td class="text-center">
											<input type="hidden" class="text-center " id='<%= "specificationdescription" + (i + 1) %>' 
												readonly="readonly" name='<%= "specificationdescription" + (i + 1) %>' value="<%= specificationdescription %>">
											<input type="text" class="text-center " id='<%= "assessmentindexmin" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentindexmin" + (i + 1) %>' value="<%= assessmentindexmin %>">
												<input type="text" class="text-center " id='<%= "assessmentindexmax" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentindexmax" + (i + 1) %>' value="<%= assessmentindexmax %>">
											
										</td>
										
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentcoefficient" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentcoefficient" + (i + 1) %>' value="<%= assessmentcoefficient %>">
										</td>
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentmarkmin" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentmarkmin" + (i + 1) %>' value="<%= assessmentmarkmin %>">
										</td>
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentmarkmax" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentmarkmax" + (i + 1) %>' value="<%= assessmentmarkmax %>">
										</td>
									</tr>
								<%} %>
							</tbody>
							<tfoot>
								<tr>
									<td colspan="5" class="text-right assessmentmarktotal">Tổng: </td>
									<td class="text-right"><span id="assessmentmarktotal"></span></td>
								</tr>
							</tfoot>
						</table>
					</div>
					
					<div class="clearfix"></div>
					
					<!-- SPECIFICATION CONFIG -->
					<div class="AccordionPanelContent AssessmentOfImporterSpecificationConfig">
						<table class="table table-condensed table-hover table-bordered hh-table" id="<portlet:namespace/>dataTable"> 
							<thead>
								<tr>
									<th width="5%">STT</th>
									<th width="15%">Tiêu chí đánh giá nhân sự gián tiếp</th>
									<th width="30%">Kết quả đánh giá </th>
									<th width="15%">Chỉ số</th>
									<th width="20%">Hệ số</th>
									<th width="12%">Tính điểm</th>
								</tr>
							</thead>
							<tbody>
								<% 
									for(int i = 0; i < A5listLevel0.size(); i++) { 
										AssessmentSpecificationConfig level0 = A5listLevel0.get(i);
										
										String specificationcode = level0.getSpecificationcode();
										String specificationname = level0.getSpecificationname();
										
										
										String specificationvalue = "";
										String specificationdescription = "";
										
										double assessmentindexmin = level0.getAssessmentindexmin();
										double assessmentmarkmin = level0.getAssessmentmarkmin();
										double assessmentindexmax = level0.getAssessmentindexmax();
										double assessmentmarkmax = level0.getAssessmentmarkmax();
										double assessmentcoefficient = level0.getAssessmentcoefficient();
										
										
						
									%>
									
													
									
									<tr>
										<td class="text-center">
											<input type="hidden" name='<portlet:namespace/>rowIndex' class='<portlet:namespace/>rowIndex' value="<%= i+1 %>">
																						
											<input type="text" class="text-center"
												readonly="readonly" name='stt' value="<%= i+1 %>">
											
										</td>
										<td class="text-center">
											<input type="hidden" name='<%= "specificationcode" + (i + 1) %>' value="<%= specificationcode %>" class="text-center">
											<input type="text" readonly="readonly" name='<%= "specificationname" + (i + 1) %>' value="<%= specificationname %>" class="text-left">
										</td>

										<td class="text-center">
											<input type="hidden" class="text-center " id='<%= "specificationdescription" + (i + 1) %>' 
												readonly="readonly" name='<%= "specificationdescription" + (i + 1) %>' value="<%= specificationdescription %>">
											<input type="text" class="text-center " id='<%= "assessmentindexmin" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentindexmin" + (i + 1) %>' value="<%= assessmentindexmin %>">
												<input type="text" class="text-center " id='<%= "assessmentindexmax" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentindexmax" + (i + 1) %>' value="<%= assessmentindexmax %>">
											
										</td>
										
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentcoefficient" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentcoefficient" + (i + 1) %>' value="<%= assessmentcoefficient %>">
										</td>
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentmarkmin" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentmarkmin" + (i + 1) %>' value="<%= assessmentmarkmin %>">
										</td>
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentmarkmax" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentmarkmax" + (i + 1) %>' value="<%= assessmentmarkmax %>">
										</td>
									</tr>
								<%} %>
							</tbody>
							<tfoot>
								<tr>
									<td colspan="5" class="text-right assessmentmarktotal">Tổng: </td>
									<td class="text-right"><span id="assessmentmarktotal"></span></td>
								</tr>
							</tfoot>
						</table>
					</div>
						
					<div class="row">
						<button type="submit" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px">Lưu</button>
						<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">Quay lại</button>
					</div>
				</aui:form>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
function caclAssessmentMark() {
	var assessmentMark = 0;
	
	$('.<portlet:namespace/>rowIndex').each(function(index){
		var rowindex = $(this).val();
		
		var assessmentindexmax = 0;
		var assessmentcoefficient = 0;
		var assessmentmarkRowmax = 0;
		
		if($('#assessmentindexmax' + rowindex).length > 0) {
			assessmentindexmax = parseFloat($('#assessmentindexmax' + rowindex).val());
		}
		
		if($('#assessmentcoefficient' + rowindex).length > 0) {
			assessmentcoefficient = parseFloat($('#assessmentcoefficient' + rowindex).val());
		}
		
		assessmentmarkRowmax = assessmentindexmax * assessmentcoefficient;
		assessmentMarkmax = assessmentMarkmax + assessmentmarkRowmax;
		
		if($('#assessmentmarkmax' + rowindex).length > 0) {
			$('#assessmentmarkmax' + rowindex).val(assessmentmarkRowmax);
		}
		
		
		var assessmentindexmin = 0;
		
		var assessmentmarkRowmin = 0;
		
		if($('#assessmentindexmin' + rowindex).length > 0) {
			assessmentindexmin = parseFloat($('#assessmentindexmin' + rowindex).val());
		}
		
		if($('#assessmentcoefficient' + rowindex).length > 0) {
			assessmentcoefficient = parseFloat($('#assessmentcoefficient' + rowindex).val());
		}
		
		assessmentmarkRowmin = assessmentindexmin * assessmentcoefficient;
		assessmentMarkmin = assessmentMarkmin + assessmentmarkRowmin;
		
		if($('#assessmentmarkmin' + rowindex).length > 0) {
			$('#assessmentmarkmin' + rowindex).val(assessmentmarkRowmin);
		}
	}) ;
	
	$('#assessmentmarktotalmin').text(assessmentMarkmin);
}

$( document ).ready(function() {
	caclAssessmentMark();
	
	$('.specificationvalue').change(function(){
		var selected = $(this).find('option:selected');
		var assessmentindexmax = selected.data('assessmentindexmax'); 
		var specificationdescription = selected.data('specificationdescription'); 
		var rowindex = selected.data('rowindex');
		
		if($('#assessmentindexmax' + rowindex).length > 0) {
			$('#assessmentindexmax' + rowindex).val(assessmentindexmax);
		}
		
		if($('#specificationdescription' + rowindex).length > 0) {
			$('#specificationdescription' + rowindex).val(specificationdescription);
		}
		
		caclAssessmentMark();
	});
})
</script>

<style>
<!--
.quanlyruiroaction-portlet table .text-center {
	width: 50px;
}

.assessmentmarktotal {
	font-weight: bold;
}

#assessmentmarktotal {
	font-weight: bold;
	color: red;
}
-->
</style>
