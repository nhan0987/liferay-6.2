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
 * Provides a wrapper for {@link PhanCongDonViKiemTraLocalService}.
 *
 * @author huymq
 * @see PhanCongDonViKiemTraLocalService
 * @generated
 */
public class PhanCongDonViKiemTraLocalServiceWrapper
	implements PhanCongDonViKiemTraLocalService,
		ServiceWrapper<PhanCongDonViKiemTraLocalService> {
	public PhanCongDonViKiemTraLocalServiceWrapper(
		PhanCongDonViKiemTraLocalService phanCongDonViKiemTraLocalService) {
		_phanCongDonViKiemTraLocalService = phanCongDonViKiemTraLocalService;
	}

	/**
	* Adds the phan cong don vi kiem tra to the database. Also notifies the appropriate model listeners.
	*
	* @param phanCongDonViKiemTra the phan cong don vi kiem tra
	* @return the phan cong don vi kiem tra that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra addPhanCongDonViKiemTra(
		vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra phanCongDonViKiemTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phanCongDonViKiemTraLocalService.addPhanCongDonViKiemTra(phanCongDonViKiemTra);
	}

	/**
	* Creates a new phan cong don vi kiem tra with the primary key. Does not add the phan cong don vi kiem tra to the database.
	*
	* @param id the primary key for the new phan cong don vi kiem tra
	* @return the new phan cong don vi kiem tra
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra createPhanCongDonViKiemTra(
		long id) {
		return _phanCongDonViKiemTraLocalService.createPhanCongDonViKiemTra(id);
	}

	/**
	* Deletes the phan cong don vi kiem tra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phan cong don vi kiem tra
	* @return the phan cong don vi kiem tra that was removed
	* @throws PortalException if a phan cong don vi kiem tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra deletePhanCongDonViKiemTra(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phanCongDonViKiemTraLocalService.deletePhanCongDonViKiemTra(id);
	}

	/**
	* Deletes the phan cong don vi kiem tra from the database. Also notifies the appropriate model listeners.
	*
	* @param phanCongDonViKiemTra the phan cong don vi kiem tra
	* @return the phan cong don vi kiem tra that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra deletePhanCongDonViKiemTra(
		vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra phanCongDonViKiemTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phanCongDonViKiemTraLocalService.deletePhanCongDonViKiemTra(phanCongDonViKiemTra);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _phanCongDonViKiemTraLocalService.dynamicQuery();
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
		return _phanCongDonViKiemTraLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _phanCongDonViKiemTraLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phanCongDonViKiemTraLocalService.dynamicQuery(dynamicQuery,
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
		return _phanCongDonViKiemTraLocalService.dynamicQueryCount(dynamicQuery);
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
		return _phanCongDonViKiemTraLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra fetchPhanCongDonViKiemTra(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _phanCongDonViKiemTraLocalService.fetchPhanCongDonViKiemTra(id);
	}

	/**
	* Returns the phan cong don vi kiem tra with the primary key.
	*
	* @param id the primary key of the phan cong don vi kiem tra
	* @return the phan cong don vi kiem tra
	* @throws PortalException if a phan cong don vi kiem tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra getPhanCongDonViKiemTra(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phanCongDonViKiemTraLocalService.getPhanCongDonViKiemTra(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phanCongDonViKiemTraLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> getPhanCongDonViKiemTras(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phanCongDonViKiemTraLocalService.getPhanCongDonViKiemTras(start,
			end);
	}

	/**
	* Returns the number of phan cong don vi kiem tras.
	*
	* @return the number of phan cong don vi kiem tras
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPhanCongDonViKiemTrasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phanCongDonViKiemTraLocalService.getPhanCongDonViKiemTrasCount();
	}

	/**
	* Updates the phan cong don vi kiem tra in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phanCongDonViKiemTra the phan cong don vi kiem tra
	* @return the phan cong don vi kiem tra that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra updatePhanCongDonViKiemTra(
		vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra phanCongDonViKiemTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phanCongDonViKiemTraLocalService.updatePhanCongDonViKiemTra(phanCongDonViKiemTra);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _phanCongDonViKiemTraLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_phanCongDonViKiemTraLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _phanCongDonViKiemTraLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public long countPhanCongDonViKiemTra(java.lang.String nhomPhieuXuLy,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String maSoBienNhan, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia) {
		return _phanCongDonViKiemTraLocalService.countPhanCongDonViKiemTra(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia);
	}

	@Override
	public long countPhanCongDonViKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId) {
		return _phanCongDonViKiemTraLocalService.countPhanCongDonViKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId);
	}

	@Override
	public long countLichKiemTraHienTruong(java.lang.String nhomPhieuXuLy,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String maSoBienNhan, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia, long userId) {
		return _phanCongDonViKiemTraLocalService.countLichKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> findPhanCongDonViKiemTra(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, int start, int end) {
		return _phanCongDonViKiemTraLocalService.findPhanCongDonViKiemTra(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, start, end);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> findPhanCongDonViKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end) {
		return _phanCongDonViKiemTraLocalService.findPhanCongDonViKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId, start, end);
	}

	@Override
	public java.util.List findLichKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end) {
		return _phanCongDonViKiemTraLocalService.findLichKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId, start, end);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> searchPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, int start, int end) {
		return _phanCongDonViKiemTraLocalService.searchPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, start, end);
	}

	@Override
	public long countPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia) {
		return _phanCongDonViKiemTraLocalService.countPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> searchPhanCongKiemTraKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end) {
		return _phanCongDonViKiemTraLocalService.searchPhanCongKiemTraKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId, start, end);
	}

	@Override
	public long countPhanCongKiemTraHienTruong(java.lang.String nhomPhieuXuLy,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String maSoBienNhan, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia, long userId) {
		return _phanCongDonViKiemTraLocalService.countPhanCongKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.PhanCongDonViKiemTra> searchLichKiemTraHienTruong(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userId, int start, int end) {
		return _phanCongDonViKiemTraLocalService.searchLichKiemTraHienTruong(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId, start, end);
	}

	@Override
	public long countLichKiemTraHienTruong1(java.lang.String nhomPhieuXuLy,
		long organizationId, long phanNhomHoSoId,
		java.lang.String thuTucHanhChinhId, java.lang.String maSoHoSo,
		java.lang.String maSoBienNhan, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, int year, java.lang.String quanHuyen,
		java.lang.String tinhThanh, java.lang.String quocGia, long userId) {
		return _phanCongDonViKiemTraLocalService.countLichKiemTraHienTruong1(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PhanCongDonViKiemTraLocalService getWrappedPhanCongDonViKiemTraLocalService() {
		return _phanCongDonViKiemTraLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPhanCongDonViKiemTraLocalService(
		PhanCongDonViKiemTraLocalService phanCongDonViKiemTraLocalService) {
		_phanCongDonViKiemTraLocalService = phanCongDonViKiemTraLocalService;
	}

	@Override
	public PhanCongDonViKiemTraLocalService getWrappedService() {
		return _phanCongDonViKiemTraLocalService;
	}

	@Override
	public void setWrappedService(
		PhanCongDonViKiemTraLocalService phanCongDonViKiemTraLocalService) {
		_phanCongDonViKiemTraLocalService = phanCongDonViKiemTraLocalService;
	}

	private PhanCongDonViKiemTraLocalService _phanCongDonViKiemTraLocalService;
}