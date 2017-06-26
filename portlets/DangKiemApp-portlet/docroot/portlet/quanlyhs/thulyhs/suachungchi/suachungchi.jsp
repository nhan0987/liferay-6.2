<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.CustomsDeclarationImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordImpl"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="java.util.UUID"%>
<%@page import="vn.dtt.gt.dk.utils.CollectionUtils"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@page import="vn.dtt.gt.dk.report.ReportUtils"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.report.ReportConstant"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants" %>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/portlet/init.jsp"%>
<% long javaScriptLastModified = ServletContextUtil.getLastModified(application, "/js/", true); %>
<script type="text/javascript" src='<%= PortalUtil.getStaticResourceURL(request, request.getContextPath() + "/js/suachungchi.js", javaScriptLastModified) %>'></script>


<style type="text/css">
	.textBound {width: 100%;text-align: center;height: 30px;background-color: white !important;}
	.textNone {border: none;}
	.black {color: black !important;}
	.white {color: white !important;}
</style>

<%
long phieuXuLyPhu = ParamUtil.getLong(request, Constants.ID_PHIEU_XU_LY_PHU);
long hoSoThuTucId = ParamUtil.getLong(request, Constants.ID_HO_SO_THU_TUC);
long idCertificateRecord = ParamUtil.getLong(request, Constants.CERTIFICATE_RECORD_ID);
long canBoXuLy = ParamUtil.getLong(request, Constants.CAN_BO_SU_LY);
String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);

System.out.println("=========phieuXuLyPhu======="+phieuXuLyPhu);
System.out.println("=========hoSoThuTucId======="+hoSoThuTucId);
System.out.println("=========idCertificateRecord======="+idCertificateRecord);
System.out.println("=========canBoXuLy======="+canBoXuLy);

CertificateRecord certificateRecord = null;
List<VehicleRecord> lstVehicleRecords = null;
VehicleRecord vehicleRecord = null;
VehicleGroup vehicleGroup = null;
List<ProductionCountry> lstProductionCountries = null;
CustomsDeclaration customsDeclaration = null;
InspectionRecord inspectionRecord = null;
RegisteredInspection registeredInspection = null;

String nuocSanXuatValue = "";
String nuocSanXuatCode = "";
String loaiPhuongTienValue = "";
String nhanHieuValue = "";

	try{
		certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(idCertificateRecord);
		if(certificateRecord == null){
			certificateRecord = new CertificateRecordImpl();
		}
		
		lstVehicleRecords = VehicleRecordLocalServiceUtil.findByCertificateRecordId(idCertificateRecord);
		
		inspectionRecord = InspectionRecordLocalServiceUtil.fetchInspectionRecord(certificateRecord.getInspectionReportId());
		if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0) ){
			customsDeclaration = CustomsDeclarationLocalServiceUtil.getCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
		} else	{
			customsDeclaration = CustomsDeclarationLocalServiceUtil.findByHoSoThuTucId(hoSoThuTucId);
		}
		
		if(lstVehicleRecords != null && lstVehicleRecords.size() >0){
			vehicleRecord = lstVehicleRecords.get(0);
			vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord.getVehicleGroupId());
			lstProductionCountries = ProductionCountryLocalServiceUtil.findByVehicleGroupId(vehicleGroup.getId());
		}
		registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(hoSoThuTucId);
		
		if(customsDeclaration == null){
			customsDeclaration = new CustomsDeclarationImpl();
		}
		if(inspectionRecord == null){
			inspectionRecord = new InspectionRecordImpl();
		}
		if(vehicleRecord == null){
			vehicleRecord = new VehicleRecordImpl();
		}
		if(vehicleGroup == null){
			vehicleGroup = new VehicleGroupImpl();
		}
		
		
		if(lstProductionCountries != null && lstProductionCountries.size() >0){
			nuocSanXuatValue = CollectionUtils.listProductionCountryToString(lstProductionCountries);
			nuocSanXuatValue = nuocSanXuatValue + ",";
			
			for (ProductionCountry item : lstProductionCountries) {
				nuocSanXuatCode = nuocSanXuatCode + item.getCountryCode() + ",";
			}
		}
		
		
		DmDataItem dmLoaiPhuongTien = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.VEHICLE_TYPE, vehicleGroup.getVehicleType());
		if(dmLoaiPhuongTien != null){
			loaiPhuongTienValue = dmLoaiPhuongTien.getName();
		}
		
		
		DmDataItem dmNhanHieu = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.TRADE_MARK, vehicleGroup.getTradeMark());
		if(dmNhanHieu != null){
			nhanHieuValue = dmNhanHieu.getName();
		}
	} catch(Exception e){
		//e.printStackTrace();
	}
