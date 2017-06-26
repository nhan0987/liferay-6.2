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

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue;

import java.util.List;

/**
 * The persistence utility for the aswmsg message queue service. This utility wraps {@link AswmsgMessageQueuePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgMessageQueuePersistence
 * @see AswmsgMessageQueuePersistenceImpl
 * @generated
 */
public class AswmsgMessageQueueUtil {
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
	public static void clearCache(AswmsgMessageQueue aswmsgMessageQueue) {
		getPersistence().clearCache(aswmsgMessageQueue);
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
	public static List<AswmsgMessageQueue> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AswmsgMessageQueue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AswmsgMessageQueue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AswmsgMessageQueue update(
		AswmsgMessageQueue aswmsgMessageQueue) throws SystemException {
		return getPersistence().update(aswmsgMessageQueue);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AswmsgMessageQueue update(
		AswmsgMessageQueue aswmsgMessageQueue, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(aswmsgMessageQueue, serviceContext);
	}

	/**
	* Returns the aswmsg message queue where version = &#63; and messageId = &#63; or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException} if it could not be found.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence().findByVersionAndMessageId(version, messageId);
	}

	/**
	* Returns the aswmsg message queue where version = &#63; and messageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByVersionAndMessageId(version, messageId);
	}

	/**
	* Returns the aswmsg message queue where version = &#63; and messageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param version the version
	* @param messageId the message ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVersionAndMessageId(version, messageId,
			retrieveFromCache);
	}

	/**
	* Removes the aswmsg message queue where version = &#63; and messageId = &#63; from the database.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the aswmsg message queue that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue removeByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence().removeByVersionAndMessageId(version, messageId);
	}

	/**
	* Returns the number of aswmsg message queues where version = &#63; and messageId = &#63;.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the number of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVersionAndMessageId(java.lang.String version,
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByVersionAndMessageId(version, messageId);
	}

	/**
	* Returns all the aswmsg message queues where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByMessageId(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMessageId(messageId);
	}

	/**
	* Returns a range of all the aswmsg message queues where messageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param messageId the message ID
	* @param start the lower bound of the range of aswmsg message queues
	* @param end the upper bound of the range of aswmsg message queues (not inclusive)
	* @return the range of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByMessageId(
		java.lang.String messageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMessageId(messageId, start, end);
	}

	/**
	* Returns an ordered range of all the aswmsg message queues where messageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param messageId the message ID
	* @param start the lower bound of the range of aswmsg message queues
	* @param end the upper bound of the range of aswmsg message queues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByMessageId(
		java.lang.String messageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMessageId(messageId, start, end, orderByComparator);
	}

	/**
	* Returns the first aswmsg message queue in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByMessageId_First(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByMessageId_First(messageId, orderByComparator);
	}

	/**
	* Returns the first aswmsg message queue in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByMessageId_First(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMessageId_First(messageId, orderByComparator);
	}

	/**
	* Returns the last aswmsg message queue in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByMessageId_Last(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByMessageId_Last(messageId, orderByComparator);
	}

	/**
	* Returns the last aswmsg message queue in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByMessageId_Last(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMessageId_Last(messageId, orderByComparator);
	}

	/**
	* Returns the aswmsg message queues before and after the current aswmsg message queue in the ordered set where messageId = &#63;.
	*
	* @param id the primary key of the current aswmsg message queue
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue[] findByMessageId_PrevAndNext(
		long id, java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByMessageId_PrevAndNext(id, messageId, orderByComparator);
	}

	/**
	* Removes all the aswmsg message queues where messageId = &#63; from the database.
	*
	* @param messageId the message ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMessageId(messageId);
	}

	/**
	* Returns the number of aswmsg message queues where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the number of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMessageId(messageId);
	}

	/**
	* Returns all the aswmsg message queues where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param type the type
	* @param function the function
	* @return the matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId, int type, java.lang.String function)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId, type, function);
	}

	/**
	* Returns a range of all the aswmsg message queues where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param type the type
	* @param function the function
	* @param start the lower bound of the range of aswmsg message queues
	* @param end the upper bound of the range of aswmsg message queues (not inclusive)
	* @return the range of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId, int type, java.lang.String function, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoSoThuTucId(hoSoThuTucId, type, function, start, end);
	}

	/**
	* Returns an ordered range of all the aswmsg message queues where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param type the type
	* @param function the function
	* @param start the lower bound of the range of aswmsg message queues
	* @param end the upper bound of the range of aswmsg message queues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId, int type, java.lang.String function, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoSoThuTucId(hoSoThuTucId, type, function, start,
			end, orderByComparator);
	}

	/**
	* Returns the first aswmsg message queue in the ordered set where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param type the type
	* @param function the function
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByHoSoThuTucId_First(
		long hoSoThuTucId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByHoSoThuTucId_First(hoSoThuTucId, type, function,
			orderByComparator);
	}

	/**
	* Returns the first aswmsg message queue in the ordered set where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param type the type
	* @param function the function
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByHoSoThuTucId_First(
		long hoSoThuTucId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_First(hoSoThuTucId, type, function,
			orderByComparator);
	}

	/**
	* Returns the last aswmsg message queue in the ordered set where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param type the type
	* @param function the function
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByHoSoThuTucId_Last(
		long hoSoThuTucId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByHoSoThuTucId_Last(hoSoThuTucId, type, function,
			orderByComparator);
	}

	/**
	* Returns the last aswmsg message queue in the ordered set where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param type the type
	* @param function the function
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByHoSoThuTucId_Last(
		long hoSoThuTucId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_Last(hoSoThuTucId, type, function,
			orderByComparator);
	}

	/**
	* Returns the aswmsg message queues before and after the current aswmsg message queue in the ordered set where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	*
	* @param id the primary key of the current aswmsg message queue
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param type the type
	* @param function the function
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByHoSoThuTucId_PrevAndNext(id, hoSoThuTucId, type,
			function, orderByComparator);
	}

	/**
	* Removes all the aswmsg message queues where hoSoThuTucId = &#63; and type = &#63; and function = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param type the type
	* @param function the function
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByHoSoThuTucId(long hoSoThuTucId, int type,
		java.lang.String function)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByHoSoThuTucId(hoSoThuTucId, type, function);
	}

	/**
	* Returns the number of aswmsg message queues where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param type the type
	* @param function the function
	* @return the number of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucId(long hoSoThuTucId, int type,
		java.lang.String function)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoSoThuTucId(hoSoThuTucId, type, function);
	}

	/**
	* Returns all the aswmsg message queues where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param type the type
	* @param function the function
	* @return the matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int type, java.lang.String function)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyPhuId(phieuXuLyPhuId, type, function);
	}

	/**
	* Returns a range of all the aswmsg message queues where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param type the type
	* @param function the function
	* @param start the lower bound of the range of aswmsg message queues
	* @param end the upper bound of the range of aswmsg message queues (not inclusive)
	* @return the range of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int type, java.lang.String function, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyPhuId(phieuXuLyPhuId, type, function, start,
			end);
	}

	/**
	* Returns an ordered range of all the aswmsg message queues where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param type the type
	* @param function the function
	* @param start the lower bound of the range of aswmsg message queues
	* @param end the upper bound of the range of aswmsg message queues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int type, java.lang.String function, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyPhuId(phieuXuLyPhuId, type, function, start,
			end, orderByComparator);
	}

	/**
	* Returns the first aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param type the type
	* @param function the function
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByPhieuXuLyPhuId_First(phieuXuLyPhuId, type, function,
			orderByComparator);
	}

	/**
	* Returns the first aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param type the type
	* @param function the function
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyPhuId_First(phieuXuLyPhuId, type, function,
			orderByComparator);
	}

	/**
	* Returns the last aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param type the type
	* @param function the function
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByPhieuXuLyPhuId_Last(phieuXuLyPhuId, type, function,
			orderByComparator);
	}

	/**
	* Returns the last aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param type the type
	* @param function the function
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyPhuId_Last(phieuXuLyPhuId, type, function,
			orderByComparator);
	}

	/**
	* Returns the aswmsg message queues before and after the current aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	*
	* @param id the primary key of the current aswmsg message queue
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param type the type
	* @param function the function
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue[] findByPhieuXuLyPhuId_PrevAndNext(
		long id, long phieuXuLyPhuId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByPhieuXuLyPhuId_PrevAndNext(id, phieuXuLyPhuId, type,
			function, orderByComparator);
	}

	/**
	* Removes all the aswmsg message queues where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63; from the database.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param type the type
	* @param function the function
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPhieuXuLyPhuId(long phieuXuLyPhuId, int type,
		java.lang.String function)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPhieuXuLyPhuId(phieuXuLyPhuId, type, function);
	}

	/**
	* Returns the number of aswmsg message queues where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param type the type
	* @param function the function
	* @return the number of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPhieuXuLyPhuId(long phieuXuLyPhuId, int type,
		java.lang.String function)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPhieuXuLyPhuId(phieuXuLyPhuId, type, function);
	}

	/**
	* Returns all the aswmsg message queues where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLayPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns a range of all the aswmsg message queues where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of aswmsg message queues
	* @param end the upper bound of the range of aswmsg message queues (not inclusive)
	* @return the range of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLayPhieuXuLyPhuId(phieuXuLyPhuId, start, end);
	}

	/**
	* Returns an ordered range of all the aswmsg message queues where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of aswmsg message queues
	* @param end the upper bound of the range of aswmsg message queues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLayPhieuXuLyPhuId(phieuXuLyPhuId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByLayPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByLayPhieuXuLyPhuId_First(phieuXuLyPhuId,
			orderByComparator);
	}

	/**
	* Returns the first aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByLayPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLayPhieuXuLyPhuId_First(phieuXuLyPhuId,
			orderByComparator);
	}

	/**
	* Returns the last aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByLayPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByLayPhieuXuLyPhuId_Last(phieuXuLyPhuId,
			orderByComparator);
	}

	/**
	* Returns the last aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByLayPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLayPhieuXuLyPhuId_Last(phieuXuLyPhuId,
			orderByComparator);
	}

	/**
	* Returns the aswmsg message queues before and after the current aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param id the primary key of the current aswmsg message queue
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue[] findByLayPhieuXuLyPhuId_PrevAndNext(
		long id, long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByLayPhieuXuLyPhuId_PrevAndNext(id, phieuXuLyPhuId,
			orderByComparator);
	}

	/**
	* Removes all the aswmsg message queues where phieuXuLyPhuId = &#63; from the database.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLayPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLayPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the number of aswmsg message queues where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the number of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLayPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLayPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns all the aswmsg message queues where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByLayHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLayHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns a range of all the aswmsg message queues where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of aswmsg message queues
	* @param end the upper bound of the range of aswmsg message queues (not inclusive)
	* @return the range of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByLayHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLayHoSoThuTucId(hoSoThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the aswmsg message queues where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of aswmsg message queues
	* @param end the upper bound of the range of aswmsg message queues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByLayHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLayHoSoThuTucId(hoSoThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByLayHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByLayHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the first aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByLayHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLayHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByLayHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByLayHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByLayHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLayHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the aswmsg message queues before and after the current aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current aswmsg message queue
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue[] findByLayHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence()
				   .findByLayHoSoThuTucId_PrevAndNext(id, hoSoThuTucId,
			orderByComparator);
	}

	/**
	* Removes all the aswmsg message queues where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLayHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLayHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the number of aswmsg message queues where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLayHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLayHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Caches the aswmsg message queue in the entity cache if it is enabled.
	*
	* @param aswmsgMessageQueue the aswmsg message queue
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue aswmsgMessageQueue) {
		getPersistence().cacheResult(aswmsgMessageQueue);
	}

	/**
	* Caches the aswmsg message queues in the entity cache if it is enabled.
	*
	* @param aswmsgMessageQueues the aswmsg message queues
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> aswmsgMessageQueues) {
		getPersistence().cacheResult(aswmsgMessageQueues);
	}

	/**
	* Creates a new aswmsg message queue with the primary key. Does not add the aswmsg message queue to the database.
	*
	* @param id the primary key for the new aswmsg message queue
	* @return the new aswmsg message queue
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the aswmsg message queue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the aswmsg message queue
	* @return the aswmsg message queue that was removed
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue aswmsgMessageQueue)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(aswmsgMessageQueue);
	}

	/**
	* Returns the aswmsg message queue with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException} if it could not be found.
	*
	* @param id the primary key of the aswmsg message queue
	* @return the aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the aswmsg message queue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the aswmsg message queue
	* @return the aswmsg message queue, or <code>null</code> if a aswmsg message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the aswmsg message queues.
	*
	* @return the aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the aswmsg message queues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of aswmsg message queues
	* @param end the upper bound of the range of aswmsg message queues (not inclusive)
	* @return the range of aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the aswmsg message queues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgMessageQueueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of aswmsg message queues
	* @param end the upper bound of the range of aswmsg message queues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the aswmsg message queues from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of aswmsg message queues.
	*
	* @return the number of aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AswmsgMessageQueuePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AswmsgMessageQueuePersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.aswmsg.service.ClpSerializer.getServletContextName(),
					AswmsgMessageQueuePersistence.class.getName());

			ReferenceRegistry.registerReference(AswmsgMessageQueueUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AswmsgMessageQueuePersistence persistence) {
	}

	private static AswmsgMessageQueuePersistence _persistence;
}