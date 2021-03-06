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

import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;

/**
 * The extended model base implementation for the RegisteredInspection service. Represents a row in the &quot;vr_registeredinspection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RegisteredInspectionImpl}.
 * </p>
 *
 * @author huymq
 * @see RegisteredInspectionImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection
 * @generated
 */
public abstract class RegisteredInspectionBaseImpl
	extends RegisteredInspectionModelImpl implements RegisteredInspection {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a registered inspection model instance should use the {@link RegisteredInspection} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RegisteredInspectionLocalServiceUtil.addRegisteredInspection(this);
		}
		else {
			RegisteredInspectionLocalServiceUtil.updateRegisteredInspection(this);
		}
	}
}