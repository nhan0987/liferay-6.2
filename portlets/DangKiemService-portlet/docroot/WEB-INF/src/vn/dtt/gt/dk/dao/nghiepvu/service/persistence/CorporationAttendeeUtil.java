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

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee;

import java.util.List;

/**
 * The persistence utility for the corporation attendee service. This utility wraps {@link CorporationAttendeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CorporationAttendeePersistence
 * @see CorporationAttendeePersistenceImpl
 * @generated
 */
public class CorporationAttendeeUtil {
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
	public static void clearCache(CorporationAttendee corporationAttendee) {
		getPersistence().clearCache(corporationAttendee);
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
	public static List<CorporationAttendee> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CorporationAttendee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CorporationAttendee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CorporationAttendee update(
		CorporationAttendee corporationAttendee) throws SystemException {
		return getPersistence().update(corporationAttendee);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CorporationAttendee update(
		CorporationAttendee corporationAttendee, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(corporationAttendee, serviceContext);
	}

	/**
	* Returns all the corporation attendees where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @return the matching corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionId(
		long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByConfirmedInspectionId(confirmedInspectionId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionId(
		long confirmedInspectionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByConfirmedInspectionId(confirmedInspectionId, start,
			end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionId(
		long confirmedInspectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByConfirmedInspectionId(confirmedInspectionId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first corporation attendee in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation attendee
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee findByConfirmedInspectionId_First(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException {
		return getPersistence()
				   .findByConfirmedInspectionId_First(confirmedInspectionId,
			orderByComparator);
	}

	/**
	* Returns the first corporation attendee in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation attendee, or <code>null</code> if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee fetchByConfirmedInspectionId_First(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByConfirmedInspectionId_First(confirmedInspectionId,
			orderByComparator);
	}

	/**
	* Returns the last corporation attendee in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation attendee
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee findByConfirmedInspectionId_Last(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException {
		return getPersistence()
				   .findByConfirmedInspectionId_Last(confirmedInspectionId,
			orderByComparator);
	}

	/**
	* Returns the last corporation attendee in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation attendee, or <code>null</code> if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee fetchByConfirmedInspectionId_Last(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByConfirmedInspectionId_Last(confirmedInspectionId,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee[] findByConfirmedInspectionId_PrevAndNext(
		long id, long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException {
		return getPersistence()
				   .findByConfirmedInspectionId_PrevAndNext(id,
			confirmedInspectionId, orderByComparator);
	}

	/**
	* Removes all the corporation attendees where confirmedInspectionId = &#63; from the database.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByConfirmedInspectionId(long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns the number of corporation attendees where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @return the number of matching corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByConfirmedInspectionId(long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns all the corporation attendees where confirmedInspectionId = &#63; and inspectorRole = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @return the matching corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionIdAndInspectorRole(
		long confirmedInspectionId, long inspectorRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByConfirmedInspectionIdAndInspectorRole(confirmedInspectionId,
			inspectorRole);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionIdAndInspectorRole(
		long confirmedInspectionId, long inspectorRole, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByConfirmedInspectionIdAndInspectorRole(confirmedInspectionId,
			inspectorRole, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionIdAndInspectorRole(
		long confirmedInspectionId, long inspectorRole, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByConfirmedInspectionIdAndInspectorRole(confirmedInspectionId,
			inspectorRole, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee findByConfirmedInspectionIdAndInspectorRole_First(
		long confirmedInspectionId, long inspectorRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException {
		return getPersistence()
				   .findByConfirmedInspectionIdAndInspectorRole_First(confirmedInspectionId,
			inspectorRole, orderByComparator);
	}

	/**
	* Returns the first corporation attendee in the ordered set where confirmedInspectionId = &#63; and inspectorRole = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporation attendee, or <code>null</code> if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee fetchByConfirmedInspectionIdAndInspectorRole_First(
		long confirmedInspectionId, long inspectorRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByConfirmedInspectionIdAndInspectorRole_First(confirmedInspectionId,
			inspectorRole, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee findByConfirmedInspectionIdAndInspectorRole_Last(
		long confirmedInspectionId, long inspectorRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException {
		return getPersistence()
				   .findByConfirmedInspectionIdAndInspectorRole_Last(confirmedInspectionId,
			inspectorRole, orderByComparator);
	}

	/**
	* Returns the last corporation attendee in the ordered set where confirmedInspectionId = &#63; and inspectorRole = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporation attendee, or <code>null</code> if a matching corporation attendee could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee fetchByConfirmedInspectionIdAndInspectorRole_Last(
		long confirmedInspectionId, long inspectorRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByConfirmedInspectionIdAndInspectorRole_Last(confirmedInspectionId,
			inspectorRole, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee[] findByConfirmedInspectionIdAndInspectorRole_PrevAndNext(
		long id, long confirmedInspectionId, long inspectorRole,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException {
		return getPersistence()
				   .findByConfirmedInspectionIdAndInspectorRole_PrevAndNext(id,
			confirmedInspectionId, inspectorRole, orderByComparator);
	}

	/**
	* Removes all the corporation attendees where confirmedInspectionId = &#63; and inspectorRole = &#63; from the database.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByConfirmedInspectionIdAndInspectorRole(
		long confirmedInspectionId, long inspectorRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByConfirmedInspectionIdAndInspectorRole(confirmedInspectionId,
			inspectorRole);
	}

	/**
	* Returns the number of corporation attendees where confirmedInspectionId = &#63; and inspectorRole = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param inspectorRole the inspector role
	* @return the number of matching corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public static int countByConfirmedInspectionIdAndInspectorRole(
		long confirmedInspectionId, long inspectorRole)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByConfirmedInspectionIdAndInspectorRole(confirmedInspectionId,
			inspectorRole);
	}

	/**
	* Caches the corporation attendee in the entity cache if it is enabled.
	*
	* @param corporationAttendee the corporation attendee
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee corporationAttendee) {
		getPersistence().cacheResult(corporationAttendee);
	}

	/**
	* Caches the corporation attendees in the entity cache if it is enabled.
	*
	* @param corporationAttendees the corporation attendees
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> corporationAttendees) {
		getPersistence().cacheResult(corporationAttendees);
	}

	/**
	* Creates a new corporation attendee with the primary key. Does not add the corporation attendee to the database.
	*
	* @param id the primary key for the new corporation attendee
	* @return the new corporation attendee
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the corporation attendee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporation attendee
	* @return the corporation attendee that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException if a corporation attendee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee corporationAttendee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(corporationAttendee);
	}

	/**
	* Returns the corporation attendee with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException} if it could not be found.
	*
	* @param id the primary key of the corporation attendee
	* @return the corporation attendee
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException if a corporation attendee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationAttendeeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the corporation attendee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the corporation attendee
	* @return the corporation attendee, or <code>null</code> if a corporation attendee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the corporation attendees.
	*
	* @return the corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the corporation attendees from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of corporation attendees.
	*
	* @return the number of corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CorporationAttendeePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CorporationAttendeePersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					CorporationAttendeePersistence.class.getName());

			ReferenceRegistry.registerReference(CorporationAttendeeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CorporationAttendeePersistence persistence) {
	}

	private static CorporationAttendeePersistence _persistence;
}