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
 * Provides a wrapper for {@link VehicleCertificateLocalService}.
 *
 * @author win_64
 * @see VehicleCertificateLocalService
 * @generated
 */
public class VehicleCertificateLocalServiceWrapper
	implements VehicleCertificateLocalService,
		ServiceWrapper<VehicleCertificateLocalService> {
	public VehicleCertificateLocalServiceWrapper(
		VehicleCertificateLocalService vehicleCertificateLocalService) {
		_vehicleCertificateLocalService = vehicleCertificateLocalService;
	}

	/**
	* Adds the vehicle certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleCertificate the vehicle certificate
	* @return the vehicle certificate that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate addVehicleCertificate(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate vehicleCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleCertificateLocalService.addVehicleCertificate(vehicleCertificate);
	}

	/**
	* Creates a new vehicle certificate with the primary key. Does not add the vehicle certificate to the database.
	*
	* @param id the primary key for the new vehicle certificate
	* @return the new vehicle certificate
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate createVehicleCertificate(
		long id) {
		return _vehicleCertificateLocalService.createVehicleCertificate(id);
	}

	/**
	* Deletes the vehicle certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle certificate
	* @return the vehicle certificate that was removed
	* @throws PortalException if a vehicle certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate deleteVehicleCertificate(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleCertificateLocalService.deleteVehicleCertificate(id);
	}

	/**
	* Deletes the vehicle certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleCertificate the vehicle certificate
	* @return the vehicle certificate that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate deleteVehicleCertificate(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate vehicleCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleCertificateLocalService.deleteVehicleCertificate(vehicleCertificate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vehicleCertificateLocalService.dynamicQuery();
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
		return _vehicleCertificateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vehicleCertificateLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vehicleCertificateLocalService.dynamicQuery(dynamicQuery,
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
		return _vehicleCertificateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vehicleCertificateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate fetchVehicleCertificate(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleCertificateLocalService.fetchVehicleCertificate(id);
	}

	/**
	* Returns the vehicle certificate with the primary key.
	*
	* @param id the primary key of the vehicle certificate
	* @return the vehicle certificate
	* @throws PortalException if a vehicle certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate getVehicleCertificate(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleCertificateLocalService.getVehicleCertificate(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleCertificateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the vehicle certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle certificates
	* @param end the upper bound of the range of vehicle certificates (not inclusive)
	* @return the range of vehicle certificates
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate> getVehicleCertificates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleCertificateLocalService.getVehicleCertificates(start, end);
	}

	/**
	* Returns the number of vehicle certificates.
	*
	* @return the number of vehicle certificates
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVehicleCertificatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleCertificateLocalService.getVehicleCertificatesCount();
	}

	/**
	* Updates the vehicle certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vehicleCertificate the vehicle certificate
	* @return the vehicle certificate that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate updateVehicleCertificate(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate vehicleCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleCertificateLocalService.updateVehicleCertificate(vehicleCertificate);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vehicleCertificateLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vehicleCertificateLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vehicleCertificateLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public boolean deleteVehicleCertificateSpecWithHosothutucId(
		long hosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleCertificateLocalService.deleteVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}

	@Override
	public boolean deleteVehicleCertificateOutOfMTGateway(long outofMTgateway,
		java.lang.String soChungChi, java.lang.String soDangKyKiemTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleCertificateLocalService.deleteVehicleCertificateOutOfMTGateway(outofMTgateway,
			soChungChi, soDangKyKiemTra);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate> findVehicleCertificateByHosothutucId(
		long hosothutucId) {
		return _vehicleCertificateLocalService.findVehicleCertificateByHosothutucId(hosothutucId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate> findVehicleCertificate(
		java.lang.String soChungChi, long organizationId,
		java.lang.String thuTucHanhChinhId, java.lang.String doiTuong,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo thongTinTimKiemHoSo,
		int start, int end) {
		return _vehicleCertificateLocalService.findVehicleCertificate(soChungChi,
			organizationId, thuTucHanhChinhId, doiTuong, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year, thongTinTimKiemHoSo, start, end);
	}

	@Override
	public int countVehicleCertificate(java.lang.String soChungChi,
		long organizationId, java.lang.String thuTucHanhChinhId,
		java.lang.String doiTuong, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int year,
		vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo thongTinTimKiemHoSo) {
		return _vehicleCertificateLocalService.countVehicleCertificate(soChungChi,
			organizationId, thuTucHanhChinhId, doiTuong, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year, thongTinTimKiemHoSo);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VehicleCertificateLocalService getWrappedVehicleCertificateLocalService() {
		return _vehicleCertificateLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVehicleCertificateLocalService(
		VehicleCertificateLocalService vehicleCertificateLocalService) {
		_vehicleCertificateLocalService = vehicleCertificateLocalService;
	}

	@Override
	public VehicleCertificateLocalService getWrappedService() {
		return _vehicleCertificateLocalService;
	}

	@Override
	public void setWrappedService(
		VehicleCertificateLocalService vehicleCertificateLocalService) {
		_vehicleCertificateLocalService = vehicleCertificateLocalService;
	}

	private VehicleCertificateLocalService _vehicleCertificateLocalService;
}