<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro"%>
<%@page import="vn.dtt.gt.dk.utils.format.CommonUtils"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ include file="/portlet/init.jsp"%>
<%
String loaiThuTuc = ParamUtil.getString(request, Constants.LOAI_THU_TUC);

PortletURL portletUrl = renderResponse.createRenderURL();
portletUrl.setParameter("jspPage", "/portlet/quanlyhs/thulyhs/tonghiepvu/listDebitNote.jsp");

if (loaiThuTuc!= null && loaiThuTuc.trim().length() > 0) {
	portletUrl.setParameter(Constants.LOAI_THU_TUC, loaiThuTuc.trim());
	
}

List<DebitNote> liDebitNotes = null;
SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, portletUrl, null, null);
if (loaiThuTuc!= null && loaiThuTuc.trim().length() > 0) {
	liDebitNotes = DebitNoteLocalServiceUtil.findDebitNote(loaiThuTuc.trim(), searchContainer.getStart(), searchContainer.getEnd());
	int total = DebitNoteLocalServiceUtil.countDebitNote(loaiThuTuc.trim());
	searchContainer.setTotal(total);
	searchContainer.setResults(liDebitNotes);
} else {
	liDebitNotes = DebitNoteLocalServiceUtil.findByMarkAsDeleted(Constants.MarkUpDelete_chua_xoa, searchContainer.getStart(), searchContainer.getEnd());
	int total = DebitNoteLocalServiceUtil.countByMarkAsDeleted(Constants.MarkUpDelete_chua_xoa);
	searchContainer.setTotal(total);
	searchContainer.setResults(liDebitNotes);
}
if (liDebitNotes == null) {
	liDebitNotes = new ArrayList();
}

	// Ghi actionlog
	
	String noidungthaotac = "Mở xem Quản lý thu phí, lệ phí - chức năng Chờ xác nhận thanh toán thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) ; 
	String tenmanhinhdaidien = "Màn hình Quản lý thu phí, lệ phí - Thanh toán theo phiếu";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<script type="text/javascript">
var hoSoThuTucList = new Array();
</script>
<portlet:actionURL var="thanhToanDebitNote" name="thanhToanDebitNote"> 
</portlet:actionURL>

<portlet:actionURL var="timKiemDebitNote" name="timKiemDebitNote"> 
</portlet:actionURL>


