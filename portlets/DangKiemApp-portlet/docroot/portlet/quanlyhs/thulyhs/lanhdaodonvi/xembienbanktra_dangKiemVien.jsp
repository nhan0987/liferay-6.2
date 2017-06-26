<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.document.DocumentUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach"%>
<%@page import="vn.dtt.gt.dk.utils.format.FormatData"%>
<%@page import="java.util.UUID"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"%>
<%@page import="vn.dtt.gt.dk.portlet.business.LapBanDangKyBusiness"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@page import="vn.dtt.gt.dk.portlet.business.LanhDaoPhongBusiness"%>
<%@page import="vn.dtt.gt.dk.portlet.business.BienBanKiemTraBusiness"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoAction"%>

<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/dangkiemvien/initDangKiemVien.jsp"%>
<% long javaScriptLastModified = ServletContextUtil.getLastModified(application, "/js/", true); %>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/dangkiemvien-duocPhanCong.css">
<script type="text/javascript" src='<%= PortalUtil.getStaticResourceURL(request, request.getContextPath() + "/js/suabienbanktra_dangKiemVien.js", javaScriptLastModified) %>'></script>

<%
PortletURL renderBackURL = renderResponse.createRenderURL();
renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_hoso_soatxet.jsp");
final String parttern = "#index#"; 
String wildcard = parttern;

//count
int countOther = 0;
int countThongTinKhac=0;
int demSoThongTinKhac = 1;

	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==start==/suabienbanktra_dangKiemVien.jsp=");

	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	
	long idPhieuXyLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
	
	long idPhieuXyLyPhuBBLT = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU_BBLT);
	long confirmedInspectionId = 0;
	
	//idInspectionRecord -> phieuXuLyPhu
	long idInspectionRecord = ParamUtil.getLong(request, Constants.ID_INSPECTION_RECORD);
	long idVehicleGroup = ParamUtil.getLong(request, Constants.ID_VEHICLE_GROUP);
	long idVehicleGroupInitial = ParamUtil.getLong(request, Constants.ID_VEHICLE_GROUP_INITIAL);
	
	//long idConfirmedInspection = ParamUtil.getLong(request, Constants.ID_CONFIRMED_INSPECTION);
	
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==idHoSoThuTuc==" + idHoSoThuTuc);
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==idthuTucHanhChinh==" + idthuTucHanhChinh);
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==idPhieuXyLyPhu==" + idPhieuXyLyPhu);
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==confirmedInspectionId==" + confirmedInspectionId);
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==idInspectionRecord==" + idInspectionRecord);
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==idVehicleGroup==" + idVehicleGroup);
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==idVehicleGroupInitial==" + idVehicleGroupInitial);
	
	InspectionRecord inspectionRecord = null;
	if (idPhieuXyLyPhu == 0 && idInspectionRecord > 0) {
		inspectionRecord = InspectionRecordLocalServiceUtil.fetchInspectionRecord(idInspectionRecord);
	} else {
		inspectionRecord = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXyLyPhu);
	}
	if (Validator.isNull(inspectionRecord)) {
		inspectionRecord = new InspectionRecordImpl();
	}
	
	ConfirmedInspection confirmedInspection = null;
	confirmedInspection = ConfirmedInspectionLocalServiceUtil.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
	if (confirmedInspection == null) {
		confirmedInspection = new ConfirmedInspectionImpl();
	}
	
	if (confirmedInspection != null) {
		confirmedInspectionId = confirmedInspection.getId();
	}
	
	//RegisteredInsepction lay theo ConfirmedInspection.registeredinspectionid hoac theo idHoSoThuTuc
	RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(ConvertUtil.convertToLong(idHoSoThuTuc));
	if (registeredInspection == null) {
		registeredInspection = new RegisteredInspectionImpl();
	}
	
	long userId = PortalUtil.getUserId(request);
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==userId==" + userId);
	
	TaoCauTrucSoDkAcBB taoCauTrucSoDangKi = new TaoCauTrucSoDkAcBB();
	
	String dangKiemVienChinh = "";
	String dangKiemVienPhu = "";
	CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
	
	String maNhanVien = (corporationInspector != null) ? corporationInspector.getContactcode() : "";
	
	///////// Danh sach Dang Kiem Vien
	List<CorporationAttendee> listDKVChinhs =
		CorporationAttendeeLocalServiceUtil.findByConfirmedInspectionIdAndInspectorRole(inspectionRecord.getConfirmedInspectionId(), 1);
	if (listDKVChinhs != null && listDKVChinhs.size() > 0) {
		dangKiemVienChinh = listDKVChinhs.get(0).getInspectorName();
	}
	List<CorporationAttendee> listDKVPhoiHops =
		CorporationAttendeeLocalServiceUtil.findByConfirmedInspectionIdAndInspectorRole(inspectionRecord.getConfirmedInspectionId(), 2);
	if (listDKVPhoiHops != null && listDKVPhoiHops.size() > 0) {
		for (CorporationAttendee item : listDKVPhoiHops) {
			dangKiemVienPhu = dangKiemVienPhu + item.getInspectorName() + "; ";
		}
	}
	
	VehicleGroupInitial vehicleGroupInitial = new VehicleGroupInitialImpl();
	try {
		vehicleGroupInitial = VehicleGroupInitialLocalServiceUtil.fetchVehicleGroupInitial(idVehicleGroupInitial);
	} catch (Exception e) {
		vehicleGroupInitial = new VehicleGroupInitialImpl();
	}
	if (Validator.isNull(vehicleGroupInitial)) { vehicleGroupInitial = new VehicleGroupInitialImpl(); }
	
	VehicleGroup vehicleGroup = new VehicleGroupImpl();
	try {
		vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(idVehicleGroup);
	} catch (Exception e) {
		vehicleGroup = new VehicleGroupImpl();
	}
	if (Validator.isNull(vehicleGroup)) { vehicleGroup = new VehicleGroupImpl(); }
	
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==vehicleGroupInitial==Id==" + vehicleGroupInitial.getId());
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==vehicleGroup=========Id==" + vehicleGroup.getId());
	
	//List<VehiclerecordInitial> lstVehiclerecordInitial = VehiclerecordInitialLocalServiceUtil.findByVehicleGroupId(vehicleGroupInitial.getId());
	//if (lstVehiclerecordInitial == null) { lstVehiclerecordInitial = new ArrayList<VehiclerecordInitial>(); }
	
	CustomsDeclaration customsDeclaration = null;
	CustomsDeclaration customsDeclarationEdit = null;
	try {
		if ((confirmedInspection != null) && (confirmedInspection.getCustomsDeclarationId() > 0) ){
			customsDeclaration = CustomsDeclarationLocalServiceUtil.getCustomsDeclaration(confirmedInspection.getCustomsDeclarationId());	
		}
		
	} catch (Exception e) {
		customsDeclaration = null;
	}
	
	try {
		if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0) ){
			customsDeclarationEdit = CustomsDeclarationLocalServiceUtil.getCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());	
		}
		
	} catch (Exception e) {
		customsDeclarationEdit = null;
	}
	
	List<DmDataItem> lstLuaChonKetQua = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.EVALUATION_RESULT);
	if (lstLuaChonKetQua == null) { lstLuaChonKetQua = new ArrayList<DmDataItem>(); }
	
	List<DmDataItem> lstTinhTrangPhuongTien = DmDataItemLocalServiceUtil.findByDataGroupId(ReportConstant.USAGE);
	if (lstTinhTrangPhuongTien == null) { lstTinhTrangPhuongTien = new ArrayList<DmDataItem>(); }
	
	
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==VehicleClass==========" + vehicleGroupInitial.getVehicleClass());
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==inspectionRecord==Id==" + inspectionRecord.getId());
	
	List<VehicleRecord> lstVehicleRecord = new ArrayList<VehicleRecord>();
	int soXeDKKT = 0;
	if (inspectionRecord != null) {
		lstVehicleRecord = VehicleRecordLocalServiceUtil.findByInspectionRecordIdOrderbyAsc(inspectionRecord.getId());
		soXeDKKT = lstVehicleRecord.size();
		//soXeDKKT = lstVehiclerecordInitial.size();
	}
	
	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) { }

	//-------------- phan nhom ho so
	String idPhanNhomHoSo = "";
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MAPHANNHOMHOSO);
		if (obj != null) {
			idPhanNhomHoSo = obj.toString();
		} else {
			idPhanNhomHoSo = "";
		}
	}
%>

