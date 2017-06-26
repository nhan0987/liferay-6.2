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

import vn.dtt.gt.dk.dao.aswmsg.service.AswmsgMessageLogLocalServiceUtil;
import vn.dtt.gt.dk.dao.aswmsg.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class AswmsgMessageLogClp extends BaseModelImpl<AswmsgMessageLog>
	implements AswmsgMessageLog {
	public AswmsgMessageLogClp() {
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
	public long getPrimaryKey() {
		return _Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_aswmsgMessageLogRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVersion() {
		return _Version;
	}

	@Override
	public void setVersion(String Version) {
		_Version = Version;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setVersion", String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, Version);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessageId() {
		return _MessageId;
	}

	@Override
	public void setMessageId(String MessageId) {
		_MessageId = MessageId;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setMessageId", String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, MessageId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderName() {
		return _SenderName;
	}

	@Override
	public void setSenderName(String SenderName) {
		_SenderName = SenderName;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderName", String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, SenderName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderIdentity() {
		return _SenderIdentity;
	}

	@Override
	public void setSenderIdentity(String SenderIdentity) {
		_SenderIdentity = SenderIdentity;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderIdentity",
						String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, SenderIdentity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderCountryCode() {
		return _SenderCountryCode;
	}

	@Override
	public void setSenderCountryCode(String SenderCountryCode) {
		_SenderCountryCode = SenderCountryCode;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderCountryCode",
						String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, SenderCountryCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderMinistryCode() {
		return _SenderMinistryCode;
	}

	@Override
	public void setSenderMinistryCode(String SenderMinistryCode) {
		_SenderMinistryCode = SenderMinistryCode;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderMinistryCode",
						String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, SenderMinistryCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderOrganizationCode() {
		return _SenderOrganizationCode;
	}

	@Override
	public void setSenderOrganizationCode(String SenderOrganizationCode) {
		_SenderOrganizationCode = SenderOrganizationCode;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderOrganizationCode",
						String.class);

				method.invoke(_aswmsgMessageLogRemoteModel,
					SenderOrganizationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSenderUnitCode() {
		return _SenderUnitCode;
	}

	@Override
	public void setSenderUnitCode(String SenderUnitCode) {
		_SenderUnitCode = SenderUnitCode;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setSenderUnitCode",
						String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, SenderUnitCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverName() {
		return _ReceiverName;
	}

	@Override
	public void setReceiverName(String ReceiverName) {
		_ReceiverName = ReceiverName;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverName", String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, ReceiverName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverIdentity() {
		return _ReceiverIdentity;
	}

	@Override
	public void setReceiverIdentity(String ReceiverIdentity) {
		_ReceiverIdentity = ReceiverIdentity;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverIdentity",
						String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, ReceiverIdentity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverCountryCode() {
		return _ReceiverCountryCode;
	}

	@Override
	public void setReceiverCountryCode(String ReceiverCountryCode) {
		_ReceiverCountryCode = ReceiverCountryCode;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverCountryCode",
						String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, ReceiverCountryCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverMinistryCode() {
		return _ReceiverMinistryCode;
	}

	@Override
	public void setReceiverMinistryCode(String ReceiverMinistryCode) {
		_ReceiverMinistryCode = ReceiverMinistryCode;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverMinistryCode",
						String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, ReceiverMinistryCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverOrganizationCode() {
		return _ReceiverOrganizationCode;
	}

	@Override
	public void setReceiverOrganizationCode(String ReceiverOrganizationCode) {
		_ReceiverOrganizationCode = ReceiverOrganizationCode;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverOrganizationCode",
						String.class);

				method.invoke(_aswmsgMessageLogRemoteModel,
					ReceiverOrganizationCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverUnitCode() {
		return _ReceiverUnitCode;
	}

	@Override
	public void setReceiverUnitCode(String ReceiverUnitCode) {
		_ReceiverUnitCode = ReceiverUnitCode;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverUnitCode",
						String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, ReceiverUnitCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDocumentType() {
		return _DocumentType;
	}

	@Override
	public void setDocumentType(String DocumentType) {
		_DocumentType = DocumentType;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentType", String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, DocumentType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getType() {
		return _Type;
	}

	@Override
	public void setType(int Type) {
		_Type = Type;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setType", int.class);

				method.invoke(_aswmsgMessageLogRemoteModel, Type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFunction() {
		return _Function;
	}

	@Override
	public void setFunction(String Function) {
		_Function = Function;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setFunction", String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, Function);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getReference() {
		return _Reference;
	}

	@Override
	public void setReference(long Reference) {
		_Reference = Reference;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setReference", long.class);

				method.invoke(_aswmsgMessageLogRemoteModel, Reference);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPreReference() {
		return _PreReference;
	}

	@Override
	public void setPreReference(long PreReference) {
		_PreReference = PreReference;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setPreReference", long.class);

				method.invoke(_aswmsgMessageLogRemoteModel, PreReference);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDocumentYear() {
		return _DocumentYear;
	}

	@Override
	public void setDocumentYear(int DocumentYear) {
		_DocumentYear = DocumentYear;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setDocumentYear", int.class);

				method.invoke(_aswmsgMessageLogRemoteModel, DocumentYear);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSendDate() {
		return _SendDate;
	}

	@Override
	public void setSendDate(Date SendDate) {
		_SendDate = SendDate;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setSendDate", Date.class);

				method.invoke(_aswmsgMessageLogRemoteModel, SendDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignature() {
		return _Signature;
	}

	@Override
	public void setSignature(String Signature) {
		_Signature = Signature;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setSignature", String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, Signature);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSystemSignature() {
		return _SystemSignature;
	}

	@Override
	public void setSystemSignature(String SystemSignature) {
		_SystemSignature = SystemSignature;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setSystemSignature",
						String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, SystemSignature);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAllContent() {
		return _AllContent;
	}

	@Override
	public void setAllContent(String AllContent) {
		_AllContent = AllContent;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setAllContent", String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, AllContent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedTime() {
		return _CreatedTime;
	}

	@Override
	public void setCreatedTime(Date CreatedTime) {
		_CreatedTime = CreatedTime;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedTime", Date.class);

				method.invoke(_aswmsgMessageLogRemoteModel, CreatedTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getWebservice() {
		return _Webservice;
	}

	@Override
	public void setWebservice(int Webservice) {
		_Webservice = Webservice;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setWebservice", int.class);

				method.invoke(_aswmsgMessageLogRemoteModel, Webservice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getValidated() {
		return _Validated;
	}

	@Override
	public void setValidated(int Validated) {
		_Validated = Validated;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setValidated", int.class);

				method.invoke(_aswmsgMessageLogRemoteModel, Validated);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _Description;
	}

	@Override
	public void setDescription(String Description) {
		_Description = Description;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, Description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getValidationCode() {
		return _ValidationCode;
	}

	@Override
	public void setValidationCode(String ValidationCode) {
		_ValidationCode = ValidationCode;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setValidationCode",
						String.class);

				method.invoke(_aswmsgMessageLogRemoteModel, ValidationCode);
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

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLanGui", int.class);

				method.invoke(_aswmsgMessageLogRemoteModel, soLanGui);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFileLogId() {
		return _fileLogId;
	}

	@Override
	public void setFileLogId(long fileLogId) {
		_fileLogId = fileLogId;

		if (_aswmsgMessageLogRemoteModel != null) {
			try {
				Class<?> clazz = _aswmsgMessageLogRemoteModel.getClass();

				Method method = clazz.getMethod("setFileLogId", long.class);

				method.invoke(_aswmsgMessageLogRemoteModel, fileLogId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAswmsgMessageLogRemoteModel() {
		return _aswmsgMessageLogRemoteModel;
	}

	public void setAswmsgMessageLogRemoteModel(
		BaseModel<?> aswmsgMessageLogRemoteModel) {
		_aswmsgMessageLogRemoteModel = aswmsgMessageLogRemoteModel;
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

		Class<?> remoteModelClass = _aswmsgMessageLogRemoteModel.getClass();

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

		Object returnValue = method.invoke(_aswmsgMessageLogRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AswmsgMessageLogLocalServiceUtil.addAswmsgMessageLog(this);
		}
		else {
			AswmsgMessageLogLocalServiceUtil.updateAswmsgMessageLog(this);
		}
	}

	@Override
	public AswmsgMessageLog toEscapedModel() {
		return (AswmsgMessageLog)ProxyUtil.newProxyInstance(AswmsgMessageLog.class.getClassLoader(),
			new Class[] { AswmsgMessageLog.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AswmsgMessageLogClp clone = new AswmsgMessageLogClp();

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
		clone.setDescription(getDescription());
		clone.setValidationCode(getValidationCode());
		clone.setSoLanGui(getSoLanGui());
		clone.setFileLogId(getFileLogId());

		return clone;
	}

	@Override
	public int compareTo(AswmsgMessageLog aswmsgMessageLog) {
		int value = 0;

		if (getId() < aswmsgMessageLog.getId()) {
			value = -1;
		}
		else if (getId() > aswmsgMessageLog.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof AswmsgMessageLogClp)) {
			return false;
		}

		AswmsgMessageLogClp aswmsgMessageLog = (AswmsgMessageLogClp)obj;

		long primaryKey = aswmsgMessageLog.getPrimaryKey();

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
		StringBundler sb = new StringBundler(65);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", Version=");
		sb.append(getVersion());
		sb.append(", MessageId=");
		sb.append(getMessageId());
		sb.append(", SenderName=");
		sb.append(getSenderName());
		sb.append(", SenderIdentity=");
		sb.append(getSenderIdentity());
		sb.append(", SenderCountryCode=");
		sb.append(getSenderCountryCode());
		sb.append(", SenderMinistryCode=");
		sb.append(getSenderMinistryCode());
		sb.append(", SenderOrganizationCode=");
		sb.append(getSenderOrganizationCode());
		sb.append(", SenderUnitCode=");
		sb.append(getSenderUnitCode());
		sb.append(", ReceiverName=");
		sb.append(getReceiverName());
		sb.append(", ReceiverIdentity=");
		sb.append(getReceiverIdentity());
		sb.append(", ReceiverCountryCode=");
		sb.append(getReceiverCountryCode());
		sb.append(", ReceiverMinistryCode=");
		sb.append(getReceiverMinistryCode());
		sb.append(", ReceiverOrganizationCode=");
		sb.append(getReceiverOrganizationCode());
		sb.append(", ReceiverUnitCode=");
		sb.append(getReceiverUnitCode());
		sb.append(", DocumentType=");
		sb.append(getDocumentType());
		sb.append(", Type=");
		sb.append(getType());
		sb.append(", Function=");
		sb.append(getFunction());
		sb.append(", Reference=");
		sb.append(getReference());
		sb.append(", PreReference=");
		sb.append(getPreReference());
		sb.append(", DocumentYear=");
		sb.append(getDocumentYear());
		sb.append(", SendDate=");
		sb.append(getSendDate());
		sb.append(", Signature=");
		sb.append(getSignature());
		sb.append(", SystemSignature=");
		sb.append(getSystemSignature());
		sb.append(", AllContent=");
		sb.append(getAllContent());
		sb.append(", CreatedTime=");
		sb.append(getCreatedTime());
		sb.append(", Webservice=");
		sb.append(getWebservice());
		sb.append(", Validated=");
		sb.append(getValidated());
		sb.append(", Description=");
		sb.append(getDescription());
		sb.append(", ValidationCode=");
		sb.append(getValidationCode());
		sb.append(", soLanGui=");
		sb.append(getSoLanGui());
		sb.append(", fileLogId=");
		sb.append(getFileLogId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(100);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>MessageId</column-name><column-value><![CDATA[");
		sb.append(getMessageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SenderName</column-name><column-value><![CDATA[");
		sb.append(getSenderName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SenderIdentity</column-name><column-value><![CDATA[");
		sb.append(getSenderIdentity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SenderCountryCode</column-name><column-value><![CDATA[");
		sb.append(getSenderCountryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SenderMinistryCode</column-name><column-value><![CDATA[");
		sb.append(getSenderMinistryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SenderOrganizationCode</column-name><column-value><![CDATA[");
		sb.append(getSenderOrganizationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SenderUnitCode</column-name><column-value><![CDATA[");
		sb.append(getSenderUnitCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ReceiverName</column-name><column-value><![CDATA[");
		sb.append(getReceiverName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ReceiverIdentity</column-name><column-value><![CDATA[");
		sb.append(getReceiverIdentity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ReceiverCountryCode</column-name><column-value><![CDATA[");
		sb.append(getReceiverCountryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ReceiverMinistryCode</column-name><column-value><![CDATA[");
		sb.append(getReceiverMinistryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ReceiverOrganizationCode</column-name><column-value><![CDATA[");
		sb.append(getReceiverOrganizationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ReceiverUnitCode</column-name><column-value><![CDATA[");
		sb.append(getReceiverUnitCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DocumentType</column-name><column-value><![CDATA[");
		sb.append(getDocumentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Function</column-name><column-value><![CDATA[");
		sb.append(getFunction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Reference</column-name><column-value><![CDATA[");
		sb.append(getReference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PreReference</column-name><column-value><![CDATA[");
		sb.append(getPreReference());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DocumentYear</column-name><column-value><![CDATA[");
		sb.append(getDocumentYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SendDate</column-name><column-value><![CDATA[");
		sb.append(getSendDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Signature</column-name><column-value><![CDATA[");
		sb.append(getSignature());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SystemSignature</column-name><column-value><![CDATA[");
		sb.append(getSystemSignature());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>AllContent</column-name><column-value><![CDATA[");
		sb.append(getAllContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedTime</column-name><column-value><![CDATA[");
		sb.append(getCreatedTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Webservice</column-name><column-value><![CDATA[");
		sb.append(getWebservice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Validated</column-name><column-value><![CDATA[");
		sb.append(getValidated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ValidationCode</column-name><column-value><![CDATA[");
		sb.append(getValidationCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLanGui</column-name><column-value><![CDATA[");
		sb.append(getSoLanGui());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileLogId</column-name><column-value><![CDATA[");
		sb.append(getFileLogId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _Version;
	private String _MessageId;
	private String _SenderName;
	private String _SenderIdentity;
	private String _SenderCountryCode;
	private String _SenderMinistryCode;
	private String _SenderOrganizationCode;
	private String _SenderUnitCode;
	private String _ReceiverName;
	private String _ReceiverIdentity;
	private String _ReceiverCountryCode;
	private String _ReceiverMinistryCode;
	private String _ReceiverOrganizationCode;
	private String _ReceiverUnitCode;
	private String _DocumentType;
	private int _Type;
	private String _Function;
	private long _Reference;
	private long _PreReference;
	private int _DocumentYear;
	private Date _SendDate;
	private String _Signature;
	private String _SystemSignature;
	private String _AllContent;
	private Date _CreatedTime;
	private int _Webservice;
	private int _Validated;
	private String _Description;
	private String _ValidationCode;
	private int _soLanGui;
	private long _fileLogId;
	private BaseModel<?> _aswmsgMessageLogRemoteModel;
}