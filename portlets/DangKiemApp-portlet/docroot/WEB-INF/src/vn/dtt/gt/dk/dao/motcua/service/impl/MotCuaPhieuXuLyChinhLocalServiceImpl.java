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

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh;
import vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhImpl;
import vn.dtt.gt.dk.dao.motcua.service.base.MotCuaPhieuXuLyChinhLocalServiceBaseImpl;

/**
 * The implementation of the mot cua phieu xu ly chinh local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.base.MotCuaPhieuXuLyChinhLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.MotCuaPhieuXuLyChinhLocalServiceUtil
 */
public class MotCuaPhieuXuLyChinhLocalServiceImpl
	extends MotCuaPhieuXuLyChinhLocalServiceBaseImpl {
	
	public MotCuaPhieuXuLyChinh findByHoSoThuTucIdAndQuyTrinhThuTucId(long HoSoThuTucId, long QuyTrinhThuTucId) {
		try {
			return motCuaPhieuXuLyChinhPersistence.findByHoSoThuTucIdAndQuyTrinhThuTucId(HoSoThuTucId, QuyTrinhThuTucId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new MotCuaPhieuXuLyChinhImpl();
	}
	public MotCuaPhieuXuLyChinh findByHoSoThuTucId(
			long hoSoThuTucId){
		try {
			return motCuaPhieuXuLyChinhPersistence.findByHoSoThuTucId(hoSoThuTucId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new MotCuaPhieuXuLyChinhImpl();
	}
	
	public List<MotCuaPhieuXuLyChinh> findMotCuaPhieuXuLyChinhByHoSoThuTucId(String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String hoSoThuTucId, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
		try {
			return motCuaPhieuXuLyChinhFinder.findMotCuaPhieuXuLyChinhByHoSoThuTucId(nhomPhieuXuLy, organizationId, 
				phanNhomHoSoId, thuTucHanhChinhId, hoSoThuTucId, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		List<MotCuaPhieuXuLyChinh> chinhs  = new ArrayList<MotCuaPhieuXuLyChinh>();
		return chinhs;
	}
	
	public int countMotCuaPhieuXuLyChinhByHoSoThuTucId(String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String hoSoThuTucId, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year) {
		try {
			return motCuaPhieuXuLyChinhFinder.countMotCuaPhieuXuLyChinhByHoSoThuTucId(nhomPhieuXuLy, organizationId, phanNhomHoSoId,
				thuTucHanhChinhId, hoSoThuTucId, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	public List<MotCuaPhieuXuLyChinh> findMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(String doiTuong,String maSoBienNhan,String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String hoSoThuTucId, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
		try {
			return motCuaPhieuXuLyChinhFinder.findMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,maSoBienNhan,nhomPhieuXuLy, organizationId, 
				phanNhomHoSoId, thuTucHanhChinhId, hoSoThuTucId, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		List<MotCuaPhieuXuLyChinh> chinhs  = new ArrayList<MotCuaPhieuXuLyChinh>();
		return chinhs;
	}
	
	public int countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(String doiTuong,String maSoBienNhan,String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String hoSoThuTucId, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year) {
		try {
			return motCuaPhieuXuLyChinhFinder.countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,maSoBienNhan,nhomPhieuXuLy, organizationId, phanNhomHoSoId,
				thuTucHanhChinhId, hoSoThuTucId, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	private static Log _log = LogFactoryUtil.getLog(MotCuaPhieuXuLyChinhLocalServiceImpl.class);
	
}