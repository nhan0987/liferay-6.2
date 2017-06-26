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

PortletURL themCorporationTeam = renderResponse.createActionURL();
themCorporationTeam.setParameter(ActionRequest.ACTION_NAME, "themCorporationTeam");


// Ghi actionlog
String noidungthaotac = "Vào chức năng Tạo mới nhóm đăng kiểm viên thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()); 
String tenmanhinhdaidien = "Tạo mới Nhóm đăng kiểm viên kiểm tra hiện trường";
String importername = "";
String inspectorname = user.getScreenName();
long inspectorid = user.getUserId();
QuanLyNguoiDungAction.insertActionLog(0, null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<div class="col-xs-12 col-sm-12 col-md-12" id="cot2">
	<div class="col-md-12" id="main">
		<div class="col-xs-12 col-sm-12 col-md-12" id="cot2"><br>
			<div class="col-md-12" id="main">
				<aui:form action="<%=themCorporationTeam %>" name="myForm" id="myForm" method="POST">
					<br>
						<div class="CollapsiblePanelContent" style="display: block; margin-top: 15px;" >
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationteam.tennhom"/></label>
								<input type="hidden" name="<%=Constants.INSPECTOR_TEAM %>" id="<%=Constants.INSPECTOR_TEAM %>" value="<%=inspectorTeam%>" />
								<input type="hidden" name="<%=Constants.CORPORATION_ID %>" id="<%=Constants.CORPORATION_ID %>" value="<%=corporationId%>" />
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<aui:input  maxlength="200" style="width: 400px" min="1" id="tenNhom" cssClass="form-control-find" name="tenNhom" type="text" size="30" value='<%=Validator.isNotNull(corporationTeam) ? corporationTeam.getTeamName() : ""%>' label="">
                                	<aui:validator name="required" errorMessage="Cần nhập tên nhóm"/>
                            	</aui:input>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-2 col-sm-2 col-md-2">
								<label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationteam.trangthai"/></label>
							</div>
							<div class="col-xs-10 col-sm-10 col-md-10">
								<select id="MarkUpDelete" name="MarkUpDelete" style="width: 200px">
		                             <option <%=(trangThai == Constants.MarkUpDelete_da_xoa) ? "selected" : ""%> value="<%=Constants.MarkUpDelete_da_xoa %>"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationteam.daxoa"/></option>
		                             <option <%=(trangThai == Constants.MarkUpDelete_chua_xoa) ? "selected" : ""%> value="<%=Constants.MarkUpDelete_chua_xoa %>"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationteam.chuaxoa"/></option>
		                        </select>
							</div>
						</div>
						
							<div class="row">
								<div class="col-xs-10 col-sm-10 col-md-10">
									<div class="row">
										<button type="submit" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationteam.ghilai"/></button>
										<button type="button" class="fa-left bt btxanhduong btn btn-default" style="margin-left: 15px" onclick="javascript: window.location = '<%=returnURL%>'"><liferay-ui:message key="vn.gt.dk.qlhs.quanlynguoidung.creatcorporationteam.quaylai"/></button>
									</div>
								</div>
							</div>
						</div>
				</aui:form>
				<br>
			</div>
		</div>
	</div>
</div>
