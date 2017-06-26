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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct;

import java.util.List;

/**
 * The persistence utility for the assessmentof product service. This utility wraps {@link AssessmentofProductPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentofProductPersistence
 * @see AssessmentofProductPersistenceImpl
 * @generated
 */
public class AssessmentofProductUtil {
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
	public static void clearCache(AssessmentofProduct assessmentofProduct) {
		getPersistence().clearCache(assessmentofProduct);
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
	public static List<AssessmentofProduct> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssessmentofProduct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssessmentofProduct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static AssessmentofProduct update(
		AssessmentofProduct assessmentofProduct) throws SystemException {
		return getPersistence().update(assessmentofProduct);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static AssessmentofProduct update(
		AssessmentofProduct assessmentofProduct, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(assessmentofProduct, serviceContext);
	}

	/**
	* Returns all the assessmentof products where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCode(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductCode(productcode, assessmentid, assessmentyear);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCode(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductCode(productcode, assessmentid,
			assessmentyear, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCode(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductCode(productcode, assessmentid,
			assessmentyear, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductCode_First(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductCode_First(productcode, assessmentid,
			assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductCode_First(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductCode_First(productcode, assessmentid,
			assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductCode_Last(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductCode_Last(productcode, assessmentid,
			assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductCode_Last(
		java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductCode_Last(productcode, assessmentid,
			assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByProductCode_PrevAndNext(
		long id, java.lang.String productcode, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductCode_PrevAndNext(id, productcode,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessmentof products where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param productcode the productcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByProductCode(java.lang.String productcode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByProductCode(productcode, assessmentid, assessmentyear);
	}

	/**
	* Returns the number of assessmentof products where productcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductCode(java.lang.String productcode,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByProductCode(productcode, assessmentid, assessmentyear);
	}

	/**
	* Returns all the assessmentof products where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productname the productname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductName(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductName(productname, assessmentid, assessmentyear);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductName(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductName(productname, assessmentid,
			assessmentyear, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductName(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductName(productname, assessmentid,
			assessmentyear, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductName_First(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductName_First(productname, assessmentid,
			assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductName_First(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductName_First(productname, assessmentid,
			assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductName_Last(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductName_Last(productname, assessmentid,
			assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductName_Last(
		java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductName_Last(productname, assessmentid,
			assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByProductName_PrevAndNext(
		long id, java.lang.String productname, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductName_PrevAndNext(id, productname,
			assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessmentof products where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param productname the productname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByProductName(java.lang.String productname,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByProductName(productname, assessmentid, assessmentyear);
	}

	/**
	* Returns the number of assessmentof products where productname = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productname the productname
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductName(java.lang.String productname,
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByProductName(productname, assessmentid, assessmentyear);
	}

	/**
	* Returns all the assessmentof products where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCodeReference(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductCodeReference(productcodereference,
			assessmentid, assessmentyear);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCodeReference(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductCodeReference(productcodereference,
			assessmentid, assessmentyear, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductCodeReference(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductCodeReference(productcodereference,
			assessmentid, assessmentyear, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductCodeReference_First(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductCodeReference_First(productcodereference,
			assessmentid, assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductCodeReference_First(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductCodeReference_First(productcodereference,
			assessmentid, assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductCodeReference_Last(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductCodeReference_Last(productcodereference,
			assessmentid, assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductCodeReference_Last(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductCodeReference_Last(productcodereference,
			assessmentid, assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByProductCodeReference_PrevAndNext(
		long id, java.lang.String productcodereference,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductCodeReference_PrevAndNext(id,
			productcodereference, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof products where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param productcodereference the productcodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByProductCodeReference(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByProductCodeReference(productcodereference, assessmentid,
			assessmentyear);
	}

	/**
	* Returns the number of assessmentof products where productcodereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductCodeReference(
		java.lang.String productcodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByProductCodeReference(productcodereference,
			assessmentid, assessmentyear);
	}

	/**
	* Returns all the assessmentof products where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductNameReference(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductNameReference(productnamereference,
			assessmentid, assessmentyear);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductNameReference(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductNameReference(productnamereference,
			assessmentid, assessmentyear, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductNameReference(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductNameReference(productnamereference,
			assessmentid, assessmentyear, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductNameReference_First(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductNameReference_First(productnamereference,
			assessmentid, assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductNameReference_First(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductNameReference_First(productnamereference,
			assessmentid, assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductNameReference_Last(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductNameReference_Last(productnamereference,
			assessmentid, assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductNameReference_Last(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductNameReference_Last(productnamereference,
			assessmentid, assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByProductNameReference_PrevAndNext(
		long id, java.lang.String productnamereference,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductNameReference_PrevAndNext(id,
			productnamereference, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof products where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param productnamereference the productnamereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByProductNameReference(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByProductNameReference(productnamereference, assessmentid,
			assessmentyear);
	}

	/**
	* Returns the number of assessmentof products where productnamereference = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductNameReference(
		java.lang.String productnamereference, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByProductNameReference(productnamereference,
			assessmentid, assessmentyear);
	}

	/**
	* Returns all the assessmentof products where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductDescription(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductDescription(productdescription, assessmentid,
			assessmentyear);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductDescription(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductDescription(productdescription, assessmentid,
			assessmentyear, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByProductDescription(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductDescription(productdescription, assessmentid,
			assessmentyear, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductDescription_First(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductDescription_First(productdescription,
			assessmentid, assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductDescription_First(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductDescription_First(productdescription,
			assessmentid, assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByProductDescription_Last(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductDescription_Last(productdescription,
			assessmentid, assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByProductDescription_Last(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductDescription_Last(productdescription,
			assessmentid, assessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByProductDescription_PrevAndNext(
		long id, java.lang.String productdescription,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByProductDescription_PrevAndNext(id,
			productdescription, assessmentid, assessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessmentof products where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param productdescription the productdescription
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByProductDescription(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByProductDescription(productdescription, assessmentid,
			assessmentyear);
	}

	/**
	* Returns the number of assessmentof products where productdescription = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductDescription(
		java.lang.String productdescription, java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByProductDescription(productdescription, assessmentid,
			assessmentyear);
	}

	/**
	* Returns all the assessmentof products where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCode(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductCode(productcode,
			nextassessmentid, nextassessmentyear);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCode(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductCode(productcode,
			nextassessmentid, nextassessmentyear, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCode(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductCode(productcode,
			nextassessmentid, nextassessmentyear, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductCode_First(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductCode_First(productcode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductCode_First(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByProductCode_First(productcode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductCode_Last(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductCode_Last(productcode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductCode_Last(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByProductCode_Last(productcode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByNextPeriodByProductCode_PrevAndNext(
		long id, java.lang.String productcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductCode_PrevAndNext(id, productcode,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessmentof products where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param productcode the productcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNextPeriodByProductCode(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByNextPeriodByProductCode(productcode, nextassessmentid,
			nextassessmentyear);
	}

	/**
	* Returns the number of assessmentof products where productcode = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcode the productcode
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNextPeriodByProductCode(
		java.lang.String productcode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByNextPeriodByProductCode(productcode,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns all the assessmentof products where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productname the productname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductName(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductName(productname,
			nextassessmentid, nextassessmentyear);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductName(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductName(productname,
			nextassessmentid, nextassessmentyear, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductName(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductName(productname,
			nextassessmentid, nextassessmentyear, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductName_First(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductName_First(productname,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductName_First(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByProductName_First(productname,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductName_Last(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductName_Last(productname,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductName_Last(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByProductName_Last(productname,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByNextPeriodByProductName_PrevAndNext(
		long id, java.lang.String productname,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductName_PrevAndNext(id, productname,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

	/**
	* Removes all the assessmentof products where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param productname the productname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNextPeriodByProductName(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByNextPeriodByProductName(productname, nextassessmentid,
			nextassessmentyear);
	}

	/**
	* Returns the number of assessmentof products where productname = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productname the productname
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNextPeriodByProductName(
		java.lang.String productname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByNextPeriodByProductName(productname,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns all the assessmentof products where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCodeReference(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductCodeReference(productcodereference,
			nextassessmentid, nextassessmentyear);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCodeReference(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductCodeReference(productcodereference,
			nextassessmentid, nextassessmentyear, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductCodeReference(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductCodeReference(productcodereference,
			nextassessmentid, nextassessmentyear, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductCodeReference_First(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductCodeReference_First(productcodereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductCodeReference_First(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByProductCodeReference_First(productcodereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductCodeReference_Last(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductCodeReference_Last(productcodereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductCodeReference_Last(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByProductCodeReference_Last(productcodereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByNextPeriodByProductCodeReference_PrevAndNext(
		long id, java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductCodeReference_PrevAndNext(id,
			productcodereference, nextassessmentid, nextassessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof products where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param productcodereference the productcodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNextPeriodByProductCodeReference(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByNextPeriodByProductCodeReference(productcodereference,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns the number of assessmentof products where productcodereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productcodereference the productcodereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNextPeriodByProductCodeReference(
		java.lang.String productcodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByNextPeriodByProductCodeReference(productcodereference,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns all the assessmentof products where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductNameReference(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductNameReference(productnamereference,
			nextassessmentid, nextassessmentyear);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductNameReference(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductNameReference(productnamereference,
			nextassessmentid, nextassessmentyear, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductNameReference(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductNameReference(productnamereference,
			nextassessmentid, nextassessmentyear, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductNameReference_First(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductNameReference_First(productnamereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductNameReference_First(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByProductNameReference_First(productnamereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductNameReference_Last(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductNameReference_Last(productnamereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductNameReference_Last(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByProductNameReference_Last(productnamereference,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByNextPeriodByProductNameReference_PrevAndNext(
		long id, java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductNameReference_PrevAndNext(id,
			productnamereference, nextassessmentid, nextassessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof products where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param productnamereference the productnamereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNextPeriodByProductNameReference(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByNextPeriodByProductNameReference(productnamereference,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns the number of assessmentof products where productnamereference = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productnamereference the productnamereference
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNextPeriodByProductNameReference(
		java.lang.String productnamereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByNextPeriodByProductNameReference(productnamereference,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns all the assessmentof products where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductDescription(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductDescription(productdescription,
			nextassessmentid, nextassessmentyear);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductDescription(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductDescription(productdescription,
			nextassessmentid, nextassessmentyear, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByNextPeriodByProductDescription(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNextPeriodByProductDescription(productdescription,
			nextassessmentid, nextassessmentyear, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductDescription_First(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductDescription_First(productdescription,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductDescription_First(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByProductDescription_First(productdescription,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByNextPeriodByProductDescription_Last(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductDescription_Last(productdescription,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByNextPeriodByProductDescription_Last(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNextPeriodByProductDescription_Last(productdescription,
			nextassessmentid, nextassessmentyear, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByNextPeriodByProductDescription_PrevAndNext(
		long id, java.lang.String productdescription,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByNextPeriodByProductDescription_PrevAndNext(id,
			productdescription, nextassessmentid, nextassessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof products where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63; from the database.
	*
	* @param productdescription the productdescription
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNextPeriodByProductDescription(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByNextPeriodByProductDescription(productdescription,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns the number of assessmentof products where productdescription = &#63; and nextassessmentid = &#63; and nextassessmentyear = &#63;.
	*
	* @param productdescription the productdescription
	* @param nextassessmentid the nextassessmentid
	* @param nextassessmentyear the nextassessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNextPeriodByProductDescription(
		java.lang.String productdescription, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByNextPeriodByProductDescription(productdescription,
			nextassessmentid, nextassessmentyear);
	}

	/**
	* Returns all the assessmentof products where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByAI_AY(
		java.lang.String assessmentid, java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAI_AY(assessmentid, assessmentyear);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByAI_AY(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAI_AY(assessmentid, assessmentyear, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findByAI_AY(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAI_AY(assessmentid, assessmentyear, start, end,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByAI_AY_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByAI_AY_First(assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the first assessmentof product in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByAI_AY_First(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAI_AY_First(assessmentid, assessmentyear,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByAI_AY_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByAI_AY_Last(assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Returns the last assessmentof product in the ordered set where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assessmentof product, or <code>null</code> if a matching assessmentof product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByAI_AY_Last(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAI_AY_Last(assessmentid, assessmentyear,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct[] findByAI_AY_PrevAndNext(
		long id, java.lang.String assessmentid,
		java.lang.String assessmentyear,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence()
				   .findByAI_AY_PrevAndNext(id, assessmentid, assessmentyear,
			orderByComparator);
	}

	/**
	* Removes all the assessmentof products where assessmentid = &#63; and assessmentyear = &#63; from the database.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAI_AY(java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAI_AY(assessmentid, assessmentyear);
	}

	/**
	* Returns the number of assessmentof products where assessmentid = &#63; and assessmentyear = &#63;.
	*
	* @param assessmentid the assessmentid
	* @param assessmentyear the assessmentyear
	* @return the number of matching assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAI_AY(java.lang.String assessmentid,
		java.lang.String assessmentyear)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAI_AY(assessmentid, assessmentyear);
	}

	/**
	* Caches the assessmentof product in the entity cache if it is enabled.
	*
	* @param assessmentofProduct the assessmentof product
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct assessmentofProduct) {
		getPersistence().cacheResult(assessmentofProduct);
	}

	/**
	* Caches the assessmentof products in the entity cache if it is enabled.
	*
	* @param assessmentofProducts the assessmentof products
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> assessmentofProducts) {
		getPersistence().cacheResult(assessmentofProducts);
	}

	/**
	* Creates a new assessmentof product with the primary key. Does not add the assessmentof product to the database.
	*
	* @param id the primary key for the new assessmentof product
	* @return the new assessmentof product
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the assessmentof product with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessmentof product
	* @return the assessmentof product that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct assessmentofProduct)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assessmentofProduct);
	}

	/**
	* Returns the assessmentof product with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException} if it could not be found.
	*
	* @param id the primary key of the assessmentof product
	* @return the assessmentof product
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentofProductException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the assessmentof product with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the assessmentof product
	* @return the assessmentof product, or <code>null</code> if a assessmentof product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the assessmentof products.
	*
	* @return the assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofProduct> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assessmentof products from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assessmentof products.
	*
	* @return the number of assessmentof products
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AssessmentofProductPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AssessmentofProductPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					AssessmentofProductPersistence.class.getName());

			ReferenceRegistry.registerReference(AssessmentofProductUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AssessmentofProductPersistence persistence) {
	}

	private static AssessmentofProductPersistence _persistence;
}