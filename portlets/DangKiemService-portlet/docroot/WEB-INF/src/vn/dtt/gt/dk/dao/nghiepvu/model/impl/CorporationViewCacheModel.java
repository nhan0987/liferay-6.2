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

package vn.dtt.gt.dk.dao.nghiepvu.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CorporationView in entity cache.
 *
 * @author huymq
 * @see CorporationView
 * @generated
 */
public class CorporationViewCacheModel implements CacheModel<CorporationView>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", corporationName=");
		sb.append(corporationName);
		sb.append(", inspectorId=");
		sb.append(inspectorId);
		sb.append(", isLeader=");
		sb.append(isLeader);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CorporationView toEntityModel() {
		CorporationViewImpl corporationViewImpl = new CorporationViewImpl();

		corporationViewImpl.setId(id);

		if (corporationId == null) {
			corporationViewImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			corporationViewImpl.setCorporationId(corporationId);
		}

		if (corporationName == null) {
			corporationViewImpl.setCorporationName(StringPool.BLANK);
		}
		else {
			corporationViewImpl.setCorporationName(corporationName);
		}

		corporationViewImpl.setInspectorId(inspectorId);
		corporationViewImpl.setIsLeader(isLeader);

		if (synchdate == Long.MIN_VALUE) {
			corporationViewImpl.setSynchdate(null);
		}
		else {
			corporationViewImpl.setSynchdate(new Date(synchdate));
		}

		corporationViewImpl.resetOriginalValues();

		return corporationViewImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		corporationId = objectInput.readUTF();
		corporationName = objectInput.readUTF();
		inspectorId = objectInput.readLong();
		isLeader = objectInput.readInt();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
		}

		if (corporationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationName);
		}

		objectOutput.writeLong(inspectorId);
		objectOutput.writeInt(isLeader);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public String corporationId;
	public String corporationName;
	public long inspectorId;
	public int isLeader;
	public long synchdate;
}