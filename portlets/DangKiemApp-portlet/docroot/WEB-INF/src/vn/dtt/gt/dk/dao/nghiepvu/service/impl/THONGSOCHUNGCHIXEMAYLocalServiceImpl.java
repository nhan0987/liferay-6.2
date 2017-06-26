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

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;
import vn.dtt.gt.dk.dao.common.service.impl.TthcHoSoThuTucLocalServiceImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY;
import vn.dtt.gt.dk.dao.nghiepvu.service.impl.THONGSOCHUNGCHIXEMAYLocalServiceImpl;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIXEMAYLocalServiceBaseImpl;

/**
 * The implementation of the t h o n g s o c h u n g c h i x e m a y local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIXEMAYLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYLocalServiceUtil
 */
public class THONGSOCHUNGCHIXEMAYLocalServiceImpl
	extends THONGSOCHUNGCHIXEMAYLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEMAYLocalServiceUtil} to access the t h o n g s o c h u n g c h i x e m a y local service.
	 */
	public boolean deleteXMYVehicleCertificateSpecWithHosothutucId(long hosothutucId) throws SystemException {
		return thongsochungchixemayFinder.deleteXMYVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIXEMAY> findByCertificateRecordAndHosothutucId(long hosothutucId) {
		return thongsochungchixemayFinder.findByCertificateRecordAndHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIXEMAY> findByVehicleGroupInitialAndHosothutucId(long hosothutucId) {
		return thongsochungchixemayFinder.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIXEMAY> findByCertificateRecordId(long certificateRecordId) throws SystemException {
		return thongsochungchixemayPersistence.findByCertificateRecordId(certificateRecordId);
	}
	
	public List<THONGSOCHUNGCHIXEMAY> findByVehicleGroupId(long vehicleGroupId) throws SystemException {
		return thongsochungchixemayPersistence.findByVehicleGroupId(vehicleGroupId);
	}
	private static Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIXEMAYLocalServiceImpl.class);
}