<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"%>
<%@page import="vn.dtt.gt.dk.utils.format.FormatData"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoAction"%>
<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/dangkiemvien/initDangKiemVien.jsp"%>

<meta http-equiv='cache-control' content='no-cache'>
<meta http-equiv='expires' content='0'>
<meta http-equiv='pragma' content='no-cache'>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/dangkiemvien-duocPhanCong.css">
<% long javaScriptLastModified = ServletContextUtil.getLastModified(application, "/js/", true); %>
<script type="text/javascript" src='<%= PortalUtil.getStaticResourceURL(request, request.getContextPath() + "/js/lapbienbankiemtra.js", javaScriptLastModified) %>'></script>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
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
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	long idPhieuXyLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
	long confirmedInspectionId = ParamUtil.getLong(request, Constants.ID_CONFIRMED_INSPECTION);

	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==dangkiemvien/duocphancong_dangKiemVien.jsp==idHoSoThuTuc==" + idHoSoThuTuc + "==idthuTucHanhChinh==" + idthuTucHanhChinh + "==idPhieuXyLyPhu==" + idPhieuXyLyPhu);

	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==dangkiemvien/duocphancong_dangKiemVien.jsp==confirmedInspectionId==Truyen sang==" + confirmedInspectionId);
	
	ConfirmedInspection confirmedInspection = null;
	confirmedInspection = ConfirmedInspectionLocalServiceUtil.findByPhieuXuLyPhuId(idPhieuXyLyPhu);
	if (confirmedInspection == null) { 
		confirmedInspection = new ConfirmedInspectionImpl(); 
	}
	
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==dangkiemvien/duocphancong_dangKiemVien.jsp==confirmedInspectionId==Lay trong DB==" + confirmedInspection.getId());
	confirmedInspectionId = confirmedInspection.getId();
	
	//RegisteredInsepction lay theo ConfirmedInspection.registeredinspectionid hoac theo idHoSoThuTuc
	RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(ConvertUtil.convertToLong(idHoSoThuTuc));
	if (registeredInspection == null) {
		registeredInspection = new RegisteredInspectionImpl();
	}
	
	TaoCauTrucSoDkAcBB taoCauTrucSoDangKi = new TaoCauTrucSoDkAcBB();
	long userId = PortalUtil.getUserId(request);
	
	LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==dangkiemvien/duocphancong_dangKiemVien.jsp==userId==" + userId);
	
	String dangKiemVienChinh = "";
	String dangKiemVienPhu = "";
	CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
	
	String maNhanVien = (corporationInspector != null) ? corporationInspector.getContactcode() : "";
	
	
	///////// Danh sach Dang Kiem Vien
	List<CorporationAttendee> listDKVChinhs = CorporationAttendeeLocalServiceUtil.findByConfirmedInspectionIdAndInspectorRole(confirmedInspectionId, 1);
	if (listDKVChinhs!=null && listDKVChinhs.size()>0){
		dangKiemVienChinh=listDKVChinhs.get(0).getInspectorName();
	}
	List<CorporationAttendee> listDKVPhoiHops = CorporationAttendeeLocalServiceUtil.findByConfirmedInspectionIdAndInspectorRole(confirmedInspectionId, 2);
	if (listDKVPhoiHops!=null && listDKVPhoiHops.size()>0){
		for (CorporationAttendee item: listDKVPhoiHops ){
			dangKiemVienPhu=dangKiemVienPhu+item.getInspectorName()+"; ";
		}
	}
	
	List<DmDataItem> lstLuaChonKetQua = DmDataItemLocalServiceUtil.findByDmDataGroupCode(DanhMucKey.EVALUATION_RESULT);
	if (lstLuaChonKetQua == null) { lstLuaChonKetQua = new ArrayList<DmDataItem>(); }

%>

<style>
span {
  white-space: normal !important;
}

</style>
<!-- START - man hinh duoc phan cong -->
<div id="divDuocPhanCong">

<!-------------------------------------------- Nội dung kiểm tra: -------------------------------------------->
<%

PortletURL lapBienBanKetThucktht = renderResponse.createActionURL();
lapBienBanKetThucktht.setParameter(ActionRequest.ACTION_NAME, "lapBienBanKetThucKiemTraHienTruong");
lapBienBanKetThucktht.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
lapBienBanKetThucktht.setParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(idPhieuXyLyPhu));
lapBienBanKetThucktht.setParameter(Constants.ID_CONFIRMED_INSPECTION, StringUtil.valueOf(confirmedInspectionId));
%>

<%
//quay lai trang danh sach duoc phan cong
PortletURL renderBackURL = renderResponse.createRenderURL();
renderBackURL.setParameter("jspPage", "/portlet/quanlyhs/search_content.jsp");
renderBackURL.setParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(idHoSoThuTuc));
renderBackURL.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
renderBackURL.setParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(idPhieuXyLyPhu));


%>

<!-- demo FACE -->
<aui:form action="<%=lapBienBanKetThucktht.toString()%>" name="tblDemo" id="tblDemo" method="POST"></aui:form>

<!-- Thong tin 5 button, true la show, false la hidden -->
<aui:button-row cssClass="width100" id="divBtnRowChucNang">
	<button type="button" class="btnThuLyHS form-control" style="width: 300px !important;float: left;"
		onclick="eventHideOrShowDiv('divYeuCauBoSung', 'true', 'divThongTinNhomXeNhapKhau', 'false', 'divBusinnessDoiChieuHoSo', 'false', 'divBtnRowChucNang', 'false')">Yêu cầu sửa hồ sơ & Hoãn kiểm tra</button>
		
	<button type="button" class=" btnThuLyHS form-control" style="width: 150px !important;float: left;"
		onclick="eventHideOrShowDiv('divHoanKiemTra', 'true', 'divThongTinNhomXeNhapKhau', 'false', 'divBusinnessDoiChieuHoSo', 'false', 'divBtnRowChucNang', 'false')">Hoãn kiểm tra</button>
	
	<button type="button" class="btnThuLyHS form-control" style="width: 210px !important;float: left;"
		onclick="eventHideOrShowDiv('divTraLaiDoiTuongPhanCong', 'true', 'divThongTinNhomXeNhapKhau', 'false', 'divBusinnessDoiChieuHoSo', 'false', 'divBtnRowChucNang', 'false')">Trả lại đội trưởng phân công</button>
	<a onclick="checkTrungSoDongCo('<%=idHoSoThuTuc%>')"><button type="button" class="btnThuLyHS form-control">Kiểm tra trùng số</button></a>
	<a href="<%=renderBackURL.toString()%>"><button type="button" class="btnThuLyHS form-control" style="width: 150px !important;">Quay lại</button></a>
	
