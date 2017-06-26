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
 * Provides a wrapper for {@link AssessmentofImporterControlLocalService}.
 *
 * @author win_64
 * @see AssessmentofImporterControlLocalService
 * @generated
 */
public class AssessmentofImporterControlLocalServiceWrapper
	implements AssessmentofImporterControlLocalService,
		ServiceWrapper<AssessmentofImporterControlLocalService> {
	public AssessmentofImporterControlLocalServiceWrapper(
		AssessmentofImporterControlLocalService assessmentofImporterControlLocalService) {
		_assessmentofImporterControlLocalService = assessmentofImporterControlLocalService;
	}

	/**
	* Adds the assessmentof importer control to the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentofImporterControl the assessmentof importer control
	* @return the assessmentof importer control that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl addAssessmentofImporterControl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl assessmentofImporterControl)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterControlLocalService.addAssessmentofImporterControl(assessmentofImporterControl);
	}

	/**
	* Creates a new assessmentof importer control with the primary key. Does not add the assessmentof importer control to the database.
	*
	* @param id the primary key for the new assessmentof importer control
	* @return the new assessmentof importer control
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl createAssessmentofImporterControl(
		long id) {
		return _assessmentofImporterControlLocalService.createAssessmentofImporterControl(id);
	}

	/**
	* Deletes the assessmentof importer control with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessmentof importer control
	* @return the assessmentof importer control that was removed
	* @throws PortalException if a assessmentof importer control with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl deleteAssessmentofImporterControl(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterControlLocalService.deleteAssessmentofImporterControl(id);
	}

	/**
	* Deletes the assessmentof importer control from the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentofImporterControl the assessmentof importer control
	* @return the assessmentof importer control that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl deleteAssessmentofImporterControl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl assessmentofImporterControl)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterControlLocalService.deleteAssessmentofImporterControl(assessmentofImporterControl);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assessmentofImporterControlLocalService.dynamicQuery();
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
		return _assessmentofImporterControlLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assessmentofImporterControlLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assessmentofImporterControlLocalService.dynamicQuery(dynamicQuery,
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
		return _assessmentofImporterControlLocalService.dynamicQueryCount(dynamicQuery);
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
		return _assessmentofImporterControlLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl fetchAssessmentofImporterControl(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterControlLocalService.fetchAssessmentofImporterControl(id);
	}

	/**
	* Returns the assessmentof importer control with the primary key.
	*
	* @param id the primary key of the assessmentof importer control
	* @return the assessmentof importer control
	* @throws PortalException if a assessmentof importer control with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl getAssessmentofImporterControl(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterControlLocalService.getAssessmentofImporterControl(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterControlLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the assessmentof importer controls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterControlModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof importer controls
	* @param end the upper bound of the range of assessmentof importer controls (not inclusive)
	* @return the range of assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> getAssessmentofImporterControls(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterControlLocalService.getAssessmentofImporterControls(start,
			end);
	}

	/**
	* Returns the number of assessmentof importer controls.
	*
	* @return the number of assessmentof importer controls
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssessmentofImporterControlsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterControlLocalService.getAssessmentofImporterControlsCount();
	}

	/**
	* Updates the assessmentof importer control in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessmentofImporterControl the assessmentof importer control
	* @return the assessmentof importer control that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl updateAssessmentofImporterControl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl assessmentofImporterControl)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterControlLocalService.updateAssessmentofImporterControl(assessmentofImporterControl);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assessmentofImporterControlLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assessmentofImporterControlLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assessmentofImporterControlLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByImporterCode(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentofImporterControlLocalService.findByImporterCode(importercode,
			assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentofImporterControlLocalService.findByImporterCodeReference(importercodereference,
			assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByImporterName(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentofImporterControlLocalService.findByImporterName(importername,
			assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear) {
		return _assessmentofImporterControlLocalService.findByNextPeriodByImporterCode(importercode,
			nextassessmentid, nextassessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear) {
		return _assessmentofImporterControlLocalService.findByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear) {
		return _assessmentofImporterControlLocalService.findByNextPeriodByImporterName(importername,
			nextassessmentid, nextassessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporterControl> findDanhSachKiemSoatDoanhNghiep(
		java.lang.String importercode, java.lang.String importername,
		int start, int end) {
		return _assessmentofImporterControlLocalService.findDanhSachKiemSoatDoanhNghiep(importercode,
			importername, start, end);
	}

	@Override
	public int countDanhSachKiemSoatDoanhNghiep(java.lang.String importercode,
		java.lang.String importername) {
		return _assessmentofImporterControlLocalService.countDanhSachKiemSoatDoanhNghiep(importercode,
			importername);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssessmentofImporterControlLocalService getWrappedAssessmentofImporterControlLocalService() {
		return _assessmentofImporterControlLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssessmentofImporterControlLocalService(
		AssessmentofImporterControlLocalService assessmentofImporterControlLocalService) {
		_assessmentofImporterControlLocalService = assessmentofImporterControlLocalService;
	}

	@Override
	public AssessmentofImporterControlLocalService getWrappedService() {
		return _assessmentofImporterControlLocalService;
	}

	@Override
	public void setWrappedService(
		AssessmentofImporterControlLocalService assessmentofImporterControlLocalService) {
		_assessmentofImporterControlLocalService = assessmentofImporterControlLocalService;
	}

	private AssessmentofImporterControlLocalService _assessmentofImporterControlLocalService;
}