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

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AswmsgSyndatahistory in entity cache.
 *
 * @author win_64
 * @see AswmsgSyndatahistory
 * @generated
 */
public class AswmsgSyndatahistoryCacheModel implements CacheModel<AswmsgSyndatahistory>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(65);

		sb.append("{id=");
		sb.append(id);
		sb.append(", version=");
		sb.append(version);
		sb.append(", messageId=");
		sb.append(messageId);
		sb.append(", senderName=");
		sb.append(senderName);
		sb.append(", senderIdentity=");
		sb.append(senderIdentity);
		sb.append(", senderCountryCode=");
		sb.append(senderCountryCode);
		sb.append(", senderMinistryCode=");
		sb.append(senderMinistryCode);
		sb.append(", senderOrganizationCode=");
		sb.append(senderOrganizationCode);
		sb.append(", senderUnitCode=");
		sb.append(senderUnitCode);
		sb.append(", receiverName=");
		sb.append(receiverName);
		sb.append(", receiverIdentity=");
		sb.append(receiverIdentity);
		sb.append(", receiverCountryCode=");
		sb.append(receiverCountryCode);
		sb.append(", receiverMinistryCode=");
		sb.append(receiverMinistryCode);
		sb.append(", receiverOrganizationCode=");
		sb.append(receiverOrganizationCode);
		sb.append(", receiverUnitCode=");
		sb.append(receiverUnitCode);
		sb.append(", documentType=");
		sb.append(documentType);
		sb.append(", type=");
		sb.append(type);
		sb.append(", function=");
		sb.append(function);
		sb.append(", reference=");
		sb.append(reference);
		sb.append(", preReference=");
		sb.append(preReference);
		sb.append(", documentYear=");
		sb.append(documentYear);
		sb.append(", sendDate=");
		sb.append(sendDate);
		sb.append(", signature=");
		sb.append(signature);
		sb.append(", systemSignature=");
		sb.append(systemSignature);
		sb.append(", allContent=");
		sb.append(allContent);
		sb.append(", createdTime=");
		sb.append(createdTime);
		sb.append(", webservice=");
		sb.append(webservice);
		sb.append(", validated=");
		sb.append(validated);
		sb.append(", priority=");
		sb.append(priority);
		sb.append(", description=");
		sb.append(description);
		sb.append(", validationCode=");
		sb.append(validationCode);
		sb.append(", soLanGui=");
		sb.append(soLanGui);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AswmsgSyndatahistory toEntityModel() {
		AswmsgSyndatahistoryImpl aswmsgSyndatahistoryImpl = new AswmsgSyndatahistoryImpl();

		aswmsgSyndatahistoryImpl.setId(id);

		if (version == null) {
			aswmsgSyndatahistoryImpl.setVersion(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setVersion(version);
		}

		if (messageId == null) {
			aswmsgSyndatahistoryImpl.setMessageId(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setMessageId(messageId);
		}

		if (senderName == null) {
			aswmsgSyndatahistoryImpl.setSenderName(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setSenderName(senderName);
		}

		if (senderIdentity == null) {
			aswmsgSyndatahistoryImpl.setSenderIdentity(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setSenderIdentity(senderIdentity);
		}

		if (senderCountryCode == null) {
			aswmsgSyndatahistoryImpl.setSenderCountryCode(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setSenderCountryCode(senderCountryCode);
		}

		if (senderMinistryCode == null) {
			aswmsgSyndatahistoryImpl.setSenderMinistryCode(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setSenderMinistryCode(senderMinistryCode);
		}

		if (senderOrganizationCode == null) {
			aswmsgSyndatahistoryImpl.setSenderOrganizationCode(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setSenderOrganizationCode(senderOrganizationCode);
		}

		if (senderUnitCode == null) {
			aswmsgSyndatahistoryImpl.setSenderUnitCode(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setSenderUnitCode(senderUnitCode);
		}

		if (receiverName == null) {
			aswmsgSyndatahistoryImpl.setReceiverName(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setReceiverName(receiverName);
		}

		if (receiverIdentity == null) {
			aswmsgSyndatahistoryImpl.setReceiverIdentity(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setReceiverIdentity(receiverIdentity);
		}

		if (receiverCountryCode == null) {
			aswmsgSyndatahistoryImpl.setReceiverCountryCode(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setReceiverCountryCode(receiverCountryCode);
		}

		if (receiverMinistryCode == null) {
			aswmsgSyndatahistoryImpl.setReceiverMinistryCode(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setReceiverMinistryCode(receiverMinistryCode);
		}

		if (receiverOrganizationCode == null) {
			aswmsgSyndatahistoryImpl.setReceiverOrganizationCode(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setReceiverOrganizationCode(receiverOrganizationCode);
		}

		if (receiverUnitCode == null) {
			aswmsgSyndatahistoryImpl.setReceiverUnitCode(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setReceiverUnitCode(receiverUnitCode);
		}

		if (documentType == null) {
			aswmsgSyndatahistoryImpl.setDocumentType(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setDocumentType(documentType);
		}

		aswmsgSyndatahistoryImpl.setType(type);

		if (function == null) {
			aswmsgSyndatahistoryImpl.setFunction(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setFunction(function);
		}

		aswmsgSyndatahistoryImpl.setReference(reference);
		aswmsgSyndatahistoryImpl.setPreReference(preReference);
		aswmsgSyndatahistoryImpl.setDocumentYear(documentYear);

		if (sendDate == Long.MIN_VALUE) {
			aswmsgSyndatahistoryImpl.setSendDate(null);
		}
		else {
			aswmsgSyndatahistoryImpl.setSendDate(new Date(sendDate));
		}

		if (signature == null) {
			aswmsgSyndatahistoryImpl.setSignature(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setSignature(signature);
		}

		if (systemSignature == null) {
			aswmsgSyndatahistoryImpl.setSystemSignature(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setSystemSignature(systemSignature);
		}

		if (allContent == null) {
			aswmsgSyndatahistoryImpl.setAllContent(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setAllContent(allContent);
		}

		if (createdTime == Long.MIN_VALUE) {
			aswmsgSyndatahistoryImpl.setCreatedTime(null);
		}
		else {
			aswmsgSyndatahistoryImpl.setCreatedTime(new Date(createdTime));
		}

		aswmsgSyndatahistoryImpl.setWebservice(webservice);
		aswmsgSyndatahistoryImpl.setValidated(validated);
		aswmsgSyndatahistoryImpl.setPriority(priority);

		if (description == null) {
			aswmsgSyndatahistoryImpl.setDescription(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setDescription(description);
		}

		if (validationCode == null) {
			aswmsgSyndatahistoryImpl.setValidationCode(StringPool.BLANK);
		}
		else {
			aswmsgSyndatahistoryImpl.setValidationCode(validationCode);
		}

		aswmsgSyndatahistoryImpl.setSoLanGui(soLanGui);

		aswmsgSyndatahistoryImpl.resetOriginalValues();

		return aswmsgSyndatahistoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		version = objectInput.readUTF();
		messageId = objectInput.readUTF();
		senderName = objectInput.readUTF();
		senderIdentity = objectInput.readUTF();
		senderCountryCode = objectInput.readUTF();
		senderMinistryCode = objectInput.readUTF();
		senderOrganizationCode = objectInput.readUTF();
		senderUnitCode = objectInput.readUTF();
		receiverName = objectInput.readUTF();
		receiverIdentity = objectInput.readUTF();
		receiverCountryCode = objectInput.readUTF();
		receiverMinistryCode = objectInput.readUTF();
		receiverOrganizationCode = objectInput.readUTF();
		receiverUnitCode = objectInput.readUTF();
		documentType = objectInput.readUTF();
		type = objectInput.readInt();
		function = objectInput.readUTF();
		reference = objectInput.readLong();
		preReference = objectInput.readLong();
		documentYear = objectInput.readInt();
		sendDate = objectInput.readLong();
		signature = objectInput.readUTF();
		systemSignature = objectInput.readUTF();
		allContent = objectInput.readUTF();
		createdTime = objectInput.readLong();
		webservice = objectInput.readInt();
		validated = objectInput.readInt();
		priority = objectInput.readInt();
		description = objectInput.readUTF();
		validationCode = objectInput.readUTF();
		soLanGui = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (version == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(version);
		}

		if (messageId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageId);
		}

		if (senderName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(senderName);
		}

		if (senderIdentity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(senderIdentity);
		}

		if (senderCountryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(senderCountryCode);
		}

		if (senderMinistryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(senderMinistryCode);
		}

		if (senderOrganizationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(senderOrganizationCode);
		}

		if (senderUnitCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(senderUnitCode);
		}

		if (receiverName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receiverName);
		}

		if (receiverIdentity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receiverIdentity);
		}

		if (receiverCountryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receiverCountryCode);
		}

		if (receiverMinistryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receiverMinistryCode);
		}

		if (receiverOrganizationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receiverOrganizationCode);
		}

		if (receiverUnitCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receiverUnitCode);
		}

		if (documentType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(documentType);
		}

		objectOutput.writeInt(type);

		if (function == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(function);
		}

		objectOutput.writeLong(reference);
		objectOutput.writeLong(preReference);
		objectOutput.writeInt(documentYear);
		objectOutput.writeLong(sendDate);

		if (signature == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signature);
		}

		if (systemSignature == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(systemSignature);
		}

		if (allContent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(allContent);
		}

		objectOutput.writeLong(createdTime);
		objectOutput.writeInt(webservice);
		objectOutput.writeInt(validated);
		objectOutput.writeInt(priority);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (validationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(validationCode);
		}

		objectOutput.writeInt(soLanGui);
	}

	public long id;
	public String version;
	public String messageId;
	public String senderName;
	public String senderIdentity;
	public String senderCountryCode;
	public String senderMinistryCode;
	public String senderOrganizationCode;
	public String senderUnitCode;
	public String receiverName;
	public String receiverIdentity;
	public String receiverCountryCode;
	public String receiverMinistryCode;
	public String receiverOrganizationCode;
	public String receiverUnitCode;
	public String documentType;
	public int type;
	public String function;
	public long reference;
	public long preReference;
	public int documentYear;
	public long sendDate;
	public String signature;
	public String systemSignature;
	public String allContent;
	public long createdTime;
	public int webservice;
	public int validated;
	public int priority;
	public String description;
	public String validationCode;
	public int soLanGui;
}