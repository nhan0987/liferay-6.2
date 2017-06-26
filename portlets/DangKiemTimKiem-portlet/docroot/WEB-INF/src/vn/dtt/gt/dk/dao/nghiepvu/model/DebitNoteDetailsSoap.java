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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.DebitNoteDetailsServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.DebitNoteDetailsServiceSoap
 * @generated
 */
public class DebitNoteDetailsSoap implements Serializable {
	public static DebitNoteDetailsSoap toSoapModel(DebitNoteDetails model) {
		DebitNoteDetailsSoap soapModel = new DebitNoteDetailsSoap();

		soapModel.setId(model.getId());
		soapModel.setVehicleRecordId(model.getVehicleRecordId());
		soapModel.setDebitNoteId(model.getDebitNoteId());
		soapModel.setInspectionRecordId(model.getInspectionRecordId());
		soapModel.setUnitPrice(model.getUnitPrice());
		soapModel.setCurrency(model.getCurrency());
		soapModel.setBasicCurrency(model.getBasicCurrency());
		soapModel.setExchangeRate(model.getExchangeRate());
		soapModel.setInspectionFee(model.getInspectionFee());
		soapModel.setOtherCosts(model.getOtherCosts());
		soapModel.setTotalCostsAndFee(model.getTotalCostsAndFee());
		soapModel.setTax(model.getTax());
		soapModel.setCharges(model.getCharges());
		soapModel.setTotalRealDebit(model.getTotalRealDebit());
		soapModel.setTotalDebit(model.getTotalDebit());

		return soapModel;
	}

	public static DebitNoteDetailsSoap[] toSoapModels(DebitNoteDetails[] models) {
		DebitNoteDetailsSoap[] soapModels = new DebitNoteDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DebitNoteDetailsSoap[][] toSoapModels(
		DebitNoteDetails[][] models) {
		DebitNoteDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DebitNoteDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DebitNoteDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DebitNoteDetailsSoap[] toSoapModels(
		List<DebitNoteDetails> models) {
		List<DebitNoteDetailsSoap> soapModels = new ArrayList<DebitNoteDetailsSoap>(models.size());

		for (DebitNoteDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DebitNoteDetailsSoap[soapModels.size()]);
	}

	public DebitNoteDetailsSoap() {
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

	public long getVehicleRecordId() {
		return _vehicleRecordId;
	}

	public void setVehicleRecordId(long vehicleRecordId) {
		_vehicleRecordId = vehicleRecordId;
	}

	public long getDebitNoteId() {
		return _debitNoteId;
	}

	public void setDebitNoteId(long debitNoteId) {
		_debitNoteId = debitNoteId;
	}

	public long getInspectionRecordId() {
		return _inspectionRecordId;
	}

	public void setInspectionRecordId(long inspectionRecordId) {
		_inspectionRecordId = inspectionRecordId;
	}

	public double getUnitPrice() {
		return _unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		_unitPrice = unitPrice;
	}

	public String getCurrency() {
		return _currency;
	}

	public void setCurrency(String currency) {
		_currency = currency;
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

	public double getInspectionFee() {
		return _inspectionFee;
	}

	public void setInspectionFee(double inspectionFee) {
		_inspectionFee = inspectionFee;
	}

	public double getOtherCosts() {
		return _otherCosts;
	}

	public void setOtherCosts(double otherCosts) {
		_otherCosts = otherCosts;
	}

	public double getTotalCostsAndFee() {
		return _totalCostsAndFee;
	}

	public void setTotalCostsAndFee(double totalCostsAndFee) {
		_totalCostsAndFee = totalCostsAndFee;
	}

	public double getTax() {
		return _tax;
	}

	public void setTax(double tax) {
		_tax = tax;
	}

	public double getCharges() {
		return _charges;
	}

	public void setCharges(double charges) {
		_charges = charges;
	}

	public double getTotalRealDebit() {
		return _totalRealDebit;
	}

	public void setTotalRealDebit(double totalRealDebit) {
		_totalRealDebit = totalRealDebit;
	}

	public double getTotalDebit() {
		return _totalDebit;
	}

	public void setTotalDebit(double totalDebit) {
		_totalDebit = totalDebit;
	}

	private long _id;
	private long _vehicleRecordId;
	private long _debitNoteId;
	private long _inspectionRecordId;
	private double _unitPrice;
	private String _currency;
	private String _basicCurrency;
	private double _exchangeRate;
	private double _inspectionFee;
	private double _otherCosts;
	private double _totalCostsAndFee;
	private double _tax;
	private double _charges;
	private double _totalRealDebit;
	private double _totalDebit;
}