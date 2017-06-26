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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author win_64
 * @generated
 */
public class AswmsgMessageLogSoap implements Serializable {
	public static AswmsgMessageLogSoap toSoapModel(AswmsgMessageLog model) {
		AswmsgMessageLogSoap soapModel = new AswmsgMessageLogSoap();

		soapModel.setId(model.getId());
		soapModel.setVersion(model.getVersion());
		soapModel.setMessageId(model.getMessageId());
		soapModel.setSenderName(model.getSenderName());
		soapModel.setSenderIdentity(model.getSenderIdentity());
		soapModel.setSenderCountryCode(model.getSenderCountryCode());
		soapModel.setSenderMinistryCode(model.getSenderMinistryCode());
		soapModel.setSenderOrganizationCode(model.getSenderOrganizationCode());
		soapModel.setSenderUnitCode(model.getSenderUnitCode());
		soapModel.setReceiverName(model.getReceiverName());
		soapModel.setReceiverIdentity(model.getReceiverIdentity());
		soapModel.setReceiverCountryCode(model.getReceiverCountryCode());
		soapModel.setReceiverMinistryCode(model.getReceiverMinistryCode());
		soapModel.setReceiverOrganizationCode(model.getReceiverOrganizationCode());
		soapModel.setReceiverUnitCode(model.getReceiverUnitCode());
		soapModel.setDocumentType(model.getDocumentType());
		soapModel.setType(model.getType());
		soapModel.setFunction(model.getFunction());
		soapModel.setReference(model.getReference());
		soapModel.setPreReference(model.getPreReference());
		soapModel.setDocumentYear(model.getDocumentYear());
		soapModel.setSendDate(model.getSendDate());
		soapModel.setSignature(model.getSignature());
		soapModel.setSystemSignature(model.getSystemSignature());
		soapModel.setAllContent(model.getAllContent());
		soapModel.setCreatedTime(model.getCreatedTime());
		soapModel.setWebservice(model.getWebservice());
		soapModel.setValidated(model.getValidated());
		soapModel.setDescription(model.getDescription());
		soapModel.setValidationCode(model.getValidationCode());
		soapModel.setSoLanGui(model.getSoLanGui());
		soapModel.setFileLogId(model.getFileLogId());

		return soapModel;
	}

