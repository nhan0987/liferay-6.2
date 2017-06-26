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
public class PhanCongDonViKiemTraFinderUtil {
	public static long countPhanCongDonViKiemTra(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia) {
		return getFinder()
				   .countPhanCongDonViKiemTra(nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> findPhanCongDonViKiemTra(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, int start, int end) {
		return getFinder()
				   .findPhanCongDonViKiemTra(nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia, start,
			end);
	}

	public static long countPhanCongDonViKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId) {
		return getFinder()
				   .countPhanCongDonViKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> findPhanCongDonViKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end) {
		return getFinder()
				   .findPhanCongDonViKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId, start, end);
	}

	public static long countLichKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId) {
		return getFinder()
				   .countLichKiemTraHienTruong(nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia, userId);
	}

	public static java.util.List findLichKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end) {
		return getFinder()
				   .findLichKiemTraHienTruong(nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,
			userId, start, end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> searchPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, int start, int end) {
		return getFinder()
				   .searchPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, start, end);
	}

	public static long countPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia) {
		return getFinder()
				   .countPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> searchPhanCongKiemTraKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end) {
		return getFinder()
				   .searchPhanCongKiemTraKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId, start, end);
	}

	public static long countPhanCongKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId) {
		return getFinder()
				   .countPhanCongKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> searchLichKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end) {
		return getFinder()
				   .searchLichKiemTraHienTruong(nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,
			userId, start, end);
	}

	public static long countLichKiemTraHienTruong1(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId) {
		return getFinder()
				   .countLichKiemTraHienTruong1(nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia, userId);
	}

	public static PhanCongDonViKiemTraFinder getFinder() {
		if (_finder == null) {
			_finder = (PhanCongDonViKiemTraFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					PhanCongDonViKiemTraFinder.class.getName());

			ReferenceRegistry.registerReference(PhanCongDonViKiemTraFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(PhanCongDonViKiemTraFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(PhanCongDonViKiemTraFinderUtil.class,
			"_finder");
	}

	private static PhanCongDonViKiemTraFinder _finder;
}