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

package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author huymq
 */
public class VehicleRecordFinderUtil {
	public static boolean updateVehicleRecordWithConfirmInspection(
		long confirmInspectionId) {
		return getFinder()
				   .updateVehicleRecordWithConfirmInspection(confirmInspectionId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordByPhieuXuLyPhuId(
		long phieuXuLyPhuId) {
		return getFinder().findVehicleRecordByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordByDebitNoteIdGroupbyCertificateRecord(
		long debitNoteid) {
		return getFinder()
				   .findVehicleRecordByDebitNoteIdGroupbyCertificateRecord(debitNoteid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordIdOrderbyAsc(
		long inspectionRecordId) {
		return getFinder().findByInspectionRecordIdOrderbyAsc(inspectionRecordId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDossierId(
		long dossierId) {
		return getFinder().findByDossierId(dossierId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDossierId(
		long dossierId, long codeNumber) {
		return getFinder().findByDossierId(dossierId, codeNumber);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDossierId(
		long dossierId, long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber) {
		return getFinder()
				   .findByDossierId(dossierId, codeNumber, chassisNumber,
			engineNumber);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDebitNoteid(
		long debitNoteid) {
		return getFinder().findByDebitNoteid(debitNoteid);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCodeNumberAndRegisteredNumber(
		long codeNumber, java.lang.String registeredNumber) {
		return getFinder()
				   .findByCodeNumberAndRegisteredNumber(codeNumber,
			registeredNumber);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCodeNumberAndDossierId(
		long codeNumber, long dossierId) {
		return getFinder().findByCodeNumberAndDossierId(codeNumber, dossierId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordNumber(
		java.lang.String inspectionRecordNumber) {
		return getFinder().findByInspectionRecordNumber(inspectionRecordNumber);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordHasSafetestrequirement(
		java.lang.String inspectionRecordId) {
		return getFinder()
				   .findVehicleRecordHasSafetestrequirement(inspectionRecordId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordHasEmissiontestrequirement(
		java.lang.String inspectionRecordId) {
		return getFinder()
				   .findVehicleRecordHasEmissiontestrequirement(inspectionRecordId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordHasControlrequirement(
		java.lang.String inspectionRecordId) {
		return getFinder()
				   .findVehicleRecordHasControlrequirement(inspectionRecordId);
	}

	public static long tongChungChiDaCap(long vehiclegroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().tongChungChiDaCap(vehiclegroupId);
	}

	public static long tongDuThaoChungChi(long vehiclegroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().tongDuThaoChungChi(vehiclegroupId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionIdAndBienBanKiemTra(
		long confirmedInspectionId) {
		return getFinder()
				   .findByConfirmedInspectionIdAndBienBanKiemTra(confirmedInspectionId);
	}

	public static long countByConfirmedInspectionIdAndMarkUpStatus(
		long confirmedInspectionId) {
		return getFinder()
				   .countByConfirmedInspectionIdAndMarkUpStatus(confirmedInspectionId);
	}

	public static long checkKyDuyetChungChi(long verhicleGroupId) {
		return getFinder().checkKyDuyetChungChi(verhicleGroupId);
	}

	public static long countByConfirmedInspectionIdAndInspectionRecordId(
		long confirmedInspectionId) {
		return getFinder()
				   .countByConfirmedInspectionIdAndInspectionRecordId(confirmedInspectionId);
	}

	public static long checkConfirmedInspection(long registeredinspectionid,
		java.lang.String technicalspeccode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .checkConfirmedInspection(registeredinspectionid,
			technicalspeccode);
	}

	public static long checkHoanKiemTraDoDaLapBienBanKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber,
		long hoSoThuTucId) {
		return getFinder()
				   .checkHoanKiemTraDoDaLapBienBanKiemTra(codeNumber,
			chassisNumber, engineNumber, hoSoThuTucId);
	}

	public static long checkChuaPhanCongDonViKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber,
		long hoSoThuTucId) {
		return getFinder()
				   .checkChuaPhanCongDonViKiemTra(codeNumber, chassisNumber,
			engineNumber, hoSoThuTucId);
	}

	public static long checkKeHoachKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber,
		long hoSoThuTucId) {
		return getFinder()
				   .checkKeHoachKiemTra(codeNumber, chassisNumber,
			engineNumber, hoSoThuTucId);
	}

	public static long checkDaPhanCongDonViKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber) {
		return getFinder()
				   .checkDaPhanCongDonViKiemTra(codeNumber, chassisNumber,
			engineNumber);
	}

	public static long checkHoanKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber) {
		return getFinder()
				   .checkHoanKiemTra(codeNumber, chassisNumber, engineNumber);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord getVehicleRecord(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber) {
		return getFinder()
				   .getVehicleRecord(codeNumber, chassisNumber, engineNumber);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord getVehicleRecordConfirmedInspectionId(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber) {
		return getFinder()
				   .getVehicleRecordConfirmedInspectionId(codeNumber,
			chassisNumber, engineNumber);
	}

	public static boolean updateVehicleRecordWithConfirmedInspectionId(
		long confirmedInspectionId) {
		return getFinder()
				   .updateVehicleRecordWithConfirmedInspectionId(confirmedInspectionId);
	}

	public static boolean updateVehicleRecordWithInspectionId(long inspectionId) {
		return getFinder().updateVehicleRecordWithInspectionId(inspectionId);
	}

	public static long countVehicleRecordWithInspectionId(long inspectionId) {
		return getFinder().countVehicleRecordWithInspectionId(inspectionId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> searchVehicleRecord(
		java.lang.String vehicleclass, long trangThaiCuaXe,
		java.lang.String soKhung, java.lang.String soDongCo,
		java.lang.String mauSon, java.lang.String tinhTrangPhuongTien,
		java.lang.String namSanXuat, java.lang.String queryViewTimKiemHS,
		int start, int end) {
		return getFinder()
				   .searchVehicleRecord(vehicleclass, trangThaiCuaXe, soKhung,
			soDongCo, mauSon, tinhTrangPhuongTien, namSanXuat,
			queryViewTimKiemHS, start, end);
	}

	public static long countSearchVehicleRecord(java.lang.String vehicleclass,
		long trangThaiCuaXe, java.lang.String soKhung,
		java.lang.String soDongCo, java.lang.String mauSon,
		java.lang.String tinhTrangPhuongTien, java.lang.String namSanXuat,
		java.lang.String queryViewTimKiemHS) {
		return getFinder()
				   .countSearchVehicleRecord(vehicleclass, trangThaiCuaXe,
			soKhung, soDongCo, mauSon, tinhTrangPhuongTien, namSanXuat,
			queryViewTimKiemHS);
	}

	public static long countBySoLuongPT(java.lang.String phieuxulyphuid) {
		return getFinder().countBySoLuongPT(phieuxulyphuid);
	}

	public static long countBySoNhomPT(java.lang.String phieuxulyphuid) {
		return getFinder().countBySoNhomPT(phieuxulyphuid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionIdAndVehicleGroupId(
		java.lang.String confirmedInspectionId,
		java.lang.String lstVehicleGroupId) {
		return getFinder()
				   .findByConfirmedInspectionIdAndVehicleGroupId(confirmedInspectionId,
			lstVehicleGroupId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByArrayId(
		java.lang.String arrayId) {
		return getFinder().findByArrayId(arrayId);
	}

	public static boolean deleteVehicleRecordWithVehicleGroupId(
		long vehicleGroupId) {
		return getFinder().deleteVehicleRecordWithVehicleGroupId(vehicleGroupId);
	}

	public static long countByIdVehicleGroupAndIdHoSoThuTuc(
		long idVehicleGroup, long idHoSoThuTuc) {
		return getFinder()
				   .countByIdVehicleGroupAndIdHoSoThuTuc(idVehicleGroup,
			idHoSoThuTuc);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByIdVehicleGroupAndIdHoSoThuTuc(
		long idVehicleGroup, long idHoSoThuTuc) {
		return getFinder()
				   .findByIdVehicleGroupAndIdHoSoThuTuc(idVehicleGroup,
			idHoSoThuTuc);
	}

	public static VehicleRecordFinder getFinder() {
		if (_finder == null) {
			_finder = (VehicleRecordFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					VehicleRecordFinder.class.getName());

			ReferenceRegistry.registerReference(VehicleRecordFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(VehicleRecordFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(VehicleRecordFinderUtil.class,
			"_finder");
	}

	private static VehicleRecordFinder _finder;
}