%>
s
	<%
	PortletURL urlSuaChungChi = renderResponse.createActionURL();
	urlSuaChungChi.setParameter(ActionRequest.ACTION_NAME, "suaChungChi");
	urlSuaChungChi.setParameter("formDate", UUID.randomUUID().toString());
	urlSuaChungChi.setParameter(Constants.ID_HO_SO_THU_TUC, StringUtil.valueOf(hoSoThuTucId));
	urlSuaChungChi.setParameter(Constants.ID_PHIEU_XU_LY_PHU, StringUtil.valueOf(phieuXuLyPhu));
	urlSuaChungChi.setParameter(Constants.CERTIFICATE_RECORD_ID ,StringUtil.valueOf(idCertificateRecord));
	
	//Ghi actionlog
	String noidungthaotac = "Mở xem nội dung Sửa chứng chỉ thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + hoSoThuTucId;
	String tenmanhinhdaidien = "Sửa chứng chỉ";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(hoSoThuTucId, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
	
	%>
<aui:form action="<%=urlSuaChungChi.toString()%>" name="formSuaChungchi" id="formSuaChungchi" method="POST">
	<input type="hidden" name="<%=Constants.CAN_BO_SU_LY%>" id="<%=Constants.CAN_BO_SU_LY%>" value="<%=String.valueOf(canBoXuLy)%>"/>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
	
	<!-- ------------------------TITLE-------------------- -->
	<%
	if (vehicleGroup != null && vehicleGroup.getVehicleClass().equalsIgnoreCase("XMY")) {
		%>
		<div style="width: 75%;text-align: center;padding: 1% 1% 1% 0;width: 100%;font-weight: bold;font-size: 15px;">
			GIẤY CHỨNG NHẬN CHẤT LƯỢNG AN TOÀN KỸ THUẬT VÀ BẢO VỆ MÔI TRƯỜNG XE MÔ TÔ, XE GẮN MÁY NHẬP KHẨU
		</div>
		<%
	} else if(vehicleGroup != null && vehicleGroup.getVehicleClass().equalsIgnoreCase("DCX")) {
		%>
		<div style="width: 75%;text-align: center;padding: 1% 1% 1% 0;width: 100%;font-weight: bold;font-size: 15px;">
			GIẤY CHỨNG NHẬN CHẤT LƯỢNG ĐỘNG CƠ XE MÔ TÔ, XE GẮN MÁY NHẬP KHẨU
		</div>
		<%
	} else if(vehicleGroup != null && vehicleGroup.getVehicleClass().equalsIgnoreCase("XDD")) {
		%>
		<div style="width: 75%;text-align: center;padding: 1% 1% 1% 0;width: 100%;font-weight: bold;font-size: 15px;">
			GIẤY CHỨNG NHẬN CHẤT LƯỢNG XE ĐẠP ĐIỆN NHẬP KHẨU
		</div>
		<%
	} else if(vehicleGroup != null && vehicleGroup.getVehicleClass().equalsIgnoreCase("XCG")) {
		%>
		<div style="width: 75%;text-align: center;padding: 1% 1% 1% 0;width: 100%;font-weight: bold;font-size: 15px;">
			GIẤY CHỨNG NHẬN CHẤT LƯỢNG AN TOÀN KỸ THUẬT VÀ BẢO VỆ MÔI TRƯỜNG XE CƠ GIỚI NHẬP KHẨU
		</div>
		<%
	} else if(vehicleGroup != null && vehicleGroup.getVehicleClass().equalsIgnoreCase("XCD")) {
		%>
		<div style="width: 75%;text-align: center;padding: 1% 1% 1% 0;width: 100%;font-weight: bold;font-size: 15px;">
			GIẤY CHỨNG NHẬN CHẤT LƯỢNG AN TOÀN KỸ THUẬT VÀ BẢO VỆ MÔI TRƯỜNG XE MÁY CHUYÊN DÙNG NHẬP KHẨU
		</div>
		<%
	} else if(vehicleGroup != null && vehicleGroup.getVehicleClass().equalsIgnoreCase("XBB")) {
		%>
		<div style="width: 75%;text-align: center;padding: 1% 1% 1% 0;width: 100%;font-weight: bold;font-size: 15px;">
			GIẤY CHỨNG NHẬN CHẤT LƯỢNG AN TOÀN KỸ THUẬT VÀ BẢO VỆ MÔI TRƯỜNG XE CHỞ NGƯỜI BỐN BÁNH CÓ GẮN ĐỘNG CƠ NHẬP KHẨU
		</div>
		<%
	}
	%>
	<!-- ----------------end--------TITLE-------------------- -->
	
	
	<div style="float: left;text-align: center;padding: 1% 1% 1% 0;width: 100%;font-size: 14px;">
			Số (No): <%=Validator.isNotNull(certificateRecord) ? certificateRecord.getCertificateNumber() : "" %>
	</div>
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<div class="CollapsiblePanelContent" style="display: block;">
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Người nhập khẩu</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<label name="thongTinKhaiBaoNguoiNhapKhau" id="thongTinKhaiBaoNguoiNhapKhau" class="textlabel"><%=Validator.isNotNull(registeredInspection) ? registeredInspection.getImporterName() : StringPool.BLANK%></label>
					<input type="text" style="display: none;" name="tenNguoiNhapKhau" id="tenNguoiNhapKhau" value="<%=Validator.isNotNull(registeredInspection) ? registeredInspection.getImporterName() : StringPool.BLANK%>" placeholder="Bổ sung sửa đổi thông tin người nhập khẩu" class="form-control-find" />
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<input name="xem" type="radio" id="btnKhaiBaoTT" size="20"
							value="1" checked="checked" onclick="changeXacNhan()"/> &nbsp; DN khai báo ban đầu
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input name="xem" type="radio" id="btnSuaDoiTT" size="20"
							value="0" onclick="changeXacNhan()"/> &nbsp; ĐK sửa tên người nhập khẩu, địa chỉ
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Địa chỉ</label>
				</div>
				<div class="col-xs-9 col-sm-9 col-md-9" >
					<label name="thongTinKhaiBaoDiaChi" id="thongTinKhaiBaoDiaChi" class="textlabel"><%=Validator.isNotNull(registeredInspection) ? registeredInspection.getImporterAddress() : StringPool.BLANK%></label>
					<input type="text" style="display: none;" name="diaChiNguoiNhapKhau" id="diaChiNguoiNhapKhau" value="<%=Validator.isNotNull(registeredInspection) ? registeredInspection.getImporterAddress() : StringPool.BLANK%>" placeholder="Bổ sung sửa đổi thông tin địa chỉ" class="form-control-find" />
				</div>
				
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Số báo cáo TN an toàn</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" name="SoBCTNAnToan" id="SoBCTNAnToan" value="<%=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getSafetytestreportNo() : StringPool.BLANK%>" placeholder="Nhập số báo cáo thử nghiệm an toàn" class="form-control-find" />					
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Số báo cáo TN khí thải</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" name="SoBCTNKhiThai" id="SoBCTNKhiThai" value="<%=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getEmissiontestreportNo() : StringPool.BLANK%>" placeholder="Nhập số báo cáo thử nghiệm khí thải" class="form-control-find" />
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Số báo cáo COP</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" name="SoBCCOP" id="SoBCCOP" value="<%=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getCopreportNo() : StringPool.BLANK%>" placeholder="Nhập số báo cáo COP" class="form-control-find" />					
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Loại phương tiện</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" name="loaiPhuongTienValue" id="loaiPhuongTienValue" value="<%=loaiPhuongTienValue%>" placeholder="Nhập loại phương tiện" class="form-control-find" onclick="suaChungChiNotThongSo('<%=ReportConstant.VEHICLE_TYPE %>','<%=vehicleGroup.getVehicleType()%>')" readonly="readonly" />
					<input type="hidden" name="loaiPhuongTienCode" id="loaiPhuongTienCode" value="<%=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getVehicleType() : StringPool.BLANK%>" placeholder="Nhập loại phương tiện" class="form-control-find" />
				</div>
			</div>
		<script language="JavaScript" type="text/javascript">
		function changeXacNhan(){
			if (document.getElementById('btnKhaiBaoTT').checked) {
				document.getElementById('tenNguoiNhapKhau').style.display = "none";
				document.getElementById('diaChiNguoiNhapKhau').style.display = "none";
				document.getElementById('thongTinKhaiBaoNguoiNhapKhau').style.display = "";
				document.getElementById('thongTinKhaiBaoDiaChi').style.display = "";
			}else{
				document.getElementById('tenNguoiNhapKhau').style.display = "";
				document.getElementById('diaChiNguoiNhapKhau').style.display = "";
				document.getElementById('thongTinKhaiBaoNguoiNhapKhau').style.display = "none";
				document.getElementById('thongTinKhaiBaoDiaChi').style.display = "none";
			}	
			
		}
		</script>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Nhãn hiệu</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" placeholder="Nhập nhãn hiệu" class="form-control-find" name="nhanHieuValue" id="nhanHieuValue" value="<%=nhanHieuValue%>" onclick="suaChungChiNotThongSo('<%=ReportConstant.TRADE_MARK %>','<%=vehicleGroup.getTradeMark()%>')" readonly="readonly" />
							<input type="hidden" placeholder="Nhập nhãn hiệu" class="form-control-find" name="nhanHieuCode" id="nhanHieuCode" value="<%=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getTradeMark() : StringPool.BLANK%>" />
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Tên thương mại</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" name="tenThuongMai" id="tenThuongMai" value="<%=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getCommercialName() : StringPool.BLANK%>" placeholder="Nhập tên thương mại" class="form-control-find" />
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Mã kiểu loại</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" placeholder="Nhập mã kiểu loại" class="form-control-find" name="maKieuLoai" id="maKieuLoai" value="<%=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getModelCode() : StringPool.BLANK%>" />
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Màu sơn</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" name="mauSon" id="mauSon" value="<%=Validator.isNotNull(vehicleRecord) ? vehicleRecord.getVehicleColor() : StringPool.BLANK%>" placeholder="Nhập màu sơn" class="form-control-find">
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Số khung</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" placeholder="Nhập số khung" class="form-control-find" name="soKhung" id="soKhung" value="<%=Validator.isNotNull(vehicleRecord) ? vehicleRecord.getChassisNumber() : StringPool.BLANK%>" />
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Số động cơ</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" name="soDongCo" id="soDongCo" value="<%=Validator.isNotNull(vehicleRecord) ? vehicleRecord.getEngineNumber() : StringPool.BLANK%>" placeholder="Nhập số động cơ" class="form-control-find">
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Năm sản xuất</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" placeholder="Nhập năm sản xuất" class="form-control-find" name="namSanXuat" id="namSanXuat" value="<%=Validator.isNotNull(vehicleRecord) ? vehicleRecord.getProductionYear() : StringPool.BLANK%>" />
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Nước sản xuất</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" name="nuocSanXuatValue" id="nuocSanXuatValue" value="<%=nuocSanXuatValue%>" placeholder="Nhập nước sản xuât" class="form-control-find" onclick="suaChungChiNotThongSo('<%=ReportConstant.STATE %>','<%=nuocSanXuatCode %>')" readonly="readonly">
							<input type="hidden" name="nuocSanXuatCode" id="nuocSanXuatCode" value="<%=nuocSanXuatCode%>" placeholder="Nhập nước sản xuât" class="form-control-find">
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Tiêu chuẩn khí thải</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" name="TieuChuanKhiThai" id="TieuChuanKhiThai" value="<%=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getEmissionStandard() : StringPool.BLANK%>" placeholder="Nhập tiêu chuẩn khí thải" class="form-control-find" />					
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Số kết luận giám định</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<input type="text" name="SoKetLuanGiamDinh" id="SoKetLuanGiamDinh" value="<%=Validator.isNotNull(vehicleGroup) ? vehicleGroup.getControlreportNo() : StringPool.BLANK%>" placeholder="Nhập số kết luận giám định" class="form-control-find" />
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Ngày tờ khai hàng hóa</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<%
							String ngayToKhai = "";
							String ngayKhaiBao = "";
							if (customsDeclaration != null && customsDeclaration.getImportCustomDeclareDate() != null) {
								ngayToKhai = customsDeclaration.getImportCustomDeclareDate().after(new Date()) ? DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) : DateUtils.dateToString("dd/MM/yyyy HH:mm", customsDeclaration.getImportCustomDeclareDate());
								ngayKhaiBao = vn.dtt.gt.dk.utils.format.FormatData.parseDateToTringType3(customsDeclaration.getImportCustomDeclareDate());
							} 
							%>
							<!-- <label class="textlabel"><%=ngayToKhai%></label>  -->
							<input type="hidden" name="ngayKhaiBaoToKhaiHaiQuan" id="ngayKhaiBaoToKhaiHaiQuan" value="<%=ngayToKhai%>" placeholder="Nhập số tờ khai hải quan" class="form-control-find">
							<input type="text" style="width: 150px; float: left; background-color: white; cursor: pointer;" class="form-control-find-calendar" readonly="readonly"
								id="ngayToKhaiHaiQuan" name="ngayToKhaiHaiQuan" value="<%=ngayKhaiBao%>" onclick="gtCalendar('ngayToKhaiHaiQuan')" />
							<span class="input-group-btn" style="float: left;">
								<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayToKhaiHaiQuan')"><i class="fa fa-calendar"></i></button>
							</span>
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Số tờ khai hàng hóa</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">					
					<input type="text" placeholder="Nhập số tờ khai hải quan" class="form-control-find" name="soToKhaiHaiQuan" id="soToKhaiHaiQuan" value="<%=Validator.isNotNull(customsDeclaration) ? customsDeclaration.getImportCustomDeclareNo() : StringPool.BLANK%>" title="Nhập số tờ khai hải quan hoặc Xóa để bỏ qua thông tin."/>
					<input type="hidden" name="soKhaiBaoToKhaiHaiQuan" id="soKhaiBaoToKhaiHaiQuan" value="<%=Validator.isNotNull(customsDeclaration) ? customsDeclaration.getImportCustomDeclareNo() : StringPool.BLANK%>" placeholder="Nhập số tờ khai hải quan" class="form-control-find">
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Thời gian kiểm tra</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<%
							String InspectionRecordDate = vn.dtt.gt.dk.utils.format.FormatData.parseDateToTringType3(inspectionRecord.getInspectionRecordDate());
							String thoiGianKiemTra = "";							
							if (inspectionRecord != null && inspectionRecord.getInspectionRecordDate() != null) {
								thoiGianKiemTra = inspectionRecord.getInspectionRecordDate().after(new Date()) ? DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) : DateUtils.dateToString("dd/MM/yyyy HH:mm", inspectionRecord.getInspectionRecordDate());								
							}
							%>
							<!-- <label class="textlabel"><%=thoiGianKiemTra%></label>  -->
							<input type="text" style="width: 150px; float: left; background-color: white; cursor: pointer;" class="form-control-find-calendar" readonly="readonly"
								id="InspectionRecordDate" name="InspectionRecordDate" value="<%=InspectionRecordDate%>" onclick="gtCalendar('InspectionRecordDate')" />
							<span class="input-group-btn" style="float: left;">
								<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('InspectionRecordDate')"><i class="fa fa-calendar"></i></button>
							</span>							
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Địa điểm kiểm tra</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<label class="textlabel"><%=Validator.isNotNull(inspectionRecord) ? inspectionRecord.getInspectionSite() : StringPool.BLANK %></label>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Số đăng ký kiểm tra</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
					<label class="textlabel"><%=Validator.isNotNull(registeredInspection) ? registeredInspection.getRegisteredNumber() : StringPool.BLANK %></label>
				</div>
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Tình trạng phương tiện</label>
				</div>
				<div class="col-xs-3 col-sm-3 col-md-3" style="width: 30%;">
				<%
				List<DmDataItem> lstTinhTrangPhuongTien = DmDataItemLocalServiceUtil.findByDataGroupId(41);
				%>
					<select name="tinhTrangPhuongTien" id="tinhTrangPhuongTien" size="1" class="form-control-find">
						<option style="width: 100%" selected value=""><liferay-ui:message key="vn.gt.dk.qlhs.luachon" /></option>
						<%for (DmDataItem tinhTrangPhuongTien : lstTinhTrangPhuongTien) {
						%>
						<option <%=tinhTrangPhuongTien.getCode0().equals(vehicleRecord.getVehicleEngineStatus()) ? "selected" : ""%> value="<%=tinhTrangPhuongTien.getCode0()%>"><%=tinhTrangPhuongTien.getName()%></option>
						<%}%>
					</select>
				</div>
			</div>
		</div>
	</div>
	<div style="float: left;text-align: center;padding: 1% 1% 1% 0;width: 100%;font-size: 14px;">			
		<div style="width: 20px"></div>
		<div>Ghi chú in vào giấy chứng chỉ <span style="color: red;" id="spanGhiChuInVaoGcc"></span></div>
		<div style="width: 10px"></div>
		<textarea class="textAreaAutosize" id="ghiChuInVaoGiayChungChi" name="ghiChuInVaoGiayChungChi" style="width: 79.5%" placeholder=""><%=Validator.isNotNull(certificateRecord) ? certificateRecord.getRemarks() : ""%></textarea>
		<div style="width: 10px"></div>
	</div>
	<div style="float: left;text-align: center;padding: 1% 1% 1% 0;width: 100%;font-size: 14px; font-weight: bold;">
			THÔNG SỐ KỸ THUẬT CƠ BẢN
	</div>
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1" style="border-bottom: none;">
		<table style="width: 100%;" id="tblThongTinChungRegisteredInspection" class="wd-table table">
				<thead>
					<tr>
						<th class="text-center bold thTblThongTinChung" style="width: 6%;">TT</th>
						<th class="text-center bold thTblThongTinChung" style="width: 22%;">Thông tin</th>
						<th class="text-center bold thTblThongTinChung" style="width: 28%;">Giá trị</th>
						<th class="text-center bold thTblThongTinChung" style="width: 10%;">Thao tác</th>
					</tr>
				</thead>
				<tbody>
	<%
	List<CertificateRecordSpec> lstCertificateRecordSpecs = CertificateRecordSpecLocalServiceUtil.findByIdCertificateRecordAndVehicleTypeCode(idCertificateRecord, vehicleGroup.getVehicleClass(), vehicleGroup.getVehicleType());
	System.out.println("lstCertificateRecordSpecs "+ lstCertificateRecordSpecs.size());
	if(lstCertificateRecordSpecs != null && lstCertificateRecordSpecs.size() >0){
		int stt = 0;
		for(CertificateRecordSpec certificateRecordSpec :lstCertificateRecordSpecs){
			stt++;
			String giaTriHienthi = ReportUtils.getNameForVehicleSpecification(certificateRecordSpec.getSpecificationValue(), certificateRecordSpec.getSpecificationCode(), vehicleGroup.getVehicleClass());
	%>
				<tr id="trTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=certificateRecordSpec.getSpecificationCode()%>">
					<td class="text-center"><span class="black" id="sHangMucTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=certificateRecordSpec.getSpecificationCode()%>"><%=stt %></span></td>
					<td class="text-left paddingLeft05"><span id="sThongTinTblKiemTraDoiChieuKetCauVaThongSoKtXe<%=certificateRecordSpec.getSpecificationCode()%>"><%=certificateRecordSpec.getSpecificationName() %></span></td>
					
					<!-- Gia tri dang ki -->
					<td class="text-center">
						<input type="hidden" class="textNone textBound" readonly="readonly"
								id="giaTriDangKi_<%=certificateRecordSpec.getSpecificationCode()%>" name="giaTriDangKiKetCauVaThongSoKtXe<%=certificateRecordSpec.getSpecificationCode()%>" value="<%=giaTriHienthi%>" />
								
						<input type="hidden" id="specificationname<%=certificateRecordSpec.getSpecificationCode()%>" name="specificationname" value="<%=certificateRecordSpec.getSpecificationName() %>" />
						<input type="hidden" id="specificationcode<%=certificateRecordSpec.getSpecificationCode()%>" name="specificationcode" value="<%=certificateRecordSpec.getSpecificationCode() %>" />
						<input type="hidden" id="giaTriDangKi<%=certificateRecordSpec.getSpecificationCode()%>" name="giaTriDangKiKtXe" value="<%=certificateRecordSpec.getSpecificationValue() %>"/>		
					
					<!-- Gia tri kiem tra -->	
						<input type="text" class="textNone textBound" readonly="readonly"
								id="giaTriKiemTra_<%=certificateRecordSpec.getSpecificationCode()%>" name="giaTriSuaDoiKetCauVaThongSoKtXe_<%=certificateRecordSpec.getSpecificationCode()%>" value="<%=giaTriHienthi%>"/>
								
						<input type="hidden" id="giaTriKiemTra<%=certificateRecordSpec.getSpecificationCode()%>" name="giaTriSuaDoiKetCauVaThongSoKtXe<%=certificateRecordSpec.getSpecificationCode()%>" value="<%=certificateRecordSpec.getSpecificationValue()%>"/>
							
					</td>
					<td class="text-center">
						<select id="selLuaChonKetQua<%=certificateRecordSpec.getSpecificationCode()%>" name="selLuaChonDangKiKetCauVaThongSoKtXe<%=certificateRecordSpec.getSpecificationCode()%>" class="form-control-find selectLuaChonKetQua" style="height: 30px" onclick="checkSelLuaChonThongSoKtXe('<%=certificateRecordSpec.getSpecificationCode()%>')">
								<option value="1">Không sửa đổi</option>
								<option value="2">Sửa đổi</option>
						</select>
					</td>
				</tr>
	<%
		}
	}
	%>
				</tbody>
			</table>
		</div>
			<aui:button-row cssClass="width100">
				<button type="button" id="buttonSuaChungChi" onclick="if(validatorLanhDaoSuaChungChi()) beforSummitForm('formSuaChungchi','<%=urlSuaChungChi.toString()%>')" class="btnThuLyHS form-control" style="width: 200px;float: left;">Lưu nội dung</button>
				<button type="button" id="buttonQuayLai" class="btnThuLyHS form-control" style="width: 200px;" onclick="javascript: window.location = '<%=returnURL%>'">Quay lại</button>
			</aui:button-row>
	</div>
