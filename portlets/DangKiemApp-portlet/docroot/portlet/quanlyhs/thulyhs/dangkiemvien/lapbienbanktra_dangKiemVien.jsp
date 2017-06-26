<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.HttpUtil"%>
<%@page import="com.liferay.portal.kernel.servlet.ServletContextUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach"%>
<%@page import="java.util.UUID"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial"%>
<%@page import="vn.dtt.gt.dk.portlet.business.LapBanDangKyBusiness"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@page import="vn.dtt.gt.dk.portlet.business.LanhDaoPhongBusiness"%>
<%@page import="vn.dtt.gt.dk.portlet.business.BienBanKiemTraBusiness"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoAction"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/dangkiemvien/initDangKiemVien.jsp"%>
<% long javaScriptLastModified = ServletContextUtil.getLastModified(application, "/js/", true); %>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href='<%= PortalUtil.getStaticResourceURL(request, request.getContextPath() + "/css/dangkiemvien-duocPhanCong.css") %>'>
<link rel="stylesheet" type="text/css" href='<%= PortalUtil.getStaticResourceURL(request, request.getContextPath() + "/css/bienbanktra_dangKiemVien.css") %>'>
<script type="text/javascript" src='<%= PortalUtil.getStaticResourceURL(request, request.getContextPath() + "/js/lapbienbankiemtra.js", javaScriptLastModified) %>'></script>
<script type="text/javascript" src='<%= PortalUtil.getStaticResourceURL(request, request.getContextPath() + "/js/lapbienbanktra_dangKiemVien.js", javaScriptLastModified) %>'></script>

<%! private static Log _log = LogFactoryUtil.getLog("portlet_quanlyhs_thulyhs_dangkiemvien_lapbienbanktra_dangKiemVien_jsp"); %>

<%
final String parttern = "#index#"; 
String wildcard = parttern;

//count
int countOther = 0;
int countThongTinKhac=0;
int demSoThongTinKhac = 1;

	_log.info("==start=");
	
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	long idVehicleGroup = ParamUtil.getLong(request, Constants.ID_VEHICLE_GROUP);
	long idPhieuXyLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
	long confirmedInspectionId = ParamUtil.getLong(request, Constants.ID_CONFIRMED_INSPECTION);
	
	String danhSachVehicleRecord = GetterUtil.getString(request.getAttribute("danhSachVehicleRecord"));//ParamUtil.getString(request, "danhSachVehicleRecord");

	_log.info("==confirmedInspectionId==Truyen sang==" + confirmedInspectionId);
	_log.info("==idVehicleGroup==" + idVehicleGroup+"=====danhSachVehicleRecord=="+danhSachVehicleRecord);
	
	ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXyLyPhu);
	if (confirmedInspection == null) { confirmedInspection = new ConfirmedInspectionImpl(); }
	
	_log.info("==confirmedInspectionId==Lay trong DB==" + confirmedInspection.getId());
	confirmedInspectionId = confirmedInspection.getId();
	
	//RegisteredInsepction lay theo ConfirmedInspection.registeredinspectionid hoac theo idHoSoThuTuc
	RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(ConvertUtil.convertToLong(idHoSoThuTuc));
	if (registeredInspection == null) {
		registeredInspection = new RegisteredInspectionImpl();
	}
	
	TaoCauTrucSoDkAcBB taoCauTrucSoDangKi = new TaoCauTrucSoDkAcBB();
	long userId = themeDisplay.getUserId();
	
	_log.info("==userId==" + userId);
	
	String dangKiemVienChinh = "";
	String dangKiemVienPhu = "";
	CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
	
	String maNhanVien = (corporationInspector != null) ? corporationInspector.getContactcode() : "";
	
	
	///////// Danh sach Dang Kiem Vien
	List<CorporationAttendee> listDKVChinhs = CorporationAttendeeLocalServiceUtil.findByConfirmedInspectionIdAndInspectorRole(confirmedInspectionId, 1);
	if (listDKVChinhs != null && listDKVChinhs.size() > 0) {
		dangKiemVienChinh = listDKVChinhs.get(0).getInspectorName();
	}
	List<CorporationAttendee> listDKVPhoiHops = CorporationAttendeeLocalServiceUtil.findByConfirmedInspectionIdAndInspectorRole(confirmedInspectionId, 2);
	if (listDKVPhoiHops != null && listDKVPhoiHops.size() > 0) {
		for (CorporationAttendee item : listDKVPhoiHops) {
			dangKiemVienPhu = dangKiemVienPhu + item.getInspectorName() + "; ";
		}
	}
	
	VehicleGroupInitial vehicleGroup = new VehicleGroupInitialImpl();
	try {
		vehicleGroup = VehicleGroupInitialLocalServiceUtil.fetchVehicleGroupInitial(idVehicleGroup);
	} catch (Exception e) {
	}
	if (Validator.isNull(vehicleGroup)) { vehicleGroup = new VehicleGroupInitialImpl(); }
	
	long vehicleGroupId = vehicleGroup.getId();
	String vehicleClass = vehicleGroup.getVehicleClass();
	String vehicleType = vehicleGroup.getVehicleType();
	
	_log.info("==vehicleGroupId==" + vehicleGroupId);
	_log.info("==vehicleClass==" + vehicleClass);
	_log.info("==vehicleType==" + vehicleType);
	
	CustomsDeclaration customsDeclaration = null;
	try {
		if (confirmedInspection.getCustomsDeclarationId() > 0){
			customsDeclaration = CustomsDeclarationLocalServiceUtil.getCustomsDeclaration(confirmedInspection.getCustomsDeclarationId());	
		}		
	} catch (Exception e) {
		customsDeclaration = null;
	}
	
	List<DmDataItem> lstLuaChonKetQua = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.EVALUATION_RESULT);
	List<DmDataItem> lstTinhTrangPhuongTien = DmDataItemLocalServiceUtil.findByDataGroupId(ReportConstant.USAGE);
	if (lstTinhTrangPhuongTien == null) {
		lstTinhTrangPhuongTien = new ArrayList<DmDataItem>();
	}
	if (lstLuaChonKetQua == null) {
		lstLuaChonKetQua = new ArrayList<DmDataItem>();
	}
%>

<!-- START - man hinh duoc phan cong -->




<!-- -----LAP BIEN BAN KIEM TRA ----->
<%
PortletURL urlDuocPhanCongDangKiemVien = renderResponse.createActionURL();
urlDuocPhanCongDangKiemVien.setParameter(ActionRequest.ACTION_NAME, "lapBienBanKiemTra");
urlDuocPhanCongDangKiemVien.setParameter(Constants.BUTTON_TYPE, Constants.LAP_BIEN_BAN_KIEM_TRA);
urlDuocPhanCongDangKiemVien.setParameter("formDate", UUID.randomUUID().toString());
urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(idHoSoThuTuc));
urlDuocPhanCongDangKiemVien.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID ,StringUtil.valueOf(idthuTucHanhChinh));
urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(idPhieuXyLyPhu));
urlDuocPhanCongDangKiemVien.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_CONFIRMED_INSPECTION, StringUtil.valueOf(confirmedInspectionId));
urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_VEHICLE_GROUP, StringUtil.valueOf(idVehicleGroup));

PortletURL urlBienBanLuuTam = renderResponse.createActionURL();
urlBienBanLuuTam.setParameter(ActionRequest.ACTION_NAME, "lapBienBanKiemTra");
urlBienBanLuuTam.setParameter(Constants.BUTTON_TYPE, Constants.BIEN_BAN_LUU_TAM);
urlBienBanLuuTam.setParameter("formDate", UUID.randomUUID().toString());
urlBienBanLuuTam.setParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(idHoSoThuTuc));
urlBienBanLuuTam.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID ,StringUtil.valueOf(idthuTucHanhChinh));
urlBienBanLuuTam.setParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(idPhieuXyLyPhu));
urlBienBanLuuTam.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
urlBienBanLuuTam.setParameter(Constants.ID_CONFIRMED_INSPECTION, StringUtil.valueOf(confirmedInspectionId));
urlBienBanLuuTam.setParameter(Constants.ID_VEHICLE_GROUP, StringUtil.valueOf(idVehicleGroup));

String soThamChieu = "";
%>
<div id="cot2" class="col-xs-12 col-sm-12 col-md-12"> <div id="main" class="col-md-12"> 

<div id="divLapBienBanKiemTra">
<aui:form action="<%=urlDuocPhanCongDangKiemVien.toString()%>" name="formDuocPhanCongDangKiemVien" id="formDuocPhanCongDangKiemVien" method="POST" enctype="multipart/form-data">

	<!-- dung js set o? dong 25 - 35 -->
	<input type="text" hidden="true" id="lap_bien_ban_kt_id_vehicle_group" name="lap_bien_ban_kt_id_vehicle_group" value=""/>
	
