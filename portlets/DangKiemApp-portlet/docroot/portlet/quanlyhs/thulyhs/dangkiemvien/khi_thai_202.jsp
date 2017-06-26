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
<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";
</script>
<%
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);
	String idPhieuXuLyPhu = ParamUtil.getString(request, Constants.ID_PHIEU_XU_LY_PHU);
%>
<portlet:actionURL var="lapBanDangKyKhiThai" name="lapBanDangKyKhiThai">
	<portlet:param name="<%=Constants.THANH_PHAN_XU_LY %>" value="<%=Constants.XU_LY_TLHS %>"/>
	<portlet:param name="<%=Constants.ID_HO_SO_THU_TUC %>" value="<%=String.valueOf(idHoSoThuTuc) %>"/>
	<portlet:param name="<%=Constants.ID_PHIEU_XU_LY_PHU %>" value="<%=String.valueOf(idPhieuXuLyPhu) %>"/>
	<portlet:param name="<%=Constants.TTHC_THUTUCHANHCHINH_ID %>" value="<%=String.valueOf(idthuTucHanhChinh) %>"/>
</portlet:actionURL>
	<!-- Quản lý hồ sơ DKKT -->
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.socongvan"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập số công văn" class="form-control-find" name="RequestTestingNumber202" id="RequestTestingNumber202"  />
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2"  style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.ngaythangdenghi"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<span class="input-group-btn">
					<input type="text"  readonly="readonly" placeholder="Nhập ngày tháng đề nghị" style="width: 200px;" onclick="gtCalendar('ngayThangDeNghi202')" class="form-control-find-calendar" name="ngayThangDeNghi202" id="ngayThangDeNghi202"  />
				</span>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.trungtamthunghiemkhithai"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<select name="ReportTo202" id="ReportTo202" size="1" class="form-control-find">
						<% 
						  List<DmDataItem> lDmDataItems = DmDataItemLocalServiceUtil.findByDataGroupCodeNameAndDataItemAlterName("Corporation", "KHITHAI"); 
						  for (DmDataItem thuTucHanhChinh : lDmDataItems) {%>
							<option value="<%=thuTucHanhChinh.getCode0()%>"><%=thuTucHanhChinh.getName()%></option>
						<%}%>
				</select>
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.noidungdenghithunghiem"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập nội dung đề nghị thử nghiệm" class="form-control-find" name="ContentOfRequest202" id="ContentOfRequest202"  />
			</div> 
		</div>
		
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.cosodangkythunghiem"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập cơ sở đăng ký thử nghiệm" class="form-control-find" name="TestingRegisteredPlace202" id="TestingRegisteredPlace202"  />
			</div> 
		</div>
		
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.thanhtoanchiphithunghiem"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập thanh toán Chi phí thử nghiệm" class="form-control-find" name="TestingPayment202" id="TestingPayment202"  />
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.thoigianvadiadiem"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập thời gian và địa điểm" class="form-control-find" name="testingRegistration202" id="testingRegistration202"  />
			</div> 
		</div>
		
		
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.nguoiky"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập người ký" class="form-control-find" name="signName202" id="signName202"  />
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.diadiemky"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập địa điểm ký" class="form-control-find" name="signPlace202" id="signPlace202"  />
			</div> 
		</div>
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.tieudeky"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập tiêu đề ký" class="form-control-find" name="signTitle202" id="signTitle202"  />
			</div> 
		</div>
		
		
		<div class="row"> 
			<div class="col-xs-2 col-sm-2 col-md-2" style="width: 25%;">
				<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.yeucaukhac"/></label>
			</div>
			<div class="col-xs-10 col-sm-10 col-md-10" style="width: 75%;">
				<input type="text" placeholder="Nhập yêu cầu khác" class="form-control-find" name="Remarks202" id="Remarks202"  />
			</div> 
		</div>
		
	</div>

	<table class="wd-table table">
		<thead>
			<tr>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.chon"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.stt" /></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.nhanhieu"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.sokhungvin"/></th>
				<th><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.sodongco"/></th>
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
				<td class="text-center"><input type="checkbox" id="vehicleRecord202_<%=i%>" name="vehicleRecord202_<%=i%>" value="<%=vehicleRecord.getId() %>"/> </td>
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
				<button class="btnThuLyHS form-control" type="button"  onclick="summitForm('<%=lapBanDangKyKhiThai %>')" ><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.khithai202.taobandangkykhithai"/></button>	
			</div>
		</div>
	</div>
