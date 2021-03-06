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

package vn.dtt.gt.dk.dao.common.service.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;
import vn.dtt.gt.dk.dao.common.service.base.TthcNoidungHoSoLocalServiceBaseImpl;

/**
 * The implementation of the tthc noidung ho so local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.common.service.base.TthcNoidungHoSoLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil
 */
public class TthcNoidungHoSoLocalServiceImpl
	extends TthcNoidungHoSoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link vn.dtt.gt.dk.dao.common.service.TthcNoidungHoSoLocalServiceUtil} to access the tthc noidung ho so local service.
	 */
	
	public TthcNoidungHoSo fetchByVehicleRecordId(
			long vehicleRecordId) throws SystemException {
		
		return tthcNoidungHoSoPersistence.fetchByVehicleRecordId(vehicleRecordId);
	}
}