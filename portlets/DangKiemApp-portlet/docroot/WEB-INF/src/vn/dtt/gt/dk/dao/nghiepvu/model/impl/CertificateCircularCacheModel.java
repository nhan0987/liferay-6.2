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

import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CertificateCircular in entity cache.
 *
 * @author win_64
 * @see CertificateCircular
 * @generated
 */
public class CertificateCircularCacheModel implements CacheModel<CertificateCircular>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", certificateRecordId=");
		sb.append(certificateRecordId);
		sb.append(", sequenceNo=");
		sb.append(sequenceNo);
		sb.append(", circularNo=");
		sb.append(circularNo);
		sb.append(", circularDate=");
		sb.append(circularDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CertificateCircular toEntityModel() {
		CertificateCircularImpl certificateCircularImpl = new CertificateCircularImpl();

		certificateCircularImpl.setId(id);
		certificateCircularImpl.setCertificateRecordId(certificateRecordId);
		certificateCircularImpl.setSequenceNo(sequenceNo);

		if (circularNo == null) {
			certificateCircularImpl.setCircularNo(StringPool.BLANK);
		}
		else {
			certificateCircularImpl.setCircularNo(circularNo);
		}

		if (circularDate == Long.MIN_VALUE) {
			certificateCircularImpl.setCircularDate(null);
		}
		else {
			certificateCircularImpl.setCircularDate(new Date(circularDate));
		}

		certificateCircularImpl.resetOriginalValues();

		return certificateCircularImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		certificateRecordId = objectInput.readLong();
		sequenceNo = objectInput.readLong();
		circularNo = objectInput.readUTF();
		circularDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(certificateRecordId);
		objectOutput.writeLong(sequenceNo);

		if (circularNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(circularNo);
		}

		objectOutput.writeLong(circularDate);
	}

	public long id;
	public long certificateRecordId;
	public long sequenceNo;
	public String circularNo;
	public long circularDate;
}