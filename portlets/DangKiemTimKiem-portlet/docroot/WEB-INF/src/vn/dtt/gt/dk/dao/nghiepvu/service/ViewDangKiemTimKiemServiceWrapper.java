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
 * Provides a wrapper for {@link ViewDangKiemTimKiemService}.
 *
 * @author win_64
 * @see ViewDangKiemTimKiemService
 * @generated
 */
public class ViewDangKiemTimKiemServiceWrapper
	implements ViewDangKiemTimKiemService,
		ServiceWrapper<ViewDangKiemTimKiemService> {
	public ViewDangKiemTimKiemServiceWrapper(
		ViewDangKiemTimKiemService viewDangKiemTimKiemService) {
		_viewDangKiemTimKiemService = viewDangKiemTimKiemService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _viewDangKiemTimKiemService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_viewDangKiemTimKiemService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _viewDangKiemTimKiemService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ViewDangKiemTimKiemService getWrappedViewDangKiemTimKiemService() {
		return _viewDangKiemTimKiemService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedViewDangKiemTimKiemService(
		ViewDangKiemTimKiemService viewDangKiemTimKiemService) {
		_viewDangKiemTimKiemService = viewDangKiemTimKiemService;
	}

	@Override
	public ViewDangKiemTimKiemService getWrappedService() {
		return _viewDangKiemTimKiemService;
	}

	@Override
	public void setWrappedService(
		ViewDangKiemTimKiemService viewDangKiemTimKiemService) {
		_viewDangKiemTimKiemService = viewDangKiemTimKiemService;
	}

	private ViewDangKiemTimKiemService _viewDangKiemTimKiemService;
}