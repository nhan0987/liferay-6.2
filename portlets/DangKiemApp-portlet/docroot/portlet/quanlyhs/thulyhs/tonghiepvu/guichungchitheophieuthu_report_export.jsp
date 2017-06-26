<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@page import="vn.dtt.gt.dk.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.gt.dk.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.gt.dk.message.MessageType"%>
<%@page pageEncoding="UTF-8"%>
<%@ include file="/portlet/init.jsp"%>

<%
	long debitNoteId = ParamUtil.getLong(request, "debitNoteId");
	String vehicleClass = ParamUtil.getString(request, "vehicleClass");
	List<DebitNoteDetails> listbitNoteDetails = DebitNoteDetailsLocalServiceUtil.findByDebitNoteId(debitNoteId);
	DebitNote debitNote = DebitNoteLocalServiceUtil.fetchDebitNote(debitNoteId);
	
	
	//long idNoiDungHoSo = 1;
	String tenFileExport = "defaultPDF.pdfs";
	
	System.out.println("==report_export.jsp====debitNoteId===" + debitNoteId);
	
	String fileName = "";
	String urlFile="/"+portletSession.getPortletContext().getPortletContextName()+"/export/default.pdf";
	String urlFileDowLoad = "";
	String realPath=ReportUtils.getTemplateReportFilePath(request);
// mau 1	
//	fileName = ReportBusinessUtils.actionExportThongBaoLePhi(realPath, debitNoteId);
// mau 2	
	String corporationName = null;
	String corporationId = null;
	//(debitNote!=null){
		if (debitNote != null) {
			corporationId = debitNote.getCorporationId();
			DmDataItem doiKiemTra =  DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.CORPORATION, debitNote.getCorporationId());
			if (doiKiemTra != null) 
				{ //corporationName = doiKiemTra.getName();
				corporationName = corporationId;
				}
			else { corporationName = "DVHANHCHINHCONG";}
		} else		{
			corporationName = "DVHANHCHINHCONG";
		}
		
				
	//}
	if((listbitNoteDetails != null) && (listbitNoteDetails.size()>0) ){
		if(vehicleClass.trim().equalsIgnoreCase("DCX") || vehicleClass.trim().equalsIgnoreCase("XDD")){
			fileName = ReportBusinessUtils.actionExportThongBaoLePhiMau2(realPath, debitNoteId,corporationName);			
		}else{
			fileName = ReportBusinessUtils.actionExportThongBaoLePhi(realPath, debitNoteId,corporationName);
			
		}
	}

	if (fileName.trim().length() > 0) {
		tenFileExport = fileName;
		System.out.println("==report_export.jsp======tenFileExport===" + tenFileExport);
		//
		urlFile = request.getContextPath() + "/export/" + tenFileExport;
		
	}
	
	System.out.println("UrlFile====" + urlFile);
	
	urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
	
	PortletURL renderBackURL = renderResponse.createRenderURL();
	renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/thulyhs/tonghiepvu/guiChungChiTheoPhieuThu.jsp");
	//renderBackURL.setParameter(arg0, arg1);
%>


			<%
			
			// Ghi actionlog
			String noidungthaotac = "Vào chức năng Cấp trả chứng chỉ theo phiếu thu " + debitNote.getDebitNoteNumber() + " thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + "<br>" + urlFileDowLoad; 
			               
			String tenmanhinhdaidien = "Màn hình xem tải file";
			String importername = "";
			String inspectorname = user.getScreenName();
			long inspectorid = user.getUserId();			
			
			QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
			
		%>
<portlet:actionURL var="guiChungChiTheoPhieuThu" name="guiChungChiTheoPhieuThu">
	<portlet:param name="listId" value="<%=String.valueOf(debitNoteId) %>"/>
</portlet:actionURL>

<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<aui:form action="<%=guiChungChiTheoPhieuThu%>" method="post" name="myForm" id="myForm">
			<div id="debitButtonDiv">
				<aui:button-row>
				<%if((listbitNoteDetails != null) && (listbitNoteDetails.size()>0) ){
				%>
					<button style="margin-left: 6px;" class="btnThuLyHS form-control" type="submit">Trả chứng chỉ</button>
				<%} %>	
					<a href="<%=renderBackURL%>"><button type="button" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.quaylai"/></button></a>
				</aui:button-row>
			</div>
		</aui:form>
		<div align="center">
			<% String pdfJS = request.getContextPath() + "/pdf.js/web/viewer.html?file="; %>
			<OBJECT data="<%=pdfJS + urlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
				type="text/html" TITLE="Báo cáo" 
				WIDTH="100%" HEIGHT="770px"
				style="background: white; min-height: 100%;" >
					<a href="<%=urlFileDowLoad%>">Tải xuống file</a> 
			</object>
		</div>
	</div>
</div>
