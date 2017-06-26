<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
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
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/portlet/init.jsp"%>
<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/toTiepNhan.css">


<%
long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);

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

//Ghi actionlog
String noidungthaotac = "Mở xem Thụ lý hồ sơ, chức năng Xem thảo chứng chỉ thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
String tenmanhinhdaidien = "Xem bản thảo chứng chỉ";
String importername = "";
String inspectorname = user.getScreenName();
long inspectorid = user.getUserId();
QuanLyNguoiDungAction.insertActionLog(idHoSoThuTuc, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);


%>
<div id="soatXetHoSoButtonDiv">
		<aui:button-row>
			<input type="button" value="Xem bản thảo chứng chỉ" onclick="xemBanThao()"  class=" btnThuLyHS form-control"/>
			<input type="button" value="Trả lại hồ sơ" onclick="eventShowOnlyOne('traLaiHoSoDiv')" class=" btnThuLyHS form-control"/>
			<input type="button" value="Quay lại" class=" btnThuLyHS form-control"/>
		</aui:button-row>
</div>
<div id="soatXetHoSoDiv" style="display: block;background: #ffffff;">
	<input type="text" hidden="true" name="<%=Constants.DIEU_KIEN_CHUYEN_DICH%>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_PHU_HOP_QUY_DINH%>" />
	<p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchicopy.danhsachbienbankiemtra"/></span></p>
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

	<table class="wd-table table">
		<thead>
			<tr>
				
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchicopy.sobienbankt"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchicopy.ngaylapbienbankt"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchicopy.sothamchieu"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchicopy.soptdongco"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchicopy.ketquakiemtra"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchicopy.dnthunghiemantoan"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchicopy.dnthunghiemkhithai"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchicopy.dnthunghiemgiamdinh"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchicopy.thaotac"/></th>
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
				 
			%>
				<tr>
					
					<td class="text-center"><%=inspectionRecord.getInspectionRecordNo()%><br><%=inspectionRecord.getInspectionRecordDate()%></td>
					<td class="text-center"><%=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getReferenceCertificateNo() : StringPool.BLANK %></td>
					<td class="text-center"><%=VehicleRecordLocalServiceUtil.countVehicleRecord(inspectionRecord.getId()) %></td>
					<td class="text-center"><a onclick="changedata('<%=inspectionRecord.getId()%>')"> <%=(inspectionRecord.getConfirmedResult() == 1)? "Đạt": "Không đạt" %></a></td>
					<td class="text-center"><a onclick="eventShowOnlyOne('noiDungDeNghiThuNghiemAnToanDiv')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchicopy.dat"/></a></td> 
					<td class="text-center"><a onclick="eventShowOnlyOne('noiDungDeNghiThuNghiemKhiThaiDiv')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchicopy.dat"/></a></td>
					<td class="text-center"><a onclick="eventShowOnlyOne('noiDungDeNghiGiamDinhDiv')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.qlhshsxacnhanchungchicopy.dat"/></a></td>
					<td class="text-center">
						<img src="<%=request.getContextPath()%>/img/u6851_normal.png" onclick="eventShowOnlyOne('noiDungThamDinhDiv')">
					</td>
				</tr>
		</tbody> 
	</table>