</aui:button-row>

<!------------------------------------ Yêu cầu bổ sung ------------------------------------>
<%
PortletURL yeuCauBoSung = renderResponse.createActionURL();
yeuCauBoSung.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_BoSungDoiChieuThieuTaiLieu");
yeuCauBoSung.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
yeuCauBoSung.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(idPhieuXyLyPhu));
yeuCauBoSung.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
yeuCauBoSung.setParameter(Constants.ID_CONFIRMED_INSPECTION,  String.valueOf(confirmedInspectionId));
%>
<aui:form action="<%=yeuCauBoSung.toString()%>" name="formYeuCauBoSung" id="formYeuCauBoSung" method="POST">
<div id="divYeuCauBoSung">
	<p><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.lydoyeucaubosung"/></span></p>
	<textarea class="textAreaAutosize" id="yeuCauBoSung" name="yeuCauBoSung"><%=StringPool.BLANK%></textarea>
	<div>
		<p><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.ngayhoanthienhoso"/></span></p>
		<input type="text" placeholder="Ngày hoàn thiện hồ sơ"  class="form-control-find-calendar" style="width: 400px; float: left;"
				name="ngayHoanThienHoSo" id="ngayHoanThienHoSo" onclick="gtCalendar('ngayHoanThienHoSo')">
		<span class="input-group-btn">
			<button class="btn_calendar btn-default" type="button" onclick="gtCalendar('ngayHoanThienHoSo')"><i class="fa fa-calendar"></i></button>
		</span>
	</div>
	<aui:button-row cssClass="width100">
		<button type="button" id="yeuCauSuaHoSoVaHoanKiemTra" onclick="if(validatorYeuCauBoSung()) beforSummitForm('formYeuCauBoSung','<%=yeuCauBoSung.toString()%>')" class="btnThuLyHS form-control" style="width: 300px; float: left;">Yêu cầu sửa hồ sơ & Hoãn kiểm tra</button>
		<button type="button" class=" btnThuLyHS form-control" style="width: 150px;"
			onclick="eventHideOrShowDiv('divYeuCauBoSung', 'false', 'divThongTinNhomXeNhapKhau', 'true', 'divBusinnessDoiChieuHoSo', 'true', 'divBtnRowChucNang', 'true')">Quay lại</button>
	</aui:button-row>
</div>
</aui:form>

<!------------------------------------ Hoãn kiểm tra ------------------------------------>
<%
PortletURL hoanKiemTra = renderResponse.createActionURL();
hoanKiemTra.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_HoanKiemTra");
hoanKiemTra.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
hoanKiemTra.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(idPhieuXyLyPhu));
hoanKiemTra.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
hoanKiemTra.setParameter(Constants.ID_CONFIRMED_INSPECTION, String.valueOf(confirmedInspectionId));
%>

<aui:form action="<%=hoanKiemTra.toString()%>" name="formHoanKiemTra" id="formHoanKiemTra" method="POST">
<div id="divHoanKiemTra">
	<p><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.duocphancongdangkiemvien.lydohoankiemtra"/></span></p>
	<textarea class="textAreaAutosize" id="lyDoHoanKiemTra" name="lyDoHoanKiemTra"><%=StringPool.BLANK%></textarea>
	<aui:button-row cssClass="width100">
		<button type="button" id="hoanKiemTra" onclick="if(validatorHoanKiemTra()) beforSummitForm('formHoanKiemTra', '<%=hoanKiemTra.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;float: left;">Thực hiện</button>
		
		<button type="button" class=" btnThuLyHS form-control" style="width: 200px;"
			onclick="eventHideOrShowDiv('divHoanKiemTra', 'false', 'divThongTinNhomXeNhapKhau', 'true', 'divBusinnessDoiChieuHoSo', 'true', 'divBtnRowChucNang', 'true')">Quay lại</button>
	</aui:button-row>
</div>
</aui:form>

<%
PortletURL traLaiDoiTruongPhanCong = renderResponse.createActionURL();
traLaiDoiTruongPhanCong.setParameter(ActionRequest.ACTION_NAME, "toTiepNhan_TraLaiDoiTruongPhanCong");
traLaiDoiTruongPhanCong.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
traLaiDoiTruongPhanCong.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(idPhieuXyLyPhu));
traLaiDoiTruongPhanCong.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
traLaiDoiTruongPhanCong.setParameter(Constants.ID_PHIEU_XU_LY_PHU, String.valueOf(idPhieuXyLyPhu));
%>
<!------------------------------------ Trả lại đội trưởng phân công ------------------------------------>
<aui:form action="<%=traLaiDoiTruongPhanCong.toString()%>" name="formTraLaiDoiTuongPhanCong" id="formTraLaiDoiTuongPhanCong" method="POST">
<div id="divTraLaiDoiTuongPhanCong">
	<p><span>Lý do trả lại (<span style="color: red;">*</span>) :</span></p>
	<textarea class="textAreaAutosize" id="lyDoTraLai" name="lyDoTraLai"><%=StringPool.BLANK%></textarea>
	<aui:button-row cssClass="width100">
		<button type="button" id="traLaiDoiTruongPhanCong" onclick="if(validatorTraLaiDoiTuongPhanCong()) beforSummitForm('formTraLaiDoiTuongPhanCong', '<%=traLaiDoiTruongPhanCong.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;float: left;">Thực hiện</button>
		
		<button type="button" class=" btnThuLyHS form-control" style="width: 200px;"
			onclick="eventHideOrShowDiv('divTraLaiDoiTuongPhanCong', 'false', 'divThongTinNhomXeNhapKhau', 'true', 'divBusinnessDoiChieuHoSo', 'true', 'divBtnRowChucNang', 'true')">Quay lại</button>
	</aui:button-row>
</div>
</aui:form>

