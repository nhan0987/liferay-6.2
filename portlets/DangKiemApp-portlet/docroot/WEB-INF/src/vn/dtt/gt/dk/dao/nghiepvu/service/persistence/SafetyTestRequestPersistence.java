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

import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest;

/**
 * The persistence interface for the safety test request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see SafetyTestRequestPersistenceImpl
 * @see SafetyTestRequestUtil
 * @generated
 */
public interface SafetyTestRequestPersistence extends BasePersistence<SafetyTestRequest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SafetyTestRequestUtil} to access the safety test request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the safety test request in the entity cache if it is enabled.
	*
	* @param safetyTestRequest the safety test request
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest safetyTestRequest);

	/**
	* Caches the safety test requests in the entity cache if it is enabled.
	*
	* @param safetyTestRequests the safety test requests
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest> safetyTestRequests);

	/**
	* Creates a new safety test request with the primary key. Does not add the safety test request to the database.
	*
	* @param id the primary key for the new safety test request
	* @return the new safety test request
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest create(long id);

	/**
	* Removes the safety test request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the safety test request
	* @return the safety test request that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestRequestException if a safety test request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestRequestException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest safetyTestRequest)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the safety test request with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestRequestException} if it could not be found.
	*
	* @param id the primary key of the safety test request
	* @return the safety test request
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestRequestException if a safety test request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestRequestException;

	/**
	* Returns the safety test request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the safety test request
	* @return the safety test request, or <code>null</code> if a safety test request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the safety test requests.
	*
	* @return the safety test requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the safety test requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of safety test requests
	* @param end the upper bound of the range of safety test requests (not inclusive)
	* @return the range of safety test requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the safety test requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestRequestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of safety test requests
	* @param end the upper bound of the range of safety test requests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of safety test requests
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the safety test requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of safety test requests.
	*
	* @return the number of safety test requests
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}