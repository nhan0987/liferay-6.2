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

import vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo;
import vn.dtt.gt.dk.dao.common.service.base.TthcThanhPhanHoSoLocalServiceBaseImpl;

/**
 * The implementation of the tthc thanh phan ho so local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.common.service.TthcThanhPhanHoSoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.common.service.base.TthcThanhPhanHoSoLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil
 */
public class TthcThanhPhanHoSoLocalServiceImpl
	extends TthcThanhPhanHoSoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.common.service.TthcThanhPhanHoSoLocalServiceUtil} to access the tthc thanh phan ho so local service.
	 */
	public List<TthcThanhPhanHoSo> findByLinhVuc(long thuTucHanhChinhId) {
		try {
			return tthcThanhPhanHoSoPersistence.findByThuTucHanhChinhId(thuTucHanhChinhId);
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return new ArrayList<TthcThanhPhanHoSo>();
	}
	
	public TthcThanhPhanHoSo findByThuTucHanhChinhIdAndBieuMauHoSoId(long ThuTucHanhChinhId, long BieuMauHoSoId) {
		try {
			return tthcThanhPhanHoSoPersistence.findByThuTucHanhChinhIdAndBieuMauHoSoId(ThuTucHanhChinhId, BieuMauHoSoId);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return null;
	}
	
	public List<TthcThanhPhanHoSo> findByThuTucHanhChinhIdAndMauTrucTuyen(long thuTucHanhChinhId, String mauTrucTuyen) {
		try {
			return tthcThanhPhanHoSoPersistence.findByThuTucHanhChinhIdAndMauTrucTuyen(thuTucHanhChinhId, mauTrucTuyen);
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return new ArrayList<TthcThanhPhanHoSo>();
	}
	
	public List<TthcThanhPhanHoSo> searchTthcThanhPhanHoSo(long thutuchanhchinhid, long bieumauhosoid, int thutuhienthi, int loaithanhphan, String mautructuyen, long sotailieudinhkem, int start, int end) {
		return tthcThanhPhanHoSoFinder.searchTthcThanhPhanHoSo(thutuchanhchinhid, bieumauhosoid, thutuhienthi, loaithanhphan, mautructuyen, sotailieudinhkem, start, end);
	}
	
	public int countTthcThanhPhanHoSo(long thutuchanhchinhid, long bieumauhosoid, int thutuhienthi, int loaithanhphan, String mautructuyen, long sotailieudinhkem) {
		return tthcThanhPhanHoSoFinder.countTthcThanhPhanHoSo(thutuchanhchinhid, bieumauhosoid, thutuhienthi, loaithanhphan, mautructuyen, sotailieudinhkem);
	}
	
	private static Log _log = LogFactoryUtil.getLog(TthcThanhPhanHoSoLocalServiceImpl.class);
}