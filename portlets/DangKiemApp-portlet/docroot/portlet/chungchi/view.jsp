<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="vn.dtt.gt.dk.portlet.chungchi.TraCuuChungChiAction"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>

<%@ include file="/portlet/init.jsp"%>
<%
	Object maPhanNhom = renderRequest.getPortletSession().getAttribute(Constants.MAPHANNHOMHOSO);
	LogFactoryUtil.getLog(TraCuuChungChiAction.class).info( "==chungchi/view.jsp===maPhanNhom===" + (Validator.isNotNull(maPhanNhom) ? " != null " : " null "));
	try {
		HttpSession httpSession = null;
		try {
			httpSession = PortalUtil.getHttpServletRequest(renderRequest).getSession();
		} catch (Exception es) { }
	
		//-------------- phan nhom ho so
		String menuTraCuuThongTin = "";
		if (httpSession != null) {
			Object obj = httpSession.getAttribute(Constants.MENU_TRACUU_THONGTIN);
			if (obj != null) {
				menuTraCuuThongTin = obj.toString();
			} else {
				menuTraCuuThongTin = "";
			}
		}
		
		LogFactoryUtil.getLog(TraCuuChungChiAction.class).info( "==chungchi/view.jsp===MENU_TRACUU_THONGTIN===" + menuTraCuuThongTin);
			if (menuTraCuuThongTin.equalsIgnoreCase("tra_cuu_chung_chi")) {
				%>
				<jsp:include page="/portlet/chungchi/search_content_chungchi.jsp"></jsp:include>
				<%
			} else if (menuTraCuuThongTin.equalsIgnoreCase("tim_kiem_ho_so")) {
				%>
				<jsp:include page="/portlet/chungchi/search_content_tracuuhoso_thongtinhoso.jsp"></jsp:include>
				<%
			} else if (menuTraCuuThongTin.equalsIgnoreCase("tra_cuu_phuong_tien")) {
				%>
				<jsp:include page="/portlet/chungchi/search_content_tracuu_phuongtien.jsp"></jsp:include>
				<%
			} else if (menuTraCuuThongTin.equalsIgnoreCase("xuat_bao_cao_thong_ke")) {
				%>
				<jsp:include page="/portlet/hosodangkiem/bao_cao_thong_ke.jsp"></jsp:include>
				<%
			} else if (menuTraCuuThongTin.equalsIgnoreCase("man_hinh_theo_doi_ho_so_truc_tuyen")) {
				%>
				<jsp:include page="/portlet/hosodangkiem/view.jsp"></jsp:include>
				<%
			} else {
				%>
				<jsp:include page="/portlet/chungchi/search_content_chungchi.jsp"></jsp:include>
				<%
			}
	} catch (Exception es1) {
		es1.printStackTrace();
	}
%>
