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

import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec;

import java.util.List;

/**
 * The persistence utility for the certificate record spec service. This utility wraps {@link CertificateRecordSpecPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see CertificateRecordSpecPersistence
 * @see CertificateRecordSpecPersistenceImpl
 * @generated
 */
public class CertificateRecordSpecUtil {
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
	public static void clearCache(CertificateRecordSpec certificateRecordSpec) {
		getPersistence().clearCache(certificateRecordSpec);
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
	public static List<CertificateRecordSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CertificateRecordSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CertificateRecordSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CertificateRecordSpec update(
		CertificateRecordSpec certificateRecordSpec) throws SystemException {
		return getPersistence().update(certificateRecordSpec);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CertificateRecordSpec update(
		CertificateRecordSpec certificateRecordSpec,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(certificateRecordSpec, serviceContext);
	}

	/**
	* Returns all the certificate record specs where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the matching certificate record specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec> findByCertificateRecordId(
		long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns a range of all the certificate record specs where certificateRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordId the certificate record ID
	* @param start the lower bound of the range of certificate record specs
	* @param end the upper bound of the range of certificate record specs (not inclusive)
	* @return the range of matching certificate record specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec> findByCertificateRecordId(
		long certificateRecordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateRecordId(certificateRecordId, start, end);
	}

	/**
	* Returns an ordered range of all the certificate record specs where certificateRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordId the certificate record ID
	* @param start the lower bound of the range of certificate record specs
	* @param end the upper bound of the range of certificate record specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching certificate record specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec> findByCertificateRecordId(
		long certificateRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateRecordId(certificateRecordId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first certificate record spec in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException if a matching certificate record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec findByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException {
		return getPersistence()
				   .findByCertificateRecordId_First(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the first certificate record spec in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record spec, or <code>null</code> if a matching certificate record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec fetchByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateRecordId_First(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the last certificate record spec in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException if a matching certificate record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec findByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException {
		return getPersistence()
				   .findByCertificateRecordId_Last(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the last certificate record spec in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record spec, or <code>null</code> if a matching certificate record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec fetchByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateRecordId_Last(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the certificate record specs before and after the current certificate record spec in the ordered set where certificateRecordId = &#63;.
	*
	* @param id the primary key of the current certificate record spec
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next certificate record spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException if a certificate record spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException {
		return getPersistence()
				   .findByCertificateRecordId_PrevAndNext(id,
			certificateRecordId, orderByComparator);
	}

	/**
	* Removes all the certificate record specs where certificateRecordId = &#63; from the database.
	*
	* @param certificateRecordId the certificate record ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the number of certificate record specs where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the number of matching certificate record specs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the certificate record spec where certificateRecordId = &#63; and specificationCode = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException} if it could not be found.
	*
	* @param certificateRecordId the certificate record ID
	* @param specificationCode the specification code
	* @return the matching certificate record spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException if a matching certificate record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec findByCertificateRecordIdAndSpecificationCode(
		long certificateRecordId, java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException {
		return getPersistence()
				   .findByCertificateRecordIdAndSpecificationCode(certificateRecordId,
			specificationCode);
	}

	/**
	* Returns the certificate record spec where certificateRecordId = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param certificateRecordId the certificate record ID
	* @param specificationCode the specification code
	* @return the matching certificate record spec, or <code>null</code> if a matching certificate record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec fetchByCertificateRecordIdAndSpecificationCode(
		long certificateRecordId, java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateRecordIdAndSpecificationCode(certificateRecordId,
			specificationCode);
	}

	/**
	* Returns the certificate record spec where certificateRecordId = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param certificateRecordId the certificate record ID
	* @param specificationCode the specification code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching certificate record spec, or <code>null</code> if a matching certificate record spec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec fetchByCertificateRecordIdAndSpecificationCode(
		long certificateRecordId, java.lang.String specificationCode,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateRecordIdAndSpecificationCode(certificateRecordId,
			specificationCode, retrieveFromCache);
	}

	/**
	* Removes the certificate record spec where certificateRecordId = &#63; and specificationCode = &#63; from the database.
	*
	* @param certificateRecordId the certificate record ID
	* @param specificationCode the specification code
	* @return the certificate record spec that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec removeByCertificateRecordIdAndSpecificationCode(
		long certificateRecordId, java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException {
		return getPersistence()
				   .removeByCertificateRecordIdAndSpecificationCode(certificateRecordId,
			specificationCode);
	}

	/**
	* Returns the number of certificate record specs where certificateRecordId = &#63; and specificationCode = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param specificationCode the specification code
	* @return the number of matching certificate record specs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCertificateRecordIdAndSpecificationCode(
		long certificateRecordId, java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByCertificateRecordIdAndSpecificationCode(certificateRecordId,
			specificationCode);
	}

	/**
	* Caches the certificate record spec in the entity cache if it is enabled.
	*
	* @param certificateRecordSpec the certificate record spec
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec certificateRecordSpec) {
		getPersistence().cacheResult(certificateRecordSpec);
	}

	/**
	* Caches the certificate record specs in the entity cache if it is enabled.
	*
	* @param certificateRecordSpecs the certificate record specs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec> certificateRecordSpecs) {
		getPersistence().cacheResult(certificateRecordSpecs);
	}

	/**
	* Creates a new certificate record spec with the primary key. Does not add the certificate record spec to the database.
	*
	* @param id the primary key for the new certificate record spec
	* @return the new certificate record spec
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the certificate record spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the certificate record spec
	* @return the certificate record spec that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException if a certificate record spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec certificateRecordSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(certificateRecordSpec);
	}

	/**
	* Returns the certificate record spec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException} if it could not be found.
	*
	* @param id the primary key of the certificate record spec
	* @return the certificate record spec
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException if a certificate record spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the certificate record spec with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the certificate record spec
	* @return the certificate record spec, or <code>null</code> if a certificate record spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the certificate record specs.
	*
	* @return the certificate record specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the certificate record specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of certificate record specs
	* @param end the upper bound of the range of certificate record specs (not inclusive)
	* @return the range of certificate record specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the certificate record specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of certificate record specs
	* @param end the upper bound of the range of certificate record specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of certificate record specs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the certificate record specs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of certificate record specs.
	*
	* @return the number of certificate record specs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CertificateRecordSpecPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CertificateRecordSpecPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					CertificateRecordSpecPersistence.class.getName());

			ReferenceRegistry.registerReference(CertificateRecordSpecUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CertificateRecordSpecPersistence persistence) {
	}

	private static CertificateRecordSpecPersistence _persistence;
}