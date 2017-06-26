<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.utils.codec.FileKySoUtils"%>
<%@page import="vn.dtt.gt.dk.portlet.business.LanhDaoPhongBusiness"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoUtils"%>
<%@page import="vn.dtt.gt.dk.utils.config.DKConfigurationManager"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportFunction"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceWrapper"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@ include file="/portlet/init.jsp"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% long javaScriptLastModified = ServletContextUtil.getLastModified(application, "/js/", true); %>
<%
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	String idPhieuXuLyPhu = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY_PHU);
	RegisteredInspection registeredInspection=RegisteredInspectionLocalServiceUtil.findByDossierId(ConvertUtil.convertToLong(idHoSoThuTuc));
	InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil.findByPhieuXuLyPhuId(ConvertUtil.convertToLong(idPhieuXuLyPhu));
	List<VehicleRecord> liVehicleRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
	List<VehicleGroup> vehicleGroups = new ArrayList();
	if (liVehicleRecords != null && liVehicleRecords.size() > 0) {
		VehicleGroup vehicleGroup=VehicleGroupLocalServiceUtil.fetchVehicleGroup(liVehicleRecords.get(0).getVehicleGroupId());
		vehicleGroups.add(vehicleGroup);
	}
	
	//String maBieuMau="TT442012BM01";
	String loaiChiTiet = "";
	
	//TthcNoidungHoSo tthcNoidungHoSo=TthcNoidungHoSoLocalServiceUtil.findLastByHoSoThuTucIdAndMaBieuMau(ConvertUtil.convertToLong("7201"), maBieuMau);
    MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(ConvertUtil.convertToLong(idPhieuXuLyPhu));
	String listAllVehicleRecord="";
	
	// Ghi actionlog
	
	String noidungthaotac = "Mở xem Thụ lý hồ sơ - [" + "Lãnh đạo phòng duyệt chứng chỉ" + "] thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
	String tenmanhinhdaidien = "Thụ lý hồ sơ - [" + "Lãnh đạo phòng duyệt chứng chỉ" + "]";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<script type="text/javascript">
var vehicleRecordLists = new Array();
</script>

<portlet:actionURL var="lanhDaoPhongKyXacNhan" name="lanhDaoPhongKyXacNhan">
	<portlet:param name="<%=Constants.DIEU_KIEN_CHUYEN_DICH %>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_LANH_DAO_PHONG_KY %>"/>
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
</portlet:actionURL>
<portlet:actionURL var="lanhDaoPhongChuyenBoPhanKyLai" name="lanhDaoPhongChuyenBoPhanKyLai">
	<portlet:param name="<%=Constants.DIEU_KIEN_CHUYEN_DICH %>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_LANH_DAO_PHONG_YEU_CAU_XEM_XET_LAI %>"/>
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
 </portlet:actionURL>

<portlet:actionURL var="lanhDaoPhongKySo" name="lanhDaoPhongKySo">
	<portlet:param name="<%=Constants.DIEU_KIEN_CHUYEN_DICH %>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_LANH_DAO_PHONG_KY %>"/>
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
</portlet:actionURL>

<aui:form action="<%=lanhDaoPhongKySo%>" method="post" name="myForm" id="myForm" >

<!-- Quản lý hồ sơ DKKT -->

<input type="hidden" id="<%= Constants.ID_PHIEU_XU_LY_PHU%>" name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=idPhieuXuLyPhu %>">
<input type="hidden" id="<%= Constants.ID_HO_SO_THU_TUC%>" name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=idHoSoThuTuc %>">
<input type="hidden" id="<%= Constants.TTHC_THUTUCHANHCHINH_ID%>" name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=idthuTucHanhChinh %>">


