<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>


<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
	<%
	try {
		%>
				
		<%@ include file="/portlet/chungchi/search_content_phuongtiennhapkhau_find.jsp"%>
		<%@ include file="/portlet/chungchi/search_content_phuongtiennhapkhau_result.jsp"%>
		<%
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	%>
	</div>
</div>

