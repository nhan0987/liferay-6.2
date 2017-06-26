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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VehicleSpecification in entity cache.
 *
 * @author huymq
 * @see VehicleSpecification
 * @generated
 */
public class VehicleSpecificationCacheModel implements CacheModel<VehicleSpecification>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleGroupId=");
		sb.append(vehicleGroupId);
		sb.append(", specificationVersion=");
		sb.append(specificationVersion);
		sb.append(", specificationSourceCode=");
		sb.append(specificationSourceCode);
		sb.append(", specificationCode=");
		sb.append(specificationCode);
		sb.append(", specificationName=");
		sb.append(specificationName);
		sb.append(", specificationValue=");
		sb.append(specificationValue);
		sb.append(", safetyTestReportId=");
		sb.append(safetyTestReportId);
		sb.append(", inspectionRecordId=");
		sb.append(inspectionRecordId);
		sb.append(", specificResult=");
		sb.append(specificResult);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VehicleSpecification toEntityModel() {
		VehicleSpecificationImpl vehicleSpecificationImpl = new VehicleSpecificationImpl();

		vehicleSpecificationImpl.setId(id);
		vehicleSpecificationImpl.setVehicleGroupId(vehicleGroupId);
		vehicleSpecificationImpl.setSpecificationVersion(specificationVersion);

		if (specificationSourceCode == null) {
			vehicleSpecificationImpl.setSpecificationSourceCode(StringPool.BLANK);
		}
		else {
			vehicleSpecificationImpl.setSpecificationSourceCode(specificationSourceCode);
		}

		if (specificationCode == null) {
			vehicleSpecificationImpl.setSpecificationCode(StringPool.BLANK);
		}
		else {
			vehicleSpecificationImpl.setSpecificationCode(specificationCode);
		}

		if (specificationName == null) {
			vehicleSpecificationImpl.setSpecificationName(StringPool.BLANK);
		}
		else {
			vehicleSpecificationImpl.setSpecificationName(specificationName);
		}

		if (specificationValue == null) {
			vehicleSpecificationImpl.setSpecificationValue(StringPool.BLANK);
		}
		else {
			vehicleSpecificationImpl.setSpecificationValue(specificationValue);
		}

		vehicleSpecificationImpl.setSafetyTestReportId(safetyTestReportId);
		vehicleSpecificationImpl.setInspectionRecordId(inspectionRecordId);
		vehicleSpecificationImpl.setSpecificResult(specificResult);

		if (synchdate == Long.MIN_VALUE) {
			vehicleSpecificationImpl.setSynchdate(null);
		}
		else {
			vehicleSpecificationImpl.setSynchdate(new Date(synchdate));
		}

		vehicleSpecificationImpl.resetOriginalValues();

		return vehicleSpecificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicleGroupId = objectInput.readLong();
		specificationVersion = objectInput.readLong();
		specificationSourceCode = objectInput.readUTF();
		specificationCode = objectInput.readUTF();
		specificationName = objectInput.readUTF();
		specificationValue = objectInput.readUTF();
		safetyTestReportId = objectInput.readLong();
		inspectionRecordId = objectInput.readLong();
		specificResult = objectInput.readLong();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(vehicleGroupId);
		objectOutput.writeLong(specificationVersion);

		if (specificationSourceCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationSourceCode);
		}

		if (specificationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationCode);
		}

		if (specificationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationName);
		}

		if (specificationValue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationValue);
		}

		objectOutput.writeLong(safetyTestReportId);
		objectOutput.writeLong(inspectionRecordId);
		objectOutput.writeLong(specificResult);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public long vehicleGroupId;
	public long specificationVersion;
	public String specificationSourceCode;
	public String specificationCode;
	public String specificationName;
	public String specificationValue;
	public long safetyTestReportId;
	public long inspectionRecordId;
	public long specificResult;
	public long synchdate;
}