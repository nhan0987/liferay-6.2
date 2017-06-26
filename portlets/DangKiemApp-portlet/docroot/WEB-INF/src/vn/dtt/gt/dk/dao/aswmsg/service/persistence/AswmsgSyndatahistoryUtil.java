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

package vn.dtt.gt.dk.dao.aswmsg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory;

import java.util.List;

/**
 * The persistence utility for the aswmsg syndatahistory service. This utility wraps {@link AswmsgSyndatahistoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgSyndatahistoryPersistence
 * @see AswmsgSyndatahistoryPersistenceImpl
 * @generated
 */
public class AswmsgSyndatahistoryUtil {
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
	public static void clearCache(AswmsgSyndatahistory aswmsgSyndatahistory) {
		getPersistence().clearCache(aswmsgSyndatahistory);
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
	public static List<AswmsgSyndatahistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AswmsgSyndatahistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AswmsgSyndatahistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AswmsgSyndatahistory update(
		AswmsgSyndatahistory aswmsgSyndatahistory) throws SystemException {
		return getPersistence().update(aswmsgSyndatahistory);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AswmsgSyndatahistory update(
		AswmsgSyndatahistory aswmsgSyndatahistory, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(aswmsgSyndatahistory, serviceContext);
	}

	/**
	* Returns the aswmsg syndatahistory where version = &#63; and messageId = &#63; or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException} if it could not be found.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the matching aswmsg syndatahistory
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory findByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException {
		return getPersistence().findByVersionAndMessageId(version, messageId);
	}

	/**
	* Returns the aswmsg syndatahistory where version = &#63; and messageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the matching aswmsg syndatahistory, or <code>null</code> if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory fetchByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByVersionAndMessageId(version, messageId);
	}

	/**
	* Returns the aswmsg syndatahistory where version = &#63; and messageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param version the version
	* @param messageId the message ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching aswmsg syndatahistory, or <code>null</code> if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory fetchByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVersionAndMessageId(version, messageId,
			retrieveFromCache);
	}

	/**
	* Removes the aswmsg syndatahistory where version = &#63; and messageId = &#63; from the database.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the aswmsg syndatahistory that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory removeByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException {
		return getPersistence().removeByVersionAndMessageId(version, messageId);
	}

	/**
	* Returns the number of aswmsg syndatahistories where version = &#63; and messageId = &#63;.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the number of matching aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVersionAndMessageId(java.lang.String version,
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByVersionAndMessageId(version, messageId);
	}

	/**
	* Returns all the aswmsg syndatahistories where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the matching aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> findByMessageId(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMessageId(messageId);
	}

	/**
	* Returns a range of all the aswmsg syndatahistories where messageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param messageId the message ID
	* @param start the lower bound of the range of aswmsg syndatahistories
	* @param end the upper bound of the range of aswmsg syndatahistories (not inclusive)
	* @return the range of matching aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> findByMessageId(
		java.lang.String messageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMessageId(messageId, start, end);
	}

	/**
	* Returns an ordered range of all the aswmsg syndatahistories where messageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param messageId the message ID
	* @param start the lower bound of the range of aswmsg syndatahistories
	* @param end the upper bound of the range of aswmsg syndatahistories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> findByMessageId(
		java.lang.String messageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMessageId(messageId, start, end, orderByComparator);
	}

	/**
	* Returns the first aswmsg syndatahistory in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg syndatahistory
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory findByMessageId_First(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException {
		return getPersistence()
				   .findByMessageId_First(messageId, orderByComparator);
	}

	/**
	* Returns the first aswmsg syndatahistory in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg syndatahistory, or <code>null</code> if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory fetchByMessageId_First(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMessageId_First(messageId, orderByComparator);
	}

	/**
	* Returns the last aswmsg syndatahistory in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg syndatahistory
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory findByMessageId_Last(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException {
		return getPersistence()
				   .findByMessageId_Last(messageId, orderByComparator);
	}

	/**
	* Returns the last aswmsg syndatahistory in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg syndatahistory, or <code>null</code> if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory fetchByMessageId_Last(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMessageId_Last(messageId, orderByComparator);
	}

	/**
	* Returns the aswmsg syndatahistories before and after the current aswmsg syndatahistory in the ordered set where messageId = &#63;.
	*
	* @param id the primary key of the current aswmsg syndatahistory
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next aswmsg syndatahistory
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a aswmsg syndatahistory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory[] findByMessageId_PrevAndNext(
		long id, java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException {
		return getPersistence()
				   .findByMessageId_PrevAndNext(id, messageId, orderByComparator);
	}

	/**
	* Removes all the aswmsg syndatahistories where messageId = &#63; from the database.
	*
	* @param messageId the message ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMessageId(messageId);
	}

	/**
	* Returns the number of aswmsg syndatahistories where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the number of matching aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMessageId(messageId);
	}

	/**
	* Caches the aswmsg syndatahistory in the entity cache if it is enabled.
	*
	* @param aswmsgSyndatahistory the aswmsg syndatahistory
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory aswmsgSyndatahistory) {
		getPersistence().cacheResult(aswmsgSyndatahistory);
	}

	/**
	* Caches the aswmsg syndatahistories in the entity cache if it is enabled.
	*
	* @param aswmsgSyndatahistories the aswmsg syndatahistories
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> aswmsgSyndatahistories) {
		getPersistence().cacheResult(aswmsgSyndatahistories);
	}

	/**
	* Creates a new aswmsg syndatahistory with the primary key. Does not add the aswmsg syndatahistory to the database.
	*
	* @param id the primary key for the new aswmsg syndatahistory
	* @return the new aswmsg syndatahistory
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the aswmsg syndatahistory with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the aswmsg syndatahistory
	* @return the aswmsg syndatahistory that was removed
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a aswmsg syndatahistory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory aswmsgSyndatahistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(aswmsgSyndatahistory);
	}

	/**
	* Returns the aswmsg syndatahistory with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException} if it could not be found.
	*
	* @param id the primary key of the aswmsg syndatahistory
	* @return the aswmsg syndatahistory
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a aswmsg syndatahistory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the aswmsg syndatahistory with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the aswmsg syndatahistory
	* @return the aswmsg syndatahistory, or <code>null</code> if a aswmsg syndatahistory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the aswmsg syndatahistories.
	*
	* @return the aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the aswmsg syndatahistories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of aswmsg syndatahistories
	* @param end the upper bound of the range of aswmsg syndatahistories (not inclusive)
	* @return the range of aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the aswmsg syndatahistories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of aswmsg syndatahistories
	* @param end the upper bound of the range of aswmsg syndatahistories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the aswmsg syndatahistories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of aswmsg syndatahistories.
	*
	* @return the number of aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AswmsgSyndatahistoryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AswmsgSyndatahistoryPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.aswmsg.service.ClpSerializer.getServletContextName(),
					AswmsgSyndatahistoryPersistence.class.getName());

			ReferenceRegistry.registerReference(AswmsgSyndatahistoryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AswmsgSyndatahistoryPersistence persistence) {
	}

	private static AswmsgSyndatahistoryPersistence _persistence;
}