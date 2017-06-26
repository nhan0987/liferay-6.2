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
public class LichKiemTraHienTruongFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong> searchPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userid, int start, int end) {
		return getFinder()
				   .searchPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userid, start, end);
	}

	public static long countPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userid) {
		return getFinder()
				   .countPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userid);
	}

	public static LichKiemTraHienTruongFinder getFinder() {
		if (_finder == null) {
			_finder = (LichKiemTraHienTruongFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					LichKiemTraHienTruongFinder.class.getName());

			ReferenceRegistry.registerReference(LichKiemTraHienTruongFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(LichKiemTraHienTruongFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(LichKiemTraHienTruongFinderUtil.class,
			"_finder");
	}

	private static LichKiemTraHienTruongFinder _finder;
}