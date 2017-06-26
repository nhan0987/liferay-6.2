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

import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration;

/**
 * The persistence interface for the customs declaration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CustomsDeclarationPersistenceImpl
 * @see CustomsDeclarationUtil
 * @generated
 */
public interface CustomsDeclarationPersistence extends BasePersistence<CustomsDeclaration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CustomsDeclarationUtil} to access the customs declaration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the customs declaration where hosothutucId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException} if it could not be found.
	*
	* @param hosothutucId the hosothutuc ID
	* @return the matching customs declaration
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException if a matching customs declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration findByHoSoThuTucId(
		long hosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException;

	/**
	* Returns the customs declaration where hosothutucId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param hosothutucId the hosothutuc ID
	* @return the matching customs declaration, or <code>null</code> if a matching customs declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration fetchByHoSoThuTucId(
		long hosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the customs declaration where hosothutucId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param hosothutucId the hosothutuc ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching customs declaration, or <code>null</code> if a matching customs declaration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration fetchByHoSoThuTucId(
		long hosothutucId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the customs declaration where hosothutucId = &#63; from the database.
	*
	* @param hosothutucId the hosothutuc ID
	* @return the customs declaration that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration removeByHoSoThuTucId(
		long hosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException;

	/**
	* Returns the number of customs declarations where hosothutucId = &#63;.
	*
	* @param hosothutucId the hosothutuc ID
	* @return the number of matching customs declarations
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucId(long hosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the customs declaration in the entity cache if it is enabled.
	*
	* @param customsDeclaration the customs declaration
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration customsDeclaration);

	/**
	* Caches the customs declarations in the entity cache if it is enabled.
	*
	* @param customsDeclarations the customs declarations
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration> customsDeclarations);

	/**
	* Creates a new customs declaration with the primary key. Does not add the customs declaration to the database.
	*
	* @param id the primary key for the new customs declaration
	* @return the new customs declaration
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration create(long id);

	/**
	* Removes the customs declaration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the customs declaration
	* @return the customs declaration that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException if a customs declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration customsDeclaration)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the customs declaration with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException} if it could not be found.
	*
	* @param id the primary key of the customs declaration
	* @return the customs declaration
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException if a customs declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCustomsDeclarationException;

	/**
	* Returns the customs declaration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the customs declaration
	* @return the customs declaration, or <code>null</code> if a customs declaration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the customs declarations.
	*
	* @return the customs declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the customs declarations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CustomsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customs declarations
	* @param end the upper bound of the range of customs declarations (not inclusive)
	* @return the range of customs declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the customs declarations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CustomsDeclarationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customs declarations
	* @param end the upper bound of the range of customs declarations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of customs declarations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the customs declarations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of customs declarations.
	*
	* @return the number of customs declarations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}