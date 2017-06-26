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

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgWebservice;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AswmsgWebservice in entity cache.
 *
 * @author win_64
 * @see AswmsgWebservice
 * @generated
 */
public class AswmsgWebserviceCacheModel implements CacheModel<AswmsgWebservice>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", ServiceCode=");
		sb.append(ServiceCode);
		sb.append(", ServiceName=");
		sb.append(ServiceName);
		sb.append(", ServiceURL=");
		sb.append(ServiceURL);
		sb.append(", UserName=");
		sb.append(UserName);
		sb.append(", Password=");
		sb.append(Password);
		sb.append(", Domain=");
		sb.append(Domain);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AswmsgWebservice toEntityModel() {
		AswmsgWebserviceImpl aswmsgWebserviceImpl = new AswmsgWebserviceImpl();

		aswmsgWebserviceImpl.setId(Id);

		if (ServiceCode == null) {
			aswmsgWebserviceImpl.setServiceCode(StringPool.BLANK);
		}
		else {
			aswmsgWebserviceImpl.setServiceCode(ServiceCode);
		}

		if (ServiceName == null) {
			aswmsgWebserviceImpl.setServiceName(StringPool.BLANK);
		}
		else {
			aswmsgWebserviceImpl.setServiceName(ServiceName);
		}

		if (ServiceURL == null) {
			aswmsgWebserviceImpl.setServiceURL(StringPool.BLANK);
		}
		else {
			aswmsgWebserviceImpl.setServiceURL(ServiceURL);
		}

		if (UserName == null) {
			aswmsgWebserviceImpl.setUserName(StringPool.BLANK);
		}
		else {
			aswmsgWebserviceImpl.setUserName(UserName);
		}

		if (Password == null) {
			aswmsgWebserviceImpl.setPassword(StringPool.BLANK);
		}
		else {
			aswmsgWebserviceImpl.setPassword(Password);
		}

		if (Domain == null) {
			aswmsgWebserviceImpl.setDomain(StringPool.BLANK);
		}
		else {
			aswmsgWebserviceImpl.setDomain(Domain);
		}

		aswmsgWebserviceImpl.resetOriginalValues();

		return aswmsgWebserviceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		ServiceCode = objectInput.readUTF();
		ServiceName = objectInput.readUTF();
		ServiceURL = objectInput.readUTF();
		UserName = objectInput.readUTF();
		Password = objectInput.readUTF();
		Domain = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (ServiceCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ServiceCode);
		}

		if (ServiceName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ServiceName);
		}

		if (ServiceURL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ServiceURL);
		}

		if (UserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(UserName);
		}

		if (Password == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Password);
		}

		if (Domain == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Domain);
		}
	}

	public long Id;
	public String ServiceCode;
	public String ServiceName;
	public String ServiceURL;
	public String UserName;
	public String Password;
	public String Domain;
}