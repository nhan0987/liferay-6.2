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

/**
 * @author huymq
 */
public interface VehicleRecordFinder {
	public boolean updateVehicleRecordWithConfirmInspection(
		long confirmInspectionId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordByPhieuXuLyPhuId(
		long phieuXuLyPhuId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordByDebitNoteIdGroupbyCertificateRecord(
		long debitNoteid);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordIdOrderbyAsc(
		long inspectionRecordId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDossierId(
		long dossierId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDossierId(
		long dossierId, long codeNumber);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDossierId(
		long dossierId, long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDebitNoteid(
		long debitNoteid);

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCodeNumberAndRegisteredNumber(
		long codeNumber, java.lang.String registeredNumber);

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCodeNumberAndDossierId(
		long codeNumber, long dossierId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordNumber(
		java.lang.String inspectionRecordNumber);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordHasSafetestrequirement(
		java.lang.String inspectionRecordId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordHasEmissiontestrequirement(
		java.lang.String inspectionRecordId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findVehicleRecordHasControlrequirement(
		java.lang.String inspectionRecordId);

	public long tongChungChiDaCap(long vehiclegroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public long tongDuThaoChungChi(long vehiclegroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionIdAndBienBanKiemTra(
		long confirmedInspectionId);

	public long countByConfirmedInspectionIdAndMarkUpStatus(
		long confirmedInspectionId);

	public long checkKyDuyetChungChi(long verhicleGroupId);

	public long countByConfirmedInspectionIdAndInspectionRecordId(
		long confirmedInspectionId);

	public long checkConfirmedInspection(long registeredinspectionid,
		java.lang.String technicalspeccode)
		throws com.liferay.portal.kernel.exception.SystemException;

	public long checkHoanKiemTraDoDaLapBienBanKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber,
		long hoSoThuTucId);

	public long checkChuaPhanCongDonViKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber,
		long hoSoThuTucId);

	public long checkKeHoachKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber,
		long hoSoThuTucId);

	public long checkDaPhanCongDonViKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber);

	public long checkHoanKiemTra(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber);

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord getVehicleRecord(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber);

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord getVehicleRecordConfirmedInspectionId(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber);

	public boolean updateVehicleRecordWithConfirmedInspectionId(
		long confirmedInspectionId);

	public boolean updateVehicleRecordWithInspectionId(long inspectionId);

	public long countVehicleRecordWithInspectionId(long inspectionId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> searchVehicleRecord(
		java.lang.String vehicleclass, long trangThaiCuaXe,
		java.lang.String soKhung, java.lang.String soDongCo,
		java.lang.String mauSon, java.lang.String tinhTrangPhuongTien,
		java.lang.String namSanXuat, java.lang.String queryViewTimKiemHS,
		int start, int end);

	public long countSearchVehicleRecord(java.lang.String vehicleclass,
		long trangThaiCuaXe, java.lang.String soKhung,
		java.lang.String soDongCo, java.lang.String mauSon,
		java.lang.String tinhTrangPhuongTien, java.lang.String namSanXuat,
		java.lang.String queryViewTimKiemHS);

	public long countBySoLuongPT(java.lang.String phieuxulyphuid);

	public long countBySoNhomPT(java.lang.String phieuxulyphuid);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionIdAndVehicleGroupId(
		java.lang.String confirmedInspectionId,
		java.lang.String lstVehicleGroupId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByArrayId(
		java.lang.String arrayId);

	public boolean deleteVehicleRecordWithVehicleGroupId(long vehicleGroupId);

	public long countByIdVehicleGroupAndIdHoSoThuTuc(long idVehicleGroup,
		long idHoSoThuTuc);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByIdVehicleGroupAndIdHoSoThuTuc(
		long idVehicleGroup, long idHoSoThuTuc);
}