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

import vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD;

import java.util.List;

/**
 * The persistence utility for the imported x c d service. This utility wraps {@link ImportedXCDPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ImportedXCDPersistence
 * @see ImportedXCDPersistenceImpl
 * @generated
 */
public class ImportedXCDUtil {
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
	public static void clearCache(ImportedXCD importedXCD) {
		getPersistence().clearCache(importedXCD);
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
	public static List<ImportedXCD> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ImportedXCD> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ImportedXCD> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ImportedXCD update(ImportedXCD importedXCD)
		throws SystemException {
		return getPersistence().update(importedXCD);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ImportedXCD update(ImportedXCD importedXCD,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(importedXCD, serviceContext);
	}

	/**
	* Returns all the imported x c ds where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @return the matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findByIDGCN(
		java.lang.String IDGCN, long trangthai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIDGCN(IDGCN, trangthai);
	}

	/**
	* Returns a range of all the imported x c ds where IDGCN = &#63; and trangthai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @return the range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findByIDGCN(
		java.lang.String IDGCN, long trangthai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIDGCN(IDGCN, trangthai, start, end);
	}

	/**
	* Returns an ordered range of all the imported x c ds where IDGCN = &#63; and trangthai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findByIDGCN(
		java.lang.String IDGCN, long trangthai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByIDGCN(IDGCN, trangthai, start, end, orderByComparator);
	}

	/**
	* Returns the first imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findByIDGCN_First(
		java.lang.String IDGCN, long trangthai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence()
				   .findByIDGCN_First(IDGCN, trangthai, orderByComparator);
	}

	/**
	* Returns the first imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchByIDGCN_First(
		java.lang.String IDGCN, long trangthai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIDGCN_First(IDGCN, trangthai, orderByComparator);
	}

	/**
	* Returns the last imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findByIDGCN_Last(
		java.lang.String IDGCN, long trangthai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence()
				   .findByIDGCN_Last(IDGCN, trangthai, orderByComparator);
	}

	/**
	* Returns the last imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchByIDGCN_Last(
		java.lang.String IDGCN, long trangthai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIDGCN_Last(IDGCN, trangthai, orderByComparator);
	}

	/**
	* Returns the imported x c ds before and after the current imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param id the primary key of the current imported x c d
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD[] findByIDGCN_PrevAndNext(
		long id, java.lang.String IDGCN, long trangthai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence()
				   .findByIDGCN_PrevAndNext(id, IDGCN, trangthai,
			orderByComparator);
	}

	/**
	* Removes all the imported x c ds where IDGCN = &#63; and trangthai = &#63; from the database.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByIDGCN(java.lang.String IDGCN, long trangthai)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByIDGCN(IDGCN, trangthai);
	}

	/**
	* Returns the number of imported x c ds where IDGCN = &#63; and trangthai = &#63;.
	*
	* @param IDGCN the i d g c n
	* @param trangthai the trangthai
	* @return the number of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static int countByIDGCN(java.lang.String IDGCN, long trangthai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByIDGCN(IDGCN, trangthai);
	}

	/**
	* Returns all the imported x c ds where SoDangKy = &#63;.
	*
	* @param SoDangKy the so dang ky
	* @return the matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoDangKy(
		java.lang.String SoDangKy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySoDangKy(SoDangKy);
	}

	/**
	* Returns a range of all the imported x c ds where SoDangKy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SoDangKy the so dang ky
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @return the range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoDangKy(
		java.lang.String SoDangKy, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySoDangKy(SoDangKy, start, end);
	}

	/**
	* Returns an ordered range of all the imported x c ds where SoDangKy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SoDangKy the so dang ky
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoDangKy(
		java.lang.String SoDangKy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySoDangKy(SoDangKy, start, end, orderByComparator);
	}

	/**
	* Returns the first imported x c d in the ordered set where SoDangKy = &#63;.
	*
	* @param SoDangKy the so dang ky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findBySoDangKy_First(
		java.lang.String SoDangKy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence().findBySoDangKy_First(SoDangKy, orderByComparator);
	}

	/**
	* Returns the first imported x c d in the ordered set where SoDangKy = &#63;.
	*
	* @param SoDangKy the so dang ky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchBySoDangKy_First(
		java.lang.String SoDangKy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySoDangKy_First(SoDangKy, orderByComparator);
	}

	/**
	* Returns the last imported x c d in the ordered set where SoDangKy = &#63;.
	*
	* @param SoDangKy the so dang ky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findBySoDangKy_Last(
		java.lang.String SoDangKy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence().findBySoDangKy_Last(SoDangKy, orderByComparator);
	}

	/**
	* Returns the last imported x c d in the ordered set where SoDangKy = &#63;.
	*
	* @param SoDangKy the so dang ky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchBySoDangKy_Last(
		java.lang.String SoDangKy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBySoDangKy_Last(SoDangKy, orderByComparator);
	}

	/**
	* Returns the imported x c ds before and after the current imported x c d in the ordered set where SoDangKy = &#63;.
	*
	* @param id the primary key of the current imported x c d
	* @param SoDangKy the so dang ky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD[] findBySoDangKy_PrevAndNext(
		long id, java.lang.String SoDangKy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence()
				   .findBySoDangKy_PrevAndNext(id, SoDangKy, orderByComparator);
	}

	/**
	* Removes all the imported x c ds where SoDangKy = &#63; from the database.
	*
	* @param SoDangKy the so dang ky
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySoDangKy(java.lang.String SoDangKy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySoDangKy(SoDangKy);
	}

	/**
	* Returns the number of imported x c ds where SoDangKy = &#63;.
	*
	* @param SoDangKy the so dang ky
	* @return the number of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySoDangKy(java.lang.String SoDangKy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySoDangKy(SoDangKy);
	}

	/**
	* Returns all the imported x c ds where SoBienBan = &#63;.
	*
	* @param SoBienBan the so bien ban
	* @return the matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoBienBan(
		java.lang.String SoBienBan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySoBienBan(SoBienBan);
	}

	/**
	* Returns a range of all the imported x c ds where SoBienBan = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SoBienBan the so bien ban
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @return the range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoBienBan(
		java.lang.String SoBienBan, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySoBienBan(SoBienBan, start, end);
	}

	/**
	* Returns an ordered range of all the imported x c ds where SoBienBan = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SoBienBan the so bien ban
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoBienBan(
		java.lang.String SoBienBan, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySoBienBan(SoBienBan, start, end, orderByComparator);
	}

	/**
	* Returns the first imported x c d in the ordered set where SoBienBan = &#63;.
	*
	* @param SoBienBan the so bien ban
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findBySoBienBan_First(
		java.lang.String SoBienBan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence()
				   .findBySoBienBan_First(SoBienBan, orderByComparator);
	}

	/**
	* Returns the first imported x c d in the ordered set where SoBienBan = &#63;.
	*
	* @param SoBienBan the so bien ban
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchBySoBienBan_First(
		java.lang.String SoBienBan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySoBienBan_First(SoBienBan, orderByComparator);
	}

	/**
	* Returns the last imported x c d in the ordered set where SoBienBan = &#63;.
	*
	* @param SoBienBan the so bien ban
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findBySoBienBan_Last(
		java.lang.String SoBienBan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence()
				   .findBySoBienBan_Last(SoBienBan, orderByComparator);
	}

	/**
	* Returns the last imported x c d in the ordered set where SoBienBan = &#63;.
	*
	* @param SoBienBan the so bien ban
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchBySoBienBan_Last(
		java.lang.String SoBienBan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySoBienBan_Last(SoBienBan, orderByComparator);
	}

	/**
	* Returns the imported x c ds before and after the current imported x c d in the ordered set where SoBienBan = &#63;.
	*
	* @param id the primary key of the current imported x c d
	* @param SoBienBan the so bien ban
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD[] findBySoBienBan_PrevAndNext(
		long id, java.lang.String SoBienBan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence()
				   .findBySoBienBan_PrevAndNext(id, SoBienBan, orderByComparator);
	}

	/**
	* Removes all the imported x c ds where SoBienBan = &#63; from the database.
	*
	* @param SoBienBan the so bien ban
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySoBienBan(java.lang.String SoBienBan)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySoBienBan(SoBienBan);
	}

	/**
	* Returns the number of imported x c ds where SoBienBan = &#63;.
	*
	* @param SoBienBan the so bien ban
	* @return the number of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySoBienBan(java.lang.String SoBienBan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySoBienBan(SoBienBan);
	}

	/**
	* Returns all the imported x c ds where SoToKhai = &#63;.
	*
	* @param SoToKhai the so to khai
	* @return the matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoToKhai(
		java.lang.String SoToKhai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySoToKhai(SoToKhai);
	}

	/**
	* Returns a range of all the imported x c ds where SoToKhai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SoToKhai the so to khai
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @return the range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoToKhai(
		java.lang.String SoToKhai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySoToKhai(SoToKhai, start, end);
	}

	/**
	* Returns an ordered range of all the imported x c ds where SoToKhai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SoToKhai the so to khai
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findBySoToKhai(
		java.lang.String SoToKhai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySoToKhai(SoToKhai, start, end, orderByComparator);
	}

	/**
	* Returns the first imported x c d in the ordered set where SoToKhai = &#63;.
	*
	* @param SoToKhai the so to khai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findBySoToKhai_First(
		java.lang.String SoToKhai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence().findBySoToKhai_First(SoToKhai, orderByComparator);
	}

	/**
	* Returns the first imported x c d in the ordered set where SoToKhai = &#63;.
	*
	* @param SoToKhai the so to khai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchBySoToKhai_First(
		java.lang.String SoToKhai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySoToKhai_First(SoToKhai, orderByComparator);
	}

	/**
	* Returns the last imported x c d in the ordered set where SoToKhai = &#63;.
	*
	* @param SoToKhai the so to khai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findBySoToKhai_Last(
		java.lang.String SoToKhai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence().findBySoToKhai_Last(SoToKhai, orderByComparator);
	}

	/**
	* Returns the last imported x c d in the ordered set where SoToKhai = &#63;.
	*
	* @param SoToKhai the so to khai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchBySoToKhai_Last(
		java.lang.String SoToKhai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBySoToKhai_Last(SoToKhai, orderByComparator);
	}

	/**
	* Returns the imported x c ds before and after the current imported x c d in the ordered set where SoToKhai = &#63;.
	*
	* @param id the primary key of the current imported x c d
	* @param SoToKhai the so to khai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD[] findBySoToKhai_PrevAndNext(
		long id, java.lang.String SoToKhai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence()
				   .findBySoToKhai_PrevAndNext(id, SoToKhai, orderByComparator);
	}

	/**
	* Removes all the imported x c ds where SoToKhai = &#63; from the database.
	*
	* @param SoToKhai the so to khai
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySoToKhai(java.lang.String SoToKhai)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySoToKhai(SoToKhai);
	}

	/**
	* Returns the number of imported x c ds where SoToKhai = &#63;.
	*
	* @param SoToKhai the so to khai
	* @return the number of matching imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySoToKhai(java.lang.String SoToKhai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySoToKhai(SoToKhai);
	}

	/**
	* Caches the imported x c d in the entity cache if it is enabled.
	*
	* @param importedXCD the imported x c d
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD importedXCD) {
		getPersistence().cacheResult(importedXCD);
	}

	/**
	* Caches the imported x c ds in the entity cache if it is enabled.
	*
	* @param importedXCDs the imported x c ds
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> importedXCDs) {
		getPersistence().cacheResult(importedXCDs);
	}

	/**
	* Creates a new imported x c d with the primary key. Does not add the imported x c d to the database.
	*
	* @param id the primary key for the new imported x c d
	* @return the new imported x c d
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the imported x c d with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the imported x c d
	* @return the imported x c d that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD importedXCD)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(importedXCD);
	}

	/**
	* Returns the imported x c d with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException} if it could not be found.
	*
	* @param id the primary key of the imported x c d
	* @return the imported x c d
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the imported x c d with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the imported x c d
	* @return the imported x c d, or <code>null</code> if a imported x c d with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the imported x c ds.
	*
	* @return the imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the imported x c ds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @return the range of imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the imported x c ds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imported x c ds
	* @param end the upper bound of the range of imported x c ds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the imported x c ds from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of imported x c ds.
	*
	* @return the number of imported x c ds
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ImportedXCDPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ImportedXCDPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					ImportedXCDPersistence.class.getName());

			ReferenceRegistry.registerReference(ImportedXCDUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ImportedXCDPersistence persistence) {
	}

	private static ImportedXCDPersistence _persistence;
}