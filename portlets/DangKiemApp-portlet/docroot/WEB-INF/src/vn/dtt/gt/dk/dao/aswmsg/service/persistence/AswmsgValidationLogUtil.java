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

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;

import java.util.List;

/**
 * The persistence utility for the aswmsg validation log service. This utility wraps {@link AswmsgValidationLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgValidationLogPersistence
 * @see AswmsgValidationLogPersistenceImpl
 * @generated
 */
public class AswmsgValidationLogUtil {
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
	public static void clearCache(AswmsgValidationLog aswmsgValidationLog) {
		getPersistence().clearCache(aswmsgValidationLog);
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
	public static List<AswmsgValidationLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AswmsgValidationLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AswmsgValidationLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AswmsgValidationLog update(
		AswmsgValidationLog aswmsgValidationLog) throws SystemException {
		return getPersistence().update(aswmsgValidationLog);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AswmsgValidationLog update(
		AswmsgValidationLog aswmsgValidationLog, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(aswmsgValidationLog, serviceContext);
	}

	/**
	* Returns all the aswmsg validation logs where MessageLogId = &#63;.
	*
	* @param MessageLogId the message log ID
	* @return the matching aswmsg validation logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog> findByMessageLogId(
		long MessageLogId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMessageLogId(MessageLogId);
	}

	/**
	* Returns a range of all the aswmsg validation logs where MessageLogId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param MessageLogId the message log ID
	* @param start the lower bound of the range of aswmsg validation logs
	* @param end the upper bound of the range of aswmsg validation logs (not inclusive)
	* @return the range of matching aswmsg validation logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog> findByMessageLogId(
		long MessageLogId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMessageLogId(MessageLogId, start, end);
	}

	/**
	* Returns an ordered range of all the aswmsg validation logs where MessageLogId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param MessageLogId the message log ID
	* @param start the lower bound of the range of aswmsg validation logs
	* @param end the upper bound of the range of aswmsg validation logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching aswmsg validation logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog> findByMessageLogId(
		long MessageLogId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMessageLogId(MessageLogId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first aswmsg validation log in the ordered set where MessageLogId = &#63;.
	*
	* @param MessageLogId the message log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg validation log
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException if a matching aswmsg validation log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog findByMessageLogId_First(
		long MessageLogId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException {
		return getPersistence()
				   .findByMessageLogId_First(MessageLogId, orderByComparator);
	}

	/**
	* Returns the first aswmsg validation log in the ordered set where MessageLogId = &#63;.
	*
	* @param MessageLogId the message log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg validation log, or <code>null</code> if a matching aswmsg validation log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog fetchByMessageLogId_First(
		long MessageLogId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMessageLogId_First(MessageLogId, orderByComparator);
	}

	/**
	* Returns the last aswmsg validation log in the ordered set where MessageLogId = &#63;.
	*
	* @param MessageLogId the message log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg validation log
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException if a matching aswmsg validation log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog findByMessageLogId_Last(
		long MessageLogId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException {
		return getPersistence()
				   .findByMessageLogId_Last(MessageLogId, orderByComparator);
	}

	/**
	* Returns the last aswmsg validation log in the ordered set where MessageLogId = &#63;.
	*
	* @param MessageLogId the message log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg validation log, or <code>null</code> if a matching aswmsg validation log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog fetchByMessageLogId_Last(
		long MessageLogId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMessageLogId_Last(MessageLogId, orderByComparator);
	}

	/**
	* Returns the aswmsg validation logs before and after the current aswmsg validation log in the ordered set where MessageLogId = &#63;.
	*
	* @param Id the primary key of the current aswmsg validation log
	* @param MessageLogId the message log ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next aswmsg validation log
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException if a aswmsg validation log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog[] findByMessageLogId_PrevAndNext(
		long Id, long MessageLogId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException {
		return getPersistence()
				   .findByMessageLogId_PrevAndNext(Id, MessageLogId,
			orderByComparator);
	}

	/**
	* Removes all the aswmsg validation logs where MessageLogId = &#63; from the database.
	*
	* @param MessageLogId the message log ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMessageLogId(long MessageLogId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMessageLogId(MessageLogId);
	}

	/**
	* Returns the number of aswmsg validation logs where MessageLogId = &#63;.
	*
	* @param MessageLogId the message log ID
	* @return the number of matching aswmsg validation logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMessageLogId(long MessageLogId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMessageLogId(MessageLogId);
	}

	/**
	* Caches the aswmsg validation log in the entity cache if it is enabled.
	*
	* @param aswmsgValidationLog the aswmsg validation log
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog aswmsgValidationLog) {
		getPersistence().cacheResult(aswmsgValidationLog);
	}

	/**
	* Caches the aswmsg validation logs in the entity cache if it is enabled.
	*
	* @param aswmsgValidationLogs the aswmsg validation logs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog> aswmsgValidationLogs) {
		getPersistence().cacheResult(aswmsgValidationLogs);
	}

	/**
	* Creates a new aswmsg validation log with the primary key. Does not add the aswmsg validation log to the database.
	*
	* @param Id the primary key for the new aswmsg validation log
	* @return the new aswmsg validation log
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog create(
		long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the aswmsg validation log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the aswmsg validation log
	* @return the aswmsg validation log that was removed
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException if a aswmsg validation log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog remove(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException {
		return getPersistence().remove(Id);
	}

	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog aswmsgValidationLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(aswmsgValidationLog);
	}

	/**
	* Returns the aswmsg validation log with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException} if it could not be found.
	*
	* @param Id the primary key of the aswmsg validation log
	* @return the aswmsg validation log
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException if a aswmsg validation log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgValidationLogException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the aswmsg validation log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the aswmsg validation log
	* @return the aswmsg validation log, or <code>null</code> if a aswmsg validation log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the aswmsg validation logs.
	*
	* @return the aswmsg validation logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the aswmsg validation logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of aswmsg validation logs
	* @param end the upper bound of the range of aswmsg validation logs (not inclusive)
	* @return the range of aswmsg validation logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the aswmsg validation logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgValidationLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of aswmsg validation logs
	* @param end the upper bound of the range of aswmsg validation logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of aswmsg validation logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the aswmsg validation logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of aswmsg validation logs.
	*
	* @return the number of aswmsg validation logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AswmsgValidationLogPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AswmsgValidationLogPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.aswmsg.service.ClpSerializer.getServletContextName(),
					AswmsgValidationLogPersistence.class.getName());

			ReferenceRegistry.registerReference(AswmsgValidationLogUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AswmsgValidationLogPersistence persistence) {
	}

	private static AswmsgValidationLogPersistence _persistence;
}