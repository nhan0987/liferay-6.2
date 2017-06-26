<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial"%>
<%@page import="vn.dtt.gt.dk.utils.CollectionUtils"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequestLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequest"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl"%>
<%@page import="vn.dtt.gt.dk.utils.format.FormatData"%>
<%@page import="vn.dtt.gt.dk.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalService"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceWrapper"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl"%>
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
<%@page import="java.util.Calendar"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.utils.config.DKConfigurationManager"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/portlet/init.jsp"%>
<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/toTiepNhan.css">


<%
	long idHoSoThuTuc = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
	long idPhieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	RegisteredInspection registeredInspection = null;
	

	VehicleGroup vehicleGroup  = null;
	InspectionRecord inspectionRecord = null;
	List<VehicleRecord> allVehicleRecord = null;
	long vehicleGroupInitialId = 0;
	
	try {
		inspectionRecord = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
		vehicleGroup = VehicleRecordLocalServiceUtil.findVehicleGroupByInspectionRecordId(inspectionRecord.getId());
		registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
	
		if (inspectionRecord == null) { inspectionRecord = new InspectionRecordImpl(); }
		if (vehicleGroup == null) { vehicleGroup = new VehicleGroupImpl(); }
		if (registeredInspection == null) {registeredInspection = new RegisteredInspectionImpl(); }
		
		allVehicleRecord = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
		
		if(allVehicleRecord != null && allVehicleRecord.size() > 0) {
			VehiclerecordInitial vehicleRecordInitial = VehiclerecordInitialLocalServiceUtil.getVehiclerecordInitial(allVehicleRecord.get(0).getId());
			vehicleGroupInitialId = vehicleRecordInitial.getVehicleGroupId();
		}
				
	} catch (Exception e) {
		//e.printStackTrace();
	}
	
	boolean flagKhiThai = true;
	boolean flagAnToan = true;
	boolean flagGiamDinh = true;
%>
<portlet:actionURL var="dakiemtra_banDangKyGuiLanhDao" name="dakiemtra_banDangKyGuiLanhDao">
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
	<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(idHoSoThuTuc) %>"/>
	<portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=String.valueOf(idPhieuXuLyPhu) %>"/>
	<portlet:param name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=String.valueOf(idthuTucHanhChinh) %>"/>
</portlet:actionURL>

<portlet:actionURL var="dakiemtra_huyBienBanKiemTra" name="dakiemtra_huyBienBanKiemTra">
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
	<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(idHoSoThuTuc) %>"/>
	<portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=String.valueOf(idPhieuXuLyPhu) %>"/>
	<portlet:param name="<%=Constants.ID_INSPECTION_RECORD%>" value="<%=String.valueOf(inspectionRecord.getId()) %>"/>
	<portlet:param name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=String.valueOf(idthuTucHanhChinh) %>"/>
</portlet:actionURL>
<portlet:actionURL var="dakiemtra_suaBienBanKiemTra" name="dakiemtra_suaBienBanKiemTra">
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY%>" value="<%=Constants.XU_LY_TLHS %>"/>
	<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC%>" value="<%=String.valueOf(idHoSoThuTuc) %>"/>
	<portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU%>" value="<%=String.valueOf(idPhieuXuLyPhu) %>"/>
	<portlet:param name="<%=Constants.ID_INSPECTION_RECORD%>" value="<%=String.valueOf(inspectionRecord.getId()) %>"/>
	<portlet:param name="<%=Constants.ID_VEHICLE_GROUP %>" value="<%=String.valueOf(vehicleGroup.getId()) %>"/>
	<portlet:param name="<%=Constants.ID_VEHICLE_GROUP_INITIAL %>" value="<%=String.valueOf(vehicleGroupInitialId) %>"/>
	<portlet:param name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=String.valueOf(idthuTucHanhChinh) %>"/>
</portlet:actionURL>

