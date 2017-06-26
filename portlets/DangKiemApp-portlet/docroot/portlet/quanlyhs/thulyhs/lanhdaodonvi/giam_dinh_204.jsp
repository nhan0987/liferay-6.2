<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/portlet/init.jsp"%>
<%
long idPhieuXuLyPhu1 = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
List<ControlRequirement> liControlRequirements = ControlRequirementLocalServiceUtil.findByPhieuxulyphuId(idPhieuXuLyPhu1); 
%>

<!-- DN thu nghiem giam dinh -->

<!-- Quản lý hồ sơ DKKT -->
<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
<%
if (liControlRequirements != null && liControlRequirements.size() > 0) {
%>
	<div class="row">
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.socongvan"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<label class="textlabel"><%=liControlRequirements.get(0).getRequirementNumber() %></label>
		</div> 
	</div>
	<div class="row">
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.sodenghigiamdinh"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<label class="textlabel"><%=liControlRequirements.get(0).getRequirementNumber() %></label>
		</div> 
	</div>
	
	<div class="row">
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.ngaythangdenghi"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liControlRequirements.get(0).getSignDate() %></label>
		</div> 
	</div>
	
	<div class="row">
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.trungtamthunghiemgiamdinh"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<label class="textlabel"><%=liControlRequirements.get(0).getCorporationId() %></label>
		</div> 
	</div>
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.noidungdenghithunghiem"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<label class="textlabel"><%=liControlRequirements.get(0).getControlContent() %></label>
		</div> 
	</div>
	
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.cosodangkythunghiem"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<label class="textlabel"><%=liControlRequirements.get(0).getSignPlace() %></label>
		</div> 
	</div>
	
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.thanhtoanchiphithunghiem"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
		</div> 
	</div>
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.yeucaukhac"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<label class="textlabel"><%=liControlRequirements.get(0).getRemarks() %></label>
		</div> 
	</div>
	
	<!-- signName -->
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.nguoiduyettruongbophan"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<label class="textlabel"><%=liControlRequirements.get(0).getSignName() %></label>
		</div> 
	</div>
	
	<!-- signTitle -->
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.chucdanh"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<label class="textlabel"><%=liControlRequirements.get(0).getSignTitle() %></label>
		</div> 
	</div>
	
	
	<!-- attachedFile -->
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel">File dinh kem:</label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<label class="textlabel"><%=liControlRequirements.get(0).getAttachedFile() %></label>
		</div> 
	</div>
<%
}
%>
</div>
