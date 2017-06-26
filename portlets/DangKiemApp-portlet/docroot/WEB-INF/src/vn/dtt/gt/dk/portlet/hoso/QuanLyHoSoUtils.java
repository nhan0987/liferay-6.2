
package vn.dtt.gt.dk.portlet.hoso;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.portlet.business.LanhDaoPhongBusiness;
import vn.dtt.gt.dk.portlet.business.NghiepVuBusiness;
import vn.dtt.gt.dk.utils.format.Constants;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.UserGroup;
import com.liferay.portal.service.UserGroupLocalServiceUtil;

public class QuanLyHoSoUtils {
	
	private static Log log = LogFactoryUtil.getLog(QuanLyHoSoUtils.class);
	
	public static List<UserGroup> allUserGroup() {
		try {
			DynamicQuery query = DynamicQueryFactoryUtil.forClass(UserGroup.class);
			
			return UserGroupLocalServiceUtil.dynamicQuery(query);
		} catch (Exception e) {
			
		}
		return new ArrayList<UserGroup>();
	}
	
	public static String getSafetyTestSpecValue(List<SatetyTestReportSpec> allSafTestReportSpec, String specCode) {
		String result = "";
		for (SatetyTestReportSpec satetyTestReportSpec : allSafTestReportSpec) {
			if (satetyTestReportSpec.getSpecificationCode().trim().equals(specCode.trim())) {
				return (satetyTestReportSpec.getEvaluationResult() == 1) ? "Ä�áº¡t" : "KhÃ´ng Ä‘áº¡t";
			}
		}
		return result;
	}
	
	public static VehicleSpecification getVehicleSpecificationValue(List<VehicleSpecification> allVehicleSpecification, String specCode) {
		VehicleSpecification result = null;
		for (VehicleSpecification vehicleSpecification : allVehicleSpecification) {
			if (vehicleSpecification.getSpecificationCode().trim().equals(specCode.trim())) {
				result = vehicleSpecification;
				break;
			}
		}
		if (result == null) {
			result = new VehicleSpecificationImpl();
		}
		return result;
	}
	
	public static boolean lanhDaoPhongKyXacNhan(
		String listVehicleRecordId, long userId, long idPhieuXuLyPhu, long idHoSoThuTuc, String dieuKienChuyenDich, ActionRequest actionRequest) {
		NghiepVuBusiness nghiepVuBusiness = new NghiepVuBusiness();
		log.info("--lanhDaoPhongKyXacNhan--listVehicleRecordId====" + listVehicleRecordId);
		log.info("--lanhDaoPhongKyXacNhan--idPhieuXuLyPhu====" + idPhieuXuLyPhu);
		log.info("--lanhDaoPhongKyXacNhan--idHoSoThuTuc====" + idHoSoThuTuc);
		log.info("--lanhDaoPhongKyXacNhan--dieuKienChuyenDich====" + dieuKienChuyenDich);
		try {
			if (listVehicleRecordId != null) {
				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(idHoSoThuTuc);
				List<VehicleRecord> liVehicleRecords = LanhDaoPhongBusiness.getListVehicleRecord(listVehicleRecordId);
				boolean kq =
					nghiepVuBusiness.kyDuyetChungChi(
						idHoSoThuTuc, idPhieuXuLyPhu, dieuKienChuyenDich, userId, registeredInspection.getRegisteredNumber(), liVehicleRecords,
						"editorName", registeredInspection.getId(), "signName", "signTitle", "signPlace", actionRequest, Constants.CHON_KY_SO);
				
				return kq;
			}
		} catch (Exception e) {
			log.error(e);
		}
		return false;
	}
	
	public static boolean viewDangKiemVienKiemTra(List<DmDataItem> dmDataItemDKVs, int datagroupid) {
		if (dmDataItemDKVs != null && dmDataItemDKVs.size() > 0) {
			for (DmDataItem item : dmDataItemDKVs) {
				if (item.getCode0().trim().equalsIgnoreCase(String.valueOf(datagroupid))) { return true; }
			}
		}
		return false;
	}
	
}
