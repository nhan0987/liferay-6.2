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
 * Provides a wrapper for {@link DmDataItemService}.
 *
 * @author huymq
 * @see DmDataItemService
 * @generated
 */
public class DmDataItemServiceWrapper implements DmDataItemService,
	ServiceWrapper<DmDataItemService> {
	public DmDataItemServiceWrapper(DmDataItemService dmDataItemService) {
		_dmDataItemService = dmDataItemService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmDataItemService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmDataItemService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmDataItemService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public int countDmDataItems()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemService.countDmDataItems();
	}

	@Override
	public int countDmDataItems(java.lang.String synchronizeddate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemService.countDmDataItems(synchronizeddate);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItems(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemService.getDmDataItems(start, end);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItems(
		java.lang.String synchronizeddate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemService.getDmDataItems(synchronizeddate, start, end);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem getByDataGroupIdAndItemCode0(
		java.lang.String datagroupid, java.lang.String code0)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemService.getByDataGroupIdAndItemCode0(datagroupid,
			code0);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItemByGroupCode(
		java.lang.String datagroupid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemService.getDmDataItemByGroupCode(datagroupid);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItemByValidateFrom(
		java.lang.String validatefrom)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemService.getDmDataItemByValidateFrom(validatefrom);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getByGC_C0_C1_C2_C3_L_AN(
		java.lang.String groupCode, java.lang.String code0,
		java.lang.String code1, java.lang.String code2, java.lang.String code3,
		java.lang.Integer level, java.lang.String alterName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemService.getByGC_C0_C1_C2_C3_L_AN(groupCode, code0,
			code1, code2, code3, level, alterName);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getByGN_C0_C1_C2_C3_L_AN(
		java.lang.String groupName, java.lang.String code0,
		java.lang.String code1, java.lang.String code2, java.lang.String code3,
		java.lang.Integer level, java.lang.String alterName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemService.getByGN_C0_C1_C2_C3_L_AN(groupName, code0,
			code1, code2, code3, level, alterName);
	}

	@Override
	public int countHoSoNghiepVuBySynchDate(java.lang.String tablename,
		java.lang.String synchronizeddate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemService.countHoSoNghiepVuBySynchDate(tablename,
			synchronizeddate);
	}

	@Override
	public java.lang.Object getHoSoNghiepVuById(java.lang.String tablename,
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemService.getHoSoNghiepVuById(tablename, id);
	}

	@Override
	public java.util.List<java.lang.Object> getHoSoNghiepVuBySynchDate(
		java.lang.String tablename, java.lang.String synchronizeddate,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemService.getHoSoNghiepVuBySynchDate(tablename,
			synchronizeddate, start, end);
	}

	@Override
	public java.util.Date getCurrentTime()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemService.getCurrentTime();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmDataItemService getWrappedDmDataItemService() {
		return _dmDataItemService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmDataItemService(DmDataItemService dmDataItemService) {
		_dmDataItemService = dmDataItemService;
	}

	@Override
	public DmDataItemService getWrappedService() {
		return _dmDataItemService;
	}

	@Override
	public void setWrappedService(DmDataItemService dmDataItemService) {
		_dmDataItemService = dmDataItemService;
	}

	private DmDataItemService _dmDataItemService;
}