</div>
</aui:form>

<portlet:resourceURL var="updaContentURL" ></portlet:resourceURL>

<style type="text/css">
	.textBound {width: 100%;text-align: center;height: 30px;background-color: white !important;}
	.textNone {border: none;}
	.black {color: black !important;}
	.white {color: white !important;}
</style>

<div id="div_WarningMsg" style="display: none;">
	<table width="100%">
		<tr>
			<td colspan="2" style="width: 100%;"><label class="egov-label">Thay đổi giá trị nhập</label>
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
				<input type="button" class="egov-button-normal" value="Đồng ý" id="btnXacNhanThongSoKt" onclick="javascript: func_xacnhanPheDuyet();">
				&nbsp;&nbsp; 
				<input type="button" class="egov-button-normal" value="Hủy" onclick="javascript: func_huyPheDuyet();" >
			</td>
		</tr>
	</table>
</div>

<!-- Dialog sua nuoc san xuat -->
<div id="div_WarningMsgNotThongSo" style="display: none;">
	<table width="100%">
		<tr>
			<td colspan="2" style="width: 100%;"><label class="egov-label">
				Thay đổi giá trị nhập</label> 
			</td>
		</tr>
		<tr>
			<td colspan="2" style="width: 100%;">
				<div id="valueGiaTriNhapSttNotThongSo"></div>
				<div id="listValueGiaTriNhapNotThongSo"></div>
			</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
					<input type="button" class="egov-button-normal" value="Đồng ý" id="btnNotThongSo" 
					onclick="javascript: func_xacnhanNotThongSo();">
				&nbsp;&nbsp; 
				<input type="button" class="egov-button-normal" value="Hủy" onclick="javascript: func_huyPheDuyetNotThongSo();" >
			</td>
		</tr>
	</table>
