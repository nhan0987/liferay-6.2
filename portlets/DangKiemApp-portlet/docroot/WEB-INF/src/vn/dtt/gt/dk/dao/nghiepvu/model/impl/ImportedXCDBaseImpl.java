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

import vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD;
import vn.dtt.gt.dk.dao.nghiepvu.service.ImportedXCDLocalServiceUtil;

/**
 * The extended model base implementation for the ImportedXCD service. Represents a row in the &quot;vr_importedxcd&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ImportedXCDImpl}.
 * </p>
 *
 * @author win_64
 * @see ImportedXCDImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD
 * @generated
 */
public abstract class ImportedXCDBaseImpl extends ImportedXCDModelImpl
	implements ImportedXCD {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a imported x c d model instance should use the {@link ImportedXCD} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ImportedXCDLocalServiceUtil.addImportedXCD(this);
		}
		else {
			ImportedXCDLocalServiceUtil.updateImportedXCD(this);
		}
	}
}