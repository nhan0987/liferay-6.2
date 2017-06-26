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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentPeriod;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssessmentPeriod in entity cache.
 *
 * @author win_64
 * @see AssessmentPeriod
 * @generated
 */
public class AssessmentPeriodCacheModel implements CacheModel<AssessmentPeriod>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", assessmentid=");
		sb.append(assessmentid);
		sb.append(", assessmentyear=");
		sb.append(assessmentyear);
		sb.append(", evaluationperiod=");
		sb.append(evaluationperiod);
		sb.append(", importerchecked=");
		sb.append(importerchecked);
		sb.append(", inspectorchecked=");
		sb.append(inspectorchecked);
		sb.append(", productionchecked=");
		sb.append(productionchecked);
		sb.append(", synchdate=");
		sb.append(synchdate);
		sb.append(", previousassessmentid=");
		sb.append(previousassessmentid);
		sb.append(", previousassessmentyear=");
		sb.append(previousassessmentyear);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssessmentPeriod toEntityModel() {
		AssessmentPeriodImpl assessmentPeriodImpl = new AssessmentPeriodImpl();

		assessmentPeriodImpl.setId(id);

		if (assessmentid == null) {
			assessmentPeriodImpl.setAssessmentid(StringPool.BLANK);
		}
		else {
			assessmentPeriodImpl.setAssessmentid(assessmentid);
		}

		if (assessmentyear == null) {
			assessmentPeriodImpl.setAssessmentyear(StringPool.BLANK);
		}
		else {
			assessmentPeriodImpl.setAssessmentyear(assessmentyear);
		}

		if (evaluationperiod == null) {
			assessmentPeriodImpl.setEvaluationperiod(StringPool.BLANK);
		}
		else {
			assessmentPeriodImpl.setEvaluationperiod(evaluationperiod);
		}

		assessmentPeriodImpl.setImporterchecked(importerchecked);
		assessmentPeriodImpl.setInspectorchecked(inspectorchecked);
		assessmentPeriodImpl.setProductionchecked(productionchecked);

		if (synchdate == Long.MIN_VALUE) {
			assessmentPeriodImpl.setSynchdate(null);
		}
		else {
			assessmentPeriodImpl.setSynchdate(new Date(synchdate));
		}

		if (previousassessmentid == null) {
			assessmentPeriodImpl.setPreviousassessmentid(StringPool.BLANK);
		}
		else {
			assessmentPeriodImpl.setPreviousassessmentid(previousassessmentid);
		}

		if (previousassessmentyear == null) {
			assessmentPeriodImpl.setPreviousassessmentyear(StringPool.BLANK);
		}
		else {
			assessmentPeriodImpl.setPreviousassessmentyear(previousassessmentyear);
		}

		assessmentPeriodImpl.resetOriginalValues();

		return assessmentPeriodImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		assessmentid = objectInput.readUTF();
		assessmentyear = objectInput.readUTF();
		evaluationperiod = objectInput.readUTF();
		importerchecked = objectInput.readInt();
		inspectorchecked = objectInput.readInt();
		productionchecked = objectInput.readInt();
		synchdate = objectInput.readLong();
		previousassessmentid = objectInput.readUTF();
		previousassessmentyear = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

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

		objectOutput.writeInt(importerchecked);
		objectOutput.writeInt(inspectorchecked);
		objectOutput.writeInt(productionchecked);
		objectOutput.writeLong(synchdate);

		if (previousassessmentid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(previousassessmentid);
		}

		if (previousassessmentyear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(previousassessmentyear);
		}
	}

	public long id;
	public String assessmentid;
	public String assessmentyear;
	public String evaluationperiod;
	public int importerchecked;
	public int inspectorchecked;
	public int productionchecked;
	public long synchdate;
	public String previousassessmentid;
	public String previousassessmentyear;
}