<!------------------------------------ Thông tin nhóm xe nhập khẩu ------------------------------------>
<div style="width: 30px">&nbsp</div>
<div id="divThongTinNhomXeNhapKhau">

	<!-- thong tin phan cong kiem tra -->
	<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 100%">
		<span style="font-size: 13px; font-weight: bold;">Thông tin cán bộ phân công :</span>
	</div>
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
		<table style="width: 100%; float: left;" id="tblTTinNhomXeNk" class="wd-table table">
			<tr>
				<td style="width: 30%;"> Đăng kiểm viên chính:
				</td>
				<td> <%=dangKiemVienChinh %>
				</td>
			</tr>
			<tr>
				<td style="width: 30%;">Đăng kiểm viên phối hợp: 
				</td>
				<td> <%=dangKiemVienPhu %>
				</td>
			</tr>
			<tr>
				<td style="width: 30%;">Ngày phân công: 
				</td>
				<td> <%=ConvertUtil.parseDateToString(confirmedInspection.getDateFrom()) %>
				</td>
			</tr>						
		</table>
	</div>	
	<%
	List<InspectionRecord> lstInspectionRecords = InspectionRecordLocalServiceUtil.findByBienBanLuuTam(confirmedInspection.getId());
	if(lstInspectionRecords != null && lstInspectionRecords.size() > 0){
		
	%>
	<!-- Bien ban luu tam -->
	<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 100%">
		<span style="font-size: 13px; font-weight: bold;">Biên bản lưu tạm : </span>
	</div>
		<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
		<table style="width: 100%; float: left;" id="tblTTinNhomXeNk" class="wd-table table">
			<thead>
				<tr>
					<th class="text-center">STT</th>
					<th class="text-center">Số BBKT <br> Ngày BBKT</th>
					<th class="text-center">Nhãn hiệu <br> Số loại</th>
					<th class="text-center">Số xe</th>
					<th class="text-center">Ghi chú</th>
					<th class="text-center">Thao tác</th>
				</tr>
			</thead>
			<tbody>
				<%
				for(int i = 0; i < lstInspectionRecords.size() ; i ++){
				InspectionRecord inspectionRecord = lstInspectionRecords.get(i);
				List<VehicleRecord> lstVehicleRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
				long soXe = 0;
				String nhanHieu = "";
				String soLoai = "";
				VehicleGroup vehicleGroup = null;
				long vehicleGroupInitialId = 0;
				if(lstVehicleRecords != null && lstVehicleRecords.size() >0){
					soXe = lstVehicleRecords.size();
					
					vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(lstVehicleRecords.get(0).getVehicleGroupId());
					VehiclerecordInitial vehicleRecordInitial = VehiclerecordInitialLocalServiceUtil.fetchVehiclerecordInitial(lstVehicleRecords.get(0).getId());
					
					if(vehicleGroup != null){
						DmDataItem dataItemNhanHieu = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.TRADE_MARK, vehicleGroup.getTradeMark());
						nhanHieu = Validator.isNotNull(dataItemNhanHieu) ? dataItemNhanHieu.getName() : "";
						soLoai = vehicleGroup.getCommercialName();
					}
					
					if(vehicleRecordInitial != null) {
						vehicleGroupInitialId = vehicleRecordInitial.getVehicleGroupId();
					}
				}
				
				PortletURL urlSuaBienBanKiemTra = renderResponse.createRenderURL();
				urlSuaBienBanKiemTra.setParameter("jspPage", "/portlet/quanlyhs/thulyhs/dangkiemvien/suabienbanktra_dangKiemVien.jsp");
				urlSuaBienBanKiemTra.setParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(idHoSoThuTuc));
				urlSuaBienBanKiemTra.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, StringUtil.valueOf(idthuTucHanhChinh));
				urlSuaBienBanKiemTra.setParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(idPhieuXyLyPhu));
				urlSuaBienBanKiemTra.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
				urlSuaBienBanKiemTra.setParameter(Constants.ID_CONFIRMED_INSPECTION, StringUtil.valueOf(confirmedInspectionId));
				urlSuaBienBanKiemTra.setParameter(Constants.ID_VEHICLE_GROUP, (Validator.isNotNull(vehicleGroup) ? String.valueOf(vehicleGroup.getId()) : ""));
				urlSuaBienBanKiemTra.setParameter(Constants.ID_VEHICLE_GROUP_INITIAL, String.valueOf(vehicleGroupInitialId));
				urlSuaBienBanKiemTra.setParameter(Constants.ID_INSPECTION_RECORD, String.valueOf(inspectionRecord.getId()));
				%>
				<tr>
					<td class="text-center"><%=i + 1%></td>
					<td class="text-center"><%=inspectionRecord.getInspectionRecordNo()%><br><%=FormatData.parseDateToTringDDMMYYY(inspectionRecord.getInspectionRecordDate())%></td>
					<td class="text-center"><%=nhanHieu%><br><%=soLoai%></td>
					<td class="text-center"><%=soXe%></td>
					<td class="text-center"><%=inspectionRecord.getRemarks()%></td>
					<td class="text-center"><a href="<%=urlSuaBienBanKiemTra.toString() %>" class="aicon" title="Sửa"><i class="icon20 iconm5 fa fa-pencil"></i></a></td>
				</tr>
				<%	
				}
				%>
			</tbody>
			</table>
			</div>
	<%
	}
	%>
	<!-- title -->
	<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 100%">
		<span style="font-size: 13px; font-weight: bold;">Thông tin nhóm xe nhập khẩu :</span>
	</div>
	<!-- 
	<div style="float: left; text-align: left; width: 57%; padding: 1% 1% 1% 0;"><div id="u6148" style="  left: 0px;width: 100%;height: 10px;padding-left: 14px;border-bottom: solid 2px #D2C5C5;"></div></div>
	<div style="float: left; text-align: left; width: 3%; padding: 1% 1% 1% 0;"><span style="font-size: 13px; font-weight: bold;">(-)</span></div>
	-->
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
		<table style="width: 100%; float: left;" id="tblTTinNhomXeNk" class="wd-table table">
			<thead>
				<tr>
					<th class="text-center">STT</th>
					<th class="text-center">Nhãn hiệu <br> Số loại</th>
					<th class="text-center">Nội dung</th>
					<th class="text-center" hidden="true">Trạng thái</th>
				</tr>
			</thead>
			<%
			
			List<VehicleRecord> lstVehicleRecored = VehicleRecordLocalServiceUtil.findByConfirmedInspectionIdAndBienBanKiemTra(confirmedInspectionId);
			if (lstVehicleRecored == null) { lstVehicleRecored = new ArrayList<VehicleRecord>(); }
			LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==dangkiemvien/duocphancong_dangKiemVien.jsp==lstVehicleRecored==size==" + lstVehicleRecored.size());
			
			HashMap<Long, List<VehicleRecord>> hashVehicleGroup = new HashMap<Long, List<VehicleRecord>>();
			
			long temp = 0;
			List<VehicleRecord> tempLstVeRecord = null;
			
			for (VehicleRecord item : lstVehicleRecored) {
				temp = item.getVehicleGroupId();
				if (hashVehicleGroup.containsKey(temp)== false) {
					tempLstVeRecord = new ArrayList<VehicleRecord>();
					tempLstVeRecord.add(item);
					hashVehicleGroup.put(temp, tempLstVeRecord);
					
				} else {
					tempLstVeRecord = hashVehicleGroup.get(temp);
					tempLstVeRecord.add(item);
					hashVehicleGroup.put(temp, tempLstVeRecord);
				}
			}
			
			//System.out.println("-------------hashVehicleGroup.entrySet()----------"+hashVehicleGroup.entrySet());
			
			VehicleGroup veGroup = null;
			int row = 1;
			DmDataItem dataItemNhanHieu = null;
			DmDataItem dataItemSoLoai = null;
			DmDataItem dataItemLoaiPhuongTien = null;
			DmDataItem dataItemState = null;
			List<ProductionCountry> lstProductionCountry = null;
			String sCountryCode = "";
			TthcNoidungHoSo tthcNoiDungHoSo = null;
			String lstVehicleGroupIdReport = "";
			for (Map.Entry<Long, List<VehicleRecord>> entry : hashVehicleGroup.entrySet()) {
				lstVehicleGroupIdReport = lstVehicleGroupIdReport + entry.getKey() + ",";
				veGroup = VehicleGroupLocalServiceUtil.getVehicleGroup(entry.getKey());
				VehicleGroupInitial vehicleGroupInitial = VehicleGroupInitialLocalServiceUtil.fetchVehicleGroupInitial(entry.getKey());
				try {
					tthcNoiDungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(veGroup.getAttachedFile());
				} catch (Exception e) { tthcNoiDungHoSo = null; }
				
				try {
					//dataItemNhanHieu = DmDataItemLocalServiceUtil.getDmDataItem(ConvertUtil.convertToLong(veGroup.getTradeMark()));
					dataItemNhanHieu = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.TRADE_MARK, vehicleGroupInitial.getTradeMark());
				} catch (Exception e) { dataItemNhanHieu = null; }
				
				try {
					//dataItemSoLoai = DmDataItemLocalServiceUtil.getDmDataItem(ConvertUtil.convertToLong(veGroup.getCommercialName()));
				} catch (Exception e) { dataItemSoLoai = null; }
				
				try {
					dataItemLoaiPhuongTien = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.VEHICLE_TYPE, veGroup.getVehicleType());
				} catch (Exception e) { dataItemLoaiPhuongTien = null; }
				
				lstProductionCountry = ProductionCountryLocalServiceUtil.findByVehicleGroupId(veGroup.getId());
				if (lstProductionCountry != null) {
					sCountryCode = CollectionUtils.listProductionCountryToString(lstProductionCountry);
				}
				
				LogFactoryUtil.getLog(QuanLyHoSoAction.class).info("==dangkiemvien/duocphancong_dangKiemVien.jsp==verhicleGroup===" + veGroup.getId());
			%>
				<tr onclick="businessDoiChieuHoSo('<%=row%>')" id="trIdTblTTinNhomXeNk<%=row%>" class="elementTblTTinNhomXeNk trTblTTinNhomXeNk<%=row%>" onmouseover="onMouseOverTblTTinNhomXeNk('<%=row%>')" onmouseout="onMouseOutTblTTinNhomXeNk('<%=row%>')">
					<td class="text-center"><span><%=row%></span></td>
					<td class="text-center">
						<span><%=(dataItemNhanHieu != null) ? dataItemNhanHieu.getName() : veGroup.getTradeMark()%></span><br>
						<span><%=(vehicleGroupInitial != null) ? vehicleGroupInitial.getCommercialName() : ""%></span></td>
					<!-- id VehicleGroup -->
					<input type="text" hidden="true" id="vehicleGroupTblTTinNhomXeNk<%=row%>" name="vehicleGroupTblTTinNhomXeNk<%=row%>" value="<%=veGroup.getId()%>">
					<input type="text" hidden="true" id="nhomTblTTinNhomXeNk<%=row%>" name="nhomTblTTinNhomXeNk<%=row%>" value="<%=row%>">
					<input type="text" hidden="true" id="nhanHieuTblTTinNhomXeNk<%=row%>" name="nhanHieuTblTTinNhomXeNk<%=row%>" value="<%=(dataItemNhanHieu != null) ? dataItemNhanHieu.getName() : vehicleGroupInitial.getTradeMark()%>" />
					<input type="text" hidden="true" id="soLoaiTblTTinNhomXeNk<%=row%>" name="soLoaiTblTTinNhomXeNk<%=row%>" value="<%=(vehicleGroupInitial != null) ? vehicleGroupInitial.getCommercialName() : ""%>" />
					
					<%%>
					<!-- thong tin VehicleGroup hidden -->
					<input type="text" hidden="true" id="vehicleClass<%=row%>" name="vehicleClass<%=row%>" value="<%=Validator.isNull(veGroup.getVehicleClass()) ? "" : veGroup.getVehicleClass()%>"/>
					<input type="text" hidden="true" id="referenceCertificateNo<%=row%>" name="referenceCertificateNo<%=row%>" value="<%=Validator.isNull(veGroup.getReferenceCertificateNo()) ? "" : veGroup.getReferenceCertificateNo()%>"/>
					<input type="text" hidden="true" id="safetyTestReportId<%=row%>" name="safetyTestReportId<%=row%>" value="<%=Validator.isNull(veGroup.getSafetyTestReportId()) ? "" : veGroup.getSafetyTestReportId()%>" />
					<input type="text" hidden="true" id="emissionTestReportId<%=row%>" name="emissionTestReportId<%=row%>" value="<%=Validator.isNull(veGroup.getEmissionTestReportId()) ? "" : veGroup.getEmissionTestReportId()%>" />
					<input type="text" hidden="true" id="copReportId<%=row%>" name="copReportId<%=row%>" value="<%=Validator.isNull(veGroup.getCopReportId()) ? "" : veGroup.getCopReportId()%>"/>
					<input type="text" hidden="true" id="vehicleType<%=row%>" name="vehicleType<%=row%>" value="<%=Validator.isNull(dataItemLoaiPhuongTien) ? "" : dataItemLoaiPhuongTien.getName()%>" />
					<input type="text" hidden="true" id="tradeMark<%=row%>" name="tradeMark<%=row%>" value="<%=Validator.isNull(veGroup.getTradeMark()) ? "" : veGroup.getTradeMark()%>" />
					<input type="text" hidden="true" id="commercialName<%=row%>" name="commercialName<%=row%>" value="<%=Validator.isNull(veGroup.getCommercialName()) ? "" : veGroup.getCommercialName()%>" />
					<input type="text" hidden="true" id="modelCode<%=row%>" name="modelCode<%=row%>" value="<%=Validator.isNull(veGroup.getModelCode()) ? "" : veGroup.getModelCode() %>" />
					<input type="text" hidden="true" id="countryCode<%=row%>" name="countryCode<%=row%>" value="<%=sCountryCode%>" />
					<input type="text" hidden="true" id="productionPlant<%=row%>" name="productionPlant<%=row%>" value="<%=Validator.isNull(veGroup.getProductionPlant()) ? "" : veGroup.getProductionPlant()%>" />
					<input type="text" hidden="true" id="addressofProductionPlant<%=row%>" name="addressofProductionPlant<%=row%>" value="<%=Validator.isNull(veGroup.getAddressOfProductionPlant()) ? "" : veGroup.getAddressOfProductionPlant()%>" />
					<input type="text" hidden="true" id="emissionStandard<%=row%>" name="emissionStandard<%=row%>" value="<%=Validator.isNull(veGroup.getEmissionStandard()) ? "" : veGroup.getEmissionStandard()%>" />
					<%	
						//danh sach vehicleRecord
						tempLstVeRecord = entry.getValue();
						int count = 1;
						for (VehicleRecord item : tempLstVeRecord) {
						VehiclerecordInitial initial = VehiclerecordInitialLocalServiceUtil.fetchVehiclerecordInitial(item.getId());				
						%>
							<input type="text" hidden="true" id="idVehicleRecordTblTTinNhomXeNk<%=row%><%=count%>" name="idVehicleRecordTblTTinNhomXeNk<%=row%>" value="<%=item.getId()%>" />
							<input type="text" hidden="true" id="soKhungTblTTinNhomXeNk<%=row%><%=count%>" name="soKhungTblTTinNhomXeNk<%=row%>" value="<%=initial.getChassisNumber()%>" />
							<input type="text" hidden="true" id="soDongCoTblTTinNhomXeNk<%=row%><%=count%>" name="soDongCoTblTTinNhomXeNk<%=row%>" value="<%=initial.getEngineNumber()%>" />
							<input type="text" hidden="true" id="tinhTrangTblTTinNhomXeNk<%=row%><%=count%>" name="tinhTrangTblTTinNhomXeNk<%=row%>" value="<%=CommonUtils.getTinhTrangTblThongTinNhomXeNk(initial.getVehicleEngineStatus())%>" />
							<input type="text" hidden="true" id="soThamChieuTblTTinNhomXeNk<%=row%><%=count%>" name="soThamChieuTblTTinNhomXeNk<%=row%>" value="<%=vehicleGroupInitial.getReferenceCertificateNo()%>" />
							<input type="text" hidden="true" id="namSanXuatTblTTinNhomXeNk<%=row%><%=count%>" name="namSanXuatTblTTinNhomXeNk<%=row%>" value="<%=initial.getProductionYear()%>" />
							<input type="text" hidden="true" id="mauSonTblTTinNhomXeNk<%=row%><%=count%>" name="mauSonTblTTinNhomXeNk<%=row%>" value="<%=initial.getVehicleColor()%>" />
					<%	} %>
				
					<td class="text-center"><span>Số PT ĐNKT: <%=tempLstVeRecord.size()%></span></td>
					<td class="text-center" hidden="true">
						<span><input type="radio" id="rdNhomXeNhapKhau<%=row%>" name="rdNhomXeNhapKhau" value="<%=row%>" onclick="businessDoiChieuHoSo('<%=row%>')"/>Xem chi tiết</span>
					</td>
				</tr>
			<%
					row++;
				}
			%>
		</table>
	</div>
