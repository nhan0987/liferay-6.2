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

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee;

/**
 * The persistence interface for the corporation attendee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CorporationAttendeePersistenceImpl
 * @see CorporationAttendeeUtil
 * @generated
 */
public interface CorporationAttendeePersistence extends BasePersistence<CorporationAttendee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CorporationAttendeeUtil} to access the corporation attendee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the corporation attendees where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @return the matching corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionId(
		long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation attendees where confirmedInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param start the lower bound of the range of corporation attendees
	* @param end the upper bound of the range of corporation attendees (not inclusive)
	* @return the range of matching corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionId(
		long confirmedInspectionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation attendees where confirmedInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param start the lower bound of the range of corporation attendees
	* @param end the upper bound of the range of corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionId(
		long confirmedInspectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first corporation attendee in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation attendee
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee findByConfirmedInspectionId_First(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException;

	/**
	* Returns the first corporation attendee in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation attendee, or <code>null</code> if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee fetchByConfirmedInspectionId_First(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last corporation attendee in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation attendee
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee findByConfirmedInspectionId_Last(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException;

	/**
	* Returns the last corporation attendee in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation attendee, or <code>null</code> if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee fetchByConfirmedInspectionId_Last(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation attendees before and after the current corporation attendee in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param id the primary key of the current corporation attendee
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporation attendee
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException if a corporation attendee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee[] findByConfirmedInspectionId_PrevAndNext(
		long id, long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException;

	/**
	* Removes all the corporation attendees where confirmedInspectionId = &#63; from the database.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByConfirmedInspectionId(long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation attendees where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @return the number of matching corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public int countByConfirmedInspectionId(long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the corporation attendees where confirmedInspectionId = &#63; and inspectorRole = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @return the matching corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionIdAndInspectorRole(
		long confirmedInspectionId, long inspectorRole)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation attendees where confirmedInspectionId = &#63; and inspectorRole = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @param start the lower bound of the range of corporation attendees
	* @param end the upper bound of the range of corporation attendees (not inclusive)
	* @return the range of matching corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionIdAndInspectorRole(
		long confirmedInspectionId, long inspectorRole, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation attendees where confirmedInspectionId = &#63; and inspectorRole = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @param start the lower bound of the range of corporation attendees
	* @param end the upper bound of the range of corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionIdAndInspectorRole(
		long confirmedInspectionId, long inspectorRole, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first corporation attendee in the ordered set where confirmedInspectionId = &#63; and inspectorRole = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation attendee
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee findByConfirmedInspectionIdAndInspectorRole_First(
		long confirmedInspectionId, long inspectorRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException;

	/**
	* Returns the first corporation attendee in the ordered set where confirmedInspectionId = &#63; and inspectorRole = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation attendee, or <code>null</code> if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee fetchByConfirmedInspectionIdAndInspectorRole_First(
		long confirmedInspectionId, long inspectorRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last corporation attendee in the ordered set where confirmedInspectionId = &#63; and inspectorRole = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation attendee
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee findByConfirmedInspectionIdAndInspectorRole_Last(
		long confirmedInspectionId, long inspectorRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException;

	/**
	* Returns the last corporation attendee in the ordered set where confirmedInspectionId = &#63; and inspectorRole = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation attendee, or <code>null</code> if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee fetchByConfirmedInspectionIdAndInspectorRole_Last(
		long confirmedInspectionId, long inspectorRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation attendees before and after the current corporation attendee in the ordered set where confirmedInspectionId = &#63; and inspectorRole = &#63;.
	*
	* @param id the primary key of the current corporation attendee
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporation attendee
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException if a corporation attendee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee[] findByConfirmedInspectionIdAndInspectorRole_PrevAndNext(
		long id, long confirmedInspectionId, long inspectorRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException;

	/**
	* Removes all the corporation attendees where confirmedInspectionId = &#63; and inspectorRole = &#63; from the database.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @throws SystemException if a system exception occurred
	*/
	public void removeByConfirmedInspectionIdAndInspectorRole(
		long confirmedInspectionId, long inspectorRole)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation attendees where confirmedInspectionId = &#63; and inspectorRole = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @return the number of matching corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public int countByConfirmedInspectionIdAndInspectorRole(
		long confirmedInspectionId, long inspectorRole)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the corporation attendee in the entity cache if it is enabled.
	*
	* @param corporationAttendee the corporation attendee
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee corporationAttendee);

	/**
	* Caches the corporation attendees in the entity cache if it is enabled.
	*
	* @param corporationAttendees the corporation attendees
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> corporationAttendees);

	/**
	* Creates a new corporation attendee with the primary key. Does not add the corporation attendee to the database.
	*
	* @param id the primary key for the new corporation attendee
	* @return the new corporation attendee
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee create(long id);

	/**
	* Removes the corporation attendee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporation attendee
	* @return the corporation attendee that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException if a corporation attendee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee corporationAttendee)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the corporation attendee with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException} if it could not be found.
	*
	* @param id the primary key of the corporation attendee
	* @return the corporation attendee
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException if a corporation attendee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException;

	/**
	* Returns the corporation attendee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the corporation attendee
	* @return the corporation attendee, or <code>null</code> if a corporation attendee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the corporation attendees.
	*
	* @return the corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the corporation attendees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporation attendees
	* @param end the upper bound of the range of corporation attendees (not inclusive)
	* @return the range of corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the corporation attendees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporation attendees
	* @param end the upper bound of the range of corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the corporation attendees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of corporation attendees.
	*
	* @return the number of corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}