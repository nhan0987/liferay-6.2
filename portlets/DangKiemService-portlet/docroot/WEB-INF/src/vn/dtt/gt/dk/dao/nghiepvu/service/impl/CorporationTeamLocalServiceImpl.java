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

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.CorporationTeamLocalServiceBaseImpl;

/**
 * The implementation of the corporation team local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CorporationTeamLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil
 */
public class CorporationTeamLocalServiceImpl
	extends CorporationTeamLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.CorporationTeamLocalServiceUtil} to access the corporation team local service.
	 */
	public List<CorporationTeam> findByCorporationId(
			String corporationId) {
		try {
			return corporationTeamPersistence.findByCorporationId(corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<CorporationTeam>();
	}
	
	public int countByCorporationId(
			String corporationId) {
		try {
			return corporationTeamPersistence.countByCorporationId(corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	public List<CorporationTeam> findByCorporationId(
			String corporationId, int start, int end) {
		try {
			return corporationTeamPersistence.findByCorporationId(corporationId, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<CorporationTeam>();
	}
	
	public List<CorporationTeam> findByCorporationIdAndTrangThai(
			String corporationId, int markUpDelete) {
		try {
			return corporationTeamPersistence.findByCorporationIdAndTrangThai(corporationId, markUpDelete);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<CorporationTeam>();
	}
	public List<CorporationTeam> findByInspectorId(long inspectorId){
		try {
			return corporationTeamFinder.findByInspectorId(inspectorId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<CorporationTeam>();
	}
	
	private static Log _log = LogFactoryUtil.getLog(CorporationTeamLocalServiceImpl.class);
}