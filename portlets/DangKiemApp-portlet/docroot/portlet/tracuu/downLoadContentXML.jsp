<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageLogLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.aswmsg.service.AswmsgValidationLogLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog"%>
<%@page import="vn.dtt.gt.dk.utils.format.FormatData"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%
String MessageLogId = ParamUtil.getString(request, "MessageLogId");
System.out.println("=============MessageLogId===========" + MessageLogId);
String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);
AswmsgMessageLog aswmsgMessageLog = null;
try {
	aswmsgMessageLog = AswmsgMessageLogLocalServiceUtil.fetchAswmsgMessageLog(ConvertUtil.convertToLong(MessageLogId));
} catch (Exception es) {
	//es.printStackTrace();
}
%>

<div class="aui-w80 portlet-column portlet-column-last" id="column-2">
	<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
		<div class="col-md-12" id="main">
			<table class="wd-table table" width="100%">
				<tbody>
					<tr>
						<td width="50%"><liferay-ui:message key="vn.gt.dk.qlhs.tracuu.downloadcontentxml.masohoso" /></td>
						<td width="50%"><input type="text" readonly="readonly" <%=Validator.isNotNull(aswmsgMessageLog) ? aswmsgMessageLog.getPreReference() : "" %> />
						</td>
					</tr>
					<tr>
						<td width="50%">MesageId:</td>
						<td width="50%"><input type="text" readonly="readonly" <%=Validator.isNotNull(aswmsgMessageLog) ? aswmsgMessageLog.getMessageId() : "" %> />
						</td>
					</tr>
					<tr>
						<td width="100%" colspan="2"><textarea rows="4" cols="50" style="width: 100%"><%=Validator.isNotNull(aswmsgMessageLog) ? aswmsgMessageLog.getAllContent() : ""%></textarea>
						</td>
					</tr>
				</tbody>
			</table>
			<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'">
				<liferay-ui:message key="vn.gt.dk.qlhs.tracuu.downloadcontentxml.quaylai" />
			</button>
		</div>
	</div>
</div>

