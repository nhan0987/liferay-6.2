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

import vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien;

/**
 * The persistence interface for the tthc don vi thuc hien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcDonViThucHienPersistenceImpl
 * @see TthcDonViThucHienUtil
 * @generated
 */
public interface TthcDonViThucHienPersistence extends BasePersistence<TthcDonViThucHien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcDonViThucHienUtil} to access the tthc don vi thuc hien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tthc don vi thuc hien in the entity cache if it is enabled.
	*
	* @param tthcDonViThucHien the tthc don vi thuc hien
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien tthcDonViThucHien);

	/**
	* Caches the tthc don vi thuc hiens in the entity cache if it is enabled.
	*
	* @param tthcDonViThucHiens the tthc don vi thuc hiens
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien> tthcDonViThucHiens);

	/**
	* Creates a new tthc don vi thuc hien with the primary key. Does not add the tthc don vi thuc hien to the database.
	*
	* @param Id the primary key for the new tthc don vi thuc hien
	* @return the new tthc don vi thuc hien
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien create(long Id);

	/**
	* Removes the tthc don vi thuc hien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tthc don vi thuc hien
	* @return the tthc don vi thuc hien that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcDonViThucHienException;

	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien tthcDonViThucHien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc don vi thuc hien with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcDonViThucHienException} if it could not be found.
	*
	* @param Id the primary key of the tthc don vi thuc hien
	* @return the tthc don vi thuc hien
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcDonViThucHienException if a tthc don vi thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcDonViThucHienException;

	/**
	* Returns the tthc don vi thuc hien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the tthc don vi thuc hien
	* @return the tthc don vi thuc hien, or <code>null</code> if a tthc don vi thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc don vi thuc hiens.
	*
	* @return the tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc don vi thuc hiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc don vi thuc hiens
	* @param end the upper bound of the range of tthc don vi thuc hiens (not inclusive)
	* @return the range of tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc don vi thuc hiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc don vi thuc hiens
	* @param end the upper bound of the range of tthc don vi thuc hiens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tthc don vi thuc hiens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc don vi thuc hiens.
	*
	* @return the number of tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}