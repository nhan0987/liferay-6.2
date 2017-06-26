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

package vn.dtt.gt.dk.dao.aswmsg.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice;

/**
 * The persistence interface for the aswmsg webservice service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AswmsgWebservicePersistenceImpl
 * @see AswmsgWebserviceUtil
 * @generated
 */
public interface AswmsgWebservicePersistence extends BasePersistence<AswmsgWebservice> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AswmsgWebserviceUtil} to access the aswmsg webservice persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the aswmsg webservice in the entity cache if it is enabled.
	*
	* @param aswmsgWebservice the aswmsg webservice
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice aswmsgWebservice);

	/**
	* Caches the aswmsg webservices in the entity cache if it is enabled.
	*
	* @param aswmsgWebservices the aswmsg webservices
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice> aswmsgWebservices);

	/**
	* Creates a new aswmsg webservice with the primary key. Does not add the aswmsg webservice to the database.
	*
	* @param Id the primary key for the new aswmsg webservice
	* @return the new aswmsg webservice
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice create(long Id);

	/**
	* Removes the aswmsg webservice with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the aswmsg webservice
	* @return the aswmsg webservice that was removed
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgWebserviceException if a aswmsg webservice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice remove(long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgWebserviceException;

	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice updateImpl(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice aswmsgWebservice)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the aswmsg webservice with the primary key or throws a {@link vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgWebserviceException} if it could not be found.
	*
	* @param Id the primary key of the aswmsg webservice
	* @return the aswmsg webservice
	* @throws vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgWebserviceException if a aswmsg webservice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.aswmsg.NoSuchAswmsgWebserviceException;

	/**
	* Returns the aswmsg webservice with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the aswmsg webservice
	* @return the aswmsg webservice, or <code>null</code> if a aswmsg webservice with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the aswmsg webservices.
	*
	* @return the aswmsg webservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the aswmsg webservices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgWebserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of aswmsg webservices
	* @param end the upper bound of the range of aswmsg webservices (not inclusive)
	* @return the range of aswmsg webservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the aswmsg webservices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgWebserviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of aswmsg webservices
	* @param end the upper bound of the range of aswmsg webservices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of aswmsg webservices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the aswmsg webservices from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of aswmsg webservices.
	*
	* @return the number of aswmsg webservices
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}