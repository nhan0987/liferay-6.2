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

package vn.dtt.gt.dk.dao.aswmsg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AswmsgMessageLog}.
 * </p>
 *
 * @author win_64
 * @see AswmsgMessageLog
 * @generated
 */
public class AswmsgMessageLogWrapper implements AswmsgMessageLog,
	ModelWrapper<AswmsgMessageLog> {
	public AswmsgMessageLogWrapper(AswmsgMessageLog aswmsgMessageLog) {
		_aswmsgMessageLog = aswmsgMessageLog;
	}

	@Override
	public Class<?> getModelClass() {
		return AswmsgMessageLog.class;
	}

	@Override
	public String getModelClassName() {
		return AswmsgMessageLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("Version", getVersion());
		attributes.put("MessageId", getMessageId());
		attributes.put("SenderName", getSenderName());
		attributes.put("SenderIdentity", getSenderIdentity());
		attributes.put("SenderCountryCode", getSenderCountryCode());
		attributes.put("SenderMinistryCode", getSenderMinistryCode());
		attributes.put("SenderOrganizationCode", getSenderOrganizationCode());
		attributes.put("SenderUnitCode", getSenderUnitCode());
		attributes.put("ReceiverName", getReceiverName());
		attributes.put("ReceiverIdentity", getReceiverIdentity());
		attributes.put("ReceiverCountryCode", getReceiverCountryCode());
		attributes.put("ReceiverMinistryCode", getReceiverMinistryCode());
		attributes.put("ReceiverOrganizationCode", getReceiverOrganizationCode());
		attributes.put("ReceiverUnitCode", getReceiverUnitCode());
		attributes.put("DocumentType", getDocumentType());
		attributes.put("Type", getType());
		attributes.put("Function", getFunction());
		attributes.put("Reference", getReference());
		attributes.put("PreReference", getPreReference());
		attributes.put("DocumentYear", getDocumentYear());
		attributes.put("SendDate", getSendDate());
		attributes.put("Signature", getSignature());
		attributes.put("SystemSignature", getSystemSignature());
		attributes.put("AllContent", getAllContent());
		attributes.put("CreatedTime", getCreatedTime());
		attributes.put("Webservice", getWebservice());
		attributes.put("Validated", getValidated());
		attributes.put("Description", getDescription());
		attributes.put("ValidationCode", getValidationCode());
		attributes.put("soLanGui", getSoLanGui());
		attributes.put("fileLogId", getFileLogId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String Version = (String)attributes.get("Version");

		if (Version != null) {
			setVersion(Version);
		}

		String MessageId = (String)attributes.get("MessageId");

		if (MessageId != null) {
			setMessageId(MessageId);
		}

		String SenderName = (String)attributes.get("SenderName");

		if (SenderName != null) {
			setSenderName(SenderName);
		}

		String SenderIdentity = (String)attributes.get("SenderIdentity");

		if (SenderIdentity != null) {
			setSenderIdentity(SenderIdentity);
		}

		String SenderCountryCode = (String)attributes.get("SenderCountryCode");

		if (SenderCountryCode != null) {
			setSenderCountryCode(SenderCountryCode);
		}

		String SenderMinistryCode = (String)attributes.get("SenderMinistryCode");

		if (SenderMinistryCode != null) {
			setSenderMinistryCode(SenderMinistryCode);
		}

		String SenderOrganizationCode = (String)attributes.get(
				"SenderOrganizationCode");

		if (SenderOrganizationCode != null) {
			setSenderOrganizationCode(SenderOrganizationCode);
		}

		String SenderUnitCode = (String)attributes.get("SenderUnitCode");

		if (SenderUnitCode != null) {
			setSenderUnitCode(SenderUnitCode);
		}

		String ReceiverName = (String)attributes.get("ReceiverName");

		if (ReceiverName != null) {
			setReceiverName(ReceiverName);
		}

		String ReceiverIdentity = (String)attributes.get("ReceiverIdentity");

		if (ReceiverIdentity != null) {
			setReceiverIdentity(ReceiverIdentity);
		}

		String ReceiverCountryCode = (String)attributes.get(
				"ReceiverCountryCode");

		if (ReceiverCountryCode != null) {
			setReceiverCountryCode(ReceiverCountryCode);
		}

		String ReceiverMinistryCode = (String)attributes.get(
				"ReceiverMinistryCode");

		if (ReceiverMinistryCode != null) {
			setReceiverMinistryCode(ReceiverMinistryCode);
		}

		String ReceiverOrganizationCode = (String)attributes.get(
				"ReceiverOrganizationCode");

		if (ReceiverOrganizationCode != null) {
			setReceiverOrganizationCode(ReceiverOrganizationCode);
		}

		String ReceiverUnitCode = (String)attributes.get("ReceiverUnitCode");

		if (ReceiverUnitCode != null) {
			setReceiverUnitCode(ReceiverUnitCode);
		}

		String DocumentType = (String)attributes.get("DocumentType");

		if (DocumentType != null) {
			setDocumentType(DocumentType);
		}

		Integer Type = (Integer)attributes.get("Type");

		if (Type != null) {
			setType(Type);
		}

		String Function = (String)attributes.get("Function");

		if (Function != null) {
			setFunction(Function);
		}

		Long Reference = (Long)attributes.get("Reference");

		if (Reference != null) {
			setReference(Reference);
		}

		Long PreReference = (Long)attributes.get("PreReference");

		if (PreReference != null) {
			setPreReference(PreReference);
		}

		Integer DocumentYear = (Integer)attributes.get("DocumentYear");

		if (DocumentYear != null) {
			setDocumentYear(DocumentYear);
		}

		Date SendDate = (Date)attributes.get("SendDate");

		if (SendDate != null) {
			setSendDate(SendDate);
		}

		String Signature = (String)attributes.get("Signature");

		if (Signature != null) {
			setSignature(Signature);
		}

		String SystemSignature = (String)attributes.get("SystemSignature");

		if (SystemSignature != null) {
			setSystemSignature(SystemSignature);
		}

		String AllContent = (String)attributes.get("AllContent");

		if (AllContent != null) {
			setAllContent(AllContent);
		}

		Date CreatedTime = (Date)attributes.get("CreatedTime");

		if (CreatedTime != null) {
			setCreatedTime(CreatedTime);
		}

		Integer Webservice = (Integer)attributes.get("Webservice");

		if (Webservice != null) {
			setWebservice(Webservice);
		}

		Integer Validated = (Integer)attributes.get("Validated");

		if (Validated != null) {
			setValidated(Validated);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		String ValidationCode = (String)attributes.get("ValidationCode");

		if (ValidationCode != null) {
			setValidationCode(ValidationCode);
		}

		Integer soLanGui = (Integer)attributes.get("soLanGui");

		if (soLanGui != null) {
			setSoLanGui(soLanGui);
		}

		Long fileLogId = (Long)attributes.get("fileLogId");

		if (fileLogId != null) {
			setFileLogId(fileLogId);
		}
	}

	/**
	* Returns the primary key of this aswmsg message log.
	*
	* @return the primary key of this aswmsg message log
	*/
	@Override
	public long getPrimaryKey() {
		return _aswmsgMessageLog.getPrimaryKey();
	}

	/**
	* Sets the primary key of this aswmsg message log.
	*
	* @param primaryKey the primary key of this aswmsg message log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_aswmsgMessageLog.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this aswmsg message log.
	*
	* @return the ID of this aswmsg message log
	*/
	@Override
	public long getId() {
		return _aswmsgMessageLog.getId();
	}

	/**
	* Sets the ID of this aswmsg message log.
	*
	* @param Id the ID of this aswmsg message log
	*/
	@Override
	public void setId(long Id) {
		_aswmsgMessageLog.setId(Id);
	}

	/**
	* Returns the version of this aswmsg message log.
	*
	* @return the version of this aswmsg message log
	*/
	@Override
	public java.lang.String getVersion() {
		return _aswmsgMessageLog.getVersion();
	}

	/**
	* Sets the version of this aswmsg message log.
	*
	* @param Version the version of this aswmsg message log
	*/
	@Override
	public void setVersion(java.lang.String Version) {
		_aswmsgMessageLog.setVersion(Version);
	}

	/**
	* Returns the message ID of this aswmsg message log.
	*
	* @return the message ID of this aswmsg message log
	*/
	@Override
	public java.lang.String getMessageId() {
		return _aswmsgMessageLog.getMessageId();
	}

	/**
	* Sets the message ID of this aswmsg message log.
	*
	* @param MessageId the message ID of this aswmsg message log
	*/
	@Override
	public void setMessageId(java.lang.String MessageId) {
		_aswmsgMessageLog.setMessageId(MessageId);
	}

	/**
	* Returns the sender name of this aswmsg message log.
	*
	* @return the sender name of this aswmsg message log
	*/
	@Override
	public java.lang.String getSenderName() {
		return _aswmsgMessageLog.getSenderName();
	}

	/**
	* Sets the sender name of this aswmsg message log.
	*
	* @param SenderName the sender name of this aswmsg message log
	*/
	@Override
	public void setSenderName(java.lang.String SenderName) {
		_aswmsgMessageLog.setSenderName(SenderName);
	}

	/**
	* Returns the sender identity of this aswmsg message log.
	*
	* @return the sender identity of this aswmsg message log
	*/
	@Override
	public java.lang.String getSenderIdentity() {
		return _aswmsgMessageLog.getSenderIdentity();
	}

	/**
	* Sets the sender identity of this aswmsg message log.
	*
	* @param SenderIdentity the sender identity of this aswmsg message log
	*/
	@Override
	public void setSenderIdentity(java.lang.String SenderIdentity) {
		_aswmsgMessageLog.setSenderIdentity(SenderIdentity);
	}

	/**
	* Returns the sender country code of this aswmsg message log.
	*
	* @return the sender country code of this aswmsg message log
	*/
	@Override
	public java.lang.String getSenderCountryCode() {
		return _aswmsgMessageLog.getSenderCountryCode();
	}

	/**
	* Sets the sender country code of this aswmsg message log.
	*
	* @param SenderCountryCode the sender country code of this aswmsg message log
	*/
	@Override
	public void setSenderCountryCode(java.lang.String SenderCountryCode) {
		_aswmsgMessageLog.setSenderCountryCode(SenderCountryCode);
	}

	/**
	* Returns the sender ministry code of this aswmsg message log.
	*
	* @return the sender ministry code of this aswmsg message log
	*/
	@Override
	public java.lang.String getSenderMinistryCode() {
		return _aswmsgMessageLog.getSenderMinistryCode();
	}

	/**
	* Sets the sender ministry code of this aswmsg message log.
	*
	* @param SenderMinistryCode the sender ministry code of this aswmsg message log
	*/
	@Override
	public void setSenderMinistryCode(java.lang.String SenderMinistryCode) {
		_aswmsgMessageLog.setSenderMinistryCode(SenderMinistryCode);
	}

	/**
	* Returns the sender organization code of this aswmsg message log.
	*
	* @return the sender organization code of this aswmsg message log
	*/
	@Override
	public java.lang.String getSenderOrganizationCode() {
		return _aswmsgMessageLog.getSenderOrganizationCode();
	}

	/**
	* Sets the sender organization code of this aswmsg message log.
	*
	* @param SenderOrganizationCode the sender organization code of this aswmsg message log
	*/
	@Override
	public void setSenderOrganizationCode(
		java.lang.String SenderOrganizationCode) {
		_aswmsgMessageLog.setSenderOrganizationCode(SenderOrganizationCode);
	}

	/**
	* Returns the sender unit code of this aswmsg message log.
	*
	* @return the sender unit code of this aswmsg message log
	*/
	@Override
	public java.lang.String getSenderUnitCode() {
		return _aswmsgMessageLog.getSenderUnitCode();
	}

	/**
	* Sets the sender unit code of this aswmsg message log.
	*
	* @param SenderUnitCode the sender unit code of this aswmsg message log
	*/
	@Override
	public void setSenderUnitCode(java.lang.String SenderUnitCode) {
		_aswmsgMessageLog.setSenderUnitCode(SenderUnitCode);
	}

	/**
	* Returns the receiver name of this aswmsg message log.
	*
	* @return the receiver name of this aswmsg message log
	*/
	@Override
	public java.lang.String getReceiverName() {
		return _aswmsgMessageLog.getReceiverName();
	}

	/**
	* Sets the receiver name of this aswmsg message log.
	*
	* @param ReceiverName the receiver name of this aswmsg message log
	*/
	@Override
	public void setReceiverName(java.lang.String ReceiverName) {
		_aswmsgMessageLog.setReceiverName(ReceiverName);
	}

	/**
	* Returns the receiver identity of this aswmsg message log.
	*
	* @return the receiver identity of this aswmsg message log
	*/
	@Override
	public java.lang.String getReceiverIdentity() {
		return _aswmsgMessageLog.getReceiverIdentity();
	}

	/**
	* Sets the receiver identity of this aswmsg message log.
	*
	* @param ReceiverIdentity the receiver identity of this aswmsg message log
	*/
	@Override
	public void setReceiverIdentity(java.lang.String ReceiverIdentity) {
		_aswmsgMessageLog.setReceiverIdentity(ReceiverIdentity);
	}

	/**
	* Returns the receiver country code of this aswmsg message log.
	*
	* @return the receiver country code of this aswmsg message log
	*/
	@Override
	public java.lang.String getReceiverCountryCode() {
		return _aswmsgMessageLog.getReceiverCountryCode();
	}

	/**
	* Sets the receiver country code of this aswmsg message log.
	*
	* @param ReceiverCountryCode the receiver country code of this aswmsg message log
	*/
	@Override
	public void setReceiverCountryCode(java.lang.String ReceiverCountryCode) {
		_aswmsgMessageLog.setReceiverCountryCode(ReceiverCountryCode);
	}

	/**
	* Returns the receiver ministry code of this aswmsg message log.
	*
	* @return the receiver ministry code of this aswmsg message log
	*/
	@Override
	public java.lang.String getReceiverMinistryCode() {
		return _aswmsgMessageLog.getReceiverMinistryCode();
	}

	/**
	* Sets the receiver ministry code of this aswmsg message log.
	*
	* @param ReceiverMinistryCode the receiver ministry code of this aswmsg message log
	*/
	@Override
	public void setReceiverMinistryCode(java.lang.String ReceiverMinistryCode) {
		_aswmsgMessageLog.setReceiverMinistryCode(ReceiverMinistryCode);
	}

	/**
	* Returns the receiver organization code of this aswmsg message log.
	*
	* @return the receiver organization code of this aswmsg message log
	*/
	@Override
	public java.lang.String getReceiverOrganizationCode() {
		return _aswmsgMessageLog.getReceiverOrganizationCode();
	}

	/**
	* Sets the receiver organization code of this aswmsg message log.
	*
	* @param ReceiverOrganizationCode the receiver organization code of this aswmsg message log
	*/
	@Override
	public void setReceiverOrganizationCode(
		java.lang.String ReceiverOrganizationCode) {
		_aswmsgMessageLog.setReceiverOrganizationCode(ReceiverOrganizationCode);
	}

	/**
	* Returns the receiver unit code of this aswmsg message log.
	*
	* @return the receiver unit code of this aswmsg message log
	*/
	@Override
	public java.lang.String getReceiverUnitCode() {
		return _aswmsgMessageLog.getReceiverUnitCode();
	}

	/**
	* Sets the receiver unit code of this aswmsg message log.
	*
	* @param ReceiverUnitCode the receiver unit code of this aswmsg message log
	*/
	@Override
	public void setReceiverUnitCode(java.lang.String ReceiverUnitCode) {
		_aswmsgMessageLog.setReceiverUnitCode(ReceiverUnitCode);
	}

	/**
	* Returns the document type of this aswmsg message log.
	*
	* @return the document type of this aswmsg message log
	*/
	@Override
	public java.lang.String getDocumentType() {
		return _aswmsgMessageLog.getDocumentType();
	}

	/**
	* Sets the document type of this aswmsg message log.
	*
	* @param DocumentType the document type of this aswmsg message log
	*/
	@Override
	public void setDocumentType(java.lang.String DocumentType) {
		_aswmsgMessageLog.setDocumentType(DocumentType);
	}

	/**
	* Returns the type of this aswmsg message log.
	*
	* @return the type of this aswmsg message log
	*/
	@Override
	public int getType() {
		return _aswmsgMessageLog.getType();
	}

	/**
	* Sets the type of this aswmsg message log.
	*
	* @param Type the type of this aswmsg message log
	*/
	@Override
	public void setType(int Type) {
		_aswmsgMessageLog.setType(Type);
	}

	/**
	* Returns the function of this aswmsg message log.
	*
	* @return the function of this aswmsg message log
	*/
	@Override
	public java.lang.String getFunction() {
		return _aswmsgMessageLog.getFunction();
	}

	/**
	* Sets the function of this aswmsg message log.
	*
	* @param Function the function of this aswmsg message log
	*/
	@Override
	public void setFunction(java.lang.String Function) {
		_aswmsgMessageLog.setFunction(Function);
	}

	/**
	* Returns the reference of this aswmsg message log.
	*
	* @return the reference of this aswmsg message log
	*/
	@Override
	public long getReference() {
		return _aswmsgMessageLog.getReference();
	}

	/**
	* Sets the reference of this aswmsg message log.
	*
	* @param Reference the reference of this aswmsg message log
	*/
	@Override
	public void setReference(long Reference) {
		_aswmsgMessageLog.setReference(Reference);
	}

	/**
	* Returns the pre reference of this aswmsg message log.
	*
	* @return the pre reference of this aswmsg message log
	*/
	@Override
	public long getPreReference() {
		return _aswmsgMessageLog.getPreReference();
	}

	/**
	* Sets the pre reference of this aswmsg message log.
	*
	* @param PreReference the pre reference of this aswmsg message log
	*/
	@Override
	public void setPreReference(long PreReference) {
		_aswmsgMessageLog.setPreReference(PreReference);
	}

	/**
	* Returns the document year of this aswmsg message log.
	*
	* @return the document year of this aswmsg message log
	*/
	@Override
	public int getDocumentYear() {
		return _aswmsgMessageLog.getDocumentYear();
	}

	/**
	* Sets the document year of this aswmsg message log.
	*
	* @param DocumentYear the document year of this aswmsg message log
	*/
	@Override
	public void setDocumentYear(int DocumentYear) {
		_aswmsgMessageLog.setDocumentYear(DocumentYear);
	}

	/**
	* Returns the send date of this aswmsg message log.
	*
	* @return the send date of this aswmsg message log
	*/
	@Override
	public java.util.Date getSendDate() {
		return _aswmsgMessageLog.getSendDate();
	}

	/**
	* Sets the send date of this aswmsg message log.
	*
	* @param SendDate the send date of this aswmsg message log
	*/
	@Override
	public void setSendDate(java.util.Date SendDate) {
		_aswmsgMessageLog.setSendDate(SendDate);
	}

	/**
	* Returns the signature of this aswmsg message log.
	*
	* @return the signature of this aswmsg message log
	*/
	@Override
	public java.lang.String getSignature() {
		return _aswmsgMessageLog.getSignature();
	}

	/**
	* Sets the signature of this aswmsg message log.
	*
	* @param Signature the signature of this aswmsg message log
	*/
	@Override
	public void setSignature(java.lang.String Signature) {
		_aswmsgMessageLog.setSignature(Signature);
	}

	/**
	* Returns the system signature of this aswmsg message log.
	*
	* @return the system signature of this aswmsg message log
	*/
	@Override
	public java.lang.String getSystemSignature() {
		return _aswmsgMessageLog.getSystemSignature();
	}

	/**
	* Sets the system signature of this aswmsg message log.
	*
	* @param SystemSignature the system signature of this aswmsg message log
	*/
	@Override
	public void setSystemSignature(java.lang.String SystemSignature) {
		_aswmsgMessageLog.setSystemSignature(SystemSignature);
	}

	/**
	* Returns the all content of this aswmsg message log.
	*
	* @return the all content of this aswmsg message log
	*/
	@Override
	public java.lang.String getAllContent() {
		return _aswmsgMessageLog.getAllContent();
	}

	/**
	* Sets the all content of this aswmsg message log.
	*
	* @param AllContent the all content of this aswmsg message log
	*/
	@Override
	public void setAllContent(java.lang.String AllContent) {
		_aswmsgMessageLog.setAllContent(AllContent);
	}

	/**
	* Returns the created time of this aswmsg message log.
	*
	* @return the created time of this aswmsg message log
	*/
	@Override
	public java.util.Date getCreatedTime() {
		return _aswmsgMessageLog.getCreatedTime();
	}

	/**
	* Sets the created time of this aswmsg message log.
	*
	* @param CreatedTime the created time of this aswmsg message log
	*/
	@Override
	public void setCreatedTime(java.util.Date CreatedTime) {
		_aswmsgMessageLog.setCreatedTime(CreatedTime);
	}

	/**
	* Returns the webservice of this aswmsg message log.
	*
	* @return the webservice of this aswmsg message log
	*/
	@Override
	public int getWebservice() {
		return _aswmsgMessageLog.getWebservice();
	}

	/**
	* Sets the webservice of this aswmsg message log.
	*
	* @param Webservice the webservice of this aswmsg message log
	*/
	@Override
	public void setWebservice(int Webservice) {
		_aswmsgMessageLog.setWebservice(Webservice);
	}

	/**
	* Returns the validated of this aswmsg message log.
	*
	* @return the validated of this aswmsg message log
	*/
	@Override
	public int getValidated() {
		return _aswmsgMessageLog.getValidated();
	}

	/**
	* Sets the validated of this aswmsg message log.
	*
	* @param Validated the validated of this aswmsg message log
	*/
	@Override
	public void setValidated(int Validated) {
		_aswmsgMessageLog.setValidated(Validated);
	}

	/**
	* Returns the description of this aswmsg message log.
	*
	* @return the description of this aswmsg message log
	*/
	@Override
	public java.lang.String getDescription() {
		return _aswmsgMessageLog.getDescription();
	}

	/**
	* Sets the description of this aswmsg message log.
	*
	* @param Description the description of this aswmsg message log
	*/
	@Override
	public void setDescription(java.lang.String Description) {
		_aswmsgMessageLog.setDescription(Description);
	}

	/**
	* Returns the validation code of this aswmsg message log.
	*
	* @return the validation code of this aswmsg message log
	*/
	@Override
	public java.lang.String getValidationCode() {
		return _aswmsgMessageLog.getValidationCode();
	}

	/**
	* Sets the validation code of this aswmsg message log.
	*
	* @param ValidationCode the validation code of this aswmsg message log
	*/
	@Override
	public void setValidationCode(java.lang.String ValidationCode) {
		_aswmsgMessageLog.setValidationCode(ValidationCode);
	}

	/**
	* Returns the so lan gui of this aswmsg message log.
	*
	* @return the so lan gui of this aswmsg message log
	*/
	@Override
	public int getSoLanGui() {
		return _aswmsgMessageLog.getSoLanGui();
	}

	/**
	* Sets the so lan gui of this aswmsg message log.
	*
	* @param soLanGui the so lan gui of this aswmsg message log
	*/
	@Override
	public void setSoLanGui(int soLanGui) {
		_aswmsgMessageLog.setSoLanGui(soLanGui);
	}

	/**
	* Returns the file log ID of this aswmsg message log.
	*
	* @return the file log ID of this aswmsg message log
	*/
	@Override
	public long getFileLogId() {
		return _aswmsgMessageLog.getFileLogId();
	}

	/**
	* Sets the file log ID of this aswmsg message log.
	*
	* @param fileLogId the file log ID of this aswmsg message log
	*/
	@Override
	public void setFileLogId(long fileLogId) {
		_aswmsgMessageLog.setFileLogId(fileLogId);
	}

	@Override
	public boolean isNew() {
		return _aswmsgMessageLog.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_aswmsgMessageLog.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _aswmsgMessageLog.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_aswmsgMessageLog.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _aswmsgMessageLog.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _aswmsgMessageLog.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_aswmsgMessageLog.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _aswmsgMessageLog.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_aswmsgMessageLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_aswmsgMessageLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_aswmsgMessageLog.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AswmsgMessageLogWrapper((AswmsgMessageLog)_aswmsgMessageLog.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog aswmsgMessageLog) {
		return _aswmsgMessageLog.compareTo(aswmsgMessageLog);
	}

	@Override
	public int hashCode() {
		return _aswmsgMessageLog.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog> toCacheModel() {
		return _aswmsgMessageLog.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog toEscapedModel() {
		return new AswmsgMessageLogWrapper(_aswmsgMessageLog.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog toUnescapedModel() {
		return new AswmsgMessageLogWrapper(_aswmsgMessageLog.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _aswmsgMessageLog.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _aswmsgMessageLog.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_aswmsgMessageLog.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AswmsgMessageLogWrapper)) {
			return false;
		}

		AswmsgMessageLogWrapper aswmsgMessageLogWrapper = (AswmsgMessageLogWrapper)obj;

		if (Validator.equals(_aswmsgMessageLog,
					aswmsgMessageLogWrapper._aswmsgMessageLog)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AswmsgMessageLog getWrappedAswmsgMessageLog() {
		return _aswmsgMessageLog;
	}

	@Override
	public AswmsgMessageLog getWrappedModel() {
		return _aswmsgMessageLog;
	}

	@Override
	public void resetOriginalValues() {
		_aswmsgMessageLog.resetOriginalValues();
	}

	private AswmsgMessageLog _aswmsgMessageLog;
}