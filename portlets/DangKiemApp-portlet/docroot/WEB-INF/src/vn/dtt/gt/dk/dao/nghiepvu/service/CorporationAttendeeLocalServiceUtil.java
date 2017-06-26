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
 * Provides the local service utility for CorporationAttendee. This utility wraps
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.CorporationAttendeeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see CorporationAttendeeLocalService
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.CorporationAttendeeLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.CorporationAttendeeLocalServiceImpl
 * @generated
 */
public class CorporationAttendeeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.CorporationAttendeeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the corporation attendee to the database. Also notifies the appropriate model listeners.
	*
	* @param corporationAttendee the corporation attendee
	* @return the corporation attendee that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee addCorporationAttendee(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee corporationAttendee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCorporationAttendee(corporationAttendee);
	}

	/**
	* Creates a new corporation attendee with the primary key. Does not add the corporation attendee to the database.
	*
	* @param id the primary key for the new corporation attendee
	* @return the new corporation attendee
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee createCorporationAttendee(
		long id) {
		return getService().createCorporationAttendee(id);
	}

	/**
	* Deletes the corporation attendee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporation attendee
	* @return the corporation attendee that was removed
	* @throws PortalException if a corporation attendee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee deleteCorporationAttendee(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCorporationAttendee(id);
	}

	/**
	* Deletes the corporation attendee from the database. Also notifies the appropriate model listeners.
	*
	* @param corporationAttendee the corporation attendee
	* @return the corporation attendee that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee deleteCorporationAttendee(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee corporationAttendee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCorporationAttendee(corporationAttendee);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee fetchCorporationAttendee(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCorporationAttendee(id);
	}

	/**
	* Returns the corporation attendee with the primary key.
	*
	* @param id the primary key of the corporation attendee
	* @return the corporation attendee
	* @throws PortalException if a corporation attendee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee getCorporationAttendee(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCorporationAttendee(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the corporation attendees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporation attendees
	* @param end the upper bound of the range of corporation attendees (not inclusive)
	* @return the range of corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> getCorporationAttendees(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCorporationAttendees(start, end);
	}

	/**
	* Returns the number of corporation attendees.
	*
	* @return the number of corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	public static int getCorporationAttendeesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCorporationAttendeesCount();
	}

	/**
	* Updates the corporation attendee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param corporationAttendee the corporation attendee
	* @return the corporation attendee that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee updateCorporationAttendee(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee corporationAttendee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCorporationAttendee(corporationAttendee);
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

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionIdAndInspectorRole(
		long confirmedInspectionId, long inspectorRole) {
		return getService()
				   .findByConfirmedInspectionIdAndInspectorRole(confirmedInspectionId,
			inspectorRole);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionId(
		long confirmedInspectionId) {
		return getService().findByConfirmedInspectionId(confirmedInspectionId);
	}

	public static void removeByConfirmedInspectionId(long confirmedInspectionId) {
		getService().removeByConfirmedInspectionId(confirmedInspectionId);
	}

	public static void clearService() {
		_service = null;
	}

	public static CorporationAttendeeLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CorporationAttendeeLocalService.class.getName());

			if (invokableLocalService instanceof CorporationAttendeeLocalService) {
				_service = (CorporationAttendeeLocalService)invokableLocalService;
			}
			else {
				_service = new CorporationAttendeeLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CorporationAttendeeLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CorporationAttendeeLocalService service) {
	}

	private static CorporationAttendeeLocalService _service;
}