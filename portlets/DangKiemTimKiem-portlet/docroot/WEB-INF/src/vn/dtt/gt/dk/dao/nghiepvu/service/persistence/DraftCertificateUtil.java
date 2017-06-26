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

import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate;

import java.util.List;

/**
 * The persistence utility for the draft certificate service. This utility wraps {@link DraftCertificatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DraftCertificatePersistence
 * @see DraftCertificatePersistenceImpl
 * @generated
 */
public class DraftCertificateUtil {
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
	public static void clearCache(DraftCertificate draftCertificate) {
		getPersistence().clearCache(draftCertificate);
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
	public static List<DraftCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DraftCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DraftCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DraftCertificate update(DraftCertificate draftCertificate)
		throws SystemException {
		return getPersistence().update(draftCertificate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DraftCertificate update(DraftCertificate draftCertificate,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(draftCertificate, serviceContext);
	}

	/**
	* Returns the draft certificate where inspectionReportId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException} if it could not be found.
	*
	* @param inspectionReportId the inspection report ID
	* @return the matching draft certificate
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException if a matching draft certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate findByInspectionReportId(
		long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException {
		return getPersistence().findByInspectionReportId(inspectionReportId);
	}

	/**
	* Returns the draft certificate where inspectionReportId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectionReportId the inspection report ID
	* @return the matching draft certificate, or <code>null</code> if a matching draft certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate fetchByInspectionReportId(
		long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByInspectionReportId(inspectionReportId);
	}

	/**
	* Returns the draft certificate where inspectionReportId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectionReportId the inspection report ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching draft certificate, or <code>null</code> if a matching draft certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate fetchByInspectionReportId(
		long inspectionReportId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectionReportId(inspectionReportId,
			retrieveFromCache);
	}

	/**
	* Removes the draft certificate where inspectionReportId = &#63; from the database.
	*
	* @param inspectionReportId the inspection report ID
	* @return the draft certificate that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate removeByInspectionReportId(
		long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException {
		return getPersistence().removeByInspectionReportId(inspectionReportId);
	}

	/**
	* Returns the number of draft certificates where inspectionReportId = &#63;.
	*
	* @param inspectionReportId the inspection report ID
	* @return the number of matching draft certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectionReportId(long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByInspectionReportId(inspectionReportId);
	}

	/**
	* Caches the draft certificate in the entity cache if it is enabled.
	*
	* @param draftCertificate the draft certificate
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate draftCertificate) {
		getPersistence().cacheResult(draftCertificate);
	}

	/**
	* Caches the draft certificates in the entity cache if it is enabled.
	*
	* @param draftCertificates the draft certificates
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate> draftCertificates) {
		getPersistence().cacheResult(draftCertificates);
	}

	/**
	* Creates a new draft certificate with the primary key. Does not add the draft certificate to the database.
	*
	* @param id the primary key for the new draft certificate
	* @return the new draft certificate
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the draft certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the draft certificate
	* @return the draft certificate that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException if a draft certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate draftCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(draftCertificate);
	}

	/**
	* Returns the draft certificate with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException} if it could not be found.
	*
	* @param id the primary key of the draft certificate
	* @return the draft certificate
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException if a draft certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the draft certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the draft certificate
	* @return the draft certificate, or <code>null</code> if a draft certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the draft certificates.
	*
	* @return the draft certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the draft certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of draft certificates
	* @param end the upper bound of the range of draft certificates (not inclusive)
	* @return the range of draft certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the draft certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of draft certificates
	* @param end the upper bound of the range of draft certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of draft certificates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the draft certificates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of draft certificates.
	*
	* @return the number of draft certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DraftCertificatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DraftCertificatePersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					DraftCertificatePersistence.class.getName());

			ReferenceRegistry.registerReference(DraftCertificateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DraftCertificatePersistence persistence) {
	}

	private static DraftCertificatePersistence _persistence;
}