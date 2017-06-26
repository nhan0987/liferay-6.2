<%@ include file="/portlet/init.jsp"%>
<%@ include file="/portlet/quanlyhs/thulyhs/totiepnhan/initToTiepNhan.jsp"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String idHoSoThuTuc = ParamUtil.getString(request, Constants.ID_HO_SO_THU_TUC);
	String idthuTucHanhChinh = ParamUtil.getString(request, Constants.TTHC_THUTUCHANHCHINH_ID);

%>

<%
PortletURL quanLyHoSoDkkt = renderResponse.createActionURL();
quanLyHoSoDkkt.setParameter(ActionRequest.ACTION_NAME, "quanLyHoSoDkkt");
quanLyHoSoDkkt.setParameter(Constants.ID_HO_SO_THU_TUC, idHoSoThuTuc);
quanLyHoSoDkkt.setParameter(Constants.TTHC_THUTUCHANHCHINH_ID, idthuTucHanhChinh);
quanLyHoSoDkkt.setParameter(Constants.THANH_PHAN_XU_LY, Constants.XU_LY_TLHS);
%>
<!-- Quản lý hồ sơ DKKT -->
<aui:form action="<%=quanLyHoSoDkkt.toString()%>" name="tiepNhan" id="tiepNhan" method="POST">
	<div><p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhsquanlyhosodkkt.ykienchuyenvien"/></span></p></div>
	<div><textarea class="textAreaAutosize" id="yKienChuyenVien" name="yKienChuyenVien"><%=StringPool.BLANK%></textarea></div>
	
	<div><p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhsquanlyhosodkkt.ykienchidao"/></span></p></div>
	<div><textarea class="textAreaAutosize" id="yKienChiDao" name="yKienChiDao"><%=StringPool.BLANK%></textarea></div>
	<table>
		<tr>
			<td width="20%"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhsquanlyhosodkkt.ngaychidao"/></span></td>
			<td>
				<input type="text" id="ngayChiDao" name="ngayChiDao" onclick="gtCalendar('ngayChiDao')"/>
				<span class="input-group-btn">
					<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayChiDao')"><i class="fa fa-calendar"></i></button>
				</span>
			</td>
		</tr>
		<tr>
			<td><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhsquanlyhosodkkt.ngayhoanthienhoso"/></span></td>
			<td><input type="text" placeholder="Ngày hoàn thiện hồ sơ" class="form-control-find-calendar"
						name="ngayHoanThienHoSo" id="ngayHoanThienHoSo" onclick="gtCalendar('ngayHoanThienHoSo')">
				<span class="input-group-btn">
					<button class="btn_calendar btn-default " type="button" onclick="gtCalendar('ngayHoanThienHoSo')"><i class="fa fa-calendar"></i></button>
				</span>
			</td>
		</tr>
	</table>
</aui:form>

<aui:button-row>
	<button type="button" onclick=""><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhsquanlyhosodkkt.yeucaubosung"/></button>
	<button type="button" onclick=""><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.totiepnhan.qlhsquanlyhosodkkt.quaylai"/></button>
</aui:button-row>