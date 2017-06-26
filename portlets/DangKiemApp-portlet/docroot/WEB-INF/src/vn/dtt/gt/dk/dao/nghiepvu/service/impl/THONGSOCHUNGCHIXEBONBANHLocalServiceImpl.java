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

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEBONBANH;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIXEBONBANHLocalServiceBaseImpl;

/**
 * The implementation of the t h o n g s o c h u n g c h i x e b o n b a n h local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIXEBONBANHLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHLocalServiceUtil
 */
public class THONGSOCHUNGCHIXEBONBANHLocalServiceImpl
	extends THONGSOCHUNGCHIXEBONBANHLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEBONBANHLocalServiceUtil} to access the t h o n g s o c h u n g c h i x e b o n b a n h local service.
	 */
	public boolean deleteXBBVehicleCertificateSpecWithHosothutucId(long hosothutucId) throws SystemException {
		return thongsochungchixebonbanhFinder.deleteXBBVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIXEBONBANH> findByCertificateRecordAndHosothutucId(long hosothutucId) {
		return thongsochungchixebonbanhFinder.findByCertificateRecordAndHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIXEBONBANH> findByVehicleGroupInitialAndHosothutucId(long hosothutucId) {
		return thongsochungchixebonbanhFinder.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIXEBONBANH> findByCertificateRecordId(long certificateRecordId) throws SystemException {
		return thongsochungchixebonbanhPersistence.findByCertificateRecordId(certificateRecordId);
	}
	
	public List<THONGSOCHUNGCHIXEBONBANH> findByVehicleGroupId(long vehicleGroupId) throws SystemException {
		return thongsochungchixebonbanhPersistence.findByVehicleGroupId(vehicleGroupId);
	}
	
	private static Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIXEBONBANHLocalServiceImpl.class);
}