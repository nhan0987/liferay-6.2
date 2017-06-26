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
 * Provides a wrapper for {@link DebitNoteLocalService}.
 *
 * @author win_64
 * @see DebitNoteLocalService
 * @generated
 */
public class DebitNoteLocalServiceWrapper implements DebitNoteLocalService,
	ServiceWrapper<DebitNoteLocalService> {
	public DebitNoteLocalServiceWrapper(
		DebitNoteLocalService debitNoteLocalService) {
		_debitNoteLocalService = debitNoteLocalService;
	}

	/**
	* Adds the debit note to the database. Also notifies the appropriate model listeners.
	*
	* @param debitNote the debit note
	* @return the debit note that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote addDebitNote(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteLocalService.addDebitNote(debitNote);
	}

	/**
	* Creates a new debit note with the primary key. Does not add the debit note to the database.
	*
	* @param id the primary key for the new debit note
	* @return the new debit note
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote createDebitNote(long id) {
		return _debitNoteLocalService.createDebitNote(id);
	}

	/**
	* Deletes the debit note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the debit note
	* @return the debit note that was removed
	* @throws PortalException if a debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote deleteDebitNote(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteLocalService.deleteDebitNote(id);
	}

	/**
	* Deletes the debit note from the database. Also notifies the appropriate model listeners.
	*
	* @param debitNote the debit note
	* @return the debit note that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote deleteDebitNote(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteLocalService.deleteDebitNote(debitNote);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _debitNoteLocalService.dynamicQuery();
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
		return _debitNoteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _debitNoteLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _debitNoteLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _debitNoteLocalService.dynamicQueryCount(dynamicQuery);
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
		return _debitNoteLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote fetchDebitNote(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteLocalService.fetchDebitNote(id);
	}

	/**
	* Returns the debit note with the primary key.
	*
	* @param id the primary key of the debit note
	* @return the debit note
	* @throws PortalException if a debit note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote getDebitNote(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteLocalService.getDebitNote(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the debit notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of debit notes
	* @param end the upper bound of the range of debit notes (not inclusive)
	* @return the range of debit notes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> getDebitNotes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteLocalService.getDebitNotes(start, end);
	}

	/**
	* Returns the number of debit notes.
	*
	* @return the number of debit notes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDebitNotesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteLocalService.getDebitNotesCount();
	}

	/**
	* Updates the debit note in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param debitNote the debit note
	* @return the debit note that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote updateDebitNote(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _debitNoteLocalService.updateDebitNote(debitNote);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _debitNoteLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_debitNoteLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _debitNoteLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote findByTransactionId(
		java.lang.String transactionId) {
		return _debitNoteLocalService.findByTransactionId(transactionId);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote findByDebitNoteNumber(
		java.lang.String debitNoteNumber) {
		return _debitNoteLocalService.findByDebitNoteNumber(debitNoteNumber);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findByMarkAsDeleted(
		int markAsDeleted) {
		return _debitNoteLocalService.findByMarkAsDeleted(markAsDeleted);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findByMarkAsDeleted(
		int markAsDeleted, int start, int end) {
		return _debitNoteLocalService.findByMarkAsDeleted(markAsDeleted, start,
			end);
	}

	@Override
	public int countByMarkAsDeleted(int markAsDeleted) {
		return _debitNoteLocalService.countByMarkAsDeleted(markAsDeleted);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findDebitNote(
		java.lang.String data, int start, int end) {
		return _debitNoteLocalService.findDebitNote(data, start, end);
	}

	@Override
	public int countDebitNote(java.lang.String data) {
		return _debitNoteLocalService.countDebitNote(data);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> thongkeDebitNotePAID(
		java.lang.String data, java.lang.String ngayXacNhanThanhToan,
		int start, int end) {
		return _debitNoteLocalService.thongkeDebitNotePAID(data,
			ngayXacNhanThanhToan, start, end);
	}

	@Override
	public int countThongKeDebitNotePAID(java.lang.String data,
		java.lang.String ngayXacNhanThanhToan) {
		return _debitNoteLocalService.countThongKeDebitNotePAID(data,
			ngayXacNhanThanhToan);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findDebitNotePAID(
		java.lang.String data, int start, int end) {
		return _debitNoteLocalService.findDebitNotePAID(data, start, end);
	}

	@Override
	public int countDebitNotePAID(java.lang.String data) {
		return _debitNoteLocalService.countDebitNotePAID(data);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> findDebitNoteByIdCertificateRecord(
		long idCertificateRecord, int markasdelete) {
		return _debitNoteLocalService.findDebitNoteByIdCertificateRecord(idCertificateRecord,
			markasdelete);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DebitNoteLocalService getWrappedDebitNoteLocalService() {
		return _debitNoteLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDebitNoteLocalService(
		DebitNoteLocalService debitNoteLocalService) {
		_debitNoteLocalService = debitNoteLocalService;
	}

	@Override
	public DebitNoteLocalService getWrappedService() {
		return _debitNoteLocalService;
	}

	@Override
	public void setWrappedService(DebitNoteLocalService debitNoteLocalService) {
		_debitNoteLocalService = debitNoteLocalService;
	}

	private DebitNoteLocalService _debitNoteLocalService;
}