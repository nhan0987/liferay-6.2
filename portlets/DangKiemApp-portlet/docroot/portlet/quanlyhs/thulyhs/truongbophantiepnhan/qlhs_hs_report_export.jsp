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
<%@page pageEncoding="UTF-8"%>

<%
	//if(tthcNoidungHoSo != null){
		//System.out.println("------------idHoSoThuTucReport in hs_report_export----------" + tthcNoidungHoSo.getId());
		//long idNoiDungHoSo = tthcNoidungHoSo.getId();
		
		//long idNoiDungHoSo = 1;
		String tenFileExport = "defaultPDF.pdfs";
		
		String urlFile = ReportUtils.urlFileJasperExport(request, tthcNoidungHoSo);
		String urlFileDowLoad = urlFile;
		
		/* if(tthcNoidungHoSo.getTaiLieuDinhKem() > 0){
			urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(tthcNoidungHoSo.getTaiLieuDinhKem());
		} else{
			String realPath=ReportUtils.getTemplateReportFilePath(request);
			fileName = ReportBusinessUtils.actionExport(realPath, idNoiDungHoSo);
			if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
				tenFileExport = fileName;
			}
			urlFile = request.getContextPath() + "/export/" + tenFileExport;
			
		}
		System.out.println("UrlFile====" + urlFile);
		urlFileDowLoad = urlFile.replace(".pdfs", ".pdf"); */
		
		String pdfJS = request.getContextPath() + "/pdf.js/web/viewer.html?file=";
	%>

	<div align="center" id="reportView">
		<OBJECT data="<%=pdfJS + urlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
			type="text/html" TITLE="Báo cáo" 
			WIDTH="100%" HEIGHT="770px"
			style="background: white; min-height: 100%;" >
				<a href="<%=urlFileDowLoad%>"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshsreportexport.taixuongfile"/></a> 
		</object>
	</div>
	<%//}%>
	
	
			<%
			
			// Ghi actionlog
			String newnoidungthaotac = "Mở xem file nội dung hồ sơ thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + "<br>" + urlFileDowLoad; 
			               
			String newtenmanhinhdaidien = "Màn hình xem tải file";
			String newimportername = "";
			String newinspectorname = user.getScreenName();
			long newinspectorid = user.getUserId();
			
			QuanLyNguoiDungAction.insertActionLog(tthcNoidungHoSo.getHoSoThuTucId(), null, null, newnoidungthaotac, newtenmanhinhdaidien, newimportername, newinspectorid, newinspectorname);
			
		%>
		
	   <script type="text/javascript">
	  // var myVar = setInterval(function(){ myTimer() }, 2000);

	   //function myTimer() {
		   //var MyDiv1 = document.getElementById('anhNhanDepTrai');
		   //var MyDiv2 = document.getElementById('anhNhanDepTrai');
		  // MyDiv2.innerHTML = MyDiv2; 
		   //clearTimeout(myVar);
	   //}

	   urlFileExport='<%=urlFile%>';
    </script>