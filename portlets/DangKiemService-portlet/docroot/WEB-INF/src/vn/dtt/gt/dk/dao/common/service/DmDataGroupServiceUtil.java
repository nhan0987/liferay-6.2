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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for DmDataGroup. This utility wraps
 * {@link vn.dtt.gt.dk.dao.common.service.impl.DmDataGroupServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author huymq
 * @see DmDataGroupService
 * @see vn.dtt.gt.dk.dao.common.service.base.DmDataGroupServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.impl.DmDataGroupServiceImpl
 * @generated
 */
public class DmDataGroupServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.common.service.impl.DmDataGroupServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static int countDmDataGroup()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countDmDataGroup();
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataGroup getByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByCode(code);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataGroup> getDmDataGroups(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmDataGroups(start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static DmDataGroupService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmDataGroupService.class.getName());

			if (invokableService instanceof DmDataGroupService) {
				_service = (DmDataGroupService)invokableService;
			}
			else {
				_service = new DmDataGroupServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(DmDataGroupServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DmDataGroupService service) {
	}

	private static DmDataGroupService _service;
}