<div style="width: 30px">&nbsp</div>
<div class="container" style="width: 100%; margin: 0px; padding: 0px;">
	<ul class="tabs">
		<li class="tab-link current" data-tab="tab-1">Thông tin chung</li>
		<li class="tab-link" data-tab="tab-2">Kiểm tra Chất lượng an toàn KTVBVMT</li>
	</ul>
	
	<!--------- START Tab1 -------------->
	<div id="tab-1" class="tab-content current">
		<!-- ------------------------------ Thong tin chung ------------------------------ -->
		<div id="u6148" style="position: absolute; left: 0px; width: 100%; padding-left: 1.4%;padding-top: 0%;">
			<img alt="" src="<%=request.getContextPath()%>/img/under_line_image.png" class="" style="position: relative;left: 0px;top: -8px;width: 99%;height: 5px;">
		</div>
		<div style="width: 10px">&nbsp</div>
		
		
		<!------------------ Noi dung kiem tra ------------------>
		<div id="divNoiDungKiemTra">
			<%
			DmDataItem doiKiemTra =  DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.CORPORATION, confirmedInspection.getCorporationId());
			if (vehicleGroup != null && vehicleClass.equalsIgnoreCase("XMY")) {
				%>
				<div id="divTitleBienBanKiemTra" class="titleNoiDung">Biên Bản Kiểm Tra Xe Mô Tô – Xe Gắn Máy Nhập Khẩu</div>
				<%
			} else if(vehicleGroup != null && vehicleClass.equalsIgnoreCase("DCX")) {
				%>
				<div id="divTitleBienBanKiemTra" class="titleNoiDung">Biên Bản Kiểm Tra Động Cơ Xe Mô Tô – Xe Gắn Máy Nhập Khẩu
				<%
			} else if(vehicleGroup != null && vehicleClass.equalsIgnoreCase("XDD")) {
				%>
				<div id="divTitleBienBanKiemTra" class="titleNoiDung">Biên Bản Kiểm Tra Xe Đạp Điện Nhập Khẩu</div>
				<%
			} else if(vehicleGroup != null && vehicleClass.equalsIgnoreCase("XCG")) {
				%>
				<div id="divTitleBienBanKiemTra" class="titleNoiDung">Biên Bản Kiểm Tra Xe Cơ Giới Nhập Khẩu</div>
				<%
			} else if(vehicleGroup != null && vehicleClass.equalsIgnoreCase("XCD")) {
				%>
				<div id="divTitleBienBanKiemTra" class="titleNoiDung">Biên Bản Kiểm Tra Xe Máy Chuyên Dùng Nhập Khẩu</div>
				<%
			} else if(vehicleGroup != null && vehicleClass.equalsIgnoreCase("XBB")) {
				%>
				<div id="divTitleBienBanKiemTra" class="titleNoiDung">Biên Bản Kiểm Tra Xe Chở Người Bốn Bánh Có Gắn Động Cơ Nhập Khẩu</div>
				<%
			}
			%>
			<div id="divTitleDoiKiemTra" style="float: left;text-align: center;padding: 1% 1% 1% 0;width: 100%;font-size: 14px;">
				Đội Kiểm Tra Khu Vực : <%=(doiKiemTra != null) ? doiKiemTra.getName() : ""%>
				<input type="hidden" class="form-control-find width100" id="tenDoiKiemTra"  name="tenDoiKiemTra" value="<%=doiKiemTra.getName()%>" />						
			</div>
			
			
			<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
				
				<!------------------ Dang kiem vien chinh  ------------------>
				<div class="row">
					<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
						<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.dangkiemvienchinh"/></label>
					</div>
					<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
						<input type="text" id="dkvChinh" name="dkvChinh" class="form-control-find" placeholder="Đăng kiểm viên chính" readonly="readonly" style="width: 100%; background-color: white;"
							value="<%=dangKiemVienChinh%>"/>
					</div> 
				</div>
				
				<!------------------ Dang kiem vien phoi hop ------------------>
				<%
					List<CorporationAttendee> corporationAttendee = CorporationAttendeeLocalServiceUtil.findByConfirmedInspectionIdAndInspectorRole(confirmedInspectionId, 2);
				%>
				<div class="row">
					<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
						<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.dangkiemvienhotro"/></label>
					</div>
					<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
						<input type="text" id="dkvPhoiHop" name="dkvPhoiHop" style="width: 100%; background-color: white;" class="form-control-find" 
							value="<%=dangKiemVienPhu%>" placeholder="Đăng kiểm viên phối hợp" readonly="readonly"/>
					</div> 
				</div>
				
				<!------------------  so bien ban kiem tra ------------------>
				<div class="row">
					<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
						<label class="textlabel">Số biên bản kiểm tra</label>
					</div>
					<div class="col-xs-10 col-sm-10 col-md-10" style="width: 35%;">
						<input type="text" class="form-control-find" placeholder="Số biên bản kiểm tra" style="width: 71.6%; background-color: white;" readonly="readonly"
							id="soBienBanKiemTra" name="soBienBanKiemTra" value="<%=taoCauTrucSoDangKi.quyDinhSoBienBanKiemTraKhiChuaLapBBKT(registeredInspection.getRegisteredNumber(), maNhanVien)%>"/>
					</div>
				</div>
				
				<!------------------ Ngay phan cong kiem tra  ------------------>
				<div class="row">
					<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
						<label class="textlabel">Ngày phân công kiểm tra</label>
					</div>
					
					<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
						<!-- Ngay phan cong kiem tra tu ngay -->
						<div style="float: left; text-align: left; width: 49%; padding: 1% 1% 1% 0;">
							<label class="textlabel" style="float: left; margin-right: 5.2%"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.tungay"/></label>
							<%
							String ngayPhanCongKtTuNgay = "";
							if (confirmedInspection.getDateFrom() != null) {
								ngayPhanCongKtTuNgay = confirmedInspection.getDateFrom().after(new Date()) ? DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) : DateUtils.dateToString("dd/MM/yyyy HH:mm", confirmedInspection.getDateFrom());
							} else {
								ngayPhanCongKtTuNgay = DateUtils.dateToString("dd/MM/yyyy HH:mm",confirmedInspection.getDateFrom());
							}
							%>
							<input type="text" style="width: 150px; float: left; background-color: white;" class="form-control-find-calendar" readonly="readonly"
								id="" name="" value="<%=ngayPhanCongKtTuNgay%>" onclick=""/>
							<span class="input-group-btn" style="float: left;">
								<button class="btn_calendar btn-default " type="button"><i class="fa fa-calendar"></i></button>
							</span>
						</div>
						
						<!-- Ngay phan cong kiem tra den ngay -->
						<div style="float: left; text-align: left; width: 49%; padding: 1% 1% 1% 0;">
							<label class="textlabel" style="float: left; margin-right: 5.2%"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.denngay"/></label>
							<%
							String ngayPhanCongKtDenNgay = "";
							if (confirmedInspection.getDateTo() != null) {
								ngayPhanCongKtDenNgay = confirmedInspection.getDateTo().after(new Date()) ? DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) : DateUtils.dateToString("dd/MM/yyyy HH:mm", confirmedInspection.getDateTo());
							} else {
								ngayPhanCongKtDenNgay = DateUtils.dateToString("dd/MM/yyyy HH:mm", confirmedInspection.getDateTo());
							}
							%>
							<input type="text" style="width: 150px; float: left; background-color: white;" class="form-control-find-calendar" readonly="readonly"
								id="" name="" value="<%=ngayPhanCongKtDenNgay%>" onclick="" />
							<span class="input-group-btn" style="float: left;">
								<button class="btn_calendar btn-default " type="button" onclick=""><i class="fa fa-calendar"></i></button>
							</span>
						</div>
					</div>
					
					
				</div>
				
				<!-- ngay kiem tra thuc te -->
				<div class="row">
					<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
						<label class="textlabel">Ngày kiểm tra thực tế</label>
					</div>
					<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
						<!-- ngay ktra thuc te tu ngay -->
						<div style="float: left; text-align: left; width: 49%; padding: 1% 1% 1% 0;">
							<label class="textlabel" style="float: left; margin-right: 2px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.tungay"/>&nbsp<span style="color: red;">(*)</span></label>
							<input type="text" style="width: 150px; float: left; background-color: white; cursor: pointer;" class="form-control-find-calendar" readonly="readonly"
								id="ngayKiemTraTuNgay" name="ngayKiemTraTuNgay" value="" onclick="gtCalendar('ngayKiemTraTuNgay')"/>
							<span class="input-group-btn" style="float: left;">
								<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayKiemTraTuNgay')"><i class="fa fa-calendar"></i></button>
							</span>
						</div>
						
						<!-- ngay ktra thuc te den ngay -->
						<div style="float: left; text-align: left; width: 49%; padding: 1% 1% 1% 0;">
							<label class="textlabel" style="float: left; margin-right: 2px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.denngay"/>&nbsp<span style="color: red;">(*)</span></label>
							<input type="text" style="width: 150px; float: left; background-color: white; cursor: pointer;" class="form-control-find-calendar" readonly="readonly"
								id="ngayKiemTraDenNgay" name="ngayKiemTraDenNgay" value="" onclick="gtCalendar('ngayKiemTraDenNgay')" />
							<span class="input-group-btn" style="float: left;">
								<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayKiemTraDenNgay')"><i class="fa fa-calendar"></i></button>
							</span>
						</div>
					</div>
				</div>
				
				<!------------------ Dia diem kiem tra ------------------>
				<%
					DmDataItem dataItemDistrictCode = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.ADMINISTRATIVE_UNITS, confirmedInspection.getInspectionDistrictCode());
					DmDataItem dataItemProvinceCode = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.ADMINISTRATIVE_UNITS, confirmedInspection.getInspectionProvincecode());
					String nameDataItemDistrictCode = "";
					if (dataItemDistrictCode != null) {
						nameDataItemDistrictCode = dataItemDistrictCode.getName();
					}
					
					if (dataItemProvinceCode != null) {
						nameDataItemDistrictCode = (nameDataItemDistrictCode.length() > 0) ? (nameDataItemDistrictCode + ", " + dataItemProvinceCode.getName()) : dataItemProvinceCode.getName();
					}
				%>
				<div class="row">
					<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
						<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.diadiemkiemtra"/></label>
					</div>
					<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
						<input type="text" class="form-control-find" style="width: 100%; background-color: white;" readonly="readonly"
							id="inspectionSite" name="inspectionSite" value="<%=(confirmedInspection.getInspectionSite() == null) ? "" : confirmedInspection.getInspectionSite()%>"/>
					</div> 
				</div>
				<div class="row">
					<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
						<label class="textlabel">&nbsp</label>
					</div>
					<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
					<input type="hidden" class="form-control-find" style="width: 100%; background-color: white;" readonly="readonly"
							id="provinceName" name="provinceName" value="<%=Validator.isNotNull(dataItemProvinceCode) ? dataItemProvinceCode.getName() : ""%>"/>
						<input type="text" class="form-control-find" style="width: 100%; background-color: white;" readonly="readonly"
							id="districtCodAndProvinceCode" name="districtCodAndProvinceCode" value="<%=nameDataItemDistrictCode%>"/>
					</div> 
				</div>
				
				<!------------------ phuong thuc kiem tra ------------------>
				<div class="row">
					<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
						<label class="textlabel">Phương thức kiểm tra <span style="color: red;">(*)</span></label>
					</div>
					<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
						<select id="chonPhuongThucKT" name="chonPhuongThucKT" class="form-control-find" style="width: 100%">
						<%
							//Gia tri DataItem InspectionMode
							List<DmDataItem> lstPhuongThucKiemTra = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.INSPECTION_MODE);
							if (lstPhuongThucKiemTra == null) { lstPhuongThucKiemTra = new ArrayList<DmDataItem>(); }
						%>
							<option value="-1">---------- Chọn phương thức kiểm tra ----------</option>
							<%for (DmDataItem item : lstPhuongThucKiemTra) {%>
								<option value="<%=item.getCode0()%>"><%=item.getName() %></option>
							<%}%>
						</select>
					</div> 
				</div>
				
			</div>
		</div>
		
		
		<!----------------------------- I, THONG TIN CHUNG ----------------------------->
		
		<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 100%;"><span style="font-weight: bold;">I. Thông tin chung :</span></div>
		<div style = "width:0%">&nbsp</div>
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
		
			<%
			//inspectionrecordid = -1, default gia tri ban dau
			List<InspectionCommonStatus> lstThongTinChung = InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleClass, 1, -1);
			
			int stt = 0;
			%>
		
			<table style="width: 100%;" id="tblThongTinChungRegisteredInspection" class="wd-table table">
				<thead>
					<tr>
						<th class="text-center bold" style="font-size: 13px;height: 40px;background-color: #f4f4f4;font-weight: bold;text-align: center;;width: 6%;">TT</th>
						<th class="text-center bold" style="font-size: 13px;background-color: #f4f4f4;font-weight: bold;text-align: center;;width: 22%;">Nội dung</th>
						<th class="text-center bold" style="font-size: 13px;background-color: #f4f4f4;font-weight: bold;text-align: center;;width: 28%;">Thông tin khai báo/đề nghị/tham chiếu</th>
						<th class="text-center bold" style="font-size: 13px;background-color: #f4f4f4;font-weight: bold;text-align: center;;width: 28%;">Thông tin bổ sung sửa đổi</th>
						<th class="text-center bold" style="font-size: 13px;background-color: #f4f4f4;font-weight: bold;text-align: center;">Kết luận</th>
					</tr>
				</thead>
				<tbody>
				<%
				if (lstThongTinChung != null && lstThongTinChung.size() > 0) {
					for (InspectionCommonStatus itemTTC : lstThongTinChung) {
						stt++;
						String giaTriKhaiBao = BienBanKiemTraBusiness.getValueThongTinChung(vehicleGroup, registeredInspection, customsDeclaration, itemTTC.getCommonCode());
						String giaTriCode = BienBanKiemTraBusiness.getCodeThongTinChung(vehicleGroup, registeredInspection, customsDeclaration, itemTTC.getCommonCode());
						
						if(itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_06")) {
							soThamChieu = giaTriKhaiBao;
						}
				%>
					<tr id="trtblThongTinChung<%=stt%>">
						<td class="text-center" style="height: 30px;"><span>1.<%=stt %></span></td>
						<td class="text-left paddingLeft05"><span><%=itemTTC.getGroupName() %></span></td>
						
						<td class="text-left paddingLeft05">
							<div id="div_view_<%=itemTTC.getCommonCode()%>" style="text-align:center;"></div>
							<input type="text" class="textNone textBound" readonly="readonly" id="giaTriDangKiTTC<%=stt%>" name="<%=itemTTC.getCommonCode()%>" value="<%=giaTriKhaiBao%>"/>
							<input type="hidden" id="giaTriDangKyCodeTTC<%=stt%>" value="<%=giaTriCode%>" />
						</td>
						
						<td class="text-left paddingLeft05">
						<div id="div_view_giaTriKiemTraTTC<%=itemTTC.getCommonCode()%>" style="text-align:center;"></div>
							<input type="text" class="textNone textBound" readonly="readonly"
									id="giaTriKiemTraTTC<%=itemTTC.getCommonCode()%>"
									name="giaTriKiemTraTTC<%=itemTTC.getCommonCode()%>" value="<%=giaTriKhaiBao%>"/>
								
							
							<input type="hidden" class="form-control-find width100" id="commonCode<%=stt%>" value="<%=itemTTC.getCommonCode() %>" />
							<input type="hidden" class="form-control-find width100" id="giaTriDmTTC<%=stt%>" value="<%=BienBanKiemTraBusiness.isDanhMuc(itemTTC.getCommonCode())%>" />
							<input type="hidden" class="form-control-find width100" id="giaTriCodeTTC<%=stt%>" value="<%=giaTriCode%>" />
							<input type="hidden" class="form-control-find width100" id="giaTriCodeTTC_SuaDoi<%=itemTTC.getCommonCode()%>"  name="giaTriCodeTTC_SuaDoi<%=itemTTC.getCommonCode()%>" value="<%=giaTriCode%>" />
							
						</td>
						
						<td class="text-left paddingLeft05">
							<%
								if (itemTTC.getAllowEdit() == 1) {
								
									String classThamChieuAct = "";
									
									if(itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_07") || itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_08") ||
										itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_09") || itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_10") ||
										itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_11") || itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_12") ||
										itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_13") || itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_14") ||
										itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_15") || itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_16") ||
										itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_17")) {
										classThamChieuAct = "thamChieuAct";
									}
							%>
								<input type="hidden" id="thamChieu<%=itemTTC.getCommonCode()%>" data-thamchieucode="giaTriCodeTTC_SuaDoi<%=itemTTC.getCommonCode()%>" data-thamchieuvalue="giaTriKiemTraTTC<%=itemTTC.getCommonCode()%>" data-thamchieucodettc="giaTriCodeTTC<%=stt%>"/>
								
								<select id="selLuaChonTTC<%=stt%>" name="selLuaChonTTC<%=stt%>" class="form-control-find <%= classThamChieuAct %>" style="height: 30px" onclick="checkSelLuaChonThongTinChung('<%=stt%>', '<%=itemTTC.getCommonCode()%>')">
									<option value="0" selected="selected">Chưa quyết định</option>
									<%for (DmDataItem item : lstLuaChonKetQua) {%>
										<option value="<%=item.getCode0()%>" <%=BienBanKiemTraBusiness.defaultIsDat(item.getCode0())%> <%=BienBanKiemTraBusiness.getDisplayTTC(itemTTC.getCommonCode(), item.getCode0())%>><%=item.getName()%></option>
									<%}%>
								</select>
							<%}%>
						</td>
					</tr>
				<%
						}
					}
				%>
				
					
				</tbody>
			</table>
		</div>
		<!----------------------------- II, Danh sach phuong tin kiem tra ----------------------------->
		<%
		List<VehiclerecordInitial> vehicleRecords=new ArrayList<VehiclerecordInitial>();
		int soXeDKKT=0;
		if (danhSachVehicleRecord!=null && danhSachVehicleRecord.trim().length()>0){
			vehicleRecords = LanhDaoPhongBusiness.getListVehicleRecordInitial(danhSachVehicleRecord);
			soXeDKKT=vehicleRecords.size();
		}
		
		DmDataItem dataItemNhanHieu = null;

		try {
			//dataItemNhanHieu = DmDataItemLocalServiceUtil.getDmDataItem(ConvertUtil.convertToLong(veGroup.getTradeMark()));
			dataItemNhanHieu = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.TRADE_MARK, vehicleGroup.getTradeMark());
		} catch (Exception e) { dataItemNhanHieu = null; }
		
	
		
		String tenNhanHieuPhuongTien=(dataItemNhanHieu != null) ? dataItemNhanHieu.getName() : vehicleGroup.getTradeMark();
		String soLoaiPhuongTien=(vehicleGroup != null) ? vehicleGroup.getCommercialName() : "";
		String soThamChieuPhuongTien=vehicleGroup!=null?vehicleGroup.getReferenceCertificateNo():"";
		%>
		
		<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 87%; margin-top: 1%;"><span style="font-weight: bold;">II. Danh sách phương tiện kiểm tra :</span></div>
		<div style="float: left; text-align: left; padding: 1% 1% 1% 0; margin-top: 1%;"><span style="font-weight: bold;">Số lượng PT ĐNKT: </span><span style="font-weight: bold;" id="soLgPtDnkt"><%=soXeDKKT %></span></div>
		<div style="clear:both;"></div>
		<div style="width:0%">
			<input type="hidden" id="danhSachVehicleRecord" name="danhSachVehicleRecord"  value="<%=danhSachVehicleRecord%>" />
			<input type="hidden" id="listVehicleRecordMau" name="listVehicleRecordMau"  value="" />
			<input type="hidden" id="listSoKhungMau" name="listSoKhungMau" value="" />
			<input type="hidden" id="listSoDongCoMau" name="listSoDongCoMau" value="" />
			<input type="hidden" id="listSoVinMau" name="listSoVinMau" value="" />
			<input type="hidden" id="listTinhTrangPhuongTienMau" name="listTinhTrangPhuongTienMau" value="" />
			<input type="hidden" id="listNamSXXeMau" name="listNamSXXeMau" value="" />
			<input type="hidden" id="listMauXeMau" name="listMauXeMau" value="" />
			
			<input type="hidden" id="listSoKhungSuaDoi" name="listSoKhungSuaDoi" value="" />
			<input type="hidden" id="listSoDongCoSuaDoi" name="listSoDongCoSuaDoi" value="" />
			<input type="hidden" id="listMauXeSuaDoi" name="listMauXeSuaDoi" value="" />
			<input type="hidden" id="listNamSanXuatXeSuaDoi" name="listNamSanXuatXeSuaDoi" value="" />
			<input type="hidden" id="listTinhTrangPhuongTienSuaDoi" name="listTinhTrangPhuongTienSuaDoi" value="" />
		</div>
		
		<!-- -------------II. Danh sách phương tiện kiểm tra : -->
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
			<table style="width: 100%;" id="tblDanhSachPhuongTienKiemTra" class="wd-table table">
				<thead>
				<tr>
					<th class="text-center bold" style="font-size: 13px;">STT</th>
					<th class="text-center bold" style="font-size: 13px;">Chọn<br>xe mẫu</th>
					<th class="text-center bold" style="font-size: 13px;">Nhãn hiệu<br>Số loại</th>
					<th class="text-center bold" style="font-size: 13px;">Số VIN</th>
					<th class="text-center bold" style="font-size: 13px;">Số khung<br>Số động cơ</th>
					<th class="text-center bold" style="font-size: 13px;">Tình trạng</th>
					<th class="text-center bold" style="font-size: 13px;">Năm sản xuất</th>
					<th class="text-center bold" style="font-size: 13px;">Màu xe</th>
					<th class="text-center bold" style="font-size: 13px;">Thao tác</th>
				</tr>
				</thead>
				<tbody>
				<% 
				int soXe = 0;
				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					String nhanHieuSoLoai = "";
					String loai = "";
					for (VehiclerecordInitial vehicleRecord :vehicleRecords) {
						soXe++;
						String tinhTrangPhuongTien = CommonUtils.getTinhTrangTblThongTinNhomXeNk(vehicleRecord.getVehicleEngineStatus());
				%>
				<tr class="rowTblDanhSachPhuongTienKiemTra<%=soXe%>">
					<td class="text-center"><%=soXe %></td>
					<td class="text-center">
						<input type="checkbox" id="vehicleRecordMau<%=soXe %>" name="vehicleRecordMau" class="cbVehicleRecord" onchange="changevaluevehiclerecordmau(<%=soXe %>)"/>
						
						<input type="text" hidden="true" id="idVehicleRecordMau<%=soXe %>" name="idVehicleRecordMau<%=soXe %>" value="<%=vehicleRecord.getId()%>"/>
						<input type="text" hidden="true" id="soKhungMau<%=soXe %>" name="soKhungMau<%=soXe %>" value="<%=vehicleRecord.getChassisNumber()%>"/>
						<input type="text" hidden="true" id="soVinMau<%=soXe %>" name="soVinMau<%=soXe %>" value="<%=vehicleRecord.getChassisNumber()%>"/>
						
						<input type="text" hidden="true" id="soDongCoMau<%=soXe %>" name="soDongCoMau<%=soXe %>" value="<%=vehicleRecord.getEngineNumber()%>"/>
						<input type="text" hidden="true" id="tinhTrangPhuongTienMau<%=soXe %>" name="tinhTrangPhuongTienMau<%=soXe %>" value="<%=tinhTrangPhuongTien%>"/>
						<input type="text" hidden="true" id="mauXeMau<%=soXe %>" name="mauXeMau<%=soXe %>" value="<%=vehicleRecord.getVehicleColor()%>"/>
						<input type="text" hidden="true" id="namSXXeMau<%=soXe %>" name="namSXXeMau<%=soXe %>" value="<%=vehicleRecord.getProductionYear()%>"/>
						
						<input type="text" hidden="true" id="soKhungMauEdit<%=soXe %>" name="soKhungMauEdit<%=soXe %>" value="<%=vehicleRecord.getChassisNumber()%>"/>
						<input type="text" hidden="true" id="soDongCoMauEdit<%=soXe %>" name="soDongCoMauEdit<%=soXe %>" value="<%=vehicleRecord.getEngineNumber()%>"/>
						<input type="text" hidden="true" id="tinhTrangPhuongTienMauEdit<%=soXe %>" name="tinhTrangPhuongTienMauEdit<%=soXe %>" value="<%=vehicleRecord.getVehicleEngineStatus()%>"/>
						<input type="text" hidden="true" id="mauXeMauEdit<%=soXe %>" name="mauXeMauEdit<%=soXe %>" value="<%=vehicleRecord.getVehicleColor()%>"/>
						<input type="text" hidden="true" id="namSXXeMauEdit<%=soXe %>" name="namSXXeMauEdit<%=soXe %>" value="<%=vehicleRecord.getProductionYear()%>"/>
					
					</td>
					<td class="text-center"><%=tenNhanHieuPhuongTien %><br><%=soLoaiPhuongTien %></td>
					<td class="text-center"><%=vehicleRecord.getChassisNumber()%></td>
					<td class="text-center"><b><span id="soKhungMauSuaDoi<%=soXe %>"><%=vehicleRecord.getChassisNumber()%></span></b><br><span id="soDongCoMauSuaDoi<%=soXe %>"><%=vehicleRecord.getEngineNumber()%></span></td>
					<td class="text-center"><span id="tinhTrangPhuongTienMauSuaDoi<%=soXe %>"><%=tinhTrangPhuongTien%></span></td>
					<td class="text-center"><span id="namSXXeMauSuaDoi<%=soXe %>"><%=vehicleRecord.getProductionYear() %></span></td>
					<td class="text-center"><span id="mauXeMauSuaDoi<%=soXe %>"><%=vehicleRecord.getVehicleColor() %></span></td>
					
					<td class="text-center" id="boChon<%=soXe%>">
						<a onclick="clearOneRowTblDanhSachPhuongTienKiemTra('<%=soXe%>')" id="isDisplayPhuongTien<%=soXe %>"
							onmouseover="onMouseOverTblDanhSachPhuongTienKiemTra('isDisplayPhuongTien<%=soXe%>')"
							onmouseout="onMouseOutTblDanhSachPhuongTienKiemTra('isDisplayPhuongTien<%=soXe%>')">Bỏ chọn</a>
						<br>
						<a onclick="changeDanhSachPhuongTienKiemTra('<%=soXe%>')" id="isDisplaySuaDoi<%=soXe %>"
							onmouseover="onMouseOverTblDanhSachPhuongTienKiemTra('isDisplaySuaDoi<%=soXe%>')"
							onmouseout="onMouseOutTblDanhSachPhuongTienKiemTra('isDisplaySuaDoi<%=soXe%>')">Sửa đổi</a>
					</td>
				</tr>
				<%
					}
				}%>
				</tbody>
			</table>
			<input type="text" hidden="true" id="soXeVehicleRecord" name="soXeVehicleRecord" value="<%=soXe%>"/>
		</div>
		<%
					String displayDivStr = "";
					String displayStr = "";
					List<InspectionRecordAttach> lstInspectionRecordAttachs = new ArrayList<InspectionRecordAttach>();
						if (lstInspectionRecordAttachs!=null && lstInspectionRecordAttachs.size()>0){
							countThongTinKhac = lstInspectionRecordAttachs.size();
							int countThongTin=0;
							for (InspectionRecordAttach item: lstInspectionRecordAttachs){
								countThongTin++;
								wildcard = "TTKN_"+countThongTin;
					%>
					<div id="div_uploadDocOther_<%=wildcard%>">
						<br/>		
						
							
							<div style="float: left; width: 48%; margin-right: 4%">
								<p class="spectex4" style="margin-top: 0">
									Tên thương mại <span style="color: red">*</span>:
								</p>
								<input style="width: 97%;" type="text" id="attachment_<%=wildcard%>" name="attachment_<%=wildcard%>"
								value="">
							</div>
							<p style="clear: both"></p>
							<table width="100%" align="center" border="0" class="egov-table-form" style="padding-left: 0px; padding-right: 0px;" >
								<tr>
								<%
									displayStr = (countThongTin == lstInspectionRecordAttachs.size())? "display: inline;" : "display: none;";
								%>
									<td colspan="6">
										<img id="imgAddOther_<%=wildcard%>" onclick="func_addDmOther('<%=wildcard%>')" style="<%=displayStr %>" src="<%=request.getContextPath()%>/img/icon_add.png" /> &nbsp;&nbsp; 
										<img id="imgRemoveOther_<%=wildcard%>" onclick="func_removeDmOther('<%=wildcard%>')" style="display: inline;" src="<%=request.getContextPath()%>/img/icon_remove.png" />
									</td>
								</tr>
							</table>
					</div>
					
					<%
						} }else{
							displayDivStr = "display: inline;";
						}
					%>
					
					
					<%
						// if ton tai file dm khac
						demSoThongTinKhac=countThongTinKhac>0?countThongTinKhac+1:1;
						
						wildcard = "TTKN_"+demSoThongTinKhac; // default - 1
					%>
					<div style="<%= displayDivStr%>">
						<%@ include file="/portlet/quanlyhs/thulyhs/dangkiemvien/nhapThongTinDangKyKhac.jsp" %>
					</div>
					<%-- For next --%>
					<div id="div_OtherContainer_Next_TTKN_<%=demSoThongTinKhac+1%>"></div>
					
					<input type="hidden" value="<%=demSoThongTinKhac %>" name="counterTTKhacBySp_TTKN" id="counterTTKhacBySp_TTKN" />
					<input type="hidden" value="" name="itemRemovedOtherArr_TTKN" id="itemRemovedOtherArr_TTKN" /> <%-- Array store items which removed --%>

