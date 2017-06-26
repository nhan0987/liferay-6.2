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

package vn.dtt.gt.dk.dao.aswmsg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.dtt.gt.dk.dao.aswmsg.model.AswmsgValidationLog;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AswmsgValidationLog in entity cache.
 *
 * @author win_64
 * @see AswmsgValidationLog
 * @generated
 */
public class AswmsgValidationLogCacheModel implements CacheModel<AswmsgValidationLog>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", MessageLogId=");
		sb.append(MessageLogId);
		sb.append(", TagName=");
		sb.append(TagName);
		sb.append(", ValidationCode=");
		sb.append(ValidationCode);
		sb.append(", Description=");
		sb.append(Description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AswmsgValidationLog toEntityModel() {
		AswmsgValidationLogImpl aswmsgValidationLogImpl = new AswmsgValidationLogImpl();

		aswmsgValidationLogImpl.setId(Id);
		aswmsgValidationLogImpl.setMessageLogId(MessageLogId);

		if (TagName == null) {
			aswmsgValidationLogImpl.setTagName(StringPool.BLANK);
		}
		else {
			aswmsgValidationLogImpl.setTagName(TagName);
		}

		if (ValidationCode == null) {
			aswmsgValidationLogImpl.setValidationCode(StringPool.BLANK);
		}
		else {
			aswmsgValidationLogImpl.setValidationCode(ValidationCode);
		}

		if (Description == null) {
			aswmsgValidationLogImpl.setDescription(StringPool.BLANK);
		}
		else {
			aswmsgValidationLogImpl.setDescription(Description);
		}

		aswmsgValidationLogImpl.resetOriginalValues();

		return aswmsgValidationLogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		MessageLogId = objectInput.readLong();
		TagName = objectInput.readUTF();
		ValidationCode = objectInput.readUTF();
		Description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);
		objectOutput.writeLong(MessageLogId);

		if (TagName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TagName);
		}

		if (ValidationCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ValidationCode);
		}

		if (Description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Description);
		}
	}

	public long Id;
	public long MessageLogId;
	public String TagName;
	public String ValidationCode;
	public String Description;
}