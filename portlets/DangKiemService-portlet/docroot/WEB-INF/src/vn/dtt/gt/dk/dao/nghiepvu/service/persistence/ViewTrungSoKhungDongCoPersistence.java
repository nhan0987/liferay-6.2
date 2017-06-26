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

package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo;

/**
 * The persistence interface for the view trung so khung dong co service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see ViewTrungSoKhungDongCoPersistenceImpl
 * @see ViewTrungSoKhungDongCoUtil
 * @generated
 */
public interface ViewTrungSoKhungDongCoPersistence extends BasePersistence<ViewTrungSoKhungDongCo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ViewTrungSoKhungDongCoUtil} to access the view trung so khung dong co persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the view trung so khung dong co in the entity cache if it is enabled.
	*
	* @param viewTrungSoKhungDongCo the view trung so khung dong co
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo viewTrungSoKhungDongCo);

	/**
	* Caches the view trung so khung dong cos in the entity cache if it is enabled.
	*
	* @param viewTrungSoKhungDongCos the view trung so khung dong cos
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo> viewTrungSoKhungDongCos);

	/**
	* Creates a new view trung so khung dong co with the primary key. Does not add the view trung so khung dong co to the database.
	*
	* @param id the primary key for the new view trung so khung dong co
	* @return the new view trung so khung dong co
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo create(
		long id);

	/**
	* Removes the view trung so khung dong co with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the view trung so khung dong co
	* @return the view trung so khung dong co that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewTrungSoKhungDongCoException if a view trung so khung dong co with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewTrungSoKhungDongCoException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo viewTrungSoKhungDongCo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the view trung so khung dong co with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewTrungSoKhungDongCoException} if it could not be found.
	*
	* @param id the primary key of the view trung so khung dong co
	* @return the view trung so khung dong co
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewTrungSoKhungDongCoException if a view trung so khung dong co with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchViewTrungSoKhungDongCoException;

	/**
	* Returns the view trung so khung dong co with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the view trung so khung dong co
	* @return the view trung so khung dong co, or <code>null</code> if a view trung so khung dong co with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the view trung so khung dong cos.
	*
	* @return the view trung so khung dong cos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the view trung so khung dong cos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewTrungSoKhungDongCoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of view trung so khung dong cos
	* @param end the upper bound of the range of view trung so khung dong cos (not inclusive)
	* @return the range of view trung so khung dong cos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the view trung so khung dong cos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewTrungSoKhungDongCoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of view trung so khung dong cos
	* @param end the upper bound of the range of view trung so khung dong cos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of view trung so khung dong cos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the view trung so khung dong cos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of view trung so khung dong cos.
	*
	* @return the number of view trung so khung dong cos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}