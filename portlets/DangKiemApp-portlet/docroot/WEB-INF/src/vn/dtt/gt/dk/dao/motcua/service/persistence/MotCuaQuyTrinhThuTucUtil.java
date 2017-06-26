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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc;

import java.util.List;

/**
 * The persistence utility for the mot cua quy trinh thu tuc service. This utility wraps {@link MotCuaQuyTrinhThuTucPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaQuyTrinhThuTucPersistence
 * @see MotCuaQuyTrinhThuTucPersistenceImpl
 * @generated
 */
public class MotCuaQuyTrinhThuTucUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc) {
		getPersistence().clearCache(motCuaQuyTrinhThuTuc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MotCuaQuyTrinhThuTuc> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MotCuaQuyTrinhThuTuc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MotCuaQuyTrinhThuTuc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MotCuaQuyTrinhThuTuc update(
		MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc) throws SystemException {
		return getPersistence().update(motCuaQuyTrinhThuTuc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MotCuaQuyTrinhThuTuc update(
		MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(motCuaQuyTrinhThuTuc, serviceContext);
	}

	/**
	* Returns all the mot cua quy trinh thu tucs where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param toChucXuLy the to chuc xu ly
	* @return the matching mot cua quy trinh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc> findByThuTucHanhChinhIdAndToChucXuLy(
		long thuTucHanhChinhId, long toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByThuTucHanhChinhIdAndToChucXuLy(thuTucHanhChinhId,
			toChucXuLy);
	}

	/**
	* Returns a range of all the mot cua quy trinh thu tucs where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param toChucXuLy the to chuc xu ly
	* @param start the lower bound of the range of mot cua quy trinh thu tucs
	* @param end the upper bound of the range of mot cua quy trinh thu tucs (not inclusive)
	* @return the range of matching mot cua quy trinh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc> findByThuTucHanhChinhIdAndToChucXuLy(
		long thuTucHanhChinhId, long toChucXuLy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByThuTucHanhChinhIdAndToChucXuLy(thuTucHanhChinhId,
			toChucXuLy, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua quy trinh thu tucs where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param toChucXuLy the to chuc xu ly
	* @param start the lower bound of the range of mot cua quy trinh thu tucs
	* @param end the upper bound of the range of mot cua quy trinh thu tucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua quy trinh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc> findByThuTucHanhChinhIdAndToChucXuLy(
		long thuTucHanhChinhId, long toChucXuLy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByThuTucHanhChinhIdAndToChucXuLy(thuTucHanhChinhId,
			toChucXuLy, start, end, orderByComparator);
	}

	/**
	* Returns the first mot cua quy trinh thu tuc in the ordered set where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param toChucXuLy the to chuc xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua quy trinh thu tuc
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a matching mot cua quy trinh thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc findByThuTucHanhChinhIdAndToChucXuLy_First(
		long thuTucHanhChinhId, long toChucXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException {
		return getPersistence()
				   .findByThuTucHanhChinhIdAndToChucXuLy_First(thuTucHanhChinhId,
			toChucXuLy, orderByComparator);
	}

	/**
	* Returns the first mot cua quy trinh thu tuc in the ordered set where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param toChucXuLy the to chuc xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua quy trinh thu tuc, or <code>null</code> if a matching mot cua quy trinh thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc fetchByThuTucHanhChinhIdAndToChucXuLy_First(
		long thuTucHanhChinhId, long toChucXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhIdAndToChucXuLy_First(thuTucHanhChinhId,
			toChucXuLy, orderByComparator);
	}

	/**
	* Returns the last mot cua quy trinh thu tuc in the ordered set where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param toChucXuLy the to chuc xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua quy trinh thu tuc
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a matching mot cua quy trinh thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc findByThuTucHanhChinhIdAndToChucXuLy_Last(
		long thuTucHanhChinhId, long toChucXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException {
		return getPersistence()
				   .findByThuTucHanhChinhIdAndToChucXuLy_Last(thuTucHanhChinhId,
			toChucXuLy, orderByComparator);
	}

	/**
	* Returns the last mot cua quy trinh thu tuc in the ordered set where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param toChucXuLy the to chuc xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua quy trinh thu tuc, or <code>null</code> if a matching mot cua quy trinh thu tuc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc fetchByThuTucHanhChinhIdAndToChucXuLy_Last(
		long thuTucHanhChinhId, long toChucXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByThuTucHanhChinhIdAndToChucXuLy_Last(thuTucHanhChinhId,
			toChucXuLy, orderByComparator);
	}

	/**
	* Returns the mot cua quy trinh thu tucs before and after the current mot cua quy trinh thu tuc in the ordered set where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	*
	* @param id the primary key of the current mot cua quy trinh thu tuc
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param toChucXuLy the to chuc xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua quy trinh thu tuc
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a mot cua quy trinh thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc[] findByThuTucHanhChinhIdAndToChucXuLy_PrevAndNext(
		long id, long thuTucHanhChinhId, long toChucXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException {
		return getPersistence()
				   .findByThuTucHanhChinhIdAndToChucXuLy_PrevAndNext(id,
			thuTucHanhChinhId, toChucXuLy, orderByComparator);
	}

	/**
	* Removes all the mot cua quy trinh thu tucs where thuTucHanhChinhId = &#63; and toChucXuLy = &#63; from the database.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param toChucXuLy the to chuc xu ly
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByThuTucHanhChinhIdAndToChucXuLy(
		long thuTucHanhChinhId, long toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByThuTucHanhChinhIdAndToChucXuLy(thuTucHanhChinhId,
			toChucXuLy);
	}

	/**
	* Returns the number of mot cua quy trinh thu tucs where thuTucHanhChinhId = &#63; and toChucXuLy = &#63;.
	*
	* @param thuTucHanhChinhId the thu tuc hanh chinh ID
	* @param toChucXuLy the to chuc xu ly
	* @return the number of matching mot cua quy trinh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByThuTucHanhChinhIdAndToChucXuLy(
		long thuTucHanhChinhId, long toChucXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByThuTucHanhChinhIdAndToChucXuLy(thuTucHanhChinhId,
			toChucXuLy);
	}

	/**
	* Caches the mot cua quy trinh thu tuc in the entity cache if it is enabled.
	*
	* @param motCuaQuyTrinhThuTuc the mot cua quy trinh thu tuc
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc) {
		getPersistence().cacheResult(motCuaQuyTrinhThuTuc);
	}

	/**
	* Caches the mot cua quy trinh thu tucs in the entity cache if it is enabled.
	*
	* @param motCuaQuyTrinhThuTucs the mot cua quy trinh thu tucs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc> motCuaQuyTrinhThuTucs) {
		getPersistence().cacheResult(motCuaQuyTrinhThuTucs);
	}

	/**
	* Creates a new mot cua quy trinh thu tuc with the primary key. Does not add the mot cua quy trinh thu tuc to the database.
	*
	* @param id the primary key for the new mot cua quy trinh thu tuc
	* @return the new mot cua quy trinh thu tuc
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the mot cua quy trinh thu tuc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc
	* @return the mot cua quy trinh thu tuc that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a mot cua quy trinh thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc motCuaQuyTrinhThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(motCuaQuyTrinhThuTuc);
	}

	/**
	* Returns the mot cua quy trinh thu tuc with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException} if it could not be found.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc
	* @return the mot cua quy trinh thu tuc
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException if a mot cua quy trinh thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaQuyTrinhThuTucException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the mot cua quy trinh thu tuc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua quy trinh thu tuc
	* @return the mot cua quy trinh thu tuc, or <code>null</code> if a mot cua quy trinh thu tuc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the mot cua quy trinh thu tucs.
	*
	* @return the mot cua quy trinh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mot cua quy trinh thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua quy trinh thu tucs
	* @param end the upper bound of the range of mot cua quy trinh thu tucs (not inclusive)
	* @return the range of mot cua quy trinh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mot cua quy trinh thu tucs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaQuyTrinhThuTucModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua quy trinh thu tucs
	* @param end the upper bound of the range of mot cua quy trinh thu tucs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua quy trinh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaQuyTrinhThuTuc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mot cua quy trinh thu tucs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mot cua quy trinh thu tucs.
	*
	* @return the number of mot cua quy trinh thu tucs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MotCuaQuyTrinhThuTucPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MotCuaQuyTrinhThuTucPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaQuyTrinhThuTucPersistence.class.getName());

			ReferenceRegistry.registerReference(MotCuaQuyTrinhThuTucUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MotCuaQuyTrinhThuTucPersistence persistence) {
	}

	private static MotCuaQuyTrinhThuTucPersistence _persistence;
}