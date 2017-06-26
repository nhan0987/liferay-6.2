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
public class ConfirmedInspectionFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByProvinceCode(
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia) {
		return getFinder().findByProvinceCode(quanHuyen, tinhThanh, quocGia);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByPhieuXuLyPhuIdAndCorporationId(
		long idPhieuXuLyPhu, java.lang.String idCorporation) {
		return getFinder()
				   .findByPhieuXuLyPhuIdAndCorporationId(idPhieuXuLyPhu,
			idCorporation);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> getListConfirmedInspection(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber, long hoSoThuTucId) {
		return getFinder()
				   .getListConfirmedInspection(codeNumber, chassisNumber,
			engineNumber, hoSoThuTucId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByInspectorIdAndNgayKiemTra(
		long inspectorId, java.lang.String corporationid,
		java.lang.String ngayKiemTra) {
		return getFinder()
				   .findByInspectorIdAndNgayKiemTra(inspectorId, corporationid,
			ngayKiemTra);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByCorporationIdAndNgayKiemTra(
		java.lang.String corporationid, java.lang.String ngayKiemTra) {
		return getFinder()
				   .findByCorporationIdAndNgayKiemTra(corporationid, ngayKiemTra);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findConfirmedGroupByInspectorId(
		java.lang.String corporationid, java.lang.String ngayKiemTra) {
		return getFinder()
				   .findConfirmedGroupByInspectorId(corporationid, ngayKiemTra);
	}

	public static ConfirmedInspectionFinder getFinder() {
		if (_finder == null) {
			_finder = (ConfirmedInspectionFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					ConfirmedInspectionFinder.class.getName());

			ReferenceRegistry.registerReference(ConfirmedInspectionFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ConfirmedInspectionFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ConfirmedInspectionFinderUtil.class,
			"_finder");
	}

	private static ConfirmedInspectionFinder _finder;
}