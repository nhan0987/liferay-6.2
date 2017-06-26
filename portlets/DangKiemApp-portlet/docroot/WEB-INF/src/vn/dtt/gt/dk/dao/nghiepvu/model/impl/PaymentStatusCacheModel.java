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

import vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PaymentStatus in entity cache.
 *
 * @author win_64
 * @see PaymentStatus
 * @generated
 */
public class PaymentStatusCacheModel implements CacheModel<PaymentStatus>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleRecordId=");
		sb.append(vehicleRecordId);
		sb.append(", attachedFile=");
		sb.append(attachedFile);
		sb.append(", unitPrice=");
		sb.append(unitPrice);
		sb.append(", currency=");
		sb.append(currency);
		sb.append(", basicCurrency=");
		sb.append(basicCurrency);
		sb.append(", exchangeRate=");
		sb.append(exchangeRate);
		sb.append(", inspectionFee=");
		sb.append(inspectionFee);
		sb.append(", otherCosts=");
		sb.append(otherCosts);
		sb.append(", totalCostsAndFee=");
		sb.append(totalCostsAndFee);
		sb.append(", tax=");
		sb.append(tax);
		sb.append(", charges=");
		sb.append(charges);
		sb.append(", totalRealDebit=");
		sb.append(totalRealDebit);
		sb.append(", totalDebit=");
		sb.append(totalDebit);
		sb.append(", totalCredit=");
		sb.append(totalCredit);
		sb.append(", currentStatus=");
		sb.append(currentStatus);
		sb.append(", debitNoteNumber=");
		sb.append(debitNoteNumber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PaymentStatus toEntityModel() {
		PaymentStatusImpl paymentStatusImpl = new PaymentStatusImpl();

		paymentStatusImpl.setId(id);
		paymentStatusImpl.setVehicleRecordId(vehicleRecordId);
		paymentStatusImpl.setAttachedFile(attachedFile);
		paymentStatusImpl.setUnitPrice(unitPrice);

		if (currency == null) {
			paymentStatusImpl.setCurrency(StringPool.BLANK);
		}
		else {
			paymentStatusImpl.setCurrency(currency);
		}

		if (basicCurrency == null) {
			paymentStatusImpl.setBasicCurrency(StringPool.BLANK);
		}
		else {
			paymentStatusImpl.setBasicCurrency(basicCurrency);
		}

		paymentStatusImpl.setExchangeRate(exchangeRate);
		paymentStatusImpl.setInspectionFee(inspectionFee);
		paymentStatusImpl.setOtherCosts(otherCosts);
		paymentStatusImpl.setTotalCostsAndFee(totalCostsAndFee);
		paymentStatusImpl.setTax(tax);
		paymentStatusImpl.setCharges(charges);
		paymentStatusImpl.setTotalRealDebit(totalRealDebit);
		paymentStatusImpl.setTotalDebit(totalDebit);
		paymentStatusImpl.setTotalCredit(totalCredit);
		paymentStatusImpl.setCurrentStatus(currentStatus);

		if (debitNoteNumber == null) {
			paymentStatusImpl.setDebitNoteNumber(StringPool.BLANK);
		}
		else {
			paymentStatusImpl.setDebitNoteNumber(debitNoteNumber);
		}

		paymentStatusImpl.resetOriginalValues();

		return paymentStatusImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicleRecordId = objectInput.readLong();
		attachedFile = objectInput.readLong();
		unitPrice = objectInput.readDouble();
		currency = objectInput.readUTF();
		basicCurrency = objectInput.readUTF();
		exchangeRate = objectInput.readDouble();
		inspectionFee = objectInput.readDouble();
		otherCosts = objectInput.readDouble();
		totalCostsAndFee = objectInput.readDouble();
		tax = objectInput.readDouble();
		charges = objectInput.readDouble();
		totalRealDebit = objectInput.readDouble();
		totalDebit = objectInput.readDouble();
		totalCredit = objectInput.readDouble();
		currentStatus = objectInput.readLong();
		debitNoteNumber = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(vehicleRecordId);
		objectOutput.writeLong(attachedFile);
		objectOutput.writeDouble(unitPrice);

		if (currency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currency);
		}

		if (basicCurrency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(basicCurrency);
		}

		objectOutput.writeDouble(exchangeRate);
		objectOutput.writeDouble(inspectionFee);
		objectOutput.writeDouble(otherCosts);
		objectOutput.writeDouble(totalCostsAndFee);
		objectOutput.writeDouble(tax);
		objectOutput.writeDouble(charges);
		objectOutput.writeDouble(totalRealDebit);
		objectOutput.writeDouble(totalDebit);
		objectOutput.writeDouble(totalCredit);
		objectOutput.writeLong(currentStatus);

		if (debitNoteNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(debitNoteNumber);
		}
	}

	public long id;
	public long vehicleRecordId;
	public long attachedFile;
	public double unitPrice;
	public String currency;
	public String basicCurrency;
	public double exchangeRate;
	public double inspectionFee;
	public double otherCosts;
	public double totalCostsAndFee;
	public double tax;
	public double charges;
	public double totalRealDebit;
	public double totalDebit;
	public double totalCredit;
	public long currentStatus;
	public String debitNoteNumber;
}