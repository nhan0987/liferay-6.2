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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector;

import java.util.List;

/**
 * The persistence utility for the assessmentof inspector service. This utility wraps {@link AssessmentofInspectorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentofInspectorPersistence
 * @see AssessmentofInspectorPersistenceImpl
 * @generated
 */
public class AssessmentofInspectorUtil {
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
	public static void clearCache(AssessmentofInspector assessmentofInspector) {
		getPersistence().clearCache(assessmentofInspector);
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
	public static List<AssessmentofInspector> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssessmentofInspector> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssessmentofInspector> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AssessmentofInspector update(
		AssessmentofInspector assessmentofInspector) throws SystemException {
		return getPersistence().update(assessmentofInspector);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AssessmentofInspector update(
		AssessmentofInspector assessmentofInspector,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(assessmentofInspector, serviceContext);
	}

	/**
	* Returns all the assessmentof inspectors where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByInspectorContactCode(
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectorContactCode(inspectorcontactcode,
			assessmentid, assessmentyear);
	}

	/**
	* Returns a range of all the assessmentof inspectors where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof inspectors
	* @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	* @return the range of matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByInspectorContactCode(
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectorContactCode(inspectorcontactcode,
			assessmentid, assessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof inspectors where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof inspectors
	* @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByInspectorContactCode(
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectorContactCode(inspectorcontactcode,
			assessmentid, assessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector findByInspectorContactCode_First(
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence()
				   .findByInspectorContactCode_First(inspectorcontactcode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector fetchByInspectorContactCode_First(
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectorContactCode_First(inspectorcontactcode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector findByInspectorContactCode_Last(
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence()
				   .findByInspectorContactCode_Last(inspectorcontactcode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector fetchByInspectorContactCode_Last(
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectorContactCode_Last(inspectorcontactcode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof inspectors before and after the current assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof inspector
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector[] findByInspectorContactCode_PrevAndNext(
		long id, java.lang.String inspectorcontactcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence()
				   .findByInspectorContactCode_PrevAndNext(id,
			inspectorcontactcode, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof inspectors where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByInspectorContactCode(
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByInspectorContactCode(inspectorcontactcode, assessmentid,
			assessmentyear);
	}

	/**
	* Returns the number of assessmentof inspectors where inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectorContactCode(
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByInspectorContactCode(inspectorcontactcode,
			assessmentid, assessmentyear);
	}

	/**
	* Returns all the assessmentof inspectors where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param inspectorname the inspectorname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByInspectorName(
		java.lang.String inspectorname, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectorName(inspectorname, assessmentid,
			assessmentyear);
	}

	/**
	* Returns a range of all the assessmentof inspectors where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorname the inspectorname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof inspectors
	* @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	* @return the range of matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByInspectorName(
		java.lang.String inspectorname, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectorName(inspectorname, assessmentid,
			assessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof inspectors where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorname the inspectorname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof inspectors
	* @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByInspectorName(
		java.lang.String inspectorname, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectorName(inspectorname, assessmentid,
			assessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof inspector in the ordered set where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param inspectorname the inspectorname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector findByInspectorName_First(
		java.lang.String inspectorname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence()
				   .findByInspectorName_First(inspectorname, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof inspector in the ordered set where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param inspectorname the inspectorname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector fetchByInspectorName_First(
		java.lang.String inspectorname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectorName_First(inspectorname, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof inspector in the ordered set where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param inspectorname the inspectorname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector findByInspectorName_Last(
		java.lang.String inspectorname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence()
				   .findByInspectorName_Last(inspectorname, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof inspector in the ordered set where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param inspectorname the inspectorname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector fetchByInspectorName_Last(
		java.lang.String inspectorname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectorName_Last(inspectorname, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof inspectors before and after the current assessmentof inspector in the ordered set where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof inspector
	* @param inspectorname the inspectorname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector[] findByInspectorName_PrevAndNext(
		long id, java.lang.String inspectorname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence()
				   .findByInspectorName_PrevAndNext(id, inspectorname,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessmentof inspectors where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param inspectorname the inspectorname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByInspectorName(java.lang.String inspectorname,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByInspectorName(inspectorname, assessmentid, assessmentyear);
	}

	/**
	* Returns the number of assessmentof inspectors where inspectorname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param inspectorname the inspectorname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectorName(java.lang.String inspectorname,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByInspectorName(inspectorname, assessmentid,
			assessmentyear);
	}

	/**
	* Returns all the assessmentof inspectors where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByNextPeriodByInspectorContactCode(
		java.lang.String inspectorcontactcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByInspectorContactCode(inspectorcontactcode,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns a range of all the assessmentof inspectors where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof inspectors
	* @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	* @return the range of matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByNextPeriodByInspectorContactCode(
		java.lang.String inspectorcontactcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByInspectorContactCode(inspectorcontactcode,
			nextassessmentid, nextassessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof inspectors where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof inspectors
	* @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByNextPeriodByInspectorContactCode(
		java.lang.String inspectorcontactcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByInspectorContactCode(inspectorcontactcode,
			nextassessmentid, nextassessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector findByNextPeriodByInspectorContactCode_First(
		java.lang.String inspectorcontactcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence()
				   .findByNextPeriodByInspectorContactCode_First(inspectorcontactcode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector fetchByNextPeriodByInspectorContactCode_First(
		java.lang.String inspectorcontactcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByInspectorContactCode_First(inspectorcontactcode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector findByNextPeriodByInspectorContactCode_Last(
		java.lang.String inspectorcontactcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence()
				   .findByNextPeriodByInspectorContactCode_Last(inspectorcontactcode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector fetchByNextPeriodByInspectorContactCode_Last(
		java.lang.String inspectorcontactcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByInspectorContactCode_Last(inspectorcontactcode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof inspectors before and after the current assessmentof inspector in the ordered set where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof inspector
	* @param inspectorcontactcode the inspectorcontactcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector[] findByNextPeriodByInspectorContactCode_PrevAndNext(
		long id, java.lang.String inspectorcontactcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence()
				   .findByNextPeriodByInspectorContactCode_PrevAndNext(id,
			inspectorcontactcode, nextassessmentid, nextassessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof inspectors where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNextPeriodByInspectorContactCode(
		java.lang.String inspectorcontactcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByNextPeriodByInspectorContactCode(inspectorcontactcode,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns the number of assessmentof inspectors where inspectorcontactcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param inspectorcontactcode the inspectorcontactcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNextPeriodByInspectorContactCode(
		java.lang.String inspectorcontactcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByNextPeriodByInspectorContactCode(inspectorcontactcode,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns all the assessmentof inspectors where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param inspectorname the inspectorname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByNextPeriodByInspectorName(
		java.lang.String inspectorname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByInspectorName(inspectorname,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns a range of all the assessmentof inspectors where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorname the inspectorname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof inspectors
	* @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	* @return the range of matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByNextPeriodByInspectorName(
		java.lang.String inspectorname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByInspectorName(inspectorname,
			nextassessmentid, nextassessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof inspectors where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorname the inspectorname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof inspectors
	* @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByNextPeriodByInspectorName(
		java.lang.String inspectorname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByInspectorName(inspectorname,
			nextassessmentid, nextassessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof inspector in the ordered set where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param inspectorname the inspectorname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector findByNextPeriodByInspectorName_First(
		java.lang.String inspectorname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence()
				   .findByNextPeriodByInspectorName_First(inspectorname,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof inspector in the ordered set where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param inspectorname the inspectorname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector fetchByNextPeriodByInspectorName_First(
		java.lang.String inspectorname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByInspectorName_First(inspectorname,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof inspector in the ordered set where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param inspectorname the inspectorname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector findByNextPeriodByInspectorName_Last(
		java.lang.String inspectorname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence()
				   .findByNextPeriodByInspectorName_Last(inspectorname,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof inspector in the ordered set where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param inspectorname the inspectorname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof inspector, or <code>null</code> if a matching assessmentof inspector could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector fetchByNextPeriodByInspectorName_Last(
		java.lang.String inspectorname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByInspectorName_Last(inspectorname,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof inspectors before and after the current assessmentof inspector in the ordered set where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof inspector
	* @param inspectorname the inspectorname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector[] findByNextPeriodByInspectorName_PrevAndNext(
		long id, java.lang.String inspectorname,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence()
				   .findByNextPeriodByInspectorName_PrevAndNext(id,
			inspectorname, nextassessmentid, nextassessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof inspectors where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param inspectorname the inspectorname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNextPeriodByInspectorName(
		java.lang.String inspectorname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByNextPeriodByInspectorName(inspectorname, nextassessmentid,
			nextassessmentyear);
	}

	/**
	* Returns the number of assessmentof inspectors where inspectorname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param inspectorname the inspectorname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNextPeriodByInspectorName(
		java.lang.String inspectorname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByNextPeriodByInspectorName(inspectorname,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Caches the assessmentof inspector in the entity cache if it is enabled.
	*
	* @param assessmentofInspector the assessmentof inspector
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector assessmentofInspector) {
		getPersistence().cacheResult(assessmentofInspector);
	}

	/**
	* Caches the assessmentof inspectors in the entity cache if it is enabled.
	*
	* @param assessmentofInspectors the assessmentof inspectors
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> assessmentofInspectors) {
		getPersistence().cacheResult(assessmentofInspectors);
	}

	/**
	* Creates a new assessmentof inspector with the primary key. Does not add the assessmentof inspector to the database.
	*
	* @param id the primary key for the new assessmentof inspector
	* @return the new assessmentof inspector
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the assessmentof inspector with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessmentof inspector
	* @return the assessmentof inspector that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector assessmentofInspector)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessmentofInspector);
	}

	/**
	* Returns the assessmentof inspector with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException} if it could not be found.
	*
	* @param id the primary key of the assessmentof inspector
	* @return the assessmentof inspector
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException if a assessmentof inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectorException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the assessmentof inspector with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the assessmentof inspector
	* @return the assessmentof inspector, or <code>null</code> if a assessmentof inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the assessmentof inspectors.
	*
	* @return the assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assessmentof inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof inspectors
	* @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	* @return the range of assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof inspectors
	* @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessmentof inspectors from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessmentof inspectors.
	*
	* @return the number of assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AssessmentofInspectorPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AssessmentofInspectorPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					AssessmentofInspectorPersistence.class.getName());

			ReferenceRegistry.registerReference(AssessmentofInspectorUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AssessmentofInspectorPersistence persistence) {
	}

	private static AssessmentofInspectorPersistence _persistence;
}