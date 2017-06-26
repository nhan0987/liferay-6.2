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
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEDAPDIEN;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIXEDAPDIENLocalServiceBaseImpl;

/**
 * The implementation of the t h o n g s o c h u n g c h i x e d a p d i e n local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIXEDAPDIENLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil
 */
public class THONGSOCHUNGCHIXEDAPDIENLocalServiceImpl
	extends THONGSOCHUNGCHIXEDAPDIENLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXEDAPDIENLocalServiceUtil} to access the t h o n g s o c h u n g c h i x e d a p d i e n local service.
	 */
	public boolean deleteXDDVehicleCertificateSpecWithHosothutucId(long hosothutucId) throws SystemException {
		return thongsochungchixedapdienFinder.deleteXDDVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIXEDAPDIEN> findByCertificateRecordAndHosothutucId(long hosothutucId) {
		return thongsochungchixedapdienFinder.findByCertificateRecordAndHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIXEDAPDIEN> findByVehicleGroupInitialAndHosothutucId(long hosothutucId) {
		return thongsochungchixedapdienFinder.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIXEDAPDIEN> findByCertificateRecordId(long certificateRecordId) throws SystemException {
		return thongsochungchixedapdienPersistence.findByCertificateRecordId(certificateRecordId);
	}
	
	public List<THONGSOCHUNGCHIXEDAPDIEN> findByVehicleGroupId(long vehicleGroupId) throws SystemException {
		return thongsochungchixedapdienPersistence.findByVehicleGroupId(vehicleGroupId);
	}
	
	private static Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIXEDAPDIENLocalServiceImpl.class);
}