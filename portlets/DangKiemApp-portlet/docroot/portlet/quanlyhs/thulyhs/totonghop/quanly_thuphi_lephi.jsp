<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@ include file="/portlet/init.jsp"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/toTiepNhan.css">
<%
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);

	// Ghi actionlog
	
	String noidungthaotac = "Mở xem Quản lý thu phí, lệ phí, chức năng Chờ xác nhận thanh toán thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
	String tenmanhinhdaidien = "Màn hình Quản lý thu phí, lệ phí - Thanh toán theo phiếu";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>

<div id="divButton">
	<aui:button-row>
		<button type="button" onclick="eventHideOrShowDiv('dsChungChiDaNopPhi', 'true')" class="btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.danhsachchungchidanopphi"/></button>
		<button type="button" onclick="eventHideOrShowDiv('dsChungChiChuaNopPhi', 'true')" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.danhsachchungchichuanopphi"/></button>
		<button type="button" onclick="" class="btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.caphoadondo"/></button>
	</aui:button-row>
</div>
<div style="height: 15px" id="theDem"></div>
<%
int a;
%>
<!-------------- Danh sách chứng chỉ đã nộp phí -------------->
<div id="dsChungChiDaNopPhi">
	<p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.danhsachchungchidanopphi"/></span></p>
	<table>
		<tr>
			<td><span>STT</span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.sochungchi"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.nhom"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.nhanhieusoloai"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.sokhungsodongco"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.tinhtrangsothamchieu"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.phi"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.lephi"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.chiphiphatsinh"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.chiphikhac"/></span></td>
		</tr>
		<%for (int i = 1; i < 10; i++) {%>
			<tr>
				<td><span><%=i%></span></td>
				<td><span>123/BAC...</span></td>
				<td><span><%=i%></span></td>
				<td><span class="bold">ISUZU</span><br><span>CYH52Y</span></td>
				<td><span class="bold">ISUZU</span><br><span>CYH52Y</span></td>
				<td><span class="bold">ISUZU</span><br><span>CYH52Y</span></td>
				<td><img src="<%=request.getContextPath()%>/img/tich_normal.png"></td>
				<td><img src="<%=request.getContextPath()%>/img/tich_normal.png"></td>
				<td><img src="<%=request.getContextPath()%>/img/tich_normal.png"></td>
				<td><img src="<%=request.getContextPath()%>/img/tich_normal.png"><span></span></td>
			</tr>
		<%}%>
	</table>
	<aui:button-row>
		<button type="button" id="quayLai" name="quayLai" onclick="eventHideOrShowDiv('dsChungChiDaNopPhi', 'false')" class="btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.quaylai"/></button>
	</aui:button-row>
</div>

<!-- ------------- Danh sách chứng chỉ chưa nộp phí ---------------- -->

<div id="dsChungChiChuaNopPhi">
	<p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.danhsachchungchichuanopphi"/></span></p>
	<table>
		<tr>
			<td><span>STT</span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.sochungchi"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.nhom"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.nhanhieusoloai"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.sokhungsodongco"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.tinhtrangsothamchieu"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.phi"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.lephi"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.chiphiphatsinh"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.chiphikhac"/></span></td>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.trangthai"/></span></td>
		</tr>
		<%for (int i = 1; i < 10; i++) {%>
			<tr>
				<td><span><%=i%></span></td>
				<td><span>123/BAC...</span></td>
				<td><span><%=i%></span></td>
				<td><span class="bold">ISUZU</span><br><span>CYH52Y</span></td>
				<td><span class="bold">ISUZU</span><br><span>CYH52Y</span></td>
				<td><span class="bold">ISUZU</span><br><span>CYH52Y</span></td>
				<td><img src="<%=request.getContextPath()%>/img/tich_normal.png"></td>
				<td><img src="<%=request.getContextPath()%>/img/tich_normal.png"></td>
				<td><img src="<%=request.getContextPath()%>/img/tich_normal.png"></td>
				<td><img src="<%=request.getContextPath()%>/img/tich_normal.png"><span></span></td>
				<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.danop"/></span></td>
			</tr>
		<%}%>
	</table>
	<aui:button-row>
		<button type="button" onclick="eventHideOrShowDiv('dsChungChiChuaNopPhi', 'false')" class="btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totonghop.quanlythuphilephi.quaylai"/></button>
	</aui:button-row>
</div>

<!-- ------------- Cấp hóa đơn đỏ ------------- -->
<div id="capHoaDonDo">
</div>

<!-- ------------- Thong bao cap chung chi --------------->
<!-- ------------- Xem xet sau --------------->


<script type="text/javascript">
	$(function(){
		$('#dsChungChiDaNopPhi').hide();
		$('#dsChungChiChuaNopPhi').hide();
		$('#capHoaDonDo').hide();
		$('#theDem').hide();
	});

	function eventHideOrShowDiv(idElement, isHide) {
		console.log(idElement + isHide);
		if (isHide === 'false') {
			$('#'+idElement).hide();
			$('#theDem').hide();
			$('#divButton').show();
		} else if (isHide === 'true') { 
			$('#'+idElement).show();
			$('#theDem').show();
			$('#divButton').hide();
		}
	};
</script>