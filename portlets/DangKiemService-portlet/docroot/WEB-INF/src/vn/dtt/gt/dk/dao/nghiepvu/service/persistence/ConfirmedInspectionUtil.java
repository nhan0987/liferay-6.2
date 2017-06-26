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

package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;

import java.util.List;

/**
 * The persistence utility for the confirmed inspection service. This utility wraps {@link ConfirmedInspectionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see ConfirmedInspectionPersistence
 * @see ConfirmedInspectionPersistenceImpl
 * @generated
 */
public class ConfirmedInspectionUtil {
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
	public static void clearCache(ConfirmedInspection confirmedInspection) {
		getPersistence().clearCache(confirmedInspection);
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
	public static List<ConfirmedInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ConfirmedInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ConfirmedInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ConfirmedInspection update(
		ConfirmedInspection confirmedInspection) throws SystemException {
		return getPersistence().update(confirmedInspection);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ConfirmedInspection update(
		ConfirmedInspection confirmedInspection, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(confirmedInspection, serviceContext);
	}

	/**
	* Returns all the confirmed inspections where customsDeclarationId = &#63;.
	*
	* @param customsDeclarationId the customs declaration ID
	* @return the matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByCustomsDeclarationId(
		long customsDeclarationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCustomsDeclarationId(customsDeclarationId);
	}

	/**
	* Returns a range of all the confirmed inspections where customsDeclarationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param customsDeclarationId the customs declaration ID
	* @param start the lower bound of the range of confirmed inspections
	* @param end the upper bound of the range of confirmed inspections (not inclusive)
	* @return the range of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByCustomsDeclarationId(
		long customsDeclarationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCustomsDeclarationId(customsDeclarationId, start, end);
	}

	/**
	* Returns an ordered range of all the confirmed inspections where customsDeclarationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param customsDeclarationId the customs declaration ID
	* @param start the lower bound of the range of confirmed inspections
	* @param end the upper bound of the range of confirmed inspections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByCustomsDeclarationId(
		long customsDeclarationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCustomsDeclarationId(customsDeclarationId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	*
	* @param customsDeclarationId the customs declaration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByCustomsDeclarationId_First(
		long customsDeclarationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence()
				   .findByCustomsDeclarationId_First(customsDeclarationId,
			orderByComparator);
	}

	/**
	* Returns the first confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	*
	* @param customsDeclarationId the customs declaration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByCustomsDeclarationId_First(
		long customsDeclarationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCustomsDeclarationId_First(customsDeclarationId,
			orderByComparator);
	}

	/**
	* Returns the last confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	*
	* @param customsDeclarationId the customs declaration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByCustomsDeclarationId_Last(
		long customsDeclarationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence()
				   .findByCustomsDeclarationId_Last(customsDeclarationId,
			orderByComparator);
	}

	/**
	* Returns the last confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	*
	* @param customsDeclarationId the customs declaration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByCustomsDeclarationId_Last(
		long customsDeclarationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCustomsDeclarationId_Last(customsDeclarationId,
			orderByComparator);
	}

	/**
	* Returns the confirmed inspections before and after the current confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	*
	* @param id the primary key of the current confirmed inspection
	* @param customsDeclarationId the customs declaration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection[] findByCustomsDeclarationId_PrevAndNext(
		long id, long customsDeclarationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence()
				   .findByCustomsDeclarationId_PrevAndNext(id,
			customsDeclarationId, orderByComparator);
	}

	/**
	* Removes all the confirmed inspections where customsDeclarationId = &#63; from the database.
	*
	* @param customsDeclarationId the customs declaration ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCustomsDeclarationId(long customsDeclarationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCustomsDeclarationId(customsDeclarationId);
	}

	/**
	* Returns the number of confirmed inspections where customsDeclarationId = &#63;.
	*
	* @param customsDeclarationId the customs declaration ID
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCustomsDeclarationId(long customsDeclarationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCustomsDeclarationId(customsDeclarationId);
	}

	/**
	* Returns all the confirmed inspections where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns a range of all the confirmed inspections where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of confirmed inspections
	* @param end the upper bound of the range of confirmed inspections (not inclusive)
	* @return the range of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the confirmed inspections where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of confirmed inspections
	* @param end the upper bound of the range of confirmed inspections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoSoThuTucId(hoSoThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence()
				   .findByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the first confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence()
				   .findByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the confirmed inspections before and after the current confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current confirmed inspection
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence()
				   .findByHoSoThuTucId_PrevAndNext(id, hoSoThuTucId,
			orderByComparator);
	}

	/**
	* Removes all the confirmed inspections where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the number of confirmed inspections where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the confirmed inspection where phieuXuLyPhuId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence().findByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the confirmed inspection where phieuXuLyPhuId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the confirmed inspection where phieuXuLyPhuId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByPhieuXuLyPhuId(
		long phieuXuLyPhuId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyPhuId(phieuXuLyPhuId, retrieveFromCache);
	}

	/**
	* Removes the confirmed inspection where phieuXuLyPhuId = &#63; from the database.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the confirmed inspection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection removeByPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence().removeByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the number of confirmed inspections where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the confirmed inspection where corporationId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	*
	* @param corporationId the corporation ID
	* @return the matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence().findByCorporationId(corporationId);
	}

	/**
	* Returns the confirmed inspection where corporationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param corporationId the corporation ID
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCorporationId(corporationId);
	}

	/**
	* Returns the confirmed inspection where corporationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param corporationId the corporation ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByCorporationId(
		java.lang.String corporationId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCorporationId(corporationId, retrieveFromCache);
	}

	/**
	* Removes the confirmed inspection where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @return the confirmed inspection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection removeByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence().removeByCorporationId(corporationId);
	}

	/**
	* Returns the number of confirmed inspections where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCorporationId(java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCorporationId(corporationId);
	}

	/**
	* Returns the confirmed inspection where inspectorId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	*
	* @param inspectorId the inspector ID
	* @return the matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByInspectorId(
		long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence().findByInspectorId(inspectorId);
	}

	/**
	* Returns the confirmed inspection where inspectorId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectorId the inspector ID
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByInspectorId(
		long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByInspectorId(inspectorId);
	}

	/**
	* Returns the confirmed inspection where inspectorId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectorId the inspector ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByInspectorId(
		long inspectorId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectorId(inspectorId, retrieveFromCache);
	}

	/**
	* Removes the confirmed inspection where inspectorId = &#63; from the database.
	*
	* @param inspectorId the inspector ID
	* @return the confirmed inspection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection removeByInspectorId(
		long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence().removeByInspectorId(inspectorId);
	}

	/**
	* Returns the number of confirmed inspections where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectorId(long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByInspectorId(inspectorId);
	}

	/**
	* Returns all the confirmed inspections where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByRegisteredInspectionId(
		long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns a range of all the confirmed inspections where registeredInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registeredInspectionId the registered inspection ID
	* @param start the lower bound of the range of confirmed inspections
	* @param end the upper bound of the range of confirmed inspections (not inclusive)
	* @return the range of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegisteredInspectionId(registeredInspectionId, start,
			end);
	}

	/**
	* Returns an ordered range of all the confirmed inspections where registeredInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registeredInspectionId the registered inspection ID
	* @param start the lower bound of the range of confirmed inspections
	* @param end the upper bound of the range of confirmed inspections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegisteredInspectionId(registeredInspectionId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByRegisteredInspectionId_First(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence()
				   .findByRegisteredInspectionId_First(registeredInspectionId,
			orderByComparator);
	}

	/**
	* Returns the first confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByRegisteredInspectionId_First(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegisteredInspectionId_First(registeredInspectionId,
			orderByComparator);
	}

	/**
	* Returns the last confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByRegisteredInspectionId_Last(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence()
				   .findByRegisteredInspectionId_Last(registeredInspectionId,
			orderByComparator);
	}

	/**
	* Returns the last confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByRegisteredInspectionId_Last(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegisteredInspectionId_Last(registeredInspectionId,
			orderByComparator);
	}

	/**
	* Returns the confirmed inspections before and after the current confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	*
	* @param id the primary key of the current confirmed inspection
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection[] findByRegisteredInspectionId_PrevAndNext(
		long id, long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence()
				   .findByRegisteredInspectionId_PrevAndNext(id,
			registeredInspectionId, orderByComparator);
	}

	/**
	* Removes all the confirmed inspections where registeredInspectionId = &#63; from the database.
	*
	* @param registeredInspectionId the registered inspection ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRegisteredInspectionId(
		long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the number of confirmed inspections where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRegisteredInspectionId(long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the confirmed inspection where registeredInspectionId = &#63; and confirmationCode = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param confirmationCode the confirmation code
	* @return the matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByR_C(
		long registeredInspectionId, long confirmationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence()
				   .findByR_C(registeredInspectionId, confirmationCode);
	}

	/**
	* Returns the confirmed inspection where registeredInspectionId = &#63; and confirmationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param confirmationCode the confirmation code
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByR_C(
		long registeredInspectionId, long confirmationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByR_C(registeredInspectionId, confirmationCode);
	}

	/**
	* Returns the confirmed inspection where registeredInspectionId = &#63; and confirmationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param confirmationCode the confirmation code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByR_C(
		long registeredInspectionId, long confirmationCode,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByR_C(registeredInspectionId, confirmationCode,
			retrieveFromCache);
	}

	/**
	* Removes the confirmed inspection where registeredInspectionId = &#63; and confirmationCode = &#63; from the database.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param confirmationCode the confirmation code
	* @return the confirmed inspection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection removeByR_C(
		long registeredInspectionId, long confirmationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence()
				   .removeByR_C(registeredInspectionId, confirmationCode);
	}

	/**
	* Returns the number of confirmed inspections where registeredInspectionId = &#63; and confirmationCode = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param confirmationCode the confirmation code
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static int countByR_C(long registeredInspectionId,
		long confirmationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByR_C(registeredInspectionId, confirmationCode);
	}

	/**
	* Caches the confirmed inspection in the entity cache if it is enabled.
	*
	* @param confirmedInspection the confirmed inspection
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection confirmedInspection) {
		getPersistence().cacheResult(confirmedInspection);
	}

	/**
	* Caches the confirmed inspections in the entity cache if it is enabled.
	*
	* @param confirmedInspections the confirmed inspections
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> confirmedInspections) {
		getPersistence().cacheResult(confirmedInspections);
	}

	/**
	* Creates a new confirmed inspection with the primary key. Does not add the confirmed inspection to the database.
	*
	* @param id the primary key for the new confirmed inspection
	* @return the new confirmed inspection
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the confirmed inspection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the confirmed inspection
	* @return the confirmed inspection that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection confirmedInspection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(confirmedInspection);
	}

	/**
	* Returns the confirmed inspection with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	*
	* @param id the primary key of the confirmed inspection
	* @return the confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the confirmed inspection with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the confirmed inspection
	* @return the confirmed inspection, or <code>null</code> if a confirmed inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the confirmed inspections.
	*
	* @return the confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the confirmed inspections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of confirmed inspections
	* @param end the upper bound of the range of confirmed inspections (not inclusive)
	* @return the range of confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the confirmed inspections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of confirmed inspections
	* @param end the upper bound of the range of confirmed inspections (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the confirmed inspections from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of confirmed inspections.
	*
	* @return the number of confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ConfirmedInspectionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ConfirmedInspectionPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					ConfirmedInspectionPersistence.class.getName());

			ReferenceRegistry.registerReference(ConfirmedInspectionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ConfirmedInspectionPersistence persistence) {
	}

	private static ConfirmedInspectionPersistence _persistence;
}