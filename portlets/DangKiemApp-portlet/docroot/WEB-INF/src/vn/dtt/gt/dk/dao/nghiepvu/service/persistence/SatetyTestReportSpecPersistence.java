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

import vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec;

/**
 * The persistence interface for the satety test report spec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see SatetyTestReportSpecPersistenceImpl
 * @see SatetyTestReportSpecUtil
 * @generated
 */
public interface SatetyTestReportSpecPersistence extends BasePersistence<SatetyTestReportSpec> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SatetyTestReportSpecUtil} to access the satety test report spec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the satety test report specs where saftyTestReportId = &#63;.
	*
	* @param saftyTestReportId the safty test report ID
	* @return the matching satety test report specs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> findBySaftyTestReportId(
		long saftyTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> findBySaftyTestReportId(
		long saftyTestReportId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> findBySaftyTestReportId(
		long saftyTestReportId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first satety test report spec in the ordered set where saftyTestReportId = &#63;.
	*
	* @param saftyTestReportId the safty test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching satety test report spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a matching satety test report spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec findBySaftyTestReportId_First(
		long saftyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException;

	/**
	* Returns the first satety test report spec in the ordered set where saftyTestReportId = &#63;.
	*
	* @param saftyTestReportId the safty test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching satety test report spec, or <code>null</code> if a matching satety test report spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec fetchBySaftyTestReportId_First(
		long saftyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last satety test report spec in the ordered set where saftyTestReportId = &#63;.
	*
	* @param saftyTestReportId the safty test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching satety test report spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a matching satety test report spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec findBySaftyTestReportId_Last(
		long saftyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException;

	/**
	* Returns the last satety test report spec in the ordered set where saftyTestReportId = &#63;.
	*
	* @param saftyTestReportId the safty test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching satety test report spec, or <code>null</code> if a matching satety test report spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec fetchBySaftyTestReportId_Last(
		long saftyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec[] findBySaftyTestReportId_PrevAndNext(
		long id, long saftyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException;

	/**
	* Removes all the satety test report specs where saftyTestReportId = &#63; from the database.
	*
	* @param saftyTestReportId the safty test report ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySaftyTestReportId(long saftyTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of satety test report specs where saftyTestReportId = &#63;.
	*
	* @param saftyTestReportId the safty test report ID
	* @return the number of matching satety test report specs
	* @throws SystemException if a system exception occurred
	*/
	public int countBySaftyTestReportId(long saftyTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the satety test report spec in the entity cache if it is enabled.
	*
	* @param satetyTestReportSpec the satety test report spec
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec satetyTestReportSpec);

	/**
	* Caches the satety test report specs in the entity cache if it is enabled.
	*
	* @param satetyTestReportSpecs the satety test report specs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> satetyTestReportSpecs);

	/**
	* Creates a new satety test report spec with the primary key. Does not add the satety test report spec to the database.
	*
	* @param id the primary key for the new satety test report spec
	* @return the new satety test report spec
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec create(long id);

	/**
	* Removes the satety test report spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the satety test report spec
	* @return the satety test report spec that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a satety test report spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec satetyTestReportSpec)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the satety test report spec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException} if it could not be found.
	*
	* @param id the primary key of the satety test report spec
	* @return the satety test report spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException if a satety test report spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSatetyTestReportSpecException;

	/**
	* Returns the satety test report spec with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the satety test report spec
	* @return the satety test report spec, or <code>null</code> if a satety test report spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the satety test report specs.
	*
	* @return the satety test report specs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the satety test report specs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of satety test report specs.
	*
	* @return the number of satety test report specs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}