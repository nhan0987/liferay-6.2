<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.CollectionUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="vn.dtt.gt.dk.utils.config.DKConfigurationManager"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestReportImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement"%>
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
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.FormatData"%>

<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/portlet/init.jsp"%>
<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/toTiepNhan.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/dangkiemvien-duocPhanCong.css">
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

System.out.println("*********************quanlyhs/thulyhs/tonghiepvu/qlhs_hs_xacnhanchungchi.jsp ****** ");


long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
	 
System.out.println("*********************Phieu xu ly phu************: " + idPhieuXuLyPhu);

String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
VehicleGroup vehicleGroup  = null;
RegisteredInspection registeredInspection = null;
registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
InspectionRecord inspectionRecord = null;
List<VehicleRecord> allVehicleRecord = null;
SafetestRequirement safetestRequirement = null;
SafetyTestReport safetyTestReport = null;
EmissionTestRequirement emissionTestRequirement = null;
EmissionTestReport emissionTestReport = null;
long vehicleGroupInitialId = 0;
//quay lai trang
PortletURL renderBackURL = renderResponse.createRenderURL();
renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");


// Ghi actionlog
String noidungthaotac = "Mở xem Thụ lý hồ sơ, chức năng Xác nhận bản thảo chứng chỉ thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date())  + " theo hoSoThuTucId " + idHoSoThuTuc; 
String tenmanhinhdaidien = "Xác nhận bản thảo chứng chỉ";
String importername = "";
String inspectorname = user.getScreenName();
long inspectorid = user.getUserId();
QuanLyNguoiDungAction.insertActionLog(idHoSoThuTuc, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

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

	String loaiLoi = ParamUtil.getString(request, Constants.LOAI_THU_TUC);
    String motaNoiDungLoi = ParamUtil.getString(request, Constants.LOAI_DIEU_KIEN);
  

%>


<script type="text/javascript">
var vehicleRecordLists = new Array();
</script>

<style>
ul.tabs li {
  border: 1px solid #ddd;
  
}
.tab-content {
  border: 2px solid #ddd;
  padding-left: 10px;
  padding-right: 10px;
}
.wd-table {
  margin-top: 5px;
}
.reportContainer {
  border: 1px solid #ddd;
}
ul.reportTabs {
  border: 1px solid #C8C8C8;
}
ul.reportTabs li {
  background: none;
  color: #222;
    display: table-cell;
  padding: 10px 15px;
  cursor: pointer;
  width: 20%;
  text-align: center;
  border: inherit;
}

ul.reportTabs li.current {
  background: #EFEFEF;
  color: #222;
}
th {
  text-align: center !important;
  background: rgb(244, 244, 244);
}
td, th {
  padding: 4px;
}
</style>

	<%
		try{
			inspectionRecord = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
			vehicleGroup = VehicleRecordLocalServiceUtil.findVehicleGroupByInspectionRecordId(inspectionRecord.getId());
			safetestRequirement = SafetestRequirementLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
			if(safetestRequirement != null){
				safetyTestReport = SafetyTestReportLocalServiceUtil.findBySafetestRequirementId(safetestRequirement.getId());
			}
			
			emissionTestRequirement = EmissionTestRequirementLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
			if(emissionTestRequirement != null){
				emissionTestReport = EmissionTestReportLocalServiceUtil.findByEmissiontestRequirementId(emissionTestRequirement.getId());
			}
			allVehicleRecord = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
			if(allVehicleRecord != null && allVehicleRecord.size() > 0) {
				VehiclerecordInitial vehicleRecordInitial = VehiclerecordInitialLocalServiceUtil.getVehiclerecordInitial(allVehicleRecord.get(0).getId());
				vehicleGroupInitialId = vehicleRecordInitial.getVehicleGroupId();
			}
		} catch(Exception e){
			
		}
		if(vehicleGroup == null){
			vehicleGroup = new VehicleGroupImpl();
		}
		if(safetyTestReport == null){
			safetyTestReport = new SafetyTestReportImpl();
		}
		if(emissionTestReport == null){
			emissionTestReport = new EmissionTestReportImpl();
		}
		if(registeredInspection == null){
			registeredInspection = new RegisteredInspectionImpl();
		}
		
	%>
		
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<div id="soatXetHoSoButtonDiv">
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
				<button type="button" onclick="eventShowOnlyOne('xemBanThaoChungChiDiv')" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.xembanthaochungchi"/></button>
				<button type="button" onclick="eventShowOnlyOne('traLaiHoSoDiv')" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.tralaihoso"/></button>
				<button type="button" onclick='location.href="<%= dakiemtra_suaBienBanKiemTra%>"' class="btnThuLyHS form-control">Xem biên bản kiểm tra</button>
				<a onclick="checkTrungSoDongCo('<%=idHoSoThuTuc%>')"><button
				type="button" class="btnThuLyHS form-control">Kiểm tra
				trùng số</button></a>

				<a href="<%=renderBackURL%>"><button type="button" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.quaylai"/></button></a>
			</aui:button-row>
		</div>
		<div id="soatXetHoSoDiv" style="display: block;background: #ffffff;">
			<input type="text" hidden="true" name="<%=Constants.DIEU_KIEN_CHUYEN_DICH%>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_PHU_HOP_QUY_DINH%>" /><br>
		
		
			<table class="wd-table table">
				<thead>
					<tr>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.to.nghiep.vu.so.bien.ban" /><br><liferay-ui:message key="vn.gt.dk.qlhs.to.nghiep.vu.ngay.lap.bien.ban" /></th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.to.nghiep.vu.so.tham.chieu" /></th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.to.nghiep.vu.pt.dong.co" /></th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.to.nghiep.vu.ket.qua.kiem.tra" /></th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.to.nghiep.vu.thu.nghiem.an.toan" /></th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.to.nghiep.vu.thu.nghiem.khi.thai" /></th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.to.nghiep.vu.thu.nghiem.giam.dinh" /></th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.thaotac" /></th>
					</tr>
				</thead>
				<tbody>
				<%
						
						boolean isSafe = false;
						boolean isEmiss = false;
						boolean isControl = false;
						
						allVehicleRecord = VehicleRecordLocalServiceUtil.findVehicleRecordHasSafetestrequirement(String.valueOf(inspectionRecord.getId()));
						if(allVehicleRecord != null && allVehicleRecord.size() > 0){
							isSafe = true;
							allVehicleRecord = null;
						}
						
						allVehicleRecord = VehicleRecordLocalServiceUtil.findVehicleRecordHasEmissiontestrequirement(String.valueOf(inspectionRecord.getId()));
						if(allVehicleRecord != null && allVehicleRecord.size() > 0){
							isEmiss = true;
							allVehicleRecord = null;
						}
						
						allVehicleRecord = VehicleRecordLocalServiceUtil.findVehicleRecordHasControlrequirement(String.valueOf(inspectionRecord.getId()));
						if(allVehicleRecord != null && allVehicleRecord.size() > 0){
							isControl = true;
						}
						String soThamChieu=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getReferenceCertificateNo() : StringPool.BLANK ;
					%>
						<tr>
							
							<td class="text-center"><b><%=inspectionRecord.getInspectionRecordNo()%></b><br><%=FormatData.parseDateToTringType3(inspectionRecord.getInspectionRecordDate())%></td>
							<td class="text-center"><%=soThamChieu%></td>
							<td class="text-center"><%=VehicleRecordLocalServiceUtil.countVehicleRecord(inspectionRecord.getId()) %></td>
							<td class="text-center"><a onclick="eventShowOnlyOne('ketQuaKiemTraDiv')"> <%=CommonUtils.getKetQuaKiemTra(String.valueOf(inspectionRecord.getConfirmedResult()))%></a></td>
							
							<td class="text-center"><a href="#" onclick="eventShowOnlyOne('noiDungDeNghiThuNghiemAnToanDiv')"><%=((inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP)? "Chưa lập" : ((inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP) ? "Ðã lập" : ((inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP) ? "Không yêu cầu" : "")))%></a></td> 
							<td class="text-center"><a href="#"  onclick="eventShowOnlyOne('noiDungDeNghiThuNghiemKhiThaiDiv')"><%=((inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP)? "Chưa lập" : ((inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP) ? "Ðã lập" : ((inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP) ? "Không yêu cầu" : "")))%></a></td>
							<td class="text-center"><a href="#"  onclick="eventShowOnlyOne('noiDungDeNghiGiamDinhDiv')"> <%=((inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP)? "Chưa lập" : ((inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP) ? "Ðã lập" : ((inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP) ? "Không yêu cầu" : "")))%></a></td>
							
							<td class="text-center">
								<img title="Xem nội dung thẩm định hồ sơ" src="<%=request.getContextPath()%>/img/u6851_normal.png" onclick="eventShowOnlyOne('noiDungThamDinhDiv')">
							</td>
						</tr>
				</tbody> 
			</table>
		
		</div>
		<!------------------------- Noi dung chi tiet --------------------------->
		<div id="ketQuaKiemTraDiv" style="display: block;background: #ffffff;">
			<jsp:include page="/portlet/quanlyhs/thulyhs/lanhdaodonvi/ketqua_lapbienban_kiemtra.jsp"></jsp:include>
		</div>
<!--  
		<div id="noiDungDeNghiThuNghiemAnToanDiv" style="display: block;background: #ffffff;">
			<div>
				<p style="text-align: left;"><span><b>N?i dung d? ngh? th? nghi?m an toàn</b></span></p>
			</div>
		</div>
		<div id="noiDungDeNghiThuNghiemKhiThaiDiv" style="display: block;background: #ffffff;">
			<div>
				<p style="text-align: left;"><span><b>N?i dung d? ngh? th? nghi?m khí th?i</b></span></p>
				<div id="bangthiNghiemKhiThai" class="yKienDiv">
					<table>
						<tr>
							<td><span>K?t qu?:</span></td>
							<td><span id="khiThaiKetQua"></span></td>
						</tr>
						<tr>
							<td><span>Ngày ki?m tra:</span></td>
							<td><span id="khiThaiNgayKt"></span></td>
						</tr>
						<tr>
							<td><span>Ngu?i ki?m tra:</span></td>
							<td><span id="khiThaiNguoiKt"></span></td>
						</tr>
						<tr>
							<td><span>Lý do không d?t:</span></td>
							<td><span id="khiThaiLyDoKhongDat"></span></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<div id="noiDungDeNghiGiamDinhDiv" style="display: block;background: #ffffff;">
			<div>
				<p style="text-align: left;"><span><b>N?i dung biên b?n ki?m tra</b></span></p>
			</div>
		</div>
-->	
		<div id="noiDungDeNghiThuNghiemAnToanDiv" style="display: block;background: #ffffff;">
		<%
		if(inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_DA_LAP){
		%>
			<div>
				<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.noidungdenghithunghiemantoan"/></b></span></p>
				<jsp:include page="/portlet/quanlyhs/thulyhs/tonghiepvu/an_toan_203.jsp"></jsp:include>
			</div>
		<%
		} else if(inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP){
		%>
			<div>
				<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.chualapdenghithunghiemantoan"/></b></span></p>
			</div>
		<%
		} else if(inspectionRecord.getMarkupSafeTest()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP){
		%>
			<div>
				<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.khongyeucaudenghithunghiemantoan"/></b></span></p>
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
				<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.noidungdenghithunghiemkhithai"/></b></span></p>
				<jsp:include page="/portlet/quanlyhs/thulyhs/tonghiepvu/khi_thai_202.jsp"></jsp:include>
			</div>
		<%
		} else if(inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP){
		%>
			<div>
				<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.chualapdenghithunghiemkhithai"/></b></span></p>
			</div>
		<%
		} else if(inspectionRecord.getMarkupEmissionTest()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP){
		%>
			<div>
				<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.khongyeucaudenghithunghiemkhithai"/></b></span></p>
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
				<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.noidungdenghigiamdinh"/></b></span></p>
				<jsp:include page="/portlet/quanlyhs/thulyhs/tonghiepvu/giam_dinh_204.jsp"></jsp:include>
			</div>
		<%
		} else if(inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_CO_LAP){
		%>
			<div>
				<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.chualapdenghigiamdinh"/></b></span></p>
			</div>
		<%
		} else if(inspectionRecord.getMarkupControl()==Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP){
		%>
			<div>
				<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.khongyeucaudenghigiamdinh"/></b></span></p>
			</div>
		<%
		}
		%>
		</div>
		
		<div id="xemBanThaoChungChiDiv">
			<portlet:actionURL var="toNghiepVuXacNhanChungChi" name="toNghiepVuXacNhanChungChi">
				<portlet:param name="<%=Constants.DIEU_KIEN_CHUYEN_DICH %>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_LANH_DAO_PHONG_KY %>"/>
				<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
				<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(idHoSoThuTuc) %>"/>
				<portlet:param name="<%=Constants.REGISTERED_NUMBER %>" value="<%=String.valueOf(registeredInspection.getRegisteredNumber()) %>"/>
				<portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=String.valueOf(idPhieuXuLyPhu) %>"/>
				<portlet:param name="<%=Constants.ID_INSPECTION_RECORD %>" value="<%=String.valueOf(inspectionRecord.getId()) %>"/>
			</portlet:actionURL>
			<aui:form action="" method="post" name="myForm" id="myForm" >
				<div id="viewDuLieu" >
					<table style="width: 100%">
						<tr>
							<td style="width: 40%;vertical-align:top;position:static;">
								<div id="viewdata" style="padding-left:5px;">
									<input type="hidden" id='listVehicleRecordId' name='listVehicleRecordId' value='' >
									<table style='width:96%;' class='wd-table table'>
										<tr>
											<td style="background: solid;"><b>STT</b></td>
											<td align = 'center'><input id = "check_all" name ="check_all" type="checkbox" onclick="checkAll();"/></td>
											<td style="background: solid;"><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.nhanhieu"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.soloai"/></b></td>
											<td style="background: solid;"><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.sokhung"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.sodongco"/></b></td>
											<td style="background: solid;"><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.tinhtrang"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.sothamchieu"/></b></td>
										</tr>
									<%
									
										allVehicleRecord = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
										
										String nhanHieuSoLoai=ReportUtils.getTenDmData(ReportConstant.TRADE_MARK, vehicleGroup.getTradeMark())
												+"<br>"+vehicleGroup.getCommercialName();
									
										int i = 0;
										int index = 0;
										if (allVehicleRecord!=null && allVehicleRecord.size()>0){
											for (VehicleRecord item: allVehicleRecord){
												if (item.getDraftCertificateId()>0 && item.getCertificateRecordId() == 0){
													i = i + 1;
													String soKhungDongCo=item.getChassisNumber()+"<br>"+item.getEngineNumber();
													String tinhTrangThamChieu = "";
													if (item.getVehicleEngineStatus().trim().compareToIgnoreCase(Constants.Vehicle_Engine_Status_0) == 0) {
														tinhTrangThamChieu = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-0", item.getVehicleEngineStatus());
													} else if (item.getVehicleEngineStatus().trim().compareToIgnoreCase(Constants.Vehicle_Engine_Status_1) == 0) {
														tinhTrangThamChieu = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-1", item.getVehicleEngineStatus());
													} else {
														tinhTrangThamChieu = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-2", item.getVehicleEngineStatus());
													}
													tinhTrangThamChieu +=  "<br>"+soThamChieu;									%>	
									<script type="text/javascript">
					vehicleRecordLists[<%=index++%>] = "<%=item.getId()%>";
					</script>
													
											<tr>
											<td style="text-align: center"><a onclick="changedulieu('<%=item.getId()%>');"><%= i %></a></td>
											<td align = "center"><input type='checkbox' id='<%=item.getId() %>' style=';' class='user'  onclick="changeajax('<%=item.getId() %>');"/></td>
											<td><a onclick="changedulieu('<%=item.getId()%>');"><%=nhanHieuSoLoai %></a></td>
											<td><a onclick="changedulieu('<%=item.getId()%>');"><%=soKhungDongCo %></a></td>
											<td><a onclick="changedulieu('<%=item.getId()%>');"><%=tinhTrangThamChieu %></a></td>
										</tr>
									<%				
												}
											}
										}
									%>
									</table>
								</div>
							</td>
							<td style="vertical-align:top;position:static;">
								<div id="viewFile">
								</div>
							</td>
							
						</tr>
					</table>
				</div>
				<div><p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.ghichuvaobanthaochungchi"/></span></p></div>
				<%
				DraftCertificate draftCertificate = DraftCertificateLocalServiceUtil.fetchByInspectionReportId(inspectionRecord.getId());
				%>
				<div><textarea class="textAreaAutosize" id="ghiChuBanThao" name="ghiChuBanThao"><%=Validator.isNotNull(draftCertificate) ? draftCertificate.getRemarks() : ""%></textarea></div>
				<aui:button-row>
					<button type="button" id="lapBanThaoChungChiId"  onclick="lapBanThaoChungChi('<%=toNghiepVuXacNhanChungChi%>')"  class=" btnThuLyHS form-control">Lập chứng chỉ</button>
					<a href="<%=renderBackURL%>"><button type="button" onclick="eventHideAndShowDiv('xemBanThaoChungChi','soatXetHoSo')" class=" btnThuLyHS form-control">Quay lại</button></a>
				</aui:button-row>
			</aui:form>
		</div>
		<div id="traLaiHoSoDiv">
			<portlet:actionURL var="toNghiepVuTraLaiHoSo" name="toNghiepVuTraLaiHoSo">
		<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
		<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(idHoSoThuTuc) %>"/>
		<portlet:param name="<%=Constants.REGISTERED_NUMBER %>" value="<%=String.valueOf(registeredInspection.getRegisteredNumber()) %>"/>
		<portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=String.valueOf(idPhieuXuLyPhu) %>"/>
		<portlet:param name="<%=Constants.ID_INSPECTION_RECORD %>" value="<%=String.valueOf(inspectionRecord.getId()) %>"/>
			</portlet:actionURL>
			<aui:form action="<%=toNghiepVuTraLaiHoSo %>" method="post" name="formToNghiepVuTraLaiHoSo" id="formToNghiepVuTraLaiHoSo" >
				<div>
					<table style="width: 100%">
						<tr>
						    <td><input id="selectLanhDao" name="selectLanhDao" type="checkbox" value="1"/>
						    <label for="selectLanhDao" ><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.tralailanhdaodonvikiemtra"/></label>
						    </td>
					    </tr>
					    <tr>
						    <td><div style="padding-left: 3%;"><textarea class="textAreaAutosize" id="taaTraLaiLdvkt" name="taaTraLaiLdvkt"><%=StringPool.BLANK%></textarea></div></td>
					    </tr>
					    <tr>
						    <td><input id="selectGiamDinh" name="selectGiamDinh" type="checkbox" value="2"/>
						    <label for="selectGiamDinh" ><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.tralaigiamdinh"/></label>
						    </td>
					    </tr>
					    <tr>
						    <td><div style="padding-left: 3%;"><textarea class="textAreaAutosize" id="taaTraLaiGiamDinh" name="taaTraLaiGiamDinh"><%=StringPool.BLANK%></textarea></div></td>
					    </tr>
					    <tr>
						    <td><input id="selectThuNghiem" name="selectThuNghiem" type="checkbox" value="3"/>
						    <label for="selectThuNghiem" ><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.tralaithunghiem"/></label>
						    </td>
					    </tr>
					    <tr>
						    <td><div style="padding-left: 3%;"><textarea class="textAreaAutosize" id="taaTraLaiThuNghiem" name="taaTraLaiThuNghiem"><%=StringPool.BLANK%></textarea></div></td>
					    </tr>
					</table>
				</div>
				
				<%if (1==1) {
	%>
	<div class="row">
				<div class="col-xs-4 col-sm-4 col-md-4 col-md-left" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Loại lỗi (<span style="color: red;">*</span>) </label>
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2 col-md-left" style="margin-left: 40px; height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Hệ số (<span style="color: red;">*</span>) </label>
				</div>
	</div>
	<div class="row" style="margin-left: 40px;">
				<div class="col-xs-4 col-sm-4 col-md-4 col-md-left">
					<tr>
						<%if (Validator.isNotNull(lstLoaiLoi) && lstLoaiLoi.size() > 0) {
							for (DmDataItem item : lstLoaiLoi) {						
						%>
						<td class="text-center">
						<input type="checkbox" id="xemDuLieu<%=item.getCode0()%>" name="xemDuLieu<%=item.getCode0()%>" onchange="checkDuLieu('<%=item.getCode0()%>')" title="<%=item.getName()%>"/>
						<label for="xemDuLieu<%=item.getCode0()%>" title="<%=item.getName()%>"><%=item.getCode3()%> <%=item.getName()%></label> &nbsp;&nbsp;&nbsp;&nbsp;
					</td><br>
					
					<%} }%>
					</tr>
				</div>
				
				<div class="col-xs-6 col-sm-6 col-md-6" style="margin-left: 40px;">
					<tr>
					<%if (Validator.isNotNull(lstMucDichNhapKhau) && lstMucDichNhapKhau.size() > 0) {
						for (DmDataItem item : lstMucDichNhapKhau) {							
					%>
					<td class="text-center">
						<input type="checkbox" id="xemDuLieu<%=item.getCode0()%>" name="xemDuLieu<%=item.getCode0()%>" onchange="checkDuLieu('<%=item.getCode0()%>')" title="<%=item.getName()%>"/>
						<label for="xemDuLieu<%=item.getCode0()%>" title="<%=item.getName()%>"><%=item.getCode3()%> <%=item.getName()%></label> &nbsp;&nbsp;&nbsp;&nbsp;
					</td><br>
					
					<%} }%>
					
					<%if (Validator.isNotNull(lstTinhTrangPhuongTien) && lstTinhTrangPhuongTien.size() > 0) {
						for (DmDataItem item : lstTinhTrangPhuongTien) {							
					%>
					<td class="text-center">
						<input type="checkbox" id="xemDuLieu<%=item.getCode0()%>" name="xemDuLieu<%=item.getCode0()%>" onchange="checkDuLieu('<%=item.getCode0()%>')" title="<%=item.getName()%>"/>
						<label for="xemDuLieu<%=item.getCode0()%>" title="<%=item.getName()%>"><%=item.getCode3()%> <%=item.getName()%></label> &nbsp;&nbsp;&nbsp;&nbsp;
					</td><br>
					
					<%} }%>
					
					<%if (Validator.isNotNull(lstTinhTrangChungNhan) && lstTinhTrangChungNhan.size() > 0) {
						for (DmDataItem item : lstTinhTrangChungNhan) {							
					%>
					<td class="text-center">
						<input type="checkbox" id="xemDuLieu<%=item.getCode0()%>" name="xemDuLieu<%=item.getCode0()%>" onchange="checkDuLieu('<%=item.getCode0()%>')" title="<%=item.getName()%>"/>
						<label for="xemDuLieu<%=item.getCode0()%>" title="<%=item.getName()%>"><%=item.getCode3()%> <%=item.getName()%></label> &nbsp;&nbsp;&nbsp;&nbsp;
					</td><br>
					
					<%} }%>
					
					<%if (Validator.isNotNull(lstPhamViHoatDong) && lstPhamViHoatDong.size() > 0) {
						for (DmDataItem item : lstPhamViHoatDong) {							
					%>
					<td class="text-center">
						<input type="checkbox" id="xemDuLieu<%=item.getCode0()%>" name="xemDuLieu<%=item.getCode0()%>" onchange="checkDuLieu('<%=item.getCode0()%>')" title="<%=item.getName()%>"/>
						<label for="xemDuLieu<%=item.getCode0()%>" title="<%=item.getName()%>"><%=item.getCode3()%> <%=item.getName()%></label> &nbsp;&nbsp;&nbsp;&nbsp;
					</td><br>
					
					<%} }%>
					</tr>	
				
		</div>
	</div>
	<div class="row">
				<div class="col-xs-4 col-sm-4 col-md-4 col-md-left" style="height: 30px">
					<label class="textlabel" style="margin-top: -5px;">Nguyên nhân không phù hợp (<span style="color: red;">*</span>) </label>
				</div>
	</div>
	<div class="row" style="margin-left: 40px;">
			<div class="col-xs-8 col-sm-8 col-md-8 col-md-left">
				<tr>
				<%if (Validator.isNotNull(lstPhanLoaiNghiepVu) && lstPhanLoaiNghiepVu.size() > 0) {
					for (DmDataItem item : lstPhanLoaiNghiepVu) {							
				%>
				<td class="text-center">
					<input type="checkbox" id="xemDuLieu<%=item.getCode0()%>" name="xemDuLieu<%=item.getCode0()%>" onchange="checkDuLieu('<%=item.getCode0()%>')" title="<%=item.getName()%>"/>
					<label for="xemDuLieu<%=item.getCode0()%>" title="<%=item.getName()%>"><%=item.getCode3()%> <%=item.getName()%></label> &nbsp;&nbsp;&nbsp;&nbsp;
				</td>
				
				<%} }%>

				</tr>
			</div>
			<div class="col-xs-3 col-sm-3 col-md-3" style="margin-left: 40px;">						
				<label ><b><font color='red'>Tình trạng: [&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    NOT OK   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;]</font></b></label><br>
			</div>
				
	</div>
	<div class="row">
				<div class="col-xs-6 col-sm-6 col-md-6" style="margin-left: 40px;">	
					<div class="row">
						<label style="margin-top: -50px; margin-left: -20px;">1. Mô tả nội dung lỗi</label><br>
					</div>				
					<textarea class="textAreaAutosize" rows="20" cols="40" style="width: 100%; height: 365px" id="motaNoiDungLoi" name="motaNoiDungLoi"><%=StringPool.BLANK%></textarea>
				</div>
				<div class="col-xs-4 col-sm-4 col-md-4 col-md-left">					
					<div class="row">
					<label style="margin-top: -50px;">2. Nguyên nhân</label><br>
					<textarea class="textAreaAutosize" rows="20" cols="40" style="width: 125%; height: 160px" id="motaNoiDungLoi" name="motaNoiDungLoi"><%=StringPool.BLANK%></textarea>
					</div>
					<div class="row">
					<label style="margin-top: -50px;">3. Biện pháp khắc phục tạm thời</label><br>
					<textarea class="textAreaAutosize" rows="20" cols="40" style="width: 125%; height: 180px" id="motaNoiDungLoi" name="motaNoiDungLoi"><%=StringPool.BLANK%></textarea>
					</div>
					<div class="row">
					</div>					
				</div>
	</div>
	<div class="row">
				<div class="col-xs-6 col-sm-6 col-md-6" style="margin-left: 40px;">	
					<div class="row">
						<label style="margin-top: -50px; margin-left: -20px;">4. Biện pháp khắc phục lâu dài</label><br>
					</div>				
					<textarea class="textAreaAutosize" rows="20" cols="40" style="width: 100%; height: 300px" id="motaNoiDungLoi" name="motaNoiDungLoi"><%=StringPool.BLANK%></textarea>
				</div>
				<div class="col-xs-4 col-sm-4 col-md-4 col-md-left">					
					<div class="row">
					<label style="margin-top: -50px;">5. Biện pháp phòng ngừa</label><br>
					<textarea class="textAreaAutosize" rows="20" cols="40" style="width: 125%; height: 300px" id="motaNoiDungLoi" name="motaNoiDungLoi"><%=StringPool.BLANK%></textarea>
					</div>					
					<div class="row">
					</div>					
				</div>
	</div>
	
	<%} %>
	
				<aui:button-row>
					<button type="button" onclick="if(validatorToNghiepVuTraLaiHoSo()) beforSummitForm('formToNghiepVuTraLaiHoSo','<%=toNghiepVuTraLaiHoSo%>')"  class=" btnThuLyHS form-control">Yêu cầu soát xét lại</button>
					<a href="<%=renderBackURL%>"><button type="button" onclick="eventHideAndShowDiv('traLaiHoSo','soatXetHoSo')" class=" btnThuLyHS form-control">Quay lại</button></a>
				</aui:button-row>
			</aui:form>
		</div>
		<div id="noiDungThamDinhDiv">
			<!------------------ Danh sách PT ÐN KT ------------------>
			<div style="width: 30px">&nbsp</div>
			<div>
				<p style="text-align: left;">
					<span style="font-size: 13px; font-weight: bold;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.danhsachptkt"/></span>
				</p>
			</div>
			<div>
				<!-- vr-vehicleRecore -->
				<div style="float: left; text-align: left; width: 39%;">
					<%
						allVehicleRecord = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
					%>
					<span>Tổng số PT: <%=allVehicleRecord.size() %> </span>
					<table style="width: 100%" border="1px" id="tblDanhSachVehicleRecord" class="wd-table table">
						<thead>
							<tr>
								<th style="background: solid;" class="text-center"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.nhanhieu"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.soloai"/></b></span></th>
								<th style="background: solid;" class="text-center"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.sokhung"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.sodongco"/></b></span></th>
								<th style="background: solid;" class="text-center"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.tinhtrang"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchi.sothamchieu"/></b></span></th>
							</tr>
						</thead>
						<tbody>
						<%
						VehicleRecord vehicleRecord = null;
						
						if(allVehicleRecord != null && allVehicleRecord.size() > 0){
							
							String nhanHieuSoLoai="<b>"+ReportUtils.getTenDmData(ReportConstant.TRADE_MARK, vehicleGroup.getTradeMark())+"</b><br>"
									+vehicleGroup.getCommercialName();
							nhanHieuSoLoai = nhanHieuSoLoai.replaceAll("'","");
							
							for (int i = 0; i < allVehicleRecord.size(); i++) {
								vehicleRecord  = allVehicleRecord.get(i);
								
								String soKhungDongCo="<b>"+vehicleRecord.getChassisNumber()+"</b><br>"+vehicleRecord.getEngineNumber();
								String tinhTrangThamChieu = "";
								if (vehicleRecord.getVehicleEngineStatus().trim().compareToIgnoreCase(Constants.Vehicle_Engine_Status_0) == 0) {
									tinhTrangThamChieu = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-0", vehicleRecord.getVehicleEngineStatus());
								} else if (vehicleRecord.getVehicleEngineStatus().trim().compareToIgnoreCase(Constants.Vehicle_Engine_Status_1) == 0) {
									tinhTrangThamChieu = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-1", vehicleRecord.getVehicleEngineStatus());
								} else {
									tinhTrangThamChieu = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-2", vehicleRecord.getVehicleEngineStatus());
								}
								//tinhTrangThamChieu = "<b>"+ tinhTrangThamChieu +"</b><br>"+vehicleRecord.getCodeNumber();
								tinhTrangThamChieu = "<b>"+ tinhTrangThamChieu +"</b><br>"+vehicleGroup.getReferenceCertificateNo();
								
						%>
							<tr>
								<td class="text-center"><%=nhanHieuSoLoai %></td>
								<td class="text-center"><%=soKhungDongCo %></td>
								<td class="text-center"><%=tinhTrangThamChieu %></td>
							</tr>
						
						<%
							}
						}
						%>
						</tbody>
					</table>
				</div>
				
			</div>
		</div>
	</div>
</div>


<portlet:resourceURL var="getDataAjax">
</portlet:resourceURL>
<script type="text/javascript">
	var url = '<%=getDataAjax%>';

	function summitForm(url) {
		var status = confirm("Bạn có muốn tiếp tục xử lý?");
		if (status) {
			document.getElementById('<portlet:namespace/>myForm').action = url;
	     	document.getElementById('<portlet:namespace/>myForm').submit();
		} else {
			document.getElementById('<portlet:namespace/>myForm').action = '';
		}
	}

	function beforSummitForm(idForm, url) {
		console.log('=beforSummitForm=' + idForm);
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
	
	function lapBanThaoChungChi(url) {
		var listVehicleRecordId=document.getElementById('listVehicleRecordId').value;
		if (listVehicleRecordId.trim()==''){
			alert("Chưa lựa chọn xe để lập chứng chỉ.");
			return;
		}else {
			document.getElementById('<portlet:namespace/>myForm').action = url;
		    document.getElementById('<portlet:namespace/>myForm').submit();
		    
		    document.getElementById('lapBanThaoChungChiId').disabled = true;
		}
		
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
	
	$(document).ready(function() {
		$('ul.reportTabs li').click(function() {
			//lay ra id cua tab, duoc de trong data-tab
			var tab_id = $(this).attr('data-tab');
			$('ul.reportTabs li').removeClass('current');
			$('.tab-content-report').removeClass('current');
			$(this).addClass('current');
			$("#" + tab_id).addClass('current');
		})
	})
	
	function clearTable(tableName) {
		var table = document.getElementById(tableName);
		var length = table.rows.length;
//		 alert("so dong: " + table.rows.length);
		for(var i = table.rows.length - 1; i > 0; i--)
		{
		    table.deleteRow(i);
		}
	}

	function changedulieu(dataId) {
		
		//alert("---data=="+dataId);

		$.ajax({
			type : 'POST',
			url : url,
			data : {
				vehicleRecordId : dataId, type: 'lanhDaoPhong'
			},
			success : function(data) {
				// preferred
				
				document.getElementById("viewDuLieu").style.display = "";
				
				var data2 = JSON.parse(data);
				
				var pdfJS = '<%= request.getContextPath() + "/pdf.js/web/viewer.html?file=" %>';
				//var newElement = "<embed src='"+pdfJS+data2.urlFile+"' type='application/pdf' id='FileContent' style='width:100%;height:500px;'>";
				var newElement="<iframe width='100%' height='500px' align='right' style='width:100%;height:500px;' src='"+data2.urlFile+"'></iframe>";
				
				document.getElementById("viewFile").innerHTML = newElement;
				reportNewPage(data2.urlFile);
				//var labelPt = document.getElementById("label_pt").value;
				//document.getElementById("value_ajax").value = data;
				//document.getElementById("tongSoPT").innerHTML = labelPt + "&nbsp;" + data2.iddata.length;
				
				
			}
		});
	}
	
	function changedata(dataId) {
		//alert("---data=="+dataId);
		eventShowOnlyOne('ketQuaKiemTraDiv');
		$.ajax({
			type : 'POST',
			url : url,
			data : {
				dataId : dataId,
				type : 'ToNghiepVuKetQuaKT'
			},
			success : function(data) {
				// preferred
				var data2 = JSON.parse(data);
// y kien dang kiem vien
//				$('#dkvKetQua').val(data2.dkvKetQua[0]);	
//				$('#dkvNgayKt').val(data2.dkvNgayKt[0]);	
//				$('#dkvNguoiKt').val(data2.dkvNguoiKt[0]);	
//				$('#dkvNoiDung').val(data2.dkvNoiDung[0]);	
// thong tin chung common
//				$('#ttcSoBienBanKt').val(data2.ttcSoBienBanKt[0]);	
//				$('#ttcNgayKt').val(data2.ttcNgayKt[0]);	
//				$('#ttcDiaDiemKt').val(data2.ttcDiaDiemKt[0]);	
//				$('#ttcLanKt').val(data2.ttcLanKt[0]);	
//				$('#ttcSoThamChieu').val(data2.ttcSoThamChieu[0]);	
//bang thong tin chung				
				// Xoa cac old item in select
				clearTable('bangThongTinChung');
				for ( var i = 0; i < data2.id_dspt.length; i++) {
					$('#bangThongTinChung tr:last').after(newRowThongTinChung(i + 1, data2.dsptktNhanHieuSoLoai[i], data2.dsptktSoKhung[i], data2.dsptktDongCo[i], data2.dsptTinhTrang[i], data2.dsptSoThamChieu[i]));
				}

// Bang thong tin kiem tra
				clearTable('bangThongTinKiemTra');
				for ( var i = 0; i < data2.id_ttkt.length; i++) {
					$('#bangThongTinKiemTra tr:last').after(newRowThongTinKiemTra(i + 1, data2.ttktColor[i], data2.ttktName[i], data2.ttktGtDangKy[i], data2.ttktGtKiemTra[i], data2.ttktThaoTac[i]));
				}

// thong tin chung tong ket
				$('#ttktDat').text(data2.ttktDat[0]);	
				$('#ttktKhongDat').text(data2.ttktKhongDat[0]);	
				$('#ttktSuaDoi').text(data2.ttktSuaDoi[0]);	
				$('#ttktKhongApDung').text(data2.ttktKhongApDung[0]);
				

// thong tin chung divbutton
//				$('#vehicleGroupCmp').val(data2.vehicleGroupCmp[0]);
			}
		});
	}

	
	function xemBanThao() {
		
//		alert("VAo changeDuLieu");
//		var dataId = $('#vehicleGroupCmp').val();
//		alert("---data=="+dataId);
		var nhomId=1;
		
		eventShowOnlyOne('xemBanThaoChungChiDiv');
		
		$.ajax({
			type : 'POST',
			url : url,
			data : {
				dataId : '<%=vehicleGroup.getId()%>', type: 'ToNghiepVuSoanBanThao',nhomId:nhomId
			},
			success : function(data) {
				// preferred
				var data2 = JSON.parse(data);
				
				var giaTriText="<input type='text' id='listVehicleRecordId' name='listVehicleRecordId' value='' >"+
					"<table style='width:96%;' class='wd-table table'><tr>"+
					"<td>Nhóm</td>"+
					"<td>Nhãn hi?u <br> S? lo?i</td>"+
					"<td>S? khung <br> S? d?ng co</td>"+
					"<td>Tình tr?ng <br> S? tham chi?u</td></tr>";
				// Xoa cac old item in select
				for ( var i = 0; i < data2.iddata.length; i++) {
					var duLieu=" <tr>";
					duLieu=duLieu+ "<td><input type='checkbox' id='"+data2.iddata[i]+"' style='float: left;' class='user'  onclick=\"changeajax('"+data2.iddata[i]+"');\"/> &nbsp; Nhóm "+data2.nhomdata[i]+"</td>";
					duLieu=duLieu+ "<td>"+data2.nhanhieudata[i]+"</td>";
					duLieu=duLieu+ "<td>"+data2.sokhungdata[i]+"</td>";
					duLieu=duLieu+ "<td>"+data2.tinhtrangdata[i]+"</td>";
					duLieu=duLieu+"</tr>";
						//obj.add(new Option(data2.namechuyengia[i], data2.idchuyengia[i]), null);
					giaTriText=giaTriText+duLieu;
				}
				document.getElementById("viewdata").innerHTML = giaTriText+" </table>";

				var pdfJS = '<%= request.getContextPath() + "/pdf.js/web/viewer.html?file=" %>';
				//var newElement = "<embed src='"+pdfJS+data2.urlFile+"' type='application/pdf' id='FileContent' style='width:95%;height:500px;'>";
				var newElement="<iframe width='100%' height='500px' align='right' style='width:100%;height:500px;' src='"+data2.urlFile+"'></iframe>";
				document.getElementById("viewFile").innerHTML = newElement;
				
			}
		});

	}
	
	function changeajax_old(dataId) {
		
		var isCheck=document.getElementById(dataId).checked;
		var listVehicleRecordId=document.getElementById('listVehicleRecordId').value;
		if (isCheck==true){
			//alert("--true");
			listVehicleRecordId=listVehicleRecordId+dataId+", ";
		}else{
			//alert("--false");
			var res = listVehicleRecordId.replace(dataId+", ", "");
			listVehicleRecordId=res;
		}
		document.getElementById('listVehicleRecordId').value=listVehicleRecordId;
	}


	function changeajax(dataId) {
		
		var isCheck=document.getElementById(dataId).checked;
		var listVehicleRecordId=document.getElementById('listVehicleRecordId').value;
		if (isCheck==true){
			//alert("--true");
			listVehicleRecordId=listVehicleRecordId+dataId+", ";
		}else{
			//alert("--false");
			var res = listVehicleRecordId.replace(dataId+", ", "");
			listVehicleRecordId=res;
		}
		document.getElementById('listVehicleRecordId').value=listVehicleRecordId;
	}

	function checkAll() {
		
		var isCheck1=document.getElementById('check_all').checked;
		var listVehicleRecordId="";

		if (isCheck1==true){
			for ( var i = 0; i < vehicleRecordLists.length; i++) {
				document.getElementById(vehicleRecordLists[i]).checked = "checked";
				listVehicleRecordId = listVehicleRecordId + vehicleRecordLists[i] + ", ";
			}
			document.getElementById('listVehicleRecordId').value = listVehicleRecordId;
		} else {
			for ( var i = 0; i < vehicleRecordLists.length; i++) {
				document.getElementById(vehicleRecordLists[i]).checked = '';
			}
			document.getElementById('listVehicleRecordId').value = '';
		}
	}

	
	$(function(){
		$('#ketQuaKiemTraDiv').hide();
		$('#noiDungDeNghiThuNghiemAnToanDiv').hide();
		$('#noiDungDeNghiThuNghiemKhiThaiDiv').hide();
		$('#noiDungDeNghiGiamDinhDiv').hide();
		$('#xemBanThaoChungChiDiv').hide();
		$('#traLaiHoSoDiv').hide();
		$('#noiDungThamDinhDiv').hide();
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
		$('#noiDungThamDinhDiv').hide();
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

	function newRowThongTinChung(stt, nhanHieuSoLoai, soKhung, soDongCo, tinhTrang, soThamChieu) {
		var duLieu=" <tr>";
		duLieu=duLieu+ "<td><span>" + stt + "</span></td>";
		duLieu=duLieu+ "<td><span>" + nhanHieuSoLoai + "</span></td>";
		duLieu=duLieu+ "<td><span>" + soKhung + "<br>" + soDongCo + "</span></td>";
		duLieu=duLieu+ "<td><span>" + tinhTrang + "</span></td>";
		duLieu=duLieu+ "<td><span>" + soThamChieu + "</span></td>";
		duLieu=duLieu+"</tr>";
		return duLieu;
	};

	function newRowThongTinKiemTra(stt, color, name, gtDangKy, gtKiemTra, gtKetQua) {
		var duLieu=" <tr style='background-color: "+color+"'>";
		duLieu=duLieu+ "<td><span>" + stt + "</span></td>";
		duLieu=duLieu+ "<td><span>" + name + "</span></td>";
		duLieu=duLieu+ "<td><span>" + gtDangKy + "</span></td>";
		duLieu=duLieu+ "<td><span>" + gtKiemTra + "</span></td>";
		duLieu=duLieu+ "<td><span>" + gtKetQua + "</span></td>";
		duLieu=duLieu+"</tr>";
		return duLieu;
	};

	function validatorToNghiepVuTraLaiHoSo() {
		var isCheckLanhDao = document.getElementById('selectLanhDao').checked;
		var isCheckGiamDinh = document.getElementById('selectGiamDinh').checked;
		var isCheckThuNghiem = document.getElementById('selectThuNghiem').checked;

		var textLanhDao = document.getElementById('taaTraLaiLdvkt').value;
		var textGiamDinh = document.getElementById('taaTraLaiGiamDinh').value;
		var textThuNghiem = document.getElementById('taaTraLaiThuNghiem').value;
		
		if(isCheckLanhDao === false && isCheckGiamDinh === false && isCheckThuNghiem === false){
			alert("Chưa chọn đối tượng để trả lại !");
			return false;
		}
		if(isCheckLanhDao === true && textLanhDao.length === 0){
			alert("Chưa nhập lý do Trả lại lãnh đạo !");
			return false;
		}
		if(isCheckGiamDinh === true && textGiamDinh.length === 0){
			alert("Chưa nhập lý do Trả lại giám định !");
			return false;
		}
		if(isCheckThuNghiem === true && textThuNghiem.length === 0){
			alert("Chưa nhập lý do Trả lại thử nghiệm !");
			return false;
		}
		return true;
	}
	function reportNewPage(urlFile) {
		window.open(urlFile);
	};
</script>
<style type="text/css">

.myContainer {
	width: 800px;
	margin: 0 auto;
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