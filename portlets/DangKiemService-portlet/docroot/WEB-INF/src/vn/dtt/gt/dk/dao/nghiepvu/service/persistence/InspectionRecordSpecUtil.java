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

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec;

import java.util.List;

/**
 * The persistence utility for the inspection record spec service. This utility wraps {@link InspectionRecordSpecPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see InspectionRecordSpecPersistence
 * @see InspectionRecordSpecPersistenceImpl
 * @generated
 */
public class InspectionRecordSpecUtil {
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
	public static void clearCache(InspectionRecordSpec inspectionRecordSpec) {
		getPersistence().clearCache(inspectionRecordSpec);
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
	public static List<InspectionRecordSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InspectionRecordSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InspectionRecordSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static InspectionRecordSpec update(
		InspectionRecordSpec inspectionRecordSpec) throws SystemException {
		return getPersistence().update(inspectionRecordSpec);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static InspectionRecordSpec update(
		InspectionRecordSpec inspectionRecordSpec, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(inspectionRecordSpec, serviceContext);
	}

	/**
	* Returns all the inspection record specs where inspectionRecordid = &#63;.
	*
	* @param inspectionRecordid the inspection recordid
	* @return the matching inspection record specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec> findByInspectionRecordId(
		long inspectionRecordid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByInspectionRecordId(inspectionRecordid);
	}

	/**
	* Returns a range of all the inspection record specs where inspectionRecordid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionRecordid the inspection recordid
	* @param start the lower bound of the range of inspection record specs
	* @param end the upper bound of the range of inspection record specs (not inclusive)
	* @return the range of matching inspection record specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec> findByInspectionRecordId(
		long inspectionRecordid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectionRecordId(inspectionRecordid, start, end);
	}

	/**
	* Returns an ordered range of all the inspection record specs where inspectionRecordid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionRecordid the inspection recordid
	* @param start the lower bound of the range of inspection record specs
	* @param end the upper bound of the range of inspection record specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching inspection record specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec> findByInspectionRecordId(
		long inspectionRecordid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectionRecordId(inspectionRecordid, start, end,
			orderByComparator);
	}

	/**
	* Returns the first inspection record spec in the ordered set where inspectionRecordid = &#63;.
	*
	* @param inspectionRecordid the inspection recordid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection record spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException if a matching inspection record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec findByInspectionRecordId_First(
		long inspectionRecordid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException {
		return getPersistence()
				   .findByInspectionRecordId_First(inspectionRecordid,
			orderByComparator);
	}

	/**
	* Returns the first inspection record spec in the ordered set where inspectionRecordid = &#63;.
	*
	* @param inspectionRecordid the inspection recordid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection record spec, or <code>null</code> if a matching inspection record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec fetchByInspectionRecordId_First(
		long inspectionRecordid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectionRecordId_First(inspectionRecordid,
			orderByComparator);
	}

	/**
	* Returns the last inspection record spec in the ordered set where inspectionRecordid = &#63;.
	*
	* @param inspectionRecordid the inspection recordid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection record spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException if a matching inspection record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec findByInspectionRecordId_Last(
		long inspectionRecordid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException {
		return getPersistence()
				   .findByInspectionRecordId_Last(inspectionRecordid,
			orderByComparator);
	}

	/**
	* Returns the last inspection record spec in the ordered set where inspectionRecordid = &#63;.
	*
	* @param inspectionRecordid the inspection recordid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection record spec, or <code>null</code> if a matching inspection record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec fetchByInspectionRecordId_Last(
		long inspectionRecordid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectionRecordId_Last(inspectionRecordid,
			orderByComparator);
	}

	/**
	* Returns the inspection record specs before and after the current inspection record spec in the ordered set where inspectionRecordid = &#63;.
	*
	* @param id the primary key of the current inspection record spec
	* @param inspectionRecordid the inspection recordid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next inspection record spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException if a inspection record spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec[] findByInspectionRecordId_PrevAndNext(
		long id, long inspectionRecordid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException {
		return getPersistence()
				   .findByInspectionRecordId_PrevAndNext(id,
			inspectionRecordid, orderByComparator);
	}

	/**
	* Removes all the inspection record specs where inspectionRecordid = &#63; from the database.
	*
	* @param inspectionRecordid the inspection recordid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByInspectionRecordId(long inspectionRecordid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByInspectionRecordId(inspectionRecordid);
	}

	/**
	* Returns the number of inspection record specs where inspectionRecordid = &#63;.
	*
	* @param inspectionRecordid the inspection recordid
	* @return the number of matching inspection record specs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectionRecordId(long inspectionRecordid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByInspectionRecordId(inspectionRecordid);
	}

	/**
	* Returns the inspection record spec where inspectionRecordid = &#63; and specificationCode = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException} if it could not be found.
	*
	* @param inspectionRecordid the inspection recordid
	* @param specificationCode the specification code
	* @return the matching inspection record spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException if a matching inspection record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec findByInspectionRecordId_SpecificationCode(
		long inspectionRecordid, java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException {
		return getPersistence()
				   .findByInspectionRecordId_SpecificationCode(inspectionRecordid,
			specificationCode);
	}

	/**
	* Returns the inspection record spec where inspectionRecordid = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectionRecordid the inspection recordid
	* @param specificationCode the specification code
	* @return the matching inspection record spec, or <code>null</code> if a matching inspection record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec fetchByInspectionRecordId_SpecificationCode(
		long inspectionRecordid, java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectionRecordId_SpecificationCode(inspectionRecordid,
			specificationCode);
	}

	/**
	* Returns the inspection record spec where inspectionRecordid = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectionRecordid the inspection recordid
	* @param specificationCode the specification code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching inspection record spec, or <code>null</code> if a matching inspection record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec fetchByInspectionRecordId_SpecificationCode(
		long inspectionRecordid, java.lang.String specificationCode,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectionRecordId_SpecificationCode(inspectionRecordid,
			specificationCode, retrieveFromCache);
	}

	/**
	* Removes the inspection record spec where inspectionRecordid = &#63; and specificationCode = &#63; from the database.
	*
	* @param inspectionRecordid the inspection recordid
	* @param specificationCode the specification code
	* @return the inspection record spec that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec removeByInspectionRecordId_SpecificationCode(
		long inspectionRecordid, java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException {
		return getPersistence()
				   .removeByInspectionRecordId_SpecificationCode(inspectionRecordid,
			specificationCode);
	}

	/**
	* Returns the number of inspection record specs where inspectionRecordid = &#63; and specificationCode = &#63;.
	*
	* @param inspectionRecordid the inspection recordid
	* @param specificationCode the specification code
	* @return the number of matching inspection record specs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectionRecordId_SpecificationCode(
		long inspectionRecordid, java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByInspectionRecordId_SpecificationCode(inspectionRecordid,
			specificationCode);
	}

	/**
	* Caches the inspection record spec in the entity cache if it is enabled.
	*
	* @param inspectionRecordSpec the inspection record spec
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec inspectionRecordSpec) {
		getPersistence().cacheResult(inspectionRecordSpec);
	}

	/**
	* Caches the inspection record specs in the entity cache if it is enabled.
	*
	* @param inspectionRecordSpecs the inspection record specs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec> inspectionRecordSpecs) {
		getPersistence().cacheResult(inspectionRecordSpecs);
	}

	/**
	* Creates a new inspection record spec with the primary key. Does not add the inspection record spec to the database.
	*
	* @param id the primary key for the new inspection record spec
	* @return the new inspection record spec
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the inspection record spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the inspection record spec
	* @return the inspection record spec that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException if a inspection record spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec inspectionRecordSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(inspectionRecordSpec);
	}

	/**
	* Returns the inspection record spec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException} if it could not be found.
	*
	* @param id the primary key of the inspection record spec
	* @return the inspection record spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException if a inspection record spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordSpecException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the inspection record spec with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the inspection record spec
	* @return the inspection record spec, or <code>null</code> if a inspection record spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the inspection record specs.
	*
	* @return the inspection record specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the inspection record specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of inspection record specs
	* @param end the upper bound of the range of inspection record specs (not inclusive)
	* @return the range of inspection record specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the inspection record specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of inspection record specs
	* @param end the upper bound of the range of inspection record specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of inspection record specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the inspection record specs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of inspection record specs.
	*
	* @return the number of inspection record specs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static InspectionRecordSpecPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (InspectionRecordSpecPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					InspectionRecordSpecPersistence.class.getName());

			ReferenceRegistry.registerReference(InspectionRecordSpecUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(InspectionRecordSpecPersistence persistence) {
	}

	private static InspectionRecordSpecPersistence _persistence;
}