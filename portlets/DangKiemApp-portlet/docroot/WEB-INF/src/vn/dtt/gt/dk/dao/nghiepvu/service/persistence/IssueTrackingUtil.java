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

import vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking;

import java.util.List;

/**
 * The persistence utility for the issue tracking service. This utility wraps {@link IssueTrackingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see IssueTrackingPersistence
 * @see IssueTrackingPersistenceImpl
 * @generated
 */
public class IssueTrackingUtil {
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
	public static void clearCache(IssueTracking issueTracking) {
		getPersistence().clearCache(issueTracking);
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
	public static List<IssueTracking> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<IssueTracking> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<IssueTracking> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static IssueTracking update(IssueTracking issueTracking)
		throws SystemException {
		return getPersistence().update(issueTracking);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static IssueTracking update(IssueTracking issueTracking,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(issueTracking, serviceContext);
	}

	/**
	* Returns all the issue trackings where importercode = &#63;.
	*
	* @param importercode the importercode
	* @return the matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByImporterCode(
		java.lang.String importercode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByImporterCode(importercode);
	}

	/**
	* Returns a range of all the issue trackings where importercode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercode the importercode
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @return the range of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByImporterCode(
		java.lang.String importercode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByImporterCode(importercode, start, end);
	}

	/**
	* Returns an ordered range of all the issue trackings where importercode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercode the importercode
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByImporterCode(
		java.lang.String importercode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCode(importercode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first issue tracking in the ordered set where importercode = &#63;.
	*
	* @param importercode the importercode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking findByImporterCode_First(
		java.lang.String importercode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByImporterCode_First(importercode, orderByComparator);
	}

	/**
	* Returns the first issue tracking in the ordered set where importercode = &#63;.
	*
	* @param importercode the importercode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchByImporterCode_First(
		java.lang.String importercode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCode_First(importercode, orderByComparator);
	}

	/**
	* Returns the last issue tracking in the ordered set where importercode = &#63;.
	*
	* @param importercode the importercode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking findByImporterCode_Last(
		java.lang.String importercode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByImporterCode_Last(importercode, orderByComparator);
	}

	/**
	* Returns the last issue tracking in the ordered set where importercode = &#63;.
	*
	* @param importercode the importercode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchByImporterCode_Last(
		java.lang.String importercode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCode_Last(importercode, orderByComparator);
	}

	/**
	* Returns the issue trackings before and after the current issue tracking in the ordered set where importercode = &#63;.
	*
	* @param id the primary key of the current issue tracking
	* @param importercode the importercode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking[] findByImporterCode_PrevAndNext(
		long id, java.lang.String importercode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByImporterCode_PrevAndNext(id, importercode,
			orderByComparator);
	}

	/**
	* Removes all the issue trackings where importercode = &#63; from the database.
	*
	* @param importercode the importercode
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByImporterCode(java.lang.String importercode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByImporterCode(importercode);
	}

	/**
	* Returns the number of issue trackings where importercode = &#63;.
	*
	* @param importercode the importercode
	* @return the number of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByImporterCode(java.lang.String importercode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByImporterCode(importercode);
	}

	/**
	* Returns all the issue trackings where registerednumber = &#63;.
	*
	* @param registerednumber the registerednumber
	* @return the matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByRegisteredNumber(
		java.lang.String registerednumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByRegisteredNumber(registerednumber);
	}

	/**
	* Returns a range of all the issue trackings where registerednumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registerednumber the registerednumber
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @return the range of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByRegisteredNumber(
		java.lang.String registerednumber, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegisteredNumber(registerednumber, start, end);
	}

	/**
	* Returns an ordered range of all the issue trackings where registerednumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registerednumber the registerednumber
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByRegisteredNumber(
		java.lang.String registerednumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegisteredNumber(registerednumber, start, end,
			orderByComparator);
	}

	/**
	* Returns the first issue tracking in the ordered set where registerednumber = &#63;.
	*
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking findByRegisteredNumber_First(
		java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByRegisteredNumber_First(registerednumber,
			orderByComparator);
	}

	/**
	* Returns the first issue tracking in the ordered set where registerednumber = &#63;.
	*
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchByRegisteredNumber_First(
		java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegisteredNumber_First(registerednumber,
			orderByComparator);
	}

	/**
	* Returns the last issue tracking in the ordered set where registerednumber = &#63;.
	*
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking findByRegisteredNumber_Last(
		java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByRegisteredNumber_Last(registerednumber,
			orderByComparator);
	}

	/**
	* Returns the last issue tracking in the ordered set where registerednumber = &#63;.
	*
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchByRegisteredNumber_Last(
		java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegisteredNumber_Last(registerednumber,
			orderByComparator);
	}

	/**
	* Returns the issue trackings before and after the current issue tracking in the ordered set where registerednumber = &#63;.
	*
	* @param id the primary key of the current issue tracking
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking[] findByRegisteredNumber_PrevAndNext(
		long id, java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByRegisteredNumber_PrevAndNext(id, registerednumber,
			orderByComparator);
	}

	/**
	* Removes all the issue trackings where registerednumber = &#63; from the database.
	*
	* @param registerednumber the registerednumber
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRegisteredNumber(
		java.lang.String registerednumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRegisteredNumber(registerednumber);
	}

	/**
	* Returns the number of issue trackings where registerednumber = &#63;.
	*
	* @param registerednumber the registerednumber
	* @return the number of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRegisteredNumber(java.lang.String registerednumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByRegisteredNumber(registerednumber);
	}

	/**
	* Returns all the issue trackings where inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @return the matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByInspectionRecordno(
		java.lang.String inspectionrecordno, java.lang.String registerednumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectionRecordno(inspectionrecordno,
			registerednumber);
	}

	/**
	* Returns a range of all the issue trackings where inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @return the range of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByInspectionRecordno(
		java.lang.String inspectionrecordno, java.lang.String registerednumber,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectionRecordno(inspectionrecordno,
			registerednumber, start, end);
	}

	/**
	* Returns an ordered range of all the issue trackings where inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByInspectionRecordno(
		java.lang.String inspectionrecordno, java.lang.String registerednumber,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectionRecordno(inspectionrecordno,
			registerednumber, start, end, orderByComparator);
	}

	/**
	* Returns the first issue tracking in the ordered set where inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking findByInspectionRecordno_First(
		java.lang.String inspectionrecordno, java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByInspectionRecordno_First(inspectionrecordno,
			registerednumber, orderByComparator);
	}

	/**
	* Returns the first issue tracking in the ordered set where inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchByInspectionRecordno_First(
		java.lang.String inspectionrecordno, java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectionRecordno_First(inspectionrecordno,
			registerednumber, orderByComparator);
	}

	/**
	* Returns the last issue tracking in the ordered set where inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking findByInspectionRecordno_Last(
		java.lang.String inspectionrecordno, java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByInspectionRecordno_Last(inspectionrecordno,
			registerednumber, orderByComparator);
	}

	/**
	* Returns the last issue tracking in the ordered set where inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchByInspectionRecordno_Last(
		java.lang.String inspectionrecordno, java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectionRecordno_Last(inspectionrecordno,
			registerednumber, orderByComparator);
	}

	/**
	* Returns the issue trackings before and after the current issue tracking in the ordered set where inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param id the primary key of the current issue tracking
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking[] findByInspectionRecordno_PrevAndNext(
		long id, java.lang.String inspectionrecordno,
		java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByInspectionRecordno_PrevAndNext(id,
			inspectionrecordno, registerednumber, orderByComparator);
	}

	/**
	* Removes all the issue trackings where inspectionrecordno = &#63; and registerednumber = &#63; from the database.
	*
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByInspectionRecordno(
		java.lang.String inspectionrecordno, java.lang.String registerednumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByInspectionRecordno(inspectionrecordno, registerednumber);
	}

	/**
	* Returns the number of issue trackings where inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @return the number of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectionRecordno(
		java.lang.String inspectionrecordno, java.lang.String registerednumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByInspectionRecordno(inspectionrecordno,
			registerednumber);
	}

	/**
	* Returns all the issue trackings where importername = &#63;.
	*
	* @param importername the importername
	* @return the matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByImporterName(
		java.lang.String importername)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByImporterName(importername);
	}

	/**
	* Returns a range of all the issue trackings where importername = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importername the importername
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @return the range of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByImporterName(
		java.lang.String importername, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByImporterName(importername, start, end);
	}

	/**
	* Returns an ordered range of all the issue trackings where importername = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importername the importername
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByImporterName(
		java.lang.String importername, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterName(importername, start, end,
			orderByComparator);
	}

	/**
	* Returns the first issue tracking in the ordered set where importername = &#63;.
	*
	* @param importername the importername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking findByImporterName_First(
		java.lang.String importername,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByImporterName_First(importername, orderByComparator);
	}

	/**
	* Returns the first issue tracking in the ordered set where importername = &#63;.
	*
	* @param importername the importername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchByImporterName_First(
		java.lang.String importername,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterName_First(importername, orderByComparator);
	}

	/**
	* Returns the last issue tracking in the ordered set where importername = &#63;.
	*
	* @param importername the importername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking findByImporterName_Last(
		java.lang.String importername,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByImporterName_Last(importername, orderByComparator);
	}

	/**
	* Returns the last issue tracking in the ordered set where importername = &#63;.
	*
	* @param importername the importername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchByImporterName_Last(
		java.lang.String importername,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterName_Last(importername, orderByComparator);
	}

	/**
	* Returns the issue trackings before and after the current issue tracking in the ordered set where importername = &#63;.
	*
	* @param id the primary key of the current issue tracking
	* @param importername the importername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking[] findByImporterName_PrevAndNext(
		long id, java.lang.String importername,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByImporterName_PrevAndNext(id, importername,
			orderByComparator);
	}

	/**
	* Removes all the issue trackings where importername = &#63; from the database.
	*
	* @param importername the importername
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByImporterName(java.lang.String importername)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByImporterName(importername);
	}

	/**
	* Returns the number of issue trackings where importername = &#63;.
	*
	* @param importername the importername
	* @return the number of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByImporterName(java.lang.String importername)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByImporterName(importername);
	}

	/**
	* Returns all the issue trackings where productcode = &#63;.
	*
	* @param productcode the productcode
	* @return the matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByProductCode(
		java.lang.String productcode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByProductCode(productcode);
	}

	/**
	* Returns a range of all the issue trackings where productcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productcode the productcode
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @return the range of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByProductCode(
		java.lang.String productcode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByProductCode(productcode, start, end);
	}

	/**
	* Returns an ordered range of all the issue trackings where productcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productcode the productcode
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByProductCode(
		java.lang.String productcode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductCode(productcode, start, end, orderByComparator);
	}

	/**
	* Returns the first issue tracking in the ordered set where productcode = &#63;.
	*
	* @param productcode the productcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking findByProductCode_First(
		java.lang.String productcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByProductCode_First(productcode, orderByComparator);
	}

	/**
	* Returns the first issue tracking in the ordered set where productcode = &#63;.
	*
	* @param productcode the productcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchByProductCode_First(
		java.lang.String productcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductCode_First(productcode, orderByComparator);
	}

	/**
	* Returns the last issue tracking in the ordered set where productcode = &#63;.
	*
	* @param productcode the productcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking findByProductCode_Last(
		java.lang.String productcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByProductCode_Last(productcode, orderByComparator);
	}

	/**
	* Returns the last issue tracking in the ordered set where productcode = &#63;.
	*
	* @param productcode the productcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchByProductCode_Last(
		java.lang.String productcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductCode_Last(productcode, orderByComparator);
	}

	/**
	* Returns the issue trackings before and after the current issue tracking in the ordered set where productcode = &#63;.
	*
	* @param id the primary key of the current issue tracking
	* @param productcode the productcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking[] findByProductCode_PrevAndNext(
		long id, java.lang.String productcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByProductCode_PrevAndNext(id, productcode,
			orderByComparator);
	}

	/**
	* Removes all the issue trackings where productcode = &#63; from the database.
	*
	* @param productcode the productcode
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByProductCode(java.lang.String productcode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByProductCode(productcode);
	}

	/**
	* Returns the number of issue trackings where productcode = &#63;.
	*
	* @param productcode the productcode
	* @return the number of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductCode(java.lang.String productcode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByProductCode(productcode);
	}

	/**
	* Returns all the issue trackings where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param defectStatus the defect status
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @return the matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByDefectStatus(
		int defectStatus, java.lang.String inspectionrecordno,
		java.lang.String registerednumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDefectStatus(defectStatus, inspectionrecordno,
			registerednumber);
	}

	/**
	* Returns a range of all the issue trackings where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param defectStatus the defect status
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @return the range of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByDefectStatus(
		int defectStatus, java.lang.String inspectionrecordno,
		java.lang.String registerednumber, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDefectStatus(defectStatus, inspectionrecordno,
			registerednumber, start, end);
	}

	/**
	* Returns an ordered range of all the issue trackings where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param defectStatus the defect status
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByDefectStatus(
		int defectStatus, java.lang.String inspectionrecordno,
		java.lang.String registerednumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDefectStatus(defectStatus, inspectionrecordno,
			registerednumber, start, end, orderByComparator);
	}

	/**
	* Returns the first issue tracking in the ordered set where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param defectStatus the defect status
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking findByDefectStatus_First(
		int defectStatus, java.lang.String inspectionrecordno,
		java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByDefectStatus_First(defectStatus, inspectionrecordno,
			registerednumber, orderByComparator);
	}

	/**
	* Returns the first issue tracking in the ordered set where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param defectStatus the defect status
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchByDefectStatus_First(
		int defectStatus, java.lang.String inspectionrecordno,
		java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDefectStatus_First(defectStatus, inspectionrecordno,
			registerednumber, orderByComparator);
	}

	/**
	* Returns the last issue tracking in the ordered set where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param defectStatus the defect status
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking findByDefectStatus_Last(
		int defectStatus, java.lang.String inspectionrecordno,
		java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByDefectStatus_Last(defectStatus, inspectionrecordno,
			registerednumber, orderByComparator);
	}

	/**
	* Returns the last issue tracking in the ordered set where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param defectStatus the defect status
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchByDefectStatus_Last(
		int defectStatus, java.lang.String inspectionrecordno,
		java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDefectStatus_Last(defectStatus, inspectionrecordno,
			registerednumber, orderByComparator);
	}

	/**
	* Returns the issue trackings before and after the current issue tracking in the ordered set where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param id the primary key of the current issue tracking
	* @param defectStatus the defect status
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking[] findByDefectStatus_PrevAndNext(
		long id, int defectStatus, java.lang.String inspectionrecordno,
		java.lang.String registerednumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence()
				   .findByDefectStatus_PrevAndNext(id, defectStatus,
			inspectionrecordno, registerednumber, orderByComparator);
	}

	/**
	* Removes all the issue trackings where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63; from the database.
	*
	* @param defectStatus the defect status
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDefectStatus(int defectStatus,
		java.lang.String inspectionrecordno, java.lang.String registerednumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDefectStatus(defectStatus, inspectionrecordno,
			registerednumber);
	}

	/**
	* Returns the number of issue trackings where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	*
	* @param defectStatus the defect status
	* @param inspectionrecordno the inspectionrecordno
	* @param registerednumber the registerednumber
	* @return the number of matching issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDefectStatus(int defectStatus,
		java.lang.String inspectionrecordno, java.lang.String registerednumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDefectStatus(defectStatus, inspectionrecordno,
			registerednumber);
	}

	/**
	* Caches the issue tracking in the entity cache if it is enabled.
	*
	* @param issueTracking the issue tracking
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking issueTracking) {
		getPersistence().cacheResult(issueTracking);
	}

	/**
	* Caches the issue trackings in the entity cache if it is enabled.
	*
	* @param issueTrackings the issue trackings
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> issueTrackings) {
		getPersistence().cacheResult(issueTrackings);
	}

	/**
	* Creates a new issue tracking with the primary key. Does not add the issue tracking to the database.
	*
	* @param id the primary key for the new issue tracking
	* @return the new issue tracking
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the issue tracking with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue tracking
	* @return the issue tracking that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking issueTracking)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(issueTracking);
	}

	/**
	* Returns the issue tracking with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException} if it could not be found.
	*
	* @param id the primary key of the issue tracking
	* @return the issue tracking
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the issue tracking with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the issue tracking
	* @return the issue tracking, or <code>null</code> if a issue tracking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the issue trackings.
	*
	* @return the issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the issue trackings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @return the range of issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the issue trackings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the issue trackings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of issue trackings.
	*
	* @return the number of issue trackings
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static IssueTrackingPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (IssueTrackingPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					IssueTrackingPersistence.class.getName());

			ReferenceRegistry.registerReference(IssueTrackingUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(IssueTrackingPersistence persistence) {
	}

	private static IssueTrackingPersistence _persistence;
}