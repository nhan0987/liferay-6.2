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
public class TthcHoSoThuTucFinderUtil {
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findDanhSachHoSo(
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findDanhSachHoSo(organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, start, end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findDanhSachHoSoAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findDanhSachHoSoAndDoiTuongAndMaSoBienNhan(doiTuong,
			maSoBienNhan, organizationId, phanNhomHoSoId, thuTucHanhChinhId,
			maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, start, end);
	}

	public static vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc findByPhieuXuLyPhuId(
		long phieuXuLyPhuId) {
		return getFinder().findByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	public static int countDanhSachHoSo(long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDanhSachHoSo(organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep);
	}

	public static int countDanhSachHoSofindDanhSachHoSoAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDanhSachHoSofindDanhSachHoSoAndDoiTuongAndMaSoBienNhan(doiTuong,
			maSoBienNhan, organizationId, phanNhomHoSoId, thuTucHanhChinhId,
			maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep);
	}

	public static int countHoSoThuTucByPhanNhomHoSoAndToChucQuanLy(
		long phannhomhosoid, long tochucquanly) {
		return getFinder()
				   .countHoSoThuTucByPhanNhomHoSoAndToChucQuanLy(phannhomhosoid,
			tochucquanly);
	}

	public static int countHoSoThuTucByTinNhanh(long phannhomhosoid) {
		return getFinder().countHoSoThuTucByTinNhanh(phannhomhosoid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> searchTraCuuThongTinHoSo(
		java.lang.String loaiThuTuc, java.lang.String soDangKiKiemTra,
		java.lang.String ngayCapDangKiFrom, java.lang.String ngayCapDangKiTo,
		long organizationId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String nguoiNhapKhau, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .searchTraCuuThongTinHoSo(loaiThuTuc, soDangKiKiemTra,
			ngayCapDangKiFrom, ngayCapDangKiTo, organizationId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, nguoiNhapKhau,
			start, end);
	}

	public static int countSearchTraCuuThongTinHoSo(
		java.lang.String loaiThuTuc, java.lang.String soDangKiKiemTra,
		java.lang.String ngayCapDangKiFrom, java.lang.String ngayCapDangKiTo,
		long organizationId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String nguoiNhapKhau)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countSearchTraCuuThongTinHoSo(loaiThuTuc, soDangKiKiemTra,
			ngayCapDangKiFrom, ngayCapDangKiTo, organizationId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, nguoiNhapKhau);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findByDebitNoteId(
		long idDebitNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByDebitNoteId(idDebitNote);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findByThamsoDongboMTgateway(
		long lastHosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByThamsoDongboMTgateway(lastHosothutucId);
	}

	public static TthcHoSoThuTucFinder getFinder() {
		if (_finder == null) {
			_finder = (TthcHoSoThuTucFinder)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					TthcHoSoThuTucFinder.class.getName());

			ReferenceRegistry.registerReference(TthcHoSoThuTucFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TthcHoSoThuTucFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TthcHoSoThuTucFinderUtil.class,
			"_finder");
	}

	private static TthcHoSoThuTucFinder _finder;
}