</div>

<div style="height: 35px" id="theDem"></div>

<!------------------------- FORM XAC NHAN Đối chiếu hồ sơ Thong tin nhom xe nhap khau--------------------------->
<%
//test demo
PortletURL dkvDuocPhanCongChuaDoiChieu = renderResponse.createActionURL();
dkvDuocPhanCongChuaDoiChieu.setParameter(ActionRequest.ACTION_NAME, "dangKiemDuocPhanCongDaDoiChieu");

dkvDuocPhanCongChuaDoiChieu.setParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(idHoSoThuTuc));
dkvDuocPhanCongChuaDoiChieu.setParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(idPhieuXyLyPhu));
dkvDuocPhanCongChuaDoiChieu.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, StringUtil.valueOf(idthuTucHanhChinh));
dkvDuocPhanCongChuaDoiChieu.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);

PortletURL viewHoSoUrl5 = renderResponse.createRenderURL();
viewHoSoUrl5.setParameter("jspPage", "/portlet/report_export_themmoi.jsp");
viewHoSoUrl5.setParameter("confirmedInspectionId", String.valueOf(confirmedInspectionId));
viewHoSoUrl5.setParameter("lstVehicleGroupId", lstVehicleGroupIdReport);
viewHoSoUrl5.setParameter("type", "BienBanGhiNhanKetQuaKiemTra");

