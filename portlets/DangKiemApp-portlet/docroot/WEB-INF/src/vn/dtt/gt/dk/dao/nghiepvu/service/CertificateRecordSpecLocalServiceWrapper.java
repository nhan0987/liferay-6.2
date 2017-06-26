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
 * Provides a wrapper for {@link CertificateRecordSpecLocalService}.
 *
 * @author win_64
 * @see CertificateRecordSpecLocalService
 * @generated
 */
public class CertificateRecordSpecLocalServiceWrapper
	implements CertificateRecordSpecLocalService,
		ServiceWrapper<CertificateRecordSpecLocalService> {
	public CertificateRecordSpecLocalServiceWrapper(
		CertificateRecordSpecLocalService certificateRecordSpecLocalService) {
		_certificateRecordSpecLocalService = certificateRecordSpecLocalService;
	}

	/**
	* Adds the certificate record spec to the database. Also notifies the appropriate model listeners.
	*
	* @param certificateRecordSpec the certificate record spec
	* @return the certificate record spec that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec addCertificateRecordSpec(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec certificateRecordSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordSpecLocalService.addCertificateRecordSpec(certificateRecordSpec);
	}

	/**
	* Creates a new certificate record spec with the primary key. Does not add the certificate record spec to the database.
	*
	* @param id the primary key for the new certificate record spec
	* @return the new certificate record spec
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec createCertificateRecordSpec(
		long id) {
		return _certificateRecordSpecLocalService.createCertificateRecordSpec(id);
	}

	/**
	* Deletes the certificate record spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the certificate record spec
	* @return the certificate record spec that was removed
	* @throws PortalException if a certificate record spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec deleteCertificateRecordSpec(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordSpecLocalService.deleteCertificateRecordSpec(id);
	}

	/**
	* Deletes the certificate record spec from the database. Also notifies the appropriate model listeners.
	*
	* @param certificateRecordSpec the certificate record spec
	* @return the certificate record spec that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec deleteCertificateRecordSpec(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec certificateRecordSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordSpecLocalService.deleteCertificateRecordSpec(certificateRecordSpec);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _certificateRecordSpecLocalService.dynamicQuery();
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
		return _certificateRecordSpecLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _certificateRecordSpecLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _certificateRecordSpecLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _certificateRecordSpecLocalService.dynamicQueryCount(dynamicQuery);
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
		return _certificateRecordSpecLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec fetchCertificateRecordSpec(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordSpecLocalService.fetchCertificateRecordSpec(id);
	}

	/**
	* Returns the certificate record spec with the primary key.
	*
	* @param id the primary key of the certificate record spec
	* @return the certificate record spec
	* @throws PortalException if a certificate record spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec getCertificateRecordSpec(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordSpecLocalService.getCertificateRecordSpec(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordSpecLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec> getCertificateRecordSpecs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordSpecLocalService.getCertificateRecordSpecs(start,
			end);
	}

	/**
	* Returns the number of certificate record specs.
	*
	* @return the number of certificate record specs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCertificateRecordSpecsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordSpecLocalService.getCertificateRecordSpecsCount();
	}

	/**
	* Updates the certificate record spec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param certificateRecordSpec the certificate record spec
	* @return the certificate record spec that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec updateCertificateRecordSpec(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec certificateRecordSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _certificateRecordSpecLocalService.updateCertificateRecordSpec(certificateRecordSpec);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _certificateRecordSpecLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_certificateRecordSpecLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _certificateRecordSpecLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec> findByCertificateRecordId(
		long certificateRecordId) {
		return _certificateRecordSpecLocalService.findByCertificateRecordId(certificateRecordId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec> findByIdCertificateRecordAndVehicleTypeCode(
		long idCertificateRecord, java.lang.String vehicleClass,
		java.lang.String vehicleType) {
		return _certificateRecordSpecLocalService.findByIdCertificateRecordAndVehicleTypeCode(idCertificateRecord,
			vehicleClass, vehicleType);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec findByCertificateRecordIdAndSpecificationCode(
		long certificateRecordId, java.lang.String specificationCode) {
		return _certificateRecordSpecLocalService.findByCertificateRecordIdAndSpecificationCode(certificateRecordId,
			specificationCode);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CertificateRecordSpecLocalService getWrappedCertificateRecordSpecLocalService() {
		return _certificateRecordSpecLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCertificateRecordSpecLocalService(
		CertificateRecordSpecLocalService certificateRecordSpecLocalService) {
		_certificateRecordSpecLocalService = certificateRecordSpecLocalService;
	}

	@Override
	public CertificateRecordSpecLocalService getWrappedService() {
		return _certificateRecordSpecLocalService;
	}

	@Override
	public void setWrappedService(
		CertificateRecordSpecLocalService certificateRecordSpecLocalService) {
		_certificateRecordSpecLocalService = certificateRecordSpecLocalService;
	}

	private CertificateRecordSpecLocalService _certificateRecordSpecLocalService;
}