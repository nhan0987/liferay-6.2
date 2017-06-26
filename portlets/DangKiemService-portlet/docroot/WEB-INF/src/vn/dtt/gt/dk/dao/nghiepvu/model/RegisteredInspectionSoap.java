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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.RegisteredInspectionServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.RegisteredInspectionServiceSoap
 * @generated
 */
public class RegisteredInspectionSoap implements Serializable {
	public static RegisteredInspectionSoap toSoapModel(
		RegisteredInspection model) {
		RegisteredInspectionSoap soapModel = new RegisteredInspectionSoap();

		soapModel.setId(model.getId());
		soapModel.setRegisteredNumber(model.getRegisteredNumber());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setImporterCode(model.getImporterCode());
		soapModel.setImporterName(model.getImporterName());
		soapModel.setImporterAddress(model.getImporterAddress());
		soapModel.setRepresentative(model.getRepresentative());
		soapModel.setPhone(model.getPhone());
		soapModel.setFax(model.getFax());
		soapModel.setEmail(model.getEmail());
		soapModel.setInspectionDate(model.getInspectionDate());
		soapModel.setInspectionSite(model.getInspectionSite());
		soapModel.setInspectionDistrictCode(model.getInspectionDistrictCode());
		soapModel.setInspectionProvinceCode(model.getInspectionProvinceCode());
		soapModel.setContactName(model.getContactName());
		soapModel.setContactPhone(model.getContactPhone());
		soapModel.setContactEmail(model.getContactEmail());
		soapModel.setImporterSignName(model.getImporterSignName());
		soapModel.setImporterSignTitle(model.getImporterSignTitle());
		soapModel.setImporterSignPlace(model.getImporterSignPlace());
		soapModel.setImporterSignDate(model.getImporterSignDate());
		soapModel.setInspectorOrganization(model.getInspectorOrganization());
		soapModel.setInspectorDivision(model.getInspectorDivision());
		soapModel.setInspectorSigNname(model.getInspectorSigNname());
		soapModel.setInspectorSignTitle(model.getInspectorSignTitle());
		soapModel.setInspectorSignPlace(model.getInspectorSignPlace());
		soapModel.setInspectorSignDate(model.getInspectorSignDate());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static RegisteredInspectionSoap[] toSoapModels(
		RegisteredInspection[] models) {
		RegisteredInspectionSoap[] soapModels = new RegisteredInspectionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RegisteredInspectionSoap[][] toSoapModels(
		RegisteredInspection[][] models) {
		RegisteredInspectionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RegisteredInspectionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RegisteredInspectionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RegisteredInspectionSoap[] toSoapModels(
		List<RegisteredInspection> models) {
		List<RegisteredInspectionSoap> soapModels = new ArrayList<RegisteredInspectionSoap>(models.size());

		for (RegisteredInspection model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RegisteredInspectionSoap[soapModels.size()]);
	}

	public RegisteredInspectionSoap() {
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

	public String getRegisteredNumber() {
		return _registeredNumber;
	}

	public void setRegisteredNumber(String registeredNumber) {
		_registeredNumber = registeredNumber;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public String getImporterCode() {
		return _importerCode;
	}

	public void setImporterCode(String importerCode) {
		_importerCode = importerCode;
	}

	public String getImporterName() {
		return _importerName;
	}

	public void setImporterName(String importerName) {
		_importerName = importerName;
	}

	public String getImporterAddress() {
		return _importerAddress;
	}

	public void setImporterAddress(String importerAddress) {
		_importerAddress = importerAddress;
	}

	public String getRepresentative() {
		return _representative;
	}

	public void setRepresentative(String representative) {
		_representative = representative;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getFax() {
		return _fax;
	}

	public void setFax(String fax) {
		_fax = fax;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public Date getInspectionDate() {
		return _inspectionDate;
	}

	public void setInspectionDate(Date inspectionDate) {
		_inspectionDate = inspectionDate;
	}

	public String getInspectionSite() {
		return _inspectionSite;
	}

	public void setInspectionSite(String inspectionSite) {
		_inspectionSite = inspectionSite;
	}

	public String getInspectionDistrictCode() {
		return _inspectionDistrictCode;
	}

	public void setInspectionDistrictCode(String inspectionDistrictCode) {
		_inspectionDistrictCode = inspectionDistrictCode;
	}

	public String getInspectionProvinceCode() {
		return _inspectionProvinceCode;
	}

	public void setInspectionProvinceCode(String inspectionProvinceCode) {
		_inspectionProvinceCode = inspectionProvinceCode;
	}

	public String getContactName() {
		return _contactName;
	}

	public void setContactName(String contactName) {
		_contactName = contactName;
	}

	public String getContactPhone() {
		return _contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		_contactPhone = contactPhone;
	}

	public String getContactEmail() {
		return _contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		_contactEmail = contactEmail;
	}

	public String getImporterSignName() {
		return _importerSignName;
	}

	public void setImporterSignName(String importerSignName) {
		_importerSignName = importerSignName;
	}

	public String getImporterSignTitle() {
		return _importerSignTitle;
	}

	public void setImporterSignTitle(String importerSignTitle) {
		_importerSignTitle = importerSignTitle;
	}

	public String getImporterSignPlace() {
		return _importerSignPlace;
	}

	public void setImporterSignPlace(String importerSignPlace) {
		_importerSignPlace = importerSignPlace;
	}

	public Date getImporterSignDate() {
		return _importerSignDate;
	}

	public void setImporterSignDate(Date importerSignDate) {
		_importerSignDate = importerSignDate;
	}

	public String getInspectorOrganization() {
		return _inspectorOrganization;
	}

	public void setInspectorOrganization(String inspectorOrganization) {
		_inspectorOrganization = inspectorOrganization;
	}

	public String getInspectorDivision() {
		return _inspectorDivision;
	}

	public void setInspectorDivision(String inspectorDivision) {
		_inspectorDivision = inspectorDivision;
	}

	public String getInspectorSigNname() {
		return _inspectorSigNname;
	}

	public void setInspectorSigNname(String inspectorSigNname) {
		_inspectorSigNname = inspectorSigNname;
	}

	public String getInspectorSignTitle() {
		return _inspectorSignTitle;
	}

	public void setInspectorSignTitle(String inspectorSignTitle) {
		_inspectorSignTitle = inspectorSignTitle;
	}

	public String getInspectorSignPlace() {
		return _inspectorSignPlace;
	}

	public void setInspectorSignPlace(String inspectorSignPlace) {
		_inspectorSignPlace = inspectorSignPlace;
	}

	public Date getInspectorSignDate() {
		return _inspectorSignDate;
	}

	public void setInspectorSignDate(Date inspectorSignDate) {
		_inspectorSignDate = inspectorSignDate;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _id;
	private String _registeredNumber;
	private long _dossierId;
	private long _attachedFile;
	private String _importerCode;
	private String _importerName;
	private String _importerAddress;
	private String _representative;
	private String _phone;
	private String _fax;
	private String _email;
	private Date _inspectionDate;
	private String _inspectionSite;
	private String _inspectionDistrictCode;
	private String _inspectionProvinceCode;
	private String _contactName;
	private String _contactPhone;
	private String _contactEmail;
	private String _importerSignName;
	private String _importerSignTitle;
	private String _importerSignPlace;
	private Date _importerSignDate;
	private String _inspectorOrganization;
	private String _inspectorDivision;
	private String _inspectorSigNname;
	private String _inspectorSignTitle;
	private String _inspectorSignPlace;
	private Date _inspectorSignDate;
	private Date _synchdate;
}