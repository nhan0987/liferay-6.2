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

import vn.dtt.gt.dk.dao.motcua.model.DaKiemTra;
import vn.dtt.gt.dk.dao.motcua.service.base.DaKiemTraLocalServiceBaseImpl;

/**
 * The implementation of the da kiem tra local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.motcua.service.DaKiemTraLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.base.DaKiemTraLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.DaKiemTraLocalServiceUtil
 */
public class DaKiemTraLocalServiceImpl extends DaKiemTraLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.motcua.service.DaKiemTraLocalServiceUtil} to access the da kiem tra local service.
	 */
	public int countByMotCuaPhieuXuLyPhu( String doiTuong,String maSoBienNhan,long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year) {
		
		return daKiemTraFinder.countByMotCuaPhieuXuLyPhu(doiTuong, maSoBienNhan, userid, nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}
	
	public List findByMotCuaPhieuXuLyPhu( String doiTuong,String maSoBienNhan,long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo,
			String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
		
		return daKiemTraFinder.findByMotCuaPhieuXuLyPhu(doiTuong, maSoBienNhan, userid, nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}
	
	@Deprecated
	public List<DaKiemTra> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra( String doiTuong,String maSoBienNhan,long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo,
			String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int year, int start, int end) {
		
		return daKiemTraFinder.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(doiTuong, maSoBienNhan, userid, nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}
	
	@Deprecated
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra( String doiTuong,String maSoBienNhan,long userid,
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom,
			String ngayNopTo, String tenDoanhNghiep, int year) {
		
		return daKiemTraFinder.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(doiTuong, maSoBienNhan, userid, nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}
	
	private static Log _log = LogFactoryUtil.getLog(DaKiemTraLocalServiceImpl.class);
}