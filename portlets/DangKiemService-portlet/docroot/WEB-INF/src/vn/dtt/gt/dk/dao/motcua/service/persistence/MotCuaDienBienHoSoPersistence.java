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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo;

/**
 * The persistence interface for the mot cua dien bien ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see MotCuaDienBienHoSoPersistenceImpl
 * @see MotCuaDienBienHoSoUtil
 * @generated
 */
public interface MotCuaDienBienHoSoPersistence extends BasePersistence<MotCuaDienBienHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MotCuaDienBienHoSoUtil} to access the mot cua dien bien ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the mot cua dien bien ho sos where trangThaiTruocId = &#63;.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @return the matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiTruocId(
		long trangThaiTruocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos where trangThaiTruocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiTruocId(
		long trangThaiTruocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos where trangThaiTruocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiTruocId(
		long trangThaiTruocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByTrangThaiTruocId_First(
		long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByTrangThaiTruocId_First(
		long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByTrangThaiTruocId_Last(
		long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByTrangThaiTruocId_Last(
		long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where trangThaiTruocId = &#63;.
	*
	* @param id the primary key of the current mot cua dien bien ho so
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo[] findByTrangThaiTruocId_PrevAndNext(
		long id, long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Removes all the mot cua dien bien ho sos where trangThaiTruocId = &#63; from the database.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTrangThaiTruocId(long trangThaiTruocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos where trangThaiTruocId = &#63;.
	*
	* @param trangThaiTruocId the trang thai truoc ID
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByTrangThaiTruocId(long trangThaiTruocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua dien bien ho sos where trangThaiSauId = &#63;.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @return the matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiSauId(
		long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos where trangThaiSauId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThaiSauId the trang thai sau ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiSauId(
		long trangThaiSauId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos where trangThaiSauId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThaiSauId the trang thai sau ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiSauId(
		long trangThaiSauId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByTrangThaiSauId_First(
		long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByTrangThaiSauId_First(
		long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByTrangThaiSauId_Last(
		long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByTrangThaiSauId_Last(
		long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where trangThaiSauId = &#63;.
	*
	* @param id the primary key of the current mot cua dien bien ho so
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo[] findByTrangThaiSauId_PrevAndNext(
		long id, long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Removes all the mot cua dien bien ho sos where trangThaiSauId = &#63; from the database.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTrangThaiSauId(long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos where trangThaiSauId = &#63;.
	*
	* @param trangThaiSauId the trang thai sau ID
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByTrangThaiSauId(long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @return the matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param id the primary key of the current mot cua dien bien ho so
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo[] findByPhieuXuLyChinhId_PrevAndNext(
		long id, long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Removes all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63; from the database.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @return the matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdTrangThaiTruocId(
		long phieuXuLyChinhId, long trangThaiTruocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiTruocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdTrangThaiTruocId(
		long phieuXuLyChinhId, long trangThaiTruocId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiTruocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdTrangThaiTruocId(
		long phieuXuLyChinhId, long trangThaiTruocId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyChinhIdTrangThaiTruocId_First(
		long phieuXuLyChinhId, long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyChinhIdTrangThaiTruocId_First(
		long phieuXuLyChinhId, long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyChinhIdTrangThaiTruocId_Last(
		long phieuXuLyChinhId, long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyChinhIdTrangThaiTruocId_Last(
		long phieuXuLyChinhId, long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param id the primary key of the current mot cua dien bien ho so
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo[] findByPhieuXuLyChinhIdTrangThaiTruocId_PrevAndNext(
		long id, long phieuXuLyChinhId, long trangThaiTruocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Removes all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiTruocId = &#63; from the database.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhieuXuLyChinhIdTrangThaiTruocId(
		long phieuXuLyChinhId, long trangThaiTruocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiTruocId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiTruocId the trang thai truoc ID
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyChinhIdTrangThaiTruocId(long phieuXuLyChinhId,
		long trangThaiTruocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @return the matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdTrangThaiSauId(
		long phieuXuLyChinhId, long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdTrangThaiSauId(
		long phieuXuLyChinhId, long trangThaiSauId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdTrangThaiSauId(
		long phieuXuLyChinhId, long trangThaiSauId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyChinhIdTrangThaiSauId_First(
		long phieuXuLyChinhId, long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyChinhIdTrangThaiSauId_First(
		long phieuXuLyChinhId, long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyChinhIdTrangThaiSauId_Last(
		long phieuXuLyChinhId, long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyChinhIdTrangThaiSauId_Last(
		long phieuXuLyChinhId, long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63;.
	*
	* @param id the primary key of the current mot cua dien bien ho so
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo[] findByPhieuXuLyChinhIdTrangThaiSauId_PrevAndNext(
		long id, long phieuXuLyChinhId, long trangThaiSauId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Removes all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; from the database.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhieuXuLyChinhIdTrangThaiSauId(long phieuXuLyChinhId,
		long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyChinhIdTrangThaiSauId(long phieuXuLyChinhId,
		long trangThaiSauId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId_First(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId_First(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId_Last(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId_Last(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63;.
	*
	* @param id the primary key of the current mot cua dien bien ho so
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo[] findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId_PrevAndNext(
		long id, long phieuXuLyChinhId, long trangThaiSauId,
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Removes all the mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63; from the database.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho so where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63; and nguoiXuLy = &#63; or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException} if it could not be found.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param nguoiXuLy the nguoi xu ly
	* @return the matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		long nguoiXuLy)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the mot cua dien bien ho so where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63; and nguoiXuLy = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param nguoiXuLy the nguoi xu ly
	* @return the matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		long nguoiXuLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho so where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63; and nguoiXuLy = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param nguoiXuLy the nguoi xu ly
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		long nguoiXuLy, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the mot cua dien bien ho so where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63; and nguoiXuLy = &#63; from the database.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param nguoiXuLy the nguoi xu ly
	* @return the mot cua dien bien ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo removeByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		long nguoiXuLy)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the number of mot cua dien bien ho sos where phieuXuLyChinhId = &#63; and trangThaiSauId = &#63; and phieuXuLyPhuId = &#63; and nguoiXuLy = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiSauId the trang thai sau ID
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param nguoiXuLy the nguoi xu ly
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		long nguoiXuLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua dien bien ho sos where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the first mot cua dien bien ho so in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the last mot cua dien bien ho so in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dien bien ho so, or <code>null</code> if a matching mot cua dien bien ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho sos before and after the current mot cua dien bien ho so in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param id the primary key of the current mot cua dien bien ho so
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo[] findByPhieuXuLyPhuId_PrevAndNext(
		long id, long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Removes all the mot cua dien bien ho sos where phieuXuLyPhuId = &#63; from the database.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the number of matching mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the mot cua dien bien ho so in the entity cache if it is enabled.
	*
	* @param motCuaDienBienHoSo the mot cua dien bien ho so
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo motCuaDienBienHoSo);

	/**
	* Caches the mot cua dien bien ho sos in the entity cache if it is enabled.
	*
	* @param motCuaDienBienHoSos the mot cua dien bien ho sos
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> motCuaDienBienHoSos);

	/**
	* Creates a new mot cua dien bien ho so with the primary key. Does not add the mot cua dien bien ho so to the database.
	*
	* @param id the primary key for the new mot cua dien bien ho so
	* @return the new mot cua dien bien ho so
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo create(long id);

	/**
	* Removes the mot cua dien bien ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua dien bien ho so
	* @return the mot cua dien bien ho so that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo motCuaDienBienHoSo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua dien bien ho so with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException} if it could not be found.
	*
	* @param id the primary key of the mot cua dien bien ho so
	* @return the mot cua dien bien ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDienBienHoSoException;

	/**
	* Returns the mot cua dien bien ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua dien bien ho so
	* @return the mot cua dien bien ho so, or <code>null</code> if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua dien bien ho sos.
	*
	* @return the mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua dien bien ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua dien bien ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mot cua dien bien ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua dien bien ho sos.
	*
	* @return the number of mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}