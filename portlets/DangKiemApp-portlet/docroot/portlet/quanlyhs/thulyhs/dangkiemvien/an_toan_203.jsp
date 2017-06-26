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

<%
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	String idPhieuXuLyPhu = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY_PHU);
%>
<portlet:actionURL var="lapBanDangKyAnToan" name="lapBanDangKyAnToan">
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
	<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(idHoSoThuTuc) %>"/>
	<portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=String.valueOf(idPhieuXuLyPhu) %>"/>
	<portlet:param name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=String.valueOf(idthuTucHanhChinh) %>"/>
</portlet:actionURL>
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.socongvan"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập số công văn" class="form-control-find" name="RequestTestingNumber203" id="RequestTestingNumber203" />
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.ngaythangdenghi"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" readonly="readonly" placeholder="Nhập ngày tháng đề nghị" onclick="gtCalendar('ngayThangDeNghi203')" style="width: 200px;" class="form-control-find-calendar" name="ngayThangDeNghi203" id="ngayThangDeNghi203" />
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.trungtamthunghiemantoan"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<select name="ReportTo203" id="ReportTo203" size="1" class="form-control-find">
						<% 
						  List<DmDataItem> lDmDataItems = DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName("Corporation", "ANTOAN"); 
						  for (DmDataItem thuTucHanhChinh : lDmDataItems) {%>
							<option value="<%=thuTucHanhChinh.getCode0()%>"><%=thuTucHanhChinh.getName()%></option>
						<%}%>
				</select>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.noidungdenghithunghiem"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập nội dung đề nghị thử nghiệm" class="form-control-find" name="ContentOfRequest203" id="ContentOfRequest203" />
			</div> 
		</div>
		
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.cosodangkythunghiem"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập cơ sở đăng ký thử nghiệm" class="form-control-find" name="TestingRegisteredPlace203" id="TestingRegisteredPlace203" />
			</div> 
		</div>
		
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.thanhtoanchiphithunghiem"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập thanh toán Chi phí thử nghiệm" class="form-control-find" name="TestingPayment203" id="TestingPayment203" />
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.thoigianvadiadiem"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập thời gian và địa điểm" class="form-control-find" name="testingRegistration203" id="testingRegistration203" />
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.nguoiky"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập người ký" class="form-control-find" name="signName203" id="signName203" />
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.diadiemky"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập địa điểm ký" class="form-control-find" name="signPlace203" id="signPlace203" />
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.tieudeky"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập tiêu đề ký" class="form-control-find" name="signTitle203" id="signTitle203" />
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.yeucaukhac"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập yêu cầu khác" class="form-control-find" name="Remarks203" id="Remarks203" />
			</div> 
		</div>
		
	</div>

	<table class="wd-table table">
		<thead>
			<tr>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.chon"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.stt" /></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.nhanhieu"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.sokhung"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.sodongco"/></th>
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
				<td class="text-center"><input type="checkbox" id="vehicleRecord203_<%=i%>" name="vehicleRecord203_<%=i%>" value="<%=vehicleRecord.getId() %>"/> </td>
				<td class="text-center"><%= i + 1 %></td>
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
				<button class="btnThuLyHS form-control"  type="button"  onclick="summitForm('<%=lapBanDangKyAnToan %>')" ><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.antoan.taobandangkyantoan"/></button>	
			</div>
		</div>
	</div>
