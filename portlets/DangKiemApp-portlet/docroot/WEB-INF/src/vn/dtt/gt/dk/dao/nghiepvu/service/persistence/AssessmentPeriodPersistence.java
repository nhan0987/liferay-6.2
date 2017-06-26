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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod;

/**
 * The persistence interface for the assessment period service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentPeriodPersistenceImpl
 * @see AssessmentPeriodUtil
 * @generated
 */
public interface AssessmentPeriodPersistence extends BasePersistence<AssessmentPeriod> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssessmentPeriodUtil} to access the assessment period persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the assessment periods where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyear(
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment periods
	* @param end the upper bound of the range of assessment periods (not inclusive)
	* @return the range of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyear(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment periods
	* @param end the upper bound of the range of assessment periods (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyear(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyear_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyear_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyear_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyear_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment periods before and after the current assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessment period
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod[] findByAssessmentidAndAssessmentyear_PrevAndNext(
		long id, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Removes all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAssessmentidAndAssessmentyear(
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment periods where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssessmentidAndAssessmentyear(
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param importerchecked the importerchecked
	* @return the matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithimporterchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param importerchecked the importerchecked
	* @param start the lower bound of the range of assessment periods
	* @param end the upper bound of the range of assessment periods (not inclusive)
	* @return the range of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithimporterchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param importerchecked the importerchecked
	* @param start the lower bound of the range of assessment periods
	* @param end the upper bound of the range of assessment periods (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithimporterchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param importerchecked the importerchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyearWithimporterchecked_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param importerchecked the importerchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithimporterchecked_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param importerchecked the importerchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyearWithimporterchecked_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param importerchecked the importerchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithimporterchecked_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment periods before and after the current assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	*
	* @param id the primary key of the current assessment period
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param importerchecked the importerchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod[] findByAssessmentidAndAssessmentyearWithimporterchecked_PrevAndNext(
		long id, java.lang.String assessmentid,
		java.lang.String assessmentyear, int importerchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Removes all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63; from the database.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param importerchecked the importerchecked
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAssessmentidAndAssessmentyearWithimporterchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment periods where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param importerchecked the importerchecked
	* @return the number of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssessmentidAndAssessmentyearWithimporterchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param inspectorchecked the inspectorchecked
	* @return the matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithinspectorchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param inspectorchecked the inspectorchecked
	* @param start the lower bound of the range of assessment periods
	* @param end the upper bound of the range of assessment periods (not inclusive)
	* @return the range of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithinspectorchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param inspectorchecked the inspectorchecked
	* @param start the lower bound of the range of assessment periods
	* @param end the upper bound of the range of assessment periods (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithinspectorchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param inspectorchecked the inspectorchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyearWithinspectorchecked_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param inspectorchecked the inspectorchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithinspectorchecked_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param inspectorchecked the inspectorchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyearWithinspectorchecked_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param inspectorchecked the inspectorchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithinspectorchecked_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment periods before and after the current assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	*
	* @param id the primary key of the current assessment period
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param inspectorchecked the inspectorchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod[] findByAssessmentidAndAssessmentyearWithinspectorchecked_PrevAndNext(
		long id, java.lang.String assessmentid,
		java.lang.String assessmentyear, int inspectorchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Removes all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63; from the database.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param inspectorchecked the inspectorchecked
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAssessmentidAndAssessmentyearWithinspectorchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment periods where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param inspectorchecked the inspectorchecked
	* @return the number of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssessmentidAndAssessmentyearWithinspectorchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param productionchecked the productionchecked
	* @return the matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithproductionchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param productionchecked the productionchecked
	* @param start the lower bound of the range of assessment periods
	* @param end the upper bound of the range of assessment periods (not inclusive)
	* @return the range of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithproductionchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param productionchecked the productionchecked
	* @param start the lower bound of the range of assessment periods
	* @param end the upper bound of the range of assessment periods (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithproductionchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param productionchecked the productionchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyearWithproductionchecked_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param productionchecked the productionchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithproductionchecked_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param productionchecked the productionchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyearWithproductionchecked_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param productionchecked the productionchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithproductionchecked_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment periods before and after the current assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	*
	* @param id the primary key of the current assessment period
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param productionchecked the productionchecked
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod[] findByAssessmentidAndAssessmentyearWithproductionchecked_PrevAndNext(
		long id, java.lang.String assessmentid,
		java.lang.String assessmentyear, int productionchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Removes all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63; from the database.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param productionchecked the productionchecked
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAssessmentidAndAssessmentyearWithproductionchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment periods where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param productionchecked the productionchecked
	* @return the number of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssessmentidAndAssessmentyearWithproductionchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment periods where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @return the matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByPreviousAssessmentidAndAssessmentyear(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment periods where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @param start the lower bound of the range of assessment periods
	* @param end the upper bound of the range of assessment periods (not inclusive)
	* @return the range of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByPreviousAssessmentidAndAssessmentyear(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment periods where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @param start the lower bound of the range of assessment periods
	* @param end the upper bound of the range of assessment periods (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByPreviousAssessmentidAndAssessmentyear(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessment period in the ordered set where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByPreviousAssessmentidAndAssessmentyear_First(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Returns the first assessment period in the ordered set where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByPreviousAssessmentidAndAssessmentyear_First(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessment period in the ordered set where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByPreviousAssessmentidAndAssessmentyear_Last(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Returns the last assessment period in the ordered set where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByPreviousAssessmentidAndAssessmentyear_Last(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment periods before and after the current assessment period in the ordered set where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessment period
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod[] findByPreviousAssessmentidAndAssessmentyear_PrevAndNext(
		long id, java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Removes all the assessment periods where previousassessmentid = &#63; and previousassessmentyear = &#63; from the database.
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPreviousAssessmentidAndAssessmentyear(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment periods where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @return the number of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public int countByPreviousAssessmentidAndAssessmentyear(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the assessment period in the entity cache if it is enabled.
	*
	* @param assessmentPeriod the assessment period
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod assessmentPeriod);

	/**
	* Caches the assessment periods in the entity cache if it is enabled.
	*
	* @param assessmentPeriods the assessment periods
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> assessmentPeriods);

	/**
	* Creates a new assessment period with the primary key. Does not add the assessment period to the database.
	*
	* @param id the primary key for the new assessment period
	* @return the new assessment period
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod create(long id);

	/**
	* Removes the assessment period with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessment period
	* @return the assessment period that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod assessmentPeriod)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment period with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException} if it could not be found.
	*
	* @param id the primary key of the assessment period
	* @return the assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException;

	/**
	* Returns the assessment period with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the assessment period
	* @return the assessment period, or <code>null</code> if a assessment period with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment periods.
	*
	* @return the assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessment periods.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessment periods
	* @param end the upper bound of the range of assessment periods (not inclusive)
	* @return the range of assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessment periods.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessment periods
	* @param end the upper bound of the range of assessment periods (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessment periods from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment periods.
	*
	* @return the number of assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}