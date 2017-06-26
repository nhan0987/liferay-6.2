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

import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DebitNoteDetails in entity cache.
 *
 * @author win_64
 * @see DebitNoteDetails
 * @generated
 */
public class DebitNoteDetailsCacheModel implements CacheModel<DebitNoteDetails>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(id);
		sb.append(", vehicleRecordId=");
		sb.append(vehicleRecordId);
		sb.append(", debitNoteId=");
		sb.append(debitNoteId);
		sb.append(", inspectionRecordId=");
		sb.append(inspectionRecordId);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DebitNoteDetails toEntityModel() {
		DebitNoteDetailsImpl debitNoteDetailsImpl = new DebitNoteDetailsImpl();

		debitNoteDetailsImpl.setId(id);
		debitNoteDetailsImpl.setVehicleRecordId(vehicleRecordId);
		debitNoteDetailsImpl.setDebitNoteId(debitNoteId);
		debitNoteDetailsImpl.setInspectionRecordId(inspectionRecordId);
		debitNoteDetailsImpl.setUnitPrice(unitPrice);

		if (currency == null) {
			debitNoteDetailsImpl.setCurrency(StringPool.BLANK);
		}
		else {
			debitNoteDetailsImpl.setCurrency(currency);
		}

		if (basicCurrency == null) {
			debitNoteDetailsImpl.setBasicCurrency(StringPool.BLANK);
		}
		else {
			debitNoteDetailsImpl.setBasicCurrency(basicCurrency);
		}

		debitNoteDetailsImpl.setExchangeRate(exchangeRate);
		debitNoteDetailsImpl.setInspectionFee(inspectionFee);
		debitNoteDetailsImpl.setOtherCosts(otherCosts);
		debitNoteDetailsImpl.setTotalCostsAndFee(totalCostsAndFee);
		debitNoteDetailsImpl.setTax(tax);
		debitNoteDetailsImpl.setCharges(charges);
		debitNoteDetailsImpl.setTotalRealDebit(totalRealDebit);
		debitNoteDetailsImpl.setTotalDebit(totalDebit);

		debitNoteDetailsImpl.resetOriginalValues();

		return debitNoteDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		vehicleRecordId = objectInput.readLong();
		debitNoteId = objectInput.readLong();
		inspectionRecordId = objectInput.readLong();
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
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(vehicleRecordId);
		objectOutput.writeLong(debitNoteId);
		objectOutput.writeLong(inspectionRecordId);
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
	}

	public long id;
	public long vehicleRecordId;
	public long debitNoteId;
	public long inspectionRecordId;
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
}