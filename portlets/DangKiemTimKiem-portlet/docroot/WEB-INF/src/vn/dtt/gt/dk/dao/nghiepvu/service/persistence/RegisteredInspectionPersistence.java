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

import vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection;

/**
 * The persistence interface for the registered inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see RegisteredInspectionPersistenceImpl
 * @see RegisteredInspectionUtil
 * @generated
 */
public interface RegisteredInspectionPersistence extends BasePersistence<RegisteredInspection> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegisteredInspectionUtil} to access the registered inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the registered inspections where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> findByDossierId(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> findByDossierId(
		long dossierId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> findByDossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first registered inspection in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registered inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection findByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException;

	/**
	* Returns the first registered inspection in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registered inspection, or <code>null</code> if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection fetchByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last registered inspection in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registered inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection findByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException;

	/**
	* Returns the last registered inspection in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registered inspection, or <code>null</code> if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection fetchByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection[] findByDossierId_PrevAndNext(
		long id, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException;

	/**
	* Removes all the registered inspections where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of registered inspections where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public int countByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the registered inspection where registeredNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException} if it could not be found.
	*
	* @param registeredNumber the registered number
	* @return the matching registered inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection findByRegisteredNumber(
		java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException;

	/**
	* Returns the registered inspection where registeredNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param registeredNumber the registered number
	* @return the matching registered inspection, or <code>null</code> if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection fetchByRegisteredNumber(
		java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the registered inspection where registeredNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param registeredNumber the registered number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching registered inspection, or <code>null</code> if a matching registered inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection fetchByRegisteredNumber(
		java.lang.String registeredNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the registered inspection where registeredNumber = &#63; from the database.
	*
	* @param registeredNumber the registered number
	* @return the registered inspection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection removeByRegisteredNumber(
		java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException;

	/**
	* Returns the number of registered inspections where registeredNumber = &#63;.
	*
	* @param registeredNumber the registered number
	* @return the number of matching registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public int countByRegisteredNumber(java.lang.String registeredNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the registered inspection in the entity cache if it is enabled.
	*
	* @param registeredInspection the registered inspection
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection registeredInspection);

	/**
	* Caches the registered inspections in the entity cache if it is enabled.
	*
	* @param registeredInspections the registered inspections
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> registeredInspections);

	/**
	* Creates a new registered inspection with the primary key. Does not add the registered inspection to the database.
	*
	* @param id the primary key for the new registered inspection
	* @return the new registered inspection
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection create(long id);

	/**
	* Removes the registered inspection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the registered inspection
	* @return the registered inspection that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a registered inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection registeredInspection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the registered inspection with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException} if it could not be found.
	*
	* @param id the primary key of the registered inspection
	* @return the registered inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException if a registered inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchRegisteredInspectionException;

	/**
	* Returns the registered inspection with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the registered inspection
	* @return the registered inspection, or <code>null</code> if a registered inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the registered inspections.
	*
	* @return the registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the registered inspections from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of registered inspections.
	*
	* @return the number of registered inspections
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}