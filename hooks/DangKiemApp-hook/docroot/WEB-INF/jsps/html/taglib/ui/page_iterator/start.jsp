<%--
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

<%@ include file="/html/taglib/init.jsp" %>
<%@page pageEncoding="UTF-8"%>

<%
String formName = namespace + request.getAttribute("liferay-ui:page-iterator:formName");
int cur = GetterUtil.getInteger((String)request.getAttribute("liferay-ui:page-iterator:cur"));
String curParam = (String)request.getAttribute("liferay-ui:page-iterator:curParam");
int delta = GetterUtil.getInteger((String)request.getAttribute("liferay-ui:page-iterator:delta"));
boolean deltaConfigurable = GetterUtil.getBoolean((String)request.getAttribute("liferay-ui:page-iterator:deltaConfigurable"));
String deltaParam = (String)request.getAttribute("liferay-ui:page-iterator:deltaParam");
String jsCall = GetterUtil.getString((String)request.getAttribute("liferay-ui:page-iterator:jsCall"));
int maxPages = GetterUtil.getInteger((String)request.getAttribute("liferay-ui:page-iterator:maxPages"));
String target = (String)request.getAttribute("liferay-ui:page-iterator:target");
int total = GetterUtil.getInteger((String)request.getAttribute("liferay-ui:page-iterator:total"));
String type = (String)request.getAttribute("liferay-ui:page-iterator:type");
String url = (String)request.getAttribute("liferay-ui:page-iterator:url");
String urlAnchor = (String)request.getAttribute("liferay-ui:page-iterator:urlAnchor");
int pages = GetterUtil.getInteger((String)request.getAttribute("liferay-ui:page-iterator:pages"));

int start = (cur - 1) * delta;
int end = cur * delta;

if (end > total) {
	end = total;
}

int resultRowsSize = delta;

if (total < delta) {
	resultRowsSize = total;
}
else {
	resultRowsSize = total - ((cur - 1) * delta);

	if (resultRowsSize > delta) {
		resultRowsSize = delta;
	}
}

String deltaURL = HttpUtil.removeParameter(url, namespace + deltaParam);

NumberFormat numberFormat = NumberFormat.getNumberInstance(locale); 
%>


<p class="flleft">Tổng số: <span class="textts"><%=total %></span></p>

     <%
     if (total > delta) {
         %>
         <ul class="mt0 flright pagination">
         <%
         if (cur > 1) {
         %>
             <li><a href="<%=_getHREF(formName, curParam, 1, jsCall, url, urlAnchor) %>"><i class="fa fa-angle-double-left"></i></a></li>
             <li><a href="<%=_getHREF(formName, curParam, cur - 1, jsCall, url, urlAnchor) %>"><i class="fa fa-angle-left"></i></a></li>
          <%
         }
          int totalPages = 0;
          if (total % delta == 0) {
              totalPages = total / delta;
          } else {
        	  totalPages = ((total - (total % delta)) / delta) + 1;
          }

          boolean statusFirst = true;
          boolean statusLast = true;
          for (int i = 1; i <= totalPages; i++) {
             if (totalPages > 5) {
            	 if (i == cur) {
                     %>
                     <li class="active"><a href="<%=_getHREF(formName, curParam, i, jsCall, url, urlAnchor) %>" class="fb"><%=i %><span class="sr-only">(current)</span></a></li>
                     <%
                 } else if ((i == (cur - 1)) || (i == (cur + 1))) {
                 %>
                     <li><a href="<%=_getHREF(formName, curParam, i, jsCall, url, urlAnchor) %>"><%=i %></a></li>
                 <%
                 } else if ((i < (cur - 1)) && statusFirst) {
                	 statusFirst = false;
                	 %>
                     <li><a href="#">...</a></li>
                 <%
                 } else if ((i > (cur + 1)) && statusLast) {
                	 statusLast = false;
                     %>
                     <li><a href="#" >...</a></li>
                 <%
                 }
             } else {
            	 if (i == cur) {
                     %>
                     <li class="active"><a href="<%=_getHREF(formName, curParam, i, jsCall, url, urlAnchor) %>" class="fb"><%=i %><span class="sr-only">(current)</span></a></li>
                     <%
                 } else {
                 %>
                     <li><a href="<%=_getHREF(formName, curParam, i, jsCall, url, urlAnchor) %>"><%=i %></a></li>
                 <%
                 }
             }
          }

          if (cur < totalPages) {
          %>
              <li><a href="<%=_getHREF(formName, curParam, cur + 1, jsCall, url, urlAnchor) %>"><i class="fa fa-angle-right"></i></a></li>
              <li><a href="<%=_getHREF(formName, curParam, totalPages, jsCall, url, urlAnchor) %>"><i class="fa fa-angle-double-right"></i></a></li>
          <%
          }
          %>
         </ul>
         <%
     }
     %>
     
<br>
<br>
<%!
private String _getHREF(String formName, String curParam, int cur, String jsCall, String url, String urlAnchor) throws Exception {
	String href = null;

	if (Validator.isNotNull(url)) {
		href = HtmlUtil.escape(url + curParam + "=" + cur + urlAnchor);
	}
	else {
		href = "javascript:document." + formName + "." + curParam + ".value = '" + cur + "'; " + jsCall;
	}

	return href;
}
%>