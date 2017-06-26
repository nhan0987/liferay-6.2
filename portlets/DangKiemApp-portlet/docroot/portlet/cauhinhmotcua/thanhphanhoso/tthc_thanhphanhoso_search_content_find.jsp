<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcBieuMauHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo"%>
<%@page import="java.util.List"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ include file="/portlet/init.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%
	List<TthcThuTucHanhChinh> allTthcThuTucHanhChinh = null;
	allTthcThuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.getTthcThuTucHanhChinhs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	if (allTthcThuTucHanhChinh == null) { allTthcThuTucHanhChinh = new ArrayList<TthcThuTucHanhChinh>(); }
	
	List<TthcBieuMauHoSo> allTthcBieuMauHoSo = null;
	allTthcBieuMauHoSo = TthcBieuMauHoSoLocalServiceUtil.getTthcBieuMauHoSos(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	if (allTthcBieuMauHoSo == null) { allTthcBieuMauHoSo = new ArrayList<TthcBieuMauHoSo>(); }
	
	long thutuchanhchinhid = ParamUtil.getLong(request, Constants.THU_TUC_HANH_CHINH_ID);
	long bieumauhosoid = ParamUtil.getLong(request, Constants.BIEU_MAU_HO_SO_ID);
	long thutuhienthi = ParamUtil.getLong(request, Constants.THU_TU_HIEN_THI);
	int loaithanhphan = ParamUtil.getInteger(request, Constants.LOAI_THANH_PHAN);
	String mautructuyen = ParamUtil.getString(request, Constants.MAU_TRUC_TUYEN);
	long sotailieudinhkem = ParamUtil.getLong(request, Constants.SO_TAI_LIEU_DINHKEM);
	
%>
<%
PortletURL actionUrlTimKiemThanhPhanHoSoCauHinhMotCua = renderResponse.createActionURL();
actionUrlTimKiemThanhPhanHoSoCauHinhMotCua.setParameter(ActionRequest.ACTION_NAME, "timKiemThanhPhanHoSoCauHinhMotCua");
%>
<aui:form action="<%=actionUrlTimKiemThanhPhanHoSoCauHinhMotCua.toString()%>" name="myForm" id="myForm" method="POST">
	<div class="CollapsiblePanel CollapsiblePanelOpen" id="CollapsiblePanel1">
		<!-- Tìm kiếm thủ tục hành chinh -->
		<div tabindex="0" class="CollapsiblePanelTab">
			<h5 class="tieude">Tìm kiếm thành phần hồ sơ<i class="fa-right fa fa-angle-down"></i></h5><h5></h5>
		</div>
		
		<!-- cac option tim kiem -->
		<div class="CollapsiblePanelContent" style="display: block;">
		
			<!-------------------------- thu tuc hanh chinh -------------------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2">
					<label class="textlabel">Thủ tục hành chính:</label>
				</div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<select name="<%=Constants.THU_TUC_HANH_CHINH_ID%>" id=<%=Constants.THU_TUC_HANH_CHINH_ID%> size="1" class="form-control-find" style="width: 100%">
						<% for (TthcThuTucHanhChinh item : allTthcThuTucHanhChinh) {%>
							<option style="width:100%" <%=(item.getId() == thutuchanhchinhid) ? "selected" : ""%> value="<%=item.getId()%>"><%=item.getTenThuTuc()%></option>
						<% } %>
						</select>
					</div>
				</div>
			</div>
			
			<!-------------------------- Bieu mau ho so -------------------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2"><label class="textlabel">Biểu mẫu hồ sơ:</label></div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<select name="<%=Constants.BIEU_MAU_HO_SO_ID%>" id=<%=Constants.BIEU_MAU_HO_SO_ID%> size="1" class="form-control-find" style="width: 100%">
						<% for (TthcBieuMauHoSo item : allTthcBieuMauHoSo) {%>
							<option style="width:100%" <%=(item.getId() == thutuchanhchinhid) ? "selected" : ""%> value="<%=item.getId()%>"><%=item.getTenBieuMau()%></option>
						<% } %>
						</select>
					</div>
				</div>
			</div>
			
			<!-------------------------- Ma truc tuyen  -------------------------->
			<div class="row">
				<div class="col-xs-2 col-sm-2 col-md-2"><label class="textlabel">Mã trực tuyến:</label></div>
				<div class="col-xs-10 col-sm-10 col-md-10">
					<div class="row">
						<input type="text" placeholder="Nhập text" class="form-control-find" style="width: 100%"
							name="<%=Constants.MAU_TRUC_TUYEN%>" id="<%=Constants.MAU_TRUC_TUYEN%>" value="<%=mautructuyen%>"/>
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
