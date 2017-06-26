<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectionMethodLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod"%>
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
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.AssessmentofInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);

	long assessmentofInspectionMethodId = ParamUtil.getLong(request, Constants.ID_ASSESSMENTOFINSPECTIONMETHOD);
	
	AssessmentofInspectionMethod assessmentofInspectionMethod = null;
	
	if(assessmentofInspectionMethodId > 0) {
		assessmentofInspectionMethod = AssessmentofInspectionMethodLocalServiceUtil.getAssessmentofInspectionMethod(assessmentofInspectionMethodId);
	}
	
	String assessmentid = ParamUtil.getString(request, "assessmentid");
	
	String assessmentyear = ParamUtil.getString(request, "assessmentyear");
	
	String evaluationperiod = assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getEvaluationperiod() : "";
	
	if(Validator.isNull(assessmentid) || Validator.isNull(assessmentyear)) { // tao moi
		AssessmentPeriod assessmentPeriod = AssessmentPeriodLocalServiceUtil.getLatestAssessmentPeriod();
		
		assessmentid = assessmentPeriod.getAssessmentid();
		
		assessmentyear = assessmentPeriod.getAssessmentyear();
		
		evaluationperiod = assessmentPeriod.getEvaluationperiod();
	}

	PortletURL addURL = renderResponse.createActionURL();
	addURL.setParameter(ActionRequest.ACTION_NAME, "updateAssessmentofInspectionMethod");
	addURL.setParameter(Constants.RETURN_URL, returnURL);
	
	// Ghi actionlog
	String noidungthaotac = "Vào chức năng Tạo mới Phương thức kiểm tra thời điểm "+ DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Màn hình Tạo mới Phương thức kiểm tra";
	if (assessmentofInspectionMethodId > 0) {
		noidungthaotac = "Vào chức năng Sửa Phương thức kiểm tra thời điểm "+ DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date());
		tenmanhinhdaidien = "Màn hình Chỉnh sửa Phương thức kiểm tra";
	}
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<div class="" style="padding-top: 1%;color: #777;text-align: left;font-size: 20px;padding-left: 10px;"><%=assessmentofInspectionMethodId == 0 ? "Tạo mới" : "Chỉnh sửa"%></div>
		<div class="col-xs-12 col-sm-12 col-md-12" id="cot2"><br>
			<div class="col-md-12" id="main">
				<aui:form action="<%=addURL%>" name="myForm" id="myForm" method="POST">
					<input type="hidden" name='<%= Constants.ID_ASSESSMENTOFINSPECTIONMETHOD %>' value="<%= assessmentofInspectionMethodId %>">
					<input type="hidden" name='assessmentid' value="<%= assessmentid %>">
					<input type="hidden" name='assessmentyear' value="<%= assessmentyear %>">
					<input type="hidden" name='evaluationperiod' value="<%= HtmlUtil.escape(evaluationperiod) %>">
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> Năm đánh giá</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="year" readonly="readonly" value="<%= assessmentyear %>"  
								maxlength="200" style="width: 400px" type="text" size="30" label="" disabled="<%= true %>">
							</aui:input>
						</div>
					</div>
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> Kế hoạch đánh giá rủi ro</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="period" readonly="readonly" value="<%= evaluationperiod %>"  
								maxlength="200" style="width: 400px" type="text" size="30" label="" disabled="<%= true %>">
							</aui:input>
						</div>
					</div>
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> Mã</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="methodcode" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getMethodcode() : ""%>'
								maxlength="200" style="width: 400px" cssClass="form-control-find" type="text" size="30" label="">
							</aui:input>
						</div>
					</div>
					
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> Tên</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="methodname" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getMethodname() : ""%>'  
								maxlength="200" style="width: 400px" cssClass="form-control-find" type="text" size="30" label="">
							</aui:input>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> STT</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="methodsequenceno" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getMethodsequenceno() : ""%>'  
								maxlength="200" style="width: 400px" cssClass="form-control-find" type="text" size="30" label="">
							</aui:input>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<label class="textlabel"> Mô tả</label>
						</div>
						<div class="col-xs-10 col-sm-10 col-md-10">
							<aui:input name="methoddescription" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getMethoddescription() : ""%>'  
								maxlength="200" style="width: 400px" cssClass="form-control-find" type="textarea" size="30" label="">
							</aui:input>
						</div>
					</div>
					
					<!-- ImporterRiskDescription -->
					
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12">
							<label class="textlabel"> 1. Đánh giá, kiểm soát doanh nghiệp</label>
						</div>
					</div>
					
					<div class="col-xs-12 col-sm-12 col-md-12">
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"> Mô tả</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input name="ImporterRiskDescription" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getImporterRiskDescription() : ""%>'  
									maxlength="200" style="width: 400px;margin-bottom:10px;" cssClass="form-control-find" type="textarea" size="30" label="">
								</aui:input>
							</div>
						</div>
						
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel">Thang điểm nhỏ nhất</label>
							</div>
							<div class="col-xs-2 col-sm-2 col-md-2">
								<aui:input name="A1MarkFloor" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getA1MarkFloor() : ""%>'  
									style="width: 80px" cssClass="form-control-find control-number" type="text" label="">
								</aui:input>
							</div>
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel">Thang điểm lớn nhất</label>
							</div>
							<div class="col-xs-2 col-sm-2 col-md-2">
								<aui:input name="A1MarkCeil" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getA1MarkCeil() : ""%>'  
									style="width: 60px" cssClass="form-control-find control-number" type="text" label="">
								</aui:input>
							</div>
						</div>
					</div>
					
					<!-- ProductRiskDescription -->
					
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12">
							<label class="textlabel"> 2. Kiểm soát rủi ro sản phẩm</label>
						</div>
					</div>
					
					<div class="col-xs-12 col-sm-12 col-md-12">
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"> Mô tả</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input name="ProductRiskDescription" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getProductRiskDescription() : ""%>'  
									maxlength="200" style="width: 400px;margin-bottom:10px;" cssClass="form-control-find" type="textarea" size="30" label="">
								</aui:input>
							</div>
						</div>
						
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel">Thang điểm nhỏ nhất</label>
							</div>
							<div class="col-xs-2 col-sm-2 col-md-2">
								<aui:input name="A301MarkFloor" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getA301MarkFloor() : ""%>'  
									style="width: 80px" cssClass="form-control-find control-number" type="text" label="">
								</aui:input>
							</div>
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel">Thang điểm lớn nhất</label>
							</div>
							<div class="col-xs-2 col-sm-2 col-md-2">
								<aui:input name="A301MarkCeil" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getA301MarkCeil() : ""%>'  
									style="width: 60px" cssClass="form-control-find control-number" type="text" label="">
								</aui:input>
							</div>
						</div>
					</div>
					
					<!-- PurposeRiskDescription -->
					
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12">
							<label class="textlabel"> 3. Mục đích nhập khẩu</label>
						</div>
					</div>
					
					<div class="col-xs-12 col-sm-12 col-md-12">
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"> Mô tả</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input name="PurposeRiskDescription;margin-bottom:10px;" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getPurposeRiskDescription() : ""%>'  
									maxlength="200" style="width: 400px;margin-bottom:10px;" cssClass="form-control-find" type="textarea" size="30" label="">
								</aui:input>
							</div>
						</div>
						
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"> Thang điểm</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input name="A302Mark" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getA302Mark() : ""%>'  
									style="width: 80px" cssClass="form-control-find control-number" type="text" label="">
								</aui:input>
							</div>
						</div>
					</div>
					
					<!-- CertifiedRiskDescription -->
					
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12">
							<label class="textlabel"> 4. Tình trạng chứng nhận</label>
						</div>
					</div>
					
					<div class="col-xs-12 col-sm-12 col-md-12">
				
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"> Mô tả</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input name="CertifiedRiskDescription" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getCertifiedRiskDescription() : ""%>'  
									maxlength="200" style="width: 400px;margin-bottom:10px;" cssClass="form-control-find" type="textarea" size="30" label="">
								</aui:input>
							</div>
						</div>
						
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"> Thang điểm</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input name="A304Mark" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getA304Mark() : ""%>'  
									style="width: 80px" cssClass="form-control-find control-number" type="text" label="">
								</aui:input>
							</div>
						</div>
					</div>
					
					<!-- UsageRiskDescription -->
					
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12">
							<label class="textlabel"> 5. Tình trạng sử dụng</label>
						</div>
					</div>
					
					<div class="col-xs-12 col-sm-12 col-md-12">
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"> Mô tả</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input name="UsageRiskDescription" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getUsageRiskDescription() : ""%>'  
									maxlength="200" style="width: 400px;margin-bottom:10px;" cssClass="form-control-find" type="textarea" size="30" label="">
								</aui:input>
							</div>
						</div>
						
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"> Thang điểm</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input name="A303Mark" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getA303Mark() : ""%>'  
									style="width: 80px" cssClass="form-control-find control-number" type="text" label="">
								</aui:input>
							</div>
						</div>
					</div>
					
					<!-- TransportRiskDescription -->
					
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12">
							<label class="textlabel"> 6. Phạm vi hoạt động</label>
						</div>
					</div>
					
					<div class="col-xs-12 col-sm-12 col-md-12">
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"> Mô tả</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input name="TransportRiskDescription" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getTransportRiskDescription() : ""%>'  
									maxlength="200" style="width: 400px;margin-bottom:10px;" cssClass="form-control-find" type="textarea" size="30" label="">
								</aui:input>
							</div>
						</div>
						
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"> Thang điểm</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input name="A305Mark" value='<%=assessmentofInspectionMethod != null ? assessmentofInspectionMethod.getA305Mark() : ""%>'  
									style="width: 80px" cssClass="form-control-find control-number" type="text" label="">
								</aui:input>
							</div>
						</div>
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
<style>
<!--

.quanlyruiroaction-portlet .textlabel {
	font-weight: bold;
}

.quanlyruiroaction-portlet .control-number {
	width: 50px;
}
-->
</style>
