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
 * Provides a wrapper for {@link IssueTrackingLocalService}.
 *
 * @author win_64
 * @see IssueTrackingLocalService
 * @generated
 */
public class IssueTrackingLocalServiceWrapper
	implements IssueTrackingLocalService,
		ServiceWrapper<IssueTrackingLocalService> {
	public IssueTrackingLocalServiceWrapper(
		IssueTrackingLocalService issueTrackingLocalService) {
		_issueTrackingLocalService = issueTrackingLocalService;
	}

	/**
	* Adds the issue tracking to the database. Also notifies the appropriate model listeners.
	*
	* @param issueTracking the issue tracking
	* @return the issue tracking that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking addIssueTracking(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking issueTracking)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueTrackingLocalService.addIssueTracking(issueTracking);
	}

	/**
	* Creates a new issue tracking with the primary key. Does not add the issue tracking to the database.
	*
	* @param id the primary key for the new issue tracking
	* @return the new issue tracking
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking createIssueTracking(
		long id) {
		return _issueTrackingLocalService.createIssueTracking(id);
	}

	/**
	* Deletes the issue tracking with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the issue tracking
	* @return the issue tracking that was removed
	* @throws PortalException if a issue tracking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking deleteIssueTracking(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issueTrackingLocalService.deleteIssueTracking(id);
	}

	/**
	* Deletes the issue tracking from the database. Also notifies the appropriate model listeners.
	*
	* @param issueTracking the issue tracking
	* @return the issue tracking that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking deleteIssueTracking(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking issueTracking)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueTrackingLocalService.deleteIssueTracking(issueTracking);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _issueTrackingLocalService.dynamicQuery();
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
		return _issueTrackingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _issueTrackingLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _issueTrackingLocalService.dynamicQuery(dynamicQuery, start,
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
		return _issueTrackingLocalService.dynamicQueryCount(dynamicQuery);
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
		return _issueTrackingLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking fetchIssueTracking(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _issueTrackingLocalService.fetchIssueTracking(id);
	}

	/**
	* Returns the issue tracking with the primary key.
	*
	* @param id the primary key of the issue tracking
	* @return the issue tracking
	* @throws PortalException if a issue tracking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking getIssueTracking(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issueTrackingLocalService.getIssueTracking(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issueTrackingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the issue trackings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of issue trackings
	* @param end the upper bound of the range of issue trackings (not inclusive)
	* @return the range of issue trackings
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> getIssueTrackings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueTrackingLocalService.getIssueTrackings(start, end);
	}

	/**
	* Returns the number of issue trackings.
	*
	* @return the number of issue trackings
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getIssueTrackingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueTrackingLocalService.getIssueTrackingsCount();
	}

	/**
	* Updates the issue tracking in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param issueTracking the issue tracking
	* @return the issue tracking that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking updateIssueTracking(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking issueTracking)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueTrackingLocalService.updateIssueTracking(issueTracking);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _issueTrackingLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_issueTrackingLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _issueTrackingLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findIssueTrackingByDate(
		java.lang.String maSoHoSo, java.lang.String soBBKT,
		java.lang.String motaNoiDungLoi, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String tenSanPham, int start, int end) {
		return _issueTrackingLocalService.findIssueTrackingByDate(maSoHoSo,
			soBBKT, motaNoiDungLoi, ngayNopFrom, ngayNopTo, tenDoanhNghiep,
			tenSanPham, start, end);
	}

	@Override
	public int countIssueTrackingListByDate(java.lang.String maSoHoSo,
		java.lang.String soBBKT, java.lang.String motaNoiDungLoi,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, java.lang.String tenSanPham)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueTrackingLocalService.countIssueTrackingListByDate(maSoHoSo,
			soBBKT, motaNoiDungLoi, ngayNopFrom, ngayNopTo, tenDoanhNghiep,
			tenSanPham);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByDefectStatus(
		int defectStatus, java.lang.String inspectionrecordno,
		java.lang.String registerednumber) {
		return _issueTrackingLocalService.findByDefectStatus(defectStatus,
			inspectionrecordno, registerednumber);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByProductCode(
		java.lang.String productcode) {
		return _issueTrackingLocalService.findByProductCode(productcode);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByImporterName(
		java.lang.String importername) {
		return _issueTrackingLocalService.findByImporterName(importername);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByImporterCode(
		java.lang.String importercode) {
		return _issueTrackingLocalService.findByImporterCode(importercode);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByRegisteredNumber(
		java.lang.String registerednumber) {
		return _issueTrackingLocalService.findByRegisteredNumber(registerednumber);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> findByInspectionRecordno(
		java.lang.String inspectionrecordno, java.lang.String registerednumber) {
		return _issueTrackingLocalService.findByInspectionRecordno(inspectionrecordno,
			registerednumber);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public IssueTrackingLocalService getWrappedIssueTrackingLocalService() {
		return _issueTrackingLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedIssueTrackingLocalService(
		IssueTrackingLocalService issueTrackingLocalService) {
		_issueTrackingLocalService = issueTrackingLocalService;
	}

	@Override
	public IssueTrackingLocalService getWrappedService() {
		return _issueTrackingLocalService;
	}

	@Override
	public void setWrappedService(
		IssueTrackingLocalService issueTrackingLocalService) {
		_issueTrackingLocalService = issueTrackingLocalService;
	}

	private IssueTrackingLocalService _issueTrackingLocalService;
}