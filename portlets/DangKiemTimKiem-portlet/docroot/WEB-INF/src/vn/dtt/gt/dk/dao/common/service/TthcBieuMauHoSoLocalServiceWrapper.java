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
 * Provides a wrapper for {@link TthcBieuMauHoSoLocalService}.
 *
 * @author win_64
 * @see TthcBieuMauHoSoLocalService
 * @generated
 */
public class TthcBieuMauHoSoLocalServiceWrapper
	implements TthcBieuMauHoSoLocalService,
		ServiceWrapper<TthcBieuMauHoSoLocalService> {
	public TthcBieuMauHoSoLocalServiceWrapper(
		TthcBieuMauHoSoLocalService tthcBieuMauHoSoLocalService) {
		_tthcBieuMauHoSoLocalService = tthcBieuMauHoSoLocalService;
	}

	/**
	* Adds the tthc bieu mau ho so to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcBieuMauHoSo the tthc bieu mau ho so
	* @return the tthc bieu mau ho so that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo addTthcBieuMauHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo tthcBieuMauHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcBieuMauHoSoLocalService.addTthcBieuMauHoSo(tthcBieuMauHoSo);
	}

	/**
	* Creates a new tthc bieu mau ho so with the primary key. Does not add the tthc bieu mau ho so to the database.
	*
	* @param Id the primary key for the new tthc bieu mau ho so
	* @return the new tthc bieu mau ho so
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo createTthcBieuMauHoSo(
		long Id) {
		return _tthcBieuMauHoSoLocalService.createTthcBieuMauHoSo(Id);
	}

	/**
	* Deletes the tthc bieu mau ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tthc bieu mau ho so
	* @return the tthc bieu mau ho so that was removed
	* @throws PortalException if a tthc bieu mau ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo deleteTthcBieuMauHoSo(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcBieuMauHoSoLocalService.deleteTthcBieuMauHoSo(Id);
	}

	/**
	* Deletes the tthc bieu mau ho so from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcBieuMauHoSo the tthc bieu mau ho so
	* @return the tthc bieu mau ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo deleteTthcBieuMauHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo tthcBieuMauHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcBieuMauHoSoLocalService.deleteTthcBieuMauHoSo(tthcBieuMauHoSo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tthcBieuMauHoSoLocalService.dynamicQuery();
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
		return _tthcBieuMauHoSoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcBieuMauHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcBieuMauHoSoLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcBieuMauHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcBieuMauHoSoLocalService.dynamicQuery(dynamicQuery, start,
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
		return _tthcBieuMauHoSoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tthcBieuMauHoSoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo fetchTthcBieuMauHoSo(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcBieuMauHoSoLocalService.fetchTthcBieuMauHoSo(Id);
	}

	/**
	* Returns the tthc bieu mau ho so with the primary key.
	*
	* @param Id the primary key of the tthc bieu mau ho so
	* @return the tthc bieu mau ho so
	* @throws PortalException if a tthc bieu mau ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo getTthcBieuMauHoSo(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcBieuMauHoSoLocalService.getTthcBieuMauHoSo(Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcBieuMauHoSoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tthc bieu mau ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcBieuMauHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc bieu mau ho sos
	* @param end the upper bound of the range of tthc bieu mau ho sos (not inclusive)
	* @return the range of tthc bieu mau ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo> getTthcBieuMauHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcBieuMauHoSoLocalService.getTthcBieuMauHoSos(start, end);
	}

	/**
	* Returns the number of tthc bieu mau ho sos.
	*
	* @return the number of tthc bieu mau ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTthcBieuMauHoSosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcBieuMauHoSoLocalService.getTthcBieuMauHoSosCount();
	}

	/**
	* Updates the tthc bieu mau ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcBieuMauHoSo the tthc bieu mau ho so
	* @return the tthc bieu mau ho so that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo updateTthcBieuMauHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcBieuMauHoSo tthcBieuMauHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcBieuMauHoSoLocalService.updateTthcBieuMauHoSo(tthcBieuMauHoSo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tthcBieuMauHoSoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tthcBieuMauHoSoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tthcBieuMauHoSoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TthcBieuMauHoSoLocalService getWrappedTthcBieuMauHoSoLocalService() {
		return _tthcBieuMauHoSoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTthcBieuMauHoSoLocalService(
		TthcBieuMauHoSoLocalService tthcBieuMauHoSoLocalService) {
		_tthcBieuMauHoSoLocalService = tthcBieuMauHoSoLocalService;
	}

	@Override
	public TthcBieuMauHoSoLocalService getWrappedService() {
		return _tthcBieuMauHoSoLocalService;
	}

	@Override
	public void setWrappedService(
		TthcBieuMauHoSoLocalService tthcBieuMauHoSoLocalService) {
		_tthcBieuMauHoSoLocalService = tthcBieuMauHoSoLocalService;
	}

	private TthcBieuMauHoSoLocalService _tthcBieuMauHoSoLocalService;
}