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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai;

import java.util.List;

/**
 * The persistence utility for the mot cua chuyen dich trang thai service. This utility wraps {@link MotCuaChuyenDichTrangThaiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see MotCuaChuyenDichTrangThaiPersistence
 * @see MotCuaChuyenDichTrangThaiPersistenceImpl
 * @generated
 */
public class MotCuaChuyenDichTrangThaiUtil {
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
	public static void clearCache(
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai) {
		getPersistence().clearCache(motCuaChuyenDichTrangThai);
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
	public static List<MotCuaChuyenDichTrangThai> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MotCuaChuyenDichTrangThai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MotCuaChuyenDichTrangThai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MotCuaChuyenDichTrangThai update(
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai)
		throws SystemException {
		return getPersistence().update(motCuaChuyenDichTrangThai);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MotCuaChuyenDichTrangThai update(
		MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(motCuaChuyenDichTrangThai, serviceContext);
	}

	/**
	* Returns all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @return the matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDich(
		java.lang.String dieuKienChuyenDich)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDieuKienChuyenDich(dieuKienChuyenDich);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDich(
		java.lang.String dieuKienChuyenDich, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDieuKienChuyenDich(dieuKienChuyenDich, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDich(
		java.lang.String dieuKienChuyenDich, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDieuKienChuyenDich(dieuKienChuyenDich, start, end,
			orderByComparator);
	}

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByDieuKienChuyenDich_First(
		java.lang.String dieuKienChuyenDich,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence()
				   .findByDieuKienChuyenDich_First(dieuKienChuyenDich,
			orderByComparator);
	}

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDich_First(
		java.lang.String dieuKienChuyenDich,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDieuKienChuyenDich_First(dieuKienChuyenDich,
			orderByComparator);
	}

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByDieuKienChuyenDich_Last(
		java.lang.String dieuKienChuyenDich,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence()
				   .findByDieuKienChuyenDich_Last(dieuKienChuyenDich,
			orderByComparator);
	}

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDich_Last(
		java.lang.String dieuKienChuyenDich,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDieuKienChuyenDich_Last(dieuKienChuyenDich,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai[] findByDieuKienChuyenDich_PrevAndNext(
		long id, java.lang.String dieuKienChuyenDich,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence()
				   .findByDieuKienChuyenDich_PrevAndNext(id,
			dieuKienChuyenDich, orderByComparator);
	}

	/**
	* Removes all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; from the database.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDieuKienChuyenDich(
		java.lang.String dieuKienChuyenDich)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDieuKienChuyenDich(dieuKienChuyenDich);
	}

	/**
	* Returns the number of mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @return the number of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDieuKienChuyenDich(
		java.lang.String dieuKienChuyenDich)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDieuKienChuyenDich(dieuKienChuyenDich);
	}

	/**
	* Returns all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @return the matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonId(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
			trangThaiNguonId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonId(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
			trangThaiNguonId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByDieuKienChuyenDichAndTrangThaiNguonId(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
			trangThaiNguonId, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByDieuKienChuyenDichAndTrangThaiNguonId_First(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence()
				   .findByDieuKienChuyenDichAndTrangThaiNguonId_First(dieuKienChuyenDich,
			trangThaiNguonId, orderByComparator);
	}

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDichAndTrangThaiNguonId_First(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDieuKienChuyenDichAndTrangThaiNguonId_First(dieuKienChuyenDich,
			trangThaiNguonId, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByDieuKienChuyenDichAndTrangThaiNguonId_Last(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence()
				   .findByDieuKienChuyenDichAndTrangThaiNguonId_Last(dieuKienChuyenDich,
			trangThaiNguonId, orderByComparator);
	}

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByDieuKienChuyenDichAndTrangThaiNguonId_Last(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDieuKienChuyenDichAndTrangThaiNguonId_Last(dieuKienChuyenDich,
			trangThaiNguonId, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai[] findByDieuKienChuyenDichAndTrangThaiNguonId_PrevAndNext(
		long id, java.lang.String dieuKienChuyenDich, long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence()
				   .findByDieuKienChuyenDichAndTrangThaiNguonId_PrevAndNext(id,
			dieuKienChuyenDich, trangThaiNguonId, orderByComparator);
	}

	/**
	* Removes all the mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63; from the database.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDieuKienChuyenDichAndTrangThaiNguonId(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
			trangThaiNguonId);
	}

	/**
	* Returns the number of mot cua chuyen dich trang thais where dieuKienChuyenDich = &#63; and trangThaiNguonId = &#63;.
	*
	* @param dieuKienChuyenDich the dieu kien chuyen dich
	* @param trangThaiNguonId the trang thai nguon ID
	* @return the number of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDieuKienChuyenDichAndTrangThaiNguonId(
		java.lang.String dieuKienChuyenDich, long trangThaiNguonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDieuKienChuyenDichAndTrangThaiNguonId(dieuKienChuyenDich,
			trangThaiNguonId);
	}

	/**
	* Returns all the mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @return the matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiDichId(
		long trangThaiDichId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTrangThaiDichId(trangThaiDichId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiDichId(
		long trangThaiDichId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTrangThaiDichId(trangThaiDichId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiDichId(
		long trangThaiDichId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTrangThaiDichId(trangThaiDichId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByTrangThaiDichId_First(
		long trangThaiDichId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence()
				   .findByTrangThaiDichId_First(trangThaiDichId,
			orderByComparator);
	}

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByTrangThaiDichId_First(
		long trangThaiDichId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTrangThaiDichId_First(trangThaiDichId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByTrangThaiDichId_Last(
		long trangThaiDichId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence()
				   .findByTrangThaiDichId_Last(trangThaiDichId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiDichId = &#63;.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByTrangThaiDichId_Last(
		long trangThaiDichId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTrangThaiDichId_Last(trangThaiDichId,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai[] findByTrangThaiDichId_PrevAndNext(
		long id, long trangThaiDichId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence()
				   .findByTrangThaiDichId_PrevAndNext(id, trangThaiDichId,
			orderByComparator);
	}

	/**
	* Removes all the mot cua chuyen dich trang thais where trangThaiDichId = &#63; from the database.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTrangThaiDichId(long trangThaiDichId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTrangThaiDichId(trangThaiDichId);
	}

	/**
	* Returns the number of mot cua chuyen dich trang thais where trangThaiDichId = &#63;.
	*
	* @param trangThaiDichId the trang thai dich ID
	* @return the number of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTrangThaiDichId(long trangThaiDichId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTrangThaiDichId(trangThaiDichId);
	}

	/**
	* Returns all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @return the matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiNguonId(
		long trangThaiNguonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTrangThaiNguonId(trangThaiNguonId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiNguonId(
		long trangThaiNguonId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTrangThaiNguonId(trangThaiNguonId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findByTrangThaiNguonId(
		long trangThaiNguonId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTrangThaiNguonId(trangThaiNguonId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByTrangThaiNguonId_First(
		long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence()
				   .findByTrangThaiNguonId_First(trangThaiNguonId,
			orderByComparator);
	}

	/**
	* Returns the first mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByTrangThaiNguonId_First(
		long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTrangThaiNguonId_First(trangThaiNguonId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByTrangThaiNguonId_Last(
		long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence()
				   .findByTrangThaiNguonId_Last(trangThaiNguonId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua chuyen dich trang thai in the ordered set where trangThaiNguonId = &#63;.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua chuyen dich trang thai, or <code>null</code> if a matching mot cua chuyen dich trang thai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByTrangThaiNguonId_Last(
		long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTrangThaiNguonId_Last(trangThaiNguonId,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai[] findByTrangThaiNguonId_PrevAndNext(
		long id, long trangThaiNguonId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence()
				   .findByTrangThaiNguonId_PrevAndNext(id, trangThaiNguonId,
			orderByComparator);
	}

	/**
	* Removes all the mot cua chuyen dich trang thais where trangThaiNguonId = &#63; from the database.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTrangThaiNguonId(long trangThaiNguonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTrangThaiNguonId(trangThaiNguonId);
	}

	/**
	* Returns the number of mot cua chuyen dich trang thais where trangThaiNguonId = &#63;.
	*
	* @param trangThaiNguonId the trang thai nguon ID
	* @return the number of matching mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTrangThaiNguonId(long trangThaiNguonId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTrangThaiNguonId(trangThaiNguonId);
	}

	/**
	* Caches the mot cua chuyen dich trang thai in the entity cache if it is enabled.
	*
	* @param motCuaChuyenDichTrangThai the mot cua chuyen dich trang thai
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai) {
		getPersistence().cacheResult(motCuaChuyenDichTrangThai);
	}

	/**
	* Caches the mot cua chuyen dich trang thais in the entity cache if it is enabled.
	*
	* @param motCuaChuyenDichTrangThais the mot cua chuyen dich trang thais
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> motCuaChuyenDichTrangThais) {
		getPersistence().cacheResult(motCuaChuyenDichTrangThais);
	}

	/**
	* Creates a new mot cua chuyen dich trang thai with the primary key. Does not add the mot cua chuyen dich trang thai to the database.
	*
	* @param id the primary key for the new mot cua chuyen dich trang thai
	* @return the new mot cua chuyen dich trang thai
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the mot cua chuyen dich trang thai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua chuyen dich trang thai
	* @return the mot cua chuyen dich trang thai that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai motCuaChuyenDichTrangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(motCuaChuyenDichTrangThai);
	}

	/**
	* Returns the mot cua chuyen dich trang thai with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException} if it could not be found.
	*
	* @param id the primary key of the mot cua chuyen dich trang thai
	* @return the mot cua chuyen dich trang thai
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException if a mot cua chuyen dich trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaChuyenDichTrangThaiException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the mot cua chuyen dich trang thai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua chuyen dich trang thai
	* @return the mot cua chuyen dich trang thai, or <code>null</code> if a mot cua chuyen dich trang thai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the mot cua chuyen dich trang thais.
	*
	* @return the mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaChuyenDichTrangThai> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mot cua chuyen dich trang thais from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mot cua chuyen dich trang thais.
	*
	* @return the number of mot cua chuyen dich trang thais
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MotCuaChuyenDichTrangThaiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MotCuaChuyenDichTrangThaiPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaChuyenDichTrangThaiPersistence.class.getName());

			ReferenceRegistry.registerReference(MotCuaChuyenDichTrangThaiUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MotCuaChuyenDichTrangThaiPersistence persistence) {
	}

	private static MotCuaChuyenDichTrangThaiPersistence _persistence;
}