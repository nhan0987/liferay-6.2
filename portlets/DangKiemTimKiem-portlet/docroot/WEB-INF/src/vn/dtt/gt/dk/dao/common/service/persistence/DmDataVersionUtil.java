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

import vn.dtt.gt.dk.dao.common.model.DmDataVersion;

import java.util.List;

/**
 * The persistence utility for the dm data version service. This utility wraps {@link DmDataVersionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmDataVersionPersistence
 * @see DmDataVersionPersistenceImpl
 * @generated
 */
public class DmDataVersionUtil {
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
	public static void clearCache(DmDataVersion dmDataVersion) {
		getPersistence().clearCache(dmDataVersion);
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
	public static List<DmDataVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmDataVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmDataVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DmDataVersion update(DmDataVersion dmDataVersion)
		throws SystemException {
		return getPersistence().update(dmDataVersion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DmDataVersion update(DmDataVersion dmDataVersion,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dmDataVersion, serviceContext);
	}

	/**
	* Caches the dm data version in the entity cache if it is enabled.
	*
	* @param dmDataVersion the dm data version
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.common.model.DmDataVersion dmDataVersion) {
		getPersistence().cacheResult(dmDataVersion);
	}

	/**
	* Caches the dm data versions in the entity cache if it is enabled.
	*
	* @param dmDataVersions the dm data versions
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataVersion> dmDataVersions) {
		getPersistence().cacheResult(dmDataVersions);
	}

	/**
	* Creates a new dm data version with the primary key. Does not add the dm data version to the database.
	*
	* @param Id the primary key for the new dm data version
	* @return the new dm data version
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataVersion create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the dm data version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the dm data version
	* @return the dm data version that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException if a dm data version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataVersion remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException {
		return getPersistence().remove(Id);
	}

	public static vn.dtt.gt.dk.dao.common.model.DmDataVersion updateImpl(
		vn.dtt.gt.dk.dao.common.model.DmDataVersion dmDataVersion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dmDataVersion);
	}

	/**
	* Returns the dm data version with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException} if it could not be found.
	*
	* @param Id the primary key of the dm data version
	* @return the dm data version
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException if a dm data version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataVersion findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the dm data version with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the dm data version
	* @return the dm data version, or <code>null</code> if a dm data version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.DmDataVersion fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the dm data versions.
	*
	* @return the dm data versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataVersion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dm data versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data versions
	* @param end the upper bound of the range of dm data versions (not inclusive)
	* @return the range of dm data versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataVersion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dm data versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data versions
	* @param end the upper bound of the range of dm data versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm data versions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataVersion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dm data versions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dm data versions.
	*
	* @return the number of dm data versions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DmDataVersionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DmDataVersionPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					DmDataVersionPersistence.class.getName());

			ReferenceRegistry.registerReference(DmDataVersionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DmDataVersionPersistence persistence) {
	}

	private static DmDataVersionPersistence _persistence;
}