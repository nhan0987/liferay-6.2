<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<%
		try {
		%>
		<%@ include file="/portlet/quanlyhs/search_content_find.jsp"%>
		<%@ include file="/portlet/quanlyhs/search_content_result.jsp"%>
		<%
		} catch (Exception es1) {
			//es1.printStackTrace();
		}
		%>
	</div>
</div>