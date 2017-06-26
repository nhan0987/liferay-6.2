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
public class InspectionRecordFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByPhieuXuLyPhuIdAndCorporationId(
		long idPhieuXuLyPhu, java.lang.String idCorporation) {
		return getFinder()
				   .findByPhieuXuLyPhuIdAndCorporationId(idPhieuXuLyPhu,
			idCorporation);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByPhieuXuLyPhuIdAndCorporationIdAndMarkUp(
		long idPhieuXuLyPhu, java.lang.String idCorporation,
		int markupSafeTest, int markupEmissionTest, int markupControl) {
		return getFinder()
				   .findByPhieuXuLyPhuIdAndCorporationIdAndMarkUp(idPhieuXuLyPhu,
			idCorporation, markupSafeTest, markupEmissionTest, markupControl);
	}

	public static boolean deleteInspectionRecordSpec(long inspectionId) {
		return getFinder().deleteInspectionRecordSpec(inspectionId);
	}

	public static boolean deleteInspectionCommonstatus(long inspectionId) {
		return getFinder().deleteInspectionCommonstatus(inspectionId);
	}

	public static boolean deleteInspectionRecordAttached(long inspectionId) {
		return getFinder().deleteInspectionRecordAttached(inspectionId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByBienBanLuuTam(
		long confirmedInspectionId) {
		return getFinder().findByBienBanLuuTam(confirmedInspectionId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByAttachedFileID(
		long idAttachedFile) {
		return getFinder().findByAttachedFileID(idAttachedFile);
	}

	public static int countMaSoBienBanKiemTra(long hosothutucid,
		java.lang.String dangkySoBienBanKiemTra) {
		return getFinder()
				   .countMaSoBienBanKiemTra(hosothutucid, dangkySoBienBanKiemTra);
	}

	public static InspectionRecordFinder getFinder() {
		if (_finder == null) {
			_finder = (InspectionRecordFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					InspectionRecordFinder.class.getName());

			ReferenceRegistry.registerReference(InspectionRecordFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(InspectionRecordFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(InspectionRecordFinderUtil.class,
			"_finder");
	}

	private static InspectionRecordFinder _finder;
}