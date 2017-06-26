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

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory;

/**
 * The persistence interface for the aswmsg syndatahistory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgSyndatahistoryPersistenceImpl
 * @see AswmsgSyndatahistoryUtil
 * @generated
 */
public interface AswmsgSyndatahistoryPersistence extends BasePersistence<AswmsgSyndatahistory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AswmsgSyndatahistoryUtil} to access the aswmsg syndatahistory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the aswmsg syndatahistory where version = &#63; and messageId = &#63; or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException} if it could not be found.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the matching aswmsg syndatahistory
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory findByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException;

	/**
	* Returns the aswmsg syndatahistory where version = &#63; and messageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the matching aswmsg syndatahistory, or <code>null</code> if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory fetchByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the aswmsg syndatahistory where version = &#63; and messageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param version the version
	* @param messageId the message ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching aswmsg syndatahistory, or <code>null</code> if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory fetchByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the aswmsg syndatahistory where version = &#63; and messageId = &#63; from the database.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the aswmsg syndatahistory that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory removeByVersionAndMessageId(
		java.lang.String version, java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException;

	/**
	* Returns the number of aswmsg syndatahistories where version = &#63; and messageId = &#63;.
	*
	* @param version the version
	* @param messageId the message ID
	* @return the number of matching aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public int countByVersionAndMessageId(java.lang.String version,
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the aswmsg syndatahistories where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the matching aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> findByMessageId(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> findByMessageId(
		java.lang.String messageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> findByMessageId(
		java.lang.String messageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first aswmsg syndatahistory in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg syndatahistory
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory findByMessageId_First(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException;

	/**
	* Returns the first aswmsg syndatahistory in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching aswmsg syndatahistory, or <code>null</code> if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory fetchByMessageId_First(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last aswmsg syndatahistory in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg syndatahistory
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory findByMessageId_Last(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException;

	/**
	* Returns the last aswmsg syndatahistory in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching aswmsg syndatahistory, or <code>null</code> if a matching aswmsg syndatahistory could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory fetchByMessageId_Last(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory[] findByMessageId_PrevAndNext(
		long id, java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException;

	/**
	* Removes all the aswmsg syndatahistories where messageId = &#63; from the database.
	*
	* @param messageId the message ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of aswmsg syndatahistories where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the number of matching aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public int countByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the aswmsg syndatahistory in the entity cache if it is enabled.
	*
	* @param aswmsgSyndatahistory the aswmsg syndatahistory
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory aswmsgSyndatahistory);

	/**
	* Caches the aswmsg syndatahistories in the entity cache if it is enabled.
	*
	* @param aswmsgSyndatahistories the aswmsg syndatahistories
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> aswmsgSyndatahistories);

	/**
	* Creates a new aswmsg syndatahistory with the primary key. Does not add the aswmsg syndatahistory to the database.
	*
	* @param id the primary key for the new aswmsg syndatahistory
	* @return the new aswmsg syndatahistory
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory create(long id);

	/**
	* Removes the aswmsg syndatahistory with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the aswmsg syndatahistory
	* @return the aswmsg syndatahistory that was removed
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a aswmsg syndatahistory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException;

	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory aswmsgSyndatahistory)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the aswmsg syndatahistory with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException} if it could not be found.
	*
	* @param id the primary key of the aswmsg syndatahistory
	* @return the aswmsg syndatahistory
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException if a aswmsg syndatahistory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgSyndatahistoryException;

	/**
	* Returns the aswmsg syndatahistory with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the aswmsg syndatahistory
	* @return the aswmsg syndatahistory, or <code>null</code> if a aswmsg syndatahistory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the aswmsg syndatahistories.
	*
	* @return the aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the aswmsg syndatahistories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of aswmsg syndatahistories.
	*
	* @return the number of aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}