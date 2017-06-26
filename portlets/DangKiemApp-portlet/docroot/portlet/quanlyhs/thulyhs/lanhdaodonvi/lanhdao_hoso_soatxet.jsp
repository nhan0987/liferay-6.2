<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement"%>
<%@page import="vn.dtt.gt.dk.utils.CollectionUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.utils.config.DKConfigurationManager"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl"%>
<%@page import="vn.dtt.gt.dk.utils.format.FormatData"%>
<%@page import="java.util.Calendar"%>
<%@page import="vn.dtt.gt.dk.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalService"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceWrapper"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>

<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>

<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.IssueCategoryLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory"%>

<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/portlet/init.jsp"%>
<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/toTiepNhan.css">
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
System.out.println("===============/portlet/quanlyhs/thulyhs/lanhdaodonvi/lanhdao_hoso_soatxet.jsp===========");
long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);

String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
VehicleGroup vehicleGroup  = null;
RegisteredInspection registeredInspection = null;
InspectionRecord inspectionRecord = null;
List<VehicleRecord> allVehicleRecord = null;
long vehicleGroupInitialId = 0;
try {
	inspectionRecord = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
	vehicleGroup = VehicleRecordLocalServiceUtil.findVehicleGroupByInspectionRecordId(inspectionRecord.getId());

	allVehicleRecord = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
	
	if(allVehicleRecord != null && allVehicleRecord.size() > 0) {
		VehiclerecordInitial vehicleRecordInitial = VehiclerecordInitialLocalServiceUtil.getVehiclerecordInitial(allVehicleRecord.get(0).getId());
		vehicleGroupInitialId = vehicleRecordInitial.getVehicleGroupId();
	}
	
	registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
	
	
} catch (Exception e) {
	//e.printStackTrace();
}

if (registeredInspection == null) {
	registeredInspection = new RegisteredInspectionImpl();
}
if (inspectionRecord == null) {
	inspectionRecord = new InspectionRecordImpl();
}
if (vehicleGroup == null) {
	vehicleGroup = new VehicleGroupImpl();
}

//quay lai trang
PortletURL renderBackURL = renderResponse.createRenderURL();
renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");


SafetestRequirement safetestRequirement = null;
String urlFileSafetestRequirement = "";
try{
safetestRequirement = SafetestRequirementLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
urlFileSafetestRequirement = CollectionUtils.getStringUrlFile(request, safetestRequirement.getAttachedFile());
} catch (Exception e) {
	//e.printStackTrace();
}

EmissionTestRequirement emissionTestRequirement = null;
String urlFileEmissionTestRequirement = "";
try{
 emissionTestRequirement = EmissionTestRequirementLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
 urlFileEmissionTestRequirement = CollectionUtils.getStringUrlFile(request, emissionTestRequirement.getAttachedFile());
} catch (Exception e) {
	//e.printStackTrace();
}

ControlRequirement controlRequirement =null;
String urlFileControlRequirement = "";
try{
 controlRequirement = ControlRequirementLocalServiceUtil.findByInspectionrecordId(inspectionRecord.getId());
 urlFileControlRequirement = CollectionUtils.getStringUrlFile(request, controlRequirement.getAttachedFile());
} catch (Exception e) {
	//e.printStackTrace();
}

