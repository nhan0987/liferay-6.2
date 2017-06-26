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
 * Provides a wrapper for {@link AssessmentSpecificationLocalService}.
 *
 * @author win_64
 * @see AssessmentSpecificationLocalService
 * @generated
 */
public class AssessmentSpecificationLocalServiceWrapper
	implements AssessmentSpecificationLocalService,
		ServiceWrapper<AssessmentSpecificationLocalService> {
	public AssessmentSpecificationLocalServiceWrapper(
		AssessmentSpecificationLocalService assessmentSpecificationLocalService) {
		_assessmentSpecificationLocalService = assessmentSpecificationLocalService;
	}

	/**
	* Adds the assessment specification to the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentSpecification the assessment specification
	* @return the assessment specification that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification addAssessmentSpecification(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification assessmentSpecification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationLocalService.addAssessmentSpecification(assessmentSpecification);
	}

	/**
	* Creates a new assessment specification with the primary key. Does not add the assessment specification to the database.
	*
	* @param id the primary key for the new assessment specification
	* @return the new assessment specification
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification createAssessmentSpecification(
		long id) {
		return _assessmentSpecificationLocalService.createAssessmentSpecification(id);
	}

	/**
	* Deletes the assessment specification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessment specification
	* @return the assessment specification that was removed
	* @throws PortalException if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification deleteAssessmentSpecification(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationLocalService.deleteAssessmentSpecification(id);
	}

	/**
	* Deletes the assessment specification from the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentSpecification the assessment specification
	* @return the assessment specification that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification deleteAssessmentSpecification(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification assessmentSpecification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationLocalService.deleteAssessmentSpecification(assessmentSpecification);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assessmentSpecificationLocalService.dynamicQuery();
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
		return _assessmentSpecificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assessmentSpecificationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assessmentSpecificationLocalService.dynamicQuery(dynamicQuery,
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
		return _assessmentSpecificationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _assessmentSpecificationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification fetchAssessmentSpecification(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationLocalService.fetchAssessmentSpecification(id);
	}

	/**
	* Returns the assessment specification with the primary key.
	*
	* @param id the primary key of the assessment specification
	* @return the assessment specification
	* @throws PortalException if a assessment specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification getAssessmentSpecification(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationLocalService.getAssessmentSpecification(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the assessment specifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessment specifications
	* @param end the upper bound of the range of assessment specifications (not inclusive)
	* @return the range of assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> getAssessmentSpecifications(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationLocalService.getAssessmentSpecifications(start,
			end);
	}

	/**
	* Returns the number of assessment specifications.
	*
	* @return the number of assessment specifications
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssessmentSpecificationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationLocalService.getAssessmentSpecificationsCount();
	}

	/**
	* Updates the assessment specification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessmentSpecification the assessment specification
	* @return the assessment specification that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification updateAssessmentSpecification(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification assessmentSpecification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationLocalService.updateAssessmentSpecification(assessmentSpecification);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assessmentSpecificationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assessmentSpecificationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assessmentSpecificationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String assessmentid, java.lang.String assessmentyear) {
		return _assessmentSpecificationLocalService.findByImporterCode(specificationgroupcode,
			importercode, assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentSpecificationLocalService.findByInspectorContactcode(specificationgroupcode,
			inspectorcontactcode, assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentSpecificationLocalService.findByProductionCode(specificationgroupcode,
			productioncode, assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByImporterCodeAndSpecificationCode(
		java.lang.String specificationgroupcode, java.lang.String importercode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentSpecificationLocalService.findByImporterCodeAndSpecificationCode(specificationgroupcode,
			importercode, specificationcode, assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByInspectorContactcodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String inspectorcontactcode,
		java.lang.String specificationcode, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentSpecificationLocalService.findByInspectorContactcodeAndSpecificationCode(specificationgroupcode,
			inspectorcontactcode, specificationcode, assessmentid,
			assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification> findByProductionCodeAndSpecificationCode(
		java.lang.String specificationgroupcode,
		java.lang.String productioncode, java.lang.String specificationcode,
		java.lang.String assessmentid, java.lang.String assessmentyear) {
		return _assessmentSpecificationLocalService.findByProductionCodeAndSpecificationCode(specificationgroupcode,
			productioncode, specificationcode, assessmentid, assessmentyear);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssessmentSpecificationLocalService getWrappedAssessmentSpecificationLocalService() {
		return _assessmentSpecificationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssessmentSpecificationLocalService(
		AssessmentSpecificationLocalService assessmentSpecificationLocalService) {
		_assessmentSpecificationLocalService = assessmentSpecificationLocalService;
	}

	@Override
	public AssessmentSpecificationLocalService getWrappedService() {
		return _assessmentSpecificationLocalService;
	}

	@Override
	public void setWrappedService(
		AssessmentSpecificationLocalService assessmentSpecificationLocalService) {
		_assessmentSpecificationLocalService = assessmentSpecificationLocalService;
	}

	private AssessmentSpecificationLocalService _assessmentSpecificationLocalService;
}