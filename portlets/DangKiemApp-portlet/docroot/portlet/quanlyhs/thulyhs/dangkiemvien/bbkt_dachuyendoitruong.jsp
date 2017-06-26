<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection"%>
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
<%@page import="java.util.Calendar"%>
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
	List<InspectionRecord> lstInspectionRecords = null;
	List<VehicleRecord> allVehicleRecord = null;
	
	ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXuLyPhu);
	if(confirmedInspection != null){
		lstInspectionRecords = InspectionRecordLocalServiceUtil.findByConfirmedinspectionid(confirmedInspection.getId());
	}
	
	boolean flagKhiThai = true;
	boolean flagAnToan = true;
	boolean flagGiamDinh = true;
%>
<script type="text/javascript">
var idBienBanKiemTraScript="";
var idThongSoKyThuatScript="";
</script>
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
				<%
					if(lstInspectionRecords != null && lstInspectionRecords.size() >0){
						for(InspectionRecord inspectionRecord : lstInspectionRecords){
							vehicleGroup = VehicleRecordLocalServiceUtil.findVehicleGroupByInspectionRecordId(inspectionRecord.getId());
							allVehicleRecord = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
				%>
					<tr>
					<td class="text-center"><%=inspectionRecord.getInspectionRecordNo()%><br><%=Validator.isNotNull(inspectionRecord.getInspectionRecordDate()) ? ConvertUtil.parsefulldateToString(inspectionRecord.getInspectionRecordDate()): ""%></td>
					<td class="text-center"><%=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getReferenceCertificateNo() : StringPool.BLANK %></td>
					<td class="text-center"><%=VehicleRecordLocalServiceUtil.countVehicleRecord(inspectionRecord.getId()) %></td>
					<td class="text-center">
						<a onclick="showTabReport('<%=inspectionRecord.getAttachedFile()%>','<%=vehicleGroup.getAttachedFile()%>')">
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
				<%
						}
					}
				%>
			</tbody> 
		</table>
	</div>
	<div id="viewDuLieu"></div>

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
	<jsp:include page="/portlet/quanlyhs/thulyhs/dangkiemvien/bbkt_dachuyendoitruong_tabreport.jsp"></jsp:include>
</div>

<script type="text/javascript">

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

	function showTabReport(idBienBanKiemTra,idThongSoKiThuat) {
		idBienBanKiemTraScript = idBienBanKiemTra;
		idThongSoKyThuatScript = idThongSoKiThuat;
		eventShowOnlyOne('noiDungKetQuaKiemTRaDiv');
		
	};
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