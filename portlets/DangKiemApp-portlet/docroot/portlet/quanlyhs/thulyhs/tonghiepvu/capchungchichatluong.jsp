<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.utils.config.DKConfigurationManager"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportFunction"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceWrapper"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@ include file="/portlet/init.jsp"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
	String loaiChiTiet = "";
	
	//Ghi actionlog
	String noidungthaotac = "Mở xem Thụ lý hồ sơ, chức năng Cấp chứng chỉ hàng loạt thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
	String tenmanhinhdaidien = "Cấp chứng chỉ hàng loạt";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>

<script type="text/javascript">
var vehicleRecordLists = new Array();
</script>

<portlet:actionURL var="guiChungChiHangLoat" name="guiChungChiHangLoat">
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
	<portlet:param name="<%=Constants.DIEU_KIEN_CHUYEN_DICH %>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_DONG_Y_CAP_CHUNG_CHI %>"/>
</portlet:actionURL>


<aui:form action="<%=guiChungChiHangLoat%>" method="post" name="myForm" id="myForm" >

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
					loaiChiTiet = loaiChiTiet.replaceAll("'","");
					nhanHieuSoLoai=ReportUtils.getTenDmData(ReportConstant.TRADE_MARK, item.getTradeMark())
							+"<br>"+item.getCommercialName();
		%>
	
		<tr>
			<td class="text-center">
			<input type="hidden" id="stt_<%=item.getId() %>" name="stt_<%=item.getId() %>" value="<%=stt %>">
			<%=stt %></td>
			<td class="text-center"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.capchungchichatluong.nhom"/> <%=stt%></td>
			<td class="text-center"><%=ReportUtils.getTenDmData(ReportConstant.VEHICLE_TYPE, item.getVehicleType())%>
			<%=ReportUtils.getTenDmData(ReportConstant.ENGINE_TYPE, item.getEngineType())%></td>
			<td class="text-center"><%=loai %></td>
			<td class="text-center"><span><%=item.getCommercialName() %></span></td>
			<td><%=MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(ConvertUtil.convertToLong(idPhieuXuLyPhu)).getTrichYeuNoiDung() %></td>
			<td class="text-center">
				<a class="aicon" onclick="viewData();" ><i class="icon20 iconm5 fa fa-pencil"></i></a>
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
			if (item.getDraftCertificateId()>0 && item.getCertificateRecordId() > 0 && certificateRecord.getDigitalIssued() == Constants.CERTIFICATE_DIGITAL_ISSSUED_0){
				tongSo++;
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

<div id="viewDuLieu" style="display: none;" >
	<table style="width: 100%">
		<tr>
			<td style="width: 40%;vertical-align:top;position:static;">
				<div id="viewdata" style="padding-left:5px;">
				<input type='hidden' id='listVehicleRecordId' name='listVehicleRecordId' value='' >
					<table style='width:96%;' class='wd-table table'>
					<tr>
						<td style="text-align: center;">STT</td>
						<td align = 'center'><input id = 'check_all' name = 'check_all' type='checkbox' onclick="checkAll();"/></td>
						<td style="text-align: center;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.capchungchichatluong.nhanhieu"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.capchungchichatluong.soloai"/></td>
						<td style="text-align: center;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.capchungchichatluong.sokhung"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.capchungchichatluong.sodongco"/></td>
						<td style="text-align: center;"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.capchungchichatluong.tinhtrang"/><br><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.capchungchichatluong.sothamchieu"/></td>
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
							int index = 0;
							int i=0;
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
									tinhTrangThamChieu +=  "<br>"+item.getCodeNumber();	
						%>	
						<script type="text/javascript">
							vehicleRecordLists[<%=index++%>] = "<%=item.getId()%>";
						</script>			
						<tr>
							<td  style="text-align: center;"><%=++i %></td>
							<td align = 'center'><input type='checkbox' id='<%=item.getId() %>'  class='user'  onclick="changeajax('<%=item.getId() %>');"/></td>
							<td><a href="#" onclick="changedulieu('<%=item.getId()%>');"><%=nhanHieuSoLoai %></a></td>
							<td><a href="#" onclick="changedulieu('<%=item.getId()%>');"><%=soKhungDongCo %></a></td>
							<td><a href="#" onclick="changedulieu('<%=item.getId()%>');"><%=tinhTrangThamChieu %></a></td>
						</tr>					
					<%
								}
							}
						}
						
					}					
					
					
					%>
					
					</table>	
				</div>
			</td>
			<td style="vertical-align:top;position:static;"><div id="viewFile">
			</div></td>
		</tr>
	</table>
</div>


