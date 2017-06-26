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

import vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing IssueCategory in entity cache.
 *
 * @author win_64
 * @see IssueCategory
 * @generated
 */
public class IssueCategoryCacheModel implements CacheModel<IssueCategory>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", issuetrackingid=");
		sb.append(issuetrackingid);
		sb.append(", defectcategorycode=");
		sb.append(defectcategorycode);
		sb.append(", defectcategoryshortname=");
		sb.append(defectcategoryshortname);
		sb.append(", defectcategoryfullname=");
		sb.append(defectcategoryfullname);
		sb.append(", defectdetection=");
		sb.append(defectdetection);
		sb.append(", defectdatagroupid=");
		sb.append(defectdatagroupid);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public IssueCategory toEntityModel() {
		IssueCategoryImpl issueCategoryImpl = new IssueCategoryImpl();

		issueCategoryImpl.setId(id);
		issueCategoryImpl.setIssuetrackingid(issuetrackingid);

		if (defectcategorycode == null) {
			issueCategoryImpl.setDefectcategorycode(StringPool.BLANK);
		}
		else {
			issueCategoryImpl.setDefectcategorycode(defectcategorycode);
		}

		if (defectcategoryshortname == null) {
			issueCategoryImpl.setDefectcategoryshortname(StringPool.BLANK);
		}
		else {
			issueCategoryImpl.setDefectcategoryshortname(defectcategoryshortname);
		}

		if (defectcategoryfullname == null) {
			issueCategoryImpl.setDefectcategoryfullname(StringPool.BLANK);
		}
		else {
			issueCategoryImpl.setDefectcategoryfullname(defectcategoryfullname);
		}

		issueCategoryImpl.setDefectdetection(defectdetection);
		issueCategoryImpl.setDefectdatagroupid(defectdatagroupid);

		issueCategoryImpl.resetOriginalValues();

		return issueCategoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		issuetrackingid = objectInput.readInt();
		defectcategorycode = objectInput.readUTF();
		defectcategoryshortname = objectInput.readUTF();
		defectcategoryfullname = objectInput.readUTF();
		defectdetection = objectInput.readInt();
		defectdatagroupid = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeInt(issuetrackingid);

		if (defectcategorycode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(defectcategorycode);
		}

		if (defectcategoryshortname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(defectcategoryshortname);
		}

		if (defectcategoryfullname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(defectcategoryfullname);
		}

		objectOutput.writeInt(defectdetection);
		objectOutput.writeInt(defectdatagroupid);
	}

	public long id;
	public int issuetrackingid;
	public String defectcategorycode;
	public String defectcategoryshortname;
	public String defectcategoryfullname;
	public int defectdetection;
	public int defectdatagroupid;
}