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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh;

import java.util.List;

/**
 * The persistence utility for the mot cua phieu xu ly chinh service. This utility wraps {@link MotCuaPhieuXuLyChinhPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaPhieuXuLyChinhPersistence
 * @see MotCuaPhieuXuLyChinhPersistenceImpl
 * @generated
 */
public class MotCuaPhieuXuLyChinhUtil {
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
	public static void clearCache(MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh) {
		getPersistence().clearCache(motCuaPhieuXuLyChinh);
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
	public static List<MotCuaPhieuXuLyChinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MotCuaPhieuXuLyChinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MotCuaPhieuXuLyChinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MotCuaPhieuXuLyChinh update(
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh) throws SystemException {
		return getPersistence().update(motCuaPhieuXuLyChinh);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MotCuaPhieuXuLyChinh update(
		MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(motCuaPhieuXuLyChinh, serviceContext);
	}

	/**
	* Returns the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the matching mot cua phieu xu ly chinh
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException if a matching mot cua phieu xu ly chinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh findByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException {
		return getPersistence()
				   .findByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId);
	}

	/**
	* Returns the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the matching mot cua phieu xu ly chinh, or <code>null</code> if a matching mot cua phieu xu ly chinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh fetchByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId);
	}

	/**
	* Returns the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua phieu xu ly chinh, or <code>null</code> if a matching mot cua phieu xu ly chinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh fetchByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId, retrieveFromCache);
	}

	/**
	* Removes the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the mot cua phieu xu ly chinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh removeByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException {
		return getPersistence()
				   .removeByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId);
	}

	/**
	* Returns the number of mot cua phieu xu ly chinhs where hoSoThuTucId = &#63; and quyTrinhThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the number of matching mot cua phieu xu ly chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucIdAndQuyTrinhThuTucId(
		long hoSoThuTucId, long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByHoSoThuTucIdAndQuyTrinhThuTucId(hoSoThuTucId,
			quyTrinhThuTucId);
	}

	/**
	* Returns the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException} if it could not be found.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching mot cua phieu xu ly chinh
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException if a matching mot cua phieu xu ly chinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching mot cua phieu xu ly chinh, or <code>null</code> if a matching mot cua phieu xu ly chinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh fetchByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua phieu xu ly chinh, or <code>null</code> if a matching mot cua phieu xu ly chinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh fetchByHoSoThuTucId(
		long hoSoThuTucId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId(hoSoThuTucId, retrieveFromCache);
	}

	/**
	* Removes the mot cua phieu xu ly chinh where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the mot cua phieu xu ly chinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh removeByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException {
		return getPersistence().removeByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the number of mot cua phieu xu ly chinhs where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching mot cua phieu xu ly chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Caches the mot cua phieu xu ly chinh in the entity cache if it is enabled.
	*
	* @param motCuaPhieuXuLyChinh the mot cua phieu xu ly chinh
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh) {
		getPersistence().cacheResult(motCuaPhieuXuLyChinh);
	}

	/**
	* Caches the mot cua phieu xu ly chinhs in the entity cache if it is enabled.
	*
	* @param motCuaPhieuXuLyChinhs the mot cua phieu xu ly chinhs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh> motCuaPhieuXuLyChinhs) {
		getPersistence().cacheResult(motCuaPhieuXuLyChinhs);
	}

	/**
	* Creates a new mot cua phieu xu ly chinh with the primary key. Does not add the mot cua phieu xu ly chinh to the database.
	*
	* @param id the primary key for the new mot cua phieu xu ly chinh
	* @return the new mot cua phieu xu ly chinh
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the mot cua phieu xu ly chinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua phieu xu ly chinh
	* @return the mot cua phieu xu ly chinh that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException if a mot cua phieu xu ly chinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(motCuaPhieuXuLyChinh);
	}

	/**
	* Returns the mot cua phieu xu ly chinh with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException} if it could not be found.
	*
	* @param id the primary key of the mot cua phieu xu ly chinh
	* @return the mot cua phieu xu ly chinh
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException if a mot cua phieu xu ly chinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyChinhException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the mot cua phieu xu ly chinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua phieu xu ly chinh
	* @return the mot cua phieu xu ly chinh, or <code>null</code> if a mot cua phieu xu ly chinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the mot cua phieu xu ly chinhs.
	*
	* @return the mot cua phieu xu ly chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mot cua phieu xu ly chinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phieu xu ly chinhs
	* @param end the upper bound of the range of mot cua phieu xu ly chinhs (not inclusive)
	* @return the range of mot cua phieu xu ly chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mot cua phieu xu ly chinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phieu xu ly chinhs
	* @param end the upper bound of the range of mot cua phieu xu ly chinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua phieu xu ly chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mot cua phieu xu ly chinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mot cua phieu xu ly chinhs.
	*
	* @return the number of mot cua phieu xu ly chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MotCuaPhieuXuLyChinhPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MotCuaPhieuXuLyChinhPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaPhieuXuLyChinhPersistence.class.getName());

			ReferenceRegistry.registerReference(MotCuaPhieuXuLyChinhUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MotCuaPhieuXuLyChinhPersistence persistence) {
	}

	private static MotCuaPhieuXuLyChinhPersistence _persistence;
}