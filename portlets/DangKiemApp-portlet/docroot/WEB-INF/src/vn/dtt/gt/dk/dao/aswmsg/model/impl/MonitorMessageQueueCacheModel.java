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

import vn.dtt.gt.dk.dao.aswmsg.model.MonitorMessageQueue;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MonitorMessageQueue in entity cache.
 *
 * @author win_64
 * @see MonitorMessageQueue
 * @generated
 */
public class MonitorMessageQueueCacheModel implements CacheModel<MonitorMessageQueue>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(63);

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
	public MonitorMessageQueue toEntityModel() {
		MonitorMessageQueueImpl monitorMessageQueueImpl = new MonitorMessageQueueImpl();

		monitorMessageQueueImpl.setId(id);

		if (version == null) {
			monitorMessageQueueImpl.setVersion(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setVersion(version);
		}

		if (messageId == null) {
			monitorMessageQueueImpl.setMessageId(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setMessageId(messageId);
		}

		if (senderName == null) {
			monitorMessageQueueImpl.setSenderName(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setSenderName(senderName);
		}

		if (senderIdentity == null) {
			monitorMessageQueueImpl.setSenderIdentity(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setSenderIdentity(senderIdentity);
		}

		if (senderCountryCode == null) {
			monitorMessageQueueImpl.setSenderCountryCode(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setSenderCountryCode(senderCountryCode);
		}

		if (senderMinistryCode == null) {
			monitorMessageQueueImpl.setSenderMinistryCode(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setSenderMinistryCode(senderMinistryCode);
		}

		if (senderOrganizationCode == null) {
			monitorMessageQueueImpl.setSenderOrganizationCode(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setSenderOrganizationCode(senderOrganizationCode);
		}

		if (senderUnitCode == null) {
			monitorMessageQueueImpl.setSenderUnitCode(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setSenderUnitCode(senderUnitCode);
		}

		if (receiverName == null) {
			monitorMessageQueueImpl.setReceiverName(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setReceiverName(receiverName);
		}

		if (receiverIdentity == null) {
			monitorMessageQueueImpl.setReceiverIdentity(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setReceiverIdentity(receiverIdentity);
		}

		if (receiverCountryCode == null) {
			monitorMessageQueueImpl.setReceiverCountryCode(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setReceiverCountryCode(receiverCountryCode);
		}

		if (receiverMinistryCode == null) {
			monitorMessageQueueImpl.setReceiverMinistryCode(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setReceiverMinistryCode(receiverMinistryCode);
		}

		if (receiverOrganizationCode == null) {
			monitorMessageQueueImpl.setReceiverOrganizationCode(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setReceiverOrganizationCode(receiverOrganizationCode);
		}

		if (receiverUnitCode == null) {
			monitorMessageQueueImpl.setReceiverUnitCode(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setReceiverUnitCode(receiverUnitCode);
		}

		if (documentType == null) {
			monitorMessageQueueImpl.setDocumentType(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setDocumentType(documentType);
		}

		monitorMessageQueueImpl.setType(type);

		if (function == null) {
			monitorMessageQueueImpl.setFunction(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setFunction(function);
		}

		monitorMessageQueueImpl.setReference(reference);
		monitorMessageQueueImpl.setPreReference(preReference);
		monitorMessageQueueImpl.setDocumentYear(documentYear);

		if (sendDate == Long.MIN_VALUE) {
			monitorMessageQueueImpl.setSendDate(null);
		}
		else {
			monitorMessageQueueImpl.setSendDate(new Date(sendDate));
		}

		if (createdTime == Long.MIN_VALUE) {
			monitorMessageQueueImpl.setCreatedTime(null);
		}
		else {
			monitorMessageQueueImpl.setCreatedTime(new Date(createdTime));
		}

		monitorMessageQueueImpl.setWebservice(webservice);
		monitorMessageQueueImpl.setValidated(validated);
		monitorMessageQueueImpl.setPriority(priority);

		if (description == null) {
			monitorMessageQueueImpl.setDescription(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setDescription(description);
		}

		if (validationCode == null) {
			monitorMessageQueueImpl.setValidationCode(StringPool.BLANK);
		}
		else {
			monitorMessageQueueImpl.setValidationCode(validationCode);
		}

		monitorMessageQueueImpl.setSoLanGui(soLanGui);
		monitorMessageQueueImpl.setHoSoThuTucId(hoSoThuTucId);
		monitorMessageQueueImpl.setPhieuXuLyPhuId(phieuXuLyPhuId);

		monitorMessageQueueImpl.resetOriginalValues();

		return monitorMessageQueueImpl;
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