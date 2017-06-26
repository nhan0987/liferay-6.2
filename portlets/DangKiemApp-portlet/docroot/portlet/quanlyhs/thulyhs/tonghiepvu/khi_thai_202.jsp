<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/portlet/init.jsp"%>
<%
long idPhieuXuLyPhu1 = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
List<EmissionTestRequirement> liEmissionTestRequirements = EmissionTestRequirementLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu1);
if (liEmissionTestRequirements != null && liEmissionTestRequirements.size() > 0) {
%>
	<!-- Quản lý hồ sơ DKKT -->
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.khithai202.socongvan"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<%=liEmissionTestRequirements.get(0).getRequirementNumber()%>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" >
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.khithai202.ngaythangdenghi"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.khithai202.trungtamthunghiemkhithai"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<%=liEmissionTestRequirements.get(0).getCorporationId() %>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.khithai202.noidungdenghithunghiem"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<%=liEmissionTestRequirements.get(0).getContentOfRequest() %>
			</div> 
		</div>
		
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.khithai202.cosodangkythunghiem"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<%=liEmissionTestRequirements.get(0).getTestingRegisteredPlace() %>
			</div> 
		</div>
		
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.khithai202.thanhtoanchiphithunghiem"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<%=liEmissionTestRequirements.get(0).getTestingPaymentCondition() %>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.khithai202.thoigianvadiadiem"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<%=liEmissionTestRequirements.get(0).getTestingRegistration() %>
			</div> 
		</div>
		
		
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.khithai202.nguoiky"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<%=liEmissionTestRequirements.get(0).getSignName() %>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.khithai202.diadiemky"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<%=liEmissionTestRequirements.get(0).getSignPlace() %>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.khithai202.tieudeky"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<%=liEmissionTestRequirements.get(0).getSignTitle() %>
			</div> 
		</div>
		
		
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.khithai202.yeucaukhac"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<%=liEmissionTestRequirements.get(0).getRemarks() %>
			</div> 
		</div>
	</div>
<%
}
%>

<%
	// Ghi actionlog
	String noidungthaotac = "Mở xem Thông báo đề nghị thử nghiệm khí thải thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Thông báo đề nghị thử nghiệm khí thải";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
%>