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

import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;

/**
 * The persistence interface for the certificate record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CertificateRecordPersistenceImpl
 * @see CertificateRecordUtil
 * @generated
 */
public interface CertificateRecordPersistence extends BasePersistence<CertificateRecord> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CertificateRecordUtil} to access the certificate record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the certificate records where attachedFile = &#63;.
	*
	* @param attachedFile the attached file
	* @return the matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByAttachedFile(
		long attachedFile)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the certificate records where attachedFile = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param attachedFile the attached file
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @return the range of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByAttachedFile(
		long attachedFile, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the certificate records where attachedFile = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param attachedFile the attached file
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByAttachedFile(
		long attachedFile, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first certificate record in the ordered set where attachedFile = &#63;.
	*
	* @param attachedFile the attached file
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByAttachedFile_First(
		long attachedFile,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the first certificate record in the ordered set where attachedFile = &#63;.
	*
	* @param attachedFile the attached file
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByAttachedFile_First(
		long attachedFile,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last certificate record in the ordered set where attachedFile = &#63;.
	*
	* @param attachedFile the attached file
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByAttachedFile_Last(
		long attachedFile,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the last certificate record in the ordered set where attachedFile = &#63;.
	*
	* @param attachedFile the attached file
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByAttachedFile_Last(
		long attachedFile,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the certificate records before and after the current certificate record in the ordered set where attachedFile = &#63;.
	*
	* @param id the primary key of the current certificate record
	* @param attachedFile the attached file
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord[] findByAttachedFile_PrevAndNext(
		long id, long attachedFile,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Removes all the certificate records where attachedFile = &#63; from the database.
	*
	* @param attachedFile the attached file
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAttachedFile(long attachedFile)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of certificate records where attachedFile = &#63;.
	*
	* @param attachedFile the attached file
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public int countByAttachedFile(long attachedFile)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the certificate records where safetyTestReportId = &#63;.
	*
	* @param safetyTestReportId the safety test report ID
	* @return the matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findBySafetyTestReportId(
		long safetyTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the certificate records where safetyTestReportId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param safetyTestReportId the safety test report ID
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @return the range of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findBySafetyTestReportId(
		long safetyTestReportId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the certificate records where safetyTestReportId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param safetyTestReportId the safety test report ID
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findBySafetyTestReportId(
		long safetyTestReportId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first certificate record in the ordered set where safetyTestReportId = &#63;.
	*
	* @param safetyTestReportId the safety test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findBySafetyTestReportId_First(
		long safetyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the first certificate record in the ordered set where safetyTestReportId = &#63;.
	*
	* @param safetyTestReportId the safety test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchBySafetyTestReportId_First(
		long safetyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last certificate record in the ordered set where safetyTestReportId = &#63;.
	*
	* @param safetyTestReportId the safety test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findBySafetyTestReportId_Last(
		long safetyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the last certificate record in the ordered set where safetyTestReportId = &#63;.
	*
	* @param safetyTestReportId the safety test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchBySafetyTestReportId_Last(
		long safetyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the certificate records before and after the current certificate record in the ordered set where safetyTestReportId = &#63;.
	*
	* @param id the primary key of the current certificate record
	* @param safetyTestReportId the safety test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord[] findBySafetyTestReportId_PrevAndNext(
		long id, long safetyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Removes all the certificate records where safetyTestReportId = &#63; from the database.
	*
	* @param safetyTestReportId the safety test report ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySafetyTestReportId(long safetyTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of certificate records where safetyTestReportId = &#63;.
	*
	* @param safetyTestReportId the safety test report ID
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public int countBySafetyTestReportId(long safetyTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the certificate records where emissionTestReportId = &#63;.
	*
	* @param emissionTestReportId the emission test report ID
	* @return the matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByEmissionTestReportId(
		long emissionTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the certificate records where emissionTestReportId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param emissionTestReportId the emission test report ID
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @return the range of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByEmissionTestReportId(
		long emissionTestReportId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the certificate records where emissionTestReportId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param emissionTestReportId the emission test report ID
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByEmissionTestReportId(
		long emissionTestReportId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first certificate record in the ordered set where emissionTestReportId = &#63;.
	*
	* @param emissionTestReportId the emission test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByEmissionTestReportId_First(
		long emissionTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the first certificate record in the ordered set where emissionTestReportId = &#63;.
	*
	* @param emissionTestReportId the emission test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByEmissionTestReportId_First(
		long emissionTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last certificate record in the ordered set where emissionTestReportId = &#63;.
	*
	* @param emissionTestReportId the emission test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByEmissionTestReportId_Last(
		long emissionTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the last certificate record in the ordered set where emissionTestReportId = &#63;.
	*
	* @param emissionTestReportId the emission test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByEmissionTestReportId_Last(
		long emissionTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the certificate records before and after the current certificate record in the ordered set where emissionTestReportId = &#63;.
	*
	* @param id the primary key of the current certificate record
	* @param emissionTestReportId the emission test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord[] findByEmissionTestReportId_PrevAndNext(
		long id, long emissionTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Removes all the certificate records where emissionTestReportId = &#63; from the database.
	*
	* @param emissionTestReportId the emission test report ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEmissionTestReportId(long emissionTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of certificate records where emissionTestReportId = &#63;.
	*
	* @param emissionTestReportId the emission test report ID
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmissionTestReportId(long emissionTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the certificate records where copReportId = &#63;.
	*
	* @param copReportId the cop report ID
	* @return the matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByCopReportId(
		long copReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the certificate records where copReportId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param copReportId the cop report ID
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @return the range of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByCopReportId(
		long copReportId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the certificate records where copReportId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param copReportId the cop report ID
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByCopReportId(
		long copReportId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first certificate record in the ordered set where copReportId = &#63;.
	*
	* @param copReportId the cop report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByCopReportId_First(
		long copReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the first certificate record in the ordered set where copReportId = &#63;.
	*
	* @param copReportId the cop report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByCopReportId_First(
		long copReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last certificate record in the ordered set where copReportId = &#63;.
	*
	* @param copReportId the cop report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByCopReportId_Last(
		long copReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the last certificate record in the ordered set where copReportId = &#63;.
	*
	* @param copReportId the cop report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByCopReportId_Last(
		long copReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the certificate records before and after the current certificate record in the ordered set where copReportId = &#63;.
	*
	* @param id the primary key of the current certificate record
	* @param copReportId the cop report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord[] findByCopReportId_PrevAndNext(
		long id, long copReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Removes all the certificate records where copReportId = &#63; from the database.
	*
	* @param copReportId the cop report ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCopReportId(long copReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of certificate records where copReportId = &#63;.
	*
	* @param copReportId the cop report ID
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public int countByCopReportId(long copReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the certificate records where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierId(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the certificate records where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @return the range of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierId(
		long dossierId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the certificate records where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first certificate record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the first certificate record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last certificate record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the last certificate record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the certificate records before and after the current certificate record in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current certificate record
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord[] findByDossierId_PrevAndNext(
		long id, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Removes all the certificate records where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of certificate records where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public int countByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the certificate record where certificateNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException} if it could not be found.
	*
	* @param certificateNumber the certificate number
	* @return the matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByCertificateNumber(
		java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the certificate record where certificateNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param certificateNumber the certificate number
	* @return the matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByCertificateNumber(
		java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the certificate record where certificateNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param certificateNumber the certificate number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByCertificateNumber(
		java.lang.String certificateNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the certificate record where certificateNumber = &#63; from the database.
	*
	* @param certificateNumber the certificate number
	* @return the certificate record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord removeByCertificateNumber(
		java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the number of certificate records where certificateNumber = &#63;.
	*
	* @param certificateNumber the certificate number
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public int countByCertificateNumber(java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the certificate records where dossierId = &#63; and inspectionReportId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @return the matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierIdAndInspectionReportId(
		long dossierId, long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the certificate records where dossierId = &#63; and inspectionReportId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @return the range of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierIdAndInspectionReportId(
		long dossierId, long inspectionReportId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the certificate records where dossierId = &#63; and inspectionReportId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierIdAndInspectionReportId(
		long dossierId, long inspectionReportId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first certificate record in the ordered set where dossierId = &#63; and inspectionReportId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByDossierIdAndInspectionReportId_First(
		long dossierId, long inspectionReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the first certificate record in the ordered set where dossierId = &#63; and inspectionReportId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByDossierIdAndInspectionReportId_First(
		long dossierId, long inspectionReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last certificate record in the ordered set where dossierId = &#63; and inspectionReportId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByDossierIdAndInspectionReportId_Last(
		long dossierId, long inspectionReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the last certificate record in the ordered set where dossierId = &#63; and inspectionReportId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByDossierIdAndInspectionReportId_Last(
		long dossierId, long inspectionReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the certificate records before and after the current certificate record in the ordered set where dossierId = &#63; and inspectionReportId = &#63;.
	*
	* @param id the primary key of the current certificate record
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord[] findByDossierIdAndInspectionReportId_PrevAndNext(
		long id, long dossierId, long inspectionReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Removes all the certificate records where dossierId = &#63; and inspectionReportId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDossierIdAndInspectionReportId(long dossierId,
		long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of certificate records where dossierId = &#63; and inspectionReportId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public int countByDossierIdAndInspectionReportId(long dossierId,
		long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the certificate record in the entity cache if it is enabled.
	*
	* @param certificateRecord the certificate record
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord certificateRecord);

	/**
	* Caches the certificate records in the entity cache if it is enabled.
	*
	* @param certificateRecords the certificate records
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> certificateRecords);

	/**
	* Creates a new certificate record with the primary key. Does not add the certificate record to the database.
	*
	* @param id the primary key for the new certificate record
	* @return the new certificate record
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord create(long id);

	/**
	* Removes the certificate record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the certificate record
	* @return the certificate record that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord certificateRecord)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the certificate record with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException} if it could not be found.
	*
	* @param id the primary key of the certificate record
	* @return the certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;

	/**
	* Returns the certificate record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the certificate record
	* @return the certificate record, or <code>null</code> if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the certificate records.
	*
	* @return the certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the certificate records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @return the range of certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the certificate records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of certificate records
	* @param end the upper bound of the range of certificate records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of certificate records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the certificate records from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of certificate records.
	*
	* @return the number of certificate records
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}