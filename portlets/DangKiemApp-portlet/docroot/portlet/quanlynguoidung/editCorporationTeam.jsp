<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>

<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam"%>
<%@page import="vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee"%>
<%@page import="java.util.List"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%
String corporationId = ParamUtil.getString(request, Constants.CORPORATION_ID);
String inspectorTeam = ParamUtil.getString(request, Constants.INSPECTOR_TEAM);
String returnURL = ParamUtil.getString(request, Constants.RETURN_URL);
int trangThai = 0;
CorporationTeam corporationTeam = null;
if (inspectorTeam != null && inspectorTeam.trim().length() > 0) {
	corporationTeam = CorporationTeamLocalServiceUtil.fetchCorporationTeam(ConvertUtil.convertToLong(inspectorTeam));
	trangThai = corporationTeam.getMarkUpDelete();
}
LogFactoryUtil.getLog(DangKiemAction.class).debug("======1==returnURL=======" + returnURL);
if ((returnURL == null && returnURL.trim().length() == 0) || (returnURL != null && !returnURL.trim().contains("group"))) {
	PortletURL returnUrlB =  renderResponse.createRenderURL();
	returnUrlB.setParameter("jspPage", "/portlet/quanlynguoidung/view.jsp");
	returnURL = returnUrlB.toString();
}
LogFactoryUtil.getLog(DangKiemAction.class).debug("===2=====returnURL=======" + returnURL);
PortletURL themCorporationTeam = renderResponse.createRenderURL();
themCorporationTeam.setParameter("jspPage", "/portlet/quanlynguoidung/listDangKiemVien.jsp");
themCorporationTeam.setParameter(Constants.CORPORATION_ID, corporationId);
themCorporationTeam.setParameter(Constants.INSPECTOR_TEAM, inspectorTeam);
themCorporationTeam.setParameter(Constants.RETURN_URL, themeDisplay.getURLCurrent());


//Ghi actionlog
String noidungthaotac = "Vào chức năng Chỉnh sửa nhóm đăng kiểm viên thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
String tenmanhinhdaidien = "Chỉnh sửa Nhóm đăng kiểm viên kiểm tra hiện trường";
String importername = "";
String inspectorname = user.getScreenName();
long inspectorid = user.getUserId();
QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);


%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
		<br>
			<div class="col-md-12" id="main">
				<div class="CollapsiblePanelContent" style="display: block; margin-top: 15px;">
				<br>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.editcorporationteam.tennhom"/></label>
								<input type="hidden" name="<%=Constants.INSPECTOR_TEAM %>" id="<%=Constants.INSPECTOR_TEAM %>" value="<%=inspectorTeam%>" />
								<input type="hidden" name="<%=Constants.CORPORATION_ID %>" id="<%=Constants.CORPORATION_ID %>" value="<%=corporationId%>" />
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<input type="text" style="width: 400px" disabled="disabled" placeholder="nhập tên nhóm" class="form-control-find" name="tenNhom" id="tenNhom" value="<%=Validator.isNotNull(corporationTeam) ? corporationTeam.getTeamName() : ""%>" />
							</div>
						</div>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.editcorporationteam.trangthai"/></label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<select id="MarkUpDelete" name="MarkUpDelete" disabled="disabled" style="width: 200px">
		                             <option <%=(trangThai == Constants.MarkUpDelete_da_xoa) ? "selected" : ""%> value="<%=Constants.MarkUpDelete_da_xoa %>">Đã xóa</option>
		                             <option <%=(trangThai == Constants.MarkUpDelete_chua_xoa) ? "selected" : ""%> value="<%=Constants.MarkUpDelete_chua_xoa %>">Chưa xóa</option>
		                        </select>
							</div>
						</div>
						
						<div class="CollapsiblePanelContent" style="display: block;">
							<div class="row">
								<div class="col-xs-10 col-sm-10 col-md-10">
									<div class="row">
										<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=themCorporationTeam%>'"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.editcorporationteam.themdangkiemvien"/></button>
										<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.editcorporationteam.quaylai"/></button>
									</div>
								</div>
							</div>
						</div>
					<br>
			</div>
		</div>
		
		<table class="wd-table table">
			<thead>
				<tr>
					<th>STT</th>
					<th><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.editcorporationteam.tendangkiemvien"/></th>
					<th><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.editcorporationteam.dienthoai"/></th>
					<th>Email</th>
					<th><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.editcorporationteam.thaotac"/></th>
				</tr>
			</thead>
			<tbody>
			<%
			int index = 1;
			List<CorporationInspector> liCorporationInspectors = CorporationInspectorLocalServiceUtil.findByTeamId(ConvertUtil.convertToLong(inspectorTeam));
			for (CorporationInspector corporationInspector : liCorporationInspectors) {
				PortletURL DeleteNhomKiemTra =  renderResponse.createActionURL();
				DeleteNhomKiemTra.setParameter(Constants.CORPORATION_INSPECTOR, String.valueOf(corporationInspector.getId()));
				DeleteNhomKiemTra.setParameter(ActionRequest.ACTION_NAME, "editCorporationInspector");
				DeleteNhomKiemTra.setParameter(Constants.CORPORATION_ID, corporationId);
				DeleteNhomKiemTra.setParameter(Constants.INSPECTOR_TEAM, inspectorTeam);
				
				%>
				<tr>
					<td class="text-center"><%=index++ %></td>
					<td class="text-left"><%=corporationInspector.getInspectorName() %></td>
					<td class="text-center"><%=corporationInspector.getInspectorPhone() %></td>
					<td class="text-center"><%=corporationInspector.getInspectorEmail() %></td>
					<td class="text-center">
						<a href="<%=DeleteNhomKiemTra.toString() %>"><img src="<%=request.getContextPath()%>/img/huy.png"></a>
					</td>
				</tr>
				<%
			}
			%>
			</tbody>
		</table>
	</div>
</div>