<!-- template autofill -->			

      			<div id="div_OtherContainer_default" style="display: none;">
					<%
						wildcard = parttern;
					%>
					<%@ include file="/portlet/quanlyhs/thulyhs/dangkiemvien/nhapThongTinDangKyKhac.jsp" %>		
				</div>
	</div>
	<!-------END--------------------------------------------  TAB 1 ----------------------------------------->
	
					
	</div>
	
	<!-------START------------------------------------------  TAB 2 ----------------------------------------->
	<div id="tab-2" class="tab-content">
		<div id="u6148" style="position: absolute; left: 0px; width: 100%; padding-left: 1.4%;padding-top: 0%;">
			<img alt="" src="<%=request.getContextPath()%>/img/under_line_image.png" class="underLine" style="position: relative;left: 0px;top: -8px;width: 99%;height: 5px;">
		</div>
		
		<input type="text" id="inspectionCommonStatusVehicleClass" name="inspectionCommonStatusVehicleClass" value="" hidden="true"/>
		
		<!--START------ 2. KIỂM TRA CHẤT LƯỢNG AN TOÀN KỸ THUẬT VÀ BẢO VỆ MÔI TRƯỜNG 36 -->
		
		<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 100%;"><span style="font-weight: bold;">2. KIỂM TRA CHẤT LƯỢNG AN TOÀN KỸ THUẬT VÀ BẢO VỆ MÔI TRƯỜNG</span></div>
		<div style = "width:0%">&nbsp</div>
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
			<%
			List<InspectionCommonStatus> lstkiemTraChatLuongAnToanKt = InspectionCommonStatusLocalServiceUtil
				.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleClass, 2, -1);
			%>
		
			<table id="tblKiemTraChatLuongATKTVaBaoVeMoiTruong" style="width: 100%" class="wd-table table">
				<thead>
					<tr>
						<th class="text-center" style="height: 40px;"><span class="bold">TT</span></th>
						<th class="text-center" colspan="2"><span class="bold">Hạng mục kiểm tra</span></th>
						<th class="text-center"><span class="bold">Kết quả kiểm tra</span></th>
					</tr>
				</thead>
				<tbody>
				<%
				if (lstkiemTraChatLuongAnToanKt != null && lstkiemTraChatLuongAnToanKt.size() > 0) {
					stt=0;
					for (InspectionCommonStatus itemAnToanKt: lstkiemTraChatLuongAnToanKt){
						stt++;
				%>
					<tr>
						<td class="text-center"><span id="">2.<%=stt %></span></td>
						<td class="text-left paddingLeft05"><span id=""><%=itemAnToanKt.getGroupName() %></span></td>
						<td class="text-left paddingLeft05"><span id=""><%=itemAnToanKt.getItemName() %></span></td>
						<td class="text-left paddingLeft05">
						<% if (itemAnToanKt.getAllowEdit()==1){ %>
							<select id="selChatLuongAnToanKt<%=stt %>" name="selChatLuongAnToanKt<%=stt %>" class="form-control-find width100">
							<%
							List<DmDataItem> lstChatLuong = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.SAFETY_TEST_RESULT);
							for (DmDataItem item : lstChatLuong) {
							%>
								<option value="<%=item.getCode0()%>" <%=BienBanKiemTraBusiness.defaultIsDat(item.getCode0())%> <%=BienBanKiemTraBusiness.getDisplayKTChatLuong(itemAnToanKt.getCommonCode(), item.getCode0())%>><%=item.getName()%></option>
							<%}%>
							</select>
						<% } %>	
						</td>
					</tr>
				<% 
						}
					}
				%>
				</tbody>
			</table>
		</div>
		<!--END------ 2. KIỂM TRA CHẤT LƯỢNG AN TOÀN KỸ THUẬT VÀ BẢO VỆ MÔI TRƯỜNG 36 -->
		
		
		<!--START------ 3. KIỂM TRA ĐỐI CHIẾU KẾT CẤU VÀ THÔNG SỐ KỸ THUẬT CỦA XE 34 -->
		<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 100%;"><span style="font-weight: bold;">3. KIỂM TRA ĐỐI CHIẾU KẾT CẤU VÀ THÔNG SỐ KỸ THUẬT CỦA XE</span></div>
		<div style="width: 0%">&nbsp</div>
		<!-- table 2 -->
		
		<div id="itemSpecCategory"></div>
		
		<script type="text/javascript">$(document).ready(function(){loadThongSoKyThuat(0, true, -1);})</script>
		
		<div style="width: 10px">&nbsp</div>
		<!--------------------------- Phan tong ket -------------------------->
		<div id="divPHanTongKetKetQua">
			<!------------------- Thanh phan ben trai ----------------->
			<div style="float: left; text-align: left; width: 49%;">
				<table>
					<thead>
						<tr>
							<td><img alt="" class="iconBlue" src="<%=request.getContextPath()%>/img/blue.png"></td>
							<td><span style="text-align: left;">Chưa Đưa ra quyết định</span></td>
						</tr>
						<tr>
							<td><img alt="" class="iconWhite" src="<%=request.getContextPath()%>/img/white_rec_normal.png"></td>
							<td><span style="text-align: left;">Đạt</span></td>
						</tr>
						<tr>
							<td><img alt="" class="iconRead" src="<%=request.getContextPath()%>/img/red_rec_normal.png"></td>
							<td><span style="text-align: left;">Không đạt</span></td>
						</tr>
						<tr>
							<td><img alt="" class="iconYellow" src="<%=request.getContextPath()%>/img/yellow_rec_normal.png"></td>
							<td><span style="text-align: left;">Sửa đổi</span></td>
						</tr>
						<tr>
							<td><img alt="" class="iconGreen" src="<%=request.getContextPath()%>/img/green.png"></td>
							<td><span style="text-align: left;">Không áp dụng</span></td>
						</tr>
					</thead>
				</table>
			</div>
			
			<!------------------- Thanh phan ben phai ----------------->
			<div style="float: left; text-align: left; width: 49%;">
				<div style="float: right; text-align: left; width: 49%;"><div style="width: 25px;float: left;text-align: right;" id="divTgsoKqDat">15</div>&nbsp;&nbsp;Đạt</div>
				<div style="float: right; text-align: right; width: 49%;">Tổng số kết quả&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
				<div style="float: right; text-align: left; width: 49%;"><div style="width: 25px;float: left;text-align: right;" id="divTgsoKqKhongDat">0</div>&nbsp;&nbsp;Không đạt</div>
				<div style="float: right; text-align: left; width: 49%;">&nbsp</div>
				<div style="float: right; text-align: left; width: 49%;"><div style="width: 25px;float: left;text-align: right;" id="divTgsoKqSuaDoi">0</div>&nbsp;&nbsp;Sửa đổi</div>
				<div style="float: right; text-align: left; width: 49%;">&nbsp</div>
				<div style="float: right; text-align: left; width: 49%;"><div style="width: 25px;float: left;text-align: right;" id="divTgsoKqKhongApDung">0</div>&nbsp;&nbsp; Không áp dụng</div>
				<div style="float: right; text-align: left; width: 49%;">&nbsp</div>
				<div style="float: right; text-align: left; width: 49%;"><div style="width: 25px;float: left;text-align: right;" id="divTgsoKqChuaDuaRaQuyetDinh">0</div>&nbsp;&nbsp;Chưa đưa ra quyết định</div>
				<div style="float: right; text-align: left; width: 49%;">&nbsp</div>
			</div>
		</div>
		<div style="width: 10px">&nbsp</div>
		<!--END------ 3. KIỂM TRA ĐỐI CHIẾU KẾT CẤU VÀ THÔNG SỐ KỸ THUẬT CỦA XE 34 -->
		
		
		
		
		<!--START------ 4. KIỂM TRA ĐỐI CHIẾU KẾT CẤU KHÍ THẢI 35 -->
		<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 100%;"><span style="font-weight: bold;">4. KIỂM TRA ĐỐI CHIẾU KẾT CẤU KHÍ THẢI</span></div>
		<div style = "width:0%">&nbsp</div>
		
		<%
			List<InspectionCommonStatus> lstKetCauKhiThais= InspectionCommonStatusLocalServiceUtil
			.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleClass, 4, -1);
			
			if (lstKetCauKhiThais!=null && lstKetCauKhiThais.size()>0){
				
				List<DmDataItem> lstKetQuaKetCauKhiThai = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.EMISSION_TEST_RESULT);
		%>
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
			<table id="tblKiemTraDoiChieuKetCauKhiThai" style="width: 100%" class="wd-table table">
				<thead>
					<tr>
						<th class="text-center" style="height: 40px;"><span class="bold">TT</span></th>
						<th class="text-center"><span class="bold">Nội dung kiểm tra</span></th>
						<th class="text-center"><span class="bold">Báo cáo thử nghiệm</span></th>
						<th class="text-center"><span class="bold">Kết quả kiểm tra đối chiếu</span></th>
						<th class="text-center"><span class="bold">Kết quả</span></th>
					</tr>
				</thead>
				<tbody>
					<%
					stt = 0;
					for (InspectionCommonStatus itemKetCau: lstKetCauKhiThais) {
						stt++;
					%>
					<tr>
						<td class="text-center">4.<%=stt%></td>
						<td class="text-left paddingLeft05"><%=itemKetCau.getGroupName() %></td>
						<td class="text-left paddingLeft05"></td>
						<td class="text-left paddingLeft05"></td>
						<td class="text-left paddingLeft05">
							<select id="selKetCauKhiThaiKiHieu<%=stt%>" name="selKetCauKhiThaiKiHieu<%=stt%>" class="form-control-find width100">
								<%for (DmDataItem item : lstKetQuaKetCauKhiThai) {%>
									<option value="<%=item.getCode0()%>" <%=BienBanKiemTraBusiness.defaultIsDat(item.getCode0())%> ><%=item.getName()%></option>
								<%}%>
							</select>
						</td>
					</tr>
					<% } %>
				</tbody>
			</table>
		</div>
		<% } %>
		<!--END------ 4. KIỂM TRA ĐỐI CHIẾU KẾT CẤU KHÍ THẢI 35 -->
		
		
		<!--START------ 5. XỬ LÝ KẾT QUẢ 34 -->
		<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 100%;"><span style="font-weight: bold;">5. XỬ LÝ KẾT QUẢ</span></div>
		<div style = "width:0%">&nbsp</div>
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
			<table id="tblXyLyKetQua" style="width: 100%" class="wd-table table">
				<tbody>
					<tr>
						<td class="text-left paddingLeft05">Đề xuất</td>
						<td class="text-left paddingLeft05">
							<%List<DmDataItem> lstXuLyKetQua = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.CONFIRMED_RESULT);%>
							<select id="selXuLyKetQua" name="selXuLyKetQua" class="form-control-find width100" onchange="onChangeRequiredGhiChuGcc()">
								<%for (DmDataItem item : lstXuLyKetQua) {%>
								<option value="<%=item.getCode0()%>"><%=item.getName()%></option>
								<%}%>
							</select>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
		
		<!-- De nghi -->
		<div class="row">
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 19%;">
				<label class="textlabel">&nbsp</label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
				<input type="checkbox" name="markupSafeTest" id="markupSafeTest" value="1" class=""/> &nbsp;Đề nghị thử nghiệm an toàn<br>
				<input type="checkbox" name="markupEmissionTest" id="markupEmissionTest" value="1" class=""/>&nbsp;Đề nghị thử nghiệm khí thải<br>
				<input type="checkbox" name="markupControl" id="markupControl" value="1" class=""/>&nbsp;Đề nghị giám định<br>
			</div> 
		</div>
		</div>
		<!--END------ 5. XỬ LÝ KẾT QUẢ 34 -->
		
		<div style="height: 5px">&nbsp</div>
		
		
		<!--START------ 6. XÁC NHẬN CHI PHÍ PHÁT SINH -->
		<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 100%;"><span style="font-weight: bold;">6. XÁC NHẬN CHI PHÍ PHÁT SINH</span></div>
		<div style = "width:0%">&nbsp</div>
		
		<%
			List<InspectionCommonStatus> lstXacNhanChiPhiPhatSinhs= InspectionCommonStatusLocalServiceUtil
			.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleClass, 6, -1);
			
			if (lstXacNhanChiPhiPhatSinhs!=null && lstXacNhanChiPhiPhatSinhs.size()>0){
				
		%>
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
			<table id="tblKiemTraDoiChieuKetCauKhiThai" style="width: 100%" class="wd-table table">
				<tbody>
					<%
						stt=1;
						for (InspectionCommonStatus itemXnChiPhi: lstXacNhanChiPhiPhatSinhs){
					%>
					<tr>
						<td class="text-center" style="width: 40px;">6.<%=stt++ %></td>
						<td class="text-left paddingLeft05"  style="width: 25%;"><%=itemXnChiPhi.getGroupName() %></td>
						<%if (itemXnChiPhi.getCommonCode().contains("6_04")){ %>
						<td class="text-left paddingLeft05"  style="width: 40%;">(VND)</td>
						<%} else {%>
						<td class="text-left paddingLeft05"  style="width: 40%;"><%=itemXnChiPhi.getItemName() %></td>
						<%}%>
						<td class="text-left paddingLeft05">
						<% if (itemXnChiPhi.getCommonCode().contains("6_01")){ %>
							<input type="radio" name="isTinhPhi" value="1" onclick="eventHideOrShowDivXNTP('divQuangDuongPhatSinh','divGhiChuChiPhiPhatSinh')">Có<br> 
							<input type="radio" name="isTinhPhi" value="0" onclick="eventHideOrShowDivXNTP('divGhiChuChiPhiPhatSinh','divQuangDuongPhatSinh')">Không
							
						<% }else if (itemXnChiPhi.getCommonCode().contains("6_02")){ %>
						<div id = "divQuangDuongPhatSinh">
							<select id="quangDuongPhatSinh" name="quangDuongPhatSinh" class="form-control-find" style="height: 30px" >
								<option value="1" selected="selected"> <100 km </option>
								<option value="2" > 100 - 200 km </option>
								<option value="3" > 200 - 300 km </option>
								<option value="4" > Trên 300 km </option>
							</select>
						</div>
						<% }else if (itemXnChiPhi.getCommonCode().contains("6_03")){%>
						<div id = "divGhiChuChiPhiPhatSinh">
							<select id="ghiChuChiPhiPhatSinh" name="ghiChuChiPhiPhatSinh" class="form-control-find" style="height: 30px" >
								<option value="0" selected="selected">--Lựa chọn lý do không tính phí--</option>
								<option value="1" >Khách đón</option>
								<option value="2" >Cùng địa điểm với lô hàng đã tính phí</option>
							</select>
						</div>
						<% } else if (itemXnChiPhi.getCommonCode().contains("6_04")){ %>
						<input type="text" name="chiPhiPhatSinh" id="chiPhiPhatSinh" value="0"/>
						<%
						}
						%>
						</td>
					</tr>
					<% } %>
				</tbody>
			</table>
		</div>
		<% } %>
		<!--END------  6. XÁC NHẬN CHI PHÍ PHÁT SINH -->
		
		
		<!-------------START------------------------ Thông báo kết quả ---------------------------->

		
		<div>Ý kiến đăng kiểm viên <span style="color: red;"></span></div>
		<div style="width: 10px"></div>
		<textarea class="textAreaAutosize" id="yKienDangKiemVien" name="yKienDangKiemVien" style="width: 79.5%" placeholder=""><%=StringPool.BLANK%></textarea>
		<div style="width: 20px"></div>
		<div>Ghi chú in vào giấy chứng chỉ <span style="color: red;" id="spanGhiChuInVaoGcc"></span></div>
		<div style="width: 10px"></div>
		<% if (vehicleGroup.getVehicleType().equalsIgnoreCase("XCD02003")  || vehicleGroup.getVehicleType().equalsIgnoreCase("XCD02004")){ %>
		<textarea class="textAreaAutosize" id="ghiChuInVaoGiayChungChi" name="ghiChuInVaoGiayChungChi" style="width: 79.5%" placeholder=""><%=DKConfigurationManager.getStrProp("hoat_dong_pham_vi_hep", StringPool.BLANK)%></textarea>
		<% } else { %>
		<textarea class="textAreaAutosize" id="ghiChuInVaoGiayChungChi" name="ghiChuInVaoGiayChungChi" style="width: 79.5%" placeholder=""><%=StringPool.BLANK%></textarea>
		<%
		}
		%>
		<!-------------END------------------------ Thông báo kết quả ---------------------------->
		
		
	</div><!--------END----------------  tab 2 --------------->
	
	<div style="width: 30px">&nbsp</div>
	
	
	
	<aui:button-row cssClass="width100">
		<button type="button" id="duocPhanCongDangKiemVien" onclick="if(validatorBeforDataLapBienBanKiemTra()) beforSummitForm('formDuocPhanCongDangKiemVien','<%=urlDuocPhanCongDangKiemVien.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;float: left;">Hoàn tất</button>
		<button type="button" id="bienBanLuuTam" onclick="if(validatorBeforDataLapBienBanKiemTra()) beforSummitForm('formDuocPhanCongDangKiemVien','<%=urlBienBanLuuTam.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;float: left;">Lưu tạm</button>
		<button type="button" onclick="eventHideOrShowDiv('divDuocPhanCong' , 'true', 'divLapBienBanKiemTra', 'false', '', ''); btnHuyKiemTraLapBienBanKiemTra();" class="btnThuLyHS form-control" style="width: 200px;">Hủy kiểm tra</button>
	</aui:button-row>
