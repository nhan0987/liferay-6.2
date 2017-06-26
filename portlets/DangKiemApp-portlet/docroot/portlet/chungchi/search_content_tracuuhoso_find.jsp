<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.portlet.chungchi.TraCuuChungChiAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="com.lowagie.text.pdf.PRAcroForm"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalService"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcLinhVucThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc"%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ include file="/portlet/init.jsp"%>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<% long javaScriptLastModified = ServletContextUtil.getLastModified(application, "/js/", true); %>
<script type="text/javascript" src='<%= PortalUtil.getStaticResourceURL(request, request.getContextPath() + "/js/tracuuhoso_find.js", javaScriptLastModified) %>'></script>
<style>
.col-md-14 { width: 14%; }
.col-md-15 { width: 24%; }
.col-md-16 { width: 16%; }

.col-md-left {padding-right: 0%;width: 22% !important;}

.col-md-right { width: 78% !important; }
.col-calender {width: 90%;float: left;}

.box {
	border: 1px solid #ccc;
	background-color: white;
	height: 290px;
	margin-left: 3%;
	overflow-y: scroll;
}
.bold { font-weight: bold;}
.dateFrom { margin-left: -15px; width: 51.6%; padding-right: 0px;}
 
.dateTo { width: 52%; padding-right: 0px;}

.divItemBox { float: left; width: 100%; padding: 0 0 0 0; margin: 0 0 0.5% 0;}
.itemBox1 {width: 66%;float: left;}
.itemBox2 {width: 20%;float: left;}
.itemBox3 {width: 9%;float: left;}
.itemBox4 {margin: 1% 0% 0% 0.5%;}

