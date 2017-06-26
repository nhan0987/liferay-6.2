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

package vn.dtt.gt.dk.dao.common.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author win_64
 */
public class TthcNoidungHoSoFinderUtil {
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo findLastByHoSoThuTucIdAndMaBieuMau(
		long hoSoThuTucId, java.lang.String maBieuMau) {
		return getFinder()
				   .findLastByHoSoThuTucIdAndMaBieuMau(hoSoThuTucId, maBieuMau);
	}

	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo findBDKByHoSoThuTucIdAndTthcId(
		java.lang.String hoSoThuTucId, java.lang.String tthcId) {
		return getFinder().findBDKByHoSoThuTucIdAndTthcId(hoSoThuTucId, tthcId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId(
		long hoSoThuTucId, long bieuMauHoSoId) {
		return getFinder()
				   .findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId(hoSoThuTucId,
			bieuMauHoSoId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucIdLanCuoi(
		long hoSoThuTucId, long bieuMauHoSoId) {
		return getFinder()
				   .findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucIdLanCuoi(hoSoThuTucId,
			bieuMauHoSoId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findTthcBieuMauHoSoByThuTucHanhChinhIdFinder(
		long hoSoThuTucId, long bieuMauHoSoId) {
		return getFinder()
				   .findTthcBieuMauHoSoByThuTucHanhChinhIdFinder(hoSoThuTucId,
			bieuMauHoSoId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findTthcBieuMauHoSoByThuTucHanhChinhIdFinderEnd(
		long hoSoThuTucId, long bieuMauHoSoId) {
		return getFinder()
				   .findTthcBieuMauHoSoByThuTucHanhChinhIdFinderEnd(hoSoThuTucId,
			bieuMauHoSoId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinder(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh) {
		return getFinder()
				   .findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinder(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinderEnd(
		long hoSoThuTucId, long bieuMauHoSoId, java.lang.String maTuSinh) {
		return getFinder()
				   .findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinderEnd(hoSoThuTucId,
			bieuMauHoSoId, maTuSinh);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucId(
		long hoSoThuTucId, java.lang.String mauTrucTuyen) {
		return getFinder()
				   .findBieuMauHoSoIdAndHoSoThuTucId(hoSoThuTucId, mauTrucTuyen);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucId(
		long hoSoThuTucId, java.lang.String mauTrucTuyen1,
		java.lang.String mauTrucTuyen2) {
		return getFinder()
				   .findBieuMauHoSoIdAndHoSoThuTucId(hoSoThuTucId,
			mauTrucTuyen1, mauTrucTuyen2);
	}

	public static int countSoLuongKySo(long phieuXuLyPhuId) {
		return getFinder().countSoLuongKySo(phieuXuLyPhuId);
	}

	public static int countSoLuongDaDongDau(long phieuXuLyPhuId) {
		return getFinder().countSoLuongDaDongDau(phieuXuLyPhuId);
	}

	public static TthcNoidungHoSoFinder getFinder() {
		if (_finder == null) {
			_finder = (TthcNoidungHoSoFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					TthcNoidungHoSoFinder.class.getName());

			ReferenceRegistry.registerReference(TthcNoidungHoSoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TthcNoidungHoSoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TthcNoidungHoSoFinderUtil.class,
			"_finder");
	}

	private static TthcNoidungHoSoFinder _finder;
}