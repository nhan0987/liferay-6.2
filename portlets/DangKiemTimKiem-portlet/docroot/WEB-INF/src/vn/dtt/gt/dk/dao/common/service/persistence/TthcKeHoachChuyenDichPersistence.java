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

import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich;

/**
 * The persistence interface for the tthc ke hoach chuyen dich service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcKeHoachChuyenDichPersistenceImpl
 * @see TthcKeHoachChuyenDichUtil
 * @generated
 */
public interface TthcKeHoachChuyenDichPersistence extends BasePersistence<TthcKeHoachChuyenDich> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TthcKeHoachChuyenDichUtil} to access the tthc ke hoach chuyen dich persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @return the matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @return the range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException;

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException;

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc ke hoach chuyen dichs before and after the current tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param id the primary key of the current tthc ke hoach chuyen dich
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich[] findByPhieuXuLyChinhId_PrevAndNext(
		long id, long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException;

	/**
	* Removes all the tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63; from the database.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @return the number of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @return the range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException;

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException;

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc ke hoach chuyen dichs before and after the current tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param id the primary key of the current tthc ke hoach chuyen dich
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich[] findByPhieuXuLyPhuId_PrevAndNext(
		long id, long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException;

	/**
	* Removes all the tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63; from the database.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the number of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc ke hoach chuyen dich where messageId = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException} if it could not be found.
	*
	* @param messageId the message ID
	* @return the matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByMessageId(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException;

	/**
	* Returns the tthc ke hoach chuyen dich where messageId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param messageId the message ID
	* @return the matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByMessageId(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc ke hoach chuyen dich where messageId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param messageId the message ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByMessageId(
		java.lang.String messageId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tthc ke hoach chuyen dich where messageId = &#63; from the database.
	*
	* @param messageId the message ID
	* @return the tthc ke hoach chuyen dich that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich removeByMessageId(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException;

	/**
	* Returns the number of tthc ke hoach chuyen dichs where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the number of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public int countByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tthc ke hoach chuyen dich in the entity cache if it is enabled.
	*
	* @param tthcKeHoachChuyenDich the tthc ke hoach chuyen dich
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich tthcKeHoachChuyenDich);

	/**
	* Caches the tthc ke hoach chuyen dichs in the entity cache if it is enabled.
	*
	* @param tthcKeHoachChuyenDichs the tthc ke hoach chuyen dichs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> tthcKeHoachChuyenDichs);

	/**
	* Creates a new tthc ke hoach chuyen dich with the primary key. Does not add the tthc ke hoach chuyen dich to the database.
	*
	* @param id the primary key for the new tthc ke hoach chuyen dich
	* @return the new tthc ke hoach chuyen dich
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich create(long id);

	/**
	* Removes the tthc ke hoach chuyen dich with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc ke hoach chuyen dich
	* @return the tthc ke hoach chuyen dich that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException;

	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich tthcKeHoachChuyenDich)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tthc ke hoach chuyen dich with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException} if it could not be found.
	*
	* @param id the primary key of the tthc ke hoach chuyen dich
	* @return the tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException;

	/**
	* Returns the tthc ke hoach chuyen dich with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc ke hoach chuyen dich
	* @return the tthc ke hoach chuyen dich, or <code>null</code> if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tthc ke hoach chuyen dichs.
	*
	* @return the tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tthc ke hoach chuyen dichs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @return the range of tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tthc ke hoach chuyen dichs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tthc ke hoach chuyen dichs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tthc ke hoach chuyen dichs.
	*
	* @return the number of tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}