String urlBienBanGhiNhanKetQuaKiemTra = CollectionUtils.getStringUrlFileBienBanGhiNhanKetQuaKiemTra(request, userId, String.valueOf(confirmedInspectionId), lstVehicleGroupIdReport);

%>
<portlet:actionURL var="buocLapBienBanKiemTra" name="buocLapBienBanKiemTra">
	<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=StringUtil.valueOf(idHoSoThuTuc) %>"/>
	<portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=StringUtil.valueOf(idPhieuXyLyPhu) %>"/>
	<portlet:param name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=StringUtil.valueOf(idthuTucHanhChinh) %>"/>
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
	<portlet:param name="<%=Constants.ID_CONFIRMED_INSPECTION %>" value="<%=StringUtil.valueOf(confirmedInspectionId) %>"/>
</portlet:actionURL>
<div id="divBusinnessDoiChieuHoSo">
<aui:form action="<%=buocLapBienBanKiemTra.toString()%>" name="formLapBienBanKiemTra" id="formLapBienBanKiemTra" method="POST">
	<!-- test -->
	<input type="text" hidden="true" id="<%=Constants.ID_CONFIRMED_INSPECTION%>" name="<%=Constants.ID_CONFIRMED_INSPECTION%>" value="<%=confirmedInspectionId%>"/>
	<!-- dung js set o? dong 47 - 51 -->
	<input type="text" hidden="false" id="<%=Constants.ID_VEHICLE_GROUP%>" name="<%=Constants.ID_VEHICLE_GROUP%>" value=""/>
	<input type="text" hidden="false" id="danhSachVehicleRecord" name="danhSachVehicleRecord" value=""/>

	<!------------------ Danh sách PT ĐN KT ------------------>
	<div>
		<div style="width: 30px">&nbsp</div>
			<a onclick="reportNewPage('<%=urlBienBanGhiNhanKetQuaKiemTra%>')"><label>Biên bản ghi nhận kết quả kiểm tra</label></a>
		<div style="width: 30px">
			
		</div>
		
		<!-- title -->
		<div style="float: left; text-align: left; padding: 1% 1% 1% 0; width: 100%">
			<span style="font-size: 13px; font-weight: bold;">Danh sách PT ĐN KT :</span>
		</div>
		<div>
			<!-- vr-vehicleRecore -->
			<div style="float: left; text-align: left; width: 39%;">
				<span>Tổng số PT: </span><span id="tongSoPtDnKt">0</span>
				<div style="height: 35px" id="soXeDaChon"></div>
				<table style="width: 100%;" id="tblDanhSachVehicleRecord" border="1px">
					<thead>
					<tr>
						<td class="text-center"><span class="bold">STT</span></td>
						<td class="text-center"><input type="checkbox" id="checkAllTblDanhSachVehicleRecord" name="checkAllTblDanhSachVehicleRecord" onchange="onChangeCheckAllTblDanhSachVehicleRecord()"/>&nbsp<span class="bold">Nhóm</span></td>
						<td class="text-center"><span class="bold">Nhãn hiệu<br>Số loại</span></td>
						<td class="text-center"><span class="bold">Số khung<br>Số động cơ</span></td>
						<td class="text-center"><span class="bold">Tình trạng<br>Số tham chiếu</span></td>
					</tr>
					</thead>
					<tbody>
					</tbody>
					
				</table>
			</div>
			
			<%
			String urlDefault = request.getContextPath() + "/pdf.js/web/viewer.html?file=" + request.getContextPath() + "/export/"+ReportConstant.TEN_FILE_DEFAULT;
			%>
			<!-- START------------ Tab hien thi bao cao report -->
			<div style="float: left; text-align: left; width: 59%; padding: 1% 1% 1% 0; margin-left: 1%; margin-top: 1%;">
				<div class="reportContainer" style="width: 100%;">
					<ul class="reportTabs">
						<li class="tab-link current" data-tab="reportTab-1" onclick="reLoadTabpdf('liThongSoKiThuat')" id="liThongSoKiThuat">Thông số kỹ thuật</li>
						<li class="tab-link" data-tab="reportTab-2" onclick="reLoadTabpdf('liTaiLieuThuNghiem')" id="liTaiLieuThuNghiem">Tài liệu thử nghiệm</li>
						<li class="tab-link" data-tab="reportTab-3" onclick="reLoadTabpdf('liTaiLieuKhiThai')" id="liTaiLieuKhiThai">Tài liệu khí thải</li>
					</ul>
					<!-- START TAB_i -->
					<div id="reportTab-1" class="tab-content-report current">
						<div id="u6148" style="left: 0px; width: 100%; height: 0px; padding-left: 14px;">
							<img alt="" src="/DangKiemApp-portlet/img/under_line_image.png" class="" style="position:relative; left:-2.3%; top:-8px; width:102%; height: 5px;">
						</div>
						<div id="viewFileThongSoKiThuat">
							<embed src="<%=urlDefault%>" type='application/pdf' id='fileContentThongSoKiThuat' style='width:100%; height:400px;'>
						</div>
					</div>
					
					<div id="reportTab-2" class="tab-content-report">
						<div id="u6148" style="left: 0px; width: 100%; height: 0px; padding-left: 14px;">
							<img alt="" src="/DangKiemApp-portlet/img/under_line_image.png" class="" style="position: relative;left: -2.3%;top: -8px;width:102%; height:5px;">
						</div>
						<div id="viewFileTaiLieuThuNghiem">
							<embed src="<%=urlDefault%>" type='application/pdf' id='fileContentTaiLieuThuNghiem' style='width:100%; height:400px;'>
						</div>
					</div>
					
					<div id="reportTab-3" class="tab-content-report">
						<div id="u6148" style="left: 0px; width: 100%; height: 0px; padding-left: 14px;">
							<img alt="" src="/DangKiemApp-portlet/img/under_line_image.png" class="" style="position: relative; left:-2.3%;top: -8px;width: 102%;height: 5px;">
						</div>
						<div id="viewFileTaiLieuKhiThai">
							<embed src="<%=urlDefault%>" type='application/pdf' id='fileContentTaiLieuKhiThai' style='width:100%;height:400px;'>
						</div>
					</div>
					<!-- STOP TAB_i -->
				</div><!-- container -->
			</div>
			<!-- END------------ Tab hien thi bao cao report -->
		</div>
	</div>

	<div id="divButtonXacNhanDoiChieu">
		<div style="width: 15px">&nbsp</div>
		<aui:button-row>
			<button id="lapBienBanKiemTra" class="btnThuLyHS form-control" onclick="if(valBeforClickLapBienBanKiemTra()) businessLapBienBanKiemTra()" type="button" style="width: 200px; float: left;">Lập biên bản Kiểm Tra </button>
			<button type="button" onclick="eventHideOrShowDiv('divBusinnessDoiChieuHoSo', 'false', 'divThongTinNhomXeNhapKhau', 'true', 'divNoiDungKiemTra', 'true')" class="btnThuLyHS form-control" style="width: 200px;">Quay lại</button>
		</aui:button-row>
	</div>
