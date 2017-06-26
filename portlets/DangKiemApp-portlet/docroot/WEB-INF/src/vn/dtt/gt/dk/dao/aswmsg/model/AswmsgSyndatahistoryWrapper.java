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
 * This class is a wrapper for {@link AswmsgSyndatahistory}.
 * </p>
 *
 * @author win_64
 * @see AswmsgSyndatahistory
 * @generated
 */
public class AswmsgSyndatahistoryWrapper implements AswmsgSyndatahistory,
	ModelWrapper<AswmsgSyndatahistory> {
	public AswmsgSyndatahistoryWrapper(
		AswmsgSyndatahistory aswmsgSyndatahistory) {
		_aswmsgSyndatahistory = aswmsgSyndatahistory;
	}

	@Override
	public Class<?> getModelClass() {
		return AswmsgSyndatahistory.class;
	}

	@Override
	public String getModelClassName() {
		return AswmsgSyndatahistory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("version", getVersion());
		attributes.put("messageId", getMessageId());
		attributes.put("senderName", getSenderName());
		attributes.put("senderIdentity", getSenderIdentity());
		attributes.put("senderCountryCode", getSenderCountryCode());
		attributes.put("senderMinistryCode", getSenderMinistryCode());
		attributes.put("senderOrganizationCode", getSenderOrganizationCode());
		attributes.put("senderUnitCode", getSenderUnitCode());
		attributes.put("receiverName", getReceiverName());
		attributes.put("receiverIdentity", getReceiverIdentity());
		attributes.put("receiverCountryCode", getReceiverCountryCode());
		attributes.put("receiverMinistryCode", getReceiverMinistryCode());
		attributes.put("receiverOrganizationCode", getReceiverOrganizationCode());
		attributes.put("receiverUnitCode", getReceiverUnitCode());
		attributes.put("documentType", getDocumentType());
		attributes.put("type", getType());
		attributes.put("function", getFunction());
		attributes.put("reference", getReference());
		attributes.put("preReference", getPreReference());
		attributes.put("documentYear", getDocumentYear());
		attributes.put("sendDate", getSendDate());
		attributes.put("signature", getSignature());
		attributes.put("systemSignature", getSystemSignature());
		attributes.put("allContent", getAllContent());
		attributes.put("createdTime", getCreatedTime());
		attributes.put("webservice", getWebservice());
		attributes.put("validated", getValidated());
		attributes.put("priority", getPriority());
		attributes.put("description", getDescription());
		attributes.put("validationCode", getValidationCode());
		attributes.put("soLanGui", getSoLanGui());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		String messageId = (String)attributes.get("messageId");

		if (messageId != null) {
			setMessageId(messageId);
		}

		String senderName = (String)attributes.get("senderName");

		if (senderName != null) {
			setSenderName(senderName);
		}

		String senderIdentity = (String)attributes.get("senderIdentity");

		if (senderIdentity != null) {
			setSenderIdentity(senderIdentity);
		}

		String senderCountryCode = (String)attributes.get("senderCountryCode");

		if (senderCountryCode != null) {
			setSenderCountryCode(senderCountryCode);
		}

		String senderMinistryCode = (String)attributes.get("senderMinistryCode");

		if (senderMinistryCode != null) {
			setSenderMinistryCode(senderMinistryCode);
		}

		String senderOrganizationCode = (String)attributes.get(
				"senderOrganizationCode");

		if (senderOrganizationCode != null) {
			setSenderOrganizationCode(senderOrganizationCode);
		}

		String senderUnitCode = (String)attributes.get("senderUnitCode");

		if (senderUnitCode != null) {
			setSenderUnitCode(senderUnitCode);
		}

		String receiverName = (String)attributes.get("receiverName");

		if (receiverName != null) {
			setReceiverName(receiverName);
		}

		String receiverIdentity = (String)attributes.get("receiverIdentity");

		if (receiverIdentity != null) {
			setReceiverIdentity(receiverIdentity);
		}

		String receiverCountryCode = (String)attributes.get(
				"receiverCountryCode");

		if (receiverCountryCode != null) {
			setReceiverCountryCode(receiverCountryCode);
		}

		String receiverMinistryCode = (String)attributes.get(
				"receiverMinistryCode");

		if (receiverMinistryCode != null) {
			setReceiverMinistryCode(receiverMinistryCode);
		}

		String receiverOrganizationCode = (String)attributes.get(
				"receiverOrganizationCode");

		if (receiverOrganizationCode != null) {
			setReceiverOrganizationCode(receiverOrganizationCode);
		}

		String receiverUnitCode = (String)attributes.get("receiverUnitCode");

		if (receiverUnitCode != null) {
			setReceiverUnitCode(receiverUnitCode);
		}

		String documentType = (String)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String function = (String)attributes.get("function");

		if (function != null) {
			setFunction(function);
		}

		Long reference = (Long)attributes.get("reference");

		if (reference != null) {
			setReference(reference);
		}

		Long preReference = (Long)attributes.get("preReference");

		if (preReference != null) {
			setPreReference(preReference);
		}

		Integer documentYear = (Integer)attributes.get("documentYear");

		if (documentYear != null) {
			setDocumentYear(documentYear);
		}

		Date sendDate = (Date)attributes.get("sendDate");

		if (sendDate != null) {
			setSendDate(sendDate);
		}

		String signature = (String)attributes.get("signature");

		if (signature != null) {
			setSignature(signature);
		}

		String systemSignature = (String)attributes.get("systemSignature");

		if (systemSignature != null) {
			setSystemSignature(systemSignature);
		}

		String allContent = (String)attributes.get("allContent");

		if (allContent != null) {
			setAllContent(allContent);
		}

		Date createdTime = (Date)attributes.get("createdTime");

		if (createdTime != null) {
			setCreatedTime(createdTime);
		}

		Integer webservice = (Integer)attributes.get("webservice");

		if (webservice != null) {
			setWebservice(webservice);
		}

		Integer validated = (Integer)attributes.get("validated");

		if (validated != null) {
			setValidated(validated);
		}

		Integer priority = (Integer)attributes.get("priority");

		if (priority != null) {
			setPriority(priority);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String validationCode = (String)attributes.get("validationCode");

		if (validationCode != null) {
			setValidationCode(validationCode);
		}

		Integer soLanGui = (Integer)attributes.get("soLanGui");

		if (soLanGui != null) {
			setSoLanGui(soLanGui);
		}
	}

	/**
	* Returns the primary key of this aswmsg syndatahistory.
	*
	* @return the primary key of this aswmsg syndatahistory
	*/
	@Override
	public long getPrimaryKey() {
		return _aswmsgSyndatahistory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this aswmsg syndatahistory.
	*
	* @param primaryKey the primary key of this aswmsg syndatahistory
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_aswmsgSyndatahistory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this aswmsg syndatahistory.
	*
	* @return the ID of this aswmsg syndatahistory
	*/
	@Override
	public long getId() {
		return _aswmsgSyndatahistory.getId();
	}

	/**
	* Sets the ID of this aswmsg syndatahistory.
	*
	* @param id the ID of this aswmsg syndatahistory
	*/
	@Override
	public void setId(long id) {
		_aswmsgSyndatahistory.setId(id);
	}

	/**
	* Returns the version of this aswmsg syndatahistory.
	*
	* @return the version of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getVersion() {
		return _aswmsgSyndatahistory.getVersion();
	}

	/**
	* Sets the version of this aswmsg syndatahistory.
	*
	* @param version the version of this aswmsg syndatahistory
	*/
	@Override
	public void setVersion(java.lang.String version) {
		_aswmsgSyndatahistory.setVersion(version);
	}

	/**
	* Returns the message ID of this aswmsg syndatahistory.
	*
	* @return the message ID of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getMessageId() {
		return _aswmsgSyndatahistory.getMessageId();
	}

	/**
	* Sets the message ID of this aswmsg syndatahistory.
	*
	* @param messageId the message ID of this aswmsg syndatahistory
	*/
	@Override
	public void setMessageId(java.lang.String messageId) {
		_aswmsgSyndatahistory.setMessageId(messageId);
	}

	/**
	* Returns the sender name of this aswmsg syndatahistory.
	*
	* @return the sender name of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getSenderName() {
		return _aswmsgSyndatahistory.getSenderName();
	}

	/**
	* Sets the sender name of this aswmsg syndatahistory.
	*
	* @param senderName the sender name of this aswmsg syndatahistory
	*/
	@Override
	public void setSenderName(java.lang.String senderName) {
		_aswmsgSyndatahistory.setSenderName(senderName);
	}

	/**
	* Returns the sender identity of this aswmsg syndatahistory.
	*
	* @return the sender identity of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getSenderIdentity() {
		return _aswmsgSyndatahistory.getSenderIdentity();
	}

	/**
	* Sets the sender identity of this aswmsg syndatahistory.
	*
	* @param senderIdentity the sender identity of this aswmsg syndatahistory
	*/
	@Override
	public void setSenderIdentity(java.lang.String senderIdentity) {
		_aswmsgSyndatahistory.setSenderIdentity(senderIdentity);
	}

	/**
	* Returns the sender country code of this aswmsg syndatahistory.
	*
	* @return the sender country code of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getSenderCountryCode() {
		return _aswmsgSyndatahistory.getSenderCountryCode();
	}

	/**
	* Sets the sender country code of this aswmsg syndatahistory.
	*
	* @param senderCountryCode the sender country code of this aswmsg syndatahistory
	*/
	@Override
	public void setSenderCountryCode(java.lang.String senderCountryCode) {
		_aswmsgSyndatahistory.setSenderCountryCode(senderCountryCode);
	}

	/**
	* Returns the sender ministry code of this aswmsg syndatahistory.
	*
	* @return the sender ministry code of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getSenderMinistryCode() {
		return _aswmsgSyndatahistory.getSenderMinistryCode();
	}

	/**
	* Sets the sender ministry code of this aswmsg syndatahistory.
	*
	* @param senderMinistryCode the sender ministry code of this aswmsg syndatahistory
	*/
	@Override
	public void setSenderMinistryCode(java.lang.String senderMinistryCode) {
		_aswmsgSyndatahistory.setSenderMinistryCode(senderMinistryCode);
	}

	/**
	* Returns the sender organization code of this aswmsg syndatahistory.
	*
	* @return the sender organization code of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getSenderOrganizationCode() {
		return _aswmsgSyndatahistory.getSenderOrganizationCode();
	}

	/**
	* Sets the sender organization code of this aswmsg syndatahistory.
	*
	* @param senderOrganizationCode the sender organization code of this aswmsg syndatahistory
	*/
	@Override
	public void setSenderOrganizationCode(
		java.lang.String senderOrganizationCode) {
		_aswmsgSyndatahistory.setSenderOrganizationCode(senderOrganizationCode);
	}

	/**
	* Returns the sender unit code of this aswmsg syndatahistory.
	*
	* @return the sender unit code of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getSenderUnitCode() {
		return _aswmsgSyndatahistory.getSenderUnitCode();
	}

	/**
	* Sets the sender unit code of this aswmsg syndatahistory.
	*
	* @param senderUnitCode the sender unit code of this aswmsg syndatahistory
	*/
	@Override
	public void setSenderUnitCode(java.lang.String senderUnitCode) {
		_aswmsgSyndatahistory.setSenderUnitCode(senderUnitCode);
	}

	/**
	* Returns the receiver name of this aswmsg syndatahistory.
	*
	* @return the receiver name of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getReceiverName() {
		return _aswmsgSyndatahistory.getReceiverName();
	}

	/**
	* Sets the receiver name of this aswmsg syndatahistory.
	*
	* @param receiverName the receiver name of this aswmsg syndatahistory
	*/
	@Override
	public void setReceiverName(java.lang.String receiverName) {
		_aswmsgSyndatahistory.setReceiverName(receiverName);
	}

	/**
	* Returns the receiver identity of this aswmsg syndatahistory.
	*
	* @return the receiver identity of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getReceiverIdentity() {
		return _aswmsgSyndatahistory.getReceiverIdentity();
	}

	/**
	* Sets the receiver identity of this aswmsg syndatahistory.
	*
	* @param receiverIdentity the receiver identity of this aswmsg syndatahistory
	*/
	@Override
	public void setReceiverIdentity(java.lang.String receiverIdentity) {
		_aswmsgSyndatahistory.setReceiverIdentity(receiverIdentity);
	}

	/**
	* Returns the receiver country code of this aswmsg syndatahistory.
	*
	* @return the receiver country code of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getReceiverCountryCode() {
		return _aswmsgSyndatahistory.getReceiverCountryCode();
	}

	/**
	* Sets the receiver country code of this aswmsg syndatahistory.
	*
	* @param receiverCountryCode the receiver country code of this aswmsg syndatahistory
	*/
	@Override
	public void setReceiverCountryCode(java.lang.String receiverCountryCode) {
		_aswmsgSyndatahistory.setReceiverCountryCode(receiverCountryCode);
	}

	/**
	* Returns the receiver ministry code of this aswmsg syndatahistory.
	*
	* @return the receiver ministry code of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getReceiverMinistryCode() {
		return _aswmsgSyndatahistory.getReceiverMinistryCode();
	}

	/**
	* Sets the receiver ministry code of this aswmsg syndatahistory.
	*
	* @param receiverMinistryCode the receiver ministry code of this aswmsg syndatahistory
	*/
	@Override
	public void setReceiverMinistryCode(java.lang.String receiverMinistryCode) {
		_aswmsgSyndatahistory.setReceiverMinistryCode(receiverMinistryCode);
	}

	/**
	* Returns the receiver organization code of this aswmsg syndatahistory.
	*
	* @return the receiver organization code of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getReceiverOrganizationCode() {
		return _aswmsgSyndatahistory.getReceiverOrganizationCode();
	}

	/**
	* Sets the receiver organization code of this aswmsg syndatahistory.
	*
	* @param receiverOrganizationCode the receiver organization code of this aswmsg syndatahistory
	*/
	@Override
	public void setReceiverOrganizationCode(
		java.lang.String receiverOrganizationCode) {
		_aswmsgSyndatahistory.setReceiverOrganizationCode(receiverOrganizationCode);
	}

	/**
	* Returns the receiver unit code of this aswmsg syndatahistory.
	*
	* @return the receiver unit code of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getReceiverUnitCode() {
		return _aswmsgSyndatahistory.getReceiverUnitCode();
	}

	/**
	* Sets the receiver unit code of this aswmsg syndatahistory.
	*
	* @param receiverUnitCode the receiver unit code of this aswmsg syndatahistory
	*/
	@Override
	public void setReceiverUnitCode(java.lang.String receiverUnitCode) {
		_aswmsgSyndatahistory.setReceiverUnitCode(receiverUnitCode);
	}

	/**
	* Returns the document type of this aswmsg syndatahistory.
	*
	* @return the document type of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getDocumentType() {
		return _aswmsgSyndatahistory.getDocumentType();
	}

	/**
	* Sets the document type of this aswmsg syndatahistory.
	*
	* @param documentType the document type of this aswmsg syndatahistory
	*/
	@Override
	public void setDocumentType(java.lang.String documentType) {
		_aswmsgSyndatahistory.setDocumentType(documentType);
	}

	/**
	* Returns the type of this aswmsg syndatahistory.
	*
	* @return the type of this aswmsg syndatahistory
	*/
	@Override
	public int getType() {
		return _aswmsgSyndatahistory.getType();
	}

	/**
	* Sets the type of this aswmsg syndatahistory.
	*
	* @param type the type of this aswmsg syndatahistory
	*/
	@Override
	public void setType(int type) {
		_aswmsgSyndatahistory.setType(type);
	}

	/**
	* Returns the function of this aswmsg syndatahistory.
	*
	* @return the function of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getFunction() {
		return _aswmsgSyndatahistory.getFunction();
	}

	/**
	* Sets the function of this aswmsg syndatahistory.
	*
	* @param function the function of this aswmsg syndatahistory
	*/
	@Override
	public void setFunction(java.lang.String function) {
		_aswmsgSyndatahistory.setFunction(function);
	}

	/**
	* Returns the reference of this aswmsg syndatahistory.
	*
	* @return the reference of this aswmsg syndatahistory
	*/
	@Override
	public long getReference() {
		return _aswmsgSyndatahistory.getReference();
	}

	/**
	* Sets the reference of this aswmsg syndatahistory.
	*
	* @param reference the reference of this aswmsg syndatahistory
	*/
	@Override
	public void setReference(long reference) {
		_aswmsgSyndatahistory.setReference(reference);
	}

	/**
	* Returns the pre reference of this aswmsg syndatahistory.
	*
	* @return the pre reference of this aswmsg syndatahistory
	*/
	@Override
	public long getPreReference() {
		return _aswmsgSyndatahistory.getPreReference();
	}

	/**
	* Sets the pre reference of this aswmsg syndatahistory.
	*
	* @param preReference the pre reference of this aswmsg syndatahistory
	*/
	@Override
	public void setPreReference(long preReference) {
		_aswmsgSyndatahistory.setPreReference(preReference);
	}

	/**
	* Returns the document year of this aswmsg syndatahistory.
	*
	* @return the document year of this aswmsg syndatahistory
	*/
	@Override
	public int getDocumentYear() {
		return _aswmsgSyndatahistory.getDocumentYear();
	}

	/**
	* Sets the document year of this aswmsg syndatahistory.
	*
	* @param documentYear the document year of this aswmsg syndatahistory
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_aswmsgSyndatahistory.setDocumentYear(documentYear);
	}

	/**
	* Returns the send date of this aswmsg syndatahistory.
	*
	* @return the send date of this aswmsg syndatahistory
	*/
	@Override
	public java.util.Date getSendDate() {
		return _aswmsgSyndatahistory.getSendDate();
	}

	/**
	* Sets the send date of this aswmsg syndatahistory.
	*
	* @param sendDate the send date of this aswmsg syndatahistory
	*/
	@Override
	public void setSendDate(java.util.Date sendDate) {
		_aswmsgSyndatahistory.setSendDate(sendDate);
	}

	/**
	* Returns the signature of this aswmsg syndatahistory.
	*
	* @return the signature of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getSignature() {
		return _aswmsgSyndatahistory.getSignature();
	}

	/**
	* Sets the signature of this aswmsg syndatahistory.
	*
	* @param signature the signature of this aswmsg syndatahistory
	*/
	@Override
	public void setSignature(java.lang.String signature) {
		_aswmsgSyndatahistory.setSignature(signature);
	}

	/**
	* Returns the system signature of this aswmsg syndatahistory.
	*
	* @return the system signature of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getSystemSignature() {
		return _aswmsgSyndatahistory.getSystemSignature();
	}

	/**
	* Sets the system signature of this aswmsg syndatahistory.
	*
	* @param systemSignature the system signature of this aswmsg syndatahistory
	*/
	@Override
	public void setSystemSignature(java.lang.String systemSignature) {
		_aswmsgSyndatahistory.setSystemSignature(systemSignature);
	}

	/**
	* Returns the all content of this aswmsg syndatahistory.
	*
	* @return the all content of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getAllContent() {
		return _aswmsgSyndatahistory.getAllContent();
	}

	/**
	* Sets the all content of this aswmsg syndatahistory.
	*
	* @param allContent the all content of this aswmsg syndatahistory
	*/
	@Override
	public void setAllContent(java.lang.String allContent) {
		_aswmsgSyndatahistory.setAllContent(allContent);
	}

	/**
	* Returns the created time of this aswmsg syndatahistory.
	*
	* @return the created time of this aswmsg syndatahistory
	*/
	@Override
	public java.util.Date getCreatedTime() {
		return _aswmsgSyndatahistory.getCreatedTime();
	}

	/**
	* Sets the created time of this aswmsg syndatahistory.
	*
	* @param createdTime the created time of this aswmsg syndatahistory
	*/
	@Override
	public void setCreatedTime(java.util.Date createdTime) {
		_aswmsgSyndatahistory.setCreatedTime(createdTime);
	}

	/**
	* Returns the webservice of this aswmsg syndatahistory.
	*
	* @return the webservice of this aswmsg syndatahistory
	*/
	@Override
	public int getWebservice() {
		return _aswmsgSyndatahistory.getWebservice();
	}

	/**
	* Sets the webservice of this aswmsg syndatahistory.
	*
	* @param webservice the webservice of this aswmsg syndatahistory
	*/
	@Override
	public void setWebservice(int webservice) {
		_aswmsgSyndatahistory.setWebservice(webservice);
	}

	/**
	* Returns the validated of this aswmsg syndatahistory.
	*
	* @return the validated of this aswmsg syndatahistory
	*/
	@Override
	public int getValidated() {
		return _aswmsgSyndatahistory.getValidated();
	}

	/**
	* Sets the validated of this aswmsg syndatahistory.
	*
	* @param validated the validated of this aswmsg syndatahistory
	*/
	@Override
	public void setValidated(int validated) {
		_aswmsgSyndatahistory.setValidated(validated);
	}

	/**
	* Returns the priority of this aswmsg syndatahistory.
	*
	* @return the priority of this aswmsg syndatahistory
	*/
	@Override
	public int getPriority() {
		return _aswmsgSyndatahistory.getPriority();
	}

	/**
	* Sets the priority of this aswmsg syndatahistory.
	*
	* @param priority the priority of this aswmsg syndatahistory
	*/
	@Override
	public void setPriority(int priority) {
		_aswmsgSyndatahistory.setPriority(priority);
	}

	/**
	* Returns the description of this aswmsg syndatahistory.
	*
	* @return the description of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getDescription() {
		return _aswmsgSyndatahistory.getDescription();
	}

	/**
	* Sets the description of this aswmsg syndatahistory.
	*
	* @param description the description of this aswmsg syndatahistory
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_aswmsgSyndatahistory.setDescription(description);
	}

	/**
	* Returns the validation code of this aswmsg syndatahistory.
	*
	* @return the validation code of this aswmsg syndatahistory
	*/
	@Override
	public java.lang.String getValidationCode() {
		return _aswmsgSyndatahistory.getValidationCode();
	}

	/**
	* Sets the validation code of this aswmsg syndatahistory.
	*
	* @param validationCode the validation code of this aswmsg syndatahistory
	*/
	@Override
	public void setValidationCode(java.lang.String validationCode) {
		_aswmsgSyndatahistory.setValidationCode(validationCode);
	}

	/**
	* Returns the so lan gui of this aswmsg syndatahistory.
	*
	* @return the so lan gui of this aswmsg syndatahistory
	*/
	@Override
	public int getSoLanGui() {
		return _aswmsgSyndatahistory.getSoLanGui();
	}

	/**
	* Sets the so lan gui of this aswmsg syndatahistory.
	*
	* @param soLanGui the so lan gui of this aswmsg syndatahistory
	*/
	@Override
	public void setSoLanGui(int soLanGui) {
		_aswmsgSyndatahistory.setSoLanGui(soLanGui);
	}

	@Override
	public boolean isNew() {
		return _aswmsgSyndatahistory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_aswmsgSyndatahistory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _aswmsgSyndatahistory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_aswmsgSyndatahistory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _aswmsgSyndatahistory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _aswmsgSyndatahistory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_aswmsgSyndatahistory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _aswmsgSyndatahistory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_aswmsgSyndatahistory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_aswmsgSyndatahistory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_aswmsgSyndatahistory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AswmsgSyndatahistoryWrapper((AswmsgSyndatahistory)_aswmsgSyndatahistory.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory aswmsgSyndatahistory) {
		return _aswmsgSyndatahistory.compareTo(aswmsgSyndatahistory);
	}

	@Override
	public int hashCode() {
		return _aswmsgSyndatahistory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> toCacheModel() {
		return _aswmsgSyndatahistory.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory toEscapedModel() {
		return new AswmsgSyndatahistoryWrapper(_aswmsgSyndatahistory.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory toUnescapedModel() {
		return new AswmsgSyndatahistoryWrapper(_aswmsgSyndatahistory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _aswmsgSyndatahistory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _aswmsgSyndatahistory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_aswmsgSyndatahistory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AswmsgSyndatahistoryWrapper)) {
			return false;
		}

		AswmsgSyndatahistoryWrapper aswmsgSyndatahistoryWrapper = (AswmsgSyndatahistoryWrapper)obj;

		if (Validator.equals(_aswmsgSyndatahistory,
					aswmsgSyndatahistoryWrapper._aswmsgSyndatahistory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AswmsgSyndatahistory getWrappedAswmsgSyndatahistory() {
		return _aswmsgSyndatahistory;
	}

	@Override
	public AswmsgSyndatahistory getWrappedModel() {
		return _aswmsgSyndatahistory;
	}

	@Override
	public void resetOriginalValues() {
		_aswmsgSyndatahistory.resetOriginalValues();
	}

	private AswmsgSyndatahistory _aswmsgSyndatahistory;
}