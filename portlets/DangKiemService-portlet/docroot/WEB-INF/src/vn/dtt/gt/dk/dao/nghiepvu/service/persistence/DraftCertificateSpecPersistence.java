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

import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec;

/**
 * The persistence interface for the draft certificate spec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DraftCertificateSpecPersistenceImpl
 * @see DraftCertificateSpecUtil
 * @generated
 */
public interface DraftCertificateSpecPersistence extends BasePersistence<DraftCertificateSpec> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DraftCertificateSpecUtil} to access the draft certificate spec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the draft certificate specs where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @return the matching draft certificate specs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> findByDraftCertificateId(
		long draftCertificateId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> findByDraftCertificateId(
		long draftCertificateId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> findByDraftCertificateId(
		long draftCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first draft certificate spec in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching draft certificate spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a matching draft certificate spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec findByDraftCertificateId_First(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException;

	/**
	* Returns the first draft certificate spec in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching draft certificate spec, or <code>null</code> if a matching draft certificate spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec fetchByDraftCertificateId_First(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last draft certificate spec in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching draft certificate spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a matching draft certificate spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec findByDraftCertificateId_Last(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException;

	/**
	* Returns the last draft certificate spec in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching draft certificate spec, or <code>null</code> if a matching draft certificate spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec fetchByDraftCertificateId_Last(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec[] findByDraftCertificateId_PrevAndNext(
		long id, long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException;

	/**
	* Removes all the draft certificate specs where draftCertificateId = &#63; from the database.
	*
	* @param draftCertificateId the draft certificate ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDraftCertificateId(long draftCertificateId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of draft certificate specs where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @return the number of matching draft certificate specs
	* @throws SystemException if a system exception occurred
	*/
	public int countByDraftCertificateId(long draftCertificateId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the draft certificate spec in the entity cache if it is enabled.
	*
	* @param draftCertificateSpec the draft certificate spec
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec draftCertificateSpec);

	/**
	* Caches the draft certificate specs in the entity cache if it is enabled.
	*
	* @param draftCertificateSpecs the draft certificate specs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> draftCertificateSpecs);

	/**
	* Creates a new draft certificate spec with the primary key. Does not add the draft certificate spec to the database.
	*
	* @param id the primary key for the new draft certificate spec
	* @return the new draft certificate spec
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec create(long id);

	/**
	* Removes the draft certificate spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the draft certificate spec
	* @return the draft certificate spec that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a draft certificate spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec draftCertificateSpec)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the draft certificate spec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException} if it could not be found.
	*
	* @param id the primary key of the draft certificate spec
	* @return the draft certificate spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException if a draft certificate spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateSpecException;

	/**
	* Returns the draft certificate spec with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the draft certificate spec
	* @return the draft certificate spec, or <code>null</code> if a draft certificate spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the draft certificate specs.
	*
	* @return the draft certificate specs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the draft certificate specs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of draft certificate specs.
	*
	* @return the number of draft certificate specs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}