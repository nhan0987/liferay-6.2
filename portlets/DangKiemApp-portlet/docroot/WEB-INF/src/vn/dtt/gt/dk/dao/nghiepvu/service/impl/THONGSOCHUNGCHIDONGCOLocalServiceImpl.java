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
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIDONGCOLocalServiceBaseImpl;

/**
 * The implementation of the t h o n g s o c h u n g c h i d o n g c o local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIDONGCOLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOLocalServiceUtil
 */
public class THONGSOCHUNGCHIDONGCOLocalServiceImpl
	extends THONGSOCHUNGCHIDONGCOLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOLocalServiceUtil} to access the t h o n g s o c h u n g c h i d o n g c o local service.
	 */
	public boolean deleteDCXVehicleCertificateSpecWithHosothutucId(long hosothutucId) throws SystemException {
		return thongsochungchidongcoFinder.deleteDCXVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIDONGCO> findByCertificateRecordAndHosothutucId(long hosothutucId) {
		return thongsochungchidongcoFinder.findByCertificateRecordAndHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIDONGCO> findByVehicleGroupInitialAndHosothutucId(long hosothutucId) {
		return thongsochungchidongcoFinder.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIDONGCO> findByCertificateRecordId(long certificateRecordId) throws SystemException {
		return thongsochungchidongcoPersistence.findByCertificateRecordId(certificateRecordId);
	}
	
	public List<THONGSOCHUNGCHIDONGCO> findByVehicleGroupId(long vehicleGroupId) throws SystemException {
		return thongsochungchidongcoPersistence.findByVehicleGroupId(vehicleGroupId);
	}
	
	private static Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIDONGCOLocalServiceImpl.class);
}