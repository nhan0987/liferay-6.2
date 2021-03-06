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
 * Provides a wrapper for {@link MotCuaPhieuXuLyChinhLocalService}.
 *
 * @author win_64
 * @see MotCuaPhieuXuLyChinhLocalService
 * @generated
 */
public class MotCuaPhieuXuLyChinhLocalServiceWrapper
	implements MotCuaPhieuXuLyChinhLocalService,
		ServiceWrapper<MotCuaPhieuXuLyChinhLocalService> {
	public MotCuaPhieuXuLyChinhLocalServiceWrapper(
		MotCuaPhieuXuLyChinhLocalService motCuaPhieuXuLyChinhLocalService) {
		_motCuaPhieuXuLyChinhLocalService = motCuaPhieuXuLyChinhLocalService;
	}

	/**
	* Adds the mot cua phieu xu ly chinh to the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLyChinh the mot cua phieu xu ly chinh
	* @return the mot cua phieu xu ly chinh that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh addMotCuaPhieuXuLyChinh(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyChinhLocalService.addMotCuaPhieuXuLyChinh(motCuaPhieuXuLyChinh);
	}

	/**
	* Creates a new mot cua phieu xu ly chinh with the primary key. Does not add the mot cua phieu xu ly chinh to the database.
	*
	* @param id the primary key for the new mot cua phieu xu ly chinh
	* @return the new mot cua phieu xu ly chinh
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh createMotCuaPhieuXuLyChinh(
		long id) {
		return _motCuaPhieuXuLyChinhLocalService.createMotCuaPhieuXuLyChinh(id);
	}

	/**
	* Deletes the mot cua phieu xu ly chinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua phieu xu ly chinh
	* @return the mot cua phieu xu ly chinh that was removed
	* @throws PortalException if a mot cua phieu xu ly chinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh deleteMotCuaPhieuXuLyChinh(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyChinhLocalService.deleteMotCuaPhieuXuLyChinh(id);
	}

	/**
	* Deletes the mot cua phieu xu ly chinh from the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLyChinh the mot cua phieu xu ly chinh
	* @return the mot cua phieu xu ly chinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh deleteMotCuaPhieuXuLyChinh(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyChinhLocalService.deleteMotCuaPhieuXuLyChinh(motCuaPhieuXuLyChinh);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _motCuaPhieuXuLyChinhLocalService.dynamicQuery();
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
		return _motCuaPhieuXuLyChinhLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyChinhLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyChinhLocalService.dynamicQuery(dynamicQuery,
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
		return _motCuaPhieuXuLyChinhLocalService.dynamicQueryCount(dynamicQuery);
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
		return _motCuaPhieuXuLyChinhLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh fetchMotCuaPhieuXuLyChinh(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyChinhLocalService.fetchMotCuaPhieuXuLyChinh(id);
	}

	/**
	* Returns the mot cua phieu xu ly chinh with the primary key.
	*
	* @param id the primary key of the mot cua phieu xu ly chinh
	* @return the mot cua phieu xu ly chinh
	* @throws PortalException if a mot cua phieu xu ly chinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh getMotCuaPhieuXuLyChinh(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyChinhLocalService.getMotCuaPhieuXuLyChinh(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyChinhLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh> getMotCuaPhieuXuLyChinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyChinhLocalService.getMotCuaPhieuXuLyChinhs(start,
			end);
	}

	/**
	* Returns the number of mot cua phieu xu ly chinhs.
	*
	* @return the number of mot cua phieu xu ly chinhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getMotCuaPhieuXuLyChinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyChinhLocalService.getMotCuaPhieuXuLyChinhsCount();
	}

	/**
	* Updates the mot cua phieu xu ly chinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param motCuaPhieuXuLyChinh the mot cua phieu xu ly chinh
	* @return the mot cua phieu xu ly chinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh updateMotCuaPhieuXuLyChinh(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh motCuaPhieuXuLyChinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaPhieuXuLyChinhLocalService.updateMotCuaPhieuXuLyChinh(motCuaPhieuXuLyChinh);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _motCuaPhieuXuLyChinhLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_motCuaPhieuXuLyChinhLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _motCuaPhieuXuLyChinhLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh findByHoSoThuTucIdAndQuyTrinhThuTucId(
		long HoSoThuTucId, long QuyTrinhThuTucId) {
		return _motCuaPhieuXuLyChinhLocalService.findByHoSoThuTucIdAndQuyTrinhThuTucId(HoSoThuTucId,
			QuyTrinhThuTucId);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh findByHoSoThuTucId(
		long hoSoThuTucId) {
		return _motCuaPhieuXuLyChinhLocalService.findByHoSoThuTucId(hoSoThuTucId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh> findMotCuaPhieuXuLyChinhByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String hoSoThuTucId, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return _motCuaPhieuXuLyChinhLocalService.findMotCuaPhieuXuLyChinhByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, hoSoThuTucId,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year, start, end);
	}

	@Override
	public int countMotCuaPhieuXuLyChinhByHoSoThuTucId(
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String hoSoThuTucId, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return _motCuaPhieuXuLyChinhLocalService.countMotCuaPhieuXuLyChinhByHoSoThuTucId(nhomPhieuXuLy,
			organizationId, phanNhomHoSoId, thuTucHanhChinhId, hoSoThuTucId,
			ngayNopFrom, ngayNopTo, tenDoanhNghiep, year);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyChinh> findMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String hoSoThuTucId, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year,
		int start, int end) {
		return _motCuaPhieuXuLyChinhLocalService.findMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,
			maSoBienNhan, nhomPhieuXuLy, organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, hoSoThuTucId, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year, start, end);
	}

	@Override
	public int countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(
		java.lang.String doiTuong, java.lang.String maSoBienNhan,
		java.lang.String nhomPhieuXuLy, long organizationId,
		long phanNhomHoSoId, java.lang.String thuTucHanhChinhId,
		java.lang.String hoSoThuTucId, java.lang.String ngayNopFrom,
		java.lang.String ngayNopTo, java.lang.String tenDoanhNghiep, int year) {
		return _motCuaPhieuXuLyChinhLocalService.countMotCuaPhieuXuLyChinhByHoSoThuTucIdAndDoiTuongAndMaSoBienNhan(doiTuong,
			maSoBienNhan, nhomPhieuXuLy, organizationId, phanNhomHoSoId,
			thuTucHanhChinhId, hoSoThuTucId, ngayNopFrom, ngayNopTo,
			tenDoanhNghiep, year);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MotCuaPhieuXuLyChinhLocalService getWrappedMotCuaPhieuXuLyChinhLocalService() {
		return _motCuaPhieuXuLyChinhLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMotCuaPhieuXuLyChinhLocalService(
		MotCuaPhieuXuLyChinhLocalService motCuaPhieuXuLyChinhLocalService) {
		_motCuaPhieuXuLyChinhLocalService = motCuaPhieuXuLyChinhLocalService;
	}

	@Override
	public MotCuaPhieuXuLyChinhLocalService getWrappedService() {
		return _motCuaPhieuXuLyChinhLocalService;
	}

	@Override
	public void setWrappedService(
		MotCuaPhieuXuLyChinhLocalService motCuaPhieuXuLyChinhLocalService) {
		_motCuaPhieuXuLyChinhLocalService = motCuaPhieuXuLyChinhLocalService;
	}

	private MotCuaPhieuXuLyChinhLocalService _motCuaPhieuXuLyChinhLocalService;
}