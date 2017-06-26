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

package vn.dtt.gt.dk.dao.common.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.common.model.TimKiemHoSo;

/**
 * The persistence interface for the tim kiem ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TimKiemHoSoPersistenceImpl
 * @see TimKiemHoSoUtil
 * @generated
 */
public interface TimKiemHoSoPersistence extends BasePersistence<TimKiemHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TimKiemHoSoUtil} to access the tim kiem ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tim kiem ho so in the entity cache if it is enabled.
	*
	* @param timKiemHoSo the tim kiem ho so
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.common.model.TimKiemHoSo timKiemHoSo);

	/**
	* Caches the tim kiem ho sos in the entity cache if it is enabled.
	*
	* @param timKiemHoSos the tim kiem ho sos
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.TimKiemHoSo> timKiemHoSos);

	/**
	* Creates a new tim kiem ho so with the primary key. Does not add the tim kiem ho so to the database.
	*
	* @param id the primary key for the new tim kiem ho so
	* @return the new tim kiem ho so
	*/
	public vn.dtt.gt.dk.dao.common.model.TimKiemHoSo create(long id);

	/**
	* Removes the tim kiem ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tim kiem ho so
	* @return the tim kiem ho so that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTimKiemHoSoException if a tim kiem ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TimKiemHoSo remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTimKiemHoSoException;

	public vn.dtt.gt.dk.dao.common.model.TimKiemHoSo updateImpl(
		vn.dtt.gt.dk.dao.common.model.TimKiemHoSo timKiemHoSo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tim kiem ho so with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTimKiemHoSoException} if it could not be found.
	*
	* @param id the primary key of the tim kiem ho so
	* @return the tim kiem ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTimKiemHoSoException if a tim kiem ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TimKiemHoSo findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTimKiemHoSoException;

	/**
	* Returns the tim kiem ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tim kiem ho so
	* @return the tim kiem ho so, or <code>null</code> if a tim kiem ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TimKiemHoSo fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tim kiem ho sos.
	*
	* @return the tim kiem ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TimKiemHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tim kiem ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TimKiemHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tim kiem ho sos
	* @param end the upper bound of the range of tim kiem ho sos (not inclusive)
	* @return the range of tim kiem ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TimKiemHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tim kiem ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TimKiemHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tim kiem ho sos
	* @param end the upper bound of the range of tim kiem ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tim kiem ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TimKiemHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tim kiem ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tim kiem ho sos.
	*
	* @return the number of tim kiem ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}