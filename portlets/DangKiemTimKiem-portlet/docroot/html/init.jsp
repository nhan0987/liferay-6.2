<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>



<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>

<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="javax.portlet.PortletPreferences"%>

<%@page import="vn.dtt.gt.dk.portlet.timkiem.TimKiemAction"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/main.css">