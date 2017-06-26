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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification;

import java.util.List;

/**
 * The persistence utility for the assessment specification service. This utility wraps {@link AssessmentSpecificationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentSpecificationPersistence
 * @see AssessmentSpecificationPersistenceImpl
 * @generated
 */
public class AssessmentSpecificationUtil {
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
		AssessmentSpecification assessmentSpecification) {
		getPersistence().clearCache(assessmentSpecification);
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
	public static List<AssessmentSpecification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssessmentSpecification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssessmentSpecification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AssessmentSpecification update(
		AssessmentSpecification assessmentSpecification)
		throws SystemException {
		return getPersistence().update(assessmentSpecification);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AssessmentSpecification update(
		AssessmentSpecification assessmentSpecification,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(assessmentSpecification, serviceContext);
	}

	/**
	* Returns all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCode(specificationgroupcode, importercode,
			assessmentid, assessmentyear);
	}

	/**
	* Returns a range of all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @return the range of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCode(specificationgroupcode, importercode,
			assessmentid, assessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCode(specificationgroupcode, importercode,
			assessmentid, assessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByImporterCode_First(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByImporterCode_First(specificationgroupcode,
			importercode, assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByImporterCode_First(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCode_First(specificationgroupcode,
			importercode, assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByImporterCode_Last(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByImporterCode_Last(specificationgroupcode,
			importercode, assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByImporterCode_Last(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCode_Last(specificationgroupcode,
			importercode, assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the assessment specifications before and after the current assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessment specification
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification[] findByImporterCode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByImporterCode_PrevAndNext(id, specificationgroupcode,
			importercode, assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByImporterCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByImporterCode(specificationgroupcode, importercode,
			assessmentid, assessmentyear);
	}

	/**
	* Returns the number of assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByImporterCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByImporterCode(specificationgroupcode, importercode,
			assessmentid, assessmentyear);
	}

	/**
	* Returns all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectorContactcode(specificationgroupcode,
			inspectorcontactcode, assessmentid, assessmentyear);
	}

	/**
	* Returns a range of all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @return the range of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectorContactcode(specificationgroupcode,
			inspectorcontactcode, assessmentid, assessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectorContactcode(specificationgroupcode,
			inspectorcontactcode, assessmentid, assessmentyear, start, end,
			orderByComparator);
	}

	/**
	* Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByInspectorContactcode_First(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByInspectorContactcode_First(specificationgroupcode,
			inspectorcontactcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByInspectorContactcode_First(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectorContactcode_First(specificationgroupcode,
			inspectorcontactcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByInspectorContactcode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByInspectorContactcode_Last(specificationgroupcode,
			inspectorcontactcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByInspectorContactcode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectorContactcode_Last(specificationgroupcode,
			inspectorcontactcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the assessment specifications before and after the current assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessment specification
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification[] findByInspectorContactcode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByInspectorContactcode_PrevAndNext(id,
			specificationgroupcode, inspectorcontactcode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByInspectorContactcode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByInspectorContactcode(specificationgroupcode,
			inspectorcontactcode, assessmentid, assessmentyear);
	}

	/**
	* Returns the number of assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectorContactcode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByInspectorContactcode(specificationgroupcode,
			inspectorcontactcode, assessmentid, assessmentyear);
	}

	/**
	* Returns all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductionCode(specificationgroupcode,
			productioncode, assessmentid, assessmentyear);
	}

	/**
	* Returns a range of all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @return the range of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductionCode(specificationgroupcode,
			productioncode, assessmentid, assessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductionCode(specificationgroupcode,
			productioncode, assessmentid, assessmentyear, start, end,
			orderByComparator);
	}

	/**
	* Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByProductionCode_First(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByProductionCode_First(specificationgroupcode,
			productioncode, assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByProductionCode_First(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductionCode_First(specificationgroupcode,
			productioncode, assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByProductionCode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByProductionCode_Last(specificationgroupcode,
			productioncode, assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByProductionCode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductionCode_Last(specificationgroupcode,
			productioncode, assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the assessment specifications before and after the current assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessment specification
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification[] findByProductionCode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByProductionCode_PrevAndNext(id,
			specificationgroupcode, productioncode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByProductionCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByProductionCode(specificationgroupcode, productioncode,
			assessmentid, assessmentyear);
	}

	/**
	* Returns the number of assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductionCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByProductionCode(specificationgroupcode,
			productioncode, assessmentid, assessmentyear);
	}

	/**
	* Returns all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectorContactcodeAndSpecificationCode(specificationgroupcode,
			inspectorcontactcode, specificationcode, assessmentid,
			assessmentyear);
	}

	/**
	* Returns a range of all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @return the range of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectorContactcodeAndSpecificationCode(specificationgroupcode,
			inspectorcontactcode, specificationcode, assessmentid,
			assessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectorContactcodeAndSpecificationCode(specificationgroupcode,
			inspectorcontactcode, specificationcode, assessmentid,
			assessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByInspectorContactcodeAndSpecificationCode_First(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByInspectorContactcodeAndSpecificationCode_First(specificationgroupcode,
			inspectorcontactcode, specificationcode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByInspectorContactcodeAndSpecificationCode_First(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectorContactcodeAndSpecificationCode_First(specificationgroupcode,
			inspectorcontactcode, specificationcode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByInspectorContactcodeAndSpecificationCode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByInspectorContactcodeAndSpecificationCode_Last(specificationgroupcode,
			inspectorcontactcode, specificationcode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByInspectorContactcodeAndSpecificationCode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectorContactcodeAndSpecificationCode_Last(specificationgroupcode,
			inspectorcontactcode, specificationcode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the assessment specifications before and after the current assessment specification in the ordered set where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessment specification
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification[] findByInspectorContactcodeAndSpecificationCode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByInspectorContactcodeAndSpecificationCode_PrevAndNext(id,
			specificationgroupcode, inspectorcontactcode, specificationcode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByInspectorContactcodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByInspectorContactcodeAndSpecificationCode(specificationgroupcode,
			inspectorcontactcode, specificationcode, assessmentid,
			assessmentyear);
	}

	/**
	* Returns the number of assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectorContactcodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByInspectorContactcodeAndSpecificationCode(specificationgroupcode,
			inspectorcontactcode, specificationcode, assessmentid,
			assessmentyear);
	}

	/**
	* Returns all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCodeAndSpecificationCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCodeAndSpecificationCode(specificationgroupcode,
			importercode, specificationcode, assessmentid, assessmentyear);
	}

	/**
	* Returns a range of all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @return the range of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCodeAndSpecificationCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCodeAndSpecificationCode(specificationgroupcode,
			importercode, specificationcode, assessmentid, assessmentyear,
			start, end);
	}

	/**
	* Returns an ordered range of all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCodeAndSpecificationCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCodeAndSpecificationCode(specificationgroupcode,
			importercode, specificationcode, assessmentid, assessmentyear,
			start, end, orderByComparator);
	}

	/**
	* Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByImporterCodeAndSpecificationCode_First(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByImporterCodeAndSpecificationCode_First(specificationgroupcode,
			importercode, specificationcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByImporterCodeAndSpecificationCode_First(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCodeAndSpecificationCode_First(specificationgroupcode,
			importercode, specificationcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByImporterCodeAndSpecificationCode_Last(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByImporterCodeAndSpecificationCode_Last(specificationgroupcode,
			importercode, specificationcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByImporterCodeAndSpecificationCode_Last(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCodeAndSpecificationCode_Last(specificationgroupcode,
			importercode, specificationcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the assessment specifications before and after the current assessment specification in the ordered set where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessment specification
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification[] findByImporterCodeAndSpecificationCode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String importercode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByImporterCodeAndSpecificationCode_PrevAndNext(id,
			specificationgroupcode, importercode, specificationcode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByImporterCodeAndSpecificationCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByImporterCodeAndSpecificationCode(specificationgroupcode,
			importercode, specificationcode, assessmentid, assessmentyear);
	}

	/**
	* Returns the number of assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByImporterCodeAndSpecificationCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByImporterCodeAndSpecificationCode(specificationgroupcode,
			importercode, specificationcode, assessmentid, assessmentyear);
	}

	/**
	* Returns all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductionCodeAndSpecificationCode(specificationgroupcode,
			productioncode, specificationcode, assessmentid, assessmentyear);
	}

	/**
	* Returns a range of all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @return the range of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductionCodeAndSpecificationCode(specificationgroupcode,
			productioncode, specificationcode, assessmentid, assessmentyear,
			start, end);
	}

	/**
	* Returns an ordered range of all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductionCodeAndSpecificationCode(specificationgroupcode,
			productioncode, specificationcode, assessmentid, assessmentyear,
			start, end, orderByComparator);
	}

	/**
	* Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByProductionCodeAndSpecificationCode_First(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByProductionCodeAndSpecificationCode_First(specificationgroupcode,
			productioncode, specificationcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the first assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByProductionCodeAndSpecificationCode_First(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductionCodeAndSpecificationCode_First(specificationgroupcode,
			productioncode, specificationcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByProductionCodeAndSpecificationCode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByProductionCodeAndSpecificationCode_Last(specificationgroupcode,
			productioncode, specificationcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the last assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessment specification, or <code>null</code> if a matching assessment specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByProductionCodeAndSpecificationCode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductionCodeAndSpecificationCode_Last(specificationgroupcode,
			productioncode, specificationcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the assessment specifications before and after the current assessment specification in the ordered set where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessment specification
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification[] findByProductionCodeAndSpecificationCode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence()
				   .findByProductionCodeAndSpecificationCode_PrevAndNext(id,
			specificationgroupcode, productioncode, specificationcode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByProductionCodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByProductionCodeAndSpecificationCode(specificationgroupcode,
			productioncode, specificationcode, assessmentid, assessmentyear);
	}

	/**
	* Returns the number of assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and specificationcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param specificationcode the specificationcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductionCodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByProductionCodeAndSpecificationCode(specificationgroupcode,
			productioncode, specificationcode, assessmentid, assessmentyear);
	}

	/**
	* Caches the assessment specification in the entity cache if it is enabled.
	*
	* @param assessmentSpecification the assessment specification
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification assessmentSpecification) {
		getPersistence().cacheResult(assessmentSpecification);
	}

	/**
	* Caches the assessment specifications in the entity cache if it is enabled.
	*
	* @param assessmentSpecifications the assessment specifications
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> assessmentSpecifications) {
		getPersistence().cacheResult(assessmentSpecifications);
	}

	/**
	* Creates a new assessment specification with the primary key. Does not add the assessment specification to the database.
	*
	* @param id the primary key for the new assessment specification
	* @return the new assessment specification
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the assessment specification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessment specification
	* @return the assessment specification that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification assessmentSpecification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessmentSpecification);
	}

	/**
	* Returns the assessment specification with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException} if it could not be found.
	*
	* @param id the primary key of the assessment specification
	* @return the assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the assessment specification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the assessment specification
	* @return the assessment specification, or <code>null</code> if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the assessment specifications.
	*
	* @return the assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assessment specifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @return the range of assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assessment specifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessment specifications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessment specifications.
	*
	* @return the number of assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AssessmentSpecificationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AssessmentSpecificationPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					AssessmentSpecificationPersistence.class.getName());

			ReferenceRegistry.registerReference(AssessmentSpecificationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AssessmentSpecificationPersistence persistence) {
	}

	private static AssessmentSpecificationPersistence _persistence;
}