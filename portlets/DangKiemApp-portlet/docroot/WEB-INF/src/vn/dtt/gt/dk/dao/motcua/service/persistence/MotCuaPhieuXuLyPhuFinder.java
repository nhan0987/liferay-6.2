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
public interface MotCuaPhieuXuLyPhuFinder {
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findDanhSachHoSo(
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int start, int end);

	public int countDanhSachHoSo(long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String maSoHoSoOrDer, int year,
		java.lang.String listIdResult, int start, int end);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String doiTuong, java.lang.String maSoHoSo,
		java.lang.String maSoBienNhan, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String maSoHoSoOrDer, int year,
		java.lang.String listIdResult, int start, int end);

	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String doiTuong, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String maSoBienNhan,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		java.lang.String listIdResult);

	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		java.lang.String listIdResult);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String corporationId, java.lang.String soDKKT, int year,
		java.lang.String listIdResult, long userId, int start, int end);

	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String corporationId, java.lang.String soDKKT, int year,
		java.lang.String listIdResult, long userId);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end);

	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year);

	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year);

	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year);

	public int countMotCuaPhieuXuLyPhuByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year);

	public int getHoSoThuTucIdByPhieuXuLyPhuId(long phieuXuLyPhuId);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> searchPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia, int start, int end);

	public int countPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia);

	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByConfirmedInspection(
		long idConfirmedInspection);
}