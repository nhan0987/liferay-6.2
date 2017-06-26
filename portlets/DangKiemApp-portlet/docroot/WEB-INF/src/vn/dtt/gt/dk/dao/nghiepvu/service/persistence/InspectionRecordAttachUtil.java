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

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach;

import java.util.List;

/**
 * The persistence utility for the inspection record attach service. This utility wraps {@link InspectionRecordAttachPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see InspectionRecordAttachPersistence
 * @see InspectionRecordAttachPersistenceImpl
 * @generated
 */
public class InspectionRecordAttachUtil {
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
	public static void clearCache(InspectionRecordAttach inspectionRecordAttach) {
		getPersistence().clearCache(inspectionRecordAttach);
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
	public static List<InspectionRecordAttach> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InspectionRecordAttach> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InspectionRecordAttach> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static InspectionRecordAttach update(
		InspectionRecordAttach inspectionRecordAttach)
		throws SystemException {
		return getPersistence().update(inspectionRecordAttach);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static InspectionRecordAttach update(
		InspectionRecordAttach inspectionRecordAttach,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(inspectionRecordAttach, serviceContext);
	}

	/**
	* Returns all the inspection record attachs where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the matching inspection record attachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach> findByInspectionRecordAttach(
		long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByInspectionRecordAttach(inspectionRecordId);
	}

	/**
	* Returns a range of all the inspection record attachs where inspectionRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionRecordId the inspection record ID
	* @param start the lower bound of the range of inspection record attachs
	* @param end the upper bound of the range of inspection record attachs (not inclusive)
	* @return the range of matching inspection record attachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach> findByInspectionRecordAttach(
		long inspectionRecordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectionRecordAttach(inspectionRecordId, start, end);
	}

	/**
	* Returns an ordered range of all the inspection record attachs where inspectionRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionRecordId the inspection record ID
	* @param start the lower bound of the range of inspection record attachs
	* @param end the upper bound of the range of inspection record attachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching inspection record attachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach> findByInspectionRecordAttach(
		long inspectionRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectionRecordAttach(inspectionRecordId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first inspection record attach in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection record attach
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException if a matching inspection record attach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach findByInspectionRecordAttach_First(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException {
		return getPersistence()
				   .findByInspectionRecordAttach_First(inspectionRecordId,
			orderByComparator);
	}

	/**
	* Returns the first inspection record attach in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection record attach, or <code>null</code> if a matching inspection record attach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach fetchByInspectionRecordAttach_First(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectionRecordAttach_First(inspectionRecordId,
			orderByComparator);
	}

	/**
	* Returns the last inspection record attach in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection record attach
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException if a matching inspection record attach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach findByInspectionRecordAttach_Last(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException {
		return getPersistence()
				   .findByInspectionRecordAttach_Last(inspectionRecordId,
			orderByComparator);
	}

	/**
	* Returns the last inspection record attach in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection record attach, or <code>null</code> if a matching inspection record attach could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach fetchByInspectionRecordAttach_Last(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectionRecordAttach_Last(inspectionRecordId,
			orderByComparator);
	}

	/**
	* Returns the inspection record attachs before and after the current inspection record attach in the ordered set where inspectionRecordId = &#63;.
	*
	* @param id the primary key of the current inspection record attach
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next inspection record attach
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException if a inspection record attach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach[] findByInspectionRecordAttach_PrevAndNext(
		long id, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException {
		return getPersistence()
				   .findByInspectionRecordAttach_PrevAndNext(id,
			inspectionRecordId, orderByComparator);
	}

	/**
	* Removes all the inspection record attachs where inspectionRecordId = &#63; from the database.
	*
	* @param inspectionRecordId the inspection record ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByInspectionRecordAttach(long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByInspectionRecordAttach(inspectionRecordId);
	}

	/**
	* Returns the number of inspection record attachs where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the number of matching inspection record attachs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectionRecordAttach(long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByInspectionRecordAttach(inspectionRecordId);
	}

	/**
	* Caches the inspection record attach in the entity cache if it is enabled.
	*
	* @param inspectionRecordAttach the inspection record attach
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach inspectionRecordAttach) {
		getPersistence().cacheResult(inspectionRecordAttach);
	}

	/**
	* Caches the inspection record attachs in the entity cache if it is enabled.
	*
	* @param inspectionRecordAttachs the inspection record attachs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach> inspectionRecordAttachs) {
		getPersistence().cacheResult(inspectionRecordAttachs);
	}

	/**
	* Creates a new inspection record attach with the primary key. Does not add the inspection record attach to the database.
	*
	* @param id the primary key for the new inspection record attach
	* @return the new inspection record attach
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the inspection record attach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the inspection record attach
	* @return the inspection record attach that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException if a inspection record attach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach inspectionRecordAttach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(inspectionRecordAttach);
	}

	/**
	* Returns the inspection record attach with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException} if it could not be found.
	*
	* @param id the primary key of the inspection record attach
	* @return the inspection record attach
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException if a inspection record attach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordAttachException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the inspection record attach with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the inspection record attach
	* @return the inspection record attach, or <code>null</code> if a inspection record attach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the inspection record attachs.
	*
	* @return the inspection record attachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the inspection record attachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of inspection record attachs
	* @param end the upper bound of the range of inspection record attachs (not inclusive)
	* @return the range of inspection record attachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the inspection record attachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of inspection record attachs
	* @param end the upper bound of the range of inspection record attachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of inspection record attachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the inspection record attachs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of inspection record attachs.
	*
	* @return the number of inspection record attachs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static InspectionRecordAttachPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (InspectionRecordAttachPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					InspectionRecordAttachPersistence.class.getName());

			ReferenceRegistry.registerReference(InspectionRecordAttachUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(InspectionRecordAttachPersistence persistence) {
	}

	private static InspectionRecordAttachPersistence _persistence;
}