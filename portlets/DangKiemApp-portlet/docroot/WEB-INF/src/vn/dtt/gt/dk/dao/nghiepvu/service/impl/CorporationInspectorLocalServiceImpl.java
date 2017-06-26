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

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.CorporationInspectorLocalServiceBaseImpl;

/**
 * The implementation of the corporation inspector local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CorporationInspectorLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil
 */
public class CorporationInspectorLocalServiceImpl extends CorporationInspectorLocalServiceBaseImpl {
	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.CorporationInspectorLocalServiceUtil} to access the corporation inspector local service.
	 */
	public List<CorporationInspector> findByCorporationId(String corporationId) {
		try {
			return corporationInspectorPersistence.findByCorporationId(corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<CorporationInspector>();
	}
	
	public int countByCorporationId(String corporationId) {
		try {
			return corporationInspectorPersistence.countByCorporationId(corporationId);
		} catch (Exception e) {
			_log.error(e);
		}
		return 0;
	}
	
	public List<CorporationInspector> findByCorporationId(String corporationId, int start, int end) {
		try {
			return corporationInspectorPersistence.findByCorporationId(corporationId, start, end);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<CorporationInspector>();
	}
	
	public CorporationInspector fetchByInspectorId(long inspectorid) {
		try {
			return corporationInspectorPersistence.fetchByInspectorId(inspectorid);
		} catch (Exception e) {
			_log.error(e);
		}
		return null;
	}
	
	public List<CorporationInspector> findByTeamId(long teamId) {
		try {
			return corporationInspectorPersistence.findByTeamId(teamId);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<CorporationInspector>();
	}
	
	public List<Long> findUserLiferayNotHaveCorporationInspector(String schemaLifeay) {
		return corporationInspectorFinder.findUserLiferayNotHaveCorporationInspector(schemaLifeay);
	}
	
	public CorporationInspector findByInspectorId(long inspectorid) {
		try {
			return corporationInspectorPersistence.findByInspectorId(inspectorid);
		} catch (Exception e) {
		}
		return null;
	}
	public boolean deleteDangKiemVien(long corporationInspectorId) {
		try {
			return corporationInspectorFinder.deleteDangKiemVien(corporationInspectorId);
		} catch (Exception e) {
			_log.error(e);
		}
		return false;
	}
	public List<CorporationInspector> findDanhSachDangKiemVien(int start, int end) {
		return corporationInspectorFinder.findDanhSachDangKiemVien(start, end);
	}
	public int countDanhSachDangKiemVien(){
		try {
			return corporationInspectorFinder.countDanhSachDangKiemVien();
		} catch (SystemException e) {
			_log.error(e);
		}
		return 0;
	}
	public List<CorporationInspector> findDanhSachDangKiemVienByTeam(long userId) {
		return corporationInspectorFinder.findDanhSachDangKiemVienByTeam(userId);
	}
	
	private static Log _log = LogFactoryUtil.getLog(CorporationInspectorLocalServiceImpl.class);
}
