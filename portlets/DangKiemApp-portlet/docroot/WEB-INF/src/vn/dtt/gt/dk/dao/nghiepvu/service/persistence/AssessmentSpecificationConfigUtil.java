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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig;

import java.util.List;

/**
 * The persistence utility for the assessment specification config service. This utility wraps {@link AssessmentSpecificationConfigPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentSpecificationConfigPersistence
 * @see AssessmentSpecificationConfigPersistenceImpl
 * @generated
 */
public class AssessmentSpecificationConfigUtil {
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
	public static void clearCache(
		AssessmentSpecificationConfig assessmentSpecificationConfig) {
		getPersistence().clearCache(assessmentSpecificationConfig);
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
	public static List<AssessmentSpecificationConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssessmentSpecificationConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssessmentSpecificationConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AssessmentSpecificationConfig update(
		AssessmentSpecificationConfig assessmentSpecificationConfig)
		throws SystemException {
		return getPersistence().update(assessmentSpecificationConfig);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AssessmentSpecificationConfig update(
		AssessmentSpecificationConfig assessmentSpecificationConfig,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(assessmentSpecificationConfig, serviceContext);
	}

	/**
	* Returns all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyear(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyear(specificationgroupcode,
			assessmentid, assessmentyear);
	}

	/**
	* Returns a range of all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specification configs
	* @param end the upper bound of the range of assessment specification configs (not inclusive)
	* @return the range of matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyear(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyear(specificationgroupcode,
			assessmentid, assessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specification configs
	* @param end the upper bound of the range of assessment specification configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyear(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyear(specificationgroupcode,
			assessmentid, assessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig findByAssessmentidAndAssessmentyear_First(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyear_First(specificationgroupcode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification config, or <code>null</code> if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig fetchByAssessmentidAndAssessmentyear_First(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentidAndAssessmentyear_First(specificationgroupcode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig findByAssessmentidAndAssessmentyear_Last(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyear_Last(specificationgroupcode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification config, or <code>null</code> if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig fetchByAssessmentidAndAssessmentyear_Last(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentidAndAssessmentyear_Last(specificationgroupcode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the assessment specification configs before and after the current assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessment specification config
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig[] findByAssessmentidAndAssessmentyear_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyear_PrevAndNext(id,
			specificationgroupcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAssessmentidAndAssessmentyear(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByAssessmentidAndAssessmentyear(specificationgroupcode,
			assessmentid, assessmentyear);
	}

	/**
	* Returns the number of assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssessmentidAndAssessmentyear(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAssessmentidAndAssessmentyear(specificationgroupcode,
			assessmentid, assessmentyear);
	}

	/**
	* Returns all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @return the matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyearWithSpecificationcode(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithSpecificationcode(specificationgroupcode,
			assessmentid, assessmentyear, specificationcode);
	}

	/**
	* Returns a range of all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param start the lower bound of the range of assessment specification configs
	* @param end the upper bound of the range of assessment specification configs (not inclusive)
	* @return the range of matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyearWithSpecificationcode(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithSpecificationcode(specificationgroupcode,
			assessmentid, assessmentyear, specificationcode, start, end);
	}

	/**
	* Returns an ordered range of all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param start the lower bound of the range of assessment specification configs
	* @param end the upper bound of the range of assessment specification configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyearWithSpecificationcode(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithSpecificationcode(specificationgroupcode,
			assessmentid, assessmentyear, specificationcode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig findByAssessmentidAndAssessmentyearWithSpecificationcode_First(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithSpecificationcode_First(specificationgroupcode,
			assessmentid, assessmentyear, specificationcode, orderByComparator);
	}

	/**
	* Returns the first assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification config, or <code>null</code> if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig fetchByAssessmentidAndAssessmentyearWithSpecificationcode_First(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentidAndAssessmentyearWithSpecificationcode_First(specificationgroupcode,
			assessmentid, assessmentyear, specificationcode, orderByComparator);
	}

	/**
	* Returns the last assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig findByAssessmentidAndAssessmentyearWithSpecificationcode_Last(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithSpecificationcode_Last(specificationgroupcode,
			assessmentid, assessmentyear, specificationcode, orderByComparator);
	}

	/**
	* Returns the last assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification config, or <code>null</code> if a matching assessment specification config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig fetchByAssessmentidAndAssessmentyearWithSpecificationcode_Last(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssessmentidAndAssessmentyearWithSpecificationcode_Last(specificationgroupcode,
			assessmentid, assessmentyear, specificationcode, orderByComparator);
	}

	/**
	* Returns the assessment specification configs before and after the current assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param id the primary key of the current assessment specification config
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig[] findByAssessmentidAndAssessmentyearWithSpecificationcode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		java.lang.String specificationcode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException {
		return getPersistence()
				   .findByAssessmentidAndAssessmentyearWithSpecificationcode_PrevAndNext(id,
			specificationgroupcode, assessmentid, assessmentyear,
			specificationcode, orderByComparator);
	}

	/**
	* Removes all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63; from the database.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAssessmentidAndAssessmentyearWithSpecificationcode(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByAssessmentidAndAssessmentyearWithSpecificationcode(specificationgroupcode,
			assessmentid, assessmentyear, specificationcode);
	}

	/**
	* Returns the number of assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param specificationcode the specificationcode
	* @return the number of matching assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssessmentidAndAssessmentyearWithSpecificationcode(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAssessmentidAndAssessmentyearWithSpecificationcode(specificationgroupcode,
			assessmentid, assessmentyear, specificationcode);
	}

	/**
	* Caches the assessment specification config in the entity cache if it is enabled.
	*
	* @param assessmentSpecificationConfig the assessment specification config
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig assessmentSpecificationConfig) {
		getPersistence().cacheResult(assessmentSpecificationConfig);
	}

	/**
	* Caches the assessment specification configs in the entity cache if it is enabled.
	*
	* @param assessmentSpecificationConfigs the assessment specification configs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> assessmentSpecificationConfigs) {
		getPersistence().cacheResult(assessmentSpecificationConfigs);
	}

	/**
	* Creates a new assessment specification config with the primary key. Does not add the assessment specification config to the database.
	*
	* @param id the primary key for the new assessment specification config
	* @return the new assessment specification config
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the assessment specification config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessment specification config
	* @return the assessment specification config that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig assessmentSpecificationConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessmentSpecificationConfig);
	}

	/**
	* Returns the assessment specification config with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException} if it could not be found.
	*
	* @param id the primary key of the assessment specification config
	* @return the assessment specification config
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the assessment specification config with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the assessment specification config
	* @return the assessment specification config, or <code>null</code> if a assessment specification config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the assessment specification configs.
	*
	* @return the assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assessment specification configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessment specification configs
	* @param end the upper bound of the range of assessment specification configs (not inclusive)
	* @return the range of assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assessment specification configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessment specification configs
	* @param end the upper bound of the range of assessment specification configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessment specification configs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessment specification configs.
	*
	* @return the number of assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AssessmentSpecificationConfigPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AssessmentSpecificationConfigPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					AssessmentSpecificationConfigPersistence.class.getName());

			ReferenceRegistry.registerReference(AssessmentSpecificationConfigUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		AssessmentSpecificationConfigPersistence persistence) {
	}

	private static AssessmentSpecificationConfigPersistence _persistence;
}