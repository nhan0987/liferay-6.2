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

import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CertificateRecordSpec in entity cache.
 *
 * @author win_64
 * @see CertificateRecordSpec
 * @generated
 */
public class CertificateRecordSpecCacheModel implements CacheModel<CertificateRecordSpec>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", certificateRecordId=");
		sb.append(certificateRecordId);
		sb.append(", specificationCode=");
		sb.append(specificationCode);
		sb.append(", specificationName=");
		sb.append(specificationName);
		sb.append(", specificationValue=");
		sb.append(specificationValue);
		sb.append(", version=");
		sb.append(version);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CertificateRecordSpec toEntityModel() {
		CertificateRecordSpecImpl certificateRecordSpecImpl = new CertificateRecordSpecImpl();

		certificateRecordSpecImpl.setId(id);
		certificateRecordSpecImpl.setCertificateRecordId(certificateRecordId);

		if (specificationCode == null) {
			certificateRecordSpecImpl.setSpecificationCode(StringPool.BLANK);
		}
		else {
			certificateRecordSpecImpl.setSpecificationCode(specificationCode);
		}

		if (specificationName == null) {
			certificateRecordSpecImpl.setSpecificationName(StringPool.BLANK);
		}
		else {
			certificateRecordSpecImpl.setSpecificationName(specificationName);
		}

		if (specificationValue == null) {
			certificateRecordSpecImpl.setSpecificationValue(StringPool.BLANK);
		}
		else {
			certificateRecordSpecImpl.setSpecificationValue(specificationValue);
		}

		certificateRecordSpecImpl.setVersion(version);

		certificateRecordSpecImpl.resetOriginalValues();

		return certificateRecordSpecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		certificateRecordId = objectInput.readLong();
		specificationCode = objectInput.readUTF();
		specificationName = objectInput.readUTF();
		specificationValue = objectInput.readUTF();
		version = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(certificateRecordId);

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

		objectOutput.writeLong(version);
	}

	public long id;
	public long certificateRecordId;
	public String specificationCode;
	public String specificationName;
	public String specificationValue;
	public long version;
}