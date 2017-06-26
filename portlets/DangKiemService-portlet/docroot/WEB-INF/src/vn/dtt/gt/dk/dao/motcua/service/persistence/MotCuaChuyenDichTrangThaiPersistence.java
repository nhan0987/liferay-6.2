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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai;

/**
 * The persistence interface for the mot cua chuyen dich trang thai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see MotCuaChuyenDichTrangThaiPersistenceImpl
 * @see MotCuaChuyenDichTrangThaiUtil
 * @generated
 */
public interface MotCuaChuyenDichTrangThaiPersistence extends BasePersistence<MotCuaChuyenDichTrangThai> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MotCuaChuyenDichTrangThaiUtil} to access the mot cua chuyen dich trang thai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @return the matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDich(
		java.lang.String dieuKienChuyenDich)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param start the lower bound of the range of mot cua chuyen dich trang thais
	* @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	* @return the range of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDich(
		java.lang.String dieuKienChuyenDich, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param start the lower bound of the range of mot cua chuyen dich trang thais
	* @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDich(
		java.lang.String dieuKienChuyenDich, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByDieuKienChuyenDich_First(
		java.lang.String dieuKienChuyenDich,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDich_First(
		java.lang.String dieuKienChuyenDich,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByDieuKienChuyenDich_Last(
		java.lang.String dieuKienChuyenDich,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDich_Last(
		java.lang.String dieuKienChuyenDich,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	*
	* @param id the primary key of the current mot cua chuyen dich trang thai
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai[] findByDieuKienChuyenDich_PrevAndNext(
		long id, java.lang.String dieuKienChuyenDich,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	/**
	* Removes all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; from the database.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDieuKienChuyenDich(java.lang.String dieuKienChuyenDich)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @return the number of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public int countByDieuKienChuyenDich(java.lang.String dieuKienChuyenDich)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @return the matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonId(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @param start the lower bound of the range of mot cua chuyen dich trang thais
	* @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	* @return the range of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonId(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @param start the lower bound of the range of mot cua chuyen dich trang thais
	* @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonId(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByDieuKienChuyenDichAndTrangThaiNguonId_First(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDichAndTrangThaiNguonId_First(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByDieuKienChuyenDichAndTrangThaiNguonId_Last(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDichAndTrangThaiNguonId_Last(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	*
	* @param id the primary key of the current mot cua chuyen dich trang thai
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai[] findByDieuKienChuyenDichAndTrangThaiNguonId_PrevAndNext(
		long id, java.lang.String dieuKienChuyenDich, long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	/**
	* Removes all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; from the database.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDieuKienChuyenDichAndTrangThaiNguonId(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @return the number of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public int countByDieuKienChuyenDichAndTrangThaiNguonId(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @return the matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiDichId(
		long trangThaiDichId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThaiDichId the trang thai dich ID
	* @param start the lower bound of the range of mot cua chuyen dich trang thais
	* @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	* @return the range of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiDichId(
		long trangThaiDichId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThaiDichId the trang thai dich ID
	* @param start the lower bound of the range of mot cua chuyen dich trang thais
	* @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiDichId(
		long trangThaiDichId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByTrangThaiDichId_First(
		long trangThaiDichId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByTrangThaiDichId_First(
		long trangThaiDichId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByTrangThaiDichId_Last(
		long trangThaiDichId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByTrangThaiDichId_Last(
		long trangThaiDichId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	*
	* @param id the primary key of the current mot cua chuyen dich trang thai
	* @param trangThaiDichId the trang thai dich ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai[] findByTrangThaiDichId_PrevAndNext(
		long id, long trangThaiDichId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	/**
	* Removes all the mot cua chuyen dich trang thais where trangThaiDichId = &#63; from the database.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTrangThaiDichId(long trangThaiDichId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @return the number of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public int countByTrangThaiDichId(long trangThaiDichId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @return the matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiNguonId(
		long trangThaiNguonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @param start the lower bound of the range of mot cua chuyen dich trang thais
	* @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	* @return the range of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiNguonId(
		long trangThaiNguonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @param start the lower bound of the range of mot cua chuyen dich trang thais
	* @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiNguonId(
		long trangThaiNguonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByTrangThaiNguonId_First(
		long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByTrangThaiNguonId_First(
		long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByTrangThaiNguonId_Last(
		long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByTrangThaiNguonId_Last(
		long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua chuyen dich trang thais before and after the current mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	*
	* @param id the primary key of the current mot cua chuyen dich trang thai
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai[] findByTrangThaiNguonId_PrevAndNext(
		long id, long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	/**
	* Removes all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63; from the database.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTrangThaiNguonId(long trangThaiNguonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @return the number of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public int countByTrangThaiNguonId(long trangThaiNguonId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the mot cua chuyen dich trang thai in the entity cache if it is enabled.
	*
	* @param motCuaChuyenDichTrangThai the mot cua chuyen dich trang thai
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai);

	/**
	* Caches the mot cua chuyen dich trang thais in the entity cache if it is enabled.
	*
	* @param motCuaChuyenDichTrangThais the mot cua chuyen dich trang thais
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> motCuaChuyenDichTrangThais);

	/**
	* Creates a new mot cua chuyen dich trang thai with the primary key. Does not add the mot cua chuyen dich trang thai to the database.
	*
	* @param id the primary key for the new mot cua chuyen dich trang thai
	* @return the new mot cua chuyen dich trang thai
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai create(
		long id);

	/**
	* Removes the mot cua chuyen dich trang thai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua chuyen dich trang thai
	* @return the mot cua chuyen dich trang thai that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua chuyen dich trang thai with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException} if it could not be found.
	*
	* @param id the primary key of the mot cua chuyen dich trang thai
	* @return the mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException;

	/**
	* Returns the mot cua chuyen dich trang thai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua chuyen dich trang thai
	* @return the mot cua chuyen dich trang thai, or <code>null</code> if a mot cua chuyen dich trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua chuyen dich trang thais.
	*
	* @return the mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua chuyen dich trang thais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua chuyen dich trang thais
	* @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	* @return the range of mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua chuyen dich trang thais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaChuyenDichTrangThaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua chuyen dich trang thais
	* @param end the upper bound of the range of mot cua chuyen dich trang thais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mot cua chuyen dich trang thais from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua chuyen dich trang thais.
	*
	* @return the number of mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}