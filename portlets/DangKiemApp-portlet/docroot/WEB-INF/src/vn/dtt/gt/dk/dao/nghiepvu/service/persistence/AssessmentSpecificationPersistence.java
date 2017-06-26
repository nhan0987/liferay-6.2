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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification;

/**
 * The persistence interface for the assessment specification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentSpecificationPersistenceImpl
 * @see AssessmentSpecificationUtil
 * @generated
 */
public interface AssessmentSpecificationPersistence extends BasePersistence<AssessmentSpecification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssessmentSpecificationUtil} to access the assessment specification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByImporterCode_First(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByImporterCode_First(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByImporterCode_Last(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByImporterCode_Last(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification[] findByImporterCode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

	/**
	* Removes all the assessment specifications where specificationgroupcode = &#63; and importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByImporterCode(java.lang.String specificationgroupcode,
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByImporterCode(java.lang.String specificationgroupcode,
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByInspectorContactcode_First(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByInspectorContactcode_First(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByInspectorContactcode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByInspectorContactcode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification[] findByInspectorContactcode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

	/**
	* Removes all the assessment specifications where specificationgroupcode = &#63; and inspectorcontactcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param inspectorcontactcode the inspectorcontactcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByInspectorContactcode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByInspectorContactcode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByProductionCode_First(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByProductionCode_First(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByProductionCode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByProductionCode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification[] findByProductionCode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

	/**
	* Removes all the assessment specifications where specificationgroupcode = &#63; and productioncode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param specificationgroupcode the specificationgroupcode
	* @param productioncode the productioncode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByProductionCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByProductionCode(java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByInspectorContactcodeAndSpecificationCode_First(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByInspectorContactcodeAndSpecificationCode_First(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByInspectorContactcodeAndSpecificationCode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByInspectorContactcodeAndSpecificationCode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification[] findByInspectorContactcodeAndSpecificationCode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public void removeByInspectorContactcodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByInspectorContactcodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCodeAndSpecificationCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCodeAndSpecificationCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCodeAndSpecificationCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByImporterCodeAndSpecificationCode_First(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByImporterCodeAndSpecificationCode_First(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByImporterCodeAndSpecificationCode_Last(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByImporterCodeAndSpecificationCode_Last(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification[] findByImporterCodeAndSpecificationCode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String importercode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public void removeByImporterCodeAndSpecificationCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByImporterCodeAndSpecificationCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByProductionCodeAndSpecificationCode_First(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByProductionCodeAndSpecificationCode_First(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByProductionCodeAndSpecificationCode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByProductionCodeAndSpecificationCode_Last(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification[] findByProductionCodeAndSpecificationCode_PrevAndNext(
		long id, java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

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
	public void removeByProductionCodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByProductionCodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the assessment specification in the entity cache if it is enabled.
	*
	* @param assessmentSpecification the assessment specification
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification assessmentSpecification);

	/**
	* Caches the assessment specifications in the entity cache if it is enabled.
	*
	* @param assessmentSpecifications the assessment specifications
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> assessmentSpecifications);

	/**
	* Creates a new assessment specification with the primary key. Does not add the assessment specification to the database.
	*
	* @param id the primary key for the new assessment specification
	* @return the new assessment specification
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification create(
		long id);

	/**
	* Removes the assessment specification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessment specification
	* @return the assessment specification that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification assessmentSpecification)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessment specification with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException} if it could not be found.
	*
	* @param id the primary key of the assessment specification
	* @return the assessment specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationException;

	/**
	* Returns the assessment specification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the assessment specification
	* @return the assessment specification, or <code>null</code> if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessment specifications.
	*
	* @return the assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessment specifications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessment specifications.
	*
	* @return the number of assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}