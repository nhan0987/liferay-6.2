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

/**
 * @author win_64
 */
public interface TthcHoSoThuTucFinder {
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findDanhSachHoSo(
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findDanhSachHoSoAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc findByPhieuXuLyPhuId(
		long phieuXuLyPhuId);

	public int countDanhSachHoSo(long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countDanhSachHoSofindDanhSachHoSoAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countHoSoThuTucByPhanNhomHoSoAndToChucQuanLy(
		long phannhomhosoid, long tochucquanly);

	public int countHoSoThuTucByTinNhanh(long phannhomhosoid);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> searchTraCuuThongTinHoSo(
		java.lang.String loaiThuTuc, java.lang.String soDangKiKiemTra,
		java.lang.String ngayCapDangKiFrom, java.lang.String ngayCapDangKiTo,
		long organizationId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String nguoiNhapKhau, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public int countSearchTraCuuThongTinHoSo(java.lang.String loaiThuTuc,
		java.lang.String soDangKiKiemTra, java.lang.String ngayCapDangKiFrom,
		java.lang.String ngayCapDangKiTo, long organizationId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String nguoiNhapKhau)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findByDebitNoteId(
		long idDebitNote)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findByThamsoDongboMTgateway(
		long lastHosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException;
}