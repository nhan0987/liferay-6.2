package vn.dtt.gt.dk.report.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement;
import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class GcnChatLuongDongCoMotoXeMay {
	private static Log _log = LogFactoryUtil.getLog(GcnChatLuongDongCoMotoXeMay.class);
	private DraftCertificate draftCertificate;
	private List<DraftCertificateSpec> allDraftCertificateSpec;
	private VehicleGroup vehicleGroup;
	private List<VehicleRecord> allVehicleRecord;
	private RegisteredInspection registeredInspection;
	private ProductionCountry productionCountry;
	private InspectionRecord inspectionRecord;
	
	public InspectionRecord getInspectionRecord() {
		return inspectionRecord;
	}
	public void setInspectionRecord(InspectionRecord inspectionRecord) {
		this.inspectionRecord = inspectionRecord;
	}
	public ProductionCountry getProductionCountry() {
		return productionCountry;
	}
	public void setProductionCountry(ProductionCountry productionCountry) {
		this.productionCountry = productionCountry;
	}
	public DraftCertificate getDraftCertificate() {
		return draftCertificate;
	}
	public void setDraftCertificate(DraftCertificate draftCertificate) {
		this.draftCertificate = draftCertificate;
	}
	public List<DraftCertificateSpec> getAllDraftCertificateSpec() {
		return allDraftCertificateSpec;
	}
	public void setAllDraftCertificateSpec(List<DraftCertificateSpec> allDraftCertificateSpec) {
		this.allDraftCertificateSpec = allDraftCertificateSpec;
	}
	public VehicleGroup getVehicleGroup() {
		return vehicleGroup;
	}
	public void setVehicleGroup(VehicleGroup vehicleGroup) {
		this.vehicleGroup = vehicleGroup;
	}
	public List<VehicleRecord> getAllVehicleRecord() {
		return allVehicleRecord;
	}
	public void setAllVehicleRecord(List<VehicleRecord> allVehicleRecord) {
		this.allVehicleRecord = allVehicleRecord;
	}
	public RegisteredInspection getRegisteredInspection() {
		return registeredInspection;
	}
	public void setRegisteredInspection(RegisteredInspection registeredInspection) {
		this.registeredInspection = registeredInspection;
	}
	
	public static GcnChatLuongDongCoMotoXeMay getModelByInspectionRecordId(long hoSoThuTucId, long inspectionRecordId) {
		GcnChatLuongDongCoMotoXeMay result = new GcnChatLuongDongCoMotoXeMay();
		
		InspectionRecord inspectionRecord;
		try {
			inspectionRecord = InspectionRecordLocalServiceUtil.fetchInspectionRecord(inspectionRecordId);
			result.setInspectionRecord(inspectionRecord);
			RegisteredInspection registeredInspection = null;
			VehicleGroup vehicleGroup = null;
			vehicleGroup = VehicleRecordLocalServiceUtil.findVehicleGroupByInspectionRecordId(inspectionRecordId);
			if(vehicleGroup != null){
				result.setVehicleGroup(vehicleGroup);
			}
			registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(hoSoThuTucId);
			if(registeredInspection != null){
				result.setRegisteredInspection(registeredInspection);
			}
		
			DraftCertificate draftCertificate = DraftCertificateLocalServiceUtil.fetchByInspectionReportId(inspectionRecordId);
//			_log.info("========getModelByInspectionRecordId===draftCertificate=======" + draftCertificate);
			if (draftCertificate == null) {
				draftCertificate = new DraftCertificateImpl();
			}
	
			SafetestRequirement seRequirement = SafetestRequirementLocalServiceUtil.findByInspectionRecordId(inspectionRecordId);
			if(seRequirement != null){
				SafetyTestReport safetyTestReport = SafetyTestReportLocalServiceUtil.findBySafetestRequirementId(seRequirement.getId());
				if(safetyTestReport != null){
					draftCertificate.setSafetytestReportId(safetyTestReport.getId());
				}
			}
			
			EmissionTestRequirement emissionTestRequirement = EmissionTestRequirementLocalServiceUtil.findByInspectionRecordId(inspectionRecordId);
			if(emissionTestRequirement != null){
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil.findByEmissiontestRequirementId(emissionTestRequirement.getId());
				if(emissionTestReport != null){
					draftCertificate.setEmissionTestReportId(emissionTestReport.getId());
				}
			}

			draftCertificate.setInspectionReportId(inspectionRecordId);
			draftCertificate.setReason(inspectionRecord.getDescription());
			draftCertificate.setCreatedDate(new Date());
			
			result.setDraftCertificate(draftCertificate);
			//InspectionRecordSpecLocalServiceUtil.addInspectionRecordSpec(inspectionRecordSpec)
			List<InspectionRecordSpec> allInspectionRecordSpec = InspectionRecordSpecLocalServiceUtil.findByInspectionRecordId(inspectionRecordId);
			List<DraftCertificateSpec> allDraftCertificateSpec = new ArrayList<DraftCertificateSpec>();
			DraftCertificateSpec draftCertificateSpec = null;
			if(allInspectionRecordSpec != null && allInspectionRecordSpec.size() > 0){
				for (InspectionRecordSpec inspectionRecordSpec : allInspectionRecordSpec) {
					draftCertificateSpec = new DraftCertificateSpecImpl();
// DraftCertficateId set sau khi insert bang DraftCertficateId, tam thoi fix=1					
//					draftCertificateSpec.setDraftCertificateId(1);
					draftCertificateSpec.setSpecificationCode(inspectionRecordSpec.getSpecificationCode());
					draftCertificateSpec.setSpecificationName(inspectionRecordSpec.getSpecificationName());
					draftCertificateSpec.setSpecificationValue(inspectionRecordSpec.getSpecificationValue());
					allDraftCertificateSpec.add(draftCertificateSpec);
				}
			}
			result.setAllDraftCertificateSpec(allDraftCertificateSpec);
			
			List<VehicleRecord> allVehicleRecord = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecordId);
			if(allVehicleRecord != null && allVehicleRecord.size() > 0){
				int i=1;
//				for (VehicleRecord vehicleRecord : allVehicleRecord) {
////					_log.info("--------------vehicleRecord-------" + i + " có Id : " + vehicleRecord.getId() + " | So khung: " + vehicleRecord.getChassisNumber() + " | So dong co: " + vehicleRecord.getEngineNumber());
//					i = i + 1;
//				}
				result.setAllVehicleRecord(allVehicleRecord);
			}

		} catch (SystemException e) {
			_log.error(e);
		}
		
		return result;
	}
}
