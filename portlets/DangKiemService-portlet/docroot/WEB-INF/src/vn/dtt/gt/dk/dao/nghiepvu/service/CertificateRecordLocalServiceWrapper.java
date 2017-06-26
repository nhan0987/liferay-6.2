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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CertificateRecordLocalService}.
 *
 * @author huymq
 * @see CertificateRecordLocalService
 * @generated
 */
public class CertificateRecordLocalServiceWrapper
	implements CertificateRecordLocalService,
		ServiceWrapper<CertificateRecordLocalService> {
	public CertificateRecordLocalServiceWrapper(
		CertificateRecordLocalService certificateRecordLocalService) {
		_certificateRecordLocalService = certificateRecordLocalService;
	}

	/**
	* Adds the certificate record to the database. Also notifies the appropriate model listeners.
	*
	* @param certificateRecord the certificate record
	* @return the certificate record that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord addCertificateRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord certificateRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.addCertificateRecord(certificateRecord);
	}

	/**
	* Creates a new certificate record with the primary key. Does not add the certificate record to the database.
	*
	* @param id the primary key for the new certificate record
	* @return the new certificate record
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord createCertificateRecord(
		long id) {
		return _certificateRecordLocalService.createCertificateRecord(id);
	}

	/**
	* Deletes the certificate record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the certificate record
	* @return the certificate record that was removed
	* @throws PortalException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord deleteCertificateRecord(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.deleteCertificateRecord(id);
	}

	/**
	* Deletes the certificate record from the database. Also notifies the appropriate model listeners.
	*
	* @param certificateRecord the certificate record
	* @return the certificate record that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord deleteCertificateRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord certificateRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.deleteCertificateRecord(certificateRecord);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _certificateRecordLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord fetchCertificateRecord(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.fetchCertificateRecord(id);
	}

	/**
	* Returns the certificate record with the primary key.
	*
	* @param id the primary key of the certificate record
	* @return the certificate record
	* @throws PortalException if a certificate record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord getCertificateRecord(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.getCertificateRecord(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> getCertificateRecords(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.getCertificateRecords(start, end);
	}

	/**
	* Returns the number of certificate records.
	*
	* @return the number of certificate records
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCertificateRecordsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.getCertificateRecordsCount();
	}

	/**
	* Updates the certificate record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param certificateRecord the certificate record
	* @return the certificate record that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord updateCertificateRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord certificateRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordLocalService.updateCertificateRecord(certificateRecord);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _certificateRecordLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_certificateRecordLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _certificateRecordLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findBySafetyTestReportId(
		long safetyTestReportId) {
		return _certificateRecordLocalService.findBySafetyTestReportId(safetyTestReportId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByEmissionTestReportId(
		long emissionTestReportId) {
		return _certificateRecordLocalService.findByEmissionTestReportId(emissionTestReportId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByCopReportId(
		long copReportId) {
		return _certificateRecordLocalService.findByCopReportId(copReportId);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord findByCertificateNumber(
		java.lang.String certificateNumber) {
		return _certificateRecordLocalService.findByCertificateNumber(certificateNumber);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findCertificateRecord(
		java.lang.String schema, java.lang.String soChungChi,
		long organizationId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return _certificateRecordLocalService.findCertificateRecord(schema,
			soChungChi, organizationId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	@Override
	public int countCertificateRecord(java.lang.String schema,
		java.lang.String soChungChi, long organizationId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int year) {
		return _certificateRecordLocalService.countCertificateRecord(schema,
			soChungChi, organizationId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierIdAndInspectionReportId(
		long dossierId, long inspectionReportId) {
		return _certificateRecordLocalService.findByDossierIdAndInspectionReportId(dossierId,
			inspectionReportId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord> findByDossierIdAndInspectionReportIdAndStampStatus(
		long dossierId, long inspectionReportId) {
		return _certificateRecordLocalService.findByDossierIdAndInspectionReportIdAndStampStatus(dossierId,
			inspectionReportId);
	}

	@Override
	public int countSoLuongChoDongDau(long phieuXuLyPhuId) {
		return _certificateRecordLocalService.countSoLuongChoDongDau(phieuXuLyPhuId);
	}

	@Override
	public boolean deleteCertificateSpecWithCertificateId(long certificateId) {
		return _certificateRecordLocalService.deleteCertificateSpecWithCertificateId(certificateId);
	}

	@Override
	public boolean deleteCertificateCircularWithCertificateId(
		long certificateId) {
		return _certificateRecordLocalService.deleteCertificateCircularWithCertificateId(certificateId);
	}

	@Override
	public vn.dtt.gt.dk.api.bean.CertificateXMY findCertificateXMY(
		long companyId, java.lang.String certificateNumber,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return _certificateRecordLocalService.findCertificateXMY(companyId,
			certificateNumber, serviceContext);
	}

	@Override
	public vn.dtt.gt.dk.api.bean.CertificateXCG findCertificateXCG(
		long companyId, java.lang.String certificateNumber,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return _certificateRecordLocalService.findCertificateXCG(companyId,
			certificateNumber, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CertificateRecordLocalService getWrappedCertificateRecordLocalService() {
		return _certificateRecordLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCertificateRecordLocalService(
		CertificateRecordLocalService certificateRecordLocalService) {
		_certificateRecordLocalService = certificateRecordLocalService;
	}

	@Override
	public CertificateRecordLocalService getWrappedService() {
		return _certificateRecordLocalService;
	}

	@Override
	public void setWrappedService(
		CertificateRecordLocalService certificateRecordLocalService) {
		_certificateRecordLocalService = certificateRecordLocalService;
	}

	private CertificateRecordLocalService _certificateRecordLocalService;
}