</aui:form>
</div>
</div><!-- END - man hinh duoc phan cong -->

<div style="width: 30px">&nbsp</div>


<!-- -----LAP BIEN BAN KIEM TRA DUOC PHAN CONG DA DOI CHIEU 2 tab: Thong tin chung, Kiem tra chat luong an toan KTV BVMT----->
<%
PortletURL urlDuocPhanCongDangKiemVien = renderResponse.createActionURL();
urlDuocPhanCongDangKiemVien.setParameter(ActionRequest.ACTION_NAME, "duocPhanCongDangKiemVien");
urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(idHoSoThuTuc));
urlDuocPhanCongDangKiemVien.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID ,StringUtil.valueOf(idthuTucHanhChinh));
urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(idPhieuXyLyPhu));
urlDuocPhanCongDangKiemVien.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
urlDuocPhanCongDangKiemVien.setParameter(Constants.ID_CONFIRMED_INSPECTION, StringUtil.valueOf(confirmedInspectionId));

%>

<!-- the div show cho doi trong khi call ajax load data from db -->
<div id="waiting" class="waiting" hidden="true">
	<!--<img alt="" src="/DangKiemApp-portlet/img/loading.gif" class=""> -->
</div>

<!-- Call ajax load anh sach KiemTra Chat luong An toan Kiem tra Van ban VMT by VehicleGroupId -->
<portlet:resourceURL var="updaContentURL" ></portlet:resourceURL>

<style type="text/css">
	.textBound {
		width: 100%;
		text-align: center;
		height: 30px;
		background-color: white !important;
	}
	
	.textNone {
		border: none;
	}
	
	.black {
		color: black !important;
	}
	
	.white {
		color: white !important;
	}
</style>


