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

import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate;

/**
 * The persistence interface for the draft certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DraftCertificatePersistenceImpl
 * @see DraftCertificateUtil
 * @generated
 */
public interface DraftCertificatePersistence extends BasePersistence<DraftCertificate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DraftCertificateUtil} to access the draft certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the draft certificate where inspectionReportId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException} if it could not be found.
	*
	* @param inspectionReportId the inspection report ID
	* @return the matching draft certificate
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException if a matching draft certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate findByInspectionReportId(
		long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException;

	/**
	* Returns the draft certificate where inspectionReportId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectionReportId the inspection report ID
	* @return the matching draft certificate, or <code>null</code> if a matching draft certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate fetchByInspectionReportId(
		long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the draft certificate where inspectionReportId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectionReportId the inspection report ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching draft certificate, or <code>null</code> if a matching draft certificate could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate fetchByInspectionReportId(
		long inspectionReportId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the draft certificate where inspectionReportId = &#63; from the database.
	*
	* @param inspectionReportId the inspection report ID
	* @return the draft certificate that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate removeByInspectionReportId(
		long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException;

	/**
	* Returns the number of draft certificates where inspectionReportId = &#63;.
	*
	* @param inspectionReportId the inspection report ID
	* @return the number of matching draft certificates
	* @throws SystemException if a system exception occurred
	*/
	public int countByInspectionReportId(long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the draft certificate in the entity cache if it is enabled.
	*
	* @param draftCertificate the draft certificate
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate draftCertificate);

	/**
	* Caches the draft certificates in the entity cache if it is enabled.
	*
	* @param draftCertificates the draft certificates
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate> draftCertificates);

	/**
	* Creates a new draft certificate with the primary key. Does not add the draft certificate to the database.
	*
	* @param id the primary key for the new draft certificate
	* @return the new draft certificate
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate create(long id);

	/**
	* Removes the draft certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the draft certificate
	* @return the draft certificate that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException if a draft certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate draftCertificate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the draft certificate with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException} if it could not be found.
	*
	* @param id the primary key of the draft certificate
	* @return the draft certificate
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException if a draft certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDraftCertificateException;

	/**
	* Returns the draft certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the draft certificate
	* @return the draft certificate, or <code>null</code> if a draft certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the draft certificates.
	*
	* @return the draft certificates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the draft certificates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of draft certificates.
	*
	* @return the number of draft certificates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}