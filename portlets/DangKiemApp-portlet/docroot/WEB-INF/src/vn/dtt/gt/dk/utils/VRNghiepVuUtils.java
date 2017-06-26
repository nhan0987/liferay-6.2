
package vn.dtt.gt.dk.utils;

import java.util.List;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class VRNghiepVuUtils {
	
	private static Log _log = LogFactoryUtil.getLog(VRNghiepVuUtils.class);
	
	public static String getVehicleEngineStatusFromList(List<DmDataItem> lstTinhTrang, String vehicleEngineStatus) {
		_log.debug("---getVehicleEngineStatusFromList--");
		String trangThai = vehicleEngineStatus;
		if (Validator.isNotNull(lstTinhTrang) && lstTinhTrang.size() > 0) {
			for (DmDataItem item : lstTinhTrang) {
				if (item.getCode0().equalsIgnoreCase(vehicleEngineStatus)) {
					trangThai = item.getName();
					break;
				}
			}
			//log.info("===getVehicleEngineStatusFromList===Khong tim thay trang thai phu hop==vehicleEngineStatus==" + vehicleEngineStatus);
		}
		
		return trangThai;
	}
	
	public static String checkIsLeader(List<CorporationView> lstCorporationView, String codeDoiKt) {
		try {
			if (lstCorporationView.size() > 0) {
				for (CorporationView view : lstCorporationView) {
					if (view.getIsLeader() == 1 && view.getCorporationId().equalsIgnoreCase(codeDoiKt)) {
						_log.info("=checkIsLeader= checked" + codeDoiKt);
						return "checked";
					}
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return "";
	}
	
	public static String checkIsXemDL(List<CorporationView> lstCorporationView, String codeDoiKt) {
		try {
			if (lstCorporationView.size() > 0) {
				for (CorporationView view : lstCorporationView) {
					if (view.getCorporationId().equalsIgnoreCase(codeDoiKt)) {
						_log.info("=checkIsXemDL= checked" + codeDoiKt);
						return "checked";
					}
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return "";
	}
	
	public static String nameDoiKiemTra(List<DmDataItem> lstItem, String corporationid) {
		if (lstItem != null && lstItem.size() > 0) {
			for (DmDataItem item : lstItem) {
				if (item.getCode0().equalsIgnoreCase(corporationid)) {
					return item.getName();
				}
			}
		}
		return "";
	}
}
