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

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog;

import java.util.List;

/**
 * The persistence utility for the aswmsg message log service. This utility wraps {@link AswmsgMessageLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgMessageLogPersistence
 * @see AswmsgMessageLogPersistenceImpl
 * @generated
 */
public class AswmsgMessageLogUtil {
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
	public static void clearCache(AswmsgMessageLog aswmsgMessageLog) {
		getPersistence().clearCache(aswmsgMessageLog);
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
	public static List<AswmsgMessageLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AswmsgMessageLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AswmsgMessageLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AswmsgMessageLog update(AswmsgMessageLog aswmsgMessageLog)
		throws SystemException {
		return getPersistence().update(aswmsgMessageLog);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AswmsgMessageLog update(AswmsgMessageLog aswmsgMessageLog,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(aswmsgMessageLog, serviceContext);
	}

	/**
	* Returns the aswmsg message log where Version = &#63; and MessageId = &#63; or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException} if it could not be found.
	*
	* @param Version the version
	* @param MessageId the message ID
	* @return the matching aswmsg message log
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException if a matching aswmsg message log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog findByVersionAndMessageId(
		java.lang.String Version, java.lang.String MessageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException {
		return getPersistence().findByVersionAndMessageId(Version, MessageId);
	}

	/**
	* Returns the aswmsg message log where Version = &#63; and MessageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param Version the version
	* @param MessageId the message ID
	* @return the matching aswmsg message log, or <code>null</code> if a matching aswmsg message log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog fetchByVersionAndMessageId(
		java.lang.String Version, java.lang.String MessageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByVersionAndMessageId(Version, MessageId);
	}

	/**
	* Returns the aswmsg message log where Version = &#63; and MessageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param Version the version
	* @param MessageId the message ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching aswmsg message log, or <code>null</code> if a matching aswmsg message log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog fetchByVersionAndMessageId(
		java.lang.String Version, java.lang.String MessageId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVersionAndMessageId(Version, MessageId,
			retrieveFromCache);
	}

	/**
	* Removes the aswmsg message log where Version = &#63; and MessageId = &#63; from the database.
	*
	* @param Version the version
	* @param MessageId the message ID
	* @return the aswmsg message log that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog removeByVersionAndMessageId(
		java.lang.String Version, java.lang.String MessageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException {
		return getPersistence().removeByVersionAndMessageId(Version, MessageId);
	}

	/**
	* Returns the number of aswmsg message logs where Version = &#63; and MessageId = &#63;.
	*
	* @param Version the version
	* @param MessageId the message ID
	* @return the number of matching aswmsg message logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVersionAndMessageId(java.lang.String Version,
		java.lang.String MessageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByVersionAndMessageId(Version, MessageId);
	}

	/**
	* Caches the aswmsg message log in the entity cache if it is enabled.
	*
	* @param aswmsgMessageLog the aswmsg message log
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog aswmsgMessageLog) {
		getPersistence().cacheResult(aswmsgMessageLog);
	}

	/**
	* Caches the aswmsg message logs in the entity cache if it is enabled.
	*
	* @param aswmsgMessageLogs the aswmsg message logs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog> aswmsgMessageLogs) {
		getPersistence().cacheResult(aswmsgMessageLogs);
	}

	/**
	* Creates a new aswmsg message log with the primary key. Does not add the aswmsg message log to the database.
	*
	* @param Id the primary key for the new aswmsg message log
	* @return the new aswmsg message log
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the aswmsg message log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the aswmsg message log
	* @return the aswmsg message log that was removed
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException if a aswmsg message log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException {
		return getPersistence().remove(Id);
	}

	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog aswmsgMessageLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(aswmsgMessageLog);
	}

	/**
	* Returns the aswmsg message log with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException} if it could not be found.
	*
	* @param Id the primary key of the aswmsg message log
	* @return the aswmsg message log
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException if a aswmsg message log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the aswmsg message log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the aswmsg message log
	* @return the aswmsg message log, or <code>null</code> if a aswmsg message log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the aswmsg message logs.
	*
	* @return the aswmsg message logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the aswmsg message logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of aswmsg message logs
	* @param end the upper bound of the range of aswmsg message logs (not inclusive)
	* @return the range of aswmsg message logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the aswmsg message logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of aswmsg message logs
	* @param end the upper bound of the range of aswmsg message logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of aswmsg message logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the aswmsg message logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of aswmsg message logs.
	*
	* @return the number of aswmsg message logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AswmsgMessageLogPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AswmsgMessageLogPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.aswmsg.service.ClpSerializer.getServletContextName(),
					AswmsgMessageLogPersistence.class.getName());

			ReferenceRegistry.registerReference(AswmsgMessageLogUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AswmsgMessageLogPersistence persistence) {
	}

	private static AswmsgMessageLogPersistence _persistence;
}