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

import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro;

/**
 * The persistence interface for the tthc phan nhom ho so vai tro service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcPhanNhomHoSoVaiTroPersistenceImpl
 * @see TthcPhanNhomHoSoVaiTroUtil
 * @generated
 */
public interface TthcPhanNhomHoSoVaiTroPersistence extends BasePersistence<TthcPhanNhomHoSoVaiTro> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcPhanNhomHoSoVaiTroUtil} to access the tthc phan nhom ho so vai tro persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the tthc phan nhom ho so vai tro where PhanNhomHoSoId = &#63; and VaiTroXuLy = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException} if it could not be found.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param VaiTroXuLy the vai tro xu ly
	* @return the matching tthc phan nhom ho so vai tro
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro findByPhanNhomHoSoIdAndVaiTroXuLy(
		long PhanNhomHoSoId, long VaiTroXuLy)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException;

	/**
	* Returns the tthc phan nhom ho so vai tro where PhanNhomHoSoId = &#63; and VaiTroXuLy = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param VaiTroXuLy the vai tro xu ly
	* @return the matching tthc phan nhom ho so vai tro, or <code>null</code> if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro fetchByPhanNhomHoSoIdAndVaiTroXuLy(
		long PhanNhomHoSoId, long VaiTroXuLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc phan nhom ho so vai tro where PhanNhomHoSoId = &#63; and VaiTroXuLy = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param VaiTroXuLy the vai tro xu ly
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc phan nhom ho so vai tro, or <code>null</code> if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro fetchByPhanNhomHoSoIdAndVaiTroXuLy(
		long PhanNhomHoSoId, long VaiTroXuLy, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc phan nhom ho so vai tro where PhanNhomHoSoId = &#63; and VaiTroXuLy = &#63; from the database.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param VaiTroXuLy the vai tro xu ly
	* @return the tthc phan nhom ho so vai tro that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro removeByPhanNhomHoSoIdAndVaiTroXuLy(
		long PhanNhomHoSoId, long VaiTroXuLy)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException;

	/**
	* Returns the number of tthc phan nhom ho so vai tros where PhanNhomHoSoId = &#63; and VaiTroXuLy = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param VaiTroXuLy the vai tro xu ly
	* @return the number of matching tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhanNhomHoSoIdAndVaiTroXuLy(long PhanNhomHoSoId,
		long VaiTroXuLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc phan nhom ho so vai tros where PhanNhomHoSoId = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @return the matching tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> findByPhanNhomHoSoId(
		long PhanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc phan nhom ho so vai tros where PhanNhomHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoVaiTroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param start the lower bound of the range of tthc phan nhom ho so vai tros
	* @param end the upper bound of the range of tthc phan nhom ho so vai tros (not inclusive)
	* @return the range of matching tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> findByPhanNhomHoSoId(
		long PhanNhomHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc phan nhom ho so vai tros where PhanNhomHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoVaiTroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param start the lower bound of the range of tthc phan nhom ho so vai tros
	* @param end the upper bound of the range of tthc phan nhom ho so vai tros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> findByPhanNhomHoSoId(
		long PhanNhomHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc phan nhom ho so vai tro in the ordered set where PhanNhomHoSoId = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc phan nhom ho so vai tro
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro findByPhanNhomHoSoId_First(
		long PhanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException;

	/**
	* Returns the first tthc phan nhom ho so vai tro in the ordered set where PhanNhomHoSoId = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc phan nhom ho so vai tro, or <code>null</code> if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro fetchByPhanNhomHoSoId_First(
		long PhanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc phan nhom ho so vai tro in the ordered set where PhanNhomHoSoId = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc phan nhom ho so vai tro
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro findByPhanNhomHoSoId_Last(
		long PhanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException;

	/**
	* Returns the last tthc phan nhom ho so vai tro in the ordered set where PhanNhomHoSoId = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc phan nhom ho so vai tro, or <code>null</code> if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro fetchByPhanNhomHoSoId_Last(
		long PhanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc phan nhom ho so vai tros before and after the current tthc phan nhom ho so vai tro in the ordered set where PhanNhomHoSoId = &#63;.
	*
	* @param Id the primary key of the current tthc phan nhom ho so vai tro
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc phan nhom ho so vai tro
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a tthc phan nhom ho so vai tro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro[] findByPhanNhomHoSoId_PrevAndNext(
		long Id, long PhanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException;

	/**
	* Removes all the tthc phan nhom ho so vai tros where PhanNhomHoSoId = &#63; from the database.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhanNhomHoSoId(long PhanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc phan nhom ho so vai tros where PhanNhomHoSoId = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @return the number of matching tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhanNhomHoSoId(long PhanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tthc phan nhom ho so vai tro in the entity cache if it is enabled.
	*
	* @param tthcPhanNhomHoSoVaiTro the tthc phan nhom ho so vai tro
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro);

	/**
	* Caches the tthc phan nhom ho so vai tros in the entity cache if it is enabled.
	*
	* @param tthcPhanNhomHoSoVaiTros the tthc phan nhom ho so vai tros
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> tthcPhanNhomHoSoVaiTros);

	/**
	* Creates a new tthc phan nhom ho so vai tro with the primary key. Does not add the tthc phan nhom ho so vai tro to the database.
	*
	* @param Id the primary key for the new tthc phan nhom ho so vai tro
	* @return the new tthc phan nhom ho so vai tro
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro create(long Id);

	/**
	* Removes the tthc phan nhom ho so vai tro with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tthc phan nhom ho so vai tro
	* @return the tthc phan nhom ho so vai tro that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a tthc phan nhom ho so vai tro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException;

	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc phan nhom ho so vai tro with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException} if it could not be found.
	*
	* @param Id the primary key of the tthc phan nhom ho so vai tro
	* @return the tthc phan nhom ho so vai tro
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a tthc phan nhom ho so vai tro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException;

	/**
	* Returns the tthc phan nhom ho so vai tro with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the tthc phan nhom ho so vai tro
	* @return the tthc phan nhom ho so vai tro, or <code>null</code> if a tthc phan nhom ho so vai tro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc phan nhom ho so vai tros.
	*
	* @return the tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc phan nhom ho so vai tros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoVaiTroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc phan nhom ho so vai tros
	* @param end the upper bound of the range of tthc phan nhom ho so vai tros (not inclusive)
	* @return the range of tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc phan nhom ho so vai tros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoVaiTroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc phan nhom ho so vai tros
	* @param end the upper bound of the range of tthc phan nhom ho so vai tros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tthc phan nhom ho so vai tros from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc phan nhom ho so vai tros.
	*
	* @return the number of tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}