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
 * Provides the local service utility for ControlRequirement. This utility wraps
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.ControlRequirementLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see ControlRequirementLocalService
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.ControlRequirementLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.ControlRequirementLocalServiceImpl
 * @generated
 */
public class ControlRequirementLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.ControlRequirementLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the control requirement to the database. Also notifies the appropriate model listeners.
	*
	* @param controlRequirement the control requirement
	* @return the control requirement that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement addControlRequirement(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement controlRequirement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addControlRequirement(controlRequirement);
	}

	/**
	* Creates a new control requirement with the primary key. Does not add the control requirement to the database.
	*
	* @param id the primary key for the new control requirement
	* @return the new control requirement
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement createControlRequirement(
		long id) {
		return getService().createControlRequirement(id);
	}

	/**
	* Deletes the control requirement with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the control requirement
	* @return the control requirement that was removed
	* @throws PortalException if a control requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement deleteControlRequirement(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteControlRequirement(id);
	}

	/**
	* Deletes the control requirement from the database. Also notifies the appropriate model listeners.
	*
	* @param controlRequirement the control requirement
	* @return the control requirement that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement deleteControlRequirement(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement controlRequirement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteControlRequirement(controlRequirement);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement fetchControlRequirement(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchControlRequirement(id);
	}

	/**
	* Returns the control requirement with the primary key.
	*
	* @param id the primary key of the control requirement
	* @return the control requirement
	* @throws PortalException if a control requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement getControlRequirement(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getControlRequirement(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the control requirements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of control requirements
	* @param end the upper bound of the range of control requirements (not inclusive)
	* @return the range of control requirements
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> getControlRequirements(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getControlRequirements(start, end);
	}

	/**
	* Returns the number of control requirements.
	*
	* @return the number of control requirements
	* @throws SystemException if a system exception occurred
	*/
	public static int getControlRequirementsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getControlRequirementsCount();
	}

	/**
	* Updates the control requirement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param controlRequirement the control requirement
	* @return the control requirement that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement updateControlRequirement(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement controlRequirement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateControlRequirement(controlRequirement);
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

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> findByRegisteredInspectionId(
		long registeredInspectionId) {
		return getService().findByRegisteredInspectionId(registeredInspectionId);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement findByInspectionrecordId(
		long inspectionrecordId) {
		return getService().findByInspectionrecordId(inspectionrecordId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> findByPhieuxulyphuId(
		long phieuxulyphuId) {
		return getService().findByPhieuxulyphuId(phieuxulyphuId);
	}

	public static void clearService() {
		_service = null;
	}

	public static ControlRequirementLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ControlRequirementLocalService.class.getName());

			if (invokableLocalService instanceof ControlRequirementLocalService) {
				_service = (ControlRequirementLocalService)invokableLocalService;
			}
			else {
				_service = new ControlRequirementLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ControlRequirementLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ControlRequirementLocalService service) {
	}

	private static ControlRequirementLocalService _service;
}