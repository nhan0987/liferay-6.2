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

package vn.dtt.gt.dk.dao.motcua.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.motcua.service.http.MotCuaKetQuaDienBienServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.motcua.service.http.MotCuaKetQuaDienBienServiceSoap
 * @generated
 */
public class MotCuaKetQuaDienBienSoap implements Serializable {
	public static MotCuaKetQuaDienBienSoap toSoapModel(
		MotCuaKetQuaDienBien model) {
		MotCuaKetQuaDienBienSoap soapModel = new MotCuaKetQuaDienBienSoap();

		soapModel.setId(model.getId());
		soapModel.setDienBienHoSoId(model.getDienBienHoSoId());
		soapModel.setNoiDungHoSoId(model.getNoiDungHoSoId());

		return soapModel;
	}

	public static MotCuaKetQuaDienBienSoap[] toSoapModels(
		MotCuaKetQuaDienBien[] models) {
		MotCuaKetQuaDienBienSoap[] soapModels = new MotCuaKetQuaDienBienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MotCuaKetQuaDienBienSoap[][] toSoapModels(
		MotCuaKetQuaDienBien[][] models) {
		MotCuaKetQuaDienBienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MotCuaKetQuaDienBienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MotCuaKetQuaDienBienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MotCuaKetQuaDienBienSoap[] toSoapModels(
		List<MotCuaKetQuaDienBien> models) {
		List<MotCuaKetQuaDienBienSoap> soapModels = new ArrayList<MotCuaKetQuaDienBienSoap>(models.size());

		for (MotCuaKetQuaDienBien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MotCuaKetQuaDienBienSoap[soapModels.size()]);
	}

	public MotCuaKetQuaDienBienSoap() {
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

	public long getDienBienHoSoId() {
		return _dienBienHoSoId;
	}

	public void setDienBienHoSoId(long dienBienHoSoId) {
		_dienBienHoSoId = dienBienHoSoId;
	}

	public long getNoiDungHoSoId() {
		return _noiDungHoSoId;
	}

	public void setNoiDungHoSoId(long noiDungHoSoId) {
		_noiDungHoSoId = noiDungHoSoId;
	}

	private long _id;
	private long _dienBienHoSoId;
	private long _noiDungHoSoId;
}