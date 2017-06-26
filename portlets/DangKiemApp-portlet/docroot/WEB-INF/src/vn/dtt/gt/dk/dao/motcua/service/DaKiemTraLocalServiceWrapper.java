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
 * Provides a wrapper for {@link DaKiemTraLocalService}.
 *
 * @author win_64
 * @see DaKiemTraLocalService
 * @generated
 */
public class DaKiemTraLocalServiceWrapper implements DaKiemTraLocalService,
	ServiceWrapper<DaKiemTraLocalService> {
	public DaKiemTraLocalServiceWrapper(
		DaKiemTraLocalService daKiemTraLocalService) {
		_daKiemTraLocalService = daKiemTraLocalService;
	}

	/**
	* Adds the da kiem tra to the database. Also notifies the appropriate model listeners.
	*
	* @param daKiemTra the da kiem tra
	* @return the da kiem tra that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra addDaKiemTra(
		vn.dtt.gt.dk.dao.motcua.model.DaKiemTra daKiemTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _daKiemTraLocalService.addDaKiemTra(daKiemTra);
	}

	/**
	* Creates a new da kiem tra with the primary key. Does not add the da kiem tra to the database.
	*
	* @param id the primary key for the new da kiem tra
	* @return the new da kiem tra
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra createDaKiemTra(long id) {
		return _daKiemTraLocalService.createDaKiemTra(id);
	}

	/**
	* Deletes the da kiem tra with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the da kiem tra
	* @return the da kiem tra that was removed
	* @throws PortalException if a da kiem tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra deleteDaKiemTra(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _daKiemTraLocalService.deleteDaKiemTra(id);
	}

	/**
	* Deletes the da kiem tra from the database. Also notifies the appropriate model listeners.
	*
	* @param daKiemTra the da kiem tra
	* @return the da kiem tra that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra deleteDaKiemTra(
		vn.dtt.gt.dk.dao.motcua.model.DaKiemTra daKiemTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _daKiemTraLocalService.deleteDaKiemTra(daKiemTra);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _daKiemTraLocalService.dynamicQuery();
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
		return _daKiemTraLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _daKiemTraLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _daKiemTraLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _daKiemTraLocalService.dynamicQueryCount(dynamicQuery);
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
		return _daKiemTraLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra fetchDaKiemTra(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _daKiemTraLocalService.fetchDaKiemTra(id);
	}

	/**
	* Returns the da kiem tra with the primary key.
	*
	* @param id the primary key of the da kiem tra
	* @return the da kiem tra
	* @throws PortalException if a da kiem tra with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra getDaKiemTra(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _daKiemTraLocalService.getDaKiemTra(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _daKiemTraLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the da kiem tras.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.DaKiemTraModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of da kiem tras
	* @param end the upper bound of the range of da kiem tras (not inclusive)
	* @return the range of da kiem tras
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.DaKiemTra> getDaKiemTras(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _daKiemTraLocalService.getDaKiemTras(start, end);
	}

	/**
	* Returns the number of da kiem tras.
	*
	* @return the number of da kiem tras
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDaKiemTrasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _daKiemTraLocalService.getDaKiemTrasCount();
	}

	/**
	* Updates the da kiem tra in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param daKiemTra the da kiem tra
	* @return the da kiem tra that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.DaKiemTra updateDaKiemTra(
		vn.dtt.gt.dk.dao.motcua.model.DaKiemTra daKiemTra)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _daKiemTraLocalService.updateDaKiemTra(daKiemTra);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _daKiemTraLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_daKiemTraLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _daKiemTraLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public int countByMotCuaPhieuXuLyPhu(java.lang.String doiTuong,
		java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return _daKiemTraLocalService.countByMotCuaPhieuXuLyPhu(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.DaKiemTra> findByMotCuaPhieuXuLyPhu(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return _daKiemTraLocalService.findByMotCuaPhieuXuLyPhu(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.DaKiemTra> findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return _daKiemTraLocalService.findMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	@Override
	public int countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(
		java.lang.String doiTuong, java.lang.String maSoBienNhan, long userid,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String maSoHoSo, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return _daKiemTraLocalService.countMotCuaPhieuXuLyPhuByHoSoThuTucIdAndDoiTuongAndMaSoBienNhanBienBanKiemTra(doiTuong,
			maSoBienNhan, userid, nhomPhieuXuLy, organizationId,
			phanNhomHoSoId, thuTucHanhChinhId, maSoHoSo, ngayNopFrom,
			ngayNopTo, tenDoanhNghiep, year);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DaKiemTraLocalService getWrappedDaKiemTraLocalService() {
		return _daKiemTraLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDaKiemTraLocalService(
		DaKiemTraLocalService daKiemTraLocalService) {
		_daKiemTraLocalService = daKiemTraLocalService;
	}

	@Override
	public DaKiemTraLocalService getWrappedService() {
		return _daKiemTraLocalService;
	}

	@Override
	public void setWrappedService(DaKiemTraLocalService daKiemTraLocalService) {
		_daKiemTraLocalService = daKiemTraLocalService;
	}

	private DaKiemTraLocalService _daKiemTraLocalService;
}