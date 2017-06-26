package vn.dtt.gt.dk.api.business;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.codec.binary.Base64;

import vn.dtt.gt.dk.api.bean.bbkt.AttachedFile;
import vn.dtt.gt.dk.api.bean.bbkt.COPReport;
import vn.dtt.gt.dk.api.bean.bbkt.CustomDeclaration;
import vn.dtt.gt.dk.api.bean.bbkt.EmissionTestReport;
import vn.dtt.gt.dk.api.bean.bbkt.GeneralInfo;
import vn.dtt.gt.dk.api.bean.bbkt.SafetyTestReport;
import vn.dtt.gt.dk.api.bean.bbkt.SpecificationList;
import vn.dtt.gt.dk.api.bean.bbkt.VehicleInspectionRecord;
import vn.dtt.gt.dk.api.util.ApiUtils;
import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro;
import vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.gt.dk.dao.common.service.DmDataItemLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.CopReport;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach;
import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;
import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;
import vn.dtt.gt.dk.dao.nghiepvu.service.CertificateRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ConfirmedInspectionLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CopReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationAttendeeLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.CustomsDeclarationLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.EmissionTestReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionCommonStatusLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordAttachLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordSpecLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.ProductionCountryLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestReportLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehiclerecordInitialLocalServiceUtil;
import vn.dtt.gt.dk.message.BanTinSystemSignature;
import vn.dtt.gt.dk.message.MessageReturnUtils;
import vn.dtt.gt.dk.nsw.Header;
import vn.dtt.gt.dk.nsw.message.xml.MessageFactory;
import vn.dtt.gt.dk.portlet.business.TaoCauTrucSoDkAcBB;
import vn.dtt.gt.dk.portlet.business.XuLyMessage;
import vn.dtt.gt.dk.portlet.business.bienbankiemtra.BienBanKTNghiepVuUtils;
import vn.dtt.gt.dk.report.ReportConstant;
import vn.dtt.gt.dk.report.ReportUtils;
import vn.dtt.gt.dk.utils.DanhMucKey;
import vn.dtt.gt.dk.utils.PortletPropsValues;
import vn.dtt.gt.dk.utils.document.DocumentUtils;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.FormatData;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.portlet.PortletProps;

public class APIBusiness {
	private static final Log _log = LogFactoryUtil.getLog(APIBusiness.class);
	
	public static VehicleGroup buildVehicleGroup(long hoSoThuTucId, VehicleGroupInitial vehicleGroupInitial, 
			VehicleInspectionRecord vehicleInspectionRecord) 
		throws SystemException {
		
		long id = CounterLocalServiceUtil.increment(VehicleGroup.class.getName());

		VehicleGroup vehicleGroup = VehicleGroupLocalServiceUtil.createVehicleGroup(id);
		
		vehicleGroup.setHoSoThuTucId(hoSoThuTucId);
		vehicleGroup.setAttachedFile(vehicleGroupInitial.getAttachedFile());
		vehicleGroup.setVehicleClass(vehicleGroupInitial.getVehicleClass());
		vehicleGroup.setRegisteredInspectionId(vehicleGroupInitial.getRegisteredInspectionId());
		vehicleGroup.setTechnicalSpecCode(vehicleGroupInitial.getTechnicalSpecCode()+"*");// thay doi so voi nhom TT ban dau
		vehicleGroup.setEngineType(vehicleGroupInitial.getEngineType());
		vehicleGroup.setMarkAsVehicle(vehicleGroupInitial.getMarkAsVehicle());
		vehicleGroup.setRemarks(vehicleGroupInitial.getRemarks());
		
		SafetyTestReport safetyTestReport = vehicleInspectionRecord.getSafetyTestReport();
		EmissionTestReport emissionTestReport = vehicleInspectionRecord.getEmissionTestReport();
		COPReport copReport = vehicleInspectionRecord.getCOPReport();
		GeneralInfo generalInfo = vehicleInspectionRecord.getGeneralInfo();

		vehicleGroup.setReferenceCertificateNo(vehicleInspectionRecord.getCertificateRefNo());
		
		if(safetyTestReport != null) {
			vehicleGroup.setSafetytestreportNo(safetyTestReport.getSafetyTestReportNumberEdit());
		}
		
		if(emissionTestReport != null) {
			vehicleGroup.setEmissiontestreportNo(emissionTestReport.getEmissionTestReportNumberEdit());
		}
		
		if(copReport != null) {
			vehicleGroup.setCopreportNo(copReport.getCOPReportNumberEdit());
		}
		
		if(generalInfo != null) {
			vehicleGroup.setVehicleType(generalInfo.getVehicleTypeEdit());
			vehicleGroup.setTradeMark(generalInfo.getTradeMarkEdit());
			vehicleGroup.setCommercialName(generalInfo.getModelTypeEdit());
			vehicleGroup.setModelCode(generalInfo.getModelCodeEdit());
			vehicleGroup.setProductionPlant(generalInfo.getManufacturerEdit());
			vehicleGroup.setAddressOfProductionPlant(generalInfo.getAddressProductionPlantEdit());
			vehicleGroup.setEmissionStandard(generalInfo.getEmissionStandardEdit());
			vehicleGroup.setSynchdate(new Date());
		}
		
		return vehicleGroup;
	}

