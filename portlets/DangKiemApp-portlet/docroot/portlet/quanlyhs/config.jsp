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
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoConfiguration"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/portlet/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(renderRequest);
String value = resourcePrefs.getValue(Constants.LOAD_DATABASE_MOTCUA, "");
System.out.println("=====value=====" + value);
%>
<form action="<liferay-portlet:actionURL portletConfiguration="true" />" method="post" name="<portlet:namespace />fm">
    <table>
        <tr>
            <td><liferay-ui:message key="vn.gt.dk.qlhs.config.trangthaimacdinhcuaportlet"/></td>
            <td>
                <select name="<portlet:namespace /><%=Constants.LOAD_DATABASE_MOTCUA %>" id = "<portlet:namespace /><%=Constants.LOAD_DATABASE_MOTCUA %>">
                	<option value=""><liferay-ui:message key="vn.gt.dk.qlhs.config.khongloctheotrangthai"/></option>
					<option value="<%=QuanLyHoSoConfiguration.LOAD_DATABASE_MOTCUA_TRUE%>"  <%= (QuanLyHoSoConfiguration.LOAD_DATABASE_MOTCUA_TRUE.compareToIgnoreCase(value) == 0) ? "selected" : "" %> >
				         <liferay-ui:message key="vn.gt.dk.qlhs.config.coketnoidulieumotcua"/>
					</option>
					<option value="<%=QuanLyHoSoConfiguration.LOAD_DATABASE_MOTCUA_FALSE%>"  <%= (QuanLyHoSoConfiguration.LOAD_DATABASE_MOTCUA_FALSE.compareToIgnoreCase(value) == 0) ? "selected" : "" %> >
				         <liferay-ui:message key="vn.gt.dk.qlhs.config.khongketnoidulieumotcua"/>
					</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Ghi lại cấu hình"/> 
            </td>
        </tr>
    </table>
</form>