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
 * Provides the remote service utility for TthcPhanNhomHoSo. This utility wraps
 * {@link vn.dtt.gt.dk.dao.common.service.impl.TthcPhanNhomHoSoServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author huymq
 * @see TthcPhanNhomHoSoService
 * @see vn.dtt.gt.dk.dao.common.service.base.TthcPhanNhomHoSoServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.impl.TthcPhanNhomHoSoServiceImpl
 * @generated
 */
public class TthcPhanNhomHoSoServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.common.service.impl.TthcPhanNhomHoSoServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static int countTthcPhanNhomHoSos()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countTthcPhanNhomHoSos();
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo> getTthcPhanNhomHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTthcPhanNhomHoSos(start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static TthcPhanNhomHoSoService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TthcPhanNhomHoSoService.class.getName());

			if (invokableService instanceof TthcPhanNhomHoSoService) {
				_service = (TthcPhanNhomHoSoService)invokableService;
			}
			else {
				_service = new TthcPhanNhomHoSoServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(TthcPhanNhomHoSoServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TthcPhanNhomHoSoService service) {
	}

	private static TthcPhanNhomHoSoService _service;
}