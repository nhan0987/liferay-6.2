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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssessmentSpecification in entity cache.
 *
 * @author win_64
 * @see AssessmentSpecification
 * @generated
 */
public class AssessmentSpecificationCacheModel implements CacheModel<AssessmentSpecification>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{id=");
		sb.append(id);
		sb.append(", assessmenttype=");
		sb.append(assessmenttype);
		sb.append(", importercode=");
		sb.append(importercode);
		sb.append(", inspectorcontactcode=");
		sb.append(inspectorcontactcode);
		sb.append(", productioncode=");
		sb.append(productioncode);
		sb.append(", specificationcategory=");
		sb.append(specificationcategory);
		sb.append(", specificationgroupcode=");
		sb.append(specificationgroupcode);
		sb.append(", specificationsequence=");
		sb.append(specificationsequence);
		sb.append(", specificationcode=");
		sb.append(specificationcode);
		sb.append(", specificationname=");
		sb.append(specificationname);
		sb.append(", specificationvalue=");
		sb.append(specificationvalue);
		sb.append(", specificationdescription=");
		sb.append(specificationdescription);
		sb.append(", assessmentcoefficient=");
		sb.append(assessmentcoefficient);
		sb.append(", assessmentindex=");
		sb.append(assessmentindex);
		sb.append(", assessmentmark=");
		sb.append(assessmentmark);
		sb.append(", assessmentid=");
		sb.append(assessmentid);
		sb.append(", assessmentyear=");
		sb.append(assessmentyear);
		sb.append(", evaluationperiod=");
		sb.append(evaluationperiod);
		sb.append(", latestassessment=");
		sb.append(latestassessment);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssessmentSpecification toEntityModel() {
		AssessmentSpecificationImpl assessmentSpecificationImpl = new AssessmentSpecificationImpl();

		assessmentSpecificationImpl.setId(id);

		if (assessmenttype == null) {
			assessmentSpecificationImpl.setAssessmenttype(StringPool.BLANK);
		}
		else {
			assessmentSpecificationImpl.setAssessmenttype(assessmenttype);
		}

		if (importercode == null) {
			assessmentSpecificationImpl.setImportercode(StringPool.BLANK);
		}
		else {
			assessmentSpecificationImpl.setImportercode(importercode);
		}

		if (inspectorcontactcode == null) {
			assessmentSpecificationImpl.setInspectorcontactcode(StringPool.BLANK);
		}
		else {
			assessmentSpecificationImpl.setInspectorcontactcode(inspectorcontactcode);
		}

		if (productioncode == null) {
			assessmentSpecificationImpl.setProductioncode(StringPool.BLANK);
		}
		else {
			assessmentSpecificationImpl.setProductioncode(productioncode);
		}

		if (specificationcategory == null) {
			assessmentSpecificationImpl.setSpecificationcategory(StringPool.BLANK);
		}
		else {
			assessmentSpecificationImpl.setSpecificationcategory(specificationcategory);
		}

		if (specificationgroupcode == null) {
			assessmentSpecificationImpl.setSpecificationgroupcode(StringPool.BLANK);
		}
		else {
			assessmentSpecificationImpl.setSpecificationgroupcode(specificationgroupcode);
		}

		assessmentSpecificationImpl.setSpecificationsequence(specificationsequence);

		if (specificationcode == null) {
			assessmentSpecificationImpl.setSpecificationcode(StringPool.BLANK);
		}
		else {
			assessmentSpecificationImpl.setSpecificationcode(specificationcode);
		}

		if (specificationname == null) {
			assessmentSpecificationImpl.setSpecificationname(StringPool.BLANK);
		}
		else {
			assessmentSpecificationImpl.setSpecificationname(specificationname);
		}

		if (specificationvalue == null) {
			assessmentSpecificationImpl.setSpecificationvalue(StringPool.BLANK);
		}
		else {
			assessmentSpecificationImpl.setSpecificationvalue(specificationvalue);
		}

		if (specificationdescription == null) {
			assessmentSpecificationImpl.setSpecificationdescription(StringPool.BLANK);
		}
		else {
			assessmentSpecificationImpl.setSpecificationdescription(specificationdescription);
		}

		assessmentSpecificationImpl.setAssessmentcoefficient(assessmentcoefficient);
		assessmentSpecificationImpl.setAssessmentindex(assessmentindex);
		assessmentSpecificationImpl.setAssessmentmark(assessmentmark);

		if (assessmentid == null) {
			assessmentSpecificationImpl.setAssessmentid(StringPool.BLANK);
		}
		else {
			assessmentSpecificationImpl.setAssessmentid(assessmentid);
		}

		if (assessmentyear == null) {
			assessmentSpecificationImpl.setAssessmentyear(StringPool.BLANK);
		}
		else {
			assessmentSpecificationImpl.setAssessmentyear(assessmentyear);
		}

		if (evaluationperiod == null) {
			assessmentSpecificationImpl.setEvaluationperiod(StringPool.BLANK);
		}
		else {
			assessmentSpecificationImpl.setEvaluationperiod(evaluationperiod);
		}

		if (latestassessment == Long.MIN_VALUE) {
			assessmentSpecificationImpl.setLatestassessment(null);
		}
		else {
			assessmentSpecificationImpl.setLatestassessment(new Date(
					latestassessment));
		}

		if (synchdate == Long.MIN_VALUE) {
			assessmentSpecificationImpl.setSynchdate(null);
		}
		else {
			assessmentSpecificationImpl.setSynchdate(new Date(synchdate));
		}

		assessmentSpecificationImpl.resetOriginalValues();

		return assessmentSpecificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		assessmenttype = objectInput.readUTF();
		importercode = objectInput.readUTF();
		inspectorcontactcode = objectInput.readUTF();
		productioncode = objectInput.readUTF();
		specificationcategory = objectInput.readUTF();
		specificationgroupcode = objectInput.readUTF();
		specificationsequence = objectInput.readInt();
		specificationcode = objectInput.readUTF();
		specificationname = objectInput.readUTF();
		specificationvalue = objectInput.readUTF();
		specificationdescription = objectInput.readUTF();
		assessmentcoefficient = objectInput.readDouble();
		assessmentindex = objectInput.readDouble();
		assessmentmark = objectInput.readDouble();
		assessmentid = objectInput.readUTF();
		assessmentyear = objectInput.readUTF();
		evaluationperiod = objectInput.readUTF();
		latestassessment = objectInput.readLong();
		synchdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (assessmenttype == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(assessmenttype);
		}

		if (importercode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(importercode);
		}

		if (inspectorcontactcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inspectorcontactcode);
		}

