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

package vn.dtt.gt.dk.dao.nghiepvu.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for CertificateRecord. This utility wraps
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.CertificateRecordLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see CertificateRecordLocalService
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CertificateRecordLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.CertificateRecordLocalServiceImpl
 * @generated
 */
public class CertificateRecordLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.CertificateRecordLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the certificate record to the database. Also notifies the appropriate model listeners.
	*
	* @param certificateRecord the certificate record
	* @return the certificate record that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord addCertificateRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord certificateRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCertificateRecord(certificateRecord);
	}

	/**
	* Creates a new certificate record with the primary key. Does not add the certificate record to the database.
	*
	* @param id the primary key for the new certificate record
	* @return the new certificate record
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord createCertificateRecord(
		long id) {
		return getService().createCertificateRecord(id);
	}

	/**
	* Deletes the certificate record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the certificate record
	* @return the certificate record that was removed
	* @throws PortalException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord deleteCertificateRecord(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCertificateRecord(id);
	}

	/**
	* Deletes the certificate record from the database. Also notifies the appropriate model listeners.
	*
	* @param certificateRecord the certificate record
	* @return the certificate record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord deleteCertificateRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord certificateRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCertificateRecord(certificateRecord);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchCertificateRecord(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCertificateRecord(id);
	}

	/**
	* Returns the certificate record with the primary key.
	*
	* @param id the primary key of the certificate record
	* @return the certificate record
	* @throws PortalException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord getCertificateRecord(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCertificateRecord(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> getCertificateRecords(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCertificateRecords(start, end);
	}

	/**
	* Returns the number of certificate records.
	*
	* @return the number of certificate records
	* @throws SystemException if a system exception occurred
	*/
	public static int getCertificateRecordsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCertificateRecordsCount();
	}

	/**
	* Updates the certificate record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param certificateRecord the certificate record
	* @return the certificate record that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord updateCertificateRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord certificateRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCertificateRecord(certificateRecord);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findBySafetyTestReportId(
		long safetyTestReportId) {
		return getService().findBySafetyTestReportId(safetyTestReportId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByEmissionTestReportId(
		long emissionTestReportId) {
		return getService().findByEmissionTestReportId(emissionTestReportId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByCopReportId(
		long copReportId) {
		return getService().findByCopReportId(copReportId);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByCertificateNumber(
		java.lang.String certificateNumber) {
		return getService().findByCertificateNumber(certificateNumber);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findCertificateRecord(
		java.lang.String schema, java.lang.String soChungChi,
		long organizationId, java.lang.String thuTucHanhChinhId,
		java.lang.String doiTuong, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int year, int start, int end) {
		return getService()
				   .findCertificateRecord(schema, soChungChi, organizationId,
			thuTucHanhChinhId, doiTuong, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year, start, end);
	}

	public static int countCertificateRecord(java.lang.String schema,
		java.lang.String soChungChi, long organizationId,
		java.lang.String thuTucHanhChinhId, java.lang.String doiTuong,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return getService()
				   .countCertificateRecord(schema, soChungChi, organizationId,
			thuTucHanhChinhId, doiTuong, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierIdAndInspectionReportId(
		long dossierId, long inspectionReportId) {
		return getService()
				   .findByDossierIdAndInspectionReportId(dossierId,
			inspectionReportId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierIdAndInspectionReportIdAndStampStatus(
		long dossierId, long inspectionReportId) {
		return getService()
				   .findByDossierIdAndInspectionReportIdAndStampStatus(dossierId,
			inspectionReportId);
	}

	public static int countSoLuongChoDongDau(long phieuXuLyPhuId) {
		return getService().countSoLuongChoDongDau(phieuXuLyPhuId);
	}

	public static boolean deleteCertificateSpecWithCertificateId(
		long certificateId) {
		return getService().deleteCertificateSpecWithCertificateId(certificateId);
	}

	public static boolean deleteCertificateCircularWithCertificateId(
		long certificateId) {
		return getService()
				   .deleteCertificateCircularWithCertificateId(certificateId);
	}

	public static void clearService() {
		_service = null;
	}

	public static CertificateRecordLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CertificateRecordLocalService.class.getName());

			if (invokableLocalService instanceof CertificateRecordLocalService) {
				_service = (CertificateRecordLocalService)invokableLocalService;
			}
			else {
				_service = new CertificateRecordLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CertificateRecordLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CertificateRecordLocalService service) {
	}

	private static CertificateRecordLocalService _service;
}