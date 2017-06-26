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

import vn.dtt.gt.dk.dao.nghiepvu.model.SatetyTestReportSpec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing SatetyTestReportSpec in entity cache.
 *
 * @author win_64
 * @see SatetyTestReportSpec
 * @generated
 */
public class SatetyTestReportSpecCacheModel implements CacheModel<SatetyTestReportSpec>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", saftyTestReportId=");
		sb.append(saftyTestReportId);
		sb.append(", specificationCode=");
		sb.append(specificationCode);
		sb.append(", specificationName=");
		sb.append(specificationName);
		sb.append(", specificationValue=");
		sb.append(specificationValue);
		sb.append(", evaluationResult=");
		sb.append(evaluationResult);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SatetyTestReportSpec toEntityModel() {
		SatetyTestReportSpecImpl satetyTestReportSpecImpl = new SatetyTestReportSpecImpl();

		satetyTestReportSpecImpl.setId(id);
		satetyTestReportSpecImpl.setSaftyTestReportId(saftyTestReportId);

		if (specificationCode == null) {
			satetyTestReportSpecImpl.setSpecificationCode(StringPool.BLANK);
		}
		else {
			satetyTestReportSpecImpl.setSpecificationCode(specificationCode);
		}

		if (specificationName == null) {
			satetyTestReportSpecImpl.setSpecificationName(StringPool.BLANK);
		}
		else {
			satetyTestReportSpecImpl.setSpecificationName(specificationName);
		}

		if (specificationValue == null) {
			satetyTestReportSpecImpl.setSpecificationValue(StringPool.BLANK);
		}
		else {
			satetyTestReportSpecImpl.setSpecificationValue(specificationValue);
		}

		satetyTestReportSpecImpl.setEvaluationResult(evaluationResult);

		satetyTestReportSpecImpl.resetOriginalValues();

		return satetyTestReportSpecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		saftyTestReportId = objectInput.readLong();
		specificationCode = objectInput.readUTF();
		specificationName = objectInput.readUTF();
		specificationValue = objectInput.readUTF();
		evaluationResult = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(saftyTestReportId);

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

		objectOutput.writeLong(evaluationResult);
	}

	public long id;
	public long saftyTestReportId;
	public String specificationCode;
	public String specificationName;
	public String specificationValue;
	public long evaluationResult;
}