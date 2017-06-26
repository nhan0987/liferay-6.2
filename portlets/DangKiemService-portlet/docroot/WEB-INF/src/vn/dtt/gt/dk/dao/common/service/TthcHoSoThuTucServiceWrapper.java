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

package vn.dtt.gt.dk.dao.common.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TthcHoSoThuTucService}.
 *
 * @author huymq
 * @see TthcHoSoThuTucService
 * @generated
 */
public class TthcHoSoThuTucServiceWrapper implements TthcHoSoThuTucService,
	ServiceWrapper<TthcHoSoThuTucService> {
	public TthcHoSoThuTucServiceWrapper(
		TthcHoSoThuTucService tthcHoSoThuTucService) {
		_tthcHoSoThuTucService = tthcHoSoThuTucService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tthcHoSoThuTucService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tthcHoSoThuTucService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tthcHoSoThuTucService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TthcHoSoThuTucService getWrappedTthcHoSoThuTucService() {
		return _tthcHoSoThuTucService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTthcHoSoThuTucService(
		TthcHoSoThuTucService tthcHoSoThuTucService) {
		_tthcHoSoThuTucService = tthcHoSoThuTucService;
	}

	@Override
	public TthcHoSoThuTucService getWrappedService() {
		return _tthcHoSoThuTucService;
	}

	@Override
	public void setWrappedService(TthcHoSoThuTucService tthcHoSoThuTucService) {
		_tthcHoSoThuTucService = tthcHoSoThuTucService;
	}

	private TthcHoSoThuTucService _tthcHoSoThuTucService;
}