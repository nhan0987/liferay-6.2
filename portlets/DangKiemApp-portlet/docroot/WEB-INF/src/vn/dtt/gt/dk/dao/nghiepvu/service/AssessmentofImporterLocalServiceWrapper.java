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
 * Provides a wrapper for {@link AssessmentofImporterLocalService}.
 *
 * @author win_64
 * @see AssessmentofImporterLocalService
 * @generated
 */
public class AssessmentofImporterLocalServiceWrapper
	implements AssessmentofImporterLocalService,
		ServiceWrapper<AssessmentofImporterLocalService> {
	public AssessmentofImporterLocalServiceWrapper(
		AssessmentofImporterLocalService assessmentofImporterLocalService) {
		_assessmentofImporterLocalService = assessmentofImporterLocalService;
	}

	/**
	* Adds the assessmentof importer to the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentofImporter the assessmentof importer
	* @return the assessmentof importer that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter addAssessmentofImporter(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter assessmentofImporter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterLocalService.addAssessmentofImporter(assessmentofImporter);
	}

	/**
	* Creates a new assessmentof importer with the primary key. Does not add the assessmentof importer to the database.
	*
	* @param id the primary key for the new assessmentof importer
	* @return the new assessmentof importer
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter createAssessmentofImporter(
		long id) {
		return _assessmentofImporterLocalService.createAssessmentofImporter(id);
	}

	/**
	* Deletes the assessmentof importer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessmentof importer
	* @return the assessmentof importer that was removed
	* @throws PortalException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter deleteAssessmentofImporter(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterLocalService.deleteAssessmentofImporter(id);
	}

	/**
	* Deletes the assessmentof importer from the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentofImporter the assessmentof importer
	* @return the assessmentof importer that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter deleteAssessmentofImporter(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter assessmentofImporter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterLocalService.deleteAssessmentofImporter(assessmentofImporter);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assessmentofImporterLocalService.dynamicQuery();
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
		return _assessmentofImporterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assessmentofImporterLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assessmentofImporterLocalService.dynamicQuery(dynamicQuery,
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
		return _assessmentofImporterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _assessmentofImporterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchAssessmentofImporter(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterLocalService.fetchAssessmentofImporter(id);
	}

	/**
	* Returns the assessmentof importer with the primary key.
	*
	* @param id the primary key of the assessmentof importer
	* @return the assessmentof importer
	* @throws PortalException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter getAssessmentofImporter(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterLocalService.getAssessmentofImporter(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the assessmentof importers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofImporterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof importers
	* @param end the upper bound of the range of assessmentof importers (not inclusive)
	* @return the range of assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> getAssessmentofImporters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterLocalService.getAssessmentofImporters(start,
			end);
	}

	/**
	* Returns the number of assessmentof importers.
	*
	* @return the number of assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssessmentofImportersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterLocalService.getAssessmentofImportersCount();
	}

	/**
	* Updates the assessmentof importer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessmentofImporter the assessmentof importer
	* @return the assessmentof importer that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter updateAssessmentofImporter(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter assessmentofImporter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentofImporterLocalService.updateAssessmentofImporter(assessmentofImporter);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assessmentofImporterLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assessmentofImporterLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assessmentofImporterLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCode(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentofImporterLocalService.findByImporterCode(importercode,
			assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentofImporterLocalService.findByImporterCodeReference(importercodereference,
			assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterName(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentofImporterLocalService.findByImporterName(importername,
			assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear) {
		return _assessmentofImporterLocalService.findByNextPeriodByImporterCode(importercode,
			nextassessmentid, nextassessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear) {
		return _assessmentofImporterLocalService.findByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear) {
		return _assessmentofImporterLocalService.findByNextPeriodByImporterName(importername,
			nextassessmentid, nextassessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findDanhSachDanhGiaDoanhNghiep(
		java.lang.String importercode, java.lang.String importername,
		int start, int end) {
		return _assessmentofImporterLocalService.findDanhSachDanhGiaDoanhNghiep(importercode,
			importername, start, end);
	}

	@Override
	public int countDanhSachDanhGiaDoanhNghiep(java.lang.String importercode,
		java.lang.String importername) {
		return _assessmentofImporterLocalService.countDanhSachDanhGiaDoanhNghiep(importercode,
			importername);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByIC_IN_AI_AY(
		java.lang.String importercode, java.lang.String importername,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end) {
		return _assessmentofImporterLocalService.findByIC_IN_AI_AY(importercode,
			importername, assessmentid, assessmentyear, start, end);
	}

	@Override
	public int countByIC_IN_AI_AY(java.lang.String importercode,
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentofImporterLocalService.countByIC_IN_AI_AY(importercode,
			importername, assessmentid, assessmentyear);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssessmentofImporterLocalService getWrappedAssessmentofImporterLocalService() {
		return _assessmentofImporterLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssessmentofImporterLocalService(
		AssessmentofImporterLocalService assessmentofImporterLocalService) {
		_assessmentofImporterLocalService = assessmentofImporterLocalService;
	}

	@Override
	public AssessmentofImporterLocalService getWrappedService() {
		return _assessmentofImporterLocalService;
	}

	@Override
	public void setWrappedService(
		AssessmentofImporterLocalService assessmentofImporterLocalService) {
		_assessmentofImporterLocalService = assessmentofImporterLocalService;
	}

	private AssessmentofImporterLocalService _assessmentofImporterLocalService;
}