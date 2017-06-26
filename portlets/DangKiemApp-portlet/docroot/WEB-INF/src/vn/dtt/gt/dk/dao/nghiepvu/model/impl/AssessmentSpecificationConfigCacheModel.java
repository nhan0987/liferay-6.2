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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssessmentSpecificationConfig in entity cache.
 *
 * @author win_64
 * @see AssessmentSpecificationConfig
 * @generated
 */
public class AssessmentSpecificationConfigCacheModel implements CacheModel<AssessmentSpecificationConfig>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(id);
		sb.append(", assessmenttype=");
		sb.append(assessmenttype);
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
		sb.append(", specificationdescription=");
		sb.append(specificationdescription);
		sb.append(", assessmentcoefficient=");
		sb.append(assessmentcoefficient);
		sb.append(", assessmentindexmin=");
		sb.append(assessmentindexmin);
		sb.append(", assessmentmarkmin=");
		sb.append(assessmentmarkmin);
		sb.append(", assessmentindexmax=");
		sb.append(assessmentindexmax);
		sb.append(", assessmentmarkmax=");
		sb.append(assessmentmarkmax);
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
	public AssessmentSpecificationConfig toEntityModel() {
		AssessmentSpecificationConfigImpl assessmentSpecificationConfigImpl = new AssessmentSpecificationConfigImpl();

		assessmentSpecificationConfigImpl.setId(id);

		if (assessmenttype == null) {
			assessmentSpecificationConfigImpl.setAssessmenttype(StringPool.BLANK);
		}
		else {
			assessmentSpecificationConfigImpl.setAssessmenttype(assessmenttype);
		}

		if (specificationcategory == null) {
			assessmentSpecificationConfigImpl.setSpecificationcategory(StringPool.BLANK);
		}
		else {
			assessmentSpecificationConfigImpl.setSpecificationcategory(specificationcategory);
		}

		if (specificationgroupcode == null) {
			assessmentSpecificationConfigImpl.setSpecificationgroupcode(StringPool.BLANK);
		}
		else {
			assessmentSpecificationConfigImpl.setSpecificationgroupcode(specificationgroupcode);
		}

		assessmentSpecificationConfigImpl.setSpecificationsequence(specificationsequence);

		if (specificationcode == null) {
			assessmentSpecificationConfigImpl.setSpecificationcode(StringPool.BLANK);
		}
		else {
			assessmentSpecificationConfigImpl.setSpecificationcode(specificationcode);
		}

		if (specificationname == null) {
			assessmentSpecificationConfigImpl.setSpecificationname(StringPool.BLANK);
		}
		else {
			assessmentSpecificationConfigImpl.setSpecificationname(specificationname);
		}

		if (specificationdescription == null) {
			assessmentSpecificationConfigImpl.setSpecificationdescription(StringPool.BLANK);
		}
		else {
			assessmentSpecificationConfigImpl.setSpecificationdescription(specificationdescription);
		}

		assessmentSpecificationConfigImpl.setAssessmentcoefficient(assessmentcoefficient);
		assessmentSpecificationConfigImpl.setAssessmentindexmin(assessmentindexmin);
		assessmentSpecificationConfigImpl.setAssessmentmarkmin(assessmentmarkmin);
		assessmentSpecificationConfigImpl.setAssessmentindexmax(assessmentindexmax);
		assessmentSpecificationConfigImpl.setAssessmentmarkmax(assessmentmarkmax);

		if (assessmentid == null) {
			assessmentSpecificationConfigImpl.setAssessmentid(StringPool.BLANK);
		}
		else {
			assessmentSpecificationConfigImpl.setAssessmentid(assessmentid);
		}

		if (assessmentyear == null) {
			assessmentSpecificationConfigImpl.setAssessmentyear(StringPool.BLANK);
		}
		else {
			assessmentSpecificationConfigImpl.setAssessmentyear(assessmentyear);
		}

		if (evaluationperiod == null) {
			assessmentSpecificationConfigImpl.setEvaluationperiod(StringPool.BLANK);
		}
		else {
			assessmentSpecificationConfigImpl.setEvaluationperiod(evaluationperiod);
		}

		if (latestassessment == Long.MIN_VALUE) {
			assessmentSpecificationConfigImpl.setLatestassessment(null);
		}
		else {
			assessmentSpecificationConfigImpl.setLatestassessment(new Date(
					latestassessment));
		}

		if (synchdate == Long.MIN_VALUE) {
			assessmentSpecificationConfigImpl.setSynchdate(null);
		}
		else {
			assessmentSpecificationConfigImpl.setSynchdate(new Date(synchdate));
		}

		assessmentSpecificationConfigImpl.resetOriginalValues();

		return assessmentSpecificationConfigImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		assessmenttype = objectInput.readUTF();
		specificationcategory = objectInput.readUTF();
		specificationgroupcode = objectInput.readUTF();
		specificationsequence = objectInput.readInt();
		specificationcode = objectInput.readUTF();
		specificationname = objectInput.readUTF();
		specificationdescription = objectInput.readUTF();
		assessmentcoefficient = objectInput.readDouble();
		assessmentindexmin = objectInput.readDouble();
		assessmentmarkmin = objectInput.readDouble();
		assessmentindexmax = objectInput.readDouble();
		assessmentmarkmax = objectInput.readDouble();
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

		if (specificationdescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specificationdescription);
		}

		objectOutput.writeDouble(assessmentcoefficient);
		objectOutput.writeDouble(assessmentindexmin);
		objectOutput.writeDouble(assessmentmarkmin);
		objectOutput.writeDouble(assessmentindexmax);
		objectOutput.writeDouble(assessmentmarkmax);

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
	public String specificationcategory;
	public String specificationgroupcode;
	public int specificationsequence;
	public String specificationcode;
	public String specificationname;
	public String specificationdescription;
	public double assessmentcoefficient;
	public double assessmentindexmin;
	public double assessmentmarkmin;
	public double assessmentindexmax;
	public double assessmentmarkmax;
	public String assessmentid;
	public String assessmentyear;
	public String evaluationperiod;
	public long latestassessment;
	public long synchdate;
}