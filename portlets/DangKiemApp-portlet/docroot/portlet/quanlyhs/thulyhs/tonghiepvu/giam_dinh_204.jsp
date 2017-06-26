<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
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
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.giamdinh204.socongvan"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<%=liControlRequirements.get(0).getRequirementNumber() %>
		</div> 
	</div>
	<div class="row">
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.giamdinh204.sodenghigiamdinh"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<%=liControlRequirements.get(0).getRequirementNumber() %>
		</div> 
	</div>
	
	<div class="row">
		<div class="col-xs-2 col-sm-2 col-md-2" >
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.giamdinh204.ngaythangdenghi"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
				<%=liControlRequirements.get(0).getSignDate() %>
		</div> 
	</div>
	
	<div class="row">
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.giamdinh204.trungtamthunghiemgiamdinh"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<%=liControlRequirements.get(0).getCorporationId() %>
		</div> 
	</div>
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.giamdinh204.noidungdenghithunghiem"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<%=liControlRequirements.get(0).getControlContent() %>
		</div> 
	</div>
	
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.giamdinh204.cosodangkythunghiem"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<%=liControlRequirements.get(0).getSignPlace() %>
		</div> 
	</div>
	
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.giamdinh204.thanhtoanchiphithunghiem"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
		</div> 
	</div>
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.giamdinh204.yeucaukhac"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<%=liControlRequirements.get(0).getRemarks() %>
		</div> 
	</div>
	
	<!-- signName -->
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.giamdinh204.nguoiduyettruongbophan"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<%=liControlRequirements.get(0).getSignName() %>
		</div> 
	</div>
	
	<!-- signTitle -->
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.giamdinh204.chucdanh"/></label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<%=liControlRequirements.get(0).getSignTitle() %>
		</div> 
	</div>
	
	
	<!-- attachedFile -->
	<div class="row"> 
		<div class="col-xs-4 col-sm-4 col-md-4">
			<label class="textlabel">File dinh kem:</label>
		</div>
		<div class="col-xs-8 col-sm-8 col-md-8">
			<%=liControlRequirements.get(0).getAttachedFile() %>
		</div> 
	</div>
	<%
}
%>
</div>
<%
	// Ghi actionlog
	String noidungthaotac = "Mở xem Thông báo đề nghị trưng cầu giám định thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Thông báo đề nghị trưng cầu giám định";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
%>