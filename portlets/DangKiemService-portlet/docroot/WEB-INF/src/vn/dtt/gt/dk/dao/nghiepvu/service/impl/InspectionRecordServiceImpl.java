/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.dtt.gt.dk.dao.nghiepvu.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.api.bean.bbkt.ImportedVehicle;
import vn.dtt.gt.dk.api.bean.bbkt.RemovedVehicle;
import vn.dtt.gt.dk.api.bean.bbkt.VehicleInspectionRecord;
import vn.dtt.gt.dk.api.business.APIBusiness;
import vn.dtt.gt.dk.api.util.APIConstants;
import vn.dtt.gt.dk.api.util.ApiUtils;
import vn.dtt.gt.dk.dao.api.model.Api;
import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro;
import vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.common.service.TthcPhanNhomHoSoVaiTroLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo;
import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoImpl;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaChuyenDichTrangThaiLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaDienBienHoSoLocalServiceUtil;
import vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.DuplicateInspectionRecordNoException;
import vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException;
import vn.dtt.gt.dk.dao.nghiepvu.VehicleInspectionRecordInvalidException;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
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
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;
import vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleStatisticsLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.InspectionRecordServiceBaseImpl;
import vn.dtt.gt.dk.portlet.business.TrangThaiConstains;
import vn.dtt.gt.dk.portlet.business.bienbankiemtra.BienBanKTNghiepVuUtils;
import vn.dtt.gt.dk.utils.config.DKConfigurationManager;
import vn.dtt.gt.dk.utils.format.Constants;
import vn.dtt.gt.dk.utils.format.FormatData;

/**
 * The implementation of the inspection record remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.InspectionRecordServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.InspectionRecordServiceUtil
 */
public class InspectionRecordServiceImpl extends InspectionRecordServiceBaseImpl {
	
	@JSONWebService(value = "inspectionrecord", method = "POST")
	public JSONObject doImportInspectionRecord(String vehicleinspectionrecord) 
			throws SystemException, PortalException {
		
		ServiceContext serviceContext = ApiUtils.getServiceContext(getUser());
		String registeredNumber = StringPool.BLANK;
		
		// add request log
		Api apiLog = apiLocalService.addApiLog(
			String.valueOf(APIConstants.API_SYNC_INSPECTION_RECORD), 
			vehicleinspectionrecord, serviceContext);
		
		vehicleinspectionrecord = ApiUtils.quoteJSON(vehicleinspectionrecord);
		
		JSONObject result = JSONFactoryUtil.createJSONObject();
		int code = APIConstants.API_CODE_ERROR;
		String message = StringPool.BLANK;
		
		try {
			JSONObject jsonInput = JSONFactoryUtil.createJSONObject(vehicleinspectionrecord);
			
			registeredNumber = GetterUtil.getString(jsonInput.getString("RegisteredNumber"));
			
			_log.info("===vehicleInspectionRecordJson===\n"+jsonInput);
			
			Gson gson = new Gson();
			
			VehicleInspectionRecord vehicleInspectionRecord = gson.fromJson(
					jsonInput.toString(), VehicleInspectionRecord.class);
			
			// update inspectionRecord
			updateVehicleInspectionRecord(vehicleInspectionRecord);
			
			code = APIConstants.API_CODE_SUCCESS;
		} catch(Exception e) {
			_log.error(e);
			
			if(e instanceof JSONException) {
				code = APIConstants.API_CODE_INVALID_JSON;
			} else if(e instanceof VehicleInspectionRecordInvalidException) {
				code = APIConstants.API_VEHICLE_INSPECTION_RECORD_INVALID;
			} else if(e instanceof DuplicateInspectionRecordNoException) {
				code = APIConstants.API_CODE_DUPLICATE_INSPECTION_RECORD_NO;
			} else if(e instanceof NoSuchRegisteredInspectionException) {
				code = APIConstants.API_CODE_NO_SUCH_REGISTERED_INSPECTION;
			} else {
				code = APIConstants.API_CODE_ERROR;
			}
		}
		
		result.put("code", code);
		result.put("message", message);
		
		// add response log
		if(apiLog != null) {
			apiLocalService.updateApiLog(apiLog, registeredNumber, result.toString());
		}
		
		return result;
	}
	
