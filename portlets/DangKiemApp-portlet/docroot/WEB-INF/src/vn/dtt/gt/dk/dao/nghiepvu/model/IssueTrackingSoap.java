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
 * This class is used by SOAP remote services, specifically {@link vn.dtt.gt.dk.dao.nghiepvu.service.http.IssueTrackingServiceSoap}.
 *
 * @author win_64
 * @see vn.dtt.gt.dk.dao.nghiepvu.service.http.IssueTrackingServiceSoap
 * @generated
 */
public class IssueTrackingSoap implements Serializable {
	public static IssueTrackingSoap toSoapModel(IssueTracking model) {
		IssueTrackingSoap soapModel = new IssueTrackingSoap();

		soapModel.setId(model.getId());
		soapModel.setImportercode(model.getImportercode());
		soapModel.setImportername(model.getImportername());
		soapModel.setRegisterednumber(model.getRegisterednumber());
		soapModel.setInspectionrecordno(model.getInspectionrecordno());
		soapModel.setInspectionRecordDate(model.getInspectionRecordDate());
		soapModel.setCorporationId(model.getCorporationId());
		soapModel.setInspectorId(model.getInspectorId());
		soapModel.setVehicleClass(model.getVehicleClass());
		soapModel.setProductcode(model.getProductcode());
		soapModel.setProductname(model.getProductname());
		soapModel.setTotalvehicle(model.getTotalvehicle());
		soapModel.setCodeNumber(model.getCodeNumber());
		soapModel.setChassisNumber(model.getChassisNumber());
		soapModel.setEngineNumber(model.getEngineNumber());
		soapModel.setImportedorassembled(model.getImportedorassembled());
		soapModel.setIssuetrackingfromcustomer(model.getIssuetrackingfromcustomer());
		soapModel.setIssuetrackingbycorporation(model.getIssuetrackingbycorporation());
		soapModel.setIssuetrackingbyimportedgroup(model.getIssuetrackingbyimportedgroup());
		soapModel.setIssuediscovery(model.getIssuediscovery());
		soapModel.setIssuedescription(model.getIssuedescription());
		soapModel.setIssueVAQ1reason(model.getIssueVAQ1reason());
		soapModel.setIssueVAQ2troubleshooting(model.getIssueVAQ2troubleshooting());
		soapModel.setIssueVAQ3longtermsolution(model.getIssueVAQ3longtermsolution());
		soapModel.setIssueVAQ4precaution(model.getIssueVAQ4precaution());
		soapModel.setCreator(model.getCreator());
		soapModel.setCreateddate(model.getCreateddate());
		soapModel.setMarkupissueVAQ4(model.getMarkupissueVAQ4());
		soapModel.setMakerVAQ4(model.getMakerVAQ4());
		soapModel.setCheckerVAQ4(model.getCheckerVAQ4());
		soapModel.setApproverVAQ4(model.getApproverVAQ4());
		soapModel.setMakerVAQ4modified(model.getMakerVAQ4modified());
		soapModel.setCheckerVAQ4modified(model.getCheckerVAQ4modified());
		soapModel.setApproverVAQ4modified(model.getApproverVAQ4modified());
		soapModel.setMarkupissueVAQ1(model.getMarkupissueVAQ1());
		soapModel.setMakerVAQ1(model.getMakerVAQ1());
		soapModel.setCheckerVAQ1(model.getCheckerVAQ1());
		soapModel.setMakerVAQ1modified(model.getMakerVAQ1modified());
		soapModel.setCheckerVAQ1modified(model.getCheckerVAQ1modified());
		soapModel.setMarkupissueVAQ2(model.getMarkupissueVAQ2());
		soapModel.setMakerVAQ2(model.getMakerVAQ2());
		soapModel.setCheckerVAQ2(model.getCheckerVAQ2());
		soapModel.setMakerVAQ2modified(model.getMakerVAQ2modified());
		soapModel.setCheckerVAQ2modified(model.getCheckerVAQ2modified());
		soapModel.setMarkupissueVAQ3(model.getMarkupissueVAQ3());
		soapModel.setMakerVAQ3(model.getMakerVAQ3());
		soapModel.setCheckerVAQ3(model.getCheckerVAQ3());
		soapModel.setApproverVAQ3(model.getApproverVAQ3());
		soapModel.setMakerVAQ3modified(model.getMakerVAQ3modified());
		soapModel.setCheckerVAQ3modified(model.getCheckerVAQ3modified());
		soapModel.setApproverVAQ3modified(model.getApproverVAQ3modified());
		soapModel.setDefectStatus(model.getDefectStatus());
		soapModel.setSynchdate(model.getSynchdate());

		return soapModel;
	}

