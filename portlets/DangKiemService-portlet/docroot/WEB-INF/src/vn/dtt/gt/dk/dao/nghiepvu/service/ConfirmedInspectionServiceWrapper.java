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
 * Provides a wrapper for {@link ConfirmedInspectionService}.
 *
 * @author huymq
 * @see ConfirmedInspectionService
 * @generated
 */
public class ConfirmedInspectionServiceWrapper
	implements ConfirmedInspectionService,
		ServiceWrapper<ConfirmedInspectionService> {
	public ConfirmedInspectionServiceWrapper(
		ConfirmedInspectionService confirmedInspectionService) {
		_confirmedInspectionService = confirmedInspectionService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _confirmedInspectionService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_confirmedInspectionService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _confirmedInspectionService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ConfirmedInspectionService getWrappedConfirmedInspectionService() {
		return _confirmedInspectionService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedConfirmedInspectionService(
		ConfirmedInspectionService confirmedInspectionService) {
		_confirmedInspectionService = confirmedInspectionService;
	}

	@Override
	public ConfirmedInspectionService getWrappedService() {
		return _confirmedInspectionService;
	}

	@Override
	public void setWrappedService(
		ConfirmedInspectionService confirmedInspectionService) {
		_confirmedInspectionService = confirmedInspectionService;
	}

	private ConfirmedInspectionService _confirmedInspectionService;
}