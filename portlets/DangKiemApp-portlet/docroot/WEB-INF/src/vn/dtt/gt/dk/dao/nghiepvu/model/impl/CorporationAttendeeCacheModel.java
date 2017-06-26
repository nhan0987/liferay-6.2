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

import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationAttendee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CorporationAttendee in entity cache.
 *
 * @author win_64
 * @see CorporationAttendee
 * @generated
 */
public class CorporationAttendeeCacheModel implements CacheModel<CorporationAttendee>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", confirmedInspectionId=");
		sb.append(confirmedInspectionId);
		sb.append(", sequence=");
		sb.append(sequence);
		sb.append(", inspectorid=");
		sb.append(inspectorid);
		sb.append(", inspectorName=");
		sb.append(inspectorName);
		sb.append(", inspectorRole=");
		sb.append(inspectorRole);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CorporationAttendee toEntityModel() {
		CorporationAttendeeImpl corporationAttendeeImpl = new CorporationAttendeeImpl();

		corporationAttendeeImpl.setId(id);
		corporationAttendeeImpl.setConfirmedInspectionId(confirmedInspectionId);
		corporationAttendeeImpl.setSequence(sequence);
		corporationAttendeeImpl.setInspectorid(inspectorid);

		if (inspectorName == null) {
			corporationAttendeeImpl.setInspectorName(StringPool.BLANK);
		}
		else {
			corporationAttendeeImpl.setInspectorName(inspectorName);
		}

		corporationAttendeeImpl.setInspectorRole(inspectorRole);

		corporationAttendeeImpl.resetOriginalValues();

		return corporationAttendeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		confirmedInspectionId = objectInput.readLong();
		sequence = objectInput.readLong();
		inspectorid = objectInput.readLong();
		inspectorName = objectInput.readUTF();
		inspectorRole = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(confirmedInspectionId);
		objectOutput.writeLong(sequence);
		objectOutput.writeLong(inspectorid);

		if (inspectorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorName);
		}

		objectOutput.writeLong(inspectorRole);
	}

	public long id;
	public long confirmedInspectionId;
	public long sequence;
	public long inspectorid;
	public String inspectorName;
	public long inspectorRole;
}