<table class="wd-table table">
	<caption style="font-size: 12px;color:black;"><b><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.danh.sachxe.nhap.khau" /></b></caption>
	<thead>
		<tr>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.stt" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.nhom" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.loai.phuong.tien.kt" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.nhan.hieu" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.so.loai" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.noi.dung" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thaotac" /></th>
		</tr>
	</thead>
	<tbody>
		<%
		String nhanHieuSoLoai="";
			long vehicleGroupId=0;
			if (vehicleGroups!=null && vehicleGroups.size()>0){
				int stt=0;
				String loai = "";
				for (VehicleGroup item: vehicleGroups){
					vehicleGroupId=item.getId();
					stt++;
					List<DmDataItem> liDmDataItems = DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemCode0("TradeMark", item.getTradeMark());
					if (liDmDataItems != null && liDmDataItems.size() > 0) {
						loai = liDmDataItems.get(0).getName();
					}
					loaiChiTiet = loai + "<br>" + item.getCommercialName();
					loaiChiTiet = loaiChiTiet.replaceAll("'", "");
					nhanHieuSoLoai=ReportUtils.getTenDmData(ReportConstant.TRADE_MARK, item.getTradeMark())
							+"<br>"+item.getCommercialName();
		%>
		<tr>
			<td class="text-center">
			<input type="hidden" id="stt_<%=item.getId() %>" name="stt_<%=item.getId() %>" value="<%=stt %>">
			<%=stt %></td>
			<td class="text-center"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.nhom"/> <%=stt%></td>
			<td class="text-center"><%=ReportUtils.getTenDmData(ReportConstant.VEHICLE_TYPE, item.getVehicleType())%>
			<%=ReportUtils.getTenDmData(ReportConstant.ENGINE_TYPE, item.getEngineType())%></td>
			<td class="text-center"><%=loai %></td>
			<td><span><%=item.getCommercialName() %></span></td>
			<td> <%=motCuaPhieuXuLyPhu.getTrichYeuNoiDung() %></td>
			<td class="text-center">
				<a class="aicon" onclick="viewData();"><i class="icon20 iconm5 fa fa-pencil"></i></a>
			</td>
		</tr>
		<%} }%>
	</tbody> 
</table>

<%
 int tongSo=0;
if (vehicleGroupId>0){
	List<VehicleRecord> vehicleRecords=VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
	if (vehicleRecords!=null && vehicleRecords.size()>0){
		for (VehicleRecord item: vehicleRecords){
			CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(item.getCertificateRecordId());
			if (item.getDraftCertificateId() > 0 && item.getCertificateRecordId() > 0 && certificateRecord.getDigitalIssued() == Constants.CERTIFICATE_DIGITAL_ISSSUED_0){
				tongSo++;
				listAllVehicleRecord=listAllVehicleRecord+item.getId()+",";
			}
		}	
	}
}	
%>

<table class="wd-table table">
	<input type='hidden' id="label_pt" name="label_pt" value="<liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.tong.so.pt" />"/>
	<input type='hidden' id="value_ajax" name="value_ajax" value=""/>
	<caption style="font-size: 20px vn.gt.dk.qlhs.lanh.dao.phong.trang.thai;"><div id="tongSoPT"><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.tong.so.pt" /> <%=tongSo%></div></caption>
</table>

