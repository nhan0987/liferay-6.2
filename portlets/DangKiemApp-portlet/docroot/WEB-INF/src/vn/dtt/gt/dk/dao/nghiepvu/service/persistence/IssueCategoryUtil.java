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

import vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory;

import java.util.List;

/**
 * The persistence utility for the issue category service. This utility wraps {@link IssueCategoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see IssueCategoryPersistence
 * @see IssueCategoryPersistenceImpl
 * @generated
 */
public class IssueCategoryUtil {
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
	public static void clearCache(IssueCategory issueCategory) {
		getPersistence().clearCache(issueCategory);
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
	public static List<IssueCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<IssueCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<IssueCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static IssueCategory update(IssueCategory issueCategory)
		throws SystemException {
		return getPersistence().update(issueCategory);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static IssueCategory update(IssueCategory issueCategory,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(issueCategory, serviceContext);
	}

	/**
	* Returns all the issue categories where issuetrackingid = &#63;.
	*
	* @param issuetrackingid the issuetrackingid
	* @return the matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByIssueTrackingid(
		int issuetrackingid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByIssueTrackingid(issuetrackingid);
	}

	/**
	* Returns a range of all the issue categories where issuetrackingid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issuetrackingid the issuetrackingid
	* @param start the lower bound of the range of issue categories
	* @param end the upper bound of the range of issue categories (not inclusive)
	* @return the range of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByIssueTrackingid(
		int issuetrackingid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByIssueTrackingid(issuetrackingid, start, end);
	}

	/**
	* Returns an ordered range of all the issue categories where issuetrackingid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issuetrackingid the issuetrackingid
	* @param start the lower bound of the range of issue categories
	* @param end the upper bound of the range of issue categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByIssueTrackingid(
		int issuetrackingid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByIssueTrackingid(issuetrackingid, start, end,
			orderByComparator);
	}

	/**
	* Returns the first issue category in the ordered set where issuetrackingid = &#63;.
	*
	* @param issuetrackingid the issuetrackingid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByIssueTrackingid_First(
		int issuetrackingid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence()
				   .findByIssueTrackingid_First(issuetrackingid,
			orderByComparator);
	}

	/**
	* Returns the first issue category in the ordered set where issuetrackingid = &#63;.
	*
	* @param issuetrackingid the issuetrackingid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByIssueTrackingid_First(
		int issuetrackingid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIssueTrackingid_First(issuetrackingid,
			orderByComparator);
	}

	/**
	* Returns the last issue category in the ordered set where issuetrackingid = &#63;.
	*
	* @param issuetrackingid the issuetrackingid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByIssueTrackingid_Last(
		int issuetrackingid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence()
				   .findByIssueTrackingid_Last(issuetrackingid,
			orderByComparator);
	}

	/**
	* Returns the last issue category in the ordered set where issuetrackingid = &#63;.
	*
	* @param issuetrackingid the issuetrackingid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByIssueTrackingid_Last(
		int issuetrackingid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByIssueTrackingid_Last(issuetrackingid,
			orderByComparator);
	}

	/**
	* Returns the issue categories before and after the current issue category in the ordered set where issuetrackingid = &#63;.
	*
	* @param id the primary key of the current issue category
	* @param issuetrackingid the issuetrackingid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory[] findByIssueTrackingid_PrevAndNext(
		long id, int issuetrackingid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence()
				   .findByIssueTrackingid_PrevAndNext(id, issuetrackingid,
			orderByComparator);
	}

	/**
	* Removes all the issue categories where issuetrackingid = &#63; from the database.
	*
	* @param issuetrackingid the issuetrackingid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByIssueTrackingid(int issuetrackingid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByIssueTrackingid(issuetrackingid);
	}

	/**
	* Returns the number of issue categories where issuetrackingid = &#63;.
	*
	* @param issuetrackingid the issuetrackingid
	* @return the number of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByIssueTrackingid(int issuetrackingid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByIssueTrackingid(issuetrackingid);
	}

	/**
	* Returns all the issue categories where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @return the matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectCategoryCode(
		java.lang.String defectcategorycode, int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDefectCategoryCode(defectcategorycode,
			defectdatagroupid);
	}

	/**
	* Returns a range of all the issue categories where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param start the lower bound of the range of issue categories
	* @param end the upper bound of the range of issue categories (not inclusive)
	* @return the range of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectCategoryCode(
		java.lang.String defectcategorycode, int defectdatagroupid, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDefectCategoryCode(defectcategorycode,
			defectdatagroupid, start, end);
	}

	/**
	* Returns an ordered range of all the issue categories where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param start the lower bound of the range of issue categories
	* @param end the upper bound of the range of issue categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectCategoryCode(
		java.lang.String defectcategorycode, int defectdatagroupid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDefectCategoryCode(defectcategorycode,
			defectdatagroupid, start, end, orderByComparator);
	}

	/**
	* Returns the first issue category in the ordered set where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByDefectCategoryCode_First(
		java.lang.String defectcategorycode, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence()
				   .findByDefectCategoryCode_First(defectcategorycode,
			defectdatagroupid, orderByComparator);
	}

	/**
	* Returns the first issue category in the ordered set where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByDefectCategoryCode_First(
		java.lang.String defectcategorycode, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDefectCategoryCode_First(defectcategorycode,
			defectdatagroupid, orderByComparator);
	}

	/**
	* Returns the last issue category in the ordered set where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByDefectCategoryCode_Last(
		java.lang.String defectcategorycode, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence()
				   .findByDefectCategoryCode_Last(defectcategorycode,
			defectdatagroupid, orderByComparator);
	}

	/**
	* Returns the last issue category in the ordered set where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByDefectCategoryCode_Last(
		java.lang.String defectcategorycode, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDefectCategoryCode_Last(defectcategorycode,
			defectdatagroupid, orderByComparator);
	}

	/**
	* Returns the issue categories before and after the current issue category in the ordered set where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param id the primary key of the current issue category
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory[] findByDefectCategoryCode_PrevAndNext(
		long id, java.lang.String defectcategorycode, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence()
				   .findByDefectCategoryCode_PrevAndNext(id,
			defectcategorycode, defectdatagroupid, orderByComparator);
	}

	/**
	* Removes all the issue categories where defectcategorycode = &#63; and defectdatagroupid = &#63; from the database.
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDefectCategoryCode(
		java.lang.String defectcategorycode, int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDefectCategoryCode(defectcategorycode, defectdatagroupid);
	}

	/**
	* Returns the number of issue categories where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @return the number of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDefectCategoryCode(
		java.lang.String defectcategorycode, int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDefectCategoryCode(defectcategorycode,
			defectdatagroupid);
	}

	/**
	* Returns all the issue categories where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectdetection the defectdetection
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @return the matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectDetectionAndCategoryCode(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDefectDetectionAndCategoryCode(defectdetection,
			defectcategorycode, defectdatagroupid);
	}

	/**
	* Returns a range of all the issue categories where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param defectdetection the defectdetection
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param start the lower bound of the range of issue categories
	* @param end the upper bound of the range of issue categories (not inclusive)
	* @return the range of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectDetectionAndCategoryCode(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDefectDetectionAndCategoryCode(defectdetection,
			defectcategorycode, defectdatagroupid, start, end);
	}

	/**
	* Returns an ordered range of all the issue categories where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param defectdetection the defectdetection
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param start the lower bound of the range of issue categories
	* @param end the upper bound of the range of issue categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectDetectionAndCategoryCode(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDefectDetectionAndCategoryCode(defectdetection,
			defectcategorycode, defectdatagroupid, start, end, orderByComparator);
	}

	/**
	* Returns the first issue category in the ordered set where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectdetection the defectdetection
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByDefectDetectionAndCategoryCode_First(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence()
				   .findByDefectDetectionAndCategoryCode_First(defectdetection,
			defectcategorycode, defectdatagroupid, orderByComparator);
	}

	/**
	* Returns the first issue category in the ordered set where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectdetection the defectdetection
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByDefectDetectionAndCategoryCode_First(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDefectDetectionAndCategoryCode_First(defectdetection,
			defectcategorycode, defectdatagroupid, orderByComparator);
	}

	/**
	* Returns the last issue category in the ordered set where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectdetection the defectdetection
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByDefectDetectionAndCategoryCode_Last(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence()
				   .findByDefectDetectionAndCategoryCode_Last(defectdetection,
			defectcategorycode, defectdatagroupid, orderByComparator);
	}

	/**
	* Returns the last issue category in the ordered set where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectdetection the defectdetection
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByDefectDetectionAndCategoryCode_Last(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDefectDetectionAndCategoryCode_Last(defectdetection,
			defectcategorycode, defectdatagroupid, orderByComparator);
	}

	/**
	* Returns the issue categories before and after the current issue category in the ordered set where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param id the primary key of the current issue category
	* @param defectdetection the defectdetection
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory[] findByDefectDetectionAndCategoryCode_PrevAndNext(
		long id, int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence()
				   .findByDefectDetectionAndCategoryCode_PrevAndNext(id,
			defectdetection, defectcategorycode, defectdatagroupid,
			orderByComparator);
	}

	/**
	* Removes all the issue categories where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63; from the database.
	*
	* @param defectdetection the defectdetection
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDefectDetectionAndCategoryCode(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDefectDetectionAndCategoryCode(defectdetection,
			defectcategorycode, defectdatagroupid);
	}

	/**
	* Returns the number of issue categories where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectdetection the defectdetection
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @return the number of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDefectDetectionAndCategoryCode(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDefectDetectionAndCategoryCode(defectdetection,
			defectcategorycode, defectdatagroupid);
	}

	/**
	* Returns all the issue categories where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @return the matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectCategoryShortname(
		java.lang.String defectcategoryshortname, int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDefectCategoryShortname(defectcategoryshortname,
			defectdatagroupid);
	}

	/**
	* Returns a range of all the issue categories where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @param start the lower bound of the range of issue categories
	* @param end the upper bound of the range of issue categories (not inclusive)
	* @return the range of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectCategoryShortname(
		java.lang.String defectcategoryshortname, int defectdatagroupid,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDefectCategoryShortname(defectcategoryshortname,
			defectdatagroupid, start, end);
	}

	/**
	* Returns an ordered range of all the issue categories where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @param start the lower bound of the range of issue categories
	* @param end the upper bound of the range of issue categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectCategoryShortname(
		java.lang.String defectcategoryshortname, int defectdatagroupid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDefectCategoryShortname(defectcategoryshortname,
			defectdatagroupid, start, end, orderByComparator);
	}

	/**
	* Returns the first issue category in the ordered set where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByDefectCategoryShortname_First(
		java.lang.String defectcategoryshortname, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence()
				   .findByDefectCategoryShortname_First(defectcategoryshortname,
			defectdatagroupid, orderByComparator);
	}

	/**
	* Returns the first issue category in the ordered set where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByDefectCategoryShortname_First(
		java.lang.String defectcategoryshortname, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDefectCategoryShortname_First(defectcategoryshortname,
			defectdatagroupid, orderByComparator);
	}

	/**
	* Returns the last issue category in the ordered set where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByDefectCategoryShortname_Last(
		java.lang.String defectcategoryshortname, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence()
				   .findByDefectCategoryShortname_Last(defectcategoryshortname,
			defectdatagroupid, orderByComparator);
	}

	/**
	* Returns the last issue category in the ordered set where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByDefectCategoryShortname_Last(
		java.lang.String defectcategoryshortname, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDefectCategoryShortname_Last(defectcategoryshortname,
			defectdatagroupid, orderByComparator);
	}

	/**
	* Returns the issue categories before and after the current issue category in the ordered set where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	*
	* @param id the primary key of the current issue category
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory[] findByDefectCategoryShortname_PrevAndNext(
		long id, java.lang.String defectcategoryshortname,
		int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence()
				   .findByDefectCategoryShortname_PrevAndNext(id,
			defectcategoryshortname, defectdatagroupid, orderByComparator);
	}

	/**
	* Removes all the issue categories where defectcategoryshortname = &#63; and defectdatagroupid = &#63; from the database.
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDefectCategoryShortname(
		java.lang.String defectcategoryshortname, int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDefectCategoryShortname(defectcategoryshortname,
			defectdatagroupid);
	}

	/**
	* Returns the number of issue categories where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @return the number of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDefectCategoryShortname(
		java.lang.String defectcategoryshortname, int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDefectCategoryShortname(defectcategoryshortname,
			defectdatagroupid);
	}

	/**
	* Caches the issue category in the entity cache if it is enabled.
	*
	* @param issueCategory the issue category
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory issueCategory) {
		getPersistence().cacheResult(issueCategory);
	}

	/**
	* Caches the issue categories in the entity cache if it is enabled.
	*
	* @param issueCategories the issue categories
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> issueCategories) {
		getPersistence().cacheResult(issueCategories);
	}

	/**
	* Creates a new issue category with the primary key. Does not add the issue category to the database.
	*
	* @param id the primary key for the new issue category
	* @return the new issue category
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the issue category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue category
	* @return the issue category that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory issueCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(issueCategory);
	}

	/**
	* Returns the issue category with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException} if it could not be found.
	*
	* @param id the primary key of the issue category
	* @return the issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the issue category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the issue category
	* @return the issue category, or <code>null</code> if a issue category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the issue categories.
	*
	* @return the issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the issue categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue categories
	* @param end the upper bound of the range of issue categories (not inclusive)
	* @return the range of issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the issue categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue categories
	* @param end the upper bound of the range of issue categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the issue categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of issue categories.
	*
	* @return the number of issue categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static IssueCategoryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (IssueCategoryPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					IssueCategoryPersistence.class.getName());

			ReferenceRegistry.registerReference(IssueCategoryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(IssueCategoryPersistence persistence) {
	}

	private static IssueCategoryPersistence _persistence;
}