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

package vn.dtt.gt.dk.dao.nghiepvu.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link THONGSOCHUNGCHIXEBONBANHService}.
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXEBONBANHService
 * @generated
 */
public class THONGSOCHUNGCHIXEBONBANHServiceWrapper
	implements THONGSOCHUNGCHIXEBONBANHService,
		ServiceWrapper<THONGSOCHUNGCHIXEBONBANHService> {
	public THONGSOCHUNGCHIXEBONBANHServiceWrapper(
		THONGSOCHUNGCHIXEBONBANHService thongsochungchixebonbanhService) {
		_thongsochungchixebonbanhService = thongsochungchixebonbanhService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _thongsochungchixebonbanhService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_thongsochungchixebonbanhService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _thongsochungchixebonbanhService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public THONGSOCHUNGCHIXEBONBANHService getWrappedTHONGSOCHUNGCHIXEBONBANHService() {
		return _thongsochungchixebonbanhService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTHONGSOCHUNGCHIXEBONBANHService(
		THONGSOCHUNGCHIXEBONBANHService thongsochungchixebonbanhService) {
		_thongsochungchixebonbanhService = thongsochungchixebonbanhService;
	}

	@Override
	public THONGSOCHUNGCHIXEBONBANHService getWrappedService() {
		return _thongsochungchixebonbanhService;
	}

	@Override
	public void setWrappedService(
		THONGSOCHUNGCHIXEBONBANHService thongsochungchixebonbanhService) {
		_thongsochungchixebonbanhService = thongsochungchixebonbanhService;
	}

	private THONGSOCHUNGCHIXEBONBANHService _thongsochungchixebonbanhService;
}