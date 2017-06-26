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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for CfgLimitTechnicalSpec. This utility wraps
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.CfgLimitTechnicalSpecServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author huymq
 * @see CfgLimitTechnicalSpecService
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CfgLimitTechnicalSpecServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.CfgLimitTechnicalSpecServiceImpl
 * @generated
 */
public class CfgLimitTechnicalSpecServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.CfgLimitTechnicalSpecServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static int countCfgLimitTechnicalSpec()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countCfgLimitTechnicalSpec();
	}

	public static int countBySyncDate(java.lang.String validatefrom)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countBySyncDate(validatefrom);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec> getCfgLimitTechnicalSpecs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCfgLimitTechnicalSpecs(start, end);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec getBySpecificationCode(
		java.lang.String specificationcode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getBySpecificationCode(specificationcode);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec> getBySynchDate(
		java.lang.String validatefrom)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBySynchDate(validatefrom);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec> getBySynchDate(
		java.lang.String validatefrom, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getBySynchDate(validatefrom, start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static CfgLimitTechnicalSpecService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CfgLimitTechnicalSpecService.class.getName());

			if (invokableService instanceof CfgLimitTechnicalSpecService) {
				_service = (CfgLimitTechnicalSpecService)invokableService;
			}
			else {
				_service = new CfgLimitTechnicalSpecServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(CfgLimitTechnicalSpecServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CfgLimitTechnicalSpecService service) {
	}

	private static CfgLimitTechnicalSpecService _service;
}