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

package vn.dtt.gt.dk.dao.motcua.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for MotCuaPhieuXuLyChinh. This utility wraps
 * {@link vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaPhieuXuLyChinhLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see MotCuaPhieuXuLyChinhLocalService
 * @see vn.dtt.gt.dk.dao.motcua.service.base.MotCuaPhieuXuLyChinhLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaPhieuXuLyChinhLocalServiceImpl
 * @generated
 */
public class MotCuaPhieuXuLyChinhLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaPhieuXuLyChinhLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the mot cua phieu xu ly chinh to the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLyChinh the mot cua phieu xu ly chinh
	* @return the mot cua phieu xu ly chinh that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh addMotCuaPhieuXuLyChinh(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMotCuaPhieuXuLyChinh(motCuaPhieuXuLyChinh);
	}

	/**
	* Creates a new mot cua phieu xu ly chinh with the primary key. Does not add the mot cua phieu xu ly chinh to the database.
	*
	* @param id the primary key for the new mot cua phieu xu ly chinh
	* @return the new mot cua phieu xu ly chinh
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh createMotCuaPhieuXuLyChinh(
		long id) {
		return getService().createMotCuaPhieuXuLyChinh(id);
	}

	/**
	* Deletes the mot cua phieu xu ly chinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua phieu xu ly chinh
	* @return the mot cua phieu xu ly chinh that was removed
	* @throws PortalException if a mot cua phieu xu ly chinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh deleteMotCuaPhieuXuLyChinh(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMotCuaPhieuXuLyChinh(id);
	}

	/**
	* Deletes the mot cua phieu xu ly chinh from the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLyChinh the mot cua phieu xu ly chinh
	* @return the mot cua phieu xu ly chinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh deleteMotCuaPhieuXuLyChinh(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMotCuaPhieuXuLyChinh(motCuaPhieuXuLyChinh);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh fetchMotCuaPhieuXuLyChinh(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMotCuaPhieuXuLyChinh(id);
	}

	/**
	* Returns the mot cua phieu xu ly chinh with the primary key.
	*
	* @param id the primary key of the mot cua phieu xu ly chinh
	* @return the mot cua phieu xu ly chinh
	* @throws PortalException if a mot cua phieu xu ly chinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh getMotCuaPhieuXuLyChinh(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaPhieuXuLyChinh(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the mot cua phieu xu ly chinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phieu xu ly chinhs
	* @param end the upper bound of the range of mot cua phieu xu ly chinhs (not inclusive)
	* @return the range of mot cua phieu xu ly chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh> getMotCuaPhieuXuLyChinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaPhieuXuLyChinhs(start, end);
	}

	/**
	* Returns the number of mot cua phieu xu ly chinhs.
	*
	* @return the number of mot cua phieu xu ly chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int getMotCuaPhieuXuLyChinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaPhieuXuLyChinhsCount();
	}

	/**
	* Updates the mot cua phieu xu ly chinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLyChinh the mot cua phieu xu ly chinh
	* @return the mot cua phieu xu ly chinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh updateMotCuaPhieuXuLyChinh(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMotCuaPhieuXuLyChinh(motCuaPhieuXuLyChinh);
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

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh findByHoSoThuTucIdAndQuyTrinhThuTucId(
		long HoSoThuTucId, long QuyTrinhThuTucId) {
		return getService()
				   .findByHoSoThuTucIdAndQuyTrinhThuTucId(HoSoThuTucId,
			QuyTrinhThuTucId);
	}

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh findByHoSoThuTucId(
		long hoSoThuTucId) {
		return getService().findByHoSoThuTucId(hoSoThuTucId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh> findMotCuaPhieuXuLyChinhByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String hoSoThuTucId, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return getService()
				   .findMotCuaPhieuXuLyChinhByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, hoSoThuTucId,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	public static int countMotCuaPhieuXuLyChinhByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String hoSoThuTucId, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return getService()
				   .countMotCuaPhieuXuLyChinhByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, hoSoThuTucId,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh> findMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String hoSoThuTucId, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return getService()
				   .findMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,
			maSoBienNhan, nhomPhieuXuLy, organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, hoSoThuTucId, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year, start, end);
	}

	public static int countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String hoSoThuTucId, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return getService()
				   .countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,
			maSoBienNhan, nhomPhieuXuLy, organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, hoSoThuTucId, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year);
	}

	public static void clearService() {
		_service = null;
	}

	public static MotCuaPhieuXuLyChinhLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MotCuaPhieuXuLyChinhLocalService.class.getName());

			if (invokableLocalService instanceof MotCuaPhieuXuLyChinhLocalService) {
				_service = (MotCuaPhieuXuLyChinhLocalService)invokableLocalService;
			}
			else {
				_service = new MotCuaPhieuXuLyChinhLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MotCuaPhieuXuLyChinhLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MotCuaPhieuXuLyChinhLocalService service) {
	}

	private static MotCuaPhieuXuLyChinhLocalService _service;
}