<style>
span {white-space: normal !important;}
ul.tabs li.current {background: #95B0E8;}
ul.tabs li {background: rgb(223, 223, 223);}
.text-center , .text-left{padding-top: 10px;}
.titleNoiDung {float: left;text-align: center;padding: 1% 1% 1% 0;width: 100%;font-weight: bold;font-size: 15px;}
.width100 {width:  100%;}
.selectLuaChonKetQua {height: 30px}
.bold {font-weight: :bold;}
.thTblThongTinChung{font-size: 13px;background-color: #f4f4f4;font-weight: bold;text-align: center;}
</style>


<!-- START - man hinh duoc phan cong -->


<!-- -----LAP BIEN BAN KIEM TRA ----->
<%
	PortletURL urlDuocPhanCongDangKiemVien = renderResponse.createActionURL();
	urlDuocPhanCongDangKiemVien.setParameter(ActionRequest.ACTION_NAME, "suaBienBanKiemTra");
	urlDuocPhanCongDangKiemVien.setParameter(Constants.BUTTON_TYPE, "SuaBienBanKiemTra");
	urlDuocPhanCongDangKiemVien.setParameter("formDate", UUID.randomUUID().toString());
	urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(idHoSoThuTuc));
	urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(idPhieuXyLyPhu));
	urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_PHIEU_XU_LY_PHU_BBLT, StringUtil.valueOf(idPhieuXyLyPhuBBLT));
	urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_CONFIRMED_INSPECTION, StringUtil.valueOf(confirmedInspectionId));
	urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_VEHICLE_GROUP, StringUtil.valueOf(idVehicleGroup));
	urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_VEHICLE_GROUP_INITIAL, StringUtil.valueOf(idVehicleGroupInitial));
	urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_INSPECTION_RECORD, StringUtil.valueOf(idInspectionRecord));
	urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_REGISTERED_INSPECTION, StringUtil.valueOf(registeredInspection.getId()));
	urlDuocPhanCongDangKiemVien.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	urlDuocPhanCongDangKiemVien.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID ,StringUtil.valueOf(idthuTucHanhChinh));
	
	PortletURL urlBienBanLuuTam = renderResponse.createActionURL();
	urlBienBanLuuTam.setParameter(ActionRequest.ACTION_NAME, "suaBienBanKiemTra");
	urlBienBanLuuTam.setParameter(Constants.BUTTON_TYPE, "BienBanLuuTam");
	urlBienBanLuuTam.setParameter("formDate", UUID.randomUUID().toString());
	urlBienBanLuuTam.setParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(idHoSoThuTuc));
	urlBienBanLuuTam.setParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(idPhieuXyLyPhu));
	urlBienBanLuuTam.setParameter(Constants.ID_PHIEU_XU_LY_PHU_BBLT, StringUtil.valueOf(idPhieuXyLyPhuBBLT));
	urlBienBanLuuTam.setParameter(Constants.ID_CONFIRMED_INSPECTION, StringUtil.valueOf(confirmedInspectionId));
	urlBienBanLuuTam.setParameter(Constants.ID_VEHICLE_GROUP, StringUtil.valueOf(idVehicleGroup));
	urlBienBanLuuTam.setParameter(Constants.ID_VEHICLE_GROUP_INITIAL, StringUtil.valueOf(idVehicleGroupInitial));
	urlBienBanLuuTam.setParameter(Constants.ID_INSPECTION_RECORD, StringUtil.valueOf(idInspectionRecord));
	urlBienBanLuuTam.setParameter(Constants.ID_REGISTERED_INSPECTION, StringUtil.valueOf(registeredInspection.getId()));
	urlBienBanLuuTam.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	urlBienBanLuuTam.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID ,StringUtil.valueOf(idthuTucHanhChinh));
	
	PortletURL urlLapBienBanKiemTra = renderResponse.createActionURL();
	urlLapBienBanKiemTra.setParameter(ActionRequest.ACTION_NAME, "suaBienBanKiemTra");
	urlLapBienBanKiemTra.setParameter(Constants.BUTTON_TYPE, "LapBienBanKiemTra");
	urlLapBienBanKiemTra.setParameter("formDate", UUID.randomUUID().toString());
	urlLapBienBanKiemTra.setParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(idHoSoThuTuc));
	urlLapBienBanKiemTra.setParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(idPhieuXyLyPhu));
	urlLapBienBanKiemTra.setParameter(Constants.ID_PHIEU_XU_LY_PHU_BBLT, StringUtil.valueOf(idPhieuXyLyPhuBBLT));
	urlLapBienBanKiemTra.setParameter(Constants.ID_CONFIRMED_INSPECTION, StringUtil.valueOf(confirmedInspectionId));
	urlLapBienBanKiemTra.setParameter(Constants.ID_VEHICLE_GROUP, StringUtil.valueOf(idVehicleGroup));
	urlLapBienBanKiemTra.setParameter(Constants.ID_VEHICLE_GROUP_INITIAL, StringUtil.valueOf(idVehicleGroupInitial));
	urlLapBienBanKiemTra.setParameter(Constants.ID_INSPECTION_RECORD, StringUtil.valueOf(idInspectionRecord));
	urlLapBienBanKiemTra.setParameter(Constants.ID_REGISTERED_INSPECTION, StringUtil.valueOf(registeredInspection.getId()));
	urlLapBienBanKiemTra.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
	urlLapBienBanKiemTra.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID ,StringUtil.valueOf(idthuTucHanhChinh));

%>
<div id="cot2" class="col-xs-12 col-sm-12 col-md-12"><div id="main" class="col-md-12">

<div id="divLapBienBanKiemTra">
<aui:form action="<%=urlDuocPhanCongDangKiemVien.toString()%>" name="formDuocPhanCongDangKiemVien" id="formDuocPhanCongDangKiemVien" method="POST" enctype="multipart/form-data">
	
	<!-- dung js set o? dong 25 - 35 
	<input type="text" hidden="true" id="lap_bien_ban_kt_id_vehicle_group" name="lap_bien_ban_kt_id_vehicle_group" value=""/>
	-->
	
