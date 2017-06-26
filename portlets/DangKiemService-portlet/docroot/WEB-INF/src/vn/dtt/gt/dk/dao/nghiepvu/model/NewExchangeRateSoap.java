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

package vn.dtt.gt.dk.dao.nghiepvu.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.NewExchangeRateServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.NewExchangeRateServiceSoap
 * @generated
 */
public class NewExchangeRateSoap implements Serializable {
	public static NewExchangeRateSoap toSoapModel(NewExchangeRate model) {
		NewExchangeRateSoap soapModel = new NewExchangeRateSoap();

		soapModel.setId(model.getId());
		soapModel.setOriginalCurrency(model.getOriginalCurrency());
		soapModel.setBasicCurrency(model.getBasicCurrency());
		soapModel.setExchangeRate(model.getExchangeRate());
		soapModel.setPublishDate(model.getPublishDate());
		soapModel.setValidFrom(model.getValidFrom());
		soapModel.setValidUntil(model.getValidUntil());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static NewExchangeRateSoap[] toSoapModels(NewExchangeRate[] models) {
		NewExchangeRateSoap[] soapModels = new NewExchangeRateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NewExchangeRateSoap[][] toSoapModels(
		NewExchangeRate[][] models) {
		NewExchangeRateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NewExchangeRateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NewExchangeRateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NewExchangeRateSoap[] toSoapModels(
		List<NewExchangeRate> models) {
		List<NewExchangeRateSoap> soapModels = new ArrayList<NewExchangeRateSoap>(models.size());

		for (NewExchangeRate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NewExchangeRateSoap[soapModels.size()]);
	}

	public NewExchangeRateSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getOriginalCurrency() {
		return _originalCurrency;
	}

	public void setOriginalCurrency(String originalCurrency) {
		_originalCurrency = originalCurrency;
	}

	public String getBasicCurrency() {
		return _basicCurrency;
	}

	public void setBasicCurrency(String basicCurrency) {
		_basicCurrency = basicCurrency;
	}

	public double getExchangeRate() {
		return _exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		_exchangeRate = exchangeRate;
	}

	public Date getPublishDate() {
		return _publishDate;
	}

	public void setPublishDate(Date publishDate) {
		_publishDate = publishDate;
	}

	public Date getValidFrom() {
		return _validFrom;
	}

	public void setValidFrom(Date validFrom) {
		_validFrom = validFrom;
	}

	public Date getValidUntil() {
		return _validUntil;
	}

	public void setValidUntil(Date validUntil) {
		_validUntil = validUntil;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _id;
	private String _originalCurrency;
	private String _basicCurrency;
	private double _exchangeRate;
	private Date _publishDate;
	private Date _validFrom;
	private Date _validUntil;
	private Date _synchdate;
}