	public static IssueTrackingSoap[] toSoapModels(IssueTracking[] models) {
		IssueTrackingSoap[] soapModels = new IssueTrackingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static IssueTrackingSoap[][] toSoapModels(IssueTracking[][] models) {
		IssueTrackingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new IssueTrackingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new IssueTrackingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static IssueTrackingSoap[] toSoapModels(List<IssueTracking> models) {
		List<IssueTrackingSoap> soapModels = new ArrayList<IssueTrackingSoap>(models.size());

		for (IssueTracking model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new IssueTrackingSoap[soapModels.size()]);
	}

	public IssueTrackingSoap() {
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

	public String getImportercode() {
		return _importercode;
	}

	public void setImportercode(String importercode) {
		_importercode = importercode;
	}

	public String getImportername() {
		return _importername;
	}

	public void setImportername(String importername) {
		_importername = importername;
	}

	public String getRegisterednumber() {
		return _registerednumber;
	}

	public void setRegisterednumber(String registerednumber) {
		_registerednumber = registerednumber;
	}

	public String getInspectionrecordno() {
		return _inspectionrecordno;
	}

	public void setInspectionrecordno(String inspectionrecordno) {
		_inspectionrecordno = inspectionrecordno;
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

	public String getVehicleClass() {
		return _vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	public String getProductcode() {
		return _productcode;
	}

	public void setProductcode(String productcode) {
		_productcode = productcode;
	}

	public String getProductname() {
		return _productname;
	}

	public void setProductname(String productname) {
		_productname = productname;
	}

	public long getTotalvehicle() {
		return _totalvehicle;
	}

	public void setTotalvehicle(long totalvehicle) {
		_totalvehicle = totalvehicle;
	}

	public long getCodeNumber() {
		return _codeNumber;
	}

	public void setCodeNumber(long codeNumber) {
		_codeNumber = codeNumber;
	}

	public String getChassisNumber() {
		return _chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		_chassisNumber = chassisNumber;
	}

	public String getEngineNumber() {
		return _engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		_engineNumber = engineNumber;
	}

	public String getImportedorassembled() {
		return _importedorassembled;
	}

	public void setImportedorassembled(String importedorassembled) {
		_importedorassembled = importedorassembled;
	}

	public String getIssuetrackingfromcustomer() {
		return _issuetrackingfromcustomer;
	}

	public void setIssuetrackingfromcustomer(String issuetrackingfromcustomer) {
		_issuetrackingfromcustomer = issuetrackingfromcustomer;
	}

	public String getIssuetrackingbycorporation() {
		return _issuetrackingbycorporation;
	}

	public void setIssuetrackingbycorporation(String issuetrackingbycorporation) {
		_issuetrackingbycorporation = issuetrackingbycorporation;
	}

	public String getIssuetrackingbyimportedgroup() {
		return _issuetrackingbyimportedgroup;
	}

	public void setIssuetrackingbyimportedgroup(
		String issuetrackingbyimportedgroup) {
		_issuetrackingbyimportedgroup = issuetrackingbyimportedgroup;
	}

	public long getIssuediscovery() {
		return _issuediscovery;
	}

	public void setIssuediscovery(long issuediscovery) {
		_issuediscovery = issuediscovery;
	}

	public String getIssuedescription() {
		return _issuedescription;
	}

	public void setIssuedescription(String issuedescription) {
		_issuedescription = issuedescription;
	}

	public String getIssueVAQ1reason() {
		return _issueVAQ1reason;
	}

	public void setIssueVAQ1reason(String issueVAQ1reason) {
		_issueVAQ1reason = issueVAQ1reason;
	}

	public String getIssueVAQ2troubleshooting() {
		return _issueVAQ2troubleshooting;
	}

	public void setIssueVAQ2troubleshooting(String issueVAQ2troubleshooting) {
		_issueVAQ2troubleshooting = issueVAQ2troubleshooting;
	}

	public String getIssueVAQ3longtermsolution() {
		return _issueVAQ3longtermsolution;
	}

	public void setIssueVAQ3longtermsolution(String issueVAQ3longtermsolution) {
		_issueVAQ3longtermsolution = issueVAQ3longtermsolution;
	}

	public String getIssueVAQ4precaution() {
		return _issueVAQ4precaution;
	}

	public void setIssueVAQ4precaution(String issueVAQ4precaution) {
		_issueVAQ4precaution = issueVAQ4precaution;
	}

	public String getCreator() {
		return _creator;
	}

	public void setCreator(String creator) {
		_creator = creator;
	}

	public Date getCreateddate() {
		return _createddate;
	}

	public void setCreateddate(Date createddate) {
		_createddate = createddate;
	}

	public int getMarkupissueVAQ4() {
		return _markupissueVAQ4;
	}

	public void setMarkupissueVAQ4(int markupissueVAQ4) {
		_markupissueVAQ4 = markupissueVAQ4;
	}

	public String getMakerVAQ4() {
		return _makerVAQ4;
	}

	public void setMakerVAQ4(String makerVAQ4) {
		_makerVAQ4 = makerVAQ4;
	}

	public String getCheckerVAQ4() {
		return _checkerVAQ4;
	}

	public void setCheckerVAQ4(String checkerVAQ4) {
		_checkerVAQ4 = checkerVAQ4;
	}

	public String getApproverVAQ4() {
		return _approverVAQ4;
	}

	public void setApproverVAQ4(String approverVAQ4) {
		_approverVAQ4 = approverVAQ4;
	}

	public Date getMakerVAQ4modified() {
		return _makerVAQ4modified;
	}

	public void setMakerVAQ4modified(Date makerVAQ4modified) {
		_makerVAQ4modified = makerVAQ4modified;
	}

	public Date getCheckerVAQ4modified() {
		return _checkerVAQ4modified;
	}

	public void setCheckerVAQ4modified(Date checkerVAQ4modified) {
		_checkerVAQ4modified = checkerVAQ4modified;
	}

	public Date getApproverVAQ4modified() {
		return _approverVAQ4modified;
	}

	public void setApproverVAQ4modified(Date approverVAQ4modified) {
		_approverVAQ4modified = approverVAQ4modified;
	}

	public int getMarkupissueVAQ1() {
		return _markupissueVAQ1;
	}

	public void setMarkupissueVAQ1(int markupissueVAQ1) {
		_markupissueVAQ1 = markupissueVAQ1;
	}

	public String getMakerVAQ1() {
		return _makerVAQ1;
	}

	public void setMakerVAQ1(String makerVAQ1) {
		_makerVAQ1 = makerVAQ1;
	}

	public String getCheckerVAQ1() {
		return _checkerVAQ1;
	}

	public void setCheckerVAQ1(String checkerVAQ1) {
		_checkerVAQ1 = checkerVAQ1;
	}

	public Date getMakerVAQ1modified() {
		return _makerVAQ1modified;
	}

	public void setMakerVAQ1modified(Date makerVAQ1modified) {
		_makerVAQ1modified = makerVAQ1modified;
	}

	public Date getCheckerVAQ1modified() {
		return _checkerVAQ1modified;
	}

	public void setCheckerVAQ1modified(Date checkerVAQ1modified) {
		_checkerVAQ1modified = checkerVAQ1modified;
	}

	public int getMarkupissueVAQ2() {
		return _markupissueVAQ2;
	}

	public void setMarkupissueVAQ2(int markupissueVAQ2) {
		_markupissueVAQ2 = markupissueVAQ2;
	}

	public String getMakerVAQ2() {
		return _makerVAQ2;
	}

	public void setMakerVAQ2(String makerVAQ2) {
		_makerVAQ2 = makerVAQ2;
	}

	public String getCheckerVAQ2() {
		return _checkerVAQ2;
	}

	public void setCheckerVAQ2(String checkerVAQ2) {
		_checkerVAQ2 = checkerVAQ2;
	}

	public Date getMakerVAQ2modified() {
		return _makerVAQ2modified;
	}

	public void setMakerVAQ2modified(Date makerVAQ2modified) {
		_makerVAQ2modified = makerVAQ2modified;
	}

	public Date getCheckerVAQ2modified() {
		return _checkerVAQ2modified;
	}

	public void setCheckerVAQ2modified(Date checkerVAQ2modified) {
		_checkerVAQ2modified = checkerVAQ2modified;
	}

	public int getMarkupissueVAQ3() {
		return _markupissueVAQ3;
	}

	public void setMarkupissueVAQ3(int markupissueVAQ3) {
		_markupissueVAQ3 = markupissueVAQ3;
	}

	public String getMakerVAQ3() {
		return _makerVAQ3;
	}

	public void setMakerVAQ3(String makerVAQ3) {
		_makerVAQ3 = makerVAQ3;
	}

	public String getCheckerVAQ3() {
		return _checkerVAQ3;
	}

	public void setCheckerVAQ3(String checkerVAQ3) {
		_checkerVAQ3 = checkerVAQ3;
	}

	public String getApproverVAQ3() {
		return _approverVAQ3;
	}

	public void setApproverVAQ3(String approverVAQ3) {
		_approverVAQ3 = approverVAQ3;
	}

	public Date getMakerVAQ3modified() {
		return _makerVAQ3modified;
	}

	public void setMakerVAQ3modified(Date makerVAQ3modified) {
		_makerVAQ3modified = makerVAQ3modified;
	}

	public Date getCheckerVAQ3modified() {
		return _checkerVAQ3modified;
	}

	public void setCheckerVAQ3modified(Date checkerVAQ3modified) {
		_checkerVAQ3modified = checkerVAQ3modified;
	}

	public Date getApproverVAQ3modified() {
		return _approverVAQ3modified;
	}

	public void setApproverVAQ3modified(Date approverVAQ3modified) {
		_approverVAQ3modified = approverVAQ3modified;
	}

	public int getDefectStatus() {
		return _defectStatus;
	}

	public void setDefectStatus(int defectStatus) {
		_defectStatus = defectStatus;
	}

	public Date getSynchdate() {
		return _synchdate;
	}

	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;
	}

	private long _id;
	private String _importercode;
	private String _importername;
	private String _registerednumber;
	private String _inspectionrecordno;
	private Date _inspectionRecordDate;
	private String _corporationId;
	private long _inspectorId;
	private String _vehicleClass;
	private String _productcode;
	private String _productname;
	private long _totalvehicle;
	private long _codeNumber;
	private String _chassisNumber;
	private String _engineNumber;
	private String _importedorassembled;
	private String _issuetrackingfromcustomer;
	private String _issuetrackingbycorporation;
	private String _issuetrackingbyimportedgroup;
	private long _issuediscovery;
	private String _issuedescription;
	private String _issueVAQ1reason;
	private String _issueVAQ2troubleshooting;
	private String _issueVAQ3longtermsolution;
	private String _issueVAQ4precaution;
	private String _creator;
	private Date _createddate;
	private int _markupissueVAQ4;
	private String _makerVAQ4;
	private String _checkerVAQ4;
	private String _approverVAQ4;
	private Date _makerVAQ4modified;
	private Date _checkerVAQ4modified;
	private Date _approverVAQ4modified;
	private int _markupissueVAQ1;
	private String _makerVAQ1;
	private String _checkerVAQ1;
	private Date _makerVAQ1modified;
	private Date _checkerVAQ1modified;
	private int _markupissueVAQ2;
	private String _makerVAQ2;
	private String _checkerVAQ2;
	private Date _makerVAQ2modified;
	private Date _checkerVAQ2modified;
	private int _markupissueVAQ3;
	private String _makerVAQ3;
	private String _checkerVAQ3;
	private String _approverVAQ3;
	private Date _makerVAQ3modified;
	private Date _checkerVAQ3modified;
	private Date _approverVAQ3modified;
	private int _defectStatus;
	private Date _synchdate;
}