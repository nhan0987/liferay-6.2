<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich"%>
<%@page import="vn.dtt.gt.dk.dao.aswmsg.model.impl.MonitorMessageQueueImpl"%>
<%@page import="vn.dtt.gt.dk.dao.aswmsg.service.MonitorMessageQueueLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
	// Ghi actionlog
	String noidungthaotac = "Mở xem Danh sách theo dõi phản hồi message thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
	String tenmanhinhdaidien = "Danh sách theo dõi phản hồi message";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);
	

	TthcKeHoachChuyenDich kehoachdc = null;
	List<TthcKeHoachChuyenDich> lstKehoachdc = TthcKeHoachChuyenDichLocalServiceUtil.getTthcKeHoachChuyenDichs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
	if (lstKehoachdc == null) { lstKehoachdc = new ArrayList<TthcKeHoachChuyenDich>(); }
	//if (monitor == null) { monitor = new MonitorMessageQueueImpl(); }
	
%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<table class="wd-table table">
			<caption style = "font-size: 13px;color:black;"><b>Theo dõi phản hồi</b></caption>
			<thead>
				<tr>
					<th style="width: 8%;">STT</th>
					<th style="width: 13.6667%;">Message Id</th>
					<th>Thời điểm cập nhập</th>
					<th style="width: 13.6667%;">Tên Doanh nghiệp</th>
					<th>Mã số hồ sơ</th>
					<th style="width: 7%;">Thao tác</th>
				</tr>
			</thead>
			<tbody>
				<%
				int index = 1;
				TthcHoSoThuTuc hoSoThuTuc = null;
				for (TthcKeHoachChuyenDich item : lstKehoachdc) {
					
					PortletURL urlPortlet =  renderResponse.createActionURL();
					urlPortlet.setParameter(ActionRequest.ACTION_NAME, "refeshKeHoachDichChuyen");
					urlPortlet.setParameter("keHoachChuyenDichId", item.getId() + "");
					
					try {
						hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(item.getPhieuXuLyChinhId());
					} catch(Exception e) {
					}
				%>
				<tr>
					<td class="text-center"><%=index++ %></td>
					<td class="text-center"><%=item.getMessageId()%></td>
					<td class="text-center"><%=DateUtils.dateToString("dd/MM/yyyy HH:mm", item.getThoiDiemCapNhat())%></td>
					<td class="text-center"><%=(hoSoThuTuc != null) ? hoSoThuTuc.getTenChuHoSo() : ""%></td>
					<td class="text-center"><%=(hoSoThuTuc != null) ? hoSoThuTuc.getMaSoHoSo() : ""%></td>
					<td class="text-center">
						<a href="<%=urlPortlet.toString()%>" class="aicon" title="Hỏi lại"><i class="icon20 iconm5 fa fa-pencil"></i></a>
					</td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</div>