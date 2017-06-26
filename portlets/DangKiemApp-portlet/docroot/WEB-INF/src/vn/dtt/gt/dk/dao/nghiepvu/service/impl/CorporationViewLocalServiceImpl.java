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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.CorporationViewLocalServiceBaseImpl;

/**
 * The implementation of the corporation view local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CorporationViewLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalServiceUtil
 */
public class CorporationViewLocalServiceImpl extends CorporationViewLocalServiceBaseImpl {
	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.CorporationViewLocalServiceUtil} to access the corporation view local service.
	 */
	public List<CorporationView> findByInspectorId(long inspectorId) {
		try {
			return corporationViewPersistence.findByInspectorId(inspectorId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<CorporationView> findCorporationView(long inspectorid, int isleader) {
		try {
			return corporationViewFinder.findCorporationView(inspectorid, isleader);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<CorporationView> findCorporationView(long inspectorid) {
		try {
			return corporationViewFinder.findCorporationView(inspectorid);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	public CorporationView findByCorporationIdAndIsLeader(String corporationId, int isleader) {
		try {
			return corporationViewPersistence.findByCorporationIdAndIsLeader(corporationId, isleader);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	public List<CorporationView> findByCorporationId(String corporationId) {
		try {
			return corporationViewPersistence.findByCorporationId(corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<CorporationView>();
	}
	public List<CorporationView> findByDanhSachDangKiemVienTheoDoi(String corporationId) {
		try {
		return corporationViewFinder.findByDanhSachDangKiemVienTheoDoi(corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	private static Log _log = LogFactoryUtil.getLog(CorporationViewLocalServiceImpl.class);
}