	public static InspectionRecord buildInspectionRecord(long userId,
			TthcHoSoThuTuc hoSoThuTuc, ConfirmedInspection confirmedInspection,
			long registerInspectionId, InspectionRecord oldInspectionRecord,
			VehicleInspectionRecord vehicleInspectionRecord)
		throws SystemException, PortalException {
		
		Date inspectionFrom = new Date();
		Date inspectionTo = new Date();
		Date inspectionRecordDate = new Date();
		
		long l_inspectionFrom = GetterUtil.getLong(vehicleInspectionRecord.getINSPECTIONDATEFROM());
		long l_inspectionTo = GetterUtil.getLong(vehicleInspectionRecord.getINSPECTIONDATETO());
		long l_inspectionRecordDate = GetterUtil.getLong(vehicleInspectionRecord.getInspectionRecordDate());
		
		if(l_inspectionFrom > 0) {
			inspectionFrom.setTime(l_inspectionFrom);
		}
		
		if(l_inspectionTo > 0) {
			inspectionTo.setTime(l_inspectionTo);
		}
		
		if(l_inspectionRecordDate > 0) {
			inspectionRecordDate.setTime(l_inspectionRecordDate);
		}
		
		String inspectionRecordNo = StringPool.BLANK;
		
		if(!vehicleInspectionRecord.getInspectionRecordNumber().equals(
				vehicleInspectionRecord.getInspectionRecordNumberEdit())) {
			
			inspectionRecordNo = vehicleInspectionRecord.getInspectionRecordNumberEdit();
		} else {
			
			if(oldInspectionRecord == null) {
				TaoCauTrucSoDkAcBB taoCauTrucSoDangKi = new TaoCauTrucSoDkAcBB();
				CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil.fetchByInspectorId(userId);
				String maNhanVien = (corporationInspector != null) ? corporationInspector.getContactcode() : "";
				
				inspectionRecordNo = taoCauTrucSoDangKi.quyDinhSoBienBanKiemTra(
					hoSoThuTuc.getMaBienNhan(), maNhanVien);
				// TODO: Thay so dang ky kiem tra do tren web sinh ra bang so dang ky kiem tra do thiet bi sinh ra
				//String soDangKyKiemTra = vehicleInspectionRecord.getInspectionRecordNumberEdit();
			} else {
				inspectionRecordNo = vehicleInspectionRecord.getInspectionRecordNumberEdit();
			}
		}
		
		InspectionRecord inspectionRecord = null;
				
		if(oldInspectionRecord == null) {
			long id = CounterLocalServiceUtil.increment(InspectionRecord.class.getName());
			
			inspectionRecord = InspectionRecordLocalServiceUtil.createInspectionRecord(id);
		} else {
			inspectionRecord = oldInspectionRecord;
		}
		
		inspectionRecord.setConfirmedInspectionId(confirmedInspection.getId());
		inspectionRecord.setInspectionDateFrom(inspectionFrom);
		inspectionRecord.setInspectionDateTo(inspectionTo);
		inspectionRecord.setDescription(vehicleInspectionRecord.getDESCRIPTION());
		inspectionRecord.setRemarks(vehicleInspectionRecord.getREMARKS());
		//inspectionRecord.setOtherCosts();	//TODO:
		inspectionRecord.setMarkupPaid(0);
		inspectionRecord.setInspectionSite(vehicleInspectionRecord.getInspectionSite());
		inspectionRecord.setInspectionMode(GetterUtil.getLong(vehicleInspectionRecord.getINSPECTIONMODE()));
		
		inspectionRecord.setMarkupControl(GetterUtil.getLong(vehicleInspectionRecord.getMARKUPCONTROL()));
		inspectionRecord.setMarkupEmissionTest(GetterUtil.getLong(vehicleInspectionRecord.getMARKUPEMISSIONTEST()));
		inspectionRecord.setMarkupSafeTest(GetterUtil.getLong(vehicleInspectionRecord.getMARKUPSAFETEST()));
		
		inspectionRecord.setConfirmedResult(GetterUtil.getLong(vehicleInspectionRecord.getCONFIRMEDRESULT()));
		
		inspectionRecord.setInspectionRecordDate(inspectionRecordDate);
		inspectionRecord.setInspectionRecordNo(inspectionRecordNo);
		inspectionRecord.setRegisteredInspectionId(registerInspectionId);
		inspectionRecord.setCorporationId(confirmedInspection.getCorporationId());
		inspectionRecord.setInspectorId(confirmedInspection.getInspectorId());
		inspectionRecord.setHoSoThuTucId(hoSoThuTuc.getId());
		inspectionRecord.setSynchdate(new Date());
		
		return inspectionRecord;
	}

