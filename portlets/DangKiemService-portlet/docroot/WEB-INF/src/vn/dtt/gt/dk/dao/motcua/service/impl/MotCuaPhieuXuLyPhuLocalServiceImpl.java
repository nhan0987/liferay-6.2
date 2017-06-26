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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;
import vn.dtt.gt.dk.dao.motcua.service.base.MotCuaPhieuXuLyPhuLocalServiceBaseImpl;

/**
 * The implementation of the mot cua phieu xu ly phu local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.base.MotCuaPhieuXuLyPhuLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil
 */
public class MotCuaPhieuXuLyPhuLocalServiceImpl
	extends MotCuaPhieuXuLyPhuLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyPhuLocalServiceUtil} to access the mot cua phieu xu ly phu local service.
	 */
	public MotCuaPhieuXuLyPhu findByPhieuXuLyChinhIdAndNoiDungHoSoId(long phieuXuLyChinhId, long noiDungHoSoId) {
		MotCuaPhieuXuLyPhu result = null;
		try {
			result =  motCuaPhieuXuLyPhuPersistence.findByPhieuXuLyChinhIdAndNoiDungHoSoId(phieuXuLyChinhId, noiDungHoSoId);
		} catch (Exception e) {
			_log.error(e);
		}
		return result;
	}
	
	public List<MotCuaPhieuXuLyPhu> findByThuTucHanhChinhIdAndToChucXuLy(long PhieuXuLyChinhId) {
		try {
			return motCuaPhieuXuLyPhuPersistence.findByPhieuXuLyChinhId(PhieuXuLyChinhId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<MotCuaPhieuXuLyPhu>();
	}

	public List<MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhIdAndNhomPhieuXuLy(long phieuXuLyChinhId, String nhomPhieuXuLy) {
		try {
			return motCuaPhieuXuLyPhuPersistence.findByPhieuXuLyChinhIdAndNhomPhieuXuLy(phieuXuLyChinhId, nhomPhieuXuLy);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<MotCuaPhieuXuLyPhu>();
	}

	public List<MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhAndTrangThaiHienTai(long phieuXuLyChinhId, long trangThaiHienTaiId) {
		try {
			return motCuaPhieuXuLyPhuPersistence.findByPhieuXuLyChinhAndTrangThaiHienTai(phieuXuLyChinhId, trangThaiHienTaiId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<MotCuaPhieuXuLyPhu>();
	}
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhId(
			long phieuXuLyChinhId){
		try{
			return motCuaPhieuXuLyPhuPersistence.findByPhieuXuLyChinhId(phieuXuLyChinhId);
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
			
	public List<MotCuaPhieuXuLyPhu> findByPhanNhomHoSoId(long phanNhomHoSoId) {
		try {
			return motCuaPhieuXuLyPhuPersistence.findByPhanNhomHoSoId(phanNhomHoSoId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<MotCuaPhieuXuLyPhu>();
	}
	
	
	public List<MotCuaPhieuXuLyPhu> findDanhSachHoSo(long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int start, int end) {
		return motCuaPhieuXuLyPhuFinder.findDanhSachHoSo(organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, start, end);
	}
	public int countDanhSachHoSo(long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep) throws SystemException {
		return motCuaPhieuXuLyPhuFinder.countDanhSachHoSo(organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep);
	}
	
	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, String maSoHoSoOrDer, int year, String listIdResult, int start, int end) {
		return motCuaPhieuXuLyPhuFinder.findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, maSoHoSoOrDer, year, listIdResult, start, end);
	}
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year, String listIdResult) {
		return motCuaPhieuXuLyPhuFinder.countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, listIdResult);
	}
	
	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId,  String doiTuong,String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, String maSoHoSoOrDer, int year, String listIdResult, int start, int end){
		return motCuaPhieuXuLyPhuFinder.findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(nhomPhieuXuLy, organizationId, phanNhomHoSoId,
				thuTucHanhChinhId,doiTuong, maSoHoSo,maSoBienNhan, ngayNopFrom, ngayNopTo, tenDoanhNghiep, maSoHoSoOrDer, year, listIdResult, start, end);
	}
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String doiTuong,String maSoHoSo, String ngayNopFrom,String maSoBienNhan,
			String ngayNopTo, String tenDoanhNghiep, int year, String listIdResult){
		return motCuaPhieuXuLyPhuFinder.countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(nhomPhieuXuLy,
				organizationId, phanNhomHoSoId, thuTucHanhChinhId,doiTuong, maSoHoSo, ngayNopFrom,maSoBienNhan, ngayNopTo, tenDoanhNghiep, year, listIdResult);
	}
	
	
	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, String corporationId, String soDKKT, int year, String listIdResult, long userId, int start, int end) {
		return motCuaPhieuXuLyPhuFinder.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, corporationId, soDKKT, year, listIdResult, userId, start, end);
	}
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId,
			String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, String corporationId, String soDKKT, int year, String listIdResult, long userId) {
		return motCuaPhieuXuLyPhuFinder.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, corporationId, soDKKT, year, listIdResult, userId);
	}
	
	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucId(String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
		return motCuaPhieuXuLyPhuFinder.findMotCuaPhieuXuLyPhuByHoSoThuTucId(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}
	
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucId(String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year) {
		return motCuaPhieuXuLyPhuFinder.countMotCuaPhieuXuLyPhuByHoSoThuTucId(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}
	
	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(String doiTuong,String maSoBienNhan,String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
		return motCuaPhieuXuLyPhuFinder.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,maSoBienNhan,nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}
	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich( String doiTuong,String maSoBienNhan,long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo,
			String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
		return motCuaPhieuXuLyPhuFinder.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich(doiTuong,maSoBienNhan,userid,nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}
	
	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra( String doiTuong,String maSoBienNhan,long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo,
			String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
		return motCuaPhieuXuLyPhuFinder.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(doiTuong,maSoBienNhan,userid,nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(String doiTuong,String maSoBienNhan,String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year) {
		return motCuaPhieuXuLyPhuFinder.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,maSoBienNhan,nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}
	
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich( String doiTuong,String maSoBienNhan,long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year) {
		return motCuaPhieuXuLyPhuFinder.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich(doiTuong,maSoBienNhan,userid,nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}
	

	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra( String doiTuong,String maSoBienNhan,long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year) {
		return motCuaPhieuXuLyPhuFinder.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(doiTuong,maSoBienNhan,userid,nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}
	
	public int getHoSoThuTucIdByPhieuXuLyPhuId(long phieuXuLyPhuId) {
		return motCuaPhieuXuLyPhuFinder.getHoSoThuTucIdByPhieuXuLyPhuId(phieuXuLyPhuId);
	}
	
	public List<MotCuaPhieuXuLyPhu> searchPhanCongDonViKiemTraByHoSoThuTucId(String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, int year,
		String quanHuyen, String tinhThanh, String quocGia, int start, int end) {
		return motCuaPhieuXuLyPhuFinder.searchPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy, organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia, start, end);
	}
	
	public int countPhanCongDonViKiemTraByHoSoThuTucId(String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
		String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia) {
		return motCuaPhieuXuLyPhuFinder.countPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy, organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia);
	}
	
	public List<MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByConfirmedInspection(long idConfirmedInspection) {
		return motCuaPhieuXuLyPhuFinder.findMotCuaPhieuXuLyPhuByConfirmedInspection(idConfirmedInspection);
	}
	
	private static Log _log = LogFactoryUtil.getLog(MotCuaPhieuXuLyPhuLocalServiceImpl.class);
	
}