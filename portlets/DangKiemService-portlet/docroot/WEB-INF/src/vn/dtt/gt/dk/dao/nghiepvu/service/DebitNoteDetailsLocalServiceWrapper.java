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
 * Provides a wrapper for {@link DebitNoteDetailsLocalService}.
 *
 * @author huymq
 * @see DebitNoteDetailsLocalService
 * @generated
 */
public class DebitNoteDetailsLocalServiceWrapper
	implements DebitNoteDetailsLocalService,
		ServiceWrapper<DebitNoteDetailsLocalService> {
	public DebitNoteDetailsLocalServiceWrapper(
		DebitNoteDetailsLocalService debitNoteDetailsLocalService) {
		_debitNoteDetailsLocalService = debitNoteDetailsLocalService;
	}

	/**
	* Adds the debit note details to the database. Also notifies the appropriate model listeners.
	*
	* @param debitNoteDetails the debit note details
	* @return the debit note details that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails addDebitNoteDetails(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails debitNoteDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteDetailsLocalService.addDebitNoteDetails(debitNoteDetails);
	}

	/**
	* Creates a new debit note details with the primary key. Does not add the debit note details to the database.
	*
	* @param id the primary key for the new debit note details
	* @return the new debit note details
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails createDebitNoteDetails(
		long id) {
		return _debitNoteDetailsLocalService.createDebitNoteDetails(id);
	}

	/**
	* Deletes the debit note details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the debit note details
	* @return the debit note details that was removed
	* @throws PortalException if a debit note details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails deleteDebitNoteDetails(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteDetailsLocalService.deleteDebitNoteDetails(id);
	}

	/**
	* Deletes the debit note details from the database. Also notifies the appropriate model listeners.
	*
	* @param debitNoteDetails the debit note details
	* @return the debit note details that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails deleteDebitNoteDetails(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails debitNoteDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteDetailsLocalService.deleteDebitNoteDetails(debitNoteDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _debitNoteDetailsLocalService.dynamicQuery();
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
		return _debitNoteDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _debitNoteDetailsLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _debitNoteDetailsLocalService.dynamicQuery(dynamicQuery, start,
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
		return _debitNoteDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _debitNoteDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails fetchDebitNoteDetails(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteDetailsLocalService.fetchDebitNoteDetails(id);
	}

	/**
	* Returns the debit note details with the primary key.
	*
	* @param id the primary key of the debit note details
	* @return the debit note details
	* @throws PortalException if a debit note details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails getDebitNoteDetails(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteDetailsLocalService.getDebitNoteDetails(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the debit note detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of debit note detailses
	* @param end the upper bound of the range of debit note detailses (not inclusive)
	* @return the range of debit note detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails> getDebitNoteDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteDetailsLocalService.getDebitNoteDetailses(start, end);
	}

	/**
	* Returns the number of debit note detailses.
	*
	* @return the number of debit note detailses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDebitNoteDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteDetailsLocalService.getDebitNoteDetailsesCount();
	}

	/**
	* Updates the debit note details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param debitNoteDetails the debit note details
	* @return the debit note details that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails updateDebitNoteDetails(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails debitNoteDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteDetailsLocalService.updateDebitNoteDetails(debitNoteDetails);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _debitNoteDetailsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_debitNoteDetailsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _debitNoteDetailsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails findByVehicleRecordId(
		long vehicleRecordId) {
		return _debitNoteDetailsLocalService.findByVehicleRecordId(vehicleRecordId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails> findByDebitNoteId(
		long debitNoteId) {
		return _debitNoteDetailsLocalService.findByDebitNoteId(debitNoteId);
	}

	@Override
	public int countByDebitNoteId(long debitNoteId) {
		return _debitNoteDetailsLocalService.countByDebitNoteId(debitNoteId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DebitNoteDetailsLocalService getWrappedDebitNoteDetailsLocalService() {
		return _debitNoteDetailsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDebitNoteDetailsLocalService(
		DebitNoteDetailsLocalService debitNoteDetailsLocalService) {
		_debitNoteDetailsLocalService = debitNoteDetailsLocalService;
	}

	@Override
	public DebitNoteDetailsLocalService getWrappedService() {
		return _debitNoteDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		DebitNoteDetailsLocalService debitNoteDetailsLocalService) {
		_debitNoteDetailsLocalService = debitNoteDetailsLocalService;
	}

	private DebitNoteDetailsLocalService _debitNoteDetailsLocalService;
}