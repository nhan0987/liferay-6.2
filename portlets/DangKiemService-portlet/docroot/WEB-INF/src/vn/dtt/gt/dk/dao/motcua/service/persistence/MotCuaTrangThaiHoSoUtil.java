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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo;

import java.util.List;

/**
 * The persistence utility for the mot cua trang thai ho so service. This utility wraps {@link MotCuaTrangThaiHoSoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see MotCuaTrangThaiHoSoPersistence
 * @see MotCuaTrangThaiHoSoPersistenceImpl
 * @generated
 */
public class MotCuaTrangThaiHoSoUtil {
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
	public static void clearCache(MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) {
		getPersistence().clearCache(motCuaTrangThaiHoSo);
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
	public static List<MotCuaTrangThaiHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MotCuaTrangThaiHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MotCuaTrangThaiHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MotCuaTrangThaiHoSo update(
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) throws SystemException {
		return getPersistence().update(motCuaTrangThaiHoSo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MotCuaTrangThaiHoSo update(
		MotCuaTrangThaiHoSo motCuaTrangThaiHoSo, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(motCuaTrangThaiHoSo, serviceContext);
	}

	/**
	* Returns all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucId(
		long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByQuyTrinhThuTucId(quyTrinhThuTucId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucId(
		long quyTrinhThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByQuyTrinhThuTucId(quyTrinhThuTucId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucId(
		long quyTrinhThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByQuyTrinhThuTucId(quyTrinhThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucId_First(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence()
				   .findByQuyTrinhThuTucId_First(quyTrinhThuTucId,
			orderByComparator);
	}

	/**
	* Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucId_First(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByQuyTrinhThuTucId_First(quyTrinhThuTucId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucId_Last(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence()
				   .findByQuyTrinhThuTucId_Last(quyTrinhThuTucId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucId_Last(
		long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByQuyTrinhThuTucId_Last(quyTrinhThuTucId,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo[] findByQuyTrinhThuTucId_PrevAndNext(
		long id, long quyTrinhThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence()
				   .findByQuyTrinhThuTucId_PrevAndNext(id, quyTrinhThuTucId,
			orderByComparator);
	}

	/**
	* Removes all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; from the database.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByQuyTrinhThuTucId(long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByQuyTrinhThuTucId(quyTrinhThuTucId);
	}

	/**
	* Returns the number of mot cua trang thai ho sos where quyTrinhThuTucId = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @return the number of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByQuyTrinhThuTucId(long quyTrinhThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByQuyTrinhThuTucId(quyTrinhThuTucId);
	}

	/**
	* Returns all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @return the matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy1(
		long quyTrinhThuTucId, long vaiTroXuLy1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
			vaiTroXuLy1);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy1(
		long quyTrinhThuTucId, long vaiTroXuLy1, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
			vaiTroXuLy1, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy1(
		long quyTrinhThuTucId, long vaiTroXuLy1, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
			vaiTroXuLy1, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy1_First(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy1_First(quyTrinhThuTucId,
			vaiTroXuLy1, orderByComparator);
	}

	/**
	* Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_First(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_First(quyTrinhThuTucId,
			vaiTroXuLy1, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy1_Last(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy1_Last(quyTrinhThuTucId,
			vaiTroXuLy1, orderByComparator);
	}

	/**
	* Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_Last(
		long quyTrinhThuTucId, long vaiTroXuLy1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByQuyTrinhThuTucIdAndVaiTroXuLy1_Last(quyTrinhThuTucId,
			vaiTroXuLy1, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo[] findByQuyTrinhThuTucIdAndVaiTroXuLy1_PrevAndNext(
		long id, long quyTrinhThuTucId, long vaiTroXuLy1,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy1_PrevAndNext(id,
			quyTrinhThuTucId, vaiTroXuLy1, orderByComparator);
	}

	/**
	* Removes all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63; from the database.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByQuyTrinhThuTucIdAndVaiTroXuLy1(
		long quyTrinhThuTucId, long vaiTroXuLy1)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
			vaiTroXuLy1);
	}

	/**
	* Returns the number of mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy1 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy1 the vai tro xu ly1
	* @return the number of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByQuyTrinhThuTucIdAndVaiTroXuLy1(
		long quyTrinhThuTucId, long vaiTroXuLy1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByQuyTrinhThuTucIdAndVaiTroXuLy1(quyTrinhThuTucId,
			vaiTroXuLy1);
	}

	/**
	* Returns all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @return the matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy2(
		long quyTrinhThuTucId, long vaiTroXuLy2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
			vaiTroXuLy2);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy2(
		long quyTrinhThuTucId, long vaiTroXuLy2, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
			vaiTroXuLy2, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy2(
		long quyTrinhThuTucId, long vaiTroXuLy2, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
			vaiTroXuLy2, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy2_First(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy2_First(quyTrinhThuTucId,
			vaiTroXuLy2, orderByComparator);
	}

	/**
	* Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_First(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_First(quyTrinhThuTucId,
			vaiTroXuLy2, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy2_Last(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy2_Last(quyTrinhThuTucId,
			vaiTroXuLy2, orderByComparator);
	}

	/**
	* Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_Last(
		long quyTrinhThuTucId, long vaiTroXuLy2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByQuyTrinhThuTucIdAndVaiTroXuLy2_Last(quyTrinhThuTucId,
			vaiTroXuLy2, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo[] findByQuyTrinhThuTucIdAndVaiTroXuLy2_PrevAndNext(
		long id, long quyTrinhThuTucId, long vaiTroXuLy2,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy2_PrevAndNext(id,
			quyTrinhThuTucId, vaiTroXuLy2, orderByComparator);
	}

	/**
	* Removes all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63; from the database.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByQuyTrinhThuTucIdAndVaiTroXuLy2(
		long quyTrinhThuTucId, long vaiTroXuLy2)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
			vaiTroXuLy2);
	}

	/**
	* Returns the number of mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy2 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy2 the vai tro xu ly2
	* @return the number of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByQuyTrinhThuTucIdAndVaiTroXuLy2(
		long quyTrinhThuTucId, long vaiTroXuLy2)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByQuyTrinhThuTucIdAndVaiTroXuLy2(quyTrinhThuTucId,
			vaiTroXuLy2);
	}

	/**
	* Returns all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @return the matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy3(
		long quyTrinhThuTucId, long vaiTroXuLy3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
			vaiTroXuLy3);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy3(
		long quyTrinhThuTucId, long vaiTroXuLy3, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
			vaiTroXuLy3, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findByQuyTrinhThuTucIdAndVaiTroXuLy3(
		long quyTrinhThuTucId, long vaiTroXuLy3, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
			vaiTroXuLy3, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy3_First(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy3_First(quyTrinhThuTucId,
			vaiTroXuLy3, orderByComparator);
	}

	/**
	* Returns the first mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_First(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_First(quyTrinhThuTucId,
			vaiTroXuLy3, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByQuyTrinhThuTucIdAndVaiTroXuLy3_Last(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy3_Last(quyTrinhThuTucId,
			vaiTroXuLy3, orderByComparator);
	}

	/**
	* Returns the last mot cua trang thai ho so in the ordered set where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua trang thai ho so, or <code>null</code> if a matching mot cua trang thai ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_Last(
		long quyTrinhThuTucId, long vaiTroXuLy3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByQuyTrinhThuTucIdAndVaiTroXuLy3_Last(quyTrinhThuTucId,
			vaiTroXuLy3, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo[] findByQuyTrinhThuTucIdAndVaiTroXuLy3_PrevAndNext(
		long id, long quyTrinhThuTucId, long vaiTroXuLy3,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence()
				   .findByQuyTrinhThuTucIdAndVaiTroXuLy3_PrevAndNext(id,
			quyTrinhThuTucId, vaiTroXuLy3, orderByComparator);
	}

	/**
	* Removes all the mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63; from the database.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByQuyTrinhThuTucIdAndVaiTroXuLy3(
		long quyTrinhThuTucId, long vaiTroXuLy3)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
			vaiTroXuLy3);
	}

	/**
	* Returns the number of mot cua trang thai ho sos where quyTrinhThuTucId = &#63; and vaiTroXuLy3 = &#63;.
	*
	* @param quyTrinhThuTucId the quy trinh thu tuc ID
	* @param vaiTroXuLy3 the vai tro xu ly3
	* @return the number of matching mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByQuyTrinhThuTucIdAndVaiTroXuLy3(
		long quyTrinhThuTucId, long vaiTroXuLy3)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByQuyTrinhThuTucIdAndVaiTroXuLy3(quyTrinhThuTucId,
			vaiTroXuLy3);
	}

	/**
	* Caches the mot cua trang thai ho so in the entity cache if it is enabled.
	*
	* @param motCuaTrangThaiHoSo the mot cua trang thai ho so
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo motCuaTrangThaiHoSo) {
		getPersistence().cacheResult(motCuaTrangThaiHoSo);
	}

	/**
	* Caches the mot cua trang thai ho sos in the entity cache if it is enabled.
	*
	* @param motCuaTrangThaiHoSos the mot cua trang thai ho sos
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> motCuaTrangThaiHoSos) {
		getPersistence().cacheResult(motCuaTrangThaiHoSos);
	}

	/**
	* Creates a new mot cua trang thai ho so with the primary key. Does not add the mot cua trang thai ho so to the database.
	*
	* @param id the primary key for the new mot cua trang thai ho so
	* @return the new mot cua trang thai ho so
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the mot cua trang thai ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua trang thai ho so
	* @return the mot cua trang thai ho so that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo motCuaTrangThaiHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(motCuaTrangThaiHoSo);
	}

	/**
	* Returns the mot cua trang thai ho so with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException} if it could not be found.
	*
	* @param id the primary key of the mot cua trang thai ho so
	* @return the mot cua trang thai ho so
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException if a mot cua trang thai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaTrangThaiHoSoException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the mot cua trang thai ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua trang thai ho so
	* @return the mot cua trang thai ho so, or <code>null</code> if a mot cua trang thai ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the mot cua trang thai ho sos.
	*
	* @return the mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaTrangThaiHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mot cua trang thai ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mot cua trang thai ho sos.
	*
	* @return the number of mot cua trang thai ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MotCuaTrangThaiHoSoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MotCuaTrangThaiHoSoPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaTrangThaiHoSoPersistence.class.getName());

			ReferenceRegistry.registerReference(MotCuaTrangThaiHoSoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MotCuaTrangThaiHoSoPersistence persistence) {
	}

	private static MotCuaTrangThaiHoSoPersistence _persistence;
}