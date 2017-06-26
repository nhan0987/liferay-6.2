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

package vn.dtt.gt.dk.dao.nghiepvu.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport;

import java.util.List;

/**
 * The persistence utility for the emission test report service. This utility wraps {@link EmissionTestReportPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see EmissionTestReportPersistence
 * @see EmissionTestReportPersistenceImpl
 * @generated
 */
public class EmissionTestReportUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(EmissionTestReport emissionTestReport) {
		getPersistence().clearCache(emissionTestReport);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EmissionTestReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmissionTestReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmissionTestReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static EmissionTestReport update(
		EmissionTestReport emissionTestReport) throws SystemException {
		return getPersistence().update(emissionTestReport);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static EmissionTestReport update(
		EmissionTestReport emissionTestReport, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(emissionTestReport, serviceContext);
	}

	/**
	* Returns the emission test report where emissiontestRequirementId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException} if it could not be found.
	*
	* @param emissiontestRequirementId the emissiontest requirement ID
	* @return the matching emission test report
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException if a matching emission test report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport findByEmissiontestRequirementId(
		long emissiontestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException {
		return getPersistence()
				   .findByEmissiontestRequirementId(emissiontestRequirementId);
	}

	/**
	* Returns the emission test report where emissiontestRequirementId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param emissiontestRequirementId the emissiontest requirement ID
	* @return the matching emission test report, or <code>null</code> if a matching emission test report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport fetchByEmissiontestRequirementId(
		long emissiontestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmissiontestRequirementId(emissiontestRequirementId);
	}

	/**
	* Returns the emission test report where emissiontestRequirementId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param emissiontestRequirementId the emissiontest requirement ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching emission test report, or <code>null</code> if a matching emission test report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport fetchByEmissiontestRequirementId(
		long emissiontestRequirementId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmissiontestRequirementId(emissiontestRequirementId,
			retrieveFromCache);
	}

	/**
	* Removes the emission test report where emissiontestRequirementId = &#63; from the database.
	*
	* @param emissiontestRequirementId the emissiontest requirement ID
	* @return the emission test report that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport removeByEmissiontestRequirementId(
		long emissiontestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException {
		return getPersistence()
				   .removeByEmissiontestRequirementId(emissiontestRequirementId);
	}

	/**
	* Returns the number of emission test reports where emissiontestRequirementId = &#63;.
	*
	* @param emissiontestRequirementId the emissiontest requirement ID
	* @return the number of matching emission test reports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEmissiontestRequirementId(
		long emissiontestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByEmissiontestRequirementId(emissiontestRequirementId);
	}

	/**
	* Caches the emission test report in the entity cache if it is enabled.
	*
	* @param emissionTestReport the emission test report
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport emissionTestReport) {
		getPersistence().cacheResult(emissionTestReport);
	}

	/**
	* Caches the emission test reports in the entity cache if it is enabled.
	*
	* @param emissionTestReports the emission test reports
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport> emissionTestReports) {
		getPersistence().cacheResult(emissionTestReports);
	}

	/**
	* Creates a new emission test report with the primary key. Does not add the emission test report to the database.
	*
	* @param id the primary key for the new emission test report
	* @return the new emission test report
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the emission test report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the emission test report
	* @return the emission test report that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException if a emission test report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport emissionTestReport)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(emissionTestReport);
	}

	/**
	* Returns the emission test report with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException} if it could not be found.
	*
	* @param id the primary key of the emission test report
	* @return the emission test report
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException if a emission test report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchEmissionTestReportException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the emission test report with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the emission test report
	* @return the emission test report, or <code>null</code> if a emission test report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the emission test reports.
	*
	* @return the emission test reports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the emission test reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emission test reports
	* @param end the upper bound of the range of emission test reports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of emission test reports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestReport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the emission test reports from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of emission test reports.
	*
	* @return the number of emission test reports
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EmissionTestReportPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmissionTestReportPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					EmissionTestReportPersistence.class.getName());

			ReferenceRegistry.registerReference(EmissionTestReportUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(EmissionTestReportPersistence persistence) {
	}

	private static EmissionTestReportPersistence _persistence;
}