<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
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
	long enTryId = 0;
	long phieuXuLyPhuId = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
	TthcNoidungHoSo tthcNoidungHoSo = null;
	MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
	if(motCuaPhieuXuLyPhu != null){
		LogFactoryUtil.getLog(DangKiemAction.class).info("==xem_phieu_da_thanhtoan_report_export.jsp====idNoiDungHoSo===" + motCuaPhieuXuLyPhu.getNoiDungHoSoId());
		tthcNoidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(motCuaPhieuXuLyPhu.getNoiDungHoSoId());
		if(tthcNoidungHoSo != null){
			enTryId = tthcNoidungHoSo.getTaiLieuDinhKem();
		}
	}
	
	String urlFileDowLoad = "";
	String urlFile = "";
	if(enTryId > 0){
		urlFile = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(tthcNoidungHoSo.getTaiLieuDinhKem());
	}
	urlFileDowLoad = urlFile.replace(".pdfs", ".pdf");
	
	String pdfJS = request.getContextPath() + "/pdf.js/web/viewer.html?file=";
%>
			<%
			
			// Ghi actionlog
			String noidungthaotac = "Mở xem file Phiếu đã thanh toán thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + "<br>" + urlFileDowLoad; 
			               
			String tenmanhinhdaidien = "Màn hình xem tải file";
			String importername = "";
			String inspectorname = user.getScreenName();
			long inspectorid = user.getUserId();
			
			long masohoso =  tthcNoidungHoSo.getHoSoThuTucId();
			QuanLyNguoiDungAction.insertActionLog(masohoso, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
			
		%>
<div align="center" id="reportView">
	<OBJECT data="<%=pdfJS + urlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
		type="text/html" TITLE="Báo cáo" 
		WIDTH="100%" HEIGHT="770px"
		style="background: white; min-height: 100%;" >
			<a href="<%=urlFileDowLoad%>"><liferay-ui:message key="vn.gt.dk.reportexport.taixuongfile"/></a> 
	</object>
</div>
<script type="text/javascript">
	window.onload = function() {
	    var refreshId=setInterval( function() 
	   {
	       if(idTab==1){
	     refreshPdfDiv();
	     idTab=0;
	    } else if(idTab==0){
	    } else if(idTab==2){
	    }
	     }, 1000);
	    }

	function refreshPdfDiv(){
    var myDiv1 = document.getElementById('reportView').innerHTML;
    var myDiv2 = document.getElementById('reportView');
    myDiv2.innerHTML = myDiv1; 

      }
</script>