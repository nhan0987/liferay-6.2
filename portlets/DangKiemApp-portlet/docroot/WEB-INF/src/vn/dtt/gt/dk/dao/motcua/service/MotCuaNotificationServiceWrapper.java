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

package vn.dtt.gt.dk.dao.motcua.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MotCuaNotificationService}.
 *
 * @author win_64
 * @see MotCuaNotificationService
 * @generated
 */
public class MotCuaNotificationServiceWrapper
	implements MotCuaNotificationService,
		ServiceWrapper<MotCuaNotificationService> {
	public MotCuaNotificationServiceWrapper(
		MotCuaNotificationService motCuaNotificationService) {
		_motCuaNotificationService = motCuaNotificationService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _motCuaNotificationService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_motCuaNotificationService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _motCuaNotificationService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MotCuaNotificationService getWrappedMotCuaNotificationService() {
		return _motCuaNotificationService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMotCuaNotificationService(
		MotCuaNotificationService motCuaNotificationService) {
		_motCuaNotificationService = motCuaNotificationService;
	}

	@Override
	public MotCuaNotificationService getWrappedService() {
		return _motCuaNotificationService;
	}

	@Override
	public void setWrappedService(
		MotCuaNotificationService motCuaNotificationService) {
		_motCuaNotificationService = motCuaNotificationService;
	}

	private MotCuaNotificationService _motCuaNotificationService;
}