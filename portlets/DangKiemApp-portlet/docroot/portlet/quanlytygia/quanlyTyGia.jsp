<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.NewExchangeRateLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateImpl"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
	NewExchangeRate exRate = null;
	List<NewExchangeRate> lstNewExchangeRates = NewExchangeRateLocalServiceUtil.getNewExchangeRates(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	if (lstNewExchangeRates == null) { lstNewExchangeRates = new ArrayList<NewExchangeRate>(); }
	if (exRate == null) { exRate = new NewExchangeRateImpl(); }
	
	/**
	PortletURL urlThemNhomKiemTra =  renderResponse.createRenderURL();
	urlThemNhomKiemTra.setParameter(Constants.CORPORATION_ID, corporationInspector.getCorporationId());
	urlThemNhomKiemTra.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
	urlThemNhomKiemTra.setParameter("jspPage", "/portlet/quanlynguoidung/createCorporationTeam.jsp");
	
	PortletURL urlDangKiemVien =  renderResponse.createRenderURL();
	urlDangKiemVien.setParameter(Constants.CORPORATION_ID, corporationInspector.getCorporationId());
	urlDangKiemVien.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
	urlDangKiemVien.setParameter("jspPage", "/portlet/quanlynguoidung/quanlyDangKiemVien.jsp");
	*/
	
	
	// Ghi actionlog
	String noidungthaotac = "Mở xem Danh sách tỉ giá thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Danh sách tỉ giá";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<table class="wd-table table">
			<caption style = "font-size: 13px;color:black;"><b><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.danhsachtigia"/></b></caption>
			<thead>
				<tr>
					<th style="width: 8%;">STT</th>
					
					<th style="width: 13.6667%;"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.basiccurrency"/></th>
					<th style="width: 13.6667%;"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.exchangerate"/></th>
					<th style="width: 13.6667%;"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.originalcurrency"/></th>
					<th style="width: 13.6667%;"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.publishdate"/></th>
					<th style="width: 13.6667%;"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.validfrom"/></th>
					<th style="width: 13.6667%;"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.validuntil"/></th>
					
					<th style="width: 10%;"><liferay-ui:message key="vn.gt.dk.qlhs.quanlytigia.thaotac"/></th>
					
				</tr>
			</thead>
			<tbody>
				<%
				int index = 1;
				for (NewExchangeRate item : lstNewExchangeRates) {
					PortletURL editUrl =  renderResponse.createRenderURL();
					editUrl.setParameter("jspPage", "/portlet/quanlytygia/crudNewExchangeRate.jsp");
					editUrl.setParameter(Constants.NewExchangeRate_ID, item.getId() + "");
					editUrl.setParameter("isNew", "false");
					editUrl.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
					
					PortletURL deleteUrl =  renderResponse.createActionURL();
					deleteUrl.setParameter(ActionRequest.ACTION_NAME, "deleteNewExchangeRate");
					deleteUrl.setParameter(Constants.NewExchangeRate_ID, item.getId() + "");
				%>
				<tr>
					<td class="text-center"><%=index++ %></td>
					<td class="text-center"><%=item.getBasicCurrency()%></td>
					<td class="text-center"><%=item.getExchangeRate()%></td>
					<td class="text-center"><%=item.getOriginalCurrency()%></td>
					<td class="text-center"><%=item.getPublishDate()%></td>
					<td class="text-center"><%=item.getValidFrom()%></td>
					<td class="text-center"><%=item.getValidUntil()%></td>
					
					<td class="text-center">
						<a href="<%=editUrl.toString() %>" class="aicon"><i class="icon20 iconm5 fa fa-pencil"></i></a>
						<a href="<%=deleteUrl.toString() %>"><img src="<%=request.getContextPath()%>/img/huy.png"></a>
					</td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
		
		<%-- 
		<button type="button" style="margin-bottom: 8px; margin-top: 8px; margin-right: 10px;"
				class="fa-right bt btxanhduong btn btn-default"
				onclick="javascript: window.location = '<%=urlDangKiemVien%>'">Quay lại
		</button>
		--%>
	</div>
</div>