	/**
	 * 
	 * @param vehicleInspectionRecord
	 * @throws SystemException 
	 * @throws PortalException 
	 * @throws IOException 
	 */
	private void updateVehicleInspectionRecord(VehicleInspectionRecord vehicleInspectionRecord) 
			throws Exception {

		// I. Validate
		
		String registeredNumber = vehicleInspectionRecord.getRegisteredNumber();
		
		if(Validator.isNull(registeredNumber)) {
			throw new NoSuchRegisteredInspectionException();
		}
		
		String inspectionRecordNumber = vehicleInspectionRecord.getInspectionRecordNumber();
		String inspectionRecordNumberEdit = vehicleInspectionRecord.getInspectionRecordNumberEdit();
		
		long registeredInspectionId = 0;
		
		RegisteredInspection registeredInspection = registeredInspectionPersistence.
			findByRegisteredNumber(registeredNumber);
		
		registeredInspectionId = registeredInspection.getId();
		
		long hoSoThuTucId = registeredInspection.getDossierId();
		TthcHoSoThuTuc hoSoThuTuc = tthcHoSoThuTucPersistence.findByPrimaryKey(hoSoThuTucId);
		
		List<VehicleRecord> newVehicleRecords = new ArrayList<VehicleRecord>();
		
		long vehicleGroupInitialId = 0;
		long confirmedInspectionId = 0;
		ConfirmedInspection confirmedInspection = null;
		InspectionRecord oldInspectionRecord = null;
		MotCuaPhieuXuLyPhu phieuXuLyPhu = null;
		
		if(Validator.isNotNull(inspectionRecordNumber) 
				&& !inspectionRecordNumber.endsWith("/0000")) {
			
			oldInspectionRecord = inspectionRecordPersistence.
				findByR_I(registeredInspectionId, inspectionRecordNumber);
		}
		
		// lap bbkt
		if(vehicleInspectionRecord.getImportedVehicle() != null && 
				vehicleInspectionRecord.getImportedVehicle().length > 0) {
			
			// Phat sinh so BBKT tu thiet bi
			if(!inspectionRecordNumber.equals(inspectionRecordNumberEdit)) {
				oldInspectionRecord = inspectionRecordPersistence.
						fetchByR_I(registeredInspectionId, inspectionRecordNumber);
				
				if(oldInspectionRecord != null) {
					// Da trung so BBKT
					throw new DuplicateInspectionRecordNoException();
				}
			}
			
			for(ImportedVehicle importedVehicle : vehicleInspectionRecord.getImportedVehicle()) {
				long codeNumber = GetterUtil.getLong(importedVehicle.getCodeNumber());
				String chassisNumberInitial = importedVehicle.getChassisNumberInitial();
				String engineNumberInitial = importedVehicle.getEngineNumberInitial();
				
				VehiclerecordInitial vehicleRecordInitial = 
					vehiclerecordInitialPersistence.findByCN_CHN_EN(
							codeNumber, chassisNumberInitial, engineNumberInitial);
				
				long vehicleRecordInitialId = vehicleRecordInitial.getId();
				vehicleGroupInitialId = vehicleRecordInitial.getVehicleGroupId();
				
				VehicleRecord oldVehicleRecord = 
						vehicleRecordPersistence.findByPrimaryKey(vehicleRecordInitialId);
				
				confirmedInspectionId = oldVehicleRecord.getConfirmedInspectionId();
				
				//long inspectionRecordId = oldVehicleRecord.getInspectionRecordId();
				
				long draftCertificateId = oldVehicleRecord.getDraftCertificateId();
				
				long certificateRecordId = oldVehicleRecord.getCertificateRecordId();
				
				if(confirmedInspectionId == 0) {
					throw new VehicleInspectionRecordInvalidException();
				}
				
				if(draftCertificateId > 0) {
					//throw new VehicleInspectionRecordInvalidException();
					//TODO: Check phan nhom cua phieu xu ly phu BBKT, neu la 25,26 thi hop le
				}
				
				if(certificateRecordId > 0) {
					//throw new VehicleInspectionRecordInvalidException();
				}
				
				/*VehicleRecord newVehicleRecord = new VehicleRecordImpl();
				
				newVehicleRecord.setId(vehicleRecordInitialId);
				newVehicleRecord.setConfirmedInspectionId(confirmedInspectionId);
				newVehicleRecord.setDraftCertificateId(draftCertificateId);
				newVehicleRecord.setCertificateRecordId(certificateRecordId);*/
				oldVehicleRecord.setChassisNumber(importedVehicle.getChassisNumber());
				oldVehicleRecord.setEngineNumber(importedVehicle.getEngineNumber());
				oldVehicleRecord.setVehicleColor(importedVehicle.getVehicleColor());
				oldVehicleRecord.setProductionYear(importedVehicle.getProductionYear());
				oldVehicleRecord.setVehicleEngineStatus(importedVehicle.getVehicleEngineStatus());
				oldVehicleRecord.setMarkAsSample(GetterUtil.getInteger(importedVehicle.getMarkAsSampleVehicle()));
				oldVehicleRecord.setSequenceNo(GetterUtil.getLong(importedVehicle.getSequenceNo()));
				oldVehicleRecord.setCodeNumber(GetterUtil.getLong(importedVehicle.getCodeNumber()));
				oldVehicleRecord.setCurrency(importedVehicle.getCurrency());
				oldVehicleRecord.setSynchdate(new Date());
				
				newVehicleRecords.add(oldVehicleRecord);
			}
			
			// II. Prepare Data
			
			confirmedInspection = confirmedInspectionPersistence.findByPrimaryKey(
				confirmedInspectionId);	//lich
	
			long oldPhieuXuLyPhuId = 0;
			long oldCustomsDeclarationId = 0;
			long userId = confirmedInspection.getInspectorId();
			
			if(oldInspectionRecord != null) {
				oldCustomsDeclarationId = oldInspectionRecord.getCustomsDeclarationid();
				oldPhieuXuLyPhuId = oldInspectionRecord.getPhieuXuLyPhuId();
				
				phieuXuLyPhu = motCuaPhieuXuLyPhuPersistence.findByPrimaryKey(oldPhieuXuLyPhuId);
			}
			
			// III. Update
			
			// 1. insert vehicleGroup
			
			VehicleGroupInitial vehicleGroupInitial = vehicleGroupInitialPersistence.findByPrimaryKey(
				vehicleGroupInitialId);
			
			VehicleGroup newVehicleGroup = APIBusiness.buildVehicleGroup(
				hoSoThuTucId, vehicleGroupInitial, vehicleInspectionRecord);
			
			vehicleGroupPersistence.update(newVehicleGroup);
			
			// 2. insert productionCountry
			
			List<ProductionCountry> newProductionCountries = APIBusiness.buildProductionCountries(
					newVehicleGroup.getId(), vehicleInspectionRecord);
			
			//TODO: xoa ProductionCountry  truoc khi update lai
			/*List<ProductionCountry> lstProductionCountries = ProductionCountryLocalServiceUtil.
					findByVehicleGroupId(newVehicleGroup.getId());
			if (lstProductionCountries != null && lstProductionCountries.size() > 0) {
				for (ProductionCountry productionCountry : lstProductionCountries) {
					productionCountryPersistence.remove(productionCountry);
				}
			}*/
			
			for(ProductionCountry newProductionCountry : newProductionCountries) {
				productionCountryPersistence.update(newProductionCountry);
			}
			
			// 3. insert InspectionRecord
			
			InspectionRecord newInspectionRecord = APIBusiness.buildInspectionRecord(
					userId, hoSoThuTuc, confirmedInspection, registeredInspectionId, 
					oldInspectionRecord, vehicleInspectionRecord);
			
			// 3.1 remove
			if(oldInspectionRecord != null) {
				inspectionCommonStatusPersistence.removeByInspectionRecordId(oldInspectionRecord.getId());
				inspectionRecordSpecPersistence.removeByInspectionRecordId(oldInspectionRecord.getId());
				inspectionRecordAttachPersistence.removeByInspectionRecordAttach(oldInspectionRecord.getId());
				
				if(oldInspectionRecord.getAttachedFile() > 0) {
					tthcNoidungHoSoPersistence.remove(oldInspectionRecord.getAttachedFile());
				}
			}
			
			// 4. insert CustomDeclaration
			
			CustomsDeclaration newCustomsDeclaration = APIBusiness.buildCustomsDeclaration(
				hoSoThuTucId, vehicleInspectionRecord);
			if(newCustomsDeclaration != null) {
				customsDeclarationPersistence.update(newCustomsDeclaration);
			}
			
			// 5. insert InspectionRecordSpec
			
			List<InspectionRecordSpec> newInspectionRecordSpecs = APIBusiness.buildInspectionRecordSpec(
					newInspectionRecord.getId(), vehicleInspectionRecord);
			for(InspectionRecordSpec newInspectionRecordSpec : newInspectionRecordSpecs) {
				inspectionRecordSpecPersistence.update(newInspectionRecordSpec);
			}
			
			// 6. insert InspectionCommonStatus
			
			List<InspectionCommonStatus> newInspectionCommonStatuses = APIBusiness.buildInspectionCommonStatus(
					newInspectionRecord.getId(), vehicleInspectionRecord);
			for(InspectionCommonStatus newInspectionCommonStatus : newInspectionCommonStatuses) {
				inspectionCommonStatusPersistence.update(newInspectionCommonStatus);
			}
			
			// 7. insert AttachFile
			List<InspectionRecordAttach> newInspectionRecordAttachs = APIBusiness.buildInspectionRecordAttach(
					newInspectionRecord.getId(), hoSoThuTucId, vehicleInspectionRecord);
			for(InspectionRecordAttach newInspectionRecordAttach : newInspectionRecordAttachs) {
				inspectionRecordAttachPersistence.update(newInspectionRecordAttach);
			}
			
			// 8. insert VehicleRecord
			int vehicleRecordCount = 0;
			for(VehicleRecord newVehicleRecord : newVehicleRecords) {
				newVehicleRecord.setVehicleGroupId(newVehicleGroup.getId());
				newVehicleRecord.setInspectionRecordId(newInspectionRecord.getId());
				vehicleRecordPersistence.update(newVehicleRecord);
				vehicleRecordCount ++;
			}
			
			// 9. update VehicleStatistic
			if(registeredInspectionId > 0) {
				VehicleStatistics vehicleStatistics = vehicleStatisticsPersistence.
					findByRegisteredInspectionId(registeredInspectionId);
				vehicleStatistics.setTotalInspectedVehicle(
					vehicleStatistics.getTotalInspectedVehicle() + vehicleRecordCount);
				vehicleStatisticsPersistence.update(vehicleStatistics);
			}
			
			// 10. update motCuaPhieuXuLyPhu
			
			MotCuaPhieuXuLyPhu newPhieuXuLyPhu = null;
			
			if(phieuXuLyPhu == null) {									// Lap moi bien ban
				newPhieuXuLyPhu = putHoSo2PhieuPhu(
					hoSoThuTucId, TrangThaiConstains.TAO_MOI, userId);
	
				try {
					String trichYeuNoiDung = DKConfigurationManager.getStrProp("so_phuong_tien_kiem_tra",
							"So Phuong Tien Kiem Tra");
					trichYeuNoiDung = trichYeuNoiDung + vehicleRecordCount + "<br>";
					
					newPhieuXuLyPhu.setTrichYeuNoiDung(trichYeuNoiDung);
		
					CorporationInspector corporationInspector = CorporationInspectorLocalServiceUtil
							.fetchByInspectorId(newInspectionRecord.getInspectorId());
		
					String ghiChu = DKConfigurationManager.getStrProp("SO_BIEN_BAN_KIEM_TRA", "So BBKT")
							+ "<b>"+ newInspectionRecord.getInspectionRecordNo() + "</b><br>";
					if (corporationInspector != null) {
						ghiChu = ghiChu + DKConfigurationManager.getStrProp("MA_DANG_KIEM_VIEN", "Ma DKKT")
								+ corporationInspector.getContactcode() + "<br>";
					}
					
					ghiChu = ghiChu
							+ DKConfigurationManager.getStrProp("THOI_GIAN_DIA_DIEM_KIEM_TRA",
									"Thoi Gian Dia Diem Kiem Tra") + "<br>"
							+ DKConfigurationManager.getStrProp("TU_NGAY", "Tu ngay")
							+ FormatData.parseDateToTringType4(newInspectionRecord.getInspectionDateFrom()) + "<br>"
							+ DKConfigurationManager.getStrProp("DEN_NGAY", "Den ngay")
							+ FormatData.parseDateToTringType4(newInspectionRecord.getInspectionDateTo()) + "<br>"
							+ newInspectionRecord.getInspectionSite() + "<br>";
		
					newPhieuXuLyPhu.setGhiChu(ghiChu);
					
					newPhieuXuLyPhu = motCuaPhieuXuLyPhuPersistence.update(newPhieuXuLyPhu);
				} catch(Exception e) {
					_log.error(e);
				}
			} else {													// sua bien ban
				// 11. insert MotCuaDienBienHoSo
				/*MotCuaDienBienHoSo newMotCuaDienBienHoSo = APIBusiness.
					buildMotCuaDienBienHoSo(phieuXuLyPhu, userId);
				motCuaDienBienHoSoPersistence.update(newMotCuaDienBienHoSo);*/
				
				// 12. update MotCuaPhieuXuLyPhu
				/*phieuXuLyPhu = APIBusiness.buildMotCuaPhieuXuLyPhu(phieuXuLyPhu,
						userId, newNoiDungHoSo, vehicleInspectionRecord);
				motCuaPhieuXuLyPhuPersistence.update(phieuXuLyPhu);*/
				
				newPhieuXuLyPhu = phieuXuLyPhu;
			}
			
			// 11. insert tthc_noidunghoso
			TthcNoidungHoSo newNoiDungHoSo = APIBusiness.buildNoiDungHoSo(
					userId, newPhieuXuLyPhu.getId(), hoSoThuTuc, newVehicleGroup,
					newInspectionRecord, registeredInspection, newVehicleRecords, 
					vehicleInspectionRecord);
			
			tthcNoidungHoSoPersistence.update(newNoiDungHoSo);
			
			// 13. update inspectionRecord
			if(newNoiDungHoSo != null) {
				newInspectionRecord.setAttachedFile(newNoiDungHoSo.getId());
			}
			
			if(newPhieuXuLyPhu != null) {
				newInspectionRecord.setPhieuXuLyPhuId(newPhieuXuLyPhu.getId());
			}
			
			if(newCustomsDeclaration != null) {
				newInspectionRecord.setCustomsDeclarationid(newCustomsDeclaration.getId());
			}
			
			inspectionRecordPersistence.update(newInspectionRecord);
			
			// 14. remove
			/*if(oldInspectionRecordId > 0) {
				inspectionRecordPersistence.remove(oldInspectionRecordId);
				inspectionCommonStatusPersistence.removeByInspectionRecordId(oldInspectionRecordId);
				inspectionRecordSpecPersistence.removeByInspectionRecordId(oldInspectionRecordId);
				inspectionRecordAttachPersistence.removeByInspectionRecordAttach(oldInspectionRecordId);
			}*/
			
			if(oldCustomsDeclarationId > 0) {
				customsDeclarationPersistence.remove(oldCustomsDeclarationId);
			}
			
			// 15. Kiem tra co chuyen lich hay khong
			int countVehicleByConfirmInspection = vehicleRecordLocalService.countByConfirmedInspectionId(
				confirmedInspectionId);
			
			if(countVehicleByConfirmInspection == 0) {
				//TODO: chuyen lich
				_log.info("===countVehicleByConfirmInspection===" + countVehicleByConfirmInspection);
			}
			
			// 16. Check gui lanh dao
			int inspectionRecordFolder = GetterUtil.getInteger(vehicleInspectionRecord.getInspectionRecordFolder());
			if(inspectionRecordFolder == 19) {
				deNghiDuyetBienBanKiemtra(hoSoThuTucId,
					newInspectionRecord.getPhieuXuLyPhuId(), userId,
					newInspectionRecord);
			}
		}
		
		// Huy BBKT
		if(vehicleInspectionRecord.getRemovedVehicle() != null &&
				vehicleInspectionRecord.getRemovedVehicle().length > 0) {
			
			long oldConfirmedInspectionId = 0;
			//long userId = 0;
			
			List<VehicleRecord> removedVehicles = new ArrayList<VehicleRecord>();
			long oldVehicleGroupId = 0;
			
			for(RemovedVehicle removedVehicle : vehicleInspectionRecord.getRemovedVehicle()) {
				
				long codeNumber = GetterUtil.getLong(removedVehicle.getRemovedCodeNumber());
				String chassisNumberInitial = removedVehicle.getRemovedChassisNumberInitial();
				String engineNumberInitial = removedVehicle.getRemovedEngineNumberInitial();
				
				VehicleRecord vehicleRecord = 
					vehicleRecordPersistence.findByCN_CHN_EN(
							codeNumber, chassisNumberInitial, engineNumberInitial);
				
				oldVehicleGroupId = vehicleRecord.getVehicleGroupId();
				
				oldConfirmedInspectionId = vehicleRecord.getConfirmedInspectionId();
				
				VehiclerecordInitial vehicleRecordInitial = 
					vehiclerecordInitialPersistence.findByCN_CHN_EN(
							codeNumber, chassisNumberInitial, engineNumberInitial);
				
				vehicleRecord.setCertificateRecordId(vehicleRecordInitial.getCertificateRecordId());
				vehicleRecord.setChassisNumber(vehicleRecordInitial.getChassisNumber());
				vehicleRecord.setCodeNumber(vehicleRecordInitial.getCodeNumber());
				vehicleRecord.setConfirmedInspectionId(oldConfirmedInspectionId);
				vehicleRecord.setControlRequirementId(vehicleRecordInitial.getControlRequirementId());
				vehicleRecord.setCurrency(vehicleRecordInitial.getCurrency());
				//vehicleRecord.setDebitNoteId(vehicleRecordInitial.getD);
				vehicleRecord.setDraftCertificateId(vehicleRecordInitial.getDraftCertificateId());
				vehicleRecord.setEmissionTestRequirementId(vehicleRecordInitial.getEmissionTestRequirementId());
				vehicleRecord.setEngineNumber(vehicleRecordInitial.getEngineNumber());
				vehicleRecord.setInspectionRecordId(vehicleRecordInitial.getInspectionRecordId());
				//vehicleRecord.setMarkAsSample(vehicleRecordInitial.getM);
				vehicleRecord.setMarkUpStatus(vehicleRecordInitial.getMarkUpStatus());
				vehicleRecord.setProductionYear(vehicleRecordInitial.getProductionYear());
				vehicleRecord.setRemarks(vehicleRecordInitial.getRemarks());
				vehicleRecord.setSafeTestRequirementId(vehicleRecordInitial.getSafeTestRequirementId());
				vehicleRecord.setSequenceNo(vehicleRecordInitial.getSequenceNo());
				vehicleRecord.setSynchdate(new Date());
				vehicleRecord.setUnitPrice(vehicleRecordInitial.getUnitPrice());
				vehicleRecord.setVehicleColor(vehicleRecordInitial.getVehicleColor());
				vehicleRecord.setVehicleEngineStatus(vehicleRecordInitial.getVehicleEngineStatus());
				vehicleRecord.setVehicleGroupId(vehicleRecordInitial.getVehicleGroupId());
				
				removedVehicles.add(vehicleRecord);
			}
			
			confirmedInspection = confirmedInspectionPersistence.findByPrimaryKey(oldConfirmedInspectionId);
			
			boolean isHuyBienBanKiemTra = true;
			
			// Neu co danh sach ImportedVehicle thi chi go xe ra khoi bien ban, nguoc lai thi huy bien ban
			if(vehicleInspectionRecord.getImportedVehicle() != null && 
					vehicleInspectionRecord.getImportedVehicle().length > 0) {
				isHuyBienBanKiemTra = false;
			}
			
			huyBienBanKiemtra(hoSoThuTucId, "", confirmedInspection.getInspectorId(), 
				registeredInspectionId, confirmedInspection.getId(), removedVehicles, 
				oldInspectionRecord, oldVehicleGroupId, isHuyBienBanKiemTra);
		}
		
	}
	