</div>
<!------------------------- Noi dung chi tiet --------------------------->
<div id="ketQuaKiemTraDiv" style="display: block;background: #ffffff;">
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.noidungbienbankiemtra"/></b></span></p>
		<div id="yKienDangKiemVien" class="yKienDiv">
			<p class="textlv2"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.ykiendangkiemvien"/><b></span></p>
			<table>
				<tr>
					<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.ketqua"/></span></td>
					<td><span id="dkvKetQua"></span></td>
				</tr>
				<tr>
					<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.ngaykiemtra"/></span></td>
					<td><span id="dkvNgayKt"></span></td>
				</tr>
				<tr>
					<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.nguoikiemtra"/></span></td>
					<td><span id="dkvNguoiKt"></span></td>
				</tr>
				<tr>
					<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.noidung"/></span></td>
					<td><span id="dkvNoiDung"></span></td>
				</tr>
			</table>
		</div>
	</div>
	<div>
		<ul class="tabs">
			<li class="tab-link current" data-tab="tab-1"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.thongtinchung"/></li>
			<li class="tab-link" data-tab="tab-2"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.kiemtraclattktvbvmt"/></li>
		</ul>
		<div id="tab-1" class="tab-content current">
			<div id="thongTinChungCommon">
				<table>
					<tr>
						<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.sobienbankiemtra"/></span></td>
						<td><span id="ttcSoBienBanKt"></span></td>
					</tr>
					<tr>
						<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.ngaykiemtra"/></span></td>
						<td><span id="ttcNgayKt"></span></td>
					</tr>
					<tr>
						<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.diadiemkiemtra"/></span></td>
						<td><span id="ttcDiaDiemKt"></span></td>
					</tr>
					<tr>
						<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.lankiemtra"/></span></td>
						<td><span id="ttcLanKt"></span></td>
					</tr>
					<tr>
						<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.sothamchieu"/></span></td>
						<td><span id="ttcSoThamChieu"></span></td>
					</tr>
				</table>
			</div>
			<div >
				<p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.danhsachptkiemtra"/></span></p>
				<table id="bangThongTinChung" class="wd-table table">
					<thead>
						<tr>
							<th><span>STT</span></th>
							<th><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.nhanhieusoloai"/></span></th>
							<th><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.sokhungsodongco"/></span></th>
							<th><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.tinhttrang"/></span></th>
							<th><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.sothamchieu"/></span></th>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>
			</div>
		</div>
		<div id="tab-2" class="tab-content">
			<div >
				<table id="bangThongTinKiemTra" class="wd-table table">
					<thead>
						<tr>
							<th><span>STT</span></th>
							<th><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.hangmuc"/></span></th>
							<th><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.thongtinkiemtra"/></span></th>
							<th><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.giatridangky"/></span></th>
							<th><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.giatrikiemtra"/></span></th>
							<th><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.thaotac"/></span></th>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>
			</div>
			<div>
				<table style="width: 100%">
					<tr>
						<td style="width: 70%">
							<div>
								<table border="0">
									  <tr>
									    <td>
									    	<img src="<%=request.getContextPath()%>/img/yellow_rec_normal.png">
									    </td>
									    <td>
									    	<span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.chuakiemtra"/></span>
									    </td>
									  </tr>
									  <tr>
									    <td>
									    	<img src="<%=request.getContextPath()%>/img/white_rec_normal.png">
									    </td>
									    <td>
									    	<span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.kiemtradatyeucau"/></span>
									    </td>
									  </tr>
									  <tr>
									    <td>
									    	<img src="<%=request.getContextPath()%>/img/white_rec_normal.png">
									    </td>
									    <td>
									    	<span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.kiemtrachuadatyeucau"/></span>
									    </td>
									  </tr>
								</table>
							</div>
						</td>
						<td style="width: 30%">
							<div >
								<table id="tongKet">
									<tr>
										<td style="with:10px padding-right: 10px;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.tongsoketqua"/></span></td>
										<td style="with:10px padding-right: 10px;"><span id="ttktDat"></span></td>
										<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.dat"/></span></td>
									</tr>
									<tr>
										<td style="with:10px padding-right: 10px;"></td>
										<td style="with:10px padding-right: 10px;"><span id="ttktKhongDat"></span></td>
										<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.khongdat"/></span></td>
									</tr>
									<tr>
										<td style="with:10px padding-right: 10px;"></td>
										<td style="with:10px padding-right: 10px;"><span id="ttktSuaDoi"></span></td>
										<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.chuakiemtra"/></span></td>
									</tr>
								</table>
							</div>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</div><!-- container -->
	<div>
		<p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.ghichuinvaogiaychungchi"/></span></p><br>
		<p class="textlv2"><span>.........................................................</span></p>
		<aui:button-row>
			<input type="button" value="Lập bản thảo chứng chỉ" onclick="eventHideAndShowDiv('ketQuaKiemTra', 'divButton')" class="btnThuLyHS form-control"/>
			<input type="button" value="Quay lại" onclick="eventHideOrShowDiv('ketQuaKiemTra', 'false')" class="btnThuLyHS form-control"/>
		</aui:button-row>
	</div>
</div>
<div id="noiDungDeNghiThuNghiemAnToanDiv" style="display: block;background: #ffffff;">
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.noidungdenghithunghiemantoan"/></b></span></p>
	</div>
