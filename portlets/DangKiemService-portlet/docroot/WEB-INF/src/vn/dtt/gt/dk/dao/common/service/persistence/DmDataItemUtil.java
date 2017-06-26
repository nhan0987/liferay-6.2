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

package vn.dtt.gt.dk.dao.common.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.common.model.DmDataItem;

import java.util.List;

/**
 * The persistence utility for the dm data item service. This utility wraps {@link DmDataItemPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DmDataItemPersistence
 * @see DmDataItemPersistenceImpl
 * @generated
 */
public class DmDataItemUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(DmDataItem dmDataItem) {
		getPersistence().clearCache(dmDataItem);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DmDataItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmDataItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmDataItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmDataItem update(DmDataItem dmDataItem)
		throws SystemException {
		return getPersistence().update(dmDataItem);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmDataItem update(DmDataItem dmDataItem,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmDataItem, serviceContext);
	}

	/**
	* Returns the dm data item where Code0 = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException} if it could not be found.
	*
	* @param Code0 the code0
	* @return the matching dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem findByCode0(
		java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence().findByCode0(Code0);
	}

	/**
	* Returns the dm data item where Code0 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param Code0 the code0
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchByCode0(
		java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode0(Code0);
	}

	/**
	* Returns the dm data item where Code0 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param Code0 the code0
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchByCode0(
		java.lang.String Code0, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode0(Code0, retrieveFromCache);
	}

	/**
	* Removes the dm data item where Code0 = &#63; from the database.
	*
	* @param Code0 the code0
	* @return the dm data item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem removeByCode0(
		java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence().removeByCode0(Code0);
	}

	/**
	* Returns the number of dm data items where Code0 = &#63;.
	*
	* @param Code0 the code0
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCode0(java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCode0(Code0);
	}

	/**
	* Returns all the dm data items where DataGroupId = &#63; and Code0 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndCode0(
		long DataGroupId, java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDataGroupIdAndCode0(DataGroupId, Code0);
	}

	/**
	* Returns a range of all the dm data items where DataGroupId = &#63; and Code0 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndCode0(
		long DataGroupId, java.lang.String Code0, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndCode0(DataGroupId, Code0, start, end);
	}

	/**
	* Returns an ordered range of all the dm data items where DataGroupId = &#63; and Code0 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndCode0(
		long DataGroupId, java.lang.String Code0, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndCode0(DataGroupId, Code0, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63; and Code0 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem findByDataGroupIdAndCode0_First(
		long DataGroupId, java.lang.String Code0,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndCode0_First(DataGroupId, Code0,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63; and Code0 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchByDataGroupIdAndCode0_First(
		long DataGroupId, java.lang.String Code0,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndCode0_First(DataGroupId, Code0,
			orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63; and Code0 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem findByDataGroupIdAndCode0_Last(
		long DataGroupId, java.lang.String Code0,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndCode0_Last(DataGroupId, Code0,
			orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63; and Code0 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchByDataGroupIdAndCode0_Last(
		long DataGroupId, java.lang.String Code0,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndCode0_Last(DataGroupId, Code0,
			orderByComparator);
	}

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Code0 = &#63;.
	*
	* @param Id the primary key of the current dm data item
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem[] findByDataGroupIdAndCode0_PrevAndNext(
		long Id, long DataGroupId, java.lang.String Code0,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndCode0_PrevAndNext(Id, DataGroupId,
			Code0, orderByComparator);
	}

	/**
	* Removes all the dm data items where DataGroupId = &#63; and Code0 = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDataGroupIdAndCode0(long DataGroupId,
		java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDataGroupIdAndCode0(DataGroupId, Code0);
	}

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and Code0 = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Code0 the code0
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupIdAndCode0(long DataGroupId,
		java.lang.String Code0)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDataGroupIdAndCode0(DataGroupId, Code0);
	}

	/**
	* Returns all the dm data items where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param AlterName the alter name
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevelAlterName(
		long DataGroupId, int Level, java.lang.String AlterName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndLevelAlterName(DataGroupId, Level,
			AlterName);
	}

	/**
	* Returns a range of all the dm data items where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param AlterName the alter name
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevelAlterName(
		long DataGroupId, int Level, java.lang.String AlterName, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndLevelAlterName(DataGroupId, Level,
			AlterName, start, end);
	}

	/**
	* Returns an ordered range of all the dm data items where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param AlterName the alter name
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevelAlterName(
		long DataGroupId, int Level, java.lang.String AlterName, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndLevelAlterName(DataGroupId, Level,
			AlterName, start, end, orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param AlterName the alter name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem findByDataGroupIdAndLevelAlterName_First(
		long DataGroupId, int Level, java.lang.String AlterName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevelAlterName_First(DataGroupId,
			Level, AlterName, orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param AlterName the alter name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchByDataGroupIdAndLevelAlterName_First(
		long DataGroupId, int Level, java.lang.String AlterName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndLevelAlterName_First(DataGroupId,
			Level, AlterName, orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param AlterName the alter name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem findByDataGroupIdAndLevelAlterName_Last(
		long DataGroupId, int Level, java.lang.String AlterName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevelAlterName_Last(DataGroupId, Level,
			AlterName, orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param AlterName the alter name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchByDataGroupIdAndLevelAlterName_Last(
		long DataGroupId, int Level, java.lang.String AlterName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndLevelAlterName_Last(DataGroupId,
			Level, AlterName, orderByComparator);
	}

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	*
	* @param Id the primary key of the current dm data item
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param AlterName the alter name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem[] findByDataGroupIdAndLevelAlterName_PrevAndNext(
		long Id, long DataGroupId, int Level, java.lang.String AlterName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevelAlterName_PrevAndNext(Id,
			DataGroupId, Level, AlterName, orderByComparator);
	}

	/**
	* Removes all the dm data items where DataGroupId = &#63; and Level = &#63; and AlterName = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param AlterName the alter name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDataGroupIdAndLevelAlterName(long DataGroupId,
		int Level, java.lang.String AlterName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDataGroupIdAndLevelAlterName(DataGroupId, Level, AlterName);
	}

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param AlterName the alter name
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupIdAndLevelAlterName(long DataGroupId,
		int Level, java.lang.String AlterName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDataGroupIdAndLevelAlterName(DataGroupId, Level,
			AlterName);
	}

	/**
	* Returns all the dm data items where DataGroupId = &#63; and Level = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevel(
		long DataGroupId, int Level)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDataGroupIdAndLevel(DataGroupId, Level);
	}

	/**
	* Returns a range of all the dm data items where DataGroupId = &#63; and Level = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevel(
		long DataGroupId, int Level, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel(DataGroupId, Level, start, end);
	}

	/**
	* Returns an ordered range of all the dm data items where DataGroupId = &#63; and Level = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndLevel(
		long DataGroupId, int Level, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel(DataGroupId, Level, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem findByDataGroupIdAndLevel_First(
		long DataGroupId, int Level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel_First(DataGroupId, Level,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchByDataGroupIdAndLevel_First(
		long DataGroupId, int Level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndLevel_First(DataGroupId, Level,
			orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem findByDataGroupIdAndLevel_Last(
		long DataGroupId, int Level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel_Last(DataGroupId, Level,
			orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchByDataGroupIdAndLevel_Last(
		long DataGroupId, int Level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndLevel_Last(DataGroupId, Level,
			orderByComparator);
	}

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	*
	* @param Id the primary key of the current dm data item
	* @param DataGroupId the data group ID
	* @param Level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem[] findByDataGroupIdAndLevel_PrevAndNext(
		long Id, long DataGroupId, int Level,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndLevel_PrevAndNext(Id, DataGroupId,
			Level, orderByComparator);
	}

	/**
	* Removes all the dm data items where DataGroupId = &#63; and Level = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDataGroupIdAndLevel(long DataGroupId, int Level)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDataGroupIdAndLevel(DataGroupId, Level);
	}

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and Level = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param Level the level
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupIdAndLevel(long DataGroupId, int Level)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDataGroupIdAndLevel(DataGroupId, Level);
	}

	/**
	* Returns all the dm data items where DataGroupId = &#63;.
	*
	* @param DataGroupId the data group ID
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupId(
		long DataGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDataGroupId(DataGroupId);
	}

	/**
	* Returns a range of all the dm data items where DataGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupId(
		long DataGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDataGroupId(DataGroupId, start, end);
	}

	/**
	* Returns an ordered range of all the dm data items where DataGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupId(
		long DataGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupId(DataGroupId, start, end, orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem findByDataGroupId_First(
		long DataGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupId_First(DataGroupId, orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchByDataGroupId_First(
		long DataGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupId_First(DataGroupId, orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem findByDataGroupId_Last(
		long DataGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupId_Last(DataGroupId, orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchByDataGroupId_Last(
		long DataGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupId_Last(DataGroupId, orderByComparator);
	}

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63;.
	*
	* @param Id the primary key of the current dm data item
	* @param DataGroupId the data group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem[] findByDataGroupId_PrevAndNext(
		long Id, long DataGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupId_PrevAndNext(Id, DataGroupId,
			orderByComparator);
	}

	/**
	* Removes all the dm data items where DataGroupId = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDataGroupId(long DataGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDataGroupId(DataGroupId);
	}

	/**
	* Returns the number of dm data items where DataGroupId = &#63;.
	*
	* @param DataGroupId the data group ID
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupId(long DataGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDataGroupId(DataGroupId);
	}

	/**
	* Returns all the dm data items where DataGroupId = &#63; and AlterName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param AlterName the alter name
	* @return the matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndAlterName(
		long DataGroupId, java.lang.String AlterName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndAlterName(DataGroupId, AlterName);
	}

	/**
	* Returns a range of all the dm data items where DataGroupId = &#63; and AlterName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param AlterName the alter name
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndAlterName(
		long DataGroupId, java.lang.String AlterName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndAlterName(DataGroupId, AlterName,
			start, end);
	}

	/**
	* Returns an ordered range of all the dm data items where DataGroupId = &#63; and AlterName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param DataGroupId the data group ID
	* @param AlterName the alter name
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findByDataGroupIdAndAlterName(
		long DataGroupId, java.lang.String AlterName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDataGroupIdAndAlterName(DataGroupId, AlterName,
			start, end, orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63; and AlterName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param AlterName the alter name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem findByDataGroupIdAndAlterName_First(
		long DataGroupId, java.lang.String AlterName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndAlterName_First(DataGroupId, AlterName,
			orderByComparator);
	}

	/**
	* Returns the first dm data item in the ordered set where DataGroupId = &#63; and AlterName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param AlterName the alter name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchByDataGroupIdAndAlterName_First(
		long DataGroupId, java.lang.String AlterName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndAlterName_First(DataGroupId,
			AlterName, orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63; and AlterName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param AlterName the alter name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem findByDataGroupIdAndAlterName_Last(
		long DataGroupId, java.lang.String AlterName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndAlterName_Last(DataGroupId, AlterName,
			orderByComparator);
	}

	/**
	* Returns the last dm data item in the ordered set where DataGroupId = &#63; and AlterName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param AlterName the alter name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchByDataGroupIdAndAlterName_Last(
		long DataGroupId, java.lang.String AlterName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDataGroupIdAndAlterName_Last(DataGroupId, AlterName,
			orderByComparator);
	}

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and AlterName = &#63;.
	*
	* @param Id the primary key of the current dm data item
	* @param DataGroupId the data group ID
	* @param AlterName the alter name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem[] findByDataGroupIdAndAlterName_PrevAndNext(
		long Id, long DataGroupId, java.lang.String AlterName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence()
				   .findByDataGroupIdAndAlterName_PrevAndNext(Id, DataGroupId,
			AlterName, orderByComparator);
	}

	/**
	* Removes all the dm data items where DataGroupId = &#63; and AlterName = &#63; from the database.
	*
	* @param DataGroupId the data group ID
	* @param AlterName the alter name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDataGroupIdAndAlterName(long DataGroupId,
		java.lang.String AlterName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDataGroupIdAndAlterName(DataGroupId, AlterName);
	}

	/**
	* Returns the number of dm data items where DataGroupId = &#63; and AlterName = &#63;.
	*
	* @param DataGroupId the data group ID
	* @param AlterName the alter name
	* @return the number of matching dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDataGroupIdAndAlterName(long DataGroupId,
		java.lang.String AlterName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDataGroupIdAndAlterName(DataGroupId, AlterName);
	}

	/**
	* Caches the dm data item in the entity cache if it is enabled.
	*
	* @param dmDataItem the dm data item
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem) {
		getPersistence().cacheResult(dmDataItem);
	}

	/**
	* Caches the dm data items in the entity cache if it is enabled.
	*
	* @param dmDataItems the dm data items
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> dmDataItems) {
		getPersistence().cacheResult(dmDataItems);
	}

	/**
	* Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	*
	* @param Id the primary key for the new dm data item
	* @return the new dm data item
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence().remove(Id);
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataItem updateImpl(
		vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmDataItem);
	}

	/**
	* Returns the dm data item with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException} if it could not be found.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the dm data item
	* @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataItem fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the dm data items.
	*
	* @return the dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm data items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataItem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm data items from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm data items.
	*
	* @return the number of dm data items
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmDataItemPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmDataItemPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					DmDataItemPersistence.class.getName());

			ReferenceRegistry.registerReference(DmDataItemUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmDataItemPersistence persistence) {
	}

	private static DmDataItemPersistence _persistence;
}