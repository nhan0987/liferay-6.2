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
 * Provides a wrapper for {@link LichKiemTraHienTruongLocalService}.
 *
 * @author huymq
 * @see LichKiemTraHienTruongLocalService
 * @generated
 */
public class LichKiemTraHienTruongLocalServiceWrapper
	implements LichKiemTraHienTruongLocalService,
		ServiceWrapper<LichKiemTraHienTruongLocalService> {
	public LichKiemTraHienTruongLocalServiceWrapper(
		LichKiemTraHienTruongLocalService lichKiemTraHienTruongLocalService) {
		_lichKiemTraHienTruongLocalService = lichKiemTraHienTruongLocalService;
	}

	/**
	* Adds the lich kiem tra hien truong to the database. Also notifies the appropriate model listeners.
	*
	* @param lichKiemTraHienTruong the lich kiem tra hien truong
	* @return the lich kiem tra hien truong that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong addLichKiemTraHienTruong(
		vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong lichKiemTraHienTruong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lichKiemTraHienTruongLocalService.addLichKiemTraHienTruong(lichKiemTraHienTruong);
	}

	/**
	* Creates a new lich kiem tra hien truong with the primary key. Does not add the lich kiem tra hien truong to the database.
	*
	* @param id the primary key for the new lich kiem tra hien truong
	* @return the new lich kiem tra hien truong
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong createLichKiemTraHienTruong(
		long id) {
		return _lichKiemTraHienTruongLocalService.createLichKiemTraHienTruong(id);
	}

	/**
	* Deletes the lich kiem tra hien truong with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the lich kiem tra hien truong
	* @return the lich kiem tra hien truong that was removed
	* @throws PortalException if a lich kiem tra hien truong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong deleteLichKiemTraHienTruong(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lichKiemTraHienTruongLocalService.deleteLichKiemTraHienTruong(id);
	}

	/**
	* Deletes the lich kiem tra hien truong from the database. Also notifies the appropriate model listeners.
	*
	* @param lichKiemTraHienTruong the lich kiem tra hien truong
	* @return the lich kiem tra hien truong that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong deleteLichKiemTraHienTruong(
		vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong lichKiemTraHienTruong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lichKiemTraHienTruongLocalService.deleteLichKiemTraHienTruong(lichKiemTraHienTruong);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lichKiemTraHienTruongLocalService.dynamicQuery();
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
		return _lichKiemTraHienTruongLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.LichKiemTraHienTruongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lichKiemTraHienTruongLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.LichKiemTraHienTruongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lichKiemTraHienTruongLocalService.dynamicQuery(dynamicQuery,
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
		return _lichKiemTraHienTruongLocalService.dynamicQueryCount(dynamicQuery);
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
		return _lichKiemTraHienTruongLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong fetchLichKiemTraHienTruong(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _lichKiemTraHienTruongLocalService.fetchLichKiemTraHienTruong(id);
	}

	/**
	* Returns the lich kiem tra hien truong with the primary key.
	*
	* @param id the primary key of the lich kiem tra hien truong
	* @return the lich kiem tra hien truong
	* @throws PortalException if a lich kiem tra hien truong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong getLichKiemTraHienTruong(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lichKiemTraHienTruongLocalService.getLichKiemTraHienTruong(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _lichKiemTraHienTruongLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the lich kiem tra hien truongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.LichKiemTraHienTruongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lich kiem tra hien truongs
	* @param end the upper bound of the range of lich kiem tra hien truongs (not inclusive)
	* @return the range of lich kiem tra hien truongs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong> getLichKiemTraHienTruongs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lichKiemTraHienTruongLocalService.getLichKiemTraHienTruongs(start,
			end);
	}

	/**
	* Returns the number of lich kiem tra hien truongs.
	*
	* @return the number of lich kiem tra hien truongs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLichKiemTraHienTruongsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lichKiemTraHienTruongLocalService.getLichKiemTraHienTruongsCount();
	}

	/**
	* Updates the lich kiem tra hien truong in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lichKiemTraHienTruong the lich kiem tra hien truong
	* @return the lich kiem tra hien truong that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong updateLichKiemTraHienTruong(
		vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong lichKiemTraHienTruong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lichKiemTraHienTruongLocalService.updateLichKiemTraHienTruong(lichKiemTraHienTruong);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _lichKiemTraHienTruongLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_lichKiemTraHienTruongLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lichKiemTraHienTruongLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.LichKiemTraHienTruong> searchPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userid, int start, int end) {
		return _lichKiemTraHienTruongLocalService.searchPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userid, start, end);
	}

	@Override
	public long countPhanCongDonViKiemTraByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String maSoBienNhan,
		java.lang.String ngayNopFrom, java.lang.String ngayNopTo, int year,
		java.lang.String quanHuyen, java.lang.String tinhThanh,
		java.lang.String quocGia, long userid) {
		return _lichKiemTraHienTruongLocalService.countPhanCongDonViKiemTraByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo,
			maSoBienNhan, ngayNopFrom, ngayNopTo, year, quanHuyen, tinhThanh,
			quocGia, userid);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LichKiemTraHienTruongLocalService getWrappedLichKiemTraHienTruongLocalService() {
		return _lichKiemTraHienTruongLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLichKiemTraHienTruongLocalService(
		LichKiemTraHienTruongLocalService lichKiemTraHienTruongLocalService) {
		_lichKiemTraHienTruongLocalService = lichKiemTraHienTruongLocalService;
	}

	@Override
	public LichKiemTraHienTruongLocalService getWrappedService() {
		return _lichKiemTraHienTruongLocalService;
	}

	@Override
	public void setWrappedService(
		LichKiemTraHienTruongLocalService lichKiemTraHienTruongLocalService) {
		_lichKiemTraHienTruongLocalService = lichKiemTraHienTruongLocalService;
	}

	private LichKiemTraHienTruongLocalService _lichKiemTraHienTruongLocalService;
}