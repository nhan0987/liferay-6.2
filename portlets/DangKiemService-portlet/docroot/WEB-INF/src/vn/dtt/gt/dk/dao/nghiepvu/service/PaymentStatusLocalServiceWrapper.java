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
 * Provides a wrapper for {@link PaymentStatusLocalService}.
 *
 * @author huymq
 * @see PaymentStatusLocalService
 * @generated
 */
public class PaymentStatusLocalServiceWrapper
	implements PaymentStatusLocalService,
		ServiceWrapper<PaymentStatusLocalService> {
	public PaymentStatusLocalServiceWrapper(
		PaymentStatusLocalService paymentStatusLocalService) {
		_paymentStatusLocalService = paymentStatusLocalService;
	}

	/**
	* Adds the payment status to the database. Also notifies the appropriate model listeners.
	*
	* @param paymentStatus the payment status
	* @return the payment status that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus addPaymentStatus(
		vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus paymentStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentStatusLocalService.addPaymentStatus(paymentStatus);
	}

	/**
	* Creates a new payment status with the primary key. Does not add the payment status to the database.
	*
	* @param id the primary key for the new payment status
	* @return the new payment status
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus createPaymentStatus(
		long id) {
		return _paymentStatusLocalService.createPaymentStatus(id);
	}

	/**
	* Deletes the payment status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the payment status
	* @return the payment status that was removed
	* @throws PortalException if a payment status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus deletePaymentStatus(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentStatusLocalService.deletePaymentStatus(id);
	}

	/**
	* Deletes the payment status from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentStatus the payment status
	* @return the payment status that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus deletePaymentStatus(
		vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus paymentStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentStatusLocalService.deletePaymentStatus(paymentStatus);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _paymentStatusLocalService.dynamicQuery();
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
		return _paymentStatusLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentStatusLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _paymentStatusLocalService.dynamicQuery(dynamicQuery, start,
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
		return _paymentStatusLocalService.dynamicQueryCount(dynamicQuery);
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
		return _paymentStatusLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus fetchPaymentStatus(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentStatusLocalService.fetchPaymentStatus(id);
	}

	/**
	* Returns the payment status with the primary key.
	*
	* @param id the primary key of the payment status
	* @return the payment status
	* @throws PortalException if a payment status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus getPaymentStatus(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentStatusLocalService.getPaymentStatus(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _paymentStatusLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the payment statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment statuses
	* @param end the upper bound of the range of payment statuses (not inclusive)
	* @return the range of payment statuses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> getPaymentStatuses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentStatusLocalService.getPaymentStatuses(start, end);
	}

	/**
	* Returns the number of payment statuses.
	*
	* @return the number of payment statuses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPaymentStatusesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentStatusLocalService.getPaymentStatusesCount();
	}

	/**
	* Updates the payment status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param paymentStatus the payment status
	* @return the payment status that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus updatePaymentStatus(
		vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus paymentStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _paymentStatusLocalService.updatePaymentStatus(paymentStatus);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _paymentStatusLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_paymentStatusLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _paymentStatusLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus findByVehicleRecordId(
		long vehicleRecordId) {
		return _paymentStatusLocalService.findByVehicleRecordId(vehicleRecordId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> findByDebitNoteNumber(
		java.lang.String debitNoteNumber) {
		return _paymentStatusLocalService.findByDebitNoteNumber(debitNoteNumber);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PaymentStatusLocalService getWrappedPaymentStatusLocalService() {
		return _paymentStatusLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPaymentStatusLocalService(
		PaymentStatusLocalService paymentStatusLocalService) {
		_paymentStatusLocalService = paymentStatusLocalService;
	}

	@Override
	public PaymentStatusLocalService getWrappedService() {
		return _paymentStatusLocalService;
	}

	@Override
	public void setWrappedService(
		PaymentStatusLocalService paymentStatusLocalService) {
		_paymentStatusLocalService = paymentStatusLocalService;
	}

	private PaymentStatusLocalService _paymentStatusLocalService;
}