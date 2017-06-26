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

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InspectionRecordAttach in entity cache.
 *
 * @author huymq
 * @see InspectionRecordAttach
 * @generated
 */
public class InspectionRecordAttachCacheModel implements CacheModel<InspectionRecordAttach>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", inspectionRecordId=");
		sb.append(inspectionRecordId);
		sb.append(", hoSoThuTucId=");
		sb.append(hoSoThuTucId);
		sb.append(", enTryId=");
		sb.append(enTryId);
		sb.append(", enTryName=");
		sb.append(enTryName);
		sb.append(", inspectorId=");
		sb.append(inspectorId);
		sb.append(", uploadTime=");
		sb.append(uploadTime);
		sb.append(", markUpDelte=");
		sb.append(markUpDelte);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public InspectionRecordAttach toEntityModel() {
		InspectionRecordAttachImpl inspectionRecordAttachImpl = new InspectionRecordAttachImpl();

		inspectionRecordAttachImpl.setId(id);
		inspectionRecordAttachImpl.setInspectionRecordId(inspectionRecordId);
		inspectionRecordAttachImpl.setHoSoThuTucId(hoSoThuTucId);

		if (enTryId == null) {
			inspectionRecordAttachImpl.setEnTryId(StringPool.BLANK);
		}
		else {
			inspectionRecordAttachImpl.setEnTryId(enTryId);
		}

		if (enTryName == null) {
			inspectionRecordAttachImpl.setEnTryName(StringPool.BLANK);
		}
		else {
			inspectionRecordAttachImpl.setEnTryName(enTryName);
		}

		inspectionRecordAttachImpl.setInspectorId(inspectorId);

		if (uploadTime == Long.MIN_VALUE) {
			inspectionRecordAttachImpl.setUploadTime(null);
		}
		else {
			inspectionRecordAttachImpl.setUploadTime(new Date(uploadTime));
		}

		inspectionRecordAttachImpl.setMarkUpDelte(markUpDelte);

		if (synchdate == Long.MIN_VALUE) {
			inspectionRecordAttachImpl.setSynchdate(null);
		}
		else {
			inspectionRecordAttachImpl.setSynchdate(new Date(synchdate));
		}

		inspectionRecordAttachImpl.resetOriginalValues();

		return inspectionRecordAttachImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		inspectionRecordId = objectInput.readLong();
		hoSoThuTucId = objectInput.readLong();
		enTryId = objectInput.readUTF();
		enTryName = objectInput.readUTF();
		inspectorId = objectInput.readLong();
		uploadTime = objectInput.readLong();
		markUpDelte = objectInput.readInt();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(inspectionRecordId);
		objectOutput.writeLong(hoSoThuTucId);

		if (enTryId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enTryId);
		}

		if (enTryName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enTryName);
		}

		objectOutput.writeLong(inspectorId);
		objectOutput.writeLong(uploadTime);
		objectOutput.writeInt(markUpDelte);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public long inspectionRecordId;
	public long hoSoThuTucId;
	public String enTryId;
	public String enTryName;
	public long inspectorId;
	public long uploadTime;
	public int markUpDelte;
	public long synchdate;
}