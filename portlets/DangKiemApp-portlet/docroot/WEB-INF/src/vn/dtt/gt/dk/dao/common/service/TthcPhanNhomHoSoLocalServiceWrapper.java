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

package vn.dtt.gt.dk.dao.common.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TthcPhanNhomHoSoLocalService}.
 *
 * @author win_64
 * @see TthcPhanNhomHoSoLocalService
 * @generated
 */
public class TthcPhanNhomHoSoLocalServiceWrapper
	implements TthcPhanNhomHoSoLocalService,
		ServiceWrapper<TthcPhanNhomHoSoLocalService> {
	public TthcPhanNhomHoSoLocalServiceWrapper(
		TthcPhanNhomHoSoLocalService tthcPhanNhomHoSoLocalService) {
		_tthcPhanNhomHoSoLocalService = tthcPhanNhomHoSoLocalService;
	}

	/**
	* Adds the tthc phan nhom ho so to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcPhanNhomHoSo the tthc phan nhom ho so
	* @return the tthc phan nhom ho so that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo addTthcPhanNhomHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo tthcPhanNhomHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcPhanNhomHoSoLocalService.addTthcPhanNhomHoSo(tthcPhanNhomHoSo);
	}

	/**
	* Creates a new tthc phan nhom ho so with the primary key. Does not add the tthc phan nhom ho so to the database.
	*
	* @param Id the primary key for the new tthc phan nhom ho so
	* @return the new tthc phan nhom ho so
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo createTthcPhanNhomHoSo(
		long Id) {
		return _tthcPhanNhomHoSoLocalService.createTthcPhanNhomHoSo(Id);
	}

	/**
	* Deletes the tthc phan nhom ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tthc phan nhom ho so
	* @return the tthc phan nhom ho so that was removed
	* @throws PortalException if a tthc phan nhom ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo deleteTthcPhanNhomHoSo(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcPhanNhomHoSoLocalService.deleteTthcPhanNhomHoSo(Id);
	}

	/**
	* Deletes the tthc phan nhom ho so from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcPhanNhomHoSo the tthc phan nhom ho so
	* @return the tthc phan nhom ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo deleteTthcPhanNhomHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo tthcPhanNhomHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcPhanNhomHoSoLocalService.deleteTthcPhanNhomHoSo(tthcPhanNhomHoSo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tthcPhanNhomHoSoLocalService.dynamicQuery();
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
		return _tthcPhanNhomHoSoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcPhanNhomHoSoLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcPhanNhomHoSoLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _tthcPhanNhomHoSoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tthcPhanNhomHoSoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo fetchTthcPhanNhomHoSo(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcPhanNhomHoSoLocalService.fetchTthcPhanNhomHoSo(Id);
	}

	/**
	* Returns the tthc phan nhom ho so with the primary key.
	*
	* @param Id the primary key of the tthc phan nhom ho so
	* @return the tthc phan nhom ho so
	* @throws PortalException if a tthc phan nhom ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo getTthcPhanNhomHoSo(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcPhanNhomHoSoLocalService.getTthcPhanNhomHoSo(Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcPhanNhomHoSoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tthc phan nhom ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc phan nhom ho sos
	* @param end the upper bound of the range of tthc phan nhom ho sos (not inclusive)
	* @return the range of tthc phan nhom ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo> getTthcPhanNhomHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcPhanNhomHoSoLocalService.getTthcPhanNhomHoSos(start, end);
	}

	/**
	* Returns the number of tthc phan nhom ho sos.
	*
	* @return the number of tthc phan nhom ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTthcPhanNhomHoSosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcPhanNhomHoSoLocalService.getTthcPhanNhomHoSosCount();
	}

	/**
	* Updates the tthc phan nhom ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcPhanNhomHoSo the tthc phan nhom ho so
	* @return the tthc phan nhom ho so that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo updateTthcPhanNhomHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo tthcPhanNhomHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcPhanNhomHoSoLocalService.updateTthcPhanNhomHoSo(tthcPhanNhomHoSo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tthcPhanNhomHoSoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tthcPhanNhomHoSoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tthcPhanNhomHoSoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo> findTthcPhanNhomHoSoByVaTroXuLy(
		java.lang.String vaiTroXuLy) {
		return _tthcPhanNhomHoSoLocalService.findTthcPhanNhomHoSoByVaTroXuLy(vaiTroXuLy);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSo> findTinNhanh(
		java.lang.String soThuTu) {
		return _tthcPhanNhomHoSoLocalService.findTinNhanh(soThuTu);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TthcPhanNhomHoSoLocalService getWrappedTthcPhanNhomHoSoLocalService() {
		return _tthcPhanNhomHoSoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTthcPhanNhomHoSoLocalService(
		TthcPhanNhomHoSoLocalService tthcPhanNhomHoSoLocalService) {
		_tthcPhanNhomHoSoLocalService = tthcPhanNhomHoSoLocalService;
	}

	@Override
	public TthcPhanNhomHoSoLocalService getWrappedService() {
		return _tthcPhanNhomHoSoLocalService;
	}

	@Override
	public void setWrappedService(
		TthcPhanNhomHoSoLocalService tthcPhanNhomHoSoLocalService) {
		_tthcPhanNhomHoSoLocalService = tthcPhanNhomHoSoLocalService;
	}

	private TthcPhanNhomHoSoLocalService _tthcPhanNhomHoSoLocalService;
}