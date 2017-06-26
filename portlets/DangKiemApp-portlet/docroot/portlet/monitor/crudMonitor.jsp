<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate"%>
<%@page import="vn.dtt.gt.dk.portlet.quanlytygia.QuanLyTyGiaAction"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoAction"%>
<%@page import="java.util.UUID"%>
<%@page import="vn.dtt.gt.dk.utils.VRNghiepVuUtils"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="java.math.BigInteger"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%! private static Log _log = LogFactoryUtil.getLog(QuanLyTyGiaAction.class); %>

<%
	long newExchangeRateId = ParamUtil.getLong(request, Constants.NewExchangeRate_ID);
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);
	String isNewExchange = ParamUtil.getString(request, "isNew");
	
	_log.info("--/crudNewExchangeRate---newExchangeRateId===="+ newExchangeRateId);
	
	NewExchangeRate newExRate = NewExchangeRateLocalServiceUtil.getNewExchangeRate(newExchangeRateId);
	if (newExRate == null) { newExRate = new NewExchangeRateImpl(); }
	
	PortletURL urlEdit = renderResponse.createActionURL();
	urlEdit.setParameter(ActionRequest.ACTION_NAME, "editNewExchangeRate");
	urlEdit.setParameter(Constants.NewExchangeRate_ID, newExchangeRateId + "");
	
	

%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<div class="" style="padding-top: 1%;color: #777;text-align: left;font-size: 20px;padding-left: 10px;">
			<%=isNewExchange.equalsIgnoreCase("true") ? "Tạo mới tỉ giá" : "Chỉnh sửa tỉ giá"%>
		</div>
		<div class="col-xs-12 col-sm-12 col-md-12" id="cot2"><br>
			<div class="col-md-12" id="main">
				<aui:form action="<%=urlEdit%>" name="myForm" id="myForm" method="POST" enctype="multipart/form-data">
					<br>
						<div class="CollapsiblePanelContent" style="display: block; margin-top: 15px;" >
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.originalcurrency"/></label>
							</div>
							<div class="col-xs-5 col-sm-5 col-md-5">
								<input type="text" class="form-control-find" readonly="readonly"
									id="originalcurrency" name="originalcurrency"
									value='<%=Validator.isNotNull(newExRate.getOriginalCurrency()) ? newExRate.getOriginalCurrency() : ""%>'>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.basiccurrency"/></label>
							</div>
							<div class="col-xs-5 col-sm-5 col-md-5">
								<input type="text" class="form-control-find" readonly="readonly"
									id="basiccurrency" name="basiccurrency"
									value='<%=Validator.isNotNull(newExRate.getBasicCurrency()) ? newExRate.getBasicCurrency() : ""%>'>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.exchangerate"/> (<span style="color: red;">*</span>)</label>
							</div>
							<div class="col-xs-5 col-sm-5 col-md-5">
								<aui:input maxlength="2000" min="1" cssClass="form-control-find" size="30" 
										id="exchangerate" name="exchangerate" type="text"
										value='<%=Validator.isNotNull(newExRate.getExchangeRate()) ? newExRate.getExchangeRate() : ""%>' label="">
									<aui:validator name="required" errorMessage="Cần nhập số"/>
									<aui:validator name="number" errorMessage="Tỉ giá phải là số"/>
								</aui:input>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.publishdate"/> (<span style="color: red;">*</span>)</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<div class="input-group col-xs-3 col-sm-3 col-md-3">
									<input type="text" class="form-control-find"
										id="publishdate" name="publishdate" onclick="gtCalendar('publishdate')"
										value='<%=Validator.isNotNull(newExRate.getPublishDate()) ? DateUtils.dateToString("dd/MM/yyyy HH:mm", newExRate.getPublishDate()) : ""%>'>
									<span class="input-group-btn">
										<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('publishdate')">
											<i class="fa fa-calendar"></i>
										</button>
									</span>
								</div>
							</div>
						</div>
						
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.validfrom"/> (<span style="color: red;">*</span>)</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<div class="input-group col-xs-3 col-sm-3 col-md-3">
									<input type="text" class="form-control-find"
										id="validfrom" name="validfrom" onclick="gtCalendar('validfrom')"
										value='<%=Validator.isNotNull(newExRate.getValidFrom()) ? DateUtils.dateToString("dd/MM/yyyy HH:mm", newExRate.getValidFrom()) : ""%>'>
									<span class="input-group-btn">
										<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('validfrom')">
											<i class="fa fa-calendar"></i>
										</button>
									</span>
								</div>
							</div>
						</div>
						
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.validuntil"/> (<span style="color: red;">*</span>)</label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<div class="input-group col-xs-3 col-sm-3 col-md-3">
									<input type="text" class="form-control-find"
										id="validuntil" name="validuntil" onclick="gtCalendar('validuntil')"
										value='<%=Validator.isNotNull(newExRate.getValidUntil()) ? DateUtils.dateToString("dd/MM/yyyy HH:mm", newExRate.getValidUntil()) : ""%>'>
									<span class="input-group-btn">
										<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('validuntil')">
											<i class="fa fa-calendar"></i>
										</button>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<button type="submit" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.ghilai"/></button>
						<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">
							<liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.quaylai"/>
						</button>
					</div>
				</aui:form>
				<br>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	
</script>

<style>
.thTblDoi {background-color: #f4f4f4;border: 1.5px solid #d5d5d5;font-weight: bold;border-bottom: 2px solid #ddd;}
</style>