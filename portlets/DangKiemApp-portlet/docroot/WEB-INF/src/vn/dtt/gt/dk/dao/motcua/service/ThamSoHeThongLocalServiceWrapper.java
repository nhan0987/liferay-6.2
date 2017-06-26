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
 * Provides a wrapper for {@link ThamSoHeThongLocalService}.
 *
 * @author win_64
 * @see ThamSoHeThongLocalService
 * @generated
 */
public class ThamSoHeThongLocalServiceWrapper
	implements ThamSoHeThongLocalService,
		ServiceWrapper<ThamSoHeThongLocalService> {
	public ThamSoHeThongLocalServiceWrapper(
		ThamSoHeThongLocalService thamSoHeThongLocalService) {
		_thamSoHeThongLocalService = thamSoHeThongLocalService;
	}

	/**
	* Adds the tham so he thong to the database. Also notifies the appropriate model listeners.
	*
	* @param thamSoHeThong the tham so he thong
	* @return the tham so he thong that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong addThamSoHeThong(
		vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong thamSoHeThong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thamSoHeThongLocalService.addThamSoHeThong(thamSoHeThong);
	}

	/**
	* Creates a new tham so he thong with the primary key. Does not add the tham so he thong to the database.
	*
	* @param id the primary key for the new tham so he thong
	* @return the new tham so he thong
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong createThamSoHeThong(
		long id) {
		return _thamSoHeThongLocalService.createThamSoHeThong(id);
	}

	/**
	* Deletes the tham so he thong with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tham so he thong
	* @return the tham so he thong that was removed
	* @throws PortalException if a tham so he thong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong deleteThamSoHeThong(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thamSoHeThongLocalService.deleteThamSoHeThong(id);
	}

	/**
	* Deletes the tham so he thong from the database. Also notifies the appropriate model listeners.
	*
	* @param thamSoHeThong the tham so he thong
	* @return the tham so he thong that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong deleteThamSoHeThong(
		vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong thamSoHeThong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thamSoHeThongLocalService.deleteThamSoHeThong(thamSoHeThong);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _thamSoHeThongLocalService.dynamicQuery();
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
		return _thamSoHeThongLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.ThamSoHeThongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _thamSoHeThongLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.ThamSoHeThongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _thamSoHeThongLocalService.dynamicQuery(dynamicQuery, start,
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
		return _thamSoHeThongLocalService.dynamicQueryCount(dynamicQuery);
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
		return _thamSoHeThongLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong fetchThamSoHeThong(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _thamSoHeThongLocalService.fetchThamSoHeThong(id);
	}

	/**
	* Returns the tham so he thong with the primary key.
	*
	* @param id the primary key of the tham so he thong
	* @return the tham so he thong
	* @throws PortalException if a tham so he thong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong getThamSoHeThong(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thamSoHeThongLocalService.getThamSoHeThong(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thamSoHeThongLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tham so he thongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.ThamSoHeThongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tham so he thongs
	* @param end the upper bound of the range of tham so he thongs (not inclusive)
	* @return the range of tham so he thongs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong> getThamSoHeThongs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thamSoHeThongLocalService.getThamSoHeThongs(start, end);
	}

	/**
	* Returns the number of tham so he thongs.
	*
	* @return the number of tham so he thongs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getThamSoHeThongsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thamSoHeThongLocalService.getThamSoHeThongsCount();
	}

	/**
	* Updates the tham so he thong in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thamSoHeThong the tham so he thong
	* @return the tham so he thong that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong updateThamSoHeThong(
		vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong thamSoHeThong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thamSoHeThongLocalService.updateThamSoHeThong(thamSoHeThong);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _thamSoHeThongLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_thamSoHeThongLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _thamSoHeThongLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.motcua.model.ThamSoHeThong findByKeyData(
		java.lang.String keyData) {
		return _thamSoHeThongLocalService.findByKeyData(keyData);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ThamSoHeThongLocalService getWrappedThamSoHeThongLocalService() {
		return _thamSoHeThongLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedThamSoHeThongLocalService(
		ThamSoHeThongLocalService thamSoHeThongLocalService) {
		_thamSoHeThongLocalService = thamSoHeThongLocalService;
	}

	@Override
	public ThamSoHeThongLocalService getWrappedService() {
		return _thamSoHeThongLocalService;
	}

	@Override
	public void setWrappedService(
		ThamSoHeThongLocalService thamSoHeThongLocalService) {
		_thamSoHeThongLocalService = thamSoHeThongLocalService;
	}

	private ThamSoHeThongLocalService _thamSoHeThongLocalService;
}