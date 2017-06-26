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

import vn.dtt.gt.dk.dao.motcua.model.DaKiemTra;

/**
 * The persistence interface for the da kiem tra service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DaKiemTraPersistenceImpl
 * @see DaKiemTraUtil
 * @generated
 */
public interface DaKiemTraPersistence extends BasePersistence<DaKiemTra> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DaKiemTraUtil} to access the da kiem tra persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the da kiem tra in the entity cache if it is enabled.
	*
	* @param daKiemTra the da kiem tra
	*/
	public void cacheResult(vn.dtt.gt.dk.dao.motcua.model.DaKiemTra daKiemTra);

	/**
	* Caches the da kiem tras in the entity cache if it is enabled.
	*
	* @param daKiemTras the da kiem tras
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.DaKiemTra> daKiemTras);

	/**
	* Creates a new da kiem tra with the primary key. Does not add the da kiem tra to the database.
	*
	* @param id the primary key for the new da kiem tra
	* @return the new da kiem tra
	*/
	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra create(long id);

	/**
	* Removes the da kiem tra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the da kiem tra
	* @return the da kiem tra that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchDaKiemTraException if a da kiem tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchDaKiemTraException;

	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.DaKiemTra daKiemTra)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the da kiem tra with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchDaKiemTraException} if it could not be found.
	*
	* @param id the primary key of the da kiem tra
	* @return the da kiem tra
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchDaKiemTraException if a da kiem tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchDaKiemTraException;

	/**
	* Returns the da kiem tra with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the da kiem tra
	* @return the da kiem tra, or <code>null</code> if a da kiem tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the da kiem tras.
	*
	* @return the da kiem tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.DaKiemTra> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the da kiem tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of da kiem tras
	* @param end the upper bound of the range of da kiem tras (not inclusive)
	* @return the range of da kiem tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.DaKiemTra> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the da kiem tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of da kiem tras
	* @param end the upper bound of the range of da kiem tras (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of da kiem tras
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.DaKiemTra> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the da kiem tras from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of da kiem tras.
	*
	* @return the number of da kiem tras
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}