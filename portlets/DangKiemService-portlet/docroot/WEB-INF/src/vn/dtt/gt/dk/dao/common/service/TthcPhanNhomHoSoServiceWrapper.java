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
 * Provides a wrapper for {@link TthcPhanNhomHoSoService}.
 *
 * @author huymq
 * @see TthcPhanNhomHoSoService
 * @generated
 */
public class TthcPhanNhomHoSoServiceWrapper implements TthcPhanNhomHoSoService,
	ServiceWrapper<TthcPhanNhomHoSoService> {
	public TthcPhanNhomHoSoServiceWrapper(
		TthcPhanNhomHoSoService tthcPhanNhomHoSoService) {
		_tthcPhanNhomHoSoService = tthcPhanNhomHoSoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tthcPhanNhomHoSoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tthcPhanNhomHoSoService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tthcPhanNhomHoSoService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public int countTthcPhanNhomHoSos()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcPhanNhomHoSoService.countTthcPhanNhomHoSos();
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo> getTthcPhanNhomHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcPhanNhomHoSoService.getTthcPhanNhomHoSos(start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TthcPhanNhomHoSoService getWrappedTthcPhanNhomHoSoService() {
		return _tthcPhanNhomHoSoService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTthcPhanNhomHoSoService(
		TthcPhanNhomHoSoService tthcPhanNhomHoSoService) {
		_tthcPhanNhomHoSoService = tthcPhanNhomHoSoService;
	}

	@Override
	public TthcPhanNhomHoSoService getWrappedService() {
		return _tthcPhanNhomHoSoService;
	}

	@Override
	public void setWrappedService(
		TthcPhanNhomHoSoService tthcPhanNhomHoSoService) {
		_tthcPhanNhomHoSoService = tthcPhanNhomHoSoService;
	}

	private TthcPhanNhomHoSoService _tthcPhanNhomHoSoService;
}