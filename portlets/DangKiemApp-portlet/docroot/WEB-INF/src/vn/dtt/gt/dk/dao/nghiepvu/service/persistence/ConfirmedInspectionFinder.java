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
 * @author win_64
 */
public interface ConfirmedInspectionFinder {
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByProvinceCode(
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByPhieuXuLyPhuIdAndCorporationId(
		long idPhieuXuLyPhu, java.lang.String idCorporation);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> getListConfirmedInspection(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber, long hoSoThuTucId);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByInspectorIdAndNgayKiemTra(
		long inspectorId, java.lang.String corporationid,
		java.lang.String ngayKiemTra);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByCorporationIdAndNgayKiemTra(
		java.lang.String corporationid, java.lang.String ngayKiemTra);

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findConfirmedGroupByInspectorId(
		java.lang.String corporationid, java.lang.String ngayKiemTra);
}