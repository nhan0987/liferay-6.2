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
import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG;
import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate;
import vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIXECHUYENDUNGLocalServiceBaseImpl;

/**
 * The implementation of the t h o n g s o c h u n g c h i x e c h u y e n d u n g local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIXECHUYENDUNGLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil
 */
public class THONGSOCHUNGCHIXECHUYENDUNGLocalServiceImpl
	extends THONGSOCHUNGCHIXECHUYENDUNGLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECHUYENDUNGLocalServiceUtil} to access the t h o n g s o c h u n g c h i x e c h u y e n d u n g local service.
	 */
	public boolean deleteXCDVehicleCertificateSpecWithHosothutucId(long hosothutucId) throws SystemException {
		return thongsochungchixechuyendungFinder.deleteXCDVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}
	
	public boolean deleteXCDVehicleCertificateSpecWithXCD0009(String XCD0009) throws SystemException {
		return thongsochungchixechuyendungFinder.deleteXCDVehicleCertificateSpecWithXCD0009(XCD0009);
	}
	
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByCertificateRecordAndHosothutucId(long hosothutucId) {
		return thongsochungchixechuyendungFinder.findByCertificateRecordAndHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByVehicleGroupInitialAndHosothutucId(long hosothutucId) {
		return thongsochungchixechuyendungFinder.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
	}
	
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByCertificateRecordId(long certificateRecordId) throws SystemException {
		return thongsochungchixechuyendungPersistence.findByCertificateRecordId(certificateRecordId);
	}
	
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByVehicleGroupId(long vehicleGroupId) throws SystemException {
		return thongsochungchixechuyendungPersistence.findByVehicleGroupId(vehicleGroupId);
	}
	
	public List<THONGSOCHUNGCHIXECHUYENDUNG> findByXCD0009(String XCD0009) throws SystemException {
		return thongsochungchixechuyendungPersistence.findByXCD0009(XCD0009);
	}
	
	private static Log _log = LogFactoryUtil.getLog(THONGSOCHUNGCHIXECHUYENDUNGLocalServiceImpl.class);
}