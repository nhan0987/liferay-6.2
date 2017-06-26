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

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ include file="/portlet/init.jsp"%>
<%! private static Log _log = LogFactoryUtil.getLog("portlet_cauhinhmotcua_chuyendichtrangthai_chuyen_dich_trang_thai_jsp"); %>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<%
		try {
		%>
		<%@ include file="/portlet/cauhinhmotcua/chuyendichtrangthai/search_content_chuyen_dich_tt_find.jsp"%>
		<%@ include file="/portlet/cauhinhmotcua/chuyendichtrangthai/search_content_chuyen_dich_tt_result.jsp"%>
		
		<%
		} catch (Exception e) {
			_log.error(e);
		}
		%>
	</div>
</div>