<div id="viewDuLieu" style="" >
	<table style="width: 100%">
		<tr>
			<td style="width: 40%;vertical-align:top;position:static;">
				<div id="viewdata" style="padding-left:5px;">
					<table style='width:96%;' class='wd-table table'>
					<tr>
						<td style="text-align: center;">STT</td>
						<td style="text-align: center;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.nhanhieu"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.soloai"/></td>
						<td style="text-align: center;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.sokhung"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.sodongco"/></td>
						<td style="text-align: center;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.tinhtrang"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.sothamchieu"/></td>
					</tr>
					
					<%
					if (vehicleGroupId>0){
						List<VehicleRecord> vehicleRecords=VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						VehicleGroup vehicleGroup=VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleGroupId);
						if (vehicleGroup!=null){
							vehicleGroup=new VehicleGroupImpl();
						}
						
						if (vehicleRecords!=null && vehicleRecords.size()>0){
							CertificateRecord certificateRecord = null;
							int i=0;
							int index = 0;
							for (VehicleRecord item: vehicleRecords){
								certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(item.getCertificateRecordId());
								if (item.getDraftCertificateId()>0 && item.getCertificateRecordId() > 0 && certificateRecord.getDigitalIssued() == Constants.CERTIFICATE_DIGITAL_ISSSUED_0){
									String soKhungDongCo=item.getChassisNumber()+"<br>"+item.getEngineNumber();
									String tinhTrangThamChieu = "";
									if (item.getVehicleEngineStatus().trim().compareToIgnoreCase(Constants.Vehicle_Engine_Status_0) == 0) {
										tinhTrangThamChieu = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-0", item.getVehicleEngineStatus());
									} else if (item.getVehicleEngineStatus().trim().compareToIgnoreCase(Constants.Vehicle_Engine_Status_1) == 0) {
										tinhTrangThamChieu = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-1", item.getVehicleEngineStatus());
									} else {
										tinhTrangThamChieu = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-2", item.getVehicleEngineStatus());
									}
									tinhTrangThamChieu +=  "<br>"+vehicleGroup.getReferenceCertificateNo();
									
									
					%>				
					
					<script type="text/javascript">
					vehicleRecordLists[<%=index++%>] = "<%=item.getId()%>";
					</script>
					
						<tr>
							<td style="text-align: center;"><%=++i %></td>
							<td><a href="#" onclick="changedulieu('<%=item.getId()%>');"><%=nhanHieuSoLoai %></a></td>
							<td><a href="#" onclick="changedulieu('<%=item.getId()%>');"><%=soKhungDongCo %></a></td>
							<td><a href="#" onclick="changedulieu('<%=item.getId()%>');"><%=tinhTrangThamChieu %></a>
								<input type='hidden' id="vehicleRecord_kySo_<%=item.getId()%>" name="vehicleRecord_kySo_<%=item.getId()%>" value=""/>
								<input type='hidden' id="is_kySo_<%=item.getId()%>" name="is_kySo_<%=item.getId()%>" value=""/>
							
							</td>
						</tr>					
					<%
								}
							}
						}
						
					}					
					
					
					%>
					
					</table>	
					<input type="hidden" id='listVehicleRecordId' name='listVehicleRecordId' value='<%=listAllVehicleRecord %>' >
				</div>
			</td>
			<td style="vertical-align:top;position:static;"><div id="viewFile">
			</div></td>
		</tr>
	</table>
</div>


<div id="boxXacNhan" >
<center>
	<table style="width: 90%">
		<tr>
			<td  style="width: 100%">
				<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.ykienxacnhan"/>
			</td>
		</tr>
		<tr>
			<td  style="width: 100%">
				<textarea rows="4" cols="50" style="width: 80%" id="ykienXacNhan" name="ykienXacNhan"></textarea>
			</td>
		</tr>
		
		
		<tr>
			<td  style="width: 100%">
				<input name="xem" type="radio" id="btnXacNhan" size="20"
							value="1" onclick="changeXacNhan()"/> &nbsp; <liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.dongy"/>
					&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 		
			<input name="xem" type="radio" id="btnKhongXacNhan" size="20"
							value="0" onclick="changeXacNhan()"/> &nbsp; <liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.khongdongy"/>				
			</td>
		</tr>
		
		<script language="JavaScript" type="text/javascript">
		function changeXacNhan(){
			if (document.getElementById('btnXacNhan').checked) {
				document.getElementById('divKhongXacNhan').style.display = "none";
				document.getElementById('divXacNhan').style.display = "";
			}else{
				document.getElementById('divXacNhan').style.display = "none";
				document.getElementById('divKhongXacNhan').style.display = "";
			}	
			
		}
		</script>
		
		<%
		PortletURL renderBackURL = renderResponse.createRenderURL();
		renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");
		
		%>
		
		
		<tr>	
			<td>
				<div id="divXacNhan" style="display: none;">
				
					<br>
					<%if( motCuaPhieuXuLyPhu.getTrangThaiHienTaiId()==17){ %>
					<button class="btnThuLyHS form-control" type="button" style="width: 15%;" onclick="kyXacNhan('<%=lanhDaoPhongKyXacNhan%>')">Duyệt chứng chỉ</button>
					<%}else{ %>
					<button type="button" id="kyBanCoYeu" name="kyBanCoYeu" value="" onclick="kySoChungChi()" class="btnThuLyHS form-control">Ký số BCY</button>
					<%} %>
					<a href="<%=renderBackURL%>"><button type="button" class="btnThuLyHS form-control"  style="width: 15%;">Quay lại</button></a>
					<br><br>
				</div>
			</td>
		</tr>
	<tr>		
			<td>
			<div id="divKhongXacNhan" style="display: none;">
				<br><br>
				<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.lydo"/> <br>
				<textarea rows="4" cols="50" id="lyDo" name="lyDo" style="width: 80%"></textarea>
				<br>
				<button class="btnThuLyHS form-control"  style="width: 36%;" type="button" onclick="summitForm('<%=lanhDaoPhongChuyenBoPhanKyLai%>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.lydo"/></button>
				
				
				<br><br>
			</div>	
			</td>	
	</tr>
	</table>