<div style="width: 30px">&nbsp</div>
<div class="container" style="width: 100%; margin: 0px; padding: 0px;">
	<ul class="tabs">
		<li class="tab-link current" data-tab="tab-1">Thông tin chung</li>
		<li class="tab-link" data-tab="tab-2">Kiểm tra Chất lượng an toàn KTVBVMT</li>
	</ul>
	
	<!------------------------------------------------------------------- START Tab1 ---------------------------------------->
	<div id="tab-1" class="tab-content current">
		<!-- ------------------------------------------------------------- Thong tin chung ------------------------------ -->
		<div id="u6148" style="position: absolute; left: 0px; width: 100%; padding-left: 1.4%;padding-top: 0%;">
			<img alt="" src="<%=request.getContextPath()%>/img/under_line_image.png" class="" style="position: relative;left: 0px;top: -8px;width: 99%;height: 5px;">
		</div>
		<div style="width: 10px">&nbsp</div>
		
		
		<!------------------ Noi dung kiem tra ------------------>
		<div id="divNoiDungKiemTra">
			<%
			DmDataItem doiKiemTra =  DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.CORPORATION, confirmedInspection.getCorporationId());
			if(vehicleGroupInitial != null && vehicleGroupInitial.getVehicleClass().equalsIgnoreCase("XMY")) {
				%>
				<div id="divTitleBienBanKiemTra" class="titleNoiDung">Biên Bản Kiểm Tra Xe Mô Tô – Xe Gắn Máy Nhập Khẩu</div>
				<%
			} else if(vehicleGroupInitial != null && vehicleGroupInitial.getVehicleClass().equalsIgnoreCase("DCX")){
				%>
				<div id="divTitleBienBanKiemTra" class="titleNoiDung">Biên Bản Kiểm Tra Động Cơ Xe Mô Tô – Xe Gắn Máy Nhập Khẩu</div>
				<%
			} else if(vehicleGroupInitial != null && vehicleGroupInitial.getVehicleClass().equalsIgnoreCase("XDD")){
				%>
				<div id="divTitleBienBanKiemTra" class="titleNoiDung">Biên Bản Kiểm Tra Xe Đạp Điện Nhập Khẩu</div>
				<%
			} else if(vehicleGroupInitial != null && vehicleGroupInitial.getVehicleClass().equalsIgnoreCase("XCG")){
				%>
				<div id="divTitleBienBanKiemTra" class="titleNoiDung">Biên Bản Kiểm Tra Xe Cơ Giới Nhập Khẩu</div>
				<%
			} else if(vehicleGroupInitial != null && vehicleGroupInitial.getVehicleClass().equalsIgnoreCase("XCD")){
				%>
				<div id="divTitleBienBanKiemTra" class="titleNoiDung">Biên Bản Kiểm Tra Xe Máy Chuyên Dùng Nhập Khẩu</div>
				<%
			} else if(vehicleGroupInitial != null && vehicleGroupInitial.getVehicleClass().equalsIgnoreCase("XBB")){
				%>
				<div id="divTitleBienBanKiemTra" class="titleNoiDung">Biên Bản Kiểm Tra Xe Bốn Bánh Có Gắn Động Cơ Nhập Khẩu</div>
				<%
			}
			%>
			<div id="divTitleDoiKiemTra" style="float: left;text-align: center;padding: 1% 1% 1% 0;width: 100%;font-size: 14px;">
				Đội Kiểm Tra Khu Vực : <%=(doiKiemTra != null) ? doiKiemTra.getName() : ""%>
				<% if (doiKiemTra != null) {
					%>
					<input type="hidden" id="tenDoiKiemTra" name="tenDoiKiemTra" value="<%=doiKiemTra.getName()%>"/>
					<%
				} else {
					%>
					<input type="hidden" id="tenDoiKiemTra" name="tenDoiKiemTra"/>
				<%}%>
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
							id="soBienBanKiemTra" name="soBienBanKiemTra" value="<%=Validator.isNotNull(inspectionRecord) ? inspectionRecord.getInspectionRecordNo() : ""%>"/>
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
				
				<!---------------------------- ngay kiem tra thuc te ------------------------>
				<div class="row">
					<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;"><label class="textlabel">Ngày kiểm tra thực tế</label></div>
					<%
					String ngayKiemTraTuNgay = "";
					if (inspectionRecord.getInspectionDateFrom() != null) {
						//ngayKiemTraTuNgay = inspectionRecord.getInspectionDateFrom().after(new Date()) ? DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) : DateUtils.dateToString("dd/MM/yyyy HH:mm", inspectionRecord.getInspectionDateFrom());
						ngayKiemTraTuNgay = FormatData.parseDateToTringType3(inspectionRecord.getInspectionDateFrom());
					}
					String ngayKiemTraDenNgay = "";
					if(inspectionRecord.getInspectionDateTo() != null){
						//ngayKiemTraDenNgay = inspectionRecord.getInspectionDateTo().after(new Date()) ? DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) : DateUtils.dateToString("dd/MM/yyyy HH:mm", inspectionRecord.getInspectionDateTo());
						ngayKiemTraDenNgay = FormatData.parseDateToTringType3(inspectionRecord.getInspectionDateTo());
					}
					%>
					<div class="col-xs-10 col-sm-10 col-md-10" style="width: 65%;">
						<!-- ngay ktra thuc te tu ngay -->
						<div style="float: left; text-align: left; width: 49%; padding: 1% 1% 1% 0;">
							<label class="textlabel" style="float: left; margin-right: 2px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.tungay"/>&nbsp<span style="color: red;">(*)</span></label>
							<input type="text" style="width: 150px; float: left; background-color: white; cursor: pointer;" class="form-control-find-calendar" readonly="readonly"
								id="ngayKiemTraTuNgay" name="ngayKiemTraTuNgay" value="<%=ngayKiemTraTuNgay%>" onclick="gtCalendar('ngayKiemTraTuNgay')"/>
							<span class="input-group-btn" style="float: left;">
								<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayKiemTraTuNgay')"><i class="fa fa-calendar"></i></button>
							</span>
						</div>
						
						<!-- ngay ktra thuc te den ngay -->
						<div style="float: left; text-align: left; width: 49%; padding: 1% 1% 1% 0;">
							<label class="textlabel" style="float: left; margin-right: 2px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.denngay"/>&nbsp<span style="color: red;">(*)</span></label>
							<input type="text" style="width: 150px; float: left; background-color: white; cursor: pointer;" class="form-control-find-calendar" readonly="readonly"
								id="ngayKiemTraDenNgay" name="ngayKiemTraDenNgay" value="<%=ngayKiemTraDenNgay%>" onclick="gtCalendar('ngayKiemTraDenNgay')" />
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
								<option value="<%=item.getCode0()%>" <%=BienBanKiemTraBusiness.isChonPhuongThucKiemTra(item.getCode0(), String.valueOf(inspectionRecord.getInspectionMode()))%>><%=item.getName() %></option>
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
		LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==VehicleClass==" + vehicleGroupInitial.getVehicleClass() + "==idInspectionRecord==" + idInspectionRecord);
		
		List<InspectionCommonStatus> lstThongTinChung = InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroupInitial.getVehicleClass(), 1, idInspectionRecord);
		if (Validator.isNull(lstThongTinChung)) { lstThongTinChung = new ArrayList<InspectionCommonStatus>(); }
		
		LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==I, THONG TIN CHUNG==lstThongTinChung==size==" + lstThongTinChung.size());
		%>
		
			<table style="width: 100%;" id="tblThongTinChungRegisteredInspection" class="wd-table table">
				<thead>
					<tr>
						<th class="text-center bold thTblThongTinChung" style="width: 6%;">TT</th>
						<th class="text-center bold thTblThongTinChung" style="width: 22%;">Nội dung</th>
						<th class="text-center bold thTblThongTinChung" style="width: 28%;">Thông tin khai báo/đề nghị/tham chiếu</th>
						<th class="text-center bold thTblThongTinChung" style="width: 28%;">Thông tin bổ sung sửa đổi</th>
						<th class="text-center bold thTblThongTinChung" style="height: 40px;">Kết luận</th>
					</tr>
				</thead>
				<tbody>
				<%
				String listSoKhungSuaDoi = "";
				String listSoDongCoSuaDoi = "";
				String listMauXeSuaDoi = "";
				String listNamSanXuatXeSuaDoi = "";
				String listTinhTrangPhuongTienSuaDoi = "";
				
				if (lstThongTinChung != null && lstThongTinChung.size() > 0) {
					int stt = 0;
					for (InspectionCommonStatus itemTTC: lstThongTinChung) {
						stt++;
						
						String giaTriKhaiBaoInitalValue = BienBanKiemTraBusiness.getValueThongTinChungInital(vehicleGroupInitial, registeredInspection, customsDeclaration, itemTTC.getCommonCode(), lstVehicleRecord);
						//String giaTriKhaiBaoInitalCode = BienBanKiemTraBusiness.getCodeThongTinChungInital(vehicleGroupInitial, registeredInspection, customsDeclaration, itemTTC);
						
						String giaTriSuaDoiValue = BienBanKiemTraBusiness.getValueThongTinChungSuaDoi(vehicleGroup, registeredInspection, customsDeclarationEdit, itemTTC, lstVehicleRecord);
						String giaTriSuaDoiCode = BienBanKiemTraBusiness.getCodeThongTinChungSuaDoi(vehicleGroup, registeredInspection, customsDeclarationEdit, itemTTC, lstVehicleRecord);
				%>
					<tr id="trtblThongTinChung<%=stt%>" <%=(itemTTC.getAllowEdit() == 1) ? (BienBanKiemTraBusiness.checkColorTrTable(itemTTC.getCommonStatus() + "")) : ""%>>
						<td class="text-center" style="height: 30px;"><span>1.<%=stt %></span></td>
						<td class="text-left paddingLeft05"><span><%=itemTTC.getGroupName() %></span></td>
						
						<!--------------- Thông tin khai báo/đề nghị/tham chiếu --------------->
						<td class="text-left paddingLeft05">
							<%
							if (itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_21") || itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_22") ||
								itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_23") || itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_24") ||
								itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_25") || itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_26")) {
								%>
								<div id="div_view_<%=itemTTC.getCommonCode()%>" style="text-align:center;">
								<%
								String[] arrayGiaTriKhaiBao = giaTriKhaiBaoInitalValue.split(",");
								for (int i = 0; i < arrayGiaTriKhaiBao.length; i++) {
								%>
									<%=arrayGiaTriKhaiBao[i]%><br>
								<%}%>
								</div>
								<input type="text" id="giaTriDangKiTTC<%=stt%>" name="<%=itemTTC.getCommonCode() %>" value="<%=giaTriKhaiBaoInitalValue%>" style="display: none !important" />
								<input type="hidden" id="giaTriDangKyCodeTTC<%=stt%>" value="<%=giaTriKhaiBaoInitalValue%>" />
								<%
							} else {
								%>
								<input type="text" class="textNone textBound" readonly="readonly"
									id="giaTriDangKiTTC<%=stt%>" name="<%=itemTTC.getCommonCode()%>" value="<%=giaTriKhaiBaoInitalValue%>"
									<%=(itemTTC.getAllowEdit() == 1) ? (BienBanKiemTraBusiness.checkColorGiaTriKiemTraTTC(itemTTC.getCommonStatus())) : ""%>/>
								<input type="hidden" id="giaTriDangKyCodeTTC<%=stt%>" value="<%=giaTriSuaDoiCode%>" />
								<%
							}
							%>
						</td>
						
						<!----------------- Thông tin bổ sung sửa đổi, id su dung js, name for theo db o duoi --------->
						<td class="text-left paddingLeft05">
							<%
							if (itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_21") || itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_22") ||
								itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_23") || itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_24") ||
								itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_25") || itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_26")) {
								
								if (itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_22")) {
									listSoKhungSuaDoi = giaTriSuaDoiValue;
								} else if (itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_23")) {
									listSoDongCoSuaDoi = giaTriSuaDoiValue;
								} else if (itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_24")) {
									listTinhTrangPhuongTienSuaDoi = giaTriSuaDoiValue;
								} else if (itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_25")) {
									listNamSanXuatXeSuaDoi = giaTriSuaDoiValue;
								} else if (itemTTC.getCommonCode().equalsIgnoreCase("TTC_1_26")) {
									listMauXeSuaDoi = giaTriSuaDoiValue;
								}
								
								%>
								<div id="div_view_giaTriKiemTraTTC<%=itemTTC.getCommonCode()%>" style="text-align:center;">
								<%
								String[] arrayGiaTriCode = giaTriSuaDoiValue.split(",");
								for (int i = 0; i < arrayGiaTriCode.length; i++) {
								%>
									<%=arrayGiaTriCode[i]%><br>
								<%}%>
								</div>
								<input type="text" id="giaTriKiemTraTTC<%=stt%>" name="giaTriKiemTraTTC<%=itemTTC.getCommonCode()%>" value="<%=giaTriSuaDoiValue%>" style="display: none !important"/>
								<%
							} else {
								%>
								<input type="text" class="textNone textBound" readonly="readonly"
									id="giaTriKiemTraTTC<%=stt%>" data-thamchieuttcvalue="<%= itemTTC.getCommonCode() %>" name="giaTriKiemTraTTC<%=itemTTC.getCommonCode()%>" value="<%=giaTriSuaDoiValue%>"
									<%=(itemTTC.getAllowEdit() == 1) ? (BienBanKiemTraBusiness.checkColorSuaDoi(itemTTC.getCommonStatus())) : ""%>/>
								<%
							}
							%>
							
							<input type="hidden" id="giaTriDmTTC<%=stt%>" value="<%=BienBanKiemTraBusiness.isDanhMuc(itemTTC.getCommonCode()) %>" />
							<input type="hidden" id="giaTriCodeTTC<%=stt%>" name="giaTriCodeTTC<%=itemTTC.getCommonCode()%>" value="<%=giaTriSuaDoiCode%>" />
							<input type="hidden" id="giaTriCodeTTC_SuaDoi<%=itemTTC.getCommonCode()%>" data-thamchieuttccode="<%= itemTTC.getCommonCode() %>" name="giaTriCodeTTC_SuaDoi<%=itemTTC.getCommonCode()%>" value="<%=giaTriSuaDoiCode%>" />
						</td>
						
						<td class="text-left paddingLeft05">
						<%
						if (itemTTC.getAllowEdit() == 1 ) {
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
							<input type="hidden" id="thamChieu<%=itemTTC.getCommonCode()%>" data-thamchieucode="giaTriCodeTTC_SuaDoi<%=itemTTC.getCommonCode()%>" data-thamchieuvalue="giaTriKiemTraTTC<%=stt%>" data-thamchieucodettc="giaTriCodeTTC<%=stt%>"/>
							
							<select id="selLuaChonTTC<%=stt%>" name="selLuaChonTTC<%=stt%>" class="form-control-find <%= classThamChieuAct %>"
									onclick="checkSelLuaChonThongTinChung('<%=stt%>', '<%=itemTTC.getCommonCode()%>')"
									<%=BienBanKiemTraBusiness.checkColorSelLuaChon(itemTTC.getCommonStatus())%>>
								<option value="0" selected="selected">Chưa quyết định</option>
								<%for (DmDataItem item : lstLuaChonKetQua) {%>
									<option value="<%=item.getCode0()%>"
										<%=BienBanKiemTraBusiness.checkIsDat(itemTTC.getCommonStatus() + "", item.getCode0())%>
										<%=BienBanKiemTraBusiness.getDisplayTTC(itemTTC.getCommonCode(), item.getCode0())%>
									>
										<%=item.getName()%>
									</option>
								<%}%>
							</select>
						<%} %>
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
		DmDataItem dataItemNhanHieu = null;
		try {
			//dataItemNhanHieu = DmDataItemLocalServiceUtil.getDmDataItem(ConvertUtil.convertToLong(veGroup.getTradeMark()));
			dataItemNhanHieu = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.TRADE_MARK, vehicleGroupInitial.getTradeMark());
		} catch (Exception e) { dataItemNhanHieu = null; }
		
		
		String tenNhanHieuPhuongTien = (dataItemNhanHieu != null) ? dataItemNhanHieu.getName() : vehicleGroupInitial.getTradeMark();
		String soLoaiPhuongTien = (vehicleGroupInitial != null) ? vehicleGroupInitial.getCommercialName() : "";
		String soThamChieuPhuongTien = vehicleGroupInitial != null ? vehicleGroupInitial.getReferenceCertificateNo() : "";
		%>
		
		<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 87%; margin-top: 1%;"><span class="bold">II. Danh sách phương tiện kiểm tra :</span></div>
		<div style="float: left; text-align: left; padding: 1% 1% 1% 0; margin-top: 1%;"><span class="bold">Số lượng PT ĐNKT: </span><span class="bold" id="soLgPtDnkt"><%=soXeDKKT %></span></div>
		<input type="hidden" id="soPhuongTienKiemTraBanDau" name="soPhuongTienKiemTraBanDau" value="<%=soXeDKKT%>">
		<div style="clear:both;"></div>
		<!-- II. Danh sách phương tiện kiểm tra : -->
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
			<table style="width: 100%;" id="tblDanhSachPhuongTienKiemTra" class="wd-table table">
				<thead>
					<tr>
						<th class="text-center bold" style="font-size: 13px;width: 6%;">STT</th>
						<th class="text-center bold" style="font-size: 13px;">Chọn<br>xe mẫu</th>
						<th class="text-center bold" style="font-size: 13px;">Nhãn hiệu<br>Số loại</th>
						<th class="text-center bold" style="font-size: 13px;">Số VIN</th>
						<th class="text-center bold" style="font-size: 13px;">Số khung<br>Số động cơ</th>
						<th class="text-center bold" style="font-size: 13px;">Tình trạng</th>
						<th class="text-center bold" style="font-size: 13px;">Năm sản xuất</th>
						<th class="text-center bold" style="font-size: 13px;">Màu xe</th>
						<th class="text-center bold" style="font-size: 13px;width: 9%;">Thao tác</th>
					</tr>
				</thead>
				<tbody>
				<% 
				boolean flagXeViewLanDau = true;
				int soXe = 0;
				
				String danhSachVehicleRecord = "";
				String listVehicleRecordMau = "";
				String listSoKhungMau = "";
				String listSoDongCoMau = "";
				String listSoVinMau = "";
				String listTinhTrangPhuongTienMau = "";
				String listNamSXXeMau = "";
				String listMauXeMau = "";
				
				
				
				if (lstVehicleRecord != null && lstVehicleRecord.size() > 0) {
					String nhanHieuSoLoai = "";
					String loai = "";
					for (VehicleRecord record :lstVehicleRecord) {
						VehiclerecordInitial vehiclerecordInitial = VehiclerecordInitialLocalServiceUtil.fetchVehiclerecordInitial(record.getId());
						soXe++;
						String tinhTrangPhuongTienInitial = CommonUtils.getTinhTrangTblThongTinNhomXeNk(vehiclerecordInitial.getVehicleEngineStatus());
						String tinhTrangPhuongTien = CommonUtils.getTinhTrangTblThongTinNhomXeNk(record.getVehicleEngineStatus());
						int markAsSample = BienBanKiemTraBusiness.checkIsMarkAsSampleInt(record.getMarkAsSample(), flagXeViewLanDau, 1);
						danhSachVehicleRecord = danhSachVehicleRecord + record.getId() + ",";
						if (markAsSample == 1) {
							listVehicleRecordMau = listVehicleRecordMau + record.getId() + ",";
							listSoKhungMau = listSoKhungMau + "#" + soXe + "--" + vehiclerecordInitial.getChassisNumber() + ",";
							listSoDongCoMau = listSoDongCoMau + "#" + soXe + "--" + vehiclerecordInitial.getEngineNumber() + ",";
							listSoVinMau = listSoVinMau + "#" + soXe + "--" + vehiclerecordInitial.getChassisNumber() + ",";
							listTinhTrangPhuongTienMau = listTinhTrangPhuongTienMau + "#" + soXe + "--" + tinhTrangPhuongTienInitial + ",";
							listNamSXXeMau = listNamSXXeMau + "#" + soXe + "--" + vehiclerecordInitial.getProductionYear() + ",";
							listMauXeMau = listMauXeMau + "#" + soXe + "--" + vehiclerecordInitial.getVehicleColor() + ",";
						}
						
				%>
				<tr class="rowTblDanhSachPhuongTienKiemTra<%=soXe%>">
					<td class="text-center"><%=soXe %></td>
					<td class="text-center">
						<input type="checkbox" onchange="onChangeValueVehicleRecordMau(<%=soXe %>)"
							id="vehicleRecordMau<%=soXe%>" name="vehicleRecordMau" class="cbVehicleRecord" value="<%=record.getId() + ":" + soXe%>"
							<%=BienBanKiemTraBusiness.checkIsXeMau(record.getMarkAsSample(), flagXeViewLanDau, 1)%>/>
						
						<input type="hidden" id="idVehicleRecordMau<%=soXe%>" name="idVehicleRecordMau<%=soXe%>" value="<%=record.getId()%>"/>
						<input type="hidden" id="soKhungMau<%=soXe%>" name="soKhungMau<%=soXe%>" value="<%=record.getChassisNumber()%>"/>
						<input type="hidden" id="soVinMau<%=soXe%>" name="soVinMau<%=soXe%>" value="<%=record.getChassisNumber()%>"/>
						
						<input type="hidden" id="soDongCoMau<%=soXe%>" name="soDongCoMau<%=soXe%>" value="<%=vehiclerecordInitial.getEngineNumber()%>"/>
						<input type="hidden" id="tinhTrangPhuongTienMau<%=soXe%>" name="tinhTrangPhuongTienMau<%=soXe%>" value="<%=tinhTrangPhuongTienInitial%>"/>
						<input type="hidden" id="mauXeMau<%=soXe%>" name="mauXeMau<%=soXe%>" value="<%=vehiclerecordInitial.getVehicleColor()%>"/>
						<input type="hidden" id="namSXXeMau<%=soXe%>" name="namSXXeMau<%=soXe%>" value="<%=vehiclerecordInitial.getProductionYear()%>"/>
						
						<input type="hidden" id="soKhungMauEdit<%=soXe %>" name="soKhungMauEdit<%=soXe %>" value="<%=record.getChassisNumber()%>"/>
						<input type="hidden" id="soDongCoMauEdit<%=soXe%>" name="soDongCoMauEdit<%=soXe%>" value="<%=record.getEngineNumber()%>"/>
						<input type="hidden" id="tinhTrangPhuongTienMauEdit<%=soXe%>" name="tinhTrangPhuongTienMauEdit<%=soXe%>" value="<%=record.getVehicleEngineStatus()%>"/>
						<input type="hidden" id="mauXeMauEdit<%=soXe%>" name="mauXeMauEdit<%=soXe%>" value="<%=record.getVehicleColor()%>"/>
						<input type="hidden" id="namSXXeMauEdit<%=soXe%>" name="namSXXeMauEdit<%=soXe%>" value="<%=record.getProductionYear()%>"/>
					
					</td>
					
					<td class="text-center"><%=tenNhanHieuPhuongTien %><br><%=soLoaiPhuongTien %></td>
					<td class="text-center"><%=record.getChassisNumber()%></td>
					<td class="text-center"><b><span id="soKhungMauSuaDoi<%=soXe %>"><%=record.getChassisNumber()%></span></b><br><span id="soDongCoMauSuaDoi<%=soXe %>"><%=record.getEngineNumber()%></span></td>
					<td class="text-center"><span id="tinhTrangPhuongTienMauSuaDoi<%=soXe %>"><%=tinhTrangPhuongTien%></span></td>
					<td class="text-center"><span id="namSXXeMauSuaDoi<%=soXe %>"><%=record.getProductionYear() %></span></td>
					<td class="text-center"><span id="mauXeMauSuaDoi<%=soXe %>"><%=record.getVehicleColor() %></span></td>
					<td class="text-center" id="boChon<%=soXe%>">
					
						<a 	onmouseover="onMouseOverTblDanhSachPhuongTienKiemTra('isDisplayPhuongTien<%=soXe%>')"
							onmouseout="onMouseOutTblDanhSachPhuongTienKiemTra('isDisplayPhuongTien<%=soXe%>')"
							onclick="clearOneRowTblDanhSachPhuongTienKiemTra('<%=soXe%>')"
							id="isDisplayPhuongTien<%=soXe %>"
							<%=BienBanKiemTraBusiness.checkIsXeMau(record.getMarkAsSample(), flagXeViewLanDau, 2)%>>Bỏ chọn</a>
						<br>
						<a	onmouseover="onMouseOverTblDanhSachPhuongTienKiemTra('isDisplaySuaDoi<%=soXe%>')"
							onmouseout="onMouseOutTblDanhSachPhuongTienKiemTra('isDisplaySuaDoi<%=soXe%>')"
							onclick="changeDanhSachPhuongTienKiemTra('<%=soXe%>')"
							id="isDisplaySuaDoi<%=soXe %>"
							<%=BienBanKiemTraBusiness.checkIsXeMau(record.getMarkAsSample(), flagXeViewLanDau, 2)%>>Sửa đổi</a>
					</td>
				</tr>
				<%		}
					flagXeViewLanDau = false;
				}
				%>
				<input type="text" hidden="true" id="soXeVehicleRecord" name="soXeVehicleRecord" value="<%=soXe%>"/>
				</tbody>
			</table>
			<div style="width:0%">
				<input type="hidden" id="danhSachVehicleRecordBoChon" name="danhSachVehicleRecordBoChon" />
				<input type="hidden" id="danhSachVehicleRecord" name="danhSachVehicleRecord" value="<%=danhSachVehicleRecord%>" />
				<input type="hidden" id="listVehicleRecordMau" name="listVehicleRecordMau" value="<%=listVehicleRecordMau%>" />
				<input type="hidden" id="listSoKhungMau" name="listSoKhungMau"  value="<%=listSoKhungMau%>" />
				<input type="hidden" id="listSoDongCoMau" name="listSoDongCoMau" value="<%=listSoDongCoMau%>" />
				<input type="hidden" id="listSoVinMau" name="listSoVinMau" value="<%=listSoVinMau%>" />
				<input type="hidden" id="listTinhTrangPhuongTienMau" name="listTinhTrangPhuongTienMau" value="<%=listTinhTrangPhuongTienMau%>" />
				<input type="hidden" id="listNamSXXeMau" name="listNamSXXeMau" value="<%=listNamSXXeMau%>" />
				<input type="hidden" id="listMauXeMau" name="listMauXeMau" value="<%=listMauXeMau%>" />
				
				<input type="hidden" id="listSoKhungSuaDoi" name="listSoKhungSuaDoi" value="<%=listSoKhungSuaDoi%>" />
				<input type="hidden" id="listSoDongCoSuaDoi" name="listSoDongCoSuaDoi" value="<%=listSoDongCoSuaDoi%>" />
				<input type="hidden" id="listMauXeSuaDoi" name="listMauXeSuaDoi" value="<%=listMauXeSuaDoi%>" />
				<input type="hidden" id="listNamSanXuatXeSuaDoi" name="listNamSanXuatXeSuaDoi" value="<%=listNamSanXuatXeSuaDoi%>" />
				<input type="hidden" id="listTinhTrangPhuongTienSuaDoi" name="listTinhTrangPhuongTienSuaDoi" value="<%=listTinhTrangPhuongTienSuaDoi%>" />
			</div>
		</div>
		
		<div id="listFileUpload">
		<%
		List<InspectionRecordAttach> allInspectionRecordAttachs = InspectionRecordAttachLocalServiceUtil.findByInspectionRecordAttach(inspectionRecord.getId());
		if(allInspectionRecordAttachs != null && allInspectionRecordAttachs.size() >0){
		%>
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
				<table style="width: 100%;" id="tblDanhSachPhuongTienKiemTra" class="wd-table table">
					<thead>
						<tr>
							<th class="text-center bold" style="font-size: 13px;width: 6%;">STT</th>
							<th class="text-center bold" style="font-size: 13px;">Tên file đính kèm</th>
							<th class="text-center bold" style="font-size: 13px;width: 9%;">Thao tác</th>
						</tr>
					</thead>
					<tbody>
						<%
						int index = 0;
						for(InspectionRecordAttach inspectionRecordAttach : allInspectionRecordAttachs){
							if(inspectionRecordAttach.getMarkUpDelte() == 0){
								
								String urlDownload = DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(inspectionRecordAttach.getEnTryId());
							index ++;
						%>
						<tr>
							<td class="text-center"><%=index %></td>
							<td><a href="<%=urlDownload.toString()%>"><%=inspectionRecordAttach.getEnTryName() %></a></td>
							<td class="text-center"><img onclick="deleteFileUploadBBKT('<%=inspectionRecordAttach.getId()%>', '<%=inspectionRecordAttach.getInspectionRecordId() %>')" src="<%=request.getContextPath()%>/img/huy.png" /></td>
						</tr>
						<%
							}
						}
						%>
					</tbody>
					</table>
			</div>
		<%
		}
		%>
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
	
	
	<!-------START------------------------------------------  tab 2 ----------------------------------------->
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
		LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==TAB 2__2. KIỂM TRA CHẤT LƯỢNG AN==VehicleClass====" + vehicleGroupInitial.getVehicleClass() + "==idInspectionRecord==" + idInspectionRecord);
		List<InspectionCommonStatus> lstkiemTraChatLuongAnToanKt = InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroupInitial.getVehicleClass(), 2, inspectionRecord.getId());
		if (Validator.isNull(lstkiemTraChatLuongAnToanKt)) { lstkiemTraChatLuongAnToanKt = new ArrayList<InspectionCommonStatus>(); }
		
		LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==2. KIỂM TRA CHẤT LƯỢNG AN==lstkiemTraChatLuongAnToanKt==size==" + lstkiemTraChatLuongAnToanKt.size());
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
						int stt = 0;
						for (InspectionCommonStatus itemAnToanKt: lstkiemTraChatLuongAnToanKt) {
							stt++;
					%>
					<tr>
						<td class="text-center"><span id="">2.<%=stt%></span></td>
						<td class="text-left paddingLeft05"><span id=""><%=itemAnToanKt.getGroupName()%></span></td>
						<td class="text-left paddingLeft05"><span id=""><%=itemAnToanKt.getItemName()%></span></td>
						<td class="text-left paddingLeft05">
						<%if (itemAnToanKt.getAllowEdit() == 1) {%>
							<select id="selChatLuongAnToanKt<%=stt %>" name="selChatLuongAnToanKt<%=stt%>" class="form-control-find width100">
							<%
							List<DmDataItem> lstChatLuong = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.SAFETY_TEST_RESULT);
							for (DmDataItem item : lstChatLuong) {
							%>
								<option value="<%=item.getCode0()%>"
										<%=BienBanKiemTraBusiness.checkIsDat(itemAnToanKt.getCommonStatus() + "", item.getCode0())%>
										<%=BienBanKiemTraBusiness.getDisplayKTChatLuong(itemAnToanKt.getCommonCode(), item.getCode0())%>><%=item.getName()%></option>
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
		<!--END------ 2. KIỂM TRA CHẤT LƯỢNG AN TOÀN KỸ THUẬT VÀ BẢO VỆ MÔI TRƯỜNG 36 -->
		
		
		<!--START------ 3. KIỂM TRA ĐỐI CHIẾU KẾT CẤU VÀ THÔNG SỐ KỸ THUẬT CỦA XE 34 -->
		<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 100%;"><span style="font-weight: bold;">3. KIỂM TRA ĐỐI CHIẾU KẾT CẤU VÀ THÔNG SỐ KỸ THUẬT CỦA XE</span></div>
		<div style="width: 0%">&nbsp</div>
		<!-- table 2 -->
		<%
		
		LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==Tab 2-3. KIỂM TRA ==VehicleGroupInitial==Id==" + vehicleGroupInitial.getId() + "==VehicleClass====" + vehicleGroupInitial.getVehicleClass() + "==vehicleGroupInitial==VehicleType==" + vehicleGroupInitial.getVehicleType());
		LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==Tab 2-3. KIỂM TRA ==inspectionRecord==Id=====" + inspectionRecord.getId());
		
		List<VehicleSpecification> lstVehicleSpecification = VehicleSpecificationLocalServiceUtil.findByVehicleSpecificationWithVehicleGroupIdAndVehicleTypeCode(vehicleGroupInitial.getId(), vehicleGroupInitial.getVehicleClass() , vehicleGroupInitial.getVehicleType());
		//List<VehicleSpecification> lstVehicleSpecification = VehicleSpecificationLocalServiceUtil.findByVehicleGroupId(vehicleGroupInitial.getId());
		List<InspectionRecordSpec> lstInspectionRecordSpec = InspectionRecordSpecLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
		
		if (Validator.isNull(lstVehicleSpecification)) { lstVehicleSpecification = new ArrayList<VehicleSpecification>(); }
		if (Validator.isNull(lstInspectionRecordSpec)) { lstInspectionRecordSpec = new ArrayList<InspectionRecordSpec>(); }
		
		Map<String, VehicleSpecification> mapVehicleSpecification = new HashMap<String, VehicleSpecification>();
		for(VehicleSpecification vehicleSpecification : lstVehicleSpecification) {
			mapVehicleSpecification.put(StringUtil.toLowerCase(vehicleSpecification.getSpecificationCode()), vehicleSpecification);
		}
		
		LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==Tab 2-3. KIỂM TRA ==lstVehicleSpecification==size==" + lstVehicleSpecification.size());
		LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==Tab 2-3. KIỂM TRA ==lstInspectionRecordSpec==size==" + lstInspectionRecordSpec.size());
		%>
		
		<table id="tblKiemTraDoiChieuKetCauVaThongSoKtXe" style="width: 100%" border="1px">
			<thead>
				<tr>
					<td class="text-center" style="height: 40px;background-color: #f4f4f4;"><span class="bold">Hạng mục</span></td>
					<td class="text-center" style="background-color: #f4f4f4;"><span class="bold">Thông tin kiểm tra</span></td>
					<td class="text-center" style="background-color: #f4f4f4;"><span class="bold">Giá trị đăng ký</span></td>
					<td class="text-center" style="background-color: #f4f4f4;"><span class="bold">Giá trị kiểm tra</span></td>
					<td class="text-center" style="background-color: #f4f4f4;"><span class="bold">Kết quả</span></td>
				</tr>
			</thead>
			<tbody>
			<%
			int stt = 0;
			for (InspectionRecordSpec inspecRecordSpec: lstInspectionRecordSpec) {
				//if (!inspecRecordSpec.getSpecificationName().trim().equalsIgnoreCase(Constants.SPECIFICATION_NAME)) {
				stt++;
				String giaTriDangKi = BienBanKiemTraBusiness.getGiaTriDangKi(vehicleGroupInitial.getVehicleClass(), mapVehicleSpecification, inspecRecordSpec);
			%>
				<tr id="trTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=stt%>" <%=BienBanKiemTraBusiness.checkColorTab2TrTable(inspecRecordSpec.getEvaluationResult())%>>
					<td class="text-center"><span class="black" id="sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=stt%>">3.<%=stt %></span></td>
					<!-- Thông tin kiểm tra -->
					<td class="text-left paddingLeft05"><span id="sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=stt%>"><%=inspecRecordSpec.getSpecificationName() %></span></td>
					
					<td class="text-center">
						<!-- Gia tri dang ki -->
						<input type="text" class="textNone textBound" readonly="readonly" <%=BienBanKiemTraBusiness.checkColorTab2GTdangki(inspecRecordSpec.getEvaluationResult())%>
							id="giaTriDangKi_<%=stt%>" name="giaTriDangKiKetCauVaThongSoKtXe<%=stt%>" value="<%=giaTriDangKi%>"/>
							
						<input type="hidden" id="checkDmThongTinKiemTra<%=stt%>" name="checkDmThongTinKiemTra<%=stt%>" value="<%=BienBanKiemTraBusiness.checkTonTaiDanhMuc(vehicleGroupInitial.getVehicleClass(), inspecRecordSpec)%>"/>
						
						<%
						String[] arrayGiaTriSpecification = BienBanKiemTraBusiness.getCodeNameValueGiaTriDangKi(mapVehicleSpecification, inspecRecordSpec);
						if (arrayGiaTriSpecification.length > 1) {
							%>
							<input type="hidden" id="specificationname<%=stt%>" value="<%=arrayGiaTriSpecification[0]%>"/>
							<input type="hidden" id="specificationcode<%=stt%>" value="<%=arrayGiaTriSpecification[1]%>"/>
							<input type="hidden" id="giaTriDangKi<%=stt%>"  value="<%=(arrayGiaTriSpecification.length > 2) ? arrayGiaTriSpecification[2] : ""%>"/>
							<!-- name="specificationname" name="specificationcode" name="giaTriDangKiKtXe"  -->
							<%
						} else {
							%>
							<input type="hidden" id="specificationname<%=stt%>" name="specificationname" value=""/>
							<input type="hidden" id="specificationcode<%=stt%>" name="specificationcode" value=""/>
							<input type="hidden" id="giaTriDangKi<%=stt%>" name="giaTriDangKiKtXe" value=""/>
							<%
						}
						%>
					</td>
					
					<td class="text-center">
						<!-- Gia tri kiem tra -->
						<input type="text" class="textNone textBound" readonly="readonly"
								<%=BienBanKiemTraBusiness.checkColorTab2GTkiemtra(inspecRecordSpec.getEvaluationResult())%>
								id="giaTriKiemTra_<%=stt%>" name="giaTriSuaDoiKetCauVaThongSoKtXe_<%=stt%>" data-thamchieutsktxvalue="<%= inspecRecordSpec.getSpecificationCode() %>" value="<%=BienBanKiemTraBusiness.getGiaTriKiemTra(vehicleGroupInitial.getVehicleClass(), inspecRecordSpec)%>"/>
								<!-- name="giaTriSuaDoiKetCauVaThongSoKtXe_"  -->
							
						<input type="hidden" id="giaTriKiemTra<%=stt%>" name="giaTriSuaDoiKetCauVaThongSoKtXe<%=stt%>" data-thamchieutsktx="<%= inspecRecordSpec.getSpecificationCode() %>" value="<%=inspecRecordSpec.getSpecificationValue()%>"/>
					</td>
					
					<td class="text-center">
						<input type="hidden" id="thamChieu<%=inspecRecordSpec.getSpecificationCode()%>" data-thamchieucode="giaTriKiemTra<%=stt%>" data-thamchieuvalue="giaTriKiemTra_<%=stt%>"/>
						
						<select id="selLuaChonKetQua<%=stt%>" name="selLuaChonDangKiKetCauVaThongSoKtXe<%=stt%>" class="form-control-find selectLuaChonKetQua thamChieuAct"
								onclick="checkSelLuaChonThongSoKtXe('<%=stt%>')"
								<%=BienBanKiemTraBusiness.checkColorTab2KetQua(inspecRecordSpec.getEvaluationResult())%>>
							<option value="0" >Chưa quyết định</option>
							<% for (DmDataItem item : lstLuaChonKetQua) { %>
								<option value="<%=item.getCode0()%>"  <%=BienBanKiemTraBusiness.checkIsDat(inspecRecordSpec.getEvaluationResult() + "", item.getCode0())%> ><%=item.getName()%></option>
							<% } %>
						</select>
					</td>
				</tr>
			<%	//}
			}
			%>
			</tbody>
		</table>
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
			List<InspectionCommonStatus> lstKetCauKhiThais = InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroupInitial.getVehicleClass(), 4, inspectionRecord.getId());
			if (Validator.isNull(lstKetCauKhiThais)) { lstKetCauKhiThais = new ArrayList<InspectionCommonStatus>(); }
		
			LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==Tab 2-4. KIỂM TRA ĐỐI CHIẾU KẾT==lstKetCauKhiThais==size==" + lstKetCauKhiThais.size() + "==idInspectionRecord==" + idInspectionRecord);
			
			if (lstKetCauKhiThais !=null && lstKetCauKhiThais.size() > 0) {
				
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
									<option value="<%=item.getCode0()%>" <%=BienBanKiemTraBusiness.checkIsDat(String.valueOf(itemKetCau.getCommonStatus()), item.getCode0())%> ><%=item.getName()%></option>
								<%}%>
							</select>
						</td>
					</tr>
				<%}%>
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
									<option value="<%=item.getCode0()%>" <%=(inspectionRecord.getConfirmedResult() == ConvertUtil.convertToLong(item.getCode0())) ? "selected" : ""%>><%=item.getName()%></option>
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
				<input type="checkbox" name="markupSafeTest" id="markupSafeTest" value="1" <%=(inspectionRecord.getMarkupSafeTest() == 1 || inspectionRecord.getMarkupSafeTest() == 2) ? "checked='checked'" : ""%>/>&nbsp;Đề nghị thử nghiệm an toàn<br>
				<input type="checkbox" name="markupEmissionTest" id="markupEmissionTest" value="1" <%=(inspectionRecord.getMarkupEmissionTest() == 1 || inspectionRecord.getMarkupEmissionTest() == 2) ? "checked='checked'" : ""%>/>&nbsp;Đề nghị thử nghiệm khí thải<br>
				<input type="checkbox" name="markupControl" id="markupControl" value="1" <%=(inspectionRecord.getMarkupControl() == 1 || inspectionRecord.getMarkupControl() == 2) ? "checked='checked'" : ""%>/>&nbsp;Đề nghị giám định<br>
			</div> 
		</div>
		</div>
		<!--END------ 5. XỬ LÝ KẾT QUẢ 34 -->
		
		<div style="height: 5px">&nbsp</div>
		
		
		<!--START------ 6. XÁC NHẬN CHI PHÍ PHÁT SINH -->
		<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 100%;"><span style="font-weight: bold;">6. XÁC NHẬN CHI PHÍ PHÁT SINH</span></div>
		<div style = "width:0%">&nbsp</div>
		
		<%
		List<InspectionCommonStatus> lstXacNhanChiPhiPhatSinhs= InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroupInitial.getVehicleClass(), 6, inspectionRecord.getId());
		if (Validator.isNull(lstXacNhanChiPhiPhatSinhs)) {
			lstXacNhanChiPhiPhatSinhs = new ArrayList<InspectionCommonStatus>(); 
		}
		LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==/suabienbanktra_dangKiemVien.jsp==6. XÁC NHẬN CHI PHÍ PHÁT SINH==lstXacNhanChiPhiPhatSinhs==size==" + lstXacNhanChiPhiPhatSinhs.size());
		
		if (lstXacNhanChiPhiPhatSinhs != null && lstXacNhanChiPhiPhatSinhs.size() > 0 ) {
		
		%>
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
			<table id="tblKiemTraDoiChieuKetCauKhiThai" style="width: 100%" class="wd-table table">
				<tbody>
				<%
				boolean checkDivShow = true;
				stt = 1;
				for (InspectionCommonStatus itemXnChiPhi: lstXacNhanChiPhiPhatSinhs) {
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
						<% if (itemXnChiPhi.getCommonCode().contains("6_01")) { %>
							<input type="radio" name="isTinhPhi" <%=((itemXnChiPhi.getCommonStatus() == 1) ? "checked=\"checked\"" : "") %> value="1" onclick="eventHideOrShowDivXNTP('divQuangDuongPhatSinh','divGhiChuChiPhiPhatSinh')">Có<br> 
							<input type="radio" name="isTinhPhi" <%=((itemXnChiPhi.getCommonStatus() == 0) ? "checked=\"checked\"" : "") %> value="0" onclick="eventHideOrShowDivXNTP('divGhiChuChiPhiPhatSinh','divQuangDuongPhatSinh')">Không
							
						<% } else if (itemXnChiPhi.getCommonCode().contains("6_02")) { %>
						<div id = "divQuangDuongPhatSinh">
							<select id="quangDuongPhatSinh" name="quangDuongPhatSinh" class="form-control-find" style="height: 30px" >
								<option value="1" <%=((itemXnChiPhi.getCommonStatus() == 1) ? "selected=\"selected\"" : "") %> > <100 km </option>
								<option value="2" <%=((itemXnChiPhi.getCommonStatus() == 2) ? "selected=\"selected\"" : "") %> > 100 - 200 km </option>
								<option value="3" <%=((itemXnChiPhi.getCommonStatus() == 3) ? "selected=\"selected\"" : "") %> > 200 - 300 km </option>
								<option value="4" <%=((itemXnChiPhi.getCommonStatus() == 4) ? "selected=\"selected\"" : "") %> > Trên 300 km </option>
							</select>
						</div>
						<% } else if (itemXnChiPhi.getCommonCode().contains("6_03")) {%>
						<div id = "divGhiChuChiPhiPhatSinh">
							<select id="ghiChuChiPhiPhatSinh" name="ghiChuChiPhiPhatSinh" class="form-control-find" style="height: 30px" >
								<option value="0" <%=((itemXnChiPhi.getCommonStatus() == 0) ? "selected=\"selected\"" : "") %> >--Lựa chọn lý do không tính phí--</option>
								<option value="1" <%=((itemXnChiPhi.getCommonStatus() == 1) ? "selected=\"selected\"" : "") %> >Khách đón</option>
								<option value="2" <%=((itemXnChiPhi.getCommonStatus() == 2) ? "selected=\"selected\"" : "") %> >Cùng địa điểm với lô hàng đã tính phí</option>
							</select>
						</div>
						<% } else if (itemXnChiPhi.getCommonCode().contains("6_04")){ %>
						<input type="text" name="chiPhiPhatSinh" id="chiPhiPhatSinh" value="<%=itemXnChiPhi.getItemName()%>" />
						<%
						}
						%>
						</td>
					</tr>
					<%
					if(checkDivShow == true){
					if(itemXnChiPhi.getCommonStatus() == 1){
					%>
						<script type="text/javascript">
						$(function() {
							$('#divQuangDuongPhatSinh').show();
						});
						</script>
					<%
					} else if(itemXnChiPhi.getCommonStatus() == 0){
					%>
						<script type="text/javascript">
						$(function() {
							$('#divGhiChuChiPhiPhatSinh').show();
						});
						</script>
					<%
					}
					checkDivShow = false;
					}
					%>
				<%}%>
				</tbody>
			</table>
		</div>
		<% } %>
		<!--END------  6. XÁC NHẬN CHI PHÍ PHÁT SINH -->
		
		
		<!-------------START------------------------ Thông báo kết quả ---------------------------->

		
		<div>Ý kiến đăng kiểm viên <span style="color: red;"></span></div>
		<div style="width: 10px"></div>
		<textarea class="textAreaAutosize" id="yKienDangKiemVien" name="yKienDangKiemVien" style="width: 79.5%" placeholder=""><%=Validator.isNotNull(inspectionRecord.getRemarks()) ? inspectionRecord.getRemarks() : StringPool.BLANK%></textarea>
		<div style="width: 20px"></div>
		<div>Ghi chú in vào giấy chứng chỉ <span style="color: red;" id="spanGhiChuInVaoGcc"></span></div>
		<div style="width: 10px"></div>
		<textarea class="textAreaAutosize" id="ghiChuInVaoGiayChungChi" name="ghiChuInVaoGiayChungChi" style="width: 79.5%" placeholder=""><%=Validator.isNotNull(inspectionRecord.getDescription()) ? inspectionRecord.getDescription() : StringPool.BLANK%></textarea>
		<!-------------END------------------------ Thông báo kết quả ---------------------------->
		
		
	</div><!--------END----------------  tab 2 --------------->
	
	<div style="width: 30px">&nbsp</div>
	
	<aui:button-row cssClass="width100">
		<%
		if(idPhanNhomHoSo != null && idPhanNhomHoSo.trim().compareToIgnoreCase("24") == 0){
		%>
			<button type="button" id="lapBienBanKiemTra" onclick="if(validatorBeforDataLapBienBanKiemTra()) beforSummitForm('formDuocPhanCongDangKiemVien','<%=urlLapBienBanKiemTra.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;float: left;">Hoàn tất</button>
			<button type="button" id="bienBanLuuTam" onclick="if(validatorBeforDataLapBienBanKiemTra()) beforSummitForm('formDuocPhanCongDangKiemVien','<%=urlBienBanLuuTam.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;float: left;">Lưu tạm</button>
		<%
		} else {
		%>
			<button type="button" id="duocPhanCongDangKiemVien" onclick="if(validatorBeforDataLapBienBanKiemTra()) beforSummitFormKhac('formDuocPhanCongDangKiemVien','<%=urlDuocPhanCongDangKiemVien.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;float: left;">Hoàn tất</button>
		<%
		}
		%>
		<portlet:actionURL var="dakiemtra_huyBienBanKiemTra" name="dakiemtra_huyBienBanKiemTra">
			<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
			<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(idHoSoThuTuc) %>"/>
			<portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=String.valueOf(idPhieuXyLyPhuBBLT) %>"/>
			<portlet:param name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=String.valueOf(idthuTucHanhChinh) %>"/>
			<portlet:param name="<%=Constants.ID_INSPECTION_RECORD%>" value="<%=String.valueOf(inspectionRecord.getId()) %>"/>
		</portlet:actionURL>
		<!-- <button type="button" onclick="eventHideOrShowDiv('divDuocPhanCong' , 'true', 'divLapBienBanKiemTra', 'false', '', ''); btnHuyKiemTraLapBienBanKiemTra();" class="btnThuLyHS form-control" style="width: 200px;">Hủy kiểm tra</button> -->
		<button type="button" onclick="summitForm('<%= renderResponse.getNamespace() + "formDuocPhanCongDangKiemVien" %>', '<%=dakiemtra_huyBienBanKiemTra %>')" class="btnThuLyHS form-control" style="width: 200px;">Hủy biên bản</button>
	</aui:button-row>
