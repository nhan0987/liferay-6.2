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

import vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport;

import java.util.List;

/**
 * The persistence utility for the safety test report service. This utility wraps {@link SafetyTestReportPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see SafetyTestReportPersistence
 * @see SafetyTestReportPersistenceImpl
 * @generated
 */
public class SafetyTestReportUtil {
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
	public static void clearCache(SafetyTestReport safetyTestReport) {
		getPersistence().clearCache(safetyTestReport);
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
	public static List<SafetyTestReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SafetyTestReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SafetyTestReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static SafetyTestReport update(SafetyTestReport safetyTestReport)
		throws SystemException {
		return getPersistence().update(safetyTestReport);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static SafetyTestReport update(SafetyTestReport safetyTestReport,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(safetyTestReport, serviceContext);
	}

	/**
	* Returns the safety test report where safetestRequirementId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException} if it could not be found.
	*
	* @param safetestRequirementId the safetest requirement ID
	* @return the matching safety test report
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException if a matching safety test report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport findBySafetestRequirementId(
		long safetestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException {
		return getPersistence()
				   .findBySafetestRequirementId(safetestRequirementId);
	}

	/**
	* Returns the safety test report where safetestRequirementId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param safetestRequirementId the safetest requirement ID
	* @return the matching safety test report, or <code>null</code> if a matching safety test report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport fetchBySafetestRequirementId(
		long safetestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySafetestRequirementId(safetestRequirementId);
	}

	/**
	* Returns the safety test report where safetestRequirementId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param safetestRequirementId the safetest requirement ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching safety test report, or <code>null</code> if a matching safety test report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport fetchBySafetestRequirementId(
		long safetestRequirementId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySafetestRequirementId(safetestRequirementId,
			retrieveFromCache);
	}

	/**
	* Removes the safety test report where safetestRequirementId = &#63; from the database.
	*
	* @param safetestRequirementId the safetest requirement ID
	* @return the safety test report that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport removeBySafetestRequirementId(
		long safetestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException {
		return getPersistence()
				   .removeBySafetestRequirementId(safetestRequirementId);
	}

	/**
	* Returns the number of safety test reports where safetestRequirementId = &#63;.
	*
	* @param safetestRequirementId the safetest requirement ID
	* @return the number of matching safety test reports
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySafetestRequirementId(long safetestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBySafetestRequirementId(safetestRequirementId);
	}

	/**
	* Caches the safety test report in the entity cache if it is enabled.
	*
	* @param safetyTestReport the safety test report
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport safetyTestReport) {
		getPersistence().cacheResult(safetyTestReport);
	}

	/**
	* Caches the safety test reports in the entity cache if it is enabled.
	*
	* @param safetyTestReports the safety test reports
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport> safetyTestReports) {
		getPersistence().cacheResult(safetyTestReports);
	}

	/**
	* Creates a new safety test report with the primary key. Does not add the safety test report to the database.
	*
	* @param id the primary key for the new safety test report
	* @return the new safety test report
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the safety test report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the safety test report
	* @return the safety test report that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException if a safety test report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport safetyTestReport)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(safetyTestReport);
	}

	/**
	* Returns the safety test report with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException} if it could not be found.
	*
	* @param id the primary key of the safety test report
	* @return the safety test report
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException if a safety test report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchSafetyTestReportException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the safety test report with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the safety test report
	* @return the safety test report, or <code>null</code> if a safety test report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the safety test reports.
	*
	* @return the safety test reports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the safety test reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of safety test reports
	* @param end the upper bound of the range of safety test reports (not inclusive)
	* @return the range of safety test reports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the safety test reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetyTestReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of safety test reports
	* @param end the upper bound of the range of safety test reports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of safety test reports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SafetyTestReport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the safety test reports from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of safety test reports.
	*
	* @return the number of safety test reports
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SafetyTestReportPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SafetyTestReportPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					SafetyTestReportPersistence.class.getName());

			ReferenceRegistry.registerReference(SafetyTestReportUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SafetyTestReportPersistence persistence) {
	}

	private static SafetyTestReportPersistence _persistence;
}