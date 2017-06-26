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


<%@page import="vn.dtt.gt.dk.portlet.cauhinh.CauHinhConstant"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@ include file="/portlet/init.jsp"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java"%>
<%
	System.out.println("cauhinhmotcua/chuyendichtrangthai/view.jsp ");
	String loaiConfig = ParamUtil.getString(request, "loaiConfig");
	System.out.println("loaiConfig :" + loaiConfig);
	if(Integer.parseInt(loaiConfig) == CauHinhConstant.CHUYEN_DICH_TRANG_THAI){
%>
<jsp:include page="/portlet/cauhinhmotcua/chuyendichtrangthai/chuyen_dich_trang_thai.jsp"></jsp:include>
<%
	}else if(Integer.parseInt(loaiConfig) == CauHinhConstant.THANH_PHAN_HO_SO){
%>
<jsp:include page="/portlet/cauhinhmotcua/thanhphanhoso/tthc_thanhphanhoso.jsp"></jsp:include>
<%
	}else if(Integer.parseInt(loaiConfig) == CauHinhConstant.THU_TUC_HANH_CHINH){
%>
<jsp:include page="/portlet/cauhinhmotcua/thutuchanhchinh/tthc_thu_tuc_hanh_chinh.jsp"></jsp:include>
<%
	}
%>