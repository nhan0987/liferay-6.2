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

package vn.dtt.gt.dk.dao.nghiepvu.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.ViewDangKiemTimKiemLocalServiceBaseImpl;

/**
 * The implementation of the view dang kiem tim kiem local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.ViewDangKiemTimKiemLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.ViewDangKiemTimKiemLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.ViewDangKiemTimKiemLocalServiceUtil
 */
public class ViewDangKiemTimKiemLocalServiceImpl extends ViewDangKiemTimKiemLocalServiceBaseImpl {
	public List<ViewDangKiemTimKiem> searchDangKiemTimKiem(String soChungChi, String soKhung, String soDongCo, long guestId, int start, int end){
		try {
			return viewDangKiemTimKiemFinder.searchDangKiemTimKiem(soChungChi, soKhung, soDongCo, guestId, start, end);
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return new ArrayList<ViewDangKiemTimKiem>();
	}
	public long countDangKiemTimKiem(String soChungChi, String soKhung, String soDongCo, long guestId){
		try {
			return viewDangKiemTimKiemFinder.countDangKiemTimKiem(soChungChi, soKhung, soDongCo, guestId);
		} catch (SystemException e) {
			_log.error(e);
		}
		
		return 0;
	}
	
	private static Log _log = LogFactoryUtil.getLog(ViewDangKiemTimKiemLocalServiceImpl.class);
}