</div>
<script type="text/javascript">

function validatorLanhDaoSuaChungChi() {
	var giaTriTenNguoiNhapKhau = $('#tenNguoiNhapKhau').val();
	var giaTriDiaChiNguoiNhapKhau = $('#diaChiNguoiNhapKhau').val();
	var soToKhaiHaiQuan = $('#soToKhaiHaiQuan').val();
	var soKhaiBaoToKhaiHaiQuan = $('#soKhaiBaoToKhaiHaiQuan').val();
	var ngayToKhaiHaiQuan = $('#ngayToKhaiHaiQuan').val();
	
	if (document.getElementById('btnSuaDoiTT').checked) {
		if (giaTriTenNguoiNhapKhau.trim().length == 0) {
			alert("Đề nghị bổ sung đầy đủ Người nhập khẩu hoặc giữ nguyên thông tin DN khai báo ban đầu!");
			return false;
		}
		if (giaTriTenNguoiNhapKhau.trim().length == 0) {
			alert("Đề nghị bổ sung đầy đủ Địa chỉ hoặc giữ nguyên Địa chỉ DN khai báo ban đầu !");
			return false;
		}		
	}
	
	if ((soToKhaiHaiQuan.trim().length > 0) && (ngayToKhaiHaiQuan.trim().length == 0)) {
		alert("Đề nghị nhập Ngày tờ khai hải quan !");
		return false;
	}
	if ((soToKhaiHaiQuan.trim().length == 0) && (soKhaiBaoToKhaiHaiQuan.trim().length > 0)) {
		alert("Bỏ qua Số tờ khai hải quan hoặc sao chép lại Số tờ khai có sẵn !");
		return true;
	}
	return true;
}

