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

import vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo;

import java.util.List;

/**
 * The persistence utility for the tthc noidung ho so service. This utility wraps {@link TthcNoidungHoSoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcNoidungHoSoPersistence
 * @see TthcNoidungHoSoPersistenceImpl
 * @generated
 */
public class TthcNoidungHoSoUtil {
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
	public static void clearCache(TthcNoidungHoSo tthcNoidungHoSo) {
		getPersistence().clearCache(tthcNoidungHoSo);
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
	public static List<TthcNoidungHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcNoidungHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcNoidungHoSo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcNoidungHoSo update(TthcNoidungHoSo tthcNoidungHoSo)
		throws SystemException {
		return getPersistence().update(tthcNoidungHoSo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcNoidungHoSo update(TthcNoidungHoSo tthcNoidungHoSo,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tthcNoidungHoSo, serviceContext);
	}

	/**
	* Returns the tthc noidung ho so where vehicleRecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the matching tthc noidung ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo findByVehicleRecordId(
		long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence().findByVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns the tthc noidung ho so where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo fetchByVehicleRecordId(
		long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns the tthc noidung ho so where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param vehicleRecordId the vehicle record ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo fetchByVehicleRecordId(
		long vehicleRecordId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleRecordId(vehicleRecordId, retrieveFromCache);
	}

	/**
	* Removes the tthc noidung ho so where vehicleRecordId = &#63; from the database.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo removeByVehicleRecordId(
		long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence().removeByVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns the number of tthc noidung ho sos where vehicleRecordId = &#63;.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVehicleRecordId(long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @return the matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucId(
		long HoSoThuTucId, long BieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId,
			BieuMauHoSoId);
	}

	/**
	* Returns a range of all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucId(
		long HoSoThuTucId, long BieuMauHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId,
			BieuMauHoSoId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucId(
		long HoSoThuTucId, long BieuMauHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId,
			BieuMauHoSoId, start, end, orderByComparator);
	}

	/**
	* Returns the first tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucId_First(
		long HoSoThuTucId, long BieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucId_First(HoSoThuTucId,
			BieuMauHoSoId, orderByComparator);
	}

	/**
	* Returns the first tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucId_First(
		long HoSoThuTucId, long BieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBieuMauHoSoIdAndHoSoThuTucId_First(HoSoThuTucId,
			BieuMauHoSoId, orderByComparator);
	}

	/**
	* Returns the last tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucId_Last(
		long HoSoThuTucId, long BieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucId_Last(HoSoThuTucId,
			BieuMauHoSoId, orderByComparator);
	}

	/**
	* Returns the last tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucId_Last(
		long HoSoThuTucId, long BieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBieuMauHoSoIdAndHoSoThuTucId_Last(HoSoThuTucId,
			BieuMauHoSoId, orderByComparator);
	}

	/**
	* Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	*
	* @param Id the primary key of the current tthc noidung ho so
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc noidung ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo[] findByBieuMauHoSoIdAndHoSoThuTucId_PrevAndNext(
		long Id, long HoSoThuTucId, long BieuMauHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucId_PrevAndNext(Id,
			HoSoThuTucId, BieuMauHoSoId, orderByComparator);
	}

	/**
	* Removes all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; from the database.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByBieuMauHoSoIdAndHoSoThuTucId(long HoSoThuTucId,
		long BieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId, BieuMauHoSoId);
	}

	/**
	* Returns the number of tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63;.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByBieuMauHoSoIdAndHoSoThuTucId(long HoSoThuTucId,
		long BieuMauHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByBieuMauHoSoIdAndHoSoThuTucId(HoSoThuTucId,
			BieuMauHoSoId);
	}

	/**
	* Returns all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param MaTuSinh the ma tu sinh
	* @return the matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long HoSoThuTucId, long BieuMauHoSoId, java.lang.String MaTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
			BieuMauHoSoId, MaTuSinh);
	}

	/**
	* Returns a range of all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param MaTuSinh the ma tu sinh
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long HoSoThuTucId, long BieuMauHoSoId, java.lang.String MaTuSinh,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
			BieuMauHoSoId, MaTuSinh, start, end);
	}

	/**
	* Returns an ordered range of all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param MaTuSinh the ma tu sinh
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long HoSoThuTucId, long BieuMauHoSoId, java.lang.String MaTuSinh,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
			BieuMauHoSoId, MaTuSinh, start, end, orderByComparator);
	}

	/**
	* Returns the first tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param MaTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long HoSoThuTucId, long BieuMauHoSoId, java.lang.String MaTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(HoSoThuTucId,
			BieuMauHoSoId, MaTuSinh, orderByComparator);
	}

	/**
	* Returns the first tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param MaTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(
		long HoSoThuTucId, long BieuMauHoSoId, java.lang.String MaTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_First(HoSoThuTucId,
			BieuMauHoSoId, MaTuSinh, orderByComparator);
	}

	/**
	* Returns the last tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param MaTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long HoSoThuTucId, long BieuMauHoSoId, java.lang.String MaTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(HoSoThuTucId,
			BieuMauHoSoId, MaTuSinh, orderByComparator);
	}

	/**
	* Returns the last tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param MaTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc noidung ho so, or <code>null</code> if a matching tthc noidung ho so could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(
		long HoSoThuTucId, long BieuMauHoSoId, java.lang.String MaTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_Last(HoSoThuTucId,
			BieuMauHoSoId, MaTuSinh, orderByComparator);
	}

	/**
	* Returns the tthc noidung ho sos before and after the current tthc noidung ho so in the ordered set where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	*
	* @param Id the primary key of the current tthc noidung ho so
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param MaTuSinh the ma tu sinh
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc noidung ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo[] findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(
		long Id, long HoSoThuTucId, long BieuMauHoSoId,
		java.lang.String MaTuSinh,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence()
				   .findByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh_PrevAndNext(Id,
			HoSoThuTucId, BieuMauHoSoId, MaTuSinh, orderByComparator);
	}

	/**
	* Removes all the tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63; from the database.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param MaTuSinh the ma tu sinh
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long HoSoThuTucId, long BieuMauHoSoId, java.lang.String MaTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
			BieuMauHoSoId, MaTuSinh);
	}

	/**
	* Returns the number of tthc noidung ho sos where HoSoThuTucId = &#63; and BieuMauHoSoId = &#63; and MaTuSinh = &#63;.
	*
	* @param HoSoThuTucId the ho so thu tuc ID
	* @param BieuMauHoSoId the bieu mau ho so ID
	* @param MaTuSinh the ma tu sinh
	* @return the number of matching tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(
		long HoSoThuTucId, long BieuMauHoSoId, java.lang.String MaTuSinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByBieuMauHoSoIdAndHoSoThuTucIdAndMaTuSinh(HoSoThuTucId,
			BieuMauHoSoId, MaTuSinh);
	}

	/**
	* Caches the tthc noidung ho so in the entity cache if it is enabled.
	*
	* @param tthcNoidungHoSo the tthc noidung ho so
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo) {
		getPersistence().cacheResult(tthcNoidungHoSo);
	}

	/**
	* Caches the tthc noidung ho sos in the entity cache if it is enabled.
	*
	* @param tthcNoidungHoSos the tthc noidung ho sos
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> tthcNoidungHoSos) {
		getPersistence().cacheResult(tthcNoidungHoSos);
	}

	/**
	* Creates a new tthc noidung ho so with the primary key. Does not add the tthc noidung ho so to the database.
	*
	* @param Id the primary key for the new tthc noidung ho so
	* @return the new tthc noidung ho so
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the tthc noidung ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tthc noidung ho so
	* @return the tthc noidung ho so that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence().remove(Id);
	}

	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcNoidungHoSo);
	}

	/**
	* Returns the tthc noidung ho so with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException} if it could not be found.
	*
	* @param Id the primary key of the tthc noidung ho so
	* @return the tthc noidung ho so
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcNoidungHoSoException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the tthc noidung ho so with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the tthc noidung ho so
	* @return the tthc noidung ho so, or <code>null</code> if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the tthc noidung ho sos.
	*
	* @return the tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc noidung ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc noidung ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc noidung ho sos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc noidung ho sos.
	*
	* @return the number of tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcNoidungHoSoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcNoidungHoSoPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					TthcNoidungHoSoPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcNoidungHoSoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcNoidungHoSoPersistence persistence) {
	}

	private static TthcNoidungHoSoPersistence _persistence;
}