//Bổ sung phiếu ghi nhận lỗi VAQ
	String specificationgroupcode = DanhMucKey.A3_CODE;
	long groupId = ConvertUtil.convertToLong(specificationgroupcode);
	int level = 0;
	String code_1 = "A301"; // fix Loại lỗi - Nguy cơ rủi ro sản phẩm
	List<DmDataItem> lstLoaiLoi = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId, level, code_1);
	
	level = 0;
	code_1 = "A306"; // fix Phân nhóm nghiệp vụ
	List<DmDataItem> lstPhanLoaiNghiepVu = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId, level, code_1);
		
	level = 0;
	code_1 = "A302"; // fix A-Mục đích nhập khẩu
	List<DmDataItem> lstMucDichNhapKhau = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId, level, code_1);
	
	level = 0;
	code_1 = "A303"; // fix B-Tình trạng phương tiện
	List<DmDataItem> lstTinhTrangPhuongTien = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId, level, code_1);
	
	level = 0;
	code_1 = "A304"; // fix C-Tình trạng chứng nhận
	List<DmDataItem> lstTinhTrangChungNhan = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId, level, code_1);
	

	level = 0;
	code_1 = "A305"; // fix D-Phạm vi hoạt động
	List<DmDataItem> lstPhamViHoatDong = DmDataItemLocalServiceUtil.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId, level, code_1);
    
	String corporationIdLogin = inspectionRecord.getCorporationId();
    String doanhNghiep = ParamUtil.getString(request, Constants.DOANH_NGHIEP);
    String loaiLoi = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
    String motaNoiDungLoi = ParamUtil.getString(request, Constants.LOAI_DIEU_KIEN);
    String tenSanPham = ParamUtil.getString(request, Constants.LOAI_PHUONG_TIEN_NK);
    String ngayNopHsFrom = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_FROM);
    String ngayNopHsTo = ParamUtil.getString(request, Constants.NGAY_NOP_HO_SO_TO);
    String soBienBanKiemTra = ParamUtil.getString(request, Constants.SO_BIENBAN_KIEMTRA);
    String soDangKiKiemTra = ParamUtil.getString(request, Constants.SO_DANGKI_KIEMTRA);
    String donViKiemTra = ParamUtil.getString(request, Constants.DON_VI_KIEM_TRA);
    
    if (soBienBanKiemTra == null || soBienBanKiemTra.equalsIgnoreCase(StringPool.BLANK)){
    	soBienBanKiemTra = inspectionRecord.getInspectionRecordNo();
    }
    if (soDangKiKiemTra == null || soDangKiKiemTra.equalsIgnoreCase(StringPool.BLANK)){
    	soDangKiKiemTra = registeredInspection.getRegisteredNumber();
    }
    
    PortletURL viewURL = renderResponse.createRenderURL();
	viewURL.setParameter(Constants.CORPORATION_ID, corporationIdLogin);
	viewURL.setParameter("jspPage", "/portlet/quanlyruiro/viewkiemsoatloivaq.jsp");
	
	if (doanhNghiep != null) {
		viewURL.setParameter(Constants.DOANH_NGHIEP, doanhNghiep);
	}
	if (loaiLoi != null) {
		viewURL.setParameter(Constants.LOAI_THU_TUC, loaiLoi);
	}
	if (motaNoiDungLoi != null) {
		viewURL.setParameter(Constants.LOAI_DIEU_KIEN, motaNoiDungLoi);
	}
	if (tenSanPham != null) {
		viewURL.setParameter(Constants.LOAI_PHUONG_TIEN_NK, tenSanPham);
	}
	if (ngayNopHsFrom != null) {
		viewURL.setParameter(Constants.NGAY_NOP_HO_SO_FROM, ngayNopHsFrom);
	}
	if (ngayNopHsTo != null) {
		viewURL.setParameter(Constants.NGAY_NOP_HO_SO_TO, ngayNopHsTo);
	}
	if (soDangKiKiemTra != null) {
		viewURL.setParameter(Constants.SO_DANGKI_KIEMTRA, soDangKiKiemTra);
	}
	if (soBienBanKiemTra != null) {
		viewURL.setParameter(Constants.SO_BIENBAN_KIEMTRA, soBienBanKiemTra);
	}	
	if (donViKiemTra != null) {
		viewURL.setParameter(Constants.DON_VI_KIEM_TRA, donViKiemTra);
	}
	
    SearchContainer<IssueTracking> searchContainer = new SearchContainer<IssueTracking>(renderRequest, 
			null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, viewURL, null, "");
	
	List<IssueTracking> list = IssueTrackingLocalServiceUtil.findIssueTrackingByDate(soDangKiKiemTra, soBienBanKiemTra, motaNoiDungLoi, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, tenSanPham, searchContainer.getStart(), searchContainer.getEnd());
	int total = IssueTrackingLocalServiceUtil.countIssueTrackingListByDate(soDangKiKiemTra, soBienBanKiemTra, motaNoiDungLoi, ngayNopHsFrom, ngayNopHsTo, doanhNghiep, tenSanPham);
	
	searchContainer.setTotal(total);
	searchContainer.setResults(list);
	
	
	int totalDefect = 0;
	int totalFixed = 0;
	
	List<IssueTracking> listDefect = IssueTrackingLocalServiceUtil.findByInspectionRecordno(soBienBanKiemTra, soDangKiKiemTra);
	if (listDefect != null && listDefect.size() > 0) {
		totalDefect = listDefect.size();
	}
	
	List<IssueTracking> listDefectFixed = IssueTrackingLocalServiceUtil.findByDefectStatus(1, soBienBanKiemTra, soDangKiKiemTra);
	if (listDefectFixed != null && listDefectFixed.size() > 0) {
		totalFixed = listDefectFixed.size();
	}
	
%>
<style>
.textAreaAutosize {
	width: 100%
}
.wd-table {
  margin-top: 5px;
}
.reportContainer {
  border: 1px solid #ddd;
}
</style>

