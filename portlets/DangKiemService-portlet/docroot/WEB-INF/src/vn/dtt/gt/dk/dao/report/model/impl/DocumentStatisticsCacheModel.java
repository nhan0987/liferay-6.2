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

package vn.dtt.gt.dk.dao.report.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.report.model.DocumentStatistics;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DocumentStatistics in entity cache.
 *
 * @author win_64
 * @see DocumentStatistics
 * @generated
 */
public class DocumentStatisticsCacheModel implements CacheModel<DocumentStatistics>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", documentTypeCode=");
		sb.append(documentTypeCode);
		sb.append(", remainingNumber=");
		sb.append(remainingNumber);
		sb.append(", receivedNumber=");
		sb.append(receivedNumber);
		sb.append(", ontimeNumber=");
		sb.append(ontimeNumber);
		sb.append(", overtimeNumber=");
		sb.append(overtimeNumber);
		sb.append(", processingNumber=");
		sb.append(processingNumber);
		sb.append(", delayingNumber=");
		sb.append(delayingNumber);
		sb.append(", month=");
		sb.append(month);
		sb.append(", year=");
		sb.append(year);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DocumentStatistics toEntityModel() {
		DocumentStatisticsImpl documentStatisticsImpl = new DocumentStatisticsImpl();

		documentStatisticsImpl.setId(id);

		if (createDate == Long.MIN_VALUE) {
			documentStatisticsImpl.setCreateDate(null);
		}
		else {
			documentStatisticsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			documentStatisticsImpl.setModifiedDate(null);
		}
		else {
			documentStatisticsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (documentTypeCode == null) {
			documentStatisticsImpl.setDocumentTypeCode(StringPool.BLANK);
		}
		else {
			documentStatisticsImpl.setDocumentTypeCode(documentTypeCode);
		}

		documentStatisticsImpl.setRemainingNumber(remainingNumber);
		documentStatisticsImpl.setReceivedNumber(receivedNumber);
		documentStatisticsImpl.setOntimeNumber(ontimeNumber);
		documentStatisticsImpl.setOvertimeNumber(overtimeNumber);
		documentStatisticsImpl.setProcessingNumber(processingNumber);
		documentStatisticsImpl.setDelayingNumber(delayingNumber);
		documentStatisticsImpl.setMonth(month);
		documentStatisticsImpl.setYear(year);
		documentStatisticsImpl.setStatus(status);

		documentStatisticsImpl.resetOriginalValues();

		return documentStatisticsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		documentTypeCode = objectInput.readUTF();
		remainingNumber = objectInput.readLong();
		receivedNumber = objectInput.readLong();
		ontimeNumber = objectInput.readLong();
		overtimeNumber = objectInput.readLong();
		processingNumber = objectInput.readLong();
		delayingNumber = objectInput.readLong();
		month = objectInput.readInt();
		year = objectInput.readInt();
		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (documentTypeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(documentTypeCode);
		}

		objectOutput.writeLong(remainingNumber);
		objectOutput.writeLong(receivedNumber);
		objectOutput.writeLong(ontimeNumber);
		objectOutput.writeLong(overtimeNumber);
		objectOutput.writeLong(processingNumber);
		objectOutput.writeLong(delayingNumber);
		objectOutput.writeInt(month);
		objectOutput.writeInt(year);
		objectOutput.writeInt(status);
	}

	public long id;
	public long createDate;
	public long modifiedDate;
	public String documentTypeCode;
	public long remainingNumber;
	public long receivedNumber;
	public long ontimeNumber;
	public long overtimeNumber;
	public long processingNumber;
	public long delayingNumber;
	public int month;
	public int year;
	public int status;
}