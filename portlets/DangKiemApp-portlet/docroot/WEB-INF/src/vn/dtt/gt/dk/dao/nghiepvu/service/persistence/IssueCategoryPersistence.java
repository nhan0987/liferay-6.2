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

import vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory;

/**
 * The persistence interface for the issue category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see IssueCategoryPersistenceImpl
 * @see IssueCategoryUtil
 * @generated
 */
public interface IssueCategoryPersistence extends BasePersistence<IssueCategory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link IssueCategoryUtil} to access the issue category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the issue categories where issuetrackingid = &#63;.
	*
	* @param issuetrackingid the issuetrackingid
	* @return the matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByIssueTrackingid(
		int issuetrackingid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByIssueTrackingid(
		int issuetrackingid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByIssueTrackingid(
		int issuetrackingid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first issue category in the ordered set where issuetrackingid = &#63;.
	*
	* @param issuetrackingid the issuetrackingid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByIssueTrackingid_First(
		int issuetrackingid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

	/**
	* Returns the first issue category in the ordered set where issuetrackingid = &#63;.
	*
	* @param issuetrackingid the issuetrackingid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByIssueTrackingid_First(
		int issuetrackingid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last issue category in the ordered set where issuetrackingid = &#63;.
	*
	* @param issuetrackingid the issuetrackingid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByIssueTrackingid_Last(
		int issuetrackingid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

	/**
	* Returns the last issue category in the ordered set where issuetrackingid = &#63;.
	*
	* @param issuetrackingid the issuetrackingid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByIssueTrackingid_Last(
		int issuetrackingid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory[] findByIssueTrackingid_PrevAndNext(
		long id, int issuetrackingid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

	/**
	* Removes all the issue categories where issuetrackingid = &#63; from the database.
	*
	* @param issuetrackingid the issuetrackingid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByIssueTrackingid(int issuetrackingid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of issue categories where issuetrackingid = &#63;.
	*
	* @param issuetrackingid the issuetrackingid
	* @return the number of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public int countByIssueTrackingid(int issuetrackingid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the issue categories where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @return the matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectCategoryCode(
		java.lang.String defectcategorycode, int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectCategoryCode(
		java.lang.String defectcategorycode, int defectdatagroupid, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectCategoryCode(
		java.lang.String defectcategorycode, int defectdatagroupid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByDefectCategoryCode_First(
		java.lang.String defectcategorycode, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

	/**
	* Returns the first issue category in the ordered set where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByDefectCategoryCode_First(
		java.lang.String defectcategorycode, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByDefectCategoryCode_Last(
		java.lang.String defectcategorycode, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

	/**
	* Returns the last issue category in the ordered set where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByDefectCategoryCode_Last(
		java.lang.String defectcategorycode, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory[] findByDefectCategoryCode_PrevAndNext(
		long id, java.lang.String defectcategorycode, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

	/**
	* Removes all the issue categories where defectcategorycode = &#63; and defectdatagroupid = &#63; from the database.
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDefectCategoryCode(
		java.lang.String defectcategorycode, int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of issue categories where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @return the number of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public int countByDefectCategoryCode(java.lang.String defectcategorycode,
		int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the issue categories where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectdetection the defectdetection
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @return the matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectDetectionAndCategoryCode(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectDetectionAndCategoryCode(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectDetectionAndCategoryCode(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByDefectDetectionAndCategoryCode_First(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByDefectDetectionAndCategoryCode_First(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByDefectDetectionAndCategoryCode_Last(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByDefectDetectionAndCategoryCode_Last(
		int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory[] findByDefectDetectionAndCategoryCode_PrevAndNext(
		long id, int defectdetection, java.lang.String defectcategorycode,
		int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

	/**
	* Removes all the issue categories where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63; from the database.
	*
	* @param defectdetection the defectdetection
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDefectDetectionAndCategoryCode(int defectdetection,
		java.lang.String defectcategorycode, int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of issue categories where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectdetection the defectdetection
	* @param defectcategorycode the defectcategorycode
	* @param defectdatagroupid the defectdatagroupid
	* @return the number of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public int countByDefectDetectionAndCategoryCode(int defectdetection,
		java.lang.String defectcategorycode, int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the issue categories where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @return the matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectCategoryShortname(
		java.lang.String defectcategoryshortname, int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectCategoryShortname(
		java.lang.String defectcategoryshortname, int defectdatagroupid,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findByDefectCategoryShortname(
		java.lang.String defectcategoryshortname, int defectdatagroupid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByDefectCategoryShortname_First(
		java.lang.String defectcategoryshortname, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

	/**
	* Returns the first issue category in the ordered set where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByDefectCategoryShortname_First(
		java.lang.String defectcategoryshortname, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByDefectCategoryShortname_Last(
		java.lang.String defectcategoryshortname, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

	/**
	* Returns the last issue category in the ordered set where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching issue category, or <code>null</code> if a matching issue category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByDefectCategoryShortname_Last(
		java.lang.String defectcategoryshortname, int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory[] findByDefectCategoryShortname_PrevAndNext(
		long id, java.lang.String defectcategoryshortname,
		int defectdatagroupid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

	/**
	* Removes all the issue categories where defectcategoryshortname = &#63; and defectdatagroupid = &#63; from the database.
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDefectCategoryShortname(
		java.lang.String defectcategoryshortname, int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of issue categories where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	*
	* @param defectcategoryshortname the defectcategoryshortname
	* @param defectdatagroupid the defectdatagroupid
	* @return the number of matching issue categories
	* @throws SystemException if a system exception occurred
	*/
	public int countByDefectCategoryShortname(
		java.lang.String defectcategoryshortname, int defectdatagroupid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the issue category in the entity cache if it is enabled.
	*
	* @param issueCategory the issue category
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory issueCategory);

	/**
	* Caches the issue categories in the entity cache if it is enabled.
	*
	* @param issueCategories the issue categories
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> issueCategories);

	/**
	* Creates a new issue category with the primary key. Does not add the issue category to the database.
	*
	* @param id the primary key for the new issue category
	* @return the new issue category
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory create(long id);

	/**
	* Removes the issue category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue category
	* @return the issue category that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory issueCategory)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the issue category with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException} if it could not be found.
	*
	* @param id the primary key of the issue category
	* @return the issue category
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;

	/**
	* Returns the issue category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the issue category
	* @return the issue category, or <code>null</code> if a issue category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the issue categories.
	*
	* @return the issue categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the issue categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of issue categories.
	*
	* @return the number of issue categories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}