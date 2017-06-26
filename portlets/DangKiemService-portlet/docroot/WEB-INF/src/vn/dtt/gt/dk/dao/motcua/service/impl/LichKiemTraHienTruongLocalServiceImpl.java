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

import vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong;
import vn.dtt.gt.dk.dao.motcua.service.base.LichKiemTraHienTruongLocalServiceBaseImpl;

/**
 * The implementation of the lich kiem tra hien truong local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.motcua.service.LichKiemTraHienTruongLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.base.LichKiemTraHienTruongLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.LichKiemTraHienTruongLocalServiceUtil
 */
public class LichKiemTraHienTruongLocalServiceImpl
	extends LichKiemTraHienTruongLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.motcua.service.LichKiemTraHienTruongLocalServiceUtil} to access the lich kiem tra hien truong local service.
	 */
	public List<LichKiemTraHienTruong> searchPhanCongDonViKiemTraByHoSoThuTucId(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia, long userid,int start, int end) {
		try{
			return lichKiemTraHienTruongFinder.searchPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,userid, start, end);
		}catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public long countPhanCongDonViKiemTraByHoSoThuTucId(
			String nhomPhieuXuLy, long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String maSoBienNhan, String ngayNopFrom,
			String ngayNopTo, int year, String quanHuyen, String tinhThanh, String quocGia,long userid) {
		try{
			return lichKiemTraHienTruongFinder.countPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy, organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,userid);
		}catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	private static Log _log = LogFactoryUtil.getLog(LichKiemTraHienTruongLocalServiceImpl.class);
}