</div><!---------------------------------  end tab container --------------------------------->
<div style="width: 30px">&nbsp</div>
</aui:form>
</div>
</div>

<portlet:resourceURL var="updaContentURL" ></portlet:resourceURL>

<style type="text/css">
	.textBound {width: 100%;text-align: center;height: 30px;background-color: white !important;}
	.textNone {border: none;}
	.black {color: black !important;}
	.white {color: white !important;}
</style>

<!-- dialog tab kiem tra -->
<div id="div_WarningMsg" style="display: none;">
	<table width="100%">
		<tr>
			<td colspan="2" style="width: 100%;"><label class="egov-label">Thay đổi giá trị nhập</label></td>
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
				<a href="<%=renderBackURL.toString()%>"><button type="button" class=" btnThuLyHS form-control">Quay lại</button></a>
			</td>
		</tr>
	</table>
</div>

<!-- dialog tag thong tin chung -->
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

<script type="text/javascript">
//chuc nang hien thi tab
$(document).ready(function() {
	$('ul.tabs li').click(function() {
		var tab_id = $(this).attr('data-tab');
		$('ul.tabs li').removeClass('current');
		$('.tab-content').removeClass('current');
		$(this).addClass('current');
		$("#" + tab_id).addClass('current');
	})
})

var resultCallAjaxFindVehicleSpecification = false;


