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

import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificateSpec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DraftCertificateSpec in entity cache.
 *
 * @author win_64
 * @see DraftCertificateSpec
 * @generated
 */
public class DraftCertificateSpecCacheModel implements CacheModel<DraftCertificateSpec>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", draftCertificateId=");
		sb.append(draftCertificateId);
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
	public DraftCertificateSpec toEntityModel() {
		DraftCertificateSpecImpl draftCertificateSpecImpl = new DraftCertificateSpecImpl();

		draftCertificateSpecImpl.setId(id);
		draftCertificateSpecImpl.setDraftCertificateId(draftCertificateId);

		if (specificationCode == null) {
			draftCertificateSpecImpl.setSpecificationCode(StringPool.BLANK);
		}
		else {
			draftCertificateSpecImpl.setSpecificationCode(specificationCode);
		}

		if (specificationName == null) {
			draftCertificateSpecImpl.setSpecificationName(StringPool.BLANK);
		}
		else {
			draftCertificateSpecImpl.setSpecificationName(specificationName);
		}

		if (specificationValue == null) {
			draftCertificateSpecImpl.setSpecificationValue(StringPool.BLANK);
		}
		else {
			draftCertificateSpecImpl.setSpecificationValue(specificationValue);
		}

		draftCertificateSpecImpl.resetOriginalValues();

		return draftCertificateSpecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		draftCertificateId = objectInput.readLong();
		specificationCode = objectInput.readUTF();
		specificationName = objectInput.readUTF();
		specificationValue = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(draftCertificateId);

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
	public long draftCertificateId;
	public String specificationCode;
	public String specificationName;
	public String specificationValue;
}