<div id="divButton" style="margin-left: 0px;">
	<portlet:actionURL var="dakiemtra_suaBienBanKiemTra" name="dakiemtra_suaBienBanKiemTra">
		<portlet:param name="<%=Constants.THANH_PHAN_XU_LY%>" value="<%=Constants.XU_LY_TLHS %>"/>
		<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=String.valueOf(idHoSoThuTuc) %>"/>
		<portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU%>" value="<%=String.valueOf(idPhieuXuLyPhu) %>"/>
		<portlet:param name="<%=Constants.ID_INSPECTION_RECORD%>" value="<%=String.valueOf(inspectionRecord.getId()) %>"/>
		<portlet:param name="<%=Constants.ID_VEHICLE_GROUP %>" value="<%=String.valueOf(vehicleGroup.getId()) %>"/>
		<portlet:param name="<%=Constants.ID_VEHICLE_GROUP_INITIAL %>" value="<%=String.valueOf(vehicleGroupInitialId) %>"/>
		<portlet:param name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=String.valueOf(idthuTucHanhChinh) %>"/>
		<portlet:param name="isView" value="<%=Boolean.TRUE.toString()%>"/>
		<portlet:param name="backURL" value="<%=PortalUtil.getCurrentURL(request)%>"/>
	</portlet:actionURL>
	<aui:button-row>
		<button type="button" onclick="eventShowOnlyOne('chuyenToNghiepVuDiv')" class=" btnThuLyHS form-control">Chuyển tổ nghiệp vụ</button>
		<button type="button" onclick="eventShowOnlyOne('traLaiHoSoDiv')" class=" btnThuLyHS form-control">Yêu cầu ĐKV soát xét lại</button>
		<button type="button" onclick='location.href="<%= dakiemtra_suaBienBanKiemTra%>"' class="btnThuLyHS form-control">Xem biên bản kiểm tra</button>
		<button class="btnThuLyHS form-control" type="button" onclick="eventShowOnlyOne('xemBanThaoChungChiDiv')" >Xem bản thảo chứng chỉ</button>
		<button type="button" onclick="eventShowOnlyOne('ghiLoi')" class=" btnThuLyHS form-control">Theo dõi lỗi (<%=totalDefect - totalFixed%>)</button>
		<a onclick="checkTrungSoDongCo('<%=idHoSoThuTuc%>')"><button
				type="button" class="btnThuLyHS form-control">Kiểm tra trùng số</button></a>
		
		<a href="<%=renderBackURL.toString()%>"><button type="button" class=" btnThuLyHS form-control">Quay lại</button></a>
	</aui:button-row>
</div>

<div style="height: 15px" id="theDem"></div>

<div id="soatXetHoSoDiv" style="display: block;background: #ffffff;">

	<table class="wd-table table">
		<thead>
			<tr>
				
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.sobienbankt"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.ngaylapbienbankt"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.sothamchieu"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.soptdongco"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.ketquakiemtra"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.dnthunghiemantoan"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.dnthunghiemkhithai"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.dnthunghiemgiamdinh"/></th>
			</tr>
		</thead>
		<tbody>
				<tr>
					
					<td class="text-center"><%=inspectionRecord.getInspectionRecordNo()%><br><%=ConvertUtil.parsefulldateToString(inspectionRecord.getInspectionRecordDate())%></td>
					<%
					String thamchieudangkiemvien = null;
					List<InspectionCommonStatus> lstCommonStatusTTC =  InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroup.getVehicleClass(), 1, inspectionRecord.getId());
					if(lstCommonStatusTTC != null && lstCommonStatusTTC.size() >0){
						for(InspectionCommonStatus commonStatus : lstCommonStatusTTC){
							if(commonStatus.getCommonStatus() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_06")){
								if (commonStatus.getItemName().trim().length() > 0){
									thamchieudangkiemvien = DKConfigurationManager.getStrProp("thamchieu_dkv","DKV tham chieu ") + "<b>" + commonStatus.getItemName().trim() +"</b>";
								}
								
							} else if(commonStatus.getCommonStatus() == 3 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_06")){
								thamchieudangkiemvien = DKConfigurationManager.getStrProp("thamchieu_dkv_suadoi","Sua doi tham chieu ") + "<b>" + commonStatus.getItemName().trim() +"</b>";
								
							} else if(commonStatus.getCommonStatus() == 4 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_06")){
								
								thamchieudangkiemvien = DKConfigurationManager.getStrProp("thamchieu_dkv_khongapdung","Khong ap dung tham chieu. ");
							}
						}
					}
					%>
					<td class="text-center"><%=Validator.isNotNull(thamchieudangkiemvien) ? thamchieudangkiemvien : StringPool.BLANK %></td>
					<td class="text-center"><%=VehicleRecordLocalServiceUtil.countVehicleRecord(inspectionRecord.getId()) %></td>
					<td class="text-center"><a onclick="eventShowOnlyOne('ketQuaKiemTraDiv')"> <%=CommonUtils.getKetQuaKiemTra(String.valueOf(inspectionRecord.getConfirmedResult()))%></a></td>
					<td class="text-center">
						<%
						if(inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP){
						%>
						<a onclick="reportNewPage('<%=urlFileSafetestRequirement%>')"><%=((inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP)? "Chưa lập" : ((inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP) ? "Đã lập" : ((inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP) ? "Không yêu cầu" : "")))%></a>
						<%
						} else {
						%>
						<label><%=((inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP)? "Chưa lập" : ((inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP) ? "Đã lập" : ((inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP) ? "Không yêu cầu" : "")))%></label>
						<%
						}
						%>
					</td> 
					<td class="text-center">
						<%
						if(inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP){
						%>
						<a onclick="reportNewPage('<%=urlFileEmissionTestRequirement%>')"><%=((inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP)? "Chưa lập" : ((inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP) ? "Đã lập" : ((inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP) ? "Không yêu cầu" : "")))%></a>
						<%
						} else {
						%>
						<label><%=((inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP)? "Chưa lập" : ((inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP) ? "Đã lập" : ((inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP) ? "Không yêu cầu" : "")))%></label>
						<%
						}
						%>
					</td>
					<td class="text-center">
						<%
						if(inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP){
						%>
						<a onclick="reportNewPage('<%=urlFileControlRequirement%>')"><%=((inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP)? "Chưa lập" : ((inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP) ? "Đã lập" : ((inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP) ? "Không yêu cầu" : "")))%></a>
						<%
						} else {
						%>
						<label><%=((inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP)? "Chưa lập" : ((inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP) ? "Đã lập" : ((inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP) ? "Không yêu cầu" : "")))%></label>
						<%
						}
						%>
					</td>
				</tr>
		</tbody> 
	</table>

