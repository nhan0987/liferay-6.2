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

import vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra;

/**
 * The persistence interface for the phan cong don vi kiem tra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see PhanCongDonViKiemTraPersistenceImpl
 * @see PhanCongDonViKiemTraUtil
 * @generated
 */
public interface PhanCongDonViKiemTraPersistence extends BasePersistence<PhanCongDonViKiemTra> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PhanCongDonViKiemTraUtil} to access the phan cong don vi kiem tra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the phan cong don vi kiem tra in the entity cache if it is enabled.
	*
	* @param phanCongDonViKiemTra the phan cong don vi kiem tra
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra phanCongDonViKiemTra);

	/**
	* Caches the phan cong don vi kiem tras in the entity cache if it is enabled.
	*
	* @param phanCongDonViKiemTras the phan cong don vi kiem tras
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> phanCongDonViKiemTras);

	/**
	* Creates a new phan cong don vi kiem tra with the primary key. Does not add the phan cong don vi kiem tra to the database.
	*
	* @param id the primary key for the new phan cong don vi kiem tra
	* @return the new phan cong don vi kiem tra
	*/
	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra create(long id);

	/**
	* Removes the phan cong don vi kiem tra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phan cong don vi kiem tra
	* @return the phan cong don vi kiem tra that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhanCongDonViKiemTraException if a phan cong don vi kiem tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchPhanCongDonViKiemTraException;

	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra phanCongDonViKiemTra)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the phan cong don vi kiem tra with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchPhanCongDonViKiemTraException} if it could not be found.
	*
	* @param id the primary key of the phan cong don vi kiem tra
	* @return the phan cong don vi kiem tra
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchPhanCongDonViKiemTraException if a phan cong don vi kiem tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchPhanCongDonViKiemTraException;

	/**
	* Returns the phan cong don vi kiem tra with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the phan cong don vi kiem tra
	* @return the phan cong don vi kiem tra, or <code>null</code> if a phan cong don vi kiem tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the phan cong don vi kiem tras.
	*
	* @return the phan cong don vi kiem tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the phan cong don vi kiem tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhanCongDonViKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phan cong don vi kiem tras
	* @param end the upper bound of the range of phan cong don vi kiem tras (not inclusive)
	* @return the range of phan cong don vi kiem tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the phan cong don vi kiem tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhanCongDonViKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phan cong don vi kiem tras
	* @param end the upper bound of the range of phan cong don vi kiem tras (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of phan cong don vi kiem tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the phan cong don vi kiem tras from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of phan cong don vi kiem tras.
	*
	* @return the number of phan cong don vi kiem tras
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}