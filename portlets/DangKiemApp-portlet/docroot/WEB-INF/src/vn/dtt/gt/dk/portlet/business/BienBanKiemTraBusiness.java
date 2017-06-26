
package vn.dtt.gt.dk.portlet.business;

import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil;
import vn.dtt.gt.dk.report.ReportConstant;
import vn.dtt.gt.dk.report.ReportUtils;
import vn.dtt.gt.dk.utils.CollectionUtils;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.DateUtils;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class BienBanKiemTraBusiness {
	
	private static Log log = LogFactoryUtil.getLog(BienBanKiemTraBusiness.class);
	
	public boolean phanThongTinChung(ActionRequest actionRequest)
		throws SystemException {
		
		VehicleGroup vehicleGroup = null;
		
		List<InspectionCommonStatus> listThongTinChungs = InspectionCommonStatusLocalServiceUtil.getInspectionCommonStatuses(0, 10);
		
		if (listThongTinChungs != null && listThongTinChungs.size() > 0) {
			for (InspectionCommonStatus itemTTChung : listThongTinChungs) {
				String giaTriSuaDoi = ParamUtil.getString(actionRequest, "spanThongTinChung_" + itemTTChung.getId());
				long commonStatus = ParamUtil.getLong(actionRequest, "selLuaChonKetQua_" + itemTTChung.getId());
				
				InspectionCommonStatus inspectionCommonStatus = new InspectionCommonStatusImpl();
				inspectionCommonStatus.setId(CounterLocalServiceUtil.increment(InspectionCommonStatus.class.getName()));
				inspectionCommonStatus.setVehicleClass(itemTTChung.getVehicleClass());
				inspectionCommonStatus.setGroupName(itemTTChung.getGroupName());
				inspectionCommonStatus.setSequenceNo(itemTTChung.getSequenceNo());
				inspectionCommonStatus.setCommonStatus(commonStatus);
				inspectionCommonStatus.setCommonCode(itemTTChung.getCommonCode());
				inspectionCommonStatus.setAllowEdit(itemTTChung.getAllowEdit());
				
				InspectionCommonStatusLocalServiceUtil.addInspectionCommonStatus(inspectionCommonStatus);
				
				updateVehicleGroup(vehicleGroup, itemTTChung.getCommonCode(), itemTTChung.getAllowEdit(), giaTriSuaDoi);
			}
		}
		
		return true;
	}
	
	public void updateVehicleGroup(VehicleGroup vehicleGroup, String commonCode, int allowEdit, String valueUpdate) {
		
		if (allowEdit == 1) {
			
			if (commonCode.trim().equals("1")) {
				
			} else if (commonCode.trim().equals("1")) {
				
			} else if (commonCode.trim().equals("1")) {
				
			} else if (commonCode.trim().equals("1")) {
				
			} else if (commonCode.trim().equals("1")) {
				
			} else if (commonCode.trim().equals("1")) {
				vehicleGroup.setReferenceCertificateNo(valueUpdate);
			} else if (commonCode.trim().equals("1")) {
				vehicleGroup.setSafetyTestReportId(ConvertUtil.convertToLong(valueUpdate));
			} else if (commonCode.trim().equals("1")) {
				vehicleGroup.setEmissionTestReportId(ConvertUtil.convertToLong(valueUpdate));
			} else if (commonCode.trim().equals("1")) {
				vehicleGroup.setCopReportId(ConvertUtil.convertToLong(valueUpdate));
			} else if (commonCode.trim().equals("1")) {
				
			} else if (commonCode.trim().equals("1")) {
				
			} else if (commonCode.trim().equals("1")) {
				
			} else if (commonCode.trim().equals("1")) {
				
			} else if (commonCode.trim().equals("1")) {
				
			} else if (commonCode.trim().equals("1")) {
				
			} else if (commonCode.trim().equals("1")) {
				
			}
		}
		
	}
	
	//------------------HAM DUNG man hinh LAP BIEN BAN KIEM TRA
	public static String getValueThongTinChung(
		VehicleGroupInitial vehicleGroup, RegisteredInspection registeredInspection, CustomsDeclaration customsDeclaration, String commonCode) {
		
		if (commonCode.trim().equals("TTC_1_01")) {
			return registeredInspection != null ? registeredInspection.getImporterName() : "";
		} else if (commonCode.trim().equals("TTC_1_02")) {
			return registeredInspection != null ? registeredInspection.getImporterAddress() : "";
		} else if (commonCode.trim().equals("TTC_1_03")) {
			return registeredInspection != null ? registeredInspection.getRepresentative() : "";
		} else if (commonCode.trim().equals("TTC_1_04")) {
			return registeredInspection != null ? registeredInspection.getPhone() : "";
		} else if (commonCode.trim().equals("TTC_1_05")) {
			return registeredInspection != null ? registeredInspection.getEmail() : "";
		} else if (commonCode.trim().equals("TTC_1_06")) {
			return vehicleGroup != null ? vehicleGroup.getReferenceCertificateNo() : "";
		} else if (commonCode.trim().equals("TTC_1_07")) {
			return vehicleGroup != null ? vehicleGroup.getSafetytestreportNo() : "";
		} else if (commonCode.trim().equals("TTC_1_08")) {
			return vehicleGroup != null ? vehicleGroup.getEmissiontestreportNo() : "";
		} else if (commonCode.trim().equals("TTC_1_09")) {
			return vehicleGroup != null ? vehicleGroup.getCopreportNo() : "";
		} else if (commonCode.trim().equals("TTC_1_10")) {
			DmDataItem dmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.VEHICLE_TYPE, vehicleGroup.getVehicleType());
			if (dmDataItem != null) {
				return dmDataItem.getName();
			} else {
				return vehicleGroup.getVehicleType();
			}
		} else if (commonCode.trim().equals("TTC_1_11")) {
			DmDataItem dmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.TRADE_MARK, vehicleGroup.getTradeMark());
			if (dmDataItem != null) {
				return dmDataItem.getName();
			} else {
				return vehicleGroup.getTradeMark();
			}
		} else if (commonCode.trim().equals("TTC_1_12")) {
			return vehicleGroup != null ? vehicleGroup.getCommercialName() : "";
		} else if (commonCode.trim().equals("TTC_1_13")) {
			return vehicleGroup != null ? vehicleGroup.getModelCode() : "";
		} else if (commonCode.trim().equals("TTC_1_14")) {
			List<ProductionCountry> lstProductionCountry = ProductionCountryLocalServiceUtil.findByVehicleGroupId(vehicleGroup.getId());
			String sCountryCode = "";
			if (lstProductionCountry != null) {
				sCountryCode = CollectionUtils.listProductionCountryToString(lstProductionCountry);
			}
			return sCountryCode + ", ";
		} else if (commonCode.trim().equals("TTC_1_15")) {
			return vehicleGroup.getProductionPlant();
		} else if (commonCode.trim().equals("TTC_1_16")) {
			return vehicleGroup.getAddressOfProductionPlant();
		} else if (commonCode.trim().equals("TTC_1_17")) {
			return vehicleGroup.getEmissionStandard();
		} else if (commonCode.trim().equals("TTC_1_18")) {
			return registeredInspection.getRegisteredNumber();
		} else if (commonCode.trim().equals("TTC_1_19")) {
			return Validator.isNull(customsDeclaration) ? "" : customsDeclaration.getImportCustomDeclareNo();
		} else if (commonCode.trim().equals("TTC_1_20")) {
			return Validator.isNull(customsDeclaration) ? "" : DateUtils.dateToString("dd/MM/yyyy HH:mm", customsDeclaration.getImportCustomDeclareDate());
		} else if (commonCode.trim().equals("TTC_1_21")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_22")) { return ""; }
		
		return "";
	}
	
	//------------------HAM DUNG man hinh LAP BIEN BAN KIEM TRA
		public static String getCodeThongTinChung(
			VehicleGroupInitial vehicleGroup, RegisteredInspection registeredInspection, CustomsDeclaration customsDeclaration, String commonCode) {
			
			if (commonCode.trim().equals("TTC_1_01")) {
				return registeredInspection != null ? registeredInspection.getImporterName() : "";
			} else if (commonCode.trim().equals("TTC_1_02")) {
				return registeredInspection != null ? registeredInspection.getImporterAddress() : "";
			} else if (commonCode.trim().equals("TTC_1_03")) {
				return registeredInspection != null ? registeredInspection.getRepresentative() : "";
			} else if (commonCode.trim().equals("TTC_1_04")) {
				return registeredInspection != null ? registeredInspection.getPhone() : "";
			} else if (commonCode.trim().equals("TTC_1_05")) {
				return registeredInspection != null ? registeredInspection.getEmail() : "";
			} else if (commonCode.trim().equals("TTC_1_06")) {
				return vehicleGroup != null ? vehicleGroup.getReferenceCertificateNo() : "";
			} else if (commonCode.trim().equals("TTC_1_07")) {
				return vehicleGroup != null ? vehicleGroup.getSafetytestreportNo() : "";
			} else if (commonCode.trim().equals("TTC_1_08")) {
				return vehicleGroup != null ? vehicleGroup.getEmissiontestreportNo() : "";
			} else if (commonCode.trim().equals("TTC_1_09")) {
				return vehicleGroup != null ? vehicleGroup.getCopreportNo() : "";
			} else if (commonCode.trim().equals("TTC_1_10")) {
				return vehicleGroup != null ? vehicleGroup.getVehicleType() : "";
			} else if (commonCode.trim().equals("TTC_1_11")) {
				return vehicleGroup != null ? vehicleGroup.getTradeMark() : "";
			} else if (commonCode.trim().equals("TTC_1_12")) {
				return vehicleGroup != null ? vehicleGroup.getCommercialName() : "";
			} else if (commonCode.trim().equals("TTC_1_13")) {
				return vehicleGroup != null ? vehicleGroup.getModelCode() : "";
			} else if (commonCode.trim().equals("TTC_1_14")) {
				List<ProductionCountry> lstProductionCountry = ProductionCountryLocalServiceUtil.findByVehicleGroupId(vehicleGroup.getId());
				StringBuilder builder = new StringBuilder();
				if (lstProductionCountry != null) {
					for (ProductionCountry item : lstProductionCountry) {
						builder.append(item.getCountryCode());
						builder.append(",");
					}
				}
				return builder.toString();
			} else if (commonCode.trim().equals("TTC_1_15")) {
				return vehicleGroup != null ? vehicleGroup.getProductionPlant() : "";
			} else if (commonCode.trim().equals("TTC_1_16")) {
				return vehicleGroup != null ? vehicleGroup.getAddressOfProductionPlant() : "";
			} else if (commonCode.trim().equals("TTC_1_17")) {
				return vehicleGroup != null ? vehicleGroup.getEmissionStandard() : "";
			} else if (commonCode.trim().equals("TTC_1_18")) {
				return registeredInspection != null ? registeredInspection.getRegisteredNumber() : "";
			} else if (commonCode.trim().equals("TTC_1_19")) {
				return Validator.isNull(customsDeclaration) ? "" : customsDeclaration.getImportCustomDeclareNo();
			} else if (commonCode.trim().equals("TTC_1_20")) {
				return Validator.isNull(customsDeclaration) ? "" : DateUtils.dateToString("dd/MM/yyyy HH:mm", customsDeclaration.getImportCustomDeclareDate());
			} else if (commonCode.trim().equals("TTC_1_21")) {
				return "";
			} else if (commonCode.trim().equals("TTC_1_22")) { return ""; }
			return "";
		}
	
	//------------HAM dung man hinh sua bien ban kiem tra
	public static String getValueThongTinChungInital(
		VehicleGroupInitial groupInitial, RegisteredInspection registeredInspection, CustomsDeclaration customsDeclaration, String commonCode,
		List<VehicleRecord> lstRecord) {
		
		if (commonCode.trim().equals("TTC_1_01")) {
			return registeredInspection != null ? registeredInspection.getImporterName() : "";
			
		} else if (commonCode.trim().equals("TTC_1_02")) {
			return registeredInspection != null ? registeredInspection.getImporterAddress() : "";
			
		} else if (commonCode.trim().equals("TTC_1_03")) {
			return registeredInspection != null ? registeredInspection.getRepresentative() : "";
			
		} else if (commonCode.trim().equals("TTC_1_04")) {
			return registeredInspection != null ? registeredInspection.getPhone() : "";
			
		} else if (commonCode.trim().equals("TTC_1_05")) {
			return registeredInspection != null ? registeredInspection.getEmail() : "";
			//----------------------------- vehicleGroupInitial -----------------------------
		} else if (commonCode.trim().equals("TTC_1_06")) {
			return groupInitial != null ? groupInitial.getReferenceCertificateNo() : "";
			
		} else if (commonCode.trim().equals("TTC_1_07")) {
			return groupInitial != null ? groupInitial.getSafetytestreportNo() : "";
			
		} else if (commonCode.trim().equals("TTC_1_08")) {
			return groupInitial != null ? groupInitial.getEmissiontestreportNo() : "";
			
		} else if (commonCode.trim().equals("TTC_1_09")) {
			return groupInitial != null ? groupInitial.getCopreportNo() : "";
			
		} else if (commonCode.trim().equals("TTC_1_10")) {
			DmDataItem dmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.VEHICLE_TYPE, groupInitial.getVehicleType());
			if (dmDataItem != null) {
				return dmDataItem.getName();
			} else {
				return groupInitial.getVehicleType();
			}
		} else if (commonCode.trim().equals("TTC_1_11")) {
			DmDataItem dmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.TRADE_MARK, groupInitial.getTradeMark());
			if (dmDataItem != null) {
				return dmDataItem.getName();
			} else {
				return groupInitial.getTradeMark();
			}
		} else if (commonCode.trim().equals("TTC_1_12")) {
			return groupInitial != null ? groupInitial.getCommercialName() : "";
		} else if (commonCode.trim().equals("TTC_1_13")) {
			return groupInitial != null ? groupInitial.getModelCode() : "";
		} else if (commonCode.trim().equals("TTC_1_14")) {
			List<ProductionCountry> lstProductionCountry = ProductionCountryLocalServiceUtil.findByVehicleGroupId(groupInitial.getId());
			return getArrayDmProductionCountry(lstProductionCountry);
		} else if (commonCode.trim().equals("TTC_1_15")) {
			return groupInitial.getProductionPlant();
		} else if (commonCode.trim().equals("TTC_1_16")) {
			return groupInitial.getAddressOfProductionPlant();
		} else if (commonCode.trim().equals("TTC_1_17")) {
			return groupInitial.getEmissionStandard();
			//----------------------------- vehicleGroupInitial -----------------------------
			
		} else if (commonCode.trim().equals("TTC_1_18")) {
			return registeredInspection.getRegisteredNumber();
		} else if (commonCode.trim().equals("TTC_1_19")) {
			return Validator.isNull(customsDeclaration) ? "" : customsDeclaration.getImportCustomDeclareNo();
		} else if (commonCode.trim().equals("TTC_1_20")) {
			return Validator.isNull(customsDeclaration) ? "" : DateUtils.dateToString("dd/MM/yyyy HH:mm", customsDeclaration.getImportCustomDeclareDate());
			
			//----------------------------- vehicleGroupRecordInitial -----------------------------
		} else if (commonCode.trim().equals("TTC_1_21")) {
			return getValueXeMau(lstRecord, commonCode);
		} else if (commonCode.trim().equals("TTC_1_22")) {
			return getValueXeMau(lstRecord, commonCode);
		} else if (commonCode.trim().equals("TTC_1_23")) {
			return getValueXeMau(lstRecord, commonCode);
		} else if (commonCode.trim().equals("TTC_1_24")) {
			return getValueXeMau(lstRecord, commonCode);
		} else if (commonCode.trim().equals("TTC_1_25")) {
			return getValueXeMau(lstRecord, commonCode);
		} else if (commonCode.trim().equals("TTC_1_26")) { return getValueXeMau(lstRecord, commonCode); }
		//----------------------------- vehicleGroupRecordInitial -----------------------------
		return "";
	}
	
	//------------HAM dung man hinh sua bien ban kiem tra
	public static String getCodeThongTinChungInital(VehicleGroupInitial groupInitial, RegisteredInspection registeredInspection, CustomsDeclaration customsDeclaration,
		InspectionCommonStatus inspecCommonStatus) {
		
		String commonCode = inspecCommonStatus.getCommonCode().trim();
		
		if (commonCode.equals("TTC_1_01")) {
			return registeredInspection != null ? registeredInspection.getImporterName() : "";
			
		} else if (commonCode.equals("TTC_1_02")) {
			return registeredInspection != null ? registeredInspection.getImporterAddress() : "";
			
		} else if (commonCode.equals("TTC_1_03")) {
			return registeredInspection != null ? registeredInspection.getRepresentative() : "";
			
		} else if (commonCode.equals("TTC_1_04")) {
			return registeredInspection != null ? registeredInspection.getPhone() : "";
			
		} else if (commonCode.equals("TTC_1_05")) {
			return registeredInspection != null ? registeredInspection.getEmail() : "";
			
		} else if (commonCode.equals("TTC_1_06")) {
			return groupInitial != null ? groupInitial.getReferenceCertificateNo() : "";
		} else if (commonCode.equals("TTC_1_07")) {
			return groupInitial != null ? groupInitial.getSafetytestreportNo() : "";
			
		} else if (commonCode.equals("TTC_1_08")) {
			return groupInitial != null ? groupInitial.getEmissiontestreportNo() : "";
		} else if (commonCode.equals("TTC_1_09")) {
			return groupInitial != null ? groupInitial.getCopreportNo() : "";
		} else if (commonCode.equals("TTC_1_10")) {
			return groupInitial != null ? groupInitial.getVehicleType() : "";
		} else if (commonCode.equals("TTC_1_11")) {
			return groupInitial != null ? groupInitial.getTradeMark() : "";
		} else if (commonCode.equals("TTC_1_12")) {
			return groupInitial != null ? groupInitial.getCommercialName() : "";
		} else if (commonCode.equals("TTC_1_13")) {
			return groupInitial != null ? groupInitial.getModelCode() : "";
		} else if (commonCode.equals("TTC_1_14")) {
			List<ProductionCountry> lstProductionCountry = ProductionCountryLocalServiceUtil.findByVehicleGroupId(groupInitial.getId());
			StringBuilder builder = new StringBuilder();
			if (lstProductionCountry != null) {
				for (ProductionCountry item : lstProductionCountry) {
					builder.append(item.getCountryCode());
					builder.append(",");
				}
			}
			return builder.toString();
			
		} else if (commonCode.equals("TTC_1_15")) {
			return groupInitial != null ? groupInitial.getProductionPlant() : "";
		} else if (commonCode.equals("TTC_1_16")) {
			return groupInitial != null ? groupInitial.getAddressOfProductionPlant() : "";
		} else if (commonCode.equals("TTC_1_17")) {
			return groupInitial != null ? groupInitial.getEmissionStandard() : "";
		} else if (commonCode.equals("TTC_1_18")) {
			return registeredInspection != null ? registeredInspection.getRegisteredNumber() : "";
			
		} else if (commonCode.equals("TTC_1_19")) {
			return Validator.isNull(customsDeclaration) ? "" : customsDeclaration.getImportCustomDeclareNo();
		} else if (commonCode.equals("TTC_1_20")) {
			return Validator.isNull(customsDeclaration) ? "" : DateUtils.dateToString("dd/MM/yyyy HH:mm", customsDeclaration.getImportCustomDeclareDate());
	
		} else if (commonCode.trim().equals("TTC_1_21")) {
			return inspecCommonStatus.getItemName();
		} else if (commonCode.trim().equals("TTC_1_22")) {
			return inspecCommonStatus.getItemName();
		} else if (commonCode.trim().equals("TTC_1_23")) {
			return inspecCommonStatus.getItemName();
		} else if (commonCode.trim().equals("TTC_1_24")) {
			return inspecCommonStatus.getItemName();
		} else if (commonCode.trim().equals("TTC_1_25")) {
			return inspecCommonStatus.getItemName();
		} else if (commonCode.trim().equals("TTC_1_26")) { 
			return inspecCommonStatus.getItemName(); 
		}
		//----------------------------- vehicleGroupRecordInitial -----------------------------
		return "";
	}
	
	
	public static String getValueThongTinChungSuaDoi(
		VehicleGroup vehicleGroup, RegisteredInspection registeredInspection, CustomsDeclaration customsDeclaration, InspectionCommonStatus inspecCommonStatus, List<VehicleRecord> lstRecord) {
		
		if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_01")) {
			return registeredInspection != null ? registeredInspection.getImporterName() : "";
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_02")) {
			return registeredInspection != null ? registeredInspection.getImporterAddress() : "";
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_03")) {
			return registeredInspection != null ? registeredInspection.getRepresentative() : "";
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_04")) {
			
			return registeredInspection != null ? registeredInspection.getPhone() : "";
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_05")) {
			return registeredInspection != null ? registeredInspection.getEmail() : "";
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_06")) {
			return vehicleGroup != null ? vehicleGroup.getReferenceCertificateNo() : "";
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_07")) {
			return vehicleGroup != null ? vehicleGroup.getSafetytestreportNo() : "";
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_08")) {
			return vehicleGroup != null ? vehicleGroup.getEmissiontestreportNo() : "";
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_09")) {
			return vehicleGroup != null ? vehicleGroup.getCopreportNo() : "";
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_10")) {
			//Loáº¡i phÆ°Æ¡ng tiá»‡n
			DmDataItem dmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.VEHICLE_TYPE, vehicleGroup.getVehicleType());
			if (dmDataItem != null) {
				return dmDataItem.getName();
			} else {
				return vehicleGroup.getVehicleType();
			}
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_11")) {
			DmDataItem dmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(ReportConstant.TRADE_MARK, vehicleGroup.getTradeMark());
			if (dmDataItem != null) {
				return dmDataItem.getName();
			} else {
				return vehicleGroup.getTradeMark();
			}
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_12")) {
			return vehicleGroup != null ? vehicleGroup.getCommercialName() : "";
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_13")) {
			return vehicleGroup != null ? vehicleGroup.getModelCode() : "";
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_14")) {
			
			List<ProductionCountry> lstProductionCountry = ProductionCountryLocalServiceUtil.findByVehicleGroupId(vehicleGroup.getId());
			if(lstProductionCountry != null && lstProductionCountry.size() > 0){
				
				// lay danh sach ten nuoc san xuat tu inspectionCommonStatus de dam bao hien thi theo thu tu da chon
				return inspecCommonStatus.getItemName();
				//return getArrayDmProductionCountry(lstProductionCountry);
			}
			/*String sCountryCode = "";
			if (lstProductionCountry != null) {
				sCountryCode = CollectionUtils.listProductionCountryToString(lstProductionCountry);
			}
			return sCountryCode + ", ";*/
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_15")) {
			return vehicleGroup.getProductionPlant();
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_16")) {
			return vehicleGroup.getAddressOfProductionPlant();
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_17")) {
			return vehicleGroup.getEmissionStandard();
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_18")) {
			return registeredInspection.getRegisteredNumber();
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_19")) {
			return Validator.isNull(customsDeclaration) ? "" : customsDeclaration.getImportCustomDeclareNo();
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_20")) {
			return Validator.isNull(customsDeclaration) ? "" : DateUtils.dateToString("dd/MM/yyyy HH:mm", customsDeclaration.getImportCustomDeclareDate());
	
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_21")) {
			//'Sá»‘ VIN xe máº«u'
			return getValueXeMauSuaDoi(lstRecord, inspecCommonStatus.getCommonCode().trim());
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_22")) {
			//'Sá»‘ khung xe máº«u'
			return getValueXeMauSuaDoi(lstRecord, inspecCommonStatus.getCommonCode().trim());
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_23")) {
			//'Sá»‘ Ä‘á»™ng cÆ¡ xe máº«u'
			return getValueXeMauSuaDoi(lstRecord, inspecCommonStatus.getCommonCode().trim());
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_24")) {
			//'TÃ¬nh tráº¡ng phÆ°Æ¡ng tiá»‡n xe máº«u'
			return getValueXeMauSuaDoi(lstRecord, inspecCommonStatus.getCommonCode().trim());
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_25")) {
			//'NÄƒm sáº£n xuáº¥t xe máº«u'
			return getValueXeMauSuaDoi(lstRecord, inspecCommonStatus.getCommonCode().trim());
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_26")) {
			//'MÃ u sÆ¡n xe máº«u'
			return getValueXeMauSuaDoi(lstRecord, inspecCommonStatus.getCommonCode().trim());
		}
			
		return "";
	}
	
	
	
	
	public static String getCodeThongTinChungSuaDoi(
		VehicleGroup vehicleGroup, RegisteredInspection registeredInspection, CustomsDeclaration customsDeclaration, InspectionCommonStatus inspecCommonStatus, List<VehicleRecord> lstRecord) {
		//NgÆ°á»�i nháº­p kháº©u
		if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_01")) {
			return registeredInspection != null ? registeredInspection.getImporterName() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_02")) {
			return registeredInspection != null ? registeredInspection.getImporterAddress() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_03")) {
			return registeredInspection != null ? registeredInspection.getRepresentative() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_04")) {
			return registeredInspection != null ? registeredInspection.getPhone() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_05")) {
			return registeredInspection != null ? registeredInspection.getEmail() : "";
		//ThÆ° Ä‘iá»‡n tá»­
			
		
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_06")) {
			return vehicleGroup != null ? vehicleGroup.getReferenceCertificateNo() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_07")) {
			return vehicleGroup != null ? vehicleGroup.getSafetytestreportNo() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_08")) {
			return vehicleGroup != null ? vehicleGroup.getEmissiontestreportNo() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_09")) {
			return vehicleGroup != null ? vehicleGroup.getCopreportNo() : "";
		
		//Loáº¡i phÆ°Æ¡ng tiá»‡n
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_10")) {
			return vehicleGroup != null ? vehicleGroup.getVehicleType() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_11")) {
			return vehicleGroup != null ? vehicleGroup.getTradeMark() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_12")) {
			return vehicleGroup != null ? vehicleGroup.getCommercialName() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_13")) {
			return vehicleGroup != null ? vehicleGroup.getModelCode() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_14")) {
			List<ProductionCountry> lstProductionCountry = ProductionCountryLocalServiceUtil.findByVehicleGroupId(vehicleGroup.getId());
			StringBuilder builder = new StringBuilder();
			if (lstProductionCountry != null) {
				for (ProductionCountry item : lstProductionCountry) {
					builder.append(item.getCountryCode());
					builder.append(",");
				}
			}
			return builder.toString();
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_15")) {
			return vehicleGroup != null ? vehicleGroup.getProductionPlant() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_16")) {
			return vehicleGroup != null ? vehicleGroup.getAddressOfProductionPlant() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_17")) {
			return vehicleGroup != null ? vehicleGroup.getEmissionStandard() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_18")) {
			return registeredInspection != null ? registeredInspection.getRegisteredNumber() : "";
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_19")) {
			return Validator.isNull(customsDeclaration) ? "" : customsDeclaration.getImportCustomDeclareNo();
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_20")) {
			return Validator.isNull(customsDeclaration) ? "" : DateUtils.dateToString("dd/MM/yyyy HH:mm", customsDeclaration.getImportCustomDeclareDate());
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_21")) {
			//'Sá»‘ VIN xe máº«u'
			return getValueXeMauSuaDoi(lstRecord, inspecCommonStatus.getCommonCode().trim());
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_22")) {
			//'Sá»‘ khung xe máº«u'
			return getValueXeMauSuaDoi(lstRecord, inspecCommonStatus.getCommonCode().trim());
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_23")) {
			//'Sá»‘ Ä‘á»™ng cÆ¡ xe máº«u'
			return getValueXeMauSuaDoi(lstRecord, inspecCommonStatus.getCommonCode().trim());
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_24")) {
			//'TÃ¬nh tráº¡ng phÆ°Æ¡ng tiá»‡n xe máº«u'
			return getValueXeMauSuaDoi(lstRecord, inspecCommonStatus.getCommonCode().trim());
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_25")) {
			//'NÄƒm sáº£n xuáº¥t xe máº«u'
			return getValueXeMauSuaDoi(lstRecord, inspecCommonStatus.getCommonCode().trim());
			
		} else if (inspecCommonStatus.getCommonCode().trim().equals("TTC_1_26")) {
			//'MÃ u sÆ¡n xe máº«u'
			return getValueXeMauSuaDoi(lstRecord, inspecCommonStatus.getCommonCode().trim());
		}
			return "";
		}
	
	
	
	
	
	public static String getValueXeMau(List<VehicleRecord> lstRecord, String commonCode) {
		String value = "";
		if (lstRecord != null && lstRecord.size() > 0) {
			int stt = 0;
			for (VehicleRecord record : lstRecord) {
				stt++;
				if (record != null && record.getMarkAsSample() == 1) {
					try {
						VehiclerecordInitial recordInitial = VehiclerecordInitialLocalServiceUtil.fetchVehiclerecordInitial(record.getId());
						if (recordInitial != null && commonCode.trim().equalsIgnoreCase("TTC_1_21")) {
							value = value + "#" + stt + "--" + recordInitial.getChassisNumber() + ",";
							
						} else if (recordInitial != null && commonCode.trim().equalsIgnoreCase("TTC_1_22")) {
							value = value + "#" + stt + "--" + recordInitial.getChassisNumber() + ",";
							
						} else if (recordInitial != null && commonCode.trim().equalsIgnoreCase("TTC_1_23")) {
							value = value + "#" + stt + "--" + recordInitial.getEngineNumber() + ",";
							
						} else if (recordInitial != null && commonCode.trim().equalsIgnoreCase("TTC_1_24")) {
							String tinhTrang = ReportUtils.getVehicleStatusName(recordInitial.getVehicleEngineStatus());
							value = value + "#" + stt + "--" + tinhTrang + ",";
							
						} else if (recordInitial != null && commonCode.trim().equalsIgnoreCase("TTC_1_25")) {
							value = value + "#" + stt + "--" + recordInitial.getProductionYear() + ",";
							
						} else if (recordInitial != null && commonCode.trim().equalsIgnoreCase("TTC_1_26")) {
							value = value + "#" + stt + "--" + recordInitial.getVehicleColor() + ",";
						}
					} catch (SystemException e) {
						log.error(e);
					}
				}
			}
		}
		return value;
	}
	public static String getValueXeMauSuaDoi(List<VehicleRecord> lstRecord, String commonCode) {
		String value = "";
		if (lstRecord != null && lstRecord.size() > 0) {
			int stt = 0;
			for (VehicleRecord record : lstRecord) {
				stt++;
				if (record != null && record.getMarkAsSample() == 1) {
					
					if (record != null && commonCode.trim().equalsIgnoreCase("TTC_1_21")) {
						value = value + "#" + stt + "--" + record.getChassisNumber() + ",";
						
					} else if (record != null && commonCode.trim().equalsIgnoreCase("TTC_1_22")) {
						value = value + "#" + stt + "--" + record.getChassisNumber() + ",";
						
					} else if (record != null && commonCode.trim().equalsIgnoreCase("TTC_1_23")) {
						value = value + "#" + stt + "--" + record.getEngineNumber() + ",";
						
					} else if (record != null && commonCode.trim().equalsIgnoreCase("TTC_1_24")) {
						String tinhTrang = ReportUtils.getVehicleStatusName(record.getVehicleEngineStatus());
						value = value + "#" + stt + "--" + tinhTrang + ",";
						
					} else if (record != null && commonCode.trim().equalsIgnoreCase("TTC_1_25")) {
						value = value + "#" + stt + "--" + record.getProductionYear() + ",";
						
					} else if (record != null && commonCode.trim().equalsIgnoreCase("TTC_1_26")) {
						value = value + "#" + stt + "--" + record.getVehicleColor() + ",";
					}
				}
			}
		}
		return value;
	}
	public static String getCodeXeMauSuaDoi(List<VehicleRecord> lstRecord, String commonCode) {
		String value = "";
		if (lstRecord != null && lstRecord.size() > 0) {
			int stt = 0;
			for (VehicleRecord record : lstRecord) {
				stt++;
				if (record != null && record.getMarkAsSample() == 1) {
					if (record != null && commonCode.trim().equalsIgnoreCase("TTC_1_21")) {
						value = value + "#" + stt + "--" + record.getChassisNumber() + ",";
						
					} else if (record != null && commonCode.trim().equalsIgnoreCase("TTC_1_22")) {
						value = value + "#" + stt + "--" + record.getChassisNumber() + ",";
						
					} else if (record != null && commonCode.trim().equalsIgnoreCase("TTC_1_23")) {
						value = value + "#" + stt + "--" + record.getEngineNumber() + ",";
						
					} else if (record != null && commonCode.trim().equalsIgnoreCase("TTC_1_24")) {
						value = value + "#" + stt + "--" + record.getVehicleEngineStatus() + ",";
						
					} else if (record != null && commonCode.trim().equalsIgnoreCase("TTC_1_25")) {
						value = value + "#" + stt + "--" + record.getProductionYear() + ",";
						
					} else if (record != null && commonCode.trim().equalsIgnoreCase("TTC_1_26")) {
						value = value + "#" + stt + "--" + record.getVehicleColor() + ",";
					}
				}
			}
		}
		return value;
	}
	public static String getDisplayTTC(String commonCode, String itemCode0) {
		if (commonCode.compareToIgnoreCase("TTC_1_17") != 0 && itemCode0.trim().equalsIgnoreCase("2")) {
			return " style=\"display: none;\" ";
		} else if ((commonCode.trim().equalsIgnoreCase("TTC_1_21") || commonCode.trim().equalsIgnoreCase("TTC_1_22") || commonCode.trim().equalsIgnoreCase("TTC_1_23") ||
			commonCode.trim().equalsIgnoreCase("TTC_1_24") || commonCode.trim().equalsIgnoreCase("TTC_1_25") || commonCode.trim().equalsIgnoreCase("TTC_1_26")) &&
			itemCode0.trim().equalsIgnoreCase("3")) {
			return " style=\"display: none;\" ";
		}
		return "";
	}
	
	public static String getDisplayKTChatLuong(String commonCode, String itemCode0) {
		if ((commonCode.equalsIgnoreCase("XMY_2_01") || commonCode.equalsIgnoreCase("XCD_2_01") || commonCode.equalsIgnoreCase("XCG_2_01") ||
			commonCode.equalsIgnoreCase("XBB_2_01") || commonCode.equalsIgnoreCase("XDD_2_01") || commonCode.equalsIgnoreCase("DCX_2_01")) &&
			itemCode0.trim().equalsIgnoreCase("4")) {
			return " style=\"display: none;\" ";
		} else if (!(commonCode.equalsIgnoreCase("XMY_2_01") || commonCode.equalsIgnoreCase("XCD_2_01") || commonCode.equalsIgnoreCase("XCG_2_01") ||
			commonCode.equalsIgnoreCase("XBB_2_01") || commonCode.equalsIgnoreCase("XDD_2_01") || commonCode.equalsIgnoreCase("DCX_2_01")) &&
			itemCode0.trim().equalsIgnoreCase("3")) { return " style=\"display: none;\" "; }
		return "";
	}
	
	public static String isChonPhuongThucKiemTra(String code0, String inspectionMode) {
		if (code0.trim().equalsIgnoreCase(inspectionMode)) { return " selected "; }
		return "";
	}
	
	public static String isDanhMuc(String commonCode) {
		if (commonCode.trim().equals("TTC_1_01")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_02")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_03")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_04")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_05")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_06")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_07")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_08")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_09")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_10")) {
			return String.valueOf(ReportConstant.VEHICLE_TYPE);
		} else if (commonCode.trim().equals("TTC_1_11")) {
			return String.valueOf(ReportConstant.TRADE_MARK);
		} else if (commonCode.trim().equals("TTC_1_12")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_13")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_14")) {
			return String.valueOf(ReportConstant.STATE);
		} else if (commonCode.trim().equals("TTC_1_15")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_16")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_17")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_18")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_19")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_20")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_21")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_22")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_23")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_24")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_25")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_26")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_27")) {
			return "";
		} else if (commonCode.trim().equals("TTC_1_28")) {
			return "";
		}
		return "";
	}
	
	public static String checkIsXeMau(int markAsSample, boolean flag, int check) {
		if (markAsSample == 1 && flag == true && check == 1) {
			return " checked ";
		} else if (markAsSample == 1 && flag == true && check == 2) {
			return " style='display: none;' ";
		}
		return "";
	}
	
	public static int checkIsMarkAsSampleInt(int markAsSample, boolean flag, int check) {
		if (markAsSample == 1 && flag == true && check == 1) {
			return 1;
		} else if (markAsSample == 1 && flag == true && check == 2) {
			return 0;
		}
		return 0;
	}
	
	public static String checkIsDat(String commonStatus, String code0) {
		if (commonStatus.trim().equalsIgnoreCase(code0)) { return " selected "; }
		return "";
	}
	
	public static String defaultIsDat(String code) {
		if (code.trim().equalsIgnoreCase("1")) { return " selected "; }
		return "";
	}
	
	//trThongTinChung
	public static String checkColorTrTable(String commonStatus) {
		if (Validator.isNotNull(commonStatus)) {
			if (commonStatus.equalsIgnoreCase("0")) {
				//chua quyet dinh
				return " style='background-color: rgb(91, 220, 231) !important' ";
			} else if (commonStatus.equalsIgnoreCase("1")) {
				//dat
				return " style='background-color: white !important' ";
			} else if (commonStatus.equalsIgnoreCase("2")) {
				//khong dat
				return "";
			} else if (commonStatus.equalsIgnoreCase("3")) {
				//Sua doi
				return " style='background-color: rgb(245, 245, 107) !important' ";
			} else if (commonStatus.equalsIgnoreCase("4")) {
				//Khong ap dung
				return " style='background-color: rgb(42, 203, 42) !important' ";
			}
		}
		
		return "";
	}
	
	public static String checkColorGiaTriKiemTraTTC(long commonStatus) {
		if (commonStatus == 0) {
			//chua quyet dinh
			return " style='background-color: rgb(91, 220, 231) !important; color: black !important' ";
		} else if (commonStatus == 1) {
			//dat
			return " style='background-color: white !important; color: black !important' ";
		} else if (commonStatus == 2) {
			//khong dat
		} else if (commonStatus == 3) {
			//Sua doi
			return " style='background-color: rgb(245, 245, 107) !important; color: black !important' ";
		} else if (commonStatus == 4) {
			//Khong ap dung
			return " style='background-color: rgb(42, 203, 42) !important; color: black !important' ";
		}
		
		return "";
	}
	
	public static String checkColorSuaDoi(long commonStatus) {
		if (commonStatus == 0) {
			//chua quyet dinh
			return " style='background-color: rgb(91, 220, 231) !important; color: black !important' ";
		} else if (commonStatus == 1) {
			//dat
			return "";
		} else if (commonStatus == 2) {
			//khong dat
			return " style='background-color: rgb(237, 108, 108) !important; color: black !important' ";
		} else if (commonStatus == 3) {
			//Sua doi
			return " style='background-color: rgb(245, 245, 107) !important; color: black !important' ";
		} else if (commonStatus == 4) {
			//Khong ap dung
			return " style='background-color: rgb(42, 203, 42) !important; color: black !important' ";
		}
	
		return "";
	}
	
	//selLuaChon I. ThÃ´ng tin chung : Káº¿t luáº­n
	public static String checkColorSelLuaChon(long commonStatus) {
		if (commonStatus == 0) {
			//chua quyet dinh
			return " style='background-color: rgb(91, 220, 231) !important; color: black !important;'";
		} else if (commonStatus == 1) {
			//dat
			return " style='background-color: white !important; color: black !important;'";
		} else if (commonStatus == 2) {
			//khong dat
		} else if (commonStatus == 3) {
			//Sua doi
			return " style='background-color: rgb(245, 245, 107) !important; color: black !important;'";
		} else if (commonStatus == 4) {
			//Khong ap dung
			return " style='background-color: rgb(42, 203, 42) !important; color: black !important;'";
		}
		
		return "";
	}
	
	public static String checkColorTab2TrTable(long commonStatus) {
		if (commonStatus == 0) {
			//chua quyet dinh
			return " style='background-color: rgb(91, 220, 231) !important' ";
		} else if (commonStatus == 1) {
			//dat
			return " style='background-color: white !important' ";
		} else if (commonStatus == 2) {
			//khong dat
			return " style='background-color: rgb(237, 108, 108) !important' ";
		} else if (commonStatus == 3) {
			//Sua doi
			return " style='background-color: rgb(245, 245, 107) !important' ";
		} else if (commonStatus == 4) {
			//Khong ap dung
			return " style='background-color: rgb(42, 203, 42) !important' ";
		}
		
		return "";
	}
	
	public static String checkColorTab2GTdangki(long commonStatus) {
		if (commonStatus == 0) {
			//chua quyet dinh
			return " style='background-color: rgb(91, 220, 231) !important; color: black !important' ";
		} else if (commonStatus == 1) {
			//dat
			return " style='background-color: white !important; color: black !important' ";
		} else if (commonStatus == 2) {
			//khong dat
			return " style='background-color: rgb(237, 108, 108) !important; color: black !important' ";
		} else if (commonStatus == 3) {
			//Sua doi
			return " style='background-color: rgb(245, 245, 107) !important; color: black !important' ";
		} else if (commonStatus == 4) {
			//Khong ap dung
			return " style='background-color: rgb(42, 203, 42) !important; color: black !important' ";
		}
		
		return "";
	}
	
	public static String checkColorTab2GTkiemtra(long commonStatus) {
		if (commonStatus == 0) {
			//chua quyet dinh
			return " style='background-color: rgb(91, 220, 231) !important; color: black !important' ";
		} else if (commonStatus == 1) {
			//dat
			return " style='background-color: white !important; color: black !important' ";
		} else if (commonStatus == 2) {
			//khong dat
			return " style='background-color: rgb(237, 108, 108) !important; color: black !important' ";
		} else if (commonStatus == 3) {
			//Sua doi
			return " style='background-color: rgb(245, 245, 107) !important; color: black !important' ";
		} else if (commonStatus == 4) {
			//Khong ap dung
			return " style='background-color: rgb(42, 203, 42) !important; color: black !important' ";
		}
		
		return "";
	}
	
	//selLuaChon
	public static String checkColorTab2KetQua(long commonStatus) {
		if (commonStatus == 0) {
			//chua quyet dinh
			return " style='background-color: rgb(91, 220, 231) !important; color: black !important' ";
		} else if (commonStatus == 1) {
			//dat
			return " style='background-color: white !important; color: black !important' ";
		} else if (commonStatus == 2) {
			//khong dat
			return " style='background-color: rgb(237, 108, 108) !important; color: black !important' ";
		} else if (commonStatus == 3) {
			//Sua doi
			return " style='background-color: rgb(245, 245, 107) !important; color: black !important' ";
		} else if (commonStatus == 4) {
			//Khong ap dung
			return " style='background-color: rgb(42, 203, 42) !important; color: black !important' ";
		}

		return "";
	}
	
	/**1- Thuoc danh muc, 0- Khong thuoc danh muc*/
	public static String checkTonTaiDanhMuc(String vehicleClass, InspectionRecordSpec inspectionRecordSpec) {
		List<DmDataItem> list = DmDataItemLocalServiceUtil.findBySpecificationCodeAndspecificationvalue(inspectionRecordSpec.getSpecificationCode(), inspectionRecordSpec.getSpecificationValue(), vehicleClass);
		if (Validator.isNotNull(list) && list.size() > 0) {
			return "1";
		}
		return "0";
		
	}
	
	@Deprecated
	public static String getGiaTriDangKi(String vehicleClass, List<VehicleSpecification> lstVehicleSpecification, InspectionRecordSpec inspectionRecordSpec) {
		List<DmDataItem> dmDataItems = null;
		
		for (VehicleSpecification item : lstVehicleSpecification) {
			if (item.getSpecificationCode().equalsIgnoreCase(inspectionRecordSpec.getSpecificationCode())) {
				//CfgTechnicalspec cfgTechnicalSpec = CfgTechnicalspecLocalServiceUtil.findBySpecificationCode(inspectionRecordSpec.getSpecificationCode());
				// kiem tra specificationCode co phai la danh muc hay khong
				//if(cfgTechnicalSpec != null && cfgTechnicalSpec.getDatagroupid() > 0) {
					try {
						dmDataItems = DmDataItemLocalServiceUtil.findBySpecificationCodeAndspecificationvalue(item.getSpecificationCode(), item.getSpecificationValue(), vehicleClass);
					} catch (Exception e) {
						log.error(e);
					}
				//}
				
				if (dmDataItems != null && dmDataItems.size() > 0) {
					return dmDataItems.get(0).getName().trim();
				} else {
					log.debug("getGiaTriDangKi==Khong tim thay DM InspectionRecordSpec with specificationValue==" + inspectionRecordSpec.getSpecificationCode() + "==specificationCode==" + inspectionRecordSpec.getSpecificationValue() + "==vehicleClass=" + vehicleClass);
					return item.getSpecificationValue().trim();
				}
			}
		}
		
		return "";
	}
	
	public static String getGiaTriDangKi(String vehicleClass, Map<String, VehicleSpecification> mapVehicleSpecification, InspectionRecordSpec inspectionRecordSpec) {
		List<DmDataItem> dmDataItems = null;
		
		VehicleSpecification item = mapVehicleSpecification.get(StringUtil.toLowerCase(inspectionRecordSpec.getSpecificationCode()));
		
		if (item != null) {
			//CfgTechnicalspec cfgTechnicalSpec = CfgTechnicalspecLocalServiceUtil.findBySpecificationCode(inspectionRecordSpec.getSpecificationCode());
			// kiem tra specificationCode co phai la danh muc hay khong
			//if(cfgTechnicalSpec != null && cfgTechnicalSpec.getDatagroupid() > 0) {
				try {
					dmDataItems = DmDataItemLocalServiceUtil.findBySpecificationCodeAndspecificationvalue(item.getSpecificationCode(), item.getSpecificationValue(), vehicleClass);
				} catch (Exception e) {
					log.error(e);
				}
			//}
			
			if (dmDataItems != null && dmDataItems.size() > 0) {
				return dmDataItems.get(0).getName().trim();
			} else {
				log.debug("getGiaTriDangKi==Khong tim thay DM InspectionRecordSpec with specificationValue==" + inspectionRecordSpec.getSpecificationCode() + "==specificationCode==" + inspectionRecordSpec.getSpecificationValue() + "==vehicleClass=" + vehicleClass);
				return item.getSpecificationValue().trim();
			}
		}
		
		return "";
	}
	
	@Deprecated
	public static String[] getCodeNameValueGiaTriDangKi(List<VehicleSpecification> lstVehicleSpecification, InspectionRecordSpec inspectionRecordSpec) {
		for (VehicleSpecification item : lstVehicleSpecification) {
			if (item.getSpecificationCode().trim().equalsIgnoreCase(inspectionRecordSpec.getSpecificationCode())) {
				
				return new String[]{item.getSpecificationName(), item.getSpecificationCode(), item.getSpecificationValue() };
			}
		}
		return new String[]{};
	}
	
	public static String[] getCodeNameValueGiaTriDangKi(Map<String, VehicleSpecification> mapVehicleSpecification, InspectionRecordSpec inspectionRecordSpec) {
		VehicleSpecification item = mapVehicleSpecification.get(StringUtil.toLowerCase(inspectionRecordSpec.getSpecificationCode()));
		
		if (item != null) {
			return new String[]{item.getSpecificationName(), item.getSpecificationCode(), item.getSpecificationValue() };
		}
		
		return new String[]{};
	}
	
	public static String getGiaTriKiemTra(String vehicleClass, InspectionRecordSpec inspectionRecordSpec) {
		return getGiaTriKiemTra(inspectionRecordSpec.getSpecificationValue(), inspectionRecordSpec.getSpecificationCode(), vehicleClass);
	}
	
	public static String getGiaTriKiemTra(String specificationValue, String specificationCode, String vehicleClass) {
		List<DmDataItem> dmDataItems = null;
		try {
			dmDataItems = DmDataItemLocalServiceUtil.findBySpecificationCodeAndspecificationvalue(specificationCode, specificationValue, vehicleClass);
		} catch (Exception e) {
			log.error(e);
		}
		
		if (dmDataItems != null && dmDataItems.size() > 0) {
			return dmDataItems.get(0).getName().trim();
		} else {
			log.debug("getGiaTriDangKi==Khong tim thay DM InspectionRecordSpec with getGiaTriKiemTra==" + specificationCode +
				"==specificationCode==" + specificationValue + "==vehicleClass=" + vehicleClass);
		}
		
		return Validator.isNotNull(specificationValue) ? specificationValue : "";
	}
	
	public static String getArrayCountry(String arrayCountry) {
		if (Validator.isNotNull(arrayCountry) && arrayCountry.length() > 0) {
			String[] split = arrayCountry.split(",");
			StringBuilder builder = new StringBuilder();
			boolean firstCheck = true;
			for (int i = 0; i < split.length; i++) {
				if (firstCheck) {
					builder.append("'" + split[i].trim() +"'");
					firstCheck = false;
				} else {
					builder.append(",");
					builder.append("'" + split[i].trim() +"'");
				}
			}
			
			List<DmDataItem> lstDataItem = DmDataItemLocalServiceUtil.findByArrayCode0(builder.toString());
			if (Validator.isNotNull(lstDataItem) && lstDataItem.size() > 0) {
				builder.setLength(0);
				for (DmDataItem item : lstDataItem) {
					builder.append(item.getName());
					builder.append(",");
				}
				return builder.toString();
			}
		}
		return arrayCountry;
		
	}
	
	private static String getArrayDmProductionCountry(List<ProductionCountry> lstProductionCountry) {
		StringBuilder builder = new StringBuilder();
		if (lstProductionCountry != null && lstProductionCountry.size() >0) {
			
			boolean firstCheck = true;
			for (ProductionCountry item : lstProductionCountry) {
				if (firstCheck) {
					builder.append("'" + item.getCountryCode() + "'");
					firstCheck = false;
				} else {
					builder.append(",");
					builder.append("'" + item.getCountryCode() + "'");
				}
			}
			List<DmDataItem> findByArrayCode0 = DmDataItemLocalServiceUtil.findByArrayCode0(builder.toString());
			
			if (Validator.isNotNull(findByArrayCode0) && findByArrayCode0.size() > 0) {
				builder.setLength(0);
				for (DmDataItem item : findByArrayCode0) {
					builder.append(item.getName() + ",");
				}
				return builder.toString();
			}
		}
		return "";
	}
}
