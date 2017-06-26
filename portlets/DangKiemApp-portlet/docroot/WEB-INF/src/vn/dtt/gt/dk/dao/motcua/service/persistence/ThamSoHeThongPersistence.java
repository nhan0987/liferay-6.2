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

import vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong;

/**
 * The persistence interface for the tham so he thong service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ThamSoHeThongPersistenceImpl
 * @see ThamSoHeThongUtil
 * @generated
 */
public interface ThamSoHeThongPersistence extends BasePersistence<ThamSoHeThong> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ThamSoHeThongUtil} to access the tham so he thong persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the tham so he thong where keyData = &#63; or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException} if it could not be found.
	*
	* @param keyData the key data
	* @return the matching tham so he thong
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException if a matching tham so he thong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong findByKeyData(
		java.lang.String keyData)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException;

	/**
	* Returns the tham so he thong where keyData = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param keyData the key data
	* @return the matching tham so he thong, or <code>null</code> if a matching tham so he thong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong fetchByKeyData(
		java.lang.String keyData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tham so he thong where keyData = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param keyData the key data
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tham so he thong, or <code>null</code> if a matching tham so he thong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong fetchByKeyData(
		java.lang.String keyData, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tham so he thong where keyData = &#63; from the database.
	*
	* @param keyData the key data
	* @return the tham so he thong that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong removeByKeyData(
		java.lang.String keyData)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException;

	/**
	* Returns the number of tham so he thongs where keyData = &#63;.
	*
	* @param keyData the key data
	* @return the number of matching tham so he thongs
	* @throws SystemException if a system exception occurred
	*/
	public int countByKeyData(java.lang.String keyData)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tham so he thong in the entity cache if it is enabled.
	*
	* @param thamSoHeThong the tham so he thong
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong thamSoHeThong);

	/**
	* Caches the tham so he thongs in the entity cache if it is enabled.
	*
	* @param thamSoHeThongs the tham so he thongs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong> thamSoHeThongs);

	/**
	* Creates a new tham so he thong with the primary key. Does not add the tham so he thong to the database.
	*
	* @param id the primary key for the new tham so he thong
	* @return the new tham so he thong
	*/
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong create(long id);

	/**
	* Removes the tham so he thong with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tham so he thong
	* @return the tham so he thong that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException if a tham so he thong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException;

	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong thamSoHeThong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tham so he thong with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException} if it could not be found.
	*
	* @param id the primary key of the tham so he thong
	* @return the tham so he thong
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException if a tham so he thong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchThamSoHeThongException;

	/**
	* Returns the tham so he thong with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tham so he thong
	* @return the tham so he thong, or <code>null</code> if a tham so he thong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tham so he thongs.
	*
	* @return the tham so he thongs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tham so he thongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.ThamSoHeThongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tham so he thongs
	* @param end the upper bound of the range of tham so he thongs (not inclusive)
	* @return the range of tham so he thongs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tham so he thongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.ThamSoHeThongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tham so he thongs
	* @param end the upper bound of the range of tham so he thongs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tham so he thongs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tham so he thongs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tham so he thongs.
	*
	* @return the number of tham so he thongs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}