</div>

<!------------------------- Noi dung chi tiet --------------------------->
<div id="ketQuaKiemTraDiv" style="display: block;background: #ffffff;">
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.noidungbienbankiemtra"/></b></span></p>
		<div id="yKienDangKiemVien" class="yKienDiv">
				<%
				      String tenDkv="";
				      try{
				       User userDkv=UserLocalServiceUtil.fetchUser(inspectionRecord.getInspectorId());
				       if (userDkv!=null){
				        tenDkv=userDkv.getFullName();
				       }
				      }catch(Exception e){
				       
				      }
				      String ketQua = CommonUtils.getKetQuaKiemTra(String.valueOf(inspectionRecord.getConfirmedResult()));
				      String noiDungDkv=inspectionRecord.getRemarks().trim();
				      String ngayKiemTra=ConvertUtil.parseDateToString(inspectionRecord.getInspectionDateFrom()) +" đến ngày "+ConvertUtil.parseDateToString(inspectionRecord.getInspectionDateTo());
				      
				 %>
			<table>
				<tr>
					<td><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.ykiendangkiemvien"/></b></span></td>
					<td></td>
				</tr>
				<tr>
					<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.ketqua"/></span></td>
					<td><span> <%=ketQua %></span></td>
				</tr>
				<tr>
					<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.ngaykiemtra"/></span></td>
					<td><span><%=ngayKiemTra %></span></td>
				</tr>
				<tr>
					<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.nguoikiemtra"/></span></td>
					<td><span> <%=tenDkv %></span></td>
				</tr>
				<tr>
					<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.noidung"/></span></td>
					<td><span> <%=noiDungDkv %></span></td>
				</tr>
			</table>
		</div>
	</div>
	<jsp:include page="/portlet/quanlyhs/thulyhs/lanhdaodonvi/ketqua_lapbienban_kiemtra.jsp"></jsp:include>
	<br>
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.ghichuinvaogiaychungchi"/></b></span></p><br>
	</div>
	<div><textarea class="textAreaAutosize" id="ghiChuBanThao" name="ghiChuBanThao" disabled="disabled"><%=inspectionRecord.getDescription().trim() %></textarea></div>
</div>

