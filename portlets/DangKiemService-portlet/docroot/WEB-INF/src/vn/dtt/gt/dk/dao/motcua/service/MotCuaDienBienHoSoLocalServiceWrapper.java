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
 * Provides a wrapper for {@link MotCuaDienBienHoSoLocalService}.
 *
 * @author huymq
 * @see MotCuaDienBienHoSoLocalService
 * @generated
 */
public class MotCuaDienBienHoSoLocalServiceWrapper
	implements MotCuaDienBienHoSoLocalService,
		ServiceWrapper<MotCuaDienBienHoSoLocalService> {
	public MotCuaDienBienHoSoLocalServiceWrapper(
		MotCuaDienBienHoSoLocalService motCuaDienBienHoSoLocalService) {
		_motCuaDienBienHoSoLocalService = motCuaDienBienHoSoLocalService;
	}

	/**
	* Adds the mot cua dien bien ho so to the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaDienBienHoSo the mot cua dien bien ho so
	* @return the mot cua dien bien ho so that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo addMotCuaDienBienHoSo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo motCuaDienBienHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDienBienHoSoLocalService.addMotCuaDienBienHoSo(motCuaDienBienHoSo);
	}

	/**
	* Creates a new mot cua dien bien ho so with the primary key. Does not add the mot cua dien bien ho so to the database.
	*
	* @param id the primary key for the new mot cua dien bien ho so
	* @return the new mot cua dien bien ho so
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo createMotCuaDienBienHoSo(
		long id) {
		return _motCuaDienBienHoSoLocalService.createMotCuaDienBienHoSo(id);
	}

	/**
	* Deletes the mot cua dien bien ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua dien bien ho so
	* @return the mot cua dien bien ho so that was removed
	* @throws PortalException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo deleteMotCuaDienBienHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDienBienHoSoLocalService.deleteMotCuaDienBienHoSo(id);
	}

	/**
	* Deletes the mot cua dien bien ho so from the database. Also notifies the appropriate model listeners.
	*
	* @param motCuaDienBienHoSo the mot cua dien bien ho so
	* @return the mot cua dien bien ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo deleteMotCuaDienBienHoSo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo motCuaDienBienHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDienBienHoSoLocalService.deleteMotCuaDienBienHoSo(motCuaDienBienHoSo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _motCuaDienBienHoSoLocalService.dynamicQuery();
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
		return _motCuaDienBienHoSoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _motCuaDienBienHoSoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _motCuaDienBienHoSoLocalService.dynamicQuery(dynamicQuery,
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
		return _motCuaDienBienHoSoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _motCuaDienBienHoSoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchMotCuaDienBienHoSo(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDienBienHoSoLocalService.fetchMotCuaDienBienHoSo(id);
	}

	/**
	* Returns the mot cua dien bien ho so with the primary key.
	*
	* @param id the primary key of the mot cua dien bien ho so
	* @return the mot cua dien bien ho so
	* @throws PortalException if a mot cua dien bien ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo getMotCuaDienBienHoSo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDienBienHoSoLocalService.getMotCuaDienBienHoSo(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDienBienHoSoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the mot cua dien bien ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaDienBienHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua dien bien ho sos
	* @param end the upper bound of the range of mot cua dien bien ho sos (not inclusive)
	* @return the range of mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> getMotCuaDienBienHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDienBienHoSoLocalService.getMotCuaDienBienHoSos(start, end);
	}

	/**
	* Returns the number of mot cua dien bien ho sos.
	*
	* @return the number of mot cua dien bien ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getMotCuaDienBienHoSosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDienBienHoSoLocalService.getMotCuaDienBienHoSosCount();
	}

	/**
	* Updates the mot cua dien bien ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param motCuaDienBienHoSo the mot cua dien bien ho so
	* @return the mot cua dien bien ho so that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo updateMotCuaDienBienHoSo(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo motCuaDienBienHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _motCuaDienBienHoSoLocalService.updateMotCuaDienBienHoSo(motCuaDienBienHoSo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _motCuaDienBienHoSoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_motCuaDienBienHoSoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _motCuaDienBienHoSoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiTruocId(
		long trangThaiTruocId) {
		return _motCuaDienBienHoSoLocalService.findByTrangThaiTruocId(trangThaiTruocId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findMotCuaDienBienHoSoByPhieuXuLyChinh(
		long phieuXuLyChinhId, int start, int end) {
		return _motCuaDienBienHoSoLocalService.findMotCuaDienBienHoSoByPhieuXuLyChinh(phieuXuLyChinhId,
			start, end);
	}

	@Override
	public int countMotCuaDienBienHoSoByPhieuXuLyChinh(long phieuXuLyChinhId) {
		return _motCuaDienBienHoSoLocalService.countMotCuaDienBienHoSoByPhieuXuLyChinh(phieuXuLyChinhId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByTrangThaiSauId(
		long trangThaiSauId) {
		return _motCuaDienBienHoSoLocalService.findByTrangThaiSauId(trangThaiSauId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId) {
		return _motCuaDienBienHoSoLocalService.findByPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId) {
		return _motCuaDienBienHoSoLocalService.findByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdTrangThaiTruocId(
		long phieuXuLyChinhId, long trangThaiTruocId) {
		return _motCuaDienBienHoSoLocalService.findByPhieuXuLyChinhIdTrangThaiTruocId(phieuXuLyChinhId,
			trangThaiTruocId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdTrangThaiSauId(
		long phieuXuLyChinhId, long trangThaiSauId) {
		return _motCuaDienBienHoSoLocalService.findByPhieuXuLyChinhIdTrangThaiSauId(phieuXuLyChinhId,
			trangThaiSauId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo> findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId) {
		return _motCuaDienBienHoSoLocalService.findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauId(phieuXuLyChinhId,
			trangThaiSauId, phieuXuLyPhuId);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo fetchByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		long nguoiXuLy) {
		return _motCuaDienBienHoSoLocalService.fetchByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(phieuXuLyChinhId,
			trangThaiSauId, phieuXuLyPhuId, nguoiXuLy);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.MotCuaDienBienHoSo findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(
		long phieuXuLyChinhId, long trangThaiSauId, long phieuXuLyPhuId,
		long nguoiXuLy) {
		return _motCuaDienBienHoSoLocalService.findByPhieuXuLyChinhIdPhieuXuLyPhuIdTrangThaiSauIdNguoiXuLy(phieuXuLyChinhId,
			trangThaiSauId, phieuXuLyPhuId, nguoiXuLy);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MotCuaDienBienHoSoLocalService getWrappedMotCuaDienBienHoSoLocalService() {
		return _motCuaDienBienHoSoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMotCuaDienBienHoSoLocalService(
		MotCuaDienBienHoSoLocalService motCuaDienBienHoSoLocalService) {
		_motCuaDienBienHoSoLocalService = motCuaDienBienHoSoLocalService;
	}

	@Override
	public MotCuaDienBienHoSoLocalService getWrappedService() {
		return _motCuaDienBienHoSoLocalService;
	}

	@Override
	public void setWrappedService(
		MotCuaDienBienHoSoLocalService motCuaDienBienHoSoLocalService) {
		_motCuaDienBienHoSoLocalService = motCuaDienBienHoSoLocalService;
	}

	private MotCuaDienBienHoSoLocalService _motCuaDienBienHoSoLocalService;
}