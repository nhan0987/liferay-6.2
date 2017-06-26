<%@page import="vn.dtt.gt.dk.portlet.menu.MenuConfiguration"%>
<%@page import="vn.dtt.gt.dk.portlet.hoso.QuanLyHoSoConfiguration"%>
<%@page import="vn.dtt.gt.dk.utils.format.Constants"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/portlet/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String portletResource = ParamUtil.getString(request, "portletResource"); 
	PortletPreferences resourcePrefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
	String value = resourcePrefs.getValue(Constants.RETURN_URL, "");
	
	String url_dang_kiem_vien = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_SETTING_DANG_KIEM_VIEN, "");
	String phanNhomHoSo = resourcePrefs.getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN, "");
	
	String url_ti_gia = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_SETTING_TI_GIA, "");
	String phanNhomTiGia = resourcePrefs.getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_TI_GIA, "");
	
	String url_monitor = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_SETTING_MONITOR, "");
	String phanNhomMonitor = resourcePrefs.getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_MONITOR, "");
	
	String url_kehoachdichchuyen = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_SETTING_KEHOACH_DICHCHUYEN, "");
	String phanNhomkehoachdichchuyen = resourcePrefs.getValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_KEHOACH_DICHCHUYEN, "");
	
	String trangGoiTraCuuDKV = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN, "");
	String trangGoiCauHinhMotCua = resourcePrefs.getValue(MenuConfiguration.TRANG_GOI_CAU_HINH_MOT_CUA, "");
	
	String quanLyRuiRoURL = resourcePrefs.getValue(MenuConfiguration.QUAN_LY_RUI_RO_URL, "");
	String quanLyRuiRoPhanNhom = resourcePrefs.getValue(MenuConfiguration.QUAN_LY_RUI_RO_PHAN_NHOM, "");
	
%>
<form action="<liferay-portlet:actionURL portletConfiguration="true" />" method="post" name="<portlet:namespace />fm">
    <table>
        <tr>
            <td><liferay-ui:message key="vn.gt.dk.menu.config.tranggoitrangkhiclickmenunghiepvu"/></td>
            <td><input id = "<portlet:namespace /><%=Constants.RETURN_URL%>" name="<portlet:namespace /><%=Constants.RETURN_URL%>" value="<%=value%>"/></td>
        </tr>
        
        
        <tr>
            <td><liferay-ui:message key="vn.gt.dk.menu.config.tranggoitrangkhiclickmenuquanlynhomdangkiemvien"/></td>
            <td><input id = "<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_SETTING_DANG_KIEM_VIEN%>" name="<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_SETTING_DANG_KIEM_VIEN%>" value="<%=url_dang_kiem_vien%>"/></td>
        </tr>
        
        <tr>
            <td><liferay-ui:message key="vn.gt.dk.menu.config.phannhomhosokhiclickmenuquanlynhomdangkiemvien"/></td>
            <td><input id = "<portlet:namespace /><%=MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN%>" name="<portlet:namespace /><%=MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN%>" value="<%=phanNhomHoSo%>"/></td>
        </tr>
        
         <tr>
            <td>Trang quản lý rủi ro</td>
            <td><input name="<portlet:namespace /><%=MenuConfiguration.QUAN_LY_RUI_RO_URL%>" value="<%=quanLyRuiRoURL%>"/></td>
        </tr>
        
        <tr>
            <td>ID phân nhóm hồ sơ quản lý rủi ro</td>
            <td><input name="<portlet:namespace /><%=MenuConfiguration.QUAN_LY_RUI_RO_PHAN_NHOM%>" value="<%=quanLyRuiRoPhanNhom%>"/></td>
        </tr>
        
        <tr>
            <td>Quản lý tỷ giá</td>
            <td><input id = "<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_SETTING_TI_GIA%>" name="<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_SETTING_TI_GIA%>" value="<%=url_ti_gia%>"/></td>
        </tr>
        
        <tr>
            <td>Id Phân nhóm hồ sơ quản lý Tỷ giá</td>
            <td><input id = "<portlet:namespace /><%=MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_TI_GIA%>" name="<portlet:namespace /><%=MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_TI_GIA%>" value="<%=phanNhomTiGia%>"/></td>
        </tr>
        
        <!-- --------MONITOR------------- -->
        <tr>
        	<td>Trang gọi đến cấu hinh Monitor</td>
        	<td><input id = "<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_SETTING_MONITOR%>" name="<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_SETTING_MONITOR%>" value="<%=url_monitor%>"/></td>
        </tr>
        <tr>
            <td>Id Phân nhóm hồ sơ Monitor</td>
            <td><input id = "<portlet:namespace /><%=MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_MONITOR%>" name="<portlet:namespace /><%=MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_MONITOR%>" value="<%=phanNhomMonitor%>"/></td>
        </tr>
        
        
        <!-- ke hoach dich chuyen -->
        <aui:input name='<%=MenuConfiguration.TRANG_GOI_SETTING_KEHOACH_DICHCHUYEN%>' label="Trang gọi kế hoạch dịch chuyển" value='<%=url_kehoachdichchuyen%>' inlineLabel="true"/>
        <aui:input name='<%=MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_KEHOACH_DICHCHUYEN %>' label="Phân nhóm hồ sơ kế hoạch dịch chuyển" value='<%=phanNhomkehoachdichchuyen %>' inlineLabel="true"/>
        
        <!--  -->
        <tr>
            <td>Trang gọi đến khi click tra cứu của đăng kiểm viên</td>
            <td>
                <input id = "<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN%>" name="<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN%>" value="<%=trangGoiTraCuuDKV%>"/>
            </td>
        </tr>

        <tr>
            <td>Trang gọi đến khi click cấu hình 1 cửa</td>
            <td><input id = "<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_CAU_HINH_MOT_CUA%>" name="<portlet:namespace /><%=MenuConfiguration.TRANG_GOI_CAU_HINH_MOT_CUA%>" value="<%=trangGoiCauHinhMotCua%>"/></td>
        </tr>
        
        <tr>
            <td colspan="2">
                <input type="submit" value="Ghi lại"/> 
            </td>
        </tr>
    </table>
</form>