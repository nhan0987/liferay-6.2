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

import vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceBaseImpl;

/**
 * The implementation of the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2LocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil
 */
public class THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceImpl
	extends THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIXECOGIOIPHAN2LocalServiceUtil} to access the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 local service.
	 */
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findByCertificateRecordId(long certificateRecordId) {
		try {
			return thongsochungchixecogioiphan2Persistence.findByCertificateRecordId(certificateRecordId);
		} catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}

	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findByVehicleGroupId(
			long vehicleGroupId) {

		try {
			return thongsochungchixecogioiphan2Persistence.findByVehicleGroupId(vehicleGroupId);
		} catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
	
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findByHoSoThuTucId(
			long hoSoThuTucId) {

		try {
			return thongsochungchixecogioiphan2Persistence.findByHoSoThuTucId(hoSoThuTucId);
		} catch (Exception e) {
//			_log.error(e);
		}
		return null;
	}
}