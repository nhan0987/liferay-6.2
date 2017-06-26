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

import vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong;

/**
 * The persistence interface for the lich kiem tra hien truong service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see LichKiemTraHienTruongPersistenceImpl
 * @see LichKiemTraHienTruongUtil
 * @generated
 */
public interface LichKiemTraHienTruongPersistence extends BasePersistence<LichKiemTraHienTruong> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LichKiemTraHienTruongUtil} to access the lich kiem tra hien truong persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the lich kiem tra hien truong in the entity cache if it is enabled.
	*
	* @param lichKiemTraHienTruong the lich kiem tra hien truong
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong lichKiemTraHienTruong);

	/**
	* Caches the lich kiem tra hien truongs in the entity cache if it is enabled.
	*
	* @param lichKiemTraHienTruongs the lich kiem tra hien truongs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong> lichKiemTraHienTruongs);

	/**
	* Creates a new lich kiem tra hien truong with the primary key. Does not add the lich kiem tra hien truong to the database.
	*
	* @param id the primary key for the new lich kiem tra hien truong
	* @return the new lich kiem tra hien truong
	*/
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong create(long id);

	/**
	* Removes the lich kiem tra hien truong with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the lich kiem tra hien truong
	* @return the lich kiem tra hien truong that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchLichKiemTraHienTruongException if a lich kiem tra hien truong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchLichKiemTraHienTruongException;

	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong lichKiemTraHienTruong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the lich kiem tra hien truong with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchLichKiemTraHienTruongException} if it could not be found.
	*
	* @param id the primary key of the lich kiem tra hien truong
	* @return the lich kiem tra hien truong
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchLichKiemTraHienTruongException if a lich kiem tra hien truong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchLichKiemTraHienTruongException;

	/**
	* Returns the lich kiem tra hien truong with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the lich kiem tra hien truong
	* @return the lich kiem tra hien truong, or <code>null</code> if a lich kiem tra hien truong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the lich kiem tra hien truongs.
	*
	* @return the lich kiem tra hien truongs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the lich kiem tra hien truongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.LichKiemTraHienTruongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lich kiem tra hien truongs
	* @param end the upper bound of the range of lich kiem tra hien truongs (not inclusive)
	* @return the range of lich kiem tra hien truongs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the lich kiem tra hien truongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.LichKiemTraHienTruongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lich kiem tra hien truongs
	* @param end the upper bound of the range of lich kiem tra hien truongs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lich kiem tra hien truongs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the lich kiem tra hien truongs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of lich kiem tra hien truongs.
	*
	* @return the number of lich kiem tra hien truongs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}