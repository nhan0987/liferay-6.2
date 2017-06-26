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
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for DmDataItem. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author win_64
 * @see DmDataItemLocalServiceUtil
 * @see vn.dtt.gt.dk.dao.common.service.base.DmDataItemLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.impl.DmDataItemLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DmDataItemLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmDataItemLocalServiceUtil} to access the dm data item local service. Add custom service methods to {@link vn.dtt.gt.dk.dao.common.service.impl.DmDataItemLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the dm data item to the database. Also notifies the appropriate model listeners.
	*
	* @param dmDataItem the dm data item
	* @return the dm data item that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataItem addDmDataItem(
		vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	*
	* @param Id the primary key for the new dm data item
	* @return the new dm data item
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataItem createDmDataItem(long Id);

	/**
	* Deletes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item that was removed
	* @throws PortalException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataItem deleteDmDataItem(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the dm data item from the database. Also notifies the appropriate model listeners.
	*
	* @param dmDataItem the dm data item
	* @return the dm data item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataItem deleteDmDataItem(
		vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.gt.dk.dao.common.model.DmDataItem fetchDmDataItem(long Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data item with the primary key.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item
	* @throws PortalException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.gt.dk.dao.common.model.DmDataItem getDmDataItem(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm data items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of dm data items
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItems(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data items.
	*
	* @return the number of dm data items
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDmDataItemsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the dm data item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmDataItem the dm data item
	* @return the dm data item that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataItem updateDmDataItem(
		vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException;

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

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.gt.dk.dao.common.model.DmDataItem getByDataGroupCodeNameAndDataItemCode0(
		java.lang.String groupName, java.lang.String code_0);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.gt.dk.dao.common.model.DmDataItem getByDmDataGroupCodeNameAndCode0AndLevel(
		java.lang.String dmDataGroupCodeName, java.lang.String code_0, int level);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.dtt.gt.dk.dao.common.model.DmDataItem getByCode0(
		java.lang.String code_0);

	public vn.dtt.gt.dk.dao.common.model.DmDataItem findDataItemByDataGroupIdAndItemCode(
		long dataGroupId, java.lang.String itemCode);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findDmDataItemByDataGroupIdAndLevel(
		long groupId, int level);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByArrayCode0(
		java.lang.String arrayCode0);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupCodeNameAndDataItemCode0(
		java.lang.String groupName, java.lang.String code_0);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDmDataGroupCode(
		java.lang.String dmDataGroupCode);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupCodeNameAndDataItemAlterName(
		java.lang.String groupName, java.lang.String alterName);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByGroupName_AlterName(
		java.lang.String groupName, java.lang.String alterName);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevelAlterName(
		java.lang.String dmDataGroupCode, int level, java.lang.String alterName);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevelAndAlterName(
		long dmDataGroupId, int level, java.lang.String alterName);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevel(
		long dataGroupId, int level);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDmDataGroupCodeAndLevel(
		java.lang.String dmDataGroupCode, int level);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupId(
		long dataGroupId);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findBySpecificationCode(
		java.lang.String specificationcode, java.lang.String vehicleClass);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findBySpecificationCodeAndspecificationvalue(
		java.lang.String specificationcode,
		java.lang.String specificationvalue, java.lang.String vehicleClass);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndAlterName(
		long DataGroupId, java.lang.String AlterName);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByVehicleClassAndDatagroupid(
		long datagroupid, java.lang.String vehicleClass);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByVehicleClassAndDatagroupidByLoaiPhuongTien(
		long datagroupid, java.lang.String vehicleClass);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByNameGroupAndMultilAlterName(
		java.lang.String groupName, java.lang.String alterName1,
		java.lang.String alterName2);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findDmDataItemByDataGroupIdAndLevelAndCode1(
		long groupId, int level, java.lang.String code_1);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(
		long groupId, int level, java.lang.String code_1);

	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByGC_C0_C1_C2_C3_L_AN(
		long dataGroupId, java.lang.String code_0, java.lang.String code_1,
		java.lang.String code_2, java.lang.String code_3,
		java.lang.Integer level, java.lang.String alterName);
}