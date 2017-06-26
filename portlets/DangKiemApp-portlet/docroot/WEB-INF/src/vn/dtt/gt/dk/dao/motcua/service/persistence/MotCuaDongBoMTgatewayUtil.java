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

import vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway;

import java.util.List;

/**
 * The persistence utility for the mot cua dong bo m tgateway service. This utility wraps {@link MotCuaDongBoMTgatewayPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaDongBoMTgatewayPersistence
 * @see MotCuaDongBoMTgatewayPersistenceImpl
 * @generated
 */
public class MotCuaDongBoMTgatewayUtil {
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
	public static void clearCache(MotCuaDongBoMTgateway motCuaDongBoMTgateway) {
		getPersistence().clearCache(motCuaDongBoMTgateway);
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
	public static List<MotCuaDongBoMTgateway> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MotCuaDongBoMTgateway> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MotCuaDongBoMTgateway> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MotCuaDongBoMTgateway update(
		MotCuaDongBoMTgateway motCuaDongBoMTgateway) throws SystemException {
		return getPersistence().update(motCuaDongBoMTgateway);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MotCuaDongBoMTgateway update(
		MotCuaDongBoMTgateway motCuaDongBoMTgateway,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(motCuaDongBoMTgateway, serviceContext);
	}

	/**
	* Returns all the mot cua dong bo m tgatewaies where dienBienHoSoId = &#63;.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @return the matching mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> findByDienBienHoSoId(
		long dienBienHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDienBienHoSoId(dienBienHoSoId);
	}

	/**
	* Returns a range of all the mot cua dong bo m tgatewaies where dienBienHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @param start the lower bound of the range of mot cua dong bo m tgatewaies
	* @param end the upper bound of the range of mot cua dong bo m tgatewaies (not inclusive)
	* @return the range of matching mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> findByDienBienHoSoId(
		long dienBienHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDienBienHoSoId(dienBienHoSoId, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua dong bo m tgatewaies where dienBienHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @param start the lower bound of the range of mot cua dong bo m tgatewaies
	* @param end the upper bound of the range of mot cua dong bo m tgatewaies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> findByDienBienHoSoId(
		long dienBienHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDienBienHoSoId(dienBienHoSoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first mot cua dong bo m tgateway in the ordered set where dienBienHoSoId = &#63;.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dong bo m tgateway
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a matching mot cua dong bo m tgateway could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway findByDienBienHoSoId_First(
		long dienBienHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException {
		return getPersistence()
				   .findByDienBienHoSoId_First(dienBienHoSoId, orderByComparator);
	}

	/**
	* Returns the first mot cua dong bo m tgateway in the ordered set where dienBienHoSoId = &#63;.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dong bo m tgateway, or <code>null</code> if a matching mot cua dong bo m tgateway could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway fetchByDienBienHoSoId_First(
		long dienBienHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDienBienHoSoId_First(dienBienHoSoId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua dong bo m tgateway in the ordered set where dienBienHoSoId = &#63;.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dong bo m tgateway
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a matching mot cua dong bo m tgateway could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway findByDienBienHoSoId_Last(
		long dienBienHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException {
		return getPersistence()
				   .findByDienBienHoSoId_Last(dienBienHoSoId, orderByComparator);
	}

	/**
	* Returns the last mot cua dong bo m tgateway in the ordered set where dienBienHoSoId = &#63;.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dong bo m tgateway, or <code>null</code> if a matching mot cua dong bo m tgateway could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway fetchByDienBienHoSoId_Last(
		long dienBienHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDienBienHoSoId_Last(dienBienHoSoId, orderByComparator);
	}

	/**
	* Returns the mot cua dong bo m tgatewaies before and after the current mot cua dong bo m tgateway in the ordered set where dienBienHoSoId = &#63;.
	*
	* @param id the primary key of the current mot cua dong bo m tgateway
	* @param dienBienHoSoId the dien bien ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dong bo m tgateway
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a mot cua dong bo m tgateway with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway[] findByDienBienHoSoId_PrevAndNext(
		long id, long dienBienHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException {
		return getPersistence()
				   .findByDienBienHoSoId_PrevAndNext(id, dienBienHoSoId,
			orderByComparator);
	}

	/**
	* Removes all the mot cua dong bo m tgatewaies where dienBienHoSoId = &#63; from the database.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDienBienHoSoId(long dienBienHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDienBienHoSoId(dienBienHoSoId);
	}

	/**
	* Returns the number of mot cua dong bo m tgatewaies where dienBienHoSoId = &#63;.
	*
	* @param dienBienHoSoId the dien bien ho so ID
	* @return the number of matching mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDienBienHoSoId(long dienBienHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDienBienHoSoId(dienBienHoSoId);
	}

	/**
	* Returns all the mot cua dong bo m tgatewaies where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @return the matching mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> findByphieuXuLyChinhId(
		long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByphieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns a range of all the mot cua dong bo m tgatewaies where phieuXuLyChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param start the lower bound of the range of mot cua dong bo m tgatewaies
	* @param end the upper bound of the range of mot cua dong bo m tgatewaies (not inclusive)
	* @return the range of matching mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> findByphieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByphieuXuLyChinhId(phieuXuLyChinhId, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua dong bo m tgatewaies where phieuXuLyChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param start the lower bound of the range of mot cua dong bo m tgatewaies
	* @param end the upper bound of the range of mot cua dong bo m tgatewaies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> findByphieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByphieuXuLyChinhId(phieuXuLyChinhId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first mot cua dong bo m tgateway in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dong bo m tgateway
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a matching mot cua dong bo m tgateway could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway findByphieuXuLyChinhId_First(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException {
		return getPersistence()
				   .findByphieuXuLyChinhId_First(phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Returns the first mot cua dong bo m tgateway in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua dong bo m tgateway, or <code>null</code> if a matching mot cua dong bo m tgateway could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway fetchByphieuXuLyChinhId_First(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByphieuXuLyChinhId_First(phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua dong bo m tgateway in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dong bo m tgateway
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a matching mot cua dong bo m tgateway could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway findByphieuXuLyChinhId_Last(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException {
		return getPersistence()
				   .findByphieuXuLyChinhId_Last(phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua dong bo m tgateway in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua dong bo m tgateway, or <code>null</code> if a matching mot cua dong bo m tgateway could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway fetchByphieuXuLyChinhId_Last(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByphieuXuLyChinhId_Last(phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Returns the mot cua dong bo m tgatewaies before and after the current mot cua dong bo m tgateway in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param id the primary key of the current mot cua dong bo m tgateway
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua dong bo m tgateway
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a mot cua dong bo m tgateway with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway[] findByphieuXuLyChinhId_PrevAndNext(
		long id, long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException {
		return getPersistence()
				   .findByphieuXuLyChinhId_PrevAndNext(id, phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Removes all the mot cua dong bo m tgatewaies where phieuXuLyChinhId = &#63; from the database.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByphieuXuLyChinhId(long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByphieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns the number of mot cua dong bo m tgatewaies where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @return the number of matching mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByphieuXuLyChinhId(long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByphieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Caches the mot cua dong bo m tgateway in the entity cache if it is enabled.
	*
	* @param motCuaDongBoMTgateway the mot cua dong bo m tgateway
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway motCuaDongBoMTgateway) {
		getPersistence().cacheResult(motCuaDongBoMTgateway);
	}

	/**
	* Caches the mot cua dong bo m tgatewaies in the entity cache if it is enabled.
	*
	* @param motCuaDongBoMTgatewaies the mot cua dong bo m tgatewaies
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> motCuaDongBoMTgatewaies) {
		getPersistence().cacheResult(motCuaDongBoMTgatewaies);
	}

	/**
	* Creates a new mot cua dong bo m tgateway with the primary key. Does not add the mot cua dong bo m tgateway to the database.
	*
	* @param id the primary key for the new mot cua dong bo m tgateway
	* @return the new mot cua dong bo m tgateway
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the mot cua dong bo m tgateway with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua dong bo m tgateway
	* @return the mot cua dong bo m tgateway that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a mot cua dong bo m tgateway with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway motCuaDongBoMTgateway)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(motCuaDongBoMTgateway);
	}

	/**
	* Returns the mot cua dong bo m tgateway with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException} if it could not be found.
	*
	* @param id the primary key of the mot cua dong bo m tgateway
	* @return the mot cua dong bo m tgateway
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException if a mot cua dong bo m tgateway with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaDongBoMTgatewayException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the mot cua dong bo m tgateway with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua dong bo m tgateway
	* @return the mot cua dong bo m tgateway, or <code>null</code> if a mot cua dong bo m tgateway with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the mot cua dong bo m tgatewaies.
	*
	* @return the mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mot cua dong bo m tgatewaies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua dong bo m tgatewaies
	* @param end the upper bound of the range of mot cua dong bo m tgatewaies (not inclusive)
	* @return the range of mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mot cua dong bo m tgatewaies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDongBoMTgatewayModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua dong bo m tgatewaies
	* @param end the upper bound of the range of mot cua dong bo m tgatewaies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDongBoMTgateway> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mot cua dong bo m tgatewaies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mot cua dong bo m tgatewaies.
	*
	* @return the number of mot cua dong bo m tgatewaies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MotCuaDongBoMTgatewayPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MotCuaDongBoMTgatewayPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaDongBoMTgatewayPersistence.class.getName());

			ReferenceRegistry.registerReference(MotCuaDongBoMTgatewayUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MotCuaDongBoMTgatewayPersistence persistence) {
	}

	private static MotCuaDongBoMTgatewayPersistence _persistence;
}