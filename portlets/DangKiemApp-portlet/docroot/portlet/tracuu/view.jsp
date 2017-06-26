<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
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

String maSoHoSo= ParamUtil.getString(request, "maSoHoSo").trim();
PortletURL searchUrl = renderResponse.createActionURL();
searchUrl.setParameter(ActionRequest.ACTION_NAME, "searchTraCuu");


// Ghi actionlog
String noidungthaotac = "Mở xem Danh sách kiểm tra định dạng trao đổi message thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
String tenmanhinhdaidien = "Danh sách kiểm tra định dạng trao đổi message";
String importername = "";
String inspectorname = user.getScreenName();
long inspectorid = user.getUserId();
QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>

<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<aui:form action="<%=searchUrl.toString()%>" name="myForm" id="myForm" method="POST">
			<table class="wd-table table">
				<tbody>
					<tr>
						<td class="text-left"><liferay-ui:message key="vn.gt.dk.qlhs.tracuu.view.masohoso" /></td>
						<td class="text-left"><input type="text" name="maSoHoSo" id="maSoHoSo" class="egov-inputfield" style="width: 200px;" value='<%=maSoHoSo%>' /></td>
						<td class="text-left">
							<button type="submit" class="fa-left bt btxanhduong btn btn-default" style="">
								<liferay-ui:message key="vn.gt.dk.qlhs.tracuu.view.timkiem" />
							</button>
						</td>
					</tr>
				</tbody>
			</table>
		</aui:form>
		<%
		PortletURL portletUrl = renderResponse.createRenderURL();
		portletUrl.setParameter("maSoHoSo", maSoHoSo);
		%>
		<table class="wd-table table">
			<thead>
				<tr>
					<th width="15px">STT</th>
					<th>MessageLogId</th>
					<th>TagName</th>
					<th>ValidationCode</th>
					<th>Description</th>
					<th>Xml</th>
				</tr>
			</thead>
			<tbody>
			<%
				if (maSoHoSo != null && maSoHoSo.trim().length() > 0) {
					List<AswmsgValidationLog> logmessage = AswmsgValidationLogLocalServiceUtil.findByMaSoHoSo(maSoHoSo);
					int index = 1;
					for (AswmsgValidationLog aswmsgValidationLog : logmessage) {
					
					PortletURL addMemberNhomKiemTra =  renderResponse.createRenderURL();
					addMemberNhomKiemTra.setParameter("MessageLogId", String.valueOf(aswmsgValidationLog.getMessageLogId()));
					addMemberNhomKiemTra.setParameter("jspPage", "/portlet/tracuu/downLoadContentXML.jsp");
					addMemberNhomKiemTra.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());
				%>
				<tr>
					<td><%=index++%></td>
					<td class="text-left"><%=aswmsgValidationLog.getMessageLogId() %></td>
					<td class="text-left"><%=aswmsgValidationLog.getTagName() %></td>
					<td class="text-left"><%=aswmsgValidationLog.getValidationCode()%></td>
					<td class="text-left"><%=aswmsgValidationLog.getDescription()%></td>
					<td class="text-left"><a href="<%=addMemberNhomKiemTra.toString() %>"><liferay-ui:message key="vn.gt.dk.qlhs.tracuu.view.xemdulieu" /></a></td>
				</tr>
				<%
					}
				}
			%>
			</tbody>
		</table>
	</div>
</div>