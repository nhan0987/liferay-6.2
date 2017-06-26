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

import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec;

import java.util.List;

/**
 * The persistence utility for the draft certificate spec service. This utility wraps {@link DraftCertificateSpecPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DraftCertificateSpecPersistence
 * @see DraftCertificateSpecPersistenceImpl
 * @generated
 */
public class DraftCertificateSpecUtil {
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
	public static void clearCache(DraftCertificateSpec draftCertificateSpec) {
		getPersistence().clearCache(draftCertificateSpec);
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
	public static List<DraftCertificateSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DraftCertificateSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DraftCertificateSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DraftCertificateSpec update(
		DraftCertificateSpec draftCertificateSpec) throws SystemException {
		return getPersistence().update(draftCertificateSpec);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DraftCertificateSpec update(
		DraftCertificateSpec draftCertificateSpec, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(draftCertificateSpec, serviceContext);
	}

	/**
	* Returns all the draft certificate specs where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @return the matching draft certificate specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> findByDraftCertificateId(
		long draftCertificateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDraftCertificateId(draftCertificateId);
	}

	/**
	* Returns a range of all the draft certificate specs where draftCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param draftCertificateId the draft certificate ID
	* @param start the lower bound of the range of draft certificate specs
	* @param end the upper bound of the range of draft certificate specs (not inclusive)
	* @return the range of matching draft certificate specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> findByDraftCertificateId(
		long draftCertificateId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDraftCertificateId(draftCertificateId, start, end);
	}

	/**
	* Returns an ordered range of all the draft certificate specs where draftCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param draftCertificateId the draft certificate ID
	* @param start the lower bound of the range of draft certificate specs
	* @param end the upper bound of the range of draft certificate specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching draft certificate specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> findByDraftCertificateId(
		long draftCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDraftCertificateId(draftCertificateId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first draft certificate spec in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching draft certificate spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a matching draft certificate spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec findByDraftCertificateId_First(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException {
		return getPersistence()
				   .findByDraftCertificateId_First(draftCertificateId,
			orderByComparator);
	}

	/**
	* Returns the first draft certificate spec in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching draft certificate spec, or <code>null</code> if a matching draft certificate spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec fetchByDraftCertificateId_First(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDraftCertificateId_First(draftCertificateId,
			orderByComparator);
	}

	/**
	* Returns the last draft certificate spec in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching draft certificate spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a matching draft certificate spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec findByDraftCertificateId_Last(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException {
		return getPersistence()
				   .findByDraftCertificateId_Last(draftCertificateId,
			orderByComparator);
	}

	/**
	* Returns the last draft certificate spec in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching draft certificate spec, or <code>null</code> if a matching draft certificate spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec fetchByDraftCertificateId_Last(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDraftCertificateId_Last(draftCertificateId,
			orderByComparator);
	}

	/**
	* Returns the draft certificate specs before and after the current draft certificate spec in the ordered set where draftCertificateId = &#63;.
	*
	* @param id the primary key of the current draft certificate spec
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next draft certificate spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a draft certificate spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec[] findByDraftCertificateId_PrevAndNext(
		long id, long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException {
		return getPersistence()
				   .findByDraftCertificateId_PrevAndNext(id,
			draftCertificateId, orderByComparator);
	}

	/**
	* Removes all the draft certificate specs where draftCertificateId = &#63; from the database.
	*
	* @param draftCertificateId the draft certificate ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDraftCertificateId(long draftCertificateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDraftCertificateId(draftCertificateId);
	}

	/**
	* Returns the number of draft certificate specs where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @return the number of matching draft certificate specs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDraftCertificateId(long draftCertificateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDraftCertificateId(draftCertificateId);
	}

	/**
	* Caches the draft certificate spec in the entity cache if it is enabled.
	*
	* @param draftCertificateSpec the draft certificate spec
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec draftCertificateSpec) {
		getPersistence().cacheResult(draftCertificateSpec);
	}

	/**
	* Caches the draft certificate specs in the entity cache if it is enabled.
	*
	* @param draftCertificateSpecs the draft certificate specs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> draftCertificateSpecs) {
		getPersistence().cacheResult(draftCertificateSpecs);
	}

	/**
	* Creates a new draft certificate spec with the primary key. Does not add the draft certificate spec to the database.
	*
	* @param id the primary key for the new draft certificate spec
	* @return the new draft certificate spec
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the draft certificate spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the draft certificate spec
	* @return the draft certificate spec that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a draft certificate spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec draftCertificateSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(draftCertificateSpec);
	}

	/**
	* Returns the draft certificate spec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException} if it could not be found.
	*
	* @param id the primary key of the draft certificate spec
	* @return the draft certificate spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a draft certificate spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the draft certificate spec with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the draft certificate spec
	* @return the draft certificate spec, or <code>null</code> if a draft certificate spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the draft certificate specs.
	*
	* @return the draft certificate specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the draft certificate specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of draft certificate specs
	* @param end the upper bound of the range of draft certificate specs (not inclusive)
	* @return the range of draft certificate specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the draft certificate specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of draft certificate specs
	* @param end the upper bound of the range of draft certificate specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of draft certificate specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the draft certificate specs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of draft certificate specs.
	*
	* @return the number of draft certificate specs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DraftCertificateSpecPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DraftCertificateSpecPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					DraftCertificateSpecPersistence.class.getName());

			ReferenceRegistry.registerReference(DraftCertificateSpecUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DraftCertificateSpecPersistence persistence) {
	}

	private static DraftCertificateSpecPersistence _persistence;
}