</div><!--  end tab container -->

<div style="width: 30px">&nbsp</div>
</aui:form>
</div>
</div>
</div>

<!-- the div show cho doi trong khi call ajax load data from db -->
<div id="waiting" class="waiting" hidden="true">
	<!--<img alt="" src="/DangKiemApp-portlet/img/loading.gif" class=""> -->
</div>

<!-- Call ajax load anh sach KiemTra Chat luong An toan Kiem tra Van ban VMT by VehicleGroupId -->
<portlet:resourceURL var="updaContentURL" ></portlet:resourceURL>

<% 
updaContentURL = HttpUtil.removeParameter(updaContentURL, renderResponse.getNamespace() + "danhSachVehicleRecord"); 
%>

<!-- Dialog tab Thông tin chung -->
<div id="div_WarningMsg" style="display: none;">
	<table width="100%">
		<tr>
			<td colspan="2" style="width: 100%;"><label class="egov-label">Thay đổi giá trị nhập</label>
		</tr>
		<tr>
			<td colspan="2" style="width: 100%;">
				<div id="valueGiaTriNhapStt">
					<input type="hidden" id="giaTriCommonCode" name="giaTriCommonCode" value=""/>
					<input type="hidden" id="giaTriNhapStt" name="giaTriNhapStt" value="" />
				</div>
				<div id="listValueGiaTriNhap"></div>
			</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" class="egov-button-normal" value="Đồng ý" id="btnXacNhanThongSoKt" onclick="javascript: func_xacnhanPheDuyet();">
				<input type="button" class="egov-button-normal" value="Đồng ý" id="btnXacNhanThongTinChung" style="display: none;" onclick="javascript: func_xacnhanPheDuyetTTChung();">
				&nbsp;&nbsp; 
				<input type="button" class="egov-button-normal" value="Hủy" onclick="javascript: func_huyPheDuyet();" >
			</td>
		</tr>
	</table>
