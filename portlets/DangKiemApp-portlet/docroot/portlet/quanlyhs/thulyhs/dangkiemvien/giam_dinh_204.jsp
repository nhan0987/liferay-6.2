<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
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

<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>
<%
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	String idPhieuXuLyPhu = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY_PHU);
%>
<portlet:actionURL var="lapBanDangKyGiamDinh" name="lapBanDangKyGiamDinh">
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
	<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(idHoSoThuTuc) %>"/>
	<portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=String.valueOf(idPhieuXuLyPhu) %>"/>
	<portlet:param name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=String.valueOf(idthuTucHanhChinh) %>"/>
</portlet:actionURL>

<!-- DN thu nghiem giam dinh -->

<!-- Quản lý hồ sơ DKKT -->
<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
	<div class="row">
		<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.socongvan"/></label>
		</div>
		<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
			<input type="text" placeholder="Nhập số công văn" class="form-control-find" name="RequestTestingNumber204" id="RequestTestingNumber204"  />
		</div> 
	</div>
	<div class="row">
		<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.sodenghigiamdinh"/></label>
		</div>
		<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
			<input type="text" placeholder="Số đề nghị giám định" class="form-control-find" name="requirementNumber204" id="requirementNumber204"  />
		</div> 
	</div>
	
	<div class="row">
		<div class="col-xs-2 col-sm-2 col-md-2"  style="width: 25%;">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.ngaythangdenghi"/></label>
		</div>
		<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
			<input type="text" placeholder="Nhập ngày tháng đề nghị"  readonly="readonly" style="width: 200px;"  name="ngayThangDeNghi204" id="ngayThangDeNghi204" 
				onclick="gtCalendar('ngayThangDeNghi204')" class="form-control-find-calendar" style="float: left;">
		</div> 
	</div>
	
	<div class="row">
		<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.trungtamthunghiemgiamdinh"/></label>
		</div>
		<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
			<select name="ReportTo204" id="ReportTo204" size="1" class="form-control-find">
				<% 
				List<DmDataItem> lDmDataItems = DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName("Corporation", "GIAMDINH"); 
				for (DmDataItem thuTucHanhChinh : lDmDataItems) {%>
					<option value="<%=thuTucHanhChinh.getCode0()%>"><%=thuTucHanhChinh.getName()%></option>
				<%}%>
			</select>
		</div> 
	</div>
	<div class="row"> 
		<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.noidungdenghithunghiem"/></label>
		</div>
		<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
			<input type="text" placeholder="Nhập nội dung đề nghị thử nghiệm" class="form-control-find" name="ContentOfRequest204" id="ContentOfRequest204"  />
		</div> 
	</div>
	
	<div class="row"> 
		<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.cosodangkythunghiem"/></label>
		</div>
		<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
			<input type="text" placeholder="Nhập cơ sở đăng ký thử nghiệm" class="form-control-find" name="TestingRegisteredPlace204" id="TestingRegisteredPlace204"  />
		</div> 
	</div>
	
	<div class="row"> 
		<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.thanhtoanchiphithunghiem"/></label>
		</div>
		<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
			<input type="text" placeholder="Nhập thanh toán Chi phí thử nghiệm" class="form-control-find" name="TestingPayment204" id="TestingPayment204"  />
		</div> 
	</div>
	<div class="row"> 
		<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.yeucaukhac"/></label>
		</div>
		<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
			<input type="text" placeholder="Nhập yêu cầu khác" class="form-control-find" name="Remarks204" id="Remarks204"  />
		</div> 
	</div>
	
	<!-- signName -->
	<div class="row"> 
		<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.nguoiduyettruongbophan"/></label>
		</div>
		<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
			<input type="text" placeholder="Người duyệt" class="form-control-find" name="signName204" id="signName204"  />
		</div> 
	</div>
	
	<!-- signTitle -->
	<div class="row"> 
		<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.chucdanh"/></label>
		</div>
		<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
			<input type="text" placeholder="Chức danh" class="form-control-find" name="signTitle204" id="signTitle204"  />
		</div> 
	</div>
	
	
	<!-- attachedFile -->
	<div class="row"> 
		<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
			<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.filedinhkem"/></label>
		</div>
		<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
			<input type="text" placeholder="File dinh kem" class="form-control-find" name="attachedFile204" id="attachedFile204"  />
		</div> 
	</div>
	
</div>

<table class="wd-table table">
	<thead>
		<tr>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.chon"/></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.stt" /></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.nhanhieu"/></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.sokhungvin"/></th>
			<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.sodongco"/></th>
		</tr>
	</thead>
	<tbody>
		<%
		List<VehicleRecord> lVehicleRecords = VehicleRecordLocalServiceUtil.findVehicleRecordByPhieuXuLyPhuId(ConvertUtil.convertToLong(idPhieuXuLyPhu));
		VehicleGroup vehicleGroup = null;
		VehicleRecord vehicleRecord = null;
		for (int i = 0; i < lVehicleRecords.size(); i ++) {
			vehicleRecord = (VehicleRecord)lVehicleRecords.get(i);
			vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord.getVehicleGroupId());
			DmDataItem dmDataItemNhanHieu = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.TRADE_MARK, vehicleGroup.getTradeMark());
		%>
		<tr>
			<td class="text-center"><input type="checkbox" id="vehicleRecord204_<%=i %>" name="vehicleRecord204_<%=i %>" value="<%=vehicleRecord.getId()%>"/> </td>
			<td class="text-center"><%=i + 1%></td>
			<td class="text-center"><%=Validator.isNotNull(dmDataItemNhanHieu) ? dmDataItemNhanHieu.getName() : vehicleGroup.getTradeMark() %></td>
			<td class="text-center"><%=vehicleRecord.getChassisNumber() %></td>
			<td class="text-center"><%=vehicleRecord.getEngineNumber() %></td>
		</tr>
		<%
		}
		%>
	</tbody>
</table>

<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
	<div class="row"> 
		<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
			<button class="btnThuLyHS form-control" type="button"  onclick="summitForm('<%=lapBanDangKyGiamDinh %>')"  ><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.giamdinh204.taobandangkygiamdinh"/></button>	
		</div>
	</div>
</div>
