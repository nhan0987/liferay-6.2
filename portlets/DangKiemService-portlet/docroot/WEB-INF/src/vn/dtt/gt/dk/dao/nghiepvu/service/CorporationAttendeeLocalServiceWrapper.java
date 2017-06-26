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
 * Provides a wrapper for {@link CorporationAttendeeLocalService}.
 *
 * @author huymq
 * @see CorporationAttendeeLocalService
 * @generated
 */
public class CorporationAttendeeLocalServiceWrapper
	implements CorporationAttendeeLocalService,
		ServiceWrapper<CorporationAttendeeLocalService> {
	public CorporationAttendeeLocalServiceWrapper(
		CorporationAttendeeLocalService corporationAttendeeLocalService) {
		_corporationAttendeeLocalService = corporationAttendeeLocalService;
	}

	/**
	* Adds the corporation attendee to the database. Also notifies the appropriate model listeners.
	*
	* @param corporationAttendee the corporation attendee
	* @return the corporation attendee that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee addCorporationAttendee(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee corporationAttendee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationAttendeeLocalService.addCorporationAttendee(corporationAttendee);
	}

	/**
	* Creates a new corporation attendee with the primary key. Does not add the corporation attendee to the database.
	*
	* @param id the primary key for the new corporation attendee
	* @return the new corporation attendee
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee createCorporationAttendee(
		long id) {
		return _corporationAttendeeLocalService.createCorporationAttendee(id);
	}

	/**
	* Deletes the corporation attendee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporation attendee
	* @return the corporation attendee that was removed
	* @throws PortalException if a corporation attendee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee deleteCorporationAttendee(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _corporationAttendeeLocalService.deleteCorporationAttendee(id);
	}

	/**
	* Deletes the corporation attendee from the database. Also notifies the appropriate model listeners.
	*
	* @param corporationAttendee the corporation attendee
	* @return the corporation attendee that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee deleteCorporationAttendee(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee corporationAttendee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationAttendeeLocalService.deleteCorporationAttendee(corporationAttendee);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _corporationAttendeeLocalService.dynamicQuery();
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
		return _corporationAttendeeLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationAttendeeLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationAttendeeLocalService.dynamicQuery(dynamicQuery,
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
		return _corporationAttendeeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _corporationAttendeeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee fetchCorporationAttendee(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationAttendeeLocalService.fetchCorporationAttendee(id);
	}

	/**
	* Returns the corporation attendee with the primary key.
	*
	* @param id the primary key of the corporation attendee
	* @return the corporation attendee
	* @throws PortalException if a corporation attendee with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee getCorporationAttendee(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _corporationAttendeeLocalService.getCorporationAttendee(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _corporationAttendeeLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> getCorporationAttendees(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationAttendeeLocalService.getCorporationAttendees(start,
			end);
	}

	/**
	* Returns the number of corporation attendees.
	*
	* @return the number of corporation attendees
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCorporationAttendeesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationAttendeeLocalService.getCorporationAttendeesCount();
	}

	/**
	* Updates the corporation attendee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param corporationAttendee the corporation attendee
	* @return the corporation attendee that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee updateCorporationAttendee(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee corporationAttendee)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationAttendeeLocalService.updateCorporationAttendee(corporationAttendee);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _corporationAttendeeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_corporationAttendeeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _corporationAttendeeLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionIdAndInspectorRole(
		long confirmedInspectionId, long inspectorRole) {
		return _corporationAttendeeLocalService.findByConfirmedInspectionIdAndInspectorRole(confirmedInspectionId,
			inspectorRole);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee> findByConfirmedInspectionId(
		long confirmedInspectionId) {
		return _corporationAttendeeLocalService.findByConfirmedInspectionId(confirmedInspectionId);
	}

	@Override
	public void removeByConfirmedInspectionId(long confirmedInspectionId) {
		_corporationAttendeeLocalService.removeByConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CorporationAttendeeLocalService getWrappedCorporationAttendeeLocalService() {
		return _corporationAttendeeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCorporationAttendeeLocalService(
		CorporationAttendeeLocalService corporationAttendeeLocalService) {
		_corporationAttendeeLocalService = corporationAttendeeLocalService;
	}

	@Override
	public CorporationAttendeeLocalService getWrappedService() {
		return _corporationAttendeeLocalService;
	}

	@Override
	public void setWrappedService(
		CorporationAttendeeLocalService corporationAttendeeLocalService) {
		_corporationAttendeeLocalService = corporationAttendeeLocalService;
	}

	private CorporationAttendeeLocalService _corporationAttendeeLocalService;
}