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
 * Provides a wrapper for {@link CfgTechnicalspecService}.
 *
 * @author huymq
 * @see CfgTechnicalspecService
 * @generated
 */
public class CfgTechnicalspecServiceWrapper implements CfgTechnicalspecService,
	ServiceWrapper<CfgTechnicalspecService> {
	public CfgTechnicalspecServiceWrapper(
		CfgTechnicalspecService cfgTechnicalspecService) {
		_cfgTechnicalspecService = cfgTechnicalspecService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _cfgTechnicalspecService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_cfgTechnicalspecService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cfgTechnicalspecService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public int countCfgTechnicalSpec()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfgTechnicalspecService.countCfgTechnicalSpec();
	}

	@Override
	public int countBySyncDate(java.lang.String validatefrom)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfgTechnicalspecService.countBySyncDate(validatefrom);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> getCfgTechnicalSpecs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfgTechnicalspecService.getCfgTechnicalSpecs(start, end);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec getBySpecificationCode(
		java.lang.String specificationcode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cfgTechnicalspecService.getBySpecificationCode(specificationcode);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> getBySynchDate(
		java.lang.String validatefrom)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfgTechnicalspecService.getBySynchDate(validatefrom);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> getBySynchDate(
		java.lang.String validatefrom, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfgTechnicalspecService.getBySynchDate(validatefrom, start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CfgTechnicalspecService getWrappedCfgTechnicalspecService() {
		return _cfgTechnicalspecService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCfgTechnicalspecService(
		CfgTechnicalspecService cfgTechnicalspecService) {
		_cfgTechnicalspecService = cfgTechnicalspecService;
	}

	@Override
	public CfgTechnicalspecService getWrappedService() {
		return _cfgTechnicalspecService;
	}

	@Override
	public void setWrappedService(
		CfgTechnicalspecService cfgTechnicalspecService) {
		_cfgTechnicalspecService = cfgTechnicalspecService;
	}

	private CfgTechnicalspecService _cfgTechnicalspecService;
}