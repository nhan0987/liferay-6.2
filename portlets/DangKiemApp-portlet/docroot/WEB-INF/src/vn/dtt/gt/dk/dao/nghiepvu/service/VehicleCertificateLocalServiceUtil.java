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
 * Provides the local service utility for VehicleCertificate. This utility wraps
 * {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.VehicleCertificateLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see VehicleCertificateLocalService
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.base.VehicleCertificateLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.impl.VehicleCertificateLocalServiceImpl
 * @generated
 */
public class VehicleCertificateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.nghiepvu.service.impl.VehicleCertificateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vehicle certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleCertificate the vehicle certificate
	* @return the vehicle certificate that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate addVehicleCertificate(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate vehicleCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addVehicleCertificate(vehicleCertificate);
	}

	/**
	* Creates a new vehicle certificate with the primary key. Does not add the vehicle certificate to the database.
	*
	* @param id the primary key for the new vehicle certificate
	* @return the new vehicle certificate
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate createVehicleCertificate(
		long id) {
		return getService().createVehicleCertificate(id);
	}

	/**
	* Deletes the vehicle certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle certificate
	* @return the vehicle certificate that was removed
	* @throws PortalException if a vehicle certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate deleteVehicleCertificate(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteVehicleCertificate(id);
	}

	/**
	* Deletes the vehicle certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleCertificate the vehicle certificate
	* @return the vehicle certificate that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate deleteVehicleCertificate(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate vehicleCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteVehicleCertificate(vehicleCertificate);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate fetchVehicleCertificate(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchVehicleCertificate(id);
	}

	/**
	* Returns the vehicle certificate with the primary key.
	*
	* @param id the primary key of the vehicle certificate
	* @return the vehicle certificate
	* @throws PortalException if a vehicle certificate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate getVehicleCertificate(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVehicleCertificate(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate> getVehicleCertificates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVehicleCertificates(start, end);
	}

	/**
	* Returns the number of vehicle certificates.
	*
	* @return the number of vehicle certificates
	* @throws SystemException if a system exception occurred
	*/
	public static int getVehicleCertificatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVehicleCertificatesCount();
	}

	/**
	* Updates the vehicle certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vehicleCertificate the vehicle certificate
	* @return the vehicle certificate that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate updateVehicleCertificate(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate vehicleCertificate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVehicleCertificate(vehicleCertificate);
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

	public static boolean deleteVehicleCertificateSpecWithHosothutucId(
		long hosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}

	public static boolean deleteVehicleCertificateOutOfMTGateway(
		long outofMTgateway, java.lang.String soChungChi,
		java.lang.String soDangKyKiemTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteVehicleCertificateOutOfMTGateway(outofMTgateway,
			soChungChi, soDangKyKiemTra);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate> findVehicleCertificateByHosothutucId(
		long hosothutucId) {
		return getService().findVehicleCertificateByHosothutucId(hosothutucId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleCertificate> findVehicleCertificate(
		java.lang.String soChungChi, long organizationId,
		java.lang.String thuTucHanhChinhId, java.lang.String doiTuong,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo thongTinTimKiemHoSo,
		int start, int end) {
		return getService()
				   .findVehicleCertificate(soChungChi, organizationId,
			thuTucHanhChinhId, doiTuong, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year, thongTinTimKiemHoSo, start, end);
	}

	public static int countVehicleCertificate(java.lang.String soChungChi,
		long organizationId, java.lang.String thuTucHanhChinhId,
		java.lang.String doiTuong, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int year,
		vn.dtt.gt.dk.tracuthongtin.ThongTinTimKiemHoSo thongTinTimKiemHoSo) {
		return getService()
				   .countVehicleCertificate(soChungChi, organizationId,
			thuTucHanhChinhId, doiTuong, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year, thongTinTimKiemHoSo);
	}

	public static void clearService() {
		_service = null;
	}

	public static VehicleCertificateLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					VehicleCertificateLocalService.class.getName());

			if (invokableLocalService instanceof VehicleCertificateLocalService) {
				_service = (VehicleCertificateLocalService)invokableLocalService;
			}
			else {
				_service = new VehicleCertificateLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(VehicleCertificateLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(VehicleCertificateLocalService service) {
	}

	private static VehicleCertificateLocalService _service;
}