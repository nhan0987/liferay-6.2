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
 * Provides a wrapper for {@link DmDataItemLocalService}.
 *
 * @author win_64
 * @see DmDataItemLocalService
 * @generated
 */
public class DmDataItemLocalServiceWrapper implements DmDataItemLocalService,
	ServiceWrapper<DmDataItemLocalService> {
	public DmDataItemLocalServiceWrapper(
		DmDataItemLocalService dmDataItemLocalService) {
		_dmDataItemLocalService = dmDataItemLocalService;
	}

	/**
	* Adds the dm data item to the database. Also notifies the appropriate model listeners.
	*
	* @param dmDataItem the dm data item
	* @return the dm data item that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem addDmDataItem(
		vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.addDmDataItem(dmDataItem);
	}

	/**
	* Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	*
	* @param Id the primary key for the new dm data item
	* @return the new dm data item
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem createDmDataItem(long Id) {
		return _dmDataItemLocalService.createDmDataItem(Id);
	}

	/**
	* Deletes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item that was removed
	* @throws PortalException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem deleteDmDataItem(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.deleteDmDataItem(Id);
	}

	/**
	* Deletes the dm data item from the database. Also notifies the appropriate model listeners.
	*
	* @param dmDataItem the dm data item
	* @return the dm data item that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem deleteDmDataItem(
		vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.deleteDmDataItem(dmDataItem);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dmDataItemLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem fetchDmDataItem(long Id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.fetchDmDataItem(Id);
	}

	/**
	* Returns the dm data item with the primary key.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item
	* @throws PortalException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem getDmDataItem(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.getDmDataItem(Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItems(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.getDmDataItems(start, end);
	}

	/**
	* Returns the number of dm data items.
	*
	* @return the number of dm data items
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDmDataItemsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.getDmDataItemsCount();
	}

	/**
	* Updates the dm data item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmDataItem the dm data item
	* @return the dm data item that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem updateDmDataItem(
		vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmDataItemLocalService.updateDmDataItem(dmDataItem);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dmDataItemLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dmDataItemLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dmDataItemLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem getByDataGroupCodeNameAndDataItemCode0(
		java.lang.String groupName, java.lang.String code_0) {
		return _dmDataItemLocalService.getByDataGroupCodeNameAndDataItemCode0(groupName,
			code_0);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem getByDmDataGroupCodeNameAndCode0AndLevel(
		java.lang.String dmDataGroupCodeName, java.lang.String code_0, int level) {
		return _dmDataItemLocalService.getByDmDataGroupCodeNameAndCode0AndLevel(dmDataGroupCodeName,
			code_0, level);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem getByCode0(
		java.lang.String code_0) {
		return _dmDataItemLocalService.getByCode0(code_0);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.DmDataItem findDataItemByDataGroupIdAndItemCode(
		long dataGroupId, java.lang.String itemCode) {
		return _dmDataItemLocalService.findDataItemByDataGroupIdAndItemCode(dataGroupId,
			itemCode);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findDmDataItemByDataGroupIdAndLevel(
		long groupId, int level) {
		return _dmDataItemLocalService.findDmDataItemByDataGroupIdAndLevel(groupId,
			level);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByArrayCode0(
		java.lang.String arrayCode0) {
		return _dmDataItemLocalService.findByArrayCode0(arrayCode0);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupCodeNameAndDataItemCode0(
		java.lang.String groupName, java.lang.String code_0) {
		return _dmDataItemLocalService.findByDataGroupCodeNameAndDataItemCode0(groupName,
			code_0);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDmDataGroupCode(
		java.lang.String dmDataGroupCode) {
		return _dmDataItemLocalService.findByDmDataGroupCode(dmDataGroupCode);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupCodeNameAndDataItemAlterName(
		java.lang.String groupName, java.lang.String alterName) {
		return _dmDataItemLocalService.findByDataGroupCodeNameAndDataItemAlterName(groupName,
			alterName);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByGroupName_AlterName(
		java.lang.String groupName, java.lang.String alterName) {
		return _dmDataItemLocalService.findByGroupName_AlterName(groupName,
			alterName);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevelAlterName(
		java.lang.String dmDataGroupCode, int level, java.lang.String alterName) {
		return _dmDataItemLocalService.findByDataGroupIdAndLevelAlterName(dmDataGroupCode,
			level, alterName);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevelAndAlterName(
		long dmDataGroupId, int level, java.lang.String alterName) {
		return _dmDataItemLocalService.findByDataGroupIdAndLevelAndAlterName(dmDataGroupId,
			level, alterName);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevel(
		long dataGroupId, int level) {
		return _dmDataItemLocalService.findByDataGroupIdAndLevel(dataGroupId,
			level);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDmDataGroupCodeAndLevel(
		java.lang.String dmDataGroupCode, int level) {
		return _dmDataItemLocalService.findByDmDataGroupCodeAndLevel(dmDataGroupCode,
			level);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupId(
		long dataGroupId) {
		return _dmDataItemLocalService.findByDataGroupId(dataGroupId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findBySpecificationCode(
		java.lang.String specificationcode, java.lang.String vehicleClass) {
		return _dmDataItemLocalService.findBySpecificationCode(specificationcode,
			vehicleClass);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findBySpecificationCodeAndspecificationvalue(
		java.lang.String specificationcode,
		java.lang.String specificationvalue, java.lang.String vehicleClass) {
		return _dmDataItemLocalService.findBySpecificationCodeAndspecificationvalue(specificationcode,
			specificationvalue, vehicleClass);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndAlterName(
		long DataGroupId, java.lang.String AlterName) {
		return _dmDataItemLocalService.findByDataGroupIdAndAlterName(DataGroupId,
			AlterName);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByVehicleClassAndDatagroupid(
		long datagroupid, java.lang.String vehicleClass) {
		return _dmDataItemLocalService.findByVehicleClassAndDatagroupid(datagroupid,
			vehicleClass);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByVehicleClassAndDatagroupidByLoaiPhuongTien(
		long datagroupid, java.lang.String vehicleClass) {
		return _dmDataItemLocalService.findByVehicleClassAndDatagroupidByLoaiPhuongTien(datagroupid,
			vehicleClass);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByNameGroupAndMultilAlterName(
		java.lang.String groupName, java.lang.String alterName1,
		java.lang.String alterName2) {
		return _dmDataItemLocalService.findByNameGroupAndMultilAlterName(groupName,
			alterName1, alterName2);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findDmDataItemByDataGroupIdAndLevelAndCode1(
		long groupId, int level, java.lang.String code_1) {
		return _dmDataItemLocalService.findDmDataItemByDataGroupIdAndLevelAndCode1(groupId,
			level, code_1);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(
		long groupId, int level, java.lang.String code_1) {
		return _dmDataItemLocalService.findDmDataItemByDataGroupIdAndLevelAndCode1OrderByDescription(groupId,
			level, code_1);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByGC_C0_C1_C2_C3_L_AN(
		long dataGroupId, java.lang.String code_0, java.lang.String code_1,
		java.lang.String code_2, java.lang.String code_3,
		java.lang.Integer level, java.lang.String alterName) {
		return _dmDataItemLocalService.findByGC_C0_C1_C2_C3_L_AN(dataGroupId,
			code_0, code_1, code_2, code_3, level, alterName);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DmDataItemLocalService getWrappedDmDataItemLocalService() {
		return _dmDataItemLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDmDataItemLocalService(
		DmDataItemLocalService dmDataItemLocalService) {
		_dmDataItemLocalService = dmDataItemLocalService;
	}

	@Override
	public DmDataItemLocalService getWrappedService() {
		return _dmDataItemLocalService;
	}

	@Override
	public void setWrappedService(DmDataItemLocalService dmDataItemLocalService) {
		_dmDataItemLocalService = dmDataItemLocalService;
	}

	private DmDataItemLocalService _dmDataItemLocalService;
}