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

package vn.dtt.gt.dk.dao.aswmsg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageLog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AswmsgMessageLog in entity cache.
 *
 * @author win_64
 * @see AswmsgMessageLog
 * @generated
 */
public class AswmsgMessageLogCacheModel implements CacheModel<AswmsgMessageLog>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(65);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", Version=");
		sb.append(Version);
		sb.append(", MessageId=");
		sb.append(MessageId);
		sb.append(", SenderName=");
		sb.append(SenderName);
		sb.append(", SenderIdentity=");
		sb.append(SenderIdentity);
		sb.append(", SenderCountryCode=");
		sb.append(SenderCountryCode);
		sb.append(", SenderMinistryCode=");
		sb.append(SenderMinistryCode);
		sb.append(", SenderOrganizationCode=");
		sb.append(SenderOrganizationCode);
		sb.append(", SenderUnitCode=");
		sb.append(SenderUnitCode);
		sb.append(", ReceiverName=");
		sb.append(ReceiverName);
		sb.append(", ReceiverIdentity=");
		sb.append(ReceiverIdentity);
		sb.append(", ReceiverCountryCode=");
		sb.append(ReceiverCountryCode);
		sb.append(", ReceiverMinistryCode=");
		sb.append(ReceiverMinistryCode);
		sb.append(", ReceiverOrganizationCode=");
		sb.append(ReceiverOrganizationCode);
		sb.append(", ReceiverUnitCode=");
		sb.append(ReceiverUnitCode);
		sb.append(", DocumentType=");
		sb.append(DocumentType);
		sb.append(", Type=");
		sb.append(Type);
		sb.append(", Function=");
		sb.append(Function);
		sb.append(", Reference=");
		sb.append(Reference);
		sb.append(", PreReference=");
		sb.append(PreReference);
		sb.append(", DocumentYear=");
		sb.append(DocumentYear);
		sb.append(", SendDate=");
		sb.append(SendDate);
		sb.append(", Signature=");
		sb.append(Signature);
		sb.append(", SystemSignature=");
		sb.append(SystemSignature);
		sb.append(", AllContent=");
		sb.append(AllContent);
		sb.append(", CreatedTime=");
		sb.append(CreatedTime);
		sb.append(", Webservice=");
		sb.append(Webservice);
		sb.append(", Validated=");
		sb.append(Validated);
		sb.append(", Description=");
		sb.append(Description);
		sb.append(", ValidationCode=");
		sb.append(ValidationCode);
		sb.append(", soLanGui=");
		sb.append(soLanGui);
		sb.append(", fileLogId=");
		sb.append(fileLogId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AswmsgMessageLog toEntityModel() {
		AswmsgMessageLogImpl aswmsgMessageLogImpl = new AswmsgMessageLogImpl();

		aswmsgMessageLogImpl.setId(Id);

		if (Version == null) {
			aswmsgMessageLogImpl.setVersion(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setVersion(Version);
		}

		if (MessageId == null) {
			aswmsgMessageLogImpl.setMessageId(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setMessageId(MessageId);
		}

		if (SenderName == null) {
			aswmsgMessageLogImpl.setSenderName(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setSenderName(SenderName);
		}

		if (SenderIdentity == null) {
			aswmsgMessageLogImpl.setSenderIdentity(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setSenderIdentity(SenderIdentity);
		}

		if (SenderCountryCode == null) {
			aswmsgMessageLogImpl.setSenderCountryCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setSenderCountryCode(SenderCountryCode);
		}

		if (SenderMinistryCode == null) {
			aswmsgMessageLogImpl.setSenderMinistryCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setSenderMinistryCode(SenderMinistryCode);
		}

		if (SenderOrganizationCode == null) {
			aswmsgMessageLogImpl.setSenderOrganizationCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setSenderOrganizationCode(SenderOrganizationCode);
		}

		if (SenderUnitCode == null) {
			aswmsgMessageLogImpl.setSenderUnitCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setSenderUnitCode(SenderUnitCode);
		}

		if (ReceiverName == null) {
			aswmsgMessageLogImpl.setReceiverName(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setReceiverName(ReceiverName);
		}

		if (ReceiverIdentity == null) {
			aswmsgMessageLogImpl.setReceiverIdentity(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setReceiverIdentity(ReceiverIdentity);
		}

		if (ReceiverCountryCode == null) {
			aswmsgMessageLogImpl.setReceiverCountryCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setReceiverCountryCode(ReceiverCountryCode);
		}

		if (ReceiverMinistryCode == null) {
			aswmsgMessageLogImpl.setReceiverMinistryCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setReceiverMinistryCode(ReceiverMinistryCode);
		}

		if (ReceiverOrganizationCode == null) {
			aswmsgMessageLogImpl.setReceiverOrganizationCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setReceiverOrganizationCode(ReceiverOrganizationCode);
		}

		if (ReceiverUnitCode == null) {
			aswmsgMessageLogImpl.setReceiverUnitCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setReceiverUnitCode(ReceiverUnitCode);
		}

		if (DocumentType == null) {
			aswmsgMessageLogImpl.setDocumentType(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setDocumentType(DocumentType);
		}

		aswmsgMessageLogImpl.setType(Type);

		if (Function == null) {
			aswmsgMessageLogImpl.setFunction(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setFunction(Function);
		}

		aswmsgMessageLogImpl.setReference(Reference);
		aswmsgMessageLogImpl.setPreReference(PreReference);
		aswmsgMessageLogImpl.setDocumentYear(DocumentYear);

		if (SendDate == Long.MIN_VALUE) {
			aswmsgMessageLogImpl.setSendDate(null);
		}
		else {
			aswmsgMessageLogImpl.setSendDate(new Date(SendDate));
		}

		if (Signature == null) {
			aswmsgMessageLogImpl.setSignature(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setSignature(Signature);
		}

		if (SystemSignature == null) {
			aswmsgMessageLogImpl.setSystemSignature(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setSystemSignature(SystemSignature);
		}

		if (AllContent == null) {
			aswmsgMessageLogImpl.setAllContent(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setAllContent(AllContent);
		}

		if (CreatedTime == Long.MIN_VALUE) {
			aswmsgMessageLogImpl.setCreatedTime(null);
		}
		else {
			aswmsgMessageLogImpl.setCreatedTime(new Date(CreatedTime));
		}

		aswmsgMessageLogImpl.setWebservice(Webservice);
		aswmsgMessageLogImpl.setValidated(Validated);

		if (Description == null) {
			aswmsgMessageLogImpl.setDescription(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setDescription(Description);
		}

		if (ValidationCode == null) {
			aswmsgMessageLogImpl.setValidationCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageLogImpl.setValidationCode(ValidationCode);
		}

		aswmsgMessageLogImpl.setSoLanGui(soLanGui);
		aswmsgMessageLogImpl.setFileLogId(fileLogId);

		aswmsgMessageLogImpl.resetOriginalValues();

		return aswmsgMessageLogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		Version = objectInput.readUTF();
		MessageId = objectInput.readUTF();
		SenderName = objectInput.readUTF();
		SenderIdentity = objectInput.readUTF();
		SenderCountryCode = objectInput.readUTF();
		SenderMinistryCode = objectInput.readUTF();
		SenderOrganizationCode = objectInput.readUTF();
		SenderUnitCode = objectInput.readUTF();
		ReceiverName = objectInput.readUTF();
		ReceiverIdentity = objectInput.readUTF();
		ReceiverCountryCode = objectInput.readUTF();
		ReceiverMinistryCode = objectInput.readUTF();
		ReceiverOrganizationCode = objectInput.readUTF();
		ReceiverUnitCode = objectInput.readUTF();
		DocumentType = objectInput.readUTF();
		Type = objectInput.readInt();
		Function = objectInput.readUTF();
		Reference = objectInput.readLong();
		PreReference = objectInput.readLong();
		DocumentYear = objectInput.readInt();
		SendDate = objectInput.readLong();
		Signature = objectInput.readUTF();
		SystemSignature = objectInput.readUTF();
		AllContent = objectInput.readUTF();
		CreatedTime = objectInput.readLong();
		Webservice = objectInput.readInt();
		Validated = objectInput.readInt();
		Description = objectInput.readUTF();
		ValidationCode = objectInput.readUTF();
		soLanGui = objectInput.readInt();
		fileLogId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (Version == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Version);
		}

		if (MessageId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MessageId);
		}

		if (SenderName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SenderName);
		}

		if (SenderIdentity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SenderIdentity);
		}

		if (SenderCountryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SenderCountryCode);
		}

		if (SenderMinistryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SenderMinistryCode);
		}

		if (SenderOrganizationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SenderOrganizationCode);
		}

		if (SenderUnitCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SenderUnitCode);
		}

		if (ReceiverName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ReceiverName);
		}

		if (ReceiverIdentity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ReceiverIdentity);
		}

		if (ReceiverCountryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ReceiverCountryCode);
		}

		if (ReceiverMinistryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ReceiverMinistryCode);
		}

		if (ReceiverOrganizationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ReceiverOrganizationCode);
		}

		if (ReceiverUnitCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ReceiverUnitCode);
		}

		if (DocumentType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DocumentType);
		}

		objectOutput.writeInt(Type);

		if (Function == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Function);
		}

		objectOutput.writeLong(Reference);
		objectOutput.writeLong(PreReference);
		objectOutput.writeInt(DocumentYear);
		objectOutput.writeLong(SendDate);

		if (Signature == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Signature);
		}

		if (SystemSignature == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SystemSignature);
		}

		if (AllContent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(AllContent);
		}

		objectOutput.writeLong(CreatedTime);
		objectOutput.writeInt(Webservice);
		objectOutput.writeInt(Validated);

		if (Description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Description);
		}

		if (ValidationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ValidationCode);
		}

		objectOutput.writeInt(soLanGui);
		objectOutput.writeLong(fileLogId);
	}

	public long Id;
	public String Version;
	public String MessageId;
	public String SenderName;
	public String SenderIdentity;
	public String SenderCountryCode;
	public String SenderMinistryCode;
	public String SenderOrganizationCode;
	public String SenderUnitCode;
	public String ReceiverName;
	public String ReceiverIdentity;
	public String ReceiverCountryCode;
	public String ReceiverMinistryCode;
	public String ReceiverOrganizationCode;
	public String ReceiverUnitCode;
	public String DocumentType;
	public int Type;
	public String Function;
	public long Reference;
	public long PreReference;
	public int DocumentYear;
	public long SendDate;
	public String Signature;
	public String SystemSignature;
	public String AllContent;
	public long CreatedTime;
	public int Webservice;
	public int Validated;
	public String Description;
	public String ValidationCode;
	public int soLanGui;
	public long fileLogId;
}