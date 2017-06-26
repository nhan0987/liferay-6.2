<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoAction"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuImpl"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleStatisticsImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.config.DKConfigurationManager"%>
<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/totiepnhan/initToTiepNhan.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) {
	}
	
	//----------Phan nhom ho so
	String idPhanNhomHoSo = "";
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MAPHANNHOMHOSO);
		if (obj != null) {
			idPhanNhomHoSo = obj.toString();
		} else {
			idPhanNhomHoSo = "";
		}
	}
	
	//----------- organizationId
	long organizationId = 0;
	if (themeDisplay.getUser().getOrganizations() != null && themeDisplay.getUser().getOrganizations().size() > 0) {
		organizationId = themeDisplay.getUser().getOrganizations().get(0).getOrganizationId();
	}
	
	String liRoleSelected = CommonUtils.checkRole(themeDisplay);

	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	String id_phieu_xu_ly_phu = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY_PHU);
	long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
	long confirmedInspectionId = ParamUtil.getLong(request, Constants.ID_CONFIRMED_INSPECTION);
	
	ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
	if (confirmedInspection == null) { 
		confirmedInspection = new ConfirmedInspectionImpl(); 
	}
	
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==lanhdaodonvi/phancongkiemtra_mothoso.jsp==confirmedInspectionId==Lay trong DB==" + confirmedInspection.getId());
	confirmedInspectionId = confirmedInspection.getId();
	DmDataItem dmDonVi = null;
	DmDataItem dmDonViKiemTra = null;
	if (confirmedInspection != null && confirmedInspection.getInspectionProvincecode()!=null && confirmedInspection.getInspectionProvincecode().length()>0) {
		dmDonVi = DmDataItemLocalServiceUtil.getByDmDataGroupCodeNameAndCode0AndLevel(DanhMucKey.ADMINISTRATIVE_UNITS, confirmedInspection.getInspectionProvincecode(), 1);
		if (dmDonVi != null) {
			dmDonViKiemTra = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.CORPORATION, dmDonVi.getCode3());
		}
	}
	System.out.println("==idHoSoThuTuc==" + idHoSoThuTuc + "===idthuTucHanhChinh===" + idthuTucHanhChinh + "===id_phieu_xu_ly_phu===" + id_phieu_xu_ly_phu);
	MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(idPhieuXuLyPhu);
	if (motCuaPhieuXuLyPhu == null) { 
		motCuaPhieuXuLyPhu = new MotCuaPhieuXuLyPhuImpl(); 
	}
	RegisteredInspection registeredInspection=RegisteredInspectionLocalServiceUtil.findByDossierId(ConvertUtil.convertToLong(idHoSoThuTuc));
	if (registeredInspection == null) { 
		registeredInspection = new RegisteredInspectionImpl(); 
	}
	
	VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil.findByRegisteredInspectionId(registeredInspection.getId());
	//quay lai trang
	PortletURL renderBackURL = renderResponse.createRenderURL();
	renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");
%>

<%
	// Ghi actionlog
		
	String noidungthaotac = "Mở xem Thụ lý hồ sơ, chức năng Phân công đơn vị kiểm tra thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
	String tenmanhinhdaidien = "Phân công đơn vị kiểm tra";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div id="divButton">
	<aui:button-row>
		
		<button type="button" onclick="eventShowOnlyOne('divPhanCongMotDonViKiemTra')" class=" btnThuLyHS form-control">Phân công đơn vị kiểm tra</button>
		<button type="button" class="btnThuLyHS form-control" onclick="eventShowOnlyOne('divYeuCauBoSung')" style="width: 300px !important;float: left;">Yêu cầu sửa hồ sơ & Hoãn kiểm tra</button>
		<a href="<%=renderBackURL.toString()%>"><button type="button" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button></a>
	</aui:button-row>
</div>
<div style="height: 15px" id="theDem"></div>

<!---------------- Hồ sơ phân công đơn vị kiểm tra --------------------->
<%
PortletURL hoSoPhanCongMotDonViKiemTra = renderResponse.createActionURL();
hoSoPhanCongMotDonViKiemTra.setParameter(ActionRequest.ACTION_NAME, "hoSoPhanCongMotDonViKiemTra");
hoSoPhanCongMotDonViKiemTra.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
hoSoPhanCongMotDonViKiemTra.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
hoSoPhanCongMotDonViKiemTra.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
hoSoPhanCongMotDonViKiemTra.setParameter(Constants.DIEU_KIEN_CHUYEN_DICH, Constants.DIEU_KIEN_DICH_CHUYEN_PHAN_CONG_DON_VI_KT);
hoSoPhanCongMotDonViKiemTra.setParameter(Constants.ID_PHIEU_XU_LY_PHU, id_phieu_xu_ly_phu);
%>

