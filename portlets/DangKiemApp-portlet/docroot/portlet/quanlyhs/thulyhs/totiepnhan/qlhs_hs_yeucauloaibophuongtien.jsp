<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord"%>
<%@page import="vn.dtt.gt.dk.utils.config.DKConfigurationManager"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.FormatData"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportBusinessUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportFunction"%>  
<%@page import="vn.dtt.gt.dk.message.MessageUtils"%>
<%@page import="vn.dtt.gt.dk.nsw.model.RemovedVehicle"%>
<%@page import="vn.dtt.gt.dk.nsw.model.ConfirmOfRemovedVehicle"%>
<%@page import="vn.dtt.gt.dk.nsw.message.xml.MessageFactory"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>

<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/totiepnhan/initToTiepNhan.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idPhieuXuLyPhu = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY_PHU);
	
	//quay lai trang
	PortletURL renderBackURL = renderResponse.createRenderURL();
	renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");
%>

<%

	System.out.println("*********************/portlet/thulyhs/totiepnhan/qlhs_hs_yeucauloaibophuongtien.jsp ****** ");
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	String loaiChiTiet = "";
    
    List<VehicleGroup> vehicleGroups = new ArrayList();
    List<VehicleRecord> liVehicleRecords = null;
	String listAllVehicleRecord="";
	
	TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(ConvertUtil.convertToLong(idHoSoThuTuc));
	RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(ConvertUtil.convertToLong(idHoSoThuTuc));
	MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(ConvertUtil.convertToLong(idPhieuXuLyPhu));
	TthcNoidungHoSo noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(motCuaPhieuXuLyPhu.getNoiDungHoSoId());

	String data = MessageUtils.replaceXML(noidungHoSo.getNoiDungXml());	
	String listVehicleId="";
	
%>

<%
	// Ghi actionlog
		
	String noidungthaotac = "Mở xem Yêu cầu loại bỏ phương tiện thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
	String tenmanhinhdaidien = "Yêu cầu loại bỏ phương tiện";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<script type="text/javascript">
var vehicleRecordLists = new Array();
</script>