.ui-widget-header {background-color: #5f8ae0;}
</style>

<%
	TthcLinhVucThuTuc curentLinhVucThuTuc = null;
	List<TthcLinhVucThuTuc> allLoaiThuTuc = new ArrayList<TthcLinhVucThuTuc>();
	allLoaiThuTuc = TthcLinhVucThuTucLocalServiceUtil.getTthcLinhVucThuTucs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	TthcThuTucHanhChinh curentThuTucHanhChinh = null;
	List<TthcThuTucHanhChinh> allThuTucHanhChinh = null;	
	
	List<String> allYears = CommonUtils.getTenYearRecently();
	
	long userId = PortalUtil.getUserId(request);
	CorporationInspector corporationInspectorOnline = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
	
	//Thanh phan ben trai
	
	
	String idMotCuaTrangThaiHoSo = "-1";
	String sMcTrangThaiHoSo = request.getParameter(Constants.ID_MOTCUA_TRANGTHAIHOSO);
	if (Validator.isNull(sMcTrangThaiHoSo) || (Validator.isNotNull(sMcTrangThaiHoSo)) && sMcTrangThaiHoSo.length() == 0) {
		idMotCuaTrangThaiHoSo = "-1";
	} else {
		idMotCuaTrangThaiHoSo = sMcTrangThaiHoSo;
	}
	

	String trangThaiPhieuXuLy = ParamUtil.getString(request, Constants.TRANG_THAI_PHIEU_XU_LY);
	String soDangKiKiemTra = ParamUtil.getString(request, Constants.SO_DANGKI_KIEMTRA);
	String ngayCapDangKiFrom = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_FROM);
	String ngayCapDangKiTo = ParamUtil.getString(request, Constants.NGAY_CAP_DANG_KI_TO);
	
	String soBienBanKiemTra = ParamUtil.getString(request, Constants.SO_BIENBAN_KIEMTRA);
	String ngayKiemTraFrom = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_FROM);
	String ngayKiemTraTo = ParamUtil.getString(request, Constants.NGAY_KIEM_TRA_TO);
	String donViKiemTra = ParamUtil.getString(request, Constants.DON_VI_KIEM_TRA);
	String dangKiemVienKiemTra = ParamUtil.getString(request, Constants.ID_DANG_KIEM_VIEN_KIEMTRA);
	String soInvoice = ParamUtil.getString(request, Constants.SO_INVOICE);
	
	
	String soToKhaiHaiQuan = ParamUtil.getString(request, Constants.SO_TO_KHAI_HAI_QUAN);
	String ngayToKhaiHaiQuanFrom = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_FROM);
	String ngayToKhaiHaiQuanTo = ParamUtil.getString(request, Constants.NGAY_TOKHAI_HAIQUAN_TO);
	
	String nguoiNhapKhau = ParamUtil.getString(request, Constants.NGUOI_NHAP_KHAU);
	
	String soHoSo = ParamUtil.getString(request, Constants.SO_HO_SO);
	String ngayNopHsFrom = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
	String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
	String doiTuongThucHien = ParamUtil.getString(request, Constants.DOI_TUONG_THUC_HIEN);
	
	String tenThuTuc = ParamUtil.getString(request, Constants.TEN_THU_TUC);
	 
	
	//thanh phan ben phai
	long idMotCuaTrangThaiXe = 0;
	String sTrangThaiCuaXe = request.getParameter(Constants.TRANG_THAI_CUA_XE);
	if (Validator.isNull(sTrangThaiCuaXe)) {
		idMotCuaTrangThaiXe = -1;
	} else {
		idMotCuaTrangThaiXe = ConvertUtil.convertToLong(sTrangThaiCuaXe);
	}
	
	String loaiThuTuc = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
	String soKhung = ParamUtil.getString(request, Constants.SO_KHUNG);
	String soDongCo = ParamUtil.getString(request, Constants.SO_DONG_CO);
	String mauSon = ParamUtil.getString(request, Constants.MAU_SON);
	String tinhTrangPhuongTien = ParamUtil.getString(request, Constants.TINH_TRANG_PHUONG_TIEN);
	String thongSoKiThuatPhuongTien = ParamUtil.getString(request, Constants.THONGSO_KITHUAT_PHUONGTIEN);

	String kichThuocChung = ParamUtil.getString(request, Constants.KICH_THUOC_CHUNG); 
	String slKhoiLuong = ParamUtil.getString(request, Constants.SL_KHOI_LUONG);
	String slKhoiLuongToanBo = ParamUtil.getString(request, Constants.SL_KHOI_LUONG_TOAN_BO);
	String slKhoiLuongBanThan = ParamUtil.getString(request, Constants.SL_KHOI_LUONG_BAN_THAN);
	 
	String offset = ParamUtil.getString(request, Constants.OFFSET);
	String congThucBanhXe = ParamUtil.getString(request, Constants.CONG_THUC_BANH_XE);
	String klChuyenChoTTK = ParamUtil.getString(request, Constants.SL_KHOI_LUONG_CHUYEN_CHO_TTK);
	String klChuyenChoTGGT = ParamUtil.getString(request, Constants.SL_KHOI_LUONG_CHUYEN_CHO_TGGT);
	String kyHieuDongCo = ParamUtil.getString(request, Constants.KY_HIEU_DONG_CO);
	String loaiDongCo = ParamUtil.getString(request, Constants.LOAI_DONG_CO);
	 
	String tenThuongMai = ParamUtil.getString(request, Constants.TEN_THUONG_MAI);		
	String maKieuLoai = ParamUtil.getString(request, Constants.MA_KIEU_LOAI);
	String nuocSanXuat = ParamUtil.getString(request, Constants.NUOC_SAN_XUAT);
	
	String quanHuyen = ParamUtil.getString(request, Constants.QUAN_HUYEN);
	String tinhThanh = ParamUtil.getString(request, Constants.TINH_THANH);
	String namNhap = ParamUtil.getString(request, Constants.NAM_NHAP);
	
	PortletURL actionUrlTraCuuHoSo = renderResponse.createActionURL();
	actionUrlTraCuuHoSo.setParameter(ActionRequest.ACTION_NAME, "timKiemHoSoVaPhuongTien");
	
	//Tham so nay chi xuat hien khi click su dung chuc nang TopTabs
	actionUrlTraCuuHoSo.setParameter(Constants.CURRENT_TAB, ParamUtil.getString(request, Constants.CURRENT_TAB));
	actionUrlTraCuuHoSo.setParameter(Constants.CURRENT_TAB, Constants.TAB_DS_PHUONGTIEN); 
	

	if ((corporationInspectorOnline != null) && (corporationInspectorOnline.getSearchVehicle() > 0)){
		actionUrlTraCuuHoSo.setParameter(Constants.CURRENT_TAB, Constants.TAB_DS_PHUONGTIEN); }
	else
	{
		actionUrlTraCuuHoSo.setParameter(Constants.CURRENT_TAB, Constants.TAB_THONGTIN_HOSO);
	}
	
	LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==CURRENT_TAB==" + ParamUtil.getString(request, Constants.CURRENT_TAB));
	
	//chi so index cua tung Tab thongtinhoso, dsphuongtein
	String pathTab = ParamUtil.getString(request, "pathTab");
	if (pathTab.contains("search_content_tracuuhoso_thongtinhoso.jsp")) {
		actionUrlTraCuuHoSo.setParameter(Constants.CUR_THONGTIN_HOSO, ParamUtil.getString(request, SearchContainer.DEFAULT_CUR_PARAM));
		actionUrlTraCuuHoSo.setParameter(Constants.CURRENT_TAB, Constants.TAB_THONGTIN_HOSO);
		LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==tracuuhoso_find.jsp__thongtinhoso__==cur==" + ParamUtil.getString(request, SearchContainer.DEFAULT_CUR_PARAM));
		LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==pathTab1==" + pathTab);
	} else if (pathTab.contains("search_content_tracuuhoso_dsphuongtien.jsp")) {
		actionUrlTraCuuHoSo.setParameter(Constants.CUR_DS_PHUONGTIEN, ParamUtil.getString(request, SearchContainer.DEFAULT_CUR_PARAM));
		actionUrlTraCuuHoSo.setParameter(Constants.CURRENT_TAB, Constants.TAB_DS_PHUONGTIEN);
		LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==tracuuhoso_find.jsp__dsphuongtien__==cur==" + ParamUtil.getString(request, SearchContainer.DEFAULT_CUR_PARAM));
		LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==pathTab2==" + pathTab);
	}
	else
	{
		LogFactoryUtil.getLog(TraCuuChungChiAction.class).info("==pathTab123==" + pathTab);
	}
	
	List<DmDataItem> liDmDataItems = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(2, 0);
	
	List<MotCuaTrangThaiHoSo> lstMotCuaTrangThaiHoSo = MotCuaTrangThaiHoSoLocalServiceUtil.getAllTrangThaiHoSoByKieuTrangThai(Constants.TRANG_THAI_TAT_CA);
	if (lstMotCuaTrangThaiHoSo == null) { lstMotCuaTrangThaiHoSo = new ArrayList<MotCuaTrangThaiHoSo>(); }
	
	List<MotCuaTrangThaiHoSo> lstMotCuaTrangThaiXe = MotCuaTrangThaiHoSoLocalServiceUtil.getAllTrangThaiHoSoByKieuTrangThai(Constants.TRANG_THAI_XE);
	if (lstMotCuaTrangThaiXe == null) { lstMotCuaTrangThaiXe = new ArrayList<MotCuaTrangThaiHoSo>(); }
	
	List<DmDataItem> lstDonViKiemTra = DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName(DanhMucKey.CORPORATION, "KIEMTRA");
	if (lstDonViKiemTra == null) { lstDonViKiemTra = new ArrayList<DmDataItem>(); }
	
	List<DmDataItem> lstTinhTrangPhuongTien = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.USAGE);
	if (lstTinhTrangPhuongTien == null) { lstTinhTrangPhuongTien = new ArrayList<DmDataItem>(); }
	
	List<DmDataItem> lstDoiTuong = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevel(2, 0);
	
	List<CorporationInspector> lstDangKiemVienKt = CorporationInspectorLocalServiceUtil.findDanhSachDangKiemVien(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	if (lstDangKiemVienKt == null) {
		lstDangKiemVienKt = new ArrayList<CorporationInspector>();
	}
	
	
	// Ghi actionlog
	String noidungthaotac = "Mở xem Tra cứu hồ sơ trực tuyến thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo Mã số hồ sơ " + soDangKiKiemTra; 
	String tenmanhinhdaidien = "Tra cứu hồ sơ trực tuyến";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, soDangKiKiemTra, soBienBanKiemTra, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>

<script type="text/javascript">
function validatorDieuKienTimKiem() {
	var valid = true;

	
	if (document.getElementById('CentralPanelLine').style.display == "block") {	
		document.getElementById('LeftPanelConditions').style.display = "block";
		document.getElementById('RightPanelConditions').style.display = "block";
		document.getElementById('CentralPanelLine').style.display = "block";
		return valid;	
	} else {
		document.getElementById('LeftPanelConditions').style.display = "none";
		document.getElementById('RightPanelConditions').style.display = "none";
		document.getElementById('CentralPanelLine').style.display = "none";
		return valid;	
	}
	
	return valid;	
}


function validatorThuNhoMoRong(){
	var valid = true;
	if (document.getElementById('CentralPanelLine').style.display == "block") {	
		document.getElementById('LeftPanelConditions').style.display = "none";
		document.getElementById('RightPanelConditions').style.display = "none";
		document.getElementById('CentralPanelLine').style.display = "none";
		document.getElementById('setThuNho').style.display = "none";
		document.getElementById('setMoRong').style.display = "block";
		
		return valid;	
	} else {
		document.getElementById('LeftPanelConditions').style.display = "block";
		document.getElementById('RightPanelConditions').style.display = "block";
		document.getElementById('CentralPanelLine').style.display = "block";	
		document.getElementById('setMoRong').style.display = "none";
		document.getElementById('setThuNho').style.display = "block";
		setOpen = true;	
		return valid;	
	}

	return valid;	
}
</script>
 
<aui:form action="<%=actionUrlTraCuuHoSo.toString()%>" name="myForm" id="myForm" method="POST"> 
<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
		<div tabindex="0" class="CollapsiblePanelTab"">
			<h5 class="tieude">
				<liferay-ui:message key="vn.dtt.chungchu.trucuu.hosotructuyen" />
				<i class="fa-right fa fa-angle-down"></i>
			</h5>
			<h5></h5>
		</div>
		<!------------------Thông tin tìm kiếm hồ sơ bên trái  ---------------->
		<div class="CollapsiblePanelContent" id="LeftPanelConditions_FixTop" style="display: block; width: 48%; float:left; margin-top: 1.5%">
		<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Trạng thái hồ sơ</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<select name="<%=Constants.ID_MOTCUA_TRANGTHAIHOSO%>" id="<%=Constants.ID_MOTCUA_TRANGTHAIHOSO%>" size="1" class="form-control-find">
						<option style="width: 100%" selected value="-1">---- Lựa chọn ------</option>
						<%for (MotCuaTrangThaiHoSo item : lstMotCuaTrangThaiHoSo) {%>
							<option <%=(item.getId() == ConvertUtil.convertToLong(idMotCuaTrangThaiHoSo)) ? "selected" : ""%> value="<%=item.getId()%>"><%=item.getTenTrangThai()%></option>
						<%}%>
					</select>
					<input type="hidden" name="<%=Constants.TRANG_THAI_PHIEU_XU_LY%>" id="<%=Constants.TRANG_THAI_PHIEU_XU_LY%>" value="<%=trangThaiPhieuXuLy%>"/>
					
				</div>
			</div>
			
						<!-- Số hồ sơ -->
		<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;"><liferay-ui:message key="vn.gt.dk.qlhs.sohoso" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
				<div class="row">
				<!----------------- Mã số hồ sơ  ----------------->
					<div class="col-xs-5 col-sm-5 col-md-5" style="width: 51.5% !important" >
					<input type="text" placeholder="Nhập mã số hồ sơ" class="form-control-find" name="<%=Constants.SO_HO_SO %>" id="<%=Constants.SO_HO_SO %>" value="<%=soHoSo%>" />
					</div>
				<!----------------- Số ĐKKT ----------------->
					<div class="col-xs-5 col-sm-5 col-md-5" style="width: 48.5% !important; padding-left: 0%">
					<input type="text" name="<%=Constants.SO_DANGKI_KIEMTRA%>" id="<%=Constants.SO_DANGKI_KIEMTRA%>" value="<%=soDangKiKiemTra%>" placeholder="Nhập số đăng kí kiểm tra" class="form-control-find">
					</div>	
				</div>
				</div>
			</div>
			
			
			<!-- ngày nộp hồ sơ  -->
		<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Ngày nộp hồ sơ</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="col-xs-3 col-sm-3 col-md-15 dateFrom">
						<div class="input-group">
							<input type="text" placeholder="Từ ngày" class="form-control-find-calendar col-calender" style="width: 100%"
								name="ngayNopHsFrom" id="ngayNopHsFrom" value="<%=ngayNopHsFrom%>" onclick="gtCalendar('ngayNopHsFrom')" >
							<span class="input-group-btn">
								<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayNopHsFrom')">
									<i class="fa fa-calendar"></i>
								</button>
							</span>
						</div>
					</div>
					<div class="col-xs-3 col-sm-3 col-md-15 dateTo">
						<div class="input-group">
							<input type="text" placeholder="Đến ngày" class="form-control-find-calendar"
								name="ngayNopHsTo" id="ngayNopHsTo" value="<%=ngayNopHsTo%>" onclick="gtCalendar('ngayNopHsTo')">
							<span class="input-group-btn">
								<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayNopHsTo')">
									<i class="fa fa-calendar"></i>
								</button>
							</span>
						</div>
					</div>
					
				</div>
			</div>
		
		
		</div>
		
		<!-- Duong line doc -->
		<div class="CollapsiblePanelContent" id="CentralPanelLine_FixTop" style="display: block; width: 1%; float:left; margin-top: 1.5%; height:100px; border-right: 1px solid #d8d8d8;"/></div>
		
		<!------------------Thông tin tìm kiếm phương tiện bên phải display: none;  ---------------->
		<div class="CollapsiblePanelContent" id="RightPanelConditions_FixTop" style="display: block; width: 48%; float: left; margin-top: 1.5%; margin-left: 1%;">
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Trạng thái PT</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<select name="trangThaiCuaXe" id="trangThaiCuaXe" size="1" class="form-control-find">
							<option style="width: 100%" selected value="-1">---- Lựa chọn ------</option>
							<%for (MotCuaTrangThaiHoSo item : lstMotCuaTrangThaiXe) {%>
								<option <%=(item.getId() == idMotCuaTrangThaiXe) ? "selected" : ""%> value="<%=item.getId()%>"><%=item.getTenTrangThai()%></option>
							<%}%>
						</select>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Số chứng chỉ</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<input type="text" name="" id="" value="" placeholder="Nhập số chứng chỉ" class="form-control-find">
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Số khung</label>
				</div>				
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<!----------------- so khung ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 42.5%; padding-left: 0%" >
							<div class="input-group" style="width: 100%;">
								<input type="text" name="soKhung" id="soKhung" value="<%=soKhung%>" placeholder="Nhập số khung" class="form-control-find">								
							</div>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%; padding-right: 0%; margin-left: -28px;" >
							<label class="textlabel" style="margin-top: -5px;">Số động cơ</label>
						</div>
						<!----------------- so dong co ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 39%; padding-left: 1%; padding-right: 0%;">
							<div class="input-group" style="width: 100%;">
						<input type="text" name="soDongCo" id="soDongCo" value="<%=soDongCo%>" placeholder="Nhập số động cơ" class="form-control-find">
							</div>
						</div>						
					</div>																		
				</div>
			</div>
			
		</div>
</div>


<!-- <div class="col-xs-10 col-sm-10 col-md-10 row"> -->
<div class="row">
				<label class="textlabel" style="margin-top: -5px;" style="font-weight: bold;font-size: 13px;">Tìm kiếm nâng cao hồ sơ - phương tiện</label>
									
				
</div>
 
<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel9" >
		<!------------------Thông tin tìm kiếm hồ sơ bên trái  ---------------->
		<div class="CollapsiblePanelContent" id="LeftPanelConditions" style="display: none; width: 48%; float:left; margin-top: 1.5%">
			<!--  -->
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Ngày cấp ĐKKT</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					
					<div class="col-xs-3 col-sm-3 col-md-15 dateFrom">
						<div class="input-group">
							<input type="text" placeholder="Từ ngày" class="form-control-find-calendar col-calender" style="width: 100%"
								name="ngayCapDangKiFrom" id="ngayCapDangKiFrom" value="<%=ngayCapDangKiFrom%>" onclick="gtCalendar('ngayCapDangKiFrom')" >
							<span class="input-group-btn">
								<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayCapDangKiFrom')">
									<i class="fa fa-calendar"></i>
								</button>
							</span>
						</div>
					</div>
					<div class="col-xs-3 col-sm-3 col-md-15 dateTo">
						<div class="input-group">
							<input type="text" placeholder="Đến ngày" class="form-control-find-calendar"
								name="ngayCapDangKiTo" id="ngayCapDangKiTo" value="<%=ngayCapDangKiTo%>" onclick="gtCalendar('ngayCapDangKiTo')">
							<span class="input-group-btn">
								<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayCapDangKiTo')">
									<i class="fa fa-calendar"></i>
								</button>
							</span>
						</div>
					</div>
				</div>
			</div>
			
			
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Số biên bản KT</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<input type="text" name="<%=Constants.SO_BIENBAN_KIEMTRA%>" id="<%=Constants.SO_BIENBAN_KIEMTRA%>" value="<%=soBienBanKiemTra%>" placeholder="Nhập số biên bản kiểm tra" class="form-control-find">
				</div>
			</div>
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Ngày kiểm tra</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="col-xs-3 col-sm-3 col-md-15 dateFrom">
						<div class="input-group">
							<input type="text" placeholder="Từ ngày" class="form-control-find-calendar col-calender" style="width: 100%"
								name="ngayKiemTraFrom" id="ngayKiemTraFrom" value="<%=ngayKiemTraFrom%>" onclick="gtCalendar('ngayKiemTraFrom')" >
							<span class="input-group-btn">
								<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayKiemTraFrom')">
									<i class="fa fa-calendar"></i>
								</button>
							</span>
						</div>
					</div>
					<div class="col-xs-3 col-sm-3 col-md-15 dateTo">
						<div class="input-group">
							<input type="text" placeholder="Đến ngày" class="form-control-find-calendar"
								name="ngayKiemTraTo" id="ngayKiemTraTo" value="<%=ngayKiemTraTo%>" onclick="gtCalendar('ngayKiemTraTo')">
							<span class="input-group-btn">
								<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayKiemTraTo')">
									<i class="fa fa-calendar"></i>
								</button>
							</span>
						</div>
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Địa điểm ĐKKT</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<!----------------- tinh thanh ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 51.5% !important" >
							<div class="input-group" style="width: 100%;">
								<select name="<%=Constants.TINH_THANH%>" id="<%=Constants.TINH_THANH%>" size="1" class="form-control-find">
									<option style="width: 100%" <%=tinhThanh.equalsIgnoreCase("") ? "selected" : "" %> value="">Tỉnh/Thành</option>
									<%
									List<DmDataItem> allTinhThanhs = DmDataItemLocalServiceUtil.findByDmDataGroupCodeAndLevel(DanhMucKey.ADMINISTRATIVE_UNITS, 1);
									for (DmDataItem item : allTinhThanhs) {
										%>
										<option <%=item.getCode0().equals(tinhThanh) ? "selected" : ""%> value="<%=item.getCode0()%>"><%=item.getName()%></option>
										<%
									}%>
								</select>
							</div>
						</div>
						
						<!----------------- quan huyen ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 48.5% !important; padding-left: 0%">
							<div class="input-group" style="width: 100%;">
								<select name="<%=Constants.QUAN_HUYEN%>" id="<%=Constants.QUAN_HUYEN%>" size="1" class="form-control-find">
									<option style="width: 100%" <%=quanHuyen.equalsIgnoreCase("") ? "selected" : ""%> value="">Quận/Huyện</option>
									<%
									List<String> allQuanHuyens = new ArrayList<String>();
									for (String name : allQuanHuyens) {
										%>
										<option <%=name.trim().equals(quanHuyen) ? "selected" : ""%> value="<%=name%>"><%=name%></option>
										<%
									}%>
								</select>
							</div>
						</div>
						
					</div>
				</div>
			</div>
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Đơn vị kiểm tra</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<select name="donViKiemTra" id="donViKiemTra" size="1" class="form-control-find">
						<option style="width: 100%" selected value="-1">---- Lựa chọn ------</option>
						<%for (DmDataItem item : lstDonViKiemTra) {%>
							<option <%=item.getCode0().equals(donViKiemTra) ? "selected" : ""%> value="<%=item.getCode0()%>"><%=item.getName()%></option>
						<%}%>
					</select>
				</div>
			</div>
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Đăng kiểm viên</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<select name="dangKiemVienKiemTra" id="dangKiemVienKiemTra" size="1" class="form-control-find">
						<option style="width: 100%" selected value="">---- Lựa chọn ------</option>
						<%for (CorporationInspector item : lstDangKiemVienKt) {
							%>
							<option <%=(item.getInspectorid() == ConvertUtil.convertToLong(dangKiemVienKiemTra)) ? "selected" : ""%> value="<%=item.getInspectorid()%>"><%=item.getInspectorName()%></option>
							<%
							}
						%>
					</select>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Doanh nghiệp</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<input type="text" name="nguoiNhapKhau" id="nguoiNhapKhau" value="<%=nguoiNhapKhau%>" placeholder="Nhập tên doanh nghiệp" class="form-control-find">
				</div>
			</div>
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Số tờ khai HQ</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<!----------------- Số tờ khai HQ ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 42.5%; padding-left: 0%" >
							<div class="input-group" style="width: 100%;">
								<input type="text" name="soToKhaiHaiQuan" id="soToKhaiHaiQuan" value="<%=soToKhaiHaiQuan%>" placeholder="Nhập số tờ khai hải quan" class="form-control-find">								
							</div>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%; padding-right: 0%; margin-left: -28px;" >
							<label class="textlabel" style="margin-top: -5px;">Số hóa đơn</label>
						</div>
					<!----------------- Số hóa đơn ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 39.5%; padding-left: 1%; padding-right: 0%;">
							<div class="input-group" style="width: 100%;">
							<input type="text" name="<%=Constants.SO_INVOICE %>" id="<%=Constants.SO_INVOICE %>" value="<%=soInvoice%>" placeholder="Nhập số hóa đơn" class="form-control-find">
							</div>
						</div>	
				</div>	
			</div>
			
						
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Ngày tờ khai HQ</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="col-xs-3 col-sm-3 col-md-15 dateFrom">
						<div class="input-group">
							<input type="text" placeholder="Từ ngày" class="form-control-find-calendar col-calender" style="width: 100%"
								name="ngayToKhaiHaiQuanFrom" id="ngayToKhaiHaiQuanFrom" value="<%=ngayToKhaiHaiQuanFrom%>" onclick="gtCalendar('ngayToKhaiHaiQuanFrom')" >
							<span class="input-group-btn">
								<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayToKhaiHaiQuanFrom')">
									<i class="fa fa-calendar"></i>
								</button>
							</span>
						</div>
					</div>
					<div class="col-xs-3 col-sm-3 col-md-15 dateTo">
						<div class="input-group">
							<input type="text" placeholder="Đến ngày" class="form-control-find-calendar"
								name="ngayToKhaiHaiQuanTo" id="ngayToKhaiHaiQuanTo" value="<%=ngayToKhaiHaiQuanTo%>" onclick="gtCalendar('ngayToKhaiHaiQuanTo')">
							<span class="input-group-btn">
								<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayToKhaiHaiQuanTo')">
									<i class="fa fa-calendar"></i>
								</button>
							</span>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;"><liferay-ui:message key="vn.gt.dk.qlhs.tenthutuc" /></label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<select name="tenThuTuc" id="tenThuTuc" size="1" class="form-control-find">
						<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
						<% 
							allThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.getTthcThuTucHanhChinhs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
							for (TthcThuTucHanhChinh thuTucHanhChinh : allThuTucHanhChinh) {%>
						<option <%=thuTucHanhChinh.getId() == ConvertUtil.convertToLong(tenThuTuc) ? "selected" : ""%> value="<%=thuTucHanhChinh.getId()%>"><%=thuTucHanhChinh.getTenThuTuc()%></option>
						<%}%>
					</select>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Đối tượng</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<select name="loaiThuTuc" id="loaiThuTuc" size="1" class="form-control-find">
						<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
						<%for (DmDataItem linhVucThuTuc : lstDoiTuong) {
							%>
							<option <%=linhVucThuTuc.getCode0().equals(loaiThuTuc.trim()) ? "selected" : ""%> value="<%=linhVucThuTuc.getCode0()%>"><%=linhVucThuTuc.getName()%></option>
							<%
						}%>
					</select>
				</div>
			</div>
		</div>
		
		<!-- Duong line doc -->
		<div class="CollapsiblePanelContent" id="CentralPanelLine" style="display: none; width: 1%; float:left; margin-top: 1.5%; height:470px; border-right: 1px solid #d8d8d8;"/></div>
		
		<!------------------Thông tin tìm kiếm phương tiện bên phải display: none;  ---------------->
		<div class="CollapsiblePanelContent" id="RightPanelConditions" style="display: none; width: 48%; float: left; margin-top: 1.5%; margin-left: 1%;">
			<!-- title Thong tin phuong tien 
			<div class="row">
				<div class="col-xs-10 col-sm-10 col-md-10">
					<label class="textlabel" style="margin-top: -5px;" style="font-weight: bold;font-size: 13px;">Tra cứu phương tiện</label>
				</div>
			</div>
			-->
			
				
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Tình trạng SD</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<select name="tinhTrangPhuongTien" id="tinhTrangPhuongTien" size="1" class="form-control-find">
							<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
							<%for (DmDataItem item : lstTinhTrangPhuongTien) {%>
								<option <%=(item.getCode0() == tinhTrangPhuongTien) ? "selected" : ""%> value="<%=item.getCode0()%>"><%=item.getName()%></option>
							<%}%>
						</select>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Loại phương tiện</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<select name="" id="" size="1" class="form-control-find">
							<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
							<%for (DmDataItem item : lstTinhTrangPhuongTien) {%>
								<option <%=(item.getCode0() == tinhTrangPhuongTien) ? "selected" : ""%> value="<%=item.getCode0()%>"><%=item.getName()%></option>
							<%}%>
						</select>
					</div>
				</div>
			</div>
						
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Nhãn hiệu</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<select name="" id="" size="1" class="form-control-find">
							<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
							<%for (DmDataItem item : lstTinhTrangPhuongTien) {%>
								<option <%=(item.getCode0() == tinhTrangPhuongTien) ? "selected" : ""%> value="<%=item.getCode0()%>"><%=item.getName()%></option>
							<%}%>
						</select>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Tên thương mại</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<input type="text" name="" id="" value="" placeholder="Nhập tên thương mại" class="form-control-find">
					</div>
				</div>
			</div>
			
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Mã kiểu loại</label>
				</div>				
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<!----------------- Mã kiểu loại ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 42.5% !important; padding-left: 0%" >
							<div class="input-group" style="width: 100%;">
								<input type="text" name="" id="" value="" placeholder="Nhập mã kiểu loại" class="form-control-find">								
							</div>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%; padding-right: 0%; margin-left: -28px;" >
							<label class="textlabel" style="margin-top: -5px;">Màu sơn</label>
						</div>
						<!----------------- Màu sơn ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 38.5% !important; padding-left: 1%; padding-right: 0%;">
							<div class="input-group" style="width: 100%;">
							<input type="text" name="mauSon" id="mauSon" value="<%=mauSon%>" placeholder="Nhập màu sơn" class="form-control-find">
							</div>
						</div>						
					</div>																		
				</div>
			</div>
			
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Nước sản xuất</label>
				</div>				
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<!----------------- Nước sản xuất ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 42.5% !important; padding-left: 0%" >
							<div class="input-group" style="width: 100%;">
								<input type="text" name="" id="" value="" placeholder="Nhập nước sản xuất" class="form-control-find">								
							</div>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%; padding-right: 0%; margin-left: -28px;" >
							<label class="textlabel" style="margin-top: -5px;">Năm sản xuất</label>
						</div>
						<!----------------- Năm sản xuất ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 38.5% !important; padding-left: 1%; padding-right: 0%">
							<div class="input-group" style="width: 100%;">
								<select size="1" class="form-control-find" style="width: 100%"
									name="<%=Constants.NAM_NHAP%>" id="<%=Constants.NAM_NHAP%>">
									<option style="width: 100%" <%=namNhap.equalsIgnoreCase("") ? "selected" : "" %> value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
									<%for (String year : allYears) {%>
										<option <%=year.trim().equals(namNhap) ? "selected" : ""%> value="<%=year%>"><%=year%></option>
									<%}%>
								</select>
							</div>
						</div>						
					</div>																		
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Kích thước chung</label>
				</div>				
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<!----------------- Kích thước chung ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 42.5% !important; padding-left: 0%" >
							<div class="input-group" style="width: 100%;">
								<input type="text" name="kichThuocChung" id="kichThuocChung" value="<%=kichThuocChung%>" placeholder="Nhập kích thước chung" class="form-control-find">								
							</div>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%; padding-right: 0%; margin-left: -28px;" >
							<label class="textlabel" style="margin-top: -5px;">Khối lượng</label>
						</div>
						<!----------------- Khối lượng ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 38.5% !important; padding-left: 1%; padding-right: 0%;">
							<div class="input-group" style="width: 100%;">
						<input type="text" name="slKhoiLuong" id="slKhoiLuong" value="<%=slKhoiLuong%>" placeholder="Nhập khối lượng" class="form-control-find">
							</div>
						</div>						
					</div>																		
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">KL bản thân</label>
				</div>				
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<!----------------- KL bản thân ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 42.5% !important; padding-left: 0%" >
							<div class="input-group" style="width: 100%;">
								<input type="text" name="slKhoiLuongBanThan" id="slKhoiLuongBanThan" value="<%=slKhoiLuongBanThan%>" placeholder="Nhập KL bản thân" class="form-control-find">								
							</div>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%; padding-right: 0%; margin-left: -28px;" >
							<label class="textlabel" style="margin-top: -5px;">KL toàn bộ</label>
						</div>
						<!----------------- KL toàn bộ ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 38.5% !important; padding-left: 1%; padding-right: 0%">
							<div class="input-group" style="width: 100%;">
						<input type="text" name="slKhoiLuongToanBo" id="slKhoiLuongToanBo" value="<%=slKhoiLuongToanBo%>" placeholder="Nhập KL toàn bộ" class="form-control-find">
							</div>
						</div>						
					</div>																		
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">KL ch.chở TTK</label>
				</div>				
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<!----------------- KL chuyên chở TTK ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 42.5% !important; padding-left: 0%" >
							<div class="input-group" style="width: 100%;">
								<input type="text" name="klChuyenChoTTK" id="klChuyenChoTTK" value="<%=klChuyenChoTTK%>" placeholder="Nhập KL hàng ch.chở TTK" class="form-control-find">								
							</div>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%; padding-right: 0%; margin-left: -28px;" >
							<label class="textlabel" style="margin-top: -5px;">KL ch.chở TGGT</label>
						</div>
						<!----------------- KL chuyên chở TGGT ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 38.5% !important; padding-left: 1%; padding-right: 0%">
							<div class="input-group" style="width: 100%;">
						<input type="text" name="klChuyenChoTGGT" id="klChuyenChoTGGT" value="<%=klChuyenChoTGGT%>" placeholder="Nhập KL hàng ch.chở TGGT" class="form-control-find">
							</div>
						</div>						
					</div>																		
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Công thức bánh xe</label>
				</div>				
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<!----------------- Công thức bánh xe ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 42.5% !important; padding-left: 0%" >
							<div class="input-group" style="width: 100%;">
								<input type="text" name="congThucBanhXe" id="congThucBanhXe" value="<%=congThucBanhXe%>" placeholder="Nhập Công thức bánh xe" class="form-control-find">								
							</div>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%; padding-right: 0%; margin-left: -28px;" >
							<label class="textlabel" style="margin-top: -5px;">Offset</label>
						</div>
						<!----------------- offset ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 38.5% !important; padding-left: 1%; padding-right: 0%">
							<div class="input-group" style="width: 100%;">
						<input type="text" name="offset" id="offset" value="<%=offset%>" placeholder="Nhập offset" class="form-control-find">
							</div>
						</div>						
					</div>																		
				</div>
			</div>
			
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Ký hiệu động cơ</label>
				</div>				
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<!----------------- ký hiệu động cơ ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 42.5% !important; padding-left: 0%" >
							<div class="input-group" style="width: 100%;">
								<input type="text" name="kyHieuDongCo" id="kyHieuDongCo" value="<%=kyHieuDongCo%>" placeholder="Nhập ký hiệu động cơ" class="form-control-find">								
							</div>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%; padding-right: 0%; margin-left: -28px;" >
							<label class="textlabel" style="margin-top: -5px;">Loại động cơ</label>
						</div>
						<!----------------- offset ----------------->
						<div class="col-xs-5 col-sm-5 col-md-5" style="width: 38.5% !important; padding-left: 1%; padding-right: 0%">
							<div class="input-group" style="width: 100%;">
						<input type="text" name="loaiDongCo" id="loaiDongCo" value="<%=loaiDongCo%>" placeholder="Nhập loại động cơ" class="form-control-find">
							</div>
						</div>						
					</div>																		
				</div>
			</div>
			
			<!-- tam thoi ko su dung -->
			<!-- 
			<div class="row" hidden="hidden">
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left">
					<label class="textlabel" style="margin-top: -5px;">Thông số kĩ thuật</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
					<div class="row">
						<select size="1" class="form-control-find" style="width: 100%"
							name="thongSoKiThuatPhuongTien" id="thongSoKiThuatPhuongTien" onchange="businessChonThongSoKiThuat()">
								<option style="width: 100%" <=thongSoKiThuatPhuongTien.equalsIgnoreCase("") ? "selected" : "" %> value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
						</select>
					</div>
				</div>
			</div>
			<div class="row" hidden="hidden">
				<div class="box" id="divCfgTechnicalspec">
					<div id="itemBox_" class="divItemBox">
						<input type="text" id="cfgName" name="cfgName" class="form-control-find itemBox1" value="" />
						<input type="text" id="cfgValue" name="cfgValue" class="form-control-find itemBox2" value="">
						<input type="text" id="cfgDieuKien" name="cfgDieuKien" class="form-control-find itemBox3" value="=">
						<img src="/DangKiemApp-portlet/img/s4.png" class="itemBox4" onclick="kiemTraItemBox('itemBox_')">
					</div>
				</div>
			</div>
			-->
		</div>
		
		<!-- button tim kiem -->
		<aui:button-row>
			<div style="margin-left: 400px">
					<button type="button" id="guiYeuCauTimKiem" onclick="if(validatorDieuKienTimKiem()) submit()" class="btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.button.timkiem" /></button>
					<button type="button" style="display: none;" class="btnThuLyHS form-control">Tìm kiếm nâng cao</button>
					
					<button type="button" id ="setMoRong" onclick="validatorThuNhoMoRong()" class="btnThuLyHS form-control"><i class="fa-left fa fa-angle-down"></i>  Mở rộng</button>
					<button type="button" style="display: none;"  id ="setThuNho" onclick="validatorThuNhoMoRong()" class="btnThuLyHS form-control"><i class="fa-left fa fa-angle-up"></i>  Thu gọn</button>					
					
			</div>
		</aui:button-row>
</div>

</aui:form>

<!------------------------------ dialog hien thi phuong tien ki thuat thuoc danh muc ------------------------------>
<div id="dialogChonDanhMucThongSoKt" class="dialogThongSoKiThuat" style="display: none; min-height: 200px !important;">
	<div class="CollapsiblePanelContent" style="display: block; width: 99%; float: left; margin-top: 1.5%;">
		<div class="row" id="rowTitleThongSoKt">
			<div class="col-xs-10 col-sm-10 col-md-10 col-md-right">
				<label class="textlabel bold" id="nameThongSoKiThuat">Thông số kĩ thuật</label>
			</div>
		</div>
		
		<div class="row" id="rowDieuKienTimKiem">
			<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="width: 30% !important;">
				<label class="textlabel" style="margin-top: -5px;">Điều kiện tìm kiếm</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10 col-md-right" style="width: 68% !important;">
				<div class="row">
					<select size="1" class="form-control-find" style="width: 21%; float: left;"
						name="dieuKienTimKiem" id="dieuKienTimKiem" onchange="">
						<option id="=">=</option>
						<option id="like">like</option>
					</select>
					<input type="text" id="giaTriTimKiem" name="giaTriTimKiem" style="width: 79%" class="form-control-find itemBox2" value="">
				</div>
			</div>
		</div>
		
		<div class="row" id="rowDanhSach">
			<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="width: 30% !important;">
				<label class="textlabel" style="margin-top: -5px;">Danh Sách</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10 col-md-right" style="width: 68% !important;">
				<div class="row">
					<select size="1" class="form-control-find" style="width: 100%"
						name="danhSachThongSoKiThuat" id="danhSachThongSoKiThuat" onchange="">
					</select>
				</div>
			</div>
		</div>
		
		<div class="row" id="rowMessage">
			<div class="col-xs-10 col-sm-10 col-md-10 col-md-right" style="width: 68% !important;">
				<label class="textlabel" style="margin-top: -5px;" id="nameRowMessage"></label>
			</div>
		</div>
		
		<input type="hidden" id="thuocDanhMuc" name="thuocDanhMuc" value="">
		
		<aui:button-row>
			<button type="button" class="fa-right bt btxanhduong btn btn-default" style="float: left; margin-right: 1%" id="btnXacNhanThongTin" name="btnXacNhanThongTin" onclick="xacNhanChonThongSoKiThuat()">Xác nhận</button>
			<button type="button" class="fa-right bt btxanhduong btn btn-default" style="float: left;" onclick="closeDialog()">Hủy</button>
		</aui:button-row>
	</div>
</div>


<portlet:resourceURL var="updateHoSoURL" >
</portlet:resourceURL>


<script>




function callAjaxThongSoKiThuatDanhMuc(dataGroupId, alterName) {
	$.ajax({
		url: '<%=updateHoSoURL%>',
		dataType: "json",
		data: { 
			dataGroupId : dataGroupId,
			alterName : alterName,
			type : 'findThongSoKiThuatDanhMucByDataGroupId'
		},
		
		type: "get",
		success : function (data) {
			console.log("=(2)==success==");
			//console.log(data);
			//preferred
			//var data2 = JSON.parse(data);
			var lstData = JSON.parse(JSON.stringify(data));
			if (lstData.length === 0) {
				$('#nameRowMessage').text('Không tồn tại dữ liệu trong danh mục');
				
				var selectDieuKiem = $('#dieuKienTimKiem');
				selectDieuKiem.find('option').remove();
				//<option id="like">like</option>
				$('<option>').val("=").text("=").appendTo(selectDieuKiem);
				$('<option>').val("like").text("like").appendTo(selectDieuKiem);

				$('#giaTriTimKiem').val('');
				$('#giaTriTimKiem').show();
				
				
				var select = $('#danhSachThongSoKiThuat');
				select.find('option').remove();
				
			} else {
				$('#nameRowMessage').text('');
				var select = $('#danhSachThongSoKiThuat');
				select.find('option').remove();
				
				//$('#divCfgTechnicalspec').remove();
				//$('<option>').val("").text("---- Lựa chọn ------").appendTo(select);
				$.each(data, function(idx, obj) {
					$('<option>').val(obj.code).text(obj.name).appendTo(select);
				});
			}
		}, beforeSend: function() {
			console.log("=(1)==beforeSend==");
			//$("#wait").css("display","block");
		}, complete: function() {
			console.log("=(3)==complete==");
		}, error: function() {
			console.log("=(2)==error==");
		}
	});
}



$(document).ready(function() {
	$('#loaiThuTuc').change(function(event) {
		var code = $("select#loaiThuTuc").val();
		if (code === '') {
			return;
		}
		//$.ajax({
		//	url: '<=updateHoSoURL%>',
		//	dataType: "json",
		//	data: { 
		//		codeLoaiThuTuc : code,
		//		type : 'findCfgTechnicalspecByVehicleTypeCode'
		//	},
		//	
		//	type: "get",
		//	success : function (data) {
		//		console.log("=(2)==success==");
				//console.log(data);
				//preferred
				//var data2 = JSON.parse(data);
				//var lstData = JSON.parse(JSON.stringify(data));

				//if (lstData.length === 0) {
				//	$('#nameRowMessage').text('Không tồn tại dữ liệu trong Danh mục');
				//} else {
					//$('#nameRowMessage').text('');
		//			var select = $('#thongSoKiThuatPhuongTien');
		//			select.find('option').remove();
					
					//$('#divCfgTechnicalspec').remove();
		//			$('<option>').val("").text("---- Lựa chọn ------").appendTo(select);
		//			$.each(data, function(idx, obj) {
		//				if (obj.dataGroupId.length === 0) {
		//					$('<option>').val(obj.id).text(obj.specDescription).appendTo(select);
		//				} else {
		//					$('<option>').val(obj.id).text(obj.specDescription + ' (DM)').appendTo(select);
		//				}
		//			});
		//		//}
				
				
		//	}, beforeSend: function() {
		//		console.log("=(1)==beforeSend==");
				//$("#wait").css("display","block");
		//	}, complete: function() {
		//		console.log("=(3)==complete==");
		//	}, error: function() {
		//		console.log("=(2)==error==");
		//	}
		//});
	});
});


$(document).ready(function() {
	$('#donViKiemTra').change(function(event) {
		var code = $("select#donViKiemTra").val();
		if (code == "") {
			//var select = $('#dangKiemVienKiemTra');
			//select.find('option').remove();
			//$('<option>').val("").text("---- Lựa chọn ------").appendTo(select);
			return;
		}
		$.ajax({
			url: '<%=updateHoSoURL%>',
			dataType: "json",
			data: { 
				codeDonViKiemTra : code,
				type : 'getDangKiemVienKiemTra'
			},
			type: "get",
			success : function (data) {
				console.log(data);
				//preferred
				//var data2 = JSON.parse(data);
				
				var select = $('#dangKiemVienKiemTra');
				select.find('option').remove();
				$('<option>').val("").text("---- Lựa chọn ------").appendTo(select);
				$.each(data, function(idx, obj) {
					console.log(obj);
					$('<option>').val(obj.id).text(obj.name).appendTo(select);
				});
			}, beforeSend: function() {
				console.log("===beforeSend==");
				//$("#wait").css("display","block");
			}, complete: function() {
				console.log("===complete==");
			}, error: function() {
				console.log("===error==");
			}
		});
	});
});


$(document).ready(function() {
	$('#tinh_thanh').change(function(event) {
		
		var code = $("select#tinh_thanh").val();
		if (code == ""){
			var select = $('#quan_huyen');
			select.find('option').remove();
			$('<option>').val("").text("---- Lựa chọn ------").appendTo(select);
			return;
		}
		$.ajax({
			type : 'POST',
			url: '<%=updateHoSoURL%>',
			data : {
				type: 'findQuanHuyenTinhThanh',
				portRegionRef : code
			},
			success : function(data) {
				//preferred
				var data2 = JSON.parse(data);
				
				//console.log(data2);
				//xoa du lieu cu trong khu vuc cang
				var select = $('#quan_huyen');
				select.find('option').remove();
				
				$('<option>').val("").text("---- Lựa chọn ------").appendTo(select);
				for ( var i = 0; i < data2.id.length; i++) {
					$('<option>').val(data2.id[i]).text(data2.name[i]).appendTo(select);
				};
			}
		});
	});
});

$(document).ready(function() {
	$('#id_motcua_trangthaihoso').change(function(event) {
		
		var code = $("select#id_motcua_trangthaihoso").val();
		if (code == "-1"){
			document.getElementById('TRANG_THAI_PHIEU_XU_LY').value = '';
			return;
		}
		$.ajax({
			type : 'POST',
			url: '<%=updateHoSoURL%>',
			data : {
				type: 'findTrangThaiPhieuXuLy',
				idMotCuaTrangThai : code
			},
			success : function(data) {
				//preferred
				var data2 = JSON.parse(data);
				
				//console.log(data2);
				document.getElementById('TRANG_THAI_PHIEU_XU_LY').value = data2.trangThai;		
				
			}
		});
	});
});
</script>


