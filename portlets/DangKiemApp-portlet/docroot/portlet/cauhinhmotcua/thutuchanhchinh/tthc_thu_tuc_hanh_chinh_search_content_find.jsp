<%@page import="vn.dtt.gt.dk.dao.common.service.TthcCoQuanQlttLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.impl.TthcCoQuanQlttLocalServiceImpl"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcCoQuanQltt"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcLinhVucThuTucLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcLinhVucThuTuc"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.dtt.gt.dk.utils.DanhMucKey"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ include file="/portlet/init.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%
	List<TthcCoQuanQltt> allCoQuanQltt = null;
	allCoQuanQltt = TthcCoQuanQlttLocalServiceUtil.getTthcCoQuanQltts(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	if (allCoQuanQltt == null) { allCoQuanQltt = new ArrayList<TthcCoQuanQltt>(); }
	
	List<TthcLinhVucThuTuc> allLinhVucThuTuc = new ArrayList<TthcLinhVucThuTuc>();
	allLinhVucThuTuc = TthcLinhVucThuTucLocalServiceUtil.getTthcLinhVucThuTucs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	if (allLinhVucThuTuc == null) { allLinhVucThuTuc = new ArrayList<TthcLinhVucThuTuc>(); }
	
	String mathutuc = ParamUtil.getString(request, Constants.MA_THU_TUC).trim();
	
	//ten thu duc
	String tenthutuc = ParamUtil.getString(request, Constants.TEN_THU_TUC).trim();
	long coquanqlttid = ParamUtil.getLong(request, Constants.CO_QUAN_QLTT_ID);
	long linhvucthutucid = ParamUtil.getLong(request, Constants.LINH_VUC_THU_TUC_ID); 
	
%>
<%
PortletURL actionUrlTimKiemThuTucHanhChinhCauHinhMotCua = renderResponse.createActionURL();
actionUrlTimKiemThuTucHanhChinhCauHinhMotCua.setParameter(ActionRequest.ACTION_NAME, "timKiemThuTucHanhChinhCauHinhMotCua");
%>
<aui:form action="<%=actionUrlTimKiemThuTucHanhChinhCauHinhMotCua.toString()%>" name="myForm" id="myForm" method="POST">
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<!-- Tìm kiếm thủ tục hành chinh -->
		<div tabindex="0" class="CollapsiblePanelTab">
			<h5 class="tieude">Tìm kiếm thủ tục hành chính<i class="fa-right fa fa-angle-down"></i></h5><h5></h5>
		</div>
		
		<!-- cac option tim kiem -->
		<div class="CollapsiblePanelContent" style="display: block;">
		
			<!-------------------------- Mã thủ tục -------------------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Mã thủ tục:</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<input type="text" placeholder="Nhập text" class="form-control-find" style="width: 100%"
							name="<%=Constants.MA_THU_TUC%>" id="<%=Constants.MA_THU_TUC%>" value="<%=mathutuc%>"/>
					</div>
				</div>
			</div>
			
			<!-------------------------- Ten thu tuc -------------------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2"><label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.tenthutuc" />:</label></div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<input type="text" placeholder="Nhập text" class="form-control-find" style="width: 100%"
							name="<%=Constants.TEN_THU_TUC%>" id="<%=Constants.TEN_THU_TUC%>" value="<%=tenthutuc%>"/>
					</div>
				</div>
			</div>
			
			<!-------------------------- Co quan quản lý -------------------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2"><label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.sodkkt" /></label></div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<select name="<%=Constants.CO_QUAN_QLTT_ID%>" id=<%=Constants.CO_QUAN_QLTT_ID%> size="1" class="form-control-find" style="width: 100%">
						<% for (TthcCoQuanQltt item : allCoQuanQltt) {%>
							<option style="width:100%" <%=(item.getId() == coquanqlttid) ? "selected" : ""%> value="<%=item.getId()%>"><%=item.getTenCoQuanQltt()%></option>
						<% } %>
						</select>
					</div>
				</div>
			</div>
			
			<!-------------------------- linh vuc thu tuc -------------------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2"><label class="textlabel"><liferay-ui:message key="vn.gt.dk.qlhs.noidkkt" /></label></div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<select name="<%=Constants.LINH_VUC_THU_TUC_ID%>" id=<%=Constants.LINH_VUC_THU_TUC_ID%> size="1" class="form-control-find" style="width: 100%">
						<% for (TthcLinhVucThuTuc item : allLinhVucThuTuc) {%>
							<option style="width:100%" <%=(item.getId() == linhvucthutucid) ? "selected" : ""%> value="<%=item.getId()%>"><%=item.getTenLinhVuc()%></option>
						<% } %>
						</select>
					</div>
				</div>
			</div>
			
			<!----------------- button tiem kiem ----------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2"><label class="textlabel"></label></div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<div class="col-xs-3 col-sm-3 col-md-3">
							<div class="input-group">
								<button type="submit" class="fa-right bt btxanhduong btn btn-default"><liferay-ui:message key="vn.gt.dk.qlhs.button.timkiem" /></button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</aui:form>
