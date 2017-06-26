<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.CollectionUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@ include file="/portlet/init.jsp"%>
<%@ include	file="/portlet/quanlyhs/thulyhs/totiepnhan/initToTiepNhan.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<portlet:resourceURL var="getDataAjax">
</portlet:resourceURL>

<script type="text/javascript">

	function checkTrungSoDongCo(idHoSoThuTuc) {		
		$.ajax({
			type : 'POST',
			url : '<%=getDataAjax%>',	
			async: false,//bat dong bo = fale, dong bo voi client
			cache : false,	
			data : {
				type:'TrungSoDongCo',				
				idHoSoThuTuc:idHoSoThuTuc,
			},
			success : function(data) {
				
				//if(data){
					var jsonData = JSON.parse(data);
					var msg = jsonData.msg;
					if(msg == 'success'){
				
						var urlFile = jsonData.urlFile;
						window.open(urlFile);
						
					}
					
				//}
			},
			  error: function(){
			  
			  }
		  
	});
	}
</script>
<%
	String idHoSoThuTuc = ParamUtil.getString(request,
			Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request,
			Constants.TTHC_THUTUCHANHCHINH_ID);
	RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
			.findByDossierId(ConvertUtil.convertToLong(idHoSoThuTuc));
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(ConvertUtil.convertToLong(idHoSoThuTuc));
	long PhanNhomHoSoId = 0;
	
	if (hoSoThuTuc != null ){
		PhanNhomHoSoId = hoSoThuTuc.getPhanNhomHoSoId();
	}
%>
<%
	PortletURL tiepNhanHoSo = renderResponse.createActionURL();
	tiepNhanHoSo
			.setParameter(ActionRequest.ACTION_NAME, "tiepNhanHoSo");
	tiepNhanHoSo.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
	tiepNhanHoSo.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID,
			idthuTucHanhChinh);
	tiepNhanHoSo.setParameter(Constants.THANH_PHAN_XU_LY,
			Constants.XU_LY_TLHS);

	PortletURL tiepNhan = renderResponse.createActionURL();
	tiepNhan.setParameter(ActionRequest.ACTION_NAME, "tiepNhan");
	tiepNhan.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
	tiepNhan.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID,
			idthuTucHanhChinh);
	tiepNhan.setParameter(Constants.THANH_PHAN_XU_LY,
			Constants.XU_LY_TLHS);

	//quay lai trang
	PortletURL renderBackURL = renderResponse.createRenderURL();
	renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");
	
%>
<%
	// Ghi actionlog
		
	String noidungthaotac = "Mở xem Thụ lý hồ sơ, chức năng Tiếp nhận hồ sơ thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
	String tenmanhinhdaidien = "Tiếp nhận hồ sơ";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<!-- Tiếp nhận -->
<aui:form action="<%=tiepNhan.toString()%>" name="formTiepNhan2"
	id="formTiepNhan2" method="POST">
	<input type="text" hidden="true"
		name="<%=Constants.DIEU_KIEN_CHUYEN_DICH%>"
		value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_PHU_HOP_QUY_DINH%>" />
</aui:form>
<aui:form action="<%=tiepNhanHoSo.toString()%>" name="formTiepNhan"
	id="formTiepNhan" method="POST">
	<input type="text" hidden="true"
		name="<%=Constants.DIEU_KIEN_CHUYEN_DICH%>"
		value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_PHU_HOP_QUY_DINH%>" />
</aui:form>

<div id="divButton">
	<aui:button-row>
	<%
			if (hoSoThuTuc != null && PhanNhomHoSoId != 56) {
		%>
		<%
			if (registeredInspection != null
						&& registeredInspection.getRegisteredNumber() != null
						&& registeredInspection.getRegisteredNumber().trim()
								.length() > 0) {
		%>
		<button type="button" style="display: none;"
			onclick="beforSummitForm('formTiepNhan2', '<%=tiepNhan.toString()%>')"
			class="btnThuLyHS form-control">Tiếp nhận</button>
		<button type="button"
			onclick="eventHideOrShowDiv('divYeuCauBoSung', 'true')"
			class=" btnThuLyHS form-control">
			<liferay-ui:message
				key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.yeucaubosung" />
		</button>
		
		<%
			} else {
		%>
		<button type="button"
			onclick="beforSummitForm('formTiepNhan', '<%=tiepNhanHoSo.toString()%>')"
			class="btnThuLyHS form-control">
			<liferay-ui:message
				key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.tiepnhanvachuyentruongbophan" />
		</button>
		<button type="button"
			onclick="eventHideOrShowDiv('divYeuCauBoSung', 'true')"
			class=" btnThuLyHS form-control">
			<liferay-ui:message
				key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.yeucaubosung" />
		</button>
		<button type="button"
			onclick="eventHideOrShowDiv('divThongBaoViPham', 'true')"
			class="btnThuLyHS form-control" style="display: none;">
			<liferay-ui:message
				key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.thongbaovipham" />
		</button>
		<%
			}
		%>

		<a onclick="checkTrungSoDongCo('<%=idHoSoThuTuc%>')"><button type="button" class="btnThuLyHS form-control">Kiểm tra
				trùng số</button></a>
		<a href="<%=renderBackURL.toString()%>"><button type="button" class=" btnThuLyHS form-control">
				<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button></a>
		<%
			} else if (hoSoThuTuc != null && PhanNhomHoSoId == 56){
		%>
		<button type="button" onclick="eventHideOrShowDiv('divDongYHuy', 'true')" class=" btnThuLyHS form-control">Đồng ý hủy</button>
		<button type="button" onclick="eventHideOrShowDiv('divTuChoiHuy', 'true')" class=" btnThuLyHS form-control">Từ chối hủy</button>
		<a href="<%=renderBackURL.toString()%>"><button type="button" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button></a>
		<%
			}
		%>
	</aui:button-row>