<aui:form action="<%=dakiemtra_banDangKyGuiLanhDao%>" method="post" name="myForm" id="myForm" >
	<div id="soatXetHoSoDiv" style="display: block;background: #ffffff;">
		<p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.danhsachbienbankiemtra"/></span></p>
	
		<table class="wd-table table">
			<thead>
				<tr>
					
					<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.sobienbankt"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtra.ngaylapbienbankt"/></th>
					<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.sothamchieu"/></th>
					<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.soptdongco"/></th>
					<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.ketquakiemtra"/></th>
					<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.dnthunghiemantoan"/></th>
					<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.dnthunghiemkhithai"/></th>
					<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.dnthunghiemgiamdinh"/></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td class="text-center"><%=inspectionRecord.getInspectionRecordNo()%><br><%=Validator.isNotNull(inspectionRecord.getInspectionRecordDate()) ? ConvertUtil.parsefulldateToString(inspectionRecord.getInspectionRecordDate()): ""%></td>
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
					<td class="text-center"><%=Validator.isNotNull(thamchieudangkiemvien) ? thamchieudangkiemvien : Validator.isNotNull(vehicleGroup) ? vehicleGroup.getReferenceCertificateNo() : StringPool.BLANK %></td>
					<td class="text-center"><%=VehicleRecordLocalServiceUtil.countVehicleRecord(inspectionRecord.getId()) %></td>
					<td class="text-center">
						<a onclick="eventShowOnlyOne('noiDungKetQuaKiemTRaDiv')">
							<%=CommonUtils.getKetQuaKiemTra(String.valueOf(inspectionRecord.getConfirmedResult()))%>
						</a>
					</td>
					<td class="text-center">
						<%
						SafetestRequirement safetestRequirement = null;
						String urlFileSafetestRequirement = "";
						try{
						safetestRequirement = SafetestRequirementLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						if(safetestRequirement != null){
							urlFileSafetestRequirement = CollectionUtils.getStringUrlFile(request, safetestRequirement.getAttachedFile());
						} else {
							List <SafetestRequirement> lstSafetestRequirements = SafetestRequirementLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
							if(lstSafetestRequirements != null && lstSafetestRequirements.size() >0){
								urlFileSafetestRequirement = CollectionUtils.getStringUrlFile(request, lstSafetestRequirements.get(0).getAttachedFile());
							} else {
								System.out.println("-----------urlFileSafetestRequirement-------nullllll");
							}
						}
						} catch (Exception e) {
							//e.printStackTrace();
						}
						if (inspectionRecord.getMarkupSafeTest() == Constants.MARKUP_INSPECTION_RECORD_CO_LAP) {
							if (safetestRequirement == null) {
								flagAnToan = false;
						%>
						<a onclick="eventShowOnlyOne('noiDungDeNghiThuNghiemAnToanDiv')">
							<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.lapdn"/>
						</a>
						<%
							} else {
								inspectionRecord.setMarkupSafeTest(Constants.MARKUP_INSPECTION_RECORD_DA_LAP);
								%>
								<a onclick="reportNewPage('<%=urlFileSafetestRequirement%>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.dalap"/></a>
								<%
							}
						} else if (inspectionRecord.getMarkupSafeTest() == Constants.MARKUP_INSPECTION_RECORD_DA_LAP) {
							
							%>
							<a onclick="reportNewPage('<%=urlFileSafetestRequirement%>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.dalap"/></a>
							<%
						} else if (inspectionRecord.getMarkupSafeTest() == Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP) {
							%>
							<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.khonglap"/>
							<%
						}
						%>
					</td> 
					<td class="text-center">
						<%
						EmissionTestRequirement emissionTestRequirement = null;
						String urlFileEmissionTestRequirement = "";
						try{
						 emissionTestRequirement = EmissionTestRequirementLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						 //urlFileEmissionTestRequirement = CollectionUtils.getStringUrlFile(request, emissionTestRequirement.getAttachedFile());
						 if(emissionTestRequirement != null){
							 urlFileEmissionTestRequirement = CollectionUtils.getStringUrlFile(request, emissionTestRequirement.getAttachedFile());
							} else {
								List <EmissionTestRequirement> lstEmissionTestRequirements = EmissionTestRequirementLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
								if(lstEmissionTestRequirements != null && lstEmissionTestRequirements.size() >0){
									urlFileEmissionTestRequirement = CollectionUtils.getStringUrlFile(request, lstEmissionTestRequirements.get(0).getAttachedFile());
								} else {
									System.out.println("-----------urlFileEmissionTestRequirement-------nullllll");
								}
							}
						} catch (Exception e) {
							//e.printStackTrace();
						}
						if (inspectionRecord.getMarkupEmissionTest() == Constants.MARKUP_INSPECTION_RECORD_CO_LAP) {
							if (emissionTestRequirement == null) {
								flagKhiThai = false;
						%>
						<a onclick="eventShowOnlyOne('noiDungDeNghiThuNghiemKhiThaiDiv')">
							<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.lapdn"/>
						</a>
						<%
							} else {
								inspectionRecord.setMarkupEmissionTest(Constants.MARKUP_INSPECTION_RECORD_DA_LAP);
								%>
								<a onclick="reportNewPage('<%=urlFileEmissionTestRequirement%>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.dalap"/></a>
								<%
							}
						} else if (inspectionRecord.getMarkupEmissionTest() == Constants.MARKUP_INSPECTION_RECORD_DA_LAP) {
							%>
							<a onclick="reportNewPage('<%=urlFileEmissionTestRequirement%>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.dalap"/></a>
							<%
						} else if (inspectionRecord.getMarkupEmissionTest() == Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP) {
							%>
							<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.khonglap"/>
							<%
						}
						%>
					</td>
					<td class="text-center">
						<%
						ControlRequirement controlRequirement = null;
						String urlFileControlRequirement = "";
						try {
							controlRequirement = ControlRequirementLocalServiceUtil.findByInspectionrecordId(inspectionRecord.getId());
							urlFileControlRequirement = CollectionUtils.getStringUrlFile(request, controlRequirement.getAttachedFile());
						} catch (Exception e) {
							//e.printStackTrace();
						}
						if (inspectionRecord.getMarkupControl() == Constants.MARKUP_INSPECTION_RECORD_CO_LAP) {
							if (controlRequirement == null) {
								flagGiamDinh = false;
						%>
						<a onclick="eventShowOnlyOne('noiDungDeNghiGiamDinhDiv')">
							<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.lapdn"/>
						</a>
						<%
							} else {
								inspectionRecord.setMarkupControl(Constants.MARKUP_INSPECTION_RECORD_DA_LAP);
								%>
								<a onclick="reportNewPage('<%=urlFileControlRequirement%>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.dalap"/></a>
								<%
							}
						} else if (inspectionRecord.getMarkupControl() == Constants.MARKUP_INSPECTION_RECORD_DA_LAP) {
							%>
							<a onclick="reportNewPage('<%=urlFileControlRequirement%>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.dalap"/></a>
							<%
						} else if (inspectionRecord.getMarkupControl() == Constants.MARKUP_INSPECTION_RECORD_KHONG_LAP) {
							%>
							<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.khonglap"/>
							<%
						}
						try {
							InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
						} catch (Exception es) {
							//es.printStackTrace();
						}
						%>
					</td>
				</tr>
				<tr>
						<td class="text-left" colspan="7">
				<%
				if (flagAnToan && flagGiamDinh && flagKhiThai) {
					%>
					
								<button class="btnThuLyHS form-control" type="button" onclick="if(validatorLoaiPhuongTien())  summitForm('<%=dakiemtra_banDangKyGuiLanhDao %>')" ><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.guilanhdao"/></button>
					<%
				}
				%>	
								<button class="btnThuLyHS form-control" type="button" onclick="eventShowOnlyOne('xemBanThaoChungChiDiv')" >Xem bản thảo chứng chỉ</button>
								<button class="btnThuLyHS form-control" type="button" onclick="summitForm('<%=dakiemtra_suaBienBanKiemTra %>')" >Sửa biên bản</button>
								<button class="btnThuLyHS form-control" type="button" onclick="summitForm('<%=dakiemtra_huyBienBanKiemTra %>')">Hủy biên bản</button>
								<button class="btnThuLyHS form-control" type="button">Quay lại</button>
						</td>
					</tr>
					
					
			</tbody> 
		</table>
	</div>
					<input type="hidden" name="idVehicleClass" id="idVehicleClass" value="<%=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getVehicleClass() : StringPool.BLANK %>"/>
					<input type="hidden" name="idVehicleType" id="idVehicleType" value="<%=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getVehicleType() : StringPool.BLANK %>"/>
		
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
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.noidungdenghithunghiemantoan"/></b></span></p>
		<jsp:include page="/portlet/quanlyhs/thulyhs/dangkiemvien/an_toan_203.jsp"></jsp:include>
	</div>
