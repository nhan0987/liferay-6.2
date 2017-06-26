<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/portlet/init.jsp"%>
<%
System.out.println("===============/portlet/quanlyhs/thulyhs/lanhdaodonvi/an_toan_203.jsp===========");
long idPhieuXuLyPhu1 = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
List<SafetestRequirement> liSafetestRequirements = SafetestRequirementLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu1);
if (liSafetestRequirements != null && liSafetestRequirements.size() > 0) {
%>
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.antoan203.socongvan"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liSafetestRequirements.get(0).getRequirementNumber() %></label>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.antoan203.trungtamthunghiemantoan"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liSafetestRequirements.get(0).getCorporationId() %></label>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.antoan203.noidungdenghithunghiem"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liSafetestRequirements.get(0).getContentOfRequest() %></label>
			</div> 
		</div>
		
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.antoan203.cosodangkythunghiem"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liSafetestRequirements.get(0).getTestingRegisteredPlace() %></label>
			</div> 
		</div>
		
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.antoan203.thanhtoanchiphithunghiem"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liSafetestRequirements.get(0).getTestingPaymentCondition() %></label>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.antoan203.thoigianvadiadiem"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liSafetestRequirements.get(0).getTestingRegistration()%></label>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.antoan203.nguoiky"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liSafetestRequirements.get(0).getSignName() %></label>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.antoan203.diadiemky"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liSafetestRequirements.get(0).getSignPlace() %></label>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.antoan203.tieudeky"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liSafetestRequirements.get(0).getSignTitle() %></label>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.antoan203.yeucaukhac"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liSafetestRequirements.get(0).getRemarks() %></label>
			</div> 
		</div>
	</div>
<%
}
%>	