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

import vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc;

/**
 * The persistence interface for the tthc ho so thu tuc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcHoSoThuTucPersistenceImpl
 * @see TthcHoSoThuTucUtil
 * @generated
 */
public interface TthcHoSoThuTucPersistence extends BasePersistence<TthcHoSoThuTuc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcHoSoThuTucUtil} to access the tthc ho so thu tuc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the tthc ho so thu tuc where MaSoHoSo = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException} if it could not be found.
	*
	* @param MaSoHoSo the ma so ho so
	* @return the matching tthc ho so thu tuc
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc findByMaSoHoSo(
		java.lang.String MaSoHoSo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException;

	/**
	* Returns the tthc ho so thu tuc where MaSoHoSo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param MaSoHoSo the ma so ho so
	* @return the matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc fetchByMaSoHoSo(
		java.lang.String MaSoHoSo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc ho so thu tuc where MaSoHoSo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param MaSoHoSo the ma so ho so
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc ho so thu tuc, or <code>null</code> if a matching tthc ho so thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc fetchByMaSoHoSo(
		java.lang.String MaSoHoSo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc ho so thu tuc where MaSoHoSo = &#63; from the database.
	*
	* @param MaSoHoSo the ma so ho so
	* @return the tthc ho so thu tuc that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc removeByMaSoHoSo(
		java.lang.String MaSoHoSo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException;

	/**
	* Returns the number of tthc ho so thu tucs where MaSoHoSo = &#63;.
	*
	* @param MaSoHoSo the ma so ho so
	* @return the number of matching tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public int countByMaSoHoSo(java.lang.String MaSoHoSo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tthc ho so thu tuc in the entity cache if it is enabled.
	*
	* @param tthcHoSoThuTuc the tthc ho so thu tuc
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc);

	/**
	* Caches the tthc ho so thu tucs in the entity cache if it is enabled.
	*
	* @param tthcHoSoThuTucs the tthc ho so thu tucs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> tthcHoSoThuTucs);

	/**
	* Creates a new tthc ho so thu tuc with the primary key. Does not add the tthc ho so thu tuc to the database.
	*
	* @param Id the primary key for the new tthc ho so thu tuc
	* @return the new tthc ho so thu tuc
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc create(long Id);

	/**
	* Removes the tthc ho so thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tthc ho so thu tuc
	* @return the tthc ho so thu tuc that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException;

	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc tthcHoSoThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc ho so thu tuc with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException} if it could not be found.
	*
	* @param Id the primary key of the tthc ho so thu tuc
	* @return the tthc ho so thu tuc
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException if a tthc ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcHoSoThuTucException;

	/**
	* Returns the tthc ho so thu tuc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the tthc ho so thu tuc
	* @return the tthc ho so thu tuc, or <code>null</code> if a tthc ho so thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc ho so thu tucs.
	*
	* @return the tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc ho so thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc ho so thu tucs
	* @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	* @return the range of tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc ho so thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcHoSoThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc ho so thu tucs
	* @param end the upper bound of the range of tthc ho so thu tucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcHoSoThuTuc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tthc ho so thu tucs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc ho so thu tucs.
	*
	* @return the number of tthc ho so thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}