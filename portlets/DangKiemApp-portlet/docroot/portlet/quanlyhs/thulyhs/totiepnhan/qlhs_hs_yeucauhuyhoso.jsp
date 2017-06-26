<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/totiepnhan/initToTiepNhan.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	
	//quay lai trang
	PortletURL renderBackURL = renderResponse.createRenderURL();
	renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");
%>
<%
	// Ghi actionlog
		
	String noidungthaotac = "Mở xem Yêu cầu hủy hồ sơ thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
	String tenmanhinhdaidien = "Yêu cầu hủy hồ sơ";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div id="divButton">
	<aui:button-row>
		<button type="button" onclick="eventHideOrShowDiv('divDongYHuy', 'true')" class=" btnThuLyHS form-control">Đồng ý hủy</button>
		<button type="button" onclick="eventHideOrShowDiv('divTuChoiHuy', 'true')" class=" btnThuLyHS form-control">Từ chối hủy</button>
		<a href="<%=renderBackURL.toString()%>"><button type="button" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button></a>
	</aui:button-row>
</div>
<div style="height: 15px" id="theDem"></div>


<!-- ------------- Đồng ý hủy ---------------- -->
<%
PortletURL dongYHuy = renderResponse.createActionURL();
dongYHuy.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_DongYHuy");
dongYHuy.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
dongYHuy.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
dongYHuy.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
%>
<aui:form action="<%=dongYHuy.toString()%>" name="formDongYHuy" id="formDongYHuy" method="POST">
<div id="divDongYHuy">
	<p style="text-align: left;"><span>Lý do<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="dongYHuy" name="dongYHuy"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorDongYHuy()) beforSummitForm('formDongYHuy', '<%=dongYHuy.toString()%>')" class="btnThuLyHS form-control" style="width: 150px">Đồng ý hủy</button>
		<button type="button" onclick="eventHideOrShowDiv('divDongYHuy', 'false')" class="btnThuLyHS form-control" style="width: 150px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>

<!-- ------------- Từ chối hủy ---------------- -->
<%
PortletURL tuChoiHuy = renderResponse.createActionURL();
tuChoiHuy.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_TuChoiHuy");
tuChoiHuy.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
tuChoiHuy.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
tuChoiHuy.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
%>
<aui:form action="<%=tuChoiHuy.toString()%>" name="formTuChoiHuy" id="formTuChoiHuy" method="POST">
<div id="divTuChoiHuy">
	<p style="text-align: left;"><span>Lý do<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="tuChoiHuy" name="tuChoiHuy"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorTuChoiHuy()) beforSummitForm('formTuChoiHuy', '<%=tuChoiHuy.toString()%>')" class="btnThuLyHS form-control" style="width: 150px">Từ chối hủy</button>
		<button type="button" onclick="eventHideOrShowDiv('divTuChoiHuy', 'false')" class="btnThuLyHS form-control" style="width: 150px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>

<script type="text/javascript">

	$(function(){
		$('#divDongYHuy').hide();
		$('#divTuChoiHuy').hide();
		$('#theDem').hide();
	});

	//de ve file js, ko an doan code: <portlet:namespace/>
	function beforSummitForm(idForm, url) {
		console.log('=beforSummitForm=' + idForm);
		var urlAction = document.getElementById('<portlet:namespace/>' + idForm).action;
		if (urlAction == '') {
			document.getElementById('<portlet:namespace/>' + idForm).action = url;
		}
		var status = confirm("Bạn có muốn tiếp tục xử lý?");
		if (status) {
			document.getElementById('<portlet:namespace/>' + idForm).submit(); 
		} else {
			document.getElementById('<portlet:namespace/>' + idForm).action = '';
		}
	}

	function validatorDongYHuy() {
		var dongYHuy = $('#dongYHuy').val();
		if (dongYHuy.trim().length == 0) {
			alert("Đề nghị nhập lý do Đồng ý hủy !");
			return false;
		}
		return true;
	}
	function validatorTuChoiHuy() {
		var tuChoiHuy = $('#tuChoiHuy').val();
		if (tuChoiHuy.trim().length == 0) {
			alert("Đề nghị nhập lý do Từ chối hủy !");
			return false;
		}
		return true;
	}
</script>