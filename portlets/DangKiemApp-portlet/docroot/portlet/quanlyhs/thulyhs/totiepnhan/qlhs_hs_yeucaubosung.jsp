<%@page import="vn.dtt.gt.dk.portlet.nguoidung.QuanLyNguoiDungAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.DateUtils"%>
<%@page import="java.util.Date"%>
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

<aui:button-row>
	<button type="button" onclick="eventHideOrShowDiv('yeuCauBoSung', 'true')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsyeucaubosung.yeucaubosung"/></button>
	<button type="button" onclick=""><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsyeucaubosung.xemxetsau"/></button>
</aui:button-row>
<div style="height: 15px" id="theDem"></div>
<%
PortletURL yeuCauBoSung = renderResponse.createActionURL();
yeuCauBoSung.setParameter(ActionRequest.ACTION_NAME, "yeuCauBoSung");
yeuCauBoSung.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
yeuCauBoSung.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
yeuCauBoSung.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
%>

<%
	// Ghi actionlog
		
	String noidungthaotac = "Mở xem Thụ lý hồ sơ, chức năng Yêu cầu bổ sung hồ sơ thời điểm " + DateUtils.dateToString("dd/MM/yyyy HH:mm", new Date()) + " theo hoSoThuTucId " + idHoSoThuTuc; 
	String tenmanhinhdaidien = "Yêu cầu bổ sung hồ sơ";
	String importername = "";
	String inspectorname = user.getScreenName();
	long inspectorid = user.getUserId();
	QuanLyNguoiDungAction.insertActionLog(ConvertUtil.convertToLong(idHoSoThuTuc), null, null, noidungthaotac, tenmanhinhdaidien, importername, inspectorid, inspectorname);

%>
<!-- Yêu cầu bổ sung -->
<aui:form action="<%=yeuCauBoSung.toString()%>" name="tiepNhan" id="tiepNhan" method="POST">
	<aui:input name="<%=Constants.DIEU_KIEN_CHUYEN_DICH%>" value="<%=Constants.DIEU_KIEN_DICH_CHUYEN_PHU_HOP_QUY_DINH%>"/>
	<div id="yeuCauBoSung">
		<table>
			<tr>
				<td width="20%"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsyeucaubosung.ykienchuyenvien"/></span></td>
				<td><span>:</span><input type="text" name="yKienChuyenVien" id="yKienChuyenVien"/></td>
			</tr>
			<tr>
				<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsyeucaubosung.ykientruongbophan"/></span></td>
				<td><span>:</span><input type="text" name="yKienTruongBoPhan" id="yKienTruongBoPhan"/></td>
			</tr>
			<tr>
				<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsyeucaubosung.ykiendoitruong"/></span></td>
				<td><span>:</span><input type="text" name="yKienDoiTruong" id="yKienDoiTruong"/></td>
			</tr>
			<tr>
				<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsyeucaubosung.ngayyeucauhoanthien"/></span></td>
				<td>
					<span>:</span><input type="text" name="ngayYeuCauHoanThien" id="ngayYeuCauHoanThien" onclick="gtCalendar('ngayYeuCauHoanThien')"/>
					<span class="input-group-btn">
						<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayYeuCauHoanThien')"><i class="fa fa-calendar"></i></button>
					</span>
				</td>
			</tr>
		</table>
		<aui:button-row>
			<button type="submit" id="" name=""><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsyeucaubosung.thongbaochokhachhang"/></button>
			<button type="button" id="" name="" onclick="eventHideOrShowDiv('yeuCauBoSung', 'false')"><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhshsyeucaubosung.quaylai"/></button>
		</aui:button-row>
	</div>
</aui:form>

<!-- ------------- Xem xet sau --------------->


<script type="text/javascript">

	$(function(){
		$('#yeuCauBoSung').hide();
		$('#theDem').hide();
	});

	function eventHideOrShowDiv(idElement, isHide) {
		console.log(idElement + isHide);
		if (isHide === 'false') {
			$('#'+idElement).hide();
			$('#theDem').hide();
			$('#divButton').show();
		} else if (isHide === 'true') { 
			$('#'+idElement).show();
			$('#theDem').show();
			$('#divButton').hide();
		}
	};
</script>