var lstFileThongSoKiThuat = new Array();
var lstFileTaiLieuThuNghiem = new Array();
var lstFileTalLieuKhiThai = new Array();
var lstFileGroupId = new Array();
var path = '/DangKiemApp-portlet/export/';
var vehicleClassJs='<%=vehicleGroupInitial.getVehicleClass()%>';


//de ve file js, ko an doan code: <portlet:namespace/>
function beforSummitFormKhac(idForm, url) {
	//console.log('=beforSummitForm=' + idForm);
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
			} else {
				document.getElementById('<portlet:namespace/>' + idForm).action = '';
			}
		}
}
function beforSummitForm(idForm, url) {
	//console.log('=beforSummitForm=' + idForm);
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

								document.getElementById('lapBienBanKiemTra').disabled = true;
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

				document.getElementById('lapBienBanKiemTra').disabled = true;
				document.getElementById('bienBanLuuTam').disabled = true; 
			} else {
				document.getElementById('<portlet:namespace/>' + idForm).action = '';
			}
		}
}

var url = '<%=updaContentURL%>';


var giaTriTraVe = "";
var isThuocDmDataItem = "0";

//ham thuc thi 3. KIỂM TRA ĐỐI CHIẾU KẾT CẤU VÀ, sua gia tri kiem tra
function deleteFileUploadBBKT(idInspectionRecordAttach, idInspectionRecord) {
	//console.log("====idInspectionRecordAttach====" + idInspectionRecordAttach);
	$.ajax({
		type : 'GET',
		url : url,
		data : {
			idInspectionRecordAttach : idInspectionRecordAttach,
			idInspectionRecord : idInspectionRecord,
			type : 'deleteFileUploadBBKT',
		},
		success : function(data) {
			//console.log("===update InspectionRecordAttach done==");
			if (data != '{}') {
				var data2 = JSON.parse(data);
				//console.log("===data2==" + data2);
				var duLieu = '';
				if(data2.idinspectionrecordattach.length > 0){
					duLieu = duLieu + '<div id="listFileUpload">';
					duLieu = duLieu + '<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">';
					duLieu = duLieu + '<table style="width: 100%;" id="tblDanhSachPhuongTienKiemTra" class="wd-table table">';
					duLieu = duLieu + '<thead>';
					duLieu = duLieu + '<tr>';
					duLieu = duLieu + '<th class="text-center bold" style="font-size: 13px;width: 6%;">STT</th>';
					duLieu = duLieu + '<th class="text-center bold" style="font-size: 13px;">Tên file đính kèm</th>';
					duLieu = duLieu + '<th class="text-center bold" style="font-size: 13px;width: 9%;">Thao tác</th>';
					duLieu = duLieu + '</tr>';
					duLieu = duLieu + '</thead>';
					duLieu = duLieu + '<tbody>';
					
					for (var i = 0; i < data2.idinspectionrecordattach.length; i++) {
						
						duLieu = duLieu + createRow(i, data2.url[i], data2.name[i], data2.idinspectionrecordattach[i], data2.idinspectionrecord[i]);
					}

					duLieu = duLieu + '</tbody>';
					duLieu = duLieu + '</table>';
					duLieu = duLieu + '</div>';
					duLieu = duLieu + '</div>';
				}
				document.getElementById("listFileUpload").innerHTML = duLieu;
			}
		}
		});
}

