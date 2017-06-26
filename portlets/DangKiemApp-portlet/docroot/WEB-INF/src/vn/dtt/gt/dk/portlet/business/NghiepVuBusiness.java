package vn.dtt.gt.dk.portlet.business;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.portlet.ActionRequest;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoImpl;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcKeHoachChuyenDichLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuImpl;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaTrangThaiHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement;
import vn.dtt.gt.dk.dao.nghiepvu.model.CopReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration;
import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails;
import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus;
import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement;
import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateCircularImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationAttendeeImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CustomsDeclarationImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleStatisticsImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateCircularLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ControlReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ControlRequirementLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CopReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteDetailsLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DebitNoteLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.DraftCertificateSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestRequirementLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.PaymentStatusLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SafetestRequirementLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SatetyTestReportSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupInitialLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleSpecificationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil;
import vn.dtt.gt.dk.message.BanTinSystemSignature;
import vn.dtt.gt.dk.message.MessageKey;
import vn.dtt.gt.dk.message.MessageReturnUtils;
import vn.dtt.gt.dk.message.MessageUtils;
import vn.dtt.gt.dk.message.dao.AswmsgMessageLogDao;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.message.xml.MessageFactory;
import vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateCancellation;
import vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement;
import vn.dtt.gt.dk.nsw.model.ConfirmationOfAssignment;
import vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity;
import vn.dtt.gt.dk.nsw.model.CurrentStatusOfImportedVehicleList;
import vn.dtt.gt.dk.nsw.model.DebitNote;
import vn.dtt.gt.dk.nsw.model.DebitNoteByCertificate;
import vn.dtt.gt.dk.nsw.model.ImportedVehicleList;
import vn.dtt.gt.dk.nsw.model.InquiryImportedVehicleReference;
import vn.dtt.gt.dk.nsw.model.InquiryOfCertificateContent;
import vn.dtt.gt.dk.nsw.model.NoticeCertificateEndorsement;
import vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection;
import vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity;
import vn.dtt.gt.dk.nsw.model.NoticeOfViolation;
import vn.dtt.gt.dk.nsw.model.PaymentConfirmation;
import vn.dtt.gt.dk.nsw.model.PaymentNotification;
import vn.dtt.gt.dk.nsw.model.RequestForChangingDateSite;
import vn.dtt.gt.dk.nsw.model.RequestForControl;
import vn.dtt.gt.dk.nsw.model.RequestForQualityInspection;
import vn.dtt.gt.dk.nsw.model.RequestOfEmissionTesting;
import vn.dtt.gt.dk.nsw.model.RequestOfSafeTesting;
import vn.dtt.gt.dk.nsw.model.ScheduleReport;
import vn.dtt.gt.dk.nsw.model.SelectedGroupForPayment;
import vn.dtt.gt.dk.nsw.model.SelectedVehicleListForPayment;
import vn.dtt.gt.dk.nsw.model.TechnicalSpecification;
import vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord;
import vn.dtt.gt.dk.portlet.business.bienbankiemtra.BienBanKTNghiepVuUtils;
import vn.dtt.gt.dk.portlet.business.bienbankiemtra.ObjXmlDoiChieuThongSoKtXe;
import vn.dtt.gt.dk.putdataform2object.XacNhanDangKyKiemTraObject;
import vn.dtt.gt.dk.report.ReportBusinessUtils;
import vn.dtt.gt.dk.report.ReportConstant;
import vn.dtt.gt.dk.report.ReportUtils;
import vn.dtt.gt.dk.sendmessage.SendMessgaeFunctions;
import vn.dtt.gt.dk.utils.CorporationUtils;
import vn.dtt.gt.dk.utils.DanhMucKey;
import vn.dtt.gt.dk.utils.TrangThaiHoSo;
import vn.dtt.gt.dk.utils.codec.FileKySoUtils;
import vn.dtt.gt.dk.utils.codec.FileUtils;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.ConvertUtil;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.util.PortalUtil;

public class NghiepVuBusiness {

	private static Log _log = LogFactoryUtil.getLog(NghiepVuBusiness.class);
	FunctionNghiepVu functionNghiepVu = new FunctionNghiepVu();
	MotCuaBusiness motCuaBusiness = new MotCuaBusiness();
	TaoCauTrucSoDkAcBB taoCauTruc = new TaoCauTrucSoDkAcBB();
	CallWebserviceNSWBusiness callWebserviceNSWBusiness = new CallWebserviceNSWBusiness();
	SendMessgaeFunctions messgaeFunctions = new  SendMessgaeFunctions();
	
	public void messageSuaDoiBoSung(long hoSoThuTucId, long userId, String reason, String ngayHanChotBoSung) {
		try {
			
			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.khong.phu.hop", "khong.phu.hop");
			String messageIdSentToNSW =functionNghiepVu.getRamdomMessage();
			messgaeFunctions.insertKeHoachChuyenDich(null, hoSoThuTucId, dieuKienChuyenDich, reason, messageIdSentToNSW,null,"20", "99");
			long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(hoSoThuTucId, dieuKienChuyenDich, userId);
		//	if (kq > 0) {
				callWebserviceNSWBusiness.messageSuaDoiBoSung(hoSoThuTucId, messageIdSentToNSW, "01", userId + "", reason, ngayHanChotBoSung);
			//}
		} catch (Exception e) {
			_log.error(e);
		}
	}


	
	

//	
	public void messageThongBaoViPham(TthcHoSoThuTuc hoSoThuTuc, long userId, String dieuKienChuyenDich, String lyDoTuChoi) {
		try {
//			//_log.info("messageThongBaoViPham   " + "   hoSoThuTucId  " + hoSoThuTuc.getId() + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " lyDoTuChoi  " + lyDoTuChoi);
			long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(hoSoThuTuc.getId(), dieuKienChuyenDich, userId);
			if (kq > 0) {
				callWebserviceNSWBusiness.messageTuChoiTiepNhan(hoSoThuTuc, 
						"01", userId + "", lyDoTuChoi);
			}

		} catch (Exception e) {
			_log.error(e);
		}
	}
	

	public boolean xacNhanDangKyKiemTra(long hoSoThuTucId, String dieuKienChuyenDich, long userId,
			XacNhanDangKyKiemTraObject dangKyKiemTraObject, ActionRequest actionRequest,RegisteredInspection registeredInspection) {
		boolean result = true;
		try {
//			//_log.info("xacNhanDangKyKiemTra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich);
			
			

			CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.findByInspectorId(userId);
			if (registeredInspection == null) {
//				//_log.info("CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.findByInspectorId(userId);");
				return false;
			}
			if (corporationInspector != null) {
				dangKyKiemTraObject.setInspectorSignName(corporationInspector.getInspectorName());
				dangKyKiemTraObject.setInspectorSignPlace(corporationInspector.getPlace());
				dangKyKiemTraObject.setInspectorSignTitle(corporationInspector.getTitle());
			}
			
//			//_log.info("registeredInspection  " + registeredInspection.getId());
			
			if(registeredInspection.getRegisteredNumber()!=null&&registeredInspection.getRegisteredNumber().length()>0){
				String messageId = functionNghiepVu.getRamdomMessage();
				callWebserviceNSWBusiness.message200va30(userId + "", hoSoThuTucId,
						messageId, Constants.VERSION_START,
						registeredInspection.getRegisteredNumber(), dangKyKiemTraObject, actionRequest,registeredInspection);
				
				dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.cap.giay.dkkt", "cap.giay.dkkt");
				messgaeFunctions.insertKeHoachChuyenDich(null,hoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"30","200");
				motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(hoSoThuTucId, dieuKienChuyenDich,
						userId);				
			}else{
			

				registeredInspection.setInspectorOrganization(DKConfigurationManager.getStrProp("vr_organization",
						"ORGANIZATION"));
				registeredInspection
						.setInspectorDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				registeredInspection.setInspectorSigNname(dangKyKiemTraObject.getInspectorSignName());
				registeredInspection.setInspectorSignTitle(dangKyKiemTraObject.getInspectorSignTitle());
				registeredInspection.setInspectorSignPlace(dangKyKiemTraObject.getInspectorSignPlace());
				registeredInspection.setInspectorSignDate(new Date());
				List<VehicleGroup> vehicleGroups = VehicleGroupLocalServiceUtil.findByRegisteredInspectionId(registeredInspection
						.getId());
				if(vehicleGroups!=null&&vehicleGroups.size()>0){
//				//_log.info( "vehicle class  "+ vehicleGroups.get(0).getVehicleClass());
				String soDangKyKiemTra = taoCauTruc.quyDinhSoDangKyKiemTra(vehicleGroups.get(0)
						.getVehicleClass());
//				//_log.info("soDangKyKiemTra  "+soDangKyKiemTra);
				registeredInspection.setRegisteredNumber(soDangKyKiemTra);
				}
				String messageId=taoXmlKyDuyet( userId, dangKyKiemTraObject, registeredInspection, hoSoThuTucId,  actionRequest);
//				//_log.info("RegisteredInspectionLocalServiceUtil.updateRegisteredInspection");
				RegisteredInspectionLocalServiceUtil.updateRegisteredInspection(registeredInspection);
				
				
				dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.cap.giay.dkkt", "cap.giay.dkkt");
				messgaeFunctions.insertKeHoachChuyenDich(null,hoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"30","200");
				long trangThaiHoSoId = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(hoSoThuTucId, dieuKienChuyenDich,
						userId);
				if (trangThaiHoSoId > 0) {
					TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
					String trangThai = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(trangThaiHoSoId)
							.getTenTrangThai();
					tthcHoSoThuTuc.setTrangThaiHoSo(trangThai);
					String ghiChu ="<b>  " + trangThai + "  </b>  "+ tthcHoSoThuTuc.getGhiChu();
					tthcHoSoThuTuc.setGhiChu(ghiChu);
					tthcHoSoThuTuc.setMaBienNhan(registeredInspection.getRegisteredNumber());
					tthcHoSoThuTuc.setTrangThaiHoSo(trangThai);
					tthcHoSoThuTuc.setSynchDate(new Date());
					TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);

				}
				
				
			}
			

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}


	public ImportedVehicleList createImportedVehicleList(List<TechnicalSpecification> technicalSpecifications)  {
		
		if(technicalSpecifications==null||technicalSpecifications.size()==0) return null;
		ImportedVehicleList vehicleStatistics = new ImportedVehicleList();
		int size =technicalSpecifications.size();
		List<ImportedVehicleList.ImportedVehicle> importedVehicles = new ArrayList<ImportedVehicleList.ImportedVehicle>();
		for(int j=0;j<size;j++){
			TechnicalSpecification technicalSpecification = technicalSpecifications.get(j);
			int count = technicalSpecification.getImportedVehicle().size();
			for(int i=0;i<count;i++){
				TechnicalSpecification.ImportedVehicle vehicle = technicalSpecification.getImportedVehicle().get(i);
				
				ImportedVehicleList.ImportedVehicle importedVehicle = new ImportedVehicleList.ImportedVehicle();
				importedVehicle.setChassisNumber(vehicle.getChassisNumber());
				importedVehicle.setCodeNumber(vehicle.getCodeNumber());
				importedVehicle.setCurrency(vehicle.getCurrency());
				importedVehicle.setEngineNumber(vehicle.getEngineNumber());
				importedVehicle.setEngineType(technicalSpecification.getGeneralInfo().getEngineType());
				importedVehicle.setMarkAsVehicle(technicalSpecification.getGeneralInfo().getMarkAsVehicle());
				importedVehicle.setModelType(technicalSpecification.getGeneralInfo().getModelType());
				importedVehicle.setProductionYear(vehicle.getProductionYear());
				importedVehicle.setSequenceNo(vehicle.getSequenceNo());
				importedVehicle.setTechnicalSpecCode(technicalSpecification.getTechnicalSpecCode());
				importedVehicle.setTradeMark(technicalSpecification.getGeneralInfo().getTradeMark());
				importedVehicle.setVehicleColor(vehicle.getVehicleColor());
				importedVehicle.setVehicleEngineStatus(vehicle.getVehicleEngineStatus());
				importedVehicle.setVehicleType(technicalSpecification.getGeneralInfo().getVehicleType());
				importedVehicle.setVehicleUnitPrice(vehicle.getVehicleUnitPrice());
				
				importedVehicles.add(importedVehicle);
			}
		}
		vehicleStatistics.getImportedVehicle().addAll(importedVehicles);
		return vehicleStatistics;
	}
	public ImportedVehicleList updateImportedVehicleList(long idHoSoThuTuc)  {
		
		ImportedVehicleList vehicleList = new ImportedVehicleList();
		List<ImportedVehicleList.ImportedVehicle> importedVehicles = new ArrayList<ImportedVehicleList.ImportedVehicle>();
		List<VehicleGroup> lstVehicleGroups = VehicleGroupLocalServiceUtil.findByIdHoSoThuTuc(idHoSoThuTuc);
		if(lstVehicleGroups != null && lstVehicleGroups.size() >0){
			for(VehicleGroup vehicleGroup : lstVehicleGroups){
				List<VehicleRecord> lstVehicleRecords = VehicleRecordLocalServiceUtil.findByIdVehicleGroupAndIdHoSoThuTuc(vehicleGroup.getId(), idHoSoThuTuc);
				for(VehicleRecord vehicle : lstVehicleRecords){
					
					ImportedVehicleList.ImportedVehicle importedVehicle = new ImportedVehicleList.ImportedVehicle();
					
					importedVehicle.setChassisNumber(vehicle.getChassisNumber());
					importedVehicle.setCodeNumber(vehicle.getCodeNumber());
					importedVehicle.setCurrency(vehicle.getCurrency());
					importedVehicle.setEngineNumber(vehicle.getEngineNumber());
					importedVehicle.setEngineType(vehicleGroup.getEngineType());
					importedVehicle.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
					importedVehicle.setModelType(vehicleGroup.getCommercialName());
					importedVehicle.setProductionYear(vehicle.getProductionYear());
					importedVehicle.setSequenceNo(vehicle.getSequenceNo());
					importedVehicle.setTechnicalSpecCode(vehicleGroup.getTechnicalSpecCode());
					importedVehicle.setTradeMark(vehicleGroup.getTradeMark());
					importedVehicle.setVehicleColor(vehicle.getVehicleColor());
					importedVehicle.setVehicleEngineStatus(ConvertUtil.convertToInt(vehicle.getVehicleEngineStatus()));
					importedVehicle.setVehicleType(vehicleGroup.getVehicleType());
					importedVehicle.setVehicleUnitPrice(String.valueOf(vehicle.getUnitPrice()));
					
					importedVehicles.add(importedVehicle);
				}
			}
			
		}
		vehicleList.getImportedVehicle().addAll(importedVehicles);
		return vehicleList;
	}



	public boolean xacNhanDangKyKiemTraChuKySo(long hoSoThuTucId, String dieuKienChuyenDich, long userId,
			XacNhanDangKyKiemTraObject dangKyKiemTraObject,RegisteredInspection registeredInspection) {
		boolean result = true;
		try {
//			//_log.info("xacNhanDangKyKiemTraChuKySo   ");
			CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.findByInspectorId(userId);
//			if( corporationInspector==null|| (registeredInspection.getRegisteredNumber()!=null&&registeredInspection.getRegisteredNumber().length()>0)){
//				return true;
//			}
//			_log.info("==/== no nhay vao dayyyyyyy");
			if (corporationInspector != null) {
				dangKyKiemTraObject.setInspectorSignName(corporationInspector.getInspectorName());
				dangKyKiemTraObject.setInspectorSignPlace(corporationInspector.getPlace());
				dangKyKiemTraObject.setInspectorSignTitle(corporationInspector.getTitle());
			}
//			//_log.info("registeredInspection  " + registeredInspection.getId());
			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);

			registeredInspection.setInspectorOrganization(DKConfigurationManager.getStrProp("vr_organization",
					"ORGANIZATION"));
			registeredInspection
					.setInspectorDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
			registeredInspection.setInspectorSigNname(dangKyKiemTraObject.getInspectorSignName());
			_log.info("=============dangKyKiemTraObject.getInspectorSignName()========"+dangKyKiemTraObject.getInspectorSignName());
			registeredInspection.setInspectorSignTitle(dangKyKiemTraObject.getInspectorSignTitle());
			registeredInspection.setInspectorSignPlace(dangKyKiemTraObject.getInspectorSignPlace());
			registeredInspection.setInspectorSignDate(new Date());
			List<VehicleGroup> vehicleGroups = VehicleGroupLocalServiceUtil.findByRegisteredInspectionId(registeredInspection
					.getId());
			if(vehicleGroups!=null&&vehicleGroups.size()>0 && (registeredInspection.getRegisteredNumber() == null || registeredInspection.getRegisteredNumber().trim().length() == 0)){
				String soDangKyKiemTra = taoCauTruc.quyDinhSoDangKyKiemTra(vehicleGroups.get(0).getVehicleClass());
				registeredInspection.setRegisteredNumber(soDangKyKiemTra);
			}

			taoXmlKyDuyetChuKySo(hoSoThuTucId, userId, dangKyKiemTraObject, registeredInspection, 
					tthcHoSoThuTuc);

			RegisteredInspectionLocalServiceUtil.updateRegisteredInspection(registeredInspection);
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean xemXetTiepNhanHoSo(long hoSoThuTucId, String dieuKienChuyenDich, long userId, String registeredNumber) {
		boolean result = true;
		try {
//			//_log.info("xemXetTiepNhanHoSo   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " registeredNumber  " + registeredNumber);
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phu.hop.quy.dinh",
					"phu.hop.quy.dinh");
//			//_log.info("xemXetTiepNhanHoSo   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " registeredNumber  " + registeredNumber);
			long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(hoSoThuTucId, dieuKienChuyenDich, userId);

			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			long trangThaiHoSoId = 2;
			if (kq > 0) {
				
				List<TthcNoidungHoSo> noidungHoSos = TthcNoidungHoSoLocalServiceUtil.findBieuMauHoSoIdAndHoSoThuTucId(
						hoSoThuTucId, Constants.MAU_TRUC_TUYEN_BAN_DANG_KY);
				// insert VR_RegisteredInspection
				if (null != noidungHoSos && noidungHoSos.size() > 0) {

					TthcNoidungHoSo noidungHoSo = noidungHoSos.get(0);

					String data = MessageUtils.replaceXML(noidungHoSo.getNoiDungXml());

					List<Object> liObjects = MessageFactory.converXMLMessagesContentToObject(data);
					for (Object object : liObjects) {
//						//_log.info("==object===== co noi dung ho so ");

						if (object instanceof RequestForQualityInspection) {
							RequestForQualityInspection requestForQualityInspection = (RequestForQualityInspection) object;

							RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
									.findByDossierId(hoSoThuTucId);
							if (registeredInspection == null) {
								createRegisteredInspection(hoSoThuTucId,
										requestForQualityInspection);
							} 

						}
					}
					
				}
				updateHoSoThuTuc(trangThaiHoSoId, tthcHoSoThuTuc);
			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}


	public void createRegisteredInspection(long hoSoThuTucId,
			RequestForQualityInspection requestForQualityInspection)
			throws SystemException {
		RegisteredInspection registeredInspection = new RegisteredInspectionImpl();

		// registeredInspection.setRegisteredNumber(registeredNumber);
		registeredInspection.setDossierId(hoSoThuTucId);
		registeredInspection.setImporterCode(requestForQualityInspection.getImporter()
				.getImporterCode());
		registeredInspection.setImporterName(requestForQualityInspection.getImporter()
				.getImporterName());
		registeredInspection.setImporterAddress(requestForQualityInspection.getImporter()
				.getImporterAddress());
		registeredInspection.setRepresentative(requestForQualityInspection.getImporter()
				.getRepresentative());
		registeredInspection.setEmail(requestForQualityInspection.getImporter().getEmail());
		registeredInspection.setPhone(requestForQualityInspection.getImporter().getPhone());
		registeredInspection.setFax(requestForQualityInspection.getImporter().getFax());

		registeredInspection.setInspectionDate(FormatData
				.parseStringToDate(requestForQualityInspection.getInspection()
						.getInpectionDate()));
		registeredInspection.setInspectionSite(requestForQualityInspection.getInspection()
				.getInspectionSite());
		registeredInspection.setInspectionDistrictCode(requestForQualityInspection
				.getInspection().getDistrictCode().trim());
		registeredInspection.setInspectionProvinceCode(requestForQualityInspection
				.getInspection().getProvinceCode().trim());
		registeredInspection.setContactName(requestForQualityInspection.getContacter()
				.getContactName());
		registeredInspection.setContactPhone(requestForQualityInspection.getContacter()
				.getContactPhone());
		registeredInspection.setContactEmail(requestForQualityInspection.getContacter()
				.getContactEmail());
		registeredInspection.setImporterSignName(requestForQualityInspection.getImporterSign()
				.getSignName());
		registeredInspection.setImporterSignTitle(requestForQualityInspection.getImporterSign()
				.getSignTitle());
		registeredInspection.setImporterSignPlace(requestForQualityInspection.getImporterSign()
				.getSignPlace());
		registeredInspection
				.setImporterSignDate(FormatData.parseStringToDate(requestForQualityInspection
						.getImporterSign().getSignDate()));

		RegisteredInspectionLocalServiceUtil.addRegisteredInspection(registeredInspection);
	}

	public VehicleStatistics khaiSuaHoSo(RegisteredInspection registeredInspection,
			TechnicalSpecification technicalSpecification, TthcNoidungHoSo noidungHoSo)
			throws SystemException {		
		int sizeOfTechnicalSpecificationNumbers=0;
		long sizeOfVehicleNumbers=0;

		long soXeDaLapBBKT = 0;
		
		VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil
				.findByTechnicalSpecCodeAndRegisteredInspectionId(technicalSpecification.getTechnicalSpecCode(),registeredInspection.getId());
		VehicleGroupInitial vehicleGroupInitial = null;
		if ((vehicleGroup==null) || (vehicleGroup.getId() == 0)) {
			vehicleGroup = new VehicleGroupImpl();
			vehicleGroupInitial = new VehicleGroupInitialImpl();
			long idVehicleGroup = CounterLocalServiceUtil.increment(VehicleGroup.class.getName());
			vehicleGroup.setId(idVehicleGroup);
			vehicleGroup.setHoSoThuTucId(registeredInspection.getDossierId());
			vehicleGroupInitial.setId(idVehicleGroup);
			fillData2VehicleGroup(registeredInspection, technicalSpecification, vehicleGroup, noidungHoSo,vehicleGroupInitial);
			
			// Sonvh bosung 20170407 check lai 1 lan truoc khi them moi vehiclegroup de giam rui ro trung 1/1000s)
			VehicleGroup temp_vgroup = VehicleGroupLocalServiceUtil
					.findByTechnicalSpecCodeAndRegisteredInspectionId(vehicleGroup.getTechnicalSpecCode(),registeredInspection.getId());
			if ((temp_vgroup==null) || (temp_vgroup.getId() == 0)) {
				VehicleGroupLocalServiceUtil.addVehicleGroup(vehicleGroup);
				VehicleGroupInitialLocalServiceUtil.addVehicleGroupInitial(vehicleGroupInitial);			
			}			

		} else {
			soXeDaLapBBKT = VehicleRecordLocalServiceUtil.countByIdVehicleGroupAndIdHoSoThuTuc(vehicleGroup.getId(), vehicleGroup.getHoSoThuTucId());
			
			if(soXeDaLapBBKT == 0){
				vehicleGroupInitial = VehicleGroupInitialLocalServiceUtil.fetchVehicleGroupInitial(vehicleGroup.getId());
				fillData2VehicleGroup(registeredInspection, technicalSpecification, vehicleGroup, noidungHoSo,vehicleGroupInitial);
				VehicleGroupLocalServiceUtil.updateVehicleGroup(vehicleGroup);
				VehicleGroupInitialLocalServiceUtil.updateVehicleGroupInitial(vehicleGroupInitial);
				ProductionCountryLocalServiceUtil.deleteProductionCountryWithVehicleGroupId(vehicleGroup.getId());
			}
		}

		if (technicalSpecification.getGeneralInfo() != null
				&& technicalSpecification.getGeneralInfo().getProductionCountry() != null) {
			List<String> countryCodes = technicalSpecification.getGeneralInfo().getProductionCountry()
					.getCountryCode();

			if (countryCodes != null && countryCodes.size() > 0 && soXeDaLapBBKT == 0) {
				int countCountryCode = countryCodes.size();
				
				for (int i = 0; i < countCountryCode; i++) {
				
					ProductionCountry productionCountry = new ProductionCountryImpl();
					long idProductionCountry = CounterLocalServiceUtil
							.increment(ProductionCountry.class.getName());
					productionCountry.setId(idProductionCountry);
					productionCountry.setVehicleGroupId(vehicleGroup.getId());
					productionCountry.setCountryCode(countryCodes.get(i));
					ProductionCountryLocalServiceUtil.addProductionCountry(productionCountry);
				
				}
			}
		}
		if (technicalSpecification.getImportedVehicle() != null) {
			int countVehicleRecords = technicalSpecification.getImportedVehicle().size();
		
			for (int i = 0; i < countVehicleRecords; i++) {
				TechnicalSpecification.ImportedVehicle importedVehicle = technicalSpecification.getImportedVehicle().get(i);
				List<VehicleRecord> vehicleRecords  = VehicleRecordLocalServiceUtil.findByDossierId(registeredInspection.getDossierId(),importedVehicle.getCodeNumber());
				
				VehiclerecordInitial vehiclerecordInitial = null;
				if (vehicleRecords == null||vehicleRecords.size()==0) {
					sizeOfVehicleNumbers = sizeOfVehicleNumbers + 1;
					VehicleRecord vehicleRecord = new VehicleRecordImpl();
					vehiclerecordInitial = new VehiclerecordInitialImpl();
					long idVehicleRecord = CounterLocalServiceUtil.increment(VehicleRecord.class.getName());
					vehiclerecordInitial.setId(idVehicleRecord);
					vehicleRecord.setId(idVehicleRecord);

					fillData2VehicleRecord(sizeOfVehicleNumbers, technicalSpecification, vehicleGroup,
							countVehicleRecords, i, vehicleRecord, vehiclerecordInitial);

					VehicleRecordLocalServiceUtil.addVehicleRecord(vehicleRecord);
					VehiclerecordInitialLocalServiceUtil.addVehiclerecordInitial(vehiclerecordInitial);
				} else {
					// sonvh bosung 20170407: quy tac xu ly trung du lieu
					if (vehicleRecords.size() > 1) {
						// neu tim thay 2 vehiclerecord tro len trung nhau trong 1 hoso, xoa PT2, giu lai PT1
						VehicleRecordLocalServiceUtil.deleteVehicleRecord(vehicleRecords.get(1));						
					}
					VehicleRecord vehicleRecord = vehicleRecords.get(0);
					if(vehicleRecord.getInspectionRecordId() == 0){
						vehiclerecordInitial = VehiclerecordInitialLocalServiceUtil.fetchVehiclerecordInitial(vehicleRecord.getId());
						if(vehiclerecordInitial==null){
						vehiclerecordInitial = new VehiclerecordInitialImpl();
						}
						fillData2VehicleRecord(sizeOfVehicleNumbers, technicalSpecification, vehicleGroup,
								countVehicleRecords, i, vehicleRecord, vehiclerecordInitial);
						
						vehicleRecord.setSynchDate(new Date());	
						VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
						if(vehiclerecordInitial==null||vehiclerecordInitial.getId()<10){
							vehiclerecordInitial = new VehiclerecordInitialImpl();
							vehiclerecordInitial.setId(vehicleRecord.getId());
							VehiclerecordInitialLocalServiceUtil.addVehiclerecordInitial(vehiclerecordInitial);
						}else{
							vehiclerecordInitial.setSynchDate(new Date());
							VehiclerecordInitialLocalServiceUtil.updateVehiclerecordInitial(vehiclerecordInitial);
						}
					}
				}

			}
		}

		if (technicalSpecification.getSpecificationList() != null
				&& technicalSpecification.getSpecificationList().getSpecItem() != null
				&& technicalSpecification.getSpecificationList().getSpecItem().size() > 0) {
			int countSpecItem = technicalSpecification.getSpecificationList().getSpecItem().size();
			for (int i = 0; i < countSpecItem; i++) {
				VehicleSpecification vehicleSpecification = VehicleSpecificationLocalServiceUtil
						.findByVehicleGroupIdSpecificationCode(vehicleGroup.getId(), technicalSpecification
								.getSpecificationList().getSpecItem().get(i).getSpecificationCode());
				if ((vehicleSpecification == null) || (vehicleSpecification.getId() == 0)) {
					sizeOfTechnicalSpecificationNumbers = sizeOfTechnicalSpecificationNumbers + 1;
					vehicleSpecification = new VehicleSpecificationImpl();
					long idVehicleSpecification = CounterLocalServiceUtil
							.increment(VehicleSpecification.class.getName());
					vehicleSpecification.setId(idVehicleSpecification);
					fillData2Specification(technicalSpecification, vehicleGroup, i, vehicleSpecification);

					VehicleSpecificationLocalServiceUtil.addVehicleSpecification(vehicleSpecification);
				} else if(soXeDaLapBBKT == 0){
					fillData2Specification(technicalSpecification, vehicleGroup, i, vehicleSpecification);
					VehicleSpecificationLocalServiceUtil.updateVehicleSpecification(vehicleSpecification);
				}
			}
			if (technicalSpecification.getGeneralInfo().getMarkAsVehicle() == 0) {
				VehicleSpecification vehicleSpecification = VehicleSpecificationLocalServiceUtil
						.findByVehicleGroupIdSpecificationCode(vehicleGroup.getId(), "DCX0006");
				if ((vehicleSpecification == null) || (vehicleSpecification.getId() == 0)) 
				{
					VehicleSpecification vehicleSpecification2 = new VehicleSpecificationImpl();
					long idVehicleSpecification = CounterLocalServiceUtil.increment(VehicleSpecification.class.getName());
					vehicleSpecification2.setId(idVehicleSpecification);
					vehicleSpecification2.setSpecificationCode("DCX0006");
					vehicleSpecification2.setSpecificationName(DKConfigurationManager.getStrProp("vn.dtt.loaidongco", "Loai dong co"));
					
					vehicleSpecification2.setSpecificationValue(technicalSpecification.getGeneralInfo().getEngineType());
					
					vehicleSpecification2.setVehicleGroupId(vehicleGroup.getId());
					VehicleSpecificationLocalServiceUtil.addVehicleSpecification(vehicleSpecification2);
				} else if(soXeDaLapBBKT == 0 && vehicleSpecification != null){
					vehicleSpecification.setSpecificationValue(technicalSpecification.getGeneralInfo().getEngineType());
					VehicleSpecificationLocalServiceUtil.updateVehicleSpecification(vehicleSpecification);
				}
			}
		}

		VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil.findByRegisteredInspectionId(registeredInspection
				.getId());
		vehicleStatistics.setTotalRegisteredVehicle(vehicleStatistics.getTotalRegisteredVehicle()
				+ sizeOfVehicleNumbers);
		vehicleStatistics.setTotalNotYetRequestedVehicle(vehicleStatistics.getTotalNotYetRequestedVehicle()
				+ sizeOfVehicleNumbers);
		vehicleStatistics.setTotalTechnicalSpec(vehicleStatistics.getTotalTechnicalSpec()
				+ sizeOfTechnicalSpecificationNumbers);
		vehicleStatistics.setSynchDate(new Date());
		VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);
		return vehicleStatistics;
	}

	private void fillData2Specification(TechnicalSpecification technicalSpecification, VehicleGroup vehicleGroup,
			int i, VehicleSpecification vehicleSpecification) {
		vehicleSpecification.setSpecificationCode(technicalSpecification.getSpecificationList().getSpecItem().get(i)
				.getSpecificationCode());
		String specificationName = technicalSpecification.getSpecificationList().getSpecItem().get(i)
				.getSpecificationName();
		
		if (specificationName == null || specificationName.length() == 0) {
			specificationName = "specificationName";
		}
//		CfgTechnicalspec cfgTechnicalspec = CfgTechnicalspecLocalServiceUtil.findBySpecificationCode(vehicleSpecification.getSpecificationCode());
//		if(cfgTechnicalspec !=null){
//			specificationName = cfgTechnicalspec.getSpecDescription();
//		}
//		if (specificationName == null || specificationName.length() == 0) {
//			specificationName = technicalSpecification.getSpecificationList().getSpecItem()
//					.get(i).getSpecificationName();
//		}
		vehicleSpecification.setSpecificationName(specificationName);
		vehicleSpecification.setSpecificationValue(technicalSpecification.getSpecificationList().getSpecItem().get(i)
				.getDeclarationValue1());

		vehicleSpecification.setVehicleGroupId(vehicleGroup.getId());
	}

	private void fillData2VehicleRecord(long sizeOfVehicleNumbers, TechnicalSpecification technicalSpecification,
			VehicleGroup vehicleGroup, int countVehicleRecords, int i, VehicleRecord vehicleRecord,
			VehiclerecordInitial vehiclerecordInitial) {
		if(vehiclerecordInitial==null) vehiclerecordInitial = new VehiclerecordInitialImpl();
		vehicleRecord.setSequenceNo((technicalSpecification.getImportedVehicle().get(i)).getSequenceNo());
		vehiclerecordInitial.setSequenceNo(vehicleRecord.getSequenceNo());
		vehicleRecord.setCodeNumber((technicalSpecification.getImportedVehicle().get(i)).getCodeNumber());
		vehiclerecordInitial.setCodeNumber(vehicleRecord.getCodeNumber());
		vehicleRecord.setChassisNumber((technicalSpecification.getImportedVehicle().get(i)).getChassisNumber());
		vehiclerecordInitial.setChassisNumber(vehicleRecord.getChassisNumber());
		vehicleRecord.setEngineNumber((technicalSpecification.getImportedVehicle().get(i)).getEngineNumber());
		vehiclerecordInitial.setEngineNumber(vehicleRecord.getEngineNumber());
		vehicleRecord.setProductionYear((technicalSpecification.getImportedVehicle().get(i)).getProductionYear());
		vehiclerecordInitial.setProductionYear(vehicleRecord.getProductionYear());
		vehicleRecord.setVehicleEngineStatus((technicalSpecification.getImportedVehicle().get(i))
				.getVehicleEngineStatus() + "");
		vehiclerecordInitial.setVehicleEngineStatus(vehicleRecord.getVehicleEngineStatus());
		Double unitPrice = new Double((technicalSpecification.getImportedVehicle().get(i)).getVehicleUnitPrice());
		vehicleRecord.setUnitPrice(unitPrice);
		vehiclerecordInitial.setUnitPrice(vehicleRecord.getUnitPrice());
		vehicleRecord.setCurrency((technicalSpecification.getImportedVehicle().get(i)).getCurrency());
		vehiclerecordInitial.setCurrency(vehicleRecord.getCurrency());
		vehicleRecord.setVehicleGroupId(vehicleGroup.getId());
		vehiclerecordInitial.setVehicleGroupId(vehicleRecord.getVehicleGroupId());
		vehicleRecord.setVehicleColor(technicalSpecification.getImportedVehicle().get(i).getVehicleColor());
		vehiclerecordInitial.setVehicleColor(vehicleRecord.getVehicleColor());
	}

	private void fillData2VehicleGroup(RegisteredInspection registeredInspection,
			TechnicalSpecification technicalSpecification, VehicleGroup vehicleGroup, TthcNoidungHoSo noidungHoSo,VehicleGroupInitial vehicleGroupInitial) {
		String technicalSpecClass = technicalSpecification.getTechnicalSpecCode();
		//_log.info(" before technicalSpecCode " + technicalSpecClass);
		if (null != technicalSpecClass && technicalSpecClass.length() >= 3) {
			technicalSpecClass = technicalSpecClass.substring(0, 3);

		}
		//_log.info(" before technicalSpecCode " + technicalSpecClass);
		vehicleGroup.setAttachedFile(noidungHoSo.getId());
		vehicleGroupInitial.setAttachedFile(noidungHoSo.getId());
		vehicleGroup.setVehicleClass(technicalSpecClass);
		vehicleGroupInitial.setVehicleClass(technicalSpecClass);
		vehicleGroup.setRegisteredInspectionId(registeredInspection.getId());
		vehicleGroupInitial.setRegisteredInspectionId(registeredInspection.getId());
		vehicleGroup.setTechnicalSpecCode(technicalSpecification.getTechnicalSpecCode());
		vehicleGroupInitial.setTechnicalSpecCode(technicalSpecification.getTechnicalSpecCode());
		vehicleGroup.setReferenceCertificateNo(technicalSpecification.getCertificateRefNo());
		vehicleGroupInitial.setReferenceCertificateNo(technicalSpecification.getCertificateRefNo());
		String vehicleType = technicalSpecification.getGeneralInfo().getVehicleType();
		vehicleGroup.setVehicleType(vehicleType);
		vehicleGroupInitial.setVehicleType(vehicleType);
		vehicleGroup.setEngineType(technicalSpecification.getGeneralInfo().getEngineType());
		vehicleGroupInitial.setEngineType(technicalSpecification.getGeneralInfo().getEngineType());
		vehicleGroup.setMarkAsVehicle(technicalSpecification.getGeneralInfo().getMarkAsVehicle());
		vehicleGroupInitial.setMarkAsVehicle(technicalSpecification.getGeneralInfo().getMarkAsVehicle());
		if (technicalSpecification.getGeneralInfo().getMarkAsVehicle() == 0) {
			vehicleGroup.setVehicleClass("DCX");
		} else {
			if (vehicleType != null && vehicleType.length() >= 3) {
				vehicleType = vehicleType.substring(0, 3);
				if (!vehicleType.equals(vehicleGroup.getVehicleClass())) {
					vehicleGroup.setVehicleClass(vehicleType);
				}
			}
		}
		vehicleGroupInitial.setVehicleClass(vehicleGroup.getVehicleClass());
		vehicleGroup.setTradeMark(technicalSpecification.getGeneralInfo().getTradeMark());
		vehicleGroupInitial.setTradeMark(technicalSpecification.getGeneralInfo().getTradeMark());
	 	vehicleGroup.setCommercialName(technicalSpecification.getGeneralInfo().getModelType());
		vehicleGroupInitial.setCommercialName(technicalSpecification.getGeneralInfo().getModelType());
		vehicleGroup.setModelCode(technicalSpecification.getGeneralInfo().getModelCode());
		vehicleGroupInitial.setModelCode(technicalSpecification.getGeneralInfo().getModelCode());
		vehicleGroup.setProductionPlant(technicalSpecification.getGeneralInfo().getManufacturer());
		vehicleGroupInitial.setProductionPlant(technicalSpecification.getGeneralInfo().getManufacturer());
		vehicleGroup.setAddressOfProductionPlant(technicalSpecification.getGeneralInfo().getAddressProductionPlant());
		vehicleGroupInitial.setAddressOfProductionPlant(technicalSpecification.getGeneralInfo().getAddressProductionPlant());
		vehicleGroup.setEmissionStandard(technicalSpecification.getGeneralInfo().getEmissionStandard());
		vehicleGroupInitial.setEmissionStandard(technicalSpecification.getGeneralInfo().getEmissionStandard());
		vehicleGroup.setRemarks(technicalSpecification.getRemarks());
		vehicleGroupInitial.setRemarks(technicalSpecification.getRemarks());
		vehicleGroup.setSynchDate(new Date());
		vehicleGroupInitial.setSynchDate(new Date());
	}

	public void taoXmlKyDuyetChuKySo(long hoSoThuTucId, long userId, XacNhanDangKyKiemTraObject dangKyKiemTraObject,
			RegisteredInspection registeredInspection,  TthcHoSoThuTuc tthcHoSoThuTuc) throws SystemException, IOException {

		RequestForQualityInspection requestForQualityInspection = new RequestForQualityInspection();
		List<TthcNoidungHoSo> hoSos = TthcNoidungHoSoLocalServiceUtil.findBieuMauHoSoIdAndHoSoThuTucId(hoSoThuTucId,
				Constants.MAU_TRUC_TUYEN_BAN_DANG_KY);
		if (null != hoSos && hoSos.size() > 0) {

			TthcNoidungHoSo noidungHoSo = hoSos.get(0);

			String data = MessageUtils.replaceXML(noidungHoSo.getNoiDungXml());

			List<Object> liObjects = MessageFactory.converXMLMessagesContentToObject(data);
			for (Object object : liObjects) {
				//_log.info("==object===== co noi dung ho so ");

				if (object instanceof RequestForQualityInspection) {

					requestForQualityInspection = (RequestForQualityInspection) object;
					vn.dtt.gt.dk.nsw.model.RequestForQualityInspection.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.RequestForQualityInspection.InspectorSign();
					inspectorSign.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
					inspectorSign.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
					inspectorSign.setSignDate(FormatData.parseDateToTring(new Date()));
					inspectorSign.setSignName(dangKyKiemTraObject.getInspectorSignName());
					inspectorSign.setSignPlace(dangKyKiemTraObject.getInspectorSignPlace());
					inspectorSign.setSignTitle(dangKyKiemTraObject.getInspectorSignTitle());
					inspectorSign.setRegisteredNumber(registeredInspection.getRegisteredNumber());

					requestForQualityInspection.setInspectorSign(inspectorSign);
					int messageType = 100;
					String messageFunction = "30";
					String xml = MessageFactory.convertObjectToXml(requestForQualityInspection);
					xml = callWebserviceNSWBusiness.builtXMLNotSend(userId + "", tthcHoSoThuTuc,
							functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType,
							xml, BanTinSystemSignature.systemSignature());
					String mauTrucTuyen = Constants.MAU_TRUC_TUYEN_XACNHANDANGKY;
					List<TthcThanhPhanHoSo> lTthcThanhPhanHoSos = TthcThanhPhanHoSoLocalServiceUtil
							.findByThuTucHanhChinhIdAndMauTrucTuyen(tthcHoSoThuTuc.getThuTucHanhChinhId(), mauTrucTuyen);
					if (lTthcThanhPhanHoSos != null && lTthcThanhPhanHoSos.size() > 0) {
						noidungHoSo.setBieuMauHoSoId(lTthcThanhPhanHoSos.get(0).getBieuMauHoSoId());
					}
					String tenTaiLieu = DKConfigurationManager.getStrProp("xac_nhan_dang_ky_kiem_tra",
							"xac_nhan_dang_ky_kiem_tra");
					long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_DA_KY;
					noidungHoSo.setTenTaiLieu(tenTaiLieu);
					noidungHoSo.setLoaiTaiLieu(loaiTaiLieu);
					noidungHoSo.setNoiDungXml(xml);
					noidungHoSo.setNgayTao(new Date());
					// noidungHoSo.setTaiLieuDinhKem(1);
					noidungHoSo.setNguoiTao(userId);
					
					//TODO: huymq performance
					ReportUtils.makePdfByNoiDungHoSo(noidungHoSo);
					
					TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(noidungHoSo);
					
//					_log.info("==/======taoXmlKyDuyetChuKySo=========updateTthcNoidungHoSo XMLLLLLLLLLLLLLLLLL==========" + noidungHoSo.getId());
					registeredInspection.setAttachedFile(noidungHoSo.getId());
					break;
				}
			}
		}

	}

	public void guiXmlKyDuyetChuKySo(long hoSoThuTucId, long userId, XacNhanDangKyKiemTraObject dangKyKiemTraObject,
			RegisteredInspection registeredInspection, 
			VehicleStatistics vehicleStatistics, ActionRequest actionRequest) {
		try{
			//_log.info(" guiXmlKyDuyetChuKySo ");
			String messageId=functionNghiepVu.getRamdomMessage();
			callWebserviceNSWBusiness.message200va30(userId + "", hoSoThuTucId,
					messageId, Constants.VERSION_START,
					registeredInspection.getRegisteredNumber(), dangKyKiemTraObject, actionRequest,registeredInspection);
			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.cap.giay.dkkt", "cap.giay.dkkt");
			messgaeFunctions.insertKeHoachChuyenDich(null,hoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"30","200");
			affertMessage200(hoSoThuTucId, userId, registeredInspection,
					dieuKienChuyenDich);
			
			
//			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.cap.giay.dkkt", "cap.giay.dkkt");
//			messgaeFunctions.insertKeHoachChuyenDich(null,hoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"30","200");
		}catch (Exception e) {
			_log.error(e);
		}


	}





	private void affertMessage200(long hoSoThuTucId, long userId,
			RegisteredInspection registeredInspection, String dieuKienChuyenDich)
			throws SystemException {
		long trangThaiHoSoId = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyChinh(hoSoThuTucId, dieuKienChuyenDich,
				userId);
		
		
		TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
		
		String trangThai = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(trangThaiHoSoId)
				.getTenTrangThai();
		hoSoThuTuc.setTrangThaiHoSo(trangThai);
		hoSoThuTuc.setGhiChu("<b>  " + trangThai + "  </b>  ");
		hoSoThuTuc.setMaBienNhan(registeredInspection.getRegisteredNumber());
		hoSoThuTuc.setTrangThaiHoSo(trangThai);
		hoSoThuTuc.setSynchDate(new Date());
		TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(hoSoThuTuc);
	}

	public String taoXmlKyDuyet(long userId, XacNhanDangKyKiemTraObject dangKyKiemTraObject,
			RegisteredInspection registeredInspection,  long  hoSoThuTucId,
			 ActionRequest actionRequest) throws SystemException, IOException {
		//_log.info("taoXmlKyDuyet1");
		TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId); 
		String messageId=functionNghiepVu.getRamdomMessage();
		String xml = callWebserviceNSWBusiness.message200va30(userId + "", hoSoThuTucId,
				messageId, Constants.VERSION_START,
				registeredInspection.getRegisteredNumber(), dangKyKiemTraObject, actionRequest,registeredInspection);
//		String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.cap.giay.dkkt", "cap.giay.dkkt");
//		messgaeFunctions.insertKeHoachChuyenDich(null,hoSoThuTucId, dieuKienChuyenDich, null, messageId);
		RequestForQualityInspection requestForQualityInspection = new RequestForQualityInspection();
		List<TthcNoidungHoSo> hoSos = TthcNoidungHoSoLocalServiceUtil.findBieuMauHoSoIdAndHoSoThuTucId(hoSoThuTucId,
				Constants.MAU_TRUC_TUYEN_BAN_DANG_KY);
		if (null != hoSos && hoSos.size() > 0) {

			TthcNoidungHoSo noidungHoSo = hoSos.get(0);

			String data = MessageUtils.replaceXML(noidungHoSo.getNoiDungXml());

			List<Object> liObjects = MessageFactory.converXMLMessagesContentToObject(data);
			for (Object object : liObjects) {
				//_log.info("==object===== co noi dung ho so ");

				if (object instanceof RequestForQualityInspection) {

					requestForQualityInspection = (RequestForQualityInspection) object;
					vn.dtt.gt.dk.nsw.model.RequestForQualityInspection.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.RequestForQualityInspection.InspectorSign();
					inspectorSign.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
					inspectorSign.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
					inspectorSign.setSignDate(FormatData.parseDateToTring(new Date()));
					inspectorSign.setSignName(dangKyKiemTraObject.getInspectorSignName());
					inspectorSign.setSignPlace(dangKyKiemTraObject.getInspectorSignPlace());
					inspectorSign.setSignTitle(dangKyKiemTraObject.getInspectorSignTitle());
					inspectorSign.setRegisteredNumber(registeredInspection.getRegisteredNumber());

					requestForQualityInspection.setInspectorSign(inspectorSign);
					int messageType = 100;
					String messageFunction = "30";
					xml = MessageFactory.convertObjectToXml(requestForQualityInspection);
					xml = callWebserviceNSWBusiness.builtXMLNotSend(userId + "", hoSoThuTuc,
							functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType,
							xml, BanTinSystemSignature.systemSignature());
					String mauTrucTuyen = Constants.MAU_TRUC_TUYEN_XACNHANDANGKY;
					List<TthcThanhPhanHoSo> lTthcThanhPhanHoSos = TthcThanhPhanHoSoLocalServiceUtil
							.findByThuTucHanhChinhIdAndMauTrucTuyen(hoSoThuTuc.getThuTucHanhChinhId(), mauTrucTuyen);
					if (lTthcThanhPhanHoSos != null && lTthcThanhPhanHoSos.size() > 0) {
						noidungHoSo.setBieuMauHoSoId(lTthcThanhPhanHoSos.get(0).getBieuMauHoSoId());
					}
					String tenTaiLieu = DKConfigurationManager.getStrProp("xac_nhan_dang_ky_kiem_tra",
							"xac_nhan_dang_ky_kiem_tra");
					long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_DA_KY;
					noidungHoSo.setTenTaiLieu(tenTaiLieu);
					noidungHoSo.setLoaiTaiLieu(loaiTaiLieu);
					noidungHoSo.setNoiDungXml(xml);
					noidungHoSo.setNgayTao(new Date());
					// noidungHoSo.setTaiLieuDinhKem(1);
					noidungHoSo.setNguoiTao(userId);
					
					//TODO: huymq performance
					ReportUtils.makePdfByNoiDungHoSo(noidungHoSo);
					
					TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(noidungHoSo);
					
					registeredInspection.setAttachedFile(noidungHoSo.getId());
					break;
				}
			}
		}
		return messageId;
	}





	private void updateHoSoThuTuc(
			long trangThaiHoSoId, TthcHoSoThuTuc tthcHoSoThuTuc) throws SystemException {
		String trangThai = MotCuaTrangThaiHoSoLocalServiceUtil.fetchMotCuaTrangThaiHoSo(trangThaiHoSoId)
				.getTenTrangThai();
		//_log.info("trangThai   "+trangThai);
		tthcHoSoThuTuc.setTrangThaiHoSo(trangThai);
//		hoSoThuTuc.setGhiChu( "<font color='red'> "+ reason+" </font>");
		tthcHoSoThuTuc.setGhiChu("<b> <font color='red'>  " + trangThai + " </font> </b>" + "<br>"+ tthcHoSoThuTuc.getGhiChu());
		tthcHoSoThuTuc.setSynchDate(new Date());
		TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
	}





	public void setTrichYeuNoiDung(TthcHoSoThuTuc tthcHoSoThuTuc,
			VehicleStatistics vehicleStatistics) {
		String trichYeuNoiDung = DKConfigurationManager.getStrProp("TONG_SO_DANG_KY_KIEM_TRA",
				"Tong So Dang Ky Kiem Tra");
		trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRegisteredVehicle() + "<br>";
		trichYeuNoiDung = trichYeuNoiDung
				+ DKConfigurationManager.getStrProp("SO_PHUONG_TIEN_CHUA_DE_NGHI_KIEM_TRA",
						"So Phuong Tien Chua De Nghi Kiem Tra");
		trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalNotYetRequestedVehicle() + "<br>";

		trichYeuNoiDung = trichYeuNoiDung
				+ DKConfigurationManager.getStrProp("SO_PT_DN_KT", "So Phuong Tien De Nghi Kiem Tra");
		trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRequestedVehicle() + "<br>";

		trichYeuNoiDung = trichYeuNoiDung
				+ DKConfigurationManager.getStrProp("SO_PT_DA_KT", "So Phuong Tien da Kiem Tra");
		trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalInspectedVehicle() + "<br>";

		trichYeuNoiDung = trichYeuNoiDung
				+ DKConfigurationManager.getStrProp("SO_PT_HOAN_KT", "So Phuong Tien hoan Kiem Tra");
		trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalCancelledVehicle() + "<br>";

		tthcHoSoThuTuc.setTrichYeuNoiDung(trichYeuNoiDung);
	}

	public long taoNoiDungHoSo(long userId, String xml, TthcHoSoThuTuc hoSoThuTuc, long loaiTaiLieu,
			String mauTrucTuyen, String tenTaiLieu,long vehicleRecordId) {
		try {		
			TthcNoidungHoSo noidungHoSo = new TthcNoidungHoSoImpl();
			long idTthcNoidungHoSo = CounterLocalServiceUtil.increment(TthcNoidungHoSo.class.getName());
			noidungHoSo.setId(idTthcNoidungHoSo);
			noidungHoSo.setMaTuSinh(functionNghiepVu.getRamdomMessage());
			noidungHoSo.setNoiDungXml(xml);
			noidungHoSo.setTenTaiLieu(tenTaiLieu);
			if ((hoSoThuTuc != null) && (hoSoThuTuc.getId() > 0)) {
				noidungHoSo.setHoSoThuTucId(hoSoThuTuc.getId());
				List<TthcThanhPhanHoSo> lTthcThanhPhanHoSos = TthcThanhPhanHoSoLocalServiceUtil
						.findByThuTucHanhChinhIdAndMauTrucTuyen(hoSoThuTuc.getThuTucHanhChinhId(), mauTrucTuyen);
				if (lTthcThanhPhanHoSos != null && lTthcThanhPhanHoSos.size() > 0) {
					noidungHoSo.setBieuMauHoSoId(lTthcThanhPhanHoSos.get(0).getBieuMauHoSoId());
				}
			} else {
				noidungHoSo.setHoSoThuTucId(Constants.HO_SO_TTHC_ID_209);
				noidungHoSo.setBieuMauHoSoId(Constants.BIEU_MAU_HO_SO_209);
			}
			if(vehicleRecordId>0){
//				_log.info("taoNoiDungHoSo  ok "+vehicleRecordId);
				noidungHoSo.setVehicleRecordId(vehicleRecordId);
			}
			noidungHoSo.setNgayGuiNhan(new Date());
			noidungHoSo.setLoaiTaiLieu(loaiTaiLieu);
			noidungHoSo.setNgayTao(new Date());
			noidungHoSo.setNguoiTao(userId);
			
			//TODO: huymq performance
			ReportUtils.makePdfByNoiDungHoSo(noidungHoSo);
			
			TthcNoidungHoSoLocalServiceUtil.addTthcNoidungHoSo(noidungHoSo);
			
			return idTthcNoidungHoSo;
		} catch (Exception e) {
			_log.error(e);
		}
		
		return 0;
	}

	public boolean xacNhanKeHoachKiemTra(Header header, long hoSoThuTucId, long phieuXuLyPhuId,
			RequestForChangingDateSite requestForChangingDateSite, long noiDungHoSoId) {
		boolean result = true;
		try {
			//_log.info("xacNhanKeHoachKiemTra   " + "   hoSoThuTucId  " + hoSoThuTucId);

			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
					.findByDossierId(hoSoThuTucId);

			ConfirmedInspection confirmedInspection = new ConfirmedInspectionImpl();
			long idConfirmedInspection = CounterLocalServiceUtil.increment(ConfirmedInspection.class.getName());
			confirmedInspection.setId(idConfirmedInspection);
			confirmedInspection.setAttachedFile(noiDungHoSoId);
			confirmedInspection.setRegisteredInspectionId(registeredInspection.getId());
			
			CustomsDeclaration customsDeclaration = new CustomsDeclarationImpl();
			long idCustomsDeclaration = CounterLocalServiceUtil.increment(CustomsDeclaration.class.getName());
			customsDeclaration.setId(idCustomsDeclaration);
			customsDeclaration.setHosothutucId(hoSoThuTucId);
			String importCustomDeclareNo = "";
			if(requestForChangingDateSite.getCustomDeclaration() != null && requestForChangingDateSite.getCustomDeclaration().size() >0){
				vn.dtt.gt.dk.nsw.model.RequestForChangingDateSite.CustomDeclaration customDeclaration  = requestForChangingDateSite.getCustomDeclaration().get(0);
				importCustomDeclareNo = customDeclaration.getImportCustomDeclareNo();
				customsDeclaration.setImportCustomDeclareNo(importCustomDeclareNo);
				customsDeclaration.setImportCustomDeclareDate(FormatData.parseStringToDate(customDeclaration.getImportCustomDeclareDate()));
			}
			if (requestForChangingDateSite.getCustomerDeclaration() != null && requestForChangingDateSite.getCustomerDeclaration().size() > 0) {

				vn.dtt.gt.dk.nsw.model.RequestForChangingDateSite.CustomerDeclaration.CustomsDeclaration customersDeclaration = requestForChangingDateSite
						.getCustomerDeclaration().get(0).getCustomsDeclaration();
				
				customsDeclaration.setCustomsResult(customersDeclaration.getCustomsResult());
				customsDeclaration.setProductCheck(customersDeclaration.getProductCheck());
				customsDeclaration.setReleaseDate(FormatData.parseStringToDate(customersDeclaration.getReleaseDate()));
				
			}
			if(importCustomDeclareNo != null && importCustomDeclareNo.trim().length() >0){
				CustomsDeclarationLocalServiceUtil.addCustomsDeclaration(customsDeclaration);
				confirmedInspection.setCustomsDeclarationId(idCustomsDeclaration);
			}
			// // 108
			
			confirmedInspection.setConfirmationCode(requestForChangingDateSite.getRequestId());
			//_log.info("requestForChangingDateSite	.getInspection().getInpectionDate())   "
//					+ requestForChangingDateSite.getInspection().getInpectionDate());
			confirmedInspection.setInspectionDate(FormatData.parseStringToDate(requestForChangingDateSite
					.getInspection().getInpectionDate()));
			confirmedInspection.setInspectionSite(requestForChangingDateSite.getInspection().getInspectionSite());
			confirmedInspection.setInspectionDistrictCode(requestForChangingDateSite.getInspection().getDistrictCode());
			confirmedInspection.setInspectionProvincecode(requestForChangingDateSite.getInspection().getProvinceCode());
			confirmedInspection.setCustomsRegion(requestForChangingDateSite.getCustomsRegion());

			if (registeredInspection.getInspectionSite().trim().equalsIgnoreCase(confirmedInspection.getInspectionSite().trim())) {
				confirmedInspection.setMarkasChangedSite(0);
			} else {
				confirmedInspection.setMarkasChangedSite(1);
			}
			confirmedInspection.setContactName(requestForChangingDateSite.getContacter().getContactName());
			confirmedInspection.setContactPhone(requestForChangingDateSite.getContacter().getContactPhone());
			confirmedInspection.setContactEmail(requestForChangingDateSite.getContacter().getContactEmail());
			if (requestForChangingDateSite.getImporterSign() != null) {
				confirmedInspection.setSignName(requestForChangingDateSite.getImporterSign().getSignName());
				confirmedInspection.setSignTitle(requestForChangingDateSite.getImporterSign().getSignTitle());
				confirmedInspection.setSignPlace(requestForChangingDateSite.getImporterSign().getSignPlace());
				confirmedInspection.setSignDate(FormatData.parseStringToDate(requestForChangingDateSite
						.getImporterSign().getSignDate()));
			}
			confirmedInspection.setRemarks(requestForChangingDateSite.getRemarks());
			confirmedInspection.setPhieuXuLyPhuId(phieuXuLyPhuId);
			confirmedInspection.setHoSoThuTucId(hoSoThuTucId);
//			InspectionRecordLocalServiceUtil.addInspectionRecord(inspectionRecord)
			long total = 0;
			int countImportedVehicle =0;
			List<VehicleRecord> vehicleRecords = new ArrayList<VehicleRecord>();
			if (requestForChangingDateSite.getImportedVehicle() != null) {

				List<VehicleRecord> records = VehicleRecordLocalServiceUtil.findByDossierId(hoSoThuTucId);
				 countImportedVehicle = requestForChangingDateSite.getImportedVehicle().size();
				//_log.info(" countImportedVehicle  "+countImportedVehicle  +" records  "+records.size());
				if (records != null && records.size() > 0) {
					for (int i = 0; i < countImportedVehicle; i++) {
						for (VehicleRecord vehicleRecord : records) {
							if (vehicleRecord.getCodeNumber() == requestForChangingDateSite.getImportedVehicle().get(i)
									.getCodeNumber()) {
								//_log.info("vehicleRecord.getCodeNumber()  "+vehicleRecord.getCodeNumber());
								if (vehicleRecord.getConfirmedInspectionId() == 0) {
									total = total + 1;
								
									vehicleRecord.setConfirmedInspectionId(idConfirmedInspection);
									vehicleRecords.add(vehicleRecord);
									//VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
								}
								break;
							}
						}
					}
				}
			}
			if(total<countImportedVehicle){
				MotCuaPhieuXuLyPhuLocalServiceUtil.deleteMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
				//_log.info("Danh sach xe khong hop le");
				callWebserviceNSWBusiness.rejectMessage(header, "Danh sach xe khong hop le");
				return false;
			}
			int size = vehicleRecords.size();
			for(int i=0;i<size;i++){
				VehicleRecord vehicleRecord = vehicleRecords.get(i);
				vehicleRecord.setMarkUpStatus(0);
				vehicleRecord.setSynchDate(new Date());
				
				VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
			}
			ConfirmedInspectionLocalServiceUtil.addConfirmedInspection(confirmedInspection);
			VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil
					.findByRegisteredInspectionId(registeredInspection.getId());

			vehicleStatistics.setTotalRequestedVehicle(total + vehicleStatistics.getTotalRequestedVehicle());

			vehicleStatistics.setTotalNotYetRequestedVehicle(vehicleStatistics.getTotalNotYetRequestedVehicle() - total);

			vehicleStatistics.setProcessingState(0);
			vehicleStatistics.setTotalCancelledVehicle(0);
			vehicleStatistics.setSynchDate(new Date());
			VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);
			
			updateTrichYeuAndGhiChu(hoSoThuTucId, phieuXuLyPhuId,
					confirmedInspection, total, vehicleStatistics);

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}





	private void updateTrichYeuAndGhiChu(long hoSoThuTucId,
			long phieuXuLyPhuId, ConfirmedInspection confirmedInspection,
			long total, VehicleStatistics vehicleStatistics)
			throws SystemException {
		TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
		setTrichYeuNoiDung(tthcHoSoThuTuc, vehicleStatistics);
		if(tthcHoSoThuTuc.getMaBienNhan()!=null&&tthcHoSoThuTuc.getMaBienNhan().length()>0){
			tthcHoSoThuTuc.setSynchDate(new Date());
			TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
		}
		MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
				.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);

		String trichYeuNoiDungPP = DKConfigurationManager.getStrProp("TONG_SO_DANG_KY_KIEM_TRA",
				"Tong So Dang Ky Kiem Tra");
		trichYeuNoiDungPP = trichYeuNoiDungPP + vehicleStatistics.getTotalRegisteredVehicle() + "<br>";
		trichYeuNoiDungPP = trichYeuNoiDungPP
				+ DKConfigurationManager.getStrProp("SO_PHUONG_TIEN_CHUA_DE_NGHI_KIEM_TRA",
						"So Phuong Tien Chua De Nghi Kiem Tra");
		trichYeuNoiDungPP = trichYeuNoiDungPP + vehicleStatistics.getTotalNotYetRequestedVehicle() + "<br>";

		trichYeuNoiDungPP = trichYeuNoiDungPP
				+ DKConfigurationManager.getStrProp("SO_PT_DN_KT", "So Phuong Tien De Nghi Kiem Tra");
		trichYeuNoiDungPP = trichYeuNoiDungPP + total + "<br>";

		phieuXuLyPhu.setTrichYeuNoiDung(trichYeuNoiDungPP);

		// String inspectionDistrictCode =
		// confirmedInspection.getInspectionDistrictCode();
		// String inspectionProvincecod =
		// confirmedInspection.getInspectionProvincecode();
		String inspectionSite = confirmedInspection.getInspectionSite();
		if (inspectionSite != null && inspectionSite.length() > 0) {
			inspectionSite = inspectionSite.replace(",", "<br>");
		}
		//		hoSoThuTuc.setGhiChu( "<font color='red'> "+ reason+" </font>");
		// Sonvh bosung 20161019
		String ghiChu = "<font color='blue'> "+ DKConfigurationManager.getStrProp("bosunghoso", "KH: [ ") + FormatData.parseDateToTringType3(confirmedInspection.getSignDate())+" ]";
		if (confirmedInspection.getRemarks().trim().length() > 0)
		{
			ghiChu = ghiChu + confirmedInspection.getRemarks()+" </font>"+" <br> ";
		} else {ghiChu = "";}
			
		
		// sonvh 20161216 bosung Tinh thanh, Quan Huyen
		String diadiemkiemtra = "";
		DmDataItem dataItemDistrictCode = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.ADMINISTRATIVE_UNITS, confirmedInspection.getInspectionDistrictCode());
		DmDataItem dataItemProvinceCode = DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.ADMINISTRATIVE_UNITS, confirmedInspection.getInspectionProvincecode());
		String nameDataItemDistrictCode = "";
		if (dataItemDistrictCode != null) {
			nameDataItemDistrictCode = dataItemDistrictCode.getName();
		}
		
		if (dataItemProvinceCode != null) {
			nameDataItemDistrictCode = (nameDataItemDistrictCode.length() > 0) ? (nameDataItemDistrictCode + ", " + dataItemProvinceCode.getName()) : dataItemProvinceCode.getName();
		}
		
		RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(hoSoThuTucId);
		if ((registeredInspection != null) 
			&& (registeredInspection.getInspectionProvinceCode().trim().equalsIgnoreCase(confirmedInspection.getInspectionProvincecode().trim()))
			&& 	(registeredInspection.getInspectionDistrictCode().trim().equalsIgnoreCase(confirmedInspection.getInspectionDistrictCode().trim()))  ){
			diadiemkiemtra = DKConfigurationManager.getStrProp("dia_diem_dang_ky_kiem_tra","Dia Diem Dang Ky Kiem Tra")
					+ ": " + "<b>" + DKConfigurationManager.getStrProp("dk.dat","Dat") + "</b>";			
		} else		{
			diadiemkiemtra = DKConfigurationManager.getStrProp("dia_diem_dang_ky_kiem_tra","Dia Diem Dang Ky Kiem Tra")
					+ ": " + "<b>" + DKConfigurationManager.getStrProp("dk.khongdat","Khong Dat") + "</b>";
		}
		
		phieuXuLyPhu.setGhiChu(DKConfigurationManager.getStrProp("THOI_GIAN_DIA_DIEM_KIEM_TRA",
				"Thoi Gian Dia Diem Kiem Tra")
				+ "<br>"
				+ FormatData.parseDateToTringType4(confirmedInspection.getInspectionDate())
				+ "<br>" + inspectionSite + "<br>" + nameDataItemDistrictCode + "<br>" 
				+ diadiemkiemtra);
		
		// sonvh 20160716 bosung So,ngay TKHQ  SO_NGAY_TOKHAI NGAY_THANG
		if ((confirmedInspection != null) && (confirmedInspection.getCustomsDeclarationId() > 0)) {
			CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
					.fetchCustomsDeclaration(confirmedInspection.getCustomsDeclarationId());
			if (customsDeclaration != null) {
				String songayTKHQ = DKConfigurationManager.getStrProp("SO_NGAY_TOKHAI",
						"So TKHQ /ngay") + "<b>" + customsDeclaration.getImportCustomDeclareNo() + "</b>"
						+ DKConfigurationManager.getStrProp("NGAY_THANG", "  ngay ")
						+ "<b>"+ FormatData.parseDateToTringDDMMYYY(customsDeclaration
								.getImportCustomDeclareDate()) + "</b>"; 
				ghiChu = ghiChu + songayTKHQ + "<br>" ;
			}
		}
		phieuXuLyPhu.setGhiChu(ghiChu + phieuXuLyPhu.getGhiChu());
		MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);
	}

	public boolean phanCongDonViKiemTra(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId,
			String corporationId) {
		boolean result = true;
		try {
			//_log.info("phanCongDonViKiemTra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.don.vi.kt",
					"phan.cong.don.vi.kt");
			//_log.info("phanCongDonViKiemTra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich);
			String messageId =functionNghiepVu.getRamdomMessage();
			messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId,hoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"30","206");
			long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
					userId);
			
			ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
					.findByPhieuXuLyPhuId(phieuXuLyPhuId);

			if ((kq > 0) && (confirmedInspection != null) && (confirmedInspection.getId() > 0)) {				
				confirmedInspection.setCorporationId(corporationId);
				ConfirmedInspectionLocalServiceUtil.updateConfirmedInspection(confirmedInspection);
				
				List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil
						.findByConfirmedInspectionId(confirmedInspection.getId());
				int count = 0;
				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					count = vehicleRecords.size();
				}

				// Update VR_CONFIRMEDINSPECTION
				// MessageType= 206
				// MessageFunction= 30
				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
						.findByDossierId(hoSoThuTucId);
				ConfirmationOfAssignment confirmationOfAssignment = new ConfirmationOfAssignment();
				confirmationOfAssignment.setRegisteredNumber(registeredInspection.getRegisteredNumber());
				confirmationOfAssignment.setRegisteredYear(Long.valueOf(FormatData.getYear(registeredInspection
						.getInspectionDate())));
				VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil
						.findByRegisteredInspectionId(registeredInspection.getId());

				confirmationOfAssignment.setTotalOfRegisteredVehicle(vehicleStatistics.getTotalRegisteredVehicle());
				confirmationOfAssignment.setTotalOfAssigned(count);
				confirmationOfAssignment.setDateAssigned(FormatData.parseDateToTring(new Date()));
				List<vn.dtt.gt.dk.nsw.model.ConfirmationOfAssignment.ImportedVehicle> importedVehicleliList = new ArrayList<ConfirmationOfAssignment.ImportedVehicle>();
				for (int i = 0; i < count; i++) {
					VehicleRecord vehicleRecord = vehicleRecords.get(i);
					vn.dtt.gt.dk.nsw.model.ConfirmationOfAssignment.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.ConfirmationOfAssignment.ImportedVehicle();
					importedVehicle.setSequenceNo(i + 1);
					importedVehicle.setCodeNumber(vehicleRecord.getCodeNumber());
					VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
							.getVehicleGroupId());

					importedVehicle.setTradeMark(vehicleGroup.getTradeMark());
					importedVehicle.setModelType(vehicleGroup.getCommercialName());
					importedVehicle.setChassisNumber(vehicleRecord.getChassisNumber());
					importedVehicle.setEngineNumber(vehicleRecord.getEngineNumber());
					importedVehicle.setMarkAsVehicle(Integer.valueOf(vehicleGroup.getMarkAsVehicle()));
					// son_vh bosung 20160122
					if ((vehicleRecord.getConfirmedInspectionId() > 0) && (vehicleRecord.getInspectionRecordId() == 0)){
					importedVehicleliList.add(importedVehicle);
					}

				}
				if (importedVehicleliList.size() > 0) {
					confirmationOfAssignment.getImportedVehicle().addAll(importedVehicleliList);
					TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
					callWebserviceNSWBusiness.message206va30(userId + "", hoSoThuTuc, messageId,
							Constants.VERSION_START, confirmationOfAssignment,phieuXuLyPhuId);
				}				
			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}



	/*
	 * De Nghi Kiem Tra
	 * by: Vinh
	 */
	
	public boolean deNghiKiemtraXN(long hoSoThuTucId, String dieuKienChuyenDich, long userId, long phieuXuLyPhuId,
			long inspectorId, String keyList, Date inpectionDate, Date dateFrom, Date dateTo) {

		boolean result = true;
		try {
			_log.info("========inspectorId======="+inspectorId);
			//_log.info("deNghiKiemtra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phan.cong.dkv", "phan.cong.dkv");
			//_log.info("deNghiKiemtra   " + "   hoSoThuTucId ===" + hoSoThuTucId + " ----------inspectorId=="
//					+ inspectorId+"=====keyList="+keyList);
			String messageId =functionNghiepVu.getRamdomMessage();
			messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId,hoSoThuTucId, dieuKienChuyenDich, null, messageId,null,"30","201");
			long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
					userId);
			
			ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
					.findByPhieuXuLyPhuId(phieuXuLyPhuId);

			if ((kq > 0) && (confirmedInspection != null) && (confirmedInspection.getId() > 0)) {
				
				confirmedInspection.setInspectorId(Long.valueOf(inspectorId));
				confirmedInspection.setDateFrom(dateFrom);
				confirmedInspection.setDateTo(dateTo);
				confirmedInspection.setLeader(ConvertUtil.convertToInt(String.valueOf(userId)));
				// confirmedInspection.setTeamleaderId(teamLeaderId);
				ConfirmedInspectionLocalServiceUtil.updateConfirmedInspection(confirmedInspection);

				List<CorporationInspector> corporationInspectors = new CorporationUtils().getListCorporationInspector(keyList);
				//_log.info("====Danh sach corporationInspectors=="+corporationInspectors.size());
				if (corporationInspectors != null && corporationInspectors.size() > 0) {
					int sizeCorporationInspector = corporationInspectors.size();
					for (int k = 0; k < sizeCorporationInspector; k++) {
						CorporationInspector corporationInspector = corporationInspectors.get(k);
						//_log.info("====corporationInspector "+k+" ===="+corporationInspector.getId()+"=====inspectorId="+inspectorId);
						Long id = CounterLocalServiceUtil.increment(CorporationAttendee.class.getName());
						CorporationAttendee corporationAttendee = new CorporationAttendeeImpl();
						corporationAttendee.setId(id);
						corporationAttendee.setConfirmedInspectionId(confirmedInspection.getId());
						corporationAttendee.setInspectorid(corporationInspector.getInspectorid());
						corporationAttendee.setInspectorName(corporationInspector.getInspectorName());
						if (inspectorId == corporationInspector.getInspectorid()) {
							corporationAttendee.setInspectorRole(1);
						} else {
							corporationAttendee.setInspectorRole(2);
						}
						corporationAttendee.setSequence(k + 1);
						CorporationAttendeeLocalServiceUtil.addCorporationAttendee(corporationAttendee);
					}
				}

				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
						.fetchRegisteredInspection(confirmedInspection.getRegisteredInspectionId());

				ScheduleReport scheduleReport = new ScheduleReport();
				scheduleReport.setRegisteredNumber(registeredInspection.getRegisteredNumber());

				scheduleReport.setRemarks("Khong");
				// // scheduleReport.setTotalOfRequested(value)

				vn.dtt.gt.dk.nsw.model.ScheduleReport.Contacter contacter = new vn.dtt.gt.dk.nsw.model.ScheduleReport.Contacter();
				contacter.setContactEmail(confirmedInspection.getContactEmail());
				contacter.setContactName(confirmedInspection.getContactName());
				contacter.setContactPhone(confirmedInspection.getContactPhone());
				scheduleReport.setContacter(contacter);
				vn.dtt.gt.dk.nsw.model.ScheduleReport.Inspection inspection = new vn.dtt.gt.dk.nsw.model.ScheduleReport.Inspection();
				inspection.setDistrictCode(confirmedInspection.getInspectionDistrictCode());
				inspection.setDistrictName(confirmedInspection.getInspectionDistrictCode());
				inspection.setInpectionDate(FormatData.parseDateToTring(dateFrom));
				inspection.setInspectionSite(confirmedInspection.getInspectionSite());
				inspection.setProvinceCode(confirmedInspection.getInspectionProvincecode());
				inspection.setProvinceName(confirmedInspection.getInspectionProvincecode());
				scheduleReport.setInspection(inspection);
				if (corporationInspectors != null && corporationInspectors.size() > 0) {
					int sizeCorporationInspector = corporationInspectors.size();
					List<vn.dtt.gt.dk.nsw.model.ScheduleReport.InspectionAttendee> inspectionAttendeeList = new ArrayList<ScheduleReport.InspectionAttendee>();
					for (int k = 0; k < sizeCorporationInspector; k++) {
						CorporationInspector corporationInspector = corporationInspectors.get(k);
						vn.dtt.gt.dk.nsw.model.ScheduleReport.InspectionAttendee inspectionAttendee = new vn.dtt.gt.dk.nsw.model.ScheduleReport.InspectionAttendee();
						inspectionAttendee.setAttendeeID(corporationInspector.getContactcode());
						inspectionAttendee.setAttendeeName(corporationInspector.getInspectorName() + " (" + corporationInspector.getInspectorPhone() + ")");
						if (inspectorId == corporationInspector.getInspectorid()) {
								inspectionAttendee.setAttendeeRole(1);
						} else {
							inspectionAttendee.setAttendeeRole(2);
						}
						inspectionAttendeeList.add(inspectionAttendee);

					}
					scheduleReport.getInspectionAttendee().addAll(inspectionAttendeeList);
				}

				vn.dtt.gt.dk.nsw.model.ScheduleReport.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.ScheduleReport.InspectorSign();
				inspectorSign.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				inspectorSign.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));

				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
						.fetchByInspectorId(userId);
				inspectorSign.setSignDate(FormatData.parseDateToTring(new Date()));
				inspectorSign.setSignName(corporationInspector.getInspectorName());
				inspectorSign.setSignPlace(corporationInspector.getPlace());
				inspectorSign.setSignTitle(corporationInspector.getTitle());
				// }
				scheduleReport.setInspectorSign(inspectorSign);

				List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil
						.findByConfirmedInspectionId(confirmedInspection.getId());
				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					List<vn.dtt.gt.dk.nsw.model.ScheduleReport.ImportedVehicle> importedVehicleliList = new ArrayList<ScheduleReport.ImportedVehicle>();
					for (int i = 0; i < vehicleRecords.size(); i++) {
						VehicleRecord vehicleRecord = vehicleRecords.get(i);
						VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
								.getVehicleGroupId());
						vn.dtt.gt.dk.nsw.model.ScheduleReport.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.ScheduleReport.ImportedVehicle();
						importedVehicle.setSequenceNo(i + 1);
						importedVehicle.setCodeNumber(vehicleRecord.getCodeNumber());
						importedVehicle.setChassisNumber(vehicleRecord.getChassisNumber());
						importedVehicle.setEngineNumber(vehicleRecord.getEngineNumber());
						importedVehicle.setVehicleType(vehicleGroup.getVehicleType());
						importedVehicle.setEngineType(vehicleGroup.getEngineType());
						importedVehicle.setTradeMark(vehicleGroup.getTradeMark());
						importedVehicle.setModelType(vehicleGroup.getCommercialName());
						// son_vh bosung 20160122
						if ((vehicleRecord.getConfirmedInspectionId() > 0) && (vehicleRecord.getInspectionRecordId() == 0)){
						importedVehicleliList.add(importedVehicle);
						}
					}
					scheduleReport.getImportedVehicle().addAll(importedVehicleliList);
					scheduleReport.setTotalOfRequested(vehicleRecords.size());
				}
				TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
				callWebserviceNSWBusiness.message201va30(userId + "", hoSoThuTuc, messageId,
						Constants.VERSION_START, scheduleReport,phieuXuLyPhuId);
			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean suaBienBanKiemtra(long hoSoThuTucId, long phieuXuLyPhuId, long userId, long registerInspectionId, InspectionRecord inspectionRecord,
		List<InspectionRecordSpec> inspectionRecordSpecs, List<VehicleRecord> vehicleRecords, List<ObjXmlDoiChieuThongSoKtXe> objXmlDoiChieuThongSoKtXes, long soPhuongTienKiemTraBanDau) {
		boolean result = true;
		try {
			
			_log.info("suaBienBanKiemtras");
			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			
			VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecords.get(0).getVehicleGroupId());
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil.findByDossierId(hoSoThuTucId);
			//_log.info("lapBienBanKiemtra1");
			VehicleInspectionRecord vehicleInspectionRecord = noiDungBienBanKiemTraDKV(hoSoThuTucId, phieuXuLyPhuId, userId, vehicleGroup, vehicleRecords, inspectionRecord, inspectionRecordSpecs, registeredInspection, objXmlDoiChieuThongSoKtXes);
			int messageType = 221;
			String messageFunction = "30";
			
			String xml = MessageFactory.convertObjectToXml(vehicleInspectionRecord);
			xml = callWebserviceNSWBusiness.builtXML(userId + "", tthcHoSoThuTuc, functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType, xml, BanTinSystemSignature.systemSignature());
			
			long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
			String mauTrucTuyen = "";
			if (vehicleGroup.getVehicleClass().trim().equalsIgnoreCase("DCX")) {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BIENBANKIEMTRA_DONGCO;
			} else {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BIENBANKIEMTRA;
			}
			
			String tenTaiLieu = DKConfigurationManager.getStrProp("bien_ban_kiem_tra_phuong_tien_nhap_khau", "bien_ban_kiem_tra_phuong_tien_nhap_khau") + "   " + inspectionRecord.getInspectionRecordNo();
			
			TthcNoidungHoSo noidungHoSoBBKTOld = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(inspectionRecord.getAttachedFile());
			_log.info("====idNoiDungHoSo======inspectionRecord.getAttachedFile()====cu bi xoaaaaaaaa====" + inspectionRecord.getAttachedFile());
			if(noidungHoSoBBKTOld != null){
				_log.info("====idNoiDungHoSo======suaBienBanKiemtra====cu bi xoaaaaaaaa====" + noidungHoSoBBKTOld.getId());
				TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo(noidungHoSoBBKTOld);
			}
			
			long idNoiDungHoSo = taoNoiDungHoSo(userId, xml, tthcHoSoThuTuc, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,0);
			_log.info("====idNoiDungHoSo======suaBienBanKiemtra====tao moi====" + idNoiDungHoSo);
			ConfirmedInspection confirmedInspection = null;
			long idInspectionRecord = inspectionRecord.getId();
			inspectionRecord.setRegisteredInspectionId(registerInspectionId);
			
			// Sonvh comment. ID Phieu xu ly phu nay la cua lich KT, khong phai BBKT						
			//inspectionRecord.setPhieuXuLyPhuId(phieuXuLyPhuId);
			
			
			if (vehicleRecords != null && vehicleRecords.size() > 0) {
				VehicleRecord vehicleRecord = vehicleRecords.get(0);
				inspectionRecord.setConfirmedInspectionId(vehicleRecord.getConfirmedInspectionId());
				confirmedInspection = ConfirmedInspectionLocalServiceUtil.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if(confirmedInspection != null){
					inspectionRecord.setCorporationId(confirmedInspection.getCorporationId());
					inspectionRecord.setInspectorId(confirmedInspection.getInspectorId());
				}
			}
			inspectionRecord.setAttachedFile(idNoiDungHoSo);
			InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);

			if (vehicleRecords != null && vehicleRecords.size() > 0) {
				//_log.info("==Id Inspection Record==counter==" + idInspectionRecord + "==id==" + inspectionRecord.getId());
				for (int i = 0; i < vehicleRecords.size(); i++) {
					VehicleRecord vehicleRecord = vehicleRecords.get(i);
					vehicleRecord.setInspectionRecordId(idInspectionRecord);
					vehicleRecord.setSynchDate(new Date());
					
					VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
				}
				VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil.findByRegisteredInspectionId(registerInspectionId);
				vehicleStatistics.setTotalInspectedVehicle(vehicleStatistics.getTotalInspectedVehicle() + vehicleRecords.size() - soPhuongTienKiemTraBanDau);
				vehicleStatistics.setSynchDate(new Date());
				VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);
				
				MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
				
				// SO_BIEN_BAN_KIEM_TRA
				// MA_DANG_KIEM_VIEN
				String trichYeuNoiDung = DKConfigurationManager.getStrProp("SO_PT_DA_KT", "So Phuong Tien da Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalInspectedVehicle() + "<br>";
				
				phieuXuLyPhu.setTrichYeuNoiDung(trichYeuNoiDung);
				
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);
				
				trichYeuNoiDung = DKConfigurationManager.getStrProp("TONG_SO_DANG_KY_KIEM_TRA", "Tong So Dang Ky Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRegisteredVehicle() + "<br>";
				trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PHUONG_TIEN_CHUA_DE_NGHI_KIEM_TRA", "So Phuong Tien Chua De Nghi Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalNotYetRequestedVehicle() + "<br>";
				
				trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PT_DN_KT", "So Phuong Tien De Nghi Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRequestedVehicle() + "<br>";
				
				trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PT_DA_KT", "So Phuong Tien Da Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalInspectedVehicle() + "<br>";
				
				trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PT_HOAN_KT", "So Phuong Tien Hoan Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalCancelledVehicle() + "<br>";
				
				tthcHoSoThuTuc.setTrichYeuNoiDung(trichYeuNoiDung);
				tthcHoSoThuTuc.setSynchDate(new Date());
				TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
				
			}
			
			if(vehicleRecords.size() < soPhuongTienKiemTraBanDau && (confirmedInspection != null) && (confirmedInspection.getId() > 0)){
				String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.kiem.tra.lai", "kiem.tra.lai");
				motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, confirmedInspection.getPhieuXuLyPhuId(), dieuKienChuyenDich, userId);
			}
			
			if ((confirmedInspection != null) && (confirmedInspection.getId() > 0)){
				List<InspectionRecord> checkBienBanLuuTam = InspectionRecordLocalServiceUtil.findByBienBanLuuTam(confirmedInspection.getId());
				boolean check = true;
				if(checkBienBanLuuTam != null && checkBienBanLuuTam.size() >0){
					check = false;
				}
				if(check){
					long count1 = VehicleRecordLocalServiceUtil.countByConfirmedInspectionIdAndInspectionRecordId(confirmedInspection.getId());
					long count2 = VehicleRecordLocalServiceUtil.countByConfirmedInspectionIdAndMarkUpStatus(confirmedInspection.getId());
					long count3 = VehicleRecordLocalServiceUtil.countByConfirmedInspectionId(confirmedInspection.getId());
					long count = count1 + count2;
					if (count >= count3) {
						ketThucKiemTraHienTruong(hoSoThuTucId, phieuXuLyPhuId, userId, confirmedInspection.getId());
					}
				}
				
			}
			
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean lapBienBanKiemtra(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId,
			long registerInspectionId, InspectionRecord inspectionRecord,
			List<InspectionRecordSpec> inspectionRecordSpecs, List<VehicleRecord> vehicleRecords) {
		boolean result = true;
		try {
			_log.info("lapBienBanKiemtra");
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.du.dieu.kien.kt",
					"du.dieu.kien.kt");
			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);

			VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecords.get(0)
					.getVehicleGroupId());
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
					.findByDossierId(hoSoThuTucId);
			VehicleInspectionRecord vehicleInspectionRecord = noiDungBienBanKiemTra(hoSoThuTucId, phieuXuLyPhuId,
					userId, vehicleGroup, vehicleRecords, inspectionRecord, inspectionRecordSpecs, registeredInspection);
			int messageType = 221;
			String messageFunction = "30";
			String xml = MessageFactory.convertObjectToXml(vehicleInspectionRecord);
			xml = callWebserviceNSWBusiness
					.builtXML(userId + "", tthcHoSoThuTuc, functionNghiepVu.getRamdomMessage(),
							Constants.VERSION_START, messageFunction, messageType, xml,
							BanTinSystemSignature.systemSignature());

			long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
			String mauTrucTuyen = "";
			if(vehicleGroup.getVehicleClass().trim().equalsIgnoreCase("DCX")){
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BIENBANKIEMTRA_DONGCO;
			} else {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BIENBANKIEMTRA;
			}

			String tenTaiLieu = DKConfigurationManager.getStrProp("bien_ban_kiem_tra_phuong_tien_nhap_khau",
					"bien_ban_kiem_tra_phuong_tien_nhap_khau") + "   " + inspectionRecord.getInspectionRecordNo();

			long idNoiDungHoSo = taoNoiDungHoSo(userId, xml, tthcHoSoThuTuc, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,0);
			//_log.info(" ket thu tao noi dung ho so " + idNoiDungHoSo);
			ConfirmedInspection confirmedInspection = null;
			long idInspectionRecord = CounterLocalServiceUtil.increment(InspectionRecord.class.getName());
			//_log.info("lapBienBanKiemtra3   "+inspectionRecord.getInspectionRecordNo()+"    "+inspectionRecord.getInspectionSite());
			inspectionRecord.setId(idInspectionRecord);
			inspectionRecord.setRegisteredInspectionId(registerInspectionId);
			
			// Sonvh comment. ID Phieu xu ly phu nay la cua lich KT, khong phai BBKT
			//inspectionRecord.setPhieuXuLyPhuId(phieuXuLyPhuId);
			
			
			if (vehicleRecords != null && vehicleRecords.size() > 0) {
				VehicleRecord vehicleRecord = vehicleRecords.get(0);
				inspectionRecord.setConfirmedInspectionId(vehicleRecord.getConfirmedInspectionId());
				confirmedInspection = ConfirmedInspectionLocalServiceUtil.fetchConfirmedInspection(inspectionRecord
						.getConfirmedInspectionId());
				inspectionRecord.setCorporationId(confirmedInspection.getCorporationId());
				inspectionRecord.setInspectorId(confirmedInspection.getInspectorId());
			}
			inspectionRecord.setHoSoThuTucId(hoSoThuTucId);
			inspectionRecord.setAttachedFile(idNoiDungHoSo);
			InspectionRecordLocalServiceUtil.addInspectionRecord(inspectionRecord);

			int sizeInspectionRecordSpecs = inspectionRecordSpecs.size();
			for (int j = 0; j < sizeInspectionRecordSpecs; j++) {
				InspectionRecordSpec inspectionRecordSpec = inspectionRecordSpecs.get(j);

				inspectionRecordSpec.setInspectionRecordid(idInspectionRecord);
				InspectionRecordSpecLocalServiceUtil.addInspectionRecordSpec(inspectionRecordSpec);

			}

			if (vehicleRecords != null && vehicleRecords.size() > 0) {
				for (int i = 0; i < vehicleRecords.size(); i++) {
					VehicleRecord vehicleRecord = vehicleRecords.get(i);
					vehicleRecord.setInspectionRecordId(idInspectionRecord);
					vehicleRecord.setSynchDate(new Date());
					VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
				}
				VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil
						.findByRegisteredInspectionId(registerInspectionId);
				vehicleStatistics.setTotalInspectedVehicle(vehicleStatistics.getTotalInspectedVehicle()+ vehicleRecords.size());
				vehicleStatistics.setSynchDate(new Date());
				VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);

				MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
						.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);

				// SO_BIEN_BAN_KIEM_TRA
				// MA_DANG_KIEM_VIEN
				String trichYeuNoiDung = DKConfigurationManager.getStrProp("TONG_SO_DANG_KY_KIEM_TRA",
						"Tong So Dang Ky Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRegisteredVehicle() + "<br>";
				trichYeuNoiDung = trichYeuNoiDung
						+ DKConfigurationManager.getStrProp("SO_PHUONG_TIEN_CHUA_DE_NGHI_KIEM_TRA",
								"So Phuong Tien Chua De Nghi Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalNotYetRequestedVehicle() + "<br>";

				trichYeuNoiDung = trichYeuNoiDung
						+ DKConfigurationManager.getStrProp("SO_PT_DN_KT", "So Phuong Tien De Nghi Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRequestedVehicle() + "<br>";

				trichYeuNoiDung = trichYeuNoiDung
						+ DKConfigurationManager.getStrProp("SO_PT_HOAN_KT", "So Phuong Tien hoan Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalCancelledVehicle() + "<br>";

				phieuXuLyPhu.setTrichYeuNoiDung(trichYeuNoiDung);

				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);

				trichYeuNoiDung = DKConfigurationManager.getStrProp("TONG_SO_DANG_KY_KIEM_TRA",
						"Tong So Dang Ky Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRegisteredVehicle() + "<br>";
				trichYeuNoiDung = trichYeuNoiDung
						+ DKConfigurationManager.getStrProp("SO_PHUONG_TIEN_CHUA_DE_NGHI_KIEM_TRA",
								"So Phuong Tien Chua De Nghi Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalNotYetRequestedVehicle() + "<br>";

				trichYeuNoiDung = trichYeuNoiDung
						+ DKConfigurationManager.getStrProp("SO_PT_DN_KT", "So Phuong Tien De Nghi Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRequestedVehicle() + "<br>";

				trichYeuNoiDung = trichYeuNoiDung
						+ DKConfigurationManager.getStrProp("SO_PT_DA_KT", "So Phuong Tien da Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalInspectedVehicle() + "<br>";

				trichYeuNoiDung = trichYeuNoiDung
						+ DKConfigurationManager.getStrProp("SO_PT_HOAN_KT", "So Phuong Tien hoan Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalCancelledVehicle() + "<br>";

				tthcHoSoThuTuc.setTrichYeuNoiDung(trichYeuNoiDung);
				tthcHoSoThuTuc.setSynchDate(new Date());
				TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);

			}

			if ((confirmedInspection != null) && (confirmedInspection.getId() > 0)){
				List<InspectionRecord> checkBienBanLuuTam = InspectionRecordLocalServiceUtil.findByBienBanLuuTam(confirmedInspection.getId());
				boolean check = true;
				if(checkBienBanLuuTam != null && checkBienBanLuuTam.size() >0){
					check = false;
				}
				if(check){
					long count1 = VehicleRecordLocalServiceUtil
							.countByConfirmedInspectionIdAndInspectionRecordId(confirmedInspection.getId());
					long count2 = VehicleRecordLocalServiceUtil
							.countByConfirmedInspectionIdAndMarkUpStatus(confirmedInspection.getId());
					long count3 = VehicleRecordLocalServiceUtil.countByConfirmedInspectionId(confirmedInspection.getId());
					long count = count1 + count2;
					if (count >= count3) {
						ketThucKiemTraHienTruong(hoSoThuTucId, phieuXuLyPhuId, userId, confirmedInspection.getId());
					}
				}
			}

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean huyBienBanKiemtra(long hoSoThuTucId, long phieuXuLyPhuBBKTId, String dieuKienChuyenDich, long userId,
			long registerInspectionId, InspectionRecord inspectionRecord) {
		boolean result = true;
		try {
			_log.info("huyBienBanKiemtra");
			if(inspectionRecord==null) return false;
			
			long confirmedInspectionId = inspectionRecord.getConfirmedInspectionId();
			long soXeHuy = VehicleRecordLocalServiceUtil.countVehicleRecordWithInspectionId(inspectionRecord.getId());
			
			BienBanKTNghiepVuUtils.resetVehicleRecordsByVG_IR(inspectionRecord.getId());
			VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil
					.findByRegisteredInspectionId(registerInspectionId);
			vehicleStatistics.setTotalInspectedVehicle(vehicleStatistics.getTotalInspectedVehicle()- soXeHuy);
			vehicleStatistics.setSynchDate(new Date());
			VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);
			
			List<MotCuaPhieuXuLyPhu> lstPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.findMotCuaPhieuXuLyPhuByConfirmedInspection(confirmedInspectionId);
			_log.info("Truoc---dichChuyenTrangThaiPhieuSuLyPhu");
			if(lstPhieuXuLyPhus != null && lstPhieuXuLyPhus.size() >0){
				// ID Phieu xu ly phu cua Lich kiem tra hien truong
				dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.kiem.tra.lai", "kiem.tra.lai");
				long idPhieuXuLyPhu = lstPhieuXuLyPhus.get(0).getId();
				motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, idPhieuXuLyPhu, dieuKienChuyenDich, userId);
				
				MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(idPhieuXuLyPhu);
//				MotCuaPhieuXuLyPhu phieuXuLyPhu = lstPhieuXuLyPhus.get(0);
				_log.info("Sau---dichChuyenTrangThaiPhieuSuLyPhu");
				// SO_BIEN_BAN_KIEM_TRA
				// MA_DANG_KIEM_VIEN
				String trichYeuNoiDung = DKConfigurationManager.getStrProp("TONG_SO_DANG_KY_KIEM_TRA", "Tong So Dang Ky Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRegisteredVehicle() + "<br>";
				trichYeuNoiDung =
					trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PHUONG_TIEN_CHUA_DE_NGHI_KIEM_TRA", "So Phuong Tien Chua De Nghi Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalNotYetRequestedVehicle() + "<br>";
				
				trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PT_DN_KT", "So Phuong Tien De Nghi Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRequestedVehicle() + "<br>";
				
				trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PT_HOAN_KT", "So Phuong Tien hoan Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalCancelledVehicle() + "<br>";
				
				if(phieuXuLyPhu != null){
					phieuXuLyPhu.setTrichYeuNoiDung(trichYeuNoiDung);
					
					MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);
				}
				
				TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
				trichYeuNoiDung = DKConfigurationManager.getStrProp("TONG_SO_DANG_KY_KIEM_TRA", "Tong So Dang Ky Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRegisteredVehicle() + "<br>";
				trichYeuNoiDung =
					trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PHUONG_TIEN_CHUA_DE_NGHI_KIEM_TRA", "So Phuong Tien Chua De Nghi Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalNotYetRequestedVehicle() + "<br>";
				
				trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PT_DN_KT", "So Phuong Tien De Nghi Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRequestedVehicle() + "<br>";
				
				trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PT_DA_KT", "So Phuong Tien da Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalInspectedVehicle() + "<br>";
				
				trichYeuNoiDung = trichYeuNoiDung + DKConfigurationManager.getStrProp("SO_PT_HOAN_KT", "So Phuong Tien hoan Kiem Tra");
				trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalCancelledVehicle() + "<br>";
				
				if (tthcHoSoThuTuc != null) {
					tthcHoSoThuTuc.setTrichYeuNoiDung(trichYeuNoiDung);
					tthcHoSoThuTuc.setSynchDate(new Date());
					TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
				}
				
			}
			
			if(inspectionRecord.getAttachedFile()>0){
				TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo(inspectionRecord.getAttachedFile());
			}
			InspectionRecordLocalServiceUtil.deleteInspectionRecordSpec(inspectionRecord.getId());
			InspectionRecordLocalServiceUtil.deleteInspectionCommonstatus(inspectionRecord.getId());
			InspectionRecordLocalServiceUtil.deleteInspectionRecordAttached(inspectionRecord.getId());
			
			//di chuyen de luu lai tien trinh huy bien ban sau do xoa phieu luon
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.huy.bbkt", "huy.bbkt");
			
			if(inspectionRecord.getPhieuXuLyPhuId() > 0) {
				motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, inspectionRecord.getPhieuXuLyPhuId(), dieuKienChuyenDich, userId);
				
				MotCuaPhieuXuLyPhuLocalServiceUtil.deleteMotCuaPhieuXuLyPhu(inspectionRecord.getPhieuXuLyPhuId());	
				_log.info("Xoa phieu xu ly phu" + inspectionRecord.getPhieuXuLyPhuId());
			}
			// delete inspectionrecord
			InspectionRecordLocalServiceUtil.deleteInspectionRecord(inspectionRecord);
			_log.info("Ket thuc XoaBienBanKiemtra");
			
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean updateBienBanKiemTraDangKiemVien(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId,
			String listIdVehicleRecordMau, InspectionRecord inspectionRecord,
			List<ObjXmlDoiChieuThongSoKtXe> objXmlDoiChieuThongSoKtXes, List<VehicleRecord> vehicleRecords,VehicleGroup vehicleGroup,
			RegisteredInspection registeredInspection,ConfirmedInspection confirmedInspection ) {
		boolean result = true;
		try {


			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			
			BienBanKTNghiepVuUtils.updateVehicleRecords(phieuXuLyPhuId, vehicleRecords, inspectionRecord.getId(), listIdVehicleRecordMau, registeredInspection.getId(), tthcHoSoThuTuc, vehicleGroup.getId());

			//_log.info("========lapBienBanKiemtra - Ha Minh  "); 
			VehicleInspectionRecord vehicleInspectionRecord = new VehicleInspectionRecord();
			vehicleInspectionRecord = noiDungBienBanKiemTraDKV(hoSoThuTucId, phieuXuLyPhuId, userId, vehicleGroup, vehicleRecords, inspectionRecord, null, registeredInspection, objXmlDoiChieuThongSoKtXes);

			int messageType = 221;
			String messageFunction = "30";
			
			String xml = MessageFactory.convertObjectToXml(vehicleInspectionRecord);
			xml = callWebserviceNSWBusiness
					.builtXML(userId + "", tthcHoSoThuTuc, functionNghiepVu.getRamdomMessage(),
							Constants.VERSION_START, messageFunction, messageType, xml,
							BanTinSystemSignature.systemSignature());
			//_log.info("========lapBienBanKiemtra-- end convertObjectToXml  ");

			long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
			String mauTrucTuyen = "";
			   if(vehicleGroup.getVehicleClass().trim().equalsIgnoreCase("DCX")){
			    mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BIENBANKIEMTRA_DONGCO;
			   } else {
			    mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BIENBANKIEMTRA;
			   }

			String tenTaiLieu = DKConfigurationManager.getStrProp("bien_ban_kiem_tra_phuong_tien_nhap_khau",
					"bien_ban_kiem_tra_phuong_tien_nhap_khau") + "   " + inspectionRecord.getInspectionRecordNo();

			long idNoiDungHoSo = taoNoiDungHoSo(userId, xml, tthcHoSoThuTuc, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,0);
			//_log.info(" -- Tao NoiDung HoSo====== " + idNoiDungHoSo);
			
			inspectionRecord.setAttachedFile(idNoiDungHoSo);
			
			InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.du.dieu.kien.kt",
					"du.dieu.kien.kt");
			String lyDo = null;
			if(vehicleGroup.getReferenceCertificateNo() !=null&&vehicleGroup.getReferenceCertificateNo().length()>0){
				lyDo =  "<b>" + DKConfigurationManager.getStrProp("cothamchieu","cothamchieu")+vehicleGroup.getReferenceCertificateNo()  +"</b>";
			}
			
			// sonvh 20160716 bosung 
			String thamchieudangkiemvien = null;
			List<InspectionCommonStatus> lstCommonStatusTTC =  InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroup.getVehicleClass(), 1, inspectionRecord.getId());
			if(lstCommonStatusTTC != null && lstCommonStatusTTC.size() >0){
				for(InspectionCommonStatus commonStatus : lstCommonStatusTTC){
					if(commonStatus.getCommonStatus() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_06")){
						if (commonStatus.getItemName().trim().length() > 0){
							thamchieudangkiemvien = DKConfigurationManager.getStrProp("thamchieu_dkv","DKV tham chieu ") + "<b>" + commonStatus.getItemName().trim() +"</b>";
						}
						
					} else if(commonStatus.getCommonStatus() == 3 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_06")){
						thamchieudangkiemvien = DKConfigurationManager.getStrProp("thamchieu_dkv_suadoi","Sua doi tham chieu ") + "<b>" + commonStatus.getItemName().trim() +"</b>";
						
					} else if(commonStatus.getCommonStatus() == 4 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_06")){
						
						thamchieudangkiemvien = DKConfigurationManager.getStrProp("thamchieu_dkv_khongapdung","Khong ap dung tham chieu. ");
					}
				}
				
				if ((thamchieudangkiemvien != null) && (thamchieudangkiemvien.trim().length() >0))
				{
					if ((lyDo != null) && (lyDo.trim().length() >0))
					{
						lyDo = lyDo + "<br>" + thamchieudangkiemvien;
					}else
					{
						lyDo = thamchieudangkiemvien;
					}
					
				}
			}
			
			ketThucKiemTra(hoSoThuTucId, userId, dieuKienChuyenDich, inspectionRecord,lyDo);

			//_log.info("===updateVehicleRecords=============");
			if ((confirmedInspection != null) && (confirmedInspection.getId() > 0)){
				List<InspectionRecord> checkBienBanLuuTam = InspectionRecordLocalServiceUtil.findByBienBanLuuTam(confirmedInspection.getId());
				boolean check = true;
				if(checkBienBanLuuTam != null && checkBienBanLuuTam.size() >0){
					check = false;
				}
				if(check){
					long count1 = VehicleRecordLocalServiceUtil
							.countByConfirmedInspectionIdAndInspectionRecordId(confirmedInspection.getId());
					long count2 = VehicleRecordLocalServiceUtil
							.countByConfirmedInspectionIdAndMarkUpStatus(confirmedInspection.getId());
					long count3 = VehicleRecordLocalServiceUtil.countByConfirmedInspectionId(confirmedInspection.getId());
					long count = count1 + count2;
					
					if (count >= count3) {
						ketThucKiemTraHienTruong(hoSoThuTucId, phieuXuLyPhuId, userId, confirmedInspection.getId());
					}
				}

			}

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}
	
	public boolean lapBienBanKiemTraDangKiemVien(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId,
			String listIdVehicleRecordMau, InspectionRecord inspectionRecord,
			List<ObjXmlDoiChieuThongSoKtXe> objXmlDoiChieuThongSoKtXes, List<VehicleRecord> vehicleRecords,VehicleGroup vehicleGroup,
			RegisteredInspection registeredInspection,ConfirmedInspection confirmedInspection ) {
		boolean result = true;
		try {
			_log.info("lapBienBanKiemTraDangKiemViens");
			TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			
			BienBanKTNghiepVuUtils.updateVehicleRecords(phieuXuLyPhuId, vehicleRecords, inspectionRecord.getId(), listIdVehicleRecordMau, registeredInspection.getId(), tthcHoSoThuTuc, vehicleGroup.getId());

			VehicleInspectionRecord vehicleInspectionRecord = new VehicleInspectionRecord();
			vehicleInspectionRecord = noiDungBienBanKiemTraDKV(hoSoThuTucId, phieuXuLyPhuId, userId, vehicleGroup, vehicleRecords, inspectionRecord, null, registeredInspection, objXmlDoiChieuThongSoKtXes);
			
			int messageType = 221;
			String messageFunction = "30";
			
			String xml = MessageFactory.convertObjectToXml(vehicleInspectionRecord);
			xml = callWebserviceNSWBusiness
					.builtXML(userId + "", tthcHoSoThuTuc, functionNghiepVu.getRamdomMessage(),
							Constants.VERSION_START, messageFunction, messageType, xml,
							BanTinSystemSignature.systemSignature());
			//_log.info("========lapBienBanKiemtra-- end convertObjectToXml  ");

			long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
			String mauTrucTuyen = "";
			   if(vehicleGroup.getVehicleClass().trim().equalsIgnoreCase("DCX")){
			    mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BIENBANKIEMTRA_DONGCO;
			   } else {
			    mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BIENBANKIEMTRA;
			   }

			String tenTaiLieu = DKConfigurationManager.getStrProp("bien_ban_kiem_tra_phuong_tien_nhap_khau",
					"bien_ban_kiem_tra_phuong_tien_nhap_khau") + "   " + inspectionRecord.getInspectionRecordNo();

			long idNoiDungHoSo = taoNoiDungHoSo(userId, xml, tthcHoSoThuTuc, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,0);

			inspectionRecord.setAttachedFile(idNoiDungHoSo);
			
			InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.du.dieu.kien.kt",
					"du.dieu.kien.kt");
			String lyDo = null;
			if(vehicleGroup.getReferenceCertificateNo() !=null&&vehicleGroup.getReferenceCertificateNo().length()>0){
				lyDo =  "<b>" + DKConfigurationManager.getStrProp("cothamchieu","cothamchieu")+vehicleGroup.getReferenceCertificateNo()  +"</b>";
			}
			
			// sonvh 20160716 bosung 
			String thamchieudangkiemvien = null;
			List<InspectionCommonStatus> lstCommonStatusTTC =  InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroup.getVehicleClass(), 1, inspectionRecord.getId());
			if(lstCommonStatusTTC != null && lstCommonStatusTTC.size() >0){
				for(InspectionCommonStatus commonStatus : lstCommonStatusTTC){
					if(commonStatus.getCommonStatus() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_06")){						
						if (commonStatus.getItemName().trim().length() > 0){
							thamchieudangkiemvien = DKConfigurationManager.getStrProp("thamchieu_dkv","DKV tham chieu ") + "<b>" + commonStatus.getItemName().trim() +"</b>";
						}
						
					} else if(commonStatus.getCommonStatus() == 3 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_06")){
						thamchieudangkiemvien = DKConfigurationManager.getStrProp("thamchieu_dkv_suadoi","Sua doi tham chieu ") + "<b>" + commonStatus.getItemName().trim() +"</b>";
						
					} else if(commonStatus.getCommonStatus() == 4 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_06")){
						
						thamchieudangkiemvien = DKConfigurationManager.getStrProp("thamchieu_dkv_khongapdung","Khong ap dung tham chieu. ");
					}
				}
				
				if ((thamchieudangkiemvien != null) && (thamchieudangkiemvien.trim().length() >0))
				{
					if ((lyDo != null) && (lyDo.trim().length() >0))
					{
						lyDo = lyDo + "<br>" + thamchieudangkiemvien;
					}else
					{
						lyDo = thamchieudangkiemvien;
					}
					
				}
			}
						
			ketThucKiemTra(hoSoThuTucId, userId, dieuKienChuyenDich, inspectionRecord,lyDo);

			//_log.info("===updateVehicleRecords=============");
			if ((confirmedInspection != null) && (confirmedInspection.getId() > 0)){
				
				List<InspectionRecord> checkBienBanLuuTam = InspectionRecordLocalServiceUtil.findByBienBanLuuTam(confirmedInspection.getId());
				boolean check = true;
				if(checkBienBanLuuTam != null && checkBienBanLuuTam.size() >0){
					check = false;
				}
				if(check){
					long count1 = VehicleRecordLocalServiceUtil
							.countByConfirmedInspectionIdAndInspectionRecordId(confirmedInspection.getId());
					long count2 = VehicleRecordLocalServiceUtil
							.countByConfirmedInspectionIdAndMarkUpStatus(confirmedInspection.getId());
					long count3 = VehicleRecordLocalServiceUtil.countByConfirmedInspectionId(confirmedInspection.getId());
					long count = count1 + count2;
	
					if ((count >= count3) && (check == true)) {
						ketThucKiemTraHienTruong(hoSoThuTucId, phieuXuLyPhuId, userId, confirmedInspection.getId());
					}
				}

			}

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}
	
	public boolean ketThucKiemTraHienTruong(long hoSoThuTucId, long phieuXuLyPhuId, long userId,
			long confirmedInspectionId) {
		boolean result = true;
		try {
			//_log.info("=============== hetXeKiemTra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ " phieuXuLyPhuId  " + phieuXuLyPhuId);

			// Update InspectionRecord

			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.het.xe.kt", "het.xe.kt");
			//_log.info(" hetXeKiemTra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " confirmedInspectionId " + confirmedInspectionId);

			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userId);

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	
	public boolean updateCorporationInspectorTTHC(long regularTthcId, long userId)
			throws SystemException {
		boolean result = true;
		try {
		CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
		if (corporationInspector != null){
			corporationInspector.setRegularTthc(regularTthcId);
			CorporationInspectorLocalServiceUtil.updateCorporationInspector(corporationInspector);
		}
		
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}



	public void ketThucKiemTra(long hoSoThuTucId, long userId,
			String dieuKienChuyenDich,
			InspectionRecord inspectionRecord,String lyDo)
			throws SystemException {
		dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.du.dieu.kien.kt",
				"du.dieu.kien.kt");
		long phieuXuLyPhuI = motCuaBusiness.putHoSo2PhieuPhu(hoSoThuTucId, TrangThaiConstains.TAO_MOI,userId);
		//_log.info("phieuXuLyPhu    =====" + phieuXuLyPhuI);
//		motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuI, dieuKienChuyenDich,
//				userId);
		
		inspectionRecord.setPhieuXuLyPhuId(phieuXuLyPhuI);
		InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
		
		
		long count = VehicleRecordLocalServiceUtil.countByInspectionRecordId(inspectionRecord.getId());

		String trichYeuNoiDung = DKConfigurationManager.getStrProp("so_phuong_tien_kiem_tra",
				"So Phuong Tien Kiem Tra");
		trichYeuNoiDung = trichYeuNoiDung + count + "<br>";
		MotCuaPhieuXuLyPhu cuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
				.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuI);
		cuaPhieuXuLyPhu.setTrichYeuNoiDung(trichYeuNoiDung);

		CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
				.fetchByInspectorId(inspectionRecord.getInspectorId());

		String ghiChu = DKConfigurationManager.getStrProp("SO_BIEN_BAN_KIEM_TRA", "So BBKT")
				+ "<b>"+ inspectionRecord.getInspectionRecordNo() + "</b><br>";
		if (corporationInspector != null) {
			ghiChu = ghiChu + DKConfigurationManager.getStrProp("MA_DANG_KIEM_VIEN", "Ma DKKT")
					+ corporationInspector.getContactcode() + "<br>";
		}
		ghiChu = ghiChu
				+ DKConfigurationManager.getStrProp("THOI_GIAN_DIA_DIEM_KIEM_TRA",
						"Thoi Gian Dia Diem Kiem Tra") + "<br>"
				+ DKConfigurationManager.getStrProp("TU_NGAY", "Tu ngay")
				+ FormatData.parseDateToTringType4(inspectionRecord.getInspectionDateFrom()) + "<br>"
				+ DKConfigurationManager.getStrProp("DEN_NGAY", "Den ngay")
				+ FormatData.parseDateToTringType4(inspectionRecord.getInspectionDateTo()) + "<br>"
				+ inspectionRecord.getInspectionSite() + "<br>";
		ghiChu = ghiChu + ReportUtils.getTenDmData(34, inspectionRecord.getConfirmedResult() + "");
		if(lyDo != null && lyDo.length()>0){
			ghiChu = ghiChu +"<br>"+ lyDo;
		}

		cuaPhieuXuLyPhu.setGhiChu(ghiChu);

		MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(cuaPhieuXuLyPhu);
	}

	public boolean deNghiDuyetBienBanKiemtra(long hoSoThuTucId, long phieuXuLyPhuId, long userId,
			InspectionRecord inspectionRecord) {
		boolean result = true;
		try {
			//_log.info("deNghiDuyetBienBanKiemtra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ " phieuXuLyPhuId  " + phieuXuLyPhuId);

			// Update InspectionRecord

			String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.de.nghi.duyet.hskt",
					"de.nghi.duyet.hskt");
			//_log.info("deNghiDuyetBienBanKiemtra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich);
			// phieuXuLyPhuId = motCuaBusiness.putHoSo2PhieuPhu(hoSoThuTucId,
			// TrangThaiConstains.PHIEU_XU_LY_PHU_XEM_XET_THU_NGHIEM);
			long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
					userId);
			if (kq > 0) {

				inspectionRecord.setPhieuXuLyPhuId(phieuXuLyPhuId);
				InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);

			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean soatXetBienBanKiemTra(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich,
			long userId, long registerInspectionId, InspectionRecord inspectionRecord,
			List<VehicleRecord> vehicleRecords, String lyDo) {
		boolean result = true;
		try {
//			_log.info("soatXetBienBanKiemTra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			// Update VR_INSPECTIONRECORD
			// Insert InspectionRecordSpec
			// Update VR_VEHICLERECORD
			// Update VR_VEHICLESTATISTICS
			// Ko message
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phe.duyet.hskt",
					"phe.duyet.hskt");
			//_log.info("soatXetBienBanKiemTra   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich);
			long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
					userId);
			if (kq > 0) {

				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					for (int i = 0; i < vehicleRecords.size(); i++) {
						VehicleRecord vehicleRecord = vehicleRecords.get(i);
						vehicleRecord.setInspectionRecordId(inspectionRecord.getId());
						vehicleRecord.setSynchDate(new Date());
						VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);

					}
					VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil
							.findByRegisteredInspectionId(registerInspectionId);
//					vehicleStatistics.setTotalInspectedVehicle(vehicleStatistics.getTotalInspectedVehicle()+ vehicleRecords.size());
//					VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);

					MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
							.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
					
					CorporationInspector tenNguoiGui = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
					String ten = "";
					if(tenNguoiGui != null){
						ten = tenNguoiGui.getInspectorName();
					} else {
						ten = String.valueOf(userId);
					}
					String ghiChuLyDo = "<font color='red'> "+  DKConfigurationManager.getStrProp("y.kien.lanh.dao.don.vi", "y.kien.lanh.dao.don.vi") + " "+ ten + " : " + lyDo + " </font>"+"<br>";
					
					String ghiChu = phieuXuLyPhu.getGhiChu();
					ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_THAM_DINH", "Cho tham dinh"),
							"");
					 ghiChu = "<b>" + DKConfigurationManager.getStrProp("CHO_THAM_DINH", "Cho tham dinh")
							+ "</b>" + "<br>" + ghiChu;

					phieuXuLyPhu.setGhiChu(ghiChuLyDo + ghiChu);
					phieuXuLyPhu.setNgayTaoPhieu(new Date());
					MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);

					TthcHoSoThuTuc tthcHoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
					String trichYeuNoiDung = DKConfigurationManager.getStrProp("TONG_SO_DANG_KY_KIEM_TRA",
							"Tong So Dang Ky Kiem Tra") + "<br>";
					trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRegisteredVehicle() + "<br>";
					trichYeuNoiDung = trichYeuNoiDung
							+ DKConfigurationManager.getStrProp("SO_PHUONG_TIEN_CHUA_DE_NGHI_KIEM_TRA",
									"So Phuong Tien Chua De Nghi Kiem Tra");
					trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalNotYetRequestedVehicle() + "<br>";

					trichYeuNoiDung = trichYeuNoiDung
							+ DKConfigurationManager.getStrProp("SO_PT_DN_KT", "So Phuong Tien De Nghi Kiem Tra");
					trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalRequestedVehicle() + "<br>";

					trichYeuNoiDung = trichYeuNoiDung
							+ DKConfigurationManager.getStrProp("SO_PT_DA_KT", "So Phuong Tien da Kiem Tra");
					trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalInspectedVehicle() + "<br>";

					trichYeuNoiDung = trichYeuNoiDung
							+ DKConfigurationManager.getStrProp("SO_PT_HOAN_KT", "So Phuong Tien hoan Kiem Tra");
					trichYeuNoiDung = trichYeuNoiDung + vehicleStatistics.getTotalCancelledVehicle();

					tthcHoSoThuTuc.setTrichYeuNoiDung(trichYeuNoiDung);
					tthcHoSoThuTuc.setSynchDate(new Date());
					TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);

				}
			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean lapDeNghiThuNhiemAnToan(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich,
			long userId, SafetestRequirement safetestRequirement, List<VehicleRecord> vehicleRecords,
			long registerInspectionId, String registerNumber, InspectionRecord inspectionRecord) {
		boolean result = true;
		try {
			//_log.info("lapDeNghiThuNhiemAnToan   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			// Insert VR_SAFETESTREQUIREMENT
			// Update VR_VEHICLERECORD
			// Update VR_VEHICLESTATISTICS
			// MessageType= 203
			// MessageFunction= 30
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			// long kq =
			// motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId,
			// phieuXuLyPhuId, dieuKienChuyenDich,
			// userId);
			long kq = 1;
			if (kq > 0) {
				long idSafetestRequirement = CounterLocalServiceUtil.increment(SafetestRequirement.class.getName());
				safetestRequirement.setId(idSafetestRequirement);
				if ((safetestRequirement.getRequirementNumber() == null) || (safetestRequirement.getRequirementNumber().trim().length() == 0)){
					safetestRequirement.setRequirementNumber("---");
				}
				

				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					int size = vehicleRecords.size();
					for (int i = 0; i < size; i++) {
						VehicleRecord vehicleRecord = vehicleRecords.get(i);
						vehicleRecord.setSafeTestRequirementId(idSafetestRequirement);
						vehicleRecord.setSynchDate(new Date());
						
						VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
					}
					VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil
							.findByRegisteredInspectionId(registerInspectionId);
					long count = vehicleStatistics.getTotalSafeTestSample() + size;
					vehicleStatistics.setTotalSafeTestSample(count);
					vehicleStatistics.setSynchDate(new Date());
					VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);

				}

				RequestOfSafeTesting requestOfSafeTesting = new RequestOfSafeTesting();
				requestOfSafeTesting.setRequestTestingNumber(safetestRequirement.getRequirementNumber());
				requestOfSafeTesting.setRegisteredNumber(registerNumber);
				requestOfSafeTesting.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				requestOfSafeTesting.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				
				DmDataItem dataItem =  DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.CORPORATION, safetestRequirement.getCorporationId());
				if(dataItem!=null){
					requestOfSafeTesting.setReportTo(dataItem.getName());
				}else{
					requestOfSafeTesting.setReportTo(safetestRequirement.getCorporationId());
				}
				requestOfSafeTesting.setContentOfRequest(safetestRequirement.getContentOfRequest());
				requestOfSafeTesting.setTestingRegisteredPlace(safetestRequirement.getTestingRegisteredPlace());
				requestOfSafeTesting.setTestingRegistration(safetestRequirement.getTestingRegistration());
				requestOfSafeTesting.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				requestOfSafeTesting.setTestingPayment(safetestRequirement.getTestingPaymentCondition());

				requestOfSafeTesting.setOrganization(DKConfigurationManager.getStrProp("vr_organization",
						"ORGANIZATION"));

				requestOfSafeTesting.setRemarks(safetestRequirement.getRemarks());

				// requestOfSafeTesting.setReportBy(value)
				// requestOfSafeTesting.setReportDate(value)
				//

				requestOfSafeTesting.setSignDate(FormatData.parseDateToTring(safetestRequirement.getSignDate()));
				requestOfSafeTesting.setSignName(safetestRequirement.getSignName());
				requestOfSafeTesting.setSignPlace(safetestRequirement.getSignPlace());
				requestOfSafeTesting.setSignTitle(safetestRequirement.getSignTitle());

				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					int size = vehicleRecords.size();
					List<vn.dtt.gt.dk.nsw.model.RequestOfSafeTesting.ImportedVehicle> importedVehicleList = new ArrayList<RequestOfSafeTesting.ImportedVehicle>();
					for (int i = 0; i < size; i++) {
						VehicleRecord vehicleRecord = vehicleRecords.get(i);
						VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
								.getVehicleGroupId());
						vn.dtt.gt.dk.nsw.model.RequestOfSafeTesting.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.RequestOfSafeTesting.ImportedVehicle();
						importedVehicle.setSequenceNo(i + 1);
						importedVehicle.setCodeNumber(vehicleRecord.getCodeNumber());
						importedVehicle.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
						importedVehicle.setVehicleType(vehicleGroup.getVehicleType());
						importedVehicle.setEngineType(vehicleGroup.getEngineType());
						importedVehicle.setTradeMark(vehicleGroup.getTradeMark());
						importedVehicle.setModelType(vehicleGroup.getCommercialName());
						importedVehicle.setChassisNumber(vehicleRecord.getChassisNumber());
						importedVehicle.setEngineNumber(vehicleRecord.getEngineNumber());
						importedVehicleList.add(importedVehicle);
						// requestOfSafeTesting.getImportedVehicle().add(importedVehicle);
					}
					if (importedVehicleList.size() > 0) {
						requestOfSafeTesting.getImportedVehicle().addAll(importedVehicleList);
					}
				}
				String xml = MessageFactory.convertObjectToXml(requestOfSafeTesting);
				xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc, "30", 203, xml);
				long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_DA_KY;
				String mauTrucTuyen = Constants.MAU_TRUC_TUYEN_LAPDENGHITHUNHIEMANTOAN;

				String tenTaiLieu = DKConfigurationManager.getStrProp("lapdenghithunghiemantoan",
						"lapdenghithunghiemantoan") + "   " + inspectionRecord.getInspectionRecordNo();

				long idNoiDungHoSo = taoNoiDungHoSo(userId, xml, hoSoThuTuc, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,0);
				safetestRequirement.setAttachedFile(idNoiDungHoSo);
				SafetestRequirementLocalServiceUtil.addSafetestRequirement(safetestRequirement);
				callWebserviceNSWBusiness.message203va30(userId + "", hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
						Constants.VERSION_START, requestOfSafeTesting);
			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean lapDeNghiThuNhiemKhiThai(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich,
			long userId, String registeredNumber, long registeredInspectionId,
			EmissionTestRequirement emissionTestRequirement, List<VehicleRecord> vehicleRecords,
			InspectionRecord inspectionRecord) {
		boolean result = true;
		try {
			//_log.info("lapDeNghiThuNhiemKhiThai   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			// long kq =
			// motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId,
			// phieuXuLyPhuId, dieuKienChuyenDich,
			// userId);
			long kq = 1;
			if (kq > 0) {
				// insert VR_EMISSIONTESTREQUIREMENT
				// [Update VR_VEHICLERECORD
				// Update VR_VEHICLESTATISTICS
				// MessageType= 202
				// MessageFunction= 30
				long idEmissionTestRequirement = CounterLocalServiceUtil.increment(EmissionTestRequirement.class.getName());				
				emissionTestRequirement.setId(idEmissionTestRequirement);
				if ((emissionTestRequirement.getRequirementNumber() == null) || (emissionTestRequirement.getRequirementNumber().trim().length() == 0)){
					emissionTestRequirement.setRequirementNumber("---");
				}
				_log.info("======vehicleRecords===NV==="+vehicleRecords);
				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					int size = vehicleRecords.size();
					for (int i = 0; i < size; i++) {
						VehicleRecord vehicleRecord = vehicleRecords.get(i);
						_log.info("=========vehicleRecord===========Object----"+vehicleRecord);
						vehicleRecord.setEmissionTestRequirementId(idEmissionTestRequirement);
						vehicleRecord.setSynchDate(new Date());
						VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
					}
				}

				VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil
						.findByRegisteredInspectionId(registeredInspectionId);
				if (vehicleStatistics != null) {
					long count = vehicleStatistics.getTotalEmissionTestSample() + vehicleRecords.size();
					vehicleStatistics.setTotalEmissionTestSample(count);
					vehicleStatistics.setSynchDate(new Date());	
					VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);

				}

				RequestOfEmissionTesting requestOfEmissionTesting = new RequestOfEmissionTesting();
				requestOfEmissionTesting.setRequestTestingNumber(emissionTestRequirement.getRequirementNumber());
				requestOfEmissionTesting.setRegisteredNumber(registeredNumber);
				requestOfEmissionTesting.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				requestOfEmissionTesting.setContentOfRequest(emissionTestRequirement.getContentOfRequest());
				requestOfEmissionTesting.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				requestOfEmissionTesting.setOrganization(DKConfigurationManager.getStrProp("vr_organization",
						"ORGANIZATION"));
				requestOfEmissionTesting.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				
				DmDataItem dataItem =  DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.CORPORATION, emissionTestRequirement.getCorporationId());
				if(dataItem!=null){
					requestOfEmissionTesting.setReportTo(dataItem.getName());
				}else{
					requestOfEmissionTesting.setReportTo(emissionTestRequirement.getCorporationId());
				}				
//				requestOfEmissionTesting.setReportTo(emissionTestRequirement.getCorporationId());

				requestOfEmissionTesting.setTestingRegisteredPlace(emissionTestRequirement.getTestingRegisteredPlace());
				requestOfEmissionTesting.setTestingPayment(emissionTestRequirement.getTestingPaymentCondition());
				requestOfEmissionTesting.setTestingRegistration(emissionTestRequirement.getTestingRegistration());
				requestOfEmissionTesting.setRemarks(emissionTestRequirement.getRemarks());
				// requestOfEmissionTesting.setReportBy()
				// requestOfEmissionTesting.setReportDate(value)

				requestOfEmissionTesting
						.setSignDate(FormatData.parseDateToTring(emissionTestRequirement.getSignDate()));
				requestOfEmissionTesting.setSignName(emissionTestRequirement.getSignName());
				requestOfEmissionTesting.setSignPlace(emissionTestRequirement.getSignPlace());
				requestOfEmissionTesting.setSignTitle(emissionTestRequirement.getSignTitle());

				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					int size = vehicleRecords.size();
					List<vn.dtt.gt.dk.nsw.model.RequestOfEmissionTesting.ImportedVehicle> importedVehicleList = new ArrayList<RequestOfEmissionTesting.ImportedVehicle>();
					for (int i = 0; i < size; i++) {
						VehicleRecord vehicleRecord = vehicleRecords.get(i);
						VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
								.getVehicleGroupId());
						vn.dtt.gt.dk.nsw.model.RequestOfEmissionTesting.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.RequestOfEmissionTesting.ImportedVehicle();
						importedVehicle.setSequenceNo(i + 1);
						importedVehicle.setCodeNumber(vehicleRecord.getCodeNumber());
						importedVehicle.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
						importedVehicle.setVehicleType(vehicleGroup.getVehicleType());
						importedVehicle.setTradeMark(vehicleGroup.getTradeMark());
						importedVehicle.setModelType(vehicleGroup.getCommercialName());
						importedVehicle.setChassisNumber(vehicleRecord.getChassisNumber());
						importedVehicle.setEngineNumber(vehicleRecord.getEngineNumber());
						importedVehicleList.add(importedVehicle);
					}
					if (importedVehicleList.size() > 0) {
						requestOfEmissionTesting.getImportedVehicle().addAll(importedVehicleList);
					}
				}
				TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
				
				String xml = MessageFactory.convertObjectToXml(requestOfEmissionTesting);
				xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc, "30", 202, xml);
				long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_DA_KY;
				String mauTrucTuyen = Constants.MAU_TRUC_TUYEN_LAPDENGHIKHITHAI;

				String tenTaiLieu = DKConfigurationManager.getStrProp("lapdenghikhithai",
						"lapdenghikhithai") + "   " + inspectionRecord.getInspectionRecordNo();

				long idNoiDungHoSo = taoNoiDungHoSo(userId, xml, hoSoThuTuc, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,0);
				emissionTestRequirement.setAttachedFile(idNoiDungHoSo);
				EmissionTestRequirementLocalServiceUtil
				.addEmissionTestRequirement(emissionTestRequirement);
				
				callWebserviceNSWBusiness.message202va30(userId + "", hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
						Constants.VERSION_START, requestOfEmissionTesting);
			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean lapDeNghiGiamDinh(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId,
			String registeredNumber, long registeredInspectionId, ControlRequirement controlRequirement,
			List<VehicleRecord> vehicleRecords, InspectionRecord inspectionRecord) {
		boolean result = true;
		try {
			//_log.info("lapDeNghiGiamDinh   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			// long kq =
			// motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId,
			// phieuXuLyPhuId, dieuKienChuyenDich,
			// userId);
			long kq = 1;
			if (kq > 0) {
				// Insert VR_CONTROLREQUIREMENT
				// Update VR_VEHICLERECORD
				// Update VR_VEHICLESTATISTICS
				// MessageType= 204
				// MessageFunction= 30
				long idControlRequirement = CounterLocalServiceUtil.increment(ControlRequirement.class.getName());
				controlRequirement.setId(idControlRequirement);
				if ((controlRequirement.getRequirementNumber() == null) || (controlRequirement.getRequirementNumber().trim().length() == 0)) {
					controlRequirement.setRequirementNumber("---");
				}

				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					int size = vehicleRecords.size();
					for (int i = 0; i < size; i++) {
						VehicleRecord vehicleRecord = vehicleRecords.get(i);
						vehicleRecord.setControlRequirementId(idControlRequirement);
						vehicleRecord.setSynchDate(new Date());
						VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
					}
				}

				VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil
						.findByRegisteredInspectionId(registeredInspectionId);
				if (vehicleStatistics != null) {
					long count = vehicleStatistics.getTotalControlRequiredVehicle() + vehicleRecords.size();
					vehicleStatistics.setTotalControlRequiredVehicle(count);
					vehicleStatistics.setSynchDate(new Date());
					VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);

				}

				RequestForControl requestForControl = new RequestForControl();
				requestForControl.setRequestTestingNumber(controlRequirement.getRequirementNumber());
				requestForControl.setRegisteredNumber(registeredNumber);
				requestForControl.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				if (inspectionRecord.getInspectionRecordDate() != null) {
					requestForControl.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
							.getInspectionRecordDate()));
				} else {
					requestForControl.setInspectionRecordDate(FormatData.parseDateToTring(new Date()));
				}

				requestForControl.setContentOfRequest(controlRequirement.getControlContent());
				requestForControl.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				requestForControl.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));

				requestForControl.setRemarks(controlRequirement.getRemarks());
				// requestForControl.setReportBy(value)
				// requestForControl.setReportDate(value)
				
				DmDataItem dataItem =  DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.CORPORATION, controlRequirement.getCorporationId());
				if(dataItem!=null){
					requestForControl.setReportTo(dataItem.getName());
				}else{
					requestForControl.setReportTo(controlRequirement.getCorporationId());
				}
//				requestForControl.setReportTo(controlRequirement.getCorporationId());

				requestForControl.setSignDate(FormatData.parseDateToTring(new Date()));
				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
						.fetchByInspectorId(userId);
				requestForControl.setSignName(corporationInspector.getInspectorName());
				requestForControl.setSignPlace(corporationInspector.getPlace());
				requestForControl.setSignTitle(corporationInspector.getTitle());

				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					int size = vehicleRecords.size();
					List<vn.dtt.gt.dk.nsw.model.RequestForControl.ImportedVehicle> importedVehicleList = new ArrayList<RequestForControl.ImportedVehicle>();
					for (int i = 0; i < size; i++) {
						VehicleRecord vehicleRecord = vehicleRecords.get(i);
						VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
								.getVehicleGroupId());
						vn.dtt.gt.dk.nsw.model.RequestForControl.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.RequestForControl.ImportedVehicle();
						importedVehicle.setSequenceNo(i + 1);
						importedVehicle.setCodeNumber(vehicleRecord.getCodeNumber());
						importedVehicle.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
						importedVehicle.setVehicleType(vehicleGroup.getVehicleType());
						importedVehicle.setEngineType(vehicleGroup.getEngineType());
						importedVehicle.setTradeMark(vehicleGroup.getTradeMark());
						importedVehicle.setModelType(vehicleGroup.getCommercialName());
						importedVehicle.setChassisNumber(vehicleRecord.getChassisNumber());
						importedVehicle.setEngineNumber(vehicleRecord.getEngineNumber());
						importedVehicleList.add(importedVehicle);

					}
					if (importedVehicleList.size() > 0) {
						requestForControl.getImportedVehicle().addAll(importedVehicleList);
					}
				}
				TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);

				String xml = MessageFactory.convertObjectToXml(requestForControl);
				xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc, "30", 204, xml);
				long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_DA_KY;
				String mauTrucTuyen = Constants.MAU_TRUC_TUYEN_LAPDENGHIGIAMDINH;

				String tenTaiLieu = DKConfigurationManager.getStrProp("lapdenghigiamdinh",
						"lapdenghigiamdinh") + "   " + inspectionRecord.getInspectionRecordNo();

				long idNoiDungHoSo = taoNoiDungHoSo(userId, xml, hoSoThuTuc, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,0);
				controlRequirement.setAttachedFile((new Long(idNoiDungHoSo)).intValue());
				ControlRequirementLocalServiceUtil.addControlRequirement(controlRequirement);

				callWebserviceNSWBusiness.message204va30(userId + "", hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
						Constants.VERSION_START, requestForControl);
			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean lapBaoCaoThuNghiemAnToan(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich,
			long userId, String registeredNumber, SafetyTestReport safetyTestReport,
			List<SatetyTestReportSpec> satetyTestReportSpecs) {
		boolean result = true;
		try {
			//_log.info("lapBaoCaoThuNghiemAnToan   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			// long kq =
			// motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId,
			// phieuXuLyPhuId, dieuKienChuyenDich,
			// userId);'
			long kq = 1;
			if (kq > 0) {
				// Insert VR_SAFETYTESTREPORT
				// Insert VR_SAFETYTESTREPORTSPEC

				long idSafetyTestReport = CounterLocalServiceUtil.increment(SafetyTestReport.class.getName());

				safetyTestReport.setId(idSafetyTestReport);
				SafetyTestReportLocalServiceUtil.addSafetyTestReport(safetyTestReport);
				if (satetyTestReportSpecs != null & satetyTestReportSpecs.size() > 0) {
					int size = satetyTestReportSpecs.size();
					for (int i = 0; i < size; i++) {
						SatetyTestReportSpec satetyTestReportSpec = satetyTestReportSpecs.get(i);
						satetyTestReportSpec.setSaftyTestReportId(idSafetyTestReport);
						SatetyTestReportSpecLocalServiceUtil.addSatetyTestReportSpec(satetyTestReportSpec);
					}
				}

			}

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean lapBaoCaoThuNghiemKhiThai(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich,
			long userId, EmissionTestReport emissionTestReport) {
		boolean result = true;
		try {
			//_log.info("lapBaoCaoThuNghiemKhiThai   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			// long kq =
			// motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId,
			// phieuXuLyPhuId, dieuKienChuyenDich,
			// userId);
			long kq = 1;
			// Insert VR_EMISSIONTESTREPORT
			if (kq > 0) {
				EmissionTestReportLocalServiceUtil.addEmissionTestReport(emissionTestReport);
			}

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean nhanKetQuaGiamDinh(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId,
			ControlReport controlReport) {
		boolean result = true;
		try {
			//_log.info("nhanKetQuaGiamDinh   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
					userId);

			// Insert VR_CONTROLREPORT

			if (kq > 0) {
				ControlReportLocalServiceUtil.addControlReport(controlReport);
			}

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public long xemTruocBanThaoChungChi(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId,
			String registeredNumber, DraftCertificate draftCertificate,InspectionRecord inspectionRecord,
			List<DraftCertificateSpec> draftCertificateSpecs, List<VehicleRecord> vehicleRecords) {
		long idNoiDungHoSo = 0;
		try {
			if(draftCertificate.getAttachedFile()>0){
				TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo(draftCertificate.getAttachedFile());
			}

			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
					.findByDossierId(hoSoThuTucId);
			long kq = 1;
			if ((kq > 0) && (draftCertificate.getInspectionReportId() > 0)){

				// Insert VR_DRAFTCERTIFICATE
				// Insert VR_DRAFTCERTIFICATESPEC
				DraftCertificate draftCertificate2 = DraftCertificateLocalServiceUtil.fetchByInspectionReportId(draftCertificate.getInspectionReportId());
				// Ko message
//				boolean check=true;
				long idDraftCertificate = 0;
				if(draftCertificate2==null){
					try{
						 idDraftCertificate = CounterLocalServiceUtil.increment(DraftCertificate.class.getName());
						 //_log.info("idDraftCertificate    "+idDraftCertificate);
						draftCertificate.setId(idDraftCertificate);
						DraftCertificateLocalServiceUtil.addDraftCertificate(draftCertificate);
					}catch (Exception e) {
						 idDraftCertificate = CounterLocalServiceUtil.increment(DraftCertificate.class.getName());
						 //_log.info("idDraftCertificate    "+idDraftCertificate);
							draftCertificate.setId(idDraftCertificate);
							DraftCertificateLocalServiceUtil.addDraftCertificate(draftCertificate);
						_log.error(e);
					}
				}else{
//					 check=false;
					//DraftCertificate draftCertificate2 = DraftCertificateLocalServiceUtil.fetchByInspectionReportId(draftCertificate.getInspectionReportId());
					 idDraftCertificate = draftCertificate2.getId();
					draftCertificate.setId(draftCertificate2.getId());
					DraftCertificateLocalServiceUtil.updateDraftCertificate(draftCertificate);
				}
				
				if (draftCertificateSpecs != null && draftCertificateSpecs.size() > 0) {
					DraftCertificateSpecLocalServiceUtil.deleteDraftCertificateSpecWithDraftCertificateId(idDraftCertificate);
					int size = draftCertificateSpecs.size();
					for (int i = 0; i < size; i++) {
						DraftCertificateSpec draftCertificateSpec = draftCertificateSpecs.get(i);
						draftCertificateSpec.setDraftCertificateId(idDraftCertificate);
						DraftCertificateSpecLocalServiceUtil.addDraftCertificateSpec(draftCertificateSpec);
					}
				}

				VehicleGroup vehicleGroup = null;

				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					
					vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecords.get(0)
							.getVehicleGroupId());
					
				}

				String xml = "chua lam";
				long loaiTaiLieu = 0;
				String mauTrucTuyen = "";
				String tenTaiLieu = "";
				if (draftCertificate.getCertificateType() == 1) {
				
					loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
					if (vehicleGroup.getMarkAsVehicle() == 1) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_CHUNG_NHAN;
					} else {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAYCHUNGNHANDC;
					}
					tenTaiLieu = DKConfigurationManager.getStrProp("ban_thao", "Ban thao")
							+ DKConfigurationManager.getStrProp("giay_chung_nhan", "giay_chung_nhan");

					CertificateOfQuanlityConformity certificateOfQuanlityConformity = guiGiayChungNhan(hoSoThuTuc,
							userId, vehicleRecords.get(0), registeredInspection, draftCertificate, vehicleGroup,draftCertificateSpecs,inspectionRecord);
					//certificateOfQuanlityConformity.getImportedVehicle().get(0).set
					int messageType = 211;
					String messageFunction = "30";
					// String xmlData =
					// BanTin211.createCurrentStatusOfImportedVehicleList();
					xml = MessageFactory.convertObjectToXml(certificateOfQuanlityConformity);
					xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
							functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType,
							xml, BanTinSystemSignature.systemSignature());
				} else if (draftCertificate.getCertificateType() == 2) {
					loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
					if (vehicleGroup.getMarkAsVehicle() == 1) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBMIEN;
					} else {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBMIENDC;
					}
					tenTaiLieu = DKConfigurationManager.getStrProp("ban_thao", "Ban thao")
							+ DKConfigurationManager.getStrProp("thong_bao_mien", "thong_bao_mien");
					NoticeOfExemptionFromInspection noticeOfExemptionFromInspection = guiThongBaoMien(hoSoThuTuc,
							userId, vehicleRecords.get(0), registeredInspection, draftCertificate, vehicleGroup,inspectionRecord,draftCertificateSpecs);
					int messageType = 212;
					String messageFunction = "30";
					xml = MessageFactory.convertObjectToXml(noticeOfExemptionFromInspection);
					xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
							functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType,
							xml, BanTinSystemSignature.systemSignature());

				} else if (draftCertificate.getCertificateType() == 3) {
					loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
					if (vehicleGroup.getMarkAsVehicle() == 1) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBKHONGDAT;
					} else {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBKHONGDATDC;
					}
					tenTaiLieu = DKConfigurationManager.getStrProp("ban_thao", "Ban thao")
							+ DKConfigurationManager.getStrProp("thong_bao_khong_dat", "thong_bao_khong_dat");

					NoticeOfNonConformity noticeOfNonConformity = guiThongBaoKhongDat(hoSoThuTuc, userId,
							vehicleRecords.get(0), registeredInspection, draftCertificate, vehicleGroup,inspectionRecord);
					int messageType = 213;
					String messageFunction = "30";
					xml = MessageFactory.convertObjectToXml(noticeOfNonConformity);
					xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
							functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType,
							xml, BanTinSystemSignature.systemSignature());
				} else if (draftCertificate.getCertificateType() == 4) {
					loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;

					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBXNTINHTRANG;

					tenTaiLieu = DKConfigurationManager.getStrProp("ban_thao", "Ban thao")
							+ DKConfigurationManager.getStrProp("thong_bao_xac_nhan_tinh_trang",
									"thong_bao_xac_nhan_tinh_trang");
					ConfirmationStatusOfQuanlityConformity confirmationStatusOfQuanlityConformity = guiThongBaoXacNhanTinhTrang(
							hoSoThuTuc, userId, vehicleRecords.get(0), registeredInspection, draftCertificate,
							vehicleGroup,inspectionRecord,draftCertificateSpecs);
					int messageType = 216;
					String messageFunction = "30";
					xml = MessageFactory.convertObjectToXml(confirmationStatusOfQuanlityConformity);
					xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
							functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType,
							xml, BanTinSystemSignature.systemSignature());
				} else if (draftCertificate.getCertificateType() == 5) {
					loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
					if (vehicleGroup.getMarkAsVehicle() == 1) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBVIPHAM;
					} else {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBVIPHAMDC;
					}
					tenTaiLieu = DKConfigurationManager.getStrProp("ban_thao", "Ban thao")
							+ DKConfigurationManager.getStrProp("thong_bao_vi_pham", "thong_bao_vi_pham");
					NoticeOfViolation noticeOfViolation = guiThongBaoViPham(hoSoThuTuc, userId, vehicleRecords.get(0),
							registeredInspection, draftCertificate, vehicleGroup,inspectionRecord);
					int messageType = 216;
					String messageFunction = "30";
					xml = MessageFactory.convertObjectToXml(noticeOfViolation);
					xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
							functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType,
							xml, BanTinSystemSignature.systemSignature());
				}

				idNoiDungHoSo = taoNoiDungHoSo(userId, xml, hoSoThuTuc, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,0);
				draftCertificate.setAttachedFile(idNoiDungHoSo);
				DraftCertificateLocalServiceUtil.updateDraftCertificate(draftCertificate);

			}

		} catch (Exception e) {
			_log.error(e);

		}
		return idNoiDungHoSo;
	}

	public boolean lapBanThaoChungChi(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId,
			String registeredNumber, DraftCertificate draftCertificate,InspectionRecord inspectionRecord,
			List<DraftCertificateSpec> draftCertificateSpecs, List<VehicleRecord> vehicleRecords) {
		boolean result = true;
		try {
//			_log.info("lapBanThaoChungChi");

			if(draftCertificate.getAttachedFile()>0){
				TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo(draftCertificate.getAttachedFile());
			}
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.tham.dinh", "tham.dinh");

			long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
					userId);
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
					.findByDossierId(hoSoThuTucId);
			if ((kq > 0) && (draftCertificate != null) && (draftCertificate.getInspectionReportId() > 0)) {

				// Insert VR_DRAFTCERTIFICATE
				// Insert VR_DRAFTCERTIFICATESPEC
				// Update VR_VEHICLERECORD
				// Ko message
				
				long idDraftCertificate =0;
				DraftCertificate draftCertificate2 = DraftCertificateLocalServiceUtil.fetchByInspectionReportId(draftCertificate.getInspectionReportId());
				if(draftCertificate2==null){
					try{	
						 idDraftCertificate = CounterLocalServiceUtil.increment(DraftCertificate.class.getName());
						 //_log.info("idDraftCertificate    "+idDraftCertificate);
						draftCertificate.setId(idDraftCertificate);
						DraftCertificateLocalServiceUtil.addDraftCertificate(draftCertificate);
					}catch (Exception e) {
						 idDraftCertificate = CounterLocalServiceUtil.increment(DraftCertificate.class.getName());
						 //_log.info("idDraftCertificate    "+idDraftCertificate);
							draftCertificate.setId(idDraftCertificate);
							DraftCertificateLocalServiceUtil.addDraftCertificate(draftCertificate);
						_log.error(e);
					}
				}else{
					idDraftCertificate =draftCertificate2.getId();
					draftCertificate.setId(idDraftCertificate);
					//DraftCertificateLocalServiceUtil.updateDraftCertificate(draftCertificate);
				}

				if (draftCertificateSpecs != null && draftCertificateSpecs.size() > 0) {
					DraftCertificateSpecLocalServiceUtil.deleteDraftCertificateSpecWithDraftCertificateId(idDraftCertificate);
					int size = draftCertificateSpecs.size();
					for (int i = 0; i < size; i++) {
						DraftCertificateSpec draftCertificateSpec = draftCertificateSpecs.get(i);
						draftCertificateSpec.setDraftCertificateId(idDraftCertificate);
						DraftCertificateSpecLocalServiceUtil.addDraftCertificateSpec(draftCertificateSpec);
					}
				}
				VehicleGroup vehicleGroup = null;

				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					int size = vehicleRecords.size();
					vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecords.get(0)
							.getVehicleGroupId());
					for (int i = 0; i < size; i++) {
						VehicleRecord vehicleRecord = vehicleRecords.get(i);
			//			_log.info("lapBanThaoChungChi vehicleRecord.getId()  "+vehicleRecord.getId());
						vehicleRecord.setDraftCertificateId(idDraftCertificate);
						vehicleRecord.setSynchDate(new Date());
						VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
					}
				}

				MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
						.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
				String ghiChu = phieuXuLyPhu.getGhiChu();
				ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_THAM_DINH", "Cho tham dinh"), "");
				ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_XAC_NHAN", "Cho xac nhan"), "");
				
				ghiChu = ghiChu.replace("<b>"+DKConfigurationManager.getStrProp("CHO_XAC_NHAN", "Cho xac nhan")+"</b><br>", "");
				ghiChu = ghiChu.replace("<b>"+DKConfigurationManager.getStrProp("CHO_THAM_DINH", "Cho tham dinh")+"</b><br>", "");
				
				ghiChu = "<b>"+DKConfigurationManager.getStrProp("CHO_XAC_NHAN", "Cho xac nhan")+"</b><br>"+ghiChu;
				
				phieuXuLyPhu.setGhiChu(ghiChu);
				phieuXuLyPhu.setNgayTaoPhieu(new Date());
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);

				String xml = "chua lam";
				long loaiTaiLieu = 0;
				String mauTrucTuyen = "";
				String tenTaiLieu = "";
				if (draftCertificate.getCertificateType() == 1) {
					loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
					if (vehicleGroup.getMarkAsVehicle() == 1) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_CHUNG_NHAN;
					} else {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAYCHUNGNHANDC;
					}
					tenTaiLieu = DKConfigurationManager.getStrProp("ban_thao", "Ban thao")
							+ DKConfigurationManager.getStrProp("giay_chung_nhan", "giay_chung_nhan");

					CertificateOfQuanlityConformity certificateOfQuanlityConformity = guiGiayChungNhan(hoSoThuTuc,
							userId, vehicleRecords.get(0), registeredInspection, draftCertificate, vehicleGroup,draftCertificateSpecs,inspectionRecord);
					int messageType = 211;
					String messageFunction = "30";
					
					xml = MessageFactory.convertObjectToXml(certificateOfQuanlityConformity);
					xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
							functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType,
							xml, BanTinSystemSignature.systemSignature());
				} else if (draftCertificate.getCertificateType() == 2) {
					loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
					if (vehicleGroup.getMarkAsVehicle() == 1) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBMIEN;
					} else {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBMIENDC;
					}
					tenTaiLieu = DKConfigurationManager.getStrProp("ban_thao", "Ban thao")
							+ DKConfigurationManager.getStrProp("thong_bao_mien", "thong_bao_mien");
					NoticeOfExemptionFromInspection noticeOfExemptionFromInspection = guiThongBaoMien(hoSoThuTuc,
							userId, vehicleRecords.get(0), registeredInspection, draftCertificate, vehicleGroup,inspectionRecord,draftCertificateSpecs);
					int messageType = 212;
					String messageFunction = "30";
					xml = MessageFactory.convertObjectToXml(noticeOfExemptionFromInspection);
					xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
							functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType,
							xml, BanTinSystemSignature.systemSignature());

				} else if (draftCertificate.getCertificateType() == 3) {
					loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
					if (vehicleGroup.getMarkAsVehicle() == 1) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBKHONGDAT;
					} else {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBKHONGDATDC;
					}
					tenTaiLieu = DKConfigurationManager.getStrProp("ban_thao", "Ban thao")
							+ DKConfigurationManager.getStrProp("thong_bao_khong_dat", "thong_bao_khong_dat");

					NoticeOfNonConformity noticeOfNonConformity = guiThongBaoKhongDat(hoSoThuTuc, userId,
							vehicleRecords.get(0), registeredInspection, draftCertificate, vehicleGroup,inspectionRecord);
					int messageType = 213;
					String messageFunction = "30";
					xml = MessageFactory.convertObjectToXml(noticeOfNonConformity);
					xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
							functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType,
							xml, BanTinSystemSignature.systemSignature());
				} else if (draftCertificate.getCertificateType() == 4) {
					loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;

					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBXNTINHTRANG;

					tenTaiLieu = DKConfigurationManager.getStrProp("ban_thao", "Ban thao")
							+ DKConfigurationManager.getStrProp("thong_bao_xac_nhan_tinh_trang",
									"thong_bao_xac_nhan_tinh_trang");
					ConfirmationStatusOfQuanlityConformity confirmationStatusOfQuanlityConformity = guiThongBaoXacNhanTinhTrang(
							hoSoThuTuc, userId, vehicleRecords.get(0), registeredInspection, draftCertificate,
							vehicleGroup,inspectionRecord,draftCertificateSpecs);
					int messageType = 216;
					String messageFunction = "30";
					xml = MessageFactory.convertObjectToXml(confirmationStatusOfQuanlityConformity);
					xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
							functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType,
							xml, BanTinSystemSignature.systemSignature());
				} else if (draftCertificate.getCertificateType() == 5) {
					loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
					if (vehicleGroup.getMarkAsVehicle() == 1) {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBVIPHAM;
					} else {
						mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBVIPHAMDC;
					}
					tenTaiLieu = DKConfigurationManager.getStrProp("ban_thao", "Ban thao")
							+ DKConfigurationManager.getStrProp("thong_bao_vi_pham", "thong_bao_vi_pham");
					NoticeOfViolation noticeOfViolation = guiThongBaoViPham(hoSoThuTuc, userId, vehicleRecords.get(0),
							registeredInspection, draftCertificate, vehicleGroup,inspectionRecord);
					int messageType = 216;
					String messageFunction = "30";
					xml = MessageFactory.convertObjectToXml(noticeOfViolation);
					xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
							functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction, messageType,
							xml, BanTinSystemSignature.systemSignature());
				}

				long idNoiDungHoSo = taoNoiDungHoSo(userId, xml, hoSoThuTuc, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,0);
				draftCertificate.setAttachedFile(idNoiDungHoSo);
				DraftCertificateLocalServiceUtil.updateDraftCertificate(draftCertificate);

			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean xacNhanChungChi(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId,
			String registeredNumber, DraftCertificate draftCertificate, String editorName,
			List<CertificateCircular> certificateCirculars, String signName, String signTitle, String signPlace, String ghiChuBanThao,
			ActionRequest actionRequest) {
		boolean result = true;
		try {
			//_log.info("thamDinhBanThaoChungChi   " + "   hoSoThuTucId  " + hoSoThuTucId
//					+ " dieuKienChuyenDich " + dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.da.xac.nhan.cc",
					"da.xac.nhan.cc");
			//_log.info("thamDinhBanThaoChungChi   " + "   hoSoThuTucId  " + hoSoThuTucId
//					+ " dieuKienChuyenDich " + dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			long kq = motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
					userId);
			if ((kq > 0) && (draftCertificate != null) && (draftCertificate.getInspectionReportId() > 0) && (draftCertificate.getId() > 0)) {
				CertificateRecord certificateRecord = new CertificateRecordImpl();
				long idCertificateRecord = CounterLocalServiceUtil.increment(CertificateRecord.class.getName());
				certificateRecord.setId(idCertificateRecord);
				certificateRecord.setCertificateNumber("DRAFT");
				certificateRecord.setSafetyTestReportId(draftCertificate.getSafetytestReportId());
				certificateRecord.setCertificateType(draftCertificate.getCertificateType());
				certificateRecord.setCommentInWrongCase(0);
				certificateRecord.setCopReportId(draftCertificate.getCopReportId());
				certificateRecord.setCreatedDate(new Date());
				certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_0);
				certificateRecord.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
				certificateRecord.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				certificateRecord.setEditorName(editorName);
				certificateRecord.setEmissionTestReportId(draftCertificate.getEmissionTestReportId());
				certificateRecord.setInspectionReportId(draftCertificate.getInspectionReportId());
				certificateRecord.setReason(draftCertificate.getReason());
				certificateRecord.setRemarks(ghiChuBanThao);
				certificateRecord.setSafetyTestReportId(draftCertificate.getSafetytestReportId());
				certificateRecord.setSignDate(new Date());
				certificateRecord.setDossierId(hoSoThuTucId);
				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
						.fetchByInspectorId(userId);

				certificateRecord.setSignName(corporationInspector.getInspectorName());

				certificateRecord.setSignPlace(corporationInspector.getPlace());

				certificateRecord.setSignTitle(corporationInspector.getTitle());

				certificateRecord.setStampStatus(0);

				CertificateRecordLocalServiceUtil.addCertificateRecord(certificateRecord);

				createCertificateRecordSpec(draftCertificate, idCertificateRecord);

				List<VehicleRecord> liVehicleRecords = VehicleRecordLocalServiceUtil
						.findByDraftCertificateId(draftCertificate.getId());
				VehicleGroup vehicleGroup = null;
				boolean first = true;
				TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
						.findByDossierId(hoSoThuTucId);
				for (VehicleRecord vehicleRecord : liVehicleRecords) {
					try {
						if (vehicleGroup == null) {
							vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
									.getVehicleGroupId());
						}
						//_log.info("vehicleGroup.getMarkAsVehicle()   "+vehicleGroup.getMarkAsVehicle() +"  vehicleGroup.getVehicleType() "+vehicleGroup.getVehicleClass());
						if ((vehicleGroup.getMarkAsVehicle() == 1
								&& vehicleGroup.getVehicleClass().equals("XDD"))
								||(vehicleGroup.getMarkAsVehicle() == 0
								&& vehicleGroup.getVehicleClass().equals("DCX")) 
								){
//							_log.info("co vehicleGroup.getVehicleType().trim().toLowerCase().startsWith  ");
							vehicleRecord.setCertificateRecordId(idCertificateRecord);
							vehicleRecord.setSynchDate(new Date());
							VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
						} else {
//							_log.info("not vehicleGroup.getVehicleType().trim().toLowerCase().startsWith");
							if (first) {
								vehicleRecord.setCertificateRecordId(idCertificateRecord);
								vehicleRecord.setSynchDate(new Date());
								VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
								first = false;
							} else {

								long idCertificateRecord2 = createCertificateRecord(hoSoThuTucId, phieuXuLyPhuId,
										userId, registeredNumber, draftCertificate, editorName,
										certificateCirculars, signName, signTitle, signPlace);
								vehicleRecord.setCertificateRecordId(idCertificateRecord2);
								vehicleRecord.setSynchDate(new Date());
								VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);

								createCertificateRecordSpec(draftCertificate, idCertificateRecord2);
								fillData2CertificateCirculars(draftCertificate, idCertificateRecord2, vehicleGroup);
								createAttachFileForCertificate(userId, actionRequest,
										idCertificateRecord2, vehicleRecord,
										vehicleGroup, hoSoThuTuc, registeredInspection, StringPool.BLANK, StringPool.BLANK);
							}
						}
						
						
						// //////////////////// END EDit 31.05

					} catch (Exception e) {
						_log.error(e);
					}
				}
				createAttachFileForCertificate(userId, actionRequest,
						idCertificateRecord, liVehicleRecords.get(0),
						vehicleGroup, hoSoThuTuc, registeredInspection, StringPool.BLANK, StringPool.BLANK);

				fillData2CertificateCirculars(draftCertificate, idCertificateRecord, vehicleGroup);
				if(draftCertificate.getAttachedFile()>0){
					TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo(draftCertificate.getAttachedFile());
				}
				MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
						.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
				String ghiChu = phieuXuLyPhu.getGhiChu();
//				ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_XAC_NHAN", "Cho xac nhan"),
//						DKConfigurationManager.getStrProp("CHO_PHE_DUYET", "Cho phe duyet"));
				ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_XAC_NHAN", "Cho xac nhan"),
						"");
				ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_PHE_DUYET", "Cho phe duyet"),
						"");
				ghiChu = "<b>"+DKConfigurationManager.getStrProp("CHO_PHE_DUYET", "Cho phe duyet")+"</b><br>"+ghiChu;
				phieuXuLyPhu.setGhiChu(ghiChu);
				phieuXuLyPhu.setNgayTaoPhieu(new Date());
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);


			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}





	public void createAttachFileForCertificate(long userId,
			ActionRequest actionRequest, long certificateRecordId,
			VehicleRecord vehicleRecord, VehicleGroup vehicleGroup,
			TthcHoSoThuTuc hoSoThuTuc, RegisteredInspection registeredInspection, String soChungChiCu, String ngayChungChiCu)
			throws IOException, SystemException {
		CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(certificateRecordId);
		String xml = "chua lam";
		long loaiTaiLieu = 0;
		String mauTrucTuyen = "";
		String tenTaiLieu = "";
		if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_GCN) {
			loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
			if (vehicleGroup.getMarkAsVehicle() == 1) {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_CHUNG_NHAN;
			} else {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAYCHUNGNHANDC;
			}
			tenTaiLieu = DKConfigurationManager.getStrProp("giay_chung_nhan", "giay_chung_nhan")
					+ DKConfigurationManager.getStrProp("cho_ky_duyet", "cho_ky_duyet");
			CertificateOfQuanlityConformity certificateOfQuanlityConformity = guiGiayChungNhan(
					hoSoThuTuc, userId, vehicleRecord, registeredInspection,
					certificateRecord, vehicleGroup, Constants.KO_GUI,  soChungChiCu, ngayChungChiCu,null,null);
			int messageType = 211;
			String messageFunction = "30";
			xml = MessageFactory.convertObjectToXml(certificateOfQuanlityConformity);
			xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
					functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction,
					messageType, xml, BanTinSystemSignature.systemSignature());
		} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBM) {
			loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
			if (vehicleGroup.getMarkAsVehicle() == 1) {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBMIEN;
			} else {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBMIENDC;
			}
			tenTaiLieu = DKConfigurationManager.getStrProp("thong_bao_mien", "thong_bao_mien")
					+ DKConfigurationManager.getStrProp("cho_ky_duyet", "cho_ky_duyet");
			NoticeOfExemptionFromInspection noticeOfExemptionFromInspection = guiThongBaoMien(
					hoSoThuTuc, userId,vehicleRecord, registeredInspection,
					certificateRecord, vehicleGroup, Constants.KO_GUI,  soChungChiCu, ngayChungChiCu,null,null);
			int messageType = 212;
			String messageFunction = "30";
			xml = MessageFactory.convertObjectToXml(noticeOfExemptionFromInspection);
			xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
					functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction,
					messageType, xml, BanTinSystemSignature.systemSignature());
		} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBKD) {
			loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
			if (vehicleGroup.getMarkAsVehicle() == 1) {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBKHONGDAT;
			} else {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBKHONGDATDC;
			}
			tenTaiLieu = DKConfigurationManager
					.getStrProp("thong_bao_khong_dat", "thong_bao_khong_dat")
					+ DKConfigurationManager.getStrProp("cho_ky_duyet", "cho_ky_duyet");
			NoticeOfNonConformity noticeOfNonConformity = guiThongBaoKhongDat(hoSoThuTuc, userId,
					vehicleRecord, registeredInspection, certificateRecord, vehicleGroup,
					Constants.KO_GUI,  soChungChiCu, ngayChungChiCu,null,null);
			int messageType = 213;
			String messageFunction = "30";
			xml = MessageFactory.convertObjectToXml(noticeOfNonConformity);
			xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
					functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction,
					messageType, xml, BanTinSystemSignature.systemSignature());
		} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBXNTT) {
			loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;

			mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBXNTINHTRANG;

			tenTaiLieu = DKConfigurationManager.getStrProp("thong_bao_xac_nhan_tinh_trang",
					"thong_bao_xac_nhan_tinh_trang")
					+ DKConfigurationManager.getStrProp("cho_ky_duyet", "cho_ky_duyet");
			ConfirmationStatusOfQuanlityConformity confirmationStatusOfQuanlityConformity = guiThongBaoXacNhanTinhTrang(
					hoSoThuTuc, userId, vehicleRecord, registeredInspection,
					certificateRecord, vehicleGroup, Constants.KO_GUI,  soChungChiCu, ngayChungChiCu,null,null);
			int messageType = 216;
			String messageFunction = "30";
			xml = MessageFactory.convertObjectToXml(confirmationStatusOfQuanlityConformity);
			xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
					functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction,
					messageType, xml, BanTinSystemSignature.systemSignature());
		} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBVP) {
			loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
			if (vehicleGroup.getMarkAsVehicle() == 1) {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBVIPHAM;
			} else {
				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBVIPHAMDC;
			}
			tenTaiLieu = DKConfigurationManager.getStrProp("thong_bao_vi_pham", "thong_bao_vi_pham")
					+ DKConfigurationManager.getStrProp("cho_ky_duyet", "cho_ky_duyet");
			NoticeOfViolation noticeOfViolation = guiThongBaoViPham(hoSoThuTuc, userId,
					vehicleRecord, registeredInspection, certificateRecord, vehicleGroup,
					Constants.KO_GUI, soChungChiCu, ngayChungChiCu,null,null);
			int messageType = 214;
			String messageFunction = "30";
			xml = MessageFactory.convertObjectToXml(noticeOfViolation);
			xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc,
					functionNghiepVu.getRamdomMessage(), Constants.VERSION_START, messageFunction,
					messageType, xml, BanTinSystemSignature.systemSignature());
		}
		// TthcHoSoThuTuc hoSoThuTuc =
		// TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
		long idNoiDungHoSo = taoNoiDungHoSo(userId, xml, hoSoThuTuc, loaiTaiLieu, mauTrucTuyen,
				tenTaiLieu,0);
		certificateRecord.setAttachedFile(idNoiDungHoSo);
		CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
	}

	private void fillData2CertificateCirculars(DraftCertificate certificateRecord, long idCertificateRecord,
			VehicleGroup vehicleGroup) throws SystemException {
		List<CertificateCircular> certificateCirculars;
		certificateCirculars = new ArrayList<CertificateCircular>();

		if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_GCN
				|| certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBKD
				|| certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBM) {
			if (vehicleGroup != null && vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.XE_CO_GIOI)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XCG", "31/2011/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_XCG_DATE", "2011-04-15 00:00:00")));
				certificateCirculars.add(certificateCircular);

				certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XCG_2", "55/2014/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_XCG_DATE_2", "2014-10-20 00:00:00")));
				certificateCirculars.add(certificateCircular);

			} else if (vehicleGroup != null && vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.DONG_CO)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_DONGCO", "44/2012/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_DONGCO_DATE", "2012-10-23 00:00:00")));
				certificateCirculars.add(certificateCircular);

			} else if (vehicleGroup != null
					&& vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.XE_BON_BANH_CHO_NGUOI)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_X4B", "86/2014/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_X4B_DATE", "2014-12-31 00:00:00")));
				certificateCirculars.add(certificateCircular);
				//_log.info("----------certificateCircularNo----------" + certificateCircular.getCircularNo());
			} else if (vehicleGroup != null
					&& vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.XE_DAP_DIEN)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XDD", "41/2013/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_XDD_DATE", "2013-11-05 00:00:00")));
				certificateCirculars.add(certificateCircular);

			} else if (vehicleGroup != null
					&& vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.XE_MAY_CHUYEN_DUNG)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
//				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XMCD", "23/2009/TT-BGTVT"));
//				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
//						"GCN_XMCD_DATE", "2009-10-15 00:00:00")));
//				certificateCirculars.add(certificateCircular);
//
//				certificateCircular = new CertificateCircularImpl();
//				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XMCD2", "41/2011/TT-BGTVT"));
//				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
//						"GCN_XMCD_DATE2", "2011-05-18 00:00:00")));
				
				certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XMCD3", "89/2015/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_XMCD_DATE3", "2015-12-31 00:00:00")));
				
				certificateCirculars.add(certificateCircular);
			} else if (vehicleGroup != null
					&& vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.MO_TO_XE_GAN_MAY)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XM", "44/2012/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_XM_DATE", "2012-10-23 00:00:00")));
				certificateCirculars.add(certificateCircular);

			}
		} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBVP) {

			CertificateCircular certificateCircular = new CertificateCircularImpl();
			certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("TBVP", "187/2013/ND-CP"));
			certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
					"TBVP_DATE", "2013-11-20 00:00:00")));
			certificateCirculars.add(certificateCircular);

		} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBXNTT) {

			if (vehicleGroup != null && vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.MO_TO_XE_GAN_MAY)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XM", "44/2012/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_XM_DATE", "2012-10-23 00:00:00")));
				certificateCirculars.add(certificateCircular);

			}

		}
		
		if (certificateCirculars != null && certificateCirculars.size() > 0) {
			int size = certificateCirculars.size();
			for (int i = 0; i < size; i++) {
				CertificateCircular certificateCircular = certificateCirculars.get(i);
				certificateCircular.setSequenceNo(i + 1);
				certificateCircular.setCertificateRecordId(idCertificateRecord);
				CertificateCircularLocalServiceUtil.addCertificateCircular(certificateCircular);

			}
		}
	}
	
	public void fillSuaChungChiByCertificateCirculars(CertificateRecord certificateRecord, long idCertificateRecord,
			VehicleGroup vehicleGroup) throws SystemException {
		List<CertificateCircular> certificateCirculars;
		certificateCirculars = new ArrayList<CertificateCircular>();

		if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_GCN
				|| certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBKD
				|| certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBM) {
			if (vehicleGroup != null && vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.XE_CO_GIOI)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XCG", "31/2011/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_XCG_DATE", "2011-04-15 00:00:00")));
				certificateCirculars.add(certificateCircular);

				certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XCG_2", "55/2014/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_XCG_DATE_2", "2014-10-20 00:00:00")));
				certificateCirculars.add(certificateCircular);

			} else if (vehicleGroup != null && vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.DONG_CO)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_DONGCO", "44/2012/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_DONGCO_DATE", "2012-10-23 00:00:00")));
				certificateCirculars.add(certificateCircular);

			} else if (vehicleGroup != null
					&& vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.XE_BON_BANH_CHO_NGUOI)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_X4B", "86/2014/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_X4B_DATE", "2014-12-31 00:00:00")));
				certificateCirculars.add(certificateCircular);
				//_log.info("----------certificateCircularNo----------" + certificateCircular.getCircularNo());
			} else if (vehicleGroup != null
					&& vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.XE_DAP_DIEN)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XDD", "41/2013/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_XDD_DATE", "2013-11-05 00:00:00")));
				certificateCirculars.add(certificateCircular);

			} else if (vehicleGroup != null
					&& vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.XE_MAY_CHUYEN_DUNG)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
//				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XMCD", "23/2009/TT-BGTVT"));
//				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
//						"GCN_XMCD_DATE", "2009-10-15 00:00:00")));
//				certificateCirculars.add(certificateCircular);

//				certificateCircular = new CertificateCircularImpl();
//				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XMCD2", "41/2011/TT-BGTVT"));
//				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
//						"GCN_XMCD_DATE2", "2011-05-18 00:00:00")));
				
				certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XMCD3", "89/2015/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_XMCD_DATE3", "2015-12-31 00:00:00")));
				
				certificateCirculars.add(certificateCircular);
			} else if (vehicleGroup != null
					&& vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.MO_TO_XE_GAN_MAY)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XM", "44/2012/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_XM_DATE", "2012-10-23 00:00:00")));
				certificateCirculars.add(certificateCircular);

			}
		} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBVP) {

			CertificateCircular certificateCircular = new CertificateCircularImpl();
			certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("TBVP", "187/2013/ND-CP"));
			certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
					"TBVP_DATE", "2013-11-20 00:00:00")));
			certificateCirculars.add(certificateCircular);

		} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBXNTT) {

			if (vehicleGroup != null && vehicleGroup.getVehicleClass().startsWith(TaoCauTrucSoDkAcBB.MO_TO_XE_GAN_MAY)) {
				CertificateCircular certificateCircular = new CertificateCircularImpl();
				certificateCircular.setCircularNo(DKConfigurationManager.getStrProp("GCN_XM", "44/2012/TT-BGTVT"));
				certificateCircular.setCircularDate(FormatData.parseStringToDate(DKConfigurationManager.getStrProp(
						"GCN_XM_DATE", "2012-10-23 00:00:00")));
				certificateCirculars.add(certificateCircular);

			}

		}
		
		if (certificateCirculars != null && certificateCirculars.size() > 0) {
			int size = certificateCirculars.size();
			for (int i = 0; i < size; i++) {
				CertificateCircular certificateCircular = certificateCirculars.get(i);
				certificateCircular.setSequenceNo(i + 1);
				certificateCircular.setCertificateRecordId(idCertificateRecord);
				CertificateCircularLocalServiceUtil.addCertificateCircular(certificateCircular);

			}
		}
	}
	
	public boolean kyDuyetChungChi(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId,
			String registeredNumber, List<VehicleRecord> vehicleRecords, String editorName,
			long registeredInspectionId, String signName, String signTitle, String signPlace,
			ActionRequest actionRequest, int hinhThucKy) {
		boolean result = true;
		try {
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
					.fetchRegisteredInspection(registeredInspectionId);
			long vehicleGroupId=0;
			CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.findByInspectorId(userId);
				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.getVehicleGroup(vehicleRecords.get(0)
							.getVehicleGroupId());
					vehicleGroupId=vehicleGroup.getId();
					int size = vehicleRecords.size();
					boolean flag = true;
					String soQuyDinhChungChiChatLuong =null;
					VehicleRecord vehicleRecord = null;
					CertificateRecord certificateRecord = null;
//					long idNoiDungHoSo=0;
					for (int i = 0; i < size; i++) {
						vehicleRecord = vehicleRecords.get(i);
						certificateRecord = CertificateRecordLocalServiceUtil.fetchCertificateRecord(vehicleRecord
								.getCertificateRecordId());
						
						if (flag && certificateRecord.getCertificateNumber().equalsIgnoreCase("DRAFT")) {
							soQuyDinhChungChiChatLuong = taoCauTruc.quyDinhSoChungChiChatLuong(
									vehicleGroup.getVehicleClass(), certificateRecord.getCertificateType());
							certificateRecord.setCertificateNumber(soQuyDinhChungChiChatLuong);

							certificateRecord
									.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
							certificateRecord.setOrganization(DKConfigurationManager.getStrProp("vr_organization",
									"ORGANIZATION"));
							certificateRecord.setSignName(corporationInspector.getInspectorName());
							certificateRecord.setSignPlace(corporationInspector.getPlace());
							certificateRecord.setSignTitle(corporationInspector.getTitle());
							certificateRecord.setSignDate(new Date());
							if(hinhThucKy == Constants.CHON_KY_THUONG){
								certificateRecord.setStampStatus(Constants.AN_CHI_CAP_MOI_CHUA_IN);
							}
							certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_0);
							certificateRecord.setEditorName(String.valueOf(corporationInspector.getFilechukyId()));

							CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
							
							String xml = "chua lam";

							taoNoiDungXml(userId, hoSoThuTuc, certificateRecord, vehicleGroup, vehicleRecord,
									registeredInspection, xml, actionRequest);
//						} else if(flag && (certificateRecord.getCertificateNumber().trim().length() > DKConfigurationManager.getIntProp("VR_SIZE_SO_TU_TANG_CHUNG_CHI_GCN", 12)) && (certificateRecord.getStampStatus() == Constants.AN_CHI_CAP_LAI)){
						} else if(flag  && (certificateRecord.getStampStatus() != Constants.AN_CHI_CAP_MOI_CHUA_IN||certificateRecord.getStampStatus() != Constants.AN_CHI_SUA_DOI_CHUA_IN)){
//							_log.info("===========ky duyet Constants.AN_CHI_CAP_LAI========");
							if(hinhThucKy == Constants.CHON_KY_THUONG){
								certificateRecord.setStampStatus(Constants.AN_CHI_SUA_DOI_CHUA_IN);
							}
							certificateRecord.setSignName(corporationInspector.getInspectorName());
							certificateRecord.setSignPlace(corporationInspector.getPlace());
							certificateRecord.setSignTitle(corporationInspector.getTitle());
							certificateRecord.setSignDate(new Date());
							CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
							
							String xml = "chua lam";
							taoNoiDungXml(userId, hoSoThuTuc, certificateRecord, vehicleGroup, vehicleRecord,
									registeredInspection, xml, actionRequest);
							
						}
						
						
						if (vehicleGroup.getVehicleClass().startsWith("DCX")
								|| vehicleGroup.getVehicleClass().startsWith("XDD")) {
							flag = false;
						}

				}
			}
				_log.info("vehicleGroupId  "+vehicleGroupId);
				if(vehicleGroupId>0){
					long count = VehicleRecordLocalServiceUtil.checkKyDuyetChungChi(vehicleGroupId);
					if(count>0){
						result=false;
					}
				}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean chuyenDichBBKTSauKyDuyetCC(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId) {
		boolean result = true;
		try {
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.phe.duyet.cc", "phe.duyet.cc");
			//_log.info("chuyenDichBBKTSauKyDuyetCC   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
					userId);

			MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
					.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			String ghiChu = phieuXuLyPhu.getGhiChu();
//			ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_PHE_DUYET", "Cho phe duyet"),
//					DKConfigurationManager.getStrProp("CHO_CAP_CHUNG_CHI", "Cho cap chung chi"));
			ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_PHE_DUYET", "Cho phe duyet"),
					"");
			ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_CAP_CHUNG_CHI","Cho cap chung chi"),
					"");
			ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_KY_CHUNG_CHI","Cho ky chung chi"),
					"");
			ghiChu="<b>"+DKConfigurationManager.getStrProp("CHO_KY_CHUNG_CHI", "Cho ky chung chi")+"</b> "+ghiChu;
			phieuXuLyPhu.setGhiChu(ghiChu);
			phieuXuLyPhu.setNgayTaoPhieu(new Date());
			MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);
			
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}
	
	
	public boolean chuyenDichBBKTSauKySoCC(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId) {
		boolean result = true;
		try {
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukienchuyendich.ky.cc", "ky.cc");
			//_log.info("chuyenDichBBKTSauKyDuyetCC   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
					userId);

			MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
					.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			String ghiChu = phieuXuLyPhu.getGhiChu();
//			ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_PHE_DUYET", "Cho phe duyet"),
//					DKConfigurationManager.getStrProp("CHO_CAP_CHUNG_CHI", "Cho cap chung chi"));
			ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_PHE_DUYET", "Cho phe duyet"),
					"");
			ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_CAP_CHUNG_CHI","Cho cap chung chi"),
					"");
			ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_KY_CHUNG_CHI","Cho ky chung chi"),
					"");
			ghiChu="<b>"+DKConfigurationManager.getStrProp("CHO_CAP_CHUNG_CHI", "Cho cap chung chi")+"</b> "+ghiChu;
			phieuXuLyPhu.setGhiChu(ghiChu);
			phieuXuLyPhu.setNgayTaoPhieu(new Date());
			MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);
			
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	
	/*
	 * VinhNguyen
	 * gui 205-30, sau khi DONG DAU
	 * ko gui 205-30 khi kyDuyetChungChi
	 * 
	 */
	
	public boolean guiMessage205va30SauKhiDongDau(long hoSoThuTucId,long userId,
			String registeredNumber, List<VehicleRecord> vehicleRecords,
			long registeredInspectionId, String messageId) {
		boolean result = true;
		try {
			//_log.info("guiMessage205va30SauKhiDongDau  " + hoSoThuTucId + "  phieuXuLyPhuId  " + "   dieuKienChuyenDich   "
//					 + "   registeredInspectionId " + registeredInspectionId);
			long kq = 1;
			TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
			if (kq > 0) {
				if (vehicleRecords != null && vehicleRecords.size() > 0) {
					VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.getVehicleGroup(vehicleRecords.get(0)
							.getVehicleGroupId());
					int size = vehicleRecords.size();

					CurrentStatusOfImportedVehicleList currentStatusOfImportedVehicleList = new CurrentStatusOfImportedVehicleList();

					currentStatusOfImportedVehicleList.setRegisteredNumber(registeredNumber);
					VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil
							.findByRegisteredInspectionId(registeredInspectionId);
					currentStatusOfImportedVehicleList.setTotalOfRegisteredVehicle(vehicleStatistics
							.getTotalRegisteredVehicle());
					currentStatusOfImportedVehicleList
							.setTotalOfRequested(vehicleStatistics.getTotalRequestedVehicle());
					currentStatusOfImportedVehicleList
							.setTotalOfInspected(vehicleStatistics.getTotalInspectedVehicle());
					currentStatusOfImportedVehicleList
							.setTotalOfCancelled(vehicleStatistics.getTotalCancelledVehicle());
					long count = vehicleStatistics.getTotalRequestedVehicle()
							- vehicleStatistics.getTotalInspectedVehicle();
					currentStatusOfImportedVehicleList.setTotalOfNotYetInspected(count);
					VehicleRecord vehicleRecord = null;
					//CertificateRecord certificateRecord = null;
					List<vn.dtt.gt.dk.nsw.model.CurrentStatusOfImportedVehicleList.ImportedVehicle> importedVehicleList = new ArrayList<CurrentStatusOfImportedVehicleList.ImportedVehicle>();
					for (int i = 0; i < size; i++) {
						vehicleRecord = vehicleRecords.get(i);
						vn.dtt.gt.dk.nsw.model.CurrentStatusOfImportedVehicleList.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.CurrentStatusOfImportedVehicleList.ImportedVehicle();

						importedVehicle.setSequenceNo(i + 1);
						importedVehicle.setCodeNumber(vehicleRecord.getCodeNumber());

						importedVehicle.setTradeMark(vehicleGroup.getTradeMark());
						importedVehicle.setModelType(vehicleGroup.getCommercialName());
						importedVehicle.setChassisNumber(vehicleRecord.getChassisNumber());
						importedVehicle.setEngineNumber(vehicleRecord.getEngineNumber());
						importedVehicle.setVehicleEngineStatus(vehicleRecord.getVehicleEngineStatus());
						importedVehicle.setMarkAsVehicle(Integer.valueOf(vehicleGroup.getMarkAsVehicle()));
						importedVehicle.setVehicleType(vehicleGroup.getVehicleType());
						importedVehicle.setEngineType(vehicleGroup.getEngineType());
						importedVehicle.setTechnicalSpecCode(vehicleGroup.getTechnicalSpecCode());
						importedVehicleList.add(importedVehicle);


					}
					currentStatusOfImportedVehicleList.getImportedVehicle().addAll(importedVehicleList);
					InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
							.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());
					currentStatusOfImportedVehicleList.setInspectionRecordNumber(inspectionRecord
							.getInspectionRecordNo());
					currentStatusOfImportedVehicleList.setInspectionRecordDate(FormatData
							.parseDateToTring(inspectionRecord.getInspectionRecordDate()));
					//
					// MessageType= 205
					// MessageFunction= 30

					callWebserviceNSWBusiness.message205va30(userId + "", hoSoThuTuc,
							messageId, Constants.VERSION_START,
							currentStatusOfImportedVehicleList);

					//_log.info(" KET THUC guiMessage205va30SauKhiDongDau  ");
				}
			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}
	
	private long taoNoiDungXml(long userId, TthcHoSoThuTuc hoSoThuTuc, CertificateRecord certificateRecord,
			VehicleGroup vehicleGroup, VehicleRecord vehicleRecord, RegisteredInspection registeredInspection,
			String xml, ActionRequest actionRequest) {
//		_log.info("taoNoiDungXml  ");
		long idNoiDungHoSo=0;
		try {
			long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_DA_KY;
			String mauTrucTuyen = "";
			String tenTaiLieu = "";
			String soChungChiCu = "";
			String ngayChungChiCu = "";
			if(certificateRecord.getCertificateNumber().trim().length() > DKConfigurationManager.getIntProp("VR_SIZE_SO_TU_TANG_CHUNG_CHI_GCN", 12)){
//				String [] arraySoChungChiCu = certificateRecord.getCertificateNumber().trim().split("-");
//				soChungChiCu = arraySoChungChiCu[0];
				soChungChiCu = certificateRecord.getOldCertificateNumber();
				CertificateRecord oldCertificateRecord = CertificateRecordLocalServiceUtil.findByCertificateNumber(soChungChiCu);
				if(oldCertificateRecord != null){
					ngayChungChiCu = FormatData.parseDateToTring(oldCertificateRecord.getSignDate());
				}
			}
			
			if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_GCN) {

				if (vehicleGroup.getMarkAsVehicle() == 1) {
					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAY_CHUNG_NHAN;
				} else {
					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_GIAYCHUNGNHANDC;
				}
				tenTaiLieu = DKConfigurationManager.getStrProp("giay_chung_nhan", "giay_chung_nhan") + "  "
						+ certificateRecord.getCertificateNumber();
				CertificateOfQuanlityConformity certificateOfQuanlityConformity = guiGiayChungNhan(hoSoThuTuc, userId,
						vehicleRecord, registeredInspection, certificateRecord, vehicleGroup, Constants.KO_GUI, soChungChiCu, ngayChungChiCu,null,null);
				
				int messageType = 211;
				String messageFunction = "30";
				
				xml = MessageFactory.convertObjectToXml(certificateOfQuanlityConformity);
				xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
						Constants.VERSION_START, messageFunction, messageType, xml,
						BanTinSystemSignature.systemSignature());
			} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBM) {

				if (vehicleGroup.getMarkAsVehicle() == 1) {
					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBMIEN;
				} else {
					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBMIENDC;
				}
				tenTaiLieu = DKConfigurationManager.getStrProp("thong_bao_mien", "thong_bao_mien") + "  "
						+ certificateRecord.getCertificateNumber();
				NoticeOfExemptionFromInspection noticeOfExemptionFromInspection = guiThongBaoMien(hoSoThuTuc, userId,
						vehicleRecord, registeredInspection, certificateRecord, vehicleGroup, Constants.KO_GUI,
						 soChungChiCu, ngayChungChiCu,null,null);
				int messageType = 212;
				String messageFunction = "30";
				xml = MessageFactory.convertObjectToXml(noticeOfExemptionFromInspection);
				xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
						Constants.VERSION_START, messageFunction, messageType, xml,
						BanTinSystemSignature.systemSignature());
			} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBKD) {

				if (vehicleGroup.getMarkAsVehicle() == 1) {
					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBKHONGDAT;
				} else {
					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBKHONGDATDC;
				}
				tenTaiLieu = DKConfigurationManager.getStrProp("thong_bao_khong_dat", "thong_bao_khong_dat") + "  "
						+ certificateRecord.getCertificateNumber();
				NoticeOfNonConformity noticeOfNonConformity = guiThongBaoKhongDat(hoSoThuTuc, userId, vehicleRecord,
						registeredInspection, certificateRecord, vehicleGroup, Constants.KO_GUI, soChungChiCu, ngayChungChiCu,null,null);
				int messageType = 213;
				String messageFunction = "30";
				xml = MessageFactory.convertObjectToXml(noticeOfNonConformity);
				xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
						Constants.VERSION_START, messageFunction, messageType, xml,
						BanTinSystemSignature.systemSignature());
			} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBXNTT) {

				mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBXNTINHTRANG;

				tenTaiLieu = DKConfigurationManager.getStrProp("thong_bao_xac_nhan_tinh_trang",
						"thong_bao_xac_nhan_tinh_trang") + "  " + certificateRecord.getCertificateNumber();
				ConfirmationStatusOfQuanlityConformity confirmationStatusOfQuanlityConformity = guiThongBaoXacNhanTinhTrang(
						hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord, vehicleGroup,
						Constants.KO_GUI, soChungChiCu, ngayChungChiCu,null,null);
				int messageType = 216;
				String messageFunction = "30";
				xml = MessageFactory.convertObjectToXml(confirmationStatusOfQuanlityConformity);
				xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
						Constants.VERSION_START, messageFunction, messageType, xml,
						BanTinSystemSignature.systemSignature());
			} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBVP) {

				if (vehicleGroup.getMarkAsVehicle() == 1) {
					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBVIPHAM;
				} else {
					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBVIPHAMDC;
				}
				tenTaiLieu = DKConfigurationManager.getStrProp("thong_bao_vi_pham", "thong_bao_vi_pham") + "  "
						+ certificateRecord.getCertificateNumber();
				NoticeOfViolation noticeOfViolation = guiThongBaoViPham(hoSoThuTuc, userId, vehicleRecord,
						registeredInspection, certificateRecord, vehicleGroup, Constants.KO_GUI,soChungChiCu, ngayChungChiCu,null,null);
				int messageType = 214;
				String messageFunction = "30";

				xml = MessageFactory.convertObjectToXml(noticeOfViolation);
				xml = callWebserviceNSWBusiness.builtXML(userId + "", hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
						Constants.VERSION_START, messageFunction, messageType, xml,
						BanTinSystemSignature.systemSignature());

			}

			if(certificateRecord.getAttachedFile()>0){
				_log.info("certificateRecord.getAttachedFile()  "+certificateRecord.getAttachedFile());
				TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo(certificateRecord.getAttachedFile());
			}
			
			 idNoiDungHoSo = taoNoiDungHoSo(userId, xml, hoSoThuTuc, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,vehicleRecord.getId());
			 _log.info("idNoiDungHoSo  "+idNoiDungHoSo);
			certificateRecord.setAttachedFile(idNoiDungHoSo);
			CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
			
//			if(idNoiDungHoSo >0 && vehicleRecord != null && actionRequest != null) {
//				String urlFile = ReportUtils.getUrlFileExport(actionRequest.getPortletSession(), PortalUtil.getPortalURL(actionRequest), vehicleRecord.getId());
//				if(urlFile != null && urlFile.trim().length() >0){
//					LanhDaoPhongBusiness.uploadFileByIdNoiDungHoSo(idNoiDungHoSo, urlFile, userId, actionRequest);
//				}
//			}
			
		} catch (Exception e) {
			_log.error(e);
		}
		return idNoiDungHoSo;
	}

	public boolean tinhPhi(long userId, SelectedVehicleListForPayment selectedVehicleListForPayment,
			List<VehicleRecord> vehicleRecords, vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote) {
		boolean result = true;
		try {
			_log.info("tinhPhi  ");
			if (selectedVehicleListForPayment != null && selectedVehicleListForPayment.getImportedVehicle() != null
					&& selectedVehicleListForPayment.getImportedVehicle().size() > 0) {
//				_log.info("selectedVehicleListForPayment.getImportedVehicle().size()   "+selectedVehicleListForPayment.getImportedVehicle().size() );
				tinhPhiMessage207(selectedVehicleListForPayment, debitNote);

			} else if (vehicleRecords != null && vehicleRecords.size() > 0) {
//				_log.info("vehicleRecords.size()   "+vehicleRecords.size() );
				tinhPhiVehicleRecord(vehicleRecords, debitNote);
			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean tinhPhiDC_XD_NOP_PHI(long userId, SelectedGroupForPayment selectedVehicleListForPayment,
			List<VehicleRecord> vehicleRecords, vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote) {
		boolean result = true;
		try {
			//_log.info("tinhPhi  ");
			if (selectedVehicleListForPayment != null && selectedVehicleListForPayment.getImportedVehicle() != null
					&& selectedVehicleListForPayment.getImportedVehicle().size() > 0) {

				tinhPhiMessage223DC_XD_NOP_PHI(selectedVehicleListForPayment, debitNote);

			} else if (vehicleRecords != null && vehicleRecords.size() > 0) {
				tinhPhiVehicleRecord(vehicleRecords, debitNote);
			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	private void tinhPhiVehicleRecord(List<VehicleRecord> vehicleRecords,
			vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote) throws Exception {
		int size = vehicleRecords.size();
		for (int i = 0; i < size; i++) {
			VehicleRecord vehicleRecord = vehicleRecords.get(i);
			vehicleRecord.setDebitNoteId(debitNote.getId());
			vehicleRecord.setSynchDate(new Date());
			
			VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
			VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
					.getVehicleGroupId());
			CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
					.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());

			createPaymentStatus(debitNote, vehicleRecord, vehicleGroup,
					certificateRecord);
		}
	}





	private PaymentStatus createPaymentStatus(
			vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote,
			VehicleRecord vehicleRecord, VehicleGroup vehicleGroup,
			CertificateRecord certificateRecord) throws Exception {
		PaymentStatus paymentStatus = PaymentStatusLocalServiceUtil.findByVehicleRecordId(vehicleRecord.getId());
		if (paymentStatus == null) {

			paymentStatus = new PaymentStatusImpl();
			long idPaymentStatus = CounterLocalServiceUtil.increment(PaymentStatus.class.getName());
			paymentStatus.setId(idPaymentStatus);
			paymentStatus.setVehicleRecordId(vehicleRecord.getId());
			paymentStatus.setUnitPrice(vehicleRecord.getUnitPrice());
			paymentStatus.setCurrency(vehicleRecord.getCurrency());
			paymentStatus.setBasicCurrency("VND");
			paymentStatus.setExchangeRate(functionNghiepVu.getExchangeRate(vehicleRecord.getCurrency(),
					paymentStatus.getBasicCurrency()));
			double inspection_Fees = functionNghiepVu.getInspectionFee(certificateRecord.getCertificateType(),
					vehicleGroup.getVehicleClass(), vehicleRecord.getUnitPrice() * paymentStatus.getExchangeRate());
			
			//double inspectionFee = ceil_RoundUp1000(inspection_Fees);
			// son_vh sua doi  lam tron inspectionfee -- Phi da gop thue lam tron nghin ---
			double inspectionFee = ceil_RoundUp(inspection_Fees);
			// son_vh sua doi 20161202 lam tron inspectionfee -- Phi da gop thue lam tron len 1 dong ---
			
			long roundInspectionFee = floor_RoundDown(inspectionFee * 10 / 11);
			paymentStatus.setInspectionFee(roundInspectionFee); // son_vh sua doi phi kiem tra truoc thue --lam tron xuong--
			// paymentStatus.setInspectionFee(floor_RoundDown(inspectionFee * 10 / 11)); // son_vh sua doi phi kiem tra --lam tron xuong--
			
			String issueType = Constants.CAP_MOI;
			if (certificateRecord.getStampStatus() == 8) {
				issueType = Constants.CAP_LAI;
			}
			paymentStatus.setCharges(functionNghiepVu.getCharges(vehicleGroup.getVehicleType(), issueType,certificateRecord.getId()));
			
			//double otherCosts = ceil_RoundUp1000(functionNghiepVu.getOtherCosts(vehicleRecord));			
			double otherCosts = ceil_RoundUp(functionNghiepVu.getOtherCosts(vehicleRecord));
			// son_vh sua doi 20161202 lam tron otherCosts -- Chi phi phat sinh da gop thue lam tron len 1 dong ---
			
			// paymentStatus.setOtherCosts(floor_RoundDown(otherCosts * 10 / 11)); // son_vh sua doi phi phat sinh --lam tron xuong--
			long roundOtherCost =  floor_RoundDown(otherCosts * 10 / 11);  // son_vh sua doi phi phat sinh --lam tron xuong--
			paymentStatus.setOtherCosts(roundOtherCost);
			
			double totalCostsAndFee = paymentStatus.getInspectionFee() + paymentStatus.getOtherCosts();

			paymentStatus.setTotalCostsAndFee(new Double(totalCostsAndFee).longValue());

			//paymentStatus.setTax(ceil_RoundUp((otherCosts + inspectionFee) / 11)); // son_vh sua doi cach tinh thue -- Phi truoc thue + phi phat sinh da lam tron nghin /11 va lam tron l�n --
			// son_vh sua doi cach tinh thue = Tong phi KT + Chi phi phat sinh - (Phi KT truoc thue va Chi phi PT truoc thue)
			long roundTax =  (new Double(inspectionFee).longValue()) + (new Double(otherCosts).longValue()) - roundInspectionFee - roundOtherCost;
			paymentStatus.setTax(roundTax);
						
			double totalRealDebit = paymentStatus.getTotalCostsAndFee() + paymentStatus.getTax()
					+ paymentStatus.getCharges();
			paymentStatus.setTotalRealDebit(new Double(totalRealDebit).longValue());
			// Bo lam tron den 1000
			long totalD = round(totalRealDebit);				
			double totalDebit = totalD;
			// paymentStatus.setTotalDebit(totalDebit);
			// son_vh sua doi cach tinh Tong tien thuc thu
			paymentStatus.setTotalDebit(new Double(totalRealDebit).longValue());
			
			paymentStatus.setDebitNoteNumber(debitNote.getDebitNoteNumber());
			PaymentStatusLocalServiceUtil.addPaymentStatus(paymentStatus);
		}
		return paymentStatus;
	}
	
	private void tinhPhiMessage207(SelectedVehicleListForPayment selectedVehicleListForPayment,
			vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote) throws Exception {
		int size = selectedVehicleListForPayment.getImportedVehicle().size();
//		_log.info("tinhPhiMessage207  "+size);
		for (int i = 0; i < size; i++) {
			vn.dtt.gt.dk.nsw.model.SelectedVehicleListForPayment.ImportedVehicle importedVehicle = selectedVehicleListForPayment
					.getImportedVehicle().get(i);
			RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
					.findByRegisteredNumber(importedVehicle.getRegisteredNumber());

			VehicleRecord vehicleRecord = VehicleRecordLocalServiceUtil.findByCodeNumberAndDossierId(
					importedVehicle.getCodeNumber(), registeredInspection.getDossierId());
			vehicleRecord.setSynchDate(new Date());
			vehicleRecord.setDebitNoteId(debitNote.getId());
			VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
			VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
					.getVehicleGroupId());
			CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
					.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
			
//			PaymentStatus paymentStatus = PaymentStatusLocalServiceUtil.findByVehicleRecordId(vehicleRecord.getId());
			PaymentStatus paymentStatus =createOrUpdatePaymentStatus(debitNote, vehicleRecord, vehicleGroup,
					certificateRecord);
		}
	}





	private PaymentStatus   createOrUpdatePaymentStatus(
			vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote,VehicleRecord vehicleRecord, VehicleGroup vehicleGroup,CertificateRecord certificateRecord)
			throws Exception {
		PaymentStatus paymentStatus = PaymentStatusLocalServiceUtil
				.findByVehicleRecordId(vehicleRecord.getId());
		if (paymentStatus == null) {
//				DebitNoteDetailsLocalServiceUtil
			paymentStatus = new PaymentStatusImpl();
			long idPaymentStatus = CounterLocalServiceUtil.increment(PaymentStatus.class.getName());
			paymentStatus.setId(idPaymentStatus);
			paymentStatus.setVehicleRecordId(vehicleRecord.getId());
			paymentStatus.setUnitPrice(vehicleRecord.getUnitPrice());
			paymentStatus.setCurrency(vehicleRecord.getCurrency());
			paymentStatus.setBasicCurrency("VND");
			paymentStatus.setExchangeRate(functionNghiepVu.getExchangeRate(vehicleRecord.getCurrency(),
					paymentStatus.getBasicCurrency()));
			double inspection_Fees = functionNghiepVu.getInspectionFee(certificateRecord.getCertificateType(),
					vehicleGroup.getVehicleClass(), vehicleRecord.getUnitPrice() * paymentStatus.getExchangeRate());
			
			//double inspectionFee = ceil_RoundUp1000(inspection_Fees);
			// son_vh sua doi  lam tron inspectionfee -- Phi da gop thue lam tron 1000 dong ---
			double inspectionFee = ceil_RoundUp(inspection_Fees);
			// son_vh sua doi 20161202 lam tron inspectionfee -- Phi da gop thue lam tron len 1 dong ---
			
			long roundInspectionFee = floor_RoundDown(inspectionFee * 10 / 11);
			paymentStatus.setInspectionFee(roundInspectionFee); // son_vh sua doi phi kiem tra --lam tron xuong--
			
			String issueType = Constants.CAP_MOI;
			if (certificateRecord.getStampStatus() == 8) {
				issueType = Constants.CAP_LAI;
			}
			paymentStatus.setCharges(functionNghiepVu.getCharges(vehicleGroup.getVehicleType(), issueType,certificateRecord.getId()));
			
			//double otherCosts = ceil_RoundUp1000(functionNghiepVu.getOtherCosts(vehicleRecord));
			double otherCosts = ceil_RoundUp(functionNghiepVu.getOtherCosts(vehicleRecord));
			// son_vh sua doi 20161202 lam tron otherCosts -- Chi phi phat sinh da gop thue lam tron len 1 dong ---
			
			long roundOtherCost =  floor_RoundDown(otherCosts * 10 / 11);  // son_vh sua doi phi phat sinh --lam tron xuong--
			paymentStatus.setOtherCosts(roundOtherCost);

			double totalCostsAndFee = paymentStatus.getInspectionFee() + paymentStatus.getOtherCosts();

			paymentStatus.setTotalCostsAndFee(new Double(totalCostsAndFee).longValue());
			// paymentStatus.setTax(ceil_RoundUp((otherCosts + inspectionFee) / 11)); // son_vh sua doi cach tinh thue -- Phi truoc thue + phi phat sinh da lam tron nghin /11 va lam tron l�n --
			// son_vh sua doi cach tinh thue = Tong phi KT + Chi phi phat sinh - (Phi KT truoc thue va Chi phi PT truoc thue)
			long roundTax =  (new Double(inspectionFee).longValue()) + (new Double(otherCosts).longValue()) - roundInspectionFee - roundOtherCost;
			paymentStatus.setTax(roundTax);
			
			double totalRealDebit = paymentStatus.getTotalCostsAndFee() + paymentStatus.getTax()
					+ paymentStatus.getCharges();
			paymentStatus.setTotalRealDebit(new Double(totalRealDebit).longValue());
			// Bo lam tron den 1000
			long totalD = round(totalRealDebit);
			double totalDebit = totalD;
			//paymentStatus.setTotalDebit(totalDebit);
			// son_vh sua doi cach tinh Tong tien thuc thu
			paymentStatus.setTotalDebit(new Double(totalRealDebit).longValue());
			paymentStatus.setDebitNoteNumber(debitNote.getDebitNoteNumber());
			PaymentStatusLocalServiceUtil.addPaymentStatus(paymentStatus);
		} else if (paymentStatus != null && paymentStatus.getCurrentStatus() == 0) {
			paymentStatus.setDebitNoteNumber(debitNote.getDebitNoteNumber());
			PaymentStatusLocalServiceUtil.updatePaymentStatus(paymentStatus);
		}
		return paymentStatus;
	}

	private void tinhPhiMessage223DC_XD_NOP_PHI(SelectedGroupForPayment selectedGroupForPayment,
			vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote) throws SystemException {
		int size = selectedGroupForPayment.getImportedVehicle().size();
		for (int i = 0; i < size; i++) {
			vn.dtt.gt.dk.nsw.model.SelectedGroupForPayment.ImportedVehicle importedVehicle = selectedGroupForPayment
					.getImportedVehicle().get(i);

			List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil
					.findByInspectionRecordNumber(importedVehicle.getInspectionRecordNumber());
			int sizeVehicleRecord = vehicleRecords.size();
			for (int k = 0; k < sizeVehicleRecord; k++) {
				VehicleRecord vehicleRecord = vehicleRecords.get(k);
				vehicleRecord.setDebitNoteId(debitNote.getId());
				vehicleRecord.setSynchDate(new Date());
				VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
				VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
						.getVehicleGroupId());
				CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
						.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
				PaymentStatus paymentStatus = PaymentStatusLocalServiceUtil
						.findByVehicleRecordId(vehicleRecord.getId());
				if (paymentStatus == null) {

					paymentStatus = new PaymentStatusImpl();
					long idPaymentStatus = CounterLocalServiceUtil.increment(PaymentStatus.class.getName());
					paymentStatus.setId(idPaymentStatus);
					paymentStatus.setVehicleRecordId(vehicleRecord.getId());
					paymentStatus.setUnitPrice(vehicleRecord.getUnitPrice());
					paymentStatus.setCurrency(vehicleRecord.getCurrency());
					paymentStatus.setBasicCurrency("VND");
					paymentStatus.setExchangeRate(functionNghiepVu.getExchangeRate(vehicleRecord.getCurrency(),
							paymentStatus.getBasicCurrency()));
					double inspection_Fees = functionNghiepVu.getInspectionFee(certificateRecord.getCertificateType(),
							vehicleGroup.getVehicleClass(),
							vehicleRecord.getUnitPrice() * paymentStatus.getExchangeRate());
					
					//double inspectionFee = ceil_RoundUp1000(inspection_Fees);
					// son_vh sua doi  lam tron inspectionfee -- Phi da gop thue lam tron nghin ---
					double inspectionFee = ceil_RoundUp(inspection_Fees);
					// son_vh sua doi 20161202 lam tron inspectionfee -- Phi da gop thue lam tron len 1 dong ---
					
					//paymentStatus.setInspectionFee(floor_RoundDown(inspectionFee * 10 / 11)); // son_vh sua doi phi kiem tra --lam tron xuong--					
					long roundInspectionFee = floor_RoundDown(inspectionFee * 10 / 11);
					paymentStatus.setInspectionFee(roundInspectionFee); // son_vh sua doi phi kiem tra --lam tron xuong--
					
					String issueType = Constants.CAP_MOI;
					if (certificateRecord.getStampStatus() == 8) {
						issueType = Constants.CAP_LAI;
					}
					if (k == 0) {
						paymentStatus.setCharges(functionNghiepVu.getCharges(vehicleGroup.getVehicleType(), issueType,certificateRecord.getId()));
					} else {
						paymentStatus.setCharges(0);
					}
					
					//double otherCosts = ceil_RoundUp1000(functionNghiepVu.getOtherCosts(vehicleRecord));
					double otherCosts = ceil_RoundUp(functionNghiepVu.getOtherCosts(vehicleRecord));
					// son_vh sua doi 20161202 lam tron otherCosts -- Chi phi phat sinh da gop thue lam tron len 1 dong ---
					
					long roundOtherCost =  floor_RoundDown(otherCosts * 10 / 11);  // son_vh sua doi phi phat sinh --lam tron xuong--
					paymentStatus.setOtherCosts(roundOtherCost);
					
					double totalCostsAndFee = paymentStatus.getInspectionFee() + paymentStatus.getOtherCosts();
					paymentStatus.setTotalCostsAndFee(new Double(totalCostsAndFee).longValue());
					//paymentStatus.setTax(ceil_RoundUp((otherCosts + inspectionFee) / 11)); // son_vh sua doi cach tinh thue -- Phi truoc thue + phi phat sinh da lam tron nghin /11 va lam tron len --
					// son_vh sua doi cach tinh thue = Tong phi KT + Chi phi phat sinh - (Phi KT truoc thue va Chi phi PT truoc thue)
					long roundTax =  (new Double(inspectionFee).longValue()) + (new Double(otherCosts).longValue()) - roundInspectionFee - roundOtherCost;
					paymentStatus.setTax(roundTax);
					
					double totalRealDebit = paymentStatus.getTotalCostsAndFee() + paymentStatus.getTax()
							+ paymentStatus.getCharges();
					paymentStatus.setTotalRealDebit(new Double(totalRealDebit).longValue());
					// lam tron den 1000
					long totalD = round(totalRealDebit);
					double totalDebit = totalD;										
					//paymentStatus.setTotalDebit(totalDebit);
					paymentStatus.setTotalDebit(totalRealDebit);
					paymentStatus.setDebitNoteNumber(debitNote.getDebitNoteNumber());
					PaymentStatusLocalServiceUtil.addPaymentStatus(paymentStatus);
				} else if (paymentStatus != null && paymentStatus.getCurrentStatus() == 0) {
					paymentStatus.setDebitNoteNumber(debitNote.getDebitNoteNumber());
					PaymentStatusLocalServiceUtil.updatePaymentStatus(paymentStatus);

				}
			}
		}
	}
	
	public String thongBaoNopPhi(SelectedVehicleListForPayment selectedVehicleListForPayment, long userId,
			int paymentType) {
		String result = "";
		try {

			_log.info("thongBaoNopPhi  --- ");
			vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote = new DebitNoteImpl();
			long idDebitNote = CounterLocalServiceUtil.increment(vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote.class
					.getName());
			debitNote.setId(idDebitNote);
			debitNote.setDebitNoteNumber(functionNghiepVu.getRamdomMessage());
			debitNote.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
			debitNote.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
			debitNote.setReportBy(Constants.SYSTEM);
			debitNote.setReportDate(new Date());
			debitNote.setTransactionId(selectedVehicleListForPayment.getTransactionID());

			debitNote.setPaymentType(paymentType);
			debitNote.setMarkAsDeleted(0);

			DebitNoteLocalServiceUtil.addDebitNote(debitNote);
			//Sua lai ham tinh phi 06/03/2016
			//tinhPhi(userId, selectedVehicleListForPayment, null, debitNote);
			// Insert VR_DEBITNOTE
			// Insert VR_DEBITNOTEDETAILS
			//
			// MessageType= 209

			DebitNote debitNoteMessage = new DebitNote();
			debitNoteMessage.setDebitNoteNumber(debitNote.getDebitNoteNumber());
			debitNoteMessage.setDivision(debitNote.getDivision());
			debitNoteMessage.setOrganization(debitNote.getOrganization());
			debitNoteMessage.setReportBy(debitNote.getReportBy());
			debitNoteMessage.setReportDate(FormatData.parseDateToTring(debitNote.getReportDate()));
			debitNoteMessage.setTransactionID(selectedVehicleListForPayment.getTransactionID());
			
			TthcHoSoThuTuc hoSoThuTuc = null;
			long sizePaymentDetails = 0;
			double sumCharges = 0;
			double totalPayment = 0;
			double totalOtherCost = 0;
			String registeredNumberRef = "";
			int size = selectedVehicleListForPayment.getImportedVehicle().size();
			//_log.info("size   " + size);
			VehicleGroup vehicleGroup = null;
			List<vn.dtt.gt.dk.nsw.model.DebitNote.PaymentDetails> details = new ArrayList<vn.dtt.gt.dk.nsw.model.DebitNote.PaymentDetails>();
			for (int i = 0; i < size; i++) {
				vn.dtt.gt.dk.nsw.model.SelectedVehicleListForPayment.ImportedVehicle importedVehicle = selectedVehicleListForPayment
						.getImportedVehicle().get(i);

				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
						.findByRegisteredNumber(importedVehicle.getRegisteredNumber());

				if (hoSoThuTuc == null) {
					hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil
							.fetchTthcHoSoThuTuc(registeredInspection.getDossierId());
				}
				VehicleRecord vehicleRecord = VehicleRecordLocalServiceUtil.findByCodeNumberAndDossierId(
						importedVehicle.getCodeNumber(), registeredInspection.getDossierId());
				//sua tinh phi 06/03/2016
				vehicleRecord.setDebitNoteId(debitNote.getId());
				vehicleRecord.setSynchDate(new Date());
				
				VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
				CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
						.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
				
				vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord.getVehicleGroupId());
//				CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
//						.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
				// totalVehicle = totalVehicle + ve
				//vehicleRecord.setd
//				createOrUpdatePaymentStatus(debitNote, vehicleRecord, vehicleGroup, certificateRecord, paymentStatus);
				
//				PaymentStatus paymentStatus = PaymentStatusLocalServiceUtil
//						.findByVehicleRecordId(vehicleRecord.getId());
				//sua tinh phi 06/03/2016
				PaymentStatus paymentStatus =	createOrUpdatePaymentStatus(debitNote, vehicleRecord, vehicleGroup, certificateRecord);
				// MessageFunction= 30
				if (paymentStatus != null && paymentStatus.getCurrentStatus() != Constants.TRANG_THAI_DA_THANH_TOAN) {

					DebitNoteDetails debitNoteDetails = new DebitNoteDetailsImpl();
					debitNoteDetails.setDebitNoteId(debitNote.getId());
					debitNoteDetails.setVehicleRecordId(vehicleRecord.getId());
					debitNoteDetails.setUnitPrice(paymentStatus.getUnitPrice());
					debitNoteDetails.setCurrency(paymentStatus.getCurrency());
					debitNoteDetails.setBasicCurrency(paymentStatus.getBasicCurrency());
					debitNoteDetails.setExchangeRate(paymentStatus.getExchangeRate());
					debitNoteDetails.setInspectionFee(paymentStatus.getInspectionFee());

					debitNoteDetails.setOtherCosts(paymentStatus.getOtherCosts());
					debitNoteDetails.setTotalCostsAndFee(paymentStatus.getTotalCostsAndFee());
					debitNoteDetails.setTax(paymentStatus.getTax());
					debitNoteDetails.setCharges(paymentStatus.getCharges());
					debitNoteDetails.setTotalRealDebit(paymentStatus.getTotalRealDebit());
					debitNoteDetails.setTotalDebit(paymentStatus.getTotalDebit());

					totalPayment = totalPayment + debitNoteDetails.getTotalDebit();

					DebitNoteDetailsLocalServiceUtil.addDebitNoteDetails(debitNoteDetails);

					vn.dtt.gt.dk.nsw.model.DebitNote.PaymentDetails paymentDetails = new vn.dtt.gt.dk.nsw.model.DebitNote.PaymentDetails();
					sizePaymentDetails = sizePaymentDetails + 1;
					paymentDetails.setSequenceNo(i + 1);
					paymentDetails.setCodeNumber(vehicleRecord.getCodeNumber());
					paymentDetails.setRegisteredNumber(registeredInspection.getRegisteredNumber());
					paymentDetails.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
					paymentDetails.setTradeMark(vehicleGroup.getTradeMark());
					paymentDetails.setModelType(vehicleGroup.getCommercialName());
					paymentDetails.setVehicleType(vehicleGroup.getVehicleType());
					paymentDetails.setEngineType(vehicleGroup.getEngineType());
					paymentDetails.setProductionYear(vehicleRecord.getProductionYear());
					paymentDetails.setChassisNumber(vehicleRecord.getChassisNumber());
					paymentDetails.setEngineNumber(vehicleRecord.getEngineNumber());

					paymentDetails.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));

					paymentDetails
							.setDeclarationPrice(((new Double(debitNoteDetails.getUnitPrice())).longValue()) + "");

					paymentDetails.setCurrencyCode(debitNoteDetails.getCurrency());
					long unitPrice = (new Double(debitNoteDetails.getUnitPrice() * debitNoteDetails.getExchangeRate()))
							.longValue();
					paymentDetails.setUnitPrice((new Double(unitPrice)).longValue() + "");
					paymentDetails.setTotalPrice(unitPrice);

					
					Long charges = (new Double(debitNoteDetails.getCharges())).longValue();
					paymentDetails.setCharges(charges);
					sumCharges = sumCharges + debitNoteDetails.getCharges();
					//long otherCosts = (new Double(ceil_RoundUp1000(debitNoteDetails.getOtherCosts() * Constants.FREE))).longValue();
					//paymentDetails.setOtherCosts(otherCosts + "");					
					//paymentDetails.setOtherCostsNoTax(floor_RoundDown(debitNoteDetails.getOtherCosts())+"");
					
					double otherCosts = ceil_RoundUp(functionNghiepVu.getOtherCosts(vehicleRecord));
					// son_vh sua doi 20161202 lam tron otherCosts -- Chi phi phat sinh da gop thue lam tron len 1 dong ---
					
					long roundOtherCost =  floor_RoundDown(otherCosts * 10 / 11);  // son_vh sua doi phi phat sinh truoc thue --lam tron xuong--
					paymentDetails.setOtherCosts(otherCosts+ ""); // Chi phi phat sinh da gop thue
					paymentDetails.setOtherCostsNoTax(roundOtherCost+"");
					
					long totalAmount = (new Double( paymentStatus.getTotalDebit())).longValue();
					paymentDetails.setTotalAmount( totalAmount + "");
					totalOtherCost = new Double(totalOtherCost) + new Double(paymentDetails.getOtherCosts());
					details.add(paymentDetails);
					
					double Fee = totalAmount - (new Double(charges)).longValue();
					long totalFee = floor_RoundDown(Fee * 10 / 11);
					paymentDetails.setTotalFee(totalFee +"");
					long totalTaxAmount = ceil_RoundUp(Fee - totalFee);
					paymentDetails.setTaxAmount(totalTaxAmount+"");
					
					//long lTotalDebit = totalAmount - (new Double(charges)).longValue()  - otherCosts;
					long lTotalDebit = totalAmount - (new Double(charges)).longValue()  -  (new Double(otherCosts)).longValue();
					paymentDetails.setTotalDebit(lTotalDebit + "");
					double TotalDebitNoTax = (10 * lTotalDebit /11 );
					paymentDetails.setTotalDebitNoTax(floor_RoundDown(TotalDebitNoTax)+"");				
					
					
					registeredNumberRef = registeredInspection.getRegisteredNumber();

				}

			}
			if (details != null && details.size() > 0) {
				debitNoteMessage.getPaymentDetails().addAll(details);
			}
			debitNote.setTotalPayment((new Double(totalPayment)).longValue());
			DebitNoteLocalServiceUtil.updateDebitNote(debitNote);

			vn.dtt.gt.dk.nsw.model.DebitNote.PaymentSummary paymentSummary = new vn.dtt.gt.dk.nsw.model.DebitNote.PaymentSummary();

			paymentSummary.setTotalOfPayment( (new Double(debitNote.getTotalPayment())).longValue());
			paymentSummary.setTotalOfVehicle(sizePaymentDetails);

			debitNoteMessage.setPaymentSummary(paymentSummary);

			vn.dtt.gt.dk.nsw.model.DebitNote.ChargesSummary chargesSummary = new vn.dtt.gt.dk.nsw.model.DebitNote.ChargesSummary();
			chargesSummary.setChargeType("///");
			chargesSummary.setRemarks("Le Phi ");
			chargesSummary.setUnit(sizePaymentDetails);
			chargesSummary.setTotal((new Double(sumCharges)).longValue());

			debitNoteMessage.setChargesSummary(chargesSummary);

			vn.dtt.gt.dk.nsw.model.DebitNote.OtherCostsSummary otherCostsSummary = new vn.dtt.gt.dk.nsw.model.DebitNote.OtherCostsSummary();
			otherCostsSummary.setSequenceNo(1);
			otherCostsSummary.setAmount((new Double(totalOtherCost)).longValue());
			otherCostsSummary.setRegisteredNumberRef(registeredNumberRef);
			otherCostsSummary.setRemarks(" Chi phi phat sinh");

			debitNoteMessage.getOtherCostsSummary().add(otherCostsSummary);
			String messageId = functionNghiepVu.getRamdomMessage();
			long id  = 0;
			if(hoSoThuTuc!=null){
				id = hoSoThuTuc.getId();
			}
			messgaeFunctions.insertKeHoachChuyenDich(null,id , "dieuKienChuyenDich", null, messageId,debitNoteMessage.getDebitNoteNumber(),"30", "209");
			result = callWebserviceNSWBusiness.builtMessage209va30(userId + "", hoSoThuTuc,
					messageId, Constants.VERSION_START, debitNoteMessage);

		} catch (Exception e) {
			_log.error(e);
			result = "";
		}
		return result;
	}

	public String thongBaoNopPhiChoDCXD(SelectedGroupForPayment selectedGroupForPayment, long userId, int paymentType) {
		String result = "";
		try {

			//_log.info("thongBaoNopPhiChoDCXD   ");
			vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote = new DebitNoteImpl();
			long idDebitNote = CounterLocalServiceUtil.increment(vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote.class
					.getName());
			debitNote.setId(idDebitNote);
			debitNote.setDebitNoteNumber(functionNghiepVu.getRamdomMessage());
			debitNote.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
			debitNote.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
			debitNote.setReportBy(Constants.SYSTEM);
			debitNote.setReportDate(new Date());
			debitNote.setTransactionId(selectedGroupForPayment.getTransactionID());
			
			debitNote.setPaymentType(paymentType);
			debitNote.setMarkAsDeleted(0);

			DebitNoteLocalServiceUtil.addDebitNote(debitNote);
			tinhPhiDC_XD_NOP_PHI(userId, selectedGroupForPayment, null, debitNote);
			// Insert VR_DEBITNOTE
			// Insert VR_DEBITNOTEDETAILS
			//
			// MessageType= 223
			String debitNoteNumber = debitNote.getDebitNoteNumber();
			DebitNoteByCertificate debitNoteByCertificate = new DebitNoteByCertificate();
			debitNoteByCertificate.setDebitNoteNumber(debitNote.getDebitNoteNumber());
			debitNoteByCertificate.setDivision(debitNote.getDivision());
			debitNoteByCertificate.setOrganization(debitNote.getOrganization());
			debitNoteByCertificate.setReportBy(debitNote.getReportBy());
			debitNoteByCertificate.setReportDate(FormatData.parseDateToTring(debitNote.getReportDate()));
			debitNoteByCertificate.setTransactionID(selectedGroupForPayment.getTransactionID());
			TthcHoSoThuTuc hoSoThuTuc = null;
			double totalPayment = 0;
			int size = selectedGroupForPayment.getImportedVehicle().size();
			//_log.info("size   " + size);
			List<vn.dtt.gt.dk.nsw.model.DebitNoteByCertificate.PaymentDetails> details = new ArrayList<DebitNoteByCertificate.PaymentDetails>();
			for (int i = 0; i < size; i++) {
				vn.dtt.gt.dk.nsw.model.SelectedGroupForPayment.ImportedVehicle importedVehicle = selectedGroupForPayment
						.getImportedVehicle().get(i);

				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
						.findByRegisteredNumber(importedVehicle.getRegisteredNumber());

				if (hoSoThuTuc == null) {
					hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil
							.fetchTthcHoSoThuTuc(registeredInspection.getDossierId());
				}

				List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil
						.findByInspectionRecordNumber(importedVehicle.getInspectionRecordNumber());
				VehicleGroup vehicleGroup = null;
				int sizeVehicleRecord = vehicleRecords.size();
				double totalPrice = 0;
				double unitPrice = 0;
				double inspectionFee = 0;
				double charges = 0;
				double otherCosts = 0;
				VehicleRecord vehicleRecord = null;
				InspectionRecord inspectionRecord = null;
				long totalDebits = 0;

				for (int k = 0; k < sizeVehicleRecord; k++) {
					vehicleRecord = vehicleRecords.get(k);
					vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord.getVehicleGroupId());
					
					if (inspectionRecord == null) {
						inspectionRecord = InspectionRecordLocalServiceUtil.fetchInspectionRecord(vehicleRecord
								.getInspectionRecordId());
					}
					PaymentStatus paymentStatus = PaymentStatusLocalServiceUtil.findByVehicleRecordId(vehicleRecord
							.getId());

					// MessageFunction= 30
					if (paymentStatus != null && paymentStatus.getCurrentStatus() != Constants.TRANG_THAI_DA_THANH_TOAN) {
						totalPrice = totalPrice + paymentStatus.getUnitPrice() * paymentStatus.getExchangeRate();
						DebitNoteDetails debitNoteDetails = new DebitNoteDetailsImpl();
						debitNoteDetails.setDebitNoteId(debitNote.getId());
						debitNoteDetails.setVehicleRecordId(vehicleRecord.getId());
						debitNoteDetails.setUnitPrice(paymentStatus.getUnitPrice());
						debitNoteDetails.setCurrency(paymentStatus.getCurrency());
						debitNoteDetails.setBasicCurrency(paymentStatus.getBasicCurrency());
						debitNoteDetails.setExchangeRate(paymentStatus.getExchangeRate());
						debitNoteDetails.setInspectionFee(paymentStatus.getInspectionFee());
						debitNoteDetails.setOtherCosts(paymentStatus.getOtherCosts());
						debitNoteDetails.setTotalCostsAndFee(paymentStatus.getTotalCostsAndFee());
						debitNoteDetails.setTax(paymentStatus.getTax());
						debitNoteDetails.setCharges(paymentStatus.getCharges());
						debitNoteDetails.setTotalRealDebit(paymentStatus.getTotalRealDebit());
						debitNoteDetails.setTotalDebit(paymentStatus.getTotalDebit());
						debitNoteDetails.setInspectionRecordId(vehicleRecord.getInspectionRecordId());

						totalDebits = totalDebits + new Double(paymentStatus.getTotalDebit()).longValue();
						
						totalPayment = totalPayment + debitNoteDetails.getTotalDebit();
						unitPrice = paymentStatus.getUnitPrice() * paymentStatus.getExchangeRate();
						//inspectionFee = inspectionFee + paymentStatus.getInspectionFee();
						charges = charges + debitNoteDetails.getCharges();
						otherCosts = otherCosts + debitNoteDetails.getOtherCosts();
						DebitNoteDetailsLocalServiceUtil.addDebitNoteDetails(debitNoteDetails);
					}
				}
				vn.dtt.gt.dk.nsw.model.DebitNoteByCertificate.PaymentDetails paymentDetails = new vn.dtt.gt.dk.nsw.model.DebitNoteByCertificate.PaymentDetails();

				paymentDetails.setSequenceNo(i + 1);
				paymentDetails.setRegisteredNumber(registeredInspection.getRegisteredNumber());
				paymentDetails.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				paymentDetails.setTradeMark(vehicleGroup.getTradeMark());
				paymentDetails.setModelType(vehicleGroup.getCommercialName());
				paymentDetails.setTotalOfInspected(sizeVehicleRecord);

				paymentDetails.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());

				paymentDetails.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				paymentDetails.setDeclarationPrice(((new Double(totalPrice)).longValue()) + "");
				paymentDetails.setUnitPrice((new Double(unitPrice)).longValue() + "");
				paymentDetails.setTotalPrice((new Double(totalPrice)).longValue());
				paymentDetails.setCurrencyCode(vehicleRecord.getCurrency());
				
				// son_vh sua doi cach tinh Thong bao nop phi
				
				paymentDetails.setTotalAmount(totalDebits);
				paymentDetails.setCharges((new Double(charges)).longValue());
				
				long payMentOtherCosts = (new Double(ceil_RoundUp(otherCosts * Constants.FREE))).longValue();
				paymentDetails.setOtherCosts(payMentOtherCosts + "");
				paymentDetails.setOtherCostsNoTax(floor_RoundDown(otherCosts)+"");
				long lTotalDebit = totalDebits - (new Double(charges)).longValue()  - payMentOtherCosts; 
				paymentDetails.setTotalDebit(lTotalDebit + "");
				double TotalDebitNoTax = (10 * lTotalDebit /11 );
				paymentDetails.setTotalDebitNoTax(floor_RoundDown(TotalDebitNoTax)+"");				
				inspectionFee = totalDebits - (new Double(charges)).longValue();
				long totalFee = floor_RoundDown(inspectionFee * 10 / 11);
				paymentDetails.setTotalFee(totalFee +"");
				long totalTaxAmount = ceil_RoundUp(inspectionFee - totalFee);
				paymentDetails.setTaxAmount(totalTaxAmount+"");
				
				
				
				details.add(paymentDetails);
			}

			if (details != null && details.size() > 0) {
				debitNoteByCertificate.getPaymentDetails().addAll(details);
			}
			debitNote.setTotalPayment((new Double(totalPayment)).longValue());
			DebitNoteLocalServiceUtil.updateDebitNote(debitNote);

			vn.dtt.gt.dk.nsw.model.DebitNoteByCertificate.PaymentSummary paymentSummary = new vn.dtt.gt.dk.nsw.model.DebitNoteByCertificate.PaymentSummary();
			paymentSummary.setTotalOfPayment( (new Double(debitNote.getTotalPayment()).longValue()));

			debitNoteByCertificate.setPaymentSummary(paymentSummary);
			String messageId = functionNghiepVu.getRamdomMessage();
			long id=0;
			if(hoSoThuTuc!=null){
				id = hoSoThuTuc.getId();
			}
			messgaeFunctions.insertKeHoachChuyenDich(null,id , "dieuKienChuyenDich", "reason", messageId,debitNoteNumber,"30", "223");
			result = callWebserviceNSWBusiness.builtMessage223va30(userId + "", hoSoThuTuc,
					messageId, Constants.VERSION_START, debitNoteByCertificate);
		} catch (Exception e) {
			_log.error(e);
			result = "";
		}
		return result;
	}

	public boolean xacNhanHoanThanhNopLePhi(long hoSoThuTucId, long phieuXuLyPhuId, List<VehicleRecord> vehicleRecords,
			long userId, long paymentType) {
		boolean result = true;
		try {
			
			String messageId= functionNghiepVu.getRamdomMessage();
//			messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId,hoSoThuTucId, "dieuKienChuyenDich", null,messageId );
			//_log.info("xacNhanHoanThanhNopLePhi   " + "   hoSoThuTucId  " + hoSoThuTucId + " phieuXuLyPhuId  "
//					+ phieuXuLyPhuId);
			long kq = 1;

			if (kq > 0) {
				// Insert VR_DEBITNOTE
				// Insert VR_DEBITNOTEDETAILS
				// Update VR_PAYMENTSTATUS
				// MessageType= 210
				// MessageFunction= 30
				vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote = new DebitNoteImpl();
				long idDebitNote = CounterLocalServiceUtil.increment(vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote.class
						.getName());
				debitNote.setId(idDebitNote);
				debitNote.setDebitNoteNumber(messageId);
				debitNote.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				debitNote.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));
				debitNote.setReportBy(Constants.SYSTEM);
				debitNote.setReportDate(new Date());

				debitNote.setTransactionId(functionNghiepVu.getTransactionId());
				debitNote.setPaymentType(paymentType);
				debitNote.setMarkAsDeleted(0);

				DebitNoteLocalServiceUtil.addDebitNote(debitNote);
				//The Anh sua 06/03/2016
//				tinhPhi(userId, null, vehicleRecords, debitNote);

				PaymentConfirmation paymentConfirmation = new PaymentConfirmation();
				paymentConfirmation.setDebitNoteNumber(debitNote.getDebitNoteNumber());
				paymentConfirmation.setReportDate(FormatData.parseDateToTring(debitNote.getReportDate()));
				paymentConfirmation.setTransactionID(debitNote.getTransactionId());
//				paymentConfirmation.set
				TthcHoSoThuTuc hoSoThuTuc = null;
				long sizePaymentDetails = 0;
				double totalPayment = 0;
				double totalOtherCost = 0;
				String registeredNumberRef = "";
				int size = vehicleRecords.size();
				VehicleGroup vehicleGroup1 = null;
				List<vn.dtt.gt.dk.nsw.model.PaymentConfirmation.ImportedVehicle> importedVehicleList = new ArrayList<PaymentConfirmation.ImportedVehicle>();
				for (int i = 0; i < size; i++) {

					VehicleRecord vehicleRecord = vehicleRecords.get(i);
					VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
							.getVehicleGroupId());
					if (vehicleGroup1 == null) {
						vehicleGroup1 = vehicleGroup;
					}
					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
							.fetchRegisteredInspection(vehicleGroup.getRegisteredInspectionId());

					if (hoSoThuTuc == null) {
						hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(registeredInspection
								.getDossierId());
					}
					InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
							.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());
					vehicleRecord.setSynchDate(new Date());
					vehicleRecord.setDebitNoteId(debitNote.getId());
					VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
//					VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
//							.getVehicleGroupId());
					CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
							.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());

					PaymentStatus paymentStatus =  createPaymentStatus(debitNote, vehicleRecord, vehicleGroup,
							certificateRecord);

//					PaymentStatus paymentStatus = PaymentStatusLocalServiceUtil.findByVehicleRecordId(vehicleRecord
//							.getId());

					// MessageFunction= 30
					if (paymentStatus != null && paymentStatus.getCurrentStatus() != Constants.TRANG_THAI_DA_THANH_TOAN) {

						DebitNoteDetails debitNoteDetails = new DebitNoteDetailsImpl();
						debitNoteDetails.setDebitNoteId(debitNote.getId());
						debitNoteDetails.setVehicleRecordId(vehicleRecord.getId());
						debitNoteDetails.setUnitPrice(paymentStatus.getUnitPrice());
						debitNoteDetails.setCurrency(paymentStatus.getCurrency());
						debitNoteDetails.setBasicCurrency(paymentStatus.getBasicCurrency());
						debitNoteDetails.setExchangeRate(paymentStatus.getExchangeRate());
						debitNoteDetails.setInspectionFee(paymentStatus.getInspectionFee());
						debitNoteDetails.setOtherCosts(paymentStatus.getOtherCosts());
						debitNoteDetails.setTotalCostsAndFee(paymentStatus.getTotalCostsAndFee());
						debitNoteDetails.setTax(paymentStatus.getTax());
						debitNoteDetails.setCharges(paymentStatus.getCharges());
						debitNoteDetails.setTotalRealDebit(paymentStatus.getTotalRealDebit());
						debitNoteDetails.setTotalDebit(paymentStatus.getTotalDebit());

						totalPayment = totalPayment + debitNoteDetails.getTotalDebit();

						DebitNoteDetailsLocalServiceUtil.addDebitNoteDetails(debitNoteDetails);

						vn.dtt.gt.dk.nsw.model.PaymentConfirmation.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.PaymentConfirmation.ImportedVehicle();
						sizePaymentDetails = sizePaymentDetails + 1;
						importedVehicle.setSequenceNo(i + 1);
						importedVehicle.setCodeNumber(vehicleRecord.getCodeNumber());
						importedVehicle.setRegisteredNumber(registeredInspection.getRegisteredNumber());
						importedVehicle.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
						importedVehicle.setTradeMark(vehicleGroup.getTradeMark());
						importedVehicle.setModelType(vehicleGroup.getCommercialName());
						importedVehicle.setVehicleType(vehicleGroup.getVehicleType());
						importedVehicle.setEngineType(vehicleGroup.getEngineType());
						importedVehicle.setChassisNumber(vehicleRecord.getChassisNumber());
						importedVehicle.setEngineNumber(vehicleRecord.getEngineNumber());
						importedVehicle.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
						importedVehicle.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
								.getInspectionRecordDate()));
						importedVehicle
								.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));
						importedVehicle.setMarkasPayment(Constants.DA_THANH_TOAN);
						// paymentConfirmation.getImportedVehicle().add(importedVehicle);
						importedVehicleList.add(importedVehicle);
						registeredNumberRef = registeredInspection.getRegisteredNumber();

					}

				}
				if (importedVehicleList.size() > 0) {
					paymentConfirmation.getImportedVehicle().addAll(importedVehicleList);
				}
				debitNote.setTotalPayment((new Double(totalPayment)).longValue());
				DebitNoteLocalServiceUtil.updateDebitNote(debitNote);

				vn.dtt.gt.dk.nsw.model.PaymentConfirmation.PaymentSummary paymentSummary = new vn.dtt.gt.dk.nsw.model.PaymentConfirmation.PaymentSummary();

				paymentSummary.setTotalOfPayment((new Double(debitNote.getTotalPayment())).longValue());
				paymentSummary.setTotalOfVehicle(sizePaymentDetails);

				paymentConfirmation.setPaymentSummary(paymentSummary);

				vn.dtt.gt.dk.nsw.model.DebitNote.OtherCostsSummary otherCostsSummary = new vn.dtt.gt.dk.nsw.model.DebitNote.OtherCostsSummary();
				otherCostsSummary.setSequenceNo(1);
				otherCostsSummary.setAmount((new Double(totalOtherCost)).longValue());
				otherCostsSummary.setRegisteredNumberRef(registeredNumberRef);
				otherCostsSummary.setRemarks(" Chi phi phat sinh");

				callWebserviceNSWBusiness.message210va30(userId + "", hoSoThuTuc, messageId,
						Constants.VERSION_START, paymentConfirmation,phieuXuLyPhuId);

				DebitNoteLocalServiceUtil.updateDebitNote(debitNote);
				messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId,hoSoThuTucId, "dieuKienChuyenDich", null,messageId,debitNote.getDebitNoteNumber() ,"30","210");
			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public long xacNhanHoanThanhNopLePhiTheoPhieuThu(TthcHoSoThuTuc hoSoThuTuc, long phieuXuLyPhuId,
			List<VehicleRecord> vehicleRecords, long userId, vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote) {
		// long result = phieuXuLyPhuId;
		String messageId= functionNghiepVu.getRamdomMessage();
		try {

			long kq = 1;
			

			if (kq > 0) {
				// Insert VR_DEBITNOTE
				// Insert VR_DEBITNOTEDETAILS
				// Update VR_PAYMENTSTATUS
				// MessageType= 210
				// MessageFunction= 30

				PaymentConfirmation paymentConfirmation = new PaymentConfirmation();
				paymentConfirmation.setDebitNoteNumber(debitNote.getDebitNoteNumber());
				paymentConfirmation.setReportDate(FormatData.parseDateToTring(debitNote.getReportDate()));				
				paymentConfirmation.setTransactionID(debitNote.getTransactionId());
				// paymentConfirmation.set
				List<vn.dtt.gt.dk.nsw.model.PaymentConfirmation.ImportedVehicle> confirmations = new ArrayList<vn.dtt.gt.dk.nsw.model.PaymentConfirmation.ImportedVehicle>();
				long sizePaymentDetails = 0;
				
				int size = vehicleRecords.size();
				VehicleGroup vehicleGroup1 = null;
				for (int i = 0; i < size; i++) {

					VehicleRecord vehicleRecord = vehicleRecords.get(i);
					VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
							.getVehicleGroupId());
					if (vehicleGroup1 == null) {
						vehicleGroup1 = vehicleGroup;
					}
					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
							.fetchRegisteredInspection(vehicleGroup.getRegisteredInspectionId());

					if (hoSoThuTuc == null) {
						hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(registeredInspection
								.getDossierId());
					}
					InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
							.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());
					// totalVehicle = totalVehicle + ve
					phieuXuLyPhuId = inspectionRecord.getPhieuXuLyPhuId();
					PaymentStatus paymentStatus = PaymentStatusLocalServiceUtil.findByVehicleRecordId(vehicleRecord
							.getId());

					// MessageFunction= 30

					if (paymentStatus != null && paymentStatus.getCurrentStatus() != Constants.TRANG_THAI_DA_THANH_TOAN) {

						vn.dtt.gt.dk.nsw.model.PaymentConfirmation.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.PaymentConfirmation.ImportedVehicle();
						sizePaymentDetails = sizePaymentDetails + 1;
						importedVehicle.setSequenceNo(i + 1);
						importedVehicle.setCodeNumber(vehicleRecord.getCodeNumber());
						importedVehicle.setRegisteredNumber(registeredInspection.getRegisteredNumber());
						importedVehicle.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
						importedVehicle.setTradeMark(vehicleGroup.getTradeMark());
						importedVehicle.setModelType(vehicleGroup.getCommercialName());
						importedVehicle.setVehicleType(vehicleGroup.getVehicleType());
						importedVehicle.setEngineType(vehicleGroup.getEngineType());
						importedVehicle.setChassisNumber(vehicleRecord.getChassisNumber());
						importedVehicle.setEngineNumber(vehicleRecord.getEngineNumber());
						importedVehicle.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
						importedVehicle.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
								.getInspectionRecordDate()));
						importedVehicle
								.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));
						importedVehicle.setMarkasPayment(Constants.DA_THANH_TOAN);
						
						confirmations.add(importedVehicle);

					}

				}

				if (confirmations != null && confirmations.size() > 0) {
					paymentConfirmation.getImportedVehicle().addAll(confirmations);
				}
				vn.dtt.gt.dk.nsw.model.PaymentConfirmation.PaymentSummary paymentSummary = new vn.dtt.gt.dk.nsw.model.PaymentConfirmation.PaymentSummary();
				paymentSummary.setPaymentDate(FormatData.parseDateToTring(new Date()));
				paymentSummary.setTotalOfPayment((new Double(debitNote.getTotalPayment())).longValue());
				paymentSummary.setTotalOfVehicle(sizePaymentDetails);

				paymentConfirmation.setPaymentSummary(paymentSummary);

				

				String xml = callWebserviceNSWBusiness.message210va30(userId + "", hoSoThuTuc,
						messageId, Constants.VERSION_START, paymentConfirmation,phieuXuLyPhuId);


				long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_DA_KY;
				String mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBPHILEPHI_MAU1;

				String tenTaiLieu = DKConfigurationManager.getStrProp("xac_nhan_nop_phi_le_phi_dang_kiem",
						"xac_nhan_nop_phi_le_phi_dang_kiem") + " " + FormatData.parseDateToTringType3(new Date());
				if (vehicleGroup1.getMarkAsVehicle() == 1 && vehicleGroup1.getVehicleType().startsWith("XDD")) {
					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBPHILEPHI_MAU2;
				} else if (vehicleGroup1.getMarkAsVehicle() == 0) {
					mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBPHILEPHI_MAU2;
				}

				long idNoiDungHoSo = taoNoiDungHoSo(userId, xml, null, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,0);
				debitNote.setMarkAsDeleted(Constants.MarkUpDelete_da_xoa);
				debitNote.setAttachedFile(idNoiDungHoSo);
				DebitNoteLocalServiceUtil.updateDebitNote(debitNote);
				

			}
		} catch (Exception e) {
			_log.error(e);

		}
		String dieuKienChuyenDich = DKConfigurationManager.getStrProp("xac.nhan.thanh.toan",
				"xac.nhan.thanh.toan");
		messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId,hoSoThuTuc.getId(), dieuKienChuyenDich, debitNote.getTransactionId(),messageId,debitNote.getDebitNoteNumber() ,"30","210");
		return phieuXuLyPhuId;
	}

	public VehicleInspectionRecord noiDungBienBanKiemTra(long hoSoThuTucId, long phieuXuLyPhuId, long userId,
			VehicleGroup vehicleGroup, List<VehicleRecord> vehicleRecords, InspectionRecord inspectionRecord,
			List<InspectionRecordSpec> inspectionRecordSpecs, RegisteredInspection registeredInspection) {
		VehicleInspectionRecord vehicleInspectionRecord = null;
		try {
			CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
					.findByCertificateNumber(vehicleGroup.getReferenceCertificateNo());
			
			VehicleGroupInitial vehicleGroupInitial = BienBanKTNghiepVuUtils.getVehicleGroupInitialByVehicleRecord(vehicleRecords.get(0));
			
			List<ProductionCountry> productionCountries = null;
			
			if(vehicleGroupInitial != null) {
				productionCountries = ProductionCountryLocalServiceUtil
					.findByVehicleGroupId(vehicleGroupInitial.getId());
			} else {
				productionCountries = ProductionCountryLocalServiceUtil
					.findByVehicleGroupId(vehicleGroup.getId());
			}
			
			vehicleInspectionRecord = new VehicleInspectionRecord();

			vehicleInspectionRecord.setTechnicalSpecCode(vehicleGroup.getTechnicalSpecCode());
			vehicleInspectionRecord.setCertificateRefNo(vehicleGroup.getReferenceCertificateNo());
			vehicleInspectionRecord.setRegisteredNumber(registeredInspection.getRegisteredNumber());
			vehicleInspectionRecord.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
			vehicleInspectionRecord.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
					.getInspectionRecordDate()));
			vehicleInspectionRecord.setInspectionSite(inspectionRecord.getInspectionSite());
			vehicleInspectionRecord.setINSPECTIONDATEFROM(FormatData.parseDateToTring(inspectionRecord
					.getInspectionDateFrom()));
			vehicleInspectionRecord.setINSPECTIONDATETO(FormatData.parseDateToTring(inspectionRecord
					.getInspectionDateTo()));
			vehicleInspectionRecord.setINSPECTIONMODE((new Long(inspectionRecord.getInspectionMode()).intValue()));
			vehicleInspectionRecord.setDESCRIPTION(inspectionRecord.getDescription());
			vehicleInspectionRecord.setREMARKS(inspectionRecord.getRemarks());
			vehicleInspectionRecord.setCONFIRMEDRESULT((new Long(inspectionRecord.getConfirmedResult()).intValue()));
			vehicleInspectionRecord.setMARKUPEMISSIONTEST((new Long(inspectionRecord.getMarkupEmissionTest())
					.intValue()));
			vehicleInspectionRecord.setMARKUPSAFETEST((new Long(inspectionRecord.getMarkupSafeTest()).intValue()));
			vehicleInspectionRecord.setMARKUPCONTROL((new Long(inspectionRecord.getMarkupControl()).intValue()));
			vehicleInspectionRecord.setSIGNDATE(FormatData.parseDateToTring(inspectionRecord.getSignDate()));
			vehicleInspectionRecord.setSIGNTITLE(inspectionRecord.getSignTitle());
			vehicleInspectionRecord.setSIGNNAME(inspectionRecord.getSignName());
			vehicleInspectionRecord.setSIGNPLACE(inspectionRecord.getSignPlace());

			vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo generalInfo = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo();

			vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo.Importer importer = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo.Importer();
			importer.setImporterCode(registeredInspection.getImporterCode());
			importer.setImporterName(registeredInspection.getImporterName());
			importer.setImporterAddress(registeredInspection.getImporterAddress());
			importer.setRepresentative(registeredInspection.getRepresentative());
			importer.setPhone(registeredInspection.getPhone());
			importer.setFax(registeredInspection.getFax());
			importer.setEmail(registeredInspection.getEmail());
			generalInfo.setImporter(importer);

			generalInfo.setTradeMark(vehicleGroup.getTradeMark());
			generalInfo.setModelType(vehicleGroup.getCommercialName());
			generalInfo.setModelCode(vehicleGroup.getModelCode());
			generalInfo.setVehicleType(vehicleGroup.getVehicleType());
			generalInfo.setEngineType(vehicleGroup.getEngineType());
			generalInfo.setManufacturer(vehicleGroup.getProductionPlant());
			generalInfo.setAddressProductionPlant(vehicleGroup.getAddressOfProductionPlant());
			if (productionCountries != null && productionCountries.size() > 0) {
				int sizeProductionCountrie = productionCountries.size();
				//_log.info("int sizeProductionCountries = productionCountries.size(); "
//						+ productionCountries.size());
				List<String> prList = new ArrayList<String>();
				vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo.ProductionCountry();
				for (int i = 0; i < sizeProductionCountrie; i++) {
					prList.add(productionCountries.get(i).getCountryCode());
					// productionCountry.getCountryCode().add(productionCountries.get(i).getCountryCode());
				}
				if (prList.size() > 0) {
					productionCountry.getCountryCode().addAll(prList);
				}
				generalInfo.setProductionCountry(productionCountry);

			}
			generalInfo.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
			generalInfo.setEmissionStandard(vehicleGroup.getEmissionStandard());
			vehicleInspectionRecord.setGeneralInfo(generalInfo);

			if (inspectionRecordSpecs != null && inspectionRecordSpecs.size() > 0) {
				List<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem> specItems = new ArrayList<VehicleInspectionRecord.SpecificationList.SpecItem>();
				int sizeCertificateRecordSpec = inspectionRecordSpecs.size();
				for (int j = 0; j < sizeCertificateRecordSpec; j++) {
					InspectionRecordSpec inspectionRecordSpec = inspectionRecordSpecs.get(j);
					if (inspectionRecordSpec.getSpecificationValue() != null
							&& inspectionRecordSpec.getSpecificationValue().length() > 0) {
						vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem();
						specItem.setSpecificationCode(inspectionRecordSpec.getSpecificationCode());
						String specificationName = inspectionRecordSpec.getSpecificationName();
						if (specificationName == null || specificationName.length() == 0) {
							specificationName = "specificationName";
						}

						specItem.setSpecificationName(specificationName);
						specItem.setDeclarationValue1(inspectionRecordSpec.getSpecificationValue());
						specItem.setDeclarationValue2("");
						specItem.setDeclarationValue3("");
						specItem.setDeclarationValue4("");
						specItem.setDeclarationValue5("");
						specItem.setDeclarationValue6("");
						specItems.add(specItem);
						// vehicleInspectionRecord.getSpecificationList().getSpecItem().add(specItem);
					}
				}
				if (specItems.size() > 0) {
					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList();
					specificationList.getSpecItem().addAll(specItems);
					vehicleInspectionRecord.setSpecificationList(specificationList);
				}
			}

			if (vehicleRecords != null && vehicleRecords.size() > 0) {
				int sizeVehicleRecord = vehicleRecords.size();
				List<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.ImportedVehicle> importedVehicles = new ArrayList<VehicleInspectionRecord.ImportedVehicle>();
				for (int j = 0; j < sizeVehicleRecord; j++) {
					VehicleRecord vehicleRecord = vehicleRecords.get(j);
					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.ImportedVehicle();
					importedVehicle.setSequenceNo(j + 1);
					importedVehicle.setCodeNumber(vehicleRecord.getCodeNumber());
					importedVehicle.setChassisNumber(vehicleRecord.getChassisNumber());
					importedVehicle.setEngineNumber(vehicleRecord.getEngineNumber());
					importedVehicle.setProductionYear(vehicleRecord.getProductionYear());
					importedVehicle.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));
					importedVehicle.setVehicleUnitPrice(String.valueOf(vehicleRecord.getUnitPrice()));
					importedVehicle.setCurrency(vehicleRecord.getCurrency());
					importedVehicle.setVehicleColor(vehicleRecord.getVehicleColor());
					importedVehicles.add(importedVehicle);
				}
				if (importedVehicles.size() > 0) {
					importedVehicles.addAll(importedVehicles);
				}
			}

			if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)) {
				CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
						.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
				if (customsDeclaration != null) {
					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.CustomDeclaration();
					declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
							.getImportCustomDeclareDate()));
					declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
					vehicleInspectionRecord.getCustomDeclaration().add(declaration);
				}
			}
			
			if (certificateRecord != null) {

				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
				if (copReport != null) {
					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.COPReport();
					cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
					cpReport.setCOPReportNumber(copReport.getReportNumber());
					vehicleInspectionRecord.getCOPReport().add(cpReport);
				}
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				if (emissionTestReport != null) {
					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.EmissionTestReport();
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					vehicleInspectionRecord.getEmissionTestReport().add(emissionTestReport2);
				}

				SafetyTestReport testReport = SafetyTestReportLocalServiceUtil.fetchSafetyTestReport(certificateRecord
						.getSafetyTestReportId());
				if (testReport != null) {
					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SafetyTestReport safetyTestReport = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SafetyTestReport();
					safetyTestReport.setSafetyTestReportDate(FormatData.parseDateToTring(testReport.getSignDate()));
					safetyTestReport.setSafetyTestReportNumber(testReport.getReportNumber());
					vehicleInspectionRecord.getSafetyTestReport().add(safetyTestReport);
				}
			}

			List<InspectionCommonStatus> liCommonStatus = InspectionCommonStatusLocalServiceUtil
					.findByInspectionRecordId(inspectionRecord.getId());
			if (liCommonStatus != null && liCommonStatus.size() > 0) {
				int sizeInspectionCommonStatus = liCommonStatus.size();
				List<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionCommonStatus> inspectionCommonStatusList = new ArrayList<VehicleInspectionRecord.InspectionCommonStatus>();
				for (int i = 0; i < sizeInspectionCommonStatus; i++) {
					InspectionCommonStatus commonStatus = liCommonStatus.get(i);

					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionCommonStatus inspectionCommonStatus = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionCommonStatus();
					inspectionCommonStatus.setCOMMONSTATUS((new Long(commonStatus.getCommonStatus())).intValue());
					inspectionCommonStatus.setGROUPNAME(commonStatus.getGroupName());
					inspectionCommonStatus.setITEMNAME(commonStatus.getItemName());
					inspectionCommonStatus.setSEQUENCENO(commonStatus.getSequenceNo());
					inspectionCommonStatus.setTYPE((new Long(commonStatus.getType())).intValue());
					inspectionCommonStatus.setVEHICLECLASS(commonStatus.getVehicleClass());
					// vehicleInspectionRecord.getInspectionCommonStatus().add(inspectionCommonStatus);
					inspectionCommonStatusList.add(inspectionCommonStatus);
				}
				if (inspectionCommonStatusList != null && inspectionCommonStatusList.size() > 0) {
					vehicleInspectionRecord.getInspectionCommonStatus().addAll(inspectionCommonStatusList);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}
		return vehicleInspectionRecord;
	}
	public static VehicleInspectionRecord noiDungBienBanKiemTraDKV(long hoSoThuTucId, long phieuXuLyPhuId, long userId,
			VehicleGroup vehicleGroup, List<VehicleRecord> vehicleRecords, InspectionRecord inspectionRecord,
			List<InspectionRecordSpec> inspectionRecordSpecs, RegisteredInspection registeredInspection, List<ObjXmlDoiChieuThongSoKtXe> lstObjXmlDoiChieuThongSoKtXes) {
		VehicleInspectionRecord vehicleInspectionRecord = null;
		try {
			List<InspectionCommonStatus> lstCommonStatusTTC =  InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleGroup.getVehicleClass(), 1, inspectionRecord.getId());
			ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
			List<CorporationAttendee> lstCorporationAttendees = CorporationAttendeeLocalServiceUtil.findByConfirmedInspectionId(confirmedInspection.getId());
			VehicleGroupInitial vehicleGroupInitial = BienBanKTNghiepVuUtils.getVehicleGroupInitialByVehicleRecord(vehicleRecords.get(0));
			
			CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil.findByCertificateNumber(vehicleGroup.getReferenceCertificateNo());

			List<ProductionCountry> productionCountries = null;
			
			if(vehicleGroupInitial != null) {
				productionCountries = ProductionCountryLocalServiceUtil
					.findByVehicleGroupId(vehicleGroupInitial.getId());
			} else {
				productionCountries = ProductionCountryLocalServiceUtil
					.findByVehicleGroupId(vehicleGroup.getId());
			}
			
			vehicleInspectionRecord = new VehicleInspectionRecord();
			
			
			List<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionAttendee> lstInspectionAttendees = new ArrayList<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionAttendee>();
			if(lstCorporationAttendees != null && lstCorporationAttendees.size() > 0){
				for(CorporationAttendee corporationAttendee : lstCorporationAttendees){
					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionAttendee inspectionAttendee = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionAttendee();
					inspectionAttendee.setAttendeeID(corporationAttendee.getInspectorid());
					inspectionAttendee.setAttendeeName(corporationAttendee.getInspectorName());
					inspectionAttendee.setAttendeeRole(corporationAttendee.getInspectorRole());
					lstInspectionAttendees.add(inspectionAttendee);
				}
			}
			if(lstInspectionAttendees != null && lstInspectionAttendees.size() >0){
				vehicleInspectionRecord.getInspectionAttendee().addAll(lstInspectionAttendees);
			}
			
			vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo generalInfo = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo();

			vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo.Importer importer = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo.Importer();
			vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.GeneralInfo.ProductionCountry();
			String safetyTestReportNumberEdit = "";
			String safetyTestReportResult = "";
			String emissionTestReportNumberEdit = "";
			String emissionTestReportResult = "";
			String cOPReportNumberEdit = "";
			String cOPReportNumberResult = "";
			String CustomDeclareResult  = "1";
			String importCustomDeclareDateEdit = "";
			String importCustomDeclareNoEdit = "";
			
			vehicleInspectionRecord.setTechnicalSpecCode(vehicleGroup.getTechnicalSpecCode());
			vehicleInspectionRecord.setCertificateRefNo(vehicleGroup.getReferenceCertificateNo());
			if(lstCommonStatusTTC != null && lstCommonStatusTTC.size() >0){
				for(InspectionCommonStatus commonStatus : lstCommonStatusTTC){
					if(commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_06")){
						vehicleInspectionRecord.setCertificateRefNoEdit(commonStatus.getItemName());
						vehicleInspectionRecord.setCertificateRefNoResult(ReportUtils.getVehicleCommonStatusName(commonStatus.getCommonStatus()));
						
					} else if(commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_07")){
						safetyTestReportNumberEdit = vehicleGroup.getSafetytestreportNo();
						safetyTestReportResult = ReportUtils.getVehicleCommonStatusName(commonStatus.getCommonStatus());
						
					} else if(commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_08")){
						emissionTestReportNumberEdit = vehicleGroup.getEmissiontestreportNo();
						emissionTestReportResult = ReportUtils.getVehicleCommonStatusName(commonStatus.getCommonStatus());
						
					} else if(commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_09")){
						cOPReportNumberEdit = vehicleGroup.getCopreportNo();
						cOPReportNumberResult = ReportUtils.getVehicleCommonStatusName(commonStatus.getCommonStatus());
						
					} else if (commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_10")){
						generalInfo.setVehicleTypeEdit(vehicleGroup.getVehicleType());
						generalInfo.setVehicleTypeResult(ReportUtils.getVehicleCommonStatusName(commonStatus.getCommonStatus()));
						
					} else if (commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_11")){
						generalInfo.setTradeMarkEdit(vehicleGroup.getTradeMark());
						generalInfo.setTradeMarkResult(ReportUtils.getVehicleCommonStatusName(commonStatus.getCommonStatus()));
						
					} else if (commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_12")){
						generalInfo.setModelTypeEdit(vehicleGroup.getCommercialName());
						generalInfo.setModelTypeResult(ReportUtils.getVehicleCommonStatusName(commonStatus.getCommonStatus()));
						
					} else if (commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_13")){
						generalInfo.setModelCodeEdit(vehicleGroup.getModelCode());
						generalInfo.setModelCodeResult(ReportUtils.getVehicleCommonStatusName(commonStatus.getCommonStatus()));
						
					} else if (commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_14")){
						generalInfo.setCountryCodeResult(ReportUtils.getVehicleCommonStatusName(commonStatus.getCommonStatus()));
//						productionCountry.setCountryCodeEdit(commonStatus.getItemName());
						
					} else if (commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_15")){
						generalInfo.setManufacturerEdit(vehicleGroup.getProductionPlant());
						generalInfo.setManufacturerResult(ReportUtils.getVehicleCommonStatusName(commonStatus.getCommonStatus()));
						
					} else if (commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_16")){
						generalInfo.setAddressProductionPlantEdit(vehicleGroup.getAddressOfProductionPlant());
						generalInfo.setAddressProductionPlantResult(ReportUtils.getVehicleCommonStatusName(commonStatus.getCommonStatus()));
						
					} else if (commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_17")){
						generalInfo.setEmissionStandardEdit(commonStatus.getItemName());
						generalInfo.setEmissionStandardResult(ReportUtils.getVehicleCommonStatusName(commonStatus.getCommonStatus()));
						
					} else if (commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_19")){
						CustomDeclareResult = ReportUtils.getVehicleCommonStatusName(commonStatus.getCommonStatus());
						
					} else if (commonStatus.getType() == 1 && commonStatus.getCommonCode().equalsIgnoreCase("TTC_1_20")){
//						importCustomDeclareDateEdit = commonStatus.getItemName();
						
					}
				}
			}
			
			vehicleInspectionRecord.setRegisteredNumber(registeredInspection.getRegisteredNumber());
			vehicleInspectionRecord.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
			vehicleInspectionRecord.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
					.getInspectionRecordDate()));
			vehicleInspectionRecord.setInspectionSite(inspectionRecord.getInspectionSite());
			vehicleInspectionRecord.setINSPECTIONDATEFROM(FormatData.parseDateToTring(inspectionRecord
					.getInspectionDateFrom()));
			vehicleInspectionRecord.setINSPECTIONDATETO(FormatData.parseDateToTring(inspectionRecord
					.getInspectionDateTo()));
			vehicleInspectionRecord.setINSPECTIONMODE((new Long(inspectionRecord.getInspectionMode()).intValue()));
			
			DmDataItem doiKiemTra =  DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.CORPORATION, inspectionRecord.getCorporationId());
			if(doiKiemTra != null){
				vehicleInspectionRecord.setCORPORATIONNAME(doiKiemTra.getName());
			}
			
			DmDataItem dmDataItem = DmDataItemLocalServiceUtil.findDataItemByDataGroupIdAndItemCode(new Integer(ReportConstant.INSPECTION_MODE).longValue(), String.valueOf(inspectionRecord.getInspectionMode()));
			String phuongThucKiemTra = "";
			if(dmDataItem != null && dmDataItem.getName() != null && dmDataItem.getName().trim().length() > 0){
				phuongThucKiemTra = dmDataItem.getName();
			}
			vehicleInspectionRecord.setINSPECTIONMODENAME(phuongThucKiemTra);
			vehicleInspectionRecord.setDESCRIPTION(inspectionRecord.getDescription());
			vehicleInspectionRecord.setREMARKS(inspectionRecord.getRemarks());
			vehicleInspectionRecord.setCONFIRMEDRESULT((new Long(inspectionRecord.getConfirmedResult()).intValue()));
			vehicleInspectionRecord.setMARKUPEMISSIONTEST((new Long(inspectionRecord.getMarkupEmissionTest())
					.intValue()));
			vehicleInspectionRecord.setMARKUPSAFETEST((new Long(inspectionRecord.getMarkupSafeTest()).intValue()));
			vehicleInspectionRecord.setMARKUPCONTROL((new Long(inspectionRecord.getMarkupControl()).intValue()));
			vehicleInspectionRecord.setSIGNDATE(FormatData.parseDateToTring(inspectionRecord.getSignDate()));
			vehicleInspectionRecord.setSIGNTITLE(inspectionRecord.getSignTitle());
			vehicleInspectionRecord.setSIGNNAME(inspectionRecord.getSignName());
			vehicleInspectionRecord.setSIGNPLACE(inspectionRecord.getSignPlace());

			importer.setImporterCode(registeredInspection.getImporterCode());
			importer.setImporterName(registeredInspection.getImporterName());
			importer.setImporterAddress(registeredInspection.getImporterAddress());
			importer.setRepresentative(registeredInspection.getRepresentative());
			importer.setPhone(registeredInspection.getPhone());
			importer.setFax(registeredInspection.getFax());
			importer.setEmail(registeredInspection.getEmail());
			generalInfo.setImporter(importer);
			
			generalInfo.setTradeMark(vehicleGroupInitial.getTradeMark());
			generalInfo.setModelType(vehicleGroupInitial.getCommercialName());
			generalInfo.setModelCode(vehicleGroupInitial.getModelCode());
			generalInfo.setVehicleType(vehicleGroupInitial.getVehicleType());
			generalInfo.setEngineType(vehicleGroup.getEngineType());
			generalInfo.setManufacturer(vehicleGroupInitial.getProductionPlant());
			generalInfo.setAddressProductionPlant(vehicleGroupInitial.getAddressOfProductionPlant());
			if (productionCountries != null && productionCountries.size() > 0) {
				int sizeProductionCountrie = productionCountries.size();
				//_log.info("int sizeProductionCountries = productionCountries.size(); "
//						+ productionCountries.size());
				List<String> prList = new ArrayList<String>();
				
				for (int i = 0; i < sizeProductionCountrie; i++) {
					prList.add(productionCountries.get(i).getCountryCode());
					// productionCountry.getCountryCode().add(productionCountries.get(i).getCountryCode());
				}
				if (prList.size() > 0) {
					productionCountry.getCountryCode().addAll(prList);
				}
				generalInfo.setProductionCountry(productionCountry);

			}
			generalInfo.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
			generalInfo.setEmissionStandard(vehicleGroup.getEmissionStandard());
			vehicleInspectionRecord.setGeneralInfo(generalInfo);

			if (lstObjXmlDoiChieuThongSoKtXes != null && lstObjXmlDoiChieuThongSoKtXes.size() > 0) {
				List<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem> specItems = new ArrayList<VehicleInspectionRecord.SpecificationList.SpecItem>();
				int sizeInspectionRecordSpec = lstObjXmlDoiChieuThongSoKtXes.size();
				for (int j = 0; j < sizeInspectionRecordSpec; j++) {
					ObjXmlDoiChieuThongSoKtXe objXmlDoiChieuThongSoKtXe = lstObjXmlDoiChieuThongSoKtXes.get(j);
					if (objXmlDoiChieuThongSoKtXe != null) {
						vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem();
						specItem.setSpecificationCode(objXmlDoiChieuThongSoKtXe.getSpecificationCode());
						specItem.setSpecificationName(objXmlDoiChieuThongSoKtXe.getSpecificationName());
						specItem.setDeclarationValue1(objXmlDoiChieuThongSoKtXe.getDeclarationValue());
						specItem.setDeclarationValue2("");
						specItem.setDeclarationValue3("");
						specItem.setDeclarationValue4("");
						specItem.setDeclarationValue5(objXmlDoiChieuThongSoKtXe.getDeclarationValueEdit());
						specItem.setDeclarationValue6(objXmlDoiChieuThongSoKtXe.getDeclarationResult());
//						ReportUtils.getVehicleCommonStatusName(objXmlDoiChieuThongSoKtXe.getDeclarationResult())
						specItems.add(specItem);
						// vehicleInspectionRecord.getSpecificationList().getSpecItem().add(specItem);
					}
				}
				if (specItems.size() > 0) {
					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList();
					specificationList.getSpecItem().addAll(specItems);
					vehicleInspectionRecord.setSpecificationList(specificationList);
				}
			}

			if (vehicleRecords != null && vehicleRecords.size() > 0) {
				int sizeVehicleRecord = vehicleRecords.size();
				List<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.ImportedVehicle> importedVehicles = new ArrayList<VehicleInspectionRecord.ImportedVehicle>();
				for (int j = 0; j < sizeVehicleRecord; j++) {
					VehicleRecord vehicleRecord = vehicleRecords.get(j);
					VehiclerecordInitial vehiclerecordInitial = VehiclerecordInitialLocalServiceUtil.fetchVehiclerecordInitial(vehicleRecord.getId());
					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.ImportedVehicle();
					importedVehicle.setSequenceNo(j + 1);
					importedVehicle.setCodeNumber(vehicleRecord.getCodeNumber());
					importedVehicle.setChassisNumber(vehicleRecord.getChassisNumber());
					importedVehicle.setChassisNumberInitial(vehiclerecordInitial.getChassisNumber());
					importedVehicle.setEngineNumber(vehicleRecord.getEngineNumber());
					importedVehicle.setEngineNumberInitial(vehiclerecordInitial.getEngineNumber());
					importedVehicle.setProductionYear(vehicleRecord.getProductionYear());
					importedVehicle.setProductionYearInitial(vehiclerecordInitial.getProductionYear());
					importedVehicle.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));
					importedVehicle.setVehicleEngineStatusInitial(Integer.parseInt(vehiclerecordInitial.getVehicleEngineStatus()));
					importedVehicle.setVehicleUnitPrice(String.valueOf(vehicleRecord.getUnitPrice()));
					importedVehicle.setCurrency(vehicleRecord.getCurrency());
					importedVehicle.setVehicleColor(vehicleRecord.getVehicleColor());
					importedVehicle.setVehicleColorInitial(vehiclerecordInitial.getVehicleColor());
					importedVehicle.setMarkAsSampleVehicle(String.valueOf(vehicleRecord.getMarkAsSample()));
					importedVehicles.add(importedVehicle);
				}
				if (importedVehicles.size() > 0) {
					vehicleInspectionRecord.getImportedVehicle().addAll(importedVehicles);
				}
			}
			
			if (confirmedInspection != null) {
				CustomsDeclaration customsDeclaration_Initial = CustomsDeclarationLocalServiceUtil
						.fetchCustomsDeclaration(confirmedInspection.getCustomsDeclarationId());
				if (customsDeclaration_Initial != null) {
					_log.info("customsDeclaration_Initial == " + confirmedInspection.getCustomsDeclarationId());
					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.CustomDeclaration();
					declaration.setImportCustomDeclareDateEdit(FormatData.parseDateToTring(customsDeclaration_Initial
							.getImportCustomDeclareDate()));
					declaration.setImportCustomDeclareNoEdit(customsDeclaration_Initial.getImportCustomDeclareNo());
					declaration.setImportCustomDeclare(CustomDeclareResult);
					
					if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)) {
						_log.info("inspectionRecord.getCustomsDeclarationid() == " + inspectionRecord.getCustomsDeclarationid());
						CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
								.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
						if (customsDeclaration != null) {
							declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
									.getImportCustomDeclareDate()));
							declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
							
						}
					} else {
						declaration.setImportCustomDeclareDate(importCustomDeclareDateEdit);
						declaration.setImportCustomDeclareNo(importCustomDeclareNoEdit);
					}
					vehicleInspectionRecord.getCustomDeclaration().add(declaration);
				} else {
					if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)) {
						_log.info("inspectionRecord.getCustomsDeclarationid() == " + inspectionRecord.getCustomsDeclarationid());
						CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
								.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
						if (customsDeclaration != null) {
							vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.CustomDeclaration();
							declaration.setImportCustomDeclareNoEdit(importCustomDeclareDateEdit);
							declaration.setImportCustomDeclareNoEdit(importCustomDeclareNoEdit);
							declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
									.getImportCustomDeclareDate()));
							declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
							declaration.setImportCustomDeclare(CustomDeclareResult);
							vehicleInspectionRecord.getCustomDeclaration().add(declaration);
							
						}
					} 
				}
				
			}
			
			
			
			if (certificateRecord != null) {
				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.COPReport();
					if (copReport != null) {
						cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
						cpReport.setCOPReportNumber(copReport.getReportNumber());
					}
					cpReport.setCOPReportNumberEdit(cOPReportNumberEdit);
					cpReport.setCOPReportResult(cOPReportNumberResult);
					vehicleInspectionRecord.getCOPReport().add(cpReport);
				
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				
					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.EmissionTestReport();
					if (emissionTestReport != null) {
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					}
					emissionTestReport2.setEmissionTestReportNumberEdit(emissionTestReportNumberEdit);
					emissionTestReport2.setEmissionTestReportResult(emissionTestReportResult);
					vehicleInspectionRecord.getEmissionTestReport().add(emissionTestReport2);

				SafetyTestReport testReport = SafetyTestReportLocalServiceUtil.fetchSafetyTestReport(certificateRecord
						.getSafetyTestReportId());
				
					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SafetyTestReport safetyTestReport = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SafetyTestReport();
					if (testReport != null) {
					safetyTestReport.setSafetyTestReportDate(FormatData.parseDateToTring(testReport.getSignDate()));
					safetyTestReport.setSafetyTestReportNumber(testReport.getReportNumber());
					}
					safetyTestReport.setSafetyTestReportNumberEdit(safetyTestReportNumberEdit);
					safetyTestReport.setSafetyTestReportResult(safetyTestReportResult);
					vehicleInspectionRecord.getSafetyTestReport().add(safetyTestReport);
			} else {
				vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.COPReport();
				cpReport.setCOPReportNumberEdit(cOPReportNumberEdit);
				cpReport.setCOPReportResult(cOPReportNumberResult);
				vehicleInspectionRecord.getCOPReport().add(cpReport);
			
				vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.EmissionTestReport();
				emissionTestReport2.setEmissionTestReportNumberEdit(emissionTestReportNumberEdit);
				emissionTestReport2.setEmissionTestReportResult(emissionTestReportResult);
				vehicleInspectionRecord.getEmissionTestReport().add(emissionTestReport2);

				vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SafetyTestReport safetyTestReport = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SafetyTestReport();
				safetyTestReport.setSafetyTestReportNumberEdit(safetyTestReportNumberEdit);
				safetyTestReport.setSafetyTestReportResult(safetyTestReportResult);
				vehicleInspectionRecord.getSafetyTestReport().add(safetyTestReport);
			}

			List<InspectionCommonStatus> liCommonStatus = InspectionCommonStatusLocalServiceUtil.findByVehicleClassAndInspectionRecordId(vehicleGroup.getVehicleClass(), inspectionRecord.getId());
			if (liCommonStatus != null && liCommonStatus.size() > 0) {
				int sizeInspectionCommonStatus = liCommonStatus.size();
				List<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionCommonStatus> inspectionCommonStatusList = new ArrayList<VehicleInspectionRecord.InspectionCommonStatus>();
				for (int i = 0; i < sizeInspectionCommonStatus; i++) {
					InspectionCommonStatus commonStatus = liCommonStatus.get(i);

					vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionCommonStatus inspectionCommonStatus = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionCommonStatus();
					inspectionCommonStatus.setCOMMONSTATUS((new Long(commonStatus.getCommonStatus())).intValue());
					inspectionCommonStatus.setGROUPNAME(commonStatus.getGroupName());
					inspectionCommonStatus.setITEMNAME(commonStatus.getItemName());
					inspectionCommonStatus.setSEQUENCENO(commonStatus.getSequenceNo());
					inspectionCommonStatus.setTYPE((new Long(commonStatus.getType())).intValue());
					inspectionCommonStatus.setVEHICLECLASS(commonStatus.getVehicleClass());
					inspectionCommonStatus.setCOMMONRESULT(commonStatus.getCommonCode());
					// vehicleInspectionRecord.getInspectionCommonStatus().add(inspectionCommonStatus);
					inspectionCommonStatusList.add(inspectionCommonStatus);
				}
				if (inspectionCommonStatusList != null && inspectionCommonStatusList.size() > 0) {
					vehicleInspectionRecord.getInspectionCommonStatus().addAll(inspectionCommonStatusList);
				}
			}

		} catch (Exception e) {
			_log.error(e);
		}
		return vehicleInspectionRecord;
	}
	public boolean guiThongTinThamChieu(Header header,  long userId,
			InquiryOfCertificateContent inquiryOfCertificateContent) {
		boolean result = true;
		try {
//			//_log.info("guiThongTinThamChieu   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			//_log.info("guiThongTinThamChieu ");
			long kq = 1;
			if (kq > 0 && inquiryOfCertificateContent != null) {

				// MessageType= 101
				// MessageFunction= 30
				CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
						.findByCertificateNumber(inquiryOfCertificateContent.getCertificateNumber());

				//TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
				if (certificateRecord != null && certificateRecord.getStampStatus() != Constants.AN_CHI_HUY) {
					//_log.info("certificateRecord != null ");
					List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
							.findByCertificateRecordId(certificateRecord.getId());
					List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil
							.findByCertificateRecordId(certificateRecord.getId());
					VehicleRecord vehicleRecord =null;
					if(vehicleRecords!=null&&vehicleRecords.size()>0){
						vehicleRecord =vehicleRecords.get(0);
					}
					VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
							.getVehicleGroupId());
					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
							.fetchRegisteredInspection(vehicleGroup.getRegisteredInspectionId());

					VehicleGroupInitial vehicleGroupInitial = BienBanKTNghiepVuUtils.getVehicleGroupInitialByVehicleRecord(vehicleRecords.get(0));
					
					List<ProductionCountry> productionCountries = null;
					
					if(vehicleGroupInitial != null) {
						productionCountries = ProductionCountryLocalServiceUtil
							.findByVehicleGroupId(vehicleGroupInitial.getId());
					} else {
						productionCountries = ProductionCountryLocalServiceUtil
							.findByVehicleGroupId(vehicleGroup.getId());
					}

					TechnicalSpecification technicalSpecification = new TechnicalSpecification();
					technicalSpecification.setTechnicalSpecCode(vehicleGroup.getTechnicalSpecCode());
					technicalSpecification.setCertificateRefNo(certificateRecord.getCertificateNumber());

					vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo generalInfo = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo();

					vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.Importer importer = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.Importer();
					importer.setImporterCode(registeredInspection.getImporterCode());
					importer.setImporterName(registeredInspection.getImporterName());
					importer.setImporterAddress(registeredInspection.getImporterAddress());
					importer.setRepresentative(registeredInspection.getRepresentative());
					importer.setPhone(registeredInspection.getPhone());
					importer.setFax(registeredInspection.getFax());
					importer.setEmail(registeredInspection.getEmail());
					generalInfo.setImporter(importer);

					generalInfo.setTradeMark(vehicleGroup.getTradeMark());
					generalInfo.setModelType(vehicleGroup.getCommercialName());
					generalInfo.setModelCode(vehicleGroup.getModelCode());
					generalInfo.setVehicleType(vehicleGroup.getVehicleType());
					generalInfo.setEngineType(vehicleGroup.getEngineType());
					generalInfo.setManufacturer(vehicleGroup.getProductionPlant());
					generalInfo.setAddressProductionPlant(vehicleGroup.getAddressOfProductionPlant());
					if (productionCountries != null && productionCountries.size() > 0) {
						int sizeProductionCountrie = productionCountries.size();
						//_log.info("int sizeProductionCountries = productionCountries.size(); "
//								+ productionCountries.size());
						List<String> list = new ArrayList<String>();
						vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.ProductionCountry();
						for (int i = 0; i < sizeProductionCountrie; i++) {
							list.add(productionCountries.get(i).getCountryCode());
							// productionCountry.getCountryCode().add(productionCountries.get(i).getCountryCode());
						}
						if (list.size() > 0) {
							productionCountry.getCountryCode().addAll(list);
						}
						generalInfo.setProductionCountry(productionCountry);

					}
					generalInfo.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
					generalInfo.setEmissionStandard(vehicleGroup.getEmissionStandard());
					technicalSpecification.setGeneralInfo(generalInfo);
					if (certificateRecordSpecs != null && certificateRecordSpecs.size() > 0) {
						int sizeCertificateRecordSpec = certificateRecordSpecs.size();
						List<vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem> specItemList = new ArrayList<TechnicalSpecification.SpecificationList.SpecItem>();
						for (int j = 0; j < sizeCertificateRecordSpec; j++) {
							CertificateRecordSpec certificateRecordSpec = certificateRecordSpecs.get(j);
							if (certificateRecordSpec.getSpecificationValue() != null
									&& certificateRecordSpec.getSpecificationValue().length() > 0) {
								vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem();
								specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
								String specificationName = certificateRecordSpec.getSpecificationName();
								if (specificationName == null || specificationName.length() == 0) {
									specificationName = "specificationName";
								}

								specItem.setSpecificationName(specificationName);
								specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
								specItem.setDeclarationValue2("");
								specItem.setDeclarationValue3("");
								specItem.setDeclarationValue4("");
								specItem.setDeclarationValue5("");
								specItem.setDeclarationValue6("");
								specItemList.add(specItem);
								// technicalSpecification.getSpecificationList().getSpecItem().add(specItem);
							}
						}
						if (specItemList != null && specItemList.size() > 0) {
							vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList();
							specificationList.getSpecItem().addAll(specItemList);
							technicalSpecification.setSpecificationList(specificationList);
						}

					}

					technicalSpecification.setRemarks(vehicleGroup.getRemarks());

					vn.dtt.gt.dk.nsw.model.TechnicalSpecification.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.ImportedVehicle();
					importedVehicle.setSequenceNo(1);
					importedVehicle.setCodeNumber(vehicleRecord.getCodeNumber());
					importedVehicle.setChassisNumber(vehicleRecord.getChassisNumber());
					importedVehicle.setEngineNumber(vehicleRecord.getEngineNumber());
					importedVehicle.setProductionYear(vehicleRecord.getProductionYear());
					importedVehicle.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));
					String vehicleUnitPrice = (new Double( vehicleRecord.getUnitPrice()).longValue())+"";
					//_log.info("vehicleUnitPrice  "+vehicleUnitPrice);
					importedVehicle.setVehicleUnitPrice(vehicleUnitPrice);
					importedVehicle.setCurrency(vehicleRecord.getCurrency());

					technicalSpecification.getImportedVehicle().add(importedVehicle);

					callWebserviceNSWBusiness.message101va30(userId + "", header,
							functionNghiepVu.getRamdomMessage(), "01", technicalSpecification);
				} else {
					//_log.info("certificateRecord == null ");
					callWebserviceNSWBusiness.message219va30(userId + "", header,
							inquiryOfCertificateContent.getRequestDate(),
							inquiryOfCertificateContent.getCertificateNumber(), "2");
				}
			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	
	public String guiThongTinThamChieuTT(Header header,  long userId,
			InquiryOfCertificateContent inquiryOfCertificateContent) {
		String result = "";
		try {
//			//_log.info("guiThongTinThamChieu   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			//_log.info("guiThongTinThamChieu ");
			long kq = 1;
			if (kq > 0 && inquiryOfCertificateContent != null) {

				// MessageType= 101
				// MessageFunction= 30
				CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
						.findByCertificateNumber(inquiryOfCertificateContent.getCertificateNumber());

				//TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
				if (certificateRecord != null && certificateRecord.getStampStatus() != Constants.AN_CHI_HUY) {
					//_log.info("certificateRecord != null ");
					List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
							.findByCertificateRecordId(certificateRecord.getId());
					List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil
							.findByCertificateRecordId(certificateRecord.getId());
					VehicleRecord vehicleRecord =null;
					if(vehicleRecords!=null&&vehicleRecords.size()>0){
						vehicleRecord =vehicleRecords.get(0);
					}
					VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
							.getVehicleGroupId());
					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
							.fetchRegisteredInspection(vehicleGroup.getRegisteredInspectionId());

					VehicleGroupInitial vehicleGroupInitial = BienBanKTNghiepVuUtils.getVehicleGroupInitialByVehicleRecord(vehicleRecords.get(0));
					
					List<ProductionCountry> productionCountries = null;
					
					if(vehicleGroupInitial != null) {
						productionCountries = ProductionCountryLocalServiceUtil
							.findByVehicleGroupId(vehicleGroupInitial.getId());
					} else {
						productionCountries = ProductionCountryLocalServiceUtil
							.findByVehicleGroupId(vehicleGroup.getId());
					}

					TechnicalSpecification technicalSpecification = new TechnicalSpecification();
					technicalSpecification.setTechnicalSpecCode(vehicleGroup.getTechnicalSpecCode());
					technicalSpecification.setCertificateRefNo(certificateRecord.getCertificateNumber());

					vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo generalInfo = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo();

					vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.Importer importer = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.Importer();
					importer.setImporterCode(registeredInspection.getImporterCode());
					importer.setImporterName(registeredInspection.getImporterName());
					importer.setImporterAddress(registeredInspection.getImporterAddress());
					importer.setRepresentative(registeredInspection.getRepresentative());
					importer.setPhone(registeredInspection.getPhone());
					importer.setFax(registeredInspection.getFax());
					importer.setEmail(registeredInspection.getEmail());
					generalInfo.setImporter(importer);

					generalInfo.setTradeMark(vehicleGroup.getTradeMark());
					generalInfo.setModelType(vehicleGroup.getCommercialName());
					generalInfo.setModelCode(vehicleGroup.getModelCode());
					generalInfo.setVehicleType(vehicleGroup.getVehicleType());
					generalInfo.setEngineType(vehicleGroup.getEngineType());
					generalInfo.setManufacturer(vehicleGroup.getProductionPlant());
					generalInfo.setAddressProductionPlant(vehicleGroup.getAddressOfProductionPlant());
					if (productionCountries != null && productionCountries.size() > 0) {
						int sizeProductionCountrie = productionCountries.size();
						//_log.info("int sizeProductionCountries = productionCountries.size(); "
//								+ productionCountries.size());
						List<String> list = new ArrayList<String>();
						vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.ProductionCountry();
						for (int i = 0; i < sizeProductionCountrie; i++) {
							list.add(productionCountries.get(i).getCountryCode());
							// productionCountry.getCountryCode().add(productionCountries.get(i).getCountryCode());
						}
						if (list.size() > 0) {
							productionCountry.getCountryCode().addAll(list);
						}
						generalInfo.setProductionCountry(productionCountry);

					}
					generalInfo.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
					generalInfo.setEmissionStandard(vehicleGroup.getEmissionStandard());
					technicalSpecification.setGeneralInfo(generalInfo);
					if (certificateRecordSpecs != null && certificateRecordSpecs.size() > 0) {
						int sizeCertificateRecordSpec = certificateRecordSpecs.size();
						List<vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem> specItemList = new ArrayList<TechnicalSpecification.SpecificationList.SpecItem>();
						for (int j = 0; j < sizeCertificateRecordSpec; j++) {
							CertificateRecordSpec certificateRecordSpec = certificateRecordSpecs.get(j);
							if (certificateRecordSpec.getSpecificationValue() != null
									&& certificateRecordSpec.getSpecificationValue().length() > 0) {
								vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem();
								specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
								String specificationName = certificateRecordSpec.getSpecificationName();
								if (specificationName == null || specificationName.length() == 0) {
									specificationName = "specificationName";
								}

								specItem.setSpecificationName(specificationName);
								specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
								specItem.setDeclarationValue2("");
								specItem.setDeclarationValue3("");
								specItem.setDeclarationValue4("");
								specItem.setDeclarationValue5("");
								specItem.setDeclarationValue6("");
								specItemList.add(specItem);
								// technicalSpecification.getSpecificationList().getSpecItem().add(specItem);
							}
						}
						if (specItemList != null && specItemList.size() > 0) {
							vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList();
							specificationList.getSpecItem().addAll(specItemList);
							technicalSpecification.setSpecificationList(specificationList);
						}

					}

					technicalSpecification.setRemarks(vehicleGroup.getRemarks());

					vn.dtt.gt.dk.nsw.model.TechnicalSpecification.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.ImportedVehicle();
					importedVehicle.setSequenceNo(1);
					importedVehicle.setCodeNumber(vehicleRecord.getCodeNumber());
					importedVehicle.setChassisNumber(vehicleRecord.getChassisNumber());
					importedVehicle.setEngineNumber(vehicleRecord.getEngineNumber());
					importedVehicle.setProductionYear(vehicleRecord.getProductionYear());
					importedVehicle.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));
					String vehicleUnitPrice = (new Double( vehicleRecord.getUnitPrice()).longValue())+"";
					//_log.info("vehicleUnitPrice  "+vehicleUnitPrice);
					importedVehicle.setVehicleUnitPrice(vehicleUnitPrice);
					importedVehicle.setCurrency(vehicleRecord.getCurrency());

					technicalSpecification.getImportedVehicle().add(importedVehicle);

					result =  callWebserviceNSWBusiness.builtMessage101va30(userId + "", header,
							functionNghiepVu.getRamdomMessage(), "01", technicalSpecification);
					
//					 callWebserviceNSWBusiness.message101va30(userId+"", header,
//							header.getReference().getMessageId(), "01", technicalSpecification);
				} else {
					//_log.info("certificateRecord == null ");
					result = callWebserviceNSWBusiness.builtMessage219va30(userId + "", header,
							inquiryOfCertificateContent.getRequestDate(),
							inquiryOfCertificateContent.getCertificateNumber(), "2");
//					callWebserviceNSWBusiness.message219va30(userId + "", header,
//							inquiryOfCertificateContent.getRequestDate(),
//							inquiryOfCertificateContent.getCertificateNumber(), "2");
				}
			}
		} catch (Exception e) {
			_log.error(e);
			result = "";
		}
		return result;
	}

	public boolean guiThongTinXeNK(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId,
			InquiryImportedVehicleReference inquiryImportedVehicleReference) {
		boolean result = true;
		try {
			//_log.info("guiThongTinXeNK   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
			// long kq =
			// motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId,
			// phieuXuLyPhuId,
			// dieuKienChuyenDich, userId);

			// MessageType= 101
			// MessageFunction= 30
			long kq = 1;
			if (kq > 0 && inquiryImportedVehicleReference != null) {

				// MessageType= 101
				// MessageFunction= 30
				int size = inquiryImportedVehicleReference.getCertificateDetails().size();
				for (int k = 0; k < size; k++) {
					vn.dtt.gt.dk.nsw.model.InquiryImportedVehicleReference.CertificateDetails certificateDetails = inquiryImportedVehicleReference
							.getCertificateDetails().get(k);
					CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
							.findByCertificateNumber(certificateDetails.getCertificateNumber());

					TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
					if (certificateRecord != null) {
						List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
								.findByCertificateRecordId(certificateRecord.getId());
						List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil
								.findByCertificateRecordId(certificateRecord.getId());
						VehicleRecord vehicleRecord =null;
						if(vehicleRecords!=null&&vehicleRecords.size()>0){
							vehicleRecord =vehicleRecords.get(0);
						}
						VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
								.getVehicleGroupId());
						RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
								.fetchRegisteredInspection(vehicleGroup.getRegisteredInspectionId());

						VehicleGroupInitial vehicleGroupInitial = BienBanKTNghiepVuUtils.getVehicleGroupInitialByVehicleRecord(vehicleRecords.get(0));
						
						List<ProductionCountry> productionCountries = null;
						
						if(vehicleGroupInitial != null) {
							productionCountries = ProductionCountryLocalServiceUtil
								.findByVehicleGroupId(vehicleGroupInitial.getId());
						} else {
							productionCountries = ProductionCountryLocalServiceUtil
								.findByVehicleGroupId(vehicleGroup.getId());
						}
						// List<CertificateCircular> circulars =
						// CertificateCircularLocalServiceUtil
						// .findByCertificateRecordId(vehicleRecord.getCertificateRecordId());

						TechnicalSpecification technicalSpecification = new TechnicalSpecification();
						technicalSpecification.setTechnicalSpecCode(vehicleGroup.getTechnicalSpecCode());
						technicalSpecification.setCertificateRefNo("");

						vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo generalInfo = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo();

						vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.Importer importer = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.Importer();
						importer.setImporterCode(registeredInspection.getImporterCode());
						importer.setImporterName(registeredInspection.getImporterName());
						importer.setImporterAddress(registeredInspection.getImporterAddress());
						importer.setRepresentative(registeredInspection.getRepresentative());
						importer.setPhone(registeredInspection.getPhone());
						importer.setFax(registeredInspection.getFax());
						importer.setEmail(registeredInspection.getEmail());
						generalInfo.setImporter(importer);

						generalInfo.setTradeMark(vehicleGroup.getTradeMark());
						generalInfo.setModelType(vehicleGroup.getCommercialName());
						generalInfo.setModelCode(vehicleGroup.getModelCode());
						generalInfo.setVehicleType(vehicleGroup.getVehicleType());
						generalInfo.setEngineType(vehicleGroup.getEngineType());
						generalInfo.setManufacturer(vehicleGroup.getProductionPlant());
						generalInfo.setAddressProductionPlant(vehicleGroup.getAddressOfProductionPlant());
						if (productionCountries != null && productionCountries.size() > 0) {
							int sizeProductionCountrie = productionCountries.size();
							//_log.info("int sizeProductionCountries = productionCountries.size(); "
//									+ productionCountries.size());
							List<String> list = new ArrayList<String>();
							vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.GeneralInfo.ProductionCountry();
							for (int i = 0; i < sizeProductionCountrie; i++) {
								// productionCountry.getCountryCode().add(productionCountries.get(i).getCountryCode());
								list.add(productionCountries.get(i).getCountryCode());
							}
							if (list.size() > 0) {
								productionCountry.getCountryCode().addAll(list);
							}
							generalInfo.setProductionCountry(productionCountry);

						}
						generalInfo.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
						generalInfo.setEmissionStandard(vehicleGroup.getEmissionStandard());
						technicalSpecification.setGeneralInfo(generalInfo);
						if (certificateRecordSpecs != null && certificateRecordSpecs.size() > 0) {
							int sizeCertificateRecordSpec = certificateRecordSpecs.size();

							List<vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem> specItems = new ArrayList<TechnicalSpecification.SpecificationList.SpecItem>();
							for (int j = 0; j < sizeCertificateRecordSpec; j++) {
								CertificateRecordSpec certificateRecordSpec = certificateRecordSpecs.get(j);
								if (certificateRecordSpec.getSpecificationValue() != null
										&& certificateRecordSpec.getSpecificationValue().length() > 0) {
									vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList.SpecItem();
									specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
									String specificationName = certificateRecordSpec.getSpecificationName();
									if (specificationName == null || specificationName.length() == 0) {
										specificationName = "specificationName";
									}
									specItem.setSpecificationName(specificationName);
									specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
									specItem.setDeclarationValue2("");
									specItem.setDeclarationValue3("");
									specItem.setDeclarationValue4("");
									specItem.setDeclarationValue5("");
									specItem.setDeclarationValue6("");
									specItems.add(specItem);

								}
							}
							if (specItems.size() > 0) {
								vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.SpecificationList();
								specificationList.getSpecItem().addAll(specItems);
								technicalSpecification.setSpecificationList(specificationList);
							}
						}

						technicalSpecification.setRemarks(vehicleGroup.getRemarks());

						vn.dtt.gt.dk.nsw.model.TechnicalSpecification.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.TechnicalSpecification.ImportedVehicle();
						importedVehicle.setSequenceNo(1);
						importedVehicle.setCodeNumber(vehicleRecord.getCodeNumber());
						importedVehicle.setChassisNumber(vehicleRecord.getChassisNumber());
						importedVehicle.setEngineNumber(vehicleRecord.getEngineNumber());
						importedVehicle.setProductionYear(vehicleRecord.getProductionYear());
						importedVehicle
								.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));
						String vehicleUnitPrice = (new Double( vehicleRecord.getUnitPrice()).longValue())+"";
						//_log.info("vehicleUnitPrice  "+vehicleUnitPrice);
						importedVehicle.setVehicleUnitPrice(vehicleUnitPrice);
						importedVehicle.setCurrency(vehicleRecord.getCurrency());

						technicalSpecification.getImportedVehicle().add(importedVehicle);

						callWebserviceNSWBusiness.message101va30(userId + "", hoSoThuTuc,
								functionNghiepVu.getRamdomMessage(), "01", technicalSpecification);
					}
				}
			}

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}
	public List<CertificateRecord> getListSuaDoiGNC(long phieuXuLyPhuId){
		List<CertificateRecord> certificateRecords =new ArrayList<CertificateRecord>();
		try{
			//_log.info("getListSuaDoiGNC");
		
			MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			
			TthcNoidungHoSo noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(motCuaPhieuXuLyPhu.getNoiDungHoSoId());
				
			if (null != noidungHoSo ) {
				String data = MessageUtils.replaceXML(noidungHoSo.getNoiDungXml());
				//_log.info(data);
				List<Object> liObjects = MessageFactory.converXMLMessagesContentToObject(data);
				for (Object object : liObjects) {
					if (object instanceof NoticeCertificateEndorsement) {
						NoticeCertificateEndorsement noticeCertificateEndorsement = (NoticeCertificateEndorsement) object;
						List<NoticeCertificateEndorsement.CertificateDetails> list= noticeCertificateEndorsement.getCertificateDetails();
						if(list!=null&&list.size()>0){
							int size = list.size();
							for(int i=0;i<size;i++){
								NoticeCertificateEndorsement.CertificateDetails details = list.get(i);
								//_log.info(details.getCertificateNumber());
								CertificateRecord certificateRecord  = CertificateRecordLocalServiceUtil.findByCertificateNumber(details.getCertificateNumber());
								if(certificateRecord!=null){
									//_log.info("certificateRecord!=null");
									certificateRecords.add(certificateRecord);
								}
							}
						}
					}
				}
				
			}
		}catch (Exception e) {
			_log.error(e);
		}
		return certificateRecords;
	
	}
	public boolean xacNhanSuaDoiGNC(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId,
			List<CertificateRecord> certificateRecords,int dongY,String lyDo,long canBoSuLy,String messageId) {
		boolean result = true;
		try {
			//_log.info("guiThongTinXeNK   " + "   hoSoThuTucId  " + hoSoThuTucId + " dieuKienChuyenDich "
//					+ dieuKienChuyenDich + " phieuXuLyPhuId  " + phieuXuLyPhuId);
//			_log.info(1);
			if(lyDo==null||lyDo.length()==0){
				lyDo= DKConfigurationManager.getStrProp("dlydothaythechungchi", "Ly do thay the chung chi ");
			}

				int size = certificateRecords.size();
//				_log.info("size  "+size);
				for (int k = 0; k < size; k++) {
					CertificateRecord certificateRecord = certificateRecords.get(k);
					List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
							.findByCertificateRecordId(certificateRecord.getId());
					List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil
							.findByCertificateRecordId(certificateRecord.getId());
					VehicleRecord vehicleRecord =null;
					if(vehicleRecords!=null&&vehicleRecords.size()>0){
						vehicleRecord =vehicleRecords.get(0);
					}
					VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
							.getVehicleGroupId());
					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
							.fetchRegisteredInspection(vehicleGroup.getRegisteredInspectionId());
					InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
							.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());
					
					vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote = DebitNoteLocalServiceUtil.fetchDebitNote(vehicleRecord.getDebitNoteId());
					String debitNoteNumber = "";
					if (debitNote != null && debitNote.getDebitNoteNumber().length() > 0){
						debitNoteNumber = debitNote.getDebitNoteNumber().trim();
					}
					_log.info(3);
					ConfirmCertificateEndorsement confirmCertificateEndorsement = new ConfirmCertificateEndorsement();
					ConfirmCertificateEndorsement.Confirmation confirmation = new ConfirmCertificateEndorsement.Confirmation();
					String certificateNumber = "";
					if(certificateRecord.getCertificateNumber().trim().length() > DKConfigurationManager.getIntProp("VR_SIZE_SO_TU_TANG_CHUNG_CHI_GCN", 12)){
//						String [] arrayOldCertificateNumber = certificateRecord.getCertificateNumber().trim().split("-");
//						certificateNumber = arrayOldCertificateNumber[0];
						certificateNumber = certificateRecord.getOldCertificateNumber();
//						_log.info("certificateNumber  "+certificateNumber);
						confirmCertificateEndorsement.setNewCertificateNumber(certificateRecord.getCertificateNumber());
					} else {
						certificateNumber = certificateRecord.getCertificateNumber();
					}
//					_log.info(4);
					confirmation.setCertificateNumber(certificateRecord.getOldCertificateNumber());
//					_log.info("dongY  "+dongY);
					if(dongY==1){
						confirmation.setCertificateStatus(dongY);
					}else{
						confirmation.setCertificateStatus(2);
					}
					//confirmation.setExpiryDate(F)
					confirmCertificateEndorsement.setConfirmation(confirmation);
					confirmCertificateEndorsement.setChassisNumber(vehicleRecord.getChassisNumber());

					confirmCertificateEndorsement.setEngineNumber(vehicleRecord.getEngineNumber());
					confirmCertificateEndorsement.setEngineType(vehicleGroup.getEngineType());
					confirmCertificateEndorsement.setVehicleEngineStatus(Integer.parseInt(vehicleRecord
							.getVehicleEngineStatus()));
					
					vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.Importer importer = new vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.Importer();
					importer.setImporterAddress(registeredInspection.getImporterAddress());
					importer.setImporterCode(registeredInspection.getImporterCode());
					importer.setImporterName(registeredInspection.getImporterName());
					confirmCertificateEndorsement.setImporter(importer);

					confirmCertificateEndorsement.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
							.getInspectionRecordDate()));
					confirmCertificateEndorsement.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
					confirmCertificateEndorsement.setInspectionSite(inspectionRecord.getInspectionSite());

					vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.InspectorSign();

					inspectorSign.setSignDate(FormatData.parseDateToTring(certificateRecord.getSignDate()));
					CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
							.fetchByInspectorId(userId);
					inspectorSign.setSignName(corporationInspector.getInspectorName());
					inspectorSign.setSignPlace(corporationInspector.getPlace());
					inspectorSign.setSignTitle(corporationInspector.getTitle());
					inspectorSign.setDivision(certificateRecord.getDivision());
					inspectorSign.setOrganization(certificateRecord.getOrganization());

					confirmCertificateEndorsement.setInspectorSign(inspectorSign);

					confirmCertificateEndorsement.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
					confirmCertificateEndorsement.setModelCode(vehicleGroup.getModelCode());
					confirmCertificateEndorsement.setModelType(vehicleGroup.getCommercialName());

					List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
							.findByVehicleGroupId(vehicleGroup.getId());
					if (productionCountries != null && productionCountries.size() > 0) {
						int sizeProductionCountries = productionCountries.size();
//						_log.info(sizeProductionCountries);
						List<String> list = new ArrayList<String>();
						vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.ProductionCountry();
						for (int j = 0; j < sizeProductionCountries; j++) {
							// productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
							list.add(productionCountries.get(j).getCountryCode());
						}
						if (list.size() > 0) {
							productionCountry.getCountryCode().addAll(list);
						}
						confirmCertificateEndorsement.setProductionCountry(productionCountry);
					}
					confirmCertificateEndorsement.setProductionYear(vehicleRecord.getProductionYear());
					confirmCertificateEndorsement.setRegisteredNumber(registeredInspection.getRegisteredNumber());
//					_log.info(6);
					if (certificateRecordSpecs != null && certificateRecordSpecs.size() > 0) {
						int sizeCertificateRecordSpec = certificateRecordSpecs.size();
						List<vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SpecificationList.SpecItem> specItemList = new ArrayList<ConfirmCertificateEndorsement.SpecificationList.SpecItem>();
						for (int l = 0; l < sizeCertificateRecordSpec; l++) {
							CertificateRecordSpec certificateRecordSpec = certificateRecordSpecs.get(l);
							vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SpecificationList.SpecItem();
							specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
							String specificationName = certificateRecordSpec.getSpecificationName();
							if (specificationName == null || specificationName.length() == 0) {
								specificationName = "specificationName";
							}
							specItem.setSpecificationName(specificationName);
							if(certificateRecordSpec.getSpecificationValue()!=null&&certificateRecordSpec.getSpecificationValue().length()>0){
								specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
	//							specItem.setDeclarationValue2("");
	//							specItem.setDeclarationValue3("");
	//							specItem.setDeclarationValue4("");
	//							specItem.setDeclarationValue5("");
	//							specItem.setDeclarationValue6("");
	
								// confirmCertificateEndorsement.getSpecificationList().getSpecItem().add(specItem);
								specItemList.add(specItem);
							}
						}
						if (specItemList != null && specItemList.size() > 0) {
							vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.SpecificationList();
							specificationList.getSpecItem().addAll(specItemList);
							confirmCertificateEndorsement.setSpecificationList(specificationList);
						}
					}
//					_log.info(7);
					List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
							.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
					if (circulars != null && circulars.size() > 0) {
						int sizeCount = circulars.size();
						List<vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.Circular> circularList = new ArrayList<ConfirmCertificateEndorsement.Circular>();
						for (int j = 0; j < sizeCount; j++) {
							CertificateCircular certificateCircular = circulars.get(j);
							vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.Circular circular = new vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.Circular();
							circular.setCircularDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
							circular.setCircularNo(certificateCircular.getCircularNo());
							circular.setSequenceNo((new Long(certificateCircular.getSequenceNo())).intValue());
							circularList.add(circular);
							// confirmCertificateEndorsement.getCircular().add(circular);
						}

						if (circularList.size() > 0) {
							confirmCertificateEndorsement.getCircular().addAll(circularList);
						}
					}
//					ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//							.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
//					_log.info(8);
					if ((inspectionRecord != null) && (inspectionRecord.getConfirmedInspectionId() >0) ){
						CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
								.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
						if (customsDeclaration != null) {
							vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.CustomDeclaration();
							declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
									.getImportCustomDeclareDate()));
							declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
							confirmCertificateEndorsement.getCustomDeclaration().add(declaration);
						}
					}
//					_log.info(9);
					CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
					if (copReport != null) {
						vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.COPReport();
						cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
						cpReport.setCOPReportNumber(copReport.getReportNumber());
						confirmCertificateEndorsement.getCOPReport().add(cpReport);
					}
					EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
							.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
					if (emissionTestReport != null) {
						vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.EmissionTestReport();
						emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
								.getSignDate()));
						emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
						confirmCertificateEndorsement.getEmissionTestReport().add(emissionTestReport2);
					}

					confirmCertificateEndorsement.setTradeMark(vehicleGroup.getTradeMark());
					confirmCertificateEndorsement.setVehicleType(vehicleGroup.getVehicleType());
					confirmCertificateEndorsement.setRemarks(certificateRecord.getRemarks()+"<br>"+lyDo);
//					_log.info(10);
					//update lai Certificate
					CertificateRecord record = CertificateRecordLocalServiceUtil.findByCertificateNumber(certificateNumber);
					if ((record != null) && (dongY==1) ){
						record.setStampStatus(Constants.AN_CHI_HUY);
						CertificateRecordLocalServiceUtil.updateCertificateRecord(record);
					}
//					_log.info(11);
					List<vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.AttachedFile> attachedFiles = new ArrayList<vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.AttachedFile>();
				     vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.AttachedFile attachedFilePDFKy = new vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.AttachedFile();
				     TthcNoidungHoSo noidungHoSo = TthcNoidungHoSoLocalServiceUtil
				       .fetchTthcNoidungHoSo(certificateRecord.getAttachedFile());
				     long kySoId = noidungHoSo.getTaiLieuDinhKem();
				     if (kySoId > 0) {
				      attachedFilePDFKy.setAttachedTypeCode("211");
				      attachedFilePDFKy.setAttachedTypeName("MAU_FILE_KY");
				      attachedFilePDFKy.setAttachedDocName("MAU_FILE_KY");
				      attachedFilePDFKy.setAttachedNote("MAU_FILE_KY");
				      attachedFilePDFKy.setAttachedSequenceNo(3);
				      //attachedFilePDFKy.setBase64FileContent(FileUtils.getBase64FileContent1(kySoId));
				      attachedFilePDFKy.setFileURL(FileUtils.getFullFileURL(kySoId));
				      attachedFilePDFKy.setFullFileName(FileUtils.getNameByFileEntryId(kySoId));

				      attachedFiles.add(attachedFilePDFKy);
				     }

				  // Sonvh bosung 22/09/2016
						long idTBTCGD = vehicleRecord.getControlRequirementId();
						long idKQTCGD = 0;
						if (idTBTCGD >0)
						{
							ControlReport controlRequirementResult = null;
							controlRequirementResult = ControlReportLocalServiceUtil.findByInspectionrecordId(inspectionRecord.getId());
							if ((controlRequirementResult !=null) && (controlRequirementResult.getAttachedFile() > 0))
							{
								TthcNoidungHoSo noidungHoSo_TCGD = TthcNoidungHoSoLocalServiceUtil						
									.fetchTthcNoidungHoSo(controlRequirementResult.getAttachedFile());
								
								idKQTCGD = noidungHoSo_TCGD.getTaiLieuDinhKem();
							}
							vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.AttachedFile attachedFilePDF_TCGD = new vn.dtt.gt.dk.nsw.model.ConfirmCertificateEndorsement.AttachedFile();
							if (idKQTCGD > 0) {
								attachedFilePDF_TCGD.setAttachedTypeCode("204");
								attachedFilePDF_TCGD.setAttachedTypeName("MAU_FILE_KY");
								attachedFilePDF_TCGD.setAttachedDocName("MAU_FILE_KY");
								attachedFilePDF_TCGD.setAttachedNote("MAU_FILE_KY");
								attachedFilePDF_TCGD.setAttachedSequenceNo(3);
								//attachedFilePDF_TCGD.setBase64FileContent("");
								attachedFilePDF_TCGD.setFileURL(FileUtils.getFullFileURL(idKQTCGD));
								attachedFilePDF_TCGD.setFullFileName(FileUtils.getNameByFileEntryId(idKQTCGD));
								attachedFiles.add(attachedFilePDF_TCGD);   
							}
							_log.info("============attachedFiles.size() 204==========="
							+ attachedFiles.size());
						}
						// END
						
				     if (attachedFiles != null && attachedFiles.size() > 0) {
				      confirmCertificateEndorsement.getAttachedFile().addAll(attachedFiles);
				     }
//				     _log.info(12);
					TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
					messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId,hoSoThuTucId, dieuKienChuyenDich, certificateRecord.getId()+"",messageId ,debitNoteNumber,"30","217" );
					callWebserviceNSWBusiness.message217va30(userId + "", hoSoThuTuc,
							messageId, "01", confirmCertificateEndorsement);
				}
	//		}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean capChungChiHangLoat(PaymentNotification paymentNotification, long userId,
			List<VehicleRecord> vehicleRecords, int count_size_xe, long hoSoThuTucId, long phieuXuLyPhuId,
			ActionRequest actionRequest) {
		boolean result = true;
		try {
			//_log.info("capChungChiHangLoat listVehicleRecordId ");
			if (paymentNotification != null && paymentNotification.getImportedVehicle().size() > 0) {
				int size = paymentNotification.getImportedVehicle().size();
				for (int i = 0; i < size; i++) {
					vn.dtt.gt.dk.nsw.model.PaymentNotification.ImportedVehicle importedVehicle = paymentNotification
							.getImportedVehicle().get(i);

					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
							.findByRegisteredNumber(importedVehicle.getRegisteredNumber());
					TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(registeredInspection
							.getDossierId());
					VehicleRecord vehicleRecord = VehicleRecordLocalServiceUtil.findByCodeNumberAndDossierId(
							importedVehicle.getCodeNumber(), registeredInspection.getDossierId());
					VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
							.getVehicleGroupId());
					CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
							.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());

					if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_GCN) {
						guiGiayChungNhan(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord,
								vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,null,null);
					} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBM) {
						guiThongBaoMien(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord,
								vehicleGroup, Constants.CO_GUI, StringPool.BLANK, StringPool.BLANK,null,null);
					} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBKD) {
						guiThongBaoKhongDat(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord,
								vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,null,null);
					} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBXNTT) {
						guiThongBaoXacNhanTinhTrang(hoSoThuTuc, userId, vehicleRecord, registeredInspection,
								certificateRecord, vehicleGroup, Constants.CO_GUI, StringPool.BLANK, StringPool.BLANK,null,null);
					} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBVP) {
						guiThongBaoViPham(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord,
								vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,null,null);
					}
				}
			} else if (vehicleRecords != null && vehicleRecords.size() > 0) {

				int size = vehicleRecords.size();
				String dieuKienChuyenDich = DKConfigurationManager.getStrProp(
						"dieukiendichchuyen.dong.y.cap.chung.chi", "dong.y.cap.chung.chi");
				//_log.info("size  " + size + "   count_size_xe  " + count_size_xe + "  dieuKienChuyenDich "
//						+ dieuKienChuyenDich);
				if (count_size_xe == size) {
					motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
							userId);
					MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
							.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
					String ghiChu = phieuXuLyPhu.getGhiChu();

					ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_CAP_CHUNG_CHI","Cho cap chung chi"),
							"");
					ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("DA_CAP_CHUNG_CHI", "Da cap chung chi"),
							"");
					ghiChu ="<b>"+DKConfigurationManager.getStrProp("DA_CAP_CHUNG_CHI", "Da cap chung chi")+"</b><br>"+ghiChu;
					MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);

				}
				for (int i = 0; i < size; i++) {
					VehicleRecord vehicleRecord = vehicleRecords.get(i);

					ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
							.fetchConfirmedInspection(vehicleRecord.getConfirmedInspectionId());
					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
							.fetchRegisteredInspection(confirmedInspection.getRegisteredInspectionId());

					TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(registeredInspection
							.getDossierId());

					VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
							.getVehicleGroupId());
					CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
							.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());

					if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_GCN) {
						guiGiayChungNhan(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord,
								vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,null,null);
					} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBM) {
						guiThongBaoMien(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord,
								vehicleGroup, Constants.CO_GUI, StringPool.BLANK, StringPool.BLANK,null,null);
					} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBKD) {
						guiThongBaoKhongDat(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord,
								vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,null,null);
					} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBXNTT) {
						guiThongBaoXacNhanTinhTrang(hoSoThuTuc, userId, vehicleRecord, registeredInspection,
								certificateRecord, vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,null,null);
					} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBVP) {
						guiThongBaoViPham(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord,
								vehicleGroup, Constants.CO_GUI,StringPool.BLANK, StringPool.BLANK,null,null);
					}
				}
			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean guiChungChiTheoPhieuThu(long userId, List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> debitNotes,
			ActionRequest actionRequest) {
		boolean result = true;
		try {
			//_log.info("capChungChiHangLoat listVehicleRecordId ");

			int sizeDebitNotes = debitNotes.size();

			for (int j = 0; j < sizeDebitNotes; j++) {
				vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote = debitNotes.get(j);

				boolean flag = true;
				List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil.findByDebitNoteId(debitNote.getId());
				
				int size = vehicleRecords.size();
				if (size > 0)
				{
					VehicleRecord vehicleRecordInitial = vehicleRecords.get(0);
					VehicleGroup vehicleGroupInitial = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecordInitial
							.getVehicleGroupId());
					if (vehicleGroupInitial.getVehicleClass().startsWith("DCX")
							|| vehicleGroupInitial.getVehicleClass().startsWith("XDD")) {
						// Sonvh bosung 08/10/2016 -- lay lai danh sach xe, group by CertificateRecord
						vehicleRecords = new ArrayList<VehicleRecord>();
						vehicleRecords = VehicleRecordLocalServiceUtil.findVehicleRecordByDebitNoteIdGroupbyCertificateRecord(debitNote.getId());
						size = vehicleRecords.size();
						_log.info("-------findVehicleRecordByDebitNoteIdGroupbyCertificateRecord  -------debitNoteId---" + debitNote.getId() + " --- size ---" + size);
						
					}
				}
				TthcHoSoThuTuc hoSoThuTuc = null;
				long phieuXuLyPhuId = 0;

				String dieuKienChuyenDich = DKConfigurationManager.getStrProp(
						"dieukiendichchuyen.dong.y.cap.chung.chi", "dong.y.cap.chung.chi");
				for (int i = 0; i < size; i++) {
					// PaymentStatus paymentStatus = paymentStatuss.get(i);

					VehicleRecord vehicleRecord = vehicleRecords.get(i);

					InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
							.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());
					phieuXuLyPhuId = inspectionRecord.getPhieuXuLyPhuId();

					ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
							.fetchConfirmedInspection(vehicleRecord.getConfirmedInspectionId());
					RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
							.fetchRegisteredInspection(confirmedInspection.getRegisteredInspectionId());

					hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil
							.fetchTthcHoSoThuTuc(registeredInspection.getDossierId());

					VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
							.getVehicleGroupId());
					CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
							.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());

					if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_GCN&&certificateRecord.getDigitalIssued()==Constants.CERTIFICATE_DIGITAL_ISSSUED_0) {
						if (flag) {
							guiGiayChungNhan(hoSoThuTuc, userId, vehicleRecord, registeredInspection,
									certificateRecord, vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,debitNote.getDebitNoteNumber(),null);
						}

					} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBM&&certificateRecord.getDigitalIssued()==Constants.CERTIFICATE_DIGITAL_ISSSUED_0) {
						if (flag) {
							guiThongBaoMien(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord,
									vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,debitNote.getDebitNoteNumber(),null);
						}

					} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBKD&&certificateRecord.getDigitalIssued()==Constants.CERTIFICATE_DIGITAL_ISSSUED_0) {
						if (flag) {
							guiThongBaoKhongDat(hoSoThuTuc, userId, vehicleRecord, registeredInspection,
									certificateRecord, vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,debitNote.getDebitNoteNumber(),null);
						}

					} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBXNTT&&certificateRecord.getDigitalIssued()==Constants.CERTIFICATE_DIGITAL_ISSSUED_0) {
						if (flag) {
							guiThongBaoXacNhanTinhTrang(hoSoThuTuc, userId, vehicleRecord, registeredInspection,
									certificateRecord, vehicleGroup, Constants.CO_GUI, StringPool.BLANK, StringPool.BLANK,debitNote.getDebitNoteNumber(),null);
						}

					} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBVP&&certificateRecord.getDigitalIssued()==Constants.CERTIFICATE_DIGITAL_ISSSUED_0) {
						if (flag) {
							guiThongBaoViPham(hoSoThuTuc, userId, vehicleRecord, registeredInspection,
									certificateRecord, vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,debitNote.getDebitNoteNumber(),null);
						}

					}
					if (!flag) {
						break;
					}
				}
				debitNote.setMarkAsDeleted(Constants.TRA_CHUNG_CHI);
				DebitNoteLocalServiceUtil.updateDebitNote(debitNote);
				motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTuc.getId(), phieuXuLyPhuId, dieuKienChuyenDich,
						userId);
				MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
						.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
				String ghiChu = phieuXuLyPhu.getGhiChu();

				ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("CHO_CAP_CHUNG_CHI","Cho cap chung chi"),
						"");
				ghiChu = ghiChu.replace(DKConfigurationManager.getStrProp("DA_CAP_CHUNG_CHI", "Da cap chung chi"),
						"");
				ghiChu = "<b>"+DKConfigurationManager.getStrProp("DA_CAP_CHUNG_CHI", "Da cap chung chi")+"</b><br>"+ghiChu;
				MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);

			}

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}
	public boolean thanhToanTheoPhieuThu(long userId, List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> debitNotes,
			ActionRequest actionRequest) {
		boolean result = true;
		try {
			
			String TienMat = ParamUtil.getString(actionRequest, "thanhToanTienMat");
			int hinhThucThanhToan = 1;
			if (TienMat.trim().equalsIgnoreCase("1"))
			{
				hinhThucThanhToan = 4;// Thanh toan truc tiep
			}
				
			int sizeDebitNotes = debitNotes.size();

			for (int j = 0; j < sizeDebitNotes; j++) {
				vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote = debitNotes.get(j);
				
				List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil.findByDebitNoteId(debitNote.getId());
				String corporationName = null;
				String corporationId = null;
				String financialAccountant = null;
				 
				
				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
				if (corporationInspector != null) {
					financialAccountant = corporationInspector.getInspectorName().toString();
					
					DmDataItem doiKiemTra =  DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.CORPORATION, corporationInspector.getCorporationId());
					if (doiKiemTra != null) {						
						corporationId = doiKiemTra.getCode0().toString();	
						corporationName = doiKiemTra.getCode1().toString();	
					} else { corporationId = "00";
						corporationName = "00";}				
					
				}
				
								
				TthcHoSoThuTuc hoSoThuTuc = null;
				long phieuXuLyPhuId = 0;
				phieuXuLyPhuId = xacNhanHoanThanhNopLePhiTheoPhieuThu(hoSoThuTuc, phieuXuLyPhuId, vehicleRecords,
						userId, debitNote);
				
				debitNote.setCorporationId(corporationId);
				debitNote.setFinancialAccountant(financialAccountant);
				debitNote.setPaymentType(hinhThucThanhToan);
				debitNote.setMarkAsDeleted(Constants.THANH_TOAN);
				if (debitNote.getFromDate() == null) {
					debitNote.setFromDate(new Date()); // Ngay xac nhan thanh toan
				}
				DebitNoteLocalServiceUtil.updateDebitNote(debitNote);
				 
				long noiLuuTruTaiLieuId = 0;
				String tenFileExport = "defaultPDF.pdfs";
				String urlFile="/" + actionRequest.getPortletSession().getPortletContext().getPortletContextName()+"/export/default.pdf";
				String fileName = "";
				String realPath = ReportUtils.getTemplateReportFilePath(actionRequest.getPortletSession());
				VehicleGroup vehicleGroup = null;
					List<VehicleRecord> lVehicleRecords = VehicleRecordLocalServiceUtil.findByDebitNoteId(debitNote.getId());
					if (lVehicleRecords != null && lVehicleRecords.size() > 0) {
						vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(lVehicleRecords.get(0).getVehicleGroupId());
						if (vehicleGroup != null) {
//							ReportBusinessUtils.CorporationName = corporationName;
//							ReportBusinessUtils.FinancialAccountant = financialAccountant;
							if(vehicleGroup.getVehicleClass().trim().equalsIgnoreCase("DCX") || vehicleGroup.getVehicleClass().trim().equalsIgnoreCase("XDD")){
								fileName = ReportBusinessUtils.actionExportThongBaoLePhiMau2(realPath, debitNote.getId(),corporationName);
							}else{
								fileName = ReportBusinessUtils.actionExportThongBaoLePhi(realPath, debitNote.getId(),corporationName);
							}							
						}
					}
					if (fileName.trim().length() > 0) {
						tenFileExport = fileName;
						_log.info("==thanhToanTheoPhieuThu==tenFileExport =" + tenFileExport);
						urlFile = realPath + "export/" + tenFileExport;
						_log.info("==thanhToanTheoPhieuThu=urlFile==" + urlFile);
						 noiLuuTruTaiLieuId = FileKySoUtils.uploadUrlFile(urlFile, userId, actionRequest);
					}
					
					if(noiLuuTruTaiLieuId > 0){
						_log.info("==noiLuuTruTaiLieuId===" + noiLuuTruTaiLieuId);
						List<TthcHoSoThuTuc> lstHoSoThuTucs = TthcHoSoThuTucLocalServiceUtil.findByDebitNoteId(debitNote.getId());
						if(lstHoSoThuTucs != null && lstHoSoThuTucs.size() >0){
							for(TthcHoSoThuTuc ahoSoThuTuc : lstHoSoThuTucs){
								
								long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_DA_KY;
								String mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBPHILEPHI_MAU1;

								String tenTaiLieu = DKConfigurationManager.getStrProp("xac_nhan_nop_phi_le_phi_dang_kiem",
										"xac_nhan_nop_phi_le_phi_dang_kiem") + " " + FormatData.parseDateToTringType3(new Date());
								if (vehicleGroup.getMarkAsVehicle() == 1 && vehicleGroup.getVehicleType().startsWith("XDD")) {
									mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBPHILEPHI_MAU2;
								} else if (vehicleGroup.getMarkAsVehicle() == 0) {
									mauTrucTuyen = Constants.MAU_TRUC_TUYEN_TBPHILEPHI_MAU2;
								}

								long idNoiDungHoSo = taoNoiDungHoSo(userId, "", ahoSoThuTuc, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,0);
								// Tao lai noi dung neu buoc tren khong thanh cong
								if(idNoiDungHoSo == 0){
									idNoiDungHoSo = taoNoiDungHoSo(userId, "", ahoSoThuTuc, loaiTaiLieu, mauTrucTuyen, tenTaiLieu,0);
								}
								TthcNoidungHoSo noidungHoSo = TthcNoidungHoSoLocalServiceUtil.fetchTthcNoidungHoSo(idNoiDungHoSo);
								if(noidungHoSo != null){
									noidungHoSo.setTaiLieuDinhKem(noiLuuTruTaiLieuId);
									TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(noidungHoSo);
									
									_log.info("==ahoSoThuTuc===" + ahoSoThuTuc.getId());
									_log.info("==noidungHoSo===" + noidungHoSo.getId());
								}
								
								if(idNoiDungHoSo >0){
									MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = new MotCuaPhieuXuLyPhuImpl();
									long idMotCuaPhieuXuLyPhu = CounterLocalServiceUtil.increment(MotCuaPhieuXuLyPhu.class.getName());
									motCuaPhieuXuLyPhu.setId(idMotCuaPhieuXuLyPhu);
									motCuaPhieuXuLyPhu.setPhieuXuLyChinhId(ahoSoThuTuc.getId());
									motCuaPhieuXuLyPhu.setNoiDungHoSoId(idNoiDungHoSo);
									motCuaPhieuXuLyPhu.setNhomPhieuXuLy("KHONG");
									String trichyeu = DKConfigurationManager.getStrProp("so.phieu","so.phieu") + " <b>" + debitNote.getDebitNoteNumber() + "</b>";
									String ghichu = DKConfigurationManager.getStrProp("thoi.diem.tinh.tien","thoi.diem.tinh.tien") + " " + FormatData.parseDateToTringType3(debitNote.getReportDate()) + "<br>" + DKConfigurationManager.getStrProp("thoi.diem.xac.nhan.thanh.toan","thoi.diem.xac.nhan.thanh.toan") + " " + FormatData.parseDateToTringType3(new Date());
									motCuaPhieuXuLyPhu.setTrichYeuNoiDung(trichyeu);
									motCuaPhieuXuLyPhu.setGhiChu(ghichu);
									motCuaPhieuXuLyPhu.setTrangThaiHienTaiId(Constants.XAC_NHAN_THANH_TOAN_DU);
									motCuaPhieuXuLyPhu.setPhanNhomHoSoId(Constants.PHIEU_DA_THANH_TOAN);									
	
									motCuaPhieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.addMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
								}
							}
						}
						
					}
					
					// Tam comment de build he thong that
					
//					_log.info("---------Export invoices/customers--------VNPT: Cap lan dau");
//					if (debitNote.getToDate() != null) {
//						_log.info("---------Da cap HDDT; Bo qua Export invoices/customers--------VNPT:");
//					}else {
//						if ((ReportBusinessUtils.exportCustomers != null ) && (ReportBusinessUtils.exportInvoices != null)) 
//						{	 
//							int test1 = vnpt.CallWebserviceClient.updateCus(ReportBusinessUtils.exportCustomers);
//							_log.info("test1 -- Exported Customers -- " +test1);
//							String test2 = vnpt.CallWebserviceClient.importAndPublishInv(ReportBusinessUtils.exportInvoices);
//							_log.info("test2 -- Published Invoices -- " +test2);
//							if (test2.contains("OK")){
//								debitNote.setToDate(new Date()); // Ngay xac nhan cap moi hoa don dien tu
//								debitNote.setReportBy(test2);
//								DebitNoteLocalServiceUtil.updateDebitNote(debitNote);
//							}
//						}
//						else
//						{
//							_log.info("---------Export invoices"  + "---------Export customers--------VNPT: NULL");					
//						}
//					}
//					
					
					
			}

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean capLaiHoaDonTheoPhieuThu(long userId, List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> debitNotes,
			ActionRequest actionRequest) {
		boolean result = true;
		try {
			
			String TienMat = ParamUtil.getString(actionRequest, "thanhToanTienMat");
			int hinhThucThanhToan = 1;
			if (TienMat.trim().equalsIgnoreCase("1"))
			{
				hinhThucThanhToan = 4;// Thanh toan truc tiep
			}
				
			int sizeDebitNotes = debitNotes.size();

			for (int j = 0; j < sizeDebitNotes; j++) {
				vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote = debitNotes.get(j);
				
				List<VehicleRecord> vehicleRecords = VehicleRecordLocalServiceUtil.findByDebitNoteId(debitNote.getId());
				String corporationName = null;
				String corporationId = null;
				String financialAccountant = null;
				 
				
				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
				if (corporationInspector != null) {
					financialAccountant = corporationInspector.getInspectorName().toString();
					
					DmDataItem doiKiemTra =  DmDataItemLocalServiceUtil.getByDataGroupCodeNameAndDataItemCode0(DanhMucKey.CORPORATION, corporationInspector.getCorporationId());
					if (doiKiemTra != null) {						
						corporationId = doiKiemTra.getCode0().toString();	
						corporationName = doiKiemTra.getCode1().toString();	
					} else { corporationId = "00";
						corporationName = "00";}				
					
				}
				
								
				TthcHoSoThuTuc hoSoThuTuc = null;
				
				 
				long noiLuuTruTaiLieuId = 0;
				String tenFileExport = "defaultPDF.pdfs";
				String urlFile="/" + actionRequest.getPortletSession().getPortletContext().getPortletContextName()+"/export/default.pdf";
				String fileName = "";
				String realPath = ReportUtils.getTemplateReportFilePath(actionRequest.getPortletSession());
				VehicleGroup vehicleGroup = null;
					List<VehicleRecord> lVehicleRecords = VehicleRecordLocalServiceUtil.findByDebitNoteId(debitNote.getId());
					if (lVehicleRecords != null && lVehicleRecords.size() > 0) {
						vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(lVehicleRecords.get(0).getVehicleGroupId());
						if (vehicleGroup != null) {
//							ReportBusinessUtils.CorporationName = corporationName;
//							ReportBusinessUtils.FinancialAccountant = financialAccountant;
							if(vehicleGroup.getVehicleClass().trim().equalsIgnoreCase("DCX") || vehicleGroup.getVehicleClass().trim().equalsIgnoreCase("XDD")){
								fileName = ReportBusinessUtils.actionExportThongBaoLePhiMau2(realPath, debitNote.getId(),corporationName);
							}else{
								fileName = ReportBusinessUtils.actionExportThongBaoLePhi(realPath, debitNote.getId(),corporationName);
							}							
						}
					}
					if (fileName.trim().length() > 0) {
						// do nothing
					}					
					if(noiLuuTruTaiLieuId > 0){
						// do nothing
					}
					if ((debitNote.getToDate() == null) && (debitNote.getMarkAsDeleted() == 0)) {
						// do nothing
					}else {
						// Tam comment de build he thong that
//						
//						_log.info("---------Export invoices/customers--------VNPT: capLaiHoaDonTheoPhieuThu");
//						if ((ReportBusinessUtils.exportCustomers != null ) && (ReportBusinessUtils.exportInvoices != null)) 
//						{	 
//							int test1 = vnpt.CallWebserviceClient.updateCus(ReportBusinessUtils.exportCustomers);
//							_log.info("test1 -- Exported Customers -- " +test1);
//							String test2 = vnpt.CallWebserviceClient.importAndPublishInv(ReportBusinessUtils.exportInvoices);
//							_log.info("test2 -- Published Invoices -- " +test2);
//							if (test2.contains("OK")){
//								debitNote.setToDate(new Date()); // Ngay xac nhan cap lai hoa don dien tu
//								debitNote.setReportBy(test2);
//								DebitNoteLocalServiceUtil.updateDebitNote(debitNote);
//							}
//						}
//						else
//						{
//							_log.info("---------Export invoices"  + "---------Export customers--------VNPT: NULL");					
//						}
					}
			}

		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}
	
	public CertificateOfQuanlityConformity guiGiayChungNhan(TthcHoSoThuTuc hoSoThuTuc, long userId,
			VehicleRecord vehicleRecord, RegisteredInspection registeredInspection, DraftCertificate certificateRecord,
			VehicleGroup vehicleGroup,List<DraftCertificateSpec> draftCertificateSpecs,InspectionRecord inspectionRecord) {
		CertificateOfQuanlityConformity certificateOfQuanlityConformity = new CertificateOfQuanlityConformity();
		try {
//			//_log.info("guiGiayChungNhan   ");

			// long kq =
			// motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId,
			// phieuXuLyPhuId,
			// dieuKienChuyenDich, userId);
			long kq = 1;
			if (kq > 0) {

//				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
//						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());
				// MessageType= 211
				// MessageFunction= 30
				// Update VR_CERTIFICATERECORD
				// VehicleSpecificationLocalServiceUtil.addVehicleSpecification(vehicleSpecification)

				certificateOfQuanlityConformity.setCertificateNumber("DRAFT");
				certificateOfQuanlityConformity.setChassisNumber(vehicleRecord.getChassisNumber());
				certificateOfQuanlityConformity.setCodeNumber(vehicleRecord.getCodeNumber());
				certificateOfQuanlityConformity.setEngineNumber(vehicleRecord.getEngineNumber());
				certificateOfQuanlityConformity.setEngineType(vehicleGroup.getEngineType());
				certificateOfQuanlityConformity.setVehicleEngineStatus(Integer.parseInt(vehicleRecord
						.getVehicleEngineStatus()));
				certificateOfQuanlityConformity.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Importer importer = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				certificateOfQuanlityConformity.setImporter(importer);

				certificateOfQuanlityConformity.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				certificateOfQuanlityConformity.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				certificateOfQuanlityConformity.setInspectionSite(inspectionRecord.getInspectionSite());

				certificateOfQuanlityConformity.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				certificateOfQuanlityConformity.setModelCode(vehicleGroup.getModelCode());
				certificateOfQuanlityConformity.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
//					//_log.info("int sizeProductionCountries = productionCountries.size(); "
//							+ productionCountries.size());
					vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					certificateOfQuanlityConformity.setProductionCountry(productionCountry);
				}

				certificateOfQuanlityConformity.setProductionYear(vehicleRecord.getProductionYear());
				certificateOfQuanlityConformity.setRegisteredNumber(registeredInspection.getRegisteredNumber());
				if(draftCertificateSpecs==null){
				
					List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
							.findByCertificateRecordId(certificateRecord.getId());
					if (certificateRecordSpecs != null && certificateRecordSpecs.size() > 0) {
						int sizeCertificateRecordSpec = certificateRecordSpecs.size();
						vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList();
						for (int k = 0; k < sizeCertificateRecordSpec; k++) {
							CertificateRecordSpec certificateRecordSpec = certificateRecordSpecs.get(k);
							if (certificateRecordSpec.getSpecificationValue() != null
									&& certificateRecordSpec.getSpecificationValue().length() > 0) {
	
								vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem();
								specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
								String specificationName = certificateRecordSpec.getSpecificationName();
								if (specificationName == null || specificationName.length() == 0) {
									specificationName = "specificationName";
								}
								specItem.setSpecificationName(specificationName);
								specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
								specItem.setDeclarationValue2("");
								specItem.setDeclarationValue3("");
								specItem.setDeclarationValue4("");
								specItem.setDeclarationValue5("");
								specItem.setDeclarationValue6("");
								specificationList.getSpecItem().add(specItem);
	
							}
							// certificateOfQuanlityConformity.getSpecificationList().getSpecItem().add(specItem);
						}
						if (specificationList != null && specificationList.getSpecItem() != null
								&& specificationList.getSpecItem().size() > 0) {
							certificateOfQuanlityConformity.setSpecificationList(specificationList);
						}
					}
				}else{
					if (draftCertificateSpecs != null && draftCertificateSpecs.size() > 0) {
						int sizeCertificateRecordSpec = draftCertificateSpecs.size();
						vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList();
						for (int k = 0; k < sizeCertificateRecordSpec; k++) {
							DraftCertificateSpec certificateRecordSpec = draftCertificateSpecs.get(k);
							if (certificateRecordSpec.getSpecificationValue() != null
									&& certificateRecordSpec.getSpecificationValue().length() > 0) {
	
								vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem();
								specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
								String specificationName = certificateRecordSpec.getSpecificationName();
								if (specificationName == null || specificationName.length() == 0) {
									specificationName = "specificationName";
								}
								specItem.setSpecificationName(specificationName);
								specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
								specItem.setDeclarationValue2("");
								specItem.setDeclarationValue3("");
								specItem.setDeclarationValue4("");
								specItem.setDeclarationValue5("");
								specItem.setDeclarationValue6("");
								specificationList.getSpecItem().add(specItem);
	
							}
							// certificateOfQuanlityConformity.getSpecificationList().getSpecItem().add(specItem);
						}
						if (specificationList != null && specificationList.getSpecItem() != null
								&& specificationList.getSpecItem().size() > 0) {
							certificateOfQuanlityConformity.setSpecificationList(specificationList);
						}
					}
					
				}
				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {
					int sizeCount = circulars.size();
					List<vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Circular> circularList = new ArrayList<CertificateOfQuanlityConformity.Circular>();
					for (int j = 0; j < sizeCount; j++) {
						CertificateCircular certificateCircular = circulars.get(j);
						vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Circular circular = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Circular();
						circular.setCircularDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
						circular.setCircularNo(certificateCircular.getCircularNo());
						circular.setSequenceNo((new Long(certificateCircular.getSequenceNo())).intValue());
						circularList.add(circular);
						// certificateOfQuanlityConformity.getCircular().add(circular);
					}
					if (circularList.size() > 0) {
						certificateOfQuanlityConformity.getCircular().addAll(circularList);
					}

				}
//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						certificateOfQuanlityConformity.getCustomDeclaration().add(declaration);
					}
				}

				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
				if (copReport != null) {
					vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.COPReport();
					cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
					cpReport.setCOPReportNumber(copReport.getReportNumber());
					certificateOfQuanlityConformity.getCOPReport().add(cpReport);
				}
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				if (emissionTestReport != null) {
					vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.EmissionTestReport();
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					certificateOfQuanlityConformity.getEmissionTestReport().add(emissionTestReport2);
				}

				certificateOfQuanlityConformity.setTradeMark(vehicleGroup.getTradeMark());
				certificateOfQuanlityConformity.setVehicleType(vehicleGroup.getVehicleType());
				certificateOfQuanlityConformity.setRemarks(certificateRecord.getRemarks());
				
				//TODO
				if(vehicleGroup != null && vehicleGroup.getVehicleClass() != null && (vehicleGroup.getVehicleClass().equalsIgnoreCase("XDD") || vehicleGroup.getVehicleClass().equalsIgnoreCase("DCX"))){
				List<VehicleRecord> lstRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
					if(lstRecords != null && lstRecords.size() >0){
						List<vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ImportedVehicle> lstImportedVehicles = new ArrayList<vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ImportedVehicle>();
						for(VehicleRecord record : lstRecords){
							vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ImportedVehicle();
							importedVehicle.setSequenceNo(record.getSequenceNo());
							importedVehicle.setCodeNumber(record.getCodeNumber());
							importedVehicle.setProductionYear(record.getProductionYear());
							importedVehicle.setChassisNumber(record.getChassisNumber());
							importedVehicle.setEngineNumber(record.getEngineNumber());
							importedVehicle.setVehicleEngineStatus(ConvertUtil.convertToInt(record.getVehicleEngineStatus()));
							
							lstImportedVehicles.add(importedVehicle);
						}
						certificateOfQuanlityConformity.getImportedVehicle().addAll(lstImportedVehicles);
					}
				}
			}
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
		return certificateOfQuanlityConformity;
	}

	public CertificateOfQuanlityConformity guiGiayChungNhan(TthcHoSoThuTuc hoSoThuTuc, long userId,
			VehicleRecord vehicleRecord, RegisteredInspection registeredInspection,
			CertificateRecord certificateRecord, VehicleGroup vehicleGroup, int gui, 
			String soChungChiCu, String ngayChungChiCu,String debitNoteNumber, String transactionId) {
		CertificateOfQuanlityConformity certificateOfQuanlityConformity = new CertificateOfQuanlityConformity();
		try {
//			_log.info("=================vao guiGiayChungNhan co guiiiiiiiiiiiii==============" + gui);
			// long kq =
			// motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId,
			// phieuXuLyPhuId,
			// dieuKienChuyenDich, userId);
//			String messageId= functionNghiepVu.getRamdomMessage();
//			messgaeFunctions.insertKeHoachChuyenDich(null,hoSoThuTuc.getId(), "dieuKienChuyenDich", null,messageId );
			long kq = 1;
			if (kq > 0) {
				if (gui == Constants.CO_GUI) {
					certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_1);
					CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
				}
//				//_log.info("guiGiayChungNhan vehicleRecord.getInspectionRecordId()   "
//						+ vehicleRecord.getInspectionRecordId() + "  vehicleRecord " + vehicleRecord.getId());
				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());
				// MessageType= 211
				// MessageFunction= 30
				// Update VR_CERTIFICATERECORD
				// VehicleSpecificationLocalServiceUtil.addVehicleSpecification(vehicleSpecification)

				certificateOfQuanlityConformity.setCertificateNumber(certificateRecord.getCertificateNumber());
				if(soChungChiCu != null && soChungChiCu.trim().length() > 0){
					certificateOfQuanlityConformity.setPreviousCertificateNumber(soChungChiCu);
					certificateOfQuanlityConformity.setPreviousSignDate(ngayChungChiCu);
				}
				certificateOfQuanlityConformity.setChassisNumber(vehicleRecord.getChassisNumber());
				certificateOfQuanlityConformity.setCodeNumber(vehicleRecord.getCodeNumber());
				certificateOfQuanlityConformity.setEngineNumber(vehicleRecord.getEngineNumber());
				certificateOfQuanlityConformity.setEngineType(vehicleGroup.getEngineType());
				certificateOfQuanlityConformity.setVehicleEngineStatus(Integer.parseInt(vehicleRecord
						.getVehicleEngineStatus()));

				certificateOfQuanlityConformity.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Importer importer = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				certificateOfQuanlityConformity.setImporter(importer);
//				//_log.info(" inspectionRecord.getInspectionSite() " + inspectionRecord.getInspectionSite());
				certificateOfQuanlityConformity.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				certificateOfQuanlityConformity.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				certificateOfQuanlityConformity.setInspectionSite(inspectionRecord.getInspectionSite());

				vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.InspectorSign();

				inspectorSign.setSignDate(FormatData.parseDateToTring(certificateRecord.getSignDate()));
				inspectorSign.setSignName(certificateRecord.getSignName());
				inspectorSign.setSignPlace(certificateRecord.getSignPlace());
				inspectorSign.setSignTitle(certificateRecord.getSignTitle());
				inspectorSign.setDivision(certificateRecord.getDivision());
				inspectorSign.setOrganization(certificateRecord.getOrganization());
//				//_log.info(" inspectorSign.getSignTitle() " + registeredInspection.getImporterCode());
				certificateOfQuanlityConformity.setInspectorSign(inspectorSign);

				certificateOfQuanlityConformity.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				certificateOfQuanlityConformity.setModelCode(vehicleGroup.getModelCode());
				certificateOfQuanlityConformity.setModelType(vehicleGroup.getCommercialName());
 
				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					certificateOfQuanlityConformity.setProductionCountry(productionCountry);
				}

				certificateOfQuanlityConformity.setProductionYear(vehicleRecord.getProductionYear());
				certificateOfQuanlityConformity.setRegisteredNumber(registeredInspection.getRegisteredNumber());
				List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
						.findByCertificateRecordId(certificateRecord.getId());
				if (certificateRecordSpecs != null && certificateRecordSpecs.size() > 0) {
					int sizeCertificateRecordSpec = certificateRecordSpecs.size();
//					//_log.info("certificateRecordSpecs  " + certificateRecordSpecs);
					vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList();
					for (int k = 0; k < sizeCertificateRecordSpec; k++) {
						CertificateRecordSpec certificateRecordSpec = certificateRecordSpecs.get(k);
						if (certificateRecordSpec.getSpecificationValue() != null
								&& certificateRecordSpec.getSpecificationValue().length() > 0) {

							vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem();
							specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
							String specificationName = certificateRecordSpec.getSpecificationName();
							if (specificationName == null || specificationName.length() == 0) {
								specificationName = "specificationName";
							}
							specItem.setSpecificationName(specificationName);
							if (gui == Constants.CO_GUI&&certificateRecordSpec.getSpecificationValue()!=null&&certificateRecordSpec.getSpecificationValue().length()>0) {
								specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
								
								specificationList.getSpecItem().add(specItem);
							}else if (gui == Constants.KO_GUI){
								specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
								specItem.setDeclarationValue2("");
								specItem.setDeclarationValue3("");
								specItem.setDeclarationValue4("");
								specItem.setDeclarationValue5("");
								specItem.setDeclarationValue6("");
								specificationList.getSpecItem().add(specItem);
							}
							// certificateOfQuanlityConformity.setSpecificationList(specificationList);
						}
						// certificateOfQuanlityConformity.getSpecificationList().getSpecItem().add(specItem);
					}

					if (specificationList.getSpecItem() != null && specificationList.getSpecItem().size() > 0) {
						certificateOfQuanlityConformity.setSpecificationList(specificationList);
					}

				}

				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {
					int sizeCount = circulars.size();
					List<vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Circular> circularList = new ArrayList<CertificateOfQuanlityConformity.Circular>();
					for (int j = 0; j < sizeCount; j++) {
						CertificateCircular certificateCircular = circulars.get(j);
						vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Circular circular = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Circular();
						circular.setCircularDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
						circular.setCircularNo(certificateCircular.getCircularNo());
						circular.setSequenceNo((new Long(certificateCircular.getSequenceNo())).intValue());
						circularList.add(circular);
						// certificateOfQuanlityConformity.getCircular().add(circular);
					}
					if (circularList.size() > 0) {
						certificateOfQuanlityConformity.getCircular().addAll(circularList);
					}

				}
//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						certificateOfQuanlityConformity.getCustomDeclaration().add(declaration);
					}
				}

				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
				if (copReport != null) {
					vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.COPReport();
					cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
					cpReport.setCOPReportNumber(copReport.getReportNumber());
					certificateOfQuanlityConformity.getCOPReport().add(cpReport);
				}
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				if (emissionTestReport != null) {
					vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.EmissionTestReport();
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					certificateOfQuanlityConformity.getEmissionTestReport().add(emissionTestReport2);
				}

				certificateOfQuanlityConformity.setTradeMark(vehicleGroup.getTradeMark());
				certificateOfQuanlityConformity.setVehicleType(vehicleGroup.getVehicleType());
				certificateOfQuanlityConformity.setRemarks(certificateRecord.getRemarks());

				//TODO
				if(vehicleGroup != null && vehicleGroup.getVehicleClass() != null && (vehicleGroup.getVehicleClass().equalsIgnoreCase("XDD") || vehicleGroup.getVehicleClass().equalsIgnoreCase("DCX"))){
					List<VehicleRecord> lstRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						if(lstRecords != null && lstRecords.size() >0){
							List<vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ImportedVehicle> lstImportedVehicles = new ArrayList<vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ImportedVehicle>();
							for(VehicleRecord record : lstRecords){
								vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ImportedVehicle();
								importedVehicle.setSequenceNo(record.getSequenceNo());
								importedVehicle.setCodeNumber(record.getCodeNumber());
								importedVehicle.setProductionYear(record.getProductionYear());
								importedVehicle.setChassisNumber(record.getChassisNumber());
								importedVehicle.setEngineNumber(record.getEngineNumber());
								importedVehicle.setVehicleEngineStatus(ConvertUtil.convertToInt(record.getVehicleEngineStatus()));
								
								lstImportedVehicles.add(importedVehicle);
							}
							certificateOfQuanlityConformity.getImportedVehicle().addAll(lstImportedVehicles);
						}
					}
				
				if (gui == Constants.CO_GUI) {
					List<vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.AttachedFile> attachedFiles = new ArrayList<vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.AttachedFile>();

					vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.AttachedFile attachedFilePDFKy = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.AttachedFile();
					TthcNoidungHoSo noidungHoSo = TthcNoidungHoSoLocalServiceUtil
							.fetchTthcNoidungHoSo(certificateRecord.getAttachedFile());
					long kySoId = noidungHoSo.getTaiLieuDinhKem();
					if (kySoId > 0) {
						attachedFilePDFKy.setAttachedTypeCode("211");
						attachedFilePDFKy.setAttachedTypeName("MAU_FILE_KY");
						attachedFilePDFKy.setAttachedDocName("MAU_FILE_KY");
						attachedFilePDFKy.setAttachedNote("MAU_FILE_KY");
						attachedFilePDFKy.setAttachedSequenceNo(3);
						//attachedFilePDFKy.setBase64FileContent(FileUtils.getBase64FileContent1(kySoId));
						attachedFilePDFKy.setFileURL(FileUtils.getFullFileURL(kySoId));
						attachedFilePDFKy.setFullFileName(FileUtils.getNameByFileEntryId(kySoId));

						attachedFiles.add(attachedFilePDFKy);
					}
					
					// Sonvh bosung 22/09/2016
					long idTBTCGD = vehicleRecord.getControlRequirementId();
					long idKQTCGD = 0;
					if (idTBTCGD >0)
					{
						ControlReport controlRequirementResult = null;
						controlRequirementResult = ControlReportLocalServiceUtil.findByInspectionrecordId(inspectionRecord.getId());
						if ((controlRequirementResult !=null) && (controlRequirementResult.getAttachedFile() > 0))
						{
							TthcNoidungHoSo noidungHoSo_TCGD = TthcNoidungHoSoLocalServiceUtil						
								.fetchTthcNoidungHoSo(controlRequirementResult.getAttachedFile());
							
							idKQTCGD = noidungHoSo_TCGD.getTaiLieuDinhKem();
						}
						vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.AttachedFile attachedFilePDF_TCGD = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.AttachedFile();
						if (idKQTCGD > 0) {
							attachedFilePDF_TCGD.setAttachedTypeCode("204");
							attachedFilePDF_TCGD.setAttachedTypeName("MAU_FILE_KY");
							attachedFilePDF_TCGD.setAttachedDocName("MAU_FILE_KY");
							attachedFilePDF_TCGD.setAttachedNote("MAU_FILE_KY");
							attachedFilePDF_TCGD.setAttachedSequenceNo(3);
							//attachedFilePDF_TCGD.setBase64FileContent("");
							attachedFilePDF_TCGD.setFileURL(FileUtils.getFullFileURL(idKQTCGD));
							attachedFilePDF_TCGD.setFullFileName(FileUtils.getNameByFileEntryId(idKQTCGD));
							attachedFiles.add(attachedFilePDF_TCGD);
						}
						_log.info("============attachedFiles.size() 204==========="
						+ attachedFiles.size());
					}
					// END

					if (attachedFiles != null && attachedFiles.size() > 0) {
						certificateOfQuanlityConformity.getAttachedFile().addAll(attachedFiles);
					}

				}
				if (gui == Constants.CO_GUI) {
					certificateOfQuanlityConformity.setVehicleColor(null);
					String messageId= functionNghiepVu.getRamdomMessage();
					
					messgaeFunctions.insertKeHoachChuyenDich(null,null, "dieuKienChuyenDich", certificateRecord.getId()+"",messageId,debitNoteNumber ,"30","211");
					if(transactionId !=null&&transactionId.length()>0){
//						_log.info("transactionId !=null&&transactionId.length()>");
						callWebserviceNSWBusiness.message211va30WithHeader(hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
								Constants.VERSION_START, certificateOfQuanlityConformity,transactionId);
					}else{
						_log.info("transactionId !=null&&transactionId.length()>2");
						callWebserviceNSWBusiness.message211va30(userId + "", hoSoThuTuc,
								messageId, Constants.VERSION_START,
								certificateOfQuanlityConformity);
						
					}
				}
			}
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
		return certificateOfQuanlityConformity;
	}

	public NoticeOfExemptionFromInspection guiThongBaoMien(TthcHoSoThuTuc hoSoThuTuc, long userId,
			VehicleRecord vehicleRecord, RegisteredInspection registeredInspection,
			CertificateRecord certificateRecord, VehicleGroup vehicleGroup, int gui, 
			String soChungChiCu, String ngayChungChiCu,String debitNoteNumber, String transactionId) {
		NoticeOfExemptionFromInspection noticeOfExemptionFromInspection = new NoticeOfExemptionFromInspection();
		try {
			_log.info("guiThongBaoMien cogui  ");
			long kq = 1;
			if (kq > 0) {

				// MessageType= 212
				// MessageFunction= 30
				// Update VR_CERTIFICATERECORD
				if (gui == Constants.CO_GUI) {
					certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_1);
					CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
				}
				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());

				noticeOfExemptionFromInspection.setCertificateNumber(certificateRecord.getCertificateNumber());
				if(soChungChiCu != null && soChungChiCu.trim().length() > 0){
					noticeOfExemptionFromInspection.setPreviousCertificateNumber(soChungChiCu);
					noticeOfExemptionFromInspection.setPreviousSignDate(ngayChungChiCu);
				}
				noticeOfExemptionFromInspection.setChassisNumber(vehicleRecord.getChassisNumber());
				noticeOfExemptionFromInspection.setCodeNumber(vehicleRecord.getCodeNumber());
				noticeOfExemptionFromInspection.setEngineNumber(vehicleRecord.getEngineNumber());
				noticeOfExemptionFromInspection.setEngineType(vehicleGroup.getEngineType());
				noticeOfExemptionFromInspection.setVehicleEngineStatus(Integer.parseInt(vehicleRecord
						.getVehicleEngineStatus()));
//				noticeOfExemptionFromInspection.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Importer importer = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				noticeOfExemptionFromInspection.setImporter(importer);

				noticeOfExemptionFromInspection.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				noticeOfExemptionFromInspection.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				noticeOfExemptionFromInspection.setInspectionSite(inspectionRecord.getInspectionSite());

				vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.InspectorSign();

				inspectorSign.setSignDate(FormatData.parseDateToTring(certificateRecord.getSignDate()));
				inspectorSign.setSignName(certificateRecord.getSignName());
				inspectorSign.setSignPlace(certificateRecord.getSignPlace());
				inspectorSign.setSignTitle(certificateRecord.getSignTitle());
				inspectorSign.setDivision(certificateRecord.getDivision());
				inspectorSign.setOrganization(certificateRecord.getOrganization());
				
//				inspectorSign.setSignDate(FormatData.parseDateToTring(certificateRecord.getSignDate()));
//				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
//						.fetchByInspectorId(userId);
//				inspectorSign.setSignName(corporationInspector.getInspectorName());
//				inspectorSign.setSignPlace(corporationInspector.getPlace());
//				inspectorSign.setSignTitle(corporationInspector.getTitle());
//				inspectorSign.setDivision(certificateRecord.getDivision());
//				inspectorSign.setOrganization(certificateRecord.getOrganization());

				noticeOfExemptionFromInspection.setInspectorSign(inspectorSign);

				noticeOfExemptionFromInspection.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				noticeOfExemptionFromInspection.setModelCode(vehicleGroup.getModelCode());
				noticeOfExemptionFromInspection.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					noticeOfExemptionFromInspection.setProductionCountry(productionCountry);
				}

				noticeOfExemptionFromInspection.setProductionYear(vehicleRecord.getProductionYear());
				noticeOfExemptionFromInspection.setRegisteredNumber(registeredInspection.getRegisteredNumber());
				List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
						.findByCertificateRecordId(certificateRecord.getId());
				if (certificateRecordSpecs != null && certificateRecordSpecs.size() > 0) {
					int sizeCertificateRecordSpec = certificateRecordSpecs.size();
					// vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList
					// specificationList = new
					// vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList();
					List<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem> spectSpecItems = new ArrayList<NoticeOfExemptionFromInspection.SpecificationList.SpecItem>();
					for (int k = 0; k < sizeCertificateRecordSpec; k++) {
						CertificateRecordSpec certificateRecordSpec = certificateRecordSpecs.get(k);
						vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem();
						specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
						String specificationName = certificateRecordSpec.getSpecificationName();
						if (specificationName == null || specificationName.length() == 0) {
							specificationName = "specificationName";
						}
						specItem.setSpecificationName(specificationName);
//						_log.info("certificateRecordSpec.getSpecificationValue()  "+certificateRecordSpec.getSpecificationValue());
						if (gui == Constants.CO_GUI&&certificateRecordSpec.getSpecificationValue()!=null&&certificateRecordSpec.getSpecificationValue().length()>0) {
							specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
							spectSpecItems.add(specItem);
						}else if (gui == Constants.KO_GUI){
							specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
							specItem.setDeclarationValue2("");
							specItem.setDeclarationValue3("");
							specItem.setDeclarationValue4("");
							specItem.setDeclarationValue5("");
							specItem.setDeclarationValue6("");
							spectSpecItems.add(specItem);
						}
						// noticeOfExemptionFromInspection.getSpecificationList().getSpecItem().add(specItem);
					}
					if (spectSpecItems != null && spectSpecItems.size() > 0) {
						vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList();
						specificationList.getSpecItem().addAll(spectSpecItems);
						noticeOfExemptionFromInspection.setSpecificationList(specificationList);
					}

				}

				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {
					int sizeCount = circulars.size();
					List<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Circular> circularliList = new ArrayList<NoticeOfExemptionFromInspection.Circular>();
					for (int j = 0; j < sizeCount; j++) {
						CertificateCircular certificateCircular = circulars.get(j);
						vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Circular circular = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Circular();
						circular.setCircularDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
						circular.setCircularNo(certificateCircular.getCircularNo());
						circular.setSequenceNo((new Long(certificateCircular.getSequenceNo())).intValue());
						circularliList.add(circular);
						// noticeOfExemptionFromInspection.getCircular().add(circular);
					}
					if (circularliList.size() > 0) {
						noticeOfExemptionFromInspection.getCircular().addAll(circularliList);
					}

				}
//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						noticeOfExemptionFromInspection.getCustomDeclaration().add(declaration);
					}
				}

				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
				if (copReport != null) {
					vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.COPReport();
					cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
					cpReport.setCOPReportNumber(copReport.getReportNumber());
					noticeOfExemptionFromInspection.getCOPReport().add(cpReport);
				}
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				if (emissionTestReport != null) {
					vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.EmissionTestReport();
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					noticeOfExemptionFromInspection.getEmissionTestReport().add(emissionTestReport2);
				}

				noticeOfExemptionFromInspection.setTradeMark(vehicleGroup.getTradeMark());
				noticeOfExemptionFromInspection.setVehicleType(vehicleGroup.getVehicleType());
				noticeOfExemptionFromInspection.setRemarks(certificateRecord.getRemarks());

				//TODO
				if(vehicleGroup != null && vehicleGroup.getVehicleClass() != null && (vehicleGroup.getVehicleClass().equalsIgnoreCase("XDD") || vehicleGroup.getVehicleClass().equalsIgnoreCase("DCX"))){
					List<VehicleRecord> lstRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						if(lstRecords != null && lstRecords.size() >0){
							List<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ImportedVehicle> lstImportedVehicles = new ArrayList<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ImportedVehicle>();
							for(VehicleRecord record : lstRecords){
								vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ImportedVehicle();
								importedVehicle.setSequenceNo(record.getSequenceNo());
								importedVehicle.setCodeNumber(record.getCodeNumber());
								importedVehicle.setProductionYear(record.getProductionYear());
								importedVehicle.setChassisNumber(record.getChassisNumber());
								importedVehicle.setEngineNumber(record.getEngineNumber());
								importedVehicle.setVehicleEngineStatus(ConvertUtil.convertToInt(record.getVehicleEngineStatus()));
								
								lstImportedVehicles.add(importedVehicle);
							}
							noticeOfExemptionFromInspection.getImportedVehicle().addAll(lstImportedVehicles);
						}
					}
				
				if (gui == Constants.CO_GUI) {
					List<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.AttachedFile> attachedFiles = new ArrayList<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.AttachedFile>();


					vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.AttachedFile attachedFilePDFKy = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.AttachedFile();
					TthcNoidungHoSo noidungHoSo = TthcNoidungHoSoLocalServiceUtil
							.fetchTthcNoidungHoSo(certificateRecord.getAttachedFile());
					long kySoId = noidungHoSo.getTaiLieuDinhKem();
					if (kySoId > 0) {
//						String urlFilePDFKy = getHost(actionRequest)
//								+ DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(kySoId);
						//_log.info("--------kySoId-----" + kySoId);
						attachedFilePDFKy.setAttachedTypeCode("212");
						attachedFilePDFKy.setAttachedTypeName("MAU_FILE_KY");
						attachedFilePDFKy.setAttachedDocName("MAU_FILE_KY");
						attachedFilePDFKy.setAttachedNote("MAU_FILE_KY");
						attachedFilePDFKy.setAttachedSequenceNo(3);
						//attachedFilePDFKy.setBase64FileContent(FileUtils.getBase64FileContent1(kySoId));
						attachedFilePDFKy.setFileURL(FileUtils.getFullFileURL(kySoId));
						attachedFilePDFKy.setFullFileName(FileUtils.getNameByFileEntryId(kySoId));

						attachedFiles.add(attachedFilePDFKy);
					}
					
					// Sonvh bosung 22/09/2016
					long idTBTCGD = vehicleRecord.getControlRequirementId();
					long idKQTCGD = 0;
					if (idTBTCGD >0)
					{
						ControlReport controlRequirementResult = null;
						controlRequirementResult = ControlReportLocalServiceUtil.findByInspectionrecordId(inspectionRecord.getId());
						if ((controlRequirementResult !=null) && (controlRequirementResult.getAttachedFile() > 0))
						{
							TthcNoidungHoSo noidungHoSo_TCGD = TthcNoidungHoSoLocalServiceUtil						
								.fetchTthcNoidungHoSo(controlRequirementResult.getAttachedFile());
							
							idKQTCGD = noidungHoSo_TCGD.getTaiLieuDinhKem();
						}
						vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.AttachedFile attachedFilePDF_TCGD = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.AttachedFile();
						if (idKQTCGD > 0) {
							attachedFilePDF_TCGD.setAttachedTypeCode("204");
							attachedFilePDF_TCGD.setAttachedTypeName("MAU_FILE_KY");
							attachedFilePDF_TCGD.setAttachedDocName("MAU_FILE_KY");
							attachedFilePDF_TCGD.setAttachedNote("MAU_FILE_KY");
							attachedFilePDF_TCGD.setAttachedSequenceNo(3);
							//attachedFilePDF_TCGD.setBase64FileContent("");
							attachedFilePDF_TCGD.setFileURL(FileUtils.getFullFileURL(idKQTCGD));
							attachedFilePDF_TCGD.setFullFileName(FileUtils.getNameByFileEntryId(idKQTCGD));
							attachedFiles.add(attachedFilePDF_TCGD);
						}
						_log.info("============attachedFiles.size() 204==========="
						+ attachedFiles.size());
					}

					if (attachedFiles != null && attachedFiles.size() > 0) {
						noticeOfExemptionFromInspection.getAttachedFile().addAll(attachedFiles);
					}
				}

				if (gui == Constants.CO_GUI) {
					String messageId= functionNghiepVu.getRamdomMessage();
					if(transactionId !=null&&transactionId.length()>0){
						callWebserviceNSWBusiness.message212va30WithHeader(hoSoThuTuc, messageId, Constants.VERSION_START, noticeOfExemptionFromInspection, transactionId);
						
					}else{
					messgaeFunctions.insertKeHoachChuyenDich(null,null, "dieuKienChuyenDich", certificateRecord.getId()+"s",messageId ,debitNoteNumber,"30","212" );
					callWebserviceNSWBusiness.message212va30(userId + "", hoSoThuTuc,
							messageId, Constants.VERSION_START,
							noticeOfExemptionFromInspection);
					}
				}

			}
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
		return noticeOfExemptionFromInspection;
	}

	public NoticeOfExemptionFromInspection guiThongBaoMien(TthcHoSoThuTuc hoSoThuTuc, long userId,
			VehicleRecord vehicleRecord, RegisteredInspection registeredInspection, DraftCertificate certificateRecord,
			VehicleGroup vehicleGroup,InspectionRecord inspectionRecord,List<DraftCertificateSpec> draftCertificateSpecs) {
		NoticeOfExemptionFromInspection noticeOfExemptionFromInspection = new NoticeOfExemptionFromInspection();
		try {

			long kq = 1;
			if (kq > 0) {

				// MessageType= 212
				// MessageFunction= 30
				// Update VR_CERTIFICATERECORD


				noticeOfExemptionFromInspection.setCertificateNumber("DRAFT");
				noticeOfExemptionFromInspection.setChassisNumber(vehicleRecord.getChassisNumber());
				noticeOfExemptionFromInspection.setCodeNumber(vehicleRecord.getCodeNumber());
				noticeOfExemptionFromInspection.setEngineNumber(vehicleRecord.getEngineNumber());
				noticeOfExemptionFromInspection.setEngineType(vehicleGroup.getEngineType());
				noticeOfExemptionFromInspection.setVehicleEngineStatus(Integer.parseInt(vehicleRecord
						.getVehicleEngineStatus()));
//				noticeOfExemptionFromInspection.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Importer importer = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				noticeOfExemptionFromInspection.setImporter(importer);

				noticeOfExemptionFromInspection.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				noticeOfExemptionFromInspection.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				noticeOfExemptionFromInspection.setInspectionSite(inspectionRecord.getInspectionSite());

				noticeOfExemptionFromInspection.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				noticeOfExemptionFromInspection.setModelCode(vehicleGroup.getModelCode());
				noticeOfExemptionFromInspection.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					noticeOfExemptionFromInspection.setProductionCountry(productionCountry);
				}

				noticeOfExemptionFromInspection.setProductionYear(vehicleRecord.getProductionYear());
				noticeOfExemptionFromInspection.setRegisteredNumber(registeredInspection.getRegisteredNumber());
				if(draftCertificateSpecs==null){
					List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
							.findByCertificateRecordId(certificateRecord.getId());
					if (certificateRecordSpecs != null && certificateRecordSpecs.size() > 0) {
						int sizeCertificateRecordSpec = certificateRecordSpecs.size();
						// vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList
						// specificationList = new
						// vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList();
						List<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem> specItemList = new ArrayList<NoticeOfExemptionFromInspection.SpecificationList.SpecItem>();
						for (int k = 0; k < sizeCertificateRecordSpec; k++) {
							CertificateRecordSpec certificateRecordSpec = certificateRecordSpecs.get(k);
							vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem();
							specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
							String specificationName = certificateRecordSpec.getSpecificationName();
							if (specificationName == null || specificationName.length() == 0) {
								specificationName = "specificationName";
							}
							specItem.setSpecificationName(specificationName);
							specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
							specItem.setDeclarationValue2("");
							specItem.setDeclarationValue3("");
							specItem.setDeclarationValue4("");
							specItem.setDeclarationValue5("");
							specItem.setDeclarationValue6("");
							specItemList.add(specItem);
							// noticeOfExemptionFromInspection.getSpecificationList().getSpecItem().add(specItem);
						}
						if (specItemList != null && specItemList.size() > 0) {
							specItemList.addAll(specItemList);
							vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList();
							specificationList.getSpecItem().addAll(specItemList);
							noticeOfExemptionFromInspection.setSpecificationList(specificationList);
						}
	
					}
				}else{
					
					if (draftCertificateSpecs != null && draftCertificateSpecs.size() > 0) {
						int sizeCertificateRecordSpec = draftCertificateSpecs.size();
						List<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem> specItemList = new ArrayList<NoticeOfExemptionFromInspection.SpecificationList.SpecItem>();
						for (int k = 0; k < sizeCertificateRecordSpec; k++) {
							DraftCertificateSpec certificateRecordSpec = draftCertificateSpecs.get(k);
							vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem();
							specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
							String specificationName = certificateRecordSpec.getSpecificationName();
							if (specificationName == null || specificationName.length() == 0) {
								specificationName = "specificationName";
							}
							specItem.setSpecificationName(specificationName);
							specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
							specItem.setDeclarationValue2("");
							specItem.setDeclarationValue3("");
							specItem.setDeclarationValue4("");
							specItem.setDeclarationValue5("");
							specItem.setDeclarationValue6("");
							specItemList.add(specItem);
							// noticeOfExemptionFromInspection.getSpecificationList().getSpecItem().add(specItem);
						}
						if (specItemList != null && specItemList.size() > 0) {
							specItemList.addAll(specItemList);
							vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList();
							specificationList.getSpecItem().addAll(specItemList);
							noticeOfExemptionFromInspection.setSpecificationList(specificationList);
						}
	
					}
					
				}
				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {
					int sizeCount = circulars.size();
					List<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Circular> circularList = new ArrayList<NoticeOfExemptionFromInspection.Circular>();
					for (int j = 0; j < sizeCount; j++) {
						CertificateCircular certificateCircular = circulars.get(j);
						vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Circular circular = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Circular();
						circular.setCircularDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
						circular.setCircularNo(certificateCircular.getCircularNo());
						circular.setSequenceNo((new Long(certificateCircular.getSequenceNo())).intValue());
						circularList.add(circular);

					}
					if (circularList.size() > 0) {
						noticeOfExemptionFromInspection.getCircular().addAll(circularList);
					}
				}
//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						noticeOfExemptionFromInspection.getCustomDeclaration().add(declaration);
					}
				}

				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
				if (copReport != null) {
					vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.COPReport();
					cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
					cpReport.setCOPReportNumber(copReport.getReportNumber());
					noticeOfExemptionFromInspection.getCOPReport().add(cpReport);
				}
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				if (emissionTestReport != null) {
					vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.EmissionTestReport();
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					noticeOfExemptionFromInspection.getEmissionTestReport().add(emissionTestReport2);
				}

				noticeOfExemptionFromInspection.setTradeMark(vehicleGroup.getTradeMark());
				noticeOfExemptionFromInspection.setVehicleType(vehicleGroup.getVehicleType());
				noticeOfExemptionFromInspection.setRemarks(certificateRecord.getRemarks());

				//TODO
				if(vehicleGroup != null && vehicleGroup.getVehicleClass() != null && (vehicleGroup.getVehicleClass().equalsIgnoreCase("XDD") || vehicleGroup.getVehicleClass().equalsIgnoreCase("DCX"))){
					List<VehicleRecord> lstRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						if(lstRecords != null && lstRecords.size() >0){
							List<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ImportedVehicle> lstImportedVehicles = new ArrayList<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ImportedVehicle>();
							for(VehicleRecord record : lstRecords){
								vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ImportedVehicle();
								importedVehicle.setSequenceNo(record.getSequenceNo());
								importedVehicle.setCodeNumber(record.getCodeNumber());
								importedVehicle.setProductionYear(record.getProductionYear());
								importedVehicle.setChassisNumber(record.getChassisNumber());
								importedVehicle.setEngineNumber(record.getEngineNumber());
								importedVehicle.setVehicleEngineStatus(ConvertUtil.convertToInt(record.getVehicleEngineStatus()));
								
								lstImportedVehicles.add(importedVehicle);
							}
							noticeOfExemptionFromInspection.getImportedVehicle().addAll(lstImportedVehicles);
						}
					}
				
			}
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
		return noticeOfExemptionFromInspection;
	}

	public ConfirmationStatusOfQuanlityConformity guiThongBaoXacNhanTinhTrang(TthcHoSoThuTuc hoSoThuTuc, long userId,
			VehicleRecord vehicleRecord, RegisteredInspection registeredInspection,
			CertificateRecord certificateRecord, VehicleGroup vehicleGroup, int gui, 
			String soChungChiCu, String ngayChungChiCu,String debitnoteNumber, String transactionID) {
		ConfirmationStatusOfQuanlityConformity confirmationStatusOfQuanlityConformity = new ConfirmationStatusOfQuanlityConformity();
		try {
//			//_log.info("guiThongBaoXacNhanTinhTrang   ");
			long kq = 1;
			// MessageType= 216
			// MessageFunction= 30
			// Update VR_CERTIFICATERECORD
			if (kq > 0) {
				if (gui == Constants.CO_GUI) {					
					certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_1);
					CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
				}
				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());

				confirmationStatusOfQuanlityConformity.setCertificateNumber(certificateRecord.getCertificateNumber());
				if(soChungChiCu != null && soChungChiCu.trim().length() > 0){
					confirmationStatusOfQuanlityConformity.setPreviousCertificateNumber(soChungChiCu);
					confirmationStatusOfQuanlityConformity.setPreviousSignDate(ngayChungChiCu);
				}
				confirmationStatusOfQuanlityConformity.setChassisNumber(vehicleRecord.getChassisNumber());
				confirmationStatusOfQuanlityConformity.setCodeNumber(vehicleRecord.getCodeNumber());
				confirmationStatusOfQuanlityConformity.setEngineNumber(vehicleRecord.getEngineNumber());
				confirmationStatusOfQuanlityConformity.setEngineType(vehicleGroup.getEngineType());
				confirmationStatusOfQuanlityConformity.setVehicleEngineStatus(Integer.parseInt(vehicleRecord
						.getVehicleEngineStatus()));
				//
				vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Importer importer = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				confirmationStatusOfQuanlityConformity.setImporter(importer);

				confirmationStatusOfQuanlityConformity.setInspectionRecordDate(FormatData
						.parseDateToTring(inspectionRecord.getInspectionRecordDate()));
				confirmationStatusOfQuanlityConformity.setInspectionRecordNumber(inspectionRecord
						.getInspectionRecordNo());
				confirmationStatusOfQuanlityConformity.setInspectionSite(inspectionRecord.getInspectionSite());

				vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.InspectorSign();

				inspectorSign.setSignDate(FormatData.parseDateToTring(certificateRecord.getSignDate()));
				inspectorSign.setSignName(certificateRecord.getSignName());
				inspectorSign.setSignPlace(certificateRecord.getSignPlace());
				inspectorSign.setSignTitle(certificateRecord.getSignTitle());
				inspectorSign.setDivision(certificateRecord.getDivision());
				inspectorSign.setOrganization(certificateRecord.getOrganization());

				confirmationStatusOfQuanlityConformity.setInspectorSign(inspectorSign);

				confirmationStatusOfQuanlityConformity.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				confirmationStatusOfQuanlityConformity.setModelCode(vehicleGroup.getModelCode());
				confirmationStatusOfQuanlityConformity.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					confirmationStatusOfQuanlityConformity.setProductionCountry(productionCountry);
				}

				confirmationStatusOfQuanlityConformity.setProductionYear(vehicleRecord.getProductionYear());
				confirmationStatusOfQuanlityConformity.setRegisteredNumber(registeredInspection.getRegisteredNumber());
				List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
						.findByCertificateRecordId(certificateRecord.getId());
				if (certificateRecordSpecs != null && certificateRecordSpecs.size() > 0) {
					int sizeCertificateRecordSpec = certificateRecordSpecs.size();
					List<vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem> specItems = new ArrayList<ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem>();
					for (int k = 0; k < sizeCertificateRecordSpec; k++) {
						CertificateRecordSpec certificateRecordSpec = certificateRecordSpecs.get(k);
						vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem();
						specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
						String specificationName = certificateRecordSpec.getSpecificationName();
						if (specificationName == null || specificationName.length() == 0) {
							specificationName = "specificationName";
						}
						specItem.setSpecificationName(specificationName);
						if (gui == Constants.CO_GUI&&certificateRecordSpec.getSpecificationValue()!=null&&certificateRecordSpec.getSpecificationValue().length()>0) {
							specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());							
							specItems.add(specItem);
						}else if (gui == Constants.KO_GUI){
							specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
							specItem.setDeclarationValue2("");
							specItem.setDeclarationValue3("");
							specItem.setDeclarationValue4("");
							specItem.setDeclarationValue5("");
							specItem.setDeclarationValue6("");
							specItems.add(specItem);
						}
						// confirmationStatusOfQuanlityConformity.getSpecificationList().getSpecItem().add(specItem);
					}
					if (specItems != null && specItems.size() > 0) {
						vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList();
						specificationList.getSpecItem().addAll(specItems);
						confirmationStatusOfQuanlityConformity.setSpecificationList(specificationList);
					}
				}

				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {
					int sizeCount = circulars.size();
					List<vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Circular> circularList = new ArrayList<ConfirmationStatusOfQuanlityConformity.Circular>();
					for (int j = 0; j < sizeCount; j++) {
						CertificateCircular certificateCircular = circulars.get(j);
						vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Circular circular = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Circular();
						circular.setCircularDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
						circular.setCircularNo(certificateCircular.getCircularNo());
						circular.setSequenceNo((new Long(certificateCircular.getSequenceNo())).intValue());
						circularList.add(circular);
						// confirmationStatusOfQuanlityConformity.getCircular().add(circular);
					}
					if (circularList.size() > 0) {
						confirmationStatusOfQuanlityConformity.getCircular().addAll(circularList);
					}

				}
//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						confirmationStatusOfQuanlityConformity.getCustomDeclaration().add(declaration);
					}
				}

				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
				if (copReport != null) {
					vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.COPReport();
					cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
					cpReport.setCOPReportNumber(copReport.getReportNumber());
					confirmationStatusOfQuanlityConformity.getCOPReport().add(cpReport);
				}
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				if (emissionTestReport != null) {
					vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.EmissionTestReport();
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					confirmationStatusOfQuanlityConformity.getEmissionTestReport().add(emissionTestReport2);
				}

				confirmationStatusOfQuanlityConformity.setTradeMark(vehicleGroup.getTradeMark());
				confirmationStatusOfQuanlityConformity.setVehicleType(vehicleGroup.getVehicleType());
				confirmationStatusOfQuanlityConformity.setRemarks(certificateRecord.getRemarks());

				if (gui == Constants.CO_GUI) {
					List<vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.AttachedFile> attachedFiles = new ArrayList<vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.AttachedFile>();
					vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.AttachedFile attachedFilePDFKy = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.AttachedFile();
					TthcNoidungHoSo noidungHoSo = TthcNoidungHoSoLocalServiceUtil
							.fetchTthcNoidungHoSo(certificateRecord.getAttachedFile());
					long kySoId = noidungHoSo.getTaiLieuDinhKem();
					if (kySoId > 0) {
						attachedFilePDFKy.setAttachedTypeCode("216");
						attachedFilePDFKy.setAttachedTypeName("MAU_FILE_KY");
						attachedFilePDFKy.setAttachedDocName("MAU_FILE_KY");
						attachedFilePDFKy.setAttachedNote("MAU_FILE_KY");
						attachedFilePDFKy.setAttachedSequenceNo(3);
						//attachedFilePDFKy.setBase64FileContent(FileUtils.getBase64FileContent1(kySoId));
						attachedFilePDFKy.setFileURL(FileUtils.getFullFileURL(kySoId));
						attachedFilePDFKy.setFullFileName(FileUtils.getNameByFileEntryId(kySoId));

						attachedFiles.add(attachedFilePDFKy);
					}

					// Sonvh bosung 22/09/2016
					long idTBTCGD = vehicleRecord.getControlRequirementId();
					long idKQTCGD = 0;
					if (idTBTCGD >0)
					{
						ControlReport controlRequirementResult = null;
						controlRequirementResult = ControlReportLocalServiceUtil.findByInspectionrecordId(inspectionRecord.getId());
						if ((controlRequirementResult !=null) && (controlRequirementResult.getAttachedFile() > 0))
						{
							TthcNoidungHoSo noidungHoSo_TCGD = TthcNoidungHoSoLocalServiceUtil						
								.fetchTthcNoidungHoSo(controlRequirementResult.getAttachedFile());
							
							idKQTCGD = noidungHoSo_TCGD.getTaiLieuDinhKem();
						}
						vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.AttachedFile attachedFilePDF_TCGD = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.AttachedFile();
						if (idKQTCGD > 0) {
							attachedFilePDF_TCGD.setAttachedTypeCode("204");
							attachedFilePDF_TCGD.setAttachedTypeName("MAU_FILE_KY");
							attachedFilePDF_TCGD.setAttachedDocName("MAU_FILE_KY");
							attachedFilePDF_TCGD.setAttachedNote("MAU_FILE_KY");
							attachedFilePDF_TCGD.setAttachedSequenceNo(3);
							//attachedFilePDF_TCGD.setBase64FileContent("");
							attachedFilePDF_TCGD.setFileURL(FileUtils.getFullFileURL(idKQTCGD));
							attachedFilePDF_TCGD.setFullFileName(FileUtils.getNameByFileEntryId(idKQTCGD));
							attachedFiles.add(attachedFilePDF_TCGD);
						}
						_log.info("============attachedFiles.size() 204==========="
						+ attachedFiles.size());
					}

					if (attachedFiles != null && attachedFiles.size() > 0) {
						confirmationStatusOfQuanlityConformity.getAttachedFile().addAll(attachedFiles);
					}
				}

				if (gui == Constants.CO_GUI) {
					String messageId= functionNghiepVu.getRamdomMessage();
					if(transactionID !=null&&transactionID.length()>0){
						callWebserviceNSWBusiness.message216va30WithHeader(hoSoThuTuc, messageId, Constants.VERSION_START, confirmationStatusOfQuanlityConformity, transactionID);
					}else{
						messgaeFunctions.insertKeHoachChuyenDich(null,null, "dieuKienChuyenDich", certificateRecord.getId()+"",messageId ,debitnoteNumber ,"30","216");
						callWebserviceNSWBusiness.message216va30(userId + "", hoSoThuTuc,
								messageId, Constants.VERSION_START,
								confirmationStatusOfQuanlityConformity);
					}
				}

			}
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
		return confirmationStatusOfQuanlityConformity;
	}

	public ConfirmationStatusOfQuanlityConformity guiThongBaoXacNhanTinhTrang(TthcHoSoThuTuc hoSoThuTuc, long userId,
			VehicleRecord vehicleRecord, RegisteredInspection registeredInspection, DraftCertificate certificateRecord,
			VehicleGroup vehicleGroup,InspectionRecord inspectionRecord ,List<DraftCertificateSpec> draftCertificateSpecs) {
		ConfirmationStatusOfQuanlityConformity confirmationStatusOfQuanlityConformity = new ConfirmationStatusOfQuanlityConformity();
		try {

			long kq = 1;
			// MessageType= 216
			// MessageFunction= 30
			// Update VR_CERTIFICATERECORD
			if (kq > 0) {

//				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
//						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());

				confirmationStatusOfQuanlityConformity.setCertificateNumber("Draf");
				confirmationStatusOfQuanlityConformity.setChassisNumber(vehicleRecord.getChassisNumber());
				confirmationStatusOfQuanlityConformity.setCodeNumber(vehicleRecord.getCodeNumber());
				confirmationStatusOfQuanlityConformity.setEngineNumber(vehicleRecord.getEngineNumber());
				confirmationStatusOfQuanlityConformity.setEngineType(vehicleGroup.getEngineType());
				confirmationStatusOfQuanlityConformity.setVehicleEngineStatus(Integer.parseInt(vehicleRecord
						.getVehicleEngineStatus()));
//				confirmationStatusOfQuanlityConformity.setVehicleColor(vehicleRecord.getVehicleColor());
//				confirmationStatusOfQuanlityConformity.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Importer importer = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				confirmationStatusOfQuanlityConformity.setImporter(importer);

				confirmationStatusOfQuanlityConformity.setInspectionRecordDate(FormatData
						.parseDateToTring(inspectionRecord.getInspectionRecordDate()));
				confirmationStatusOfQuanlityConformity.setInspectionRecordNumber(inspectionRecord
						.getInspectionRecordNo());
				confirmationStatusOfQuanlityConformity.setInspectionSite(inspectionRecord.getInspectionSite());

				confirmationStatusOfQuanlityConformity.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				confirmationStatusOfQuanlityConformity.setModelCode(vehicleGroup.getModelCode());
				confirmationStatusOfQuanlityConformity.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					confirmationStatusOfQuanlityConformity.setProductionCountry(productionCountry);
				}

				confirmationStatusOfQuanlityConformity.setProductionYear(vehicleRecord.getProductionYear());
				confirmationStatusOfQuanlityConformity.setRegisteredNumber(registeredInspection.getRegisteredNumber());
				if(draftCertificateSpecs==null){
					List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
							.findByCertificateRecordId(certificateRecord.getId());
					if (certificateRecordSpecs != null && certificateRecordSpecs.size() > 0) {
						int sizeCertificateRecordSpec = certificateRecordSpecs.size();
						List<vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem> specItemslList = new ArrayList<ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem>();
						for (int k = 0; k < sizeCertificateRecordSpec; k++) {
							CertificateRecordSpec certificateRecordSpec = certificateRecordSpecs.get(k);
							vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem();
							specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
							String specificationName = certificateRecordSpec.getSpecificationName();
							if (specificationName == null || specificationName.length() == 0) {
								specificationName = "specificationName";
							}
							specItem.setSpecificationName(specificationName);
							specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
							specItem.setDeclarationValue2("");
							specItem.setDeclarationValue3("");
							specItem.setDeclarationValue4("");
							specItem.setDeclarationValue5("");
							specItem.setDeclarationValue6("");
							specItemslList.add(specItem);
							// confirmationStatusOfQuanlityConformity.getSpecificationList().getSpecItem().add(specItem);
						}
						if (specItemslList != null && specItemslList.size() > 0) {
							vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList();
							specificationList.getSpecItem().addAll(specItemslList);
							confirmationStatusOfQuanlityConformity.setSpecificationList(specificationList);
						}
					}
				}else{
//					List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
//							.findByCertificateRecordId(certificateRecord.getId());
					if (draftCertificateSpecs != null && draftCertificateSpecs.size() > 0) {
						int sizeCertificateRecordSpec = draftCertificateSpecs.size();
						List<vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem> specItemslList = new ArrayList<ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem>();
						for (int k = 0; k < sizeCertificateRecordSpec; k++) {
							 DraftCertificateSpec certificateRecordSpec = draftCertificateSpecs.get(k);
							vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem();
							specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
							String specificationName = certificateRecordSpec.getSpecificationName();
							if (specificationName == null || specificationName.length() == 0) {
								specificationName = "specificationName";
							}
							specItem.setSpecificationName(specificationName);
							specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
							specItem.setDeclarationValue2("");
							specItem.setDeclarationValue3("");
							specItem.setDeclarationValue4("");
							specItem.setDeclarationValue5("");
							specItem.setDeclarationValue6("");
							specItemslList.add(specItem);
							// confirmationStatusOfQuanlityConformity.getSpecificationList().getSpecItem().add(specItem);
						}
						if (specItemslList != null && specItemslList.size() > 0) {
							vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList();
							specificationList.getSpecItem().addAll(specItemslList);
							confirmationStatusOfQuanlityConformity.setSpecificationList(specificationList);
						}
					}
				}
				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {
					int sizeCount = circulars.size();
					List<vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Circular> circularlList = new ArrayList<ConfirmationStatusOfQuanlityConformity.Circular>();
					for (int j = 0; j < sizeCount; j++) {
						CertificateCircular certificateCircular = circulars.get(j);
						vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Circular circular = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Circular();
						circular.setCircularDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
						circular.setCircularNo(certificateCircular.getCircularNo());
						circular.setSequenceNo((new Long(certificateCircular.getSequenceNo())).intValue());
						circularlList.add(circular);
						// confirmationStatusOfQuanlityConformity.getCircular().add(circular);
					}
					if (circularlList.size() > 0) {
						confirmationStatusOfQuanlityConformity.getCircular().addAll(circularlList);
					}
				}
//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						confirmationStatusOfQuanlityConformity.getCustomDeclaration().add(declaration);
					}
				}

				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
				if (copReport != null) {
					vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.COPReport();
					cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
					cpReport.setCOPReportNumber(copReport.getReportNumber());
					confirmationStatusOfQuanlityConformity.getCOPReport().add(cpReport);
				}
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				if (emissionTestReport != null) {
					vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.EmissionTestReport();
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					confirmationStatusOfQuanlityConformity.getEmissionTestReport().add(emissionTestReport2);
				}

				confirmationStatusOfQuanlityConformity.setTradeMark(vehicleGroup.getTradeMark());
				confirmationStatusOfQuanlityConformity.setVehicleType(vehicleGroup.getVehicleType());
				confirmationStatusOfQuanlityConformity.setRemarks(certificateRecord.getRemarks());

			}
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
		return confirmationStatusOfQuanlityConformity;
	}

	public NoticeOfNonConformity guiThongBaoKhongDat(TthcHoSoThuTuc hoSoThuTuc, long userId,
			VehicleRecord vehicleRecord, RegisteredInspection registeredInspection,
			CertificateRecord certificateRecord, VehicleGroup vehicleGroup, int gui,
			String soChungChiCu, String ngayChungChiCu,String debitNoteNumber, String transactionID) {
		NoticeOfNonConformity noticeOfNonConformity = new NoticeOfNonConformity();
		try {

			long kq = 1;

			// MessageType= 213
			// MessageFunction= 30
			// Update VR_CERTIFICATERECORD
			if (kq > 0) {
				if (gui == Constants.CO_GUI) {
					certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_1);
					CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
				}
				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());

				noticeOfNonConformity.setCertificateNumber(certificateRecord.getCertificateNumber());
				if(soChungChiCu != null && soChungChiCu.trim().length() > 0){
					noticeOfNonConformity.setPreviousCertificateNumber(soChungChiCu);
					noticeOfNonConformity.setPreviousSignDate(ngayChungChiCu);
				}
				
				noticeOfNonConformity.setChassisNumber(vehicleRecord.getChassisNumber());
				noticeOfNonConformity.setCodeNumber(vehicleRecord.getCodeNumber());
				noticeOfNonConformity.setEngineNumber(vehicleRecord.getEngineNumber());
				noticeOfNonConformity.setEngineType(vehicleGroup.getEngineType());
				noticeOfNonConformity.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));
//				noticeOfNonConformity.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Importer importer = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				noticeOfNonConformity.setImporter(importer);

				noticeOfNonConformity.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				noticeOfNonConformity.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				noticeOfNonConformity.setInspectionSite(inspectionRecord.getInspectionSite());

				vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.InspectorSign();

				inspectorSign.setSignDate(FormatData.parseDateToTring(certificateRecord.getSignDate()));
				inspectorSign.setSignName(certificateRecord.getSignName());
				inspectorSign.setSignPlace(certificateRecord.getSignPlace());
				inspectorSign.setSignTitle(certificateRecord.getSignTitle());
				inspectorSign.setDivision(certificateRecord.getDivision());
				inspectorSign.setOrganization(certificateRecord.getOrganization());
//				
//				inspectorSign.setSignDate(FormatData.parseDateToTring(new Date()));
//				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
//						.fetchByInspectorId(userId);
//				inspectorSign.setSignName(corporationInspector.getInspectorName());
//				inspectorSign.setSignPlace(corporationInspector.getPlace());
//				inspectorSign.setSignTitle(corporationInspector.getTitle());
//				inspectorSign.setDivision(certificateRecord.getDivision());
//				inspectorSign.setOrganization(certificateRecord.getOrganization());

				noticeOfNonConformity.setInspectorSign(inspectorSign);

				noticeOfNonConformity.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				noticeOfNonConformity.setModelCode(vehicleGroup.getModelCode());
				noticeOfNonConformity.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					noticeOfNonConformity.setProductionCountry(productionCountry);
				}

				noticeOfNonConformity.setProductionYear(vehicleRecord.getProductionYear());
				noticeOfNonConformity.setRegisteredNumber(registeredInspection.getRegisteredNumber());

				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {
					int sizeCount = circulars.size();
					List<vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Circular> circularList = new ArrayList<NoticeOfNonConformity.Circular>();
					for (int j = 0; j < sizeCount; j++) {
						CertificateCircular certificateCircular = circulars.get(j);
						vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Circular circular = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Circular();
						circular.setCircularDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
						circular.setCircularNo(certificateCircular.getCircularNo());
						circular.setSequenceNo((new Long(certificateCircular.getSequenceNo())).intValue());
						circularList.add(circular);
						// noticeOfNonConformity.getCircular().add(circular);
					}
					if (circularList.size() > 0) {
						noticeOfNonConformity.getCircular().addAll(circularList);
					}

				}
//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						noticeOfNonConformity.getCustomDeclaration().add(declaration);
					}
				}

				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
				if (copReport != null) {
					vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.COPReport();
					cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
					cpReport.setCOPReportNumber(copReport.getReportNumber());
					noticeOfNonConformity.getCOPReport().add(cpReport);
				}
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				if (emissionTestReport != null) {
					vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.EmissionTestReport();
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					noticeOfNonConformity.getEmissionTestReport().add(emissionTestReport2);
				}

				noticeOfNonConformity.setTradeMark(vehicleGroup.getTradeMark());
				noticeOfNonConformity.setVehicleType(vehicleGroup.getVehicleType());
				noticeOfNonConformity.setReasonForNonConformity(certificateRecord.getReason());
				noticeOfNonConformity.setDestination("///");

				//TODO
				if(vehicleGroup != null && vehicleGroup.getVehicleClass() != null && (vehicleGroup.getVehicleClass().equalsIgnoreCase("XDD") || vehicleGroup.getVehicleClass().equalsIgnoreCase("DCX"))){
					List<VehicleRecord> lstRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						if(lstRecords != null && lstRecords.size() >0){
							List<vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ImportedVehicle> lstImportedVehicles = new ArrayList<vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ImportedVehicle>();
							for(VehicleRecord record : lstRecords){
								vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ImportedVehicle();
								importedVehicle.setSequenceNo(record.getSequenceNo());
								importedVehicle.setCodeNumber(record.getCodeNumber());
								importedVehicle.setProductionYear(record.getProductionYear());
								importedVehicle.setChassisNumber(record.getChassisNumber());
								importedVehicle.setEngineNumber(record.getEngineNumber());
								importedVehicle.setVehicleEngineStatus(ConvertUtil.convertToInt(record.getVehicleEngineStatus()));
								
								lstImportedVehicles.add(importedVehicle);
							}
							noticeOfNonConformity.getImportedVehicle().addAll(lstImportedVehicles);
						}
					}
				
				if (gui == Constants.CO_GUI) {
					List<vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.AttachedFile> attachedFiles = new ArrayList<vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.AttachedFile>();


					if (gui == Constants.CO_GUI) {
						vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.AttachedFile attachedFilePDFKy = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.AttachedFile();
						TthcNoidungHoSo noidungHoSo = TthcNoidungHoSoLocalServiceUtil
								.fetchTthcNoidungHoSo(certificateRecord.getAttachedFile());
						long kySoId = noidungHoSo.getTaiLieuDinhKem();
						if (kySoId > 0) {
	//						String urlFilePDFKy = getHost(actionRequest)
	//								+ DocumentUtils.getLinkDownloadFromNoiLuuTruTaiLieuId(kySoId);
							//_log.info("--------kySoId-----" + kySoId);
							attachedFilePDFKy.setAttachedTypeCode("213");
							attachedFilePDFKy.setAttachedTypeName("MAU_FILE_KY");
							attachedFilePDFKy.setAttachedDocName("MAU_FILE_KY");
							attachedFilePDFKy.setAttachedNote("MAU_FILE_KY");
							attachedFilePDFKy.setAttachedSequenceNo(3);
							//attachedFilePDFKy.setBase64FileContent(FileUtils.getBase64FileContent1(kySoId));
							attachedFilePDFKy.setFileURL(FileUtils.getFullFileURL(kySoId));
							attachedFilePDFKy.setFullFileName(FileUtils.getNameByFileEntryId(kySoId));
	
							attachedFiles.add(attachedFilePDFKy);
						}

						// Sonvh bosung 22/09/2016
						long idTBTCGD = vehicleRecord.getControlRequirementId();
						long idKQTCGD = 0;
						if (idTBTCGD >0)
						{
							ControlReport controlRequirementResult = null;
							controlRequirementResult = ControlReportLocalServiceUtil.findByInspectionrecordId(inspectionRecord.getId());
							if ((controlRequirementResult !=null) && (controlRequirementResult.getAttachedFile() > 0))
							{
								TthcNoidungHoSo noidungHoSo_TCGD = TthcNoidungHoSoLocalServiceUtil						
									.fetchTthcNoidungHoSo(controlRequirementResult.getAttachedFile());
								
								idKQTCGD = noidungHoSo_TCGD.getTaiLieuDinhKem();
							}
							vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.AttachedFile attachedFilePDF_TCGD = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.AttachedFile();
							if (idKQTCGD > 0) {
								attachedFilePDF_TCGD.setAttachedTypeCode("204");
								attachedFilePDF_TCGD.setAttachedTypeName("MAU_FILE_KY");
								attachedFilePDF_TCGD.setAttachedDocName("MAU_FILE_KY");
								attachedFilePDF_TCGD.setAttachedNote("MAU_FILE_KY");
								attachedFilePDF_TCGD.setAttachedSequenceNo(3);
								//attachedFilePDF_TCGD.setBase64FileContent("");
								attachedFilePDF_TCGD.setFileURL(FileUtils.getFullFileURL(idKQTCGD));
								attachedFilePDF_TCGD.setFullFileName(FileUtils.getNameByFileEntryId(idKQTCGD));
								attachedFiles.add(attachedFilePDF_TCGD); 
							}
							_log.info("============attachedFiles.size() 204==========="
							+ attachedFiles.size());
						}
	
						if (attachedFiles != null && attachedFiles.size() > 0) {
							noticeOfNonConformity.getAttachedFile().addAll(attachedFiles);
						}
					}
				}

				if (gui == Constants.CO_GUI) {
					String messageId= functionNghiepVu.getRamdomMessage();
					if(transactionID !=null&&transactionID.length()>0){
						callWebserviceNSWBusiness.message213va30WithHeader(hoSoThuTuc, messageId, Constants.VERSION_START, noticeOfNonConformity, transactionID);
					}else{
						messgaeFunctions.insertKeHoachChuyenDich(null,null, "dieuKienChuyenDich", certificateRecord.getId()+"",messageId ,debitNoteNumber,"30","213" );
						callWebserviceNSWBusiness.message213va30(userId + "", hoSoThuTuc,
								messageId, Constants.VERSION_START, noticeOfNonConformity);
					}
				}

			}
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
		return noticeOfNonConformity;
	}

	public NoticeOfNonConformity guiThongBaoKhongDat(TthcHoSoThuTuc hoSoThuTuc, long userId,
			VehicleRecord vehicleRecord, RegisteredInspection registeredInspection, DraftCertificate certificateRecord,
			VehicleGroup vehicleGroup,InspectionRecord inspectionRecord) {
		NoticeOfNonConformity noticeOfNonConformity = new NoticeOfNonConformity();
		try {

			long kq = 1;

			// MessageType= 213
			// MessageFunction= 30
			// Update VR_CERTIFICATERECORD
			if (kq > 0) {

//				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
//						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());

				noticeOfNonConformity.setCertificateNumber("Draf");
				noticeOfNonConformity.setChassisNumber(vehicleRecord.getChassisNumber());
				noticeOfNonConformity.setCodeNumber(vehicleRecord.getCodeNumber());
				noticeOfNonConformity.setEngineNumber(vehicleRecord.getEngineNumber());
				noticeOfNonConformity.setEngineType(vehicleGroup.getEngineType());
				noticeOfNonConformity.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));
//				noticeOfNonConformity.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Importer importer = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				noticeOfNonConformity.setImporter(importer);

				noticeOfNonConformity.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				noticeOfNonConformity.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				noticeOfNonConformity.setInspectionSite(inspectionRecord.getInspectionSite());

				vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.InspectorSign();

				inspectorSign.setSignDate(FormatData.parseDateToTring(new Date()));
				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
						.fetchByInspectorId(userId);
				inspectorSign.setSignName(corporationInspector.getInspectorName());
				inspectorSign.setSignPlace(corporationInspector.getPlace());
				inspectorSign.setSignTitle(corporationInspector.getTitle());
				inspectorSign.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				inspectorSign.setOrganization(DKConfigurationManager.getStrProp("vr_organization", "ORGANIZATION"));

				noticeOfNonConformity.setInspectorSign(inspectorSign);

				noticeOfNonConformity.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				noticeOfNonConformity.setModelCode(vehicleGroup.getModelCode());
				noticeOfNonConformity.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					noticeOfNonConformity.setProductionCountry(productionCountry);
				}

				noticeOfNonConformity.setProductionYear(vehicleRecord.getProductionYear());
				noticeOfNonConformity.setRegisteredNumber(registeredInspection.getRegisteredNumber());

				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {
					int sizeCount = circulars.size();
					List<vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Circular> circularList = new ArrayList<NoticeOfNonConformity.Circular>();
					for (int j = 0; j < sizeCount; j++) {
						CertificateCircular certificateCircular = circulars.get(j);
						vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Circular circular = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Circular();
						circular.setCircularDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
						circular.setCircularNo(certificateCircular.getCircularNo());
						circular.setSequenceNo((new Long(certificateCircular.getSequenceNo())).intValue());
						circularList.add(circular);
						// noticeOfNonConformity.getCircular().add(circular);
					}
					if (circularList.size() > 0) {
						noticeOfNonConformity.getCircular().addAll(circularList);
					}
				}
//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(vehicleRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						noticeOfNonConformity.getCustomDeclaration().add(declaration);
					}
				}

				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
				if (copReport != null) {
					vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.COPReport();
					cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
					cpReport.setCOPReportNumber(copReport.getReportNumber());
					noticeOfNonConformity.getCOPReport().add(cpReport);
				}
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				if (emissionTestReport != null) {
					vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.EmissionTestReport();
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					noticeOfNonConformity.getEmissionTestReport().add(emissionTestReport2);
				}

				noticeOfNonConformity.setTradeMark(vehicleGroup.getTradeMark());
				noticeOfNonConformity.setVehicleType(vehicleGroup.getVehicleType());
				noticeOfNonConformity.setReasonForNonConformity(certificateRecord.getReason());
				noticeOfNonConformity.setDestination("///");

				//TODO
				if(vehicleGroup != null && vehicleGroup.getVehicleClass() != null && (vehicleGroup.getVehicleClass().equalsIgnoreCase("XDD") || vehicleGroup.getVehicleClass().equalsIgnoreCase("DCX"))){
					List<VehicleRecord> lstRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						if(lstRecords != null && lstRecords.size() >0){
							List<vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ImportedVehicle> lstImportedVehicles = new ArrayList<vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ImportedVehicle>();
							for(VehicleRecord record : lstRecords){
								vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ImportedVehicle();
								importedVehicle.setSequenceNo(record.getSequenceNo());
								importedVehicle.setCodeNumber(record.getCodeNumber());
								importedVehicle.setProductionYear(record.getProductionYear());
								importedVehicle.setChassisNumber(record.getChassisNumber());
								importedVehicle.setEngineNumber(record.getEngineNumber());
								importedVehicle.setVehicleEngineStatus(ConvertUtil.convertToInt(record.getVehicleEngineStatus()));
								
								lstImportedVehicles.add(importedVehicle);
							}
							noticeOfNonConformity.getImportedVehicle().addAll(lstImportedVehicles);
						}
					}
				
			}
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
		return noticeOfNonConformity;
	}

	public NoticeOfViolation guiThongBaoViPham(TthcHoSoThuTuc hoSoThuTuc, long userId, VehicleRecord vehicleRecord,
			RegisteredInspection registeredInspection, DraftCertificate certificateRecord, VehicleGroup vehicleGroup,InspectionRecord   inspectionRecord) {
		NoticeOfViolation noticeOfViolation = new NoticeOfViolation();
		try {

			long kq = 1;
			// MessageType= 214
			// MessageFunction= 30
			// Update VR_CERTIFICATERECORD
			if (kq > 0) {

//				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
//						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());

				noticeOfViolation.setCertificateNumber("Draft");
				noticeOfViolation.setChassisNumber(vehicleRecord.getChassisNumber());
				noticeOfViolation.setCodeNumber(vehicleRecord.getCodeNumber());
				noticeOfViolation.setEngineNumber(vehicleRecord.getEngineNumber());
				noticeOfViolation.setEngineType(vehicleGroup.getEngineType());
				noticeOfViolation.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));
//				noticeOfViolation.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.NoticeOfViolation.Importer importer = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				noticeOfViolation.setImporter(importer);

				noticeOfViolation.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				noticeOfViolation.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				noticeOfViolation.setInspectionSite(inspectionRecord.getInspectionSite());

				noticeOfViolation.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				noticeOfViolation.setModelCode(vehicleGroup.getModelCode());
				noticeOfViolation.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					noticeOfViolation.setProductionCountry(productionCountry);
				}

				noticeOfViolation.setProductionYear(vehicleRecord.getProductionYear());
				noticeOfViolation.setRegisteredNumber(registeredInspection.getRegisteredNumber());

//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.NoticeOfViolation.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						noticeOfViolation.getCustomDeclaration().add(declaration);
					}
				}

				noticeOfViolation.setTradeMark(vehicleGroup.getTradeMark());
				noticeOfViolation.setVehicleType(vehicleGroup.getVehicleType());
				noticeOfViolation.setViolationDescription(certificateRecord.getReason());

				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {

					CertificateCircular certificateCircular = circulars.get(0);
					noticeOfViolation.setDecreeDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
					noticeOfViolation.setDecreeNo(certificateCircular.getCircularNo());
				}

				noticeOfViolation.setDestination("///");
				//TODO
				if(vehicleGroup != null && vehicleGroup.getVehicleClass() != null && (vehicleGroup.getVehicleClass().equalsIgnoreCase("XDD") || vehicleGroup.getVehicleClass().equalsIgnoreCase("DCX"))){
					List<VehicleRecord> lstRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						if(lstRecords != null && lstRecords.size() >0){
							List<vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ImportedVehicle> lstImportedVehicles = new ArrayList<vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ImportedVehicle>();
							for(VehicleRecord record : lstRecords){
								vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ImportedVehicle();
								importedVehicle.setSequenceNo(record.getSequenceNo());
								importedVehicle.setCodeNumber(record.getCodeNumber());
								importedVehicle.setProductionYear(record.getProductionYear());
								importedVehicle.setChassisNumber(record.getChassisNumber());
								importedVehicle.setEngineNumber(record.getEngineNumber());
								importedVehicle.setVehicleEngineStatus(ConvertUtil.convertToInt(record.getVehicleEngineStatus()));
								
								lstImportedVehicles.add(importedVehicle);
							}
							noticeOfViolation.getImportedVehicle().addAll(lstImportedVehicles);
						}
					}
			}
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
		return noticeOfViolation;
	}

	public NoticeOfViolation guiThongBaoViPham(TthcHoSoThuTuc hoSoThuTuc, long userId, VehicleRecord vehicleRecord,
			RegisteredInspection registeredInspection, CertificateRecord certificateRecord, VehicleGroup vehicleGroup,
			int gui,  String soChungChiCu, String ngayChungChiCu,String debinoteNumber,String transactionID) {
		NoticeOfViolation noticeOfViolation = new NoticeOfViolation();
		try {

			long kq = 1;
			// MessageType= 214
			// MessageFunction= 30
			// Update VR_CERTIFICATERECORD
			if (kq > 0) {
				if (gui == Constants.CO_GUI) {
					certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_1);
					CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
				}
				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());

				noticeOfViolation.setCertificateNumber(certificateRecord.getCertificateNumber());
				if(soChungChiCu != null && soChungChiCu.trim().length() > 0){
					noticeOfViolation.setPreviousCertificateNumber(soChungChiCu);
					noticeOfViolation.setPreviousSignDate(ngayChungChiCu);
				}
				noticeOfViolation.setChassisNumber(vehicleRecord.getChassisNumber());
				noticeOfViolation.setCodeNumber(vehicleRecord.getCodeNumber());
				noticeOfViolation.setEngineNumber(vehicleRecord.getEngineNumber());
				noticeOfViolation.setEngineType(vehicleGroup.getEngineType());
				noticeOfViolation.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));
//				noticeOfViolation.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.NoticeOfViolation.Importer importer = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				noticeOfViolation.setImporter(importer);

				noticeOfViolation.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				noticeOfViolation.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				noticeOfViolation.setInspectionSite(inspectionRecord.getInspectionSite());

				vn.dtt.gt.dk.nsw.model.NoticeOfViolation.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.InspectorSign();
				
				inspectorSign.setSignDate(FormatData.parseDateToTring(certificateRecord.getSignDate()));
				inspectorSign.setSignName(certificateRecord.getSignName());
				inspectorSign.setSignPlace(certificateRecord.getSignPlace());
				inspectorSign.setSignTitle(certificateRecord.getSignTitle());
				inspectorSign.setDivision(certificateRecord.getDivision());
				inspectorSign.setOrganization(certificateRecord.getOrganization());

				noticeOfViolation.setInspectorSign(inspectorSign);

				noticeOfViolation.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				noticeOfViolation.setModelCode(vehicleGroup.getModelCode());
				noticeOfViolation.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					noticeOfViolation.setProductionCountry(productionCountry);
				}

				noticeOfViolation.setProductionYear(vehicleRecord.getProductionYear());
				noticeOfViolation.setRegisteredNumber(registeredInspection.getRegisteredNumber());

//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.NoticeOfViolation.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						noticeOfViolation.getCustomDeclaration().add(declaration);
					}
				}

				noticeOfViolation.setTradeMark(vehicleGroup.getTradeMark());
				noticeOfViolation.setVehicleType(vehicleGroup.getVehicleType());
				noticeOfViolation.setViolationDescription(certificateRecord.getReason());

				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {

					CertificateCircular certificateCircular = circulars.get(0);
					noticeOfViolation.setDecreeDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
					noticeOfViolation.setDecreeNo(certificateCircular.getCircularNo());
				}

				noticeOfViolation.setDestination("///");

				//TODO
				if(vehicleGroup != null && vehicleGroup.getVehicleClass() != null && (vehicleGroup.getVehicleClass().equalsIgnoreCase("XDD") || vehicleGroup.getVehicleClass().equalsIgnoreCase("DCX"))){
					List<VehicleRecord> lstRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						if(lstRecords != null && lstRecords.size() >0){
							List<vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ImportedVehicle> lstImportedVehicles = new ArrayList<vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ImportedVehicle>();
							for(VehicleRecord record : lstRecords){
								vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ImportedVehicle();
								importedVehicle.setSequenceNo(record.getSequenceNo());
								importedVehicle.setCodeNumber(record.getCodeNumber());
								importedVehicle.setProductionYear(record.getProductionYear());
								importedVehicle.setChassisNumber(record.getChassisNumber());
								importedVehicle.setEngineNumber(record.getEngineNumber());
								importedVehicle.setVehicleEngineStatus(ConvertUtil.convertToInt(record.getVehicleEngineStatus()));
								
								lstImportedVehicles.add(importedVehicle);
							}
							noticeOfViolation.getImportedVehicle().addAll(lstImportedVehicles);
						}
					}
				
				if (gui == Constants.CO_GUI) {
					List<vn.dtt.gt.dk.nsw.model.NoticeOfViolation.AttachedFile> attachedFiles = new ArrayList<vn.dtt.gt.dk.nsw.model.NoticeOfViolation.AttachedFile>();
					vn.dtt.gt.dk.nsw.model.NoticeOfViolation.AttachedFile attachedFilePDFKy = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.AttachedFile();
					TthcNoidungHoSo noidungHoSo = TthcNoidungHoSoLocalServiceUtil
							.fetchTthcNoidungHoSo(certificateRecord.getAttachedFile());
					long kySoId = noidungHoSo.getTaiLieuDinhKem();
					if (kySoId > 0) {
						attachedFilePDFKy.setAttachedTypeCode("214");
						attachedFilePDFKy.setAttachedTypeName("MAU_FILE_KY");
						attachedFilePDFKy.setAttachedDocName("MAU_FILE_KY");
						attachedFilePDFKy.setAttachedNote("MAU_FILE_KY");
						attachedFilePDFKy.setAttachedSequenceNo(3);
						//attachedFilePDFKy.setBase64FileContent(FileUtils.getBase64FileContent1(kySoId));
						attachedFilePDFKy.setFileURL(FileUtils.getFullFileURL(kySoId));
						attachedFilePDFKy.setFullFileName(FileUtils.getNameByFileEntryId(kySoId));

						attachedFiles.add(attachedFilePDFKy);
					}
					
					// Sonvh bosung 22/09/2016
					long idTBTCGD = vehicleRecord.getControlRequirementId();
					long idKQTCGD = 0;
					if (idTBTCGD >0)
					{
						ControlReport controlRequirementResult = null;
						controlRequirementResult = ControlReportLocalServiceUtil.findByInspectionrecordId(inspectionRecord.getId());
						if ((controlRequirementResult !=null) && (controlRequirementResult.getAttachedFile() > 0))
						{
							TthcNoidungHoSo noidungHoSo_TCGD = TthcNoidungHoSoLocalServiceUtil						
								.fetchTthcNoidungHoSo(controlRequirementResult.getAttachedFile());
							
							idKQTCGD = noidungHoSo_TCGD.getTaiLieuDinhKem();
						}
						vn.dtt.gt.dk.nsw.model.NoticeOfViolation.AttachedFile attachedFilePDF_TCGD = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.AttachedFile();
						if (idKQTCGD > 0) {
							attachedFilePDF_TCGD.setAttachedTypeCode("204");
							attachedFilePDF_TCGD.setAttachedTypeName("MAU_FILE_KY");
							attachedFilePDF_TCGD.setAttachedDocName("MAU_FILE_KY");
							attachedFilePDF_TCGD.setAttachedNote("MAU_FILE_KY");
							attachedFilePDF_TCGD.setAttachedSequenceNo(3);
							//attachedFilePDF_TCGD.setBase64FileContent("");
							attachedFilePDF_TCGD.setFileURL(FileUtils.getFullFileURL(idKQTCGD));
							attachedFilePDF_TCGD.setFullFileName(FileUtils.getNameByFileEntryId(idKQTCGD));
							attachedFiles.add(attachedFilePDF_TCGD);
						}
						_log.info("============attachedFiles.size() 204==========="
						+ attachedFiles.size());
					}

					if (attachedFiles != null && attachedFiles.size() > 0) {
						noticeOfViolation.getAttachedFile().addAll(attachedFiles);
					}
				}

				if (gui == Constants.CO_GUI) {
					
					String messageId= functionNghiepVu.getRamdomMessage();
					if(transactionID !=null&&transactionID.length()>0){
						callWebserviceNSWBusiness.message214va30WithHeader(hoSoThuTuc, messageId,  Constants.VERSION_START, noticeOfViolation, transactionID);
					}else{
						messgaeFunctions.insertKeHoachChuyenDich(null,null, "dieuKienChuyenDich", certificateRecord.getId()+"",messageId ,debinoteNumber ,"30","214");
						callWebserviceNSWBusiness.message214va30(userId + "", hoSoThuTuc,
								messageId, Constants.VERSION_START, noticeOfViolation);
					}
				}

			}
		} catch (Exception e) {
			_log.error(e);
			return null;
		}
		return noticeOfViolation;
	}


	public boolean xacNhanHuyGNC(long hoSoThuTucId, long phieuXuLyPhuId, String dieuKienChuyenDich, long userId, List<CertificateRecord> certificateRecords,String lyDo) {
		boolean result = true;
		try {
			
				// MessageType= 218
				// MessageFunction= 30
				// Update VR_CERTIFICATERECORD
				ConfirmCertificateCancellation confirmCertificateCancellation = new ConfirmCertificateCancellation();

//				confirmCertificateCancellation.setConfirmationNumber(certificateRecord.getCertificateNumber());

				confirmCertificateCancellation.setReportBy(Constants.SYSTEM);
				confirmCertificateCancellation.setReportDate(FormatData.parseDateToTring(new Date()));

				confirmCertificateCancellation.setSignDate(FormatData.parseDateToTring(new Date()));
				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
						.fetchByInspectorId(userId);
				confirmCertificateCancellation.setSignName(corporationInspector.getInspectorName());
				confirmCertificateCancellation.setSignPlace(corporationInspector.getPlace());
				confirmCertificateCancellation.setSignTitle(corporationInspector.getTitle());
				confirmCertificateCancellation.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
				confirmCertificateCancellation.setOrganization(DKConfigurationManager.getStrProp("vr_organization",
						"ORGANIZATION"));
				
				confirmCertificateCancellation.setReasonForCancellation(lyDo);
				List<vn.dtt.gt.dk.nsw.model.ConfirmCertificateCancellation.CertificateDetails> list = new ArrayList<vn.dtt.gt.dk.nsw.model.ConfirmCertificateCancellation.CertificateDetails>();
				int size =certificateRecords.size();
				String messageId =functionNghiepVu.getRamdomMessage();
				for(int i=0;i<size;i++){
					
					CertificateRecord certificateRecord = certificateRecords.get(i);
					List<TthcKeHoachChuyenDich> keHoachChuyenDichs = TthcKeHoachChuyenDichLocalServiceUtil.findByCertificateId(certificateRecord.getId()+"");
					if(keHoachChuyenDichs==null||keHoachChuyenDichs.size()==0){
						vn.dtt.gt.dk.nsw.model.ConfirmCertificateCancellation.CertificateDetails certificateDetails = new vn.dtt.gt.dk.nsw.model.ConfirmCertificateCancellation.CertificateDetails();
						certificateDetails.setCertificateNumber(certificateRecord.getCertificateNumber());
						list.add(certificateDetails);
						certificateRecord.setStampStatus(Constants.AN_CHI_HUY);
						CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);
						List<VehicleRecord> vehicleRecords  = VehicleRecordLocalServiceUtil.findByCertificateRecordId(certificateRecord.getId());
						if(vehicleRecords!=null&&vehicleRecords.size()>0){
							long sizeVehicleRecord=vehicleRecords.size();
							for(int k=0;k<sizeVehicleRecord;k++){
								VehicleRecord vehicleRecord = vehicleRecords.get(k);
							vehicleRecord.setMarkUpStatus(Constants.HOAN_KIEM_TRA);
							vehicleRecord.setConfirmedInspectionId(Constants.HOAN_KIEM_TRA);
							vehicleRecord.setInspectionRecordId(Constants.HOAN_KIEM_TRA);
							vehicleRecord.setDraftCertificateId(Constants.HOAN_KIEM_TRA);
							vehicleRecord.setCertificateRecordId(Constants.HOAN_KIEM_TRA);
							vehicleRecord.setSafeTestRequirementId(Constants.HOAN_KIEM_TRA);
							vehicleRecord.setEmissionTestRequirementId(Constants.HOAN_KIEM_TRA);
							vehicleRecord.setControlRequirementId(Constants.HOAN_KIEM_TRA);
							vehicleRecord.setDebitNoteId(Constants.HOAN_KIEM_TRA);
							vehicleRecord.setSynchDate(new Date());
							
							VehicleRecordLocalServiceUtil.updateVehicleRecord(vehicleRecord);
							}
						}
						String nhomPhieuXuLy=Constants.MAU_TRUC_TUYEN_THONG_BAO_HOAN;
						String trichYeuNoiDung = DKConfigurationManager.getStrProp("anchihuy",
								"An chi huy: ")+certificateRecord.getCertificateNumber()+"<br>"+
								DKConfigurationManager.getStrProp("ngayhuyanchi",
										"Ngay huy: ")+FormatData.parseDateToTringType3(new Date()) ;
	//					String ghiChu = lyDo;
						 MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu =  MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
						 String ghiChu = "<font color='red'> "+ DKConfigurationManager.getStrProp("xacnhanhuythutuc", "DK [  ") + FormatData.parseDateToTringType3(new Date())+" ]";
							ghiChu = ghiChu + lyDo+" </font>"+"<br>";
						ghiChu = ghiChu + motCuaPhieuXuLyPhu.getGhiChu();
						motCuaPhieuXuLyPhu.setGhiChu(ghiChu);
						MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
						 dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.xac.nhan.huy.chung.chi", "xac.nhan.huy.chung.chi");
						long userSystem = DKConfigurationManager.getLongProp("DK-system-use-upload_file_system", 0);
						phieuXuLyPhuId=motCuaBusiness.insertPhieuXuLyPhu(hoSoThuTucId, 0,  TrangThaiConstains.TAO_MOI, nhomPhieuXuLy, trichYeuNoiDung, ghiChu);
//						messgaeFunctions.insertKeHoachChuyenDich(phieuXuLyPhuId,hoSoThuTucId, dieuKienChuyenDich, certificateRecord.getId()+"", messageId,null,"30", "218" );
						//_log.info("phieuSuLyPhuId  "+phieuXuLyPhuId);
						motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich, userSystem);
						
					}
				}
				if(list.size()>0){
					RegisteredInspection registeredInspection =  RegisteredInspectionLocalServiceUtil.findByDossierId(hoSoThuTucId);
					if(registeredInspection!=null){
						VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil.findByRegisteredInspectionId(registeredInspection.getId());
						vehicleStatistics.setTotalRequestedVehicle(vehicleStatistics.getTotalRequestedVehicle()-  size);
						vehicleStatistics.setTotalNotYetRequestedVehicle(vehicleStatistics.getTotalNotYetRequestedVehicle()+size);
						vehicleStatistics.setTotalInspectedVehicle(vehicleStatistics.getTotalInspectedVehicle()-size);
						vehicleStatistics.setSynchDate(new Date());
						VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);
						
						
					}					
					confirmCertificateCancellation.getCertificateDetails().addAll(list);
					
					TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(hoSoThuTucId);
	
					callWebserviceNSWBusiness.message218va30(userId + "", hoSoThuTuc, messageId,
							Constants.VERSION_START, confirmCertificateCancellation);
				}
					
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public long createCertificateRecord(long hoSoThuTucId, long phieuXuLyPhuId, 
			long userId, String registeredNumber, DraftCertificate draftCertificate, String editorName,
			List<CertificateCircular> certificateCirculars, String signName, String signTitle, String signPlace) {
		CertificateRecord certificateRecord = new CertificateRecordImpl();
		try {
			long idCertificateRecord = CounterLocalServiceUtil.increment(CertificateRecord.class.getName());
			certificateRecord.setId(idCertificateRecord);
			certificateRecord.setCertificateNumber("DRAFT");
			certificateRecord.setSafetyTestReportId(draftCertificate.getSafetytestReportId());
			certificateRecord.setCertificateType(draftCertificate.getCertificateType());
			certificateRecord.setCommentInWrongCase(0);
			certificateRecord.setCopReportId(draftCertificate.getCopReportId());
			certificateRecord.setCreatedDate(new Date());
			certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_0);

			certificateRecord.setDivision(DKConfigurationManager.getStrProp("vn_vaqdivison", "DIVISON"));
			certificateRecord.setEditorName(editorName);
			certificateRecord.setEmissionTestReportId(draftCertificate.getEmissionTestReportId());
			certificateRecord.setInspectionReportId(draftCertificate.getInspectionReportId());
			certificateRecord.setReason(draftCertificate.getReason());
			certificateRecord.setRemarks(draftCertificate.getRemarks());
			certificateRecord.setSafetyTestReportId(draftCertificate.getSafetytestReportId());
			certificateRecord.setSignDate(new Date());
			CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);

			certificateRecord.setSignName(corporationInspector.getInspectorName());

			certificateRecord.setSignPlace(corporationInspector.getPlace());
			// teamLeaderId
			certificateRecord.setSignTitle(corporationInspector.getTitle());

			certificateRecord.setStampStatus(0);
			certificateRecord.setDossierId(hoSoThuTucId);
			CertificateRecordLocalServiceUtil.addCertificateRecord(certificateRecord);

//			if (certificateCirculars != null && certificateCirculars.size() > 0) {
//				int size = certificateCirculars.size();
//				for (int i = 0; i < size; i++) {
//					CertificateCircular certificateCircular = certificateCirculars.get(i);
//					certificateCircular.setCertificateRecordId(idCertificateRecord);
//					certificateCircular.setSequenceNo(i + 1);
//					CertificateCircularLocalServiceUtil.addCertificateCircular(certificateCircular);
//
//				}
//			}
			return idCertificateRecord;
		} catch (Exception e) {
			_log.error(e);
		}

		//_log.info("===certificateRecord Create==============" + certificateRecord);

		return 0;
	}

	private boolean createCertificateRecordSpec(DraftCertificate draftCertificate, long idCertificateRecord)
			throws SystemException {
		List<DraftCertificateSpec> lDraftCertificateSpecs = DraftCertificateSpecLocalServiceUtil
				.findByDraftCertificateId(draftCertificate.getId());


		CertificateRecordSpec certificateRecordSpec = null;
		for (DraftCertificateSpec draftCertificateSpec : lDraftCertificateSpecs) {
			certificateRecordSpec = new CertificateRecordSpecImpl();

			certificateRecordSpec.setCertificateRecordId(idCertificateRecord);
			certificateRecordSpec.setSpecificationCode(draftCertificateSpec.getSpecificationCode());
			String specificationName = draftCertificateSpec.getSpecificationName();
			if (specificationName == null || specificationName.length() == 0) {
				specificationName = "specificationName";
			}
			certificateRecordSpec.setSpecificationName(draftCertificateSpec.getSpecificationName());
			certificateRecordSpec.setSpecificationValue(draftCertificateSpec.getSpecificationValue());
			certificateRecordSpec.setVersion(0);

			CertificateRecordSpecLocalServiceUtil.addCertificateRecordSpec(certificateRecordSpec);
		}

		return true;
	}

	public boolean capChungChiHangLoatWithHeader(Header header, PaymentNotification paymentNotification, long userId, String transactionID) {
		boolean result = true;
		try {
			int size = paymentNotification.getImportedVehicle().size();
			for (int i = 0; i < size; i++) {
				vn.dtt.gt.dk.nsw.model.PaymentNotification.ImportedVehicle importedVehicle = paymentNotification
						.getImportedVehicle().get(i);

				RegisteredInspection registeredInspection = RegisteredInspectionLocalServiceUtil
						.findByRegisteredNumber(importedVehicle.getRegisteredNumber());
				// TthcHoSoThuTuc hoSoThuTuc =
				// TthcHoSoThuTucLocalServiceUtil.fetchTthcHoSoThuTuc(registeredInspection
				// .getDossierId());
				VehicleRecord vehicleRecord = VehicleRecordLocalServiceUtil.findByCodeNumberAndDossierId(
						importedVehicle.getCodeNumber(), registeredInspection.getDossierId());
				VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.fetchVehicleGroup(vehicleRecord
						.getVehicleGroupId());
				CertificateRecord certificateRecord = CertificateRecordLocalServiceUtil
						.fetchCertificateRecord(vehicleRecord.getCertificateRecordId());
				TthcHoSoThuTuc hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(registeredInspection.getDossierId());
				if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_GCN) {
					guiGiayChungNhan(hoSoThuTuc, userId, vehicleRecord, registeredInspection,
							certificateRecord, vehicleGroup, Constants.CO_GUI, StringPool.BLANK, StringPool.BLANK,paymentNotification.getDebitNoteNumber(),paymentNotification.getTransactionID());
				} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBM) {
					guiThongBaoMien(hoSoThuTuc, userId, vehicleRecord, registeredInspection, certificateRecord,
							vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,paymentNotification.getDebitNoteNumber(),paymentNotification.getTransactionID());
				} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBKD) {
					guiThongBaoKhongDat(hoSoThuTuc, userId, vehicleRecord, registeredInspection,
							certificateRecord, vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,paymentNotification.getDebitNoteNumber(),paymentNotification.getTransactionID());
				} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBXNTT) {
					guiThongBaoXacNhanTinhTrang(hoSoThuTuc, userId, vehicleRecord, registeredInspection,
							certificateRecord, vehicleGroup, Constants.CO_GUI, StringPool.BLANK, StringPool.BLANK,paymentNotification.getDebitNoteNumber(),paymentNotification.getTransactionID());
				} else if (certificateRecord.getCertificateType() == Constants.CERTIFICATE_TYPE_TBVP) {
					guiThongBaoViPham(hoSoThuTuc, userId, vehicleRecord, registeredInspection,
							certificateRecord, vehicleGroup, Constants.CO_GUI,  StringPool.BLANK, StringPool.BLANK,paymentNotification.getDebitNoteNumber(),paymentNotification.getTransactionID());
				}
			}
			vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote  debitNote = DebitNoteLocalServiceUtil.findByDebitNoteNumber(paymentNotification.getDebitNoteNumber());
			debitNote.setPaymentType(2);
			debitNote.setMarkAsDeleted(2);
			DebitNoteLocalServiceUtil.updateDebitNote(debitNote);
			
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean guiGiayChungNhanWithHeader(Header header, VehicleRecord vehicleRecord,
			RegisteredInspection registeredInspection, CertificateRecord certificateRecord, VehicleGroup vehicleGroup, String transactionID) throws SystemException {
		boolean result = true;
//		try {

			// long kq =
			// motCuaBusiness.dichChuyenTrangThaiPhieuSuLyPhu(hoSoThuTucId,
			// phieuXuLyPhuId,
			// dieuKienChuyenDich, userId);
			long kq = 1;
			if (kq > 0) {

				certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_1);
				CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);

				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());
				// MessageType= 211
				// MessageFunction= 30
				// Update VR_CERTIFICATERECORD
				
				CertificateOfQuanlityConformity certificateOfQuanlityConformity = new CertificateOfQuanlityConformity();

				certificateOfQuanlityConformity.setCertificateNumber(certificateRecord.getCertificateNumber());
				certificateOfQuanlityConformity.setChassisNumber(vehicleRecord.getChassisNumber());
				certificateOfQuanlityConformity.setCodeNumber(vehicleRecord.getCodeNumber());
				certificateOfQuanlityConformity.setEngineNumber(vehicleRecord.getEngineNumber());
				certificateOfQuanlityConformity.setEngineType(vehicleGroup.getEngineType());
				certificateOfQuanlityConformity.setVehicleEngineStatus(Integer.parseInt(vehicleRecord
						.getVehicleEngineStatus()));
				//certificateOfQuanlityConformity.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Importer importer = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				certificateOfQuanlityConformity.setImporter(importer);

				certificateOfQuanlityConformity.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				certificateOfQuanlityConformity.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				certificateOfQuanlityConformity.setInspectionSite(inspectionRecord.getInspectionSite());

				vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.InspectorSign();

				inspectorSign.setSignDate(FormatData.parseDateToTring(certificateRecord.getSignDate()));
				inspectorSign.setSignName(certificateRecord.getSignName());
				inspectorSign.setSignPlace(certificateRecord.getSignPlace());
				inspectorSign.setSignTitle(certificateRecord.getSignTitle());
				inspectorSign.setDivision(certificateRecord.getDivision());
				inspectorSign.setOrganization(certificateRecord.getOrganization());

				certificateOfQuanlityConformity.setInspectorSign(inspectorSign);

				certificateOfQuanlityConformity.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				certificateOfQuanlityConformity.setModelCode(vehicleGroup.getModelCode());
				certificateOfQuanlityConformity.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					certificateOfQuanlityConformity.setProductionCountry(productionCountry);
				}

				certificateOfQuanlityConformity.setProductionYear(vehicleRecord.getProductionYear());
				certificateOfQuanlityConformity.setRegisteredNumber(registeredInspection.getRegisteredNumber());
				List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
						.findByCertificateRecordId(certificateRecord.getId());
				if (certificateRecordSpecs != null && certificateRecordSpecs.size() > 0) {
					int sizeCertificateRecordSpec = certificateRecordSpecs.size();
					// vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList
					// specificationList = new
					// vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList();
					List<vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem> specItems = new ArrayList<CertificateOfQuanlityConformity.SpecificationList.SpecItem>();
					for (int k = 0; k < sizeCertificateRecordSpec; k++) {
						CertificateRecordSpec certificateRecordSpec = certificateRecordSpecs.get(k);
					
						if (certificateRecordSpec.getSpecificationValue() != null
								&& certificateRecordSpec.getSpecificationValue().length() > 0) {

							vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList.SpecItem();
							specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
							String specificationName = certificateRecordSpec.getSpecificationName();
							if (specificationName == null || specificationName.length() == 0) {
								specificationName = "specificationName";
							}
							specItem.setSpecificationName(specificationName);
						//	if(certificateRecordSpec.getSpecificationValue()!=null&&certificateRecordSpec.getSpecificationValue().length()>0){
								specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());								
								specItems.add(specItem);
							//}

						}
						

					}
					if (specItems.size() > 0) {
						vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.SpecificationList();
						specificationList.getSpecItem().addAll(specItems);
						certificateOfQuanlityConformity.setSpecificationList(specificationList);
					}

				}

				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {
					int sizeCount = circulars.size();
					List<vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Circular> circularList = new ArrayList<CertificateOfQuanlityConformity.Circular>();
					for (int j = 0; j < sizeCount; j++) {
						CertificateCircular certificateCircular = circulars.get(j);
						vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Circular circular = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.Circular();
						circular.setCircularDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
						circular.setCircularNo(certificateCircular.getCircularNo());
						circular.setSequenceNo((new Long(certificateCircular.getSequenceNo())).intValue());
						circularList.add(circular);

					}
					if (circularList.size() > 0) {
						certificateOfQuanlityConformity.getCircular().addAll(circularList);
					}

				}
//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						certificateOfQuanlityConformity.getCustomDeclaration().add(declaration);
					}
				}

				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
				if (copReport != null) {
					vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.COPReport();
					cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
					cpReport.setCOPReportNumber(copReport.getReportNumber());
					certificateOfQuanlityConformity.getCOPReport().add(cpReport);
				}
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				if (emissionTestReport != null) {
					vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.EmissionTestReport();
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					certificateOfQuanlityConformity.getEmissionTestReport().add(emissionTestReport2);
				}

				certificateOfQuanlityConformity.setTradeMark(vehicleGroup.getTradeMark());
				certificateOfQuanlityConformity.setVehicleType(vehicleGroup.getVehicleType());
				certificateOfQuanlityConformity.setRemarks(certificateRecord.getRemarks());

				//TODO
				if(vehicleGroup != null && vehicleGroup.getVehicleClass() != null && (vehicleGroup.getVehicleClass().equalsIgnoreCase("XDD") || vehicleGroup.getVehicleClass().equalsIgnoreCase("DCX"))){
					List<VehicleRecord> lstRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						if(lstRecords != null && lstRecords.size() >0){
							List<vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ImportedVehicle> lstImportedVehicles = new ArrayList<vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ImportedVehicle>();
							for(VehicleRecord record : lstRecords){
								vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.CertificateOfQuanlityConformity.ImportedVehicle();
								importedVehicle.setSequenceNo(record.getSequenceNo());
								importedVehicle.setCodeNumber(record.getCodeNumber());
								importedVehicle.setProductionYear(record.getProductionYear());
								importedVehicle.setChassisNumber(record.getChassisNumber());
								importedVehicle.setEngineNumber(record.getEngineNumber());
								importedVehicle.setVehicleEngineStatus(ConvertUtil.convertToInt(record.getVehicleEngineStatus()));
								
								lstImportedVehicles.add(importedVehicle);
							}
							certificateOfQuanlityConformity.getImportedVehicle().addAll(lstImportedVehicles);
						}
					}
				TthcHoSoThuTuc hoSoThuTuc =null;
				try{
					 hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(registeredInspection.getDossierId());
					if(hoSoThuTuc!=null){
						header.getSubject().setReference(ConvertUtil.convertToLong( hoSoThuTuc.getMaSoHoSo()));
						header.getSubject().setPreReference(ConvertUtil.convertToLong( hoSoThuTuc.getMaSoHoSo()));
					}
				}catch (Exception e) {
					// TODO: handle exception
				}
				callWebserviceNSWBusiness.message211va30WithHeader(hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
						Constants.VERSION_START, certificateOfQuanlityConformity,transactionID);

			}
//		} catch (Exception e) {
//			_log.error(e);
//			result = false;
//		}
		return result;
	}

	public boolean guiThongBaoMienWithHeader(Header header, VehicleRecord vehicleRecord,
			RegisteredInspection registeredInspection, CertificateRecord certificateRecord, VehicleGroup vehicleGroup,String transactionID) throws SystemException {
		boolean result = true;
//		try {
			_log.info("guiThongBaoMienWithHeader");
			long kq = 1;
			if (kq > 0) {

				// MessageType= 212
				// MessageFunction= 30
				// Update VR_CERTIFICATERECORD
				certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_1);
				CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);

				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());

				NoticeOfExemptionFromInspection noticeOfExemptionFromInspection = new NoticeOfExemptionFromInspection();

				noticeOfExemptionFromInspection.setCertificateNumber(certificateRecord.getCertificateNumber());
				noticeOfExemptionFromInspection.setChassisNumber(vehicleRecord.getChassisNumber());
				noticeOfExemptionFromInspection.setCodeNumber(vehicleRecord.getCodeNumber());
				noticeOfExemptionFromInspection.setEngineNumber(vehicleRecord.getEngineNumber());
				noticeOfExemptionFromInspection.setEngineType(vehicleGroup.getEngineType());
				noticeOfExemptionFromInspection.setVehicleEngineStatus(Integer.parseInt(vehicleRecord
						.getVehicleEngineStatus()));
//				noticeOfExemptionFromInspection.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Importer importer = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				noticeOfExemptionFromInspection.setImporter(importer);

				noticeOfExemptionFromInspection.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				noticeOfExemptionFromInspection.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				noticeOfExemptionFromInspection.setInspectionSite(inspectionRecord.getInspectionSite());

				vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.InspectorSign();

				inspectorSign.setSignDate(FormatData.parseDateToTring(certificateRecord.getSignDate()));
				inspectorSign.setSignName(certificateRecord.getSignName());
				inspectorSign.setSignPlace(certificateRecord.getSignPlace());
				inspectorSign.setSignTitle(certificateRecord.getSignTitle());
				inspectorSign.setDivision(certificateRecord.getDivision());
				inspectorSign.setOrganization(certificateRecord.getOrganization());

				noticeOfExemptionFromInspection.setInspectorSign(inspectorSign);

				noticeOfExemptionFromInspection.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				noticeOfExemptionFromInspection.setModelCode(vehicleGroup.getModelCode());
				noticeOfExemptionFromInspection.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					noticeOfExemptionFromInspection.setProductionCountry(productionCountry);
				}

				noticeOfExemptionFromInspection.setProductionYear(vehicleRecord.getProductionYear());
				noticeOfExemptionFromInspection.setRegisteredNumber(registeredInspection.getRegisteredNumber());
				List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
						.findByCertificateRecordId(certificateRecord.getId());
				if (certificateRecordSpecs != null && certificateRecordSpecs.size() > 0) {
					int sizeCertificateRecordSpec = certificateRecordSpecs.size();
					List<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem> specItemList = new ArrayList<NoticeOfExemptionFromInspection.SpecificationList.SpecItem>();
					for (int k = 0; k < sizeCertificateRecordSpec; k++) {
						CertificateRecordSpec certificateRecordSpec = certificateRecordSpecs.get(k);
						vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList.SpecItem();
						specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
						String specificationName = certificateRecordSpec.getSpecificationName();
						if (specificationName == null || specificationName.length() == 0) {
							specificationName = "specificationName";
						}
						specItem.setSpecificationName(specificationName);
						if(certificateRecordSpec.getSpecificationValue()!=null&&certificateRecordSpec.getSpecificationValue().length()>0){
							specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
							specItemList.add(specItem);
						}

					}
					if (specItemList.size() > 0) {
						vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.SpecificationList();
						specificationList.getSpecItem().addAll(specItemList);
						noticeOfExemptionFromInspection.setSpecificationList(specificationList);
					}
				}

				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {
					int sizeCount = circulars.size();
					List<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Circular> circularList = new ArrayList<NoticeOfExemptionFromInspection.Circular>();
					for (int j = 0; j < sizeCount; j++) {
						CertificateCircular certificateCircular = circulars.get(j);
						vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Circular circular = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.Circular();
						circular.setCircularDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
						circular.setCircularNo(certificateCircular.getCircularNo());
						circular.setSequenceNo((new Long(certificateCircular.getSequenceNo())).intValue());
						circularList.add(circular);

					}
					if (circularList.size() > 0) {
						noticeOfExemptionFromInspection.getCircular().addAll(circularList);
					}
				}
//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						noticeOfExemptionFromInspection.getCustomDeclaration().add(declaration);
					}
				}

				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
				if (copReport != null) {
					vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.COPReport();
					cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
					cpReport.setCOPReportNumber(copReport.getReportNumber());
					noticeOfExemptionFromInspection.getCOPReport().add(cpReport);
				}
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				if (emissionTestReport != null) {
					vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.EmissionTestReport();
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					noticeOfExemptionFromInspection.getEmissionTestReport().add(emissionTestReport2);
				}

				noticeOfExemptionFromInspection.setTradeMark(vehicleGroup.getTradeMark());
				noticeOfExemptionFromInspection.setVehicleType(vehicleGroup.getVehicleType());
				noticeOfExemptionFromInspection.setRemarks(certificateRecord.getRemarks());

				//TODO
				if(vehicleGroup != null && vehicleGroup.getVehicleClass() != null && (vehicleGroup.getVehicleClass().equalsIgnoreCase("XDD") || vehicleGroup.getVehicleClass().equalsIgnoreCase("DCX"))){
					List<VehicleRecord> lstRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						if(lstRecords != null && lstRecords.size() >0){
							List<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ImportedVehicle> lstImportedVehicles = new ArrayList<vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ImportedVehicle>();
							for(VehicleRecord record : lstRecords){
								vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.NoticeOfExemptionFromInspection.ImportedVehicle();
								importedVehicle.setSequenceNo(record.getSequenceNo());
								importedVehicle.setCodeNumber(record.getCodeNumber());
								importedVehicle.setProductionYear(record.getProductionYear());
								importedVehicle.setChassisNumber(record.getChassisNumber());
								importedVehicle.setEngineNumber(record.getEngineNumber());
								importedVehicle.setVehicleEngineStatus(ConvertUtil.convertToInt(record.getVehicleEngineStatus()));
								
								lstImportedVehicles.add(importedVehicle);
							}
							noticeOfExemptionFromInspection.getImportedVehicle().addAll(lstImportedVehicles);
						}
					}
				TthcHoSoThuTuc hoSoThuTuc = null;
				try{
					 hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(registeredInspection.getDossierId());
					if(hoSoThuTuc!=null){
						header.getSubject().setReference(ConvertUtil.convertToLong( hoSoThuTuc.getMaSoHoSo()));
						header.getSubject().setPreReference(ConvertUtil.convertToLong( hoSoThuTuc.getMaSoHoSo()));
					}
				}catch (Exception e) {
					// TODO: handle exception
				}
				callWebserviceNSWBusiness.message212va30WithHeader(hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
						Constants.VERSION_START, noticeOfExemptionFromInspection,transactionID);

			}
//		} catch (Exception e) {
//			_log.error(e);
//			result = false;
//		}
		return result;
	}

	public boolean guiThongBaoKhongDatWithHeader(Header header, VehicleRecord vehicleRecord,
			RegisteredInspection registeredInspection, CertificateRecord certificateRecord, VehicleGroup vehicleGroup, String transactionID) {
		boolean result = true;
		try {

			long kq = 1;

			// MessageType= 213
			// MessageFunction= 30
			// Update VR_CERTIFICATERECORD
			if (kq > 0) {
				certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_1);
				CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);

				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());

				NoticeOfNonConformity noticeOfNonConformity = new NoticeOfNonConformity();

				noticeOfNonConformity.setCertificateNumber(certificateRecord.getCertificateNumber());
				noticeOfNonConformity.setChassisNumber(vehicleRecord.getChassisNumber());
				noticeOfNonConformity.setCodeNumber(vehicleRecord.getCodeNumber());
				noticeOfNonConformity.setEngineNumber(vehicleRecord.getEngineNumber());
				noticeOfNonConformity.setEngineType(vehicleGroup.getEngineType());
				noticeOfNonConformity.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));
//				noticeOfNonConformity.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Importer importer = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				noticeOfNonConformity.setImporter(importer);

				noticeOfNonConformity.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				noticeOfNonConformity.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				noticeOfNonConformity.setInspectionSite(inspectionRecord.getInspectionSite());

				vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.InspectorSign();

				inspectorSign.setSignDate(FormatData.parseDateToTring(certificateRecord.getSignDate()));
				inspectorSign.setSignName(certificateRecord.getSignName());
				inspectorSign.setSignPlace(certificateRecord.getSignPlace());
				inspectorSign.setSignTitle(certificateRecord.getSignTitle());
				inspectorSign.setDivision(certificateRecord.getDivision());
				inspectorSign.setOrganization(certificateRecord.getOrganization());

				noticeOfNonConformity.setInspectorSign(inspectorSign);

				noticeOfNonConformity.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				noticeOfNonConformity.setModelCode(vehicleGroup.getModelCode());
				noticeOfNonConformity.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					noticeOfNonConformity.setProductionCountry(productionCountry);
				}

				noticeOfNonConformity.setProductionYear(vehicleRecord.getProductionYear());
				noticeOfNonConformity.setRegisteredNumber(registeredInspection.getRegisteredNumber());

				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {
					int sizeCount = circulars.size();
					List<vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Circular> circularlList = new ArrayList<NoticeOfNonConformity.Circular>();
					for (int j = 0; j < sizeCount; j++) {
						CertificateCircular certificateCircular = circulars.get(j);
						vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Circular circular = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.Circular();
						circular.setCircularDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
						circular.setCircularNo(certificateCircular.getCircularNo());
						circular.setSequenceNo((new Long(certificateCircular.getSequenceNo())).intValue());
						circularlList.add(circular);
						// noticeOfNonConformity.getCircular().add(circular);
					}
					if (circularlList.size() > 0) {
						noticeOfNonConformity.getCircular().addAll(circularlList);
					}

				}
//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						noticeOfNonConformity.getCustomDeclaration().add(declaration);
					}
				}

				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
				if (copReport != null) {
					vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.COPReport();
					cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
					cpReport.setCOPReportNumber(copReport.getReportNumber());
					noticeOfNonConformity.getCOPReport().add(cpReport);
				}
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				if (emissionTestReport != null) {
					vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.EmissionTestReport();
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					noticeOfNonConformity.getEmissionTestReport().add(emissionTestReport2);
				}

				noticeOfNonConformity.setTradeMark(vehicleGroup.getTradeMark());
				noticeOfNonConformity.setVehicleType(vehicleGroup.getVehicleType());
				noticeOfNonConformity.setReasonForNonConformity(certificateRecord.getReason());
				noticeOfNonConformity.setDestination("///");

				//TODO
				if(vehicleGroup != null && vehicleGroup.getVehicleClass() != null && (vehicleGroup.getVehicleClass().equalsIgnoreCase("XDD") || vehicleGroup.getVehicleClass().equalsIgnoreCase("DCX"))){
					List<VehicleRecord> lstRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						if(lstRecords != null && lstRecords.size() >0){
							List<vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ImportedVehicle> lstImportedVehicles = new ArrayList<vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ImportedVehicle>();
							for(VehicleRecord record : lstRecords){
								vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.NoticeOfNonConformity.ImportedVehicle();
								importedVehicle.setSequenceNo(record.getSequenceNo());
								importedVehicle.setCodeNumber(record.getCodeNumber());
								importedVehicle.setProductionYear(record.getProductionYear());
								importedVehicle.setChassisNumber(record.getChassisNumber());
								importedVehicle.setEngineNumber(record.getEngineNumber());
								importedVehicle.setVehicleEngineStatus(ConvertUtil.convertToInt(record.getVehicleEngineStatus()));
								
								lstImportedVehicles.add(importedVehicle);
							}
							noticeOfNonConformity.getImportedVehicle().addAll(lstImportedVehicles);
						}
					}
				TthcHoSoThuTuc hoSoThuTuc =null;
				try{
					 hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(registeredInspection.getDossierId());
					if(hoSoThuTuc!=null){
						header.getSubject().setReference(ConvertUtil.convertToLong( hoSoThuTuc.getMaSoHoSo()));
						header.getSubject().setPreReference(ConvertUtil.convertToLong( hoSoThuTuc.getMaSoHoSo()));
					}
				}catch (Exception e) {
					// TODO: handle exception
				}
				callWebserviceNSWBusiness.message213va30WithHeader(hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
						Constants.VERSION_START, noticeOfNonConformity,transactionID);

			}
		} catch (Exception e) {
			_log.error(e);
			result = false;
		}
		return result;
	}

	public boolean guiThongBaoViPhamWithHeader(Header header, VehicleRecord vehicleRecord,
			RegisteredInspection registeredInspection, CertificateRecord certificateRecord, VehicleGroup vehicleGroup,String transactionID) throws SystemException {
		boolean result = true;
//		try {

			long kq = 1;
			// MessageType= 214
			// MessageFunction= 30
			// Update VR_CERTIFICATERECORD
			if (kq > 0) {
				certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_1);
				CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);

				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());

				NoticeOfViolation noticeOfViolation = new NoticeOfViolation();

				noticeOfViolation.setCertificateNumber(certificateRecord.getCertificateNumber());
				noticeOfViolation.setChassisNumber(vehicleRecord.getChassisNumber());
				noticeOfViolation.setCodeNumber(vehicleRecord.getCodeNumber());
				noticeOfViolation.setEngineNumber(vehicleRecord.getEngineNumber());
				noticeOfViolation.setEngineType(vehicleGroup.getEngineType());
				noticeOfViolation.setVehicleEngineStatus(Integer.parseInt(vehicleRecord.getVehicleEngineStatus()));
//				noticeOfViolation.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.NoticeOfViolation.Importer importer = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				noticeOfViolation.setImporter(importer);

				noticeOfViolation.setInspectionRecordDate(FormatData.parseDateToTring(inspectionRecord
						.getInspectionRecordDate()));
				noticeOfViolation.setInspectionRecordNumber(inspectionRecord.getInspectionRecordNo());
				noticeOfViolation.setInspectionSite(inspectionRecord.getInspectionSite());

				vn.dtt.gt.dk.nsw.model.NoticeOfViolation.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.InspectorSign();

				inspectorSign.setSignDate(FormatData.parseDateToTring(certificateRecord.getSignDate()));
				inspectorSign.setSignName(certificateRecord.getSignName());
				inspectorSign.setSignPlace(certificateRecord.getSignPlace());
				inspectorSign.setSignTitle(certificateRecord.getSignTitle());
				inspectorSign.setDivision(certificateRecord.getDivision());
				inspectorSign.setOrganization(certificateRecord.getOrganization());

				noticeOfViolation.setInspectorSign(inspectorSign);

				noticeOfViolation.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				noticeOfViolation.setModelCode(vehicleGroup.getModelCode());
				noticeOfViolation.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ProductionCountry();
					for (int j = 0; j < sizeProductionCountries; j++) {
						productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					noticeOfViolation.setProductionCountry(productionCountry);
				}

				noticeOfViolation.setProductionYear(vehicleRecord.getProductionYear());
				noticeOfViolation.setRegisteredNumber(registeredInspection.getRegisteredNumber());

//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.NoticeOfViolation.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						noticeOfViolation.getCustomDeclaration().add(declaration);
					}
				}

				noticeOfViolation.setTradeMark(vehicleGroup.getTradeMark());
				noticeOfViolation.setVehicleType(vehicleGroup.getVehicleType());
				noticeOfViolation.setViolationDescription(certificateRecord.getReason());

				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {

					CertificateCircular certificateCircular = circulars.get(0);
					noticeOfViolation.setDecreeDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
					noticeOfViolation.setDecreeNo(certificateCircular.getCircularNo());
				}

				noticeOfViolation.setDestination("///");

				//TODO
				if(vehicleGroup != null && vehicleGroup.getVehicleClass() != null && (vehicleGroup.getVehicleClass().equalsIgnoreCase("XDD") || vehicleGroup.getVehicleClass().equalsIgnoreCase("DCX"))){
					List<VehicleRecord> lstRecords = VehicleRecordLocalServiceUtil.findByInspectionRecordId(inspectionRecord.getId());
						if(lstRecords != null && lstRecords.size() >0){
							List<vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ImportedVehicle> lstImportedVehicles = new ArrayList<vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ImportedVehicle>();
							for(VehicleRecord record : lstRecords){
								vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ImportedVehicle importedVehicle = new vn.dtt.gt.dk.nsw.model.NoticeOfViolation.ImportedVehicle();
								importedVehicle.setSequenceNo(record.getSequenceNo());
								importedVehicle.setCodeNumber(record.getCodeNumber());
								importedVehicle.setProductionYear(record.getProductionYear());
								importedVehicle.setChassisNumber(record.getChassisNumber());
								importedVehicle.setEngineNumber(record.getEngineNumber());
								importedVehicle.setVehicleEngineStatus(ConvertUtil.convertToInt(record.getVehicleEngineStatus()));
								
								lstImportedVehicles.add(importedVehicle);
							}
							noticeOfViolation.getImportedVehicle().addAll(lstImportedVehicles);
						}
					}
				TthcHoSoThuTuc hoSoThuTuc =null;
				try{
					 hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(registeredInspection.getDossierId());
					if(hoSoThuTuc!=null){
						header.getSubject().setReference(ConvertUtil.convertToLong( hoSoThuTuc.getMaSoHoSo()));
						header.getSubject().setPreReference(ConvertUtil.convertToLong( hoSoThuTuc.getMaSoHoSo()));
					}
				}catch (Exception e) {
					// TODO: handle exception
				}
				callWebserviceNSWBusiness.message214va30WithHeader(hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
						Constants.VERSION_START, noticeOfViolation,transactionID);

			}
//		} catch (Exception e) {
//			_log.error(e);
//			result = false;
//		}
		return result;
	}

	public boolean guiThongBaoXacNhanTinhTrangWithHeader(Header header, VehicleRecord vehicleRecord,
			RegisteredInspection registeredInspection, CertificateRecord certificateRecord, VehicleGroup vehicleGroup,String transactionID) throws SystemException {
		boolean result = true;
//		try {

			long kq = 1;
			// MessageType= 216
			// MessageFunction= 30
			// Update VR_CERTIFICATERECORD
			if (kq > 0) {
				certificateRecord.setDigitalIssued(Constants.CERTIFICATE_DIGITAL_ISSSUED_1);
				CertificateRecordLocalServiceUtil.updateCertificateRecord(certificateRecord);

				InspectionRecord inspectionRecord = InspectionRecordLocalServiceUtil
						.fetchInspectionRecord(vehicleRecord.getInspectionRecordId());
				ConfirmationStatusOfQuanlityConformity confirmationStatusOfQuanlityConformity = new ConfirmationStatusOfQuanlityConformity();

				confirmationStatusOfQuanlityConformity.setCertificateNumber(certificateRecord.getCertificateNumber());
				confirmationStatusOfQuanlityConformity.setChassisNumber(vehicleRecord.getChassisNumber());
				confirmationStatusOfQuanlityConformity.setCodeNumber(vehicleRecord.getCodeNumber());
				confirmationStatusOfQuanlityConformity.setEngineNumber(vehicleRecord.getEngineNumber());
				confirmationStatusOfQuanlityConformity.setEngineType(vehicleGroup.getEngineType());
				confirmationStatusOfQuanlityConformity.setVehicleEngineStatus(Integer.parseInt(vehicleRecord
						.getVehicleEngineStatus()));
//				confirmationStatusOfQuanlityConformity.setVehicleColor(vehicleRecord.getVehicleColor());
				vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Importer importer = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Importer();
				importer.setImporterAddress(registeredInspection.getImporterAddress());
				importer.setImporterCode(registeredInspection.getImporterCode());
				importer.setImporterName(registeredInspection.getImporterName());
				confirmationStatusOfQuanlityConformity.setImporter(importer);

				confirmationStatusOfQuanlityConformity.setInspectionRecordDate(FormatData
						.parseDateToTring(inspectionRecord.getInspectionRecordDate()));
				confirmationStatusOfQuanlityConformity.setInspectionRecordNumber(inspectionRecord
						.getInspectionRecordNo());
				confirmationStatusOfQuanlityConformity.setInspectionSite(inspectionRecord.getInspectionSite());

				vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.InspectorSign inspectorSign = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.InspectorSign();

				inspectorSign.setSignDate(FormatData.parseDateToTring(certificateRecord.getSignDate()));
				inspectorSign.setSignName(certificateRecord.getSignName());
				inspectorSign.setSignPlace(certificateRecord.getSignPlace());
				inspectorSign.setSignTitle(certificateRecord.getSignTitle());
				inspectorSign.setDivision(certificateRecord.getDivision());
				inspectorSign.setOrganization(certificateRecord.getOrganization());

				confirmationStatusOfQuanlityConformity.setInspectorSign(inspectorSign);

				confirmationStatusOfQuanlityConformity.setMarkAsVehicle(vehicleGroup.getMarkAsVehicle());
				confirmationStatusOfQuanlityConformity.setModelCode(vehicleGroup.getModelCode());
				confirmationStatusOfQuanlityConformity.setModelType(vehicleGroup.getCommercialName());

				List<ProductionCountry> productionCountries = ProductionCountryLocalServiceUtil
						.findByVehicleGroupId(vehicleGroup.getId());
				if (productionCountries != null && productionCountries.size() > 0) {
					int sizeProductionCountries = productionCountries.size();
					vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.ProductionCountry productionCountry = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.ProductionCountry();
					List<String> countryCodes = new ArrayList<String>();
					for (int j = 0; j < sizeProductionCountries; j++) {
						countryCodes.add(productionCountries.get(j).getCountryCode());
						// productionCountry.getCountryCode().add(productionCountries.get(j).getCountryCode());
					}
					productionCountry.getCountryCode().addAll(countryCodes);
					confirmationStatusOfQuanlityConformity.setProductionCountry(productionCountry);
				}

				confirmationStatusOfQuanlityConformity.setProductionYear(vehicleRecord.getProductionYear());
				confirmationStatusOfQuanlityConformity.setRegisteredNumber(registeredInspection.getRegisteredNumber());
				List<CertificateRecordSpec> certificateRecordSpecs = CertificateRecordSpecLocalServiceUtil
						.findByCertificateRecordId(certificateRecord.getId());
				if (certificateRecordSpecs != null && certificateRecordSpecs.size() > 0) {
					int sizeCertificateRecordSpec = certificateRecordSpecs.size();
					List<vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem> specItemList = new ArrayList<ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem>();
					for (int k = 0; k < sizeCertificateRecordSpec; k++) {
						CertificateRecordSpec certificateRecordSpec = certificateRecordSpecs.get(k);
						vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.SpecificationList.SpecItem();
						specItem.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
						String specificationName = certificateRecordSpec.getSpecificationName();
						if (specificationName == null || specificationName.length() == 0) {
							specificationName = "specificationName";
						}
						specItem.setSpecificationName(specificationName);
						if(certificateRecordSpec.getSpecificationValue()!=null&&certificateRecordSpec.getSpecificationValue().length()>0){
							specItem.setDeclarationValue1(certificateRecordSpec.getSpecificationValue());
							specItemList.add(specItem);
						}

					}
					if (specItemList.size() > 0) {
						confirmationStatusOfQuanlityConformity.getSpecificationList().getSpecItem()
								.addAll(specItemList);
					}
				}

				List<CertificateCircular> circulars = CertificateCircularLocalServiceUtil
						.findByCertificateRecordId(vehicleRecord.getCertificateRecordId());
				if (circulars != null && circulars.size() > 0) {
					int sizeCount = circulars.size();
					List<vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Circular> circularList = new ArrayList<ConfirmationStatusOfQuanlityConformity.Circular>();
					for (int j = 0; j < sizeCount; j++) {
						CertificateCircular certificateCircular = circulars.get(j);
						vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Circular circular = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.Circular();
						circular.setCircularDate(FormatData.parseDateToTring(certificateCircular.getCircularDate()));
						circular.setCircularNo(certificateCircular.getCircularNo());
						circular.setSequenceNo((new Long(certificateCircular.getSequenceNo())).intValue());
						circularList.add(circular);
						// confirmationStatusOfQuanlityConformity.getCircular().add(circular);
					}
					if (circularList.size() > 0) {
						confirmationStatusOfQuanlityConformity.getCircular().addAll(circularList);
					}
				}
//				ConfirmedInspection confirmedInspection = ConfirmedInspectionLocalServiceUtil
//						.fetchConfirmedInspection(inspectionRecord.getConfirmedInspectionId());
				if ((inspectionRecord != null) && (inspectionRecord.getCustomsDeclarationid() > 0)){
					CustomsDeclaration customsDeclaration = CustomsDeclarationLocalServiceUtil
							.fetchCustomsDeclaration(inspectionRecord.getCustomsDeclarationid());
					if (customsDeclaration != null) {
						vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.CustomDeclaration declaration = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.CustomDeclaration();
						declaration.setImportCustomDeclareDate(FormatData.parseDateToTring(customsDeclaration
								.getImportCustomDeclareDate()));
						declaration.setImportCustomDeclareNo(customsDeclaration.getImportCustomDeclareNo());
						confirmationStatusOfQuanlityConformity.getCustomDeclaration().add(declaration);
					}
				}

				CopReport copReport = CopReportLocalServiceUtil.fetchCopReport(certificateRecord.getCopReportId());
				if (copReport != null) {
					vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.COPReport cpReport = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.COPReport();
					cpReport.setCOPTestReportDate(FormatData.parseDateToTring(copReport.getSignDate()));
					cpReport.setCOPReportNumber(copReport.getReportNumber());
					confirmationStatusOfQuanlityConformity.getCOPReport().add(cpReport);
				}
				EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
						.fetchEmissionTestReport(certificateRecord.getEmissionTestReportId());
				if (emissionTestReport != null) {
					vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.EmissionTestReport emissionTestReport2 = new vn.dtt.gt.dk.nsw.model.ConfirmationStatusOfQuanlityConformity.EmissionTestReport();
					emissionTestReport2.setEmissionTestReportDate(FormatData.parseDateToTring(emissionTestReport
							.getSignDate()));
					emissionTestReport2.setEmissionTestReportNumber(emissionTestReport.getReportNumber());
					confirmationStatusOfQuanlityConformity.getEmissionTestReport().add(emissionTestReport2);
				}

				confirmationStatusOfQuanlityConformity.setTradeMark(vehicleGroup.getTradeMark());
				confirmationStatusOfQuanlityConformity.setVehicleType(vehicleGroup.getVehicleType());
				confirmationStatusOfQuanlityConformity.setRemarks(certificateRecord.getRemarks());
				TthcHoSoThuTuc hoSoThuTuc =null;
				try{
					 hoSoThuTuc = TthcHoSoThuTucLocalServiceUtil.getTthcHoSoThuTuc(registeredInspection.getDossierId());
					if(hoSoThuTuc!=null){
						header.getSubject().setReference(ConvertUtil.convertToLong( hoSoThuTuc.getMaSoHoSo()));
						header.getSubject().setPreReference(ConvertUtil.convertToLong( hoSoThuTuc.getMaSoHoSo()));
					}
				}catch (Exception e) {
					// TODO: handle exception
				}
				callWebserviceNSWBusiness.message216va30WithHeader(hoSoThuTuc, functionNghiepVu.getRamdomMessage(),
						Constants.VERSION_START, confirmationStatusOfQuanlityConformity,transactionID);

			}
//		} catch (Exception e) {
//			_log.error(e);
//			result = false;
//		}
		return result;
	}

	public void khaiMoiHoSo(RegisteredInspection registeredInspection,
			 TechnicalSpecification technicalSpecification, long noiDungHoSoId)
			throws SystemException {		
		if (null != technicalSpecification) {
			VehicleStatistics vehicleStatistics=null;
//			noidungHoSo.setDaCapNhat(Constants.DA_CAP_NHAP_DB_NGHIEP_VU);
//			TthcNoidungHoSoLocalServiceUtil.updateTthcNoidungHoSo(noidungHoSo);
			////_log.info("liObjects.size()   " + liObjects.size());
			int sizeOfVehicleNumbers = 0;
			int sizeOfTechnicalSpecificationNumbers =1 ;
			boolean check = true;

					VehicleGroup vehicleGroup = new VehicleGroupImpl();
					VehicleGroupInitial vehicleGroupInitial = new VehicleGroupInitialImpl();
					long idVehicleGroup = CounterLocalServiceUtil.increment(VehicleGroup.class.getName());
					vehicleGroup.setId(idVehicleGroup);
					vehicleGroup.setHoSoThuTucId(registeredInspection.getDossierId());
					vehicleGroupInitial.setId(idVehicleGroup);
					String technicalSpecClass = technicalSpecification.getTechnicalSpecCode();
//					//_log.info(" before technicalSpecCode " + technicalSpecClass);
					if (null != technicalSpecClass && technicalSpecClass.length() >= 3) {
						technicalSpecClass = technicalSpecClass.substring(0, 3);

					}
//					//_log.info(" before technicalSpecCode " + technicalSpecClass);
					vehicleGroup.setAttachedFile(noiDungHoSoId);
					vehicleGroupInitial.setAttachedFile(noiDungHoSoId);
					vehicleGroup.setVehicleClass(technicalSpecClass);
					vehicleGroupInitial.setVehicleClass(technicalSpecClass);
					vehicleGroup.setRegisteredInspectionId(registeredInspection.getId());
					vehicleGroupInitial.setRegisteredInspectionId(registeredInspection.getId());
					vehicleGroup.setTechnicalSpecCode(technicalSpecification.getTechnicalSpecCode());
					vehicleGroupInitial.setTechnicalSpecCode(technicalSpecification.getTechnicalSpecCode());
					vehicleGroup.setReferenceCertificateNo(technicalSpecification.getCertificateRefNo());
					vehicleGroupInitial.setReferenceCertificateNo(technicalSpecification.getCertificateRefNo());
					String vehicleType = technicalSpecification.getGeneralInfo().getVehicleType();
					vehicleGroup.setVehicleType(vehicleType);
					vehicleGroupInitial.setVehicleType(vehicleType);
					vehicleGroup.setEngineType(technicalSpecification.getGeneralInfo().getEngineType());
					vehicleGroupInitial.setEngineType(technicalSpecification.getGeneralInfo().getEngineType());
					vehicleGroup.setMarkAsVehicle(technicalSpecification.getGeneralInfo().getMarkAsVehicle());
					vehicleGroupInitial.setMarkAsVehicle(technicalSpecification.getGeneralInfo().getMarkAsVehicle());
					if (technicalSpecification.getGeneralInfo().getMarkAsVehicle() == 0) {
						vehicleGroup.setVehicleClass("DCX");
					} else {
						if (vehicleType != null && vehicleType.length() >= 3) {
							vehicleType = vehicleType.substring(0, 3);
							if (!vehicleType.equals(vehicleGroup.getVehicleClass())) {
								vehicleGroup.setVehicleClass(vehicleType);
							}
						}
					}
					vehicleGroupInitial.setVehicleClass(vehicleGroup.getVehicleClass());
//					//_log.info( "vehicle class  "+ vehicleGroup.getVehicleClass());
//					String soDangKyKiemTra = taoCauTruc.quyDinhSoDangKyKiemTra(vehicleGroup
//							.getVehicleClass());
//					//_log.info("soDangKyKiemTra  "+soDangKyKiemTra);
//					registeredInspection.setRegisteredNumber(soDangKyKiemTra);
					vehicleGroup.setTradeMark(technicalSpecification.getGeneralInfo().getTradeMark());
					vehicleGroupInitial.setTradeMark(technicalSpecification.getGeneralInfo().getTradeMark());
					vehicleGroup.setCommercialName(technicalSpecification.getGeneralInfo().getModelType());
					vehicleGroupInitial.setCommercialName(technicalSpecification.getGeneralInfo().getModelType());
					vehicleGroup.setModelCode(technicalSpecification.getGeneralInfo().getModelCode());
					vehicleGroupInitial.setModelCode(technicalSpecification.getGeneralInfo().getModelCode());
					vehicleGroup.setProductionPlant(technicalSpecification.getGeneralInfo().getManufacturer());
					vehicleGroupInitial.setProductionPlant(technicalSpecification.getGeneralInfo().getManufacturer());
					vehicleGroup.setAddressOfProductionPlant(technicalSpecification.getGeneralInfo()
							.getAddressProductionPlant());
					vehicleGroupInitial.setAddressOfProductionPlant(technicalSpecification.getGeneralInfo()
							.getAddressProductionPlant());
					vehicleGroup.setEmissionStandard(technicalSpecification.getGeneralInfo().getEmissionStandard());
					vehicleGroupInitial.setEmissionStandard(technicalSpecification.getGeneralInfo().getEmissionStandard());
					vehicleGroup.setRemarks(technicalSpecification.getRemarks());
					vehicleGroupInitial.setRemarks(technicalSpecification.getRemarks());
					
					// Sonvh bosung 20170407 check lai 1 lan truoc khi them moi vehiclegroup de giam rui ro trung 1/1000s)
					VehicleGroup temp_vgroup = VehicleGroupLocalServiceUtil
							.findByTechnicalSpecCodeAndRegisteredInspectionId(vehicleGroup.getTechnicalSpecCode(),registeredInspection.getId());
					if ((temp_vgroup==null) || (temp_vgroup.getId() == 0)) {
						VehicleGroupLocalServiceUtil.addVehicleGroup(vehicleGroup);
						VehicleGroupInitialLocalServiceUtil.addVehicleGroupInitial(vehicleGroupInitial);			
					} else {
						check = false;
					}
					

					if (technicalSpecification.getGeneralInfo() != null
							&& technicalSpecification.getGeneralInfo().getProductionCountry() != null) {
						List<String> countryCodes = technicalSpecification.getGeneralInfo().getProductionCountry()
								.getCountryCode();

						if (countryCodes != null && countryCodes.size() > 0 && check == true) {
							int countCountryCode = countryCodes.size();
							for (int i = 0; i < countCountryCode; i++) {
								ProductionCountry productionCountry = new ProductionCountryImpl();
								long idProductionCountry = CounterLocalServiceUtil.increment(ProductionCountry.class
										.getName());
								productionCountry.setId(idProductionCountry);
								productionCountry.setVehicleGroupId(idVehicleGroup);
								productionCountry.setCountryCode(countryCodes.get(i));
								ProductionCountryLocalServiceUtil.addProductionCountry(productionCountry);
							}
						}
					}
					if (technicalSpecification.getImportedVehicle() != null && check == true) {
						int countVehicleRecords = technicalSpecification.getImportedVehicle().size();
						sizeOfVehicleNumbers = sizeOfVehicleNumbers + countVehicleRecords;
						for (int i = 0; i < countVehicleRecords; i++) {
							VehicleRecord vehicleRecord = new VehicleRecordImpl();
							VehiclerecordInitial vehiclerecordInitial = new VehiclerecordInitialImpl();
							long idVehicleRecord = CounterLocalServiceUtil.increment(VehicleRecord.class.getName());
							vehiclerecordInitial.setId(idVehicleRecord);
							vehicleRecord.setId(idVehicleRecord);

							vehicleRecord.setSequenceNo((technicalSpecification.getImportedVehicle().get(i))
									.getSequenceNo() );
							vehiclerecordInitial.setSequenceNo(vehicleRecord.getSequenceNo());
							vehicleRecord.setCodeNumber((technicalSpecification.getImportedVehicle().get(i))
									.getCodeNumber());
							vehiclerecordInitial.setCodeNumber(vehicleRecord.getCodeNumber());
							vehicleRecord.setChassisNumber((technicalSpecification.getImportedVehicle().get(i))
									.getChassisNumber());
							vehiclerecordInitial.setChassisNumber(vehicleRecord.getChassisNumber());
							vehicleRecord.setEngineNumber((technicalSpecification.getImportedVehicle().get(i))
									.getEngineNumber());
							vehiclerecordInitial.setEngineNumber(vehicleRecord.getEngineNumber());
							vehicleRecord.setProductionYear((technicalSpecification.getImportedVehicle().get(i))
									.getProductionYear());
							vehiclerecordInitial.setProductionYear(vehicleRecord.getProductionYear());
							vehicleRecord.setVehicleEngineStatus((technicalSpecification.getImportedVehicle().get(i))
									.getVehicleEngineStatus() + "");
							vehiclerecordInitial.setVehicleEngineStatus(vehicleRecord.getVehicleEngineStatus());

							Double unitPrice = new Double((technicalSpecification.getImportedVehicle().get(i)).getVehicleUnitPrice());
							vehicleRecord.setUnitPrice(unitPrice);
							vehiclerecordInitial.setUnitPrice(vehicleRecord.getUnitPrice());
							vehicleRecord.setCurrency((technicalSpecification.getImportedVehicle().get(i))
									.getCurrency());
							vehiclerecordInitial.setCurrency(vehicleRecord.getCurrency());
							vehicleRecord.setVehicleGroupId(idVehicleGroup);
							vehiclerecordInitial.setVehicleGroupId(vehicleRecord.getVehicleGroupId());
							vehicleRecord.setVehicleColor(technicalSpecification.getImportedVehicle().get(i)
									.getVehicleColor());
							vehiclerecordInitial.setVehicleColor(vehicleRecord.getVehicleColor());
							VehicleRecordLocalServiceUtil.addVehicleRecord(vehicleRecord);
							VehiclerecordInitialLocalServiceUtil.addVehiclerecordInitial(vehiclerecordInitial);

						}
					}

					if (technicalSpecification.getSpecificationList() != null
							&& technicalSpecification.getSpecificationList().getSpecItem() != null
							&& technicalSpecification.getSpecificationList().getSpecItem().size() > 0) {
						int countSpecItem = technicalSpecification.getSpecificationList().getSpecItem().size();
						for (int i = 0; i < countSpecItem; i++) {
							VehicleSpecification vehicleSpecification = new VehicleSpecificationImpl();
							long idVehicleSpecification = CounterLocalServiceUtil.increment(VehicleSpecification.class
									.getName());
							vehicleSpecification.setId(idVehicleSpecification);
							vehicleSpecification.setSpecificationCode(technicalSpecification.getSpecificationList()
									.getSpecItem().get(i).getSpecificationCode());
							String specificationName = technicalSpecification.getSpecificationList().getSpecItem()
									.get(i).getSpecificationName();
							if (specificationName == null || specificationName.length() == 0) {
								specificationName = "specificationName";
							}

							vehicleSpecification.setSpecificationName(specificationName);
							vehicleSpecification.setSpecificationValue(technicalSpecification.getSpecificationList()
									.getSpecItem().get(i).getDeclarationValue1());

							vehicleSpecification.setVehicleGroupId(idVehicleGroup);

							VehicleSpecificationLocalServiceUtil.addVehicleSpecification(vehicleSpecification);
						}
						
						if (technicalSpecification.getGeneralInfo().getMarkAsVehicle() == 0) {
							VehicleSpecification vehicleSpecification = new VehicleSpecificationImpl();
							long idVehicleSpecification = CounterLocalServiceUtil.increment(VehicleSpecification.class.getName());
							vehicleSpecification.setId(idVehicleSpecification);
							vehicleSpecification.setSpecificationCode("DCX0006");
							vehicleSpecification.setSpecificationName(DKConfigurationManager.getStrProp("vn.dtt.loaidongco", "Loai dong co"));
							
							vehicleSpecification.setSpecificationValue(technicalSpecification.getGeneralInfo().getEngineType());
							
							vehicleSpecification.setVehicleGroupId(idVehicleGroup);
							VehicleSpecificationLocalServiceUtil.addVehicleSpecification(vehicleSpecification);
						}
					}

					vehicleStatistics = VehicleStatisticsLocalServiceUtil.findByRegisteredInspectionId(registeredInspection
							.getId());
					if (vehicleStatistics == null) {
						_log.info("vehicleStatistics == null");
						vehicleStatistics = new VehicleStatisticsImpl();
						long idVehicleStatistics = CounterLocalServiceUtil.increment(VehicleStatistics.class.getName());
						vehicleStatistics.setId(idVehicleStatistics);
						vehicleStatistics.setRegisteredInspectionId(registeredInspection.getId());
						vehicleStatistics.setTotalNotYetRequestedVehicle(sizeOfVehicleNumbers);
						vehicleStatistics.setTotalRegisteredVehicle(sizeOfVehicleNumbers);
						vehicleStatistics.setProcessingState(2);
						vehicleStatistics.setProcessingTiming(0);
						vehicleStatistics.setTotalTechnicalSpec(sizeOfTechnicalSpecificationNumbers);

						VehicleStatisticsLocalServiceUtil.addVehicleStatistics(vehicleStatistics);
					} else {

						vehicleStatistics.setTotalRegisteredVehicle(vehicleStatistics.getTotalRegisteredVehicle()
								+ sizeOfVehicleNumbers);
						vehicleStatistics.setTotalNotYetRequestedVehicle(vehicleStatistics.getTotalNotYetRequestedVehicle()
								+ sizeOfVehicleNumbers);
						vehicleStatistics.setTotalTechnicalSpec(vehicleStatistics.getTotalTechnicalSpec()
								+ sizeOfTechnicalSpecificationNumbers);
						vehicleStatistics.setSynchDate(new Date());
						VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);

					}


		} else {
			//_log.info("==object===== ko co noi dung ho so ");
		}
//		return vehicleStatistics;
	}	
		
	public static String getHost(ActionRequest request){
		String host=PortalUtil.getPortalURL(request);
		
		if (host.contains("hanoi.dtt.vn:8055")){
			host=host.replace("hanoi.dtt.vn:8055", "192.168.1.201:8080");
		}
		
		return host;
	}
	public Date subTractDate(Date dateInstance, int numberDay){
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateInstance);
		cal.add(Calendar.DATE, -numberDay);
		Date dateBefore30Days = cal.getTime();
		return dateBefore30Days;
	}

	public String insertMesssageToQueue(String userName, TthcHoSoThuTuc hoSoThuTuc,String version, String messageId, String messageFunction, int messageType, String xmlData, String xmlSignature) {
		Header header =null;
		try {
	
			String messageIdSentToNSW = UUID.randomUUID().toString();
			//AswmsgMessageLog messageLog = AswmsgMessageLogLocalServiceUtil.getByVersionAndMessageId(version, messageId);
			 header = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW,
					version,hoSoThuTuc);

			 //_log.info("========header===sendTestToNSW===" + header);
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageIdSentToNSW, xmlSignature);
			AswmsgMessageLogDao.insertMessageLog(header, xmlData, MessageKey.HTTH_BGT_TO_NSW,
					TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, messageIdSentToNSW);
			//_log.info("=====Du lieu gui di HQMC===");
			_log.debug(xmlData,null);
		} catch (Exception e) {
			AswmsgMessageLogDao.insertMessageLogWhenException(header, xmlData, MessageKey.HTTH_BGT_TO_NSW_ERROR, TrangThaiHoSo.DA_BO_SUNG_CHO_TIEP_NHAP, UUID.randomUUID().toString(), e.toString(),1);
			_log.error(e);
		}
		return xmlData;
	}
	
	public long round(Double a){
		//Math.round(i/v) * v
		return 1000* Math.round(a/1000);
	}
	
	public double ceil_RoundUp1000(Double a){		
		return 1000* Math.ceil(a/1000);
	}
	public double floor_RoundDown1000(Double a){		
		return 1000* Math.floor(a/1000);
	}
	public long ceil_RoundUp(Double a){		
		return Math.round(Math.ceil(a));
	}
	
	public long floor_RoundDown(Double a){
		return Math.round(Math.floor(a));
	}
}
