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
public interface InspectionRecordFinder {
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByPhieuXuLyPhuIdAndCorporationId(
		long idPhieuXuLyPhu, java.lang.String idCorporation);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByPhieuXuLyPhuIdAndCorporationIdAndMarkUp(
		long idPhieuXuLyPhu, java.lang.String idCorporation,
		int markupSafeTest, int markupEmissionTest, int markupControl);

	public boolean deleteInspectionRecordSpec(long inspectionId);

	public boolean deleteInspectionCommonstatus(long inspectionId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByBienBanLuuTam(
		long confirmedInspectionId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByAttachedFileID(
		long idAttachedFile);
}