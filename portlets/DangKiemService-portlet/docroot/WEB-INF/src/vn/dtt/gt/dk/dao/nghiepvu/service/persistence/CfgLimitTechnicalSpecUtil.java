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

import vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec;

import java.util.List;

/**
 * The persistence utility for the cfg limit technical spec service. This utility wraps {@link CfgLimitTechnicalSpecPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CfgLimitTechnicalSpecPersistence
 * @see CfgLimitTechnicalSpecPersistenceImpl
 * @generated
 */
public class CfgLimitTechnicalSpecUtil {
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
	public static void clearCache(CfgLimitTechnicalSpec cfgLimitTechnicalSpec) {
		getPersistence().clearCache(cfgLimitTechnicalSpec);
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
	public static List<CfgLimitTechnicalSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CfgLimitTechnicalSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CfgLimitTechnicalSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CfgLimitTechnicalSpec update(
		CfgLimitTechnicalSpec cfgLimitTechnicalSpec) throws SystemException {
		return getPersistence().update(cfgLimitTechnicalSpec);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CfgLimitTechnicalSpec update(
		CfgLimitTechnicalSpec cfgLimitTechnicalSpec,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(cfgLimitTechnicalSpec, serviceContext);
	}

	/**
	* Returns the cfg limit technical spec where specificationcode = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException} if it could not be found.
	*
	* @param specificationcode the specificationcode
	* @return the matching cfg limit technical spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException if a matching cfg limit technical spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec findBySpecificationCode(
		java.lang.String specificationcode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException {
		return getPersistence().findBySpecificationCode(specificationcode);
	}

	/**
	* Returns the cfg limit technical spec where specificationcode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param specificationcode the specificationcode
	* @return the matching cfg limit technical spec, or <code>null</code> if a matching cfg limit technical spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec fetchBySpecificationCode(
		java.lang.String specificationcode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBySpecificationCode(specificationcode);
	}

	/**
	* Returns the cfg limit technical spec where specificationcode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param specificationcode the specificationcode
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching cfg limit technical spec, or <code>null</code> if a matching cfg limit technical spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec fetchBySpecificationCode(
		java.lang.String specificationcode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySpecificationCode(specificationcode,
			retrieveFromCache);
	}

	/**
	* Removes the cfg limit technical spec where specificationcode = &#63; from the database.
	*
	* @param specificationcode the specificationcode
	* @return the cfg limit technical spec that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec removeBySpecificationCode(
		java.lang.String specificationcode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException {
		return getPersistence().removeBySpecificationCode(specificationcode);
	}

	/**
	* Returns the number of cfg limit technical specs where specificationcode = &#63;.
	*
	* @param specificationcode the specificationcode
	* @return the number of matching cfg limit technical specs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySpecificationCode(
		java.lang.String specificationcode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySpecificationCode(specificationcode);
	}

	/**
	* Caches the cfg limit technical spec in the entity cache if it is enabled.
	*
	* @param cfgLimitTechnicalSpec the cfg limit technical spec
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec cfgLimitTechnicalSpec) {
		getPersistence().cacheResult(cfgLimitTechnicalSpec);
	}

	/**
	* Caches the cfg limit technical specs in the entity cache if it is enabled.
	*
	* @param cfgLimitTechnicalSpecs the cfg limit technical specs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec> cfgLimitTechnicalSpecs) {
		getPersistence().cacheResult(cfgLimitTechnicalSpecs);
	}

	/**
	* Creates a new cfg limit technical spec with the primary key. Does not add the cfg limit technical spec to the database.
	*
	* @param id the primary key for the new cfg limit technical spec
	* @return the new cfg limit technical spec
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the cfg limit technical spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the cfg limit technical spec
	* @return the cfg limit technical spec that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException if a cfg limit technical spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec cfgLimitTechnicalSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(cfgLimitTechnicalSpec);
	}

	/**
	* Returns the cfg limit technical spec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException} if it could not be found.
	*
	* @param id the primary key of the cfg limit technical spec
	* @return the cfg limit technical spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException if a cfg limit technical spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgLimitTechnicalSpecException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the cfg limit technical spec with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the cfg limit technical spec
	* @return the cfg limit technical spec, or <code>null</code> if a cfg limit technical spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the cfg limit technical specs.
	*
	* @return the cfg limit technical specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the cfg limit technical specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgLimitTechnicalSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cfg limit technical specs
	* @param end the upper bound of the range of cfg limit technical specs (not inclusive)
	* @return the range of cfg limit technical specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the cfg limit technical specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgLimitTechnicalSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cfg limit technical specs
	* @param end the upper bound of the range of cfg limit technical specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cfg limit technical specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the cfg limit technical specs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cfg limit technical specs.
	*
	* @return the number of cfg limit technical specs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CfgLimitTechnicalSpecPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CfgLimitTechnicalSpecPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					CfgLimitTechnicalSpecPersistence.class.getName());

			ReferenceRegistry.registerReference(CfgLimitTechnicalSpecUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CfgLimitTechnicalSpecPersistence persistence) {
	}

	private static CfgLimitTechnicalSpecPersistence _persistence;
}