<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
	<aui:form action="<%=thanhToanDebitNote%>" method="post" name="myForm" id="myForm">
	
		<div id="CollapsiblePanel1">
			<div tabindex="0" class="CollapsiblePanelTab">
				<h5 class="tieude">
					Tìm kiếm phiếu thanh toán
					<i class="fa-right fa fa-angle-down"></i>
				</h5>
				<h5></h5>
			</div>
			<div class="CollapsiblePanelContent" style="display: block;">
				<div class="row">
					<div class="col-xs-10 col-sm-10 col-md-10">
						<div class="row">
							<div class="col-xs-9 col-sm-9 col-md-10">
								<input type="text" name="<%=Constants.LOAI_THU_TUC %>" id="<%=Constants.LOAI_THU_TUC %>" value="<%=loaiThuTuc %>" placeholder="nhập thông tin tìm kiếm" class="form-control-find">
							</div>
							<div class="col-xs-3 col-sm-3 col-md-2">
								<button type="button" class="fa-right bt btxanhduong btn btn-default" onclick="summitForm('<%=timKiemDebitNote.toString()%>')">Tìm kiếm</button>
							</div>
						</div>
					</div>
				</div>
			</div>
			<br>
		</div>
	
		<table class="wd-table table">
			<thead>
				<tr>
					<th><liferay-ui:message key="vn.gt.dk.qlhs.stt" /></th>
					<th><liferay-ui:message key="vn.gt.dk.qlhs.lanh.dao.don.vi.chon" /><br><input id = 'check_all' name = 'check_all' type='checkbox' onclick="checkAll();"/></th>
					<th>Số phiếu tính tiền</th>
					<th>Ngày lập phiếu</th>
					<th width="15%">Tổng tiền nộp phí</th>
					<th width="15%">Tên doanh nghiệp</th>
					<th width="10%">Thao tác</th>
				</tr>
			</thead>
			<tbody>
			<%
				DebitNote debitNote = null;
				String tenDoanhNGhiep = "";
				int k =0;
				long lTotalPayment = 0;
				for (int i = 0; i < liDebitNotes.size(); i++) {
					tenDoanhNGhiep = "";
					debitNote = (DebitNote)liDebitNotes.get(i);
					List<TthcKeHoachChuyenDich> keHoachChuyenDich = TthcKeHoachChuyenDichLocalServiceUtil.findByDebitnoteNumber(debitNote.getDebitNoteNumber());
					if(keHoachChuyenDich==null||keHoachChuyenDich.size()==0){				
						PortletURL viewReportLePhi = renderResponse.createRenderURL();
						viewReportLePhi.setParameter("jspPage", "/portlet/quanlyhs/thulyhs/tonghiepvu/lephi_report_export.jsp");
						viewReportLePhi.setParameter("debitNoteId", String.valueOf(debitNote.getId()));						
						List<VehicleRecord> lVehicleRecords = VehicleRecordLocalServiceUtil.findByDebitNoteId(debitNote.getId());
						if (lVehicleRecords != null && lVehicleRecords.size() > 0) {
							VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(lVehicleRecords.get(0).getVehicleGroupId());
							if (vehicleGroup != null) {
								viewReportLePhi.setParameter("vehicleClass", vehicleGroup.getVehicleClass());
								RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.fetchRegisteredInspection(vehicleGroup.getRegisteredInspectionId());
								if (registeredInspection != null) {
									tenDoanhNGhiep = registeredInspection.getImporterName();
								}
							}
						}
						lTotalPayment = 0;
						lTotalPayment = (new Double(debitNote.getTotalPayment())).longValue();
						String strlTotalPayment = String.format("%,d", lTotalPayment);
				%>
						<tr>
							<td class="text-center"><%= (i + 1) + searchContainer.getStart() %></td>
							<td class="text-center"><input type='checkbox' id='<%=debitNote.getId()%>'  class="user" onclick="changeajax('<%=debitNote.getId() %>');" /></td>
							<td class="text-center"><%=debitNote.getDebitNoteNumber() %></td>
							<td class="text-center"><%=DateUtils.dateToString("dd/MM/yyyy HH:mm", debitNote.getReportDate())%></td>
							<td class="text-center"><%=strlTotalPayment%></td>
							<td class="text-left"><%=tenDoanhNGhiep %></td>
							<td class="text-center"><a href="<%=viewReportLePhi.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a></td>
						</tr>
						<script type="text/javascript">
						hoSoThuTucList[<%=k%>] = "<%=debitNote.getId()%>";
						</script>
					<%
						k=k+1;
					}
				}
				%>
				<input type="hidden" name="listId" id="listId" value=""/>
				<input type="hidden" name="thanhToanTienMat" id="thanhToanTienMat" value="1"/>
			</tbody>
		</table>
		<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
		<aui:button-row>
			<button style="margin-left: 6px;" class="btnThuLyHS form-control" type="button"  onclick="if(validatorHinhthucchuyenkhoan())  summitForm('<%=thanhToanDebitNote.toString()%>')">Xác nhận thanh toán</button>		
		</aui:button-row>
		
		<div id="boxXacNhan" >
			<center>
				<table style="width: 100%">
					
					<tr>
						<td  style="width: 20%"> <h5 class="tieude">
							Hình thức thanh toán:  </h5> 
						</td>
						
						<td  style="width: 50%"><b>
							<input name="xem" type="radio" id="btnXacNhanTienMat" size="20"
										value="1" onclick="changeXacNhan()"/> &nbsp; Tiền mặt
								&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 		
						<input name="xem" type="radio" id="btnXacNhanChuyenKhoan" size="20"
										value="0" onclick="changeXacNhan()"/> &nbsp; Chuyển khoản
										</b>				
						</td>
					</tr>
					
					
					<script language="JavaScript" type="text/javascript">
		function changeXacNhan(){
			if (document.getElementById('btnXacNhanTienMat').checked) {
				document.getElementById('thanhToanTienMat').value = '1';
			}else{
				document.getElementById('thanhToanTienMat').value = '0';
			}	
			
		}
		</script>
				</table>
			</center>	
			</div>
		
	</aui:form>
	</div>
</div>
<script type="text/javascript">

function summitForm(url) {
	document.getElementById('<portlet:namespace/>myForm').action = url;
     document.getElementById('<portlet:namespace/>myForm').submit();
}

function changeajax(dataId) {
	
	var isCheck=document.getElementById(dataId).checked;
	var isCheckInternal = true;
	var listId=document.getElementById('listId').value;
	if (isCheck==true){
		//alert("--true");
		listId=listId+dataId+", ";
		for ( var i = 0; i < hoSoThuTucList.length; i++) {
			isCheckInternal = document.getElementById(hoSoThuTucList[i]).checked;
			if(isCheckInternal == false){
				break;
			}
		}
		document.getElementById("check_all").checked = isCheckInternal;
	}else{
		//alert("--false");
		var res = listId.replace(dataId+", ", "");
		document.getElementById("check_all").checked = false;
		listId=res;
	}
	document.getElementById('listId').value=listId;
}

function checkAll() {
	
	var isCheck1=document.getElementById('check_all').checked;
	var listId="";

	if (isCheck1==true){
		for ( var i = 0; i < hoSoThuTucList.length; i++) {
			document.getElementById(hoSoThuTucList[i]).checked = "checked";
			listId = listId + hoSoThuTucList[i] + ", ";
		}
		document.getElementById('listId').value = listId;
	} else {
		for ( var i = 0; i < hoSoThuTucList.length; i++) {
			document.getElementById(hoSoThuTucList[i]).checked = '';
		}
		document.getElementById('listId').value = '';
	}
}

function validatorHinhthucchuyenkhoan() {	
	if (document.getElementById('btnXacNhanTienMat').checked)
		{
		return true;
		
		} else if (document.getElementById('btnXacNhanChuyenKhoan').checked)
			{
			
			return true;
			}
		else
			{
			alert("Đề nghị chọn Hình thức thanh toán !");
			return false;
			}
			
	return true;
}
</script>