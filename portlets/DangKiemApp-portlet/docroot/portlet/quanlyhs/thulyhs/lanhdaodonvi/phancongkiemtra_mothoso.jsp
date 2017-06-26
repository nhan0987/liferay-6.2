<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoAction"%>
<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/totiepnhan/initToTiepNhan.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
	long confirmedInspectionId = ParamUtil.getLong(request, Constants.ID_CONFIRMED_INSPECTION);
	
	ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
	if (confirmedInspection == null) { 
		confirmedInspection = new ConfirmedInspectionImpl(); 
	}
	
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==lanhdaodonvi/phancongkiemtra_mothoso.jsp==confirmedInspectionId==Lay trong DB==" + confirmedInspection.getId());
	confirmedInspectionId = confirmedInspection.getId();
	//quay lai trang
	PortletURL renderBackURL = renderResponse.createRenderURL();
	renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");
%>
<div id="divButton">
	<aui:button-row>
		<button type="button" onclick="" class=" btnThuLyHS form-control">Xem lịch đề nghị kiểm tra</button>
		<button type="button" onclick="eventShowOnlyOne('divTraLichKiemTraChoToTiepNhan')" class=" btnThuLyHS form-control">Trả lịch đề nghị kiểm tra về HCCTT</button>
		<button type="button" class="btnThuLyHS form-control" onclick="eventShowOnlyOne('divYeuCauBoSung')" style="width: 300px !important;float: left;">Yêu cầu sửa hồ sơ & Hoãn kiểm tra</button>
		<button type="button" class=" btnThuLyHS form-control" onclick="eventShowOnlyOne('divHoanKiemTra')" style="width: 150px !important;float: left;">Hoãn kiểm tra</button>
		<a href="<%=renderBackURL.toString()%>"><button type="button" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button></a>
	</aui:button-row>
</div>
<div style="height: 15px" id="theDem"></div>

<!------------------------------------ Trả lịch kiểm tra về HCCTT ------------------------------------>
<%
PortletURL traLichKiemTraChoToTiepNhan = renderResponse.createActionURL();
traLichKiemTraChoToTiepNhan.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_TraLichKiemTraChoToTiepNhan");
traLichKiemTraChoToTiepNhan.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
traLichKiemTraChoToTiepNhan.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
traLichKiemTraChoToTiepNhan.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
traLichKiemTraChoToTiepNhan.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(idPhieuXuLyPhu));
%>
<aui:form action="<%=traLichKiemTraChoToTiepNhan.toString()%>" name="formTraLichKiemTraChoToTiepNhan" id="formTraLichKiemTraChoToTiepNhan" method="POST">
<div id="divTraLichKiemTraChoToTiepNhan">
	<p style="text-align: left;"><span>Lý do<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="traLichKiemTra" name="traLichKiemTra"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorTraLichKiemTraChoToTiepNhan()) beforSummitForm('formTraLichKiemTraChoToTiepNhan', '<%=traLichKiemTraChoToTiepNhan.toString()%>')" class="btnThuLyHS form-control" style="width: 180px">Trả lịch đề nghị kiểm tra</button>
		<button type="button" onclick="eventHideOrShowDiv('divTraLichKiemTraChoToTiepNhan', 'false')" class="btnThuLyHS form-control" style="width: 200px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>

<!------------------------------------ Hoãn kiểm tra ------------------------------------>
<%
PortletURL hoanKiemTra = renderResponse.createActionURL();
hoanKiemTra.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_HoanKiemTra");
hoanKiemTra.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
hoanKiemTra.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(idPhieuXuLyPhu));
hoanKiemTra.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
hoanKiemTra.setParameter(Constants.ID_CONFIRMED_INSPECTION, String.valueOf(confirmedInspectionId));
%>

<aui:form action="<%=hoanKiemTra.toString()%>" name="formHoanKiemTra" id="formHoanKiemTra" method="POST">
<div id="divHoanKiemTra">
	<p><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.lydohoankiemtra"/></span></p>
	<textarea class="textAreaAutosize" id="lyDoHoanKiemTra" name="lyDoHoanKiemTra"><%=StringPool.BLANK%></textarea>
	<aui:button-row cssClass="width100">
		<button type="button" id="hoanKiemTra" onclick="if(validatorHoanKiemTra()) beforSummitForm('formHoanKiemTra', '<%=hoanKiemTra.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;float: left;">Thực hiện</button>
		
		<button type="button" class=" btnThuLyHS form-control" style="width: 200px;"
			onclick="eventHideOrShowDiv('divHoanKiemTra', 'false')">Quay lại</button>			
	</aui:button-row>
</div>
</aui:form>


