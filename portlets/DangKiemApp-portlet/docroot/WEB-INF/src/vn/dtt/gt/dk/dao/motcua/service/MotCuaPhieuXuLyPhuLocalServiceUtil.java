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
 * Provides the local service utility for MotCuaPhieuXuLyPhu. This utility wraps
 * {@link vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaPhieuXuLyPhuLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author win_64
 * @see MotCuaPhieuXuLyPhuLocalService
 * @see vn.dtt.gt.dk.dao.motcua.service.base.MotCuaPhieuXuLyPhuLocalServiceBaseImpl
 * @see vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaPhieuXuLyPhuLocalServiceImpl
 * @generated
 */
public class MotCuaPhieuXuLyPhuLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.dtt.gt.dk.dao.motcua.service.impl.MotCuaPhieuXuLyPhuLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the mot cua phieu xu ly phu to the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLyPhu the mot cua phieu xu ly phu
	* @return the mot cua phieu xu ly phu that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu addMotCuaPhieuXuLyPhu(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
	}

	/**
	* Creates a new mot cua phieu xu ly phu with the primary key. Does not add the mot cua phieu xu ly phu to the database.
	*
	* @param id the primary key for the new mot cua phieu xu ly phu
	* @return the new mot cua phieu xu ly phu
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu createMotCuaPhieuXuLyPhu(
		long id) {
		return getService().createMotCuaPhieuXuLyPhu(id);
	}

	/**
	* Deletes the mot cua phieu xu ly phu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua phieu xu ly phu
	* @return the mot cua phieu xu ly phu that was removed
	* @throws PortalException if a mot cua phieu xu ly phu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu deleteMotCuaPhieuXuLyPhu(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMotCuaPhieuXuLyPhu(id);
	}

	/**
	* Deletes the mot cua phieu xu ly phu from the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLyPhu the mot cua phieu xu ly phu
	* @return the mot cua phieu xu ly phu that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu deleteMotCuaPhieuXuLyPhu(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu fetchMotCuaPhieuXuLyPhu(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMotCuaPhieuXuLyPhu(id);
	}

	/**
	* Returns the mot cua phieu xu ly phu with the primary key.
	*
	* @param id the primary key of the mot cua phieu xu ly phu
	* @return the mot cua phieu xu ly phu
	* @throws PortalException if a mot cua phieu xu ly phu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu getMotCuaPhieuXuLyPhu(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaPhieuXuLyPhu(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the mot cua phieu xu ly phus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phieu xu ly phus
	* @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	* @return the range of mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> getMotCuaPhieuXuLyPhus(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaPhieuXuLyPhus(start, end);
	}

	/**
	* Returns the number of mot cua phieu xu ly phus.
	*
	* @return the number of mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static int getMotCuaPhieuXuLyPhusCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMotCuaPhieuXuLyPhusCount();
	}

	/**
	* Updates the mot cua phieu xu ly phu in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLyPhu the mot cua phieu xu ly phu
	* @return the mot cua phieu xu ly phu that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu updateMotCuaPhieuXuLyPhu(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
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

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu findByPhieuXuLyChinhIdAndNoiDungHoSoId(
		long phieuXuLyChinhId, long noiDungHoSoId) {
		return getService()
				   .findByPhieuXuLyChinhIdAndNoiDungHoSoId(phieuXuLyChinhId,
			noiDungHoSoId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByThuTucHanhChinhIdAndToChucXuLy(
		long PhieuXuLyChinhId) {
		return getService()
				   .findByThuTucHanhChinhIdAndToChucXuLy(PhieuXuLyChinhId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhIdAndNhomPhieuXuLy(
		long phieuXuLyChinhId, java.lang.String nhomPhieuXuLy) {
		return getService()
				   .findByPhieuXuLyChinhIdAndNhomPhieuXuLy(phieuXuLyChinhId,
			nhomPhieuXuLy);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhAndTrangThaiHienTai(
		long phieuXuLyChinhId, long trangThaiHienTaiId) {
		return getService()
				   .findByPhieuXuLyChinhAndTrangThaiHienTai(phieuXuLyChinhId,
			trangThaiHienTaiId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId) {
		return getService().findByPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhanNhomHoSoId(
		long phanNhomHoSoId) {
		return getService().findByPhanNhomHoSoId(phanNhomHoSoId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findDanhSachHoSo(
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int start, int end) {
		return getService()
				   .findDanhSachHoSo(organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, start, end);
	}

	public static int countDanhSachHoSo(long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countDanhSachHoSo(organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo, tenDoanhNghiep);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String maSoHoSoOrDer, int year,
		java.lang.String listIdResult, int start, int end) {
		return getService()
				   .findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, maSoHoSoOrDer, year,
			listIdResult, start, end);
	}

	public static int countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		java.lang.String listIdResult) {
		return getService()
				   .countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, listIdResult);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String doiTuong, java.lang.String maSoHoSo,
		java.lang.String maSoBienNhan, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String maSoHoSoOrDer, int year,
		java.lang.String listIdResult, int start, int end) {
		return getService()
				   .findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, doiTuong,
			maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, tenDoanhNghiep,
			maSoHoSoOrDer, year, listIdResult, start, end);
	}

	public static int countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String doiTuong, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String maSoBienNhan,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		java.lang.String listIdResult) {
		return getService()
				   .countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, doiTuong,
			maSoHoSo, ngayNopFrom, maSoBienNhan, ngayNopTo, tenDoanhNghiep,
			year, listIdResult);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String corporationId, java.lang.String soDKKT, int year,
		java.lang.String listIdResult, long userId, int start, int end) {
		return getService()
				   .findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, corporationId, soDKKT,
			year, listIdResult, userId, start, end);
	}

	public static int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String corporationId, java.lang.String soDKKT, int year,
		java.lang.String listIdResult, long userId) {
		return getService()
				   .countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, corporationId, soDKKT,
			year, listIdResult, userId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return getService()
				   .findMotCuaPhieuXuLyPhuByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	public static int countMotCuaPhieuXuLyPhuByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return getService()
				   .countMotCuaPhieuXuLyPhuByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return getService()
				   .findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,
			maSoBienNhan, nhomPhieuXuLy, organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year, start, end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return getService()
				   .findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return getService()
				   .findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	public static int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return getService()
				   .countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,
			maSoBienNhan, nhomPhieuXuLy, organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year);
	}

	public static int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return getService()
				   .countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year);
	}

	public static int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return getService()
				   .countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year);
	}

	public static int getHoSoThuTucIdByPhieuXuLyPhuId(long phieuXuLyPhuId) {
		return getService().getHoSoThuTucIdByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> searchPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia, int start, int end) {
		return getService()
				   .searchPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia, start,
			end);
	}

	public static int countPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia) {
		return getService()
				   .countPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia);
	}

	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByConfirmedInspection(
		long idConfirmedInspection) {
		return getService()
				   .findMotCuaPhieuXuLyPhuByConfirmedInspection(idConfirmedInspection);
	}

	public static void clearService() {
		_service = null;
	}

	public static MotCuaPhieuXuLyPhuLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MotCuaPhieuXuLyPhuLocalService.class.getName());

			if (invokableLocalService instanceof MotCuaPhieuXuLyPhuLocalService) {
				_service = (MotCuaPhieuXuLyPhuLocalService)invokableLocalService;
			}
			else {
				_service = new MotCuaPhieuXuLyPhuLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MotCuaPhieuXuLyPhuLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MotCuaPhieuXuLyPhuLocalService service) {
	}

	private static MotCuaPhieuXuLyPhuLocalService _service;
}