</div>
<div id="noiDungDeNghiThuNghiemKhiThaiDiv" style="display: block;background: #ffffff;">
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.noidungdenghithunghiemkhithai"/></b></span></p>
		<div id="bangthiNghiemKhiThai" class="yKienDiv">
			<table>
				<tr>
					<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.ketqua"/></span></td>
					<td><span id="khiThaiKetQua"></span></td>
				</tr>
				<tr>
					<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.ngaykiemtra"/></span></td>
					<td><span id="khiThaiNgayKt"></span></td>
				</tr>
				<tr>
					<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.nguoikiemtra"/></span></td>
					<td><span id="khiThaiNguoiKt"></span></td>
				</tr>
				<tr>
					<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.lydokhongdat"/></span></td>
					<td><span id="khiThaiLyDoKhongDat"></span></td>
				</tr>
			</table>
		</div>
	</div>
</div>
<div id="noiDungDeNghiGiamDinhDiv" style="display: block;background: #ffffff;">
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.noidungbienbankiemtra"/></b></span></p>
	</div>
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
		<div>
			<table style="width: 100%">
				<tr>
					<td style="width: 40%;vertical-align:top;position:static;"><div id="viewdata" style="padding-left:5px;"></div></td>
					<td style="vertical-align:top;position:static;"><div id="viewFile"></div></td>
				</tr>
			</table>
		</div>
		<div><p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.ghichuvaobanthaochungchi"/></span></p></div>
		<div><textarea class="textAreaAutosize" id="ghiChuBanThao" name="ghiChuBanThao"><%=StringPool.BLANK%></textarea></div>
		<aui:button-row>
			<input type="button" value="Lập chứng chỉ" onclick="summitForm('<%=toNghiepVuXacNhanChungChi%>')"  class=" btnThuLyHS form-control"/>
			<input type="button" value="Quay lại" onclick="eventHideAndShowDiv('xemBanThaoChungChi','soatXetHoSo')" class=" btnThuLyHS form-control"/>
		</aui:button-row>
	</aui:form>
</div>
<div id="traLaiHoSoDiv">
	<portlet:actionURL var="toNghiepVuTraLaiHoSo" name="toNghiepVuTraLaiHoSo">
		<portlet:param name="<%=Constants.DIEU_KIEN_CHUYEN_DICH %>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_LANH_DAO_PHONG_KY %>"/>
		<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
		<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(idHoSoThuTuc) %>"/>
		<portlet:param name="<%=Constants.REGISTERED_NUMBER %>" value="<%=String.valueOf(registeredInspection.getRegisteredNumber()) %>"/>
		<portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=String.valueOf(idPhieuXuLyPhu) %>"/>
		<portlet:param name="<%=Constants.ID_INSPECTION_RECORD %>" value="<%=String.valueOf(inspectionRecord.getId()) %>"/>
	</portlet:actionURL>
	<aui:form action="" method="post" name="myForm" id="myForm" >
		<div>
			<table style="width: 100%">
				<tr>
				    <td><input id="select_1" name="select_1" type="checkbox" value="1"/><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.tralailanhdaodonvikiemtra"/></td>
			    </tr>
			    <tr>
				    <td><div style="padding-left: 3%;"><textarea class="textAreaAutosize" id="taaTraLaiLdvkt" name="taaTraLaiLdvkt"><%=StringPool.BLANK%></textarea></div></td>
			    </tr>
			    <tr>
				    <td><input id="select_1" name="select_1" type="checkbox" value="1"/><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.tralaigiamdinh"/></td>
			    </tr>
			    <tr>
				    <td><div style="padding-left: 3%;"><textarea class="textAreaAutosize" id="taaTraLaiGiamDinh" name="taaTraLaiGiamDinh"><%=StringPool.BLANK%></textarea></div></td>
			    </tr>
			    <tr>
				    <td><input id="select_1" name="select_1" type="checkbox" value="1"/><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.tralaithunghiem"/></td>
			    </tr>
			    <tr>
				    <td><div style="padding-left: 3%;"><textarea class="textAreaAutosize" id="taaTraLaiThuNghiem" name="taaTraLaiThuNghiem"><%=StringPool.BLANK%></textarea></div></td>
			    </tr>
			</table>
		</div>
		<aui:button-row>
			<input type="button" value="Thẩm định xong" onclick="summitForm('<%=toNghiepVuTraLaiHoSo%>')"  class=" btnThuLyHS form-control"/>
			<input type="button" value="Quay lại" onclick="eventHideAndShowDiv('traLaiHoSo','soatXetHoSo')" class=" btnThuLyHS form-control"/>
		</aui:button-row>
	</aui:form>
