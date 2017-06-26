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

import vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec;

import java.util.List;

/**
 * The persistence utility for the cfg technicalspec service. This utility wraps {@link CfgTechnicalspecPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CfgTechnicalspecPersistence
 * @see CfgTechnicalspecPersistenceImpl
 * @generated
 */
public class CfgTechnicalspecUtil {
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
	public static void clearCache(CfgTechnicalspec cfgTechnicalspec) {
		getPersistence().clearCache(cfgTechnicalspec);
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
	public static List<CfgTechnicalspec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CfgTechnicalspec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CfgTechnicalspec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CfgTechnicalspec update(CfgTechnicalspec cfgTechnicalspec)
		throws SystemException {
		return getPersistence().update(cfgTechnicalspec);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CfgTechnicalspec update(CfgTechnicalspec cfgTechnicalspec,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(cfgTechnicalspec, serviceContext);
	}

	/**
	* Returns all the cfg technicalspecs where vehicleTypeCode = &#63;.
	*
	* @param vehicleTypeCode the vehicle type code
	* @return the matching cfg technicalspecs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> findByVehicleTypeCode(
		java.lang.String vehicleTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByVehicleTypeCode(vehicleTypeCode);
	}

	/**
	* Returns a range of all the cfg technicalspecs where vehicleTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleTypeCode the vehicle type code
	* @param start the lower bound of the range of cfg technicalspecs
	* @param end the upper bound of the range of cfg technicalspecs (not inclusive)
	* @return the range of matching cfg technicalspecs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> findByVehicleTypeCode(
		java.lang.String vehicleTypeCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByVehicleTypeCode(vehicleTypeCode, start, end);
	}

	/**
	* Returns an ordered range of all the cfg technicalspecs where vehicleTypeCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleTypeCode the vehicle type code
	* @param start the lower bound of the range of cfg technicalspecs
	* @param end the upper bound of the range of cfg technicalspecs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cfg technicalspecs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> findByVehicleTypeCode(
		java.lang.String vehicleTypeCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByVehicleTypeCode(vehicleTypeCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first cfg technicalspec in the ordered set where vehicleTypeCode = &#63;.
	*
	* @param vehicleTypeCode the vehicle type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cfg technicalspec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a matching cfg technicalspec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec findByVehicleTypeCode_First(
		java.lang.String vehicleTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException {
		return getPersistence()
				   .findByVehicleTypeCode_First(vehicleTypeCode,
			orderByComparator);
	}

	/**
	* Returns the first cfg technicalspec in the ordered set where vehicleTypeCode = &#63;.
	*
	* @param vehicleTypeCode the vehicle type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cfg technicalspec, or <code>null</code> if a matching cfg technicalspec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec fetchByVehicleTypeCode_First(
		java.lang.String vehicleTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleTypeCode_First(vehicleTypeCode,
			orderByComparator);
	}

	/**
	* Returns the last cfg technicalspec in the ordered set where vehicleTypeCode = &#63;.
	*
	* @param vehicleTypeCode the vehicle type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cfg technicalspec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a matching cfg technicalspec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec findByVehicleTypeCode_Last(
		java.lang.String vehicleTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException {
		return getPersistence()
				   .findByVehicleTypeCode_Last(vehicleTypeCode,
			orderByComparator);
	}

	/**
	* Returns the last cfg technicalspec in the ordered set where vehicleTypeCode = &#63;.
	*
	* @param vehicleTypeCode the vehicle type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cfg technicalspec, or <code>null</code> if a matching cfg technicalspec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec fetchByVehicleTypeCode_Last(
		java.lang.String vehicleTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleTypeCode_Last(vehicleTypeCode,
			orderByComparator);
	}

	/**
	* Returns the cfg technicalspecs before and after the current cfg technicalspec in the ordered set where vehicleTypeCode = &#63;.
	*
	* @param id the primary key of the current cfg technicalspec
	* @param vehicleTypeCode the vehicle type code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cfg technicalspec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a cfg technicalspec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec[] findByVehicleTypeCode_PrevAndNext(
		long id, java.lang.String vehicleTypeCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException {
		return getPersistence()
				   .findByVehicleTypeCode_PrevAndNext(id, vehicleTypeCode,
			orderByComparator);
	}

	/**
	* Removes all the cfg technicalspecs where vehicleTypeCode = &#63; from the database.
	*
	* @param vehicleTypeCode the vehicle type code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByVehicleTypeCode(java.lang.String vehicleTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByVehicleTypeCode(vehicleTypeCode);
	}

	/**
	* Returns the number of cfg technicalspecs where vehicleTypeCode = &#63;.
	*
	* @param vehicleTypeCode the vehicle type code
	* @return the number of matching cfg technicalspecs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVehicleTypeCode(java.lang.String vehicleTypeCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByVehicleTypeCode(vehicleTypeCode);
	}

	/**
	* Returns the cfg technicalspec where specificationCode = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException} if it could not be found.
	*
	* @param specificationCode the specification code
	* @return the matching cfg technicalspec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a matching cfg technicalspec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec findBySpecificationCode(
		java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException {
		return getPersistence().findBySpecificationCode(specificationCode);
	}

	/**
	* Returns the cfg technicalspec where specificationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param specificationCode the specification code
	* @return the matching cfg technicalspec, or <code>null</code> if a matching cfg technicalspec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec fetchBySpecificationCode(
		java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBySpecificationCode(specificationCode);
	}

	/**
	* Returns the cfg technicalspec where specificationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param specificationCode the specification code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching cfg technicalspec, or <code>null</code> if a matching cfg technicalspec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec fetchBySpecificationCode(
		java.lang.String specificationCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySpecificationCode(specificationCode,
			retrieveFromCache);
	}

	/**
	* Removes the cfg technicalspec where specificationCode = &#63; from the database.
	*
	* @param specificationCode the specification code
	* @return the cfg technicalspec that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec removeBySpecificationCode(
		java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException {
		return getPersistence().removeBySpecificationCode(specificationCode);
	}

	/**
	* Returns the number of cfg technicalspecs where specificationCode = &#63;.
	*
	* @param specificationCode the specification code
	* @return the number of matching cfg technicalspecs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySpecificationCode(
		java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySpecificationCode(specificationCode);
	}

	/**
	* Caches the cfg technicalspec in the entity cache if it is enabled.
	*
	* @param cfgTechnicalspec the cfg technicalspec
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec cfgTechnicalspec) {
		getPersistence().cacheResult(cfgTechnicalspec);
	}

	/**
	* Caches the cfg technicalspecs in the entity cache if it is enabled.
	*
	* @param cfgTechnicalspecs the cfg technicalspecs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> cfgTechnicalspecs) {
		getPersistence().cacheResult(cfgTechnicalspecs);
	}

	/**
	* Creates a new cfg technicalspec with the primary key. Does not add the cfg technicalspec to the database.
	*
	* @param id the primary key for the new cfg technicalspec
	* @return the new cfg technicalspec
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the cfg technicalspec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the cfg technicalspec
	* @return the cfg technicalspec that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a cfg technicalspec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec cfgTechnicalspec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(cfgTechnicalspec);
	}

	/**
	* Returns the cfg technicalspec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException} if it could not be found.
	*
	* @param id the primary key of the cfg technicalspec
	* @return the cfg technicalspec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException if a cfg technicalspec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCfgTechnicalspecException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the cfg technicalspec with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the cfg technicalspec
	* @return the cfg technicalspec, or <code>null</code> if a cfg technicalspec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the cfg technicalspecs.
	*
	* @return the cfg technicalspecs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the cfg technicalspecs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cfg technicalspecs
	* @param end the upper bound of the range of cfg technicalspecs (not inclusive)
	* @return the range of cfg technicalspecs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the cfg technicalspecs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cfg technicalspecs
	* @param end the upper bound of the range of cfg technicalspecs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cfg technicalspecs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the cfg technicalspecs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cfg technicalspecs.
	*
	* @return the number of cfg technicalspecs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CfgTechnicalspecPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CfgTechnicalspecPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					CfgTechnicalspecPersistence.class.getName());

			ReferenceRegistry.registerReference(CfgTechnicalspecUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CfgTechnicalspecPersistence persistence) {
	}

	private static CfgTechnicalspecPersistence _persistence;
}