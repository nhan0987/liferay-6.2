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

import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest;
import vn.dtt.gt.dk.dao.nghiepvu.service.SafetyTestRequestLocalServiceUtil;

/**
 * The extended model base implementation for the SafetyTestRequest service. Represents a row in the &quot;vr_safetytestrequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SafetyTestRequestImpl}.
 * </p>
 *
 * @author huymq
 * @see SafetyTestRequestImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest
 * @generated
 */
public abstract class SafetyTestRequestBaseImpl
	extends SafetyTestRequestModelImpl implements SafetyTestRequest {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a safety test request model instance should use the {@link SafetyTestRequest} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SafetyTestRequestLocalServiceUtil.addSafetyTestRequest(this);
		}
		else {
			SafetyTestRequestLocalServiceUtil.updateSafetyTestRequest(this);
		}
	}
}