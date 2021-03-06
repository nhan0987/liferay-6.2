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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VehicleGroupSpec in entity cache.
 *
 * @author win_64
 * @see VehicleGroupSpec
 * @generated
 */
public class VehicleGroupSpecCacheModel implements CacheModel<VehicleGroupSpec>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleGroupId=");
		sb.append(vehicleGroupId);
		sb.append(", specificationCode=");
		sb.append(specificationCode);
		sb.append(", specificationName=");
		sb.append(specificationName);
		sb.append(", specificationValue=");
		sb.append(specificationValue);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VehicleGroupSpec toEntityModel() {
		VehicleGroupSpecImpl vehicleGroupSpecImpl = new VehicleGroupSpecImpl();

		vehicleGroupSpecImpl.setId(id);
		vehicleGroupSpecImpl.setVehicleGroupId(vehicleGroupId);

		if (specificationCode == null) {
			vehicleGroupSpecImpl.setSpecificationCode(StringPool.BLANK);
		}
		else {
			vehicleGroupSpecImpl.setSpecificationCode(specificationCode);
		}

		if (specificationName == null) {
			vehicleGroupSpecImpl.setSpecificationName(StringPool.BLANK);
		}
		else {
			vehicleGroupSpecImpl.setSpecificationName(specificationName);
		}

		if (specificationValue == null) {
			vehicleGroupSpecImpl.setSpecificationValue(StringPool.BLANK);
		}
		else {
			vehicleGroupSpecImpl.setSpecificationValue(specificationValue);
		}

		vehicleGroupSpecImpl.resetOriginalValues();

		return vehicleGroupSpecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicleGroupId = objectInput.readLong();
		specificationCode = objectInput.readUTF();
		specificationName = objectInput.readUTF();
		specificationValue = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(vehicleGroupId);

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
	}

	public long id;
	public long vehicleGroupId;
	public String specificationCode;
	public String specificationName;
	public String specificationValue;
}