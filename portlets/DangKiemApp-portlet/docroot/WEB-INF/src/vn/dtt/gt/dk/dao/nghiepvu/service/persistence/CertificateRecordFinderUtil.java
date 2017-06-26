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
 * @author win_64
 */
public class CertificateRecordFinderUtil {
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord getCertificateRecord(
		java.lang.String certificateNumber) {
		return getFinder().getCertificateRecord(certificateNumber);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findCertificateRecord(
		java.lang.String schema, java.lang.String soChungChi,
		long organizationId, java.lang.String thuTucHanhChinhId,
		java.lang.String doiTuong, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int year, int start, int end) {
		return getFinder()
				   .findCertificateRecord(schema, soChungChi, organizationId,
			thuTucHanhChinhId, doiTuong, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year, start, end);
	}

	public static int countCertificateRecord(java.lang.String schema,
		java.lang.String soChungChi, long organizationId,
		java.lang.String thuTucHanhChinhId, java.lang.String doiTuong,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return getFinder()
				   .countCertificateRecord(schema, soChungChi, organizationId,
			thuTucHanhChinhId, doiTuong, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierIdAndInspectionReportIdAndStampStatus(
		long dossierId, long inspectionReportId) {
		return getFinder()
				   .findByDossierIdAndInspectionReportIdAndStampStatus(dossierId,
			inspectionReportId);
	}

	public static int countSoLuongChoDongDau(long phieuXuLyPhuId) {
		return getFinder().countSoLuongChoDongDau(phieuXuLyPhuId);
	}

	public static boolean deleteCertificateSpecWithCertificateId(
		long certificateId) {
		return getFinder().deleteCertificateSpecWithCertificateId(certificateId);
	}

	public static boolean deleteCertificateCircularWithCertificateId(
		long certificateId) {
		return getFinder()
				   .deleteCertificateCircularWithCertificateId(certificateId);
	}

	public static CertificateRecordFinder getFinder() {
		if (_finder == null) {
			_finder = (CertificateRecordFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					CertificateRecordFinder.class.getName());

			ReferenceRegistry.registerReference(CertificateRecordFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(CertificateRecordFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(CertificateRecordFinderUtil.class,
			"_finder");
	}

	private static CertificateRecordFinder _finder;
}