<div id="div_WarningMsg" style="display: none;">
	<table width="100%">
		<tr>
			<td colspan="2" style="width: 100%;"><label class="egov-label">
				Thay đổi giá trị nhập</label> 
			</td>
		</tr>
		<tr>
			<td colspan="2" style="width: 100%;">
				<div id="valueGiaTriNhapStt"></div>
				<div id="listValueGiaTriNhap"></div>
			</td>
		</tr>		
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" class="egov-button-normal" value="Đồng ý" id="btnXacNhanThongSoKt"
					onclick="javascript: func_xacnhanPheDuyet();">
					<input type="button" class="egov-button-normal" value="Đồng ý1" id="btnXacNhanThongTinChung" style="display: none;"
					onclick="javascript: func_xacnhanPheDuyetTTChung();">
				&nbsp;&nbsp; 
				<input type="button" class="egov-button-normal" value="Hủy" onclick="javascript: func_huyPheDuyet();" >
			</td>
		</tr>
	</table>
</div>


<script type="text/javascript">

var resultCallAjaxFindVehicleSpecification = false;


var lstFileThongSoKiThuat = new Array();
var lstFileTaiLieuThuNghiem = new Array();
var lstFileTalLieuKhiThai = new Array();
var lstFileGroupId = new Array();
var path = '/DangKiemApp-portlet/export/';

function businessLapBienBanKiemTra() {
	document.getElementById('<portlet:namespace/>formLapBienBanKiemTra').submit();
	document.getElementById('lapBienBanKiemTra').disabled = true;
}

function callAjaxHienThiBaoCaoReport(vehicleGroupId, vehicleClass) {
	$.ajax({
		url: '<%=updaContentURL%>',
		dataType: "json",
		data: { 
			vehicleGroupId : vehicleGroupId,
			vehicleClass : vehicleClass,
			type : 'callAjaxHienThiBaoCaoReport'
		},
		
		type: "get",
		success : function (data) {
			console.log('callAjaxHienThiBaoCaoReport==(2)==neu thanh cong==success==');
			console.log(data);
			var obj = JSON.parse(JSON.stringify(data));
			console.log("==Ket qua thuc hien==" + obj.result);
			
			var fileNameThongSoKiThuat = obj.thongSoKiThuat;
			var fileNameTaiLieuThuNghiem = obj.taiLieuThuNghiem;
			var fileNameTalLieuKhiThai = obj.taiLieuKhiThai;

			lstFileThongSoKiThuat.push(fileNameThongSoKiThuat);
			lstFileGroupId.push(vehicleGroupId);

			
			loadDocument(path + fileNameThongSoKiThuat, 'viewFileThongSoKiThuat', 'fileContentThongSoKiThuat');
			loadDocument(path + fileNameTaiLieuThuNghiem, 'viewFileTaiLieuThuNghiem', 'fileContentTaiLieuThuNghiem');
			loadDocument(path + fileNameTalLieuKhiThai, 'viewFileTaiLieuKhiThai', 'fileContentTaiLieuKhiThai');
			
		}, beforeSend: function(data) {
			console.log("callAjaxHienThiBaoCaoReport==(1)==beforeSend==" + data);
			//$('#waiting').show();
			//$('body').addClass("loading");
			
			//$("#wait").css("display","block");
			//$(document.body).css("display","block");
		}, complete: function(data) {
			console.log("callAjaxHienThiBaoCaoReport==(3) finally===complete==" + data);
			//$("#wait").css("display","none");
			//$('#usersTable').empty();
			//$('#usersTable').html(allRows.trim());
		}, error: function(data) {
			console.log("callAjaxHienThiBaoCaoReport==(2) neu that bai==error==" + data);
			//$('#userContent').html('<span style="color:red">Connection problems</span>');
		}
	});
	return vehicleGroupId;
}

//de ve file js, ko an doan code: <portlet:namespace/>
function beforSummitForm(idForm, url) {
	console.log('=beforSummitForm=' + idForm);	
	var status = confirm("Bạn có muốn tiếp tục xử lý?");
	if (status) { 
		document.getElementById('<portlet:namespace/>' + idForm).action = url;
		document.getElementById('<portlet:namespace/>' + idForm).submit(); 
		document.getElementById('yeuCauSuaHoSoVaHoanKiemTra').disabled = true;
		document.getElementById('hoanKiemTra').disabled = true;
		document.getElementById('traLaiDoiTruongPhanCong').disabled = true;
	} else {
		document.getElementById('<portlet:namespace/>' + idForm).action = '';
		document.getElementById('yeuCauSuaHoSoVaHoanKiemTra').disabled = false;
		document.getElementById('hoanKiemTra').disabled = false;
		document.getElementById('traLaiDoiTruongPhanCong').disabled = false;
	}
}

function validatorHoanKiemTra() {
	var valid = false;
	document.getElementById('hoanKiemTra').disabled = true;
	$.ajax({
		async: false,
		cache: false,
		url : '<%=updaContentURL%>',
		method : 'POST',
		dataType: 'json',
		data : {
			<%= Constants.ID_CONFIRMED_INSPECTION %> : <%= confirmedInspectionId %>, 
			type: 'validateYeuCauBoSungAndHoanKiemTra'
		},
		success : function(response) {
			valid = response.valid;
			
			if(!valid) {
				var msg = "ERROR";
				if(response.message === 'CON_BIEN_BAN_LUU_TAM') {
					msg = "Còn biên bản lưu tạm !";
				} else if(response.message === 'CON_XE_CHUA_KIEM_TRA') {
					msg = "Hết xe chưa kiểm tra !";
				}
				
				alert(msg);
				document.getElementById('hoanKiemTra').disabled = false;
				return valid;
			}
		}
	});
	
	if(valid) {
		var lyDoHoanKiemTra = $('#lyDoHoanKiemTra').val();
		
		if (lyDoHoanKiemTra.trim().length == 0) {
			alert("Đề nghị nhập lý do Hoãn kiểm tra !");
			document.getElementById('hoanKiemTra').disabled = false;
			valid = false;
			return valid;
		}
	}
	
	return valid;
}