<div>
<center>
	<table style="width: 100%">
		<tr>
			<td  style="width: 100%">
				<input type="hidden" name="count_size_xe" id="count_size_xe" value="<%=tongSo%>"/>
				<liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.capchungchichatluong.ykienxacnhan"/>
			</td>
		</tr>
		<tr>
			<td  style="width: 100%">
				<textarea rows="4" cols="50" style="width: 80%" id="ykienXacNhan" name="ykienXacNhan"></textarea>
			</td>
		</tr>
		<tr>	
			<td>
				<div id="divXacNhan">
				
					<br>
					<button class="btnThuLyHS form-control" type="button" onclick="summitForm('<%=guiChungChiHangLoat%>')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.tonghiemvu.capchungchichatluong.guichungchihangloat"/></button>
					<br><br>
				</div>
			</td>
		</tr>
	</table>
</center>	
</div>

</aui:form>

<portlet:resourceURL var="getDataAjax">
</portlet:resourceURL>


<script type="text/javascript">

	function summitForm(url) {
		document.getElementById('<portlet:namespace/>myForm').action = url;
	     document.getElementById('<portlet:namespace/>myForm').submit();
	}

	var url = '<%=getDataAjax%>';
	var nhanHieuLoai = '<%=loaiChiTiet%>';


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
				
				//var labelPt = document.getElementById("label_pt").value;
				//document.getElementById("value_ajax").value = data;
				//document.getElementById("tongSoPT").innerHTML = labelPt + "&nbsp;" + data2.iddata.length;
				
				
			}
		});
	}

	function viewData() {
		document.getElementById("viewDuLieu").style.display = "";
	}
	
	function changedulieu_Old(dataId) {
	
		//alert("---data=="+dataId);

		var nhomId=document.getElementById("stt_"+dataId).value;
		var inspectionRecordId = '<%=inspectionRecord.getId()%>';
		
		$.ajax({
			type : 'POST',
			url : url,
			data : {
				dataId : dataId, type: 'lanhDaoPhong',nhomId:nhomId, inspectionRecordId:inspectionRecordId
			},
			success : function(data) {
				// preferred
				var data2 = JSON.parse(data);
				var giaTriText="<input type='hidden' id='listVehicleRecordId' name='listVehicleRecordId' value='' >"+
					"<table style='width:96%;' class='wd-table table'><tr>"+
					"<td>STT</td>"+
					"<td align = 'center'><input id = 'check_all' name = 'check_all' type='checkbox'onclick=\"checkAll()\"/></td>"+
					"<td>Nhãn hiệu <br> Số loại</td>"+
					"<td>Số khung <br> Số động cơ</td>"+
					"<td>Tình trạng <br> Số tham chiếu</td></tr>";
				// Xoa cac old item in select
				for ( var i = 0; i < data2.iddata.length; i++) {
					var duLieu=" <tr>";
					duLieu=duLieu+ "<td>"+ (i + 1) +"</td>";
					duLieu=duLieu+ "<td align = 'center'><input type='checkbox' id='"+data2.iddata[i]+"' style='float: left;' class='user'  onclick=\"changeajax('"+data2.iddata[i]+"');\"/></td>";
					duLieu=duLieu+ "<td>"+nhanHieuLoai+"</td>";
					duLieu=duLieu+ "<td>"+data2.sokhungdata[i]+"</td>";
					duLieu=duLieu+ "<td>"+data2.tinhtrangdata[i]+"</td>";
					duLieu=duLieu+"</tr>";
						//obj.add(new Option(data2.namechuyengia[i], data2.idchuyengia[i]), null);
					giaTriText=giaTriText+duLieu;
				}
				document.getElementById("viewdata").innerHTML = giaTriText+" </table>";
				document.getElementById("count_size_xe").value = data2.iddata.length;
	
				var pdfJS = '<%= request.getContextPath() + "/pdf.js/web/viewer.html?file=" %>';
				//var newElement = "<embed src='"+pdfJS+data2.urlFile+"' type='application/pdf' id='FileContent' style='width:95%;height:500px;'>";
				var newElement="<iframe width='100%' height='500px' align='right' style='width:100%;height:500px;' src='"+data2.urlFile+"'></iframe>";
				//document.getElementById("viewFile").innerHTML = newElement;
				document.getElementById("viewFile").style.display = "";
				var labelPt = document.getElementById("label_pt").value;
				document.getElementById("value_ajax").value = data;
				document.getElementById("tongSoPT").innerHTML = labelPt + "&nbsp;" + data2.iddata.length;
			}
		});
	}

function changeajax(dataId) {
		
		var isCheck=document.getElementById(dataId).checked;
		var isCheckInternal = true;
		var listVehicleRecordId=document.getElementById('listVehicleRecordId').value;
		if (isCheck==true){
			//alert("--true");
			listVehicleRecordId=listVehicleRecordId+dataId+", ";
			for ( var i = 0; i < vehicleRecordLists.length; i++) {
				isCheckInternal = document.getElementById(vehicleRecordLists[i]).checked;
				if(isCheckInternal == false){
					break;
				}
			}
			document.getElementById("check_all").checked = isCheckInternal;
		}else{
			//alert("--false");
			var res = listVehicleRecordId.replace(dataId+", ", "");
			document.getElementById("check_all").checked = false;
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

	
</script>