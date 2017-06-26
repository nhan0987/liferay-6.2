<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/portlet/init.jsp"%>
<%
long idPhieuXuLyPhu1 = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
List<EmissionTestRequirement> liEmissionTestRequirements = EmissionTestRequirementLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu1);
if (liEmissionTestRequirements != null && liEmissionTestRequirements.size() > 0) {
%>
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.socongvan"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liEmissionTestRequirements.get(0).getRequirementNumber()%></label>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" >
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.ngaythangdenghi"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.trungtamthunghiemkhithai"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liEmissionTestRequirements.get(0).getCorporationId() %></label>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.noidungdenghithunghiem"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liEmissionTestRequirements.get(0).getContentOfRequest() %></label>
			</div> 
		</div>
		
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.cosodangkythunghiem"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liEmissionTestRequirements.get(0).getTestingRegisteredPlace() %></label>
			</div> 
		</div>
		
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.thanhtoanchiphithunghiem"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liEmissionTestRequirements.get(0).getTestingPaymentCondition() %></label>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.thoigianvadiadiem"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liEmissionTestRequirements.get(0).getTestingRegistration() %></label>
			</div> 
		</div>
		
		
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.nguoiky"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liEmissionTestRequirements.get(0).getSignName() %></label>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.diadiemky"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liEmissionTestRequirements.get(0).getSignPlace() %></label>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.tieudeky"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liEmissionTestRequirements.get(0).getSignTitle() %></label>
			</div> 
		</div>
		
		
		<div class="row"> 
			<div class="col-xs-4 col-sm-4 col-md-4">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.yeucaukhac"/></label>
			</div>
			<div class="col-xs-8 col-sm-8 col-md-8">
				<label class="textlabel"><%=liEmissionTestRequirements.get(0).getRemarks() %></label>
			</div> 
		</div>
	</div>
	<%
	}%>