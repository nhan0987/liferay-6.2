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

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InspectionRecordSpec in entity cache.
 *
 * @author huymq
 * @see InspectionRecordSpec
 * @generated
 */
public class InspectionRecordSpecCacheModel implements CacheModel<InspectionRecordSpec>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", inspectionRecordid=");
		sb.append(inspectionRecordid);
		sb.append(", specificationCode=");
		sb.append(specificationCode);
		sb.append(", specificationName=");
		sb.append(specificationName);
		sb.append(", specificationValue=");
		sb.append(specificationValue);
		sb.append(", evaluationResult=");
		sb.append(evaluationResult);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public InspectionRecordSpec toEntityModel() {
		InspectionRecordSpecImpl inspectionRecordSpecImpl = new InspectionRecordSpecImpl();

		inspectionRecordSpecImpl.setId(id);
		inspectionRecordSpecImpl.setInspectionRecordid(inspectionRecordid);

		if (specificationCode == null) {
			inspectionRecordSpecImpl.setSpecificationCode(StringPool.BLANK);
		}
		else {
			inspectionRecordSpecImpl.setSpecificationCode(specificationCode);
		}

		if (specificationName == null) {
			inspectionRecordSpecImpl.setSpecificationName(StringPool.BLANK);
		}
		else {
			inspectionRecordSpecImpl.setSpecificationName(specificationName);
		}

		if (specificationValue == null) {
			inspectionRecordSpecImpl.setSpecificationValue(StringPool.BLANK);
		}
		else {
			inspectionRecordSpecImpl.setSpecificationValue(specificationValue);
		}

		inspectionRecordSpecImpl.setEvaluationResult(evaluationResult);

		if (synchdate == Long.MIN_VALUE) {
			inspectionRecordSpecImpl.setSynchdate(null);
		}
		else {
			inspectionRecordSpecImpl.setSynchdate(new Date(synchdate));
		}

		inspectionRecordSpecImpl.resetOriginalValues();

		return inspectionRecordSpecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		inspectionRecordid = objectInput.readLong();
		specificationCode = objectInput.readUTF();
		specificationName = objectInput.readUTF();
		specificationValue = objectInput.readUTF();
		evaluationResult = objectInput.readLong();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(inspectionRecordid);

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

		objectOutput.writeLong(evaluationResult);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public long inspectionRecordid;
	public String specificationCode;
	public String specificationName;
	public String specificationValue;
	public long evaluationResult;
	public long synchdate;
}