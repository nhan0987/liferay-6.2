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
	portletUrl.setParameter("jspPage", "/portlet/quanlyhs/thulyhs/tonghiepvu/guiChungChiTheoPhieuThu.jsp");
	
	if (loaiThuTuc!= null && loaiThuTuc.trim().length() > 0) {
		portletUrl.setParameter(Constants.LOAI_THU_TUC, loaiThuTuc.trim());
	}
	
	List<DebitNote> liDebitNotes = null;
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, portletUrl, null, null);
	if (loaiThuTuc!= null && loaiThuTuc.trim().length() > 0) {
		liDebitNotes = DebitNoteLocalServiceUtil.findDebitNotePAID(loaiThuTuc.trim(), searchContainer.getStart(), searchContainer.getEnd());
		int total = DebitNoteLocalServiceUtil.countDebitNotePAID(loaiThuTuc.trim());
		searchContainer.setTotal(total);
		searchContainer.setResults(liDebitNotes);
	} else {
		//gui chung chi theo phieu thu , da thanh toan (MarkUpDelete Da Xoa), cho cap chung chi
		liDebitNotes = DebitNoteLocalServiceUtil.findByMarkAsDeleted(Constants.MarkUpDelete_da_xoa, searchContainer.getStart(), searchContainer.getEnd());
		int total = DebitNoteLocalServiceUtil.countByMarkAsDeleted(Constants.MarkUpDelete_da_xoa);
		searchContainer.setTotal(total);
		searchContainer.setResults(liDebitNotes);
	}
	if (liDebitNotes == null) {
		liDebitNotes = new ArrayList<DebitNote>();
	}
%>
			<%
			
			// Ghi actionlog
			String noidungthaotac = "Mở xem Tìm kiếm phiếu đã thanh toán để cấp chứng chỉ" + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) ; 
			               
			String tenmanhinhdaidien = "Màn hình Tìm kiếm phiếu đã thanh toán";
			String importername = "";
			String inspectorname = user.getScreenName();
			long inspectorid = user.getUserId();
			
			
			QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
			
		%>
<script type="text/javascript">
var hoSoThuTucList = new Array();
</script>

<portlet:actionURL var="guiChungChiTheoPhieuThu" name="guiChungChiTheoPhieuThu"></portlet:actionURL>

<portlet:actionURL var="timKiemChungChi" name="timKiemChungChi"></portlet:actionURL>

<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
	<aui:form action="<%=guiChungChiTheoPhieuThu%>" method="post" name="myForm" id="myForm">
	
		<div id="CollapsiblePanel1">
			<div tabindex="0" class="CollapsiblePanelTab">
				<h5 class="tieude">
					Tìm kiếm phiếu thanh toán cấp chứng chỉ 
					<i class="fa-right fa fa-angle-down"></i>
				</h5>
				<h5></h5>
			</div>
			<div class="CollapsiblePanelContent" style="display: block;">
				<div class="row">
					<div class="col-xs-10 col-sm-10 col-md-10">
						<div class="row">
							<div class="col-xs-9 col-sm-9 col-md-10">
								<input type="text" placeholder="nhập thông tin tìm kiếm" class="form-control-find"
										name="<%=Constants.LOAI_THU_TUC %>" id="<%=Constants.LOAI_THU_TUC %>" value="<%=loaiThuTuc %>">
							</div>
							<div class="col-xs-3 col-sm-3 col-md-2">
								<button type="button" class="fa-right bt btxanhduong btn btn-default" onclick="summitForm('<%=timKiemChungChi.toString()%>')">Tìm kiếm</button>
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
			
			int k=0;
			long lTotalPayment = 0;
			
			for (int i = 0; i < liDebitNotes.size(); i++) {
				debitNote = (DebitNote)liDebitNotes.get(i);
				tenDoanhNGhiep = "";
				List<TthcKeHoachChuyenDich> keHoachChuyenDich = TthcKeHoachChuyenDichLocalServiceUtil.findByDebitnoteNumber(debitNote.getDebitNoteNumber());
				if(keHoachChuyenDich==null||keHoachChuyenDich.size()==0){	
					PortletURL viewReportLePhi = renderResponse.createRenderURL();
					viewReportLePhi.setParameter("jspPage", "/portlet/quanlyhs/thulyhs/tonghiepvu/guichungchitheophieuthu_report_export.jsp");
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
						<td class="text-center"><%=strlTotalPayment %></td>
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
			</tbody>
		</table>
		<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
		<aui:button-row>
			<button style="margin-left: 6px;" class="btnThuLyHS form-control" type="submit">Trả chứng chỉ</button>
		</aui:button-row>
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
	if (isCheck == true) {
		//alert("--true");
		listId=listId+dataId+", ";
		for ( var i = 0; i < hoSoThuTucList.length; i++) {
			isCheckInternal = document.getElementById(hoSoThuTucList[i]).checked;
			if(isCheckInternal == false){
				break;
			}
		}
		document.getElementById("check_all").checked = isCheckInternal;
	} else {
		//alert("--false");
		var res = listId.replace(dataId+", ", "");
		document.getElementById("check_all").checked = false;
		listId = res;
	}
	document.getElementById('listId').value=listId;
}

function checkAll() {
	var isCheck1 = document.getElementById('check_all').checked;
	var listId="";

	if (isCheck1 == true){
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
</script>