<table class="wd-table table">
	<caption style="font-size: 12px;color:black;"><b><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.danh.sachxe.nhap.khau" /></b></caption>
	<thead>
		<tr>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.stt" /></th>			
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.loai.phuong.tien.kt" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.nhan.hieu" /> <br> <liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.so.loai" /> </th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.sokhung" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.lanhdaophong.chungchichatluong.sodongco" /></th>
			<th>Năm SX</th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.ghichu" /></th>
		</tr>
	</thead>
	<tbody>
		<%
		
		List<Object> liObjects = MessageFactory.converXMLMessagesContentToObject(data);
		long k=0;
		int stt=0;
		String NoiDung = "";
		for (Object object : liObjects) {
			// update
			if (object instanceof RemovedVehicle) {
				RemovedVehicle removedVehicle = RemovedVehicle.class.cast(object);		
				NoiDung = removedVehicle.getReasonForRemoving();
				NoiDung = NoiDung + " <br> " + DKConfigurationManager.getStrProp("sophuongtiendenghiloaibo",
						"So phuong tien DN loai bo: ") + removedVehicle.getImportedVehicle().size();
				NoiDung = NoiDung + " <br> " + DKConfigurationManager.getStrProp("ngaydenghi",
						"Ngay de nghi: ")  +FormatData.parseDateToTringType3( FormatData.parseStringToDate(removedVehicle.getRequestDate()));
				String nhanHieuSoLoai="";
				String loaiPhuongTien="";				
				long setVehicleGroupId = 0;				
				VehicleGroup vehicleGroup = null;
				List<ConfirmOfRemovedVehicle.ImportedVehicle> importedVehicles = new ArrayList<ConfirmOfRemovedVehicle.ImportedVehicle>();
				for(RemovedVehicle.ImportedVehicle importedVehicle : removedVehicle.getImportedVehicle()){
					k=k+1;
					stt++;
					ConfirmOfRemovedVehicle.ImportedVehicle vehicle  = new ConfirmOfRemovedVehicle.ImportedVehicle();
										
					String namSanXuat  = importedVehicle.getProductionYear();					
					int setVehicleEngineStatus = importedVehicle.getVehicleEngineStatus();
					
					String soKhung = importedVehicle.getChassisNumber();
					String soDongCo = importedVehicle.getEngineNumber();
					 
					String tinhTrangThamChieu = "";
					if (setVehicleEngineStatus == 0) {
						tinhTrangThamChieu = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-0", "");
					} else if (setVehicleEngineStatus == 1) {
						tinhTrangThamChieu = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-1", "");
					} else {
						tinhTrangThamChieu = DKConfigurationManager.getStrProp("Vehicle-Engine-Status-2", "");
					}
					
					VehicleRecord vehicleRecord  = VehicleRecordLocalServiceUtil.getVehicleRecord(importedVehicle.getCodeNumber(), importedVehicle.getChassisNumber(), importedVehicle.getEngineNumber());
					if(vehicleRecord!=null){
						listVehicleId=listVehicleId+vehicleRecord.getId()+",";
						if (vehicleRecord.getVehicleGroupId() == setVehicleGroupId)
						{ }	
						else
						{
							setVehicleGroupId = vehicleRecord.getVehicleGroupId();
							vehicleGroup=VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord.getVehicleGroupId());
							if(vehicleGroup!=null){
							nhanHieuSoLoai=ReportUtils.getTenDmData(ReportConstant.TRADE_MARK, vehicleGroup.getTradeMark())
									+"<br>"+vehicleGroup.getCommercialName();
							loaiPhuongTien = ReportUtils.getTenDmData(ReportConstant.VEHICLE_TYPE, vehicleGroup.getVehicleType()) 
									+"<br>"+ ReportUtils.getTenDmData(ReportConstant.ENGINE_TYPE, vehicleGroup.getEngineType());
							}
						}
					}	
		%>
		<tr>
			<td class="text-center"><%=stt %></td>			
			<td class="text-center"><%=loaiPhuongTien%></td>
			<td class="text-center"><%=nhanHieuSoLoai %></td>
			<td><span><%=soKhung %></span></td>
			<td><span><%=soDongCo %></span></td>
			<td class="text-center"><%=namSanXuat %></td>
			<td class="text-center"><%=tinhTrangThamChieu%></td>
		</tr>
		<%} } }
		int tongSo = stt;
		%>
	</tbody> 
</table>
<table class="wd-table table">
	<input type='hidden' id="label_pt" name="label_pt" value="<liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.tong.so.pt" />"/>
	<input type='hidden' id="value_ajax" name="value_ajax" value=""/>
	<caption style="font-size: 20px vn.gt.dk.qlhs.lanh.dao.phong.trang.thai;"><div id="tongSoPT"><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.tong.so.pt" /> <%=tongSo%></div></caption>
	<thead>
		<tr>
			<td style="font-size: 12px "><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.phong.noi.dung" />: <%=NoiDung %></td>			
		</tr>
	</thead>
 
</table>

<div id="divButton">
	<aui:button-row>
		<button type="button" onclick="eventHideOrShowDiv('divXacNhanLoaiBo', 'true')" class=" btnThuLyHS form-control">Xác nhận loại bỏ phương tiện</button>
		<button type="button" onclick="eventHideOrShowDiv('divTuChoiLoaiBo', 'true')" class=" btnThuLyHS form-control">Từ chối loại bỏ phương tiện</button>
		<a href="<%=renderBackURL.toString()%>"><button type="button" class=" btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button></a>
	</aui:button-row>
</div>
<div style="height: 15px" id="theDem"></div>


