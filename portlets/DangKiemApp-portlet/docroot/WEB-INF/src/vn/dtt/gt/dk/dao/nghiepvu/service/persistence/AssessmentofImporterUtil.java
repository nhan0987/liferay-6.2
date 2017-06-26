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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter;

import java.util.List;

/**
 * The persistence utility for the assessmentof importer service. This utility wraps {@link AssessmentofImporterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentofImporterPersistence
 * @see AssessmentofImporterPersistenceImpl
 * @generated
 */
public class AssessmentofImporterUtil {
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
	public static void clearCache(AssessmentofImporter assessmentofImporter) {
		getPersistence().clearCache(assessmentofImporter);
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
	public static List<AssessmentofImporter> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssessmentofImporter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssessmentofImporter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AssessmentofImporter update(
		AssessmentofImporter assessmentofImporter) throws SystemException {
		return getPersistence().update(assessmentofImporter);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AssessmentofImporter update(
		AssessmentofImporter assessmentofImporter, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(assessmentofImporter, serviceContext);
	}

	/**
	* Returns all the assessmentof importers where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCode(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCode(importercode, assessmentid,
			assessmentyear);
	}

	/**
	* Returns a range of all the assessmentof importers where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @return the range of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCode(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCode(importercode, assessmentid,
			assessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importers where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCode(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCode(importercode, assessmentid,
			assessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByImporterCode_First(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByImporterCode_First(importercode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByImporterCode_First(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCode_First(importercode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByImporterCode_Last(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByImporterCode_Last(importercode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByImporterCode_Last(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCode_Last(importercode, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof importers before and after the current assessmentof importer in the ordered set where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof importer
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter[] findByImporterCode_PrevAndNext(
		long id, java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByImporterCode_PrevAndNext(id, importercode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessmentof importers where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
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
	* Returns the number of assessmentof importers where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof importers
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
	* Returns all the assessmentof importers where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCodeReference(importercodereference,
			assessmentid, assessmentyear);
	}

	/**
	* Returns a range of all the assessmentof importers where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @return the range of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCodeReference(importercodereference,
			assessmentid, assessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importers where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterCodeReference(importercodereference,
			assessmentid, assessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByImporterCodeReference_First(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByImporterCodeReference_First(importercodereference,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByImporterCodeReference_First(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCodeReference_First(importercodereference,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByImporterCodeReference_Last(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByImporterCodeReference_Last(importercodereference,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByImporterCodeReference_Last(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterCodeReference_Last(importercodereference,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof importers before and after the current assessmentof importer in the ordered set where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof importer
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter[] findByImporterCodeReference_PrevAndNext(
		long id, java.lang.String importercodereference,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByImporterCodeReference_PrevAndNext(id,
			importercodereference, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof importers where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
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
	* Returns the number of assessmentof importers where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof importers
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
	* Returns all the assessmentof importers where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterName(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterName(importername, assessmentid,
			assessmentyear);
	}

	/**
	* Returns a range of all the assessmentof importers where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @return the range of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterName(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterName(importername, assessmentid,
			assessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importers where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterName(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByImporterName(importername, assessmentid,
			assessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByImporterName_First(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByImporterName_First(importername, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByImporterName_First(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterName_First(importername, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByImporterName_Last(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByImporterName_Last(importername, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByImporterName_Last(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByImporterName_Last(importername, assessmentid,
			assessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof importers before and after the current assessmentof importer in the ordered set where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof importer
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter[] findByImporterName_PrevAndNext(
		long id, java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByImporterName_PrevAndNext(id, importername,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessmentof importers where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
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
	* Returns the number of assessmentof importers where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof importers
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
	* Returns all the assessmentof importers where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterCode(importercode,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns a range of all the assessmentof importers where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @return the range of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterCode(importercode,
			nextassessmentid, nextassessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importers where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterCode(importercode,
			nextassessmentid, nextassessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByNextPeriodByImporterCode_First(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByNextPeriodByImporterCode_First(importercode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByNextPeriodByImporterCode_First(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByImporterCode_First(importercode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByNextPeriodByImporterCode_Last(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByNextPeriodByImporterCode_Last(importercode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByNextPeriodByImporterCode_Last(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByImporterCode_Last(importercode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof importers before and after the current assessmentof importer in the ordered set where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof importer
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter[] findByNextPeriodByImporterCode_PrevAndNext(
		long id, java.lang.String importercode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByNextPeriodByImporterCode_PrevAndNext(id,
			importercode, nextassessmentid, nextassessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof importers where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
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
	* Returns the number of assessmentof importers where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof importers
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
	* Returns all the assessmentof importers where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns a range of all the assessmentof importers where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @return the range of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importers where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCodeReference(
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
	* Returns the first assessmentof importer in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByNextPeriodByImporterCodeReference_First(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByNextPeriodByImporterCodeReference_First(importercodereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByNextPeriodByImporterCodeReference_First(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByImporterCodeReference_First(importercodereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByNextPeriodByImporterCodeReference_Last(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByNextPeriodByImporterCodeReference_Last(importercodereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByNextPeriodByImporterCodeReference_Last(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByImporterCodeReference_Last(importercodereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof importers before and after the current assessmentof importer in the ordered set where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof importer
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter[] findByNextPeriodByImporterCodeReference_PrevAndNext(
		long id, java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByNextPeriodByImporterCodeReference_PrevAndNext(id,
			importercodereference, nextassessmentid, nextassessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof importers where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
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
	* Returns the number of assessmentof importers where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof importers
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
	* Returns all the assessmentof importers where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterName(importername,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns a range of all the assessmentof importers where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @return the range of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterName(importername,
			nextassessmentid, nextassessmentyear, start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importers where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByImporterName(importername,
			nextassessmentid, nextassessmentyear, start, end, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByNextPeriodByImporterName_First(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByNextPeriodByImporterName_First(importername,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the first assessmentof importer in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByNextPeriodByImporterName_First(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByImporterName_First(importername,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByNextPeriodByImporterName_Last(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByNextPeriodByImporterName_Last(importername,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the last assessmentof importer in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof importer, or <code>null</code> if a matching assessmentof importer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByNextPeriodByImporterName_Last(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByImporterName_Last(importername,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Returns the assessmentof importers before and after the current assessmentof importer in the ordered set where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof importer
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter[] findByNextPeriodByImporterName_PrevAndNext(
		long id, java.lang.String importername,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence()
				   .findByNextPeriodByImporterName_PrevAndNext(id,
			importername, nextassessmentid, nextassessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof importers where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
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
	* Returns the number of assessmentof importers where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof importers
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
	* Caches the assessmentof importer in the entity cache if it is enabled.
	*
	* @param assessmentofImporter the assessmentof importer
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter assessmentofImporter) {
		getPersistence().cacheResult(assessmentofImporter);
	}

	/**
	* Caches the assessmentof importers in the entity cache if it is enabled.
	*
	* @param assessmentofImporters the assessmentof importers
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> assessmentofImporters) {
		getPersistence().cacheResult(assessmentofImporters);
	}

	/**
	* Creates a new assessmentof importer with the primary key. Does not add the assessmentof importer to the database.
	*
	* @param id the primary key for the new assessmentof importer
	* @return the new assessmentof importer
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the assessmentof importer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessmentof importer
	* @return the assessmentof importer that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter assessmentofImporter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessmentofImporter);
	}

	/**
	* Returns the assessmentof importer with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException} if it could not be found.
	*
	* @param id the primary key of the assessmentof importer
	* @return the assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the assessmentof importer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the assessmentof importer
	* @return the assessmentof importer, or <code>null</code> if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the assessmentof importers.
	*
	* @return the assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the assessmentof importers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @return the range of assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the assessmentof importers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessmentof importers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessmentof importers.
	*
	* @return the number of assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AssessmentofImporterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AssessmentofImporterPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					AssessmentofImporterPersistence.class.getName());

			ReferenceRegistry.registerReference(AssessmentofImporterUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AssessmentofImporterPersistence persistence) {
	}

	private static AssessmentofImporterPersistence _persistence;
}