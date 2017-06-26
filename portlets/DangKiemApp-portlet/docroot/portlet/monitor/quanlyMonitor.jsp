<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueImpl"%>
<%@page import="vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
	MonitorMessageQueue monitor = null;
	List<MonitorMessageQueue> lstMonitorMessageQueues = MonitorMessageQueueLocalServiceUtil.findAll();
	
	if (lstMonitorMessageQueues == null) { lstMonitorMessageQueues = new ArrayList<MonitorMessageQueue>(); }
	if (monitor == null) { monitor = new MonitorMessageQueueImpl(); }
	
	
	// Ghi actionlog
	String noidungthaotac = "Mở xem Danh sách quản lý giám sát gửi message thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Danh sách quản lý giám sát message";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

	
%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<table class="wd-table table">
			<caption style = "font-size: 13px;color:black;"><b>Quản lý Monitor Message</b></caption>
			<thead>
				<tr>
					<th style="width: 8%;">STT</th>
					<th style="width: 13.6667%;">Mã số hồ sơ</th>
					<th>Mã cơ quan gửi</th>
					<th style="width: 13.6667%;">Người nhận</th>
					<th>Mã cơ quan nhận</th>
					<th style="">Type</th>
					<th style="width: 10%;">Function</th>
					<th style="width: 8%;">Độ ưu tiên</th>
					<th style="width: 8%;">Số lần gửi</th>
					<th style="width: 7%;">Thao tác</th>
				</tr>
			</thead>
			<tbody>
				<%
				int index = 1;
				for (MonitorMessageQueue item : lstMonitorMessageQueues) {
					
					PortletURL urlPortlet =  renderResponse.createActionURL();
					urlPortlet.setParameter(ActionRequest.ACTION_NAME, "refeshMonitor");
					urlPortlet.setParameter("monitorMessageId", item.getId() + "");
					
					PortletURL urlSendVNPT =  renderResponse.createActionURL();
					urlSendVNPT.setParameter(ActionRequest.ACTION_NAME, "refeshMonitorVNPT");
					urlSendVNPT.setParameter("monitorMessageId", item.getId() + "");
					
				%>
				<tr>
					<td class="text-center"><%=index++ %></td>
					<td class="text-center"><%=item.getPreReference()%></td>
					<td class="text-center"><%=item.getSenderMinistryCode()%></td>
					<td class="text-center"><%=item.getReceiverName()%></td>
					<td class="text-center"><%=item.getReceiverMinistryCode()%></td>
					<td class="text-center"><%=item.getType()%></td>
					<td class="text-center"><%=item.getFunction()%></td>
					<td class="text-center"><%=item.getPriority()%></td>
					<td class="text-center"><%=item.getSoLanGui()%></td>
					<%
					if((item!=null)&&(item.getReceiverUnitCode().length() > 0)&&(item.getReceiverUnitCode().equalsIgnoreCase(Constants.UNITCODE_VNPT))){	
					%>
								<td class="text-center"><a href="<%=urlSendVNPT%>" class="aicon" title="Gửi VNPT"><i class="icon20 iconm5 fa fa-pencil"></i></a></td>
					<%
						}else if((item!=null)&&(item.getReceiverUnitCode().length() > 0)&&(item.getReceiverUnitCode().equalsIgnoreCase(Constants.UNITCODE_TCT))){
						%>
							<td class="text-center"><i>Chưa hoạt động</i></td>
						<%	
						} else{					
						%>
					<td class="text-center">
						<a href="<%=urlPortlet.toString() %>" class="aicon" title="Gửi lại"><i class="icon20 iconm5 fa fa-pencil"></i></a>
					</td>
					<%	
						} 					
						%>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</div>