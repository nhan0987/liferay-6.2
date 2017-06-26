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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct;

/**
 * The persistence interface for the assessmentof product service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentofProductPersistenceImpl
 * @see AssessmentofProductUtil
 * @generated
 */
public interface AssessmentofProductPersistence extends BasePersistence<AssessmentofProduct> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssessmentofProductUtil} to access the assessmentof product persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the assessmentof products where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCode(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof products where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productcode the productcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @return the range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCode(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof products where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productcode the productcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCode(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessmentof product in the ordered set where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductCode_First(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the first assessmentof product in the ordered set where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductCode_First(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessmentof product in the ordered set where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductCode_Last(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the last assessmentof product in the ordered set where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductCode_Last(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof products before and after the current assessmentof product in the ordered set where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof product
	* @param productcode the productcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByProductCode_PrevAndNext(
		long id, java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Removes all the assessmentof products where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param productcode the productcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByProductCode(java.lang.String productcode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof products where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public int countByProductCode(java.lang.String productcode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof products where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productname the productname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductName(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof products where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productname the productname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @return the range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductName(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof products where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productname the productname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductName(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessmentof product in the ordered set where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productname the productname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductName_First(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the first assessmentof product in the ordered set where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productname the productname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductName_First(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessmentof product in the ordered set where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productname the productname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductName_Last(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the last assessmentof product in the ordered set where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productname the productname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductName_Last(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof products before and after the current assessmentof product in the ordered set where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof product
	* @param productname the productname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByProductName_PrevAndNext(
		long id, java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Removes all the assessmentof products where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param productname the productname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByProductName(java.lang.String productname,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof products where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productname the productname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public int countByProductName(java.lang.String productname,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof products where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCodeReference(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof products where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productcodereference the productcodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @return the range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCodeReference(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof products where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productcodereference the productcodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCodeReference(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessmentof product in the ordered set where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductCodeReference_First(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the first assessmentof product in the ordered set where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductCodeReference_First(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessmentof product in the ordered set where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductCodeReference_Last(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the last assessmentof product in the ordered set where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductCodeReference_Last(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof products before and after the current assessmentof product in the ordered set where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof product
	* @param productcodereference the productcodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByProductCodeReference_PrevAndNext(
		long id, java.lang.String productcodereference,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Removes all the assessmentof products where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param productcodereference the productcodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByProductCodeReference(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof products where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public int countByProductCodeReference(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof products where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductNameReference(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof products where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productnamereference the productnamereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @return the range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductNameReference(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof products where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productnamereference the productnamereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductNameReference(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessmentof product in the ordered set where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductNameReference_First(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the first assessmentof product in the ordered set where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductNameReference_First(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessmentof product in the ordered set where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductNameReference_Last(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the last assessmentof product in the ordered set where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductNameReference_Last(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof products before and after the current assessmentof product in the ordered set where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof product
	* @param productnamereference the productnamereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByProductNameReference_PrevAndNext(
		long id, java.lang.String productnamereference,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Removes all the assessmentof products where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param productnamereference the productnamereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByProductNameReference(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof products where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public int countByProductNameReference(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof products where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductDescription(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof products where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productdescription the productdescription
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @return the range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductDescription(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof products where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productdescription the productdescription
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductDescription(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessmentof product in the ordered set where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductDescription_First(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the first assessmentof product in the ordered set where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductDescription_First(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessmentof product in the ordered set where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductDescription_Last(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the last assessmentof product in the ordered set where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductDescription_Last(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof products before and after the current assessmentof product in the ordered set where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof product
	* @param productdescription the productdescription
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByProductDescription_PrevAndNext(
		long id, java.lang.String productdescription,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Removes all the assessmentof products where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param productdescription the productdescription
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByProductDescription(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof products where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public int countByProductDescription(java.lang.String productdescription,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof products where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCode(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof products where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productcode the productcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @return the range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCode(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof products where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productcode the productcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCode(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessmentof product in the ordered set where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductCode_First(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the first assessmentof product in the ordered set where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductCode_First(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessmentof product in the ordered set where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductCode_Last(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the last assessmentof product in the ordered set where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductCode_Last(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof products before and after the current assessmentof product in the ordered set where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof product
	* @param productcode the productcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByNextPeriodByProductCode_PrevAndNext(
		long id, java.lang.String productcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Removes all the assessmentof products where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param productcode the productcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNextPeriodByProductCode(java.lang.String productcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof products where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public int countByNextPeriodByProductCode(java.lang.String productcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof products where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productname the productname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductName(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof products where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productname the productname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @return the range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductName(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof products where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productname the productname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductName(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessmentof product in the ordered set where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productname the productname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductName_First(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the first assessmentof product in the ordered set where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productname the productname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductName_First(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessmentof product in the ordered set where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productname the productname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductName_Last(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the last assessmentof product in the ordered set where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productname the productname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductName_Last(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof products before and after the current assessmentof product in the ordered set where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof product
	* @param productname the productname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByNextPeriodByProductName_PrevAndNext(
		long id, java.lang.String productname,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Removes all the assessmentof products where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param productname the productname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNextPeriodByProductName(java.lang.String productname,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof products where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productname the productname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public int countByNextPeriodByProductName(java.lang.String productname,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof products where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCodeReference(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof products where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productcodereference the productcodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @return the range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCodeReference(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof products where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productcodereference the productcodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCodeReference(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessmentof product in the ordered set where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductCodeReference_First(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the first assessmentof product in the ordered set where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductCodeReference_First(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessmentof product in the ordered set where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductCodeReference_Last(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the last assessmentof product in the ordered set where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductCodeReference_Last(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof products before and after the current assessmentof product in the ordered set where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof product
	* @param productcodereference the productcodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByNextPeriodByProductCodeReference_PrevAndNext(
		long id, java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Removes all the assessmentof products where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param productcodereference the productcodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNextPeriodByProductCodeReference(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof products where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public int countByNextPeriodByProductCodeReference(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof products where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductNameReference(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof products where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productnamereference the productnamereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @return the range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductNameReference(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof products where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productnamereference the productnamereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductNameReference(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessmentof product in the ordered set where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductNameReference_First(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the first assessmentof product in the ordered set where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductNameReference_First(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessmentof product in the ordered set where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductNameReference_Last(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the last assessmentof product in the ordered set where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductNameReference_Last(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof products before and after the current assessmentof product in the ordered set where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof product
	* @param productnamereference the productnamereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByNextPeriodByProductNameReference_PrevAndNext(
		long id, java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Removes all the assessmentof products where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param productnamereference the productnamereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNextPeriodByProductNameReference(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof products where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public int countByNextPeriodByProductNameReference(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof products where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductDescription(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof products where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productdescription the productdescription
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @return the range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductDescription(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof products where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productdescription the productdescription
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductDescription(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessmentof product in the ordered set where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductDescription_First(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the first assessmentof product in the ordered set where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductDescription_First(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessmentof product in the ordered set where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductDescription_Last(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the last assessmentof product in the ordered set where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductDescription_Last(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof products before and after the current assessmentof product in the ordered set where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof product
	* @param productdescription the productdescription
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByNextPeriodByProductDescription_PrevAndNext(
		long id, java.lang.String productdescription,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Removes all the assessmentof products where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param productdescription the productdescription
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNextPeriodByProductDescription(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof products where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public int countByNextPeriodByProductDescription(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof products where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByAI_AY(
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof products where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @return the range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByAI_AY(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof products where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByAI_AY(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assessmentof product in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByAI_AY_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the first assessmentof product in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByAI_AY_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assessmentof product in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByAI_AY_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the last assessmentof product in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByAI_AY_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof products before and after the current assessmentof product in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param id the primary key of the current assessmentof product
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByAI_AY_PrevAndNext(
		long id, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Removes all the assessmentof products where assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAI_AY(java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof products where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public int countByAI_AY(java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the assessmentof product in the entity cache if it is enabled.
	*
	* @param assessmentofProduct the assessmentof product
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct assessmentofProduct);

	/**
	* Caches the assessmentof products in the entity cache if it is enabled.
	*
	* @param assessmentofProducts the assessmentof products
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> assessmentofProducts);

	/**
	* Creates a new assessmentof product with the primary key. Does not add the assessmentof product to the database.
	*
	* @param id the primary key for the new assessmentof product
	* @return the new assessmentof product
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct create(long id);

	/**
	* Removes the assessmentof product with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessmentof product
	* @return the assessmentof product that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct assessmentofProduct)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assessmentof product with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException} if it could not be found.
	*
	* @param id the primary key of the assessmentof product
	* @return the assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException;

	/**
	* Returns the assessmentof product with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the assessmentof product
	* @return the assessmentof product, or <code>null</code> if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assessmentof products.
	*
	* @return the assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assessmentof products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @return the range of assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assessmentof products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof products
	* @param end the upper bound of the range of assessmentof products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assessmentof products from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assessmentof products.
	*
	* @return the number of assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}