<!------------------------- Noi dung chi tiet --------------------------->
<div id="xemBanThaoChungChiDiv">
			<portlet:actionURL var="toNghiepVuSoanBanThaoChungChi" name="toNghiepVuSoanBanThaoChungChi">
				<portlet:param name="<%=Constants.DIEU_KIEN_CHUYEN_DICH %>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_LANH_DAO_PHONG_KY %>"/>
				<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
				<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(idHoSoThuTuc) %>"/>
				<portlet:param name="<%=Constants.REGISTERED_NUMBER %>" value="<%=String.valueOf(registeredInspection.getRegisteredNumber()) %>"/>
				<portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=String.valueOf(idPhieuXuLyPhu) %>"/>
				<portlet:param name="<%=Constants.ID_INSPECTION_RECORD %>" value="<%=String.valueOf(inspectionRecord.getId()) %>"/>
			</portlet:actionURL>
			
				
				<div style = "width:0%">&nbsp</div>
				<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
					<input type="text" hidden="true" id="inspectionRecordAjaxId" value="<%=inspectionRecord.getId()%>" />
					<input type="text" hidden="true" id="hoSoThuTucAjId" value="<%=String.valueOf(idHoSoThuTuc)%>" />
					<input type="text" hidden="true" id="phieuXuLyPhuAjId" value="<%=String.valueOf(idPhieuXuLyPhu)%>" />
					<input type="text" hidden="true" id="registerNoAjId" value="<%=String.valueOf(registeredInspection.getRegisteredNumber())%>" />
					<table id="tblXyLyKetQua" style="width: 100%" class="wd-table table" >
						<tbody style="display:none">
							<tr>
								<td class="text-left paddingLeft05">Đề xuất</td>
								<td class="text-left paddingLeft05">
									<%List<DmDataItem> lstXuLyKetQua = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.CONFIRMED_RESULT);%>
									<select id="certificateType" name="certificateType" class="form-control-find width100">
										<%for (DmDataItem item : lstXuLyKetQua) {%>
										<option <%=item.getCode0().equals(String.valueOf(inspectionRecord.getConfirmedResult()).trim()) ? "selected" : ""%> value="<%=item.getCode0()%>"><%=item.getName()%></option>
										<%}%>
									</select>
								</td>
							</tr>
						</tbody>
					</table>
				</div>		
				<div id="viewDuLieu" >
					<table style="width: 100%">
						<tr>
							<td style="width: 40%;vertical-align:top;position:static;">
								<div id="viewdata" style="padding-left:5px;">
									<input type="hidden" id='listVehicleRecordId' name='listVehicleRecordId' value='' >
									<table style='width:96%;' class='wd-table table'>
										<tr>
											<th style="background: solid;">STT</th>
											<th style="background: solid;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshssoanbanthaochungchi.nhanhieu"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshssoanbanthaochungchi.soloai"/></th>
											<th style="background: solid;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshssoanbanthaochungchi.sokhung"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshssoanbanthaochungchi.sodongco"/></th>
											<th style="background: solid;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshssoanbanthaochungchi.tinhtrang"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshssoanbanthaochungchi.sothamchieu"/></th>
										</tr>
									<%
									
										allVehicleRecord = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
								
										String soKhungDongCo = "";
										String tinhTrangThamChieu = "";
										int i = 0;
										String tinhTrang = "";
										String nhanHieu = ReportUtils.getTenDmDataByCode2(vehicleGroup.getTradeMark());
										String soLoai = vehicleGroup.getCommercialName();
										String thamChieu = vehicleGroup.getReferenceCertificateNo();
										if (allVehicleRecord!=null && allVehicleRecord.size()>0){
											for (VehicleRecord item: allVehicleRecord){
												i = i + 1;
												if (item.getVehicleEngineStatus().trim().compareToIgnoreCase(Constants.Vehicle_Engine_Status_0) == 0) {
													tinhTrang = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-0", item.getVehicleEngineStatus());
											    } else if (item.getVehicleEngineStatus().trim().compareToIgnoreCase(Constants.Vehicle_Engine_Status_1) == 0) {
											    	tinhTrang = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-1", item.getVehicleEngineStatus()) ;
											    } else {
											        tinhTrang = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-2", item.getVehicleEngineStatus()) ;
											    }
												soKhungDongCo="<b>" + item.getChassisNumber() + "</b>" + "<br>" + item.getEngineNumber();
//												tinhTrangThamChieu=ReportUtils.getTenDmData(ReportConstant.TRADE_MARK, item.getVehicleEngineStatus())+"<br>"+item.getCodeNumber();
									%>	<tr>
											<td style="text-align: center"><a href="#" onclick="changedulieu('<%=item.getId()%>');"><%= i %></a></td>
											<td><a href="#" onclick="changedulieu('<%=item.getId()%>');"><b><%=nhanHieu %></b><br><%=soLoai %></a></td>
											<td><a href="#" onclick="changedulieu('<%=item.getId()%>');"><%=soKhungDongCo %></a></td>
											<td><a href="#" onclick="changedulieu('<%=item.getId()%>');"><b><%=tinhTrang %></b><br><%=thamChieu%></a></td>
										</tr>
									<%				
											}
										}
									%>
									</table>
									
								</div>
							</td>
							<td style="width: 60%;vertical-align:top;position:static;">
								<div id="viewFile">
								</div>
							</td>
							
						</tr>
					</table>
				</div>	
					
				<div><p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshssoanbanthaochungchi.ghichuvaobanthaochungchi"/></span></p></div>
				<div><textarea readonly="readonly" class="textAreaAutosize" id="ghiChuBanThao" name="ghiChuBanThao" ><%=inspectionRecord.getDescription().trim() %></textarea></div>
				<aui:button-row>					
					<button type="button" onclick="eventHideAndShowDiv('xemBanThaoChungChiDiv','soatXetHoSoDiv')" class=" btnThuLyHS form-control">Quay lại</button>
				</aui:button-row>
			
		</div>

<!------------------------- Noi dung chi tiet --------------------------->
<div id="noiDungDeNghiThuNghiemAnToanDiv" style="display: block;background: #ffffff;">
<%
if(inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP){
%>
	<div>
		<p style="text-align: left;"><span><b><a onclick="reportNewPage('<%=urlFileSafetestRequirement%>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.noidungdenghithunghiemantoan"/></a></b></span></p>
		<!--<jsp:include page="/portlet/quanlyhs/thulyhs/lanhdaodonvi/an_toan_203.jsp"></jsp:include>-->
	</div>
<%
} else if(inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP){
%>
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.chualapdenghithunghiemantoan"/></b></span></p>
	</div>
<%
} else if(inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP){
%>
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.khongyeucaudenghithunghiemantoan"/></b></span></p>
	</div>
<%
}
%>
</div>
<div id="noiDungDeNghiThuNghiemKhiThaiDiv" style="display: block;background: #ffffff;">
<%
if(inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP){
%>
	<div>
		<p style="text-align: left;"><span><b><a onclick="reportNewPage('<%=urlFileEmissionTestRequirement%>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.noidungdenghithunghiemkhithai"/></a></b></span></p>
		<!--<jsp:include page="/portlet/quanlyhs/thulyhs/lanhdaodonvi/khi_thai_202.jsp"></jsp:include>-->
	</div>
<%
} else if(inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP){
%>
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.chualapdenghithunghiemkhithai"/></b></span></p>
	</div>
<%
} else if(inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP){
%>
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.khongyeucaudenghithunghiemkhithai"/></b></span></p>
	</div>
<%
}
%>
</div>
<div id="noiDungDeNghiGiamDinhDiv" style="display: block;background: #ffffff;">
<%
if(inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP){
%>
	<div>
		<p style="text-align: left;"><span><b><a onclick="reportNewPage('<%=urlFileControlRequirement%>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.noidungdenghigiamdinh"/></a></b></span></p>
		<!--<jsp:include page="/portlet/quanlyhs/thulyhs/lanhdaodonvi/giam_dinh_204.jsp"></jsp:include>-->
	</div>
<%
} else if(inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP){
%>
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.chualapdenghigiamdinh"/></b></span></p>
	</div>
<%
} else if(inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP){
%>
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.khongyeucaudenghigiamdinh"/></b></span></p>
	</div>
<%
}
%>
</div>