	public static List<ProductionCountry> buildProductionCountries(long vehicleGroupId,
			VehicleInspectionRecord vehicleInspectionRecord) 
		throws SystemException {

		List<ProductionCountry> producionCountries = 
			new ArrayList<ProductionCountry>();
		
		GeneralInfo generalInfo = vehicleInspectionRecord.getGeneralInfo();
		
		if(generalInfo != null) {
			vn.dtt.gt.dk.api.bean.bbkt.ProductionCountry productionCountryEdit = generalInfo.getProductionCountry();
			
			if(productionCountryEdit != null) {
				String countryCodes = productionCountryEdit.getCountryCode();
				String[] listCountryCode = countryCodes.split(",");
				
				for(String countryCode : listCountryCode) {
					if(Validator.isNotNull(countryCode)) {
						long id = CounterLocalServiceUtil.increment(ProductionCountry.class.getName());
						ProductionCountry productionCountryImpl = 
							ProductionCountryLocalServiceUtil.createProductionCountry(id);
						
						productionCountryImpl.setCountryCode(StringUtil.trim(countryCode));
						productionCountryImpl.setVehicleGroupId(vehicleGroupId);
						productionCountryImpl.setSynchdate(new Date());
						
						producionCountries.add(productionCountryImpl);
					}
				}
			}
		}
		
		return producionCountries;
	}

	public static CustomsDeclaration buildCustomsDeclaration(long hoSoThuTucId,
			VehicleInspectionRecord vehicleInspectionRecord) 
		throws SystemException {
		
		CustomsDeclaration customsDeclaration = null;
		
		CustomDeclaration customDeclaration = vehicleInspectionRecord.getCustomDeclaration();

		String soToKhaiHHNK = StringPool.BLANK;
		Date ngayToKhaiHHNK = null;
		
		if(customDeclaration != null) {
			soToKhaiHHNK = GetterUtil.getString(customDeclaration.getImportCustomDeclareNoEdit());
			
			long importCustomDeclareDateEdit = GetterUtil.getLong(customDeclaration.getImportCustomDeclareDateEdit());
			
			if(importCustomDeclareDateEdit > 0) {
				ngayToKhaiHHNK = new Date();
				ngayToKhaiHHNK.setTime(importCustomDeclareDateEdit);
			}
		}

		if(Validator.isNotNull(soToKhaiHHNK) && (soToKhaiHHNK.length() > 0)){
			long id = CounterLocalServiceUtil.increment(
				CustomsDeclaration.class.getName());

			customsDeclaration = CustomsDeclarationLocalServiceUtil.
				createCustomsDeclaration(id);
			
			customsDeclaration.setImportCustomDeclareNo(soToKhaiHHNK);
			customsDeclaration.setImportCustomDeclareDate(ngayToKhaiHHNK);
			customsDeclaration.setHosothutucId(hoSoThuTucId);
			customsDeclaration.setCustomsResult(String.valueOf(1));
			customsDeclaration.setReleaseDate(ngayToKhaiHHNK);
			customsDeclaration.setSynchdate(new Date());
		}
		
		return customsDeclaration;
	}