</div>
<div style="height: 15px" id="theDem"></div>


<!-- ------------- Yêu cầu bổ sung ---------------- -->
<%
	PortletURL yeuCauBoSung = renderResponse.createActionURL();
	yeuCauBoSung.setParameter(ActionRequest.ACTION_NAME,
			"toTiepNhan_YeuCauBoSung");
	yeuCauBoSung.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
	yeuCauBoSung.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID,
			idthuTucHanhChinh);
	yeuCauBoSung.setParameter(Constants.THANH_PHAN_XU_LY,
			Constants.XU_LY_TLHS);
%>
<aui:form action="<%=yeuCauBoSung.toString()%>" name="formYeuCauBoSung"
	id="formYeuCauBoSung" method="POST">
	<div id="divYeuCauBoSung">
		<input type="text" hidden="true"
			name="<%=Constants.DIEU_KIEN_CHUYEN_DICH%>"
			value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_BO_SUNG%>" />
		<p style="text-align: left;">
			<span><liferay-ui:message
					key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.noidungyeucaubosung" />
				<span style="color: red;">*</span> :</span>
		</p>
		<textarea class="textAreaAutosize" id="yeuCauBoSung"
			name="yeuCauBoSung"><%=StringPool.BLANK%></textarea>

		<div class="CollapsiblePanel CollapsiblePanelOpen"
			id="CollapsiblePanel1" style="border-bottom: none">
			<!-------------------------- Ngay thong bao -------------------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel"><liferay-ui:message
							key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.ngaythongbao" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<input type="text"
						style="width: 200px; float: left; cursor: pointer;"
						class="form-control-find-calendar" readonly="readonly"
						id="ngayThongBao" name="ngayThongBao"
						value="<%=DateUtils.getDateAfterNumberDay(1)%>"
						onclick="gtCalendar('ngayThongBao')" /> <span
						class="input-group-btn">
						<button class="btn_calendar btn-default " type="button"
							onclick="gtCalendar('ngayThongBao')">
							<i class="fa fa-calendar"></i>
						</button>
					</span>
				</div>
			</div>

			<!-------------------------- ngay hoan thien ho so -------------------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel"><liferay-ui:message
							key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.ngayhoanthienhoso" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<input type="text" placeholder="Ngày hoàn thiện hồ sơ"
						class="form-control-find-calendar"
						style="width: 200px; float: left; cursor: pointer;"
						readonly="readonly" name="ngayHoanThienHoSo"
						id="ngayHoanThienHoSo" onclick="gtCalendar('ngayHoanThienHoSo')">
					<span class="input-group-btn">
						<button class="btn_calendar btn-default " type="button"
							onclick="gtCalendar('ngayHoanThienHoSo')">
							<i class="fa fa-calendar"></i>
						</button>
					</span>
				</div>
			</div>
		</div>

		<aui:button-row cssClass="width100">
			<button type="button"
				onclick="if(validatorYeuCauBoSung()) beforSummitForm('formYeuCauBoSung', '<%=yeuCauBoSung.toString()%>')"
				class="btnThuLyHS form-control" style="width: 150px">
				<liferay-ui:message
					key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.yeucaubosung" />
			</button>
			<button type="button"
				onclick="eventHideOrShowDiv('divYeuCauBoSung', 'false')"
				class="btnThuLyHS form-control" style="width: 150px">
				<liferay-ui:message
					key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai" />
			</button>
		</aui:button-row>
	</div>
</aui:form>

<!-- ------------- Thông báo vi phạm ------------- -->
<%
	PortletURL thongBaoViPham = renderResponse.createActionURL();
	thongBaoViPham.setParameter(ActionRequest.ACTION_NAME,
			"toTiepNhan_ThongBaoViPham");
	thongBaoViPham.setParameter(Constants.ID_HO_SO_THU_TUC,
			idHoSoThuTuc);
	thongBaoViPham.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID,
			idthuTucHanhChinh);
	thongBaoViPham.setParameter(Constants.THANH_PHAN_XU_LY,
			Constants.XU_LY_TLHS);
