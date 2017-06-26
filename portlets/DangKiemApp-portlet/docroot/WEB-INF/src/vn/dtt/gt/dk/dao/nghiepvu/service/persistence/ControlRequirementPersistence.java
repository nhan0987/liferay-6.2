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

import vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement;

/**
 * The persistence interface for the control requirement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ControlRequirementPersistenceImpl
 * @see ControlRequirementUtil
 * @generated
 */
public interface ControlRequirementPersistence extends BasePersistence<ControlRequirement> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ControlRequirementUtil} to access the control requirement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the control requirements where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the matching control requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> findByRegisteredInspectionId(
		long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the control requirements where registeredInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registeredInspectionId the registered inspection ID
	* @param start the lower bound of the range of control requirements
	* @param end the upper bound of the range of control requirements (not inclusive)
	* @return the range of matching control requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the control requirements where registeredInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registeredInspectionId the registered inspection ID
	* @param start the lower bound of the range of control requirements
	* @param end the upper bound of the range of control requirements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching control requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first control requirement in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching control requirement
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a matching control requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement findByRegisteredInspectionId_First(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException;

	/**
	* Returns the first control requirement in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching control requirement, or <code>null</code> if a matching control requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement fetchByRegisteredInspectionId_First(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last control requirement in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching control requirement
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a matching control requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement findByRegisteredInspectionId_Last(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException;

	/**
	* Returns the last control requirement in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching control requirement, or <code>null</code> if a matching control requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement fetchByRegisteredInspectionId_Last(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the control requirements before and after the current control requirement in the ordered set where registeredInspectionId = &#63;.
	*
	* @param id the primary key of the current control requirement
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next control requirement
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a control requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement[] findByRegisteredInspectionId_PrevAndNext(
		long id, long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException;

	/**
	* Removes all the control requirements where registeredInspectionId = &#63; from the database.
	*
	* @param registeredInspectionId the registered inspection ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRegisteredInspectionId(long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of control requirements where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the number of matching control requirements
	* @throws SystemException if a system exception occurred
	*/
	public int countByRegisteredInspectionId(long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the control requirement where inspectionrecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException} if it could not be found.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @return the matching control requirement
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a matching control requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement findByInspectionrecordId(
		long inspectionrecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException;

	/**
	* Returns the control requirement where inspectionrecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @return the matching control requirement, or <code>null</code> if a matching control requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement fetchByInspectionrecordId(
		long inspectionrecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the control requirement where inspectionrecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching control requirement, or <code>null</code> if a matching control requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement fetchByInspectionrecordId(
		long inspectionrecordId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the control requirement where inspectionrecordId = &#63; from the database.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @return the control requirement that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement removeByInspectionrecordId(
		long inspectionrecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException;

	/**
	* Returns the number of control requirements where inspectionrecordId = &#63;.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @return the number of matching control requirements
	* @throws SystemException if a system exception occurred
	*/
	public int countByInspectionrecordId(long inspectionrecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the control requirements where phieuxulyphuId = &#63;.
	*
	* @param phieuxulyphuId the phieuxulyphu ID
	* @return the matching control requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> findByPhieuxulyphuId(
		long phieuxulyphuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the control requirements where phieuxulyphuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuxulyphuId the phieuxulyphu ID
	* @param start the lower bound of the range of control requirements
	* @param end the upper bound of the range of control requirements (not inclusive)
	* @return the range of matching control requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> findByPhieuxulyphuId(
		long phieuxulyphuId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the control requirements where phieuxulyphuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuxulyphuId the phieuxulyphu ID
	* @param start the lower bound of the range of control requirements
	* @param end the upper bound of the range of control requirements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching control requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> findByPhieuxulyphuId(
		long phieuxulyphuId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first control requirement in the ordered set where phieuxulyphuId = &#63;.
	*
	* @param phieuxulyphuId the phieuxulyphu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching control requirement
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a matching control requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement findByPhieuxulyphuId_First(
		long phieuxulyphuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException;

	/**
	* Returns the first control requirement in the ordered set where phieuxulyphuId = &#63;.
	*
	* @param phieuxulyphuId the phieuxulyphu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching control requirement, or <code>null</code> if a matching control requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement fetchByPhieuxulyphuId_First(
		long phieuxulyphuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last control requirement in the ordered set where phieuxulyphuId = &#63;.
	*
	* @param phieuxulyphuId the phieuxulyphu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching control requirement
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a matching control requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement findByPhieuxulyphuId_Last(
		long phieuxulyphuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException;

	/**
	* Returns the last control requirement in the ordered set where phieuxulyphuId = &#63;.
	*
	* @param phieuxulyphuId the phieuxulyphu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching control requirement, or <code>null</code> if a matching control requirement could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement fetchByPhieuxulyphuId_Last(
		long phieuxulyphuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the control requirements before and after the current control requirement in the ordered set where phieuxulyphuId = &#63;.
	*
	* @param id the primary key of the current control requirement
	* @param phieuxulyphuId the phieuxulyphu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next control requirement
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a control requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement[] findByPhieuxulyphuId_PrevAndNext(
		long id, long phieuxulyphuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException;

	/**
	* Removes all the control requirements where phieuxulyphuId = &#63; from the database.
	*
	* @param phieuxulyphuId the phieuxulyphu ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPhieuxulyphuId(long phieuxulyphuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of control requirements where phieuxulyphuId = &#63;.
	*
	* @param phieuxulyphuId the phieuxulyphu ID
	* @return the number of matching control requirements
	* @throws SystemException if a system exception occurred
	*/
	public int countByPhieuxulyphuId(long phieuxulyphuId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the control requirement in the entity cache if it is enabled.
	*
	* @param controlRequirement the control requirement
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement controlRequirement);

	/**
	* Caches the control requirements in the entity cache if it is enabled.
	*
	* @param controlRequirements the control requirements
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> controlRequirements);

	/**
	* Creates a new control requirement with the primary key. Does not add the control requirement to the database.
	*
	* @param id the primary key for the new control requirement
	* @return the new control requirement
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement create(long id);

	/**
	* Removes the control requirement with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the control requirement
	* @return the control requirement that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a control requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement controlRequirement)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the control requirement with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException} if it could not be found.
	*
	* @param id the primary key of the control requirement
	* @return the control requirement
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException if a control requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlRequirementException;

	/**
	* Returns the control requirement with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the control requirement
	* @return the control requirement, or <code>null</code> if a control requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the control requirements.
	*
	* @return the control requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the control requirements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of control requirements
	* @param end the upper bound of the range of control requirements (not inclusive)
	* @return the range of control requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the control requirements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of control requirements
	* @param end the upper bound of the range of control requirements (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of control requirements
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the control requirements from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of control requirements.
	*
	* @return the number of control requirements
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}