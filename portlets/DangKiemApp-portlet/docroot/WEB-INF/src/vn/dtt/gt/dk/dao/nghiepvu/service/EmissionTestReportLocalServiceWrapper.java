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
 * Provides a wrapper for {@link EmissionTestReportLocalService}.
 *
 * @author win_64
 * @see EmissionTestReportLocalService
 * @generated
 */
public class EmissionTestReportLocalServiceWrapper
	implements EmissionTestReportLocalService,
		ServiceWrapper<EmissionTestReportLocalService> {
	public EmissionTestReportLocalServiceWrapper(
		EmissionTestReportLocalService emissionTestReportLocalService) {
		_emissionTestReportLocalService = emissionTestReportLocalService;
	}

	/**
	* Adds the emission test report to the database. Also notifies the appropriate model listeners.
	*
	* @param emissionTestReport the emission test report
	* @return the emission test report that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport addEmissionTestReport(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport emissionTestReport)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestReportLocalService.addEmissionTestReport(emissionTestReport);
	}

	/**
	* Creates a new emission test report with the primary key. Does not add the emission test report to the database.
	*
	* @param id the primary key for the new emission test report
	* @return the new emission test report
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport createEmissionTestReport(
		long id) {
		return _emissionTestReportLocalService.createEmissionTestReport(id);
	}

	/**
	* Deletes the emission test report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the emission test report
	* @return the emission test report that was removed
	* @throws PortalException if a emission test report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport deleteEmissionTestReport(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestReportLocalService.deleteEmissionTestReport(id);
	}

	/**
	* Deletes the emission test report from the database. Also notifies the appropriate model listeners.
	*
	* @param emissionTestReport the emission test report
	* @return the emission test report that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport deleteEmissionTestReport(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport emissionTestReport)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestReportLocalService.deleteEmissionTestReport(emissionTestReport);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _emissionTestReportLocalService.dynamicQuery();
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
		return _emissionTestReportLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _emissionTestReportLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _emissionTestReportLocalService.dynamicQuery(dynamicQuery,
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
		return _emissionTestReportLocalService.dynamicQueryCount(dynamicQuery);
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
		return _emissionTestReportLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport fetchEmissionTestReport(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestReportLocalService.fetchEmissionTestReport(id);
	}

	/**
	* Returns the emission test report with the primary key.
	*
	* @param id the primary key of the emission test report
	* @return the emission test report
	* @throws PortalException if a emission test report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport getEmissionTestReport(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestReportLocalService.getEmissionTestReport(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestReportLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the emission test reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emission test reports
	* @param end the upper bound of the range of emission test reports (not inclusive)
	* @return the range of emission test reports
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport> getEmissionTestReports(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestReportLocalService.getEmissionTestReports(start, end);
	}

	/**
	* Returns the number of emission test reports.
	*
	* @return the number of emission test reports
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmissionTestReportsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestReportLocalService.getEmissionTestReportsCount();
	}

	/**
	* Updates the emission test report in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param emissionTestReport the emission test report
	* @return the emission test report that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport updateEmissionTestReport(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport emissionTestReport)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestReportLocalService.updateEmissionTestReport(emissionTestReport);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _emissionTestReportLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_emissionTestReportLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _emissionTestReportLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport findByEmissiontestRequirementId(
		long emissiontestRequirementId) {
		return _emissionTestReportLocalService.findByEmissiontestRequirementId(emissiontestRequirementId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmissionTestReportLocalService getWrappedEmissionTestReportLocalService() {
		return _emissionTestReportLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmissionTestReportLocalService(
		EmissionTestReportLocalService emissionTestReportLocalService) {
		_emissionTestReportLocalService = emissionTestReportLocalService;
	}

	@Override
	public EmissionTestReportLocalService getWrappedService() {
		return _emissionTestReportLocalService;
	}

	@Override
	public void setWrappedService(
		EmissionTestReportLocalService emissionTestReportLocalService) {
		_emissionTestReportLocalService = emissionTestReportLocalService;
	}

	private EmissionTestReportLocalService _emissionTestReportLocalService;
}