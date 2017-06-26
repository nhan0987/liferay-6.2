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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod;

/**
 * The persistence interface for the assessmentof inspection method service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentofInspectionMethodPersistenceImpl
 * @see AssessmentofInspectionMethodUtil
 * @generated
 */
public interface AssessmentofInspectionMethodPersistence extends BasePersistence<AssessmentofInspectionMethod> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssessmentofInspectionMethodUtil} to access the assessmentof inspection method persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the assessmentof inspection methods where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof inspection methods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod> findByProductCode(
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof inspection methods where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof inspection methods
	* @param end the upper bound of the range of assessmentof inspection methods (not inclusive)
	* @return the range of matching assessmentof inspection methods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod> findByProductCode(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof inspection methods where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof inspection methods
	* @param end the upper bound of the range of assessmentof inspection methods (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof inspection methods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod> findByProductCode(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessmentof inspection method in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof inspection method
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException if a matching assessmentof inspection method could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod findByProductCode_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException;

	/**
	* Returns the first assessmentof inspection method in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof inspection method, or <code>null</code> if a matching assessmentof inspection method could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod fetchByProductCode_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessmentof inspection method in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof inspection method
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException if a matching assessmentof inspection method could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod findByProductCode_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException;

	/**
	* Returns the last assessmentof inspection method in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof inspection method, or <code>null</code> if a matching assessmentof inspection method could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod fetchByProductCode_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof inspection methods before and after the current assessmentof inspection method in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof inspection method
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof inspection method
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException if a assessmentof inspection method with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod[] findByProductCode_PrevAndNext(
		long id, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException;

	/**
	* Removes all the assessmentof inspection methods where assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByProductCode(java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof inspection methods where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof inspection methods
	* @throws SystemException if a system exception occurred
	*/
	public int countByProductCode(java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the assessmentof inspection method in the entity cache if it is enabled.
	*
	* @param assessmentofInspectionMethod the assessmentof inspection method
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod assessmentofInspectionMethod);

	/**
	* Caches the assessmentof inspection methods in the entity cache if it is enabled.
	*
	* @param assessmentofInspectionMethods the assessmentof inspection methods
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod> assessmentofInspectionMethods);

	/**
	* Creates a new assessmentof inspection method with the primary key. Does not add the assessmentof inspection method to the database.
	*
	* @param id the primary key for the new assessmentof inspection method
	* @return the new assessmentof inspection method
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod create(
		long id);

	/**
	* Removes the assessmentof inspection method with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessmentof inspection method
	* @return the assessmentof inspection method that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException if a assessmentof inspection method with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod assessmentofInspectionMethod)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof inspection method with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException} if it could not be found.
	*
	* @param id the primary key of the assessmentof inspection method
	* @return the assessmentof inspection method
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException if a assessmentof inspection method with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofInspectionMethodException;

	/**
	* Returns the assessmentof inspection method with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the assessmentof inspection method
	* @return the assessmentof inspection method, or <code>null</code> if a assessmentof inspection method with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof inspection methods.
	*
	* @return the assessmentof inspection methods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof inspection methods.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof inspection methods
	* @param end the upper bound of the range of assessmentof inspection methods (not inclusive)
	* @return the range of assessmentof inspection methods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof inspection methods.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectionMethodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof inspection methods
	* @param end the upper bound of the range of assessmentof inspection methods (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessmentof inspection methods
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessmentof inspection methods from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof inspection methods.
	*
	* @return the number of assessmentof inspection methods
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}