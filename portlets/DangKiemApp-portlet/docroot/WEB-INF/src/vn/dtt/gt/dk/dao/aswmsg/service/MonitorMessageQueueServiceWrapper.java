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

package vn.dtt.gt.dk.dao.aswmsg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MonitorMessageQueueService}.
 *
 * @author win_64
 * @see MonitorMessageQueueService
 * @generated
 */
public class MonitorMessageQueueServiceWrapper
	implements MonitorMessageQueueService,
		ServiceWrapper<MonitorMessageQueueService> {
	public MonitorMessageQueueServiceWrapper(
		MonitorMessageQueueService monitorMessageQueueService) {
		_monitorMessageQueueService = monitorMessageQueueService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _monitorMessageQueueService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_monitorMessageQueueService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _monitorMessageQueueService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MonitorMessageQueueService getWrappedMonitorMessageQueueService() {
		return _monitorMessageQueueService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMonitorMessageQueueService(
		MonitorMessageQueueService monitorMessageQueueService) {
		_monitorMessageQueueService = monitorMessageQueueService;
	}

	@Override
	public MonitorMessageQueueService getWrappedService() {
		return _monitorMessageQueueService;
	}

	@Override
	public void setWrappedService(
		MonitorMessageQueueService monitorMessageQueueService) {
		_monitorMessageQueueService = monitorMessageQueueService;
	}

	private MonitorMessageQueueService _monitorMessageQueueService;
}