	public static List<InspectionRecordSpec> buildInspectionRecordSpec(
			long inspectionRecordId, VehicleInspectionRecord vehicleInspectionRecord) 
		throws SystemException {

		List<InspectionRecordSpec> inspectionRecordSpecs = new ArrayList<InspectionRecordSpec>();
		
		SpecificationList[] specificationList = vehicleInspectionRecord.getSpecificationList();
		
		for(SpecificationList specification : specificationList) {
			String specificationCode = specification.getSpecificationCode();
			String specificationName = specification.getSpecificationName();
			String declarationValue5 = specification.getDeclarationValue5();
			String declarationValue6 = specification.getDeclarationValue6();
			
			long id = CounterLocalServiceUtil.increment(
				InspectionRecordSpec.class.getName());
			
			InspectionRecordSpec inspectionRecordSpec = 
				InspectionRecordSpecLocalServiceUtil.createInspectionRecordSpec(id);
			
			inspectionRecordSpec.setInspectionRecordid(inspectionRecordId);
			
			inspectionRecordSpec.setSpecificationCode(specificationCode);
			inspectionRecordSpec.setSpecificationName(specificationName);
			
			inspectionRecordSpec.setSpecificationValue(declarationValue5);
			inspectionRecordSpec.setEvaluationResult(GetterUtil.getLong(declarationValue6));
			inspectionRecordSpec.setSynchdate(new Date());
			
			inspectionRecordSpecs.add(inspectionRecordSpec);
		}
		
		return inspectionRecordSpecs;
	}

	public static List<InspectionCommonStatus> buildInspectionCommonStatus(long inspectionRecordId,
			VehicleInspectionRecord vehicleInspectionRecord)
		throws SystemException {

		List<InspectionCommonStatus> inspectionCommonStatuses = new ArrayList<InspectionCommonStatus>();
		
		vn.dtt.gt.dk.api.bean.bbkt.InspectionCommonStatus[] inspectionCommonStatusArr = 
			vehicleInspectionRecord.getInspectionCommonStatus();
		
		if(inspectionCommonStatusArr != null && inspectionCommonStatusArr.length > 0) {
			for(vn.dtt.gt.dk.api.bean.bbkt.InspectionCommonStatus item : inspectionCommonStatusArr) {
				long id = CounterLocalServiceUtil.increment(InspectionCommonStatus.class.getName());
				
				InspectionCommonStatus inspectionCommonStatus = 
					InspectionCommonStatusLocalServiceUtil.createInspectionCommonStatus(id);
				
				inspectionCommonStatus.setId(id);
				inspectionCommonStatus.setItemName(item.getITEMNAME());
				inspectionCommonStatus.setCommonStatus(GetterUtil.getLong(item.getCOMMONSTATUS()));
				inspectionCommonStatus.setType(GetterUtil.getLong(item.getTYPE()));
				inspectionCommonStatus.setGroupName(item.getGROUPNAME());
				inspectionCommonStatus.setVehicleClass(item.getVEHICLECLASS());
				inspectionCommonStatus.setSequenceNo(GetterUtil.getLong(item.getSEQUENCENO()));
				inspectionCommonStatus.setCommonCode(item.getCOMMONCODE());
				inspectionCommonStatus.setInspectionRecordId(inspectionRecordId);
				inspectionCommonStatus.setAllowEdit(GetterUtil.getInteger(item.getALLOW_EDIT()));
				inspectionCommonStatus.setSynchdate(new Date());
				
				inspectionCommonStatuses.add(inspectionCommonStatus);
			}
		}
		
		return inspectionCommonStatuses;
	}

