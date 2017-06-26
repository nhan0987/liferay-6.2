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
 * Provides a wrapper for {@link PhanCongDonViKiemTraService}.
 *
 * @author huymq
 * @see PhanCongDonViKiemTraService
 * @generated
 */
public class PhanCongDonViKiemTraServiceWrapper
	implements PhanCongDonViKiemTraService,
		ServiceWrapper<PhanCongDonViKiemTraService> {
	public PhanCongDonViKiemTraServiceWrapper(
		PhanCongDonViKiemTraService phanCongDonViKiemTraService) {
		_phanCongDonViKiemTraService = phanCongDonViKiemTraService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _phanCongDonViKiemTraService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_phanCongDonViKiemTraService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _phanCongDonViKiemTraService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public long countLichKiemTraHienTruong(java.lang.String emailAddress,
		long phanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phanCongDonViKiemTraService.countLichKiemTraHienTruong(emailAddress,
			phanNhomHoSoId);
	}

	@Override
	public java.util.List<java.lang.Object> getLichKiemTraHienTruong(
		java.lang.String emailAddress, long phanNhomHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phanCongDonViKiemTraService.getLichKiemTraHienTruong(emailAddress,
			phanNhomHoSoId, start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PhanCongDonViKiemTraService getWrappedPhanCongDonViKiemTraService() {
		return _phanCongDonViKiemTraService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPhanCongDonViKiemTraService(
		PhanCongDonViKiemTraService phanCongDonViKiemTraService) {
		_phanCongDonViKiemTraService = phanCongDonViKiemTraService;
	}

	@Override
	public PhanCongDonViKiemTraService getWrappedService() {
		return _phanCongDonViKiemTraService;
	}

	@Override
	public void setWrappedService(
		PhanCongDonViKiemTraService phanCongDonViKiemTraService) {
		_phanCongDonViKiemTraService = phanCongDonViKiemTraService;
	}

	private PhanCongDonViKiemTraService _phanCongDonViKiemTraService;
}