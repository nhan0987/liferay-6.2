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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport;

/**
 * The persistence interface for the control report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ControlReportPersistenceImpl
 * @see ControlReportUtil
 * @generated
 */
public interface ControlReportPersistence extends BasePersistence<ControlReport> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ControlReportUtil} to access the control report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the control report where inspectionrecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException} if it could not be found.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @return the matching control report
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException if a matching control report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport findByInspectionrecordId(
		long inspectionrecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException;

	/**
	* Returns the control report where inspectionrecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @return the matching control report, or <code>null</code> if a matching control report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport fetchByInspectionrecordId(
		long inspectionrecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the control report where inspectionrecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching control report, or <code>null</code> if a matching control report could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport fetchByInspectionrecordId(
		long inspectionrecordId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the control report where inspectionrecordId = &#63; from the database.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @return the control report that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport removeByInspectionrecordId(
		long inspectionrecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException;

	/**
	* Returns the number of control reports where inspectionrecordId = &#63;.
	*
	* @param inspectionrecordId the inspectionrecord ID
	* @return the number of matching control reports
	* @throws SystemException if a system exception occurred
	*/
	public int countByInspectionrecordId(long inspectionrecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the control report in the entity cache if it is enabled.
	*
	* @param controlReport the control report
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport controlReport);

	/**
	* Caches the control reports in the entity cache if it is enabled.
	*
	* @param controlReports the control reports
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport> controlReports);

	/**
	* Creates a new control report with the primary key. Does not add the control report to the database.
	*
	* @param id the primary key for the new control report
	* @return the new control report
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport create(long id);

	/**
	* Removes the control report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the control report
	* @return the control report that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException if a control report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport controlReport)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the control report with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException} if it could not be found.
	*
	* @param id the primary key of the control report
	* @return the control report
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException if a control report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchControlReportException;

	/**
	* Returns the control report with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the control report
	* @return the control report, or <code>null</code> if a control report with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the control reports.
	*
	* @return the control reports
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlReport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the control reports from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of control reports.
	*
	* @return the number of control reports
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}