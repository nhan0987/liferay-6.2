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

/**
 * @author win_64
 */
public interface PhanCongDonViKiemTraFinder {
	public long countPhanCongDonViKiemTra(java.lang.String nhomPhieuXuLy,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String maSoBienNhan, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> findPhanCongDonViKiemTra(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, int start, int end);

	public long countPhanCongDonViKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> findPhanCongDonViKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end);

	public long countLichKiemTraHienTruong(java.lang.String nhomPhieuXuLy,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String maSoBienNhan, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia, long userId);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> findLichKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> searchPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, int start, int end);

	public long countPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> searchPhanCongKiemTraKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end);

	public long countPhanCongKiemTraHienTruong(java.lang.String nhomPhieuXuLy,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String maSoBienNhan, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia, long userId);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> searchLichKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end);

	public long countLichKiemTraHienTruong1(java.lang.String nhomPhieuXuLy,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String maSoBienNhan, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia, long userId);
}