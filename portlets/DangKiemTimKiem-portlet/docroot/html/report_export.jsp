<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.gt.dk.portlet.timkiem.TimKiemAction"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ include file="/html/init.jsp"%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/common.css">
<%
	long idNoiDungHoSo = ParamUtil.getLong(request, Constants.TTHC_NOIDUNGHOSO_ID);
	long idNoiDungHoSoBBKT = ParamUtil.getLong(request, Constants.TTHC_NOIDUNGHOSO_ID_BBKT);
	
	//long idNoiDungHoSo = 1;
	String tenFileExport = "defaultPDF.pdfs";
	
	LogFactoryUtil.getLog(TimKiemAction.class).info("==report_export.jsp====idNoiDungHoSo===" + idNoiDungHoSo);
	
	TthcNoidungHoSo tthcNoidungHoSo = null;
	
	String fileName = "";
	String urlFileDowLoad = "";
	String urlFile = "";
	
	
	if(idNoiDungHoSo > 0) {
		tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
		
		if(tthcNoidungHoSo != null){
			if ((tthcNoidungHoSo.getTaiLieuDinhKem() > 0) && DocumentUtils.existDLFileAbsPath(tthcNoidungHoSo.getTaiLieuDinhKem())){
				urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(tthcNoidungHoSo.getTaiLieuDinhKem());
			} else{
				String realPath=ReportUtils.getTemplateReportFilePath(request);
				fileName = ReportBusinessUtils.actionExport(realPath, idNoiDungHoSo);
				
				if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
					tenFileExport = fileName;
				}
				
				LogFactoryUtil.getLog(TimKiemAction.class).debug("==report_export.jsp======tenFileExport===" + tenFileExport);
				//
				
				urlFile = request.getContextPath() + "/export/" + tenFileExport;
				
			}
			LogFactoryUtil.getLog(TimKiemAction.class).debug("UrlFile====" + urlFile);
			
			urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
		}
	} else if (idNoiDungHoSoBBKT > 0){
		tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSoBBKT);
		
		String maBieuMau = ParamUtil.getString(request, "maBieuMau");
		String soChungChi = ParamUtil.getString(request, "soChungChi");
		String ngayKyChungChi = ParamUtil.getString(request, "ngayKyChungChi");
		
		System.out.println("==maBieuMau==" + maBieuMau);
		System.out.println("==soChungChi==" + soChungChi);
		System.out.println("==ngayKyChungChi==" + ngayKyChungChi);
		
		if(tthcNoidungHoSo != null){
			
				String realPath=ReportUtils.getTemplateReportFilePath(request);
				fileName = ReportBusinessUtils.actionExportThongSoXe(realPath, idNoiDungHoSoBBKT, maBieuMau, soChungChi, ngayKyChungChi);
				
				if (fileName.equalsIgnoreCase(ReportBusinessUtils.FILE_NAME_NULL) == false) {
					tenFileExport = fileName;
				}
				
				LogFactoryUtil.getLog(TimKiemAction.class).debug("==report_export.jsp======tenFileExport===" + tenFileExport);
				//
				
				urlFile = request.getContextPath() + "/export/" + tenFileExport;
				
			LogFactoryUtil.getLog(TimKiemAction.class).debug("UrlFile====" + urlFile);
			
			urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
		}
	}
	
%>
	
<%
	if (tthcNoidungHoSo != null) {
		PortletURL backUrl = renderResponse.createRenderURL();
		backUrl.setParameter("jspPage", "/html/timkiem/view.jsp");
%>
<div class="wd-select">
		<a href="<%=backUrl.toString()%>"><button type="button" style="text-shadow: 0px 0px #FFF; !important">Quay lại</button></a>
</div>
<div align="center">
			
	<OBJECT data="<%=urlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
		type="text/html" TITLE="Báo cáo" 
		WIDTH="100%" HEIGHT="700px"
		style="background: white; min-height: 100%;" >
	</object>
</div>
<%}%>