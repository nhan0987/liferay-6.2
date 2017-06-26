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

package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration;

import java.util.List;

/**
 * The persistence utility for the customs declaration service. This utility wraps {@link CustomsDeclarationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see CustomsDeclarationPersistence
 * @see CustomsDeclarationPersistenceImpl
 * @generated
 */
public class CustomsDeclarationUtil {
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
	public static void clearCache(CustomsDeclaration customsDeclaration) {
		getPersistence().clearCache(customsDeclaration);
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
	public static List<CustomsDeclaration> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CustomsDeclaration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CustomsDeclaration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CustomsDeclaration update(
		CustomsDeclaration customsDeclaration) throws SystemException {
		return getPersistence().update(customsDeclaration);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CustomsDeclaration update(
		CustomsDeclaration customsDeclaration, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(customsDeclaration, serviceContext);
	}

	/**
	* Returns the customs declaration where hosothutucId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException} if it could not be found.
	*
	* @param hosothutucId the hosothutuc ID
	* @return the matching customs declaration
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException if a matching customs declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration findByHoSoThuTucId(
		long hosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException {
		return getPersistence().findByHoSoThuTucId(hosothutucId);
	}

	/**
	* Returns the customs declaration where hosothutucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hosothutucId the hosothutuc ID
	* @return the matching customs declaration, or <code>null</code> if a matching customs declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration fetchByHoSoThuTucId(
		long hosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByHoSoThuTucId(hosothutucId);
	}

	/**
	* Returns the customs declaration where hosothutucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hosothutucId the hosothutuc ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching customs declaration, or <code>null</code> if a matching customs declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration fetchByHoSoThuTucId(
		long hosothutucId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId(hosothutucId, retrieveFromCache);
	}

	/**
	* Removes the customs declaration where hosothutucId = &#63; from the database.
	*
	* @param hosothutucId the hosothutuc ID
	* @return the customs declaration that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration removeByHoSoThuTucId(
		long hosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException {
		return getPersistence().removeByHoSoThuTucId(hosothutucId);
	}

	/**
	* Returns the number of customs declarations where hosothutucId = &#63;.
	*
	* @param hosothutucId the hosothutuc ID
	* @return the number of matching customs declarations
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucId(long hosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoSoThuTucId(hosothutucId);
	}

	/**
	* Caches the customs declaration in the entity cache if it is enabled.
	*
	* @param customsDeclaration the customs declaration
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration customsDeclaration) {
		getPersistence().cacheResult(customsDeclaration);
	}

	/**
	* Caches the customs declarations in the entity cache if it is enabled.
	*
	* @param customsDeclarations the customs declarations
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration> customsDeclarations) {
		getPersistence().cacheResult(customsDeclarations);
	}

	/**
	* Creates a new customs declaration with the primary key. Does not add the customs declaration to the database.
	*
	* @param id the primary key for the new customs declaration
	* @return the new customs declaration
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the customs declaration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the customs declaration
	* @return the customs declaration that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException if a customs declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration customsDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(customsDeclaration);
	}

	/**
	* Returns the customs declaration with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException} if it could not be found.
	*
	* @param id the primary key of the customs declaration
	* @return the customs declaration
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException if a customs declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the customs declaration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the customs declaration
	* @return the customs declaration, or <code>null</code> if a customs declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the customs declarations.
	*
	* @return the customs declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the customs declarations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CustomsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customs declarations
	* @param end the upper bound of the range of customs declarations (not inclusive)
	* @return the range of customs declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the customs declarations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CustomsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customs declarations
	* @param end the upper bound of the range of customs declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of customs declarations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the customs declarations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of customs declarations.
	*
	* @return the number of customs declarations
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CustomsDeclarationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CustomsDeclarationPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					CustomsDeclarationPersistence.class.getName());

			ReferenceRegistry.registerReference(CustomsDeclarationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CustomsDeclarationPersistence persistence) {
	}

	private static CustomsDeclarationPersistence _persistence;
}