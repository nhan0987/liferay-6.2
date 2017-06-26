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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod;

import java.util.List;

/**
 * The persistence utility for the assessment period service. This utility wraps {@link AssessmentPeriodPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentPeriodPersistence
 * @see AssessmentPeriodPersistenceImpl
 * @generated
 */
public class AssessmentPeriodUtil {
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
	public static void clearCache(AssessmentPeriod assessmentPeriod) {
		getPersistence().clearCache(assessmentPeriod);
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
	public static List<AssessmentPeriod> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssessmentPeriod> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssessmentPeriod> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AssessmentPeriod update(AssessmentPeriod assessmentPeriod)
		throws SystemException {
		return getPersistence().update(assessmentPeriod);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AssessmentPeriod update(AssessmentPeriod assessmentPeriod,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(assessmentPeriod, serviceContext);
	}

	/**
	* Returns all the assessment periods where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyear(
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyear(assessmentid,
			assessmentyear);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyear(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyear(assessmentid,
			assessmentyear, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyear(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyear(assessmentid,
			assessmentyear, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyear_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyear_First(assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyear_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentidAndAssessmentyear_First(assessmentid,
			assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyear_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyear_Last(assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessment period in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyear_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentidAndAssessmentyear_Last(assessmentid,
			assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod[] findByAssessmentidAndAssessmentyear_PrevAndNext(
		long id, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyear_PrevAndNext(id,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAssessmentidAndAssessmentyear(
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByAssessmentidAndAssessmentyear(assessmentid, assessmentyear);
	}

	/**
	* Returns the number of assessment periods where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssessmentidAndAssessmentyear(
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAssessmentidAndAssessmentyear(assessmentid,
			assessmentyear);
	}

	/**
	* Returns all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param importerchecked the importerchecked
	* @return the matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithimporterchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithimporterchecked(assessmentid,
			assessmentyear, importerchecked);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithimporterchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithimporterchecked(assessmentid,
			assessmentyear, importerchecked, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithimporterchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithimporterchecked(assessmentid,
			assessmentyear, importerchecked, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyearWithimporterchecked_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithimporterchecked_First(assessmentid,
			assessmentyear, importerchecked, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithimporterchecked_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentidAndAssessmentyearWithimporterchecked_First(assessmentid,
			assessmentyear, importerchecked, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyearWithimporterchecked_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithimporterchecked_Last(assessmentid,
			assessmentyear, importerchecked, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithimporterchecked_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentidAndAssessmentyearWithimporterchecked_Last(assessmentid,
			assessmentyear, importerchecked, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod[] findByAssessmentidAndAssessmentyearWithimporterchecked_PrevAndNext(
		long id, java.lang.String assessmentid,
		java.lang.String assessmentyear, int importerchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithimporterchecked_PrevAndNext(id,
			assessmentid, assessmentyear, importerchecked, orderByComparator);
	}

	/**
	* Removes all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63; from the database.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param importerchecked the importerchecked
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAssessmentidAndAssessmentyearWithimporterchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByAssessmentidAndAssessmentyearWithimporterchecked(assessmentid,
			assessmentyear, importerchecked);
	}

	/**
	* Returns the number of assessment periods where assessmentid = &#63; and assessmentyear = &#63; and importerchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param importerchecked the importerchecked
	* @return the number of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssessmentidAndAssessmentyearWithimporterchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAssessmentidAndAssessmentyearWithimporterchecked(assessmentid,
			assessmentyear, importerchecked);
	}

	/**
	* Returns all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param inspectorchecked the inspectorchecked
	* @return the matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithinspectorchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithinspectorchecked(assessmentid,
			assessmentyear, inspectorchecked);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithinspectorchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithinspectorchecked(assessmentid,
			assessmentyear, inspectorchecked, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithinspectorchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithinspectorchecked(assessmentid,
			assessmentyear, inspectorchecked, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyearWithinspectorchecked_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithinspectorchecked_First(assessmentid,
			assessmentyear, inspectorchecked, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithinspectorchecked_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentidAndAssessmentyearWithinspectorchecked_First(assessmentid,
			assessmentyear, inspectorchecked, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyearWithinspectorchecked_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithinspectorchecked_Last(assessmentid,
			assessmentyear, inspectorchecked, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithinspectorchecked_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentidAndAssessmentyearWithinspectorchecked_Last(assessmentid,
			assessmentyear, inspectorchecked, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod[] findByAssessmentidAndAssessmentyearWithinspectorchecked_PrevAndNext(
		long id, java.lang.String assessmentid,
		java.lang.String assessmentyear, int inspectorchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithinspectorchecked_PrevAndNext(id,
			assessmentid, assessmentyear, inspectorchecked, orderByComparator);
	}

	/**
	* Removes all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63; from the database.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param inspectorchecked the inspectorchecked
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAssessmentidAndAssessmentyearWithinspectorchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByAssessmentidAndAssessmentyearWithinspectorchecked(assessmentid,
			assessmentyear, inspectorchecked);
	}

	/**
	* Returns the number of assessment periods where assessmentid = &#63; and assessmentyear = &#63; and inspectorchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param inspectorchecked the inspectorchecked
	* @return the number of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssessmentidAndAssessmentyearWithinspectorchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAssessmentidAndAssessmentyearWithinspectorchecked(assessmentid,
			assessmentyear, inspectorchecked);
	}

	/**
	* Returns all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param productionchecked the productionchecked
	* @return the matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithproductionchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithproductionchecked(assessmentid,
			assessmentyear, productionchecked);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithproductionchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithproductionchecked(assessmentid,
			assessmentyear, productionchecked, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithproductionchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithproductionchecked(assessmentid,
			assessmentyear, productionchecked, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyearWithproductionchecked_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithproductionchecked_First(assessmentid,
			assessmentyear, productionchecked, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithproductionchecked_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentidAndAssessmentyearWithproductionchecked_First(assessmentid,
			assessmentyear, productionchecked, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByAssessmentidAndAssessmentyearWithproductionchecked_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithproductionchecked_Last(assessmentid,
			assessmentyear, productionchecked, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByAssessmentidAndAssessmentyearWithproductionchecked_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentidAndAssessmentyearWithproductionchecked_Last(assessmentid,
			assessmentyear, productionchecked, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod[] findByAssessmentidAndAssessmentyearWithproductionchecked_PrevAndNext(
		long id, java.lang.String assessmentid,
		java.lang.String assessmentyear, int productionchecked,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithproductionchecked_PrevAndNext(id,
			assessmentid, assessmentyear, productionchecked, orderByComparator);
	}

	/**
	* Removes all the assessment periods where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63; from the database.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param productionchecked the productionchecked
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAssessmentidAndAssessmentyearWithproductionchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByAssessmentidAndAssessmentyearWithproductionchecked(assessmentid,
			assessmentyear, productionchecked);
	}

	/**
	* Returns the number of assessment periods where assessmentid = &#63; and assessmentyear = &#63; and productionchecked = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param productionchecked the productionchecked
	* @return the number of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssessmentidAndAssessmentyearWithproductionchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAssessmentidAndAssessmentyearWithproductionchecked(assessmentid,
			assessmentyear, productionchecked);
	}

	/**
	* Returns all the assessment periods where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @return the matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByPreviousAssessmentidAndAssessmentyear(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPreviousAssessmentidAndAssessmentyear(previousassessmentid,
			previousassessmentyear);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByPreviousAssessmentidAndAssessmentyear(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPreviousAssessmentidAndAssessmentyear(previousassessmentid,
			previousassessmentyear, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByPreviousAssessmentidAndAssessmentyear(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPreviousAssessmentidAndAssessmentyear(previousassessmentid,
			previousassessmentyear, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByPreviousAssessmentidAndAssessmentyear_First(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByPreviousAssessmentidAndAssessmentyear_First(previousassessmentid,
			previousassessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessment period in the ordered set where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByPreviousAssessmentidAndAssessmentyear_First(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPreviousAssessmentidAndAssessmentyear_First(previousassessmentid,
			previousassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByPreviousAssessmentidAndAssessmentyear_Last(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByPreviousAssessmentidAndAssessmentyear_Last(previousassessmentid,
			previousassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessment period in the ordered set where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment period, or <code>null</code> if a matching assessment period could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByPreviousAssessmentidAndAssessmentyear_Last(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPreviousAssessmentidAndAssessmentyear_Last(previousassessmentid,
			previousassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod[] findByPreviousAssessmentidAndAssessmentyear_PrevAndNext(
		long id, java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence()
				   .findByPreviousAssessmentidAndAssessmentyear_PrevAndNext(id,
			previousassessmentid, previousassessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessment periods where previousassessmentid = &#63; and previousassessmentyear = &#63; from the database.
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPreviousAssessmentidAndAssessmentyear(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByPreviousAssessmentidAndAssessmentyear(previousassessmentid,
			previousassessmentyear);
	}

	/**
	* Returns the number of assessment periods where previousassessmentid = &#63; and previousassessmentyear = &#63;.
	*
	* @param previousassessmentid the previousassessmentid
	* @param previousassessmentyear the previousassessmentyear
	* @return the number of matching assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPreviousAssessmentidAndAssessmentyear(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPreviousAssessmentidAndAssessmentyear(previousassessmentid,
			previousassessmentyear);
	}

	/**
	* Caches the assessment period in the entity cache if it is enabled.
	*
	* @param assessmentPeriod the assessment period
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod assessmentPeriod) {
		getPersistence().cacheResult(assessmentPeriod);
	}

	/**
	* Caches the assessment periods in the entity cache if it is enabled.
	*
	* @param assessmentPeriods the assessment periods
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> assessmentPeriods) {
		getPersistence().cacheResult(assessmentPeriods);
	}

	/**
	* Creates a new assessment period with the primary key. Does not add the assessment period to the database.
	*
	* @param id the primary key for the new assessment period
	* @return the new assessment period
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the assessment period with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessment period
	* @return the assessment period that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod assessmentPeriod)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessmentPeriod);
	}

	/**
	* Returns the assessment period with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException} if it could not be found.
	*
	* @param id the primary key of the assessment period
	* @return the assessment period
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException if a assessment period with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentPeriodException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the assessment period with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the assessment period
	* @return the assessment period, or <code>null</code> if a assessment period with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the assessment periods.
	*
	* @return the assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessment periods from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessment periods.
	*
	* @return the number of assessment periods
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AssessmentPeriodPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AssessmentPeriodPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					AssessmentPeriodPersistence.class.getName());

			ReferenceRegistry.registerReference(AssessmentPeriodUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AssessmentPeriodPersistence persistence) {
	}

	private static AssessmentPeriodPersistence _persistence;
}