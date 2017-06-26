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

package vn.dtt.gt.dk.dao.motcua.service.impl;

import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra;
import vn.dtt.gt.dk.dao.motcua.service.base.PhanCongDonViKiemTraLocalServiceBaseImpl;

/**
 * The implementation of the phan cong don vi kiem tra local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.motcua.service.PhanCongDonViKiemTraLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.base.PhanCongDonViKiemTraLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.PhanCongDonViKiemTraLocalServiceUtil
 */
public class PhanCongDonViKiemTraLocalServiceImpl
	extends PhanCongDonViKiemTraLocalServiceBaseImpl {
	
	public long countPhanCongDonViKiemTra(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia) {
		
		return phanCongDonViKiemTraFinder.countPhanCongDonViKiemTra(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia); 
	}
	
	public long countPhanCongDonViKiemTraHienTruong(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userId) {
		
		return phanCongDonViKiemTraFinder.countPhanCongDonViKiemTraHienTruong(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,userId);
	}
	
	public long countLichKiemTraHienTruong(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userId) {
		
		return phanCongDonViKiemTraFinder.countLichKiemTraHienTruong(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,userId);
	}
	
	public List<PhanCongDonViKiemTra> findPhanCongDonViKiemTra(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia, int start, int end) {
		
		return phanCongDonViKiemTraFinder.findPhanCongDonViKiemTra(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia, start, end);
	}
	
	public List<PhanCongDonViKiemTra> findPhanCongDonViKiemTraHienTruong(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userId, int start, int end) {
		
		return phanCongDonViKiemTraFinder.findPhanCongDonViKiemTraHienTruong(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,userId, start, end);
	}

	public List findLichKiemTraHienTruong(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userId, int start, int end) {
		
		return phanCongDonViKiemTraFinder.findLichKiemTraHienTruong(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,userId, start, end);
	}
	
	@Deprecated
	public List<PhanCongDonViKiemTra> searchPhanCongDonViKiemTraByHoSoThuTucId(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia, int start, int end) {
		
		return phanCongDonViKiemTraFinder.searchPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia, start, end);
	}
	
	@Deprecated
	public long countPhanCongDonViKiemTraByHoSoThuTucId(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia) {
		
		return phanCongDonViKiemTraFinder.countPhanCongDonViKiemTra(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia); 
	}
	
	@Deprecated
	public List<PhanCongDonViKiemTra> searchPhanCongKiemTraKiemTraHienTruong(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userId, int start, int end) {
		
		return phanCongDonViKiemTraFinder.findPhanCongDonViKiemTraHienTruong(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,userId, start, end);
	}

	@Deprecated
	public long countPhanCongKiemTraHienTruong(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userId) {
		
		return phanCongDonViKiemTraFinder.countPhanCongDonViKiemTraHienTruong(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,userId);
	}
	
	@Deprecated
	public List<PhanCongDonViKiemTra> searchLichKiemTraHienTruong(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userId, int start, int end) {
		
		return phanCongDonViKiemTraFinder.findLichKiemTraHienTruong(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,userId, start, end);
	}

	@Deprecated
	public long countLichKiemTraHienTruong1(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userId) {
		
		return phanCongDonViKiemTraFinder.countLichKiemTraHienTruong1(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,userId);
	}
}