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
 * Provides a wrapper for {@link RegisteredInspectionLocalService}.
 *
 * @author win_64
 * @see RegisteredInspectionLocalService
 * @generated
 */
public class RegisteredInspectionLocalServiceWrapper
	implements RegisteredInspectionLocalService,
		ServiceWrapper<RegisteredInspectionLocalService> {
	public RegisteredInspectionLocalServiceWrapper(
		RegisteredInspectionLocalService registeredInspectionLocalService) {
		_registeredInspectionLocalService = registeredInspectionLocalService;
	}

	/**
	* Adds the registered inspection to the database. Also notifies the appropriate model listeners.
	*
	* @param registeredInspection the registered inspection
	* @return the registered inspection that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection addRegisteredInspection(
		vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection registeredInspection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registeredInspectionLocalService.addRegisteredInspection(registeredInspection);
	}

	/**
	* Creates a new registered inspection with the primary key. Does not add the registered inspection to the database.
	*
	* @param id the primary key for the new registered inspection
	* @return the new registered inspection
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection createRegisteredInspection(
		long id) {
		return _registeredInspectionLocalService.createRegisteredInspection(id);
	}

	/**
	* Deletes the registered inspection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the registered inspection
	* @return the registered inspection that was removed
	* @throws PortalException if a registered inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection deleteRegisteredInspection(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _registeredInspectionLocalService.deleteRegisteredInspection(id);
	}

	/**
	* Deletes the registered inspection from the database. Also notifies the appropriate model listeners.
	*
	* @param registeredInspection the registered inspection
	* @return the registered inspection that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection deleteRegisteredInspection(
		vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection registeredInspection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registeredInspectionLocalService.deleteRegisteredInspection(registeredInspection);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _registeredInspectionLocalService.dynamicQuery();
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
		return _registeredInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _registeredInspectionLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _registeredInspectionLocalService.dynamicQuery(dynamicQuery,
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
		return _registeredInspectionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _registeredInspectionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection fetchRegisteredInspection(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _registeredInspectionLocalService.fetchRegisteredInspection(id);
	}

	/**
	* Returns the registered inspection with the primary key.
	*
	* @param id the primary key of the registered inspection
	* @return the registered inspection
	* @throws PortalException if a registered inspection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection getRegisteredInspection(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _registeredInspectionLocalService.getRegisteredInspection(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _registeredInspectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the registered inspections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.RegisteredInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registered inspections
	* @param end the upper bound of the range of registered inspections (not inclusive)
	* @return the range of registered inspections
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> getRegisteredInspections(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registeredInspectionLocalService.getRegisteredInspections(start,
			end);
	}

	/**
	* Returns the number of registered inspections.
	*
	* @return the number of registered inspections
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRegisteredInspectionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registeredInspectionLocalService.getRegisteredInspectionsCount();
	}

	/**
	* Updates the registered inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param registeredInspection the registered inspection
	* @return the registered inspection that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection updateRegisteredInspection(
		vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection registeredInspection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registeredInspectionLocalService.updateRegisteredInspection(registeredInspection);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _registeredInspectionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_registeredInspectionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _registeredInspectionLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection findByDossierId(
		long dossierId) {
		return _registeredInspectionLocalService.findByDossierId(dossierId);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection findDanhSachHoSo(
		long phieuXuLyPhuId) {
		return _registeredInspectionLocalService.findDanhSachHoSo(phieuXuLyPhuId);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection findByRegisteredNumber(
		java.lang.String registeredNumber) {
		return _registeredInspectionLocalService.findByRegisteredNumber(registeredNumber);
	}

	@Override
	public int countSoHoSoDangKyKiemTra(long idRegisteredInspection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registeredInspectionLocalService.countSoHoSoDangKyKiemTra(idRegisteredInspection);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RegisteredInspectionLocalService getWrappedRegisteredInspectionLocalService() {
		return _registeredInspectionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRegisteredInspectionLocalService(
		RegisteredInspectionLocalService registeredInspectionLocalService) {
		_registeredInspectionLocalService = registeredInspectionLocalService;
	}

	@Override
	public RegisteredInspectionLocalService getWrappedService() {
		return _registeredInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		RegisteredInspectionLocalService registeredInspectionLocalService) {
		_registeredInspectionLocalService = registeredInspectionLocalService;
	}

	private RegisteredInspectionLocalService _registeredInspectionLocalService;
}