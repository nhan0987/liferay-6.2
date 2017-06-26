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

import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;

import java.util.List;

/**
 * The persistence utility for the production country service. This utility wraps {@link ProductionCountryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ProductionCountryPersistence
 * @see ProductionCountryPersistenceImpl
 * @generated
 */
public class ProductionCountryUtil {
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
	public static void clearCache(ProductionCountry productionCountry) {
		getPersistence().clearCache(productionCountry);
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
	public static List<ProductionCountry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProductionCountry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProductionCountry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ProductionCountry update(ProductionCountry productionCountry)
		throws SystemException {
		return getPersistence().update(productionCountry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ProductionCountry update(
		ProductionCountry productionCountry, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(productionCountry, serviceContext);
	}

	/**
	* Returns all the production countries where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the matching production countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findByVehicleGroupId(
		long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns a range of all the production countries where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of production countries
	* @param end the upper bound of the range of production countries (not inclusive)
	* @return the range of matching production countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findByVehicleGroupId(
		long vehicleGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByVehicleGroupId(vehicleGroupId, start, end);
	}

	/**
	* Returns an ordered range of all the production countries where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of production countries
	* @param end the upper bound of the range of production countries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching production countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findByVehicleGroupId(
		long vehicleGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByVehicleGroupId(vehicleGroupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first production country in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching production country
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry findByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException {
		return getPersistence()
				   .findByVehicleGroupId_First(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the first production country in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching production country, or <code>null</code> if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry fetchByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleGroupId_First(vehicleGroupId,
			orderByComparator);
	}

	/**
	* Returns the last production country in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching production country
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry findByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException {
		return getPersistence()
				   .findByVehicleGroupId_Last(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the last production country in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching production country, or <code>null</code> if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry fetchByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleGroupId_Last(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the production countries before and after the current production country in the ordered set where vehicleGroupId = &#63;.
	*
	* @param id the primary key of the current production country
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next production country
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a production country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException {
		return getPersistence()
				   .findByVehicleGroupId_PrevAndNext(id, vehicleGroupId,
			orderByComparator);
	}

	/**
	* Removes all the production countries where vehicleGroupId = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the number of production countries where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the number of matching production countries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns all the production countries where vehicleGroupId = &#63; and countryCode = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @return the matching production countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findByVehicleGroupIdCountryCode(
		long vehicleGroupId, java.lang.String countryCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByVehicleGroupIdCountryCode(vehicleGroupId, countryCode);
	}

	/**
	* Returns a range of all the production countries where vehicleGroupId = &#63; and countryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @param start the lower bound of the range of production countries
	* @param end the upper bound of the range of production countries (not inclusive)
	* @return the range of matching production countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findByVehicleGroupIdCountryCode(
		long vehicleGroupId, java.lang.String countryCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByVehicleGroupIdCountryCode(vehicleGroupId,
			countryCode, start, end);
	}

	/**
	* Returns an ordered range of all the production countries where vehicleGroupId = &#63; and countryCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @param start the lower bound of the range of production countries
	* @param end the upper bound of the range of production countries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching production countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findByVehicleGroupIdCountryCode(
		long vehicleGroupId, java.lang.String countryCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByVehicleGroupIdCountryCode(vehicleGroupId,
			countryCode, start, end, orderByComparator);
	}

	/**
	* Returns the first production country in the ordered set where vehicleGroupId = &#63; and countryCode = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching production country
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry findByVehicleGroupIdCountryCode_First(
		long vehicleGroupId, java.lang.String countryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException {
		return getPersistence()
				   .findByVehicleGroupIdCountryCode_First(vehicleGroupId,
			countryCode, orderByComparator);
	}

	/**
	* Returns the first production country in the ordered set where vehicleGroupId = &#63; and countryCode = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching production country, or <code>null</code> if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry fetchByVehicleGroupIdCountryCode_First(
		long vehicleGroupId, java.lang.String countryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleGroupIdCountryCode_First(vehicleGroupId,
			countryCode, orderByComparator);
	}

	/**
	* Returns the last production country in the ordered set where vehicleGroupId = &#63; and countryCode = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching production country
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry findByVehicleGroupIdCountryCode_Last(
		long vehicleGroupId, java.lang.String countryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException {
		return getPersistence()
				   .findByVehicleGroupIdCountryCode_Last(vehicleGroupId,
			countryCode, orderByComparator);
	}

	/**
	* Returns the last production country in the ordered set where vehicleGroupId = &#63; and countryCode = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching production country, or <code>null</code> if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry fetchByVehicleGroupIdCountryCode_Last(
		long vehicleGroupId, java.lang.String countryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleGroupIdCountryCode_Last(vehicleGroupId,
			countryCode, orderByComparator);
	}

	/**
	* Returns the production countries before and after the current production country in the ordered set where vehicleGroupId = &#63; and countryCode = &#63;.
	*
	* @param id the primary key of the current production country
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next production country
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a production country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry[] findByVehicleGroupIdCountryCode_PrevAndNext(
		long id, long vehicleGroupId, java.lang.String countryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException {
		return getPersistence()
				   .findByVehicleGroupIdCountryCode_PrevAndNext(id,
			vehicleGroupId, countryCode, orderByComparator);
	}

	/**
	* Removes all the production countries where vehicleGroupId = &#63; and countryCode = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByVehicleGroupIdCountryCode(long vehicleGroupId,
		java.lang.String countryCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByVehicleGroupIdCountryCode(vehicleGroupId, countryCode);
	}

	/**
	* Returns the number of production countries where vehicleGroupId = &#63; and countryCode = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @return the number of matching production countries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVehicleGroupIdCountryCode(long vehicleGroupId,
		java.lang.String countryCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByVehicleGroupIdCountryCode(vehicleGroupId, countryCode);
	}

	/**
	* Caches the production country in the entity cache if it is enabled.
	*
	* @param productionCountry the production country
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry productionCountry) {
		getPersistence().cacheResult(productionCountry);
	}

	/**
	* Caches the production countries in the entity cache if it is enabled.
	*
	* @param productionCountries the production countries
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> productionCountries) {
		getPersistence().cacheResult(productionCountries);
	}

	/**
	* Creates a new production country with the primary key. Does not add the production country to the database.
	*
	* @param id the primary key for the new production country
	* @return the new production country
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the production country with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the production country
	* @return the production country that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a production country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry productionCountry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(productionCountry);
	}

	/**
	* Returns the production country with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException} if it could not be found.
	*
	* @param id the primary key of the production country
	* @return the production country
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a production country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the production country with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the production country
	* @return the production country, or <code>null</code> if a production country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the production countries.
	*
	* @return the production countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the production countries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of production countries
	* @param end the upper bound of the range of production countries (not inclusive)
	* @return the range of production countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the production countries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ProductionCountryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of production countries
	* @param end the upper bound of the range of production countries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of production countries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the production countries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of production countries.
	*
	* @return the number of production countries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ProductionCountryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ProductionCountryPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					ProductionCountryPersistence.class.getName());

			ReferenceRegistry.registerReference(ProductionCountryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ProductionCountryPersistence persistence) {
	}

	private static ProductionCountryPersistence _persistence;
}