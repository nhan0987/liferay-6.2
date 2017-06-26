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

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam;

import java.util.List;

/**
 * The persistence utility for the corporation team service. This utility wraps {@link CorporationTeamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see CorporationTeamPersistence
 * @see CorporationTeamPersistenceImpl
 * @generated
 */
public class CorporationTeamUtil {
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
	public static void clearCache(CorporationTeam corporationTeam) {
		getPersistence().clearCache(corporationTeam);
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
	public static List<CorporationTeam> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CorporationTeam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CorporationTeam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CorporationTeam update(CorporationTeam corporationTeam)
		throws SystemException {
		return getPersistence().update(corporationTeam);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CorporationTeam update(CorporationTeam corporationTeam,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(corporationTeam, serviceContext);
	}

	/**
	* Returns all the corporation teams where corporationId = &#63; and markUpDelete = &#63;.
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @return the matching corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findByCorporationIdAndTrangThai(
		java.lang.String corporationId, int markUpDelete)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCorporationIdAndTrangThai(corporationId, markUpDelete);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findByCorporationIdAndTrangThai(
		java.lang.String corporationId, int markUpDelete, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCorporationIdAndTrangThai(corporationId,
			markUpDelete, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findByCorporationIdAndTrangThai(
		java.lang.String corporationId, int markUpDelete, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCorporationIdAndTrangThai(corporationId,
			markUpDelete, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam findByCorporationIdAndTrangThai_First(
		java.lang.String corporationId, int markUpDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException {
		return getPersistence()
				   .findByCorporationIdAndTrangThai_First(corporationId,
			markUpDelete, orderByComparator);
	}

	/**
	* Returns the first corporation team in the ordered set where corporationId = &#63; and markUpDelete = &#63;.
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation team, or <code>null</code> if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam fetchByCorporationIdAndTrangThai_First(
		java.lang.String corporationId, int markUpDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCorporationIdAndTrangThai_First(corporationId,
			markUpDelete, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam findByCorporationIdAndTrangThai_Last(
		java.lang.String corporationId, int markUpDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException {
		return getPersistence()
				   .findByCorporationIdAndTrangThai_Last(corporationId,
			markUpDelete, orderByComparator);
	}

	/**
	* Returns the last corporation team in the ordered set where corporationId = &#63; and markUpDelete = &#63;.
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation team, or <code>null</code> if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam fetchByCorporationIdAndTrangThai_Last(
		java.lang.String corporationId, int markUpDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCorporationIdAndTrangThai_Last(corporationId,
			markUpDelete, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam[] findByCorporationIdAndTrangThai_PrevAndNext(
		long id, java.lang.String corporationId, int markUpDelete,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException {
		return getPersistence()
				   .findByCorporationIdAndTrangThai_PrevAndNext(id,
			corporationId, markUpDelete, orderByComparator);
	}

	/**
	* Removes all the corporation teams where corporationId = &#63; and markUpDelete = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCorporationIdAndTrangThai(
		java.lang.String corporationId, int markUpDelete)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByCorporationIdAndTrangThai(corporationId, markUpDelete);
	}

	/**
	* Returns the number of corporation teams where corporationId = &#63; and markUpDelete = &#63;.
	*
	* @param corporationId the corporation ID
	* @param markUpDelete the mark up delete
	* @return the number of matching corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCorporationIdAndTrangThai(
		java.lang.String corporationId, int markUpDelete)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByCorporationIdAndTrangThai(corporationId, markUpDelete);
	}

	/**
	* Returns all the corporation teams where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the matching corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCorporationId(corporationId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findByCorporationId(
		java.lang.String corporationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCorporationId(corporationId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCorporationId(corporationId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first corporation team in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation team
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam findByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException {
		return getPersistence()
				   .findByCorporationId_First(corporationId, orderByComparator);
	}

	/**
	* Returns the first corporation team in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation team, or <code>null</code> if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam fetchByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCorporationId_First(corporationId, orderByComparator);
	}

	/**
	* Returns the last corporation team in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation team
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam findByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException {
		return getPersistence()
				   .findByCorporationId_Last(corporationId, orderByComparator);
	}

	/**
	* Returns the last corporation team in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation team, or <code>null</code> if a matching corporation team could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam fetchByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCorporationId_Last(corporationId, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam[] findByCorporationId_PrevAndNext(
		long id, java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException {
		return getPersistence()
				   .findByCorporationId_PrevAndNext(id, corporationId,
			orderByComparator);
	}

	/**
	* Removes all the corporation teams where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCorporationId(java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCorporationId(corporationId);
	}

	/**
	* Returns the number of corporation teams where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCorporationId(java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCorporationId(corporationId);
	}

	/**
	* Caches the corporation team in the entity cache if it is enabled.
	*
	* @param corporationTeam the corporation team
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam corporationTeam) {
		getPersistence().cacheResult(corporationTeam);
	}

	/**
	* Caches the corporation teams in the entity cache if it is enabled.
	*
	* @param corporationTeams the corporation teams
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> corporationTeams) {
		getPersistence().cacheResult(corporationTeams);
	}

	/**
	* Creates a new corporation team with the primary key. Does not add the corporation team to the database.
	*
	* @param id the primary key for the new corporation team
	* @return the new corporation team
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the corporation team with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporation team
	* @return the corporation team that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a corporation team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam corporationTeam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(corporationTeam);
	}

	/**
	* Returns the corporation team with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException} if it could not be found.
	*
	* @param id the primary key of the corporation team
	* @return the corporation team
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a corporation team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the corporation team with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the corporation team
	* @return the corporation team, or <code>null</code> if a corporation team with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the corporation teams.
	*
	* @return the corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the corporation teams from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of corporation teams.
	*
	* @return the number of corporation teams
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CorporationTeamPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CorporationTeamPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					CorporationTeamPersistence.class.getName());

			ReferenceRegistry.registerReference(CorporationTeamUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CorporationTeamPersistence persistence) {
	}

	private static CorporationTeamPersistence _persistence;
}