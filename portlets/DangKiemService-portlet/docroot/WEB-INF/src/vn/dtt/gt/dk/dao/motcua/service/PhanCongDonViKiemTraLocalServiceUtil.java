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
 * Provides the local service utility for PhanCongDonViKiemTra. This utility wraps
 * {@link vn.dtt.gt.dk.dao.motcua.service.impl.PhanCongDonViKiemTraLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see PhanCongDonViKiemTraLocalService
 * @see vn.dtt.gt.dk.dao.motcua.service.base.PhanCongDonViKiemTraLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.impl.PhanCongDonViKiemTraLocalServiceImpl
 * @generated
 */
public class PhanCongDonViKiemTraLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.motcua.service.impl.PhanCongDonViKiemTraLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the phan cong don vi kiem tra to the database. Also notifies the appropriate model listeners.
	*
	* @param phanCongDonViKiemTra the phan cong don vi kiem tra
	* @return the phan cong don vi kiem tra that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra addPhanCongDonViKiemTra(
		vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra phanCongDonViKiemTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addPhanCongDonViKiemTra(phanCongDonViKiemTra);
	}

	/**
	* Creates a new phan cong don vi kiem tra with the primary key. Does not add the phan cong don vi kiem tra to the database.
	*
	* @param id the primary key for the new phan cong don vi kiem tra
	* @return the new phan cong don vi kiem tra
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra createPhanCongDonViKiemTra(
		long id) {
		return getService().createPhanCongDonViKiemTra(id);
	}

	/**
	* Deletes the phan cong don vi kiem tra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phan cong don vi kiem tra
	* @return the phan cong don vi kiem tra that was removed
	* @throws PortalException if a phan cong don vi kiem tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra deletePhanCongDonViKiemTra(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePhanCongDonViKiemTra(id);
	}

	/**
	* Deletes the phan cong don vi kiem tra from the database. Also notifies the appropriate model listeners.
	*
	* @param phanCongDonViKiemTra the phan cong don vi kiem tra
	* @return the phan cong don vi kiem tra that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra deletePhanCongDonViKiemTra(
		vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra phanCongDonViKiemTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePhanCongDonViKiemTra(phanCongDonViKiemTra);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhanCongDonViKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhanCongDonViKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra fetchPhanCongDonViKiemTra(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPhanCongDonViKiemTra(id);
	}

	/**
	* Returns the phan cong don vi kiem tra with the primary key.
	*
	* @param id the primary key of the phan cong don vi kiem tra
	* @return the phan cong don vi kiem tra
	* @throws PortalException if a phan cong don vi kiem tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra getPhanCongDonViKiemTra(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPhanCongDonViKiemTra(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the phan cong don vi kiem tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.PhanCongDonViKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phan cong don vi kiem tras
	* @param end the upper bound of the range of phan cong don vi kiem tras (not inclusive)
	* @return the range of phan cong don vi kiem tras
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> getPhanCongDonViKiemTras(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPhanCongDonViKiemTras(start, end);
	}

	/**
	* Returns the number of phan cong don vi kiem tras.
	*
	* @return the number of phan cong don vi kiem tras
	* @throws SystemException if a system exception occurred
	*/
	public static int getPhanCongDonViKiemTrasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPhanCongDonViKiemTrasCount();
	}

	/**
	* Updates the phan cong don vi kiem tra in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phanCongDonViKiemTra the phan cong don vi kiem tra
	* @return the phan cong don vi kiem tra that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra updatePhanCongDonViKiemTra(
		vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra phanCongDonViKiemTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePhanCongDonViKiemTra(phanCongDonViKiemTra);
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

	public static long countPhanCongDonViKiemTra(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia) {
		return getService()
				   .countPhanCongDonViKiemTra(nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia);
	}

	public static long countPhanCongDonViKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId) {
		return getService()
				   .countPhanCongDonViKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId);
	}

	public static long countLichKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId) {
		return getService()
				   .countLichKiemTraHienTruong(nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia, userId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> findPhanCongDonViKiemTra(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, int start, int end) {
		return getService()
				   .findPhanCongDonViKiemTra(nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia, start,
			end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> findPhanCongDonViKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end) {
		return getService()
				   .findPhanCongDonViKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId, start, end);
	}

	public static java.util.List findLichKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end) {
		return getService()
				   .findLichKiemTraHienTruong(nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,
			userId, start, end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> searchPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, int start, int end) {
		return getService()
				   .searchPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, start, end);
	}

	public static long countPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia) {
		return getService()
				   .countPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> searchPhanCongKiemTraKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end) {
		return getService()
				   .searchPhanCongKiemTraKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId, start, end);
	}

	public static long countPhanCongKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId) {
		return getService()
				   .countPhanCongKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> searchLichKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end) {
		return getService()
				   .searchLichKiemTraHienTruong(nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia,
			userId, start, end);
	}

	public static long countLichKiemTraHienTruong1(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId) {
		return getService()
				   .countLichKiemTraHienTruong1(nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, maSoBienNhan,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia, userId);
	}

	public static void clearService() {
		_service = null;
	}

	public static PhanCongDonViKiemTraLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PhanCongDonViKiemTraLocalService.class.getName());

			if (invokableLocalService instanceof PhanCongDonViKiemTraLocalService) {
				_service = (PhanCongDonViKiemTraLocalService)invokableLocalService;
			}
			else {
				_service = new PhanCongDonViKiemTraLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(PhanCongDonViKiemTraLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PhanCongDonViKiemTraLocalService service) {
	}

	private static PhanCongDonViKiemTraLocalService _service;
}