	private MotCuaPhieuXuLyPhu putHoSo2PhieuPhu(long hoSoThuTucId, int trangThaiHienTai, long userId) 
			throws SystemException {
		
		long phieuXuLyPhuId = counterLocalService.increment(MotCuaPhieuXuLyPhu.class.getName());
		
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu = motCuaPhieuXuLyPhuPersistence.create(phieuXuLyPhuId);
		motCuaPhieuXuLyPhu.setPhieuXuLyChinhId(hoSoThuTucId);
		motCuaPhieuXuLyPhu.setTrangThaiHienTaiId(TrangThaiConstains.TAO_MOI);
		motCuaPhieuXuLyPhu.setNhomPhieuXuLy("XACNHANKEHOACH");
		motCuaPhieuXuLyPhu.setTrangThaiHienTaiId(trangThaiHienTai);
		motCuaPhieuXuLyPhu.setPhanNhomHoSoId(Constants.PHIEU_XU_LY_PHU_PHAN_CONG_DON_VI_KIEM_TRA);

		String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.du.dieu.kien.kt",
				"du.dieu.kien.kt");
		List<MotCuaChuyenDichTrangThai> chuyenDichTrangThais = motCuaChuyenDichTrangThaiPersistence
				.findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
						TrangThaiConstains.TAO_MOI);
		
		if (chuyenDichTrangThais != null && chuyenDichTrangThais.size() > 0) {
			MotCuaChuyenDichTrangThai chuyenDichTrangThai = chuyenDichTrangThais.get(0);
			long chuyenDichTrangThaiId = counterLocalService.increment(MotCuaDienBienHoSo.class.getName());
			
			MotCuaDienBienHoSo motCuaDienBienHoSo = motCuaDienBienHoSoPersistence.create(chuyenDichTrangThaiId);
			motCuaDienBienHoSo.setNgayXuLy(new Date());
			motCuaDienBienHoSo.setNguoiXuLy(userId);
			motCuaDienBienHoSo.setPhieuXuLyChinhId(hoSoThuTucId);
			motCuaDienBienHoSo.setPhieuXuLyPhuId(phieuXuLyPhuId);
			motCuaDienBienHoSo.setTrangThaiSauId(chuyenDichTrangThai.getTrangThaiDichId());
			motCuaDienBienHoSo.setTrangThaiTruocId(chuyenDichTrangThai.getTrangThaiNguonId());
			motCuaDienBienHoSo.setHanhDongXuLy(chuyenDichTrangThai.getHanhDongXuLy());
			motCuaDienBienHoSo.setSoNgayQuaHan(chuyenDichTrangThai.getSoNgayXuLy());
			
			motCuaDienBienHoSoPersistence.update(motCuaDienBienHoSo);
			
			motCuaPhieuXuLyPhu.setPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
			
			List<TthcPhanNhomHoSoVaiTro> hoSoVaiTros = tthcPhanNhomHoSoVaiTroPersistence.
					findByPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
			
			if(hoSoVaiTros!=null&&hoSoVaiTros.size()>0){
				TthcPhanNhomHoSoVaiTro hoSoVaiTro = hoSoVaiTros.get(0);
				motCuaPhieuXuLyPhu.setNhomPhieuXuLy(hoSoVaiTro.getNhomPhieuXuLy());
			}
			
			motCuaPhieuXuLyPhu.setTrangThaiHienTaiId(chuyenDichTrangThai.getTrangThaiDichId());
			
		}
		
		motCuaPhieuXuLyPhu = motCuaPhieuXuLyPhuPersistence.update(motCuaPhieuXuLyPhu);
		
		return motCuaPhieuXuLyPhu;
	}
	
	private void huyBienBanKiemtra(long hoSoThuTucId,
			String dieuKienChuyenDich, long userId, long registerInspectionId,
			long confirmedInspectionId,
			List<VehicleRecord> removedVehicleRecords,
			InspectionRecord inspectionRecord, long oldVehicleGroupId,
			boolean isHuyBienBanKiemTra)
		throws SystemException, PortalException {

		long soXeHuy = removedVehicleRecords.size();
		
		VehicleStatistics vehicleStatistics = VehicleStatisticsLocalServiceUtil
				.findByRegisteredInspectionId(registerInspectionId);
		vehicleStatistics.setTotalInspectedVehicle(vehicleStatistics.getTotalInspectedVehicle()- soXeHuy);
		VehicleStatisticsLocalServiceUtil.updateVehicleStatistics(vehicleStatistics);
		
		List<MotCuaPhieuXuLyPhu> lstPhieuXuLyPhus = MotCuaPhieuXuLyPhuLocalServiceUtil.findMotCuaPhieuXuLyPhuByConfirmedInspection(confirmedInspectionId);
		if(lstPhieuXuLyPhus != null && lstPhieuXuLyPhus.size() >0){
			// ID Phieu xu ly phu cua Lich kiem tra hien truong
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.kiem.tra.lai", "kiem.tra.lai");
			long idPhieuXuLyPhu = lstPhieuXuLyPhus.get(0).getId();
			dichChuyenTrangThaiPhieuXuLyPhu(hoSoThuTucId, idPhieuXuLyPhu, dieuKienChuyenDich, userId);
			
			MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil.fetchMotCuaPhieuXuLyPhu(idPhieuXuLyPhu);
//			MotCuaPhieuXuLyPhu phieuXuLyPhu = lstPhieuXuLyPhus.get(0);
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
				TthcHoSoThuTucLocalServiceUtil.updateTthcHoSoThuTuc(tthcHoSoThuTuc);
			}
		}
		
		if(isHuyBienBanKiemTra) {
			BienBanKTNghiepVuUtils.deleteVehicleGroup(oldVehicleGroupId);
			
			if(inspectionRecord.getAttachedFile()>0){
				TthcNoidungHoSoLocalServiceUtil.deleteTthcNoidungHoSo(inspectionRecord.getAttachedFile());
			}
			
			InspectionRecordLocalServiceUtil.deleteInspectionRecordSpec(inspectionRecord.getId());
			InspectionRecordLocalServiceUtil.deleteInspectionCommonstatus(inspectionRecord.getId());
			
			//di chuyen de luu lai tien trinh huy bien ban sau do xoa phieu luon
			dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.huy.bbkt", "huy.bbkt");
			
			if(inspectionRecord.getPhieuXuLyPhuId() > 0) {
				dichChuyenTrangThaiPhieuXuLyPhu(hoSoThuTucId, inspectionRecord.getPhieuXuLyPhuId(), dieuKienChuyenDich, userId);
			
				motCuaPhieuXuLyPhuPersistence.remove(inspectionRecord.getPhieuXuLyPhuId());	
			}
				
			// delete inspectionrecord
			InspectionRecordLocalServiceUtil.deleteInspectionRecord(inspectionRecord);
		}
	}
	
	private void dichChuyenTrangThaiPhieuXuLyPhu(long hoSoThuTucId,
			long phieuXuLyPhuId, String dieuKienChuyenDich, long userId) 
		throws SystemException {
		
		MotCuaPhieuXuLyPhu phieuXuLyPhu = MotCuaPhieuXuLyPhuLocalServiceUtil
				.fetchMotCuaPhieuXuLyPhu(phieuXuLyPhuId);
			
		List<MotCuaChuyenDichTrangThai> chuyenDichTrangThais = MotCuaChuyenDichTrangThaiLocalServiceUtil
				.findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
						phieuXuLyPhu.getTrangThaiHienTaiId());
		
		if (chuyenDichTrangThais != null && chuyenDichTrangThais.size() > 0) {
			MotCuaChuyenDichTrangThai chuyenDichTrangThai = chuyenDichTrangThais.get(0);
			MotCuaDienBienHoSo motCuaDienBienHoSo = new MotCuaDienBienHoSoImpl();
			long  id = CounterLocalServiceUtil.increment(MotCuaDienBienHoSo.class.getName());
			 motCuaDienBienHoSo.setId(id);
			motCuaDienBienHoSo.setNgayXuLy(new Date());
			motCuaDienBienHoSo.setNguoiXuLy(userId);
			motCuaDienBienHoSo.setPhieuXuLyChinhId(phieuXuLyPhu.getPhieuXuLyChinhId());
			motCuaDienBienHoSo.setPhieuXuLyPhuId(phieuXuLyPhu.getId());
			motCuaDienBienHoSo.setTrangThaiSauId(chuyenDichTrangThai.getTrangThaiDichId());
			motCuaDienBienHoSo.setTrangThaiTruocId(chuyenDichTrangThai.getTrangThaiNguonId());
			motCuaDienBienHoSo.setHanhDongXuLy(chuyenDichTrangThai.getHanhDongXuLy());
			motCuaDienBienHoSo.setSoNgayQuaHan(chuyenDichTrangThai.getSoNgayXuLy());
			MotCuaDienBienHoSoLocalServiceUtil.addMotCuaDienBienHoSo(motCuaDienBienHoSo);
			phieuXuLyPhu.setPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
			List<TthcPhanNhomHoSoVaiTro> hoSoVaiTros = TthcPhanNhomHoSoVaiTroLocalServiceUtil.findByPhanNhomHoSoId(chuyenDichTrangThai.getPhanNhomHoSoId());
			
			if(hoSoVaiTros!=null&&hoSoVaiTros.size()>0){
				TthcPhanNhomHoSoVaiTro hoSoVaiTro = hoSoVaiTros.get(0);
				phieuXuLyPhu.setNhomPhieuXuLy(hoSoVaiTro.getNhomPhieuXuLy());
			}
			
			phieuXuLyPhu.setTrangThaiHienTaiId(chuyenDichTrangThai.getTrangThaiDichId());
			phieuXuLyPhu.setNgayTaoPhieu(new Date());
			MotCuaPhieuXuLyPhuLocalServiceUtil.updateMotCuaPhieuXuLyPhu(phieuXuLyPhu);
		}
	}
	
	private void deNghiDuyetBienBanKiemtra(long hoSoThuTucId, long phieuXuLyPhuId, long userId,
		InspectionRecord inspectionRecord) 
		throws SystemException {

		String dieuKienChuyenDich = DKConfigurationManager.getStrProp("dieukiendichchuyen.de.nghi.duyet.hskt",
				"de.nghi.duyet.hskt");
		dichChuyenTrangThaiPhieuXuLyPhu(hoSoThuTucId, phieuXuLyPhuId, dieuKienChuyenDich,
				userId);
		
		//inspectionRecord.setPhieuXuLyPhuId(phieuXuLyPhuId);
		//InspectionRecordLocalServiceUtil.updateInspectionRecord(inspectionRecord);
	}
	
	private static final Log _log = LogFactoryUtil.getLog(InspectionRecordServiceImpl.class);
}