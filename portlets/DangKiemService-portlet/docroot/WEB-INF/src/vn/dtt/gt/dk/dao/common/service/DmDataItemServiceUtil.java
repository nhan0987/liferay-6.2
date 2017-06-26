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
 * Provides the remote service utility for DmDataItem. This utility wraps
 * {@link vn.dtt.gt.dk.dao.common.service.impl.DmDataItemServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author huymq
 * @see DmDataItemService
 * @see vn.dtt.gt.dk.dao.common.service.base.DmDataItemServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.impl.DmDataItemServiceImpl
 * @generated
 */
public class DmDataItemServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.common.service.impl.DmDataItemServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static int countDmDataItems()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countDmDataItems();
	}

	public static int countDmDataItems(java.lang.String synchronizeddate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countDmDataItems(synchronizeddate);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItems(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmDataItems(start, end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItems(
		java.lang.String synchronizeddate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmDataItems(synchronizeddate, start, end);
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItem getByDataGroupIdAndItemCode0(
		java.lang.String datagroupid, java.lang.String code0)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByDataGroupIdAndItemCode0(datagroupid, code0);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItemByGroupCode(
		java.lang.String datagroupid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmDataItemByGroupCode(datagroupid);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItemByValidateFrom(
		java.lang.String validatefrom)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmDataItemByValidateFrom(validatefrom);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getByGC_C0_C1_C2_C3_L_AN(
		java.lang.String groupCode, java.lang.String code0,
		java.lang.String code1, java.lang.String code2, java.lang.String code3,
		java.lang.Integer level, java.lang.String alterName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByGC_C0_C1_C2_C3_L_AN(groupCode, code0, code1, code2,
			code3, level, alterName);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getByGN_C0_C1_C2_C3_L_AN(
		java.lang.String groupName, java.lang.String code0,
		java.lang.String code1, java.lang.String code2, java.lang.String code3,
		java.lang.Integer level, java.lang.String alterName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByGN_C0_C1_C2_C3_L_AN(groupName, code0, code1, code2,
			code3, level, alterName);
	}

	public static int countHoSoNghiepVuBySynchDate(java.lang.String tablename,
		java.lang.String synchronizeddate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countHoSoNghiepVuBySynchDate(tablename, synchronizeddate);
	}

	public static java.lang.Object getHoSoNghiepVuById(
		java.lang.String tablename, long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getHoSoNghiepVuById(tablename, id);
	}

	public static java.util.List<java.lang.Object> getHoSoNghiepVuBySynchDate(
		java.lang.String tablename, java.lang.String synchronizeddate,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getHoSoNghiepVuBySynchDate(tablename, synchronizeddate,
			start, end);
	}

	public static java.util.Date getCurrentTime()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCurrentTime();
	}

	public static void clearService() {
		_service = null;
	}

	public static DmDataItemService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmDataItemService.class.getName());

			if (invokableService instanceof DmDataItemService) {
				_service = (DmDataItemService)invokableService;
			}
			else {
				_service = new DmDataItemServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(DmDataItemServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DmDataItemService service) {
	}

	private static DmDataItemService _service;
}