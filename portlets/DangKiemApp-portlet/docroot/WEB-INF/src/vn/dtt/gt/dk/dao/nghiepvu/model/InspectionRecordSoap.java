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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.InspectionRecordServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.InspectionRecordServiceSoap
 * @generated
 */
public class InspectionRecordSoap implements Serializable {
	public static InspectionRecordSoap toSoapModel(InspectionRecord model) {
		InspectionRecordSoap soapModel = new InspectionRecordSoap();

		soapModel.setId(model.getId());
		soapModel.setInspectionRecordNo(model.getInspectionRecordNo());
		soapModel.setInspectionRecordDate(model.getInspectionRecordDate());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInspectorId(model.getInspectorId());
		soapModel.setConfirmedInspectionId(model.getConfirmedInspectionId());
		soapModel.setCustomsDeclarationid(model.getCustomsDeclarationid());
		soapModel.setInspectionSite(model.getInspectionSite());
		soapModel.setInspectionDateFrom(model.getInspectionDateFrom());
		soapModel.setInspectionDateTo(model.getInspectionDateTo());
		soapModel.setInspectionMode(model.getInspectionMode());
		soapModel.setDescription(model.getDescription());
		soapModel.setAttachedFile(model.getAttachedFile());
		soapModel.setConfirmedResult(model.getConfirmedResult());
		soapModel.setSignName(model.getSignName());
		soapModel.setSignTitle(model.getSignTitle());
		soapModel.setSignPlace(model.getSignPlace());
		soapModel.setSignDate(model.getSignDate());
		soapModel.setPhieuXuLyPhuId(model.getPhieuXuLyPhuId());
		soapModel.setMarkupSafeTest(model.getMarkupSafeTest());
		soapModel.setMarkupEmissionTest(model.getMarkupEmissionTest());
		soapModel.setMarkupControl(model.getMarkupControl());
		soapModel.setRegisteredInspectionId(model.getRegisteredInspectionId());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setHoSoThuTucId(model.getHoSoThuTucId());
		soapModel.setOtherCosts(model.getOtherCosts());
		soapModel.setMarkupPaid(model.getMarkupPaid());

		return soapModel;
	}

	public static InspectionRecordSoap[] toSoapModels(InspectionRecord[] models) {
		InspectionRecordSoap[] soapModels = new InspectionRecordSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InspectionRecordSoap[][] toSoapModels(
		InspectionRecord[][] models) {
		InspectionRecordSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InspectionRecordSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InspectionRecordSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InspectionRecordSoap[] toSoapModels(
		List<InspectionRecord> models) {
		List<InspectionRecordSoap> soapModels = new ArrayList<InspectionRecordSoap>(models.size());

		for (InspectionRecord model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InspectionRecordSoap[soapModels.size()]);
	}

	public InspectionRecordSoap() {
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

	public String getInspectionRecordNo() {
		return _inspectionRecordNo;
	}

	public void setInspectionRecordNo(String inspectionRecordNo) {
		_inspectionRecordNo = inspectionRecordNo;
	}

	public Date getInspectionRecordDate() {
		return _inspectionRecordDate;
	}

	public void setInspectionRecordDate(Date inspectionRecordDate) {
		_inspectionRecordDate = inspectionRecordDate;
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

	public long getConfirmedInspectionId() {
		return _confirmedInspectionId;
	}

	public void setConfirmedInspectionId(long confirmedInspectionId) {
		_confirmedInspectionId = confirmedInspectionId;
	}

	public long getCustomsDeclarationid() {
		return _customsDeclarationid;
	}

	public void setCustomsDeclarationid(long customsDeclarationid) {
		_customsDeclarationid = customsDeclarationid;
	}

	public String getInspectionSite() {
		return _inspectionSite;
	}

	public void setInspectionSite(String inspectionSite) {
		_inspectionSite = inspectionSite;
	}

	public Date getInspectionDateFrom() {
		return _inspectionDateFrom;
	}

	public void setInspectionDateFrom(Date inspectionDateFrom) {
		_inspectionDateFrom = inspectionDateFrom;
	}

	public Date getInspectionDateTo() {
		return _inspectionDateTo;
	}

	public void setInspectionDateTo(Date inspectionDateTo) {
		_inspectionDateTo = inspectionDateTo;
	}

	public long getInspectionMode() {
		return _inspectionMode;
	}

	public void setInspectionMode(long inspectionMode) {
		_inspectionMode = inspectionMode;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getAttachedFile() {
		return _attachedFile;
	}

	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;
	}

	public long getConfirmedResult() {
		return _confirmedResult;
	}

	public void setConfirmedResult(long confirmedResult) {
		_confirmedResult = confirmedResult;
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

	public long getPhieuXuLyPhuId() {
		return _phieuXuLyPhuId;
	}

	public void setPhieuXuLyPhuId(long phieuXuLyPhuId) {
		_phieuXuLyPhuId = phieuXuLyPhuId;
	}

	public long getMarkupSafeTest() {
		return _markupSafeTest;
	}

	public void setMarkupSafeTest(long markupSafeTest) {
		_markupSafeTest = markupSafeTest;
	}

	public long getMarkupEmissionTest() {
		return _markupEmissionTest;
	}

	public void setMarkupEmissionTest(long markupEmissionTest) {
		_markupEmissionTest = markupEmissionTest;
	}

	public long getMarkupControl() {
		return _markupControl;
	}

	public void setMarkupControl(long markupControl) {
		_markupControl = markupControl;
	}

	public long getRegisteredInspectionId() {
		return _registeredInspectionId;
	}

	public void setRegisteredInspectionId(long registeredInspectionId) {
		_registeredInspectionId = registeredInspectionId;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public long getHoSoThuTucId() {
		return _hoSoThuTucId;
	}

	public void setHoSoThuTucId(long hoSoThuTucId) {
		_hoSoThuTucId = hoSoThuTucId;
	}

	public double getOtherCosts() {
		return _otherCosts;
	}

	public void setOtherCosts(double otherCosts) {
		_otherCosts = otherCosts;
	}

	public long getMarkupPaid() {
		return _markupPaid;
	}

	public void setMarkupPaid(long markupPaid) {
		_markupPaid = markupPaid;
	}

	private long _id;
	private String _inspectionRecordNo;
	private Date _inspectionRecordDate;
	private String _corporationId;
	private long _inspectorId;
	private long _confirmedInspectionId;
	private long _customsDeclarationid;
	private String _inspectionSite;
	private Date _inspectionDateFrom;
	private Date _inspectionDateTo;
	private long _inspectionMode;
	private String _description;
	private long _attachedFile;
	private long _confirmedResult;
	private String _signName;
	private String _signTitle;
	private String _signPlace;
	private Date _signDate;
	private long _phieuXuLyPhuId;
	private long _markupSafeTest;
	private long _markupEmissionTest;
	private long _markupControl;
	private long _registeredInspectionId;
	private String _remarks;
	private long _hoSoThuTucId;
	private double _otherCosts;
	private long _markupPaid;
}