</div>
<div id="noiDungThamDinhDiv">
	<!------------------ Danh sách PT ĐN KT ------------------>
	<div style="width: 30px">&nbsp</div>
	<div>
		<p style="text-align: left;">
			<span style="font-size: 13px; font-weight: bold;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.danhsachptdnkt"/> -----------------------------------------------------------------------------------------------(-)</span>
		</p>
	</div>
	<div>
		<!-- vr-vehicleRecore -->
		<div style="float: left; text-align: left; width: 39%;">
			<%
				allVehicleRecord = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
			%>
			<span>Tổng số PT: <%=allVehicleRecord.size() %> </span>
			<table style="width: 100%" border="1px" id="tblDanhSachVehicleRecord">
				<thead>
					<tr>
						<th class="text-center"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.nhanhieu"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.soloai"/></span></th>
						<th class="text-center"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.sokhung"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.sodongco"/></span></th>
						<th class="text-center"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.tinhttrang"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.sothamchieu"/></span></th>
					</tr>
				</thead>
				<tbody>
				<%
				VehicleRecord vehicleRecord = null;
				if(allVehicleRecord != null && allVehicleRecord.size() > 0){
					for (int i = 1; i < allVehicleRecord.size(); i++) {
						vehicleRecord  = allVehicleRecord.get(i);
				%>
					<tr>
						<td class="text-center">ISUZU<br>CYH52Y</td>
						<td class="text-center"><b><%=vehicleRecord.getChassisNumber() %></b><br><%=vehicleRecord.getEngineNumber()%></td>
						<td class="text-center"><b><%=vehicleRecord.getVehicleEngineStatus() %></b><br><%=vehicleGroup.getReferenceCertificateNo()%></td>
					</tr>
				
				<%
					}
				}
				%>
				</tbody>
			</table>
		</div>
		<div style="float: left; text-align: left; width: 59%; padding: 1% 1% 1% 0;">
			<div class="container" style="width: 100%;">
				<ul class="tabs">
					<li class="tab-link current" data-tab="tab-1"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.noidungthamdinh"/></li>
					<li class="tab-link" data-tab="tab-2"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.tailieuthunghiem"/></li>
					<li class="tab-link" data-tab="tab-3"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.tailieukhithai"/></li>
					<li class="tab-link" data-tab="tab-4"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.giaytolienquankhac"/></li>
				</ul>
				<!-- START TAB_i -->
				<div id="tab-1" class="tab-content current">
					<div id="u6148" style="left: 0px; width: 100%; height: 10px; padding-left: 14px;">
						<div id="u6148_line" class="underLine" style="">
							<table style="width: 100%" border="1px" id="tblDanhSachVehicleRecord">
								<thead>
									<tr>
										<th class="text-center"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.tenthongso"/></span></th>
										<th class="text-center"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.giatri"/></span></th>
										<th class="text-center"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.ketquakiemtra"/></span></th>
										<th class="text-center"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.noidungbienbankiemtra.ketquathunghiem"/></span></th>
									</tr>
								</thead>
								<tbody>
								<%
								List<InspectionRecordSpec> allInspectionRecordSpec = InspectionRecordSpecLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
								InspectionRecordSpec inspectionRecordSpec = null;
								List<SatetyTestReportSpec> allSatetyTestReportSpec = null;
								if(safetyTestReport != null){
									allSatetyTestReportSpec = SatetyTestReportSpecLocalServiceUtil.findBySaftyTestReportId(safetyTestReport.getId());
								}
								String kqktValue = "";
								String kqtnValue = "";
								
								if(allInspectionRecordSpec != null && allInspectionRecordSpec.size() > 0){
									for (int i = 1; i < allInspectionRecordSpec.size(); i++) {
										inspectionRecordSpec  = allInspectionRecordSpec.get(i);
										kqktValue = (inspectionRecordSpec.getEvaluationResult() == 1)? "Đạt": "Không đạt";
										kqtnValue = QuanLyHoSoUtils.getSafetyTestSpecValue(allSatetyTestReportSpec, inspectionRecordSpec.getSpecificationCode());
								%>
									<tr>
										<td class="text-center"><%=inspectionRecordSpec.getSpecificationName() %></td>
										<td class="text-center"><%=inspectionRecordSpec.getSpecificationValue() %></td>
										<td class="text-center"><%=kqktValue %></td>
										<td class="text-center"><%=kqtnValue %></td>
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
				<div id="tab-2" class="tab-content">
					<div id="u6148" style="left: 0px; width: 100%; height: 10px; padding-left: 14px;">
						<div id="u6148_line" class="underLine" style=""></div>
					</div>
				</div>
				<div id="tab-3" class="tab-content">
					<div id="u6148" style="left: 0px; width: 100%; height: 10px; padding-left: 14px;">
						<div id="u6148_line" class="underLine" style=""></div>
					</div>
				</div>
				<div id="tab-4" class="tab-content">
					<div id="u6148" style="left: 0px; width: 100%; height: 10px; padding-left: 14px;">
						<div id="u6148_line" class="underLine" style=""></div>
					</div>
				</div>
				<!-- STOP TAB_i -->
			</div><!-- container -->
		</div>
	</div>
</div>

<portlet:resourceURL var="getDataAjax">
</portlet:resourceURL>
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
	
	function clearTable(tableName) {
		var table = document.getElementById(tableName);
		var length = table.rows.length;
//		 alert("so dong: " + table.rows.length);
		for(var i = table.rows.length - 1; i > 0; i--)
		{
		    table.deleteRow(i);
		}
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
				$('#dkvKetQua').val(data2.dkvKetQua[0]);	
				$('#dkvNgayKt').val(data2.dkvNgayKt[0]);	
				$('#dkvNguoiKt').val(data2.dkvNguoiKt[0]);	
				$('#dkvNoiDung').val(data2.dkvNoiDung[0]);	
// thong tin chung common
				$('#ttcSoBienBanKt').val(data2.ttcSoBienBanKt[0]);	
				$('#ttcNgayKt').val(data2.ttcNgayKt[0]);	
				$('#ttcDiaDiemKt').val(data2.ttcDiaDiemKt[0]);	
				$('#ttcLanKt').val(data2.ttcLanKt[0]);	
				$('#ttcSoThamChieu').val(data2.ttcSoThamChieu[0]);	
//bang thong tin chung				
				// Xoa cac old item in select
				clearTable('bangThongTinChung');
				for ( var i = 0; i < data2.id_dspt.length; i++) {
					$('#bangThongTinChung tr:last').after(newRowThongTinChung(i, data2.dsptktNhanHieuSoLoai[i], data2.dsptktSoKhung[i], data2.dsptktDongCo[i], data2.dsptTinhTrang[i], data2.dsptSoThamChieu[i]));
				}

// Bang thong tin kiem tra
				clearTable('bangThongTinKiemTra');
				for ( var i = 0; i < data2.id_ttkt.length; i++) {
					$('#bangThongTinKiemTra tr:last').after(newRowThongTinKiemTra(i, data2.ttktName[i], data2.ttktGtDangKy[i], data2.ttktGtKiemTra[i], data2.ttktThaoTac[i]));
				}

// thong tin chung tong ket
				$('#ttktDat').val(data2.ttktDat[0]);	
				$('#ttktKhongDat').val(data2.ttktKhongDat[0]);	
				$('#ttktSuaDoi').val(data2.ttktSuaDoi[0]);	

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
					"<td>Nhãn hiệu <br> Số loại</td>"+
					"<td>Số khung <br> Số động cơ</td>"+
					"<td>Tình trạng <br> Số tham chiếu</td></tr>";
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

	function newRowThongTinKiemTra(stt, name, gtDangKy, gtKiemTra, thaoTac) {
		var duLieu=" <tr>";
		duLieu=duLieu+ "<td><span>" + stt + "</span></td>";
		duLieu=duLieu+ "<td><span>" + name + "</span></td>";
		duLieu=duLieu+ "<td><span>" + gtDangKy + "</span></td>";
		duLieu=duLieu+ "<td><span>" + gtKiemTra + "</span></td>";
		duLieu=duLieu+ "<td><span>" + thaoTac + "</span></td>";
		duLieu=duLieu+"</tr>";
		return duLieu;
	};
	
</script>
<style type="text/css">
body {
	margin-top: 100px;
	font-family: 'Trebuchet MS', serif;
	line-height: 1.6
}

.myContainer {
	width: 800px;
	margin: 0 auto;
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