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

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam;

/**
 * The persistence interface for the corporation team service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CorporationTeamPersistenceImpl
 * @see CorporationTeamUtil
 * @generated
 */
public interface CorporationTeamPersistence extends BasePersistence<CorporationTeam> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CorporationTeamUtil} to access the corporation team persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the corporation teams where corporationId = &#63; and markUpDelete = &#63;.
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @return the matching corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findByCorporationIdAndTrangThai(
		java.lang.String corporationId, int markUpDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation teams where corporationId = &#63; and markUpDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @param start the lower bound of the range of corporation teams
	* @param end the upper bound of the range of corporation teams (not inclusive)
	* @return the range of matching corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findByCorporationIdAndTrangThai(
		java.lang.String corporationId, int markUpDelete, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation teams where corporationId = &#63; and markUpDelete = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @param start the lower bound of the range of corporation teams
	* @param end the upper bound of the range of corporation teams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findByCorporationIdAndTrangThai(
		java.lang.String corporationId, int markUpDelete, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first corporation team in the ordered set where corporationId = &#63; and markUpDelete = &#63;.
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation team
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam findByCorporationIdAndTrangThai_First(
		java.lang.String corporationId, int markUpDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException;

	/**
	* Returns the first corporation team in the ordered set where corporationId = &#63; and markUpDelete = &#63;.
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation team, or <code>null</code> if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam fetchByCorporationIdAndTrangThai_First(
		java.lang.String corporationId, int markUpDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last corporation team in the ordered set where corporationId = &#63; and markUpDelete = &#63;.
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation team
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam findByCorporationIdAndTrangThai_Last(
		java.lang.String corporationId, int markUpDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException;

	/**
	* Returns the last corporation team in the ordered set where corporationId = &#63; and markUpDelete = &#63;.
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation team, or <code>null</code> if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam fetchByCorporationIdAndTrangThai_Last(
		java.lang.String corporationId, int markUpDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation teams before and after the current corporation team in the ordered set where corporationId = &#63; and markUpDelete = &#63;.
	*
	* @param id the primary key of the current corporation team
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporation team
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a corporation team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam[] findByCorporationIdAndTrangThai_PrevAndNext(
		long id, java.lang.String corporationId, int markUpDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException;

	/**
	* Removes all the corporation teams where corporationId = &#63; and markUpDelete = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCorporationIdAndTrangThai(
		java.lang.String corporationId, int markUpDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation teams where corporationId = &#63; and markUpDelete = &#63;.
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @return the number of matching corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public int countByCorporationIdAndTrangThai(
		java.lang.String corporationId, int markUpDelete)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the corporation teams where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the matching corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation teams where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of corporation teams
	* @param end the upper bound of the range of corporation teams (not inclusive)
	* @return the range of matching corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findByCorporationId(
		java.lang.String corporationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation teams where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of corporation teams
	* @param end the upper bound of the range of corporation teams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first corporation team in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation team
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam findByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException;

	/**
	* Returns the first corporation team in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation team, or <code>null</code> if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam fetchByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last corporation team in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation team
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam findByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException;

	/**
	* Returns the last corporation team in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation team, or <code>null</code> if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam fetchByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation teams before and after the current corporation team in the ordered set where corporationId = &#63;.
	*
	* @param id the primary key of the current corporation team
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporation team
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a corporation team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam[] findByCorporationId_PrevAndNext(
		long id, java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException;

	/**
	* Removes all the corporation teams where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCorporationId(java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation teams where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public int countByCorporationId(java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the corporation team in the entity cache if it is enabled.
	*
	* @param corporationTeam the corporation team
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam corporationTeam);

	/**
	* Caches the corporation teams in the entity cache if it is enabled.
	*
	* @param corporationTeams the corporation teams
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> corporationTeams);

	/**
	* Creates a new corporation team with the primary key. Does not add the corporation team to the database.
	*
	* @param id the primary key for the new corporation team
	* @return the new corporation team
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam create(long id);

	/**
	* Removes the corporation team with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporation team
	* @return the corporation team that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a corporation team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam corporationTeam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation team with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException} if it could not be found.
	*
	* @param id the primary key of the corporation team
	* @return the corporation team
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a corporation team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException;

	/**
	* Returns the corporation team with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the corporation team
	* @return the corporation team, or <code>null</code> if a corporation team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the corporation teams.
	*
	* @return the corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation teams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporation teams
	* @param end the upper bound of the range of corporation teams (not inclusive)
	* @return the range of corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation teams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporation teams
	* @param end the upper bound of the range of corporation teams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the corporation teams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation teams.
	*
	* @return the number of corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}