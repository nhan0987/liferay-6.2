/**
 * 
 */

package vn.dtt.gt.dk.portlet.menu;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import vn.dtt.gt.dk.utils.format.Constants;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

/**
 * @author win_64
 *
 */
public class MenuConfiguration implements ConfigurationAction {
	
	public static String TRANG_GOI_SETTING_DANG_KIEM_VIEN = "TRANG_GOI_SETTING_DANG_KIEM_VIEN";
	public static String PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN = "PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN";
	
	public static String TRANG_GOI_SETTING_TI_GIA = "TRANG_GOI_SETTING_TI_GIA";
	public static String PHAN_NHOM_HO_SO_SETTING_TI_GIA = "PHAN_NHOM_HO_SO_SETTING_TI_GIA";
	
	public static String TRANG_GOI_SETTING_MONITOR = "TRANG_GOI_MONITOR";
	public static String PHAN_NHOM_HO_SO_SETTING_MONITOR = "PHAN_NHOM_HO_SO_SETTING_MONITOR";
	
	public static String TRANG_GOI_SETTING_KEHOACH_DICHCHUYEN = "TRANG_GOI_KEHOACH_DICHCHUYEN";
	public static String PHAN_NHOM_HO_SO_SETTING_KEHOACH_DICHCHUYEN = "PHAN_NHOM_HO_SO_SETTING_KEHOACH_DICHCHUYEN";
	
	public static String TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN = "TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN";
	public static String TRANG_GOI_CAU_HINH_MOT_CUA = "TRANG_GOI_CAU_HINH_MOT_CUA";
	
	public static String QUAN_LY_RUI_RO_URL = "QUAN_LY_RUI_RO_URL";
	public static String QUAN_LY_RUI_RO_PHAN_NHOM = "QUAN_LY_RUI_RO_PHAN_NHOM";
	
	private Log _log = LogFactoryUtil.getLog(MenuConfiguration.class);
	
	@Override
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		String portletResource = ParamUtil.getString(actionRequest, "portletResource");
		PortletPreferences prefs = PortletPreferencesFactoryUtil.getPortletSetup(actionRequest, portletResource);
		String valueJsp = ParamUtil.getString(actionRequest, Constants.RETURN_URL, "");
		
		//-------
		String phanNhomHoSoDangKiemVien = ParamUtil.getString(actionRequest, MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN, "");
		String url_dang_kiem_vien = ParamUtil.getString(actionRequest, MenuConfiguration.TRANG_GOI_SETTING_DANG_KIEM_VIEN, "");
		
		//------------
		String url_ti_gia = ParamUtil.getString(actionRequest, MenuConfiguration.TRANG_GOI_SETTING_TI_GIA, "");
		String phanNhomTiGia = ParamUtil.getString(actionRequest, MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_TI_GIA, "");
		
		String quanLyRuiRoURL = ParamUtil.getString(actionRequest, MenuConfiguration.QUAN_LY_RUI_RO_URL, "");
		String quanLyRuiRoPhanNhom = ParamUtil.getString(actionRequest, MenuConfiguration.QUAN_LY_RUI_RO_PHAN_NHOM, "");
		
		//----
		String url_monitor = ParamUtil.getString(actionRequest, MenuConfiguration.TRANG_GOI_SETTING_MONITOR, "");
		String phanNhomMonitor = ParamUtil.getString(actionRequest, MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_MONITOR, "");
		
		//--
		String ur_kehoachdichchuyen = ParamUtil.getString(actionRequest, MenuConfiguration.TRANG_GOI_SETTING_KEHOACH_DICHCHUYEN, "");
		String phanNhomKehoachdichchuyen = ParamUtil.getString(actionRequest, MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_KEHOACH_DICHCHUYEN, "");
		
		//----
		String trangGoiTraCuuDangKiemVien = ParamUtil.getString(actionRequest, MenuConfiguration.TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN, "");
		String trangGoiCauHinhMotCua = ParamUtil.getString(actionRequest, MenuConfiguration.TRANG_GOI_CAU_HINH_MOT_CUA, "");
		
		prefs.setValue(Constants.RETURN_URL, valueJsp);
		
		//---
		prefs.setValue(MenuConfiguration.TRANG_GOI_SETTING_DANG_KIEM_VIEN, url_dang_kiem_vien);
		prefs.setValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_DANG_KIEM_VIEN, phanNhomHoSoDangKiemVien);
		
		//---
		prefs.setValue(MenuConfiguration.TRANG_GOI_SETTING_TI_GIA, url_ti_gia);
		prefs.setValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_TI_GIA, phanNhomTiGia);
		
		//---
		prefs.setValue(MenuConfiguration.TRANG_GOI_SETTING_MONITOR, url_monitor);
		prefs.setValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_MONITOR, phanNhomMonitor);
		
		//---
		prefs.setValue(MenuConfiguration.TRANG_GOI_SETTING_KEHOACH_DICHCHUYEN, ur_kehoachdichchuyen);
		prefs.setValue(MenuConfiguration.PHAN_NHOM_HO_SO_SETTING_KEHOACH_DICHCHUYEN, phanNhomKehoachdichchuyen);
		
		//---
		prefs.setValue(MenuConfiguration.TRANG_GOI_TRA_CUU_DANG_KIEM_VIEN, trangGoiTraCuuDangKiemVien);
		prefs.setValue(MenuConfiguration.TRANG_GOI_CAU_HINH_MOT_CUA, trangGoiCauHinhMotCua);
		
		prefs.setValue(MenuConfiguration.QUAN_LY_RUI_RO_URL, quanLyRuiRoURL);
		prefs.setValue(MenuConfiguration.QUAN_LY_RUI_RO_PHAN_NHOM, quanLyRuiRoPhanNhom);
		
		_log.debug("=======phanNhomHoSo========" + phanNhomHoSoDangKiemVien);
		_log.debug("=======url_dang_kiem_vien==" + url_dang_kiem_vien);
		_log.debug("=======url_ti_gia==========" + url_ti_gia);
		_log.debug("=======url_monitor=========" + url_monitor);
		_log.debug("=======url_kehoachdichchuyen==" + ur_kehoachdichchuyen);
		
		prefs.store();
	}
	
	@Override
	public String render(PortletConfig arg0, RenderRequest arg1, RenderResponse arg2) throws Exception {
		return "/portlet/menu/config.jsp";
	}
}
