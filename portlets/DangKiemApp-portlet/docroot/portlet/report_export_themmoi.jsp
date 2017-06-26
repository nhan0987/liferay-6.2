<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.utils.CollectionUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.text.SimpleDateFormat"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@page pageEncoding="UTF-8"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />
<%
	long userId = PortalUtil.getUserId(request);
	
	String type = ParamUtil.getString(request, "type");
	long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	
	String tenFileExport = "defaultPDF.pdfs";
	
	String fileName = "";
	String urlFile="/"+portletSession.getPortletContext().getPortletContextName()+"/export/default.pdf";
	String urlFileDowLoad = "";
	String realPath=ReportUtils.getTemplateReportFilePath(request);
	
	if(type != null && type.trim().length() > 0 && type.equalsIgnoreCase("LichDeNghiKiemTra")){
		String lstConfirmedInspectionId = CollectionUtils.getListIDConfirmedInspection(ParamUtil.getString(request, "lstIdPhieuXuLyPhu"));
		if(lstConfirmedInspectionId != null && lstConfirmedInspectionId.trim().length() >0){
			fileName = ReportBusinessUtils.actionExportLichDeNghiKiemTra(realPath, lstConfirmedInspectionId);
		}
		
	} else if(type != null && type.trim().length() > 0 && type.equalsIgnoreCase("BienBanGhiNhanKetQuaKiemTra")){
		String lstVehicleGroupId  = ParamUtil.getString(request, "lstVehicleGroupId");
		String confirmedInspectionId = ParamUtil.getString(request, "confirmedInspectionId");
		if(confirmedInspectionId != null && confirmedInspectionId.trim().length() > 0 && lstVehicleGroupId != null && lstVehicleGroupId.trim().length() > 0){
			fileName = ReportBusinessUtils.actionExportBienBanGhiNhanKetQuaKiemTra(realPath,userId, confirmedInspectionId,lstVehicleGroupId);
		}
		
	} else if(type != null && type.trim().length() > 0 && type.equalsIgnoreCase("BienBanGhiNhanKetQuaKiemTraList")){
		String lstConfirmedInspectionId = ParamUtil.getString(request, "lstConfirmedInspectionId");
		if(lstConfirmedInspectionId != null && lstConfirmedInspectionId.trim().length() > 0){
			fileName = ReportBusinessUtils.actionExportBienBanGhiNhanKetQuaKiemTraList(realPath, lstConfirmedInspectionId);
		}
		
	} else if(type != null && type.trim().length() > 0 && type.equalsIgnoreCase("PhieuPhanCongDKVKiemTra")){
		String ngayKiemTra = ParamUtil.getString(request, "ngayKiemTra");
		if(ngayKiemTra != null && ngayKiemTra.trim().length() >0){
			fileName = ReportBusinessUtils.actionExportPhieuPhanCongDKVKiemTra(realPath,userId, ngayKiemTra);
		}
		
	} else if(type != null && type.trim().length() > 0 && type.equalsIgnoreCase("ThongBaoTrungSoKhungSoDongCo")){
		if(idHoSoThuTuc > 0 && type != null && type.trim().length() > 0){
			fileName = ReportBusinessUtils.actionExportThongBaoTrungSoKhungDongCo(realPath, idHoSoThuTuc);	
		}
		
	}
	
	if (fileName.trim().length() > 0) {
		tenFileExport = fileName;
		System.out.println("==report_export_themmoi.jsp======tenFileExport===" + tenFileExport);
		//
		urlFile = request.getContextPath() + "/export/" + tenFileExport;
		
	}
	
	System.out.println("UrlFile====" + urlFile);
	
	urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
	
	PortletURL renderBackURL = renderResponse.createRenderURL();
	if(idHoSoThuTuc > 0 && type != null && type.trim().length() > 0 && type.trim().equalsIgnoreCase("ThongBaoTrungSoKhungSoDongCo")){
		renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");
	}
	
	String pdfJS = request.getContextPath() + "/pdf.js/web/viewer.html?file=";
%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<div id="debitButtonDiv">
			<aui:button-row>
				<a href="<%=renderBackURL%>"><button type="button" class=" btnThuLyHS form-control">Quay lại</button></a>
			</aui:button-row>
		</div>
	<div>
		<OBJECT data="<%=pdfJS + urlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
				type="text/html"
				TITLE="Pdf"
				WIDTH="100%"
				HEIGHT="1500px"
				style="background: white;
				min-height: 100%;"  >
			<a href="<%=urlFileDowLoad%>">Tải xuống file</a> 
		</object>
	</div>
	</div>
</div>


			<%
			
			// Ghi actionlog
			String noidungthaotac = "Mở xem file nội dung hồ sơ theo mẫu " + type + " thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + "<br>" + urlFileDowLoad; 
			               
			String tenmanhinhdaidien = "Màn hình xem tải file";
			String importername = "";
			String inspectorname = user.getScreenName();
			long inspectorid = user.getUserId();
			
			QuanLyNguoiDungAction.insertActionLog(idHoSoThuTuc, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
			
		%>