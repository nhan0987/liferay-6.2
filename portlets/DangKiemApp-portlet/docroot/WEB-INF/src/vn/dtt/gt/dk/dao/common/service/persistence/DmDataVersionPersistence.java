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

import vn.dtt.gt.dk.dao.common.model.DmDataVersion;

/**
 * The persistence interface for the dm data version service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmDataVersionPersistenceImpl
 * @see DmDataVersionUtil
 * @generated
 */
public interface DmDataVersionPersistence extends BasePersistence<DmDataVersion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmDataVersionUtil} to access the dm data version persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the dm data version in the entity cache if it is enabled.
	*
	* @param dmDataVersion the dm data version
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.common.model.DmDataVersion dmDataVersion);

	/**
	* Caches the dm data versions in the entity cache if it is enabled.
	*
	* @param dmDataVersions the dm data versions
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataVersion> dmDataVersions);

	/**
	* Creates a new dm data version with the primary key. Does not add the dm data version to the database.
	*
	* @param Id the primary key for the new dm data version
	* @return the new dm data version
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataVersion create(long Id);

	/**
	* Removes the dm data version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the dm data version
	* @return the dm data version that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException if a dm data version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataVersion remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException;

	public vn.dtt.gt.dk.dao.common.model.DmDataVersion updateImpl(
		vn.dtt.gt.dk.dao.common.model.DmDataVersion dmDataVersion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dm data version with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException} if it could not be found.
	*
	* @param Id the primary key of the dm data version
	* @return the dm data version
	* @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException if a dm data version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataVersion findByPrimaryKey(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchDmDataVersionException;

	/**
	* Returns the dm data version with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the dm data version
	* @return the dm data version, or <code>null</code> if a dm data version with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.common.model.DmDataVersion fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dm data versions.
	*
	* @return the dm data versions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataVersion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dm data versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data versions
	* @param end the upper bound of the range of dm data versions (not inclusive)
	* @return the range of dm data versions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataVersion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dm data versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data versions
	* @param end the upper bound of the range of dm data versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm data versions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.common.model.DmDataVersion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dm data versions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dm data versions.
	*
	* @return the number of dm data versions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}