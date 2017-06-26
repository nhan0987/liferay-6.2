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

import vn.dtt.gt.dk.dao.nghiepvu.model.NewExchangeRate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NewExchangeRate in entity cache.
 *
 * @author win_64
 * @see NewExchangeRate
 * @generated
 */
public class NewExchangeRateCacheModel implements CacheModel<NewExchangeRate>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", originalCurrency=");
		sb.append(originalCurrency);
		sb.append(", basicCurrency=");
		sb.append(basicCurrency);
		sb.append(", exchangeRate=");
		sb.append(exchangeRate);
		sb.append(", publishDate=");
		sb.append(publishDate);
		sb.append(", validFrom=");
		sb.append(validFrom);
		sb.append(", validUntil=");
		sb.append(validUntil);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NewExchangeRate toEntityModel() {
		NewExchangeRateImpl newExchangeRateImpl = new NewExchangeRateImpl();

		newExchangeRateImpl.setId(id);

		if (originalCurrency == null) {
			newExchangeRateImpl.setOriginalCurrency(StringPool.BLANK);
		}
		else {
			newExchangeRateImpl.setOriginalCurrency(originalCurrency);
		}

		if (basicCurrency == null) {
			newExchangeRateImpl.setBasicCurrency(StringPool.BLANK);
		}
		else {
			newExchangeRateImpl.setBasicCurrency(basicCurrency);
		}

		newExchangeRateImpl.setExchangeRate(exchangeRate);

		if (publishDate == Long.MIN_VALUE) {
			newExchangeRateImpl.setPublishDate(null);
		}
		else {
			newExchangeRateImpl.setPublishDate(new Date(publishDate));
		}

		if (validFrom == Long.MIN_VALUE) {
			newExchangeRateImpl.setValidFrom(null);
		}
		else {
			newExchangeRateImpl.setValidFrom(new Date(validFrom));
		}

		if (validUntil == Long.MIN_VALUE) {
			newExchangeRateImpl.setValidUntil(null);
		}
		else {
			newExchangeRateImpl.setValidUntil(new Date(validUntil));
		}

		newExchangeRateImpl.resetOriginalValues();

		return newExchangeRateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		originalCurrency = objectInput.readUTF();
		basicCurrency = objectInput.readUTF();
		exchangeRate = objectInput.readDouble();
		publishDate = objectInput.readLong();
		validFrom = objectInput.readLong();
		validUntil = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (originalCurrency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(originalCurrency);
		}

		if (basicCurrency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(basicCurrency);
		}

		objectOutput.writeDouble(exchangeRate);
		objectOutput.writeLong(publishDate);
		objectOutput.writeLong(validFrom);
		objectOutput.writeLong(validUntil);
	}

	public long id;
	public String originalCurrency;
	public String basicCurrency;
	public double exchangeRate;
	public long publishDate;
	public long validFrom;
	public long validUntil;
}