	public static List<InspectionRecordAttach> buildInspectionRecordAttach(
			long inspectionRecordId, long hoSoThuTucId, 
			VehicleInspectionRecord vehicleInspectionRecord) 
		throws SystemException {

		List<InspectionRecordAttach> inspectionRecordAttachs = new ArrayList<InspectionRecordAttach>();
		
		AttachedFile[] attachedFiles = 
			vehicleInspectionRecord.getAttachedFile();
		
		if(attachedFiles != null && attachedFiles.length > 0) {
			for(AttachedFile item : attachedFiles) {
				long id = CounterLocalServiceUtil.increment(InspectionRecordAttach.class.getName());
				
				String fullFileName = item.getFullFileName(); 
				long entryId = 0;
				
				if(Validator.isNotNull(item.getBase64FileContent()) && Validator.isNotNull(fullFileName))
				try {
					byte[] data = Base64.decodeBase64(item.getBase64FileContent().trim().getBytes());
					entryId = DocumentUtils.uploadTaiLieu(data, 
						PortletPropsValues.USER_SYSTEM_UPLOAD_FILE, fullFileName);
					
					InspectionRecordAttach inspectionRecordAttach = 
							InspectionRecordAttachLocalServiceUtil.createInspectionRecordAttach(id);
					
					inspectionRecordAttach.setInspectionRecordId(inspectionRecordId);
					inspectionRecordAttach.setHoSoThuTucId(hoSoThuTucId);
					inspectionRecordAttach.setEnTryId(String.valueOf(entryId));
					inspectionRecordAttach.setEnTryName(fullFileName);
					//inspectionRecordAttach.setInspectorId(userId);
					inspectionRecordAttach.setUploadTime(new Date());
					inspectionRecordAttach.setMarkUpDelte(0);
					inspectionRecordAttach.setSynchdate(new Date());
					
					inspectionRecordAttachs.add(inspectionRecordAttach);
				} catch (Exception e) {
					_log.error(e);
				}
			}
		}
		
		return inspectionRecordAttachs;
	}

	public static TthcNoidungHoSo buildNoiDungHoSo(long userId,
			long phieuXuLyPhuId, TthcHoSoThuTuc hoSoThuTuc,
			VehicleGroup vehicleGroup, InspectionRecord inspectionRecord,
			RegisteredInspection registeredInspection,
			List<VehicleRecord> vehicleRecords, 
			VehicleInspectionRecord vehicleInspectionRecord)
			throws SystemException, IOException {
		
		vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord vehicleInspectionRecordXML = 
				new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord();
		
		vehicleInspectionRecordXML = noiDungBienBanKiemTraDKV(
				hoSoThuTuc.getId(), inspectionRecord.getPhieuXuLyPhuId(),
				userId, vehicleGroup, vehicleRecords, inspectionRecord,
				registeredInspection, vehicleInspectionRecord);
		
		int messageType = 221;
		String messageFunction = "30";
		
		String xml = MessageFactory.convertObjectToXml(vehicleInspectionRecordXML);
		xml = buildXML(userId + "", hoSoThuTuc, ApiUtils.getRamdomMessage(),
						Constants.VERSION_START, messageFunction, messageType, xml,
						BanTinSystemSignature.systemSignature());
		
		long loaiTaiLieu = Constants.LOAI_TAI_LIEU_KET_QUA_CHUA_KY;
		String mauTrucTuyen = "";
		if (vehicleGroup.getVehicleClass().trim().equalsIgnoreCase("DCX")) {
			mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BIENBANKIEMTRA_DONGCO;
		} else {
			mauTrucTuyen = Constants.MAU_TRUC_TUYEN_BIENBANKIEMTRA;
		}

		String tenTaiLieu = GetterUtil.getString(
			PortletProps.get("bien_ban_kiem_tra_phuong_tien_nhap_khau")) 
			+ "   " + inspectionRecord.getInspectionRecordNo();
		
		long id = CounterLocalServiceUtil.increment(TthcNoidungHoSo.class.getName());
		
		TthcNoidungHoSo noiDungHoSo = TthcNoidungHoSoLocalServiceUtil.createTthcNoidungHoSo(id);

		noiDungHoSo.setMaTuSinh(String.valueOf((new Date()).getTime()));
		
		noiDungHoSo.setNoiDungXml(xml);
		noiDungHoSo.setTenTaiLieu(tenTaiLieu);
		noiDungHoSo.setHoSoThuTucId(hoSoThuTuc.getId());
		List<TthcThanhPhanHoSo> lTthcThanhPhanHoSos = TthcThanhPhanHoSoLocalServiceUtil
				.findByThuTucHanhChinhIdAndMauTrucTuyen(hoSoThuTuc.getThuTucHanhChinhId(), mauTrucTuyen);
		if (lTthcThanhPhanHoSos != null && lTthcThanhPhanHoSos.size() > 0) {
			noiDungHoSo.setBieuMauHoSoId(lTthcThanhPhanHoSos.get(0).getBieuMauHoSoId());
		}
		
		
		noiDungHoSo.setNgayGuiNhan(new Date());
		noiDungHoSo.setLoaiTaiLieu(loaiTaiLieu);
		noiDungHoSo.setNgayTao(new Date());
		noiDungHoSo.setNguoiTao(userId);
		
		return noiDungHoSo;	
	}
	
