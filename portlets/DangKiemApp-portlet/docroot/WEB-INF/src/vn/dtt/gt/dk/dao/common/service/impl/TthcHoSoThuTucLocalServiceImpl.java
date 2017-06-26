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

package vn.dtt.gt.dk.dao.common.service.impl;

import java.util.List;

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.service.base.TthcHoSoThuTucLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The implementation of the tthc ho so thu tuc local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.common.service.base.TthcHoSoThuTucLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.TthcHoSoThuTucLocalServiceUtil
 */
public class TthcHoSoThuTucLocalServiceImpl extends TthcHoSoThuTucLocalServiceBaseImpl {
	public List<TthcHoSoThuTuc> findDanhSachHoSo(long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int start, int end) throws SystemException {
		return tthcHoSoThuTucFinder.findDanhSachHoSo(organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, start, end);
	}
	public int countDanhSachHoSo(long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep) throws SystemException {
		return tthcHoSoThuTucFinder.countDanhSachHoSo(organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep);
	}
	
	public List<TthcHoSoThuTuc> findDanhSachHoSoAndDoiTuongAndMaSoBienNhan(String doiTuong,String maSoBienNhan,long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep, int start, int end) throws SystemException {
		return tthcHoSoThuTucFinder.findDanhSachHoSoAndDoiTuongAndMaSoBienNhan(doiTuong,maSoBienNhan,organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep, start, end);
	}
	public int countDanhSachHoSoAndDoiTuongAndMaSoBienNhan(String doiTuong,String maSoBienNhan,long organizationId, long phanNhomHoSoId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String tenDoanhNghiep) throws SystemException {
		return tthcHoSoThuTucFinder.countDanhSachHoSofindDanhSachHoSoAndDoiTuongAndMaSoBienNhan(doiTuong,maSoBienNhan,organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep);
	}
	
	public int countHoSoThuTucByPhanNhomHoSoAndToChucQuanLy(long phannhomhosoid, long tochucquanly) {
		return tthcHoSoThuTucFinder.countHoSoThuTucByPhanNhomHoSoAndToChucQuanLy(phannhomhosoid, tochucquanly);
	}
	public int countHoSoThuTucByTinNhanh(long phannhomhosoid) {
		return tthcHoSoThuTucFinder.countHoSoThuTucByTinNhanh(phannhomhosoid);
	}
	
	public TthcHoSoThuTuc fetchByMaSoHoSo(String maSoHoSo) {
		try {
			return tthcHoSoThuTucPersistence.fetchByMaSoHoSo(maSoHoSo);
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return null;
	}
	
	public TthcHoSoThuTuc findByPhieuXuLyPhuId(long phieuXuLyPhuId) {
		return tthcHoSoThuTucFinder.findByPhieuXuLyPhuId(phieuXuLyPhuId);
	}
	
	public List<TthcHoSoThuTuc> searchTraCuuThongTinHoSo(String loaiThuTuc, String soDangKiKiemTra, String ngayCapDangKiFrom, String ngayCapDangKiTo,
		long organizationId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String nguoiNhapKhau, int start, int end) {
		
		try {
			return tthcHoSoThuTucFinder.searchTraCuuThongTinHoSo(loaiThuTuc, soDangKiKiemTra, ngayCapDangKiFrom, ngayCapDangKiTo, organizationId, thuTucHanhChinhId,
				maSoHoSo, ngayNopFrom, ngayNopTo, nguoiNhapKhau, start, end);
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return null;
	}
	
	public int countSearchTraCuuThongTinHoSo(String loaiThuTuc, String soDangKiKiemTra, String ngayCapDangKiFrom, String ngayCapDangKiTo,
		long organizationId, String thuTucHanhChinhId, String maSoHoSo, String ngayNopFrom, String ngayNopTo, String nguoiNhapKhau) throws SystemException {
	
		return tthcHoSoThuTucFinder.countSearchTraCuuThongTinHoSo(loaiThuTuc, soDangKiKiemTra, ngayCapDangKiFrom, ngayCapDangKiTo, organizationId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, nguoiNhapKhau);
	}
	
	public List<TthcHoSoThuTuc> findByDebitNoteId(long idDebitNote) throws SystemException {
		return tthcHoSoThuTucFinder.findByDebitNoteId(idDebitNote);
	}
	
	public List<TthcHoSoThuTuc> findByThamsoDongboMTgateway(long lastHosothutucId) throws SystemException {
		return tthcHoSoThuTucFinder.findByThamsoDongboMTgateway(lastHosothutucId);
	}
	
	private static Log _log = LogFactoryUtil.getLog(TthcHoSoThuTucLocalServiceImpl.class);
}