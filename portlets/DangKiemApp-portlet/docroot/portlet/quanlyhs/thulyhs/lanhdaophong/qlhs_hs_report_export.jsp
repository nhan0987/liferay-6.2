<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@page import="vn.dtt.gt.dk.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.gt.dk.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.dtt.gt.dk.message.MessageType"%>

<%

	long idNoiDungHoSo = tthcNoidungHoSo.getId();
	
	//long idNoiDungHoSo = 1;
	String tenFileExport = "defaultPDF.pdfs";
	
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
			urlFile = request.getContextPath() + "/export/" + tenFileExport;
			
		}
		
		urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
	} */
%>
	
<%
	//if (tthcNoidungHoSo != null) {
		String pdfJS = request.getContextPath() + "/pdf.js/web/viewer.html?file=";
%>
<div align="center">
	<OBJECT data="<%=pdfJS + urlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
		type="text/html" TITLE="Báo cáo" 
		WIDTH="100%" HEIGHT="770px"
		style="background: white; min-height: 100%;" >
			<a href="<%=urlFileDowLoad%>"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.qlhshsreportexport.taixuongfile"/></a> 
	</object>
</div>
<%//}%>

			<%
			
			// Ghi actionlog
			String noidungthaotac = "Mở xem file nội dung hồ sơ, chứng chỉ thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + "<br>" + urlFileDowLoad; 
			               
			String tenmanhinhdaidien = "Màn hình xem tải file";
			String importername = "";
			String inspectorname = user.getScreenName();
			long inspectorid = user.getUserId();
			
			long masohoso =  tthcNoidungHoSo.getHoSoThuTucId();
			QuanLyNguoiDungAction.insertActionLog(masohoso, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
			
		%>