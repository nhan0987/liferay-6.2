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
public interface VehiclerecordInitialFinder {
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findVehiclerecordInitialByPhieuXuLyPhuId(
		long phieuXuLyPhuId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByDossierId(
		long dossierId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByDossierId(
		long dossierId, long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByDebitNoteid(
		long debitNoteid);

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByCodeNumberAndRegisteredNumber(
		long codeNumber, java.lang.String registeredNumber);

	public boolean updateVehiclerecordInitialWithConfirmInspection(
		long confirmInspectionId);

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByCodeNumberAndDossierId(
		long codeNumber, long dossierId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByInspectionRecordNumber(
		java.lang.String inspectionRecordNumber);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findVehiclerecordInitialHasSafetestrequirement(
		java.lang.String inspectionRecordId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findVehiclerecordInitialHasEmissiontestrequirement(
		java.lang.String inspectionRecordId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findVehiclerecordInitialHasControlrequirement(
		java.lang.String inspectionRecordId);

	public long tongChungChiDaCap(long vehiclegroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public long tongDuThaoChungChi(long vehiclegroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByConfirmedInspectionIdAndBienBanKiemTra(
		long confirmedInspectionId);

	public long countByConfirmedInspectionIdAndMarkUpStatus(
		long confirmedInspectionId);

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

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial getVehiclerecordInitial(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber);

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial getVehiclerecordInitialConfirmedInspectionId(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber);

	public boolean updateVehiclerecordInitialWithConfirmedInspectionId(
		long confirmedInspectionId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByArrayId(
		java.lang.String arrayId);

	public boolean deleteVehicleRecordInitialWithVehicleGroupId(
		long vehicleGroupId);
}