<%@ include file="/portlet/init.jsp"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript"> var imageFilesPath = '<%=request.getContextPath()%>'+"/img/";</script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/toTiepNhan.js">
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
<!-- Thông tin nhóm xe nhập khẩu -->
<div><p style="text-align: left;"><span><liferay-ui:message key="vn.gt.dk.qlhs.thulyhs.dangkiemvien.ketquagiamdinh.thongtinnhomxenhapkhau"/></span></p></div>



<script type="text/javascript">

</script>