</div>

<!-- dialog tab Kiểm tra Chất lượng an toàn KTVBVMT -->
<div id="div_WarningMsgDSXe" style="display: none;min-height: 200px !important;">
	<table width="100%">
		<tr>
			<td colspan="2" style="width: 100%;"><label class="egov-label">Thay đổi giá trị nhập</label></td>
		</tr>
		<tr>
			<td colspan="2" style="width: 100%;">
				<div id="valueGiaTriNhapSttDSXe"></div>
				<div id="listValueGiaTriNhapDSXe"></div>
				<aui:button-row cssClass="width100">
					<button type="button" class="fa-right bt btxanhduong btn btn-default" style="float: left; margin-right: 1%" id="btnXacNhanThongTinDSXe" name="btnXacNhanThongTinDSXe" onclick="javascript: func_xacnhanPheDuyetDSXe();">Đồng ý</button>
					<button type="button" class="fa-right bt btxanhduong btn btn-default" style="float: left;" onclick="javascript: func_huyPheDuyetDSXe();">Hủy</button>
				</aui:button-row>
			</td>
		</tr>
	</table>
</div>

<portlet:renderURL windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>" var="loadThongSoKyThuatURL">
	<portlet:param name="jspPage" value="/portlet/quanlyhs/thulyhs/dangkiemvien/lapbienbanktra_loadThongSoKyThuat.jsp"/>
