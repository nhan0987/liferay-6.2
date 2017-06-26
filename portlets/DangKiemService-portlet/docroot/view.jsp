<%@page import="vn.dtt.gt.dk.schedule.util.BusinessUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>DangKiemService</b> portlet.

<%
String cmd = ParamUtil.getString(request, "cmd");

if(cmd.equals("doStatistic")) {
	BusinessUtil.doStatistics();
} else if(cmd.equals("doPushAPI")) {
	BusinessUtil.doPushAPI();
}
%>

<portlet:renderURL var="doStatisticURL">
	<portlet:param name="jspPage" value="/view.jsp"/>
</portlet:renderURL>

<form name='<portlet:namespace/>fm' id='<portlet:namespace/>fm' method="post" action="<%= doStatisticURL %>">
	<input type="hidden" name='<portlet:namespace/>cmd' id='<portlet:namespace/>cmd' value="">
	
	<button type="button" name=doStatistic value="doStatistic" onclick="submitForm('doStatistic');">doStatistic</button>
	
	<button type="button" name=doPushAPI value="doPushAPI" onclick="submitForm('doPushAPI');">doPushAPI</button>
</form>

<script type="text/javascript">
function submitForm(action) {
	document.getElementById('<portlet:namespace/>cmd').value = action;
	document.getElementById('<portlet:namespace/>fm').submit();
}
</script>