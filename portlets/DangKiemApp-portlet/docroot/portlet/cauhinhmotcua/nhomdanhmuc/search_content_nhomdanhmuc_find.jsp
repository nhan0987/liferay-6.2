<%@page import="vn.dtt.gt.dk.dao.common.service.DmDataGroupLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.DmDataGroup"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ include file="/portlet/init.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%
String tenDanhMuc = ParamUtil.getString(request, "tenDanhMuc");
String tenAnhXa = ParamUtil.getString(request, "tenAnhXa");
%>
<portlet:actionURL name="searchNhomDanhMuc" var="searchNhomDanhMuc">
</portlet:actionURL>

<aui:form action="<%=searchNhomDanhMuc.toString()%>" name="myForm" id="myForm" method="POST">
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<div tabindex="0" class="CollapsiblePanelTab">
			<h5 class="tieude">Tìm kiếm nhóm danh mục<i class="fa-right fa fa-angle-down"></i></h5>
			<h5></h5>
		</div>
		<div class="CollapsiblePanelContent" style="display: block;">
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Tên danh mục</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<input type="text" placeholder="nhập tên danh mục" class="form-control-find" name="tenDanhMuc" id="tenDanhMuc" value="<%=tenDanhMuc%>" />
						</div>
						<div class="col-xs-3 col-sm-3 col-md-14">
							<label class="textlabel">Tên ánh xạ</label>
						</div>
						<div class="col-xs-3 col-sm-3 col-md-15" style="margin-left: -35px;">
							<input type="text" placeholder="nhập tên ánh xạ" class="form-control-find" name="tenAnhXa" id="tenAnhXa" value="<%=tenAnhXa%>" />
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<button type="submit" class="fa-right bt btxanhduong btn btn-default"><liferay-ui:message key="vn.gt.dk.qlhs.button.timkiem" /></button>
				</div>
			</div>
		</div>
	</div>
</aui:form>

<%
	PortletURL portletUrl = renderResponse.createRenderURL();
	portletUrl.setParameter("tenDanhMuc", tenDanhMuc);
	portletUrl.setParameter("tenAnhXa", tenAnhXa);


SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 15, portletUrl, null, "");

List<DmDataGroup> lstDataGroups = null;

long longTotal = 0;

	lstDataGroups = DmDataGroupLocalServiceUtil.findDmDataGroupByTenDanhMucTenAnhXa(tenDanhMuc, tenAnhXa, searchContainer.getStart(), searchContainer.getEnd());
	longTotal = DmDataGroupLocalServiceUtil.countDmDataGroupByTenDanhMucTenAnhXa(tenDanhMuc, tenAnhXa);

	searchContainer.setTotal(Integer.parseInt(String.valueOf(longTotal)));
	searchContainer.setResults(lstDataGroups);
%>
<table class="wd-table table">
	<thead>
		<tr>
			<th>STT</th>
			<th>Mã nhóm</th>
			<th>Tên danh mục</th>
			<th>Tên ánh xạ</th>
		</tr>
	</thead>
	<tbody>
	<%
		int index = 1;
		for (DmDataGroup dmDataGroup : lstDataGroups) {
			%>
			<tr>
				<td class="text-center"><%= (index++) + searchContainer.getStart() %></td>
				<td class="text-center"><%=dmDataGroup.getCode()%></td>
				<td class="text-center"><%=dmDataGroup.getDescription()%></td>
				<td class="text-center"><%=dmDataGroup.getName()%></td>
			</tr>
			<%
		}
	%>
	</tbody> 
</table>
<liferay-ui:search-paginator searchContainer="<%= searchContainer %>" />
<br><br><br>