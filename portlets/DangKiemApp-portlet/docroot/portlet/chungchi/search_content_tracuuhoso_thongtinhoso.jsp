<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
<%
try {
	%>
		<%@ include file="/portlet/chungchi/search_content_tracuuhoso_find.jsp"%>
		<%@ include file="/portlet/chungchi/search_content_tracuuhoso_result_thongtinhoso.jsp"%>
	<%
} catch (Exception e) {
	//e.printStackTrace();
}
%>
</div>
</div>