	public static AswmsgMessageLogSoap[] toSoapModels(AswmsgMessageLog[] models) {
		AswmsgMessageLogSoap[] soapModels = new AswmsgMessageLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AswmsgMessageLogSoap[][] toSoapModels(
		AswmsgMessageLog[][] models) {
		AswmsgMessageLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AswmsgMessageLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AswmsgMessageLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AswmsgMessageLogSoap[] toSoapModels(
		List<AswmsgMessageLog> models) {
		List<AswmsgMessageLogSoap> soapModels = new ArrayList<AswmsgMessageLogSoap>(models.size());

		for (AswmsgMessageLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AswmsgMessageLogSoap[soapModels.size()]);
	}

	public AswmsgMessageLogSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public String getVersion() {
		return _Version;
	}

	public void setVersion(String Version) {
		_Version = Version;
	}

	public String getMessageId() {
		return _MessageId;
	}

	public void setMessageId(String MessageId) {
		_MessageId = MessageId;
	}

	public String getSenderName() {
		return _SenderName;
	}

	public void setSenderName(String SenderName) {
		_SenderName = SenderName;
	}

	public String getSenderIdentity() {
		return _SenderIdentity;
	}

	public void setSenderIdentity(String SenderIdentity) {
		_SenderIdentity = SenderIdentity;
	}

	public String getSenderCountryCode() {
		return _SenderCountryCode;
	}

	public void setSenderCountryCode(String SenderCountryCode) {
		_SenderCountryCode = SenderCountryCode;
	}

	public String getSenderMinistryCode() {
		return _SenderMinistryCode;
	}

	public void setSenderMinistryCode(String SenderMinistryCode) {
		_SenderMinistryCode = SenderMinistryCode;
	}

	public String getSenderOrganizationCode() {
		return _SenderOrganizationCode;
	}

	public void setSenderOrganizationCode(String SenderOrganizationCode) {
		_SenderOrganizationCode = SenderOrganizationCode;
	}

	public String getSenderUnitCode() {
		return _SenderUnitCode;
	}

	public void setSenderUnitCode(String SenderUnitCode) {
		_SenderUnitCode = SenderUnitCode;
	}

	public String getReceiverName() {
		return _ReceiverName;
	}

	public void setReceiverName(String ReceiverName) {
		_ReceiverName = ReceiverName;
	}

	public String getReceiverIdentity() {
		return _ReceiverIdentity;
	}

	public void setReceiverIdentity(String ReceiverIdentity) {
		_ReceiverIdentity = ReceiverIdentity;
	}

	public String getReceiverCountryCode() {
		return _ReceiverCountryCode;
	}

	public void setReceiverCountryCode(String ReceiverCountryCode) {
		_ReceiverCountryCode = ReceiverCountryCode;
	}

	public String getReceiverMinistryCode() {
		return _ReceiverMinistryCode;
	}

	public void setReceiverMinistryCode(String ReceiverMinistryCode) {
		_ReceiverMinistryCode = ReceiverMinistryCode;
	}

	public String getReceiverOrganizationCode() {
		return _ReceiverOrganizationCode;
	}

	public void setReceiverOrganizationCode(String ReceiverOrganizationCode) {
		_ReceiverOrganizationCode = ReceiverOrganizationCode;
	}

	public String getReceiverUnitCode() {
		return _ReceiverUnitCode;
	}

	public void setReceiverUnitCode(String ReceiverUnitCode) {
		_ReceiverUnitCode = ReceiverUnitCode;
	}

	public String getDocumentType() {
		return _DocumentType;
	}

	public void setDocumentType(String DocumentType) {
		_DocumentType = DocumentType;
	}

	public int getType() {
		return _Type;
	}

	public void setType(int Type) {
		_Type = Type;
	}

	public String getFunction() {
		return _Function;
	}

	public void setFunction(String Function) {
		_Function = Function;
	}

	public long getReference() {
		return _Reference;
	}

	public void setReference(long Reference) {
		_Reference = Reference;
	}

	public long getPreReference() {
		return _PreReference;
	}

	public void setPreReference(long PreReference) {
		_PreReference = PreReference;
	}

	public int getDocumentYear() {
		return _DocumentYear;
	}

	public void setDocumentYear(int DocumentYear) {
		_DocumentYear = DocumentYear;
	}

	public Date getSendDate() {
		return _SendDate;
	}

	public void setSendDate(Date SendDate) {
		_SendDate = SendDate;
	}

	public String getSignature() {
		return _Signature;
	}

	public void setSignature(String Signature) {
		_Signature = Signature;
	}

	public String getSystemSignature() {
		return _SystemSignature;
	}

	public void setSystemSignature(String SystemSignature) {
		_SystemSignature = SystemSignature;
	}

	public String getAllContent() {
		return _AllContent;
	}

	public void setAllContent(String AllContent) {
		_AllContent = AllContent;
	}

	public Date getCreatedTime() {
		return _CreatedTime;
	}

	public void setCreatedTime(Date CreatedTime) {
		_CreatedTime = CreatedTime;
	}

	public int getWebservice() {
		return _Webservice;
	}

	public void setWebservice(int Webservice) {
		_Webservice = Webservice;
	}

	public int getValidated() {
		return _Validated;
	}

	public void setValidated(int Validated) {
		_Validated = Validated;
	}

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
	}

	public String getValidationCode() {
		return _ValidationCode;
	}

	public void setValidationCode(String ValidationCode) {
		_ValidationCode = ValidationCode;
	}

	public int getSoLanGui() {
		return _soLanGui;
	}

	public void setSoLanGui(int soLanGui) {
		_soLanGui = soLanGui;
	}

	public long getFileLogId() {
		return _fileLogId;
	}

	public void setFileLogId(long fileLogId) {
		_fileLogId = fileLogId;
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
}