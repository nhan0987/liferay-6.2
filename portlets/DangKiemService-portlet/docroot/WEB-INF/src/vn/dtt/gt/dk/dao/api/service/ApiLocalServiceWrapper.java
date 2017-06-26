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

package vn.dtt.gt.dk.dao.api.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ApiLocalService}.
 *
 * @author huymq
 * @see ApiLocalService
 * @generated
 */
public class ApiLocalServiceWrapper implements ApiLocalService,
	ServiceWrapper<ApiLocalService> {
	public ApiLocalServiceWrapper(ApiLocalService apiLocalService) {
		_apiLocalService = apiLocalService;
	}

	/**
	* Adds the api to the database. Also notifies the appropriate model listeners.
	*
	* @param api the api
	* @return the api that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.api.model.Api addApi(
		vn.dtt.gt.dk.dao.api.model.Api api)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiLocalService.addApi(api);
	}

	/**
	* Creates a new api with the primary key. Does not add the api to the database.
	*
	* @param id the primary key for the new api
	* @return the new api
	*/
	@Override
	public vn.dtt.gt.dk.dao.api.model.Api createApi(long id) {
		return _apiLocalService.createApi(id);
	}

	/**
	* Deletes the api with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the api
	* @return the api that was removed
	* @throws PortalException if a api with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.api.model.Api deleteApi(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _apiLocalService.deleteApi(id);
	}

	/**
	* Deletes the api from the database. Also notifies the appropriate model listeners.
	*
	* @param api the api
	* @return the api that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.api.model.Api deleteApi(
		vn.dtt.gt.dk.dao.api.model.Api api)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiLocalService.deleteApi(api);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _apiLocalService.dynamicQuery();
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
		return _apiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _apiLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _apiLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _apiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _apiLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.api.model.Api fetchApi(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiLocalService.fetchApi(id);
	}

	/**
	* Returns the api with the primary key.
	*
	* @param id the primary key of the api
	* @return the api
	* @throws PortalException if a api with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.api.model.Api getApi(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _apiLocalService.getApi(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _apiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the apis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of apis
	* @param end the upper bound of the range of apis (not inclusive)
	* @return the range of apis
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.api.model.Api> getApis(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _apiLocalService.getApis(start, end);
	}

	/**
	* Returns the number of apis.
	*
	* @return the number of apis
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getApisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiLocalService.getApisCount();
	}

	/**
	* Updates the api in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param api the api
	* @return the api that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.api.model.Api updateApi(
		vn.dtt.gt.dk.dao.api.model.Api api)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apiLocalService.updateApi(api);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _apiLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_apiLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _apiLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.api.model.Api addApiLog(java.lang.String code,
		java.lang.String request,
		com.liferay.portal.service.ServiceContext serviceContext) {
		return _apiLocalService.addApiLog(code, request, serviceContext);
	}

	@Override
	public vn.dtt.gt.dk.dao.api.model.Api updateApiLog(
		vn.dtt.gt.dk.dao.api.model.Api apiLog, java.lang.String response) {
		return _apiLocalService.updateApiLog(apiLog, response);
	}

	@Override
	public vn.dtt.gt.dk.dao.api.model.Api updateApiLog(
		vn.dtt.gt.dk.dao.api.model.Api apiLog,
		java.lang.String registeredNumber, java.lang.String response) {
		return _apiLocalService.updateApiLog(apiLog, registeredNumber, response);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ApiLocalService getWrappedApiLocalService() {
		return _apiLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedApiLocalService(ApiLocalService apiLocalService) {
		_apiLocalService = apiLocalService;
	}

	@Override
	public ApiLocalService getWrappedService() {
		return _apiLocalService;
	}

	@Override
	public void setWrappedService(ApiLocalService apiLocalService) {
		_apiLocalService = apiLocalService;
	}

	private ApiLocalService _apiLocalService;
}