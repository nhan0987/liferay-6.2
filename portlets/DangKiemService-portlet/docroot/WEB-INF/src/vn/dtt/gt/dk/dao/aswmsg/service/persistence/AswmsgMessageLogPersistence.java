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

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog;

/**
 * The persistence interface for the aswmsg message log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgMessageLogPersistenceImpl
 * @see AswmsgMessageLogUtil
 * @generated
 */
public interface AswmsgMessageLogPersistence extends BasePersistence<AswmsgMessageLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AswmsgMessageLogUtil} to access the aswmsg message log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the aswmsg message log where Version = &#63; and MessageId = &#63; or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException} if it could not be found.
	*
	* @param Version the version
	* @param MessageId the message ID
	* @return the matching aswmsg message log
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException if a matching aswmsg message log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog findByVersionAndMessageId(
		java.lang.String Version, java.lang.String MessageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException;

	/**
	* Returns the aswmsg message log where Version = &#63; and MessageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param Version the version
	* @param MessageId the message ID
	* @return the matching aswmsg message log, or <code>null</code> if a matching aswmsg message log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog fetchByVersionAndMessageId(
		java.lang.String Version, java.lang.String MessageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the aswmsg message log where Version = &#63; and MessageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param Version the version
	* @param MessageId the message ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching aswmsg message log, or <code>null</code> if a matching aswmsg message log could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog fetchByVersionAndMessageId(
		java.lang.String Version, java.lang.String MessageId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the aswmsg message log where Version = &#63; and MessageId = &#63; from the database.
	*
	* @param Version the version
	* @param MessageId the message ID
	* @return the aswmsg message log that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog removeByVersionAndMessageId(
		java.lang.String Version, java.lang.String MessageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException;

	/**
	* Returns the number of aswmsg message logs where Version = &#63; and MessageId = &#63;.
	*
	* @param Version the version
	* @param MessageId the message ID
	* @return the number of matching aswmsg message logs
	* @throws SystemException if a system exception occurred
	*/
	public int countByVersionAndMessageId(java.lang.String Version,
		java.lang.String MessageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the aswmsg message log in the entity cache if it is enabled.
	*
	* @param aswmsgMessageLog the aswmsg message log
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog aswmsgMessageLog);

	/**
	* Caches the aswmsg message logs in the entity cache if it is enabled.
	*
	* @param aswmsgMessageLogs the aswmsg message logs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog> aswmsgMessageLogs);

	/**
	* Creates a new aswmsg message log with the primary key. Does not add the aswmsg message log to the database.
	*
	* @param Id the primary key for the new aswmsg message log
	* @return the new aswmsg message log
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog create(long Id);

	/**
	* Removes the aswmsg message log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the aswmsg message log
	* @return the aswmsg message log that was removed
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException if a aswmsg message log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException;

	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog aswmsgMessageLog)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the aswmsg message log with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException} if it could not be found.
	*
	* @param Id the primary key of the aswmsg message log
	* @return the aswmsg message log
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException if a aswmsg message log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgMessageLogException;

	/**
	* Returns the aswmsg message log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the aswmsg message log
	* @return the aswmsg message log, or <code>null</code> if a aswmsg message log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the aswmsg message logs.
	*
	* @return the aswmsg message logs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the aswmsg message logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of aswmsg message logs.
	*
	* @return the number of aswmsg message logs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}