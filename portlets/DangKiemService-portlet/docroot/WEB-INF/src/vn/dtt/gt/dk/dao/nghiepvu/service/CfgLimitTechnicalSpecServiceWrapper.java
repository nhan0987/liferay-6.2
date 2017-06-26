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
 * Provides a wrapper for {@link CfgLimitTechnicalSpecService}.
 *
 * @author huymq
 * @see CfgLimitTechnicalSpecService
 * @generated
 */
public class CfgLimitTechnicalSpecServiceWrapper
	implements CfgLimitTechnicalSpecService,
		ServiceWrapper<CfgLimitTechnicalSpecService> {
	public CfgLimitTechnicalSpecServiceWrapper(
		CfgLimitTechnicalSpecService cfgLimitTechnicalSpecService) {
		_cfgLimitTechnicalSpecService = cfgLimitTechnicalSpecService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _cfgLimitTechnicalSpecService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_cfgLimitTechnicalSpecService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cfgLimitTechnicalSpecService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public int countCfgLimitTechnicalSpec()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfgLimitTechnicalSpecService.countCfgLimitTechnicalSpec();
	}

	@Override
	public int countBySyncDate(java.lang.String validatefrom)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfgLimitTechnicalSpecService.countBySyncDate(validatefrom);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec> getCfgLimitTechnicalSpecs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfgLimitTechnicalSpecService.getCfgLimitTechnicalSpecs(start,
			end);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec getBySpecificationCode(
		java.lang.String specificationcode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cfgLimitTechnicalSpecService.getBySpecificationCode(specificationcode);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec> getBySynchDate(
		java.lang.String validatefrom)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfgLimitTechnicalSpecService.getBySynchDate(validatefrom);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec> getBySynchDate(
		java.lang.String validatefrom, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cfgLimitTechnicalSpecService.getBySynchDate(validatefrom,
			start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CfgLimitTechnicalSpecService getWrappedCfgLimitTechnicalSpecService() {
		return _cfgLimitTechnicalSpecService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCfgLimitTechnicalSpecService(
		CfgLimitTechnicalSpecService cfgLimitTechnicalSpecService) {
		_cfgLimitTechnicalSpecService = cfgLimitTechnicalSpecService;
	}

	@Override
	public CfgLimitTechnicalSpecService getWrappedService() {
		return _cfgLimitTechnicalSpecService;
	}

	@Override
	public void setWrappedService(
		CfgLimitTechnicalSpecService cfgLimitTechnicalSpecService) {
		_cfgLimitTechnicalSpecService = cfgLimitTechnicalSpecService;
	}

	private CfgLimitTechnicalSpecService _cfgLimitTechnicalSpecService;
}