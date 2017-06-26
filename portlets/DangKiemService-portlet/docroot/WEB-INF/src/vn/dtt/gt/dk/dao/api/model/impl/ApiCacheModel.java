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

package vn.dtt.gt.dk.dao.api.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.api.model.Api;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Api in entity cache.
 *
 * @author huymq
 * @see Api
 * @generated
 */
public class ApiCacheModel implements CacheModel<Api>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", userAgent=");
		sb.append(userAgent);
		sb.append(", ip=");
		sb.append(ip);
		sb.append(", code=");
		sb.append(code);
		sb.append(", registeredNumber=");
		sb.append(registeredNumber);
		sb.append(", request=");
		sb.append(request);
		sb.append(", response=");
		sb.append(response);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Api toEntityModel() {
		ApiImpl apiImpl = new ApiImpl();

		apiImpl.setId(id);

		if (createDate == Long.MIN_VALUE) {
			apiImpl.setCreateDate(null);
		}
		else {
			apiImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			apiImpl.setModifiedDate(null);
		}
		else {
			apiImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (userAgent == null) {
			apiImpl.setUserAgent(StringPool.BLANK);
		}
		else {
			apiImpl.setUserAgent(userAgent);
		}

		if (ip == null) {
			apiImpl.setIp(StringPool.BLANK);
		}
		else {
			apiImpl.setIp(ip);
		}

		if (code == null) {
			apiImpl.setCode(StringPool.BLANK);
		}
		else {
			apiImpl.setCode(code);
		}

		if (registeredNumber == null) {
			apiImpl.setRegisteredNumber(StringPool.BLANK);
		}
		else {
			apiImpl.setRegisteredNumber(registeredNumber);
		}

		if (request == null) {
			apiImpl.setRequest(StringPool.BLANK);
		}
		else {
			apiImpl.setRequest(request);
		}

		if (response == null) {
			apiImpl.setResponse(StringPool.BLANK);
		}
		else {
			apiImpl.setResponse(response);
		}

		apiImpl.resetOriginalValues();

		return apiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		userAgent = objectInput.readUTF();
		ip = objectInput.readUTF();
		code = objectInput.readUTF();
		registeredNumber = objectInput.readUTF();
		request = objectInput.readUTF();
		response = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (userAgent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userAgent);
		}

		if (ip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ip);
		}

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		if (registeredNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(registeredNumber);
		}

		if (request == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(request);
		}

		if (response == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(response);
		}
	}

	public long id;
	public long createDate;
	public long modifiedDate;
	public String userAgent;
	public String ip;
	public String code;
	public String registeredNumber;
	public String request;
	public String response;
}