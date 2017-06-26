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

package vn.dtt.gt.dk.dao.motcua.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification;

/**
 * The persistence interface for the mot cua notification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaNotificationPersistenceImpl
 * @see MotCuaNotificationUtil
 * @generated
 */
public interface MotCuaNotificationPersistence extends BasePersistence<MotCuaNotification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MotCuaNotificationUtil} to access the mot cua notification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the mot cua notification in the entity cache if it is enabled.
	*
	* @param motCuaNotification the mot cua notification
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification motCuaNotification);

	/**
	* Caches the mot cua notifications in the entity cache if it is enabled.
	*
	* @param motCuaNotifications the mot cua notifications
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification> motCuaNotifications);

	/**
	* Creates a new mot cua notification with the primary key. Does not add the mot cua notification to the database.
	*
	* @param id the primary key for the new mot cua notification
	* @return the new mot cua notification
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification create(long id);

	/**
	* Removes the mot cua notification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua notification
	* @return the mot cua notification that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaNotificationException if a mot cua notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaNotificationException;

	public vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification motCuaNotification)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua notification with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaNotificationException} if it could not be found.
	*
	* @param id the primary key of the mot cua notification
	* @return the mot cua notification
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaNotificationException if a mot cua notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaNotificationException;

	/**
	* Returns the mot cua notification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua notification
	* @return the mot cua notification, or <code>null</code> if a mot cua notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua notifications.
	*
	* @return the mot cua notifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua notifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaNotificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua notifications
	* @param end the upper bound of the range of mot cua notifications (not inclusive)
	* @return the range of mot cua notifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua notifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaNotificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua notifications
	* @param end the upper bound of the range of mot cua notifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua notifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mot cua notifications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua notifications.
	*
	* @return the number of mot cua notifications
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}