		if (productioncode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productioncode);
		}

		if (specificationcategory == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationcategory);
		}

		if (specificationgroupcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationgroupcode);
		}

		objectOutput.writeInt(specificationsequence);

		if (specificationcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationcode);
		}

		if (specificationname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationname);
		}

		if (specificationvalue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationvalue);
		}

		if (specificationdescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationdescription);
		}

		objectOutput.writeDouble(assessmentcoefficient);
		objectOutput.writeDouble(assessmentindex);
		objectOutput.writeDouble(assessmentmark);

		if (assessmentid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(assessmentid);
		}

		if (assessmentyear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(assessmentyear);
		}

		if (evaluationperiod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(evaluationperiod);
		}

		objectOutput.writeLong(latestassessment);
		objectOutput.writeLong(synchdate);
	}

	public long id;
	public String assessmenttype;
	public String importercode;
	public String inspectorcontactcode;
	public String productioncode;
	public String specificationcategory;
	public String specificationgroupcode;
	public int specificationsequence;
	public String specificationcode;
	public String specificationname;
	public String specificationvalue;
	public String specificationdescription;
	public double assessmentcoefficient;
	public double assessmentindex;
	public double assessmentmark;
	public String assessmentid;
	public String assessmentyear;
	public String evaluationperiod;
	public long latestassessment;
	public long synchdate;
}