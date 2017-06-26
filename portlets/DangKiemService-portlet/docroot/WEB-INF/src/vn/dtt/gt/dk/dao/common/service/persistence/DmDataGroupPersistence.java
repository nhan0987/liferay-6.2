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

package vn.dtt.gt.dk.dao.common.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.common.model.DmDataGroup;

/**
 * The persistence interface for the dm data group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DmDataGroupPersistenceImpl
 * @see DmDataGroupUtil
 * @generated
 */
public interface DmDataGroupPersistence extends BasePersistence<DmDataGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmDataGroupUtil} to access the dm data group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the dm data group where Code = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException} if it could not be found.
	*
	* @param Code the code
	* @return the matching dm data group
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException if a matching dm data group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataGroup findByCode(
		java.lang.String Code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException;

	/**
	* Returns the dm data group where Code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param Code the code
	* @return the matching dm data group, or <code>null</code> if a matching dm data group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataGroup fetchByCode(
		java.lang.String Code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data group where Code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param Code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dm data group, or <code>null</code> if a matching dm data group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataGroup fetchByCode(
		java.lang.String Code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dm data group where Code = &#63; from the database.
	*
	* @param Code the code
	* @return the dm data group that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataGroup removeByCode(
		java.lang.String Code)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException;

	/**
	* Returns the number of dm data groups where Code = &#63;.
	*
	* @param Code the code
	* @return the number of matching dm data groups
	* @throws SystemException if a system exception occurred
	*/
	public int countByCode(java.lang.String Code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dm data group in the entity cache if it is enabled.
	*
	* @param dmDataGroup the dm data group
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.common.model.DmDataGroup dmDataGroup);

	/**
	* Caches the dm data groups in the entity cache if it is enabled.
	*
	* @param dmDataGroups the dm data groups
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataGroup> dmDataGroups);

	/**
	* Creates a new dm data group with the primary key. Does not add the dm data group to the database.
	*
	* @param Id the primary key for the new dm data group
	* @return the new dm data group
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataGroup create(long Id);

	/**
	* Removes the dm data group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the dm data group
	* @return the dm data group that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException if a dm data group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataGroup remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException;

	public vn.dtt.gt.dk.dao.common.model.DmDataGroup updateImpl(
		vn.dtt.gt.dk.dao.common.model.DmDataGroup dmDataGroup)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data group with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException} if it could not be found.
	*
	* @param Id the primary key of the dm data group
	* @return the dm data group
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException if a dm data group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataGroup findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataGroupException;

	/**
	* Returns the dm data group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the dm data group
	* @return the dm data group, or <code>null</code> if a dm data group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataGroup fetchByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm data groups.
	*
	* @return the dm data groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm data groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data groups
	* @param end the upper bound of the range of dm data groups (not inclusive)
	* @return the range of dm data groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataGroup> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm data groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data groups
	* @param end the upper bound of the range of dm data groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm data groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm data groups from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data groups.
	*
	* @return the number of dm data groups
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}