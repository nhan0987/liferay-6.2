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

package vn.dtt.gt.dk.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;
import vn.dtt.gt.dk.dao.nghiepvu.service.VehicleRecordLocalServiceUtil;

/**
 * The extended model base implementation for the VehicleRecord service. Represents a row in the &quot;vr_vehiclerecord&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VehicleRecordImpl}.
 * </p>
 *
 * @author win_64
 * @see VehicleRecordImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord
 * @generated
 */
public abstract class VehicleRecordBaseImpl extends VehicleRecordModelImpl
	implements VehicleRecord {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vehicle record model instance should use the {@link VehicleRecord} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			VehicleRecordLocalServiceUtil.addVehicleRecord(this);
		}
		else {
			VehicleRecordLocalServiceUtil.updateVehicleRecord(this);
		}
	}
}