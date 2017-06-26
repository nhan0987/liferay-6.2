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
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DmDataItem. This utility wraps
 * {@link vn.dtt.gt.dk.dao.common.service.impl.DmDataItemLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see DmDataItemLocalService
 * @see vn.dtt.gt.dk.dao.common.service.base.DmDataItemLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.common.service.impl.DmDataItemLocalServiceImpl
 * @generated
 */
public class DmDataItemLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.common.service.impl.DmDataItemLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dm data item to the database. Also notifies the appropriate model listeners.
	*
	* @param dmDataItem the dm data item
	* @return the dm data item that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem addDmDataItem(
		vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDmDataItem(dmDataItem);
	}

	/**
	* Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	*
	* @param Id the primary key for the new dm data item
	* @return the new dm data item
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem createDmDataItem(
		long Id) {
		return getService().createDmDataItem(Id);
	}

	/**
	* Deletes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item that was removed
	* @throws PortalException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem deleteDmDataItem(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDmDataItem(Id);
	}

	/**
	* Deletes the dm data item from the database. Also notifies the appropriate model listeners.
	*
	* @param dmDataItem the dm data item
	* @return the dm data item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem deleteDmDataItem(
		vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDmDataItem(dmDataItem);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchDmDataItem(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDmDataItem(Id);
	}

	/**
	* Returns the dm data item with the primary key.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item
	* @throws PortalException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem getDmDataItem(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmDataItem(Id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> getDmDataItems(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmDataItems(start, end);
	}

	/**
	* Returns the number of dm data items.
	*
	* @return the number of dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int getDmDataItemsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDmDataItemsCount();
	}

	/**
	* Updates the dm data item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmDataItem the dm data item
	* @return the dm data item that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem updateDmDataItem(
		vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDmDataItem(dmDataItem);
	}

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

	public static vn.dtt.gt.dk.dao.common.model.DmDataItem getByDataGroupCodeNameAndDataItemCode0(
		java.lang.String groupName, java.lang.String code_0) {
		return getService()
				   .getByDataGroupCodeNameAndDataItemCode0(groupName, code_0);
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItem getByDmDataGroupCodeNameAndCode0AndLevel(
		java.lang.String dmDataGroupCodeName, java.lang.String code_0, int level) {
		return getService()
				   .getByDmDataGroupCodeNameAndCode0AndLevel(dmDataGroupCodeName,
			code_0, level);
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItem getByCode0(
		java.lang.String code_0) {
		return getService().getByCode0(code_0);
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItem findDataItemByDataGroupIdAndItemCode(
		long dataGroupId, java.lang.String itemCode) {
		return getService()
				   .findDataItemByDataGroupIdAndItemCode(dataGroupId, itemCode);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findDmDataItemByDataGroupIdAndLevel(
		long groupId, int level) {
		return getService().findDmDataItemByDataGroupIdAndLevel(groupId, level);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByArrayCode0(
		java.lang.String arrayCode0) {
		return getService().findByArrayCode0(arrayCode0);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupCodeNameAndDataItemCode0(
		java.lang.String groupName, java.lang.String code_0) {
		return getService()
				   .findByDataGroupCodeNameAndDataItemCode0(groupName, code_0);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDmDataGroupCode(
		java.lang.String dmDataGroupCode) {
		return getService().findByDmDataGroupCode(dmDataGroupCode);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupCodeNameAndDataItemAlterName(
		java.lang.String groupName, java.lang.String alterName) {
		return getService()
				   .findByDataGroupCodeNameAndDataItemAlterName(groupName,
			alterName);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByGroupName_AlterName(
		java.lang.String groupName, java.lang.String alterName) {
		return getService().findByGroupName_AlterName(groupName, alterName);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevelAlterName(
		java.lang.String dmDataGroupCode, int level, java.lang.String alterName) {
		return getService()
				   .findByDataGroupIdAndLevelAlterName(dmDataGroupCode, level,
			alterName);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevelAndAlterName(
		long dmDataGroupId, int level, java.lang.String alterName) {
		return getService()
				   .findByDataGroupIdAndLevelAndAlterName(dmDataGroupId, level,
			alterName);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevel(
		long dataGroupId, int level) {
		return getService().findByDataGroupIdAndLevel(dataGroupId, level);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDmDataGroupCodeAndLevel(
		java.lang.String dmDataGroupCode, int level) {
		return getService().findByDmDataGroupCodeAndLevel(dmDataGroupCode, level);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupId(
		long dataGroupId) {
		return getService().findByDataGroupId(dataGroupId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findBySpecificationCode(
		java.lang.String specificationcode, java.lang.String vehicleClass) {
		return getService()
				   .findBySpecificationCode(specificationcode, vehicleClass);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findBySpecificationCodeAndspecificationvalue(
		java.lang.String specificationcode,
		java.lang.String specificationvalue, java.lang.String vehicleClass) {
		return getService()
				   .findBySpecificationCodeAndspecificationvalue(specificationcode,
			specificationvalue, vehicleClass);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndAlterName(
		long DataGroupId, java.lang.String AlterName) {
		return getService().findByDataGroupIdAndAlterName(DataGroupId, AlterName);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByVehicleClassAndDatagroupid(
		long datagroupid, java.lang.String vehicleClass) {
		return getService()
				   .findByVehicleClassAndDatagroupid(datagroupid, vehicleClass);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByVehicleClassAndDatagroupidByLoaiPhuongTien(
		long datagroupid, java.lang.String vehicleClass) {
		return getService()
				   .findByVehicleClassAndDatagroupidByLoaiPhuongTien(datagroupid,
			vehicleClass);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByNameGroupAndMultilAlterName(
		java.lang.String groupName, java.lang.String alterName1,
		java.lang.String alterName2) {
		return getService()
				   .findByNameGroupAndMultilAlterName(groupName, alterName1,
			alterName2);
	}

	public static void clearService() {
		_service = null;
	}

	public static DmDataItemLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DmDataItemLocalService.class.getName());

			if (invokableLocalService instanceof DmDataItemLocalService) {
				_service = (DmDataItemLocalService)invokableLocalService;
			}
			else {
				_service = new DmDataItemLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DmDataItemLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DmDataItemLocalService service) {
	}

	private static DmDataItemLocalService _service;
}