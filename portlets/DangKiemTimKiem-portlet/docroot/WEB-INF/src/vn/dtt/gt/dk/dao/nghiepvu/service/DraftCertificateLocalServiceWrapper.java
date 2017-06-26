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
 * Provides a wrapper for {@link DraftCertificateLocalService}.
 *
 * @author win_64
 * @see DraftCertificateLocalService
 * @generated
 */
public class DraftCertificateLocalServiceWrapper
	implements DraftCertificateLocalService,
		ServiceWrapper<DraftCertificateLocalService> {
	public DraftCertificateLocalServiceWrapper(
		DraftCertificateLocalService draftCertificateLocalService) {
		_draftCertificateLocalService = draftCertificateLocalService;
	}

	/**
	* Adds the draft certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param draftCertificate the draft certificate
	* @return the draft certificate that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate addDraftCertificate(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate draftCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _draftCertificateLocalService.addDraftCertificate(draftCertificate);
	}

	/**
	* Creates a new draft certificate with the primary key. Does not add the draft certificate to the database.
	*
	* @param id the primary key for the new draft certificate
	* @return the new draft certificate
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate createDraftCertificate(
		long id) {
		return _draftCertificateLocalService.createDraftCertificate(id);
	}

	/**
	* Deletes the draft certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the draft certificate
	* @return the draft certificate that was removed
	* @throws PortalException if a draft certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate deleteDraftCertificate(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _draftCertificateLocalService.deleteDraftCertificate(id);
	}

	/**
	* Deletes the draft certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param draftCertificate the draft certificate
	* @return the draft certificate that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate deleteDraftCertificate(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate draftCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _draftCertificateLocalService.deleteDraftCertificate(draftCertificate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _draftCertificateLocalService.dynamicQuery();
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
		return _draftCertificateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _draftCertificateLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DraftCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _draftCertificateLocalService.dynamicQuery(dynamicQuery, start,
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
		return _draftCertificateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _draftCertificateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate fetchDraftCertificate(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _draftCertificateLocalService.fetchDraftCertificate(id);
	}

	/**
	* Returns the draft certificate with the primary key.
	*
	* @param id the primary key of the draft certificate
	* @return the draft certificate
	* @throws PortalException if a draft certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate getDraftCertificate(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _draftCertificateLocalService.getDraftCertificate(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _draftCertificateLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate> getDraftCertificates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _draftCertificateLocalService.getDraftCertificates(start, end);
	}

	/**
	* Returns the number of draft certificates.
	*
	* @return the number of draft certificates
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDraftCertificatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _draftCertificateLocalService.getDraftCertificatesCount();
	}

	/**
	* Updates the draft certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param draftCertificate the draft certificate
	* @return the draft certificate that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate updateDraftCertificate(
		vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate draftCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _draftCertificateLocalService.updateDraftCertificate(draftCertificate);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _draftCertificateLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_draftCertificateLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _draftCertificateLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DraftCertificateLocalService getWrappedDraftCertificateLocalService() {
		return _draftCertificateLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDraftCertificateLocalService(
		DraftCertificateLocalService draftCertificateLocalService) {
		_draftCertificateLocalService = draftCertificateLocalService;
	}

	@Override
	public DraftCertificateLocalService getWrappedService() {
		return _draftCertificateLocalService;
	}

	@Override
	public void setWrappedService(
		DraftCertificateLocalService draftCertificateLocalService) {
		_draftCertificateLocalService = draftCertificateLocalService;
	}

	private DraftCertificateLocalService _draftCertificateLocalService;
}