function validatorTraLaiDoiTuongPhanCong() {
	var valid = false;
	document.getElementById('traLaiDoiTruongPhanCong').disabled = true;
	$.ajax({
		async: false,
		cache: false,
		url : '<%=updaContentURL%>',
		method : 'POST',
		dataType: 'json',
		data : {
			<%= Constants.ID_CONFIRMED_INSPECTION %> : <%= confirmedInspectionId %>, 
			type: 'validateYeuCauBoSungAndHoanKiemTra'
		},
		success : function(response) {
			valid = response.valid;
			
			if(!valid) {
				var msg = "ERROR";
				if(response.message === 'CON_BIEN_BAN_LUU_TAM') {
					msg = "Còn biên bản lưu tạm, không được trả lại !";
				} else if(response.message === 'CON_XE_CHUA_KIEM_TRA') {
					msg = "Hết xe chưa kiểm tra, không được trả lại !";
				}
				
				alert(msg);
				document.getElementById('traLaiDoiTruongPhanCong').disabled = false;
				return valid;
			}
		}
	});
	
	if(valid) {
		var lyDoTraLai = $('#lyDoTraLai').val();
		
		if (lyDoTraLai.trim().length == 0) {
			alert("Đề nghị nhập lý do trả lại !");
			document.getElementById('traLaiDoiTruongPhanCong').disabled = false;
			valid = false;
			return valid;
		}
	}
	
	return valid;
}

function showThongBaoMsg() {
	console.log("==showThongBaoMsg ==");
	$("#div_WarningMsg").dialog({
		title:'Xác nhận thay đổi',
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
function func_huyPheDuyet() {
	 $('#div_WarningMsg').dialog('close');;
}

var giaTriTraVe="";
var isThuocDmDataItem="0";

function suaGiaTriNhap(specificationcode,giaTriDangKi,stt) {
	
	$.ajax({
		type : 'POST',
		async: false,//bat dong bo = fale, dong bo voi client
		cache: false,
		url : '<%=updaContentURL%>',
		data : {
			specificationcode : specificationcode, type: 'hienThiGiaTriThayDoiDKV',
			giaTriDangKi : giaTriDangKi, stt : stt
		},
		success : function(data) {
			// preferred
			console.log("===data=="+data);
			
			if (data!='{}' ){
				var data2 = JSON.parse(data);
				console.log("===data2=="+data2);
				isThuocDmDataItem="1";
				giaTriTraVe = "<select id=\"giaTriNhapSuaDoi" + stt + "\" name=\"giaTriNhapSuaDoi" + stt + "\" class=\"form-control-find width100\">";
				for ( var i = 0; i < data2.codedataitem.length; i++) {
					 console.log("******suaGiaTriNhap ==code dataitem====="+data2.codedataitem[i]);
					 console.log("******suaGiaTriNhap ==name dataitem====="+data2.namedataitem[i]);
					 var isSelected="";
					 if (data2.codedataitem[i]==giaTriDangKi){
						 isSelected = " selected=\"selected\" ";
					}
					 
					 giaTriTraVe=giaTriTraVe+"<option value=\""+data2.codedataitem[i]+"\"  "+isSelected+"  >"+data2.namedataitem[i]+"</option>";
				}
				giaTriTraVe=giaTriTraVe+"</select>";
			} else {
				isThuocDmDataItem="0";
				giaTriTraVe="<input type='text' id='giaTriNhapSuaDoi" + stt + "' name='giaTriNhapSuaDoi' value='" + giaTriDangKi +"' /> ";
			}
		}
	});
	
	console.log("===giaTriTraVe=="+giaTriTraVe);

	if (giaTriTraVe!=''){
		document.getElementById("valueGiaTriNhapStt").innerHTML = "<input type='hidden' id='giaTriNhapStt' name='giaTriNhapStt' value='"+stt+"' /> ";
		
		document.getElementById("listValueGiaTriNhap").innerHTML = giaTriTraVe;
		showThongBaoMsg();
	}

}

function func_xacnhanPheDuyet() {
	func_huyPheDuyet();
	var stt=document.getElementById('giaTriNhapStt').value; 

	if (isThuocDmDataItem=="0"){
		var giaTriView=document.getElementById('giaTriNhapSuaDoi'+stt).value;
		document.getElementById('giaTriKiemTra_'+stt).value=giaTriView;
		document.getElementById('giaTriKiemTra'+stt).value=giaTriView;
	}else if (isThuocDmDataItem=="1"){
		var giaTriId=document.getElementById('giaTriNhapSuaDoi'+stt).value;
		var giaTriView=$('#giaTriNhapSuaDoi' + stt + ' option[value="'+giaTriId+'"]').text();

		document.getElementById('giaTriKiemTra_'+stt).value=giaTriView;
		document.getElementById('giaTriKiemTra'+stt).value=giaTriId;
	}	

}

function func_xacnhanPheDuyetTTChung() {
	func_huyPheDuyet();
	var stt=document.getElementById('giaTriNhapTTChungStt').value; 

	if (isThuocDmDataItem=="0"){
		var giaTriView=document.getElementById('giaTriNhapSuaDoiTTChung'+stt).value;
		document.getElementById('giaTriKiemTraTTChung_'+stt).value=giaTriView;
		document.getElementById('giaTriKiemTraTTChung'+stt).value=giaTriView;
	}else if (isThuocDmDataItem=="1"){
		var giaTriId=document.getElementById('giaTriNhapSuaDoiTTChung'+stt).value;
		var giaTriView=$('#giaTriNhapSuaDoiTTChung' + stt + ' option[value="'+giaTriId+'"]').text();

		document.getElementById('giaTriKiemTraTTChung_'+stt).value=giaTriView;
		document.getElementById('giaTriKiemTraTTChung'+stt).value=giaTriId;
	}	

}

function validatorYeuCauBoSung() {
	var valid = false;
	document.getElementById('yeuCauSuaHoSoVaHoanKiemTra').disabled = true;
	$.ajax({
		async: false,
		cache: false,
		url : '<%=updaContentURL%>',
		method : 'POST',
		dataType: 'json',
		data : {
			<%= Constants.ID_CONFIRMED_INSPECTION %> : <%= confirmedInspectionId %>, 
			type: 'validateYeuCauBoSungAndHoanKiemTra'
		},
		success : function(response) {
			valid = response.valid;
			
			if(!valid) {
				var msg = "ERROR";
				if(response.message === 'CON_BIEN_BAN_LUU_TAM') {
					msg = "Còn biên bản lưu tạm !";
				} else if(response.message === 'CON_XE_CHUA_KIEM_TRA') {
					msg = "Hết xe chưa kiểm tra !";
				}				
				alert(msg);
				document.getElementById('yeuCauSuaHoSoVaHoanKiemTra').disabled = false;
				return valid;
			}
		}
	});
	
	if(valid) {
		var yeuCauBoSung = $('#yeuCauBoSung').val();
		
		if (yeuCauBoSung.trim().length == 0) {			
			alert("Đề nghị nhập lý do Yêu cầu bổ sung hồ sơ!");
			document.getElementById('yeuCauSuaHoSoVaHoanKiemTra').disabled = false;
			valid = false;
			return valid;
		}
	}
	
	return valid;
}

function reportNewPage(urlFile) {
	window.open(urlFile);
};

</script>
