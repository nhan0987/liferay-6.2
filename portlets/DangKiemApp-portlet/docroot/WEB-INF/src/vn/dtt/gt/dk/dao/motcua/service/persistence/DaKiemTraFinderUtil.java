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
 * @author win_64
 */
public class DaKiemTraFinderUtil {
	public static int countByMotCuaPhieuXuLyPhu(java.lang.String doiTuong,
		java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return getFinder()
				   .countByMotCuaPhieuXuLyPhu(doiTuong, maSoBienNhan, userid,
			nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId,
			maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.DaKiemTra> findByMotCuaPhieuXuLyPhu(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return getFinder()
				   .findByMotCuaPhieuXuLyPhu(doiTuong, maSoBienNhan, userid,
			nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId,
			maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.DaKiemTra> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return getFinder()
				   .findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	public static int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return getFinder()
				   .countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year);
	}

	public static DaKiemTraFinder getFinder() {
		if (_finder == null) {
			_finder = (DaKiemTraFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					DaKiemTraFinder.class.getName());

			ReferenceRegistry.registerReference(DaKiemTraFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DaKiemTraFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DaKiemTraFinderUtil.class, "_finder");
	}

	private static DaKiemTraFinder _finder;
}