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

import vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec;

import java.util.List;

/**
 * The persistence utility for the satety test report spec service. This utility wraps {@link SatetyTestReportSpecPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see SatetyTestReportSpecPersistence
 * @see SatetyTestReportSpecPersistenceImpl
 * @generated
 */
public class SatetyTestReportSpecUtil {
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
	public static void clearCache(SatetyTestReportSpec satetyTestReportSpec) {
		getPersistence().clearCache(satetyTestReportSpec);
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
	public static List<SatetyTestReportSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SatetyTestReportSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SatetyTestReportSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static SatetyTestReportSpec update(
		SatetyTestReportSpec satetyTestReportSpec) throws SystemException {
		return getPersistence().update(satetyTestReportSpec);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static SatetyTestReportSpec update(
		SatetyTestReportSpec satetyTestReportSpec, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(satetyTestReportSpec, serviceContext);
	}

	/**
	* Returns all the satety test report specs where saftyTestReportId = &#63;.
	*
	* @param saftyTestReportId the safty test report ID
	* @return the matching satety test report specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> findBySaftyTestReportId(
		long saftyTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySaftyTestReportId(saftyTestReportId);
	}

	/**
	* Returns a range of all the satety test report specs where saftyTestReportId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SatetyTestReportSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param saftyTestReportId the safty test report ID
	* @param start the lower bound of the range of satety test report specs
	* @param end the upper bound of the range of satety test report specs (not inclusive)
	* @return the range of matching satety test report specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> findBySaftyTestReportId(
		long saftyTestReportId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySaftyTestReportId(saftyTestReportId, start, end);
	}

	/**
	* Returns an ordered range of all the satety test report specs where saftyTestReportId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SatetyTestReportSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param saftyTestReportId the safty test report ID
	* @param start the lower bound of the range of satety test report specs
	* @param end the upper bound of the range of satety test report specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching satety test report specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> findBySaftyTestReportId(
		long saftyTestReportId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySaftyTestReportId(saftyTestReportId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first satety test report spec in the ordered set where saftyTestReportId = &#63;.
	*
	* @param saftyTestReportId the safty test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching satety test report spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a matching satety test report spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec findBySaftyTestReportId_First(
		long saftyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException {
		return getPersistence()
				   .findBySaftyTestReportId_First(saftyTestReportId,
			orderByComparator);
	}

	/**
	* Returns the first satety test report spec in the ordered set where saftyTestReportId = &#63;.
	*
	* @param saftyTestReportId the safty test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching satety test report spec, or <code>null</code> if a matching satety test report spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec fetchBySaftyTestReportId_First(
		long saftyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySaftyTestReportId_First(saftyTestReportId,
			orderByComparator);
	}

	/**
	* Returns the last satety test report spec in the ordered set where saftyTestReportId = &#63;.
	*
	* @param saftyTestReportId the safty test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching satety test report spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a matching satety test report spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec findBySaftyTestReportId_Last(
		long saftyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException {
		return getPersistence()
				   .findBySaftyTestReportId_Last(saftyTestReportId,
			orderByComparator);
	}

	/**
	* Returns the last satety test report spec in the ordered set where saftyTestReportId = &#63;.
	*
	* @param saftyTestReportId the safty test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching satety test report spec, or <code>null</code> if a matching satety test report spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec fetchBySaftyTestReportId_Last(
		long saftyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySaftyTestReportId_Last(saftyTestReportId,
			orderByComparator);
	}

	/**
	* Returns the satety test report specs before and after the current satety test report spec in the ordered set where saftyTestReportId = &#63;.
	*
	* @param id the primary key of the current satety test report spec
	* @param saftyTestReportId the safty test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next satety test report spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a satety test report spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec[] findBySaftyTestReportId_PrevAndNext(
		long id, long saftyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException {
		return getPersistence()
				   .findBySaftyTestReportId_PrevAndNext(id, saftyTestReportId,
			orderByComparator);
	}

	/**
	* Removes all the satety test report specs where saftyTestReportId = &#63; from the database.
	*
	* @param saftyTestReportId the safty test report ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySaftyTestReportId(long saftyTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySaftyTestReportId(saftyTestReportId);
	}

	/**
	* Returns the number of satety test report specs where saftyTestReportId = &#63;.
	*
	* @param saftyTestReportId the safty test report ID
	* @return the number of matching satety test report specs
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySaftyTestReportId(long saftyTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySaftyTestReportId(saftyTestReportId);
	}

	/**
	* Caches the satety test report spec in the entity cache if it is enabled.
	*
	* @param satetyTestReportSpec the satety test report spec
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec satetyTestReportSpec) {
		getPersistence().cacheResult(satetyTestReportSpec);
	}

	/**
	* Caches the satety test report specs in the entity cache if it is enabled.
	*
	* @param satetyTestReportSpecs the satety test report specs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> satetyTestReportSpecs) {
		getPersistence().cacheResult(satetyTestReportSpecs);
	}

	/**
	* Creates a new satety test report spec with the primary key. Does not add the satety test report spec to the database.
	*
	* @param id the primary key for the new satety test report spec
	* @return the new satety test report spec
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the satety test report spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the satety test report spec
	* @return the satety test report spec that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a satety test report spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec satetyTestReportSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(satetyTestReportSpec);
	}

	/**
	* Returns the satety test report spec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException} if it could not be found.
	*
	* @param id the primary key of the satety test report spec
	* @return the satety test report spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a satety test report spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the satety test report spec with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the satety test report spec
	* @return the satety test report spec, or <code>null</code> if a satety test report spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the satety test report specs.
	*
	* @return the satety test report specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the satety test report specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SatetyTestReportSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of satety test report specs
	* @param end the upper bound of the range of satety test report specs (not inclusive)
	* @return the range of satety test report specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the satety test report specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SatetyTestReportSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of satety test report specs
	* @param end the upper bound of the range of satety test report specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of satety test report specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the satety test report specs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of satety test report specs.
	*
	* @return the number of satety test report specs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SatetyTestReportSpecPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SatetyTestReportSpecPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					SatetyTestReportSpecPersistence.class.getName());

			ReferenceRegistry.registerReference(SatetyTestReportSpecUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SatetyTestReportSpecPersistence persistence) {
	}

	private static SatetyTestReportSpecPersistence _persistence;
}