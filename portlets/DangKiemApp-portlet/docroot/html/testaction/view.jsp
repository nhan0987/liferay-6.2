<%--
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/
--%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/portlet/init.jsp"%>
<portlet:defineObjects />

<%
PortletURL tiepNhanHoSo = renderResponse.createActionURL();
tiepNhanHoSo.setParameter(ActionRequest.ACTION_NAME, "tiepNhanHoSo");
%>
<aui:form action="<%=tiepNhanHoSo.toString()%>" name="tiepNhan" id="tiepNhan" method="POST">
	<div id="tiepNhan">
		<table>
			<tr>
				<td><span>Số ĐKKT:</span></td>
				<td>
					registeredNumber:<input type="text" name="registeredNumber" id="registeredNumber" class="form-control">
					hoSoThuTucId:<input type="text" name="hoSoThuTucId" id="hoSoThuTucId" class="form-control">
					dieuKienChuyenDich:<input type="text" name="dieuKienChuyenDich" id="dieuKienChuyenDich" class="form-control">
					goiham:<input type="text" name="goiham" id="goiham" class="form-control">
					phieuXuLyPhuId:<input type="text" name="phieuXuLyPhuId" id="phieuXuLyPhuId" class="form-control">
					messageId:<input type="text" name="messageId" id="messageId" class="form-control">
					version:<input type="text" name="version" id="version" class="form-control">
				</td>
			</tr>
			<tr>
				<td><span>Số ĐKKT:</span></td>
				<td>
					corporationId:<input type="text" name="corporationId" id="corporationId" class="form-control">
					inspectorId:<input type="text" name="inspectorId" id="inspectorId" class="form-control">
					teamLeaderId:<input type="text" name="teamLeaderId" id="teamLeaderId" class="form-control">
					inpectionDate:<input type="text" name="inpectionDate" id="inpectionDate" class="form-control">
					
				</td>
			</tr>
		</table>
		<aui:button-row>
			<input type="submit" id="tiepNhanVaChuyen" name="tiepNhanVaChuyen" value="Tiếp nhận và chuyển trưởng bộ phận" class="btnThuLyHS form-control">
		</aui:button-row>
	</div>
</aui:form>