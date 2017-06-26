<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.portlet.chungchi.TraCuuChungChiAction"%>
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
	PortletURL renderBackURL = renderResponse.createRenderURL();
	renderBackURL.setParameter("jspPage", "/portlet/chungchi/view.jsp");
	
	


%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<div id="debitButtonDiv">
			<aui:button-row>
				<a href="<%=renderBackURL%>"><button type="button" class=" btnThuLyHS form-control">Quay lại</button></a>
			</aui:button-row>
		</div>

		<%
			long noiDungHoSoId = ParamUtil.getLong(request, Constants.TTHC_NOIDUNGHOSO_ID);
			TthcNoidungHoSo tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(noiDungHoSoId);
			
			String urlFile = ReportUtils.urlFileJasperExport(request, tthcNoidungHoSo);
			String urlFileDowLoad = urlFile;
			
			String pdfJS = request.getContextPath() + "/pdf.js/web/viewer.html?file=";
			
			//if (tthcNoidungHoSo != null) {
				/* LogFactoryUtil.getLog("portlet_chungchi_certificate_report_export_jsp").info("------------idHoSoThuTucReport in hs_report_export----------" + tthcNoidungHoSo.getId());
				long idNoiDungHoSo = tthcNoidungHoSo.getId();
				
				String tenFileExport = "defaultPDF.pdfs";
				
				String fileName = "";
				String urlFileDowLoad = "";
				String urlFile = "";
				if (tthcNoidungHoSo.getTaiLieuDinhKem() > 0) {
					urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(tthcNoidungHoSo.getTaiLieuDinhKem());
				} else {
					String realPath = ReportUtils.getTemplateReportFilePath(request);
					fileName = ReportBusinessUtils.actionExport(realPath, idNoiDungHoSo);
					if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
						tenFileExport = fileName;
					}
					urlFile = request.getContextPath() + "/export/" + tenFileExport;
					
				}
				LogFactoryUtil.getLog("portlet_chungchi_certificate_report_export_jsp").info("UrlFile====" + urlFile);
				urlFileDowLoad = urlFile.replace(".pdfs", ".pdf"); */
				%>

				<div align="center" id="reportView">
					<OBJECT
						data="<%=pdfJS + urlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
						type="text/html" TITLE="Báo cáo" WIDTH="100%" HEIGHT="900px"
						style="background: white; min-height: 100%;">
						<a href="<%=urlFileDowLoad%>"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.truongbophantiepnhan.qlhshsreportexport.taixuongfile" /></a>
					</object>
				</div>
			<%
			
			// Ghi actionlog
			String noidungthaotac = "Mở xem file chứng chỉ thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + "<br>" + urlFileDowLoad; 
			               
			String tenmanhinhdaidien = "Màn hình xem tải file";
			String importername = "";
			String inspectorname = user.getScreenName();
			long inspectorid = user.getUserId();
			
			long masohoso =  tthcNoidungHoSo.getHoSoThuTucId();
			QuanLyNguoiDungAction.insertActionLog(masohoso, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
			
		%>
	</div>
</div>
