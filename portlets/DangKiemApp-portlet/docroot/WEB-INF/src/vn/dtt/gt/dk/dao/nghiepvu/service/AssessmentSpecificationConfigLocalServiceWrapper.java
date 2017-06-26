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
 * Provides a wrapper for {@link AssessmentSpecificationConfigLocalService}.
 *
 * @author win_64
 * @see AssessmentSpecificationConfigLocalService
 * @generated
 */
public class AssessmentSpecificationConfigLocalServiceWrapper
	implements AssessmentSpecificationConfigLocalService,
		ServiceWrapper<AssessmentSpecificationConfigLocalService> {
	public AssessmentSpecificationConfigLocalServiceWrapper(
		AssessmentSpecificationConfigLocalService assessmentSpecificationConfigLocalService) {
		_assessmentSpecificationConfigLocalService = assessmentSpecificationConfigLocalService;
	}

	/**
	* Adds the assessment specification config to the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentSpecificationConfig the assessment specification config
	* @return the assessment specification config that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig addAssessmentSpecificationConfig(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig assessmentSpecificationConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationConfigLocalService.addAssessmentSpecificationConfig(assessmentSpecificationConfig);
	}

	/**
	* Creates a new assessment specification config with the primary key. Does not add the assessment specification config to the database.
	*
	* @param id the primary key for the new assessment specification config
	* @return the new assessment specification config
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig createAssessmentSpecificationConfig(
		long id) {
		return _assessmentSpecificationConfigLocalService.createAssessmentSpecificationConfig(id);
	}

	/**
	* Deletes the assessment specification config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessment specification config
	* @return the assessment specification config that was removed
	* @throws PortalException if a assessment specification config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig deleteAssessmentSpecificationConfig(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationConfigLocalService.deleteAssessmentSpecificationConfig(id);
	}

	/**
	* Deletes the assessment specification config from the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentSpecificationConfig the assessment specification config
	* @return the assessment specification config that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig deleteAssessmentSpecificationConfig(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig assessmentSpecificationConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationConfigLocalService.deleteAssessmentSpecificationConfig(assessmentSpecificationConfig);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assessmentSpecificationConfigLocalService.dynamicQuery();
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
		return _assessmentSpecificationConfigLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assessmentSpecificationConfigLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assessmentSpecificationConfigLocalService.dynamicQuery(dynamicQuery,
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
		return _assessmentSpecificationConfigLocalService.dynamicQueryCount(dynamicQuery);
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
		return _assessmentSpecificationConfigLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig fetchAssessmentSpecificationConfig(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationConfigLocalService.fetchAssessmentSpecificationConfig(id);
	}

	/**
	* Returns the assessment specification config with the primary key.
	*
	* @param id the primary key of the assessment specification config
	* @return the assessment specification config
	* @throws PortalException if a assessment specification config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig getAssessmentSpecificationConfig(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationConfigLocalService.getAssessmentSpecificationConfig(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationConfigLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the assessment specification configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessment specification configs
	* @param end the upper bound of the range of assessment specification configs (not inclusive)
	* @return the range of assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> getAssessmentSpecificationConfigs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationConfigLocalService.getAssessmentSpecificationConfigs(start,
			end);
	}

	/**
	* Returns the number of assessment specification configs.
	*
	* @return the number of assessment specification configs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssessmentSpecificationConfigsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationConfigLocalService.getAssessmentSpecificationConfigsCount();
	}

	/**
	* Updates the assessment specification config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessmentSpecificationConfig the assessment specification config
	* @return the assessment specification config that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig updateAssessmentSpecificationConfig(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig assessmentSpecificationConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentSpecificationConfigLocalService.updateAssessmentSpecificationConfig(assessmentSpecificationConfig);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assessmentSpecificationConfigLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assessmentSpecificationConfigLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assessmentSpecificationConfigLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyear(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return _assessmentSpecificationConfigLocalService.findByAssessmentidAndAssessmentyear(specificationgroupcode,
			assessmentid, assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyearWithSpecificationcode(
		java.lang.String specificationgroupcode, java.lang.String assessmentid,
		java.lang.String assessmentyear, java.lang.String specificationcode) {
		return _assessmentSpecificationConfigLocalService.findByAssessmentidAndAssessmentyearWithSpecificationcode(specificationgroupcode,
			assessmentid, assessmentyear, specificationcode);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig> findAssessmentSpecificationConfigByKehoach(
		java.lang.String assessmentid, java.lang.String assessmentyear) {
		return _assessmentSpecificationConfigLocalService.findAssessmentSpecificationConfigByKehoach(assessmentid,
			assessmentyear);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssessmentSpecificationConfigLocalService getWrappedAssessmentSpecificationConfigLocalService() {
		return _assessmentSpecificationConfigLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssessmentSpecificationConfigLocalService(
		AssessmentSpecificationConfigLocalService assessmentSpecificationConfigLocalService) {
		_assessmentSpecificationConfigLocalService = assessmentSpecificationConfigLocalService;
	}

	@Override
	public AssessmentSpecificationConfigLocalService getWrappedService() {
		return _assessmentSpecificationConfigLocalService;
	}

	@Override
	public void setWrappedService(
		AssessmentSpecificationConfigLocalService assessmentSpecificationConfigLocalService) {
		_assessmentSpecificationConfigLocalService = assessmentSpecificationConfigLocalService;
	}

	private AssessmentSpecificationConfigLocalService _assessmentSpecificationConfigLocalService;
}