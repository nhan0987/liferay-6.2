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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien;

/**
 * The persistence interface for the mot cua ket qua dien bien service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see MotCuaKetQuaDienBienPersistenceImpl
 * @see MotCuaKetQuaDienBienUtil
 * @generated
 */
public interface MotCuaKetQuaDienBienPersistence extends BasePersistence<MotCuaKetQuaDienBien> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MotCuaKetQuaDienBienUtil} to access the mot cua ket qua dien bien persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the mot cua ket qua dien biens where dienBienHoSoId = &#63;.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @return the matching mot cua ket qua dien biens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien> findByDienBienHoSoId(
		long dienBienHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua ket qua dien biens where dienBienHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @param start the lower bound of the range of mot cua ket qua dien biens
	* @param end the upper bound of the range of mot cua ket qua dien biens (not inclusive)
	* @return the range of matching mot cua ket qua dien biens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien> findByDienBienHoSoId(
		long dienBienHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua ket qua dien biens where dienBienHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @param start the lower bound of the range of mot cua ket qua dien biens
	* @param end the upper bound of the range of mot cua ket qua dien biens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua ket qua dien biens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien> findByDienBienHoSoId(
		long dienBienHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua ket qua dien bien in the ordered set where dienBienHoSoId = &#63;.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua ket qua dien bien
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a matching mot cua ket qua dien bien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien findByDienBienHoSoId_First(
		long dienBienHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException;

	/**
	* Returns the first mot cua ket qua dien bien in the ordered set where dienBienHoSoId = &#63;.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua ket qua dien bien, or <code>null</code> if a matching mot cua ket qua dien bien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien fetchByDienBienHoSoId_First(
		long dienBienHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua ket qua dien bien in the ordered set where dienBienHoSoId = &#63;.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua ket qua dien bien
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a matching mot cua ket qua dien bien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien findByDienBienHoSoId_Last(
		long dienBienHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException;

	/**
	* Returns the last mot cua ket qua dien bien in the ordered set where dienBienHoSoId = &#63;.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua ket qua dien bien, or <code>null</code> if a matching mot cua ket qua dien bien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien fetchByDienBienHoSoId_Last(
		long dienBienHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua ket qua dien biens before and after the current mot cua ket qua dien bien in the ordered set where dienBienHoSoId = &#63;.
	*
	* @param id the primary key of the current mot cua ket qua dien bien
	* @param dienBienHoSoId the dien bien ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua ket qua dien bien
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a mot cua ket qua dien bien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien[] findByDienBienHoSoId_PrevAndNext(
		long id, long dienBienHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException;

	/**
	* Removes all the mot cua ket qua dien biens where dienBienHoSoId = &#63; from the database.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDienBienHoSoId(long dienBienHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua ket qua dien biens where dienBienHoSoId = &#63;.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @return the number of matching mot cua ket qua dien biens
	* @throws SystemException if a system exception occurred
	*/
	public int countByDienBienHoSoId(long dienBienHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua ket qua dien biens where noiDungHoSoId = &#63;.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @return the matching mot cua ket qua dien biens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien> findByNoiDungHoSoId(
		long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua ket qua dien biens where noiDungHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @param start the lower bound of the range of mot cua ket qua dien biens
	* @param end the upper bound of the range of mot cua ket qua dien biens (not inclusive)
	* @return the range of matching mot cua ket qua dien biens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien> findByNoiDungHoSoId(
		long noiDungHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua ket qua dien biens where noiDungHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @param start the lower bound of the range of mot cua ket qua dien biens
	* @param end the upper bound of the range of mot cua ket qua dien biens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua ket qua dien biens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien> findByNoiDungHoSoId(
		long noiDungHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua ket qua dien bien in the ordered set where noiDungHoSoId = &#63;.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua ket qua dien bien
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a matching mot cua ket qua dien bien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien findByNoiDungHoSoId_First(
		long noiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException;

	/**
	* Returns the first mot cua ket qua dien bien in the ordered set where noiDungHoSoId = &#63;.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua ket qua dien bien, or <code>null</code> if a matching mot cua ket qua dien bien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien fetchByNoiDungHoSoId_First(
		long noiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua ket qua dien bien in the ordered set where noiDungHoSoId = &#63;.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua ket qua dien bien
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a matching mot cua ket qua dien bien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien findByNoiDungHoSoId_Last(
		long noiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException;

	/**
	* Returns the last mot cua ket qua dien bien in the ordered set where noiDungHoSoId = &#63;.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua ket qua dien bien, or <code>null</code> if a matching mot cua ket qua dien bien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien fetchByNoiDungHoSoId_Last(
		long noiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua ket qua dien biens before and after the current mot cua ket qua dien bien in the ordered set where noiDungHoSoId = &#63;.
	*
	* @param id the primary key of the current mot cua ket qua dien bien
	* @param noiDungHoSoId the noi dung ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua ket qua dien bien
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a mot cua ket qua dien bien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien[] findByNoiDungHoSoId_PrevAndNext(
		long id, long noiDungHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException;

	/**
	* Removes all the mot cua ket qua dien biens where noiDungHoSoId = &#63; from the database.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNoiDungHoSoId(long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua ket qua dien biens where noiDungHoSoId = &#63;.
	*
	* @param noiDungHoSoId the noi dung ho so ID
	* @return the number of matching mot cua ket qua dien biens
	* @throws SystemException if a system exception occurred
	*/
	public int countByNoiDungHoSoId(long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the mot cua ket qua dien bien in the entity cache if it is enabled.
	*
	* @param motCuaKetQuaDienBien the mot cua ket qua dien bien
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien motCuaKetQuaDienBien);

	/**
	* Caches the mot cua ket qua dien biens in the entity cache if it is enabled.
	*
	* @param motCuaKetQuaDienBiens the mot cua ket qua dien biens
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien> motCuaKetQuaDienBiens);

	/**
	* Creates a new mot cua ket qua dien bien with the primary key. Does not add the mot cua ket qua dien bien to the database.
	*
	* @param id the primary key for the new mot cua ket qua dien bien
	* @return the new mot cua ket qua dien bien
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien create(long id);

	/**
	* Removes the mot cua ket qua dien bien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua ket qua dien bien
	* @return the mot cua ket qua dien bien that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a mot cua ket qua dien bien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException;

	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien motCuaKetQuaDienBien)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua ket qua dien bien with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException} if it could not be found.
	*
	* @param id the primary key of the mot cua ket qua dien bien
	* @return the mot cua ket qua dien bien
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException if a mot cua ket qua dien bien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaKetQuaDienBienException;

	/**
	* Returns the mot cua ket qua dien bien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua ket qua dien bien
	* @return the mot cua ket qua dien bien, or <code>null</code> if a mot cua ket qua dien bien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua ket qua dien biens.
	*
	* @return the mot cua ket qua dien biens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua ket qua dien biens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua ket qua dien biens
	* @param end the upper bound of the range of mot cua ket qua dien biens (not inclusive)
	* @return the range of mot cua ket qua dien biens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua ket qua dien biens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaKetQuaDienBienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua ket qua dien biens
	* @param end the upper bound of the range of mot cua ket qua dien biens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua ket qua dien biens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaKetQuaDienBien> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mot cua ket qua dien biens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua ket qua dien biens.
	*
	* @return the number of mot cua ket qua dien biens
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}