function beforSummitForm(idForm, url) {
	console.log('=beforSummitForm=' + idForm);
	var status = confirm("Bạn có muốn tiếp tục xử lý?");
	if (status) {
		document.getElementById('<portlet:namespace/>' + idForm).action = url;
		document.getElementById('<portlet:namespace/>' + idForm).submit();

		document.getElementById('buttonSuaChungChi').disabled = true;
		document.getElementById('buttonQuayLai').disabled = true; 
	} else {
		document.getElementById('<portlet:namespace/>' + idForm).action = '';
	}
}


var vehicleClassJs='<%=vehicleGroup.getVehicleClass()%>';
var giaTriTraVe="";
var isThuocDmDataItem = "0";
function suaThongSoChungChi(specificationcode, giaTriDangKi) {

	var typeAjax = 'hienThiGiaTriThayDoiThongSoChungChi';

	console.log("===call Ajax==" + typeAjax);
	console.log("===call Ajax==specificationcode==" + specificationcode);

	
	$.ajax({
		type : 'GET',
		async: false,//bat dong bo = fale, dong bo voi client
		cache : false,
		url : '<%=updaContentURL%>',
		data : {
			specificationcode : specificationcode,
			type : typeAjax,
			vehicleClass : vehicleClassJs,
			giaTriDangKi : giaTriDangKi,
		},
		success : function(data) {
			// preferred
			console.log("===data==" + data);
			if (data != '{}') {
				var data2 = JSON.parse(data);
				console.log("===data2==" + data2);
				isThuocDmDataItem = "1";
				document.getElementById("listValueGiaTriNhap").style.overflowX = "";
				
				giaTriTraVe = "<select id=\"giaTriNhapSuaDoi" + specificationcode + "\" name=\"giaTriNhapSuaDoi\"" + specificationcode + " class=\"form-control-find width100\">";
				for (var i = 0; i < data2.codedataitem.length; i++) {
					console.log("******suaGiaTriNhap ==code dataitem=====" + data2.codedataitem[i]);
					console.log("******suaGiaTriNhap ==name dataitem=====" + data2.namedataitem[i]);
					var isSelected = "";
					if (data2.codedataitem[i] == giaTriDangKi) {
						isSelected = " selected ";
					}
					
					giaTriTraVe = giaTriTraVe + "<option value=\"" + data2.codedataitem[i] + "\"  " + isSelected + "  >" + data2.namedataitem[i] + "</option>";
				}
				giaTriTraVe = giaTriTraVe + "</select>";
				
			} else {
				isThuocDmDataItem = "0";
				document.getElementById("listValueGiaTriNhap").style.overflowX = "";
				document.getElementById("listValueGiaTriNhap").style.height = "30px";
				
				giaTriTraVe = createInput(specificationcode, giaTriDangKi);
			}
		}
	});
	
	if (giaTriTraVe != '') {
		document.getElementById("valueGiaTriNhapStt").innerHTML = createInputGiaTriNhapStt(specificationcode);
		document.getElementById("listValueGiaTriNhap").innerHTML = giaTriTraVe;
		showThongBaoMsg();
	}

}
function suaChungChiNotThongSo(datagroupid, code0) {

	var typeAjax = 'hienThiGiaTriThayDoiChungChiNotThongSo';

	console.log("===call Ajax==" + typeAjax);
	console.log("===call Ajax==datagroupid==" + datagroupid + "===code0===" + code0);
	
	$.ajax({
		type : 'GET',
		async: false,//bat dong bo = fale, dong bo voi client
		cache : false,
		url : '<%=updaContentURL%>',
		data : {
			datagroupid : datagroupid,
			type : typeAjax,
			vehicleClass : vehicleClassJs,
		},
		success : function(data) {
			// preferred
			console.log("===data==" + data);
			if (data != '{}') {
				var data2 = JSON.parse(data);
				console.log("===data2==" + data2);
				
				if (datagroupid == '4') {
					giaTriTraVe = "";
					console.log("===call Ajax==COUNTRY==" + datagroupid);
					
					var code0Checked = document.getElementById("nuocSanXuatCode").value;
					
					isThuocDmDataItem = "4";
					document.getElementById("listValueGiaTriNhapNotThongSo").style.overflowX = "scroll";
					document.getElementById("listValueGiaTriNhapNotThongSo").style.height = "200px";

					for (var i = 0; i < data2.codedataitem.length; i++) {
						var isSelected = "";
						if (code0Checked.includes(data2.codedataitem[i])) {
							isSelected = " checked ";
						}
						var code = data2.codedataitem[i].trim();
						var name = data2.namedataitem[i].trim();
						
						giaTriTraVe = giaTriTraVe + createGiaTriTraVe(code, name, isSelected);
						
					}

					var giaTriDk = document.getElementById('nuocSanXuatValue').value;
					var giaTriCode = document.getElementById('nuocSanXuatCode').value;
					
					giaTriTraVe = giaTriTraVe + createListGiaTriTraVe(giaTriCode, giaTriDk);
					
				} else if (datagroupid == '2'){
					giaTriTraVe = "";
					
					document.getElementById("listValueGiaTriNhapNotThongSo").style.overflowX = "";
					document.getElementById("listValueGiaTriNhapNotThongSo").style.height = "30px";
					
					isThuocDmDataItem = "2";
					var loaiPhuongTien = document.getElementById("loaiPhuongTienCode").value;
					
					giaTriTraVe = "<select id=\"giaTriNhapSuaDoi\" name=\"giaTriNhapSuaDoi\" class=\"form-control-find width100\">";
					for (var i = 0; i < data2.codedataitem.length; i++) {
						console.log("******suaGiaTriNhap ==code dataitem=====" + data2.codedataitem[i]);
						console.log("******suaGiaTriNhap ==name dataitem=====" + data2.namedataitem[i]);
						var isSelected = "";
						if (data2.codedataitem[i] == loaiPhuongTien) {
							isSelected = " selected ";
						}
						
						giaTriTraVe = giaTriTraVe + "<option value=\"" + data2.codedataitem[i] + "\"  " + isSelected + "  >" + data2.namedataitem[i] + "</option>";
					}
					giaTriTraVe = giaTriTraVe + "</select>";
					
				} else if (datagroupid == '3'){
					giaTriTraVe = "";
					isThuocDmDataItem = "3";
					
					document.getElementById("listValueGiaTriNhapNotThongSo").style.overflowX = "";
					document.getElementById("listValueGiaTriNhapNotThongSo").style.height = "30px";
					
					var nhanHieu = document.getElementById("nhanHieuCode").value;
					giaTriTraVe = "<select id=\"giaTriNhapSuaDoi\" name=\"giaTriNhapSuaDoi\" class=\"form-control-find width100\">";
					for (var i = 0; i < data2.codedataitem.length; i++) {
						console.log("******suaGiaTriNhap ==code dataitem=====" + data2.codedataitem[i]);
						console.log("******suaGiaTriNhap ==name dataitem=====" + data2.namedataitem[i]);
						var isSelected = "";
						if (data2.codedataitem[i] == nhanHieu) {
							isSelected = " selected ";
						}
						
						giaTriTraVe = giaTriTraVe + "<option value=\"" + data2.codedataitem[i] + "\"  " + isSelected + "  >" + data2.namedataitem[i] + "</option>";
					}
					giaTriTraVe = giaTriTraVe + "</select>";
				}
				
			}
		}
	});
	
	if (giaTriTraVe != '') {
		document.getElementById("listValueGiaTriNhapNotThongSo").innerHTML = giaTriTraVe;
		showThongBaoMsgNotThongSo();
	}

}
</script>