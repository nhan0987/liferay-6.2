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

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing InspectionCommonStatus in entity cache.
 *
 * @author win_64
 * @see InspectionCommonStatus
 * @generated
 */
public class InspectionCommonStatusCacheModel implements CacheModel<InspectionCommonStatus>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleClass=");
		sb.append(vehicleClass);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", type=");
		sb.append(type);
		sb.append(", groupName=");
		sb.append(groupName);
		sb.append(", itemName=");
		sb.append(itemName);
		sb.append(", commonStatus=");
		sb.append(commonStatus);
		sb.append(", inspectionRecordId=");
		sb.append(inspectionRecordId);
		sb.append(", commonCode=");
		sb.append(commonCode);
		sb.append(", allowEdit=");
		sb.append(allowEdit);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public InspectionCommonStatus toEntityModel() {
		InspectionCommonStatusImpl inspectionCommonStatusImpl = new InspectionCommonStatusImpl();

		inspectionCommonStatusImpl.setId(id);

		if (vehicleClass == null) {
			inspectionCommonStatusImpl.setVehicleClass(StringPool.BLANK);
		}
		else {
			inspectionCommonStatusImpl.setVehicleClass(vehicleClass);
		}

		inspectionCommonStatusImpl.setSequenceNo(sequenceNo);
		inspectionCommonStatusImpl.setType(type);

		if (groupName == null) {
			inspectionCommonStatusImpl.setGroupName(StringPool.BLANK);
		}
		else {
			inspectionCommonStatusImpl.setGroupName(groupName);
		}

		if (itemName == null) {
			inspectionCommonStatusImpl.setItemName(StringPool.BLANK);
		}
		else {
			inspectionCommonStatusImpl.setItemName(itemName);
		}

		inspectionCommonStatusImpl.setCommonStatus(commonStatus);
		inspectionCommonStatusImpl.setInspectionRecordId(inspectionRecordId);

		if (commonCode == null) {
			inspectionCommonStatusImpl.setCommonCode(StringPool.BLANK);
		}
		else {
			inspectionCommonStatusImpl.setCommonCode(commonCode);
		}

		inspectionCommonStatusImpl.setAllowEdit(allowEdit);

		inspectionCommonStatusImpl.resetOriginalValues();

		return inspectionCommonStatusImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicleClass = objectInput.readUTF();
		sequenceNo = objectInput.readLong();
		type = objectInput.readLong();
		groupName = objectInput.readUTF();
		itemName = objectInput.readUTF();
		commonStatus = objectInput.readLong();
		inspectionRecordId = objectInput.readLong();
		commonCode = objectInput.readUTF();
		allowEdit = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (vehicleClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(vehicleClass);
		}

		objectOutput.writeLong(sequenceNo);
		objectOutput.writeLong(type);

		if (groupName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(groupName);
		}

		if (itemName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(itemName);
		}

		objectOutput.writeLong(commonStatus);
		objectOutput.writeLong(inspectionRecordId);

		if (commonCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commonCode);
		}

		objectOutput.writeInt(allowEdit);
	}

	public long id;
	public String vehicleClass;
	public long sequenceNo;
	public long type;
	public String groupName;
	public String itemName;
	public long commonStatus;
	public long inspectionRecordId;
	public String commonCode;
	public int allowEdit;
}