</center>	
</div>
<br>
<div id="thongBaoLoading"></div>

</aui:form>

<style>
.ui-dialog {
  top: 50% !important;
}
</style>

<div id="div_WarningMsg" style="display: none;">
	<table width="100%">
		<tr>
			<td colspan="2" style="width: 100%;"><label class="egov-label">
				Có đồng ý ký xác nhận không?</label> 
			</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" class="egov-button-normal" value="Đồng ý" 
					onclick="javascript: func_xacnhanPheDuyet();">
				&nbsp;&nbsp; 
				<input type="button" class="egov-button-normal" value="Quay lại" onclick="javascript: func_huyPheDuyet();" >
			</td>
		</tr>
	</table>
</div>

<div id="div_WarningMsgKySo" style="display: none;min-height: 130px !important;">
	<table width="100%">
		<tr>
			<td colspan="2" style="width: 100%;">
				Chưa ký số được cho Hồ sơ. Tiếp tục thực hiện ?
			</td>
		</tr>		
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" class="egov-button-normal" value="Đồng ý" id="btnXacNhanThongTinDSXe"
					onclick="javascript: func_xacnhanPheDuyetDSXe('<%=lanhDaoPhongKyXacNhan%>');">
				&nbsp;&nbsp; 
				<input type="button" class="egov-button-normal" value="Hủy" onclick="javascript: func_huyPheDuyetDSXe();" >
			</td>
		</tr>
	</table>
</div>

<portlet:resourceURL var="getDataAjax">
</portlet:resourceURL>
<portlet:actionURL var="signatureURL" name="signature"></portlet:actionURL>
<object id="plugin0" type="application/x-cryptolib05plugin" width="0" height="0"></object>
<script type="text/javascript">
	function plugin0()
		{
			return document.getElementById('plugin0');
		}
		plugin = plugin0;
        
            function selectFile(fn){
                document.getElementById("fn").value = fn;
                return true;
            }
            
            
            
        </script>
        
