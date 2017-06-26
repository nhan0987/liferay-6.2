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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo;

import java.util.List;

/**
 * The persistence utility for the tthc bieu mau ho so service. This utility wraps {@link TthcBieuMauHoSoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see TthcBieuMauHoSoPersistence
 * @see TthcBieuMauHoSoPersistenceImpl
 * @generated
 */
public class TthcBieuMauHoSoUtil {
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
	public static void clearCache(TthcBieuMauHoSo tthcBieuMauHoSo) {
		getPersistence().clearCache(tthcBieuMauHoSo);
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
	public static List<TthcBieuMauHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcBieuMauHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcBieuMauHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcBieuMauHoSo update(TthcBieuMauHoSo tthcBieuMauHoSo)
		throws SystemException {
		return getPersistence().update(tthcBieuMauHoSo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcBieuMauHoSo update(TthcBieuMauHoSo tthcBieuMauHoSo,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tthcBieuMauHoSo, serviceContext);
	}

	/**
	* Caches the tthc bieu mau ho so in the entity cache if it is enabled.
	*
	* @param tthcBieuMauHoSo the tthc bieu mau ho so
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo tthcBieuMauHoSo) {
		getPersistence().cacheResult(tthcBieuMauHoSo);
	}

	/**
	* Caches the tthc bieu mau ho sos in the entity cache if it is enabled.
	*
	* @param tthcBieuMauHoSos the tthc bieu mau ho sos
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo> tthcBieuMauHoSos) {
		getPersistence().cacheResult(tthcBieuMauHoSos);
	}

	/**
	* Creates a new tthc bieu mau ho so with the primary key. Does not add the tthc bieu mau ho so to the database.
	*
	* @param Id the primary key for the new tthc bieu mau ho so
	* @return the new tthc bieu mau ho so
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the tthc bieu mau ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tthc bieu mau ho so
	* @return the tthc bieu mau ho so that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcBieuMauHoSoException if a tthc bieu mau ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcBieuMauHoSoException {
		return getPersistence().remove(Id);
	}

	public static vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo tthcBieuMauHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcBieuMauHoSo);
	}

	/**
	* Returns the tthc bieu mau ho so with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcBieuMauHoSoException} if it could not be found.
	*
	* @param Id the primary key of the tthc bieu mau ho so
	* @return the tthc bieu mau ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcBieuMauHoSoException if a tthc bieu mau ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcBieuMauHoSoException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the tthc bieu mau ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the tthc bieu mau ho so
	* @return the tthc bieu mau ho so, or <code>null</code> if a tthc bieu mau ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the tthc bieu mau ho sos.
	*
	* @return the tthc bieu mau ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc bieu mau ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcBieuMauHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc bieu mau ho sos
	* @param end the upper bound of the range of tthc bieu mau ho sos (not inclusive)
	* @return the range of tthc bieu mau ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc bieu mau ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcBieuMauHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc bieu mau ho sos
	* @param end the upper bound of the range of tthc bieu mau ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc bieu mau ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc bieu mau ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc bieu mau ho sos.
	*
	* @return the number of tthc bieu mau ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcBieuMauHoSoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcBieuMauHoSoPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					TthcBieuMauHoSoPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcBieuMauHoSoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcBieuMauHoSoPersistence persistence) {
	}

	private static TthcBieuMauHoSoPersistence _persistence;
}