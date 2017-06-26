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
 * Provides a wrapper for {@link MotCuaDienBienHoSoService}.
 *
 * @author win_64
 * @see MotCuaDienBienHoSoService
 * @generated
 */
public class MotCuaDienBienHoSoServiceWrapper
	implements MotCuaDienBienHoSoService,
		ServiceWrapper<MotCuaDienBienHoSoService> {
	public MotCuaDienBienHoSoServiceWrapper(
		MotCuaDienBienHoSoService motCuaDienBienHoSoService) {
		_motCuaDienBienHoSoService = motCuaDienBienHoSoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _motCuaDienBienHoSoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_motCuaDienBienHoSoService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _motCuaDienBienHoSoService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MotCuaDienBienHoSoService getWrappedMotCuaDienBienHoSoService() {
		return _motCuaDienBienHoSoService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMotCuaDienBienHoSoService(
		MotCuaDienBienHoSoService motCuaDienBienHoSoService) {
		_motCuaDienBienHoSoService = motCuaDienBienHoSoService;
	}

	@Override
	public MotCuaDienBienHoSoService getWrappedService() {
		return _motCuaDienBienHoSoService;
	}

	@Override
	public void setWrappedService(
		MotCuaDienBienHoSoService motCuaDienBienHoSoService) {
		_motCuaDienBienHoSoService = motCuaDienBienHoSoService;
	}

	private MotCuaDienBienHoSoService _motCuaDienBienHoSoService;
}