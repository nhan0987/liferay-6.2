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

import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNote;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DebitNote in entity cache.
 *
 * @author win_64
 * @see DebitNote
 * @generated
 */
public class DebitNoteCacheModel implements CacheModel<DebitNote>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(id);
		sb.append(", debitNoteNumber=");
		sb.append(debitNoteNumber);
		sb.append(", transactionId=");
		sb.append(transactionId);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", financialAccountant=");
		sb.append(financialAccountant);
		sb.append(", organization=");
		sb.append(organization);
		sb.append(", division=");
		sb.append(division);
		sb.append(", reportBy=");
		sb.append(reportBy);
		sb.append(", reportDate=");
		sb.append(reportDate);
		sb.append(", fromDate=");
		sb.append(fromDate);
		sb.append(", toDate=");
		sb.append(toDate);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", totalPayment=");
		sb.append(totalPayment);
		sb.append(", paymentType=");
		sb.append(paymentType);
		sb.append(", markAsDeleted=");
		sb.append(markAsDeleted);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DebitNote toEntityModel() {
		DebitNoteImpl debitNoteImpl = new DebitNoteImpl();

		debitNoteImpl.setId(id);

		if (debitNoteNumber == null) {
			debitNoteImpl.setDebitNoteNumber(StringPool.BLANK);
		}
		else {
			debitNoteImpl.setDebitNoteNumber(debitNoteNumber);
		}

		if (transactionId == null) {
			debitNoteImpl.setTransactionId(StringPool.BLANK);
		}
		else {
			debitNoteImpl.setTransactionId(transactionId);
		}

		if (corporationId == null) {
			debitNoteImpl.setCorporationId(StringPool.BLANK);
		}
		else {
			debitNoteImpl.setCorporationId(corporationId);
		}

		if (financialAccountant == null) {
			debitNoteImpl.setFinancialAccountant(StringPool.BLANK);
		}
		else {
			debitNoteImpl.setFinancialAccountant(financialAccountant);
		}

		if (organization == null) {
			debitNoteImpl.setOrganization(StringPool.BLANK);
		}
		else {
			debitNoteImpl.setOrganization(organization);
		}

		if (division == null) {
			debitNoteImpl.setDivision(StringPool.BLANK);
		}
		else {
			debitNoteImpl.setDivision(division);
		}

		if (reportBy == null) {
			debitNoteImpl.setReportBy(StringPool.BLANK);
		}
		else {
			debitNoteImpl.setReportBy(reportBy);
		}

		if (reportDate == Long.MIN_VALUE) {
			debitNoteImpl.setReportDate(null);
		}
		else {
			debitNoteImpl.setReportDate(new Date(reportDate));
		}

		if (fromDate == Long.MIN_VALUE) {
			debitNoteImpl.setFromDate(null);
		}
		else {
			debitNoteImpl.setFromDate(new Date(fromDate));
		}

		if (toDate == Long.MIN_VALUE) {
			debitNoteImpl.setToDate(null);
		}
		else {
			debitNoteImpl.setToDate(new Date(toDate));
		}

		debitNoteImpl.setAttachedFile(attachedFile);
		debitNoteImpl.setTotalPayment(totalPayment);
		debitNoteImpl.setPaymentType(paymentType);
		debitNoteImpl.setMarkAsDeleted(markAsDeleted);

		debitNoteImpl.resetOriginalValues();

		return debitNoteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		debitNoteNumber = objectInput.readUTF();
		transactionId = objectInput.readUTF();
		corporationId = objectInput.readUTF();
		financialAccountant = objectInput.readUTF();
		organization = objectInput.readUTF();
		division = objectInput.readUTF();
		reportBy = objectInput.readUTF();
		reportDate = objectInput.readLong();
		fromDate = objectInput.readLong();
		toDate = objectInput.readLong();
		attachedFile = objectInput.readLong();
		totalPayment = objectInput.readDouble();
		paymentType = objectInput.readLong();
		markAsDeleted = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (debitNoteNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(debitNoteNumber);
		}

		if (transactionId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(transactionId);
		}

		if (corporationId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(corporationId);
		}

		if (financialAccountant == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(financialAccountant);
		}

		if (organization == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organization);
		}

		if (division == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(division);
		}

		if (reportBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reportBy);
		}

		objectOutput.writeLong(reportDate);
		objectOutput.writeLong(fromDate);
		objectOutput.writeLong(toDate);
		objectOutput.writeLong(attachedFile);
		objectOutput.writeDouble(totalPayment);
		objectOutput.writeLong(paymentType);
		objectOutput.writeInt(markAsDeleted);
	}

	public long id;
	public String debitNoteNumber;
	public String transactionId;
	public String corporationId;
	public String financialAccountant;
	public String organization;
	public String division;
	public String reportBy;
	public long reportDate;
	public long fromDate;
	public long toDate;
	public long attachedFile;
	public double totalPayment;
	public long paymentType;
	public int markAsDeleted;
}