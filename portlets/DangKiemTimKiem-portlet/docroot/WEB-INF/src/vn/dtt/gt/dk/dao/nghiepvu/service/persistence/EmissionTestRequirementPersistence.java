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

import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement;

/**
 * The persistence interface for the emission test requirement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see EmissionTestRequirementPersistenceImpl
 * @see EmissionTestRequirementUtil
 * @generated
 */
public interface EmissionTestRequirementPersistence extends BasePersistence<EmissionTestRequirement> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmissionTestRequirementUtil} to access the emission test requirement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the emission test requirement where inspectionRecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException} if it could not be found.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the matching emission test requirement
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a matching emission test requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement findByInspectionRecordId(
		long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException;

	/**
	* Returns the emission test requirement where inspectionRecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the matching emission test requirement, or <code>null</code> if a matching emission test requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement fetchByInspectionRecordId(
		long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emission test requirement where inspectionRecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectionRecordId the inspection record ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching emission test requirement, or <code>null</code> if a matching emission test requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement fetchByInspectionRecordId(
		long inspectionRecordId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the emission test requirement where inspectionRecordId = &#63; from the database.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the emission test requirement that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement removeByInspectionRecordId(
		long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException;

	/**
	* Returns the number of emission test requirements where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the number of matching emission test requirements
	* @throws SystemException if a system exception occurred
	*/
	public int countByInspectionRecordId(long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the emission test requirements where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching emission test requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the emission test requirements where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of emission test requirements
	* @param end the upper bound of the range of emission test requirements (not inclusive)
	* @return the range of matching emission test requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the emission test requirements where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of emission test requirements
	* @param end the upper bound of the range of emission test requirements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching emission test requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first emission test requirement in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emission test requirement
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a matching emission test requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement findByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException;

	/**
	* Returns the first emission test requirement in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emission test requirement, or <code>null</code> if a matching emission test requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement fetchByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last emission test requirement in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emission test requirement
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a matching emission test requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement findByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException;

	/**
	* Returns the last emission test requirement in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emission test requirement, or <code>null</code> if a matching emission test requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement fetchByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emission test requirements before and after the current emission test requirement in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param id the primary key of the current emission test requirement
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next emission test requirement
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a emission test requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement[] findByPhieuXuLyPhuId_PrevAndNext(
		long id, long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException;

	/**
	* Removes all the emission test requirements where phieuXuLyPhuId = &#63; from the database.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of emission test requirements where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the number of matching emission test requirements
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the emission test requirement in the entity cache if it is enabled.
	*
	* @param emissionTestRequirement the emission test requirement
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement emissionTestRequirement);

	/**
	* Caches the emission test requirements in the entity cache if it is enabled.
	*
	* @param emissionTestRequirements the emission test requirements
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement> emissionTestRequirements);

	/**
	* Creates a new emission test requirement with the primary key. Does not add the emission test requirement to the database.
	*
	* @param id the primary key for the new emission test requirement
	* @return the new emission test requirement
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement create(
		long id);

	/**
	* Removes the emission test requirement with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the emission test requirement
	* @return the emission test requirement that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a emission test requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement emissionTestRequirement)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emission test requirement with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException} if it could not be found.
	*
	* @param id the primary key of the emission test requirement
	* @return the emission test requirement
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException if a emission test requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestRequirementException;

	/**
	* Returns the emission test requirement with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the emission test requirement
	* @return the emission test requirement, or <code>null</code> if a emission test requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the emission test requirements.
	*
	* @return the emission test requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the emission test requirements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emission test requirements
	* @param end the upper bound of the range of emission test requirements (not inclusive)
	* @return the range of emission test requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the emission test requirements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emission test requirements
	* @param end the upper bound of the range of emission test requirements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of emission test requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the emission test requirements from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of emission test requirements.
	*
	* @return the number of emission test requirements
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}