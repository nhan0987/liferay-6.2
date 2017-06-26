<%@page import="com.liferay.portal.model.User"%>
<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.dtt.gt.dk.portlet.DangKiemAction"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>s
<%@page import="vn.dtt.gt.dk.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.gt.dk.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.gt.dk.message.MessageType"%>
<%@page pageEncoding="UTF-8"%>

<%
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.TTHC_NOIDUNGHOSO_ID);
	
	//long idNoiDungHoSo = 1;
	String tenFileExport = "defaultPDF.pdfs";
	System.out.println("tenFileExport  "+tenFileExport);	
	LogFactoryUtil.getLog("portlet_report_jsp").info("==report_export.jsp====idNoiDungHoSo===" + idNoiDungHoSo);
	
	TthcNoidungHoSo tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
	
	String fileName = "";
	String urlFile = ReportUtils.urlFileJasperExport(request, tthcNoidungHoSo);
	String urlFileDowLoad = urlFile;
	/* if(tthcNoidungHoSo != null){
		if(tthcNoidungHoSo.getTaiLieuDinhKem() > 0){
			urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(tthcNoidungHoSo.getTaiLieuDinhKem());
		} else{
			String realPath=ReportUtils.getTemplateReportFilePath(request);
			fileName = ReportBusinessUtils.actionExport(realPath, idNoiDungHoSo);
			
			if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
				tenFileExport = fileName;
			}
			
			LogFactoryUtil.getLog("portlet_report_jsp").debug("==report_export.jsp======tenFileExport===" + tenFileExport);
			
			urlFile = request.getContextPath() + "/export/" + tenFileExport;
			
		}
		LogFactoryUtil.getLog("portlet_report_jsp").debug("UrlFile====" + urlFile);
		
		urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
	} */
	
	String pdfJS = request.getContextPath() + "/pdf.js/web/viewer.html?file=";
%>
	
<%
	if (tthcNoidungHoSo != null) {
%>

<div align="center" id="reportView">
	<OBJECT data="<%=pdfJS + urlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
		type="text/html" TITLE="Báo cáo" 
		WIDTH="100%" HEIGHT="770px"
		style="background: white; min-height: 100%;" >
			<a href="<%=urlFileDowLoad%>"></i><liferay-ui:message key="vn.gt.dk.reportexport.taixuongfile"/></a> 
	</object>
</div>
<%}%>


			<%
			
			// Ghi actionlog
			String noidungthaotac = "Mở xem file nội dung hồ sơ thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + "<br>" + urlFileDowLoad; 
			               
			String tenmanhinhdaidien = "Màn hình xem tải file";
			String importername = "";
			User user_ = PortalUtil.getUser(request);
			
			String inspectorname = "";
			long inspectorid = 0;
			if(user_ != null) {
				inspectorname = user_.getScreenName();
				inspectorid = user_.getUserId();
			}
			
			long masohoso =  tthcNoidungHoSo.getHoSoThuTucId();
			QuanLyNguoiDungAction.insertActionLog(masohoso, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
			
		%>
<script type="text/javascript">
	window.onload = function() {
	    var refreshId=setInterval( function() 
	   {
	       if(idTab==1){
	     refreshPdfDiv();
	     idTab=0;
	    } else if(idTab==0){
	    } else if(idTab==2){
	    	refreshPdfDiv();
		     idTab=0;
	    } else if(idTab==3){
	    	refreshPdfDiv();
		    
	    }
	     }, 1000);
	    }

	function refreshPdfDiv(){
    var myDiv1 = document.getElementById('reportView').innerHTML;
    var myDiv2 = document.getElementById('reportView');
    myDiv2.innerHTML = myDiv1; 

      }
</script>