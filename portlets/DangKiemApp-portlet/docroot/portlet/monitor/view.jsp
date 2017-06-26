<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@ include file="/portlet/init.jsp"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java"%>
<%
try {
	
	
	
	HttpSession httpSession = null;
	try {
		httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
	} catch (Exception es) {}
	
	String maPhanNhom = "";
	if (httpSession != null) {
		Object obj = httpSession.getAttribute(Constants.MAPHANNHOMHOSO);
		if (obj != null) {
			maPhanNhom = obj.toString();
		} else {
			maPhanNhom = "";
		}
	}
	
	System.out.println(maPhanNhom);
	
	if (maPhanNhom != null) {
		if ("67".equalsIgnoreCase(maPhanNhom)) {
			%>
			<jsp:include page="/portlet/monitor/quanlyMonitor.jsp"></jsp:include>
			<%
		} else if ("68".equalsIgnoreCase(maPhanNhom)) {
			%>
			<jsp:include page="/portlet/monitor/theo_doi_phan_hoi_results.jsp"></jsp:include>
			<%
		}
	} else {
		%>
		<jsp:include page="/portlet/monitor/quanlyMonitor.jsp"></jsp:include>
		<%
	}
} catch (Exception es) {
	//es.printStackTrace();
}
%>