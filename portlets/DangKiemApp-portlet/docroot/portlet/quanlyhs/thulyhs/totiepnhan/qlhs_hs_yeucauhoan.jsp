<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/totiepnhan/initToTiepNhan.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idPhieuXuLyPhu = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY_PHU);
	
	//quay lai trang
	PortletURL renderBackURL = renderResponse.createRenderURL();
	renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");
%>
<%
	// Ghi actionlog
		
	String noidungthaotac = "Mở xem Yêu cầu hoãn lịch kiểm tra hiện trường thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
	String tenmanhinhdaidien = "Xác nhận hủy lịch kiểm tra hiện trường";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div id="divButton">
	<aui:button-row>
		<button type="button" onclick="eventHideOrShowDiv('divXacNhanHoan', 'true')" class=" btnThuLyHS form-control">Xác nhận hủy lịch KT</button>
		<button type="button" onclick="eventHideOrShowDiv('divTuChoiHoan', 'true')" class=" btnThuLyHS form-control">Từ chối hủy lịch KT</button>
		<a href="<%=renderBackURL.toString()%>"><button type="button" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button></a>
	</aui:button-row>
</div>
<div style="height: 15px" id="theDem"></div>


<%
PortletURL xacNhanHoan = renderResponse.createActionURL();
xacNhanHoan.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_XacNhanHoan");
xacNhanHoan.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
xacNhanHoan.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
xacNhanHoan.setParameter(Constants.ID_PHIEU_XU_LY_PHU, idPhieuXuLyPhu);
%>
<aui:form action="<%=xacNhanHoan.toString()%>" name="formXacNhanHoan" id="formXacNhanHoan" method="POST">
<div id="divXacNhanHoan">
	<p style="text-align: left;"><span>Lý do<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="xacNhanHoan" name="xacNhanHoan"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorXacNhanHoan()) beforSummitForm('formXacNhanHoan', '<%=xacNhanHoan.toString()%>')" class="btnThuLyHS form-control" style="width: 180px">Xác nhận hủy lịch KT</button>
		<button type="button" onclick="eventHideOrShowDiv('divXacNhanHoan', 'false')" class="btnThuLyHS form-control" style="width: 150px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>

<%
PortletURL tuChoiHoan = renderResponse.createActionURL();
tuChoiHoan.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_TuChoiHoan");
tuChoiHoan.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
tuChoiHoan.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
tuChoiHoan.setParameter(Constants.ID_PHIEU_XU_LY_PHU, idPhieuXuLyPhu);
%>
<aui:form action="<%=tuChoiHoan.toString()%>" name="formTuChoiHoan" id="formTuChoiHoan" method="POST">
<div id="divTuChoiHoan">
	<p style="text-align: left;"><span>Lý do<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="tuChoiHoan" name="tuChoiHoan"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorTuChoiHoan()) beforSummitForm('formTuChoiHoan', '<%=tuChoiHoan.toString()%>')" class="btnThuLyHS form-control" style="width: 150px">Từ chối hủy lịch KT</button>
		<button type="button" onclick="eventHideOrShowDiv('divTuChoiHoan', 'false')" class="btnThuLyHS form-control" style="width: 150px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>

<script type="text/javascript">

	$(function(){
		$('#divXacNhanHoan').hide();
		$('#divTuChoiHoan').hide();
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

	function validatorXacNhanHoan() {
		var xacNhanHoan = $('#xacNhanHoan').val();
		if (xacNhanHoan.trim().length == 0) {
			alert("Đề nghị nhập lý do Xác nhận hoãn kiểm tra !");
			return false;
		}
		return true;
	}
	function validatorTuChoiHoan() {
		var tuChoiHoan = $('#tuChoiHoan').val();
		if (tuChoiHoan.trim().length == 0) {
			alert("Đề nghị nhập lý do Từ chối hoãn kiểm tra !");
			return false;
		}
		return true;
	}
</script>