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

import vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport;

import java.util.List;

/**
 * The persistence utility for the control report service. This utility wraps {@link ControlReportPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see ControlReportPersistence
 * @see ControlReportPersistenceImpl
 * @generated
 */
public class ControlReportUtil {
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
	public static void clearCache(ControlReport controlReport) {
		getPersistence().clearCache(controlReport);
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
	public static List<ControlReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ControlReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ControlReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ControlReport update(ControlReport controlReport)
		throws SystemException {
		return getPersistence().update(controlReport);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ControlReport update(ControlReport controlReport,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(controlReport, serviceContext);
	}

	/**
	* Returns the control report where inspectionrecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException} if it could not be found.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @return the matching control report
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException if a matching control report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport findByInspectionrecordId(
		long inspectionrecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException {
		return getPersistence().findByInspectionrecordId(inspectionrecordId);
	}

	/**
	* Returns the control report where inspectionrecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @return the matching control report, or <code>null</code> if a matching control report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport fetchByInspectionrecordId(
		long inspectionrecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByInspectionrecordId(inspectionrecordId);
	}

	/**
	* Returns the control report where inspectionrecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching control report, or <code>null</code> if a matching control report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport fetchByInspectionrecordId(
		long inspectionrecordId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectionrecordId(inspectionrecordId,
			retrieveFromCache);
	}

	/**
	* Removes the control report where inspectionrecordId = &#63; from the database.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @return the control report that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport removeByInspectionrecordId(
		long inspectionrecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException {
		return getPersistence().removeByInspectionrecordId(inspectionrecordId);
	}

	/**
	* Returns the number of control reports where inspectionrecordId = &#63;.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @return the number of matching control reports
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectionrecordId(long inspectionrecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByInspectionrecordId(inspectionrecordId);
	}

	/**
	* Caches the control report in the entity cache if it is enabled.
	*
	* @param controlReport the control report
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport controlReport) {
		getPersistence().cacheResult(controlReport);
	}

	/**
	* Caches the control reports in the entity cache if it is enabled.
	*
	* @param controlReports the control reports
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport> controlReports) {
		getPersistence().cacheResult(controlReports);
	}

	/**
	* Creates a new control report with the primary key. Does not add the control report to the database.
	*
	* @param id the primary key for the new control report
	* @return the new control report
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the control report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the control report
	* @return the control report that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException if a control report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport controlReport)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(controlReport);
	}

	/**
	* Returns the control report with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException} if it could not be found.
	*
	* @param id the primary key of the control report
	* @return the control report
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException if a control report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the control report with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the control report
	* @return the control report, or <code>null</code> if a control report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the control reports.
	*
	* @return the control reports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the control reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of control reports
	* @param end the upper bound of the range of control reports (not inclusive)
	* @return the range of control reports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the control reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of control reports
	* @param end the upper bound of the range of control reports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of control reports
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the control reports from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of control reports.
	*
	* @return the number of control reports
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ControlReportPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ControlReportPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					ControlReportPersistence.class.getName());

			ReferenceRegistry.registerReference(ControlReportUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ControlReportPersistence persistence) {
	}

	private static ControlReportPersistence _persistence;
}