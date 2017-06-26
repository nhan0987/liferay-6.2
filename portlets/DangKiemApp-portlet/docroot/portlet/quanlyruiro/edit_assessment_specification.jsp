<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
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
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
	String specificationgroupcode = ParamUtil.getString(request, "specificationgroupcode");
	
	long assessmentOfImporterId = ParamUtil.getLong(request, Constants.ID_ASSESSMENTOFIMPORTER);
	
	AssessmentofImporter assessofImporter = AssessmentofImporterLocalServiceUtil.getAssessmentofImporter(assessmentOfImporterId);
	
	String assessmentid = ParamUtil.getString(request, "assessmentid");
	
	String assessmentyear = ParamUtil.getString(request, "assessmentyear");
	
	String evaluationperiod = assessofImporter.getEvaluationperiod();
	
	if(Validator.isNull(assessmentid) || Validator.isNull(assessmentyear)
			|| (assessmentid.trim().length() == 0) 
			|| (assessmentyear.trim().length() == 0)) { // tao moi
		AssessmentPeriod assessmentPeriod = AssessmentPeriodLocalServiceUtil.getLatestAssessmentPeriod();
		
		assessmentid = assessmentPeriod.getAssessmentid();
		
		assessmentyear = assessmentPeriod.getAssessmentyear();
		
		evaluationperiod = assessmentPeriod.getEvaluationperiod();
	}
	
	List<AssessmentSpecificationConfig> listLevel0 = AssessmentSpecificationConfigLocalServiceUtil
			.findByAssessmentidAndAssessmentyear(specificationgroupcode, assessmentid, assessmentyear);
	
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);

	PortletURL addURL = renderResponse.createActionURL();
	addURL.setParameter(ActionRequest.ACTION_NAME, "updateDanhGiaDoanhNghiep");
	addURL.setParameter(Constants.RETURN_URL, returnURL);	
	
	// Ghi actionlog
	String noidungthaotac = "Vào chức năng Thiết lập mới Tiêu chí đánh giá rủi ro "+ DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Màn hình Thiết lập mới Tiêu chí đánh giá rủi ro ";
	if (assessmentOfImporterId > 0) {
		noidungthaotac = "Vào chức năng Thiết lập Tiêu chí đánh giá rủi ro thời điểm "+ DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date());
		tenmanhinhdaidien = "Màn hình Chỉnh sửa Thiết lập Tiêu chí đánh giá rủi ro kiểm tra";
	}
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<div class="" style="padding-top: 1%;color: #777;text-align: left;font-size: 20px;padding-left: 10px;"><%=assessmentOfImporterId == 0 ? "Tạo mới" : "Chỉnh sửa"%></div>
		<div class="col-xs-12 col-sm-12 col-md-12" id="cot2"><br>
			<div class="col-md-12" id="main">
				<aui:form action="<%=addURL%>" name="myForm" id="myForm" method="POST">
					<input type="hidden" name='<%= Constants.ID_ASSESSMENTOFIMPORTER %>' value="<%= assessmentOfImporterId %>">
					<input type="hidden" name='assessmentid' value="<%= assessmentid %>">
					<input type="hidden" name='assessmentyear' value="<%= assessmentyear %>">
					<input type="hidden" name='specificationgroupcode' value="<%= specificationgroupcode %>">
					<input type="hidden" name='evaluationperiod' value="<%= HtmlUtil.escape(evaluationperiod) %>">
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> Kế hoạch đánh giá rủi ro</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="period" readonly="readonly" value="<%= evaluationperiod %>"  
								maxlength="200" style="width: 400px" cssClass="form-control-find" type="text" size="30" label="" disabled="<%= true %>">
							</aui:input>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> Mã doanh nghiệp</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="importerCode" value='<%=assessofImporter.getImportercode()%>'  
								maxlength="200" style="width: 400px" cssClass="form-control-find" type="text" size="30" label="" disabled="<%= true %>">
							</aui:input>
						</div>
					</div>
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> Tên doanh nghiệp</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="importerName" value='<%=assessofImporter.getImportername()%>'  
								maxlength="200" style="width: 400px" cssClass="form-control-find" type="text" size="30" label="" disabled="<%= true %>">
							</aui:input>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> Địa chỉ doanh nghiệp</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="importerAddress" value='<%=assessofImporter.getImporteraddress()%>'  
								maxlength="200" style="width: 400px" cssClass="form-control-find" type="text" size="30" label="" disabled="<%= true %>">
							</aui:input>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> Tên người đại diện</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="importerRepresentative" value='<%=assessofImporter.getRepresentative()%>'  
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
									<th width="15%">Tiêu chí đánh giá (Level0)</th>
									<th width="30%">Kết quả đánh giá (Level1)</th>
									<th width="15%">Chỉ số</th>
									<th width="20%">Hệ số</th>
									<th width="12%">Tính điểm</th>
								</tr>
							</thead>
							<tbody>
								<% 
									for(int i = 0; i < listLevel0.size(); i++) { 
										AssessmentSpecificationConfig level0 = listLevel0.get(i);
										
										String specificationcode = level0.getSpecificationcode();
										String specificationname = level0.getSpecificationname();
										
										List<DmDataItem> listLevel1 = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1(
												GetterUtil.getLong(specificationgroupcode), 1, level0.getSpecificationcode());
										
										List<AssessmentSpecification> listAssessmentSpecification = 
												AssessmentSpecificationLocalServiceUtil.findByImporterCodeAndSpecificationCode(
														specificationgroupcode, assessofImporter.getImportercode(), specificationcode, assessmentid, assessmentyear);
										
										String specificationvalue = "";
										String specificationdescription = "";
										
										double assessmentindex = 0;
										double assessmentcoefficient = level0.getAssessmentcoefficient();
										double assessmentmark = 0;
										
										if(listAssessmentSpecification != null && listAssessmentSpecification.size() > 0) {
											specificationvalue = listAssessmentSpecification.get(0).getSpecificationvalue();
											specificationdescription = listAssessmentSpecification.get(0).getSpecificationdescription();
											
											assessmentindex = GetterUtil.getDouble(listAssessmentSpecification.get(0).getAssessmentindex());
											assessmentcoefficient = GetterUtil.getDouble(listAssessmentSpecification.get(0).getAssessmentcoefficient());
											assessmentmark = GetterUtil.getDouble(listAssessmentSpecification.get(0).getAssessmentmark());
										}
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
										<td class="text-left">
											<select class="specificationvalue" 
												id='<%= "specificationvalue" + (i + 1) %>'
												name='<%= "specificationvalue" + (i + 1) %>'>
													<option value="">--- Lựa chọn ---</option>
													
													<% for(DmDataItem item : listLevel1) {%>
														<option value="<%= item.getCode0() %>" 
															<%=item.getCode0().trim().equalsIgnoreCase(specificationvalue) ? "selected" : "" %>
															data-assessmentindex="<%= item.getAlterName() %>"
															data-specificationdescription="<%= HtmlUtil.escape(item.getName()) %>"
															data-rowindex="<%= (i + 1) %>">
																<%= item.getName() %>
														</option>
													<%} %>
											</select>
										</td>
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentindex" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentindex" + (i + 1) %>' value="<%= assessmentindex %>">
											<input type="hidden" class="text-center " id='<%= "specificationdescription" + (i + 1) %>' 
												readonly="readonly" name='<%= "specificationdescription" + (i + 1) %>' value="<%= specificationdescription %>">
										</td>
										
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentcoefficient" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentcoefficient" + (i + 1) %>' value="<%= assessmentcoefficient %>">
										</td>
										<td class="text-center">
											<input type="text" class="text-center " id='<%= "assessmentmark" + (i + 1) %>' 
												readonly="readonly" name='<%= "assessmentmark" + (i + 1) %>' value="<%= assessmentmark %>">
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
						<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">
							<liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationinspector.quaylai"/>
						</button>
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
		
		var assessmentindex = 0;
		var assessmentcoefficient = 0;
		var assessmentmarkRow = 0;
		
		if($('#assessmentindex' + rowindex).length > 0) {
			assessmentindex = parseFloat($('#assessmentindex' + rowindex).val());
		}
		
		if($('#assessmentcoefficient' + rowindex).length > 0) {
			assessmentcoefficient = parseFloat($('#assessmentcoefficient' + rowindex).val());
		}
		
		assessmentmarkRow = assessmentindex * assessmentcoefficient;
		assessmentMark = assessmentMark + assessmentmarkRow;
		
		if($('#assessmentmark' + rowindex).length > 0) {
			$('#assessmentmark' + rowindex).val(assessmentmarkRow);
		}
	}) ;
	
	$('#assessmentmarktotal').text(assessmentMark);
}

$( document ).ready(function() {
	caclAssessmentMark();
	
	$('.specificationvalue').change(function(){
		var selected = $(this).find('option:selected');
		var assessmentindex = selected.data('assessmentindex'); 
		var specificationdescription = selected.data('specificationdescription'); 
		var rowindex = selected.data('rowindex');
		
		if($('#assessmentindex' + rowindex).length > 0) {
			$('#assessmentindex' + rowindex).val(assessmentindex);
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
