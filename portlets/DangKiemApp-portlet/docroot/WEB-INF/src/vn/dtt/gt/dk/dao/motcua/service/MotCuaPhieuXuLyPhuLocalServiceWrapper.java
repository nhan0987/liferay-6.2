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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MotCuaPhieuXuLyPhuLocalService}.
 *
 * @author win_64
 * @see MotCuaPhieuXuLyPhuLocalService
 * @generated
 */
public class MotCuaPhieuXuLyPhuLocalServiceWrapper
	implements MotCuaPhieuXuLyPhuLocalService,
		ServiceWrapper<MotCuaPhieuXuLyPhuLocalService> {
	public MotCuaPhieuXuLyPhuLocalServiceWrapper(
		MotCuaPhieuXuLyPhuLocalService motCuaPhieuXuLyPhuLocalService) {
		_motCuaPhieuXuLyPhuLocalService = motCuaPhieuXuLyPhuLocalService;
	}

	/**
	* Adds the mot cua phieu xu ly phu to the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLyPhu the mot cua phieu xu ly phu
	* @return the mot cua phieu xu ly phu that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu addMotCuaPhieuXuLyPhu(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyPhuLocalService.addMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
	}

	/**
	* Creates a new mot cua phieu xu ly phu with the primary key. Does not add the mot cua phieu xu ly phu to the database.
	*
	* @param id the primary key for the new mot cua phieu xu ly phu
	* @return the new mot cua phieu xu ly phu
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu createMotCuaPhieuXuLyPhu(
		long id) {
		return _motCuaPhieuXuLyPhuLocalService.createMotCuaPhieuXuLyPhu(id);
	}

	/**
	* Deletes the mot cua phieu xu ly phu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua phieu xu ly phu
	* @return the mot cua phieu xu ly phu that was removed
	* @throws PortalException if a mot cua phieu xu ly phu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu deleteMotCuaPhieuXuLyPhu(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyPhuLocalService.deleteMotCuaPhieuXuLyPhu(id);
	}

	/**
	* Deletes the mot cua phieu xu ly phu from the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLyPhu the mot cua phieu xu ly phu
	* @return the mot cua phieu xu ly phu that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu deleteMotCuaPhieuXuLyPhu(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyPhuLocalService.deleteMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _motCuaPhieuXuLyPhuLocalService.dynamicQuery();
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
		return _motCuaPhieuXuLyPhuLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyPhuLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyPhuLocalService.dynamicQuery(dynamicQuery,
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
		return _motCuaPhieuXuLyPhuLocalService.dynamicQueryCount(dynamicQuery);
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
		return _motCuaPhieuXuLyPhuLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu fetchMotCuaPhieuXuLyPhu(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyPhuLocalService.fetchMotCuaPhieuXuLyPhu(id);
	}

	/**
	* Returns the mot cua phieu xu ly phu with the primary key.
	*
	* @param id the primary key of the mot cua phieu xu ly phu
	* @return the mot cua phieu xu ly phu
	* @throws PortalException if a mot cua phieu xu ly phu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu getMotCuaPhieuXuLyPhu(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyPhuLocalService.getMotCuaPhieuXuLyPhu(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyPhuLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> getMotCuaPhieuXuLyPhus(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyPhuLocalService.getMotCuaPhieuXuLyPhus(start, end);
	}

	/**
	* Returns the number of mot cua phieu xu ly phus.
	*
	* @return the number of mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getMotCuaPhieuXuLyPhusCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyPhuLocalService.getMotCuaPhieuXuLyPhusCount();
	}

	/**
	* Updates the mot cua phieu xu ly phu in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLyPhu the mot cua phieu xu ly phu
	* @return the mot cua phieu xu ly phu that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu updateMotCuaPhieuXuLyPhu(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyPhuLocalService.updateMotCuaPhieuXuLyPhu(motCuaPhieuXuLyPhu);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _motCuaPhieuXuLyPhuLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_motCuaPhieuXuLyPhuLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _motCuaPhieuXuLyPhuLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu findByPhieuXuLyChinhIdAndNoiDungHoSoId(
		long phieuXuLyChinhId, long noiDungHoSoId) {
		return _motCuaPhieuXuLyPhuLocalService.findByPhieuXuLyChinhIdAndNoiDungHoSoId(phieuXuLyChinhId,
			noiDungHoSoId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByThuTucHanhChinhIdAndToChucXuLy(
		long PhieuXuLyChinhId) {
		return _motCuaPhieuXuLyPhuLocalService.findByThuTucHanhChinhIdAndToChucXuLy(PhieuXuLyChinhId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhIdAndNhomPhieuXuLy(
		long phieuXuLyChinhId, java.lang.String nhomPhieuXuLy) {
		return _motCuaPhieuXuLyPhuLocalService.findByPhieuXuLyChinhIdAndNhomPhieuXuLy(phieuXuLyChinhId,
			nhomPhieuXuLy);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhAndTrangThaiHienTai(
		long phieuXuLyChinhId, long trangThaiHienTaiId) {
		return _motCuaPhieuXuLyPhuLocalService.findByPhieuXuLyChinhAndTrangThaiHienTai(phieuXuLyChinhId,
			trangThaiHienTaiId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId) {
		return _motCuaPhieuXuLyPhuLocalService.findByPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhanNhomHoSoId(
		long phanNhomHoSoId) {
		return _motCuaPhieuXuLyPhuLocalService.findByPhanNhomHoSoId(phanNhomHoSoId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findDanhSachHoSo(
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep, int start, int end) {
		return _motCuaPhieuXuLyPhuLocalService.findDanhSachHoSo(organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, start, end);
	}

	@Override
	public int countDanhSachHoSo(long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo,
		java.lang.String tenDoanhNghiep)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyPhuLocalService.countDanhSachHoSo(organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String maSoHoSoOrDer, int year,
		java.lang.String listIdResult, int start, int end) {
		return _motCuaPhieuXuLyPhuLocalService.findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, maSoHoSoOrDer, year,
			listIdResult, start, end);
	}

	@Override
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		java.lang.String listIdResult) {
		return _motCuaPhieuXuLyPhuLocalService.countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSo(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, listIdResult);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String doiTuong, java.lang.String maSoHoSo,
		java.lang.String maSoBienNhan, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String maSoHoSoOrDer, int year,
		java.lang.String listIdResult, int start, int end) {
		return _motCuaPhieuXuLyPhuLocalService.findMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, doiTuong,
			maSoHoSo, maSoBienNhan, ngayNopFrom, ngayNopTo, tenDoanhNghiep,
			maSoHoSoOrDer, year, listIdResult, start, end);
	}

	@Override
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String doiTuong, java.lang.String maSoHoSo,
		java.lang.String ngayNopFrom, java.lang.String maSoBienNhan,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		java.lang.String listIdResult) {
		return _motCuaPhieuXuLyPhuLocalService.countMotCuaPhieuXuLyPhuByHoSoThuTucIdOrderMaSoHoSoAndMaSoBiennhanAndDoiTuong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, doiTuong,
			maSoHoSo, ngayNopFrom, maSoBienNhan, ngayNopTo, tenDoanhNghiep,
			year, listIdResult);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String corporationId, java.lang.String soDKKT, int year,
		java.lang.String listIdResult, long userId, int start, int end) {
		return _motCuaPhieuXuLyPhuLocalService.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, corporationId, soDKKT,
			year, listIdResult, userId, start, end);
	}

	@Override
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep,
		java.lang.String corporationId, java.lang.String soDKKT, int year,
		java.lang.String listIdResult, long userId) {
		return _motCuaPhieuXuLyPhuLocalService.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndCorporationid(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, corporationId, soDKKT,
			year, listIdResult, userId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return _motCuaPhieuXuLyPhuLocalService.findMotCuaPhieuXuLyPhuByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	@Override
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return _motCuaPhieuXuLyPhuLocalService.countMotCuaPhieuXuLyPhuByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return _motCuaPhieuXuLyPhuLocalService.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,
			maSoBienNhan, nhomPhieuXuLy, organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year, start, end);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return _motCuaPhieuXuLyPhuLocalService.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return _motCuaPhieuXuLyPhuLocalService.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	@Override
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return _motCuaPhieuXuLyPhuLocalService.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,
			maSoBienNhan, nhomPhieuXuLy, organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, maSoHoSo, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year);
	}

	@Override
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return _motCuaPhieuXuLyPhuLocalService.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanLich(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year);
	}

	@Override
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return _motCuaPhieuXuLyPhuLocalService.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year);
	}

	@Override
	public int getHoSoThuTucIdByPhieuXuLyPhuId(long phieuXuLyPhuId) {
		return _motCuaPhieuXuLyPhuLocalService.getHoSoThuTucIdByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> searchPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia, int start, int end) {
		return _motCuaPhieuXuLyPhuLocalService.searchPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia, start,
			end);
	}

	@Override
	public int countPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia) {
		return _motCuaPhieuXuLyPhuLocalService.countPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh, quocGia);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findMotCuaPhieuXuLyPhuByConfirmedInspection(
		long idConfirmedInspection) {
		return _motCuaPhieuXuLyPhuLocalService.findMotCuaPhieuXuLyPhuByConfirmedInspection(idConfirmedInspection);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MotCuaPhieuXuLyPhuLocalService getWrappedMotCuaPhieuXuLyPhuLocalService() {
		return _motCuaPhieuXuLyPhuLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMotCuaPhieuXuLyPhuLocalService(
		MotCuaPhieuXuLyPhuLocalService motCuaPhieuXuLyPhuLocalService) {
		_motCuaPhieuXuLyPhuLocalService = motCuaPhieuXuLyPhuLocalService;
	}

	@Override
	public MotCuaPhieuXuLyPhuLocalService getWrappedService() {
		return _motCuaPhieuXuLyPhuLocalService;
	}

	@Override
	public void setWrappedService(
		MotCuaPhieuXuLyPhuLocalService motCuaPhieuXuLyPhuLocalService) {
		_motCuaPhieuXuLyPhuLocalService = motCuaPhieuXuLyPhuLocalService;
	}

	private MotCuaPhieuXuLyPhuLocalService _motCuaPhieuXuLyPhuLocalService;
}