<div id="divPhanCongMotDonViKiemTra">
<aui:form action="<%=hoSoPhanCongMotDonViKiemTra.toString()%>" name="formPhanCongMotDonViKiemTra" id="formPhanCongMotDonViKiemTra" method="POST">

	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<!--  -->		
		<p><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.phancongdonvikiemtra"/></b></span></p>
		<!--  -->
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 18%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.chondonvikiemtra"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 35%;">
				<!-- don vi kiem tra khu vuc chinh la corporationId -->
				<%
					//List<DmDataItem> lstDonViThucHien = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.CORPORATION);
					List<DmDataItem> lstDonViThucHien = DmDataItemLocalServiceUtil.findByDataGroupIdAndLevelAlterName(DanhMucKey.CORPORATION, 1, "KIEMTRA");
					if (lstDonViThucHien == null) { lstDonViThucHien = new ArrayList<DmDataItem>(); }
				%>
				<select id="corporationId" name="corporationId" class="form-control-find" style="width: 100%;">
					<option selected="selected" value="-1">---  <liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongmondonvikt.chondonvikiemtra"/>  ---</option>
					<%for (DmDataItem dmDonvithuchien : lstDonViThucHien) {
						String dlTypeCode = dmDonvithuchien.getCode0();
						
					%>
						<option value="<%=dmDonvithuchien.getCode0()%>" <%=dlTypeCode.equalsIgnoreCase(dmDonViKiemTra.getCode0().trim()) ? "selected" : "" %>> <%=dmDonvithuchien.getName()%></option>
					<%}%>
					
				</select>
			</div> 
		</div>
		
	
		<!--  -->
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 18%;">
				<label class="textlabel">Tổng số PT ĐKKT:</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 35%;">
				<input type="text" readonly="readonly" id="slgPTDKKT" name="slgPTDKKT" class="form-control-find" style="width: 100%;" 
				placeholder="Số PT ĐKKT"
				value="<%=vehicleStatistics.getTotalRegisteredVehicle() %>"/>
			</div> 
		</div>
		
		<!--  -->
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 18%;">
				<label class="textlabel">Số PT chưa ĐN KT:</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 35%;">
				<input type="text" readonly="readonly" id="slgPTChuaDeNghiDKKT" name="slgPTChuaDeNghiDKKT" class="form-control-find" style="width: 100%;" 
				placeholder="Số PT chưa ĐN KT"
				value="<%=vehicleStatistics.getTotalNotYetRequestedVehicle() %>"/>
			</div> 
		</div>
			
		<!--  -->
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 18%;">
				<label class="textlabel">Số PT ĐN KT:</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 35%;">
				<input type="text" readonly="readonly" id="slgPhuongTienDNKT" name="slgPhuongTienDNKT" 
				class="form-control-find" style="width: 100%;" placeholder="Số PT đề nghị KT"
				value="<%=vehicleStatistics.getTotalRequestedVehicle()%>"/>
			</div> 
		</div>
		
		<!--  -->
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 18%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongmondonvikt.ghichu"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 35%;">
				<%=motCuaPhieuXuLyPhu.getGhiChu().trim()%> <br>
			</div> 
		</div>
		
	</div>
	
	<aui:button-row>
		<button type="button" class="btnThuLyHS form-control" style="width: 150px"
			onclick="if(validatorBeforeData()) beforSummitForm('formPhanCongMotDonViKiemTra', '<%=hoSoPhanCongMotDonViKiemTra.toString() %>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.thuchien"/></button>
		<button type="button" onclick="eventHideOrShowDiv('divPhanCongMotDonViKiemTra', 'false')" class=" btnThuLyHS form-control" style="width: 150px;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongnhieudonviktsearchcontentresult.quaylai"/></button>
	</aui:button-row>
</aui:form>
</div>

<!------------------------------------ Yêu cầu bổ sung ------------------------------------>
<%
PortletURL yeuCauBoSung = renderResponse.createActionURL();
yeuCauBoSung.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_BoSungDoiChieuThieuTaiLieu");
yeuCauBoSung.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
yeuCauBoSung.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(id_phieu_xu_ly_phu));
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
		<button type="button" id="yeuCauSuaHoSoVaHoanKiemTra" onclick="if(validatorYeuCauBoSung()) beforSummitForm('formYeuCauBoSung','<%=yeuCauBoSung.toString()%>')" class="btnThuLyHS form-control" style="width: 300px; float: left;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.hsphancongmondonvikt.yeucaubosung"/> & Hoãn kiểm tra</button>
		<button type="button" class=" btnThuLyHS form-control" style="width: 150px;"
			onclick="eventHideOrShowDiv('divYeuCauBoSung', 'false')">Quay lại</button>
	</aui:button-row>
</div>
</aui:form>
<portlet:resourceURL var="ContentURL" ></portlet:resourceURL>
<script type="text/javascript">

	$(function(){
		$('#divPhanCongMotDonViKiemTra').hide();
		$('#divYeuCauBoSung').hide();
		$('#theDem').hide();
	});

	function eventShowOnlyOne(idElement) {
		$('#divPhanCongMotDonViKiemTra').hide();
		$('#divYeuCauBoSung').hide();

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
		} else {
			document.getElementById('<portlet:namespace/>' + idForm).action = '';
			document.getElementById('yeuCauSuaHoSoVaHoanKiemTra').disabled = false;
		}
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
	
	
</script>

<script type="text/javascript">

	function validatorBeforeData () {
		var code = $("select#corporationId").val();
		if (code === '-1') {
			alert("Đề nghị chọn đơn vị phân công kiểm tra !");
			return false;
		} else {
			return true;
		}
	}

	
</script>