</div>
<div id="noiDungDeNghiThuNghiemKhiThaiDiv" style="display: block;background: #ffffff;">
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.noidungdenghithunghiemkhithai"/></b></span></p>
		<jsp:include page="/portlet/quanlyhs/thulyhs/dangkiemvien/khi_thai_202.jsp"></jsp:include>
	</div>
</div>
<div id="noiDungDeNghiGiamDinhDiv" style="display: block;background: #ffffff;">
	<div>
		<p style="text-align: left;"><span><b><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.dakiemtraresult.noidungbienbankiemtra"/></b></span></p>
		<jsp:include page="/portlet/quanlyhs/thulyhs/dangkiemvien/giam_dinh_204.jsp"></jsp:include>
	</div>
</div>
<div id="noiDungKetQuaKiemTRaDiv" style="display: block;background: #ffffff;">
	<jsp:include page="/portlet/quanlyhs/thulyhs/dangkiemvien/ketqua_lapbienban_kiemtra.jsp"></jsp:include>
</div>
</aui:form>

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
		$('#ketQuaKiemTraDiv').show();
		$('#noiDungDeNghiThuNghiemAnToanDiv').hide();
		$('#noiDungDeNghiThuNghiemKhiThaiDiv').hide();
		$('#noiDungDeNghiGiamDinhDiv').hide();
		$('#noiDungKetQuaKiemTRaDiv').hide();
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
		$('#noiDungKetQuaKiemTRaDiv').hide();
		$('#'+idElement).show();
		if(idElement === 'noiDungKetQuaKiemTRaDiv'){
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
	function reportNewPage(urlFile) {
		window.open(urlFile);
	};

	function validatorLoaiPhuongTien() {	
		
		if (document.getElementById('idVehicleClass').value.indexOf("DCX") >-1){
			return true;
		} else if (document.getElementById('idVehicleClass').value.indexOf("XDD") >-1){
			return true;
		} else 
			{
				if (document.getElementById('idVehicleType').value.length == 0){
					alert("Chưa lưu thông tin Loại phương tiện. Đề nghị sửa nội dung BBKT !");
					return false;
				} else {
					return true;
				}
				
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
</script>
<style type="text/css">

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