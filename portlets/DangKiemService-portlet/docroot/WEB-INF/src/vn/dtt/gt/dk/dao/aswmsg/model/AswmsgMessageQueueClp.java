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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageQueueLocalServiceUtil;
import vn.dtt.gt.dk.dao.aswmsg.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class AswmsgMessageQueueClp extends BaseModelImpl<AswmsgMessageQueue>
	implements AswmsgMessageQueue {
	public AswmsgMessageQueueClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVersion() {
		return _version;
	}

	@Override
	public void setVersion(String version) {
		_version = version;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setVersion", String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, version);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessageId() {
		return _messageId;
	}

	@Override
	public void setMessageId(String messageId) {
		_messageId = messageId;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageId", String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, messageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderName() {
		return _senderName;
	}

	@Override
	public void setSenderName(String senderName) {
		_senderName = senderName;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderName", String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, senderName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderIdentity() {
		return _senderIdentity;
	}

	@Override
	public void setSenderIdentity(String senderIdentity) {
		_senderIdentity = senderIdentity;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderIdentity",
						String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, senderIdentity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderCountryCode() {
		return _senderCountryCode;
	}

	@Override
	public void setSenderCountryCode(String senderCountryCode) {
		_senderCountryCode = senderCountryCode;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderCountryCode",
						String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, senderCountryCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderMinistryCode() {
		return _senderMinistryCode;
	}

	@Override
	public void setSenderMinistryCode(String senderMinistryCode) {
		_senderMinistryCode = senderMinistryCode;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderMinistryCode",
						String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, senderMinistryCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderOrganizationCode() {
		return _senderOrganizationCode;
	}

	@Override
	public void setSenderOrganizationCode(String senderOrganizationCode) {
		_senderOrganizationCode = senderOrganizationCode;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderOrganizationCode",
						String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel,
					senderOrganizationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderUnitCode() {
		return _senderUnitCode;
	}

	@Override
	public void setSenderUnitCode(String senderUnitCode) {
		_senderUnitCode = senderUnitCode;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderUnitCode",
						String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, senderUnitCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverName() {
		return _receiverName;
	}

	@Override
	public void setReceiverName(String receiverName) {
		_receiverName = receiverName;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverName", String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, receiverName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverIdentity() {
		return _receiverIdentity;
	}

	@Override
	public void setReceiverIdentity(String receiverIdentity) {
		_receiverIdentity = receiverIdentity;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverIdentity",
						String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, receiverIdentity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverCountryCode() {
		return _receiverCountryCode;
	}

	@Override
	public void setReceiverCountryCode(String receiverCountryCode) {
		_receiverCountryCode = receiverCountryCode;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverCountryCode",
						String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel,
					receiverCountryCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverMinistryCode() {
		return _receiverMinistryCode;
	}

	@Override
	public void setReceiverMinistryCode(String receiverMinistryCode) {
		_receiverMinistryCode = receiverMinistryCode;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverMinistryCode",
						String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel,
					receiverMinistryCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverOrganizationCode() {
		return _receiverOrganizationCode;
	}

	@Override
	public void setReceiverOrganizationCode(String receiverOrganizationCode) {
		_receiverOrganizationCode = receiverOrganizationCode;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverOrganizationCode",
						String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel,
					receiverOrganizationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverUnitCode() {
		return _receiverUnitCode;
	}

	@Override
	public void setReceiverUnitCode(String receiverUnitCode) {
		_receiverUnitCode = receiverUnitCode;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverUnitCode",
						String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, receiverUnitCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocumentType() {
		return _documentType;
	}

	@Override
	public void setDocumentType(String documentType) {
		_documentType = documentType;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentType", String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, documentType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getType() {
		return _type;
	}

	@Override
	public void setType(int type) {
		_type = type;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setType", int.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFunction() {
		return _function;
	}

	@Override
	public void setFunction(String function) {
		_function = function;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setFunction", String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, function);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getReference() {
		return _reference;
	}

	@Override
	public void setReference(long reference) {
		_reference = reference;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setReference", long.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, reference);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPreReference() {
		return _preReference;
	}

	@Override
	public void setPreReference(long preReference) {
		_preReference = preReference;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setPreReference", long.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, preReference);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDocumentYear() {
		return _documentYear;
	}

	@Override
	public void setDocumentYear(int documentYear) {
		_documentYear = documentYear;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, documentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSendDate() {
		return _sendDate;
	}

	@Override
	public void setSendDate(Date sendDate) {
		_sendDate = sendDate;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setSendDate", Date.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, sendDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignature() {
		return _signature;
	}

	@Override
	public void setSignature(String signature) {
		_signature = signature;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setSignature", String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, signature);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSystemSignature() {
		return _systemSignature;
	}

	@Override
	public void setSystemSignature(String systemSignature) {
		_systemSignature = systemSignature;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setSystemSignature",
						String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, systemSignature);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAllContent() {
		return _allContent;
	}

	@Override
	public void setAllContent(String allContent) {
		_allContent = allContent;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setAllContent", String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, allContent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedTime() {
		return _createdTime;
	}

	@Override
	public void setCreatedTime(Date createdTime) {
		_createdTime = createdTime;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedTime", Date.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, createdTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getWebservice() {
		return _webservice;
	}

	@Override
	public void setWebservice(int webservice) {
		_webservice = webservice;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setWebservice", int.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, webservice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getValidated() {
		return _validated;
	}

	@Override
	public void setValidated(int validated) {
		_validated = validated;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setValidated", int.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, validated);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPriority() {
		return _priority;
	}

	@Override
	public void setPriority(int priority) {
		_priority = priority;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setPriority", int.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, priority);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValidationCode() {
		return _validationCode;
	}

	@Override
	public void setValidationCode(String validationCode) {
		_validationCode = validationCode;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setValidationCode",
						String.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, validationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoLanGui() {
		return _soLanGui;
	}

	@Override
	public void setSoLanGui(int soLanGui) {
		_soLanGui = soLanGui;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLanGui", int.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, soLanGui);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	@Override
	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setHoSoThuTucId", long.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, hoSoThuTucId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieuXuLyPhuId() {
		return _phieuXuLyPhuId;
	}

	@Override
	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_phieuXuLyPhuId = phieuXuLyPhuId;

		if (_aswmsgMessageQueueRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageQueueRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuXuLyPhuId", long.class);

				method.invoke(_aswmsgMessageQueueRemoteModel, phieuXuLyPhuId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAswmsgMessageQueueRemoteModel() {
		return _aswmsgMessageQueueRemoteModel;
	}

	public void setAswmsgMessageQueueRemoteModel(
		BaseModel<?> aswmsgMessageQueueRemoteModel) {
		_aswmsgMessageQueueRemoteModel = aswmsgMessageQueueRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _aswmsgMessageQueueRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_aswmsgMessageQueueRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AswmsgMessageQueueLocalServiceUtil.addAswmsgMessageQueue(this);
		}
		else {
			AswmsgMessageQueueLocalServiceUtil.updateAswmsgMessageQueue(this);
		}
	}

	@Override
	public AswmsgMessageQueue toEscapedModel() {
		return (AswmsgMessageQueue)ProxyUtil.newProxyInstance(AswmsgMessageQueue.class.getClassLoader(),
			new Class[] { AswmsgMessageQueue.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AswmsgMessageQueueClp clone = new AswmsgMessageQueueClp();

		clone.setId(getId());
		clone.setVersion(getVersion());
		clone.setMessageId(getMessageId());
		clone.setSenderName(getSenderName());
		clone.setSenderIdentity(getSenderIdentity());
		clone.setSenderCountryCode(getSenderCountryCode());
		clone.setSenderMinistryCode(getSenderMinistryCode());
		clone.setSenderOrganizationCode(getSenderOrganizationCode());
		clone.setSenderUnitCode(getSenderUnitCode());
		clone.setReceiverName(getReceiverName());
		clone.setReceiverIdentity(getReceiverIdentity());
		clone.setReceiverCountryCode(getReceiverCountryCode());
		clone.setReceiverMinistryCode(getReceiverMinistryCode());
		clone.setReceiverOrganizationCode(getReceiverOrganizationCode());
		clone.setReceiverUnitCode(getReceiverUnitCode());
		clone.setDocumentType(getDocumentType());
		clone.setType(getType());
		clone.setFunction(getFunction());
		clone.setReference(getReference());
		clone.setPreReference(getPreReference());
		clone.setDocumentYear(getDocumentYear());
		clone.setSendDate(getSendDate());
		clone.setSignature(getSignature());
		clone.setSystemSignature(getSystemSignature());
		clone.setAllContent(getAllContent());
		clone.setCreatedTime(getCreatedTime());
		clone.setWebservice(getWebservice());
		clone.setValidated(getValidated());
		clone.setPriority(getPriority());
		clone.setDescription(getDescription());
		clone.setValidationCode(getValidationCode());
		clone.setSoLanGui(getSoLanGui());
		clone.setHoSoThuTucId(getHoSoThuTucId());
		clone.setPhieuXuLyPhuId(getPhieuXuLyPhuId());

		return clone;
	}

	@Override
	public int compareTo(AswmsgMessageQueue aswmsgMessageQueue) {
		int value = 0;

		if (getPriority() < aswmsgMessageQueue.getPriority()) {
			value = -1;
		}
		else if (getPriority() > aswmsgMessageQueue.getPriority()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AswmsgMessageQueueClp)) {
			return false;
		}

		AswmsgMessageQueueClp aswmsgMessageQueue = (AswmsgMessageQueueClp)obj;

		long primaryKey = aswmsgMessageQueue.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append(", messageId=");
		sb.append(getMessageId());
		sb.append(", senderName=");
		sb.append(getSenderName());
		sb.append(", senderIdentity=");
		sb.append(getSenderIdentity());
		sb.append(", senderCountryCode=");
		sb.append(getSenderCountryCode());
		sb.append(", senderMinistryCode=");
		sb.append(getSenderMinistryCode());
		sb.append(", senderOrganizationCode=");
		sb.append(getSenderOrganizationCode());
		sb.append(", senderUnitCode=");
		sb.append(getSenderUnitCode());
		sb.append(", receiverName=");
		sb.append(getReceiverName());
		sb.append(", receiverIdentity=");
		sb.append(getReceiverIdentity());
		sb.append(", receiverCountryCode=");
		sb.append(getReceiverCountryCode());
		sb.append(", receiverMinistryCode=");
		sb.append(getReceiverMinistryCode());
		sb.append(", receiverOrganizationCode=");
		sb.append(getReceiverOrganizationCode());
		sb.append(", receiverUnitCode=");
		sb.append(getReceiverUnitCode());
		sb.append(", documentType=");
		sb.append(getDocumentType());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", function=");
		sb.append(getFunction());
		sb.append(", reference=");
		sb.append(getReference());
		sb.append(", preReference=");
		sb.append(getPreReference());
		sb.append(", documentYear=");
		sb.append(getDocumentYear());
		sb.append(", sendDate=");
		sb.append(getSendDate());
		sb.append(", signature=");
		sb.append(getSignature());
		sb.append(", systemSignature=");
		sb.append(getSystemSignature());
		sb.append(", allContent=");
		sb.append(getAllContent());
		sb.append(", createdTime=");
		sb.append(getCreatedTime());
		sb.append(", webservice=");
		sb.append(getWebservice());
		sb.append(", validated=");
		sb.append(getValidated());
		sb.append(", priority=");
		sb.append(getPriority());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", validationCode=");
		sb.append(getValidationCode());
		sb.append(", soLanGui=");
		sb.append(getSoLanGui());
		sb.append(", hoSoThuTucId=");
		sb.append(getHoSoThuTucId());
		sb.append(", phieuXuLyPhuId=");
		sb.append(getPhieuXuLyPhuId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(106);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageId</column-name><column-value><![CDATA[");
		sb.append(getMessageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderName</column-name><column-value><![CDATA[");
		sb.append(getSenderName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderIdentity</column-name><column-value><![CDATA[");
		sb.append(getSenderIdentity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderCountryCode</column-name><column-value><![CDATA[");
		sb.append(getSenderCountryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderMinistryCode</column-name><column-value><![CDATA[");
		sb.append(getSenderMinistryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderOrganizationCode</column-name><column-value><![CDATA[");
		sb.append(getSenderOrganizationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>senderUnitCode</column-name><column-value><![CDATA[");
		sb.append(getSenderUnitCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverName</column-name><column-value><![CDATA[");
		sb.append(getReceiverName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverIdentity</column-name><column-value><![CDATA[");
		sb.append(getReceiverIdentity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverCountryCode</column-name><column-value><![CDATA[");
		sb.append(getReceiverCountryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverMinistryCode</column-name><column-value><![CDATA[");
		sb.append(getReceiverMinistryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverOrganizationCode</column-name><column-value><![CDATA[");
		sb.append(getReceiverOrganizationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverUnitCode</column-name><column-value><![CDATA[");
		sb.append(getReceiverUnitCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentType</column-name><column-value><![CDATA[");
		sb.append(getDocumentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>function</column-name><column-value><![CDATA[");
		sb.append(getFunction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reference</column-name><column-value><![CDATA[");
		sb.append(getReference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preReference</column-name><column-value><![CDATA[");
		sb.append(getPreReference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>documentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sendDate</column-name><column-value><![CDATA[");
		sb.append(getSendDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signature</column-name><column-value><![CDATA[");
		sb.append(getSignature());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>systemSignature</column-name><column-value><![CDATA[");
		sb.append(getSystemSignature());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>allContent</column-name><column-value><![CDATA[");
		sb.append(getAllContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdTime</column-name><column-value><![CDATA[");
		sb.append(getCreatedTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>webservice</column-name><column-value><![CDATA[");
		sb.append(getWebservice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validated</column-name><column-value><![CDATA[");
		sb.append(getValidated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>priority</column-name><column-value><![CDATA[");
		sb.append(getPriority());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>validationCode</column-name><column-value><![CDATA[");
		sb.append(getValidationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLanGui</column-name><column-value><![CDATA[");
		sb.append(getSoLanGui());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoSoThuTucId</column-name><column-value><![CDATA[");
		sb.append(getHoSoThuTucId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuXuLyPhuId</column-name><column-value><![CDATA[");
		sb.append(getPhieuXuLyPhuId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _version;
	private String _messageId;
	private String _senderName;
	private String _senderIdentity;
	private String _senderCountryCode;
	private String _senderMinistryCode;
	private String _senderOrganizationCode;
	private String _senderUnitCode;
	private String _receiverName;
	private String _receiverIdentity;
	private String _receiverCountryCode;
	private String _receiverMinistryCode;
	private String _receiverOrganizationCode;
	private String _receiverUnitCode;
	private String _documentType;
	private int _type;
	private String _function;
	private long _reference;
	private long _preReference;
	private int _documentYear;
	private Date _sendDate;
	private String _signature;
	private String _systemSignature;
	private String _allContent;
	private Date _createdTime;
	private int _webservice;
	private int _validated;
	private int _priority;
	private String _description;
	private String _validationCode;
	private int _soLanGui;
	private long _hoSoThuTucId;
	private long _phieuXuLyPhuId;
	private BaseModel<?> _aswmsgMessageQueueRemoteModel;
}