%>
<aui:form action="<%=thongBaoViPham.toString()%>"
	name="formThongBaoViPham" id="formThongBaoViPham" method="POST">
	<input type="text" hidden="true"
		name="<%=Constants.DIEU_KIEN_CHUYEN_DICH%>"
		value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_VI_PHAM_ND187%>" />
	<div id="divThongBaoViPham">
		<div>
			<p style="text-align: left;">
				<span><liferay-ui:message
						key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.noidungkiennghi" />
					<span style="color: red;">*</span> :</span>
			</p>
		</div>
		<div>
			<textarea class="textAreaAutosize" id="noiDungKienNghi"
				name="noiDungKienNghi"><%=StringPool.BLANK%></textarea>
		</div>
		<div>
			<p style="text-align: left; float: left; width: 15%">
				<span><liferay-ui:message
						key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.ngaythongbao" /></span>
			</p>
			<input type="text"
				style="width: 200px; float: left; cursor: pointer;"
				class="form-control-find-calendar" readonly="readonly"
				id="ngayThongBaoViPham" name="ngayThongBaoViPham"
				onclick="gtCalendar('ngayThongBaoViPham')" /> <span
				class="input-group-btn">
				<button class="btn_calendar btn-default " type="button"
					onclick="gtCalendar('ngayThongBaoViPham')">
					<i class="fa fa-calendar"></i>
				</button>
			</span>
		</div>
		<div>
			<aui:button-row>
				<button type="button"
					onclick="if(validatorThongBaoViPham()) beforSummitForm('formThongBaoViPham', '<%=thongBaoViPham.toString()%>')"
					class="btnThuLyHS form-control">
					<liferay-ui:message
						key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.thongbaovaochuyenbophannghiepvu" />
				</button>
				<button type="button"
					onclick="eventHideOrShowDiv('divThongBaoViPham', 'false')"
					class="btnThuLyHS form-control">
					<liferay-ui:message
						key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai" />
				</button>
			</aui:button-row>
		</div>
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

<!-- ------------- Thong bao cap chung chi --------------->
<!-- ------------- Xem xet sau --------------->
<!-- Call ajax load sinh So Bien Ban Kiem Tra Tu Dong -->
<portlet:resourceURL var="updaContentURL"></portlet:resourceURL>

<script type="text/javascript">

	$(function(){
		$('#divYeuCauBoSung').hide();
		$('#divThongBaoViPham').hide();
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

	//validator yeu cau bo sung
	function validatorYeuCauBoSung() {
		var yeuCauBoSung = $('#yeuCauBoSung').val();
		if (yeuCauBoSung.trim().length == 0) {
			alert("Đề nghị nhập lý do Yêu cầu bổ sung !");
			return false;
		}

		var ngayThongBao = $('#ngayThongBao').val();
		if (ngayThongBao.trim().length === 0) {
			alert("Đề nghị nhập ngày Thông báo !")
			return false;
		}
		
		var ngayHoanThienHoSo = $('#ngayHoanThienHoSo').val();
		if (ngayHoanThienHoSo.trim().length == 0) {
			alert("Đề nghị nhập ngày hoàn thiện hồ sơ !");
			return false;
		}
		return true;
	}

	//validator du lieu thong bao vi pham
	function validatorThongBaoViPham() {
		var noiDungKienNghi = $('#noiDungKienNghi').val();
		if (noiDungKienNghi.trim().length == 0) {
			alert("Đề nghị nhập nội dung kiến nghị !");
			return false;
		}

		var ngayThongBaoViPham = $('#ngayThongBaoViPham').val();
		if (ngayThongBaoViPham.trim().length === 0) {
			alert("Đề nghị nhập ngày thông báo vi phạm !");
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
	//1 quy dinh so dang ki kiem tra
	//2 quy dinh so bien ban kiem tra
	//3 quy dinh so chung chi chat luong
	<%-- function callAjaxSinhSoBienBanKiemTraTuDong() {
		$.ajax({
			url: '<%=updaContentURL%>',
			dataType: "json",
			data: { 
				type : 'sinhSoBienBanKiemTraTuDong',
				loaiQuyDinh : '1'
			},
			type: "get",
			success : function (data) {
				console.log('==(2) neu thanh cong==success==');
				console.log(data);
				var sinhSoBienBan = JSON.parse(JSON.stringify(data));
				console.log('sinhSoBienBan: ' + sinhSoBienBan);

				$('#registeredNumber').val(sinhSoBienBan[0].soDangKyKiemTra);
			}, beforeSend: function(data) {
				console.log("==(1)==beforeSend==" + data);
			}, complete: function(data) {
				console.log("==(3)finally=complete==" + data);
			}, error: function(data) {
				console.log("==(2) neu that bai==error==" + data);
			}
		});
	} --%>
</script>