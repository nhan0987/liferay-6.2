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

import vn.dtt.gt.dk.dao.nghiepvu.model.DraftCertificate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DraftCertificate in entity cache.
 *
 * @author huymq
 * @see DraftCertificate
 * @generated
 */
public class DraftCertificateCacheModel implements CacheModel<DraftCertificate>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", certificateType=");
		sb.append(certificateType);
		sb.append(", inspectionReportId=");
		sb.append(inspectionReportId);
		sb.append(", safetytestReportId=");
		sb.append(safetytestReportId);
		sb.append(", emissionTestReportId=");
		sb.append(emissionTestReportId);
		sb.append(", copReportId=");
		sb.append(copReportId);
		sb.append(", reason=");
		sb.append(reason);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DraftCertificate toEntityModel() {
		DraftCertificateImpl draftCertificateImpl = new DraftCertificateImpl();

		draftCertificateImpl.setId(id);
		draftCertificateImpl.setAttachedFile(attachedFile);
		draftCertificateImpl.setCertificateType(certificateType);
		draftCertificateImpl.setInspectionReportId(inspectionReportId);
		draftCertificateImpl.setSafetytestReportId(safetytestReportId);
		draftCertificateImpl.setEmissionTestReportId(emissionTestReportId);
		draftCertificateImpl.setCopReportId(copReportId);

		if (reason == null) {
			draftCertificateImpl.setReason(StringPool.BLANK);
		}
		else {
			draftCertificateImpl.setReason(reason);
		}

		if (remarks == null) {
			draftCertificateImpl.setRemarks(StringPool.BLANK);
		}
		else {
			draftCertificateImpl.setRemarks(remarks);
		}

		if (createdDate == Long.MIN_VALUE) {
			draftCertificateImpl.setCreatedDate(null);
		}
		else {
			draftCertificateImpl.setCreatedDate(new Date(createdDate));
		}

		draftCertificateImpl.resetOriginalValues();

		return draftCertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		attachedFile = objectInput.readLong();
		certificateType = objectInput.readLong();
		inspectionReportId = objectInput.readLong();
		safetytestReportId = objectInput.readLong();
		emissionTestReportId = objectInput.readLong();
		copReportId = objectInput.readLong();
		reason = objectInput.readUTF();
		remarks = objectInput.readUTF();
		createdDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(attachedFile);
		objectOutput.writeLong(certificateType);
		objectOutput.writeLong(inspectionReportId);
		objectOutput.writeLong(safetytestReportId);
		objectOutput.writeLong(emissionTestReportId);
		objectOutput.writeLong(copReportId);

		if (reason == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reason);
		}

		if (remarks == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeLong(createdDate);
	}

	public long id;
	public long attachedFile;
	public long certificateType;
	public long inspectionReportId;
	public long safetytestReportId;
	public long emissionTestReportId;
	public long copReportId;
	public String reason;
	public String remarks;
	public long createdDate;
}