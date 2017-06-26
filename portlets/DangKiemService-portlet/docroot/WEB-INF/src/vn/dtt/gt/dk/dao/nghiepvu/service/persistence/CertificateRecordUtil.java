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

import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;

import java.util.List;

/**
 * The persistence utility for the certificate record service. This utility wraps {@link CertificateRecordPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CertificateRecordPersistence
 * @see CertificateRecordPersistenceImpl
 * @generated
 */
public class CertificateRecordUtil {
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
	public static void clearCache(CertificateRecord certificateRecord) {
		getPersistence().clearCache(certificateRecord);
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
	public static List<CertificateRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CertificateRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CertificateRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CertificateRecord update(CertificateRecord certificateRecord)
		throws SystemException {
		return getPersistence().update(certificateRecord);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CertificateRecord update(
		CertificateRecord certificateRecord, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(certificateRecord, serviceContext);
	}

	/**
	* Returns all the certificate records where attachedFile = &#63;.
	*
	* @param attachedFile the attached file
	* @return the matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByAttachedFile(
		long attachedFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAttachedFile(attachedFile);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByAttachedFile(
		long attachedFile, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAttachedFile(attachedFile, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByAttachedFile(
		long attachedFile, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAttachedFile(attachedFile, start, end,
			orderByComparator);
	}

	/**
	* Returns the first certificate record in the ordered set where attachedFile = &#63;.
	*
	* @param attachedFile the attached file
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByAttachedFile_First(
		long attachedFile,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByAttachedFile_First(attachedFile, orderByComparator);
	}

	/**
	* Returns the first certificate record in the ordered set where attachedFile = &#63;.
	*
	* @param attachedFile the attached file
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByAttachedFile_First(
		long attachedFile,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAttachedFile_First(attachedFile, orderByComparator);
	}

	/**
	* Returns the last certificate record in the ordered set where attachedFile = &#63;.
	*
	* @param attachedFile the attached file
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByAttachedFile_Last(
		long attachedFile,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByAttachedFile_Last(attachedFile, orderByComparator);
	}

	/**
	* Returns the last certificate record in the ordered set where attachedFile = &#63;.
	*
	* @param attachedFile the attached file
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByAttachedFile_Last(
		long attachedFile,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAttachedFile_Last(attachedFile, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord[] findByAttachedFile_PrevAndNext(
		long id, long attachedFile,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByAttachedFile_PrevAndNext(id, attachedFile,
			orderByComparator);
	}

	/**
	* Removes all the certificate records where attachedFile = &#63; from the database.
	*
	* @param attachedFile the attached file
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAttachedFile(long attachedFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAttachedFile(attachedFile);
	}

	/**
	* Returns the number of certificate records where attachedFile = &#63;.
	*
	* @param attachedFile the attached file
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAttachedFile(long attachedFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAttachedFile(attachedFile);
	}

	/**
	* Returns all the certificate records where safetyTestReportId = &#63;.
	*
	* @param safetyTestReportId the safety test report ID
	* @return the matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findBySafetyTestReportId(
		long safetyTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySafetyTestReportId(safetyTestReportId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findBySafetyTestReportId(
		long safetyTestReportId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySafetyTestReportId(safetyTestReportId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findBySafetyTestReportId(
		long safetyTestReportId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySafetyTestReportId(safetyTestReportId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first certificate record in the ordered set where safetyTestReportId = &#63;.
	*
	* @param safetyTestReportId the safety test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findBySafetyTestReportId_First(
		long safetyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findBySafetyTestReportId_First(safetyTestReportId,
			orderByComparator);
	}

	/**
	* Returns the first certificate record in the ordered set where safetyTestReportId = &#63;.
	*
	* @param safetyTestReportId the safety test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchBySafetyTestReportId_First(
		long safetyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySafetyTestReportId_First(safetyTestReportId,
			orderByComparator);
	}

	/**
	* Returns the last certificate record in the ordered set where safetyTestReportId = &#63;.
	*
	* @param safetyTestReportId the safety test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findBySafetyTestReportId_Last(
		long safetyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findBySafetyTestReportId_Last(safetyTestReportId,
			orderByComparator);
	}

	/**
	* Returns the last certificate record in the ordered set where safetyTestReportId = &#63;.
	*
	* @param safetyTestReportId the safety test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchBySafetyTestReportId_Last(
		long safetyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySafetyTestReportId_Last(safetyTestReportId,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord[] findBySafetyTestReportId_PrevAndNext(
		long id, long safetyTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findBySafetyTestReportId_PrevAndNext(id,
			safetyTestReportId, orderByComparator);
	}

	/**
	* Removes all the certificate records where safetyTestReportId = &#63; from the database.
	*
	* @param safetyTestReportId the safety test report ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySafetyTestReportId(long safetyTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySafetyTestReportId(safetyTestReportId);
	}

	/**
	* Returns the number of certificate records where safetyTestReportId = &#63;.
	*
	* @param safetyTestReportId the safety test report ID
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySafetyTestReportId(long safetyTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySafetyTestReportId(safetyTestReportId);
	}

	/**
	* Returns all the certificate records where emissionTestReportId = &#63;.
	*
	* @param emissionTestReportId the emission test report ID
	* @return the matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByEmissionTestReportId(
		long emissionTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEmissionTestReportId(emissionTestReportId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByEmissionTestReportId(
		long emissionTestReportId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEmissionTestReportId(emissionTestReportId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByEmissionTestReportId(
		long emissionTestReportId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEmissionTestReportId(emissionTestReportId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first certificate record in the ordered set where emissionTestReportId = &#63;.
	*
	* @param emissionTestReportId the emission test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByEmissionTestReportId_First(
		long emissionTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByEmissionTestReportId_First(emissionTestReportId,
			orderByComparator);
	}

	/**
	* Returns the first certificate record in the ordered set where emissionTestReportId = &#63;.
	*
	* @param emissionTestReportId the emission test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByEmissionTestReportId_First(
		long emissionTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmissionTestReportId_First(emissionTestReportId,
			orderByComparator);
	}

	/**
	* Returns the last certificate record in the ordered set where emissionTestReportId = &#63;.
	*
	* @param emissionTestReportId the emission test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByEmissionTestReportId_Last(
		long emissionTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByEmissionTestReportId_Last(emissionTestReportId,
			orderByComparator);
	}

	/**
	* Returns the last certificate record in the ordered set where emissionTestReportId = &#63;.
	*
	* @param emissionTestReportId the emission test report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByEmissionTestReportId_Last(
		long emissionTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmissionTestReportId_Last(emissionTestReportId,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord[] findByEmissionTestReportId_PrevAndNext(
		long id, long emissionTestReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByEmissionTestReportId_PrevAndNext(id,
			emissionTestReportId, orderByComparator);
	}

	/**
	* Removes all the certificate records where emissionTestReportId = &#63; from the database.
	*
	* @param emissionTestReportId the emission test report ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEmissionTestReportId(long emissionTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEmissionTestReportId(emissionTestReportId);
	}

	/**
	* Returns the number of certificate records where emissionTestReportId = &#63;.
	*
	* @param emissionTestReportId the emission test report ID
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEmissionTestReportId(long emissionTestReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEmissionTestReportId(emissionTestReportId);
	}

	/**
	* Returns all the certificate records where copReportId = &#63;.
	*
	* @param copReportId the cop report ID
	* @return the matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByCopReportId(
		long copReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCopReportId(copReportId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByCopReportId(
		long copReportId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCopReportId(copReportId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByCopReportId(
		long copReportId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCopReportId(copReportId, start, end, orderByComparator);
	}

	/**
	* Returns the first certificate record in the ordered set where copReportId = &#63;.
	*
	* @param copReportId the cop report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByCopReportId_First(
		long copReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByCopReportId_First(copReportId, orderByComparator);
	}

	/**
	* Returns the first certificate record in the ordered set where copReportId = &#63;.
	*
	* @param copReportId the cop report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByCopReportId_First(
		long copReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCopReportId_First(copReportId, orderByComparator);
	}

	/**
	* Returns the last certificate record in the ordered set where copReportId = &#63;.
	*
	* @param copReportId the cop report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByCopReportId_Last(
		long copReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByCopReportId_Last(copReportId, orderByComparator);
	}

	/**
	* Returns the last certificate record in the ordered set where copReportId = &#63;.
	*
	* @param copReportId the cop report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByCopReportId_Last(
		long copReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCopReportId_Last(copReportId, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord[] findByCopReportId_PrevAndNext(
		long id, long copReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByCopReportId_PrevAndNext(id, copReportId,
			orderByComparator);
	}

	/**
	* Removes all the certificate records where copReportId = &#63; from the database.
	*
	* @param copReportId the cop report ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCopReportId(long copReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCopReportId(copReportId);
	}

	/**
	* Returns the number of certificate records where copReportId = &#63;.
	*
	* @param copReportId the cop report ID
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCopReportId(long copReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCopReportId(copReportId);
	}

	/**
	* Returns all the certificate records where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierId(
		long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDossierId(dossierId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierId(
		long dossierId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDossierId(dossierId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDossierId(dossierId, start, end, orderByComparator);
	}

	/**
	* Returns the first certificate record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the first certificate record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByDossierId_First(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the last certificate record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByDossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last certificate record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByDossierId_Last(
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierId_Last(dossierId, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord[] findByDossierId_PrevAndNext(
		long id, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByDossierId_PrevAndNext(id, dossierId, orderByComparator);
	}

	/**
	* Removes all the certificate records where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDossierId(dossierId);
	}

	/**
	* Returns the number of certificate records where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDossierId(long dossierId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDossierId(dossierId);
	}

	/**
	* Returns the certificate record where certificateNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException} if it could not be found.
	*
	* @param certificateNumber the certificate number
	* @return the matching certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByCertificateNumber(
		java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence().findByCertificateNumber(certificateNumber);
	}

	/**
	* Returns the certificate record where certificateNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param certificateNumber the certificate number
	* @return the matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByCertificateNumber(
		java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCertificateNumber(certificateNumber);
	}

	/**
	* Returns the certificate record where certificateNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param certificateNumber the certificate number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByCertificateNumber(
		java.lang.String certificateNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateNumber(certificateNumber,
			retrieveFromCache);
	}

	/**
	* Removes the certificate record where certificateNumber = &#63; from the database.
	*
	* @param certificateNumber the certificate number
	* @return the certificate record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord removeByCertificateNumber(
		java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence().removeByCertificateNumber(certificateNumber);
	}

	/**
	* Returns the number of certificate records where certificateNumber = &#63;.
	*
	* @param certificateNumber the certificate number
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCertificateNumber(
		java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCertificateNumber(certificateNumber);
	}

	/**
	* Returns all the certificate records where dossierId = &#63; and inspectionReportId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @return the matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierIdAndInspectionReportId(
		long dossierId, long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDossierIdAndInspectionReportId(dossierId,
			inspectionReportId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierIdAndInspectionReportId(
		long dossierId, long inspectionReportId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDossierIdAndInspectionReportId(dossierId,
			inspectionReportId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierIdAndInspectionReportId(
		long dossierId, long inspectionReportId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDossierIdAndInspectionReportId(dossierId,
			inspectionReportId, start, end, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByDossierIdAndInspectionReportId_First(
		long dossierId, long inspectionReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByDossierIdAndInspectionReportId_First(dossierId,
			inspectionReportId, orderByComparator);
	}

	/**
	* Returns the first certificate record in the ordered set where dossierId = &#63; and inspectionReportId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByDossierIdAndInspectionReportId_First(
		long dossierId, long inspectionReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierIdAndInspectionReportId_First(dossierId,
			inspectionReportId, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByDossierIdAndInspectionReportId_Last(
		long dossierId, long inspectionReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByDossierIdAndInspectionReportId_Last(dossierId,
			inspectionReportId, orderByComparator);
	}

	/**
	* Returns the last certificate record in the ordered set where dossierId = &#63; and inspectionReportId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByDossierIdAndInspectionReportId_Last(
		long dossierId, long inspectionReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDossierIdAndInspectionReportId_Last(dossierId,
			inspectionReportId, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord[] findByDossierIdAndInspectionReportId_PrevAndNext(
		long id, long dossierId, long inspectionReportId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence()
				   .findByDossierIdAndInspectionReportId_PrevAndNext(id,
			dossierId, inspectionReportId, orderByComparator);
	}

	/**
	* Removes all the certificate records where dossierId = &#63; and inspectionReportId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDossierIdAndInspectionReportId(long dossierId,
		long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDossierIdAndInspectionReportId(dossierId,
			inspectionReportId);
	}

	/**
	* Returns the number of certificate records where dossierId = &#63; and inspectionReportId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param inspectionReportId the inspection report ID
	* @return the number of matching certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDossierIdAndInspectionReportId(long dossierId,
		long inspectionReportId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDossierIdAndInspectionReportId(dossierId,
			inspectionReportId);
	}

	/**
	* Caches the certificate record in the entity cache if it is enabled.
	*
	* @param certificateRecord the certificate record
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord certificateRecord) {
		getPersistence().cacheResult(certificateRecord);
	}

	/**
	* Caches the certificate records in the entity cache if it is enabled.
	*
	* @param certificateRecords the certificate records
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> certificateRecords) {
		getPersistence().cacheResult(certificateRecords);
	}

	/**
	* Creates a new certificate record with the primary key. Does not add the certificate record to the database.
	*
	* @param id the primary key for the new certificate record
	* @return the new certificate record
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the certificate record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the certificate record
	* @return the certificate record that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord certificateRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(certificateRecord);
	}

	/**
	* Returns the certificate record with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException} if it could not be found.
	*
	* @param id the primary key of the certificate record
	* @return the certificate record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the certificate record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the certificate record
	* @return the certificate record, or <code>null</code> if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the certificate records.
	*
	* @return the certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the certificate records from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of certificate records.
	*
	* @return the number of certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CertificateRecordPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CertificateRecordPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					CertificateRecordPersistence.class.getName());

			ReferenceRegistry.registerReference(CertificateRecordUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CertificateRecordPersistence persistence) {
	}

	private static CertificateRecordPersistence _persistence;
}