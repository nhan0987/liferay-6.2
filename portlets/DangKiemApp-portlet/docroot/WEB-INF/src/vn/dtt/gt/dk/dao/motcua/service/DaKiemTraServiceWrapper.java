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
 * Provides a wrapper for {@link DaKiemTraService}.
 *
 * @author win_64
 * @see DaKiemTraService
 * @generated
 */
public class DaKiemTraServiceWrapper implements DaKiemTraService,
	ServiceWrapper<DaKiemTraService> {
	public DaKiemTraServiceWrapper(DaKiemTraService daKiemTraService) {
		_daKiemTraService = daKiemTraService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _daKiemTraService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_daKiemTraService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _daKiemTraService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DaKiemTraService getWrappedDaKiemTraService() {
		return _daKiemTraService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDaKiemTraService(DaKiemTraService daKiemTraService) {
		_daKiemTraService = daKiemTraService;
	}

	@Override
	public DaKiemTraService getWrappedService() {
		return _daKiemTraService;
	}

	@Override
	public void setWrappedService(DaKiemTraService daKiemTraService) {
		_daKiemTraService = daKiemTraService;
	}

	private DaKiemTraService _daKiemTraService;
}