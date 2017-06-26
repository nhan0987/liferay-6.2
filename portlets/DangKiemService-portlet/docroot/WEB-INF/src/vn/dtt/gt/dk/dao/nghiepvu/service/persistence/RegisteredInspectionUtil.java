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

import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;

import java.util.List;

/**
 * The persistence utility for the registered inspection service. This utility wraps {@link RegisteredInspectionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see RegisteredInspectionPersistence
 * @see RegisteredInspectionPersistenceImpl
 * @generated
 */
public class RegisteredInspectionUtil {
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
	public static void clearCache(RegisteredInspection registeredInspection) {
		getPersistence().clearCache(registeredInspection);
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
	public static List<RegisteredInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RegisteredInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RegisteredInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static RegisteredInspection update(
		RegisteredInspection registeredInspection) throws SystemException {
		return getPersistence().update(registeredInspection);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static RegisteredInspection update(
		RegisteredInspection registeredInspection, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(registeredInspection, serviceContext);
	}

	/**
	* Returns all the registered inspections where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> findByDossierId(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDossierId(dossierId);
	}

	/**
	* Returns a range of all the registered inspections where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of registered inspections
	* @param end the upper bound of the range of registered inspections (not inclusive)
	* @return the range of matching registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> findByDossierId(
		long dossierId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDossierId(dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the registered inspections where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of registered inspections
	* @param end the upper bound of the range of registered inspections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> findByDossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDossierId(dossierId, start, end, orderByComparator);
	}

	/**
	* Returns the first registered inspection in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registered inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection findByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException {
		return getPersistence()
				   .findByDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the first registered inspection in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registered inspection, or <code>null</code> if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection fetchByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the last registered inspection in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registered inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection findByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException {
		return getPersistence()
				   .findByDossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last registered inspection in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registered inspection, or <code>null</code> if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection fetchByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the registered inspections before and after the current registered inspection in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current registered inspection
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registered inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a registered inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection[] findByDossierId_PrevAndNext(
		long id, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException {
		return getPersistence()
				   .findByDossierId_PrevAndNext(id, dossierId, orderByComparator);
	}

	/**
	* Removes all the registered inspections where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDossierId(dossierId);
	}

	/**
	* Returns the number of registered inspections where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDossierId(dossierId);
	}

	/**
	* Returns the registered inspection where registeredNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException} if it could not be found.
	*
	* @param registeredNumber the registered number
	* @return the matching registered inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection findByRegisteredNumber(
		java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException {
		return getPersistence().findByRegisteredNumber(registeredNumber);
	}

	/**
	* Returns the registered inspection where registeredNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param registeredNumber the registered number
	* @return the matching registered inspection, or <code>null</code> if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection fetchByRegisteredNumber(
		java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByRegisteredNumber(registeredNumber);
	}

	/**
	* Returns the registered inspection where registeredNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param registeredNumber the registered number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching registered inspection, or <code>null</code> if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection fetchByRegisteredNumber(
		java.lang.String registeredNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegisteredNumber(registeredNumber, retrieveFromCache);
	}

	/**
	* Removes the registered inspection where registeredNumber = &#63; from the database.
	*
	* @param registeredNumber the registered number
	* @return the registered inspection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection removeByRegisteredNumber(
		java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException {
		return getPersistence().removeByRegisteredNumber(registeredNumber);
	}

	/**
	* Returns the number of registered inspections where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @return the number of matching registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRegisteredNumber(java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRegisteredNumber(registeredNumber);
	}

	/**
	* Caches the registered inspection in the entity cache if it is enabled.
	*
	* @param registeredInspection the registered inspection
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection registeredInspection) {
		getPersistence().cacheResult(registeredInspection);
	}

	/**
	* Caches the registered inspections in the entity cache if it is enabled.
	*
	* @param registeredInspections the registered inspections
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> registeredInspections) {
		getPersistence().cacheResult(registeredInspections);
	}

	/**
	* Creates a new registered inspection with the primary key. Does not add the registered inspection to the database.
	*
	* @param id the primary key for the new registered inspection
	* @return the new registered inspection
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the registered inspection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the registered inspection
	* @return the registered inspection that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a registered inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection registeredInspection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(registeredInspection);
	}

	/**
	* Returns the registered inspection with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException} if it could not be found.
	*
	* @param id the primary key of the registered inspection
	* @return the registered inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a registered inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the registered inspection with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the registered inspection
	* @return the registered inspection, or <code>null</code> if a registered inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the registered inspections.
	*
	* @return the registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the registered inspections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registered inspections
	* @param end the upper bound of the range of registered inspections (not inclusive)
	* @return the range of registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the registered inspections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registered inspections
	* @param end the upper bound of the range of registered inspections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the registered inspections from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of registered inspections.
	*
	* @return the number of registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RegisteredInspectionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RegisteredInspectionPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					RegisteredInspectionPersistence.class.getName());

			ReferenceRegistry.registerReference(RegisteredInspectionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RegisteredInspectionPersistence persistence) {
	}

	private static RegisteredInspectionPersistence _persistence;
}