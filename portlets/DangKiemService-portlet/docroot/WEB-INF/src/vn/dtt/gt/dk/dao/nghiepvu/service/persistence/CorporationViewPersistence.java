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

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView;

/**
 * The persistence interface for the corporation view service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CorporationViewPersistenceImpl
 * @see CorporationViewUtil
 * @generated
 */
public interface CorporationViewPersistence extends BasePersistence<CorporationView> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CorporationViewUtil} to access the corporation view persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the corporation views where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @return the matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByInspectorId(
		long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation views where inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of corporation views
	* @param end the upper bound of the range of corporation views (not inclusive)
	* @return the range of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByInspectorId(
		long inspectorId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation views where inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of corporation views
	* @param end the upper bound of the range of corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByInspectorId(
		long inspectorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView findByInspectorId_First(
		long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Returns the first corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation view, or <code>null</code> if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchByInspectorId_First(
		long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView findByInspectorId_Last(
		long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Returns the last corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation view, or <code>null</code> if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchByInspectorId_Last(
		long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation views before and after the current corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param id the primary key of the current corporation view
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView[] findByInspectorId_PrevAndNext(
		long id, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Removes all the corporation views where inspectorId = &#63; from the database.
	*
	* @param inspectorId the inspector ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByInspectorId(long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation views where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @return the number of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public int countByInspectorId(long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the corporation views where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation views where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of corporation views
	* @param end the upper bound of the range of corporation views (not inclusive)
	* @return the range of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByCorporationId(
		java.lang.String corporationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation views where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of corporation views
	* @param end the upper bound of the range of corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first corporation view in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView findByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Returns the first corporation view in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation view, or <code>null</code> if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last corporation view in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView findByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Returns the last corporation view in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation view, or <code>null</code> if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation views before and after the current corporation view in the ordered set where corporationId = &#63;.
	*
	* @param id the primary key of the current corporation view
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView[] findByCorporationId_PrevAndNext(
		long id, java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Removes all the corporation views where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCorporationId(java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation views where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public int countByCorporationId(java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @return the matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of corporation views
	* @param end the upper bound of the range of corporation views (not inclusive)
	* @return the range of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of corporation views
	* @param end the upper bound of the range of corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView findByInspectorIdCorporationId_First(
		java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Returns the first corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation view, or <code>null</code> if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchByInspectorIdCorporationId_First(
		java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView findByInspectorIdCorporationId_Last(
		java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Returns the last corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation view, or <code>null</code> if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchByInspectorIdCorporationId_Last(
		java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation views before and after the current corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param id the primary key of the current corporation view
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView[] findByInspectorIdCorporationId_PrevAndNext(
		long id, java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Removes all the corporation views where corporationId = &#63; and inspectorId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @return the number of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public int countByInspectorIdCorporationId(java.lang.String corporationId,
		long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the corporation views where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @return the matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByIsLeader(
		int isLeader)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation views where isLeader = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isLeader the is leader
	* @param start the lower bound of the range of corporation views
	* @param end the upper bound of the range of corporation views (not inclusive)
	* @return the range of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByIsLeader(
		int isLeader, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation views where isLeader = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isLeader the is leader
	* @param start the lower bound of the range of corporation views
	* @param end the upper bound of the range of corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByIsLeader(
		int isLeader, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first corporation view in the ordered set where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView findByIsLeader_First(
		int isLeader,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Returns the first corporation view in the ordered set where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation view, or <code>null</code> if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchByIsLeader_First(
		int isLeader,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last corporation view in the ordered set where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView findByIsLeader_Last(
		int isLeader,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Returns the last corporation view in the ordered set where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation view, or <code>null</code> if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchByIsLeader_Last(
		int isLeader,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation views before and after the current corporation view in the ordered set where isLeader = &#63;.
	*
	* @param id the primary key of the current corporation view
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView[] findByIsLeader_PrevAndNext(
		long id, int isLeader,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Removes all the corporation views where isLeader = &#63; from the database.
	*
	* @param isLeader the is leader
	* @throws SystemException if a system exception occurred
	*/
	public void removeByIsLeader(int isLeader)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation views where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @return the number of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public int countByIsLeader(int isLeader)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException} if it could not be found.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the matching corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView findByInspectorIdCorporationIdIsLeader(
		long inspectorId, java.lang.String corporationId, int isLeader)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Returns the corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the matching corporation view, or <code>null</code> if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchByInspectorIdCorporationIdIsLeader(
		long inspectorId, java.lang.String corporationId, int isLeader)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching corporation view, or <code>null</code> if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchByInspectorIdCorporationIdIsLeader(
		long inspectorId, java.lang.String corporationId, int isLeader,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; from the database.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the corporation view that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView removeByInspectorIdCorporationIdIsLeader(
		long inspectorId, java.lang.String corporationId, int isLeader)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Returns the number of corporation views where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the number of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public int countByInspectorIdCorporationIdIsLeader(long inspectorId,
		java.lang.String corporationId, int isLeader)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation view where corporationId = &#63; and isLeader = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException} if it could not be found.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the matching corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView findByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Returns the corporation view where corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the matching corporation view, or <code>null</code> if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation view where corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching corporation view, or <code>null</code> if a matching corporation view could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the corporation view where corporationId = &#63; and isLeader = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the corporation view that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView removeByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Returns the number of corporation views where corporationId = &#63; and isLeader = &#63;.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the number of matching corporation views
	* @throws SystemException if a system exception occurred
	*/
	public int countByCorporationIdAndIsLeader(java.lang.String corporationId,
		int isLeader)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the corporation view in the entity cache if it is enabled.
	*
	* @param corporationView the corporation view
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView corporationView);

	/**
	* Caches the corporation views in the entity cache if it is enabled.
	*
	* @param corporationViews the corporation views
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> corporationViews);

	/**
	* Creates a new corporation view with the primary key. Does not add the corporation view to the database.
	*
	* @param id the primary key for the new corporation view
	* @return the new corporation view
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView create(long id);

	/**
	* Removes the corporation view with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporation view
	* @return the corporation view that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView corporationView)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation view with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException} if it could not be found.
	*
	* @param id the primary key of the corporation view
	* @return the corporation view
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException if a corporation view with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationViewException;

	/**
	* Returns the corporation view with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the corporation view
	* @return the corporation view, or <code>null</code> if a corporation view with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the corporation views.
	*
	* @return the corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporation views
	* @param end the upper bound of the range of corporation views (not inclusive)
	* @return the range of corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporation views
	* @param end the upper bound of the range of corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of corporation views
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the corporation views from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation views.
	*
	* @return the number of corporation views
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}