<!------------------------- Noi dung chi tiet --------------------------->
<div class="row" id="ghiLoi" style="display: block;background: #ffffff;margin-left: 0px;margin-right: 0px;">	
	<p style="text-align: left;"><span><b>Phiếu ghi nhận lỗi - khắc phục - phòng ngừa (<%=totalFixed%>/<%=totalDefect%>)</b></span></p>
	<table style="width: 100%; float: left;" class="wd-table table">
		<thead>
			<tr>
				<th>STT</th>
				<th>Tình trạng</th>				
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.soptdongco"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaodonvi.lanhdaohososoatxet.ketquakiemtra"/></th>				
			</tr>
		</thead>
		<tbody>
		<%
		int row = 1;	
		if (list != null && list.size() > 0) {
			for (IssueTracking item : list) {
		%>
				<tr onclick="businessDoiChieuHoSo('<%=row%>')" id="trIdTblTTinNhomXeNk<%=row%>" class="elementTblTTinNhomXeNk trTblTTinNhomXeNk<%=row%>" onmouseover="onMouseOverTblTTinNhomXeNk('<%=row%>')" onmouseout="onMouseOutTblTTinNhomXeNk('<%=row%>')">
				<td class="text-center " style="width: 5%;"><%=(row++) + searchContainer.getStart() %>
				</td>
				<td style="width: 15%;"><label ><b><font color=<%=item.getDefectStatus() == 0 ? "red" : "blue" %>>[&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    <%=item.getDefectStatus() == 0 ? "NOT OK" : "&nbsp;&nbsp;&nbsp; OK &nbsp;&nbsp;&nbsp; "%>   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;]</font></b></label>
				</td>				
				<td class="text-center " style="width: 10%;"><%=item.getTotalvehicle() %>
				</td>
				<td style="width: 70%;">Ngày ghi nội dung lỗi...<%=DateUtils.dateToString("dd/MM/yyyy HH:mm", item.getCreateddate())%>
					<br> <%=item.getIssuedescription() %>
				</td>
				<td class="text-center" hidden="true">
						<span><input type="radio" id="rdNhomXeNhapKhau<%=row%>" name="rdNhomXeNhapKhau" value="<%=row%>" onclick="businessDoiChieuHoSo('<%=row%>')"/>Xem chi tiết</span>
				</td>
				</tr>
		<%} }%>		
		</tbody> 
	</table>
	<liferay-util:include page="/portlet/quanlyruiro/edit_issue_tracking.jsp" servletContext="<%= application %>"></liferay-util:include>
</div>

<%
PortletURL yeuCauDKVSoatXetLai = renderResponse.createActionURL();
yeuCauDKVSoatXetLai.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_YeuCauDKVSoatXetLai");
yeuCauDKVSoatXetLai.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
yeuCauDKVSoatXetLai.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
yeuCauDKVSoatXetLai.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
yeuCauDKVSoatXetLai.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(idPhieuXuLyPhu));
%>
<aui:form action="<%=yeuCauDKVSoatXetLai.toString()%>" name="formYeuCauDKVSoatXetLai" id="formYeuCauDKVSoatXetLai" method="POST">
<div id="traLaiHoSoDiv">
	<p style="text-align: left;"><span>Lý do yêu cầu ĐKV soát xét lại<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="yeuCauDKVSoatXetLai" name="yeuCauDKVSoatXetLai"><%=StringPool.BLANK%></textarea>
	<%if (1==1) {
	%>
	<div class="row" id="xemLoiVAQ" style="display: block;margin-left: 0px;margin-right: 0px;">
	<a onclick="defectON('<%=StringPool.BLANK%>')"><label>Phiếu ghi nhận lỗi - khắc phục - phòng ngừa</label></a>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a onclick="defectIGNORE('<%=StringPool.BLANK%>')"><label>[&nbsp;&nbsp;&nbsp;Bỏ qua&nbsp;&nbsp;&nbsp;]</label></a>
	&nbsp</div>	
	<div class="row" id="ghiLoiVAQ" style="display: block;margin-left: 0px;margin-right: 0px; margin-top: -10px">
	<liferay-util:include page="/portlet/quanlyruiro/edit_issue_tracking.jsp" servletContext="<%= application %>">
		<liferay-util:param name="<%=StringPool.BLANK %>" value="<%=StringPool.BLANK %>" />
		
		
	</liferay-util:include>
	
	</div>
	<%} %>
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorYeuCauDKVSoatXetLai()) beforSummitForm('formYeuCauDKVSoatXetLai', '<%=yeuCauDKVSoatXetLai.toString()%>')" class="btnThuLyHS form-control" style="width: 150px">Xác nhận</button>
		<button type="button" onclick="eventHideOrShowDiv('traLaiHoSoDiv', 'false')" class="btnThuLyHS form-control" style="width: 200px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>

