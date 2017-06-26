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

import vn.dtt.gt.dk.dao.common.model.DmDataGroup;

import java.util.List;

/**
 * The persistence utility for the dm data group service. This utility wraps {@link DmDataGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DmDataGroupPersistence
 * @see DmDataGroupPersistenceImpl
 * @generated
 */
public class DmDataGroupUtil {
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
	public static void clearCache(DmDataGroup dmDataGroup) {
		getPersistence().clearCache(dmDataGroup);
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
	public static List<DmDataGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmDataGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmDataGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmDataGroup update(DmDataGroup dmDataGroup)
		throws SystemException {
		return getPersistence().update(dmDataGroup);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmDataGroup update(DmDataGroup dmDataGroup,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmDataGroup, serviceContext);
	}

	/**
	* Returns the dm data group where Code = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException} if it could not be found.
	*
	* @param Code the code
	* @return the matching dm data group
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException if a matching dm data group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataGroup findByCode(
		java.lang.String Code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException {
		return getPersistence().findByCode(Code);
	}

	/**
	* Returns the dm data group where Code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param Code the code
	* @return the matching dm data group, or <code>null</code> if a matching dm data group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataGroup fetchByCode(
		java.lang.String Code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode(Code);
	}

	/**
	* Returns the dm data group where Code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param Code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm data group, or <code>null</code> if a matching dm data group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataGroup fetchByCode(
		java.lang.String Code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode(Code, retrieveFromCache);
	}

	/**
	* Removes the dm data group where Code = &#63; from the database.
	*
	* @param Code the code
	* @return the dm data group that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataGroup removeByCode(
		java.lang.String Code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException {
		return getPersistence().removeByCode(Code);
	}

	/**
	* Returns the number of dm data groups where Code = &#63;.
	*
	* @param Code the code
	* @return the number of matching dm data groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCode(java.lang.String Code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCode(Code);
	}

	/**
	* Caches the dm data group in the entity cache if it is enabled.
	*
	* @param dmDataGroup the dm data group
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.common.model.DmDataGroup dmDataGroup) {
		getPersistence().cacheResult(dmDataGroup);
	}

	/**
	* Caches the dm data groups in the entity cache if it is enabled.
	*
	* @param dmDataGroups the dm data groups
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataGroup> dmDataGroups) {
		getPersistence().cacheResult(dmDataGroups);
	}

	/**
	* Creates a new dm data group with the primary key. Does not add the dm data group to the database.
	*
	* @param Id the primary key for the new dm data group
	* @return the new dm data group
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataGroup create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the dm data group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the dm data group
	* @return the dm data group that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException if a dm data group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataGroup remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException {
		return getPersistence().remove(Id);
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataGroup updateImpl(
		vn.dtt.gt.dk.dao.common.model.DmDataGroup dmDataGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmDataGroup);
	}

	/**
	* Returns the dm data group with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException} if it could not be found.
	*
	* @param Id the primary key of the dm data group
	* @return the dm data group
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException if a dm data group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataGroup findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the dm data group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the dm data group
	* @return the dm data group, or <code>null</code> if a dm data group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataGroup fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the dm data groups.
	*
	* @return the dm data groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm data groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data groups
	* @param end the upper bound of the range of dm data groups (not inclusive)
	* @return the range of dm data groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataGroup> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm data groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data groups
	* @param end the upper bound of the range of dm data groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm data groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm data groups from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm data groups.
	*
	* @return the number of dm data groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmDataGroupPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmDataGroupPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					DmDataGroupPersistence.class.getName());

			ReferenceRegistry.registerReference(DmDataGroupUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmDataGroupPersistence persistence) {
	}

	private static DmDataGroupPersistence _persistence;
}