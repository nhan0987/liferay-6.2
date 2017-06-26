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
 * This class is a wrapper for {@link AswmsgMessageQueue}.
 * </p>
 *
 * @author win_64
 * @see AswmsgMessageQueue
 * @generated
 */
public class AswmsgMessageQueueWrapper implements AswmsgMessageQueue,
	ModelWrapper<AswmsgMessageQueue> {
	public AswmsgMessageQueueWrapper(AswmsgMessageQueue aswmsgMessageQueue) {
		_aswmsgMessageQueue = aswmsgMessageQueue;
	}

	@Override
	public Class<?> getModelClass() {
		return AswmsgMessageQueue.class;
	}

	@Override
	public String getModelClassName() {
		return AswmsgMessageQueue.class.getName();
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
		attributes.put("hoSoThuTucId", getHoSoThuTucId());
		attributes.put("phieuXuLyPhuId", getPhieuXuLyPhuId());

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

		Long hoSoThuTucId = (Long)attributes.get("hoSoThuTucId");

		if (hoSoThuTucId != null) {
			setHoSoThuTucId(hoSoThuTucId);
		}

		Long phieuXuLyPhuId = (Long)attributes.get("phieuXuLyPhuId");

		if (phieuXuLyPhuId != null) {
			setPhieuXuLyPhuId(phieuXuLyPhuId);
		}
	}

	/**
	* Returns the primary key of this aswmsg message queue.
	*
	* @return the primary key of this aswmsg message queue
	*/
	@Override
	public long getPrimaryKey() {
		return _aswmsgMessageQueue.getPrimaryKey();
	}

	/**
	* Sets the primary key of this aswmsg message queue.
	*
	* @param primaryKey the primary key of this aswmsg message queue
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_aswmsgMessageQueue.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this aswmsg message queue.
	*
	* @return the ID of this aswmsg message queue
	*/
	@Override
	public long getId() {
		return _aswmsgMessageQueue.getId();
	}

	/**
	* Sets the ID of this aswmsg message queue.
	*
	* @param id the ID of this aswmsg message queue
	*/
	@Override
	public void setId(long id) {
		_aswmsgMessageQueue.setId(id);
	}

	/**
	* Returns the version of this aswmsg message queue.
	*
	* @return the version of this aswmsg message queue
	*/
	@Override
	public java.lang.String getVersion() {
		return _aswmsgMessageQueue.getVersion();
	}

	/**
	* Sets the version of this aswmsg message queue.
	*
	* @param version the version of this aswmsg message queue
	*/
	@Override
	public void setVersion(java.lang.String version) {
		_aswmsgMessageQueue.setVersion(version);
	}

	/**
	* Returns the message ID of this aswmsg message queue.
	*
	* @return the message ID of this aswmsg message queue
	*/
	@Override
	public java.lang.String getMessageId() {
		return _aswmsgMessageQueue.getMessageId();
	}

	/**
	* Sets the message ID of this aswmsg message queue.
	*
	* @param messageId the message ID of this aswmsg message queue
	*/
	@Override
	public void setMessageId(java.lang.String messageId) {
		_aswmsgMessageQueue.setMessageId(messageId);
	}

	/**
	* Returns the sender name of this aswmsg message queue.
	*
	* @return the sender name of this aswmsg message queue
	*/
	@Override
	public java.lang.String getSenderName() {
		return _aswmsgMessageQueue.getSenderName();
	}

	/**
	* Sets the sender name of this aswmsg message queue.
	*
	* @param senderName the sender name of this aswmsg message queue
	*/
	@Override
	public void setSenderName(java.lang.String senderName) {
		_aswmsgMessageQueue.setSenderName(senderName);
	}

	/**
	* Returns the sender identity of this aswmsg message queue.
	*
	* @return the sender identity of this aswmsg message queue
	*/
	@Override
	public java.lang.String getSenderIdentity() {
		return _aswmsgMessageQueue.getSenderIdentity();
	}

	/**
	* Sets the sender identity of this aswmsg message queue.
	*
	* @param senderIdentity the sender identity of this aswmsg message queue
	*/
	@Override
	public void setSenderIdentity(java.lang.String senderIdentity) {
		_aswmsgMessageQueue.setSenderIdentity(senderIdentity);
	}

	/**
	* Returns the sender country code of this aswmsg message queue.
	*
	* @return the sender country code of this aswmsg message queue
	*/
	@Override
	public java.lang.String getSenderCountryCode() {
		return _aswmsgMessageQueue.getSenderCountryCode();
	}

	/**
	* Sets the sender country code of this aswmsg message queue.
	*
	* @param senderCountryCode the sender country code of this aswmsg message queue
	*/
	@Override
	public void setSenderCountryCode(java.lang.String senderCountryCode) {
		_aswmsgMessageQueue.setSenderCountryCode(senderCountryCode);
	}

	/**
	* Returns the sender ministry code of this aswmsg message queue.
	*
	* @return the sender ministry code of this aswmsg message queue
	*/
	@Override
	public java.lang.String getSenderMinistryCode() {
		return _aswmsgMessageQueue.getSenderMinistryCode();
	}

	/**
	* Sets the sender ministry code of this aswmsg message queue.
	*
	* @param senderMinistryCode the sender ministry code of this aswmsg message queue
	*/
	@Override
	public void setSenderMinistryCode(java.lang.String senderMinistryCode) {
		_aswmsgMessageQueue.setSenderMinistryCode(senderMinistryCode);
	}

	/**
	* Returns the sender organization code of this aswmsg message queue.
	*
	* @return the sender organization code of this aswmsg message queue
	*/
	@Override
	public java.lang.String getSenderOrganizationCode() {
		return _aswmsgMessageQueue.getSenderOrganizationCode();
	}

	/**
	* Sets the sender organization code of this aswmsg message queue.
	*
	* @param senderOrganizationCode the sender organization code of this aswmsg message queue
	*/
	@Override
	public void setSenderOrganizationCode(
		java.lang.String senderOrganizationCode) {
		_aswmsgMessageQueue.setSenderOrganizationCode(senderOrganizationCode);
	}

	/**
	* Returns the sender unit code of this aswmsg message queue.
	*
	* @return the sender unit code of this aswmsg message queue
	*/
	@Override
	public java.lang.String getSenderUnitCode() {
		return _aswmsgMessageQueue.getSenderUnitCode();
	}

	/**
	* Sets the sender unit code of this aswmsg message queue.
	*
	* @param senderUnitCode the sender unit code of this aswmsg message queue
	*/
	@Override
	public void setSenderUnitCode(java.lang.String senderUnitCode) {
		_aswmsgMessageQueue.setSenderUnitCode(senderUnitCode);
	}

	/**
	* Returns the receiver name of this aswmsg message queue.
	*
	* @return the receiver name of this aswmsg message queue
	*/
	@Override
	public java.lang.String getReceiverName() {
		return _aswmsgMessageQueue.getReceiverName();
	}

	/**
	* Sets the receiver name of this aswmsg message queue.
	*
	* @param receiverName the receiver name of this aswmsg message queue
	*/
	@Override
	public void setReceiverName(java.lang.String receiverName) {
		_aswmsgMessageQueue.setReceiverName(receiverName);
	}

	/**
	* Returns the receiver identity of this aswmsg message queue.
	*
	* @return the receiver identity of this aswmsg message queue
	*/
	@Override
	public java.lang.String getReceiverIdentity() {
		return _aswmsgMessageQueue.getReceiverIdentity();
	}

	/**
	* Sets the receiver identity of this aswmsg message queue.
	*
	* @param receiverIdentity the receiver identity of this aswmsg message queue
	*/
	@Override
	public void setReceiverIdentity(java.lang.String receiverIdentity) {
		_aswmsgMessageQueue.setReceiverIdentity(receiverIdentity);
	}

	/**
	* Returns the receiver country code of this aswmsg message queue.
	*
	* @return the receiver country code of this aswmsg message queue
	*/
	@Override
	public java.lang.String getReceiverCountryCode() {
		return _aswmsgMessageQueue.getReceiverCountryCode();
	}

	/**
	* Sets the receiver country code of this aswmsg message queue.
	*
	* @param receiverCountryCode the receiver country code of this aswmsg message queue
	*/
	@Override
	public void setReceiverCountryCode(java.lang.String receiverCountryCode) {
		_aswmsgMessageQueue.setReceiverCountryCode(receiverCountryCode);
	}

	/**
	* Returns the receiver ministry code of this aswmsg message queue.
	*
	* @return the receiver ministry code of this aswmsg message queue
	*/
	@Override
	public java.lang.String getReceiverMinistryCode() {
		return _aswmsgMessageQueue.getReceiverMinistryCode();
	}

	/**
	* Sets the receiver ministry code of this aswmsg message queue.
	*
	* @param receiverMinistryCode the receiver ministry code of this aswmsg message queue
	*/
	@Override
	public void setReceiverMinistryCode(java.lang.String receiverMinistryCode) {
		_aswmsgMessageQueue.setReceiverMinistryCode(receiverMinistryCode);
	}

	/**
	* Returns the receiver organization code of this aswmsg message queue.
	*
	* @return the receiver organization code of this aswmsg message queue
	*/
	@Override
	public java.lang.String getReceiverOrganizationCode() {
		return _aswmsgMessageQueue.getReceiverOrganizationCode();
	}

	/**
	* Sets the receiver organization code of this aswmsg message queue.
	*
	* @param receiverOrganizationCode the receiver organization code of this aswmsg message queue
	*/
	@Override
	public void setReceiverOrganizationCode(
		java.lang.String receiverOrganizationCode) {
		_aswmsgMessageQueue.setReceiverOrganizationCode(receiverOrganizationCode);
	}

	/**
	* Returns the receiver unit code of this aswmsg message queue.
	*
	* @return the receiver unit code of this aswmsg message queue
	*/
	@Override
	public java.lang.String getReceiverUnitCode() {
		return _aswmsgMessageQueue.getReceiverUnitCode();
	}

	/**
	* Sets the receiver unit code of this aswmsg message queue.
	*
	* @param receiverUnitCode the receiver unit code of this aswmsg message queue
	*/
	@Override
	public void setReceiverUnitCode(java.lang.String receiverUnitCode) {
		_aswmsgMessageQueue.setReceiverUnitCode(receiverUnitCode);
	}

	/**
	* Returns the document type of this aswmsg message queue.
	*
	* @return the document type of this aswmsg message queue
	*/
	@Override
	public java.lang.String getDocumentType() {
		return _aswmsgMessageQueue.getDocumentType();
	}

	/**
	* Sets the document type of this aswmsg message queue.
	*
	* @param documentType the document type of this aswmsg message queue
	*/
	@Override
	public void setDocumentType(java.lang.String documentType) {
		_aswmsgMessageQueue.setDocumentType(documentType);
	}

	/**
	* Returns the type of this aswmsg message queue.
	*
	* @return the type of this aswmsg message queue
	*/
	@Override
	public int getType() {
		return _aswmsgMessageQueue.getType();
	}

	/**
	* Sets the type of this aswmsg message queue.
	*
	* @param type the type of this aswmsg message queue
	*/
	@Override
	public void setType(int type) {
		_aswmsgMessageQueue.setType(type);
	}

	/**
	* Returns the function of this aswmsg message queue.
	*
	* @return the function of this aswmsg message queue
	*/
	@Override
	public java.lang.String getFunction() {
		return _aswmsgMessageQueue.getFunction();
	}

	/**
	* Sets the function of this aswmsg message queue.
	*
	* @param function the function of this aswmsg message queue
	*/
	@Override
	public void setFunction(java.lang.String function) {
		_aswmsgMessageQueue.setFunction(function);
	}

	/**
	* Returns the reference of this aswmsg message queue.
	*
	* @return the reference of this aswmsg message queue
	*/
	@Override
	public long getReference() {
		return _aswmsgMessageQueue.getReference();
	}

	/**
	* Sets the reference of this aswmsg message queue.
	*
	* @param reference the reference of this aswmsg message queue
	*/
	@Override
	public void setReference(long reference) {
		_aswmsgMessageQueue.setReference(reference);
	}

	/**
	* Returns the pre reference of this aswmsg message queue.
	*
	* @return the pre reference of this aswmsg message queue
	*/
	@Override
	public long getPreReference() {
		return _aswmsgMessageQueue.getPreReference();
	}

	/**
	* Sets the pre reference of this aswmsg message queue.
	*
	* @param preReference the pre reference of this aswmsg message queue
	*/
	@Override
	public void setPreReference(long preReference) {
		_aswmsgMessageQueue.setPreReference(preReference);
	}

	/**
	* Returns the document year of this aswmsg message queue.
	*
	* @return the document year of this aswmsg message queue
	*/
	@Override
	public int getDocumentYear() {
		return _aswmsgMessageQueue.getDocumentYear();
	}

	/**
	* Sets the document year of this aswmsg message queue.
	*
	* @param documentYear the document year of this aswmsg message queue
	*/
	@Override
	public void setDocumentYear(int documentYear) {
		_aswmsgMessageQueue.setDocumentYear(documentYear);
	}

	/**
	* Returns the send date of this aswmsg message queue.
	*
	* @return the send date of this aswmsg message queue
	*/
	@Override
	public java.util.Date getSendDate() {
		return _aswmsgMessageQueue.getSendDate();
	}

	/**
	* Sets the send date of this aswmsg message queue.
	*
	* @param sendDate the send date of this aswmsg message queue
	*/
	@Override
	public void setSendDate(java.util.Date sendDate) {
		_aswmsgMessageQueue.setSendDate(sendDate);
	}

	/**
	* Returns the signature of this aswmsg message queue.
	*
	* @return the signature of this aswmsg message queue
	*/
	@Override
	public java.lang.String getSignature() {
		return _aswmsgMessageQueue.getSignature();
	}

	/**
	* Sets the signature of this aswmsg message queue.
	*
	* @param signature the signature of this aswmsg message queue
	*/
	@Override
	public void setSignature(java.lang.String signature) {
		_aswmsgMessageQueue.setSignature(signature);
	}

	/**
	* Returns the system signature of this aswmsg message queue.
	*
	* @return the system signature of this aswmsg message queue
	*/
	@Override
	public java.lang.String getSystemSignature() {
		return _aswmsgMessageQueue.getSystemSignature();
	}

	/**
	* Sets the system signature of this aswmsg message queue.
	*
	* @param systemSignature the system signature of this aswmsg message queue
	*/
	@Override
	public void setSystemSignature(java.lang.String systemSignature) {
		_aswmsgMessageQueue.setSystemSignature(systemSignature);
	}

	/**
	* Returns the all content of this aswmsg message queue.
	*
	* @return the all content of this aswmsg message queue
	*/
	@Override
	public java.lang.String getAllContent() {
		return _aswmsgMessageQueue.getAllContent();
	}

	/**
	* Sets the all content of this aswmsg message queue.
	*
	* @param allContent the all content of this aswmsg message queue
	*/
	@Override
	public void setAllContent(java.lang.String allContent) {
		_aswmsgMessageQueue.setAllContent(allContent);
	}

	/**
	* Returns the created time of this aswmsg message queue.
	*
	* @return the created time of this aswmsg message queue
	*/
	@Override
	public java.util.Date getCreatedTime() {
		return _aswmsgMessageQueue.getCreatedTime();
	}

	/**
	* Sets the created time of this aswmsg message queue.
	*
	* @param createdTime the created time of this aswmsg message queue
	*/
	@Override
	public void setCreatedTime(java.util.Date createdTime) {
		_aswmsgMessageQueue.setCreatedTime(createdTime);
	}

	/**
	* Returns the webservice of this aswmsg message queue.
	*
	* @return the webservice of this aswmsg message queue
	*/
	@Override
	public int getWebservice() {
		return _aswmsgMessageQueue.getWebservice();
	}

	/**
	* Sets the webservice of this aswmsg message queue.
	*
	* @param webservice the webservice of this aswmsg message queue
	*/
	@Override
	public void setWebservice(int webservice) {
		_aswmsgMessageQueue.setWebservice(webservice);
	}

	/**
	* Returns the validated of this aswmsg message queue.
	*
	* @return the validated of this aswmsg message queue
	*/
	@Override
	public int getValidated() {
		return _aswmsgMessageQueue.getValidated();
	}

	/**
	* Sets the validated of this aswmsg message queue.
	*
	* @param validated the validated of this aswmsg message queue
	*/
	@Override
	public void setValidated(int validated) {
		_aswmsgMessageQueue.setValidated(validated);
	}

	/**
	* Returns the priority of this aswmsg message queue.
	*
	* @return the priority of this aswmsg message queue
	*/
	@Override
	public int getPriority() {
		return _aswmsgMessageQueue.getPriority();
	}

	/**
	* Sets the priority of this aswmsg message queue.
	*
	* @param priority the priority of this aswmsg message queue
	*/
	@Override
	public void setPriority(int priority) {
		_aswmsgMessageQueue.setPriority(priority);
	}

	/**
	* Returns the description of this aswmsg message queue.
	*
	* @return the description of this aswmsg message queue
	*/
	@Override
	public java.lang.String getDescription() {
		return _aswmsgMessageQueue.getDescription();
	}

	/**
	* Sets the description of this aswmsg message queue.
	*
	* @param description the description of this aswmsg message queue
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_aswmsgMessageQueue.setDescription(description);
	}

	/**
	* Returns the validation code of this aswmsg message queue.
	*
	* @return the validation code of this aswmsg message queue
	*/
	@Override
	public java.lang.String getValidationCode() {
		return _aswmsgMessageQueue.getValidationCode();
	}

	/**
	* Sets the validation code of this aswmsg message queue.
	*
	* @param validationCode the validation code of this aswmsg message queue
	*/
	@Override
	public void setValidationCode(java.lang.String validationCode) {
		_aswmsgMessageQueue.setValidationCode(validationCode);
	}

	/**
	* Returns the so lan gui of this aswmsg message queue.
	*
	* @return the so lan gui of this aswmsg message queue
	*/
	@Override
	public int getSoLanGui() {
		return _aswmsgMessageQueue.getSoLanGui();
	}

	/**
	* Sets the so lan gui of this aswmsg message queue.
	*
	* @param soLanGui the so lan gui of this aswmsg message queue
	*/
	@Override
	public void setSoLanGui(int soLanGui) {
		_aswmsgMessageQueue.setSoLanGui(soLanGui);
	}

	/**
	* Returns the ho so thu tuc ID of this aswmsg message queue.
	*
	* @return the ho so thu tuc ID of this aswmsg message queue
	*/
	@Override
	public long getHoSoThuTucId() {
		return _aswmsgMessageQueue.getHoSoThuTucId();
	}

	/**
	* Sets the ho so thu tuc ID of this aswmsg message queue.
	*
	* @param hoSoThuTucId the ho so thu tuc ID of this aswmsg message queue
	*/
	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_aswmsgMessageQueue.setHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the phieu xu ly phu ID of this aswmsg message queue.
	*
	* @return the phieu xu ly phu ID of this aswmsg message queue
	*/
	@Override
	public long getPhieuXuLyPhuId() {
		return _aswmsgMessageQueue.getPhieuXuLyPhuId();
	}

	/**
	* Sets the phieu xu ly phu ID of this aswmsg message queue.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID of this aswmsg message queue
	*/
	@Override
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_aswmsgMessageQueue.setPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	@Override
	public boolean isNew() {
		return _aswmsgMessageQueue.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_aswmsgMessageQueue.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _aswmsgMessageQueue.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_aswmsgMessageQueue.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _aswmsgMessageQueue.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _aswmsgMessageQueue.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_aswmsgMessageQueue.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _aswmsgMessageQueue.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_aswmsgMessageQueue.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_aswmsgMessageQueue.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_aswmsgMessageQueue.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AswmsgMessageQueueWrapper((AswmsgMessageQueue)_aswmsgMessageQueue.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue aswmsgMessageQueue) {
		return _aswmsgMessageQueue.compareTo(aswmsgMessageQueue);
	}

	@Override
	public int hashCode() {
		return _aswmsgMessageQueue.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue> toCacheModel() {
		return _aswmsgMessageQueue.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue toEscapedModel() {
		return new AswmsgMessageQueueWrapper(_aswmsgMessageQueue.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue toUnescapedModel() {
		return new AswmsgMessageQueueWrapper(_aswmsgMessageQueue.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _aswmsgMessageQueue.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _aswmsgMessageQueue.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_aswmsgMessageQueue.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AswmsgMessageQueueWrapper)) {
			return false;
		}

		AswmsgMessageQueueWrapper aswmsgMessageQueueWrapper = (AswmsgMessageQueueWrapper)obj;

		if (Validator.equals(_aswmsgMessageQueue,
					aswmsgMessageQueueWrapper._aswmsgMessageQueue)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AswmsgMessageQueue getWrappedAswmsgMessageQueue() {
		return _aswmsgMessageQueue;
	}

	@Override
	public AswmsgMessageQueue getWrappedModel() {
		return _aswmsgMessageQueue;
	}

	@Override
	public void resetOriginalValues() {
		_aswmsgMessageQueue.resetOriginalValues();
	}

	private AswmsgMessageQueue _aswmsgMessageQueue;
}