<%
PortletURL chuyenToNghiepVu = renderResponse.createActionURL();
chuyenToNghiepVu.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_SoatXetBienBanKiemTra");
chuyenToNghiepVu.setParameter(Constants.ID_HO_SO_THU_TUC, String.valueOf(idHoSoThuTuc));
chuyenToNghiepVu.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
chuyenToNghiepVu.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
chuyenToNghiepVu.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(idPhieuXuLyPhu));
chuyenToNghiepVu.setParameter(Constants.ID_INSPECTION_RECORD, String.valueOf(inspectionRecord.getId()));
chuyenToNghiepVu.setParameter(Constants.ID_REGISTERED_INSPECTION, String.valueOf(registeredInspection.getId()));
%>
<aui:form action="<%=chuyenToNghiepVu.toString()%>" name="formChuyenToNghiepVu" id="formChuyenToNghiepVu" method="POST">
<div id="chuyenToNghiepVuDiv">
	<p style="text-align: left;"><span>Ý kiến :</span></p>
	<textarea class="textAreaAutosize" id="chuyenToNghiepVu" name="chuyenToNghiepVu"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="beforSummitForm('formChuyenToNghiepVu', '<%=chuyenToNghiepVu.toString()%>')" class="btnThuLyHS form-control" style="width: 150px">Xác nhận</button>
		<button type="button" onclick="eventHideOrShowDiv('chuyenToNghiepVuDiv', 'false')" class="btnThuLyHS form-control" style="width: 200px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>

<script type="text/javascript">
var url = '<%=getDataAjax%>';
	function summitForm(url) {
		document.getElementById('<portlet:namespace/>myForm').action = url;
	     document.getElementById('<portlet:namespace/>myForm').submit();
	}

	$(document).ready(function() {
		$('ul.tabs li').click(function() {
			var tab_id = $(this).attr('data-tab');

			$('ul.tabs li').removeClass('current');
			$('.tab-content').removeClass('current');

			$(this).addClass('current');
			$("#" + tab_id).addClass('current');
		})

	})
	
	$(function(){
		$('#ketQuaKiemTraDiv').hide();
		$('#noiDungDeNghiThuNghiemAnToanDiv').hide();
		$('#noiDungDeNghiThuNghiemKhiThaiDiv').hide();
		$('#noiDungDeNghiGiamDinhDiv').hide();
		$('#xemBanThaoChungChiDiv').hide();
		$('#traLaiHoSoDiv').hide();
		$('#chuyenToNghiepVuDiv').hide();
		$('#noiDungThamDinhDiv').hide();
		$('#theDem').hide();
		$('#ghiLoi').hide();
		$('#ghiLoiVAQ').hide();
		
	});

	function eventHideOrShowDiv(idElement, isHide) {
		console.log(idElement + isHide);
		if (isHide === 'false') {
			$('#'+idElement).hide();
			//$('#divButton').show();
		} else if (isHide === 'true') { 
			$('#'+idElement).show();
		//	$('#divButton').hide();
		}
	};

	function eventShowOnlyOne(idElement) {
		$('#ketQuaKiemTraDiv').hide();
		$('#noiDungDeNghiThuNghiemAnToanDiv').hide();
		$('#noiDungDeNghiThuNghiemKhiThaiDiv').hide();
		$('#noiDungDeNghiGiamDinhDiv').hide();
		$('#xemBanThaoChungChiDiv').hide();
		$('#traLaiHoSoDiv').hide();
		$('#chuyenToNghiepVuDiv').hide();
		$('#noiDungThamDinhDiv').hide();
		$('#theDem').hide();
		$('#ghiLoi').hide();
		$('#ghiLoiVAQ').hide();
		
		$('#'+idElement).show();
		if(idElement === 'ketQuaKiemTraDiv'){
			callAjaxHienThiBaoCaoBienBanReport();
		}
	};

	function eventHideAndShowDiv(hideElement, showElement) {
			$('#'+hideElement).hide();
			$('#'+showElement).show();
	};

	function eventShowLapBanThao() {
		$('#ketQuaKiemTra').hide();
	};

	function randomNumber(idElement) {
		var d = new Date();
		var n = d.getTime();
		$('#'+idElement).val(n);
	};


	//de ve file js, ko an doan code: <portlet:namespace/>
	function beforSummitForm(idForm, url) {
		console.log('=beforSummitForm=' + idForm);
		var status = confirm("Bạn có muốn tiếp tục xử lý?");
		if (status) {
			document.getElementById('<portlet:namespace/>' + idForm).action = url;
			document.getElementById('<portlet:namespace/>' + idForm).submit();

		} else {
			document.getElementById('<portlet:namespace/>' + idForm).action = '';
		}
	}

	function validatorYeuCauDKVSoatXetLai() {
		var yeuCauDKVSoatXetLai = $('#yeuCauDKVSoatXetLai').val();
		if (yeuCauDKVSoatXetLai.trim().length == 0) {
			alert("Đề nghị nhập lý do !");
			return false;
		}
		return true;
	}

	
	function changedulieu(dataId) {
		
		//alert("---data=="+dataId);
		var comfirmResult = document.getElementById("certificateType").value;
		var inspectionReId = document.getElementById("inspectionRecordAjaxId").value;
		var hsttAjId = document.getElementById("hoSoThuTucAjId").value;
		var pxlpAjId = document.getElementById("phieuXuLyPhuAjId").value;
		var regNoAjId = document.getElementById("registerNoAjId").value;
		if(comfirmResult == 0){
			alert("Chưa chọn đề xuất Kết quả kiểm tra!");
			return;
		} else{
			$.ajax({
				type : 'POST',
				url : url,
				data : {
					ID_HO_SO_THU_TUC : hsttAjId , ID_PHIEU_XU_LY_PHU : pxlpAjId , ID_INSPECTION_RECORD : inspectionReId , vehicleRecordId : dataId, certificateType : comfirmResult , REGISTERED_NUMBER : regNoAjId , type: 'lanhDaoPhongBanThaoCC'
				},
				success : function(data) {
					// preferred
					
					document.getElementById("viewDuLieu").style.display = "";
					
					var data2 = JSON.parse(data);
					var pdfJS = '<%= request.getContextPath() + "/pdf.js/web/viewer.html?file=" %>';
					//var newElement = "<embed src='"+pdfJS+data2.urlFile+"' type='application/pdf' id='FileContent' style='width:95%;height:500px;'>";
					var newElement="<iframe width='100%' height='500px' align='right' style='width:100%;height:500px;' src='"+data2.urlFile+"'></iframe>";
					document.getElementById("viewFile").innerHTML = newElement;
					console.log("===window==" + window);
					reportNewPage(data2.urlFile);
					//var labelPt = document.getElementById("label_pt").value;
					//document.getElementById("value_ajax").value = data;
					//document.getElementById("tongSoPT").innerHTML = labelPt + "&nbsp;" + data2.iddata.length;
					
					
				}
			});
		}
	}
	
	function onMouseOverTblTTinNhomXeNk(row) {
		$('.trTblTTinNhomXeNk' + row).css('cursor','pointer');
		//$('.trTblTTinNhomXeNk' + row).css('background-color', 'yellow');
	}

	function onMouseOutTblTTinNhomXeNk(row) {
		$('.trTblTTinNhomXeNk' + row).css('cursor','');
		//$('.trTblTTinNhomXeNk' + row).css('background-color', '');
	}

	function onMouseOverTblDanhSachPhuongTienKiemTra(id) {
		$('#' + id).attr('style', 'text-decoration: underline; color: rgb(21, 47, 221);cursor: pointer;');
	}

	function onMouseOutTblDanhSachPhuongTienKiemTra(id) {
		$('#' + id).attr('style', 'text-decoration: none; color: #000;cursor: pointer;');
	}
	
	function businessDoiChieuHoSo(row) {
		
		//------START------Boi backgroudColor mau vang vao TR click va mau trang cac TR con lai
		$('#trIdTblTTinNhomXeNk' + row).attr('style', 'background-color: yellow !important');
		//console.log($('#trIdTblTTinNhomXeNk' + row));	
		$('.elementTblTTinNhomXeNk').each(function(index, element) { //loop through each checkbox. class="elementTblTTinNhomXeNk"
			var idTr = element.id;
			if (idTr !== ('trIdTblTTinNhomXeNk' + row)) {
				//console.log(idTr);
				//error $('.trTblTTinNhomXeNk' + row).css('background-color', '');
				$('#' + idTr).attr('style', 'background-color: white !important');
			}
		});
	}
	
	function defectON(urlFile) {
		$('#ghiLoiVAQ').show();
		//window.open(urlFile);
	};
	
	function defectIGNORE(urlFile) {
		$('#ghiLoiVAQ').hide();
		//window.open(urlFile);
	};
