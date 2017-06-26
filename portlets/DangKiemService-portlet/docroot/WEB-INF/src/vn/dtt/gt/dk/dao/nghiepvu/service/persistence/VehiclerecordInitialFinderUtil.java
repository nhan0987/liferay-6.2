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
public class VehiclerecordInitialFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findVehiclerecordInitialByPhieuXuLyPhuId(
		long phieuXuLyPhuId) {
		return getFinder()
				   .findVehiclerecordInitialByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByDossierId(
		long dossierId) {
		return getFinder().findByDossierId(dossierId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByDossierId(
		long dossierId, long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber) {
		return getFinder()
				   .findByDossierId(dossierId, codeNumber, chassisNumber,
			engineNumber);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByDebitNoteid(
		long debitNoteid) {
		return getFinder().findByDebitNoteid(debitNoteid);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByCodeNumberAndRegisteredNumber(
		long codeNumber, java.lang.String registeredNumber) {
		return getFinder()
				   .findByCodeNumberAndRegisteredNumber(codeNumber,
			registeredNumber);
	}

	public static boolean updateVehiclerecordInitialWithConfirmInspection(
		long confirmInspectionId) {
		return getFinder()
				   .updateVehiclerecordInitialWithConfirmInspection(confirmInspectionId);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByCodeNumberAndDossierId(
		long codeNumber, long dossierId) {
		return getFinder().findByCodeNumberAndDossierId(codeNumber, dossierId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByInspectionRecordNumber(
		java.lang.String inspectionRecordNumber) {
		return getFinder().findByInspectionRecordNumber(inspectionRecordNumber);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findVehiclerecordInitialHasSafetestrequirement(
		java.lang.String inspectionRecordId) {
		return getFinder()
				   .findVehiclerecordInitialHasSafetestrequirement(inspectionRecordId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findVehiclerecordInitialHasEmissiontestrequirement(
		java.lang.String inspectionRecordId) {
		return getFinder()
				   .findVehiclerecordInitialHasEmissiontestrequirement(inspectionRecordId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findVehiclerecordInitialHasControlrequirement(
		java.lang.String inspectionRecordId) {
		return getFinder()
				   .findVehiclerecordInitialHasControlrequirement(inspectionRecordId);
	}

	public static long tongChungChiDaCap(long vehiclegroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().tongChungChiDaCap(vehiclegroupId);
	}

	public static long tongDuThaoChungChi(long vehiclegroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().tongDuThaoChungChi(vehiclegroupId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByConfirmedInspectionIdAndBienBanKiemTra(
		long confirmedInspectionId) {
		return getFinder()
				   .findByConfirmedInspectionIdAndBienBanKiemTra(confirmedInspectionId);
	}

	public static long countByConfirmedInspectionIdAndMarkUpStatus(
		long confirmedInspectionId) {
		return getFinder()
				   .countByConfirmedInspectionIdAndMarkUpStatus(confirmedInspectionId);
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

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial getVehiclerecordInitial(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber) {
		return getFinder()
				   .getVehiclerecordInitial(codeNumber, chassisNumber,
			engineNumber);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial getVehiclerecordInitialConfirmedInspectionId(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber) {
		return getFinder()
				   .getVehiclerecordInitialConfirmedInspectionId(codeNumber,
			chassisNumber, engineNumber);
	}

	public static boolean updateVehiclerecordInitialWithConfirmedInspectionId(
		long confirmedInspectionId) {
		return getFinder()
				   .updateVehiclerecordInitialWithConfirmedInspectionId(confirmedInspectionId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByArrayId(
		java.lang.String arrayId) {
		return getFinder().findByArrayId(arrayId);
	}

	public static boolean deleteVehicleRecordInitialWithVehicleGroupId(
		long vehicleGroupId) {
		return getFinder()
				   .deleteVehicleRecordInitialWithVehicleGroupId(vehicleGroupId);
	}

	public static VehiclerecordInitialFinder getFinder() {
		if (_finder == null) {
			_finder = (VehiclerecordInitialFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					VehiclerecordInitialFinder.class.getName());

			ReferenceRegistry.registerReference(VehiclerecordInitialFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(VehiclerecordInitialFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(VehiclerecordInitialFinderUtil.class,
			"_finder");
	}

	private static VehiclerecordInitialFinder _finder;
}