<script type="text/javascript">

	var url = '<%=getDataAjax%>';
	var nhanHieuLoai = '<%=loaiChiTiet%>';
	var complateSignatureURL = '<%=signatureURL%>';
	

	var isClick=false;
	var checkRewrite=0;
	$(document).ready(function()
	{
		var refreshId=setInterval( function() 
		{	
			console.log("Check-1=====");
			if (checkRewrite==1){
				console.log("====okie====submit=====");
				document.getElementById('<portlet:namespace/>myForm').submit();
				clearInterval(refreshId);
			}
			
	    }, 8000);
	});

	function showThongBaoMsg(){
		console.log("==showThongBaoMsg ==");
		$("#div_WarningMsg").dialog({
			title:'Xác nhận phê duyệt',
	        resizable: false,
	        modal: true,
	        width: '400px',
	        
	        closeOnEscape: false,
	        open: function() {
	            jQuery('.ui-widget-overlay').bind('click', function() {
	                $('#div_WarningMsg').dialog('close');
	            });
	        }
		});
	}
	function func_xacnhanPheDuyet()
	{
		func_huyPheDuyet();
		if (fileChuKy.trim()==''){
			console.log("Chưa cấu hình hình ảnh chữ ký");
			alert("Chưa có hình ảnh chữ ký cho cá nhân .");
			return;
		}else {
			var listVehicleRecordId=document.getElementById('listVehicleRecordId').value;
			if (listVehicleRecordId.trim()==''){
				alert("Chưa lựa chọn xe .");
				return;
			}else {
				isClick=true;
				document.getElementById('boxXacNhan').style.display = "none";
				document.getElementById("thongBaoLoading").innerHTML = "<b>Đang thực hiện. Vui lòng chờ........</b>";
				
				console.log("==Danh sach==Ký số =="+listVehicleRecordId);
				getFileContentKySo(listVehicleRecordId);
			}
		}
	}
	
	function func_huyPheDuyet()
	{
		 $('#div_WarningMsg').dialog('close');;
	}

	var idPhieuXuLyPhu = '<%=idPhieuXuLyPhu%>';
	var idHoSoThuTuc='<%=idHoSoThuTuc%>';
	var dieuKienChuyenDich='<%=Constants.DIEU_KIEN_DICH_CHUYEN_LANH_DAO_PHONG_KY%>';
	var idthuTucHanhChinh='<%=idthuTucHanhChinh%>';
	

	
	
	
	
	
	function summitForm(url) {
		document.getElementById('<portlet:namespace/>myForm').action = url;
	     document.getElementById('<portlet:namespace/>myForm').submit();
	}


	function summitKySo() {
		
	     document.getElementById('<portlet:namespace/>myForm').submit();
	}
	
	function kyXacNhan(url) {
		document.getElementById('divXacNhan').style.display = "none";
		document.getElementById("thongBaoLoading").innerHTML = "<b>Đang thực hiện. Vui lòng chờ........</b>";
		
		var listVehicleRecordId=document.getElementById('listVehicleRecordId').value;
		if (listVehicleRecordId.trim()==''){
			alert("Chưa lựa chọn xe .");
			return;
		}else {
			document.getElementById('<portlet:namespace/>myForm').action = url;
		     document.getElementById('<portlet:namespace/>myForm').submit();
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
				//var newElement = "<embed src='"+pdjpdfJS + data2.urlFile+"' type='application/pdf' id='FileContent' style='width:100%;height:500px;'>";
				var newElement="<iframe width='100%' height='500px' align='right' style='width:100%;height:500px;' src='"+data2.urlFile+"'></iframe>";
				document.getElementById("viewFile").innerHTML = newElement;
				
				//var labelPt = document.getElementById("label_pt").value;
				//document.getElementById("value_ajax").value = data;
				//document.getElementById("tongSoPT").innerHTML = labelPt + "&nbsp;" + data2.iddata.length;
				
				
			}
		});
	}


	function viewData() {
		document.getElementById("viewDuLieu").style.display = "";
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

	function showThongBaoMsgKySo() {
		console.log("==showThongBaoMsg ==");
		$("#div_WarningMsgKySo").dialog({
			title:'Xác nhận thay đổi',
	        resizable: false,
	        modal: true,
	        width: '400px',
	        
	        closeOnEscape: false,
	        open: function() {
	            jQuery('.ui-widget-overlay').bind('click', function() {
	                $('#div_WarningMsgKySo').dialog('close');
	            });
	        }
		});
	}
	function func_huyPheDuyetDSXe() {
		document.getElementById('divXacNhan').style.display = "";
		document.getElementById("thongBaoLoading").innerHTML = "";
		 $('#div_WarningMsgKySo').dialog('close');
	}
	function func_xacnhanPheDuyetDSXe(url) {
		func_huyPheDuyetDSXe();
		document.getElementById('divXacNhan').style.display = "none";
		document.getElementById("thongBaoLoading").innerHTML = "<b>Đang thực hiện. Vui lòng chờ........</b>";
		document.getElementById('<portlet:namespace/>myForm').action = url;
	    document.getElementById('<portlet:namespace/>myForm').submit();
	}

</script>
<script type="text/javascript" src='<%= PortalUtil.getStaticResourceURL(request, request.getContextPath() + "/js/chungchichatluong.js", javaScriptLastModified) %>'></script>