	public static MotCuaDienBienHoSo buildMotCuaDienBienHoSo(
			MotCuaPhieuXuLyPhu phieuXuLyPhu, long userId)
		throws SystemException, PortalException {
		
		MotCuaDienBienHoSo motCuaDienBienHoSo = null;
		
		String dieuKienChuyenDich = GetterUtil.getString(PortletProps.get("de.nghi.duyet.hskt"));
		
		List<MotCuaChuyenDichTrangThai> chuyenDichTrangThais = MotCuaChuyenDichTrangThaiLocalServiceUtil
			.findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
					phieuXuLyPhu.getTrangThaiHienTaiId());
		
		if(chuyenDichTrangThais != null && chuyenDichTrangThais.size() > 0) {
			
			MotCuaChuyenDichTrangThai chuyenDichTrangThai = chuyenDichTrangThais.get(0);
			
			long id = CounterLocalServiceUtil.increment(MotCuaDienBienHoSo.class.getName());
			motCuaDienBienHoSo = MotCuaDienBienHoSoLocalServiceUtil.createMotCuaDienBienHoSo(id);
			motCuaDienBienHoSo.setNgayXuLy(new Date());
			motCuaDienBienHoSo.setNguoiXuLy(userId);
			motCuaDienBienHoSo.setPhieuXuLyChinhId(phieuXuLyPhu.getPhieuXuLyChinhId());
			motCuaDienBienHoSo.setPhieuXuLyPhuId(phieuXuLyPhu.getId());
			motCuaDienBienHoSo.setTrangThaiSauId(chuyenDichTrangThai.getTrangThaiDichId());
			motCuaDienBienHoSo.setTrangThaiTruocId(chuyenDichTrangThai.getTrangThaiNguonId());
			motCuaDienBienHoSo.setHanhDongXuLy(chuyenDichTrangThai.getHanhDongXuLy());
			motCuaDienBienHoSo.setSoNgayQuaHan(chuyenDichTrangThai.getSoNgayXuLy());
		}
		
