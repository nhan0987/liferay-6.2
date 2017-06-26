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

package vn.dtt.gt.dk.dao.aswmsg.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog;
import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageLogLocalServiceUtil;

/**
 * The extended model base implementation for the AswmsgMessageLog service. Represents a row in the &quot;aswmsg_messagelog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AswmsgMessageLogImpl}.
 * </p>
 *
 * @author win_64
 * @see AswmsgMessageLogImpl
 * @see vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog
 * @generated
 */
public abstract class AswmsgMessageLogBaseImpl extends AswmsgMessageLogModelImpl
	implements AswmsgMessageLog {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a aswmsg message log model instance should use the {@link AswmsgMessageLog} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AswmsgMessageLogLocalServiceUtil.addAswmsgMessageLog(this);
		}
		else {
			AswmsgMessageLogLocalServiceUtil.updateAswmsgMessageLog(this);
		}
	}
}