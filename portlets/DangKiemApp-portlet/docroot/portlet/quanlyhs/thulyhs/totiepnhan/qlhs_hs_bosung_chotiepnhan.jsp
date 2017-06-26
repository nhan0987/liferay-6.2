<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/totiepnhan/initToTiepNhan.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);

%>

<%
PortletURL boSungChoTiepNhan = renderResponse.createActionURL();
boSungChoTiepNhan.setParameter(ActionRequest.ACTION_NAME, "boSungChoTiepNhan");
boSungChoTiepNhan.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
boSungChoTiepNhan.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
boSungChoTiepNhan.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
%>
<%
	// Ghi actionlog
		
	String noidungthaotac = "Mở xem Thụ lý hồ sơ, chức năng Bổ sung chờ tiếp nhận hồ sơ thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
	String tenmanhinhdaidien = "Bổ sung chờ tiếp nhận hồ sơ";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<!-- Hồ sơ bổ sung chờ tiếp nhận -->
<div id="tiepNhan">
	<div><p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsbosungchotiepnhan.ykienchuyenvien"/></span></p></div>
	<div><textarea class="textAreaAutosize" id="yKienChuyenVien" name="yKienChuyenVien"><%=StringPool.BLANK%></textarea></div>
	
	<div><p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsbosungchotiepnhan.ykienchidao"/></span></p></div>
	<div><textarea class="textAreaAutosize" id="yKienChiDao" name="yKienChiDao"><%=StringPool.BLANK%></textarea></div>
	<table>
		<tr>
			<td width="20%"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsbosungchotiepnhan.ngaychidao"/></span></td>
			<td>
				<input type="text" id="ngayChiDao" name="ngayChiDao" onclick="gtCalendar('ngayChiDao')"/>
				<span class="input-group-btn">
					<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayChiDao')"><i class="fa fa-calendar"></i></button>
				</span>
			</td>
		</tr>
		<tr>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsbosungchotiepnhan.ngayhoanthienhoso"/></span></td>
			<td><input type="text" placeholder="Ngày hoàn thiện hồ sơ" class="form-control-find-calendar"
						name="ngayHoanThienHoSo" id="ngayHoanThienHoSo" onclick="gtCalendar('ngayHoanThienHoSo')">
				<span class="input-group-btn">
					<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayHoanThienHoSo')"><i class="fa fa-calendar"></i></button>
				</span>
			</td>
		</tr>
	</table>
	<aui:button-row>
		<button type="submit" class="btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsbosungchotiepnhan.yeucaubosung"/></button>
		<button type="button" class="btnThuLyHS form-control"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsbosungchotiepnhan.quaylai"/></button>
	</aui:button-row>
</div>
