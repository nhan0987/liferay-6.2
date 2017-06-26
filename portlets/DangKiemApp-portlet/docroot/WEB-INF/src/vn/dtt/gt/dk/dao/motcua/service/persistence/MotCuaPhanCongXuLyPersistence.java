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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy;

/**
 * The persistence interface for the mot cua phan cong xu ly service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaPhanCongXuLyPersistenceImpl
 * @see MotCuaPhanCongXuLyUtil
 * @generated
 */
public interface MotCuaPhanCongXuLyPersistence extends BasePersistence<MotCuaPhanCongXuLy> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MotCuaPhanCongXuLyUtil} to access the mot cua phan cong xu ly persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the mot cua phan cong xu lies where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @return the matching mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua phan cong xu lies where phieuXuLyChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param start the lower bound of the range of mot cua phan cong xu lies
	* @param end the upper bound of the range of mot cua phan cong xu lies (not inclusive)
	* @return the range of matching mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua phan cong xu lies where phieuXuLyChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param start the lower bound of the range of mot cua phan cong xu lies
	* @param end the upper bound of the range of mot cua phan cong xu lies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mot cua phan cong xu ly in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phan cong xu ly
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a matching mot cua phan cong xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy findByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException;

	/**
	* Returns the first mot cua phan cong xu ly in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phan cong xu ly, or <code>null</code> if a matching mot cua phan cong xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy fetchByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mot cua phan cong xu ly in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phan cong xu ly
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a matching mot cua phan cong xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy findByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException;

	/**
	* Returns the last mot cua phan cong xu ly in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phan cong xu ly, or <code>null</code> if a matching mot cua phan cong xu ly could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy fetchByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua phan cong xu lies before and after the current mot cua phan cong xu ly in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param id the primary key of the current mot cua phan cong xu ly
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua phan cong xu ly
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a mot cua phan cong xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy[] findByPhieuXuLyChinhId_PrevAndNext(
		long id, long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException;

	/**
	* Removes all the mot cua phan cong xu lies where phieuXuLyChinhId = &#63; from the database.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua phan cong xu lies where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @return the number of matching mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the mot cua phan cong xu ly in the entity cache if it is enabled.
	*
	* @param motCuaPhanCongXuLy the mot cua phan cong xu ly
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy motCuaPhanCongXuLy);

	/**
	* Caches the mot cua phan cong xu lies in the entity cache if it is enabled.
	*
	* @param motCuaPhanCongXuLies the mot cua phan cong xu lies
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy> motCuaPhanCongXuLies);

	/**
	* Creates a new mot cua phan cong xu ly with the primary key. Does not add the mot cua phan cong xu ly to the database.
	*
	* @param id the primary key for the new mot cua phan cong xu ly
	* @return the new mot cua phan cong xu ly
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy create(long id);

	/**
	* Removes the mot cua phan cong xu ly with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua phan cong xu ly
	* @return the mot cua phan cong xu ly that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a mot cua phan cong xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException;

	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy motCuaPhanCongXuLy)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mot cua phan cong xu ly with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException} if it could not be found.
	*
	* @param id the primary key of the mot cua phan cong xu ly
	* @return the mot cua phan cong xu ly
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException if a mot cua phan cong xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhanCongXuLyException;

	/**
	* Returns the mot cua phan cong xu ly with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua phan cong xu ly
	* @return the mot cua phan cong xu ly, or <code>null</code> if a mot cua phan cong xu ly with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mot cua phan cong xu lies.
	*
	* @return the mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mot cua phan cong xu lies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phan cong xu lies
	* @param end the upper bound of the range of mot cua phan cong xu lies (not inclusive)
	* @return the range of mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mot cua phan cong xu lies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhanCongXuLyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phan cong xu lies
	* @param end the upper bound of the range of mot cua phan cong xu lies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhanCongXuLy> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mot cua phan cong xu lies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mot cua phan cong xu lies.
	*
	* @return the number of mot cua phan cong xu lies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}