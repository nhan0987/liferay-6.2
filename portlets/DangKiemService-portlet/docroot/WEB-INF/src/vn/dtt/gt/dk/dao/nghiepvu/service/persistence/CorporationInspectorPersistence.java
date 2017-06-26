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

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector;

/**
 * The persistence interface for the corporation inspector service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CorporationInspectorPersistenceImpl
 * @see CorporationInspectorUtil
 * @generated
 */
public interface CorporationInspectorPersistence extends BasePersistence<CorporationInspector> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CorporationInspectorUtil} to access the corporation inspector persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the corporation inspector where inspectorid = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException} if it could not be found.
	*
	* @param inspectorid the inspectorid
	* @return the matching corporation inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException if a matching corporation inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector findByInspectorId(
		long inspectorid)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException;

	/**
	* Returns the corporation inspector where inspectorid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectorid the inspectorid
	* @return the matching corporation inspector, or <code>null</code> if a matching corporation inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector fetchByInspectorId(
		long inspectorid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation inspector where inspectorid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectorid the inspectorid
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching corporation inspector, or <code>null</code> if a matching corporation inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector fetchByInspectorId(
		long inspectorid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the corporation inspector where inspectorid = &#63; from the database.
	*
	* @param inspectorid the inspectorid
	* @return the corporation inspector that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector removeByInspectorId(
		long inspectorid)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException;

	/**
	* Returns the number of corporation inspectors where inspectorid = &#63;.
	*
	* @param inspectorid the inspectorid
	* @return the number of matching corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	public int countByInspectorId(long inspectorid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the corporation inspectors where teamId = &#63;.
	*
	* @param teamId the team ID
	* @return the matching corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> findByTeamId(
		long teamId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation inspectors where teamId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param teamId the team ID
	* @param start the lower bound of the range of corporation inspectors
	* @param end the upper bound of the range of corporation inspectors (not inclusive)
	* @return the range of matching corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> findByTeamId(
		long teamId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation inspectors where teamId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param teamId the team ID
	* @param start the lower bound of the range of corporation inspectors
	* @param end the upper bound of the range of corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> findByTeamId(
		long teamId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException if a matching corporation inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector findByTeamId_First(
		long teamId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException;

	/**
	* Returns the first corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation inspector, or <code>null</code> if a matching corporation inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector fetchByTeamId_First(
		long teamId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException if a matching corporation inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector findByTeamId_Last(
		long teamId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException;

	/**
	* Returns the last corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation inspector, or <code>null</code> if a matching corporation inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector fetchByTeamId_Last(
		long teamId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation inspectors before and after the current corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param id the primary key of the current corporation inspector
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporation inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException if a corporation inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector[] findByTeamId_PrevAndNext(
		long id, long teamId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException;

	/**
	* Removes all the corporation inspectors where teamId = &#63; from the database.
	*
	* @param teamId the team ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTeamId(long teamId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation inspectors where teamId = &#63;.
	*
	* @param teamId the team ID
	* @return the number of matching corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	public int countByTeamId(long teamId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the corporation inspectors where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the matching corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> findByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation inspectors where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of corporation inspectors
	* @param end the upper bound of the range of corporation inspectors (not inclusive)
	* @return the range of matching corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> findByCorporationId(
		java.lang.String corporationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation inspectors where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of corporation inspectors
	* @param end the upper bound of the range of corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException if a matching corporation inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector findByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException;

	/**
	* Returns the first corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation inspector, or <code>null</code> if a matching corporation inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector fetchByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException if a matching corporation inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector findByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException;

	/**
	* Returns the last corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation inspector, or <code>null</code> if a matching corporation inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector fetchByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation inspectors before and after the current corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param id the primary key of the current corporation inspector
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporation inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException if a corporation inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector[] findByCorporationId_PrevAndNext(
		long id, java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException;

	/**
	* Removes all the corporation inspectors where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCorporationId(java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation inspectors where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	public int countByCorporationId(java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the corporation inspector in the entity cache if it is enabled.
	*
	* @param corporationInspector the corporation inspector
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector corporationInspector);

	/**
	* Caches the corporation inspectors in the entity cache if it is enabled.
	*
	* @param corporationInspectors the corporation inspectors
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> corporationInspectors);

	/**
	* Creates a new corporation inspector with the primary key. Does not add the corporation inspector to the database.
	*
	* @param id the primary key for the new corporation inspector
	* @return the new corporation inspector
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector create(long id);

	/**
	* Removes the corporation inspector with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporation inspector
	* @return the corporation inspector that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException if a corporation inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector corporationInspector)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation inspector with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException} if it could not be found.
	*
	* @param id the primary key of the corporation inspector
	* @return the corporation inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException if a corporation inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationInspectorException;

	/**
	* Returns the corporation inspector with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the corporation inspector
	* @return the corporation inspector, or <code>null</code> if a corporation inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the corporation inspectors.
	*
	* @return the corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporation inspectors
	* @param end the upper bound of the range of corporation inspectors (not inclusive)
	* @return the range of corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporation inspectors
	* @param end the upper bound of the range of corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the corporation inspectors from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation inspectors.
	*
	* @return the number of corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}