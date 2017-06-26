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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue;

/**
 * The persistence interface for the aswmsg message queue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgMessageQueuePersistenceImpl
 * @see AswmsgMessageQueueUtil
 * @generated
 */
public interface AswmsgMessageQueuePersistence extends BasePersistence<AswmsgMessageQueue> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AswmsgMessageQueueUtil} to access the aswmsg message queue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the aswmsg message queue where version = &#63; and messageId = &#63; or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException} if it could not be found.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Returns the aswmsg message queue where version = &#63; and messageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the aswmsg message queue where version = &#63; and messageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param version the version
	* @param messageId the message ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the aswmsg message queue where version = &#63; and messageId = &#63; from the database.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the aswmsg message queue that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue removeByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Returns the number of aswmsg message queues where version = &#63; and messageId = &#63;.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the number of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public int countByVersionAndMessageId(java.lang.String version,
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the aswmsg message queues where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByMessageId(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByMessageId(
		java.lang.String messageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByMessageId(
		java.lang.String messageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first aswmsg message queue in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByMessageId_First(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Returns the first aswmsg message queue in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByMessageId_First(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last aswmsg message queue in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByMessageId_Last(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Returns the last aswmsg message queue in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByMessageId_Last(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue[] findByMessageId_PrevAndNext(
		long id, java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Removes all the aswmsg message queues where messageId = &#63; from the database.
	*
	* @param messageId the message ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of aswmsg message queues where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the number of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public int countByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the aswmsg message queues where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param type the type
	* @param function the function
	* @return the matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId, int type, java.lang.String function)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId, int type, java.lang.String function, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByHoSoThuTucId(
		long hoSoThuTucId, int type, java.lang.String function, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByHoSoThuTucId_First(
		long hoSoThuTucId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByHoSoThuTucId_First(
		long hoSoThuTucId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByHoSoThuTucId_Last(
		long hoSoThuTucId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByHoSoThuTucId_Last(
		long hoSoThuTucId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Removes all the aswmsg message queues where hoSoThuTucId = &#63; and type = &#63; and function = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param type the type
	* @param function the function
	* @throws SystemException if a system exception occurred
	*/
	public void removeByHoSoThuTucId(long hoSoThuTucId, int type,
		java.lang.String function)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of aswmsg message queues where hoSoThuTucId = &#63; and type = &#63; and function = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param type the type
	* @param function the function
	* @return the number of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucId(long hoSoThuTucId, int type,
		java.lang.String function)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the aswmsg message queues where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param type the type
	* @param function the function
	* @return the matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int type, java.lang.String function)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int type, java.lang.String function, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int type, java.lang.String function, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue[] findByPhieuXuLyPhuId_PrevAndNext(
		long id, long phieuXuLyPhuId, int type, java.lang.String function,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Removes all the aswmsg message queues where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63; from the database.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param type the type
	* @param function the function
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhieuXuLyPhuId(long phieuXuLyPhuId, int type,
		java.lang.String function)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of aswmsg message queues where phieuXuLyPhuId = &#63; and type = &#63; and function = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param type the type
	* @param function the function
	* @return the number of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyPhuId(long phieuXuLyPhuId, int type,
		java.lang.String function)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the aswmsg message queues where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByLayPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByLayPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Returns the first aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByLayPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByLayPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Returns the last aswmsg message queue in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByLayPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue[] findByLayPhieuXuLyPhuId_PrevAndNext(
		long id, long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Removes all the aswmsg message queues where phieuXuLyPhuId = &#63; from the database.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLayPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of aswmsg message queues where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the number of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public int countByLayPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the aswmsg message queues where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByLayHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByLayHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findByLayHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByLayHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Returns the first aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByLayHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByLayHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Returns the last aswmsg message queue in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg message queue, or <code>null</code> if a matching aswmsg message queue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByLayHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue[] findByLayHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Removes all the aswmsg message queues where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLayHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of aswmsg message queues where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public int countByLayHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the aswmsg message queue in the entity cache if it is enabled.
	*
	* @param aswmsgMessageQueue the aswmsg message queue
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue aswmsgMessageQueue);

	/**
	* Caches the aswmsg message queues in the entity cache if it is enabled.
	*
	* @param aswmsgMessageQueues the aswmsg message queues
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> aswmsgMessageQueues);

	/**
	* Creates a new aswmsg message queue with the primary key. Does not add the aswmsg message queue to the database.
	*
	* @param id the primary key for the new aswmsg message queue
	* @return the new aswmsg message queue
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue create(long id);

	/**
	* Removes the aswmsg message queue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the aswmsg message queue
	* @return the aswmsg message queue that was removed
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue aswmsgMessageQueue)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the aswmsg message queue with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException} if it could not be found.
	*
	* @param id the primary key of the aswmsg message queue
	* @return the aswmsg message queue
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException if a aswmsg message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageQueueException;

	/**
	* Returns the aswmsg message queue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the aswmsg message queue
	* @return the aswmsg message queue, or <code>null</code> if a aswmsg message queue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the aswmsg message queues.
	*
	* @return the aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the aswmsg message queues from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of aswmsg message queues.
	*
	* @return the number of aswmsg message queues
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}