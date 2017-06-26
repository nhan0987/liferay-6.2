<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhImpl"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh"%>
<%@page import="vn.dtt.gt.dk.utils.format.ConvertUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil"%>
<%@page import="vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@ include file="/portlet/init.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
String hoSoThuTucId = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
TthcHoSoThuTuc hoSoThuTuc = null;
hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(ConvertUtil.convertToLong(hoSoThuTucId));

TthcThuTucHanhChinh thuTucHanhChinh = null;
if (Validator.isNotNull(hoSoThuTuc)) {
	thuTucHanhChinh = TthcThuTucHanhChinhLocalServiceUtil.fetchTthcThuTucHanhChinh(hoSoThuTuc.getThuTucHanhChinhId());
} else {
	thuTucHanhChinh = new TthcThuTucHanhChinhImpl();
}
%>

		<div id="cot2" class="col-xs-12 col-sm-12 col-md-12">
				<div id="main" class="col-md-12">
					<h5 class="tieude"><liferay-ui:message key="vn.gt.dk.qlhs.hosodetailcontent.thongtinhoso"/></h5>
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<p class="textnd"><liferay-ui:message key="vn.gt.dk.qlhs.hosodetailcontent.tenthutuc"/><span class="flright">:</span></p>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2">
							<p class="textnd text-bold"><%=Validator.isNotNull(thuTucHanhChinh) ? thuTucHanhChinh.getTenThuTuc() : (Validator.isNotNull(hoSoThuTuc) ? hoSoThuTuc.getThuTucHanhChinhId() : "")%></p>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2">
							<p class="textnd">Số ĐKKT<span class="flright">:</span></p>
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6">
							<p class="textnd text-bold"><%=Validator.isNotNull(hoSoThuTuc) ? hoSoThuTuc.getMaBienNhan() : "" %></p>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<p class="textnd"><liferay-ui:message key="vn.gt.dk.qlhs.hosodetailcontent.masohoso"/><span class="flright">:</span></p>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2">
							<p class="textnd text-bold"><%=Validator.isNotNull(hoSoThuTuc) ? hoSoThuTuc.getMaSoHoSo() : "" %></p>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2">
							<p class="textnd"><liferay-ui:message key="vn.gt.dk.qlhs.hosodetailcontent.tendoanhnghiep"/><span class="flright">:</span></p>
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6">
							<p class="textnd text-bold"><%=Validator.isNotNull(hoSoThuTuc) ? hoSoThuTuc.getTenChuHoSo() : "" %></p>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<p class="textnd"><liferay-ui:message key="vn.gt.dk.qlhs.hosodetailcontent.ngaynophoso"/><span class="flright">:</span></p>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2">
							<p class="textnd text-bold"><%=Validator.isNotNull(hoSoThuTuc) ? ConvertUtil.parsefulldateToString(hoSoThuTuc.getNgayGuiHoSo()): "" %></p>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2">
							<p class="textnd"><liferay-ui:message key="vn.gt.dk.qlhs.hosodetailcontent.diachi"/><span class="flright">:</span></p>
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6">
							<p class="textnd text-bold"><%=Validator.isNotNull(hoSoThuTuc) ? hoSoThuTuc.getDiaChiChuHoSo() : "" %></p>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-2 col-sm-2 col-md-2">
							<p class="textnd"><liferay-ui:message key="vn.gt.dk.qlhs.hosodetailcontent.songayconlai"/><span class="flright">:</span></p>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2">
							<p class="textnd text-bold"><%=ConvertUtil.getDefferenBetweenTwoDate(new Date(), hoSoThuTuc.getNgayHenTra()) %> ngày</p>
						</div>
						<div class="col-xs-2 col-sm-2 col-md-2">
							<p class="textnd"><liferay-ui:message key="vn.gt.dk.qlhs.hosodetailcontent.trangthaihoso"/><span class="flright">:</span></p>
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6">
							<p class="textnd text-bold"><%=Validator.isNotNull(hoSoThuTuc) ? hoSoThuTuc.getTrangThaiHoSo() : "" %></p>
						</div>
					</div>
			</div>
			
			
			<%
	// Ghi actionlog
	String soHoSo = Validator.isNotNull(hoSoThuTuc) ? hoSoThuTuc.getMaSoHoSo() : "";
	
	String noidungthaotac = "Mở xem Thông tin hồ sơ thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + hoSoThuTucId; 
	String tenmanhinhdaidien = "Thông tin hồ sơ";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(hoSoThuTucId), soHoSo, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
