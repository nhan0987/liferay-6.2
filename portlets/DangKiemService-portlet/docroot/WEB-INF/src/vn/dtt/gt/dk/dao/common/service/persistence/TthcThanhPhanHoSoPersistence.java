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

import vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo;

/**
 * The persistence interface for the tthc thanh phan ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see TthcThanhPhanHoSoPersistenceImpl
 * @see TthcThanhPhanHoSoUtil
 * @generated
 */
public interface TthcThanhPhanHoSoPersistence extends BasePersistence<TthcThanhPhanHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcThanhPhanHoSoUtil} to access the tthc thanh phan ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tthc thanh phan ho sos where ThuTucHanhChinhId = &#63;.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> findByThuTucHanhChinhId(
		long ThuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc thanh phan ho sos where ThuTucHanhChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param start the lower bound of the range of tthc thanh phan ho sos
	* @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	* @return the range of matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> findByThuTucHanhChinhId(
		long ThuTucHanhChinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc thanh phan ho sos where ThuTucHanhChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param start the lower bound of the range of tthc thanh phan ho sos
	* @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> findByThuTucHanhChinhId(
		long ThuTucHanhChinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc thanh phan ho so in the ordered set where ThuTucHanhChinhId = &#63;.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo findByThuTucHanhChinhId_First(
		long ThuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException;

	/**
	* Returns the first tthc thanh phan ho so in the ordered set where ThuTucHanhChinhId = &#63;.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo fetchByThuTucHanhChinhId_First(
		long ThuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc thanh phan ho so in the ordered set where ThuTucHanhChinhId = &#63;.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo findByThuTucHanhChinhId_Last(
		long ThuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException;

	/**
	* Returns the last tthc thanh phan ho so in the ordered set where ThuTucHanhChinhId = &#63;.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo fetchByThuTucHanhChinhId_Last(
		long ThuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc thanh phan ho sos before and after the current tthc thanh phan ho so in the ordered set where ThuTucHanhChinhId = &#63;.
	*
	* @param Id the primary key of the current tthc thanh phan ho so
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc thanh phan ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException if a tthc thanh phan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo[] findByThuTucHanhChinhId_PrevAndNext(
		long Id, long ThuTucHanhChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException;

	/**
	* Removes all the tthc thanh phan ho sos where ThuTucHanhChinhId = &#63; from the database.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByThuTucHanhChinhId(long ThuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc thanh phan ho sos where ThuTucHanhChinhId = &#63;.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @return the number of matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByThuTucHanhChinhId(long ThuTucHanhChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc thanh phan ho sos where ThuTucHanhChinhId = &#63; and MauTrucTuyen = &#63;.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param MauTrucTuyen the mau truc tuyen
	* @return the matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> findByThuTucHanhChinhIdAndMauTrucTuyen(
		long ThuTucHanhChinhId, java.lang.String MauTrucTuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc thanh phan ho sos where ThuTucHanhChinhId = &#63; and MauTrucTuyen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param MauTrucTuyen the mau truc tuyen
	* @param start the lower bound of the range of tthc thanh phan ho sos
	* @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	* @return the range of matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> findByThuTucHanhChinhIdAndMauTrucTuyen(
		long ThuTucHanhChinhId, java.lang.String MauTrucTuyen, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc thanh phan ho sos where ThuTucHanhChinhId = &#63; and MauTrucTuyen = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param MauTrucTuyen the mau truc tuyen
	* @param start the lower bound of the range of tthc thanh phan ho sos
	* @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> findByThuTucHanhChinhIdAndMauTrucTuyen(
		long ThuTucHanhChinhId, java.lang.String MauTrucTuyen, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc thanh phan ho so in the ordered set where ThuTucHanhChinhId = &#63; and MauTrucTuyen = &#63;.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param MauTrucTuyen the mau truc tuyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo findByThuTucHanhChinhIdAndMauTrucTuyen_First(
		long ThuTucHanhChinhId, java.lang.String MauTrucTuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException;

	/**
	* Returns the first tthc thanh phan ho so in the ordered set where ThuTucHanhChinhId = &#63; and MauTrucTuyen = &#63;.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param MauTrucTuyen the mau truc tuyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo fetchByThuTucHanhChinhIdAndMauTrucTuyen_First(
		long ThuTucHanhChinhId, java.lang.String MauTrucTuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc thanh phan ho so in the ordered set where ThuTucHanhChinhId = &#63; and MauTrucTuyen = &#63;.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param MauTrucTuyen the mau truc tuyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo findByThuTucHanhChinhIdAndMauTrucTuyen_Last(
		long ThuTucHanhChinhId, java.lang.String MauTrucTuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException;

	/**
	* Returns the last tthc thanh phan ho so in the ordered set where ThuTucHanhChinhId = &#63; and MauTrucTuyen = &#63;.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param MauTrucTuyen the mau truc tuyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo fetchByThuTucHanhChinhIdAndMauTrucTuyen_Last(
		long ThuTucHanhChinhId, java.lang.String MauTrucTuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc thanh phan ho sos before and after the current tthc thanh phan ho so in the ordered set where ThuTucHanhChinhId = &#63; and MauTrucTuyen = &#63;.
	*
	* @param Id the primary key of the current tthc thanh phan ho so
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param MauTrucTuyen the mau truc tuyen
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc thanh phan ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException if a tthc thanh phan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo[] findByThuTucHanhChinhIdAndMauTrucTuyen_PrevAndNext(
		long Id, long ThuTucHanhChinhId, java.lang.String MauTrucTuyen,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException;

	/**
	* Removes all the tthc thanh phan ho sos where ThuTucHanhChinhId = &#63; and MauTrucTuyen = &#63; from the database.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param MauTrucTuyen the mau truc tuyen
	* @throws SystemException if a system exception occurred
	*/
	public void removeByThuTucHanhChinhIdAndMauTrucTuyen(
		long ThuTucHanhChinhId, java.lang.String MauTrucTuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc thanh phan ho sos where ThuTucHanhChinhId = &#63; and MauTrucTuyen = &#63;.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param MauTrucTuyen the mau truc tuyen
	* @return the number of matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByThuTucHanhChinhIdAndMauTrucTuyen(long ThuTucHanhChinhId,
		java.lang.String MauTrucTuyen)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc thanh phan ho so where ThuTucHanhChinhId = &#63; and BieuMauHoSoId = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException} if it could not be found.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @return the matching tthc thanh phan ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo findByThuTucHanhChinhIdAndBieuMauHoSoId(
		long ThuTucHanhChinhId, long BieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException;

	/**
	* Returns the tthc thanh phan ho so where ThuTucHanhChinhId = &#63; and BieuMauHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo fetchByThuTucHanhChinhIdAndBieuMauHoSoId(
		long ThuTucHanhChinhId, long BieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc thanh phan ho so where ThuTucHanhChinhId = &#63; and BieuMauHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc thanh phan ho so, or <code>null</code> if a matching tthc thanh phan ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo fetchByThuTucHanhChinhIdAndBieuMauHoSoId(
		long ThuTucHanhChinhId, long BieuMauHoSoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc thanh phan ho so where ThuTucHanhChinhId = &#63; and BieuMauHoSoId = &#63; from the database.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @return the tthc thanh phan ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo removeByThuTucHanhChinhIdAndBieuMauHoSoId(
		long ThuTucHanhChinhId, long BieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException;

	/**
	* Returns the number of tthc thanh phan ho sos where ThuTucHanhChinhId = &#63; and BieuMauHoSoId = &#63;.
	*
	* @param ThuTucHanhChinhId the thu tuc hanh chinh ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @return the number of matching tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByThuTucHanhChinhIdAndBieuMauHoSoId(
		long ThuTucHanhChinhId, long BieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tthc thanh phan ho so in the entity cache if it is enabled.
	*
	* @param tthcThanhPhanHoSo the tthc thanh phan ho so
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo tthcThanhPhanHoSo);

	/**
	* Caches the tthc thanh phan ho sos in the entity cache if it is enabled.
	*
	* @param tthcThanhPhanHoSos the tthc thanh phan ho sos
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> tthcThanhPhanHoSos);

	/**
	* Creates a new tthc thanh phan ho so with the primary key. Does not add the tthc thanh phan ho so to the database.
	*
	* @param Id the primary key for the new tthc thanh phan ho so
	* @return the new tthc thanh phan ho so
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo create(long Id);

	/**
	* Removes the tthc thanh phan ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tthc thanh phan ho so
	* @return the tthc thanh phan ho so that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException if a tthc thanh phan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException;

	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo tthcThanhPhanHoSo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc thanh phan ho so with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException} if it could not be found.
	*
	* @param Id the primary key of the tthc thanh phan ho so
	* @return the tthc thanh phan ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException if a tthc thanh phan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThanhPhanHoSoException;

	/**
	* Returns the tthc thanh phan ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the tthc thanh phan ho so
	* @return the tthc thanh phan ho so, or <code>null</code> if a tthc thanh phan ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc thanh phan ho sos.
	*
	* @return the tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc thanh phan ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc thanh phan ho sos
	* @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	* @return the range of tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc thanh phan ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThanhPhanHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc thanh phan ho sos
	* @param end the upper bound of the range of tthc thanh phan ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThanhPhanHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tthc thanh phan ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc thanh phan ho sos.
	*
	* @return the number of tthc thanh phan ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}