<!------------------------------------ Yêu cầu bổ sung ------------------------------------>
<%
PortletURL yeuCauBoSung = renderResponse.createActionURL();
yeuCauBoSung.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_BoSungDoiChieuThieuTaiLieu");
yeuCauBoSung.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
yeuCauBoSung.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(idPhieuXuLyPhu));
yeuCauBoSung.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
yeuCauBoSung.setParameter(Constants.ID_CONFIRMED_INSPECTION,  String.valueOf(confirmedInspectionId));
%>
<aui:form action="<%=yeuCauBoSung.toString()%>" name="formYeuCauBoSung" id="formYeuCauBoSung" method="POST">
<div id="divYeuCauBoSung">
	<p><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.lydoyeucaubosung"/></span></p>
	<textarea class="textAreaAutosize" id="yeuCauBoSung" name="yeuCauBoSung"><%=StringPool.BLANK%></textarea>
	<div>
		<p><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.ngayhoanthienhoso"/></span></p>
		<input type="text" placeholder="Ngày hoàn thiện hồ sơ"  class="form-control-find-calendar" style="width: 400px; float: left;"
				name="ngayHoanThienHoSo" id="ngayHoanThienHoSo" onclick="gtCalendar('ngayHoanThienHoSo')">
		<span class="input-group-btn">
			<button class="btn_calendar btn-default" type="button" onclick="gtCalendar('ngayHoanThienHoSo')"><i class="fa fa-calendar"></i></button>
		</span>
	</div>
	<aui:button-row cssClass="width100">
		<button type="button" id="yeuCauSuaHoSoVaHoanKiemTra" onclick="if(validatorYeuCauBoSung()) beforSummitForm('formYeuCauBoSung','<%=yeuCauBoSung.toString()%>')" class="btnThuLyHS form-control" style="width: 300px; float: left;">Yêu cầu sửa hồ sơ & Hoãn kiểm tra</button>
		<button type="button" class=" btnThuLyHS form-control" style="width: 150px;"
			onclick="eventHideOrShowDiv('divYeuCauBoSung', 'false')">Quay lại</button>
	</aui:button-row>
</div>
</aui:form>
<portlet:resourceURL var="ContentURL" ></portlet:resourceURL>
<script type="text/javascript">

	$(function(){
		$('#divTraLichKiemTraChoToTiepNhan').hide();
		$('#divYeuCauBoSung').hide();
		$('#divHoanKiemTra').hide();
		$('#theDem').hide();
	});

	function eventShowOnlyOne(idElement) {
		$('#divTraLichKiemTraChoToTiepNhan').hide();
		$('#divYeuCauBoSung').hide();
		$('#divHoanKiemTra').hide();
		$('#'+idElement).show();
		
	};  

	function eventHideAndShowDiv(hideElement, showElement) {
			$('#'+hideElement).hide();
			$('#'+showElement).show();
	};
	
	function eventHideOrShowDiv(idElement, isHide) {
		console.log(idElement + isHide);
		if (isHide === 'false') {
			$('#'+idElement).hide();
			
		} else if (isHide === 'true') { 
			$('#'+idElement).show();
		
		}
	};
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
			document.getElementById('yeuCauSuaHoSoVaHoanKiemTra').disabled = true;
			document.getElementById('hoanKiemTra').disabled = true;
		} else {
			document.getElementById('<portlet:namespace/>' + idForm).action = '';
			document.getElementById('yeuCauSuaHoSoVaHoanKiemTra').disabled = false;
			document.getElementById('hoanKiemTra').disabled = false;
		}
	}

	function validatorTraLichKiemTraChoToTiepNhan() {
		var traLichKiemTra = $('#traLichKiemTra').val();
		if (traLichKiemTra.trim().length == 0) {
			alert("Đề nghị nhập lý do Trả lịch kiểm tra !");
			return false;
		}
		return true;
	}
	
	function validatorYeuCauBoSung() {
		var valid = false;
		document.getElementById('yeuCauSuaHoSoVaHoanKiemTra').disabled = true;
		$.ajax({
			async: false,
			cache: false,
			url : '<%=ContentURL%>',
			method : 'POST',
			dataType: 'json',
			data : {
				<%= Constants.ID_CONFIRMED_INSPECTION %> : <%= confirmedInspectionId %>, 
				type: 'validateYeuCauBoSungAndHoanKiemTra'
			},
			success : function(response) {
				valid = response.valid;
				
				if(!valid) {
					var msg = "ERROR";
					if(response.message === 'CON_BIEN_BAN_LUU_TAM') {
						msg = "Còn biên bản lưu tạm !";
					} else if(response.message === 'CON_XE_CHUA_KIEM_TRA') {
						msg = "Hết xe chưa kiểm tra !";
					}				
					alert(msg);
					document.getElementById('yeuCauSuaHoSoVaHoanKiemTra').disabled = false;
					return valid;
				}
			}
		});
		
		if(valid) {
			var yeuCauBoSung = $('#yeuCauBoSung').val();
			
			if (yeuCauBoSung.trim().length == 0) {			
				alert("Đề nghị nhập lý do Yêu cầu bổ sung hồ sơ!");
				document.getElementById('yeuCauSuaHoSoVaHoanKiemTra').disabled = false;
				valid = false;
				return valid;
			}
		}
		
		return valid;
	}
	
	
	function validatorHoanKiemTra() {
		var valid = false;
		document.getElementById('hoanKiemTra').disabled = true;
		$.ajax({
			async: false,
			cache: false,
			url : '<%=ContentURL%>',
			method : 'POST',
			dataType: 'json',
			data : {
				<%= Constants.ID_CONFIRMED_INSPECTION %> : <%= confirmedInspectionId %>, 
				type: 'validateYeuCauBoSungAndHoanKiemTra'
			},
			success : function(response) {
				valid = response.valid;
				
				if(!valid) {
					var msg = "ERROR";
					if(response.message === 'CON_BIEN_BAN_LUU_TAM') {
						msg = "Còn biên bản lưu tạm !";
					} else if(response.message === 'CON_XE_CHUA_KIEM_TRA') {
						msg = "Hết xe chưa kiểm tra !";
					}
					
					alert(msg);
					document.getElementById('hoanKiemTra').disabled = false;
					return valid;
				}
			}
		});
		
		if(valid) {
			var lyDoHoanKiemTra = $('#lyDoHoanKiemTra').val();
			
			if (lyDoHoanKiemTra.trim().length == 0) {
				alert("Đề nghị nhập lý do Hoãn kiểm tra !");
				document.getElementById('hoanKiemTra').disabled = false;
				valid = false;
				return valid;
			}
		}
		
		return valid;
	}

</script>