</portlet:renderURL>

<script type="text/javascript">
//chuc nang hien thi tab
$(document).ready(function() {
	$('ul.tabs li').click(function() {
		var tab_id = $(this).attr('data-tab');
		$('ul.tabs li').removeClass('current');
		$('.tab-content').removeClass('current');
		$(this).addClass('current');
		$("#" + tab_id).addClass('current');
	});
	
	// validator file upload
	$( "body" ).delegate('.validatorOtherFile', "change", function() {
		var size = this.files[0].size;
		var maxFile = maxOtherFileSize;
		if(maxFile > 0 && size > maxFile) {
			alert("File " + this.files[0].name + " quá dung lượng cho phép là " + maxFile/1024/1024 + "MB");
		}
	});
	
	$( "body" ).delegate('.specCategoryChoose', "click", function() {
		// set visible for table
		var specCategory = $(this).val();
		$('.tblSpecCategoryChoose').hide();
		$('#tblKiemTraDoiChieuKetCauVaThongSoKtXe_' + specCategory).show();
	});
	
	setThamChieuAct('<%= soThamChieu %>', false);
	
	$("select#chonPhuongThucKT").change(function() {
		/* xac nhan kieu loai */
		if($(this).val() == 1 && vehicleClassJs == "XCG"){
			$("select#selXuLyKetQua").val(2);	// Cap thong bao mien
			onChangeRequiredGhiChuGcc();
		}
	});
})

