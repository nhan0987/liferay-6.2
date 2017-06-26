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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.IssueCategoryServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.IssueCategoryServiceSoap
 * @generated
 */
public class IssueCategorySoap implements Serializable {
	public static IssueCategorySoap toSoapModel(IssueCategory model) {
		IssueCategorySoap soapModel = new IssueCategorySoap();

		soapModel.setId(model.getId());
		soapModel.setIssuetrackingid(model.getIssuetrackingid());
		soapModel.setDefectcategorycode(model.getDefectcategorycode());
		soapModel.setDefectcategoryshortname(model.getDefectcategoryshortname());
		soapModel.setDefectcategoryfullname(model.getDefectcategoryfullname());
		soapModel.setDefectdetection(model.getDefectdetection());
		soapModel.setDefectdatagroupid(model.getDefectdatagroupid());

		return soapModel;
	}

	public static IssueCategorySoap[] toSoapModels(IssueCategory[] models) {
		IssueCategorySoap[] soapModels = new IssueCategorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static IssueCategorySoap[][] toSoapModels(IssueCategory[][] models) {
		IssueCategorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new IssueCategorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new IssueCategorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static IssueCategorySoap[] toSoapModels(List<IssueCategory> models) {
		List<IssueCategorySoap> soapModels = new ArrayList<IssueCategorySoap>(models.size());

		for (IssueCategory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new IssueCategorySoap[soapModels.size()]);
	}

	public IssueCategorySoap() {
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

	public int getIssuetrackingid() {
		return _issuetrackingid;
	}

	public void setIssuetrackingid(int issuetrackingid) {
		_issuetrackingid = issuetrackingid;
	}

	public String getDefectcategorycode() {
		return _defectcategorycode;
	}

	public void setDefectcategorycode(String defectcategorycode) {
		_defectcategorycode = defectcategorycode;
	}

	public String getDefectcategoryshortname() {
		return _defectcategoryshortname;
	}

	public void setDefectcategoryshortname(String defectcategoryshortname) {
		_defectcategoryshortname = defectcategoryshortname;
	}

	public String getDefectcategoryfullname() {
		return _defectcategoryfullname;
	}

	public void setDefectcategoryfullname(String defectcategoryfullname) {
		_defectcategoryfullname = defectcategoryfullname;
	}

	public int getDefectdetection() {
		return _defectdetection;
	}

	public void setDefectdetection(int defectdetection) {
		_defectdetection = defectdetection;
	}

	public int getDefectdatagroupid() {
		return _defectdatagroupid;
	}

	public void setDefectdatagroupid(int defectdatagroupid) {
		_defectdatagroupid = defectdatagroupid;
	}

	private long _id;
	private int _issuetrackingid;
	private String _defectcategorycode;
	private String _defectcategoryshortname;
	private String _defectcategoryfullname;
	private int _defectdetection;
	private int _defectdatagroupid;
}