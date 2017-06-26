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

package vn.dtt.gt.dk.dao.nghiepvu.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DebitNote}.
 * </p>
 *
 * @author huymq
 * @see DebitNote
 * @generated
 */
public class DebitNoteWrapper implements DebitNote, ModelWrapper<DebitNote> {
	public DebitNoteWrapper(DebitNote debitNote) {
		_debitNote = debitNote;
	}

	@Override
	public Class<?> getModelClass() {
		return DebitNote.class;
	}

	@Override
	public String getModelClassName() {
		return DebitNote.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("debitNoteNumber", getDebitNoteNumber());
		attributes.put("transactionId", getTransactionId());
		attributes.put("corporationId", getCorporationId());
		attributes.put("financialAccountant", getFinancialAccountant());
		attributes.put("organization", getOrganization());
		attributes.put("division", getDivision());
		attributes.put("reportBy", getReportBy());
		attributes.put("reportDate", getReportDate());
		attributes.put("fromDate", getFromDate());
		attributes.put("toDate", getToDate());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("totalPayment", getTotalPayment());
		attributes.put("paymentType", getPaymentType());
		attributes.put("markAsDeleted", getMarkAsDeleted());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String debitNoteNumber = (String)attributes.get("debitNoteNumber");

		if (debitNoteNumber != null) {
			setDebitNoteNumber(debitNoteNumber);
		}

		String transactionId = (String)attributes.get("transactionId");

		if (transactionId != null) {
			setTransactionId(transactionId);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		String financialAccountant = (String)attributes.get(
				"financialAccountant");

		if (financialAccountant != null) {
			setFinancialAccountant(financialAccountant);
		}

		String organization = (String)attributes.get("organization");

		if (organization != null) {
			setOrganization(organization);
		}

		String division = (String)attributes.get("division");

		if (division != null) {
			setDivision(division);
		}

		String reportBy = (String)attributes.get("reportBy");

		if (reportBy != null) {
			setReportBy(reportBy);
		}

		Date reportDate = (Date)attributes.get("reportDate");

		if (reportDate != null) {
			setReportDate(reportDate);
		}

		Date fromDate = (Date)attributes.get("fromDate");

		if (fromDate != null) {
			setFromDate(fromDate);
		}

		Date toDate = (Date)attributes.get("toDate");

		if (toDate != null) {
			setToDate(toDate);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		Double totalPayment = (Double)attributes.get("totalPayment");

		if (totalPayment != null) {
			setTotalPayment(totalPayment);
		}

		Long paymentType = (Long)attributes.get("paymentType");

		if (paymentType != null) {
			setPaymentType(paymentType);
		}

		Integer markAsDeleted = (Integer)attributes.get("markAsDeleted");

		if (markAsDeleted != null) {
			setMarkAsDeleted(markAsDeleted);
		}
	}

	/**
	* Returns the primary key of this debit note.
	*
	* @return the primary key of this debit note
	*/
	@Override
	public long getPrimaryKey() {
		return _debitNote.getPrimaryKey();
	}

	/**
	* Sets the primary key of this debit note.
	*
	* @param primaryKey the primary key of this debit note
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_debitNote.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this debit note.
	*
	* @return the ID of this debit note
	*/
	@Override
	public long getId() {
		return _debitNote.getId();
	}

	/**
	* Sets the ID of this debit note.
	*
	* @param id the ID of this debit note
	*/
	@Override
	public void setId(long id) {
		_debitNote.setId(id);
	}

	/**
	* Returns the debit note number of this debit note.
	*
	* @return the debit note number of this debit note
	*/
	@Override
	public java.lang.String getDebitNoteNumber() {
		return _debitNote.getDebitNoteNumber();
	}

	/**
	* Sets the debit note number of this debit note.
	*
	* @param debitNoteNumber the debit note number of this debit note
	*/
	@Override
	public void setDebitNoteNumber(java.lang.String debitNoteNumber) {
		_debitNote.setDebitNoteNumber(debitNoteNumber);
	}

	/**
	* Returns the transaction ID of this debit note.
	*
	* @return the transaction ID of this debit note
	*/
	@Override
	public java.lang.String getTransactionId() {
		return _debitNote.getTransactionId();
	}

	/**
	* Sets the transaction ID of this debit note.
	*
	* @param transactionId the transaction ID of this debit note
	*/
	@Override
	public void setTransactionId(java.lang.String transactionId) {
		_debitNote.setTransactionId(transactionId);
	}

	/**
	* Returns the corporation ID of this debit note.
	*
	* @return the corporation ID of this debit note
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _debitNote.getCorporationId();
	}

	/**
	* Sets the corporation ID of this debit note.
	*
	* @param corporationId the corporation ID of this debit note
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_debitNote.setCorporationId(corporationId);
	}

	/**
	* Returns the financial accountant of this debit note.
	*
	* @return the financial accountant of this debit note
	*/
	@Override
	public java.lang.String getFinancialAccountant() {
		return _debitNote.getFinancialAccountant();
	}

	/**
	* Sets the financial accountant of this debit note.
	*
	* @param financialAccountant the financial accountant of this debit note
	*/
	@Override
	public void setFinancialAccountant(java.lang.String financialAccountant) {
		_debitNote.setFinancialAccountant(financialAccountant);
	}

	/**
	* Returns the organization of this debit note.
	*
	* @return the organization of this debit note
	*/
	@Override
	public java.lang.String getOrganization() {
		return _debitNote.getOrganization();
	}

	/**
	* Sets the organization of this debit note.
	*
	* @param organization the organization of this debit note
	*/
	@Override
	public void setOrganization(java.lang.String organization) {
		_debitNote.setOrganization(organization);
	}

	/**
	* Returns the division of this debit note.
	*
	* @return the division of this debit note
	*/
	@Override
	public java.lang.String getDivision() {
		return _debitNote.getDivision();
	}

	/**
	* Sets the division of this debit note.
	*
	* @param division the division of this debit note
	*/
	@Override
	public void setDivision(java.lang.String division) {
		_debitNote.setDivision(division);
	}

	/**
	* Returns the report by of this debit note.
	*
	* @return the report by of this debit note
	*/
	@Override
	public java.lang.String getReportBy() {
		return _debitNote.getReportBy();
	}

	/**
	* Sets the report by of this debit note.
	*
	* @param reportBy the report by of this debit note
	*/
	@Override
	public void setReportBy(java.lang.String reportBy) {
		_debitNote.setReportBy(reportBy);
	}

	/**
	* Returns the report date of this debit note.
	*
	* @return the report date of this debit note
	*/
	@Override
	public java.util.Date getReportDate() {
		return _debitNote.getReportDate();
	}

	/**
	* Sets the report date of this debit note.
	*
	* @param reportDate the report date of this debit note
	*/
	@Override
	public void setReportDate(java.util.Date reportDate) {
		_debitNote.setReportDate(reportDate);
	}

	/**
	* Returns the from date of this debit note.
	*
	* @return the from date of this debit note
	*/
	@Override
	public java.util.Date getFromDate() {
		return _debitNote.getFromDate();
	}

	/**
	* Sets the from date of this debit note.
	*
	* @param fromDate the from date of this debit note
	*/
	@Override
	public void setFromDate(java.util.Date fromDate) {
		_debitNote.setFromDate(fromDate);
	}

	/**
	* Returns the to date of this debit note.
	*
	* @return the to date of this debit note
	*/
	@Override
	public java.util.Date getToDate() {
		return _debitNote.getToDate();
	}

	/**
	* Sets the to date of this debit note.
	*
	* @param toDate the to date of this debit note
	*/
	@Override
	public void setToDate(java.util.Date toDate) {
		_debitNote.setToDate(toDate);
	}

	/**
	* Returns the attached file of this debit note.
	*
	* @return the attached file of this debit note
	*/
	@Override
	public long getAttachedFile() {
		return _debitNote.getAttachedFile();
	}

	/**
	* Sets the attached file of this debit note.
	*
	* @param attachedFile the attached file of this debit note
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_debitNote.setAttachedFile(attachedFile);
	}

	/**
	* Returns the total payment of this debit note.
	*
	* @return the total payment of this debit note
	*/
	@Override
	public double getTotalPayment() {
		return _debitNote.getTotalPayment();
	}

	/**
	* Sets the total payment of this debit note.
	*
	* @param totalPayment the total payment of this debit note
	*/
	@Override
	public void setTotalPayment(double totalPayment) {
		_debitNote.setTotalPayment(totalPayment);
	}

	/**
	* Returns the payment type of this debit note.
	*
	* @return the payment type of this debit note
	*/
	@Override
	public long getPaymentType() {
		return _debitNote.getPaymentType();
	}

	/**
	* Sets the payment type of this debit note.
	*
	* @param paymentType the payment type of this debit note
	*/
	@Override
	public void setPaymentType(long paymentType) {
		_debitNote.setPaymentType(paymentType);
	}

	/**
	* Returns the mark as deleted of this debit note.
	*
	* @return the mark as deleted of this debit note
	*/
	@Override
	public int getMarkAsDeleted() {
		return _debitNote.getMarkAsDeleted();
	}

	/**
	* Sets the mark as deleted of this debit note.
	*
	* @param markAsDeleted the mark as deleted of this debit note
	*/
	@Override
	public void setMarkAsDeleted(int markAsDeleted) {
		_debitNote.setMarkAsDeleted(markAsDeleted);
	}

	@Override
	public boolean isNew() {
		return _debitNote.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_debitNote.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _debitNote.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_debitNote.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _debitNote.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _debitNote.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_debitNote.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _debitNote.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_debitNote.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_debitNote.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_debitNote.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DebitNoteWrapper((DebitNote)_debitNote.clone());
	}

	@Override
	public int compareTo(vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote debitNote) {
		return _debitNote.compareTo(debitNote);
	}

	@Override
	public int hashCode() {
		return _debitNote.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote> toCacheModel() {
		return _debitNote.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote toEscapedModel() {
		return new DebitNoteWrapper(_debitNote.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote toUnescapedModel() {
		return new DebitNoteWrapper(_debitNote.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _debitNote.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _debitNote.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_debitNote.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DebitNoteWrapper)) {
			return false;
		}

		DebitNoteWrapper debitNoteWrapper = (DebitNoteWrapper)obj;

		if (Validator.equals(_debitNote, debitNoteWrapper._debitNote)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DebitNote getWrappedDebitNote() {
		return _debitNote;
	}

	@Override
	public DebitNote getWrappedModel() {
		return _debitNote;
	}

	@Override
	public void resetOriginalValues() {
		_debitNote.resetOriginalValues();
	}

	private DebitNote _debitNote;
}