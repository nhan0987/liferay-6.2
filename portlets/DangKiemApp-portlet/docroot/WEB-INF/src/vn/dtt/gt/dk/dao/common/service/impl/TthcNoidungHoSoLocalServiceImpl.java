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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.service.base.TthcNoidungHoSoLocalServiceBaseImpl;

/**
 * The implementation of the tthc noidung ho so local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.common.service.base.TthcNoidungHoSoLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil
 */
public class TthcNoidungHoSoLocalServiceImpl
	extends TthcNoidungHoSoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil} to access the tthc noidung ho so local service.
	 */
	public List<TthcNoidungHoSo> findTthcBieuMauHoSoByThuTucHanhChinhId(long hoSoThuTucId, long bieuMauHoSoId) {
		try {
			return tthcNoidungHoSoPersistence.findByBieuMauHoSoIdAndHoSoThuTucId(hoSoThuTucId, bieuMauHoSoId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new ArrayList<TthcNoidungHoSo>();
	}
	
	public TthcNoidungHoSo findByVehicleRecordId(
			long vehicleRecordId){
		try{
			return tthcNoidungHoSoPersistence.fetchByVehicleRecordId(vehicleRecordId);
		}catch (SystemException e) {
			_log.error(e);
		}
		
		return null;
	}
	public List<TthcNoidungHoSo> findTthcBieuMauHoSoByThuTucHanhChinhIdFinder(long hoSoThuTucId, long bieuMauHoSoId) {
		return tthcNoidungHoSoFinder.findTthcBieuMauHoSoByThuTucHanhChinhIdFinder(hoSoThuTucId, bieuMauHoSoId);
	}
	
	public List<TthcNoidungHoSo> findTthcBieuMauHoSoByThuTucHanhChinhIdFinderEnd(long hoSoThuTucId, long bieuMauHoSoId) {
		return tthcNoidungHoSoFinder.findTthcBieuMauHoSoByThuTucHanhChinhIdFinderEnd(hoSoThuTucId, bieuMauHoSoId);
	}
	public TthcNoidungHoSo findLastByHoSoThuTucIdAndMaBieuMau(long hoSoThuTucId, String maBieuMau) {
		return tthcNoidungHoSoFinder.findLastByHoSoThuTucIdAndMaBieuMau(hoSoThuTucId, maBieuMau);
	}
	
	public TthcNoidungHoSo findBDKByHoSoThuTucIdAndTthcId(String hoSoThuTucId, String tthcId) {
		return tthcNoidungHoSoFinder.findBDKByHoSoThuTucIdAndTthcId(hoSoThuTucId, tthcId);
	}
	
	public int countByBieuMauHoSoIdAndHoSoThuTucId(long hoSoThuTucId, long bieuMauHoSoId) {
		try {
			return tthcNoidungHoSoPersistence.countByBieuMauHoSoIdAndHoSoThuTucId(hoSoThuTucId, bieuMauHoSoId);
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return 0;
	}
	
	public List<TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh) {
		try {
			return tthcNoidungHoSoPersistence.findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(hoSoThuTucId, bieuMauHoSoId, maTuSinh);
		} catch (SystemException e) {
			_log.error(e);
		}

		return new ArrayList<TthcNoidungHoSo>();
	}
	public List<TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinder(long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh) {
		return tthcNoidungHoSoFinder.findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinder(hoSoThuTucId, bieuMauHoSoId, maTuSinh);
	}
	
	public List<TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinderEnd(long hoSoThuTucId, long bieuMauHoSoId, String maTuSinh) {
		return tthcNoidungHoSoFinder.findBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinhFinderEnd(hoSoThuTucId, bieuMauHoSoId, maTuSinh);
	}
	public List<TthcNoidungHoSo> findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId(long hoSoThuTucId, long bieuMauHoSoId) {
		return tthcNoidungHoSoFinder.findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucId(hoSoThuTucId, bieuMauHoSoId);
	}
	
	public List<TthcNoidungHoSo> findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucIdLanCuoi(long hoSoThuTucId, long bieuMauHoSoId) {
		return tthcNoidungHoSoFinder.findCountMaTuSinhByBieuMauHoSoIdAndHoSoThuTucIdLanCuoi(hoSoThuTucId, bieuMauHoSoId);
	}
	
	
	public List<TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucId(long hoSoThuTucId, java.lang.String mauTrucTuyen) {
		return tthcNoidungHoSoFinder.findBieuMauHoSoIdAndHoSoThuTucId(hoSoThuTucId, mauTrucTuyen);
	}
	
	public List<TthcNoidungHoSo> findBieuMauHoSoIdAndHoSoThuTucId(long hoSoThuTucId, java.lang.String mauTrucTuyen1, java.lang.String mauTrucTuyen2) {
		return tthcNoidungHoSoFinder.findBieuMauHoSoIdAndHoSoThuTucId(hoSoThuTucId, mauTrucTuyen1,mauTrucTuyen2);
	}
	public int countSoLuongKySo(long phieuXuLyPhuId) {
		return tthcNoidungHoSoFinder.countSoLuongKySo(phieuXuLyPhuId);
	}
	
	
	public int countSoLuongDaDongDau(long phieuXuLyPhuId) {
		return tthcNoidungHoSoFinder.countSoLuongDaDongDau(phieuXuLyPhuId);
	}
	
	private static Log _log = LogFactoryUtil.getLog(TthcNoidungHoSo.class);
	
}