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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link IssueTracking}.
 * </p>
 *
 * @author win_64
 * @see IssueTracking
 * @generated
 */
public class IssueTrackingWrapper implements IssueTracking,
	ModelWrapper<IssueTracking> {
	public IssueTrackingWrapper(IssueTracking issueTracking) {
		_issueTracking = issueTracking;
	}

	@Override
	public Class<?> getModelClass() {
		return IssueTracking.class;
	}

	@Override
	public String getModelClassName() {
		return IssueTracking.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("importercode", getImportercode());
		attributes.put("importername", getImportername());
		attributes.put("registerednumber", getRegisterednumber());
		attributes.put("inspectionrecordno", getInspectionrecordno());
		attributes.put("inspectionRecordDate", getInspectionRecordDate());
		attributes.put("corporationId", getCorporationId());
		attributes.put("inspectorId", getInspectorId());
		attributes.put("vehicleClass", getVehicleClass());
		attributes.put("productcode", getProductcode());
		attributes.put("productname", getProductname());
		attributes.put("totalvehicle", getTotalvehicle());
		attributes.put("codeNumber", getCodeNumber());
		attributes.put("chassisNumber", getChassisNumber());
		attributes.put("engineNumber", getEngineNumber());
		attributes.put("importedorassembled", getImportedorassembled());
		attributes.put("issuetrackingfromcustomer",
			getIssuetrackingfromcustomer());
		attributes.put("issuetrackingbycorporation",
			getIssuetrackingbycorporation());
		attributes.put("issuetrackingbyimportedgroup",
			getIssuetrackingbyimportedgroup());
		attributes.put("issuediscovery", getIssuediscovery());
		attributes.put("issuedescription", getIssuedescription());
		attributes.put("issueVAQ1reason", getIssueVAQ1reason());
		attributes.put("issueVAQ2troubleshooting", getIssueVAQ2troubleshooting());
		attributes.put("issueVAQ3longtermsolution",
			getIssueVAQ3longtermsolution());
		attributes.put("issueVAQ4precaution", getIssueVAQ4precaution());
		attributes.put("creator", getCreator());
		attributes.put("createddate", getCreateddate());
		attributes.put("markupissueVAQ4", getMarkupissueVAQ4());
		attributes.put("makerVAQ4", getMakerVAQ4());
		attributes.put("checkerVAQ4", getCheckerVAQ4());
		attributes.put("approverVAQ4", getApproverVAQ4());
		attributes.put("makerVAQ4modified", getMakerVAQ4modified());
		attributes.put("checkerVAQ4modified", getCheckerVAQ4modified());
		attributes.put("approverVAQ4modified", getApproverVAQ4modified());
		attributes.put("markupissueVAQ1", getMarkupissueVAQ1());
		attributes.put("makerVAQ1", getMakerVAQ1());
		attributes.put("checkerVAQ1", getCheckerVAQ1());
		attributes.put("makerVAQ1modified", getMakerVAQ1modified());
		attributes.put("checkerVAQ1modified", getCheckerVAQ1modified());
		attributes.put("markupissueVAQ2", getMarkupissueVAQ2());
		attributes.put("makerVAQ2", getMakerVAQ2());
		attributes.put("checkerVAQ2", getCheckerVAQ2());
		attributes.put("makerVAQ2modified", getMakerVAQ2modified());
		attributes.put("checkerVAQ2modified", getCheckerVAQ2modified());
		attributes.put("markupissueVAQ3", getMarkupissueVAQ3());
		attributes.put("makerVAQ3", getMakerVAQ3());
		attributes.put("checkerVAQ3", getCheckerVAQ3());
		attributes.put("approverVAQ3", getApproverVAQ3());
		attributes.put("makerVAQ3modified", getMakerVAQ3modified());
		attributes.put("checkerVAQ3modified", getCheckerVAQ3modified());
		attributes.put("approverVAQ3modified", getApproverVAQ3modified());
		attributes.put("defectStatus", getDefectStatus());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String importercode = (String)attributes.get("importercode");

		if (importercode != null) {
			setImportercode(importercode);
		}

		String importername = (String)attributes.get("importername");

		if (importername != null) {
			setImportername(importername);
		}

		String registerednumber = (String)attributes.get("registerednumber");

		if (registerednumber != null) {
			setRegisterednumber(registerednumber);
		}

		String inspectionrecordno = (String)attributes.get("inspectionrecordno");

		if (inspectionrecordno != null) {
			setInspectionrecordno(inspectionrecordno);
		}

		Date inspectionRecordDate = (Date)attributes.get("inspectionRecordDate");

		if (inspectionRecordDate != null) {
			setInspectionRecordDate(inspectionRecordDate);
		}

		String corporationId = (String)attributes.get("corporationId");

		if (corporationId != null) {
			setCorporationId(corporationId);
		}

		Long inspectorId = (Long)attributes.get("inspectorId");

		if (inspectorId != null) {
			setInspectorId(inspectorId);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
		}

		String productcode = (String)attributes.get("productcode");

		if (productcode != null) {
			setProductcode(productcode);
		}

		String productname = (String)attributes.get("productname");

		if (productname != null) {
			setProductname(productname);
		}

		Long totalvehicle = (Long)attributes.get("totalvehicle");

		if (totalvehicle != null) {
			setTotalvehicle(totalvehicle);
		}

		Long codeNumber = (Long)attributes.get("codeNumber");

		if (codeNumber != null) {
			setCodeNumber(codeNumber);
		}

		String chassisNumber = (String)attributes.get("chassisNumber");

		if (chassisNumber != null) {
			setChassisNumber(chassisNumber);
		}

		String engineNumber = (String)attributes.get("engineNumber");

		if (engineNumber != null) {
			setEngineNumber(engineNumber);
		}

		String importedorassembled = (String)attributes.get(
				"importedorassembled");

		if (importedorassembled != null) {
			setImportedorassembled(importedorassembled);
		}

		String issuetrackingfromcustomer = (String)attributes.get(
				"issuetrackingfromcustomer");

		if (issuetrackingfromcustomer != null) {
			setIssuetrackingfromcustomer(issuetrackingfromcustomer);
		}

		String issuetrackingbycorporation = (String)attributes.get(
				"issuetrackingbycorporation");

		if (issuetrackingbycorporation != null) {
			setIssuetrackingbycorporation(issuetrackingbycorporation);
		}

		String issuetrackingbyimportedgroup = (String)attributes.get(
				"issuetrackingbyimportedgroup");

		if (issuetrackingbyimportedgroup != null) {
			setIssuetrackingbyimportedgroup(issuetrackingbyimportedgroup);
		}

		Long issuediscovery = (Long)attributes.get("issuediscovery");

		if (issuediscovery != null) {
			setIssuediscovery(issuediscovery);
		}

		String issuedescription = (String)attributes.get("issuedescription");

		if (issuedescription != null) {
			setIssuedescription(issuedescription);
		}

		String issueVAQ1reason = (String)attributes.get("issueVAQ1reason");

		if (issueVAQ1reason != null) {
			setIssueVAQ1reason(issueVAQ1reason);
		}

		String issueVAQ2troubleshooting = (String)attributes.get(
				"issueVAQ2troubleshooting");

		if (issueVAQ2troubleshooting != null) {
			setIssueVAQ2troubleshooting(issueVAQ2troubleshooting);
		}

		String issueVAQ3longtermsolution = (String)attributes.get(
				"issueVAQ3longtermsolution");

		if (issueVAQ3longtermsolution != null) {
			setIssueVAQ3longtermsolution(issueVAQ3longtermsolution);
		}

		String issueVAQ4precaution = (String)attributes.get(
				"issueVAQ4precaution");

		if (issueVAQ4precaution != null) {
			setIssueVAQ4precaution(issueVAQ4precaution);
		}

		String creator = (String)attributes.get("creator");

		if (creator != null) {
			setCreator(creator);
		}

		Date createddate = (Date)attributes.get("createddate");

		if (createddate != null) {
			setCreateddate(createddate);
		}

		Integer markupissueVAQ4 = (Integer)attributes.get("markupissueVAQ4");

		if (markupissueVAQ4 != null) {
			setMarkupissueVAQ4(markupissueVAQ4);
		}

		String makerVAQ4 = (String)attributes.get("makerVAQ4");

		if (makerVAQ4 != null) {
			setMakerVAQ4(makerVAQ4);
		}

		String checkerVAQ4 = (String)attributes.get("checkerVAQ4");

		if (checkerVAQ4 != null) {
			setCheckerVAQ4(checkerVAQ4);
		}

		String approverVAQ4 = (String)attributes.get("approverVAQ4");

		if (approverVAQ4 != null) {
			setApproverVAQ4(approverVAQ4);
		}

		Date makerVAQ4modified = (Date)attributes.get("makerVAQ4modified");

		if (makerVAQ4modified != null) {
			setMakerVAQ4modified(makerVAQ4modified);
		}

		Date checkerVAQ4modified = (Date)attributes.get("checkerVAQ4modified");

		if (checkerVAQ4modified != null) {
			setCheckerVAQ4modified(checkerVAQ4modified);
		}

		Date approverVAQ4modified = (Date)attributes.get("approverVAQ4modified");

		if (approverVAQ4modified != null) {
			setApproverVAQ4modified(approverVAQ4modified);
		}

		Integer markupissueVAQ1 = (Integer)attributes.get("markupissueVAQ1");

		if (markupissueVAQ1 != null) {
			setMarkupissueVAQ1(markupissueVAQ1);
		}

		String makerVAQ1 = (String)attributes.get("makerVAQ1");

		if (makerVAQ1 != null) {
			setMakerVAQ1(makerVAQ1);
		}

		String checkerVAQ1 = (String)attributes.get("checkerVAQ1");

		if (checkerVAQ1 != null) {
			setCheckerVAQ1(checkerVAQ1);
		}

		Date makerVAQ1modified = (Date)attributes.get("makerVAQ1modified");

		if (makerVAQ1modified != null) {
			setMakerVAQ1modified(makerVAQ1modified);
		}

		Date checkerVAQ1modified = (Date)attributes.get("checkerVAQ1modified");

		if (checkerVAQ1modified != null) {
			setCheckerVAQ1modified(checkerVAQ1modified);
		}

		Integer markupissueVAQ2 = (Integer)attributes.get("markupissueVAQ2");

		if (markupissueVAQ2 != null) {
			setMarkupissueVAQ2(markupissueVAQ2);
		}

		String makerVAQ2 = (String)attributes.get("makerVAQ2");

		if (makerVAQ2 != null) {
			setMakerVAQ2(makerVAQ2);
		}

		String checkerVAQ2 = (String)attributes.get("checkerVAQ2");

		if (checkerVAQ2 != null) {
			setCheckerVAQ2(checkerVAQ2);
		}

		Date makerVAQ2modified = (Date)attributes.get("makerVAQ2modified");

		if (makerVAQ2modified != null) {
			setMakerVAQ2modified(makerVAQ2modified);
		}

		Date checkerVAQ2modified = (Date)attributes.get("checkerVAQ2modified");

		if (checkerVAQ2modified != null) {
			setCheckerVAQ2modified(checkerVAQ2modified);
		}

		Integer markupissueVAQ3 = (Integer)attributes.get("markupissueVAQ3");

		if (markupissueVAQ3 != null) {
			setMarkupissueVAQ3(markupissueVAQ3);
		}

		String makerVAQ3 = (String)attributes.get("makerVAQ3");

		if (makerVAQ3 != null) {
			setMakerVAQ3(makerVAQ3);
		}

		String checkerVAQ3 = (String)attributes.get("checkerVAQ3");

		if (checkerVAQ3 != null) {
			setCheckerVAQ3(checkerVAQ3);
		}

		String approverVAQ3 = (String)attributes.get("approverVAQ3");

		if (approverVAQ3 != null) {
			setApproverVAQ3(approverVAQ3);
		}

		Date makerVAQ3modified = (Date)attributes.get("makerVAQ3modified");

		if (makerVAQ3modified != null) {
			setMakerVAQ3modified(makerVAQ3modified);
		}

		Date checkerVAQ3modified = (Date)attributes.get("checkerVAQ3modified");

		if (checkerVAQ3modified != null) {
			setCheckerVAQ3modified(checkerVAQ3modified);
		}

		Date approverVAQ3modified = (Date)attributes.get("approverVAQ3modified");

		if (approverVAQ3modified != null) {
			setApproverVAQ3modified(approverVAQ3modified);
		}

		Integer defectStatus = (Integer)attributes.get("defectStatus");

		if (defectStatus != null) {
			setDefectStatus(defectStatus);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this issue tracking.
	*
	* @return the primary key of this issue tracking
	*/
	@Override
	public long getPrimaryKey() {
		return _issueTracking.getPrimaryKey();
	}

	/**
	* Sets the primary key of this issue tracking.
	*
	* @param primaryKey the primary key of this issue tracking
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_issueTracking.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this issue tracking.
	*
	* @return the ID of this issue tracking
	*/
	@Override
	public long getId() {
		return _issueTracking.getId();
	}

	/**
	* Sets the ID of this issue tracking.
	*
	* @param id the ID of this issue tracking
	*/
	@Override
	public void setId(long id) {
		_issueTracking.setId(id);
	}

	/**
	* Returns the importercode of this issue tracking.
	*
	* @return the importercode of this issue tracking
	*/
	@Override
	public java.lang.String getImportercode() {
		return _issueTracking.getImportercode();
	}

	/**
	* Sets the importercode of this issue tracking.
	*
	* @param importercode the importercode of this issue tracking
	*/
	@Override
	public void setImportercode(java.lang.String importercode) {
		_issueTracking.setImportercode(importercode);
	}

	/**
	* Returns the importername of this issue tracking.
	*
	* @return the importername of this issue tracking
	*/
	@Override
	public java.lang.String getImportername() {
		return _issueTracking.getImportername();
	}

	/**
	* Sets the importername of this issue tracking.
	*
	* @param importername the importername of this issue tracking
	*/
	@Override
	public void setImportername(java.lang.String importername) {
		_issueTracking.setImportername(importername);
	}

	/**
	* Returns the registerednumber of this issue tracking.
	*
	* @return the registerednumber of this issue tracking
	*/
	@Override
	public java.lang.String getRegisterednumber() {
		return _issueTracking.getRegisterednumber();
	}

	/**
	* Sets the registerednumber of this issue tracking.
	*
	* @param registerednumber the registerednumber of this issue tracking
	*/
	@Override
	public void setRegisterednumber(java.lang.String registerednumber) {
		_issueTracking.setRegisterednumber(registerednumber);
	}

	/**
	* Returns the inspectionrecordno of this issue tracking.
	*
	* @return the inspectionrecordno of this issue tracking
	*/
	@Override
	public java.lang.String getInspectionrecordno() {
		return _issueTracking.getInspectionrecordno();
	}

	/**
	* Sets the inspectionrecordno of this issue tracking.
	*
	* @param inspectionrecordno the inspectionrecordno of this issue tracking
	*/
	@Override
	public void setInspectionrecordno(java.lang.String inspectionrecordno) {
		_issueTracking.setInspectionrecordno(inspectionrecordno);
	}

	/**
	* Returns the inspection record date of this issue tracking.
	*
	* @return the inspection record date of this issue tracking
	*/
	@Override
	public java.util.Date getInspectionRecordDate() {
		return _issueTracking.getInspectionRecordDate();
	}

	/**
	* Sets the inspection record date of this issue tracking.
	*
	* @param inspectionRecordDate the inspection record date of this issue tracking
	*/
	@Override
	public void setInspectionRecordDate(java.util.Date inspectionRecordDate) {
		_issueTracking.setInspectionRecordDate(inspectionRecordDate);
	}

	/**
	* Returns the corporation ID of this issue tracking.
	*
	* @return the corporation ID of this issue tracking
	*/
	@Override
	public java.lang.String getCorporationId() {
		return _issueTracking.getCorporationId();
	}

	/**
	* Sets the corporation ID of this issue tracking.
	*
	* @param corporationId the corporation ID of this issue tracking
	*/
	@Override
	public void setCorporationId(java.lang.String corporationId) {
		_issueTracking.setCorporationId(corporationId);
	}

	/**
	* Returns the inspector ID of this issue tracking.
	*
	* @return the inspector ID of this issue tracking
	*/
	@Override
	public long getInspectorId() {
		return _issueTracking.getInspectorId();
	}

	/**
	* Sets the inspector ID of this issue tracking.
	*
	* @param inspectorId the inspector ID of this issue tracking
	*/
	@Override
	public void setInspectorId(long inspectorId) {
		_issueTracking.setInspectorId(inspectorId);
	}

	/**
	* Returns the vehicle class of this issue tracking.
	*
	* @return the vehicle class of this issue tracking
	*/
	@Override
	public java.lang.String getVehicleClass() {
		return _issueTracking.getVehicleClass();
	}

	/**
	* Sets the vehicle class of this issue tracking.
	*
	* @param vehicleClass the vehicle class of this issue tracking
	*/
	@Override
	public void setVehicleClass(java.lang.String vehicleClass) {
		_issueTracking.setVehicleClass(vehicleClass);
	}

	/**
	* Returns the productcode of this issue tracking.
	*
	* @return the productcode of this issue tracking
	*/
	@Override
	public java.lang.String getProductcode() {
		return _issueTracking.getProductcode();
	}

	/**
	* Sets the productcode of this issue tracking.
	*
	* @param productcode the productcode of this issue tracking
	*/
	@Override
	public void setProductcode(java.lang.String productcode) {
		_issueTracking.setProductcode(productcode);
	}

	/**
	* Returns the productname of this issue tracking.
	*
	* @return the productname of this issue tracking
	*/
	@Override
	public java.lang.String getProductname() {
		return _issueTracking.getProductname();
	}

	/**
	* Sets the productname of this issue tracking.
	*
	* @param productname the productname of this issue tracking
	*/
	@Override
	public void setProductname(java.lang.String productname) {
		_issueTracking.setProductname(productname);
	}

	/**
	* Returns the totalvehicle of this issue tracking.
	*
	* @return the totalvehicle of this issue tracking
	*/
	@Override
	public long getTotalvehicle() {
		return _issueTracking.getTotalvehicle();
	}

	/**
	* Sets the totalvehicle of this issue tracking.
	*
	* @param totalvehicle the totalvehicle of this issue tracking
	*/
	@Override
	public void setTotalvehicle(long totalvehicle) {
		_issueTracking.setTotalvehicle(totalvehicle);
	}

	/**
	* Returns the code number of this issue tracking.
	*
	* @return the code number of this issue tracking
	*/
	@Override
	public long getCodeNumber() {
		return _issueTracking.getCodeNumber();
	}

	/**
	* Sets the code number of this issue tracking.
	*
	* @param codeNumber the code number of this issue tracking
	*/
	@Override
	public void setCodeNumber(long codeNumber) {
		_issueTracking.setCodeNumber(codeNumber);
	}

	/**
	* Returns the chassis number of this issue tracking.
	*
	* @return the chassis number of this issue tracking
	*/
	@Override
	public java.lang.String getChassisNumber() {
		return _issueTracking.getChassisNumber();
	}

	/**
	* Sets the chassis number of this issue tracking.
	*
	* @param chassisNumber the chassis number of this issue tracking
	*/
	@Override
	public void setChassisNumber(java.lang.String chassisNumber) {
		_issueTracking.setChassisNumber(chassisNumber);
	}

	/**
	* Returns the engine number of this issue tracking.
	*
	* @return the engine number of this issue tracking
	*/
	@Override
	public java.lang.String getEngineNumber() {
		return _issueTracking.getEngineNumber();
	}

	/**
	* Sets the engine number of this issue tracking.
	*
	* @param engineNumber the engine number of this issue tracking
	*/
	@Override
	public void setEngineNumber(java.lang.String engineNumber) {
		_issueTracking.setEngineNumber(engineNumber);
	}

	/**
	* Returns the importedorassembled of this issue tracking.
	*
	* @return the importedorassembled of this issue tracking
	*/
	@Override
	public java.lang.String getImportedorassembled() {
		return _issueTracking.getImportedorassembled();
	}

	/**
	* Sets the importedorassembled of this issue tracking.
	*
	* @param importedorassembled the importedorassembled of this issue tracking
	*/
	@Override
	public void setImportedorassembled(java.lang.String importedorassembled) {
		_issueTracking.setImportedorassembled(importedorassembled);
	}

	/**
	* Returns the issuetrackingfromcustomer of this issue tracking.
	*
	* @return the issuetrackingfromcustomer of this issue tracking
	*/
	@Override
	public java.lang.String getIssuetrackingfromcustomer() {
		return _issueTracking.getIssuetrackingfromcustomer();
	}

	/**
	* Sets the issuetrackingfromcustomer of this issue tracking.
	*
	* @param issuetrackingfromcustomer the issuetrackingfromcustomer of this issue tracking
	*/
	@Override
	public void setIssuetrackingfromcustomer(
		java.lang.String issuetrackingfromcustomer) {
		_issueTracking.setIssuetrackingfromcustomer(issuetrackingfromcustomer);
	}

	/**
	* Returns the issuetrackingbycorporation of this issue tracking.
	*
	* @return the issuetrackingbycorporation of this issue tracking
	*/
	@Override
	public java.lang.String getIssuetrackingbycorporation() {
		return _issueTracking.getIssuetrackingbycorporation();
	}

	/**
	* Sets the issuetrackingbycorporation of this issue tracking.
	*
	* @param issuetrackingbycorporation the issuetrackingbycorporation of this issue tracking
	*/
	@Override
	public void setIssuetrackingbycorporation(
		java.lang.String issuetrackingbycorporation) {
		_issueTracking.setIssuetrackingbycorporation(issuetrackingbycorporation);
	}

	/**
	* Returns the issuetrackingbyimportedgroup of this issue tracking.
	*
	* @return the issuetrackingbyimportedgroup of this issue tracking
	*/
	@Override
	public java.lang.String getIssuetrackingbyimportedgroup() {
		return _issueTracking.getIssuetrackingbyimportedgroup();
	}

	/**
	* Sets the issuetrackingbyimportedgroup of this issue tracking.
	*
	* @param issuetrackingbyimportedgroup the issuetrackingbyimportedgroup of this issue tracking
	*/
	@Override
	public void setIssuetrackingbyimportedgroup(
		java.lang.String issuetrackingbyimportedgroup) {
		_issueTracking.setIssuetrackingbyimportedgroup(issuetrackingbyimportedgroup);
	}

	/**
	* Returns the issuediscovery of this issue tracking.
	*
	* @return the issuediscovery of this issue tracking
	*/
	@Override
	public long getIssuediscovery() {
		return _issueTracking.getIssuediscovery();
	}

	/**
	* Sets the issuediscovery of this issue tracking.
	*
	* @param issuediscovery the issuediscovery of this issue tracking
	*/
	@Override
	public void setIssuediscovery(long issuediscovery) {
		_issueTracking.setIssuediscovery(issuediscovery);
	}

	/**
	* Returns the issuedescription of this issue tracking.
	*
	* @return the issuedescription of this issue tracking
	*/
	@Override
	public java.lang.String getIssuedescription() {
		return _issueTracking.getIssuedescription();
	}

	/**
	* Sets the issuedescription of this issue tracking.
	*
	* @param issuedescription the issuedescription of this issue tracking
	*/
	@Override
	public void setIssuedescription(java.lang.String issuedescription) {
		_issueTracking.setIssuedescription(issuedescription);
	}

	/**
	* Returns the issue v a q1reason of this issue tracking.
	*
	* @return the issue v a q1reason of this issue tracking
	*/
	@Override
	public java.lang.String getIssueVAQ1reason() {
		return _issueTracking.getIssueVAQ1reason();
	}

	/**
	* Sets the issue v a q1reason of this issue tracking.
	*
	* @param issueVAQ1reason the issue v a q1reason of this issue tracking
	*/
	@Override
	public void setIssueVAQ1reason(java.lang.String issueVAQ1reason) {
		_issueTracking.setIssueVAQ1reason(issueVAQ1reason);
	}

	/**
	* Returns the issue v a q2troubleshooting of this issue tracking.
	*
	* @return the issue v a q2troubleshooting of this issue tracking
	*/
	@Override
	public java.lang.String getIssueVAQ2troubleshooting() {
		return _issueTracking.getIssueVAQ2troubleshooting();
	}

	/**
	* Sets the issue v a q2troubleshooting of this issue tracking.
	*
	* @param issueVAQ2troubleshooting the issue v a q2troubleshooting of this issue tracking
	*/
	@Override
	public void setIssueVAQ2troubleshooting(
		java.lang.String issueVAQ2troubleshooting) {
		_issueTracking.setIssueVAQ2troubleshooting(issueVAQ2troubleshooting);
	}

	/**
	* Returns the issue v a q3longtermsolution of this issue tracking.
	*
	* @return the issue v a q3longtermsolution of this issue tracking
	*/
	@Override
	public java.lang.String getIssueVAQ3longtermsolution() {
		return _issueTracking.getIssueVAQ3longtermsolution();
	}

	/**
	* Sets the issue v a q3longtermsolution of this issue tracking.
	*
	* @param issueVAQ3longtermsolution the issue v a q3longtermsolution of this issue tracking
	*/
	@Override
	public void setIssueVAQ3longtermsolution(
		java.lang.String issueVAQ3longtermsolution) {
		_issueTracking.setIssueVAQ3longtermsolution(issueVAQ3longtermsolution);
	}

	/**
	* Returns the issue v a q4precaution of this issue tracking.
	*
	* @return the issue v a q4precaution of this issue tracking
	*/
	@Override
	public java.lang.String getIssueVAQ4precaution() {
		return _issueTracking.getIssueVAQ4precaution();
	}

	/**
	* Sets the issue v a q4precaution of this issue tracking.
	*
	* @param issueVAQ4precaution the issue v a q4precaution of this issue tracking
	*/
	@Override
	public void setIssueVAQ4precaution(java.lang.String issueVAQ4precaution) {
		_issueTracking.setIssueVAQ4precaution(issueVAQ4precaution);
	}

	/**
	* Returns the creator of this issue tracking.
	*
	* @return the creator of this issue tracking
	*/
	@Override
	public java.lang.String getCreator() {
		return _issueTracking.getCreator();
	}

	/**
	* Sets the creator of this issue tracking.
	*
	* @param creator the creator of this issue tracking
	*/
	@Override
	public void setCreator(java.lang.String creator) {
		_issueTracking.setCreator(creator);
	}

	/**
	* Returns the createddate of this issue tracking.
	*
	* @return the createddate of this issue tracking
	*/
	@Override
	public java.util.Date getCreateddate() {
		return _issueTracking.getCreateddate();
	}

	/**
	* Sets the createddate of this issue tracking.
	*
	* @param createddate the createddate of this issue tracking
	*/
	@Override
	public void setCreateddate(java.util.Date createddate) {
		_issueTracking.setCreateddate(createddate);
	}

	/**
	* Returns the markupissue v a q4 of this issue tracking.
	*
	* @return the markupissue v a q4 of this issue tracking
	*/
	@Override
	public int getMarkupissueVAQ4() {
		return _issueTracking.getMarkupissueVAQ4();
	}

	/**
	* Sets the markupissue v a q4 of this issue tracking.
	*
	* @param markupissueVAQ4 the markupissue v a q4 of this issue tracking
	*/
	@Override
	public void setMarkupissueVAQ4(int markupissueVAQ4) {
		_issueTracking.setMarkupissueVAQ4(markupissueVAQ4);
	}

	/**
	* Returns the maker v a q4 of this issue tracking.
	*
	* @return the maker v a q4 of this issue tracking
	*/
	@Override
	public java.lang.String getMakerVAQ4() {
		return _issueTracking.getMakerVAQ4();
	}

	/**
	* Sets the maker v a q4 of this issue tracking.
	*
	* @param makerVAQ4 the maker v a q4 of this issue tracking
	*/
	@Override
	public void setMakerVAQ4(java.lang.String makerVAQ4) {
		_issueTracking.setMakerVAQ4(makerVAQ4);
	}

	/**
	* Returns the checker v a q4 of this issue tracking.
	*
	* @return the checker v a q4 of this issue tracking
	*/
	@Override
	public java.lang.String getCheckerVAQ4() {
		return _issueTracking.getCheckerVAQ4();
	}

	/**
	* Sets the checker v a q4 of this issue tracking.
	*
	* @param checkerVAQ4 the checker v a q4 of this issue tracking
	*/
	@Override
	public void setCheckerVAQ4(java.lang.String checkerVAQ4) {
		_issueTracking.setCheckerVAQ4(checkerVAQ4);
	}

	/**
	* Returns the approver v a q4 of this issue tracking.
	*
	* @return the approver v a q4 of this issue tracking
	*/
	@Override
	public java.lang.String getApproverVAQ4() {
		return _issueTracking.getApproverVAQ4();
	}

	/**
	* Sets the approver v a q4 of this issue tracking.
	*
	* @param approverVAQ4 the approver v a q4 of this issue tracking
	*/
	@Override
	public void setApproverVAQ4(java.lang.String approverVAQ4) {
		_issueTracking.setApproverVAQ4(approverVAQ4);
	}

	/**
	* Returns the maker v a q4modified of this issue tracking.
	*
	* @return the maker v a q4modified of this issue tracking
	*/
	@Override
	public java.util.Date getMakerVAQ4modified() {
		return _issueTracking.getMakerVAQ4modified();
	}

	/**
	* Sets the maker v a q4modified of this issue tracking.
	*
	* @param makerVAQ4modified the maker v a q4modified of this issue tracking
	*/
	@Override
	public void setMakerVAQ4modified(java.util.Date makerVAQ4modified) {
		_issueTracking.setMakerVAQ4modified(makerVAQ4modified);
	}

	/**
	* Returns the checker v a q4modified of this issue tracking.
	*
	* @return the checker v a q4modified of this issue tracking
	*/
	@Override
	public java.util.Date getCheckerVAQ4modified() {
		return _issueTracking.getCheckerVAQ4modified();
	}

	/**
	* Sets the checker v a q4modified of this issue tracking.
	*
	* @param checkerVAQ4modified the checker v a q4modified of this issue tracking
	*/
	@Override
	public void setCheckerVAQ4modified(java.util.Date checkerVAQ4modified) {
		_issueTracking.setCheckerVAQ4modified(checkerVAQ4modified);
	}

	/**
	* Returns the approver v a q4modified of this issue tracking.
	*
	* @return the approver v a q4modified of this issue tracking
	*/
	@Override
	public java.util.Date getApproverVAQ4modified() {
		return _issueTracking.getApproverVAQ4modified();
	}

	/**
	* Sets the approver v a q4modified of this issue tracking.
	*
	* @param approverVAQ4modified the approver v a q4modified of this issue tracking
	*/
	@Override
	public void setApproverVAQ4modified(java.util.Date approverVAQ4modified) {
		_issueTracking.setApproverVAQ4modified(approverVAQ4modified);
	}

	/**
	* Returns the markupissue v a q1 of this issue tracking.
	*
	* @return the markupissue v a q1 of this issue tracking
	*/
	@Override
	public int getMarkupissueVAQ1() {
		return _issueTracking.getMarkupissueVAQ1();
	}

	/**
	* Sets the markupissue v a q1 of this issue tracking.
	*
	* @param markupissueVAQ1 the markupissue v a q1 of this issue tracking
	*/
	@Override
	public void setMarkupissueVAQ1(int markupissueVAQ1) {
		_issueTracking.setMarkupissueVAQ1(markupissueVAQ1);
	}

	/**
	* Returns the maker v a q1 of this issue tracking.
	*
	* @return the maker v a q1 of this issue tracking
	*/
	@Override
	public java.lang.String getMakerVAQ1() {
		return _issueTracking.getMakerVAQ1();
	}

	/**
	* Sets the maker v a q1 of this issue tracking.
	*
	* @param makerVAQ1 the maker v a q1 of this issue tracking
	*/
	@Override
	public void setMakerVAQ1(java.lang.String makerVAQ1) {
		_issueTracking.setMakerVAQ1(makerVAQ1);
	}

	/**
	* Returns the checker v a q1 of this issue tracking.
	*
	* @return the checker v a q1 of this issue tracking
	*/
	@Override
	public java.lang.String getCheckerVAQ1() {
		return _issueTracking.getCheckerVAQ1();
	}

	/**
	* Sets the checker v a q1 of this issue tracking.
	*
	* @param checkerVAQ1 the checker v a q1 of this issue tracking
	*/
	@Override
	public void setCheckerVAQ1(java.lang.String checkerVAQ1) {
		_issueTracking.setCheckerVAQ1(checkerVAQ1);
	}

	/**
	* Returns the maker v a q1modified of this issue tracking.
	*
	* @return the maker v a q1modified of this issue tracking
	*/
	@Override
	public java.util.Date getMakerVAQ1modified() {
		return _issueTracking.getMakerVAQ1modified();
	}

	/**
	* Sets the maker v a q1modified of this issue tracking.
	*
	* @param makerVAQ1modified the maker v a q1modified of this issue tracking
	*/
	@Override
	public void setMakerVAQ1modified(java.util.Date makerVAQ1modified) {
		_issueTracking.setMakerVAQ1modified(makerVAQ1modified);
	}

	/**
	* Returns the checker v a q1modified of this issue tracking.
	*
	* @return the checker v a q1modified of this issue tracking
	*/
	@Override
	public java.util.Date getCheckerVAQ1modified() {
		return _issueTracking.getCheckerVAQ1modified();
	}

	/**
	* Sets the checker v a q1modified of this issue tracking.
	*
	* @param checkerVAQ1modified the checker v a q1modified of this issue tracking
	*/
	@Override
	public void setCheckerVAQ1modified(java.util.Date checkerVAQ1modified) {
		_issueTracking.setCheckerVAQ1modified(checkerVAQ1modified);
	}

	/**
	* Returns the markupissue v a q2 of this issue tracking.
	*
	* @return the markupissue v a q2 of this issue tracking
	*/
	@Override
	public int getMarkupissueVAQ2() {
		return _issueTracking.getMarkupissueVAQ2();
	}

	/**
	* Sets the markupissue v a q2 of this issue tracking.
	*
	* @param markupissueVAQ2 the markupissue v a q2 of this issue tracking
	*/
	@Override
	public void setMarkupissueVAQ2(int markupissueVAQ2) {
		_issueTracking.setMarkupissueVAQ2(markupissueVAQ2);
	}

	/**
	* Returns the maker v a q2 of this issue tracking.
	*
	* @return the maker v a q2 of this issue tracking
	*/
	@Override
	public java.lang.String getMakerVAQ2() {
		return _issueTracking.getMakerVAQ2();
	}

	/**
	* Sets the maker v a q2 of this issue tracking.
	*
	* @param makerVAQ2 the maker v a q2 of this issue tracking
	*/
	@Override
	public void setMakerVAQ2(java.lang.String makerVAQ2) {
		_issueTracking.setMakerVAQ2(makerVAQ2);
	}

	/**
	* Returns the checker v a q2 of this issue tracking.
	*
	* @return the checker v a q2 of this issue tracking
	*/
	@Override
	public java.lang.String getCheckerVAQ2() {
		return _issueTracking.getCheckerVAQ2();
	}

	/**
	* Sets the checker v a q2 of this issue tracking.
	*
	* @param checkerVAQ2 the checker v a q2 of this issue tracking
	*/
	@Override
	public void setCheckerVAQ2(java.lang.String checkerVAQ2) {
		_issueTracking.setCheckerVAQ2(checkerVAQ2);
	}

	/**
	* Returns the maker v a q2modified of this issue tracking.
	*
	* @return the maker v a q2modified of this issue tracking
	*/
	@Override
	public java.util.Date getMakerVAQ2modified() {
		return _issueTracking.getMakerVAQ2modified();
	}

	/**
	* Sets the maker v a q2modified of this issue tracking.
	*
	* @param makerVAQ2modified the maker v a q2modified of this issue tracking
	*/
	@Override
	public void setMakerVAQ2modified(java.util.Date makerVAQ2modified) {
		_issueTracking.setMakerVAQ2modified(makerVAQ2modified);
	}

	/**
	* Returns the checker v a q2modified of this issue tracking.
	*
	* @return the checker v a q2modified of this issue tracking
	*/
	@Override
	public java.util.Date getCheckerVAQ2modified() {
		return _issueTracking.getCheckerVAQ2modified();
	}

	/**
	* Sets the checker v a q2modified of this issue tracking.
	*
	* @param checkerVAQ2modified the checker v a q2modified of this issue tracking
	*/
	@Override
	public void setCheckerVAQ2modified(java.util.Date checkerVAQ2modified) {
		_issueTracking.setCheckerVAQ2modified(checkerVAQ2modified);
	}

	/**
	* Returns the markupissue v a q3 of this issue tracking.
	*
	* @return the markupissue v a q3 of this issue tracking
	*/
	@Override
	public int getMarkupissueVAQ3() {
		return _issueTracking.getMarkupissueVAQ3();
	}

	/**
	* Sets the markupissue v a q3 of this issue tracking.
	*
	* @param markupissueVAQ3 the markupissue v a q3 of this issue tracking
	*/
	@Override
	public void setMarkupissueVAQ3(int markupissueVAQ3) {
		_issueTracking.setMarkupissueVAQ3(markupissueVAQ3);
	}

	/**
	* Returns the maker v a q3 of this issue tracking.
	*
	* @return the maker v a q3 of this issue tracking
	*/
	@Override
	public java.lang.String getMakerVAQ3() {
		return _issueTracking.getMakerVAQ3();
	}

	/**
	* Sets the maker v a q3 of this issue tracking.
	*
	* @param makerVAQ3 the maker v a q3 of this issue tracking
	*/
	@Override
	public void setMakerVAQ3(java.lang.String makerVAQ3) {
		_issueTracking.setMakerVAQ3(makerVAQ3);
	}

	/**
	* Returns the checker v a q3 of this issue tracking.
	*
	* @return the checker v a q3 of this issue tracking
	*/
	@Override
	public java.lang.String getCheckerVAQ3() {
		return _issueTracking.getCheckerVAQ3();
	}

	/**
	* Sets the checker v a q3 of this issue tracking.
	*
	* @param checkerVAQ3 the checker v a q3 of this issue tracking
	*/
	@Override
	public void setCheckerVAQ3(java.lang.String checkerVAQ3) {
		_issueTracking.setCheckerVAQ3(checkerVAQ3);
	}

	/**
	* Returns the approver v a q3 of this issue tracking.
	*
	* @return the approver v a q3 of this issue tracking
	*/
	@Override
	public java.lang.String getApproverVAQ3() {
		return _issueTracking.getApproverVAQ3();
	}

	/**
	* Sets the approver v a q3 of this issue tracking.
	*
	* @param approverVAQ3 the approver v a q3 of this issue tracking
	*/
	@Override
	public void setApproverVAQ3(java.lang.String approverVAQ3) {
		_issueTracking.setApproverVAQ3(approverVAQ3);
	}

	/**
	* Returns the maker v a q3modified of this issue tracking.
	*
	* @return the maker v a q3modified of this issue tracking
	*/
	@Override
	public java.util.Date getMakerVAQ3modified() {
		return _issueTracking.getMakerVAQ3modified();
	}

	/**
	* Sets the maker v a q3modified of this issue tracking.
	*
	* @param makerVAQ3modified the maker v a q3modified of this issue tracking
	*/
	@Override
	public void setMakerVAQ3modified(java.util.Date makerVAQ3modified) {
		_issueTracking.setMakerVAQ3modified(makerVAQ3modified);
	}

	/**
	* Returns the checker v a q3modified of this issue tracking.
	*
	* @return the checker v a q3modified of this issue tracking
	*/
	@Override
	public java.util.Date getCheckerVAQ3modified() {
		return _issueTracking.getCheckerVAQ3modified();
	}

	/**
	* Sets the checker v a q3modified of this issue tracking.
	*
	* @param checkerVAQ3modified the checker v a q3modified of this issue tracking
	*/
	@Override
	public void setCheckerVAQ3modified(java.util.Date checkerVAQ3modified) {
		_issueTracking.setCheckerVAQ3modified(checkerVAQ3modified);
	}

	/**
	* Returns the approver v a q3modified of this issue tracking.
	*
	* @return the approver v a q3modified of this issue tracking
	*/
	@Override
	public java.util.Date getApproverVAQ3modified() {
		return _issueTracking.getApproverVAQ3modified();
	}

	/**
	* Sets the approver v a q3modified of this issue tracking.
	*
	* @param approverVAQ3modified the approver v a q3modified of this issue tracking
	*/
	@Override
	public void setApproverVAQ3modified(java.util.Date approverVAQ3modified) {
		_issueTracking.setApproverVAQ3modified(approverVAQ3modified);
	}

	/**
	* Returns the defect status of this issue tracking.
	*
	* @return the defect status of this issue tracking
	*/
	@Override
	public int getDefectStatus() {
		return _issueTracking.getDefectStatus();
	}

	/**
	* Sets the defect status of this issue tracking.
	*
	* @param defectStatus the defect status of this issue tracking
	*/
	@Override
	public void setDefectStatus(int defectStatus) {
		_issueTracking.setDefectStatus(defectStatus);
	}

	/**
	* Returns the synchdate of this issue tracking.
	*
	* @return the synchdate of this issue tracking
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _issueTracking.getSynchdate();
	}

	/**
	* Sets the synchdate of this issue tracking.
	*
	* @param synchdate the synchdate of this issue tracking
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_issueTracking.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _issueTracking.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_issueTracking.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _issueTracking.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_issueTracking.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _issueTracking.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _issueTracking.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_issueTracking.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _issueTracking.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_issueTracking.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_issueTracking.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_issueTracking.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new IssueTrackingWrapper((IssueTracking)_issueTracking.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking issueTracking) {
		return _issueTracking.compareTo(issueTracking);
	}

	@Override
	public int hashCode() {
		return _issueTracking.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking> toCacheModel() {
		return _issueTracking.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking toEscapedModel() {
		return new IssueTrackingWrapper(_issueTracking.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking toUnescapedModel() {
		return new IssueTrackingWrapper(_issueTracking.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _issueTracking.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _issueTracking.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_issueTracking.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IssueTrackingWrapper)) {
			return false;
		}

		IssueTrackingWrapper issueTrackingWrapper = (IssueTrackingWrapper)obj;

		if (Validator.equals(_issueTracking, issueTrackingWrapper._issueTracking)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public IssueTracking getWrappedIssueTracking() {
		return _issueTracking;
	}

	@Override
	public IssueTracking getWrappedModel() {
		return _issueTracking;
	}

	@Override
	public void resetOriginalValues() {
		_issueTracking.resetOriginalValues();
	}

	private IssueTracking _issueTracking;
}