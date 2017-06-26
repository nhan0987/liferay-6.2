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
 * Provides a wrapper for {@link AssessmentPeriodLocalService}.
 *
 * @author win_64
 * @see AssessmentPeriodLocalService
 * @generated
 */
public class AssessmentPeriodLocalServiceWrapper
	implements AssessmentPeriodLocalService,
		ServiceWrapper<AssessmentPeriodLocalService> {
	public AssessmentPeriodLocalServiceWrapper(
		AssessmentPeriodLocalService assessmentPeriodLocalService) {
		_assessmentPeriodLocalService = assessmentPeriodLocalService;
	}

	/**
	* Adds the assessment period to the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentPeriod the assessment period
	* @return the assessment period that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod addAssessmentPeriod(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod assessmentPeriod)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentPeriodLocalService.addAssessmentPeriod(assessmentPeriod);
	}

	/**
	* Creates a new assessment period with the primary key. Does not add the assessment period to the database.
	*
	* @param id the primary key for the new assessment period
	* @return the new assessment period
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod createAssessmentPeriod(
		long id) {
		return _assessmentPeriodLocalService.createAssessmentPeriod(id);
	}

	/**
	* Deletes the assessment period with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessment period
	* @return the assessment period that was removed
	* @throws PortalException if a assessment period with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod deleteAssessmentPeriod(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentPeriodLocalService.deleteAssessmentPeriod(id);
	}

	/**
	* Deletes the assessment period from the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentPeriod the assessment period
	* @return the assessment period that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod deleteAssessmentPeriod(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod assessmentPeriod)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentPeriodLocalService.deleteAssessmentPeriod(assessmentPeriod);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assessmentPeriodLocalService.dynamicQuery();
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
		return _assessmentPeriodLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assessmentPeriodLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assessmentPeriodLocalService.dynamicQuery(dynamicQuery, start,
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
		return _assessmentPeriodLocalService.dynamicQueryCount(dynamicQuery);
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
		return _assessmentPeriodLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod fetchAssessmentPeriod(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentPeriodLocalService.fetchAssessmentPeriod(id);
	}

	/**
	* Returns the assessment period with the primary key.
	*
	* @param id the primary key of the assessment period
	* @return the assessment period
	* @throws PortalException if a assessment period with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod getAssessmentPeriod(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentPeriodLocalService.getAssessmentPeriod(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessmentPeriodLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the assessment periods.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentPeriodModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessment periods
	* @param end the upper bound of the range of assessment periods (not inclusive)
	* @return the range of assessment periods
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> getAssessmentPeriods(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentPeriodLocalService.getAssessmentPeriods(start, end);
	}

	/**
	* Returns the number of assessment periods.
	*
	* @return the number of assessment periods
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssessmentPeriodsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentPeriodLocalService.getAssessmentPeriodsCount();
	}

	/**
	* Updates the assessment period in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessmentPeriod the assessment period
	* @return the assessment period that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod updateAssessmentPeriod(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod assessmentPeriod)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessmentPeriodLocalService.updateAssessmentPeriod(assessmentPeriod);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assessmentPeriodLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assessmentPeriodLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assessmentPeriodLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyear(
		java.lang.String assessmentid, java.lang.String assessmentyear) {
		return _assessmentPeriodLocalService.findByAssessmentidAndAssessmentyear(assessmentid,
			assessmentyear);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithimporterchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int importerchecked) {
		return _assessmentPeriodLocalService.findByAssessmentidAndAssessmentyearWithimporterchecked(assessmentid,
			assessmentyear, importerchecked);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithinspectorchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int inspectorchecked) {
		return _assessmentPeriodLocalService.findByAssessmentidAndAssessmentyearWithinspectorchecked(assessmentid,
			assessmentyear, inspectorchecked);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByAssessmentidAndAssessmentyearWithproductionchecked(
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int productionchecked) {
		return _assessmentPeriodLocalService.findByAssessmentidAndAssessmentyearWithproductionchecked(assessmentid,
			assessmentyear, productionchecked);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findByPreviousAssessmentidAndAssessmentyear(
		java.lang.String previousassessmentid,
		java.lang.String previousassessmentyear) {
		return _assessmentPeriodLocalService.findByPreviousAssessmentidAndAssessmentyear(previousassessmentid,
			previousassessmentyear);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod getLatestAssessmentPeriod() {
		return _assessmentPeriodLocalService.getLatestAssessmentPeriod();
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod> findDanhSachKehoachdanhgiaruiro(
		java.lang.String assessmentyear, java.lang.String evaluationperiod,
		int start, int end) {
		return _assessmentPeriodLocalService.findDanhSachKehoachdanhgiaruiro(assessmentyear,
			evaluationperiod, start, end);
	}

	@Override
	public int countDanhSachKehoachdanhgiaruiro(
		java.lang.String assessmentyear, java.lang.String evaluationperiod) {
		return _assessmentPeriodLocalService.countDanhSachKehoachdanhgiaruiro(assessmentyear,
			evaluationperiod);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssessmentPeriodLocalService getWrappedAssessmentPeriodLocalService() {
		return _assessmentPeriodLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssessmentPeriodLocalService(
		AssessmentPeriodLocalService assessmentPeriodLocalService) {
		_assessmentPeriodLocalService = assessmentPeriodLocalService;
	}

	@Override
	public AssessmentPeriodLocalService getWrappedService() {
		return _assessmentPeriodLocalService;
	}

	@Override
	public void setWrappedService(
		AssessmentPeriodLocalService assessmentPeriodLocalService) {
		_assessmentPeriodLocalService = assessmentPeriodLocalService;
	}

	private AssessmentPeriodLocalService _assessmentPeriodLocalService;
}