
package vn.dtt.gt.dk.utils.format;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.PortletSession;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.Role;
import com.liferay.portal.theme.ThemeDisplay;

public class CommonUtils {
	
	private static Log _log = LogFactoryUtil.getLog(CommonUtils.class);
	
	public static List<String> getTenYearRecently() {
		List<String> result = new ArrayList<String>();
		int year = Calendar.getInstance().get(Calendar.YEAR);
		for (int i = 0; i < 10; i++) {
			result.add(String.valueOf(year));
			--year;
		}
		return result;
	}
	
	public static String checkRole(ThemeDisplay themeDisplay) {
		StringBuilder liRoleSelected = new StringBuilder();
		try {
			List<Role> liRoles = themeDisplay.getUser().getRoles();
			for (Role role : liRoles) {
				if (role.getName().startsWith("DK-")) {
					if (liRoleSelected.length() == 0) {
						liRoleSelected.append(role.getRoleId());
					} else {
						liRoleSelected.append(",").append(role.getRoleId());
					}
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		return liRoleSelected.toString().trim();
	}
	
	public static String getNhomPhieuXuLy(List<TthcPhanNhomHoSoVaiTro> liTthcPhanNhomHoSoVaiTros) {
		StringBuilder liRoleSelected = new StringBuilder();
		try {
			for (TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro : liTthcPhanNhomHoSoVaiTros) {
				if (liRoleSelected.length() == 0) {
					liRoleSelected.append("'").append(tthcPhanNhomHoSoVaiTro.getNhomPhieuXuLy()).append("'");
				} else {
					liRoleSelected.append(",").append("'").append(tthcPhanNhomHoSoVaiTro.getNhomPhieuXuLy()).append("'");
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		return liRoleSelected.toString().trim();
	}
	
	public static boolean checkRole(ThemeDisplay themeDisplay, MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) {
		try {
			List<Role> liRoles = themeDisplay.getUser().getRoles();
			for (Role role : liRoles) {
				if (role.getRoleId() == motCuaTrangThaiHoSo.getVaiTroXuLy1() || role.getRoleId() == motCuaTrangThaiHoSo.getVaiTroXuLy2() ||
					role.getRoleId() == motCuaTrangThaiHoSo.getVaiTroXuLy3()) { return true; }
			}
		} catch (Exception e) {
			_log.error(e);
		}
		
		return false;
	}
	
	public static String getTinhTrangTblThongTinNhomXeNk(String tinhTrang) {
		if (tinhTrang.trim().compareToIgnoreCase(Constants.Vehicle_Engine_Status_0) == 0) {
			return DKConfigurationManager.getStrProp("Vehicle-Engine-Status-0", tinhTrang);
		} else if (tinhTrang.trim().compareToIgnoreCase(Constants.Vehicle_Engine_Status_1) == 0) {
			return DKConfigurationManager.getStrProp("Vehicle-Engine-Status-1", tinhTrang);
		} else {
			return DKConfigurationManager.getStrProp("Vehicle-Engine-Status-2", tinhTrang);
		}
	}
	
	public static boolean checkFromDate(ActionRequest actionRequest, String fromDate) {
		String FROM_DATE = "FROM_DATE";
		if (fromDate != null && fromDate.trim().length() > 0) {
			PortletSession portletSession = actionRequest.getPortletSession();
			Object oldFromDate = portletSession.getAttribute("FROM_DATE");
			if (oldFromDate != null) {
				if (fromDate.trim().compareToIgnoreCase(oldFromDate.toString().trim()) == 0) { return true; }
			}
			portletSession.setAttribute(FROM_DATE, fromDate.trim());
		}
		
		return false;
	}
	
	public static String getKetQuaKiemTra(String confirmedResult) {
		String ketQua = "";
		DmDataItem dmDataItem = null;
		if (confirmedResult != null && confirmedResult.trim().length() > 0) {
			dmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(34, confirmedResult);
			// 34 là id ConfirmedResult trong DMDataGroup
			if (dmDataItem != null) {
				ketQua = dmDataItem.getName();
			}
		}
		return ketQua;
	}
}
