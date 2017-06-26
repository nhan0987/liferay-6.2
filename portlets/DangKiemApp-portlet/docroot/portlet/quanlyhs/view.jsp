<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@ include file="/portlet/init.jsp"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java"%>


<%
	Object maPhanNhom = renderRequest.getPortletSession().getAttribute(Constants.MAPHANNHOMHOSO);
%>
<jsp:include page="/portlet/quanlyhs/search_content.jsp"></jsp:include>