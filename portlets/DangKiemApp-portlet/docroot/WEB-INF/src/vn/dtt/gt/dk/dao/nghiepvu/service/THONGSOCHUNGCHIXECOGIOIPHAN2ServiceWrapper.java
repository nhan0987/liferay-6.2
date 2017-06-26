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
 * Provides a wrapper for {@link THONGSOCHUNGCHIXECOGIOIPHAN2Service}.
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECOGIOIPHAN2Service
 * @generated
 */
public class THONGSOCHUNGCHIXECOGIOIPHAN2ServiceWrapper
	implements THONGSOCHUNGCHIXECOGIOIPHAN2Service,
		ServiceWrapper<THONGSOCHUNGCHIXECOGIOIPHAN2Service> {
	public THONGSOCHUNGCHIXECOGIOIPHAN2ServiceWrapper(
		THONGSOCHUNGCHIXECOGIOIPHAN2Service thongsochungchixecogioiphan2Service) {
		_thongsochungchixecogioiphan2Service = thongsochungchixecogioiphan2Service;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _thongsochungchixecogioiphan2Service.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_thongsochungchixecogioiphan2Service.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _thongsochungchixecogioiphan2Service.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public THONGSOCHUNGCHIXECOGIOIPHAN2Service getWrappedTHONGSOCHUNGCHIXECOGIOIPHAN2Service() {
		return _thongsochungchixecogioiphan2Service;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTHONGSOCHUNGCHIXECOGIOIPHAN2Service(
		THONGSOCHUNGCHIXECOGIOIPHAN2Service thongsochungchixecogioiphan2Service) {
		_thongsochungchixecogioiphan2Service = thongsochungchixecogioiphan2Service;
	}

	@Override
	public THONGSOCHUNGCHIXECOGIOIPHAN2Service getWrappedService() {
		return _thongsochungchixecogioiphan2Service;
	}

	@Override
	public void setWrappedService(
		THONGSOCHUNGCHIXECOGIOIPHAN2Service thongsochungchixecogioiphan2Service) {
		_thongsochungchixecogioiphan2Service = thongsochungchixecogioiphan2Service;
	}

	private THONGSOCHUNGCHIXECOGIOIPHAN2Service _thongsochungchixecogioiphan2Service;
}