</script>
<style type="text/css">

.myContainer {
	width: 800px;
	margin: 0 auto;
}
ul.tabs li {
  border: 1px solid #ddd;
  
}
ul.tabs {
	margin: 0px;
	padding: 0px;
	list-style: none;
}

ul.tabs li {
	background: none;
	color: #222;
	display: inline-block;
	padding: 10px 15px;
	cursor: pointer;
}

ul.tabs li.current {
	background: #ffffff;
    color: #222;
    border-top: 1px solid darkgray;
    border-left: 1px solid darkgray;
    border-right: 1px solid darkgray;
}

.tab-content {
	display: none;
    background: #ffffff;
    padding-top: 10px;
    border-top: 3px solid lightgray;
}

.tab-content.current {
	display: inherit;
}
.yKienDiv{
padding-left: 5% !important;
}
.textlv2{
text-align: left;padding-left: 3%;}

.u6357_container {
    position:absolute;
    left:391px;
    top:137px;
    width:25px;
    height:25px;
}

#tich_img {
    position:absolute;
    left:0px;
    top:0px;
    width:25px;
    height:25px;
}


#rectangle_img {
  position: absolute;
  left: -3px;
  top: -3px;
  width: 26px;
  height: 26px;
}

.tich_normal {
    background-image: url('<%=request.getContextPath()%>/img/tich_normal.png');
}

.yellow_normal {
  background-image: url('<%=request.getContextPath()%>/img/yellow_rec_normal.png');
  
.white_normal {
  background-image: url('<%=request.getContextPath()%>/img/white_rec_normal.png');
}

.red_normal {
  background-image: url('<%=request.getContextPath()%>/img/red_rec_normal.png');
}
</style>