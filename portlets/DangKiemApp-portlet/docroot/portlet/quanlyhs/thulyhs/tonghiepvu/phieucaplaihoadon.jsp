<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
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
	long userId = PortalUtil.getUserId(request);
	
	//long idNoiDungHoSo = 1;
	String tenFileExport = "defaultPDF.pdfs";
	
	System.out.println("==report_export.jsp====debitNoteId===" + debitNoteId);
	
	String fileName = "";
	String urlFile="/"+portletSession.getPortletContext().getPortletContextName()+"/export/default.pdf";
	String urlFileDowLoad = "";
	String realPath=ReportUtils.getTemplateReportFilePath(request);
	
	DebitNote debitNote = DebitNoteLocalServiceUtil.fetchDebitNote(debitNoteId);
	String corporationName = null;
	String corporationId = null;
	String financialAccountant = null;				 
				
	CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
	if (corporationInspector != null) {
		financialAccountant = corporationInspector.getInspectorName().toString();
		
		DmDataItem doiKiemTra =  DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.CORPORATION, corporationInspector.getCorporationId());
		if (doiKiemTra != null) {						
			corporationId = doiKiemTra.getCode0().toString();	
			corporationName = doiKiemTra.getCode1().toString();	
		} else { corporationId = "00";
			corporationName = "00";}				
		
	}
				
		
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
	renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/thulyhs/tonghiepvu/thongkePhieuThu.jsp");
	//renderBackURL.setParameter(arg0, arg1);
	
	
	// Ghi actionlog
	
	String noidungthaotac = "Mở xem Phiếu đã thanh toán - chức năng Cấp lại hóa đơn thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) ; 
	String tenmanhinhdaidien = "Thống kê phiếu đã thanh toán - Cấp lại hóa đơn";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<portlet:actionURL var="capLaiHoaDon" name="capLaiHoaDon">
	<portlet:param name="listId" value="<%=String.valueOf(debitNoteId) %>"/>
</portlet:actionURL>



<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<aui:form action="<%=capLaiHoaDon%>" method="post" name="myForm" id="myForm">
			<div id="debitButtonDiv">
				<aui:button-row>
				<%if((listbitNoteDetails != null) && (listbitNoteDetails.size()>0) && (debitNote.getMarkAsDeleted() > 0) ){
				%>
					<button style="margin-left: 6px;" class="btnThuLyHS form-control" type="button"   onclick="if(validatorHinhthucchuyenkhoan())  summitForm('<%=capLaiHoaDon.toString()%>')" >Xác nhận cấp lại hóa đơn</button>					
				<%} %>	
					<a href="<%=renderBackURL%>"><button type="button" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.quaylai"/></button></a>
				</aui:button-row>
			</div>
			<div id="boxXacNhan" align="center">
				<%if((listbitNoteDetails != null) && (listbitNoteDetails.size()>0) ){
				%>
				<table style="width: 100%">
					<input type="hidden" name="thanhToanTienMat" id="thanhToanTienMat" value="1"/>
					<tr>
						<td style="width: 20%" >  <h5 class="tieude">Hình thức thanh toán: </h5> </td>
						<%if((debitNote != null) && (debitNote.getPaymentType()==1) ){
						%>
						<td style="width: 50%"><b>
							<input name="xem" type="radio" id="btnXacNhanTienMat" size="20"
										value="1" onclick="changeXacNhan()"/> &nbsp; Tiền mặt
								&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 		
						<input name="xem" type="radio" id="btnXacNhanChuyenKhoan" size="20"
										value="0" checked onclick="changeXacNhan()"/> &nbsp; Chuyển khoản
										</b>				
						</td>
						<%} else if((debitNote != null) && (debitNote.getPaymentType()>1) ) { %>
						<td style="width: 50%"><b>
							<input name="xem" type="radio" id="btnXacNhanTienMat" size="20"
										value="1" checked onclick="changeXacNhan()"/> &nbsp; Tiền mặt
								&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 		
						<input name="xem" type="radio" id="btnXacNhanChuyenKhoan" size="20"
										value="0" onclick="changeXacNhan()"/> &nbsp; Chuyển khoản
										</b>				
						</td>						
						<%} else { %>
						<td style="width: 50%"><b>
							<input name="xem" type="radio" id="btnXacNhanTienMat" size="20"
										value="1" onclick="changeXacNhan()"/> &nbsp; Tiền mặt
								&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 		
						<input name="xem" type="radio" id="btnXacNhanChuyenKhoan" size="20"
										value="0" onclick="changeXacNhan()"/> &nbsp; Chuyển khoản
										</b>				
						</td>
						<%} %>
					</tr>
				</table>
				<%} %>
			</div>
		</aui:form>
		<div align="center">
			<%
			String pdfJS = request.getContextPath() + "/pdf.js/web/viewer.html?file=";
			%>
			<OBJECT data="<%=pdfJS + urlFile%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
				type="text/html" TITLE="Báo cáo" 
				WIDTH="100%" HEIGHT="770px"
				style="background: white; min-height: 100%;" >
					<a href="<%=urlFileDowLoad%>">Tải xuống file</a> 
			</object>
		</div>
	</div>
</div>


<script type="text/javascript">
		function changeXacNhan(){
			if (document.getElementById('btnXacNhanTienMat').checked) {
				document.getElementById('thanhToanTienMat').value = '1';
			}else{
				document.getElementById('thanhToanTienMat').value = '0';
			}	
			
		}
		
		function summitForm(url) {
			document.getElementById('<portlet:namespace/>myForm').action = url;
		     document.getElementById('<portlet:namespace/>myForm').submit();
		}

		function validatorHinhthucchuyenkhoan() {	
			if (document.getElementById('btnXacNhanTienMat').checked)
				{
				var retVal = prompt(" Nhập private key : ", "Private Key");
		           if (retVal != '1'){ return false;};
				return true;
				
				} else if (document.getElementById('btnXacNhanChuyenKhoan').checked)
					{
					var retVal = prompt(" Nhập private key : ", "Private Key");
			           if (retVal != '1'){ return false;};
					return true;
					}
				else
					{
					alert("Đề nghị chọn Hình thức thanh toán !");
					return false;
					}
					
			return true;
		}
</script>
