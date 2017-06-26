<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataItem"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
	CorporationInspector corporationInspectorLogin = null;
	try {
		corporationInspectorLogin = CorporationInspectorLocalServiceUtil.fetchByInspectorId(user.getUserId());
	} catch (Exception es) {
		//es.printStackTrace();
	}
	if (Validator.isNull(corporationInspectorLogin)) { corporationInspectorLogin = new CorporationInspectorImpl(); } 
	
	String corporationIdLogin = corporationInspectorLogin.getCorporationId();
	
	String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);
	
	if ((returnURL == null && returnURL.trim().length() == 0) || (returnURL != null && !returnURL.trim().contains("group"))) {
		PortletURL returnUrlB =  renderResponse.createRenderURL();
		returnUrlB.setParameter("jspPage", "/portlet/quanlynguoidung/view.jsp");
		returnURL = returnUrlB.toString();
	}
	
	PortletURL renderUrlQldangkiemvien = renderResponse.createRenderURL();
	renderUrlQldangkiemvien.setParameter(Constants.CORPORATION_ID, corporationIdLogin);
	renderUrlQldangkiemvien.setParameter("jspPage", "/portlet/quanlynguoidung/quanlyDangKiemVien.jsp");
	
	SearchContainer<CorporationInspector> searchContainer = new SearchContainer<CorporationInspector>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, renderUrlQldangkiemvien, null, "");
	
	List<CorporationInspector> lCorporationInspectors = CorporationInspectorLocalServiceUtil.findDanhSachDangKiemVien(searchContainer.getStart(), searchContainer.getEnd());
	int total = CorporationInspectorLocalServiceUtil.countDanhSachDangKiemVien();
	
	searchContainer.setTotal(total);
	searchContainer.setResults(lCorporationInspectors);
	
	PortletURL urlThemCorporation = renderResponse.createRenderURL();
	urlThemCorporation.setParameter(Constants.INSPECTOR_ID, corporationInspectorLogin.getInspectorid() + "");
	urlThemCorporation.setParameter(Constants.CORPORATION_ID, corporationIdLogin);
	urlThemCorporation.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
	urlThemCorporation.setParameter("isNewCorporationInspector", "true");
	urlThemCorporation.setParameter("jspPage", "/portlet/quanlynguoidung/createCorporationInspector.jsp");
	
	PortletURL urlNhomDangKiemVien = renderResponse.createRenderURL();
	urlNhomDangKiemVien.setParameter("jspPage", "/portlet/quanlynguoidung/quanlyNhomDangKiemVien.jsp");
	
	PortletURL deleteUrl = renderResponse.createActionURL();
	deleteUrl.setParameter(ActionRequest.ACTION_NAME, "deleteDangKiemVien");
	
	// Ghi actionlog
	String noidungthaotac = "Mở xem Danh sách đăng kiểm viên thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Danh sách đăng kiểm viên";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<aui:form action="<%=deleteUrl.toString() %>" name="myForm" id="myForm" method="POST">
		<br>
			<button type="button" class="fa-left bt btxanhduong btn btn-default" style = "margin-bottom: 5px;" onclick="javascript: window.location = '<%=urlThemCorporation%>'">
				<liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.quanlydangkiemvien.taomoidangkiemvien"/>
			</button>
			
			<button type="button" class="fa-left bt btxanhduong btn btn-default" style = "margin-bottom: 5px;" onclick="javascript: window.location = '<%=urlNhomDangKiemVien%>'">
				Quản lý nhóm đăng kiếm viên
			</button>
			
			<table class="wd-table table">
				<caption style = "font-size: 20px"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.quanlydangkiemvien.danhsachdangkiemvien"/></caption>
				<input type="hidden" name="corporationInspector" id="corporationInspector" value="" />
				<input type="hidden" name="CORPORATION_INSPECTORID" id="CORPORATION_INSPECTORID" value="" />
				<thead>
					<tr>
						<th>STT</th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.quanlydangkiemvien.tendangkiemvien"/></th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.quanlydangkiemvien.dienthoai"/></th>
						<th>Email</th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.quanlydangkiemvien.doi"/></th>
						<th><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.quanlydangkiemvien.thaotac"/></th>
					</tr>
				</thead>
				<tbody>
				<%
				int index = 1;
				for (CorporationInspector item : lCorporationInspectors) {
					%>
					<tr>
						<td class="text-center"><%=(index++) + searchContainer.getStart() %></td>
						<td class="text-left"><%=item.getInspectorName() %></td>
						<td class="text-center"><%=item.getInspectorPhone() %></td>
						<td class="text-center"><%=item.getInspectorEmail() %></td>
						<td class="text-center"><%=DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0("Corporation", item.getCorporationId()).getName() %></td>
						<td class="text-center">
							<%
							PortletURL editUrl = renderResponse.createRenderURL();
							editUrl.setParameter(Constants.INSPECTOR_ID, item.getInspectorid() + "");
							editUrl.setParameter(Constants.CORPORATION_ID, item.getCorporationId());
							editUrl.setParameter(Constants.CORPORATION_INSPECTOR, String.valueOf(item.getId()));
							editUrl.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
							editUrl.setParameter("isNewCorporationInspector", "false");
							editUrl.setParameter("jspPage", "/portlet/quanlynguoidung/createCorporationInspector.jsp");
							
							%>
							<a href="<%=editUrl.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a>
							<a onclick="beforSummitForm('myForm', '<%=deleteUrl.toString()%>', '<%=String.valueOf(item.getId())%>')" class="aicon"><img src="<%=request.getContextPath()%>/img/huy.png"></a>
						</td>
					</tr>
					<%
				}
				%>
				</tbody>
			</table>
			<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
		</aui:form>
		<!-- 
		<button type="button" class="fa-left bt btxanhduong btn btn-default" style = "margin-bottom: 5px;" onclick="javascript: window.location = '<=returnURL%>'">
			<liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.quanlydangkiemvien.quaylai"/>
		</button>
		 -->
	</div>
</div>
<script type="text/javascript">
function changeajax(dataId) {
	
	var isCheck=document.getElementById(dataId).checked;
	var listVehicleRecordId=document.getElementById('corporationInspector').value;
	if (isCheck==true){
		//alert("--true");
		listVehicleRecordId=listVehicleRecordId+dataId+", ";
	}else{
		//alert("--false");
		var res = listVehicleRecordId.replace(dataId+", ", "");
		listVehicleRecordId=res;
	}
	document.getElementById('corporationInspector').value=listVehicleRecordId;
}

function beforSummitForm(idForm, url, id) {
	console.log('=beforSummitForm=' + idForm);
	var urlAction = document.getElementById('<portlet:namespace/>' + idForm).action;
	if (urlAction == '') {
		document.getElementById('<portlet:namespace/>' + idForm).action = url;
	}
	var status = confirm("Bạn có muốn tiếp tục xử lý?");
	if (status) {
		document.getElementById('CORPORATION_INSPECTORID').value = id;
		document.getElementById('<portlet:namespace/>' + idForm).submit(); 
	} else {
		document.getElementById('<portlet:namespace/>' + idForm).action = '';
	}
}
</script>