<%
PortletURL xacNhanLoaiBo = renderResponse.createActionURL();
xacNhanLoaiBo.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_XacNhanLoaiBo");
xacNhanLoaiBo.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
xacNhanLoaiBo.setParameter(Constants.ID_PHIEU_XU_LY_PHU, idPhieuXuLyPhu);
xacNhanLoaiBo.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
%>
<aui:form action="<%=xacNhanLoaiBo.toString()%>" name="formXacNhanLoaiBo" id="formXacNhanLoaiBo" method="POST">
<div id="divXacNhanLoaiBo">
	<p style="text-align: left;"><span>Lý do<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="xacNhanLoaiBo" name="xacNhanLoaiBo"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorXacNhanLoaiBo()) beforSummitForm('formXacNhanLoaiBo', '<%=xacNhanLoaiBo.toString()%>')" class="btnThuLyHS form-control" style="width: 220px">Xác nhận loại bỏ phương tiện</button>
		<button type="button" onclick="eventHideOrShowDiv('divXacNhanLoaiBo', 'false')" class="btnThuLyHS form-control" style="width: 150px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>

<%
PortletURL tuChoiLoaiBo = renderResponse.createActionURL();
tuChoiLoaiBo.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_TuChoiLoaiBo");
tuChoiLoaiBo.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
tuChoiLoaiBo.setParameter(Constants.ID_PHIEU_XU_LY_PHU, idPhieuXuLyPhu);
tuChoiLoaiBo.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
%>
<aui:form action="<%=tuChoiLoaiBo.toString()%>" name="formTuChoiLoaiBo" id="formTuChoiLoaiBo" method="POST">
<div id="divTuChoiLoaiBo">
	<p style="text-align: left;"><span>Lý do<span style="color: red;">*</span> :</span></p>
	<textarea class="textAreaAutosize" id="tuChoiLoaiBo" name="tuChoiLoaiBo"><%=StringPool.BLANK%></textarea>
	
	<aui:button-row cssClass="width100">
		<button type="button" onclick="if(validatorTuChoiLoaiBo()) beforSummitForm('formTuChoiLoaiBo', '<%=tuChoiLoaiBo.toString()%>')" class="btnThuLyHS form-control" style="width: 200px">Từ chối loại bỏ phương tiện</button>
		<button type="button" onclick="eventHideOrShowDiv('divTuChoiLoaiBo', 'false')" class="btnThuLyHS form-control" style="width: 150px"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshschotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
</aui:form>

<script type="text/javascript">

	$(function(){
		$('#divXacNhanLoaiBo').hide();
		$('#divTuChoiLoaiBo').hide();
		$('#theDem').hide();
	});

	//de ve file js, ko an doan code: <portlet:namespace/>
	function beforSummitForm(idForm, url) {
		console.log('=beforSummitForm=' + idForm);
		var urlAction = document.getElementById('<portlet:namespace/>' + idForm).action;
		if (urlAction == '') {
			document.getElementById('<portlet:namespace/>' + idForm).action = url;
		}
		var status = confirm("Bạn có muốn tiếp tục xử lý?");
		if (status) {
			document.getElementById('<portlet:namespace/>' + idForm).submit(); 
		} else {
			document.getElementById('<portlet:namespace/>' + idForm).action = '';
		}
	}

	function validatorXacNhanLoaiBo() {
		var xacNhanLoaiBo = $('#xacNhanLoaiBo').val();
		if (xacNhanLoaiBo.trim().length == 0) {
			alert("Đề nghị nhập lý do Xác nhận loại bỏ phương tiện !");
			return false;
		}
		return true;
	}
	function validatorTuChoiLoaiBo() {
		var tuChoiLoaiBo = $('#tuChoiLoaiBo').val();
		if (tuChoiLoaiBo.trim().length == 0) {
			alert("Đề nghị nhập lý do Từ chối loại bỏ phương tiện !");
			return false;
		}
		return true;
	}
</script>