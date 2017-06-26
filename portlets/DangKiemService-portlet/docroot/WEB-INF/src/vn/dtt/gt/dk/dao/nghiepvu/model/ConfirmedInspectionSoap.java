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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.ConfirmedInspectionServiceSoap}.
 *
 * @author huymq
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.ConfirmedInspectionServiceSoap
 * @generated
 */
public class ConfirmedInspectionSoap implements Serializable {
	public static ConfirmedInspectionSoap toSoapModel(ConfirmedInspection model) {
		ConfirmedInspectionSoap soapModel = new ConfirmedInspectionSoap();

		soapModel.setId(model.getId());
		soapModel.setRegisteredInspectionId(model.getRegisteredInspectionId());
		soapModel.setCustomsDeclarationId(model.getCustomsDeclarationId());
		soapModel.setConfirmationCode(model.getConfirmationCode());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setInspectionDate(model.getInspectionDate());
		soapModel.setInspectionSite(model.getInspectionSite());
		soapModel.setInspectionDistrictCode(model.getInspectionDistrictCode());
		soapModel.setInspectionProvincecode(model.getInspectionProvincecode());
		soapModel.setCustomsRegion(model.getCustomsRegion());
		soapModel.setMarkasChangedSite(model.getMarkasChangedSite());
		soapModel.setContactName(model.getContactName());
		soapModel.setContactPhone(model.getContactPhone());
		soapModel.setContactEmail(model.getContactEmail());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInspectorId(model.getInspectorId());
		soapModel.setPhieuXuLyPhuId(model.getPhieuXuLyPhuId());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setDateFrom(model.getDateFrom());
		soapModel.setDateTo(model.getDateTo());
		soapModel.setLeader(model.getLeader());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static ConfirmedInspectionSoap[] toSoapModels(
		ConfirmedInspection[] models) {
		ConfirmedInspectionSoap[] soapModels = new ConfirmedInspectionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConfirmedInspectionSoap[][] toSoapModels(
		ConfirmedInspection[][] models) {
		ConfirmedInspectionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConfirmedInspectionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConfirmedInspectionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConfirmedInspectionSoap[] toSoapModels(
		List<ConfirmedInspection> models) {
		List<ConfirmedInspectionSoap> soapModels = new ArrayList<ConfirmedInspectionSoap>(models.size());

		for (ConfirmedInspection model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConfirmedInspectionSoap[soapModels.size()]);
	}

	public ConfirmedInspectionSoap() {
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

	public long getRegisteredInspectionId() {
		return _registeredInspectionId;
	}

	public void setRegisteredInspectionId(long registeredInspectionId) {
		_registeredInspectionId = registeredInspectionId;
	}

	public long getCustomsDeclarationId() {
		return _customsDeclarationId;
	}

	public void setCustomsDeclarationId(long customsDeclarationId) {
		_customsDeclarationId = customsDeclarationId;
	}

	public long getConfirmationCode() {
		return _confirmationCode;
	}

	public void setConfirmationCode(long confirmationCode) {
		_confirmationCode = confirmationCode;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
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

	public String getInspectionProvincecode() {
		return _inspectionProvincecode;
	}

	public void setInspectionProvincecode(String inspectionProvincecode) {
		_inspectionProvincecode = inspectionProvincecode;
	}

	public long getCustomsRegion() {
		return _customsRegion;
	}

	public void setCustomsRegion(long customsRegion) {
		_customsRegion = customsRegion;
	}

	public long getMarkasChangedSite() {
		return _markasChangedSite;
	}

	public void setMarkasChangedSite(long markasChangedSite) {
		_markasChangedSite = markasChangedSite;
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

	public String getSignName() {
		return _signName;
	}

	public void setSignName(String signName) {
		_signName = signName;
	}

	public String getSignTitle() {
		return _signTitle;
	}

	public void setSignTitle(String signTitle) {
		_signTitle = signTitle;
	}

	public String getSignPlace() {
		return _signPlace;
	}

	public void setSignPlace(String signPlace) {
		_signPlace = signPlace;
	}

	public Date getSignDate() {
		return _signDate;
	}

	public void setSignDate(Date signDate) {
		_signDate = signDate;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getCorporationId() {
		return _corporationId;
	}

	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;
	}

	public long getInspectorId() {
		return _inspectorId;
	}

	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;
	}

	public long getPhieuXuLyPhuId() {
		return _phieuXuLyPhuId;
	}

	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_phieuXuLyPhuId = phieuXuLyPhuId;
	}

	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	public Date getDateFrom() {
		return _dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		_dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return _dateTo;
	}

	public void setDateTo(Date dateTo) {
		_dateTo = dateTo;
	}

	public int getLeader() {
		return _leader;
	}

	public void setLeader(int leader) {
		_leader = leader;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _id;
	private long _registeredInspectionId;
	private long _customsDeclarationId;
	private long _confirmationCode;
	private long _attachedFile;
	private Date _inspectionDate;
	private String _inspectionSite;
	private String _inspectionDistrictCode;
	private String _inspectionProvincecode;
	private long _customsRegion;
	private long _markasChangedSite;
	private String _contactName;
	private String _contactPhone;
	private String _contactEmail;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private String _remarks;
	private String _corporationId;
	private long _inspectorId;
	private long _phieuXuLyPhuId;
	private long _hoSoThuTucId;
	private Date _dateFrom;
	private Date _dateTo;
	private int _leader;
	private Date _synchdate;
}