function suaGiaTriNhap(specificationcode, giaTriKiemTra, stt, isThongTin, commonCode) {
	//console.log('giaTriDmTTC' + stt + "==" + specificationcode);
	//console.log('giaTriCodeTTC' + stt + "==" + giaTriKiemTra);
	//console.log("===call Ajax==specificationcode==" + specificationcode);
	//console.log("===call isThongTin==" + isThongTin);

	if (commonCode === '') {
		//console.log('Man hinh tab Kiểm tra Chất lượng an toàn KTVBVMT');
	} else {
		//console.log('Thông tin chung');
	}
	
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

	//console.log("===call Ajax==" + typeAjax);
	

	var checkDmThongTinKiemTra = $('#checkDmThongTinKiemTra' + stt).val();

	//check thuoc danh muc chung, j ma choi ca hai ajax cung mot luc
	//if (checkDmThongTinKiemTra === '1') {
		
		$.ajax({
			type : 'GET',
			async: false,//bat dong bo = fale, dong bo voi client
			cache : false,
			url : '<%=updaContentURL%>',
			data : {
				specificationcode : specificationcode,
				type : typeAjax,
				vehicleClass : vehicleClassJs,
				giaTriDangKi : giaTriKiemTra,//kiem tra gia tri kiem tra sua doi
				stt : stt
			},
			success : function(data) {
				// preferred
				//console.log("===data==" + data);
				if (data != '{}') {
					var data2 = JSON.parse(data);
					//console.log("===data2==" + data2);
					isThuocDmDataItem = "1";
					document.getElementById("listValueGiaTriNhap").style.overflowX = "";
					document.getElementById("listValueGiaTriNhap").style.height = "30px";
					
					giaTriTraVe = "<select id=\"giaTriNhapSuaDoi" + stt + "\" name=\"giaTriNhapSuaDoi" + stt + "\" class=\"form-control-find width100\">";
					for (var i = 0; i < data2.codedataitem.length; i++) {
						var isSelected = "";
						if (data2.codedataitem[i] == giaTriKiemTra) {
							isSelected = " selected=\"selected\" ";
						}
						
						giaTriTraVe = giaTriTraVe + "<option value=\"" + data2.codedataitem[i] + "\"  " + isSelected + "  >" + data2.namedataitem[i] + "</option>";
					}
					giaTriTraVe = giaTriTraVe + "</select>";
					
					// ///////////////////////// select multi
					if (isThongTin == '1' && specificationcode == '4') {
						//console.log("===call Ajax==COUNTRY==" + specificationcode);
						giaTriTraVe = "";
						isThuocDmDataItem = "2";
						
						document.getElementById("listValueGiaTriNhap").style.overflowX = "scroll";
						document.getElementById("listValueGiaTriNhap").style.height = "200px";
						
						for (var i = 0; i < data2.codedataitem.length; i++) {
							var isSelected = "";
							if (giaTriKiemTra.includes(data2.codedataitem[i])) {
								isSelected = " checked ";
							}
							var code = data2.codedataitem[i].trim();
							var name = data2.namedataitem[i].trim();

							//tao cac list input
							//console.log('code==' + code + '==name==' + name + '==isSelected==' + isSelected);
							giaTriTraVe = giaTriTraVe + createGiaTriTraVe(code, name, isSelected);
						}
						var giaTriDk = $('#giaTriDangKiTTC' + stt).val();
						var giaTriCode = $('#giaTriCodeTTC' + stt).val();

						//console.log('giaTriDangKiTTC==' + giaTriDk + '==giaTriCode==' + giaTriCode);
						
						//tao gia tri hidden
						giaTriTraVe = giaTriTraVe + createListGiaTriTraVe(giaTriCode, giaTriDk);
					}
				} else {
					isThuocDmDataItem = "0";
					document.getElementById("listValueGiaTriNhap").style.overflowX = "";
					document.getElementById("listValueGiaTriNhap").style.height = "30px";
					
					if(commonCode === 'TTC_1_20') {
						//Ngày Tờ khai hàng hóa nhập khẩu
						giaTriTraVe = createInputDate(stt, giaTriKiemTra);
					} else {
						giaTriTraVe = createInput(stt, giaTriKiemTra);
					}
				}
			}
		});
		
		//console.log("===giaTriTraVe==" + giaTriTraVe);
		
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
		
	//check ko thuoc danh muc chung
	//} else {
	//	isThuocDmDataItem = "0";
	//	document.getElementById("listValueGiaTriNhap").style.overflowX = "";
	//	document.getElementById("listValueGiaTriNhap").style.height = "30px";
	//	giaTriTraVe = createInput(stt, giaTriKiemTra);
	//	if (giaTriTraVe != '') {
	//		document.getElementById("valueGiaTriNhapStt").innerHTML = createInputGiaTriNhapStt(stt);
	//		document.getElementById("listValueGiaTriNhap").innerHTML = giaTriTraVe;
	//		showThongBaoMsg();
	//	}
	//}
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
			giaTriThamChieu : giaTriThamChieu
		},
		success : function(data) {
			//console.log(data);
			
			if(data.result) {
				var thamChieuJson = data.thamChieuJson;
				
				for(var k in thamChieuJson) {
					var input = $('#thamChieu'+thamChieuJson[k].referenceCode);
					
					if(input) {
						var codeId = $('#'+input.attr('data-thamchieucode'));
						
						if(codeId) {
							codeId.val(thamChieuJson[k].code);
						}
						
						var valueId =  $('#'+input.attr('data-thamchieuvalue'));
						
						if(valueId) {
							valueId.attr('value', thamChieuJson[k].value);
							valueId.val(thamChieuJson[k].value);
						}
						
						if(input.attr('data-thamchieucodettc')) {
							var giaTriCodeTTC = $('#'+input.attr('data-thamchieucodettc'));
							if(giaTriCodeTTC){
								giaTriCodeTTC.val(thamChieuJson[k].code);
							}
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

function summitForm(idForm, url) {
	var status = confirm("Bạn có muốn tiếp tục xử lý?");
	if (status) {
		document.getElementById(idForm).action = url;
     	document.getElementById(idForm).submit();
	} else {
		document.getElementById(idForm).action = '';
	}
}
</script>