		return motCuaDienBienHoSo;	
	}

	public static MotCuaPhieuXuLyPhu buildMotCuaPhieuXuLyPhu(
			MotCuaPhieuXuLyPhu phieuXuLyPhu, long userId,
			TthcNoidungHoSo noiDungHoSo,
			VehicleInspectionRecord vehicleInspectionRecord)
		throws SystemException, PortalException {
		
		String dieuKienChuyenDich = GetterUtil.getString(PortletProps.get("dieukiendichchuyen.het.xe.kt"));
		
		List<MotCuaChuyenDichTrangThai> chuyenDichTrangThais = MotCuaChuyenDichTrangThaiLocalServiceUtil
			.findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
					phieuXuLyPhu.getTrangThaiHienTaiId());
		
		MotCuaPhieuXuLyPhu phieuXuLyPhuBBKT = null;
		
		if(chuyenDichTrangThais != null && chuyenDichTrangThais.size() > 0) {
			
			MotCuaChuyenDichTrangThai chuyenDichTrangThai = chuyenDichTrangThais.get(0);
		
			//motCuaPhieuXuLyPhu.setChiemQuyenXuLy(chiemQuyenXuLy);
			//motCuaPhieuXuLyPhu.setGhiChu(ghiChu);
			phieuXuLyPhu.setNoiDungHoSoId(noiDungHoSo.getId());
			phieuXuLyPhu.setPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
			
			List<TthcPhanNhomHoSoVaiTro> hoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.
				findByPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
			
			if(hoSoVaiTros != null && hoSoVaiTros.size() > 0){
				TthcPhanNhomHoSoVaiTro hoSoVaiTro = hoSoVaiTros.get(0);
				phieuXuLyPhu.setNhomPhieuXuLy(hoSoVaiTro.getNhomPhieuXuLy());
			}
			
			phieuXuLyPhu.setTrangThaiHienTaiId(chuyenDichTrangThai.getTrangThaiDichId());
			phieuXuLyPhu.setNgayTaoPhieu(new Date());
			//motCuaPhieuXuLyPhu.setTrichYeuNoiDung(trichYeuNoiDung);
		}
		
		return phieuXuLyPhuBBKT;	
	}
	
	public static vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord noiDungBienBanKiemTraDKV(
			long hoSoThuTucId, long phieuXuLyPhuId, long userId,
			VehicleGroup vehicleGroup, List<VehicleRecord> vehicleRecords,
			InspectionRecord inspectionRecord,
			RegisteredInspection registeredInspection, 
			VehicleInspectionRecord vehicleInspectionRecordJson) {
		
		vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord vehicleInspectionRecord = null;
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
			
			vehicleInspectionRecord = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord();
			
			
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
			
			SpecificationList[] specificationListJson = vehicleInspectionRecordJson.getSpecificationList();
			
			List<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem> specItems = new ArrayList<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem>();
			for(SpecificationList specification : specificationListJson) {
				vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem specItem = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem();
				specItem.setSpecificationCode(specification.getSpecificationCode());
				specItem.setSpecificationName(specification.getSpecificationName());
				specItem.setDeclarationValue1(specification.getDeclarationValue1());
				specItem.setDeclarationValue2("");
				specItem.setDeclarationValue3("");
				specItem.setDeclarationValue4("");
				specItem.setDeclarationValue5(specification.getDeclarationValue5());
				specItem.setDeclarationValue6(specification.getDeclarationValue6());
				specItems.add(specItem);
			}
			
			if (specItems.size() > 0) {
				vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList specificationList = new vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList();
				specificationList.getSpecItem().addAll(specItems);
				vehicleInspectionRecord.setSpecificationList(specificationList);
			}

			/*if (lstObjXmlDoiChieuThongSoKtXes != null && lstObjXmlDoiChieuThongSoKtXes.size() > 0) {
				List<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem> specItems = new ArrayList<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.SpecificationList.SpecItem>();
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
			}*/

			if (vehicleRecords != null && vehicleRecords.size() > 0) {
				int sizeVehicleRecord = vehicleRecords.size();
				List<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.ImportedVehicle> importedVehicles = new ArrayList<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.ImportedVehicle>();
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
				
				vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport emissionTestReport = EmissionTestReportLocalServiceUtil
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

				vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport testReport = SafetyTestReportLocalServiceUtil.fetchSafetyTestReport(certificateRecord
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
				List<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionCommonStatus> inspectionCommonStatusList = new ArrayList<vn.dtt.gt.dk.nsw.model.VehicleInspectionRecord.InspectionCommonStatus>();
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
	
	private static String buildXML(
		String userName, TthcHoSoThuTuc hoSoThuTuc, String version, String messageId, String messageFunction, int messageType, String xmlData, String xmlSignature) {
		try {
			
			String messageIdSentToNSW = messageId;
			Header header = MessageReturnUtils.crateHeader(messageFunction, messageType, userName, messageIdSentToNSW, version, hoSoThuTuc);
			
			xmlData = XuLyMessage.createContentSendFromBgtvtToNSW(header, xmlData, messageIdSentToNSW, xmlSignature);
		} catch (Exception e) {
			_log.error(e);
		}
		return xmlData;
	}
}
