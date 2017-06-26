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

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgMessageQueue;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AswmsgMessageQueue in entity cache.
 *
 * @author win_64
 * @see AswmsgMessageQueue
 * @generated
 */
public class AswmsgMessageQueueCacheModel implements CacheModel<AswmsgMessageQueue>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

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
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", phieuXuLyPhuId=");
		sb.append(phieuXuLyPhuId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AswmsgMessageQueue toEntityModel() {
		AswmsgMessageQueueImpl aswmsgMessageQueueImpl = new AswmsgMessageQueueImpl();

		aswmsgMessageQueueImpl.setId(id);

		if (version == null) {
			aswmsgMessageQueueImpl.setVersion(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setVersion(version);
		}

		if (messageId == null) {
			aswmsgMessageQueueImpl.setMessageId(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setMessageId(messageId);
		}

		if (senderName == null) {
			aswmsgMessageQueueImpl.setSenderName(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setSenderName(senderName);
		}

		if (senderIdentity == null) {
			aswmsgMessageQueueImpl.setSenderIdentity(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setSenderIdentity(senderIdentity);
		}

		if (senderCountryCode == null) {
			aswmsgMessageQueueImpl.setSenderCountryCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setSenderCountryCode(senderCountryCode);
		}

		if (senderMinistryCode == null) {
			aswmsgMessageQueueImpl.setSenderMinistryCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setSenderMinistryCode(senderMinistryCode);
		}

		if (senderOrganizationCode == null) {
			aswmsgMessageQueueImpl.setSenderOrganizationCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setSenderOrganizationCode(senderOrganizationCode);
		}

		if (senderUnitCode == null) {
			aswmsgMessageQueueImpl.setSenderUnitCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setSenderUnitCode(senderUnitCode);
		}

		if (receiverName == null) {
			aswmsgMessageQueueImpl.setReceiverName(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setReceiverName(receiverName);
		}

		if (receiverIdentity == null) {
			aswmsgMessageQueueImpl.setReceiverIdentity(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setReceiverIdentity(receiverIdentity);
		}

		if (receiverCountryCode == null) {
			aswmsgMessageQueueImpl.setReceiverCountryCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setReceiverCountryCode(receiverCountryCode);
		}

		if (receiverMinistryCode == null) {
			aswmsgMessageQueueImpl.setReceiverMinistryCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setReceiverMinistryCode(receiverMinistryCode);
		}

		if (receiverOrganizationCode == null) {
			aswmsgMessageQueueImpl.setReceiverOrganizationCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setReceiverOrganizationCode(receiverOrganizationCode);
		}

		if (receiverUnitCode == null) {
			aswmsgMessageQueueImpl.setReceiverUnitCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setReceiverUnitCode(receiverUnitCode);
		}

		if (documentType == null) {
			aswmsgMessageQueueImpl.setDocumentType(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setDocumentType(documentType);
		}

		aswmsgMessageQueueImpl.setType(type);

		if (function == null) {
			aswmsgMessageQueueImpl.setFunction(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setFunction(function);
		}

		aswmsgMessageQueueImpl.setReference(reference);
		aswmsgMessageQueueImpl.setPreReference(preReference);
		aswmsgMessageQueueImpl.setDocumentYear(documentYear);

		if (sendDate == Long.MIN_VALUE) {
			aswmsgMessageQueueImpl.setSendDate(null);
		}
		else {
			aswmsgMessageQueueImpl.setSendDate(new Date(sendDate));
		}

		if (signature == null) {
			aswmsgMessageQueueImpl.setSignature(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setSignature(signature);
		}

		if (systemSignature == null) {
			aswmsgMessageQueueImpl.setSystemSignature(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setSystemSignature(systemSignature);
		}

		if (allContent == null) {
			aswmsgMessageQueueImpl.setAllContent(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setAllContent(allContent);
		}

		if (createdTime == Long.MIN_VALUE) {
			aswmsgMessageQueueImpl.setCreatedTime(null);
		}
		else {
			aswmsgMessageQueueImpl.setCreatedTime(new Date(createdTime));
		}

		aswmsgMessageQueueImpl.setWebservice(webservice);
		aswmsgMessageQueueImpl.setValidated(validated);
		aswmsgMessageQueueImpl.setPriority(priority);

		if (description == null) {
			aswmsgMessageQueueImpl.setDescription(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setDescription(description);
		}

		if (validationCode == null) {
			aswmsgMessageQueueImpl.setValidationCode(StringPool.BLANK);
		}
		else {
			aswmsgMessageQueueImpl.setValidationCode(validationCode);
		}

		aswmsgMessageQueueImpl.setSoLanGui(soLanGui);
		aswmsgMessageQueueImpl.setHoSoThuTucId(hoSoThuTucId);
		aswmsgMessageQueueImpl.setPhieuXuLyPhuId(phieuXuLyPhuId);

		aswmsgMessageQueueImpl.resetOriginalValues();

		return aswmsgMessageQueueImpl;
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
		hoSoThuTucId = objectInput.readLong();
		phieuXuLyPhuId = objectInput.readLong();
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
		objectOutput.writeLong(hoSoThuTucId);
		objectOutput.writeLong(phieuXuLyPhuId);
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
	public long hoSoThuTucId;
	public long phieuXuLyPhuId;
}