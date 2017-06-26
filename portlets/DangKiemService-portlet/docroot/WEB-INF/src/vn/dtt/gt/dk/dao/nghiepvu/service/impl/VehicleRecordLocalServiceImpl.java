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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleGroupLocalServiceUtil;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.VehicleRecordLocalServiceBaseImpl;
import vn.dtt.gt.dk.dao.nghiepvu.util.comparator.VehicleRecordSequenceNoComparator;

/**
 * The implementation of the vehicle record local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.VehicleRecordLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil
 */
public class VehicleRecordLocalServiceImpl extends VehicleRecordLocalServiceBaseImpl {
	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil} to access the vehicle record local service.
	 */
	public VehicleRecord findByCodeNumber(long codeNumber) {
		try {
			return vehicleRecordPersistence.findByCodeNumber(codeNumber);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<VehicleRecord> findByCertificateRecordId(long certificateRecordId) {
		try {
			return vehicleRecordPersistence.findByCertificateRecordId(certificateRecordId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<VehicleRecord> findByConfirmedInspectionId(long confirmedInspectionId) {
		try {
			return vehicleRecordPersistence.findByConfirmedInspectionId(confirmedInspectionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, new VehicleRecordSequenceNoComparator());
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<VehicleRecord> findByDraftCertificateId(long draftCertificateId) {
		try {
			return vehicleRecordPersistence.findByDraftCertificateId(draftCertificateId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VehicleRecord>();
	}
	
	public List<VehicleRecord> findVehicleRecordHasSafetestrequirement(String inspectionRecordId) {
		List<VehicleRecord> result = null;
		try {
			result = vehicleRecordFinder.findVehicleRecordHasSafetestrequirement(inspectionRecordId);
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	
	public List<VehicleRecord> findVehicleRecordHasEmissiontestrequirement(String inspectionRecordId) {
		List<VehicleRecord> result = null;
		try {
			result = vehicleRecordFinder.findVehicleRecordHasEmissiontestrequirement(inspectionRecordId);
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	
	public List<VehicleRecord> findVehicleRecordHasControlrequirement(String inspectionRecordId) {
		List<VehicleRecord> result = null;
		try {
			result = vehicleRecordFinder.findVehicleRecordHasControlrequirement(inspectionRecordId);
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	
	public List<VehicleRecord> findVehicleRecordByPhieuXuLyPhuId(long phieuXuLyPhuId) {
		return vehicleRecordFinder.findVehicleRecordByPhieuXuLyPhuId(phieuXuLyPhuId);
	}
	
	public List<VehicleRecord> findByDossierId(long dossierId, long codeNumber) {
		try {
			return vehicleRecordFinder.findByDossierId(dossierId, codeNumber);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public VehicleGroup findVehicleGroupByInspectionRecordId(long inspectionRecordId) {
		List<VehicleRecord> listVehicleRecord = null;
		VehicleGroup result = null;
		try {
			listVehicleRecord = vehicleRecordPersistence.findByInspectionRecordId(inspectionRecordId);
			if (listVehicleRecord != null && listVehicleRecord.size() > 0) {
				result = VehicleGroupLocalServiceUtil.fetchVehicleGroup(listVehicleRecord.get(0).getVehicleGroupId());
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	
	public int countVehicleRecord(long inspectionRecordId) {
		List<VehicleRecord> listVehicleRecord = null;
		int result = 0;
		try {
			listVehicleRecord = vehicleRecordPersistence.findByInspectionRecordId(inspectionRecordId);
			if (listVehicleRecord != null && listVehicleRecord.size() > 0) {
				result = listVehicleRecord.size();
			}
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	
	public List<VehicleRecord> findByInspectionRecordIdOrderbyAsc(long inspectionRecordId) {
		List<VehicleRecord> result = null;
		try {
			result = vehicleRecordFinder.findByInspectionRecordIdOrderbyAsc(inspectionRecordId);
		} catch (Exception e) {
			_log.error(e);
		}
		if (result == null) {
			result = new ArrayList<VehicleRecord>();
		}
		return result;
	}
	public List<VehicleRecord> findByInspectionRecordId(long inspectionRecordId) {
		List<VehicleRecord> result = null;
		try {
			result = vehicleRecordPersistence.findByInspectionRecordId(inspectionRecordId);
		} catch (Exception e) {
			_log.error(e);
		}
		if (result == null) {
			result = new ArrayList<VehicleRecord>();
		}
		return result;
	}
	public long tongChungChiDaCap(long vehiclegroupId) {
		try {
			return vehicleRecordFinder.tongChungChiDaCap(vehiclegroupId);
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	public long tongDuThaoChungChi(long vehiclegroupId) {
		try {
			return vehicleRecordFinder.tongDuThaoChungChi(vehiclegroupId);
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	public List<VehicleRecord> findByVehicleGroupId(long vehicleGroupId) {
		try {
			return vehicleRecordPersistence.findByVehicleGroupId(vehicleGroupId);
		} catch (Exception e) {
		}
		return new ArrayList<VehicleRecord>();
	}
	
	public List<VehicleRecord> findByDossierId(long dossierId) throws SystemException {
		return vehicleRecordFinder.findByDossierId(dossierId);
	}
	
	public List<VehicleRecord> findByArrayId(String arrayId) throws SystemException {
		try {
			return vehicleRecordFinder.findByArrayId(arrayId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
		
	}
	
	public VehicleRecord findByCodeNumberAndRegisteredNumber(long codeNumber, String registeredNumber) {
		return vehicleRecordFinder.findByCodeNumberAndRegisteredNumber(codeNumber, registeredNumber);
	}
	
	public VehicleRecord findByCodeNumberAndDossierId(long codeNumber, long dossierId) {
		return vehicleRecordFinder.findByCodeNumberAndDossierId(codeNumber, dossierId);
	}
	
	public List<VehicleRecord> findByConfirmedInspectionIdAndBienBanKiemTra(long confirmedInspectionId) {
		return vehicleRecordFinder.findByConfirmedInspectionIdAndBienBanKiemTra(confirmedInspectionId);
	}
	
	public int countByInspectionRecordId(long inspectionRecordId) {
		try {
			return vehicleRecordPersistence.countByInspectionRecordId(inspectionRecordId);
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	public long countByConfirmedInspectionIdAndInspectionRecordId(long confirmedInspectionId) {
		return vehicleRecordFinder.countByConfirmedInspectionIdAndInspectionRecordId(confirmedInspectionId);
	}
	
	public long countByConfirmedInspectionIdAndMarkUpStatus(long confirmedInspectionId) {
		return vehicleRecordFinder.countByConfirmedInspectionIdAndMarkUpStatus(confirmedInspectionId);
	}
	
	public int countByConfirmedInspectionId(long confirmedInspectionId) {
		try {
			return vehicleRecordPersistence.countByConfirmedInspectionId(confirmedInspectionId);
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	public List<VehicleRecord> findByInspectionRecordNumber(String inspectionRecordNumber) {
		return vehicleRecordFinder.findByInspectionRecordNumber(inspectionRecordNumber);
	}
	
	public List<VehicleRecord> findByDebitNoteId(long debitNoteId) {
		try {
			
			return vehicleRecordPersistence.findByDebitNoteId(debitNoteId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return null;
	}
	
	public List<VehicleRecord> findByDebitNoteid(long debitNoteid) {
		return vehicleRecordFinder.findByDebitNoteid(debitNoteid);
	}
	
	public long checkConfirmedInspection(long registeredinspectionid, String technicalspeccode) {
		long result = 0;
		try {
			return vehicleRecordFinder.checkConfirmedInspection(registeredinspectionid, technicalspeccode);
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	
	public long checkHoanKiemTra(long codeNumber, String chassisNumber, String engineNumber) {
		long result = 0;
		try {
			return vehicleRecordFinder.checkHoanKiemTra(codeNumber, chassisNumber, engineNumber);
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	
	public VehicleRecord getVehicleRecord(long codeNumber, String chassisNumber, String engineNumber) {
		return vehicleRecordFinder.getVehicleRecord(codeNumber, chassisNumber, engineNumber);
	}
	
	public long checkHoanKiemTraDoDaLapBienBanKiemTra(long codeNumber, String chassisNumber, String engineNumber, long hoSoThuTucId) {
		return vehicleRecordFinder.checkHoanKiemTraDoDaLapBienBanKiemTra(codeNumber, chassisNumber, engineNumber, hoSoThuTucId);
	}
	
	public long checkChuaPhanCongDonViKiemTra(long codeNumber, String chassisNumber, String engineNumber, long hoSoThuTucId) {
		
		return vehicleRecordFinder.checkChuaPhanCongDonViKiemTra(codeNumber, chassisNumber, engineNumber, hoSoThuTucId);
	}
	
	public long checkDaPhanCongDonViKiemTra(long codeNumber, String chassisNumber, String engineNumber) {
		return vehicleRecordFinder.checkDaPhanCongDonViKiemTra(codeNumber, chassisNumber, engineNumber);
	}
	
	public boolean updateVehicleRecordWithConfirmInspection(long confirmInspectionId) {
		return vehicleRecordFinder.updateVehicleRecordWithConfirmInspection(confirmInspectionId);
	}
	
	public boolean updateVehicleRecordWithConfirmedInspectionId(long confirmedInspectionId) {
		return vehicleRecordFinder.updateVehicleRecordWithConfirmedInspectionId(confirmedInspectionId);
	}
	
	public boolean updateVehicleRecordWithInspectionId(long inspectionId) {
		return vehicleRecordFinder.updateVehicleRecordWithInspectionId(inspectionId);
	}
	
	public long checkKeHoachKiemTra(long codeNumber, String chassisNumber, String engineNumber, long hoSoThuTucId) {
		return vehicleRecordFinder.checkKeHoachKiemTra(codeNumber, chassisNumber, engineNumber, hoSoThuTucId);
	}
	
	public VehicleRecord findByDossierId(long dossierId, long codeNumber, String chassisNumber, String engineNumber) {
		List<VehicleRecord> vehicleRecords = vehicleRecordFinder.findByDossierId(dossierId, codeNumber, chassisNumber, engineNumber);
		if (vehicleRecords != null && vehicleRecords.size() > 0) { 
			return vehicleRecords.get(0); 
		}
		
		return null;
	}
	
	public List<VehicleRecord> searchVehicleRecord(
		String vehicleclass, long trangThaiCuaXe, String soKhung, String soDongCo, String mauSon, String tinhTrangPhuongTien, String namSanXuat, String queryViewTimKiemHS, int start, int end) {
		
		return vehicleRecordFinder.searchVehicleRecord(vehicleclass, trangThaiCuaXe, soKhung, soDongCo, mauSon, tinhTrangPhuongTien, namSanXuat,queryViewTimKiemHS, start, end);
	}
	
	public long countSearchVehicleRecord(
		String vehicleclass, long trangThaiCuaXe, String soKhung, String soDongCo, String mauSon, String tinhTrangPhuongTien, String namSanXuat, String queryViewTimKiemHS) {
		
		return vehicleRecordFinder.countSearchVehicleRecord(vehicleclass, trangThaiCuaXe, soKhung, soDongCo, mauSon, tinhTrangPhuongTien, namSanXuat, queryViewTimKiemHS);
		
	}
	
	public long countVehicleRecordWithInspectionId(long inspectionId) {
		return vehicleRecordFinder.countVehicleRecordWithInspectionId(inspectionId);
	}
	
	public long countBySoLuongPT(String phieuxulyphuid) {
		return vehicleRecordFinder.countBySoLuongPT(phieuxulyphuid);
	}
	
	public long countBySoNhomPT(String phieuxulyphuid) {
		return vehicleRecordFinder.countBySoNhomPT(phieuxulyphuid);
	}
	
	public List<VehicleRecord> findByConfirmedInspectionIdAndVehicleGroupId(String confirmedInspectionId, String lstVehicleGroupId) {
		return vehicleRecordFinder.findByConfirmedInspectionIdAndVehicleGroupId(confirmedInspectionId, lstVehicleGroupId);
	}
	
	public boolean deleteVehicleRecordWithVehicleGroupId(long vehicleGroupId) {
		return vehicleRecordFinder.deleteVehicleRecordWithVehicleGroupId(vehicleGroupId);
		
	}
	public long countByIdVehicleGroupAndIdHoSoThuTuc(long idVehicleGroup, long idHoSoThuTuc) {
		return vehicleRecordFinder.countByIdVehicleGroupAndIdHoSoThuTuc(idVehicleGroup, idHoSoThuTuc);
	}
	public List<VehicleRecord> findByIdVehicleGroupAndIdHoSoThuTuc(long idVehicleGroup, long idHoSoThuTuc) {
		return vehicleRecordFinder.findByIdVehicleGroupAndIdHoSoThuTuc(idVehicleGroup, idHoSoThuTuc);
	}
	
	public long checkKyDuyetChungChi(long verhicleGroupId) {
		return vehicleRecordFinder.checkKyDuyetChungChi(verhicleGroupId);	
	}
	
	public List<VehicleRecord> findVehicleRecordByDebitNoteIdGroupbyCertificateRecord(long debitNoteid) {
		return vehicleRecordFinder.findVehicleRecordByDebitNoteIdGroupbyCertificateRecord(debitNoteid);	
	}
	
	public VehicleRecord getByCN_CHN_EN(long codeNumber, String chassisNumber, String engineNumber) 
			throws PortalException, SystemException {
		
		return vehicleRecordPersistence.findByCN_CHN_EN(codeNumber, chassisNumber, engineNumber);
	}
	
	private static Log _log = LogFactoryUtil.getLog(VehicleRecordLocalServiceImpl.class);
}
