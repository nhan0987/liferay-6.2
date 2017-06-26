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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl;

import java.util.List;

/**
 * The persistence utility for the assessmentof importer control service. This utility wraps {@link AssessmentofImporterControlPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentofImporterControlPersistence
 * @see AssessmentofImporterControlPersistenceImpl
 * @generated
 */
public class AssessmentofImporterControlUtil {
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
		AssessmentofImporterControl assessmentofImporterControl) {
		getPersistence().clearCache(assessmentofImporterControl);
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
	public static List<AssessmentofImporterControl> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssessmentofImporterControl> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssessmentofImporterControl> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AssessmentofImporterControl update(
		AssessmentofImporterControl assessmentofImporterControl)
		throws SystemException {
		return getPersistence().update(assessmentofImporterControl);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AssessmentofImporterControl update(
		AssessmentofImporterControl assessmentofImporterControl,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(assessmentofImporterControl, serviceContext);
	}

	/**
	* Returns all the assessmentof importer controls where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByImporterCode(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCode(importercode, assessmentid,
			assessmentyear);
	}

	/**
	* Returns a range of all the assessmentof importer controls where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @return the range of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByImporterCode(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCode(importercode, assessmentid,
			assessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importer controls where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByImporterCode(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCode(importercode, assessmentid,
			assessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer control in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl findByImporterCode_First(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByImporterCode_First(importercode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer control in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchByImporterCode_First(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCode_First(importercode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer control in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl findByImporterCode_Last(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByImporterCode_Last(importercode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer control in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchByImporterCode_Last(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCode_Last(importercode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof importer controls before and after the current assessmentof importer control in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof importer control
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl[] findByImporterCode_PrevAndNext(
		long id, java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByImporterCode_PrevAndNext(id, importercode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessmentof importer controls where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByImporterCode(java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByImporterCode(importercode, assessmentid, assessmentyear);
	}

	/**
	* Returns the number of assessmentof importer controls where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static int countByImporterCode(java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByImporterCode(importercode, assessmentid,
			assessmentyear);
	}

	/**
	* Returns all the assessmentof importer controls where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCodeReference(importercodereference,
			assessmentid, assessmentyear);
	}

	/**
	* Returns a range of all the assessmentof importer controls where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @return the range of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCodeReference(importercodereference,
			assessmentid, assessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importer controls where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCodeReference(importercodereference,
			assessmentid, assessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer control in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl findByImporterCodeReference_First(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByImporterCodeReference_First(importercodereference,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer control in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchByImporterCodeReference_First(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCodeReference_First(importercodereference,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer control in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl findByImporterCodeReference_Last(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByImporterCodeReference_Last(importercodereference,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer control in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchByImporterCodeReference_Last(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCodeReference_Last(importercodereference,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof importer controls before and after the current assessmentof importer control in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof importer control
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl[] findByImporterCodeReference_PrevAndNext(
		long id, java.lang.String importercodereference,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByImporterCodeReference_PrevAndNext(id,
			importercodereference, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof importer controls where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByImporterCodeReference(importercodereference, assessmentid,
			assessmentyear);
	}

	/**
	* Returns the number of assessmentof importer controls where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static int countByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByImporterCodeReference(importercodereference,
			assessmentid, assessmentyear);
	}

	/**
	* Returns all the assessmentof importer controls where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByImporterName(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterName(importername, assessmentid,
			assessmentyear);
	}

	/**
	* Returns a range of all the assessmentof importer controls where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @return the range of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByImporterName(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterName(importername, assessmentid,
			assessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importer controls where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByImporterName(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterName(importername, assessmentid,
			assessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer control in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl findByImporterName_First(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByImporterName_First(importername, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer control in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchByImporterName_First(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterName_First(importername, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer control in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl findByImporterName_Last(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByImporterName_Last(importername, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer control in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchByImporterName_Last(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterName_Last(importername, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof importer controls before and after the current assessmentof importer control in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof importer control
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl[] findByImporterName_PrevAndNext(
		long id, java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByImporterName_PrevAndNext(id, importername,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessmentof importer controls where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByImporterName(java.lang.String importername,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByImporterName(importername, assessmentid, assessmentyear);
	}

	/**
	* Returns the number of assessmentof importer controls where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static int countByImporterName(java.lang.String importername,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByImporterName(importername, assessmentid,
			assessmentyear);
	}

	/**
	* Returns all the assessmentof importer controls where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterCode(importercode,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns a range of all the assessmentof importer controls where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @return the range of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterCode(importercode,
			nextassessmentid, nextassessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importer controls where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterCode(importercode,
			nextassessmentid, nextassessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer control in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl findByNextPeriodByImporterCode_First(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByNextPeriodByImporterCode_First(importercode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer control in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchByNextPeriodByImporterCode_First(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByImporterCode_First(importercode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer control in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl findByNextPeriodByImporterCode_Last(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByNextPeriodByImporterCode_Last(importercode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer control in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchByNextPeriodByImporterCode_Last(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByImporterCode_Last(importercode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof importer controls before and after the current assessmentof importer control in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof importer control
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl[] findByNextPeriodByImporterCode_PrevAndNext(
		long id, java.lang.String importercode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByNextPeriodByImporterCode_PrevAndNext(id,
			importercode, nextassessmentid, nextassessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof importer controls where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByNextPeriodByImporterCode(importercode, nextassessmentid,
			nextassessmentyear);
	}

	/**
	* Returns the number of assessmentof importer controls where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByNextPeriodByImporterCode(importercode,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns all the assessmentof importer controls where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns a range of all the assessmentof importer controls where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @return the range of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importer controls where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer control in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl findByNextPeriodByImporterCodeReference_First(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByNextPeriodByImporterCodeReference_First(importercodereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer control in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchByNextPeriodByImporterCodeReference_First(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByImporterCodeReference_First(importercodereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer control in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl findByNextPeriodByImporterCodeReference_Last(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByNextPeriodByImporterCodeReference_Last(importercodereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer control in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchByNextPeriodByImporterCodeReference_Last(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByImporterCodeReference_Last(importercodereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof importer controls before and after the current assessmentof importer control in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof importer control
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl[] findByNextPeriodByImporterCodeReference_PrevAndNext(
		long id, java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByNextPeriodByImporterCodeReference_PrevAndNext(id,
			importercodereference, nextassessmentid, nextassessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof importer controls where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns the number of assessmentof importer controls where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns all the assessmentof importer controls where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterName(importername,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns a range of all the assessmentof importer controls where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @return the range of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterName(importername,
			nextassessmentid, nextassessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importer controls where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterName(importername,
			nextassessmentid, nextassessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer control in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl findByNextPeriodByImporterName_First(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByNextPeriodByImporterName_First(importername,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer control in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchByNextPeriodByImporterName_First(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByImporterName_First(importername,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer control in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl findByNextPeriodByImporterName_Last(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByNextPeriodByImporterName_Last(importername,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer control in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer control, or <code>null</code> if a matching assessmentof importer control could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchByNextPeriodByImporterName_Last(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByImporterName_Last(importername,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof importer controls before and after the current assessmentof importer control in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof importer control
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl[] findByNextPeriodByImporterName_PrevAndNext(
		long id, java.lang.String importername,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence()
				   .findByNextPeriodByImporterName_PrevAndNext(id,
			importername, nextassessmentid, nextassessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof importer controls where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByNextPeriodByImporterName(importername, nextassessmentid,
			nextassessmentyear);
	}

	/**
	* Returns the number of assessmentof importer controls where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByNextPeriodByImporterName(importername,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Caches the assessmentof importer control in the entity cache if it is enabled.
	*
	* @param assessmentofImporterControl the assessmentof importer control
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl assessmentofImporterControl) {
		getPersistence().cacheResult(assessmentofImporterControl);
	}

	/**
	* Caches the assessmentof importer controls in the entity cache if it is enabled.
	*
	* @param assessmentofImporterControls the assessmentof importer controls
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> assessmentofImporterControls) {
		getPersistence().cacheResult(assessmentofImporterControls);
	}

	/**
	* Creates a new assessmentof importer control with the primary key. Does not add the assessmentof importer control to the database.
	*
	* @param id the primary key for the new assessmentof importer control
	* @return the new assessmentof importer control
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the assessmentof importer control with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessmentof importer control
	* @return the assessmentof importer control that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl assessmentofImporterControl)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessmentofImporterControl);
	}

	/**
	* Returns the assessmentof importer control with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException} if it could not be found.
	*
	* @param id the primary key of the assessmentof importer control
	* @return the assessmentof importer control
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException if a assessmentof importer control with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterControlException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the assessmentof importer control with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the assessmentof importer control
	* @return the assessmentof importer control, or <code>null</code> if a assessmentof importer control with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the assessmentof importer controls.
	*
	* @return the assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assessmentof importer controls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @return the range of assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importer controls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessmentof importer controls from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessmentof importer controls.
	*
	* @return the number of assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AssessmentofImporterControlPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AssessmentofImporterControlPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					AssessmentofImporterControlPersistence.class.getName());

			ReferenceRegistry.registerReference(AssessmentofImporterControlUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		AssessmentofImporterControlPersistence persistence) {
	}

	private static AssessmentofImporterControlPersistence _persistence;
}