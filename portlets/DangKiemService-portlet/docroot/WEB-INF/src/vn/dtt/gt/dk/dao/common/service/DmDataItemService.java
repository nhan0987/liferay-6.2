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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for DmDataItem. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author huymq
 * @see DmDataItemServiceUtil
 * @see vn.dtt.gt.dk.dao.common.service.base.DmDataItemServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.impl.DmDataItemServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DmDataItemService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmDataItemServiceUtil} to access the dm data item remote service. Add custom service methods to {@link vn.dtt.gt.dk.dao.common.service.impl.DmDataItemServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public int countDmDataItems()
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countDmDataItems(java.lang.String synchronizeddate)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItems(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItems(
		java.lang.String synchronizeddate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.gt.dk.dao.common.model.DmDataItem getByDataGroupIdAndItemCode0(
		java.lang.String datagroupid, java.lang.String code0)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItemByGroupCode(
		java.lang.String datagroupid)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItemByValidateFrom(
		java.lang.String validatefrom)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getByGC_C0_C1_C2_C3_L_AN(
		java.lang.String groupCode, java.lang.String code0,
		java.lang.String code1, java.lang.String code2, java.lang.String code3,
		java.lang.Integer level, java.lang.String alterName)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getByGN_C0_C1_C2_C3_L_AN(
		java.lang.String groupName, java.lang.String code0,
		java.lang.String code1, java.lang.String code2, java.lang.String code3,
		java.lang.Integer level, java.lang.String alterName)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countHoSoNghiepVuBySynchDate(java.lang.String tablename,
		java.lang.String synchronizeddate)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.Object getHoSoNghiepVuById(java.lang.String tablename,
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<java.lang.Object> getHoSoNghiepVuBySynchDate(
		java.lang.String tablename, java.lang.String synchronizeddate,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.Date getCurrentTime()
		throws com.liferay.portal.kernel.exception.SystemException;
}