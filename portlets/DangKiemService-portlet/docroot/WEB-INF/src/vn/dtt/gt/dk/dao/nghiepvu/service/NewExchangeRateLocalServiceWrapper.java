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

package vn.dtt.gt.dk.dao.nghiepvu.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NewExchangeRateLocalService}.
 *
 * @author huymq
 * @see NewExchangeRateLocalService
 * @generated
 */
public class NewExchangeRateLocalServiceWrapper
	implements NewExchangeRateLocalService,
		ServiceWrapper<NewExchangeRateLocalService> {
	public NewExchangeRateLocalServiceWrapper(
		NewExchangeRateLocalService newExchangeRateLocalService) {
		_newExchangeRateLocalService = newExchangeRateLocalService;
	}

	/**
	* Adds the new exchange rate to the database. Also notifies the appropriate model listeners.
	*
	* @param newExchangeRate the new exchange rate
	* @return the new exchange rate that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate addNewExchangeRate(
		vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate newExchangeRate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newExchangeRateLocalService.addNewExchangeRate(newExchangeRate);
	}

	/**
	* Creates a new new exchange rate with the primary key. Does not add the new exchange rate to the database.
	*
	* @param id the primary key for the new new exchange rate
	* @return the new new exchange rate
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate createNewExchangeRate(
		long id) {
		return _newExchangeRateLocalService.createNewExchangeRate(id);
	}

	/**
	* Deletes the new exchange rate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the new exchange rate
	* @return the new exchange rate that was removed
	* @throws PortalException if a new exchange rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate deleteNewExchangeRate(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _newExchangeRateLocalService.deleteNewExchangeRate(id);
	}

	/**
	* Deletes the new exchange rate from the database. Also notifies the appropriate model listeners.
	*
	* @param newExchangeRate the new exchange rate
	* @return the new exchange rate that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate deleteNewExchangeRate(
		vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate newExchangeRate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newExchangeRateLocalService.deleteNewExchangeRate(newExchangeRate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _newExchangeRateLocalService.dynamicQuery();
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
		return _newExchangeRateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _newExchangeRateLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _newExchangeRateLocalService.dynamicQuery(dynamicQuery, start,
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
		return _newExchangeRateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _newExchangeRateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate fetchNewExchangeRate(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _newExchangeRateLocalService.fetchNewExchangeRate(id);
	}

	/**
	* Returns the new exchange rate with the primary key.
	*
	* @param id the primary key of the new exchange rate
	* @return the new exchange rate
	* @throws PortalException if a new exchange rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate getNewExchangeRate(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _newExchangeRateLocalService.getNewExchangeRate(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _newExchangeRateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the new exchange rates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.NewExchangeRateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of new exchange rates
	* @param end the upper bound of the range of new exchange rates (not inclusive)
	* @return the range of new exchange rates
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate> getNewExchangeRates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newExchangeRateLocalService.getNewExchangeRates(start, end);
	}

	/**
	* Returns the number of new exchange rates.
	*
	* @return the number of new exchange rates
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNewExchangeRatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newExchangeRateLocalService.getNewExchangeRatesCount();
	}

	/**
	* Updates the new exchange rate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param newExchangeRate the new exchange rate
	* @return the new exchange rate that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate updateNewExchangeRate(
		vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate newExchangeRate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _newExchangeRateLocalService.updateNewExchangeRate(newExchangeRate);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _newExchangeRateLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_newExchangeRateLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _newExchangeRateLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate> findByOriginalCurrencyBasicCurrency(
		java.lang.String originalCurrency, java.lang.String basicCurrency) {
		return _newExchangeRateLocalService.findByOriginalCurrencyBasicCurrency(originalCurrency,
			basicCurrency);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public NewExchangeRateLocalService getWrappedNewExchangeRateLocalService() {
		return _newExchangeRateLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedNewExchangeRateLocalService(
		NewExchangeRateLocalService newExchangeRateLocalService) {
		_newExchangeRateLocalService = newExchangeRateLocalService;
	}

	@Override
	public NewExchangeRateLocalService getWrappedService() {
		return _newExchangeRateLocalService;
	}

	@Override
	public void setWrappedService(
		NewExchangeRateLocalService newExchangeRateLocalService) {
		_newExchangeRateLocalService = newExchangeRateLocalService;
	}

	private NewExchangeRateLocalService _newExchangeRateLocalService;
}