/*Check gia tri tham chieu */
var inputGiaTriThamChieu = $('#giaTriKiemTraTTCTTC_1_06');
var oldGiaTriThamChieuValue = "";

// kiem tra co input voi id giaTriKiemTraTTCTTC_1_06 khong
if(inputGiaTriThamChieu.length > 0) {
	oldGiaTriThamChieuValue = $.trim(inputGiaTriThamChieu.val());

	setInterval(function() { giaTriThamChieuChange()}, 100);
}

function giaTriThamChieuChange() {
	if(inputGiaTriThamChieu.length > 0) {
		if($.trim(inputGiaTriThamChieu.val()) != oldGiaTriThamChieuValue) {
			oldGiaTriThamChieuValue = $.trim(inputGiaTriThamChieu.val());
			console.log("===giaTriThamChieuChange===" + oldGiaTriThamChieuValue);
			setThamChieuAct(oldGiaTriThamChieuValue, true);
		};
	}
}

function setThamChieuAct(giaTriView, setGTNTC) {
	if(giaTriView == '') {
		$( ".thamChieuAct" ).show();
	} else {
		//$( ".thamChieuAct" ).prop( "disabled", true );
		$( ".thamChieuAct" ).hide();
		// set gia tri theo tham chieu
		if(setGTNTC) {
			setGiaTriNhapTheoThamChieu(giaTriView);
		}
	}
}

function chooseSpecCategory(specCategory) {
	// set radio checked
	$('.specCategoryChoose').prop('checked', false);
	$('.specCategoryChoose').removeAttr('checked');
	
	$('#specCategoryChoose' + specCategory).prop('checked', true);
	$('#specCategoryChoose' + specCategory).attr("checked","checked");
	
	// set visible for table
	$('.tblSpecCategoryChoose').hide();
	$('#tblKiemTraDoiChieuKetCauVaThongSoKtXe_' + specCategory).show();
}

var resultCallAjaxFindVehicleSpecification = false;


var lstFileThongSoKiThuat = new Array();
var lstFileTaiLieuThuNghiem = new Array();
var lstFileTalLieuKhiThai = new Array();
var lstFileGroupId = new Array();
var path = '/DangKiemApp-portlet/export/';
var vehicleClassJs='<%=vehicleClass%>';

function loadThongSoKyThuat(congThucBanhXeId, isLoadPage, type) {
	var itemSpecCategory = $('#itemSpecCategory');
	
	itemSpecCategory.html('<div style="height:100px;"></div>').mask('Loadding...');
	/* khoa button khi chua load xong thong so ky thuat */
	disableBtnThuLyHoSo(true);
	
	$.ajax({
		type : 'GET',
		url: '<%= loadThongSoKyThuatURL %>', 
		data : {
			<%= Constants.ID_VEHICLE_GROUP %>: <%= idVehicleGroup %>,
			vehicleClass: '<%= vehicleClass %>',
			vehicleType: '<%= vehicleType %>',
			congThucBanhXeId : congThucBanhXeId,
			type: type
		},
		dataType: "html",
		success : function(data) {
			itemSpecCategory.html(data).unmask();
			disableBtnThuLyHoSo(false);
			
			// goi lai ham set tham chieu khi load ajax thong so ky thuat
			if(isLoadPage) {
				setThamChieuAct('<%= soThamChieu %>', false);
				
				caculatoTongSoKetQua();
			}
		}
	});
}

/* khoa cac nut thao tac */
function disableBtnThuLyHoSo(status) {
	$('.btnThuLyHS').prop( "disabled", status );
}


//de ve file js, ko an doan code: <portlet:namespace/>
function beforSummitForm(idForm, url) {
	//console.log('=beforSummitForm=' + idForm);
	var sothutuxemau = document.getElementById('listVehicleRecordMau').value;
	if (sothutuxemau.length == 0){
		alert("Chưa chọn xe mẫu trong biên bản kiểm tra hiện trường.");
		return;
	}
	var anChiNo = document.getElementById('giaTriCodeTTC_SuaDoiTTC_1_06').value;
	if(anChiNo.length > 0){
		$.ajax({
			type : 'GET',
			url : '<%=updaContentURL%>',
			data : {
				type : 'checkChungChiThamChieuBeforeSubmit',
				anChiNo : anChiNo,
			},
			success : function(data) {
				if (data != '{}') {
					var data2 = JSON.parse(data);
					//console.log("===data2==" + data2);
					if(data2.checAnChi === true){
						var status = confirm("Bạn có muốn tiếp tục xử lý?");
						if (status) {
							document.getElementById('<portlet:namespace/>' + idForm).action = url;
							document.getElementById('<portlet:namespace/>' + idForm).submit();
				
							document.getElementById('duocPhanCongDangKiemVien').disabled = true;
							document.getElementById('bienBanLuuTam').disabled = true; 
						} else {
							document.getElementById('<portlet:namespace/>' + idForm).action = '';
						}
					} else {
						alert("Số chứng chỉ tham chiếu " + anChiNo + " không tồn tại trong hệ thống");
					}
				}
			}
		});
	} else {
		var status = confirm("Bạn có muốn tiếp tục xử lý?");
		if (status) {
			document.getElementById('<portlet:namespace/>' + idForm).action = url;
			document.getElementById('<portlet:namespace/>' + idForm).submit();

			document.getElementById('duocPhanCongDangKiemVien').disabled = true;
			document.getElementById('bienBanLuuTam').disabled = true; 
		} else {
			document.getElementById('<portlet:namespace/>' + idForm).action = '';
		}
	}
}


