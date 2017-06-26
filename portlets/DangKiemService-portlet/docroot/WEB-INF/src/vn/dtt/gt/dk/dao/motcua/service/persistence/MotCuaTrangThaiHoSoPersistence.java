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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo;

/**
 * The persistence interface for the mot cua trang thai ho so service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see MotCuaTrangThaiHoSoPersistenceImpl
 * @see MotCuaTrangThaiHoSoUtil
 * @generated
 */
public interface MotCuaTrangThaiHoSoPersistence extends BasePersistence<MotCuaTrangThaiHoSo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MotCuaTrangThaiHoSoUtil} to access the mot cua trang thai ho so persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucId(
		long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param start the lower bound of the range of mot cua trang thai ho sos
	* @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	* @return the range of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucId(
		long quyTrinhThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param start the lower bound of the range of mot cua trang thai ho sos
	* @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucId(
		long quyTrinhThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucId_First(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	/**
	* Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucId_First(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucId_Last(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	/**
	* Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucId_Last(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua trang thai ho sos before and after the current mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param id the primary key of the current mot cua trang thai ho so
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo[] findByQuyTrinhThuTucId_PrevAndNext(
		long id, long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	/**
	* Removes all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; from the database.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByQuyTrinhThuTucId(long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua trang thai ho sos where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the number of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByQuyTrinhThuTucId(long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @return the matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy1(
		long quyTrinhThuTucId, long vaiTroXuLy1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @param start the lower bound of the range of mot cua trang thai ho sos
	* @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	* @return the range of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy1(
		long quyTrinhThuTucId, long vaiTroXuLy1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @param start the lower bound of the range of mot cua trang thai ho sos
	* @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy1(
		long quyTrinhThuTucId, long vaiTroXuLy1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy1_First(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	/**
	* Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_First(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy1_Last(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	/**
	* Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_Last(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua trang thai ho sos before and after the current mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	*
	* @param id the primary key of the current mot cua trang thai ho so
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo[] findByQuyTrinhThuTucIdAndVaiTroXuLy1_PrevAndNext(
		long id, long quyTrinhThuTucId, long vaiTroXuLy1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	/**
	* Removes all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63; from the database.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @throws SystemException if a system exception occurred
	*/
	public void removeByQuyTrinhThuTucIdAndVaiTroXuLy1(long quyTrinhThuTucId,
		long vaiTroXuLy1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @return the number of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByQuyTrinhThuTucIdAndVaiTroXuLy1(long quyTrinhThuTucId,
		long vaiTroXuLy1)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @return the matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy2(
		long quyTrinhThuTucId, long vaiTroXuLy2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @param start the lower bound of the range of mot cua trang thai ho sos
	* @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	* @return the range of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy2(
		long quyTrinhThuTucId, long vaiTroXuLy2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @param start the lower bound of the range of mot cua trang thai ho sos
	* @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy2(
		long quyTrinhThuTucId, long vaiTroXuLy2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy2_First(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	/**
	* Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_First(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy2_Last(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	/**
	* Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_Last(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua trang thai ho sos before and after the current mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	*
	* @param id the primary key of the current mot cua trang thai ho so
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo[] findByQuyTrinhThuTucIdAndVaiTroXuLy2_PrevAndNext(
		long id, long quyTrinhThuTucId, long vaiTroXuLy2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	/**
	* Removes all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63; from the database.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @throws SystemException if a system exception occurred
	*/
	public void removeByQuyTrinhThuTucIdAndVaiTroXuLy2(long quyTrinhThuTucId,
		long vaiTroXuLy2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @return the number of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByQuyTrinhThuTucIdAndVaiTroXuLy2(long quyTrinhThuTucId,
		long vaiTroXuLy2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @return the matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy3(
		long quyTrinhThuTucId, long vaiTroXuLy3)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @param start the lower bound of the range of mot cua trang thai ho sos
	* @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	* @return the range of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy3(
		long quyTrinhThuTucId, long vaiTroXuLy3, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @param start the lower bound of the range of mot cua trang thai ho sos
	* @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy3(
		long quyTrinhThuTucId, long vaiTroXuLy3, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy3_First(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	/**
	* Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_First(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy3_Last(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	/**
	* Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_Last(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua trang thai ho sos before and after the current mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	*
	* @param id the primary key of the current mot cua trang thai ho so
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo[] findByQuyTrinhThuTucIdAndVaiTroXuLy3_PrevAndNext(
		long id, long quyTrinhThuTucId, long vaiTroXuLy3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	/**
	* Removes all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63; from the database.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @throws SystemException if a system exception occurred
	*/
	public void removeByQuyTrinhThuTucIdAndVaiTroXuLy3(long quyTrinhThuTucId,
		long vaiTroXuLy3)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @return the number of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countByQuyTrinhThuTucIdAndVaiTroXuLy3(long quyTrinhThuTucId,
		long vaiTroXuLy3)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the mot cua trang thai ho so in the entity cache if it is enabled.
	*
	* @param motCuaTrangThaiHoSo the mot cua trang thai ho so
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo motCuaTrangThaiHoSo);

	/**
	* Caches the mot cua trang thai ho sos in the entity cache if it is enabled.
	*
	* @param motCuaTrangThaiHoSos the mot cua trang thai ho sos
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> motCuaTrangThaiHoSos);

	/**
	* Creates a new mot cua trang thai ho so with the primary key. Does not add the mot cua trang thai ho so to the database.
	*
	* @param id the primary key for the new mot cua trang thai ho so
	* @return the new mot cua trang thai ho so
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo create(long id);

	/**
	* Removes the mot cua trang thai ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua trang thai ho so
	* @return the mot cua trang thai ho so that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo motCuaTrangThaiHoSo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua trang thai ho so with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException} if it could not be found.
	*
	* @param id the primary key of the mot cua trang thai ho so
	* @return the mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException;

	/**
	* Returns the mot cua trang thai ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua trang thai ho so
	* @return the mot cua trang thai ho so, or <code>null</code> if a mot cua trang thai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua trang thai ho sos.
	*
	* @return the mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua trang thai ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua trang thai ho sos
	* @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	* @return the range of mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua trang thai ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaTrangThaiHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua trang thai ho sos
	* @param end the upper bound of the range of mot cua trang thai ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mot cua trang thai ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua trang thai ho sos.
	*
	* @return the number of mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}