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

import vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong;

import java.util.List;

/**
 * The persistence utility for the lich kiem tra hien truong service. This utility wraps {@link LichKiemTraHienTruongPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see LichKiemTraHienTruongPersistence
 * @see LichKiemTraHienTruongPersistenceImpl
 * @generated
 */
public class LichKiemTraHienTruongUtil {
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
	public static void clearCache(LichKiemTraHienTruong lichKiemTraHienTruong) {
		getPersistence().clearCache(lichKiemTraHienTruong);
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
	public static List<LichKiemTraHienTruong> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LichKiemTraHienTruong> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LichKiemTraHienTruong> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LichKiemTraHienTruong update(
		LichKiemTraHienTruong lichKiemTraHienTruong) throws SystemException {
		return getPersistence().update(lichKiemTraHienTruong);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LichKiemTraHienTruong update(
		LichKiemTraHienTruong lichKiemTraHienTruong,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(lichKiemTraHienTruong, serviceContext);
	}

	/**
	* Caches the lich kiem tra hien truong in the entity cache if it is enabled.
	*
	* @param lichKiemTraHienTruong the lich kiem tra hien truong
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong lichKiemTraHienTruong) {
		getPersistence().cacheResult(lichKiemTraHienTruong);
	}

	/**
	* Caches the lich kiem tra hien truongs in the entity cache if it is enabled.
	*
	* @param lichKiemTraHienTruongs the lich kiem tra hien truongs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong> lichKiemTraHienTruongs) {
		getPersistence().cacheResult(lichKiemTraHienTruongs);
	}

	/**
	* Creates a new lich kiem tra hien truong with the primary key. Does not add the lich kiem tra hien truong to the database.
	*
	* @param id the primary key for the new lich kiem tra hien truong
	* @return the new lich kiem tra hien truong
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the lich kiem tra hien truong with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the lich kiem tra hien truong
	* @return the lich kiem tra hien truong that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchLichKiemTraHienTruongException if a lich kiem tra hien truong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchLichKiemTraHienTruongException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong lichKiemTraHienTruong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(lichKiemTraHienTruong);
	}

	/**
	* Returns the lich kiem tra hien truong with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchLichKiemTraHienTruongException} if it could not be found.
	*
	* @param id the primary key of the lich kiem tra hien truong
	* @return the lich kiem tra hien truong
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchLichKiemTraHienTruongException if a lich kiem tra hien truong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchLichKiemTraHienTruongException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the lich kiem tra hien truong with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the lich kiem tra hien truong
	* @return the lich kiem tra hien truong, or <code>null</code> if a lich kiem tra hien truong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the lich kiem tra hien truongs.
	*
	* @return the lich kiem tra hien truongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the lich kiem tra hien truongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.LichKiemTraHienTruongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lich kiem tra hien truongs
	* @param end the upper bound of the range of lich kiem tra hien truongs (not inclusive)
	* @return the range of lich kiem tra hien truongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the lich kiem tra hien truongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.LichKiemTraHienTruongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lich kiem tra hien truongs
	* @param end the upper bound of the range of lich kiem tra hien truongs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lich kiem tra hien truongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the lich kiem tra hien truongs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of lich kiem tra hien truongs.
	*
	* @return the number of lich kiem tra hien truongs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LichKiemTraHienTruongPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LichKiemTraHienTruongPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					LichKiemTraHienTruongPersistence.class.getName());

			ReferenceRegistry.registerReference(LichKiemTraHienTruongUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LichKiemTraHienTruongPersistence persistence) {
	}

	private static LichKiemTraHienTruongPersistence _persistence;
}