var giaTriTraVe="";
var isThuocDmDataItem="0";

/* if commonCode empty then Man hinh tab Kiểm tra Chất lượng an toàn KTVBVMT else Thông tin chung */
function suaGiaTriNhap(specificationcode, giaTriDangKi, stt, isThongTin, commonCode) {

	var typeAjax = 'hienThiGiaTriThayDoiDKV';
	if (isThongTin == '1') {
		typeAjax = 'hienThiGiaTriThayDoiDKVThongTinChung';
	}

	if (isThongTin == '1') {
		document.getElementById('btnXacNhanThongSoKt').style.display = 'none';
		document.getElementById('btnXacNhanThongTinChung').style.display = '';
	} else {
		document.getElementById('btnXacNhanThongSoKt').style.display = '';
		document.getElementById('btnXacNhanThongTinChung').style.display = 'none';
	}

	$.ajax({
		type : 'GET',
		async: false,//bat dong bo = fale, dong bo voi client
		cache : false,
		url : '<%=updaContentURL%>',
		data : {
			specificationcode : specificationcode,
			type : typeAjax,
			vehicleClass : vehicleClassJs,
			giaTriDangKi : giaTriDangKi,
			stt : stt
		},
		success : function(data) {
			if (data != '{}') {
				var data2 = JSON.parse(data);
				
				// ///////////////////////// select multi
				if (isThongTin == '1' && specificationcode == '4') {
					giaTriTraVe = "";
					isThuocDmDataItem = "2";
					document.getElementById("listValueGiaTriNhap").style.overflowX = "scroll";
					document.getElementById("listValueGiaTriNhap").style.height = "200px";
					
					for (var i = 0; i < data2.codedataitem.length; i++) {
						var isSelected = "";
						if (giaTriDangKi.includes(data2.codedataitem[i])) {
							isSelected = " checked ";
						}
						var code = data2.codedataitem[i].trim();
						var name = data2.namedataitem[i].trim();
						
						giaTriTraVe = giaTriTraVe + createGiaTriTraVe(code, name, isSelected);
						
					}
					
					var giaTriCode = $('#giaTriCodeTTC' + stt).val();
					var giaTriView = $('#giaTriKiemTraTTC' + commonCode).val();
					
					//tao gia tri hidden
					giaTriTraVe = giaTriTraVe + createListGiaTriTraVe(giaTriCode, giaTriView);
					
				} else {
					
					isThuocDmDataItem = "1";
					document.getElementById("listValueGiaTriNhap").style.overflowX = "";
					
					giaTriTraVe = "<select data-specificationcode=\"" + specificationcode + "\" id=\"giaTriNhapSuaDoi" + stt + "\" name=\"giaTriNhapSuaDoi" + stt + "\" class=\"form-control-find width100\">";
					for (var i = 0; i < data2.codedataitem.length; i++) {
						var isSelected = "";
						if (data2.codedataitem[i] == giaTriDangKi) {
							isSelected = " selected=\"selected\" ";
						}
						
						giaTriTraVe = giaTriTraVe + "<option value=\"" + data2.codedataitem[i] + "\"  " + isSelected + "  >" + data2.namedataitem[i] + "</option>";
					}
					giaTriTraVe = giaTriTraVe + "</select>";
				}
			} else {
				isThuocDmDataItem = "0";
				document.getElementById("listValueGiaTriNhap").style.overflowX = "";
				document.getElementById("listValueGiaTriNhap").style.height = "30px";
				
				if(commonCode === 'TTC_1_20') {
					//Ngày Tờ khai hàng hóa nhập khẩu
					giaTriTraVe = createInputDate(stt, giaTriDangKi);
				} else if(specificationcode == 'XCG0237'){
					// Fix cung Thiết bị chuyên dùng sử dụng textarea
					document.getElementById("listValueGiaTriNhap").style.height = "200px";
					giaTriTraVe = createTextArea(stt, giaTriDangKi);
				} else {
					giaTriTraVe = createInput(stt, giaTriDangKi);
				}
			}
		}
	});
	
	if (giaTriTraVe != '') {
		$('#giaTriCommonCode').val(commonCode);
		$('#giaTriNhapStt').val(stt);
		//document.getElementById("valueGiaTriNhapStt").innerHTML = createInputGiaTriNhapStt(stt);
		document.getElementById("listValueGiaTriNhap").innerHTML = giaTriTraVe;
		showThongBaoMsg();
		if (commonCode === '') {
			resetGiaTriNhapSuaDoiKTCLAT();
		} else {
			resetGiaTriNhapSuaDoiTTC();
		}
	}

}

function setGiaTriNhapTheoThamChieu(giaTriThamChieu) {
	console.log('===setGiaTriNhapTheoThamChieu===' + giaTriThamChieu);
	
	var typeAjax = 'getGiaTriTheoThamChieu';
	
	$.ajax({
		type : 'GET',
		url : '<%=updaContentURL%>',
		dataType: 'json',
		data : {
			type: typeAjax,
			giaTriThamChieu : giaTriThamChieu,
			<%= Constants.ID_VEHICLE_GROUP %> : <%= idVehicleGroup %>,
			<%= Constants.ID_VEHICLE_GROUP_INITIAL %> : <%= idVehicleGroup %>
		},
		success : function(data) {
			
			if(data.result) {
				var thamChieuJson = data.thamChieuJson;
				
				for(var k in thamChieuJson) {
					var input = $('#thamChieu'+thamChieuJson[k].referenceCode);
					
					if(input.length > 0) {
						var codeId = $('#'+input.data('thamchieucode'));
						
						if(codeId.length > 0) {
							codeId.val(thamChieuJson[k].code);
							codeId.attr('value', thamChieuJson[k].code);
						}
						
						var valueId =  $('#'+input.data('thamchieuvalue'));
						
						if(valueId.length > 0) {
							valueId.attr('value', thamChieuJson[k].value);
							valueId.val(thamChieuJson[k].value);
						}
						
						var giaTriCodeTTC = $('#'+input.data('thamchieucodettc'));
						
						if(giaTriCodeTTC.length > 0) {
							giaTriCodeTTC.val(thamChieuJson[k].code);
							giaTriCodeTTC.attr('value', thamChieuJson[k].code);
						}
					}
				}
			}
		}
	})
}

var count_other = <%=demSoThongTinKhac%>;

function func_addDmOther(pairKey)
{
	var arr = pairKey.split("_");
	var indSp = arr[0]; // san pham
	var indDmKhac = arr[1];  // dm khac

//	alert(pairKey);
	var text = $('#div_OtherContainer_default').html();

	// su ly text va tang count;
	count_other ++;
	indDmKhac ++;
	var div_next = '#div_OtherContainer_Next_' + indSp + '_' + indDmKhac;
		
	text = text + '<div id=\"div_OtherContainer_Next_' + indSp + '_' + (indDmKhac + 1) + '\"></div>';
	text = text.replace(/<%=parttern%>/g, (indSp + '_' + indDmKhac));
//	alert(text);
	$(div_next).html(text);
	
	// Hidden image previous add  button
	var counter = $('#counterTTKhacBySp_' + indSp).val();
	counter ++;
//	alert("counter: " + counter);
	$('#counterTTKhacBySp_' + indSp).val(counter);
	var maxItem;
	for (var i = 1; i <= counter; i ++)
	{
		var idAddImg = "#imgAddOther_" + indSp + "_" + i;
//		alert($(idAddImg));
		if ($(idAddImg).length > 0)
		{
			$(idAddImg).css('display','none');
			maxItem = idAddImg;
		}
	}
	if (maxItem != null && maxItem.length > 0)
	{
		$(maxItem).css('display','inline');
	}
}

function func_removeDmOther(pairKey)
{
	var arr = pairKey.split("_");
	var indSp = arr[0]; // san pham
	var indDmKhac = arr[1];  // dm khac
	
	if (checkRemoveValidate(indSp, indDmKhac) == false)
	{
		return;
	}

	var div_next = '#div_uploadDocOther_' + indSp + '_' + indDmKhac;
	if ($(div_next) != null)
	{
		//alert(div_next);
		$(div_next).remove();

		//after removing: store imtems removed
		var items = $('#itemRemovedOtherArr_' + indSp).val();
		items = items + "," + indDmKhac;
//		alert(items);
		$('#itemRemovedOtherArr_' + indSp).val(items);

		// Hidden image previous add  button
		for (var i = count_other; i >= 1; i --)
			{
				var idAddImg = "#imgAddOther_" + indSp + "_" + i;
				if ($(idAddImg).length > 0)
				{
					$(idAddImg).css('display','inline');
					break;
				}
			}
/*		
		for (var i = count_other; i >= 1; i --)
		{
			var idAddImg = "#imgAddOther_" + indSp + "_" + i;
			alert(idAddImg);
			if (i < count_other){
				$(idAddImg).css('display','none');
			}else {
				$(idAddImg).css('display','inline');
			}
			if ($(idAddImg).length > 0)
			{
				//$(idAddImg).css('display','inline');
				//break;
			}
		}
		*/
	}
	
}

function checkRemoveValidate(indSp, indDmKhac)
{
	var message = "Không thể loại bỏ được ít nhất 1 danh mục khác này.";
	var count = 0;
	for (var i = 1; i <= count_other; i ++)
	{
		var div = "#div_uploadDocOther_" + indSp + "_" + i;
		if ($(div).length > 0)
		{
			count ++;
		}
	}

	if (count == 1)
	{
		alert(message);
		return false;
	}
	
	return true;
}
</script>
