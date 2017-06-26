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
 * Provides the local service utility for AssessmentofInspector. This utility wraps
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.AssessmentofInspectorLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see AssessmentofInspectorLocalService
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.AssessmentofInspectorLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.AssessmentofInspectorLocalServiceImpl
 * @generated
 */
public class AssessmentofInspectorLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.AssessmentofInspectorLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the assessmentof inspector to the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentofInspector the assessmentof inspector
	* @return the assessmentof inspector that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector addAssessmentofInspector(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector assessmentofInspector)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAssessmentofInspector(assessmentofInspector);
	}

	/**
	* Creates a new assessmentof inspector with the primary key. Does not add the assessmentof inspector to the database.
	*
	* @param id the primary key for the new assessmentof inspector
	* @return the new assessmentof inspector
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector createAssessmentofInspector(
		long id) {
		return getService().createAssessmentofInspector(id);
	}

	/**
	* Deletes the assessmentof inspector with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the assessmentof inspector
	* @return the assessmentof inspector that was removed
	* @throws PortalException if a assessmentof inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector deleteAssessmentofInspector(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAssessmentofInspector(id);
	}

	/**
	* Deletes the assessmentof inspector from the database. Also notifies the appropriate model listeners.
	*
	* @param assessmentofInspector the assessmentof inspector
	* @return the assessmentof inspector that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector deleteAssessmentofInspector(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector assessmentofInspector)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAssessmentofInspector(assessmentofInspector);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector fetchAssessmentofInspector(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAssessmentofInspector(id);
	}

	/**
	* Returns the assessmentof inspector with the primary key.
	*
	* @param id the primary key of the assessmentof inspector
	* @return the assessmentof inspector
	* @throws PortalException if a assessmentof inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector getAssessmentofInspector(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssessmentofInspector(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the assessmentof inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentofInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assessmentof inspectors
	* @param end the upper bound of the range of assessmentof inspectors (not inclusive)
	* @return the range of assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> getAssessmentofInspectors(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssessmentofInspectors(start, end);
	}

	/**
	* Returns the number of assessmentof inspectors.
	*
	* @return the number of assessmentof inspectors
	* @throws SystemException if a system exception occurred
	*/
	public static int getAssessmentofInspectorsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssessmentofInspectorsCount();
	}

	/**
	* Updates the assessmentof inspector in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assessmentofInspector the assessmentof inspector
	* @return the assessmentof inspector that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector updateAssessmentofInspector(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector assessmentofInspector)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAssessmentofInspector(assessmentofInspector);
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

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByInspectorContactCode(
		java.lang.String inspectorcontactcode, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return getService()
				   .findByInspectorContactCode(inspectorcontactcode,
			assessmentid, assessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByInspectorName(
		java.lang.String inspectorname, java.lang.String assessmentid,
		java.lang.String assessmentyear) {
		return getService()
				   .findByInspectorName(inspectorname, assessmentid,
			assessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByNextPeriodByInspectorContactCode(
		java.lang.String inspectorcontactcode,
		java.lang.String nextassessmentid, java.lang.String nextassessmentyear) {
		return getService()
				   .findByNextPeriodByInspectorContactCode(inspectorcontactcode,
			nextassessmentid, nextassessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findByNextPeriodByInspectorName(
		java.lang.String inspectorname, java.lang.String nextassessmentid,
		java.lang.String nextassessmentyear) {
		return getService()
				   .findByNextPeriodByInspectorName(inspectorname,
			nextassessmentid, nextassessmentyear);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspector> findDanhSachDanhGiaDangKiemVien(
		java.lang.String inspectorcontactcode, java.lang.String inspectorname,
		int start, int end) {
		return getService()
				   .findDanhSachDanhGiaDangKiemVien(inspectorcontactcode,
			inspectorname, start, end);
	}

	public static int countDanhSachDanhGiaDangKiemVien(
		java.lang.String inspectorcontactcode, java.lang.String inspectorname) {
		return getService()
				   .countDanhSachDanhGiaDangKiemVien(inspectorcontactcode,
			inspectorname);
	}

	public static void clearService() {
		_service = null;
	}

	public static AssessmentofInspectorLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AssessmentofInspectorLocalService.class.getName());

			if (invokableLocalService instanceof AssessmentofInspectorLocalService) {
				_service = (AssessmentofInspectorLocalService)invokableLocalService;
			}
			else {
				_service = new AssessmentofInspectorLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AssessmentofInspectorLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(AssessmentofInspectorLocalService service) {
	}

	private static AssessmentofInspectorLocalService _service;
}