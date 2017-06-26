<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
	<%
	try {
		%>		
		<%@ include file="/portlet/chungchi/search_content_chungchi_find.jsp"%>
		<%@ include file="/portlet/chungchi/search_content_chungchi_result.jsp"%>
		<%
	} catch (Exception e) {
		//e.printStackTrace();
	}
	%>
	</div>
</div>

<%! private static Log _log = LogFactoryUtil.getLog("portlet_cauhinhmotcua_chuyendichtrangthai_chuyen_dich_trang_thai_jsp"); %>