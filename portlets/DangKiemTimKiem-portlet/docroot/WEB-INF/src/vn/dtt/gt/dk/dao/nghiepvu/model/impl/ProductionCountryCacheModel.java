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

import vn.dtt.gt.dk.dao.nghiepvu.model.ProductionCountry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ProductionCountry in entity cache.
 *
 * @author win_64
 * @see ProductionCountry
 * @generated
 */
public class ProductionCountryCacheModel implements CacheModel<ProductionCountry>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleGroupId=");
		sb.append(vehicleGroupId);
		sb.append(", countryCode=");
		sb.append(countryCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProductionCountry toEntityModel() {
		ProductionCountryImpl productionCountryImpl = new ProductionCountryImpl();

		productionCountryImpl.setId(id);
		productionCountryImpl.setVehicleGroupId(vehicleGroupId);

		if (countryCode == null) {
			productionCountryImpl.setCountryCode(StringPool.BLANK);
		}
		else {
			productionCountryImpl.setCountryCode(countryCode);
		}

		productionCountryImpl.resetOriginalValues();

		return productionCountryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicleGroupId = objectInput.readLong();
		countryCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(vehicleGroupId);

		if (countryCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(countryCode);
		}
	}

	public long id;
	public long vehicleGroupId;
	public String countryCode;
}