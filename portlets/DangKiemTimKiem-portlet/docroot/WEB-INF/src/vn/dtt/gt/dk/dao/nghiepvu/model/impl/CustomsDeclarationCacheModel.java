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

import vn.dtt.gt.dk.dao.nghiepvu.model.CustomsDeclaration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CustomsDeclaration in entity cache.
 *
 * @author win_64
 * @see CustomsDeclaration
 * @generated
 */
public class CustomsDeclarationCacheModel implements CacheModel<CustomsDeclaration>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", importCustomDeclareNo=");
		sb.append(importCustomDeclareNo);
		sb.append(", importCustomDeclareDate=");
		sb.append(importCustomDeclareDate);
		sb.append(", customsResult=");
		sb.append(customsResult);
		sb.append(", productCheck=");
		sb.append(productCheck);
		sb.append(", releaseDate=");
		sb.append(releaseDate);
		sb.append(", hosothutucId=");
		sb.append(hosothutucId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CustomsDeclaration toEntityModel() {
		CustomsDeclarationImpl customsDeclarationImpl = new CustomsDeclarationImpl();

		customsDeclarationImpl.setId(id);

		if (importCustomDeclareNo == null) {
			customsDeclarationImpl.setImportCustomDeclareNo(StringPool.BLANK);
		}
		else {
			customsDeclarationImpl.setImportCustomDeclareNo(importCustomDeclareNo);
		}

		if (importCustomDeclareDate == Long.MIN_VALUE) {
			customsDeclarationImpl.setImportCustomDeclareDate(null);
		}
		else {
			customsDeclarationImpl.setImportCustomDeclareDate(new Date(
					importCustomDeclareDate));
		}

		if (customsResult == null) {
			customsDeclarationImpl.setCustomsResult(StringPool.BLANK);
		}
		else {
			customsDeclarationImpl.setCustomsResult(customsResult);
		}

		if (productCheck == null) {
			customsDeclarationImpl.setProductCheck(StringPool.BLANK);
		}
		else {
			customsDeclarationImpl.setProductCheck(productCheck);
		}

		if (releaseDate == Long.MIN_VALUE) {
			customsDeclarationImpl.setReleaseDate(null);
		}
		else {
			customsDeclarationImpl.setReleaseDate(new Date(releaseDate));
		}

		customsDeclarationImpl.setHosothutucId(hosothutucId);

		customsDeclarationImpl.resetOriginalValues();

		return customsDeclarationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		importCustomDeclareNo = objectInput.readUTF();
		importCustomDeclareDate = objectInput.readLong();
		customsResult = objectInput.readUTF();
		productCheck = objectInput.readUTF();
		releaseDate = objectInput.readLong();
		hosothutucId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (importCustomDeclareNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importCustomDeclareNo);
		}

		objectOutput.writeLong(importCustomDeclareDate);

		if (customsResult == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customsResult);
		}

		if (productCheck == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productCheck);
		}

		objectOutput.writeLong(releaseDate);
		objectOutput.writeLong(hosothutucId);
	}

	public long id;
	public String importCustomDeclareNo;
	public long importCustomDeclareDate;
	public String customsResult;
	public String productCheck;
	public long releaseDate;
	public long hosothutucId;
}