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
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIXECOGIOILocalServiceBaseImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceBaseImpl;

/**
 * The implementation of the t h o n g s o c h u n g c h i x e c o g i o i local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOILocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIXECOGIOILocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOILocalServiceUtil
 */
public class THONGSOCHUNGCHIXECOGIOILocalServiceImpl
	extends THONGSOCHUNGCHIXECOGIOILocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOILocalServiceUtil} to access the t h o n g s o c h u n g c h i x e c o g i o i local service.
	 */
	public boolean deleteXCGVehicleCertificateSpecWithHosothutucId(long hosothutucId) throws SystemException {
		return thongsochungchixecogioiFinder.deleteXCGVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIXECOGIOI> findByCertificateRecordAndHosothutucId(long hosothutucId) {
		return thongsochungchixecogioiFinder.findByCertificateRecordAndHosothutucId(hosothutucId);
	}
	public List<THONGSOCHUNGCHIXECOGIOI> findByVehicleGroupInitialAndHosothutucId(long hosothutucId) {
		return thongsochungchixecogioiFinder.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
	}
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findPart2ByCertificateRecordAndHosothutucId(long hosothutucId) {
		return thongsochungchixecogioiFinder.findPart2ByCertificateRecordAndHosothutucId(hosothutucId);
	}
	public List<THONGSOCHUNGCHIXECOGIOIPHAN2> findPart2ByVehicleGroupInitialAndHosothutucId(long hosothutucId) {
		return thongsochungchixecogioiFinder.findPart2ByVehicleGroupInitialAndHosothutucId(hosothutucId);
	}
	private static Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIXECOGIOILocalServiceImpl.class);
	
	
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> findByCertificateRecordId(long certificateRecordId) {
		try {
			return thongsochungchixecogioiPersistence.findByCertificateRecordId(certificateRecordId);
		} catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> findByVehicleGroupId(
			long vehicleGroupId) {

		try {
			return thongsochungchixecogioiPersistence.findByVehicleGroupId(vehicleGroupId);
		} catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
	
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> findByHoSoThuTucId(
			long hoSoThuTucId) {

		try {
			return thongsochungchixecogioiPersistence.findByHoSoThuTucId(hoSoThuTucId);
		} catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
}