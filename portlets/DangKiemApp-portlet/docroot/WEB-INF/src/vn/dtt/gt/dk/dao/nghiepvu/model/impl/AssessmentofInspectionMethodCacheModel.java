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

import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentofInspectionMethod;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssessmentofInspectionMethod in entity cache.
 *
 * @author win_64
 * @see AssessmentofInspectionMethod
 * @generated
 */
public class AssessmentofInspectionMethodCacheModel implements CacheModel<AssessmentofInspectionMethod>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

		sb.append("{id=");
		sb.append(id);
		sb.append(", methodcode=");
		sb.append(methodcode);
		sb.append(", methodname=");
		sb.append(methodname);
		sb.append(", methodsequenceno=");
		sb.append(methodsequenceno);
		sb.append(", methoddescription=");
		sb.append(methoddescription);
		sb.append(", methodcodereference=");
		sb.append(methodcodereference);
		sb.append(", methodnamereference=");
		sb.append(methodnamereference);
		sb.append(", ImporterRiskDescription=");
		sb.append(ImporterRiskDescription);
		sb.append(", A1MarkFloor=");
		sb.append(A1MarkFloor);
		sb.append(", A1MarkCeil=");
		sb.append(A1MarkCeil);
		sb.append(", ProductRiskDescription=");
		sb.append(ProductRiskDescription);
		sb.append(", A301MarkFloor=");
		sb.append(A301MarkFloor);
		sb.append(", A301MarkCeil=");
		sb.append(A301MarkCeil);
		sb.append(", PurposeRiskDescription=");
		sb.append(PurposeRiskDescription);
		sb.append(", A302Mark=");
		sb.append(A302Mark);
		sb.append(", CertifiedRiskDescription=");
		sb.append(CertifiedRiskDescription);
		sb.append(", A304Mark=");
		sb.append(A304Mark);
		sb.append(", UsageRiskDescription=");
		sb.append(UsageRiskDescription);
		sb.append(", A303Mark=");
		sb.append(A303Mark);
		sb.append(", TransportRiskDescription=");
		sb.append(TransportRiskDescription);
		sb.append(", A305Mark=");
		sb.append(A305Mark);
		sb.append(", maker=");
		sb.append(maker);
		sb.append(", checker=");
		sb.append(checker);
		sb.append(", approver=");
		sb.append(approver);
		sb.append(", makermodified=");
		sb.append(makermodified);
		sb.append(", checkermodified=");
		sb.append(checkermodified);
		sb.append(", approvermodified=");
		sb.append(approvermodified);
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
		sb.append(", nextassessmentid=");
		sb.append(nextassessmentid);
		sb.append(", nextassessmentyear=");
		sb.append(nextassessmentyear);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssessmentofInspectionMethod toEntityModel() {
		AssessmentofInspectionMethodImpl assessmentofInspectionMethodImpl = new AssessmentofInspectionMethodImpl();

		assessmentofInspectionMethodImpl.setId(id);

		if (methodcode == null) {
			assessmentofInspectionMethodImpl.setMethodcode(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setMethodcode(methodcode);
		}

		if (methodname == null) {
			assessmentofInspectionMethodImpl.setMethodname(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setMethodname(methodname);
		}

		assessmentofInspectionMethodImpl.setMethodsequenceno(methodsequenceno);

		if (methoddescription == null) {
			assessmentofInspectionMethodImpl.setMethoddescription(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setMethoddescription(methoddescription);
		}

		if (methodcodereference == null) {
			assessmentofInspectionMethodImpl.setMethodcodereference(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setMethodcodereference(methodcodereference);
		}

		if (methodnamereference == null) {
			assessmentofInspectionMethodImpl.setMethodnamereference(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setMethodnamereference(methodnamereference);
		}

		if (ImporterRiskDescription == null) {
			assessmentofInspectionMethodImpl.setImporterRiskDescription(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setImporterRiskDescription(ImporterRiskDescription);
		}

		assessmentofInspectionMethodImpl.setA1MarkFloor(A1MarkFloor);
		assessmentofInspectionMethodImpl.setA1MarkCeil(A1MarkCeil);

		if (ProductRiskDescription == null) {
			assessmentofInspectionMethodImpl.setProductRiskDescription(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setProductRiskDescription(ProductRiskDescription);
		}

		assessmentofInspectionMethodImpl.setA301MarkFloor(A301MarkFloor);
		assessmentofInspectionMethodImpl.setA301MarkCeil(A301MarkCeil);

		if (PurposeRiskDescription == null) {
			assessmentofInspectionMethodImpl.setPurposeRiskDescription(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setPurposeRiskDescription(PurposeRiskDescription);
		}

		assessmentofInspectionMethodImpl.setA302Mark(A302Mark);

		if (CertifiedRiskDescription == null) {
			assessmentofInspectionMethodImpl.setCertifiedRiskDescription(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setCertifiedRiskDescription(CertifiedRiskDescription);
		}

		assessmentofInspectionMethodImpl.setA304Mark(A304Mark);

		if (UsageRiskDescription == null) {
			assessmentofInspectionMethodImpl.setUsageRiskDescription(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setUsageRiskDescription(UsageRiskDescription);
		}

		assessmentofInspectionMethodImpl.setA303Mark(A303Mark);

		if (TransportRiskDescription == null) {
			assessmentofInspectionMethodImpl.setTransportRiskDescription(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setTransportRiskDescription(TransportRiskDescription);
		}

		assessmentofInspectionMethodImpl.setA305Mark(A305Mark);

		if (maker == null) {
			assessmentofInspectionMethodImpl.setMaker(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setMaker(maker);
		}

		if (checker == null) {
			assessmentofInspectionMethodImpl.setChecker(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setChecker(checker);
		}

		if (approver == null) {
			assessmentofInspectionMethodImpl.setApprover(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setApprover(approver);
		}

		if (makermodified == Long.MIN_VALUE) {
			assessmentofInspectionMethodImpl.setMakermodified(null);
		}
		else {
			assessmentofInspectionMethodImpl.setMakermodified(new Date(
					makermodified));
		}

		if (checkermodified == Long.MIN_VALUE) {
			assessmentofInspectionMethodImpl.setCheckermodified(null);
		}
		else {
			assessmentofInspectionMethodImpl.setCheckermodified(new Date(
					checkermodified));
		}

		if (approvermodified == Long.MIN_VALUE) {
			assessmentofInspectionMethodImpl.setApprovermodified(null);
		}
		else {
			assessmentofInspectionMethodImpl.setApprovermodified(new Date(
					approvermodified));
		}

		if (assessmentid == null) {
			assessmentofInspectionMethodImpl.setAssessmentid(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setAssessmentid(assessmentid);
		}

		if (assessmentyear == null) {
			assessmentofInspectionMethodImpl.setAssessmentyear(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setAssessmentyear(assessmentyear);
		}

		if (evaluationperiod == null) {
			assessmentofInspectionMethodImpl.setEvaluationperiod(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setEvaluationperiod(evaluationperiod);
		}

		if (latestassessment == Long.MIN_VALUE) {
			assessmentofInspectionMethodImpl.setLatestassessment(null);
		}
		else {
			assessmentofInspectionMethodImpl.setLatestassessment(new Date(
					latestassessment));
		}

		if (synchdate == Long.MIN_VALUE) {
			assessmentofInspectionMethodImpl.setSynchdate(null);
		}
		else {
			assessmentofInspectionMethodImpl.setSynchdate(new Date(synchdate));
		}

		if (nextassessmentid == null) {
			assessmentofInspectionMethodImpl.setNextassessmentid(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setNextassessmentid(nextassessmentid);
		}

		if (nextassessmentyear == null) {
			assessmentofInspectionMethodImpl.setNextassessmentyear(StringPool.BLANK);
		}
		else {
			assessmentofInspectionMethodImpl.setNextassessmentyear(nextassessmentyear);
		}

		assessmentofInspectionMethodImpl.resetOriginalValues();

		return assessmentofInspectionMethodImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		methodcode = objectInput.readUTF();
		methodname = objectInput.readUTF();
		methodsequenceno = objectInput.readInt();
		methoddescription = objectInput.readUTF();
		methodcodereference = objectInput.readUTF();
		methodnamereference = objectInput.readUTF();
		ImporterRiskDescription = objectInput.readUTF();
		A1MarkFloor = objectInput.readDouble();
		A1MarkCeil = objectInput.readDouble();
		ProductRiskDescription = objectInput.readUTF();
		A301MarkFloor = objectInput.readDouble();
		A301MarkCeil = objectInput.readDouble();
		PurposeRiskDescription = objectInput.readUTF();
		A302Mark = objectInput.readDouble();
		CertifiedRiskDescription = objectInput.readUTF();
		A304Mark = objectInput.readDouble();
		UsageRiskDescription = objectInput.readUTF();
		A303Mark = objectInput.readDouble();
		TransportRiskDescription = objectInput.readUTF();
		A305Mark = objectInput.readDouble();
		maker = objectInput.readUTF();
		checker = objectInput.readUTF();
		approver = objectInput.readUTF();
		makermodified = objectInput.readLong();
		checkermodified = objectInput.readLong();
		approvermodified = objectInput.readLong();
		assessmentid = objectInput.readUTF();
		assessmentyear = objectInput.readUTF();
		evaluationperiod = objectInput.readUTF();
		latestassessment = objectInput.readLong();
		synchdate = objectInput.readLong();
		nextassessmentid = objectInput.readUTF();
		nextassessmentyear = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (methodcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(methodcode);
		}

		if (methodname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(methodname);
		}

		objectOutput.writeInt(methodsequenceno);

		if (methoddescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(methoddescription);
		}

		if (methodcodereference == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(methodcodereference);
		}

		if (methodnamereference == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(methodnamereference);
		}

		if (ImporterRiskDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ImporterRiskDescription);
		}

		objectOutput.writeDouble(A1MarkFloor);
		objectOutput.writeDouble(A1MarkCeil);

		if (ProductRiskDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ProductRiskDescription);
		}

		objectOutput.writeDouble(A301MarkFloor);
		objectOutput.writeDouble(A301MarkCeil);

		if (PurposeRiskDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PurposeRiskDescription);
		}

		objectOutput.writeDouble(A302Mark);

		if (CertifiedRiskDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CertifiedRiskDescription);
		}

		objectOutput.writeDouble(A304Mark);

		if (UsageRiskDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(UsageRiskDescription);
		}

		objectOutput.writeDouble(A303Mark);

		if (TransportRiskDescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TransportRiskDescription);
		}

		objectOutput.writeDouble(A305Mark);

		if (maker == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maker);
		}

		if (checker == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(checker);
		}

		if (approver == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approver);
		}

		objectOutput.writeLong(makermodified);
		objectOutput.writeLong(checkermodified);
		objectOutput.writeLong(approvermodified);

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

		if (nextassessmentid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nextassessmentid);
		}

		if (nextassessmentyear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nextassessmentyear);
		}
	}

	public long id;
	public String methodcode;
	public String methodname;
	public int methodsequenceno;
	public String methoddescription;
	public String methodcodereference;
	public String methodnamereference;
	public String ImporterRiskDescription;
	public double A1MarkFloor;
	public double A1MarkCeil;
	public String ProductRiskDescription;
	public double A301MarkFloor;
	public double A301MarkCeil;
	public String PurposeRiskDescription;
	public double A302Mark;
	public String CertifiedRiskDescription;
	public double A304Mark;
	public String UsageRiskDescription;
	public double A303Mark;
	public String TransportRiskDescription;
	public double A305Mark;
	public String maker;
	public String checker;
	public String approver;
	public long makermodified;
	public long checkermodified;
	public long approvermodified;
	public String assessmentid;
	public String assessmentyear;
	public String evaluationperiod;
	public long latestassessment;
	public long synchdate;
	public String nextassessmentid;
	public String nextassessmentyear;
}