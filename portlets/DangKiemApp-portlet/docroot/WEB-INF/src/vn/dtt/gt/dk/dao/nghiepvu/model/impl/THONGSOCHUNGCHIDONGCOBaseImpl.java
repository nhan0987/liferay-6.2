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

import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO;
import vn.dtt.gt.dk.dao.nghiepvu.service.THONGSOCHUNGCHIDONGCOLocalServiceUtil;

/**
 * The extended model base implementation for the THONGSOCHUNGCHIDONGCO service. Represents a row in the &quot;thongsochungchi_dongco&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link THONGSOCHUNGCHIDONGCOImpl}.
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIDONGCOImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO
 * @generated
 */
public abstract class THONGSOCHUNGCHIDONGCOBaseImpl
	extends THONGSOCHUNGCHIDONGCOModelImpl implements THONGSOCHUNGCHIDONGCO {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a t h o n g s o c h u n g c h i d o n g c o model instance should use the {@link THONGSOCHUNGCHIDONGCO} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			THONGSOCHUNGCHIDONGCOLocalServiceUtil.addTHONGSOCHUNGCHIDONGCO(this);
		}
		else {
			THONGSOCHUNGCHIDONGCOLocalServiceUtil.updateTHONGSOCHUNGCHIDONGCO(this);
		}
	}
}