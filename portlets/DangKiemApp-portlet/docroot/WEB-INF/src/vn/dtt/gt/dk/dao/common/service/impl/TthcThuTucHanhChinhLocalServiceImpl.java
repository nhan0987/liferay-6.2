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

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh;
import vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhImpl;
import vn.dtt.gt.dk.dao.common.service.base.TthcThuTucHanhChinhLocalServiceBaseImpl;

/**
 * The implementation of the tthc thu tuc hanh chinh local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.common.service.base.TthcThuTucHanhChinhLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.TthcThuTucHanhChinhLocalServiceUtil
 */
public class TthcThuTucHanhChinhLocalServiceImpl extends TthcThuTucHanhChinhLocalServiceBaseImpl {
	
	public List<TthcThuTucHanhChinh> findByLinhVuc(long linhVucThuTucId) {
		List<TthcThuTucHanhChinh> result = null;
		try {
			result = tthcThuTucHanhChinhPersistence.findByLinhVucThuTucId(linhVucThuTucId);
		} catch (SystemException e) {
			_log.error(e);
		}
		return result;
	}
	
	public TthcThuTucHanhChinh findByMaThuTuc(String maThuTuc) {
		try {
			return tthcThuTucHanhChinhPersistence.findByMaThuTuc(maThuTuc);
		} catch (Exception e) {
			_log.error(e);
		}
		
		return new TthcThuTucHanhChinhImpl();
	}
	
	public List<TthcThuTucHanhChinh> searchThuTucHanhChinh(String mathutuc, String tenthutuc, int coquanqlttid, int linhvucthutucid, int start, int end) {
		return tthcThuTucHanhChinhFinder.searchThuTucHanhChinh(mathutuc, tenthutuc, coquanqlttid, linhvucthutucid, start, end);
	}
	
	public int countThuTucHanhChinh(String mathutuc, String tenthutuc, int coquanqlttid, int linhvucthutucid) {
		return tthcThuTucHanhChinhFinder.countThuTucHanhChinh(mathutuc, tenthutuc, coquanqlttid, linhvucthutucid);
	}
	
	private static Log _log = LogFactoryUtil.getLog(TthcThuTucHanhChinhLocalServiceImpl.class);
}