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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter;

/**
 * The persistence interface for the assessmentof importer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentofImporterPersistenceImpl
 * @see AssessmentofImporterUtil
 * @generated
 */
public interface AssessmentofImporterPersistence extends BasePersistence<AssessmentofImporter> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssessmentofImporterUtil} to access the assessmentof importer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the assessmentof importers where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCode(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCode(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCode(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByImporterCode_First(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByImporterCode_First(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByImporterCode_Last(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByImporterCode_Last(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter[] findByImporterCode_PrevAndNext(
		long id, java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

	/**
	* Removes all the assessmentof importers where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByImporterCode(java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof importers where importercode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public int countByImporterCode(java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof importers where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByImporterCodeReference_First(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByImporterCodeReference_First(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByImporterCodeReference_Last(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByImporterCodeReference_Last(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter[] findByImporterCodeReference_PrevAndNext(
		long id, java.lang.String importercodereference,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

	/**
	* Removes all the assessmentof importers where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof importers where importercodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public int countByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof importers where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterName(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterName(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterName(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByImporterName_First(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByImporterName_First(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByImporterName_Last(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByImporterName_Last(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter[] findByImporterName_PrevAndNext(
		long id, java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

	/**
	* Removes all the assessmentof importers where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByImporterName(java.lang.String importername,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof importers where importername = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param importername the importername
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public int countByImporterName(java.lang.String importername,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof importers where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByNextPeriodByImporterCode_First(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByNextPeriodByImporterCode_First(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByNextPeriodByImporterCode_Last(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByNextPeriodByImporterCode_Last(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter[] findByNextPeriodByImporterCode_PrevAndNext(
		long id, java.lang.String importercode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

	/**
	* Removes all the assessmentof importers where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof importers where importercode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercode the importercode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public int countByNextPeriodByImporterCode(java.lang.String importercode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof importers where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByNextPeriodByImporterCodeReference_First(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByNextPeriodByImporterCodeReference_First(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByNextPeriodByImporterCodeReference_Last(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByNextPeriodByImporterCodeReference_Last(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter[] findByNextPeriodByImporterCodeReference_PrevAndNext(
		long id, java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

	/**
	* Removes all the assessmentof importers where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof importers where importercodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importercodereference the importercodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public int countByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof importers where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByNextPeriodByImporterName_First(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByNextPeriodByImporterName_First(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByNextPeriodByImporterName_Last(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByNextPeriodByImporterName_Last(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter[] findByNextPeriodByImporterName_PrevAndNext(
		long id, java.lang.String importername,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

	/**
	* Removes all the assessmentof importers where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof importers where importername = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param importername the importername
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public int countByNextPeriodByImporterName(java.lang.String importername,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the assessmentof importer in the entity cache if it is enabled.
	*
	* @param assessmentofImporter the assessmentof importer
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter assessmentofImporter);

	/**
	* Caches the assessmentof importers in the entity cache if it is enabled.
	*
	* @param assessmentofImporters the assessmentof importers
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> assessmentofImporters);

	/**
	* Creates a new assessmentof importer with the primary key. Does not add the assessmentof importer to the database.
	*
	* @param id the primary key for the new assessmentof importer
	* @return the new assessmentof importer
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter create(long id);

	/**
	* Removes the assessmentof importer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessmentof importer
	* @return the assessmentof importer that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter assessmentofImporter)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof importer with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException} if it could not be found.
	*
	* @param id the primary key of the assessmentof importer
	* @return the assessmentof importer
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofImporterException;

	/**
	* Returns the assessmentof importer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the assessmentof importer
	* @return the assessmentof importer, or <code>null</code> if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof importers.
	*
	* @return the assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessmentof importers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof importers.
	*
	* @return the number of assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}