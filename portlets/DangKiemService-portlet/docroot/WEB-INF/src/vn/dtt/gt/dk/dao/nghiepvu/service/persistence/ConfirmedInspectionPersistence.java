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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;

/**
 * The persistence interface for the confirmed inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see ConfirmedInspectionPersistenceImpl
 * @see ConfirmedInspectionUtil
 * @generated
 */
public interface ConfirmedInspectionPersistence extends BasePersistence<ConfirmedInspection> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConfirmedInspectionUtil} to access the confirmed inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the confirmed inspections where customsDeclarationId = &#63;.
	*
	* @param customsDeclarationId the customs declaration ID
	* @return the matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByCustomsDeclarationId(
		long customsDeclarationId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByCustomsDeclarationId(
		long customsDeclarationId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByCustomsDeclarationId(
		long customsDeclarationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	*
	* @param customsDeclarationId the customs declaration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByCustomsDeclarationId_First(
		long customsDeclarationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the first confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	*
	* @param customsDeclarationId the customs declaration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByCustomsDeclarationId_First(
		long customsDeclarationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	*
	* @param customsDeclarationId the customs declaration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByCustomsDeclarationId_Last(
		long customsDeclarationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the last confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	*
	* @param customsDeclarationId the customs declaration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByCustomsDeclarationId_Last(
		long customsDeclarationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection[] findByCustomsDeclarationId_PrevAndNext(
		long id, long customsDeclarationId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Removes all the confirmed inspections where customsDeclarationId = &#63; from the database.
	*
	* @param customsDeclarationId the customs declaration ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCustomsDeclarationId(long customsDeclarationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of confirmed inspections where customsDeclarationId = &#63;.
	*
	* @param customsDeclarationId the customs declaration ID
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public int countByCustomsDeclarationId(long customsDeclarationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the confirmed inspections where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the first confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the last confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Removes all the confirmed inspections where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of confirmed inspections where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the confirmed inspection where phieuXuLyPhuId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the confirmed inspection where phieuXuLyPhuId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the confirmed inspection where phieuXuLyPhuId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByPhieuXuLyPhuId(
		long phieuXuLyPhuId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the confirmed inspection where phieuXuLyPhuId = &#63; from the database.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the confirmed inspection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection removeByPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the number of confirmed inspections where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the confirmed inspection where corporationId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	*
	* @param corporationId the corporation ID
	* @return the matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the confirmed inspection where corporationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param corporationId the corporation ID
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the confirmed inspection where corporationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param corporationId the corporation ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByCorporationId(
		java.lang.String corporationId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the confirmed inspection where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @return the confirmed inspection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection removeByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the number of confirmed inspections where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public int countByCorporationId(java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the confirmed inspection where inspectorId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	*
	* @param inspectorId the inspector ID
	* @return the matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByInspectorId(
		long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the confirmed inspection where inspectorId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectorId the inspector ID
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByInspectorId(
		long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the confirmed inspection where inspectorId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectorId the inspector ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByInspectorId(
		long inspectorId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the confirmed inspection where inspectorId = &#63; from the database.
	*
	* @param inspectorId the inspector ID
	* @return the confirmed inspection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection removeByInspectorId(
		long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the number of confirmed inspections where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public int countByInspectorId(long inspectorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the confirmed inspections where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByRegisteredInspectionId(
		long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByRegisteredInspectionId_First(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the first confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByRegisteredInspectionId_First(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByRegisteredInspectionId_Last(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the last confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByRegisteredInspectionId_Last(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection[] findByRegisteredInspectionId_PrevAndNext(
		long id, long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Removes all the confirmed inspections where registeredInspectionId = &#63; from the database.
	*
	* @param registeredInspectionId the registered inspection ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRegisteredInspectionId(long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of confirmed inspections where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public int countByRegisteredInspectionId(long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the confirmed inspection where registeredInspectionId = &#63; and confirmationCode = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param confirmationCode the confirmation code
	* @return the matching confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByR_C(
		long registeredInspectionId, long confirmationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the confirmed inspection where registeredInspectionId = &#63; and confirmationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param confirmationCode the confirmation code
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByR_C(
		long registeredInspectionId, long confirmationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the confirmed inspection where registeredInspectionId = &#63; and confirmationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param confirmationCode the confirmation code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByR_C(
		long registeredInspectionId, long confirmationCode,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the confirmed inspection where registeredInspectionId = &#63; and confirmationCode = &#63; from the database.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param confirmationCode the confirmation code
	* @return the confirmed inspection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection removeByR_C(
		long registeredInspectionId, long confirmationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the number of confirmed inspections where registeredInspectionId = &#63; and confirmationCode = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param confirmationCode the confirmation code
	* @return the number of matching confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public int countByR_C(long registeredInspectionId, long confirmationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the confirmed inspection in the entity cache if it is enabled.
	*
	* @param confirmedInspection the confirmed inspection
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection confirmedInspection);

	/**
	* Caches the confirmed inspections in the entity cache if it is enabled.
	*
	* @param confirmedInspections the confirmed inspections
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> confirmedInspections);

	/**
	* Creates a new confirmed inspection with the primary key. Does not add the confirmed inspection to the database.
	*
	* @param id the primary key for the new confirmed inspection
	* @return the new confirmed inspection
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection create(long id);

	/**
	* Removes the confirmed inspection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the confirmed inspection
	* @return the confirmed inspection that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection confirmedInspection)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the confirmed inspection with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	*
	* @param id the primary key of the confirmed inspection
	* @return the confirmed inspection
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;

	/**
	* Returns the confirmed inspection with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the confirmed inspection
	* @return the confirmed inspection, or <code>null</code> if a confirmed inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the confirmed inspections.
	*
	* @return the confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the confirmed inspections from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of confirmed inspections.
	*
	* @return the number of confirmed inspections
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}