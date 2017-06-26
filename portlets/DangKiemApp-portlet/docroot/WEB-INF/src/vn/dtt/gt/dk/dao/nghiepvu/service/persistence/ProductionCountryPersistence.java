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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;

/**
 * The persistence interface for the production country service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ProductionCountryPersistenceImpl
 * @see ProductionCountryUtil
 * @generated
 */
public interface ProductionCountryPersistence extends BasePersistence<ProductionCountry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProductionCountryUtil} to access the production country persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the production countries where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the matching production countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findByVehicleGroupId(
		long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findByVehicleGroupId(
		long vehicleGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findByVehicleGroupId(
		long vehicleGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first production country in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching production country
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry findByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException;

	/**
	* Returns the first production country in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching production country, or <code>null</code> if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry fetchByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last production country in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching production country
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry findByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException;

	/**
	* Returns the last production country in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching production country, or <code>null</code> if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry fetchByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException;

	/**
	* Removes all the production countries where vehicleGroupId = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of production countries where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the number of matching production countries
	* @throws SystemException if a system exception occurred
	*/
	public int countByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the production countries where vehicleGroupId = &#63; and countryCode = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @return the matching production countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findByVehicleGroupIdCountryCode(
		long vehicleGroupId, java.lang.String countryCode)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findByVehicleGroupIdCountryCode(
		long vehicleGroupId, java.lang.String countryCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findByVehicleGroupIdCountryCode(
		long vehicleGroupId, java.lang.String countryCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry findByVehicleGroupIdCountryCode_First(
		long vehicleGroupId, java.lang.String countryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException;

	/**
	* Returns the first production country in the ordered set where vehicleGroupId = &#63; and countryCode = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching production country, or <code>null</code> if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry fetchByVehicleGroupIdCountryCode_First(
		long vehicleGroupId, java.lang.String countryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry findByVehicleGroupIdCountryCode_Last(
		long vehicleGroupId, java.lang.String countryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException;

	/**
	* Returns the last production country in the ordered set where vehicleGroupId = &#63; and countryCode = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching production country, or <code>null</code> if a matching production country could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry fetchByVehicleGroupIdCountryCode_Last(
		long vehicleGroupId, java.lang.String countryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry[] findByVehicleGroupIdCountryCode_PrevAndNext(
		long id, long vehicleGroupId, java.lang.String countryCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException;

	/**
	* Removes all the production countries where vehicleGroupId = &#63; and countryCode = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @throws SystemException if a system exception occurred
	*/
	public void removeByVehicleGroupIdCountryCode(long vehicleGroupId,
		java.lang.String countryCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of production countries where vehicleGroupId = &#63; and countryCode = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param countryCode the country code
	* @return the number of matching production countries
	* @throws SystemException if a system exception occurred
	*/
	public int countByVehicleGroupIdCountryCode(long vehicleGroupId,
		java.lang.String countryCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the production country in the entity cache if it is enabled.
	*
	* @param productionCountry the production country
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry productionCountry);

	/**
	* Caches the production countries in the entity cache if it is enabled.
	*
	* @param productionCountries the production countries
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> productionCountries);

	/**
	* Creates a new production country with the primary key. Does not add the production country to the database.
	*
	* @param id the primary key for the new production country
	* @return the new production country
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry create(long id);

	/**
	* Removes the production country with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the production country
	* @return the production country that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a production country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry productionCountry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the production country with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException} if it could not be found.
	*
	* @param id the primary key of the production country
	* @return the production country
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException if a production country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchProductionCountryException;

	/**
	* Returns the production country with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the production country
	* @return the production country, or <code>null</code> if a production country with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the production countries.
	*
	* @return the production countries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the production countries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of production countries.
	*
	* @return the number of production countries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}