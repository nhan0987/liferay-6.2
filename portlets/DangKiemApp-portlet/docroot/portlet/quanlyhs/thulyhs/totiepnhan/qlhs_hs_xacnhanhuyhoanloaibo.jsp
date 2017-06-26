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
		
	String noidungthaotac = "Mở xem Thụ lý hồ sơ, chức năng Xác nhận hủy hồ sơ, loại bỏ phương tiện  thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
	String tenmanhinhdaidien = "Xác nhận hủy hồ sơ hoặc loại bỏ phương tiện";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div id="divButton">
	<aui:button-row>
		<button type="button" onclick="eventHideOrShowDiv('divYeuCauBoSung', 'true')" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.yeucaubosung"/></button>
		<button type="button" onclick="eventHideOrShowDiv('divDongYHuy', 'true')" class=" btnThuLyHS form-control">Đồng ý hủy</button>
<!--	<button type="button" onclick="eventHideOrShowDiv('divTuChoiHuy', 'true')" class=" btnThuLyHS form-control">Từ chối hủy</button>
		<button type="button" onclick="eventHideOrShowDiv('divXacNhanLoaiBo', 'true')" class=" btnThuLyHS form-control">Xác nhận loại bỏ</button>
		<button type="button" onclick="eventHideOrShowDiv('tuChoi', 'true')" class=" btnThuLyHS form-control">Từ chối</button> -->
		<a href="<%=renderBackURL.toString()%>"><button type="button" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button></a>
	</aui:button-row>
</div>
<div style="height: 15px" id="theDem"></div>


<!-- ------------- Yêu cầu bổ sung ---------------- -->
<%
PortletURL yeuCauBoSung = renderResponse.createActionURL();
yeuCauBoSung.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_YeuCauBoSung");
yeuCauBoSung.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
yeuCauBoSung.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
yeuCauBoSung.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
%>
<aui:form action="<%=yeuCauBoSung.toString()%>" name="formYeuCauBoSung" id="formYeuCauBoSung" method="POST">
<div id="divYeuCauBoSung">
	<p style="text-align: left;"><span>Lý do<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="yeuCauBoSung" name="yeuCauBoSung"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorYeuCauBoSung()) beforSummitForm('formYeuCauBoSung', '<%=yeuCauBoSung.toString()%>')" class="btnThuLyHS form-control" style="width: 150px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.yeucaubosung"/></button>
		<button type="button" onclick="eventHideOrShowDiv('divYeuCauBoSung', 'false')" class="btnThuLyHS form-control" style="width: 150px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>

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

<!-- ------------- Xác nhận loại bỏ ---------------- -->
<%
PortletURL xacNhanLoaiBo = renderResponse.createActionURL();
xacNhanLoaiBo.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_XacNhanLoaiBo");
xacNhanLoaiBo.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
xacNhanLoaiBo.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
xacNhanLoaiBo.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
%>
<aui:form action="<%=xacNhanLoaiBo.toString()%>" name="formXacNhanLoaiBo" id="formXacNhanLoaiBo" method="POST">
<div id="divXacNhanLoaiBo">
	<p style="text-align: left;"><span>Lý do<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="xacNhanLoaiBo" name="xacNhanLoaiBo"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorXacNhanLoaiBo()) beforSummitForm('formXacNhanLoaiBo', '<%=xacNhanLoaiBo.toString()%>')" class="btnThuLyHS form-control" style="width: 150px">Xác nhận loại bỏ</button>
		<button type="button" onclick="eventHideOrShowDiv('divXacNhanLoaiBo', 'false')" class="btnThuLyHS form-control" style="width: 150px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>

<!-- ------------- Từ chối ---------------- -->
<%
PortletURL tuChoi = renderResponse.createActionURL();
tuChoi.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_TuChoi");
tuChoi.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
tuChoi.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
tuChoi.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
%>
<aui:form action="<%=tuChoi.toString()%>" name="formTuChoi" id="formTuChoi" method="POST">
<div id="divTuChoi">
	<p style="text-align: left;"><span>Lý do<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="tuChoi" name="tuChoi"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorTuChoi()) beforSummitForm('formXacNhanLoaiBo', '<%=tuChoi.toString()%>')" class="btnThuLyHS form-control" style="width: 150px">Từ Chối</button>
		<button type="button" onclick="eventHideOrShowDiv('divTuChoi', 'false')" class="btnThuLyHS form-control" style="width: 150px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>

<script type="text/javascript">

	$(function(){
		$('#divYeuCauBoSung').hide();
		$('#divDongYHuy').hide();
		$('#divTuChoiHuy').hide();
		$('#divXacNhanLoaiBo').hide();
		$('#divTuChoi').hide();
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

	//validator yeu cau bo sung
	function validatorYeuCauBoSung() {
		var yeuCauBoSung = $('#yeuCauBoSung').val();
		if (yeuCauBoSung.trim().length == 0) {
			alert("Đề nghị nhập lý do Yêu cầu bổ sung !");
			return false;
		}
		return true;
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
	function validatorXacNhanLoaiBo() {
		var xacNhanLoaiBo = $('#xacNhanLoaiBo').val();
		if (xacNhanLoaiBo.trim().length == 0) {
			alert("Đề nghị nhập lý do Xác nhận loại bỏ !");
			return false;
		}
		return true;
	}
	function validatorTuChoi() {
		var tuChoi = $('#tuChoi').val();
		if (tuChoi.trim().length == 0) {
			alert("Đề nghị nhập lý do Từ chối !");
			return false;
		}
		return true;
	}
</script>