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
 * Provides a wrapper for {@link DmDataGroupService}.
 *
 * @author huymq
 * @see DmDataGroupService
 * @generated
 */
public class DmDataGroupServiceWrapper implements DmDataGroupService,
	ServiceWrapper<DmDataGroupService> {
	public DmDataGroupServiceWrapper(DmDataGroupService dmDataGroupService) {
		_dmDataGroupService = dmDataGroupService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmDataGroupService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmDataGroupService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmDataGroupService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public int countDmDataGroup()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataGroupService.countDmDataGroup();
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataGroup getByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmDataGroupService.getByCode(code);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataGroup> getDmDataGroups(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataGroupService.getDmDataGroups(start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmDataGroupService getWrappedDmDataGroupService() {
		return _dmDataGroupService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmDataGroupService(
		DmDataGroupService dmDataGroupService) {
		_dmDataGroupService = dmDataGroupService;
	}

	@Override
	public DmDataGroupService getWrappedService() {
		return _dmDataGroupService;
	}

	@Override
	public void setWrappedService(DmDataGroupService dmDataGroupService) {
		_dmDataGroupService = dmDataGroupService;
	}

	private DmDataGroupService _dmDataGroupService;
}