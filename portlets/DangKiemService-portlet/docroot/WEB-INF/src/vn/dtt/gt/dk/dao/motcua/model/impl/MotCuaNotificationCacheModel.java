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

package vn.dtt.gt.dk.dao.motcua.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaNotification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MotCuaNotification in entity cache.
 *
 * @author huymq
 * @see MotCuaNotification
 * @generated
 */
public class MotCuaNotificationCacheModel implements CacheModel<MotCuaNotification>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(id);
		sb.append(", dossierid=");
		sb.append(dossierid);
		sb.append(", organization=");
		sb.append(organization);
		sb.append(", division=");
		sb.append(division);
		sb.append(", officerName=");
		sb.append(officerName);
		sb.append(", messageID=");
		sb.append(messageID);
		sb.append(", messageType=");
		sb.append(messageType);
		sb.append(", phieuxulyphuId=");
		sb.append(phieuxulyphuId);
		sb.append(", response=");
		sb.append(response);
		sb.append(", responseTime=");
		sb.append(responseTime);
		sb.append(", requestContent=");
		sb.append(requestContent);
		sb.append(", requestTime=");
		sb.append(requestTime);
		sb.append(", requestSender=");
		sb.append(requestSender);
		sb.append(", isReply=");
		sb.append(isReply);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MotCuaNotification toEntityModel() {
		MotCuaNotificationImpl motCuaNotificationImpl = new MotCuaNotificationImpl();

		motCuaNotificationImpl.setId(id);
		motCuaNotificationImpl.setDossierid(dossierid);

		if (organization == null) {
			motCuaNotificationImpl.setOrganization(StringPool.BLANK);
		}
		else {
			motCuaNotificationImpl.setOrganization(organization);
		}

		if (division == null) {
			motCuaNotificationImpl.setDivision(StringPool.BLANK);
		}
		else {
			motCuaNotificationImpl.setDivision(division);
		}

		if (officerName == null) {
			motCuaNotificationImpl.setOfficerName(StringPool.BLANK);
		}
		else {
			motCuaNotificationImpl.setOfficerName(officerName);
		}

		if (messageID == null) {
			motCuaNotificationImpl.setMessageID(StringPool.BLANK);
		}
		else {
			motCuaNotificationImpl.setMessageID(messageID);
		}

		motCuaNotificationImpl.setMessageType(messageType);
		motCuaNotificationImpl.setPhieuxulyphuId(phieuxulyphuId);

		if (response == null) {
			motCuaNotificationImpl.setResponse(StringPool.BLANK);
		}
		else {
			motCuaNotificationImpl.setResponse(response);
		}

		if (responseTime == Long.MIN_VALUE) {
			motCuaNotificationImpl.setResponseTime(null);
		}
		else {
			motCuaNotificationImpl.setResponseTime(new Date(responseTime));
		}

		if (requestContent == null) {
			motCuaNotificationImpl.setRequestContent(StringPool.BLANK);
		}
		else {
			motCuaNotificationImpl.setRequestContent(requestContent);
		}

		if (requestTime == Long.MIN_VALUE) {
			motCuaNotificationImpl.setRequestTime(null);
		}
		else {
			motCuaNotificationImpl.setRequestTime(new Date(requestTime));
		}

		if (requestSender == null) {
			motCuaNotificationImpl.setRequestSender(StringPool.BLANK);
		}
		else {
			motCuaNotificationImpl.setRequestSender(requestSender);
		}

		motCuaNotificationImpl.setIsReply(isReply);

		motCuaNotificationImpl.resetOriginalValues();

		return motCuaNotificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		dossierid = objectInput.readLong();
		organization = objectInput.readUTF();
		division = objectInput.readUTF();
		officerName = objectInput.readUTF();
		messageID = objectInput.readUTF();
		messageType = objectInput.readLong();
		phieuxulyphuId = objectInput.readLong();
		response = objectInput.readUTF();
		responseTime = objectInput.readLong();
		requestContent = objectInput.readUTF();
		requestTime = objectInput.readLong();
		requestSender = objectInput.readUTF();
		isReply = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(dossierid);

		if (organization == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organization);
		}

		if (division == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(division);
		}

		if (officerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(officerName);
		}

		if (messageID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageID);
		}

		objectOutput.writeLong(messageType);
		objectOutput.writeLong(phieuxulyphuId);

		if (response == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(response);
		}

		objectOutput.writeLong(responseTime);

		if (requestContent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requestContent);
		}

		objectOutput.writeLong(requestTime);

		if (requestSender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requestSender);
		}

		objectOutput.writeLong(isReply);
	}

	public long id;
	public long dossierid;
	public String organization;
	public String division;
	public String officerName;
	public String messageID;
	public long messageType;
	public long phieuxulyphuId;
	public String response;
	public long responseTime;
	public String requestContent;
	public long requestTime;
	public String requestSender;
	public long isReply;
}