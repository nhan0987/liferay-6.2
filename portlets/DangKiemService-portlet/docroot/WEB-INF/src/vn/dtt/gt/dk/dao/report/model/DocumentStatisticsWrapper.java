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

package vn.dtt.gt.dk.dao.report.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DocumentStatistics}.
 * </p>
 *
 * @author win_64
 * @see DocumentStatistics
 * @generated
 */
public class DocumentStatisticsWrapper implements DocumentStatistics,
	ModelWrapper<DocumentStatistics> {
	public DocumentStatisticsWrapper(DocumentStatistics documentStatistics) {
		_documentStatistics = documentStatistics;
	}

	@Override
	public Class<?> getModelClass() {
		return DocumentStatistics.class;
	}

	@Override
	public String getModelClassName() {
		return DocumentStatistics.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("documentTypeCode", getDocumentTypeCode());
		attributes.put("remainingNumber", getRemainingNumber());
		attributes.put("receivedNumber", getReceivedNumber());
		attributes.put("ontimeNumber", getOntimeNumber());
		attributes.put("overtimeNumber", getOvertimeNumber());
		attributes.put("processingNumber", getProcessingNumber());
		attributes.put("delayingNumber", getDelayingNumber());
		attributes.put("month", getMonth());
		attributes.put("year", getYear());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String documentTypeCode = (String)attributes.get("documentTypeCode");

		if (documentTypeCode != null) {
			setDocumentTypeCode(documentTypeCode);
		}

		Long remainingNumber = (Long)attributes.get("remainingNumber");

		if (remainingNumber != null) {
			setRemainingNumber(remainingNumber);
		}

		Long receivedNumber = (Long)attributes.get("receivedNumber");

		if (receivedNumber != null) {
			setReceivedNumber(receivedNumber);
		}

		Long ontimeNumber = (Long)attributes.get("ontimeNumber");

		if (ontimeNumber != null) {
			setOntimeNumber(ontimeNumber);
		}

		Long overtimeNumber = (Long)attributes.get("overtimeNumber");

		if (overtimeNumber != null) {
			setOvertimeNumber(overtimeNumber);
		}

		Long processingNumber = (Long)attributes.get("processingNumber");

		if (processingNumber != null) {
			setProcessingNumber(processingNumber);
		}

		Long delayingNumber = (Long)attributes.get("delayingNumber");

		if (delayingNumber != null) {
			setDelayingNumber(delayingNumber);
		}

		Integer month = (Integer)attributes.get("month");

		if (month != null) {
			setMonth(month);
		}

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this document statistics.
	*
	* @return the primary key of this document statistics
	*/
	@Override
	public long getPrimaryKey() {
		return _documentStatistics.getPrimaryKey();
	}

	/**
	* Sets the primary key of this document statistics.
	*
	* @param primaryKey the primary key of this document statistics
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_documentStatistics.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this document statistics.
	*
	* @return the ID of this document statistics
	*/
	@Override
	public long getId() {
		return _documentStatistics.getId();
	}

	/**
	* Sets the ID of this document statistics.
	*
	* @param id the ID of this document statistics
	*/
	@Override
	public void setId(long id) {
		_documentStatistics.setId(id);
	}

	/**
	* Returns the create date of this document statistics.
	*
	* @return the create date of this document statistics
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _documentStatistics.getCreateDate();
	}

	/**
	* Sets the create date of this document statistics.
	*
	* @param createDate the create date of this document statistics
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_documentStatistics.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this document statistics.
	*
	* @return the modified date of this document statistics
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _documentStatistics.getModifiedDate();
	}

	/**
	* Sets the modified date of this document statistics.
	*
	* @param modifiedDate the modified date of this document statistics
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_documentStatistics.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the document type code of this document statistics.
	*
	* @return the document type code of this document statistics
	*/
	@Override
	public java.lang.String getDocumentTypeCode() {
		return _documentStatistics.getDocumentTypeCode();
	}

	/**
	* Sets the document type code of this document statistics.
	*
	* @param documentTypeCode the document type code of this document statistics
	*/
	@Override
	public void setDocumentTypeCode(java.lang.String documentTypeCode) {
		_documentStatistics.setDocumentTypeCode(documentTypeCode);
	}

	/**
	* Returns the remaining number of this document statistics.
	*
	* @return the remaining number of this document statistics
	*/
	@Override
	public long getRemainingNumber() {
		return _documentStatistics.getRemainingNumber();
	}

	/**
	* Sets the remaining number of this document statistics.
	*
	* @param remainingNumber the remaining number of this document statistics
	*/
	@Override
	public void setRemainingNumber(long remainingNumber) {
		_documentStatistics.setRemainingNumber(remainingNumber);
	}

	/**
	* Returns the received number of this document statistics.
	*
	* @return the received number of this document statistics
	*/
	@Override
	public long getReceivedNumber() {
		return _documentStatistics.getReceivedNumber();
	}

	/**
	* Sets the received number of this document statistics.
	*
	* @param receivedNumber the received number of this document statistics
	*/
	@Override
	public void setReceivedNumber(long receivedNumber) {
		_documentStatistics.setReceivedNumber(receivedNumber);
	}

	/**
	* Returns the ontime number of this document statistics.
	*
	* @return the ontime number of this document statistics
	*/
	@Override
	public long getOntimeNumber() {
		return _documentStatistics.getOntimeNumber();
	}

	/**
	* Sets the ontime number of this document statistics.
	*
	* @param ontimeNumber the ontime number of this document statistics
	*/
	@Override
	public void setOntimeNumber(long ontimeNumber) {
		_documentStatistics.setOntimeNumber(ontimeNumber);
	}

	/**
	* Returns the overtime number of this document statistics.
	*
	* @return the overtime number of this document statistics
	*/
	@Override
	public long getOvertimeNumber() {
		return _documentStatistics.getOvertimeNumber();
	}

	/**
	* Sets the overtime number of this document statistics.
	*
	* @param overtimeNumber the overtime number of this document statistics
	*/
	@Override
	public void setOvertimeNumber(long overtimeNumber) {
		_documentStatistics.setOvertimeNumber(overtimeNumber);
	}

	/**
	* Returns the processing number of this document statistics.
	*
	* @return the processing number of this document statistics
	*/
	@Override
	public long getProcessingNumber() {
		return _documentStatistics.getProcessingNumber();
	}

	/**
	* Sets the processing number of this document statistics.
	*
	* @param processingNumber the processing number of this document statistics
	*/
	@Override
	public void setProcessingNumber(long processingNumber) {
		_documentStatistics.setProcessingNumber(processingNumber);
	}

	/**
	* Returns the delaying number of this document statistics.
	*
	* @return the delaying number of this document statistics
	*/
	@Override
	public long getDelayingNumber() {
		return _documentStatistics.getDelayingNumber();
	}

	/**
	* Sets the delaying number of this document statistics.
	*
	* @param delayingNumber the delaying number of this document statistics
	*/
	@Override
	public void setDelayingNumber(long delayingNumber) {
		_documentStatistics.setDelayingNumber(delayingNumber);
	}

	/**
	* Returns the month of this document statistics.
	*
	* @return the month of this document statistics
	*/
	@Override
	public int getMonth() {
		return _documentStatistics.getMonth();
	}

	/**
	* Sets the month of this document statistics.
	*
	* @param month the month of this document statistics
	*/
	@Override
	public void setMonth(int month) {
		_documentStatistics.setMonth(month);
	}

	/**
	* Returns the year of this document statistics.
	*
	* @return the year of this document statistics
	*/
	@Override
	public int getYear() {
		return _documentStatistics.getYear();
	}

	/**
	* Sets the year of this document statistics.
	*
	* @param year the year of this document statistics
	*/
	@Override
	public void setYear(int year) {
		_documentStatistics.setYear(year);
	}

	/**
	* Returns the status of this document statistics.
	*
	* @return the status of this document statistics
	*/
	@Override
	public int getStatus() {
		return _documentStatistics.getStatus();
	}

	/**
	* Sets the status of this document statistics.
	*
	* @param status the status of this document statistics
	*/
	@Override
	public void setStatus(int status) {
		_documentStatistics.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _documentStatistics.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_documentStatistics.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _documentStatistics.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_documentStatistics.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _documentStatistics.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _documentStatistics.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_documentStatistics.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _documentStatistics.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_documentStatistics.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_documentStatistics.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_documentStatistics.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DocumentStatisticsWrapper((DocumentStatistics)_documentStatistics.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.report.model.DocumentStatistics documentStatistics) {
		return _documentStatistics.compareTo(documentStatistics);
	}

	@Override
	public int hashCode() {
		return _documentStatistics.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.report.model.DocumentStatistics> toCacheModel() {
		return _documentStatistics.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics toEscapedModel() {
		return new DocumentStatisticsWrapper(_documentStatistics.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.report.model.DocumentStatistics toUnescapedModel() {
		return new DocumentStatisticsWrapper(_documentStatistics.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _documentStatistics.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _documentStatistics.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_documentStatistics.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DocumentStatisticsWrapper)) {
			return false;
		}

		DocumentStatisticsWrapper documentStatisticsWrapper = (DocumentStatisticsWrapper)obj;

		if (Validator.equals(_documentStatistics,
					documentStatisticsWrapper._documentStatistics)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DocumentStatistics getWrappedDocumentStatistics() {
		return _documentStatistics;
	}

	@Override
	public DocumentStatistics getWrappedModel() {
		return _documentStatistics;
	}

	@Override
	public void resetOriginalValues() {
		_documentStatistics.resetOriginalValues();
	}

	private DocumentStatistics _documentStatistics;
}