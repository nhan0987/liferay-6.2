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

package vn.dtt.gt.dk.dao.motcua.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author huymq
 */
public class MotCuaPhieuXuLyChinhFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh> findMotCuaPhieuXuLyChinhByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return getFinder()
				   .findMotCuaPhieuXuLyChinhByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh> findMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return getFinder()
				   .findMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,
			maSoBienNhan, nhomPhieuXuLy, organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year, start, end);
	}

	public static int countMotCuaPhieuXuLyChinhByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return getFinder()
				   .countMotCuaPhieuXuLyChinhByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}

	public static int countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return getFinder()
				   .countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,
			maSoBienNhan, nhomPhieuXuLy, organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year);
	}

	public static MotCuaPhieuXuLyChinhFinder getFinder() {
		if (_finder == null) {
			_finder = (MotCuaPhieuXuLyChinhFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaPhieuXuLyChinhFinder.class.getName());

			ReferenceRegistry.registerReference(MotCuaPhieuXuLyChinhFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(MotCuaPhieuXuLyChinhFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(MotCuaPhieuXuLyChinhFinderUtil.class,
			"_finder");
	}

	private static MotCuaPhieuXuLyChinhFinder _finder;
}