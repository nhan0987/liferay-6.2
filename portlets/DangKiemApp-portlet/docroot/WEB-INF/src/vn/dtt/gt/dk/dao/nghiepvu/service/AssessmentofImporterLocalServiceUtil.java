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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for AssessmentofImporter. This utility wraps
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.AssessmentofImporterLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see AssessmentofImporterLocalService
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentofImporterLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.AssessmentofImporterLocalServiceImpl
 * @generated
 */
public class AssessmentofImporterLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.AssessmentofImporterLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the assessmentof importer to the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentofImporter the assessmentof importer
	* @return the assessmentof importer that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter addAssessmentofImporter(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter assessmentofImporter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAssessmentofImporter(assessmentofImporter);
	}

	/**
	* Creates a new assessmentof importer with the primary key. Does not add the assessmentof importer to the database.
	*
	* @param id the primary key for the new assessmentof importer
	* @return the new assessmentof importer
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter createAssessmentofImporter(
		long id) {
		return getService().createAssessmentofImporter(id);
	}

	/**
	* Deletes the assessmentof importer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessmentof importer
	* @return the assessmentof importer that was removed
	* @throws PortalException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter deleteAssessmentofImporter(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAssessmentofImporter(id);
	}

	/**
	* Deletes the assessmentof importer from the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentofImporter the assessmentof importer
	* @return the assessmentof importer that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter deleteAssessmentofImporter(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter assessmentofImporter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAssessmentofImporter(assessmentofImporter);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter fetchAssessmentofImporter(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAssessmentofImporter(id);
	}

	/**
	* Returns the assessmentof importer with the primary key.
	*
	* @param id the primary key of the assessmentof importer
	* @return the assessmentof importer
	* @throws PortalException if a assessmentof importer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter getAssessmentofImporter(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssessmentofImporter(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> getAssessmentofImporters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssessmentofImporters(start, end);
	}

	/**
	* Returns the number of assessmentof importers.
	*
	* @return the number of assessmentof importers
	* @throws SystemException if a system exception occurred
	*/
	public static int getAssessmentofImportersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssessmentofImportersCount();
	}

	/**
	* Updates the assessmentof importer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessmentofImporter the assessmentof importer
	* @return the assessmentof importer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter updateAssessmentofImporter(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter assessmentofImporter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAssessmentofImporter(assessmentofImporter);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCode(
		java.lang.String importercode, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return getService()
				   .findByImporterCode(importercode, assessmentid,
			assessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterCodeReference(
		java.lang.String importercodereference, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return getService()
				   .findByImporterCodeReference(importercodereference,
			assessmentid, assessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByImporterName(
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return getService()
				   .findByImporterName(importername, assessmentid,
			assessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCode(
		java.lang.String importercode, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear) {
		return getService()
				   .findByNextPeriodByImporterCode(importercode,
			nextassessmentid, nextassessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterCodeReference(
		java.lang.String importercodereference,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear) {
		return getService()
				   .findByNextPeriodByImporterCodeReference(importercodereference,
			nextassessmentid, nextassessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByNextPeriodByImporterName(
		java.lang.String importername, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear) {
		return getService()
				   .findByNextPeriodByImporterName(importername,
			nextassessmentid, nextassessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findDanhSachDanhGiaDoanhNghiep(
		java.lang.String importercode, java.lang.String importername,
		int start, int end) {
		return getService()
				   .findDanhSachDanhGiaDoanhNghiep(importercode, importername,
			start, end);
	}

	public static int countDanhSachDanhGiaDoanhNghiep(
		java.lang.String importercode, java.lang.String importername) {
		return getService()
				   .countDanhSachDanhGiaDoanhNghiep(importercode, importername);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofImporter> findByIC_IN_AI_AY(
		java.lang.String importercode, java.lang.String importername,
		java.lang.String assessmentid, java.lang.String assessmentyear,
		int start, int end) {
		return getService()
				   .findByIC_IN_AI_AY(importercode, importername, assessmentid,
			assessmentyear, start, end);
	}

	public static int countByIC_IN_AI_AY(java.lang.String importercode,
		java.lang.String importername, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return getService()
				   .countByIC_IN_AI_AY(importercode, importername,
			assessmentid, assessmentyear);
	}

	public static void clearService() {
		_service = null;
	}

	public static AssessmentofImporterLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AssessmentofImporterLocalService.class.getName());

			if (invokableLocalService instanceof AssessmentofImporterLocalService) {
				_service = (AssessmentofImporterLocalService)invokableLocalService;
			}
			else {
				_service = new AssessmentofImporterLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AssessmentofImporterLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(AssessmentofImporterLocalService service) {
	}

	private static AssessmentofImporterLocalService _service;
}