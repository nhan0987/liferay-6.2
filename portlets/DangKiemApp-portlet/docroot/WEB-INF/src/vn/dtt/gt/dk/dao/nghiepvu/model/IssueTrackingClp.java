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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer;
import vn.dtt.gt.dk.dao.nghiepvu.service.IssueTrackingLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class IssueTrackingClp extends BaseModelImpl<IssueTracking>
	implements IssueTracking {
	public IssueTrackingClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_issueTrackingRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImportercode() {
		return _importercode;
	}

	@Override
	public void setImportercode(String importercode) {
		_importercode = importercode;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setImportercode", String.class);

				method.invoke(_issueTrackingRemoteModel, importercode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImportername() {
		return _importername;
	}

	@Override
	public void setImportername(String importername) {
		_importername = importername;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setImportername", String.class);

				method.invoke(_issueTrackingRemoteModel, importername);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegisterednumber() {
		return _registerednumber;
	}

	@Override
	public void setRegisterednumber(String registerednumber) {
		_registerednumber = registerednumber;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisterednumber",
						String.class);

				method.invoke(_issueTrackingRemoteModel, registerednumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionrecordno() {
		return _inspectionrecordno;
	}

	@Override
	public void setInspectionrecordno(String inspectionrecordno) {
		_inspectionrecordno = inspectionrecordno;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionrecordno",
						String.class);

				method.invoke(_issueTrackingRemoteModel, inspectionrecordno);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInspectionRecordDate() {
		return _inspectionRecordDate;
	}

	@Override
	public void setInspectionRecordDate(Date inspectionRecordDate) {
		_inspectionRecordDate = inspectionRecordDate;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionRecordDate",
						Date.class);

				method.invoke(_issueTrackingRemoteModel, inspectionRecordDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCorporationId() {
		return _corporationId;
	}

	@Override
	public void setCorporationId(String corporationId) {
		_corporationId = corporationId;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporationId", String.class);

				method.invoke(_issueTrackingRemoteModel, corporationId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInspectorId() {
		return _inspectorId;
	}

	@Override
	public void setInspectorId(long inspectorId) {
		_inspectorId = inspectorId;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorId", long.class);

				method.invoke(_issueTrackingRemoteModel, inspectorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVehicleClass() {
		return _vehicleClass;
	}

	@Override
	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setVehicleClass", String.class);

				method.invoke(_issueTrackingRemoteModel, vehicleClass);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductcode() {
		return _productcode;
	}

	@Override
	public void setProductcode(String productcode) {
		_productcode = productcode;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setProductcode", String.class);

				method.invoke(_issueTrackingRemoteModel, productcode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductname() {
		return _productname;
	}

	@Override
	public void setProductname(String productname) {
		_productname = productname;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setProductname", String.class);

				method.invoke(_issueTrackingRemoteModel, productname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTotalvehicle() {
		return _totalvehicle;
	}

	@Override
	public void setTotalvehicle(long totalvehicle) {
		_totalvehicle = totalvehicle;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setTotalvehicle", long.class);

				method.invoke(_issueTrackingRemoteModel, totalvehicle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCodeNumber() {
		return _codeNumber;
	}

	@Override
	public void setCodeNumber(long codeNumber) {
		_codeNumber = codeNumber;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setCodeNumber", long.class);

				method.invoke(_issueTrackingRemoteModel, codeNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChassisNumber() {
		return _chassisNumber;
	}

	@Override
	public void setChassisNumber(String chassisNumber) {
		_chassisNumber = chassisNumber;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setChassisNumber", String.class);

				method.invoke(_issueTrackingRemoteModel, chassisNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEngineNumber() {
		return _engineNumber;
	}

	@Override
	public void setEngineNumber(String engineNumber) {
		_engineNumber = engineNumber;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setEngineNumber", String.class);

				method.invoke(_issueTrackingRemoteModel, engineNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImportedorassembled() {
		return _importedorassembled;
	}

	@Override
	public void setImportedorassembled(String importedorassembled) {
		_importedorassembled = importedorassembled;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setImportedorassembled",
						String.class);

				method.invoke(_issueTrackingRemoteModel, importedorassembled);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIssuetrackingfromcustomer() {
		return _issuetrackingfromcustomer;
	}

	@Override
	public void setIssuetrackingfromcustomer(String issuetrackingfromcustomer) {
		_issuetrackingfromcustomer = issuetrackingfromcustomer;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setIssuetrackingfromcustomer",
						String.class);

				method.invoke(_issueTrackingRemoteModel,
					issuetrackingfromcustomer);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIssuetrackingbycorporation() {
		return _issuetrackingbycorporation;
	}

	@Override
	public void setIssuetrackingbycorporation(String issuetrackingbycorporation) {
		_issuetrackingbycorporation = issuetrackingbycorporation;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setIssuetrackingbycorporation",
						String.class);

				method.invoke(_issueTrackingRemoteModel,
					issuetrackingbycorporation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIssuetrackingbyimportedgroup() {
		return _issuetrackingbyimportedgroup;
	}

	@Override
	public void setIssuetrackingbyimportedgroup(
		String issuetrackingbyimportedgroup) {
		_issuetrackingbyimportedgroup = issuetrackingbyimportedgroup;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setIssuetrackingbyimportedgroup",
						String.class);

				method.invoke(_issueTrackingRemoteModel,
					issuetrackingbyimportedgroup);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIssuediscovery() {
		return _issuediscovery;
	}

	@Override
	public void setIssuediscovery(long issuediscovery) {
		_issuediscovery = issuediscovery;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setIssuediscovery", long.class);

				method.invoke(_issueTrackingRemoteModel, issuediscovery);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIssuedescription() {
		return _issuedescription;
	}

	@Override
	public void setIssuedescription(String issuedescription) {
		_issuedescription = issuedescription;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setIssuedescription",
						String.class);

				method.invoke(_issueTrackingRemoteModel, issuedescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIssueVAQ1reason() {
		return _issueVAQ1reason;
	}

	@Override
	public void setIssueVAQ1reason(String issueVAQ1reason) {
		_issueVAQ1reason = issueVAQ1reason;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setIssueVAQ1reason",
						String.class);

				method.invoke(_issueTrackingRemoteModel, issueVAQ1reason);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIssueVAQ2troubleshooting() {
		return _issueVAQ2troubleshooting;
	}

	@Override
	public void setIssueVAQ2troubleshooting(String issueVAQ2troubleshooting) {
		_issueVAQ2troubleshooting = issueVAQ2troubleshooting;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setIssueVAQ2troubleshooting",
						String.class);

				method.invoke(_issueTrackingRemoteModel,
					issueVAQ2troubleshooting);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIssueVAQ3longtermsolution() {
		return _issueVAQ3longtermsolution;
	}

	@Override
	public void setIssueVAQ3longtermsolution(String issueVAQ3longtermsolution) {
		_issueVAQ3longtermsolution = issueVAQ3longtermsolution;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setIssueVAQ3longtermsolution",
						String.class);

				method.invoke(_issueTrackingRemoteModel,
					issueVAQ3longtermsolution);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIssueVAQ4precaution() {
		return _issueVAQ4precaution;
	}

	@Override
	public void setIssueVAQ4precaution(String issueVAQ4precaution) {
		_issueVAQ4precaution = issueVAQ4precaution;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setIssueVAQ4precaution",
						String.class);

				method.invoke(_issueTrackingRemoteModel, issueVAQ4precaution);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreator() {
		return _creator;
	}

	@Override
	public void setCreator(String creator) {
		_creator = creator;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setCreator", String.class);

				method.invoke(_issueTrackingRemoteModel, creator);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateddate() {
		return _createddate;
	}

	@Override
	public void setCreateddate(Date createddate) {
		_createddate = createddate;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateddate", Date.class);

				method.invoke(_issueTrackingRemoteModel, createddate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkupissueVAQ4() {
		return _markupissueVAQ4;
	}

	@Override
	public void setMarkupissueVAQ4(int markupissueVAQ4) {
		_markupissueVAQ4 = markupissueVAQ4;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkupissueVAQ4", int.class);

				method.invoke(_issueTrackingRemoteModel, markupissueVAQ4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMakerVAQ4() {
		return _makerVAQ4;
	}

	@Override
	public void setMakerVAQ4(String makerVAQ4) {
		_makerVAQ4 = makerVAQ4;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setMakerVAQ4", String.class);

				method.invoke(_issueTrackingRemoteModel, makerVAQ4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCheckerVAQ4() {
		return _checkerVAQ4;
	}

	@Override
	public void setCheckerVAQ4(String checkerVAQ4) {
		_checkerVAQ4 = checkerVAQ4;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckerVAQ4", String.class);

				method.invoke(_issueTrackingRemoteModel, checkerVAQ4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApproverVAQ4() {
		return _approverVAQ4;
	}

	@Override
	public void setApproverVAQ4(String approverVAQ4) {
		_approverVAQ4 = approverVAQ4;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setApproverVAQ4", String.class);

				method.invoke(_issueTrackingRemoteModel, approverVAQ4);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getMakerVAQ4modified() {
		return _makerVAQ4modified;
	}

	@Override
	public void setMakerVAQ4modified(Date makerVAQ4modified) {
		_makerVAQ4modified = makerVAQ4modified;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setMakerVAQ4modified",
						Date.class);

				method.invoke(_issueTrackingRemoteModel, makerVAQ4modified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCheckerVAQ4modified() {
		return _checkerVAQ4modified;
	}

	@Override
	public void setCheckerVAQ4modified(Date checkerVAQ4modified) {
		_checkerVAQ4modified = checkerVAQ4modified;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckerVAQ4modified",
						Date.class);

				method.invoke(_issueTrackingRemoteModel, checkerVAQ4modified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApproverVAQ4modified() {
		return _approverVAQ4modified;
	}

	@Override
	public void setApproverVAQ4modified(Date approverVAQ4modified) {
		_approverVAQ4modified = approverVAQ4modified;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setApproverVAQ4modified",
						Date.class);

				method.invoke(_issueTrackingRemoteModel, approverVAQ4modified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkupissueVAQ1() {
		return _markupissueVAQ1;
	}

	@Override
	public void setMarkupissueVAQ1(int markupissueVAQ1) {
		_markupissueVAQ1 = markupissueVAQ1;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkupissueVAQ1", int.class);

				method.invoke(_issueTrackingRemoteModel, markupissueVAQ1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMakerVAQ1() {
		return _makerVAQ1;
	}

	@Override
	public void setMakerVAQ1(String makerVAQ1) {
		_makerVAQ1 = makerVAQ1;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setMakerVAQ1", String.class);

				method.invoke(_issueTrackingRemoteModel, makerVAQ1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCheckerVAQ1() {
		return _checkerVAQ1;
	}

	@Override
	public void setCheckerVAQ1(String checkerVAQ1) {
		_checkerVAQ1 = checkerVAQ1;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckerVAQ1", String.class);

				method.invoke(_issueTrackingRemoteModel, checkerVAQ1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getMakerVAQ1modified() {
		return _makerVAQ1modified;
	}

	@Override
	public void setMakerVAQ1modified(Date makerVAQ1modified) {
		_makerVAQ1modified = makerVAQ1modified;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setMakerVAQ1modified",
						Date.class);

				method.invoke(_issueTrackingRemoteModel, makerVAQ1modified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCheckerVAQ1modified() {
		return _checkerVAQ1modified;
	}

	@Override
	public void setCheckerVAQ1modified(Date checkerVAQ1modified) {
		_checkerVAQ1modified = checkerVAQ1modified;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckerVAQ1modified",
						Date.class);

				method.invoke(_issueTrackingRemoteModel, checkerVAQ1modified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkupissueVAQ2() {
		return _markupissueVAQ2;
	}

	@Override
	public void setMarkupissueVAQ2(int markupissueVAQ2) {
		_markupissueVAQ2 = markupissueVAQ2;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkupissueVAQ2", int.class);

				method.invoke(_issueTrackingRemoteModel, markupissueVAQ2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMakerVAQ2() {
		return _makerVAQ2;
	}

	@Override
	public void setMakerVAQ2(String makerVAQ2) {
		_makerVAQ2 = makerVAQ2;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setMakerVAQ2", String.class);

				method.invoke(_issueTrackingRemoteModel, makerVAQ2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCheckerVAQ2() {
		return _checkerVAQ2;
	}

	@Override
	public void setCheckerVAQ2(String checkerVAQ2) {
		_checkerVAQ2 = checkerVAQ2;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckerVAQ2", String.class);

				method.invoke(_issueTrackingRemoteModel, checkerVAQ2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getMakerVAQ2modified() {
		return _makerVAQ2modified;
	}

	@Override
	public void setMakerVAQ2modified(Date makerVAQ2modified) {
		_makerVAQ2modified = makerVAQ2modified;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setMakerVAQ2modified",
						Date.class);

				method.invoke(_issueTrackingRemoteModel, makerVAQ2modified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCheckerVAQ2modified() {
		return _checkerVAQ2modified;
	}

	@Override
	public void setCheckerVAQ2modified(Date checkerVAQ2modified) {
		_checkerVAQ2modified = checkerVAQ2modified;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckerVAQ2modified",
						Date.class);

				method.invoke(_issueTrackingRemoteModel, checkerVAQ2modified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMarkupissueVAQ3() {
		return _markupissueVAQ3;
	}

	@Override
	public void setMarkupissueVAQ3(int markupissueVAQ3) {
		_markupissueVAQ3 = markupissueVAQ3;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setMarkupissueVAQ3", int.class);

				method.invoke(_issueTrackingRemoteModel, markupissueVAQ3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMakerVAQ3() {
		return _makerVAQ3;
	}

	@Override
	public void setMakerVAQ3(String makerVAQ3) {
		_makerVAQ3 = makerVAQ3;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setMakerVAQ3", String.class);

				method.invoke(_issueTrackingRemoteModel, makerVAQ3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCheckerVAQ3() {
		return _checkerVAQ3;
	}

	@Override
	public void setCheckerVAQ3(String checkerVAQ3) {
		_checkerVAQ3 = checkerVAQ3;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckerVAQ3", String.class);

				method.invoke(_issueTrackingRemoteModel, checkerVAQ3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApproverVAQ3() {
		return _approverVAQ3;
	}

	@Override
	public void setApproverVAQ3(String approverVAQ3) {
		_approverVAQ3 = approverVAQ3;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setApproverVAQ3", String.class);

				method.invoke(_issueTrackingRemoteModel, approverVAQ3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getMakerVAQ3modified() {
		return _makerVAQ3modified;
	}

	@Override
	public void setMakerVAQ3modified(Date makerVAQ3modified) {
		_makerVAQ3modified = makerVAQ3modified;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setMakerVAQ3modified",
						Date.class);

				method.invoke(_issueTrackingRemoteModel, makerVAQ3modified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCheckerVAQ3modified() {
		return _checkerVAQ3modified;
	}

	@Override
	public void setCheckerVAQ3modified(Date checkerVAQ3modified) {
		_checkerVAQ3modified = checkerVAQ3modified;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setCheckerVAQ3modified",
						Date.class);

				method.invoke(_issueTrackingRemoteModel, checkerVAQ3modified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApproverVAQ3modified() {
		return _approverVAQ3modified;
	}

	@Override
	public void setApproverVAQ3modified(Date approverVAQ3modified) {
		_approverVAQ3modified = approverVAQ3modified;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setApproverVAQ3modified",
						Date.class);

				method.invoke(_issueTrackingRemoteModel, approverVAQ3modified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDefectStatus() {
		return _defectStatus;
	}

	@Override
	public void setDefectStatus(int defectStatus) {
		_defectStatus = defectStatus;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setDefectStatus", int.class);

				method.invoke(_issueTrackingRemoteModel, defectStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchdate() {
		return _synchdate;
	}

	@Override
	public void setSynchdate(Date synchdate) {
		_synchdate = synchdate;

		if (_issueTrackingRemoteModel != null) {
			try {
				Class<?> clazz = _issueTrackingRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchdate", Date.class);

				method.invoke(_issueTrackingRemoteModel, synchdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getIssueTrackingRemoteModel() {
		return _issueTrackingRemoteModel;
	}

	public void setIssueTrackingRemoteModel(
		BaseModel<?> issueTrackingRemoteModel) {
		_issueTrackingRemoteModel = issueTrackingRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _issueTrackingRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_issueTrackingRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			IssueTrackingLocalServiceUtil.addIssueTracking(this);
		}
		else {
			IssueTrackingLocalServiceUtil.updateIssueTracking(this);
		}
	}

	@Override
	public IssueTracking toEscapedModel() {
		return (IssueTracking)ProxyUtil.newProxyInstance(IssueTracking.class.getClassLoader(),
			new Class[] { IssueTracking.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		IssueTrackingClp clone = new IssueTrackingClp();

		clone.setId(getId());
		clone.setImportercode(getImportercode());
		clone.setImportername(getImportername());
		clone.setRegisterednumber(getRegisterednumber());
		clone.setInspectionrecordno(getInspectionrecordno());
		clone.setInspectionRecordDate(getInspectionRecordDate());
		clone.setCorporationId(getCorporationId());
		clone.setInspectorId(getInspectorId());
		clone.setVehicleClass(getVehicleClass());
		clone.setProductcode(getProductcode());
		clone.setProductname(getProductname());
		clone.setTotalvehicle(getTotalvehicle());
		clone.setCodeNumber(getCodeNumber());
		clone.setChassisNumber(getChassisNumber());
		clone.setEngineNumber(getEngineNumber());
		clone.setImportedorassembled(getImportedorassembled());
		clone.setIssuetrackingfromcustomer(getIssuetrackingfromcustomer());
		clone.setIssuetrackingbycorporation(getIssuetrackingbycorporation());
		clone.setIssuetrackingbyimportedgroup(getIssuetrackingbyimportedgroup());
		clone.setIssuediscovery(getIssuediscovery());
		clone.setIssuedescription(getIssuedescription());
		clone.setIssueVAQ1reason(getIssueVAQ1reason());
		clone.setIssueVAQ2troubleshooting(getIssueVAQ2troubleshooting());
		clone.setIssueVAQ3longtermsolution(getIssueVAQ3longtermsolution());
		clone.setIssueVAQ4precaution(getIssueVAQ4precaution());
		clone.setCreator(getCreator());
		clone.setCreateddate(getCreateddate());
		clone.setMarkupissueVAQ4(getMarkupissueVAQ4());
		clone.setMakerVAQ4(getMakerVAQ4());
		clone.setCheckerVAQ4(getCheckerVAQ4());
		clone.setApproverVAQ4(getApproverVAQ4());
		clone.setMakerVAQ4modified(getMakerVAQ4modified());
		clone.setCheckerVAQ4modified(getCheckerVAQ4modified());
		clone.setApproverVAQ4modified(getApproverVAQ4modified());
		clone.setMarkupissueVAQ1(getMarkupissueVAQ1());
		clone.setMakerVAQ1(getMakerVAQ1());
		clone.setCheckerVAQ1(getCheckerVAQ1());
		clone.setMakerVAQ1modified(getMakerVAQ1modified());
		clone.setCheckerVAQ1modified(getCheckerVAQ1modified());
		clone.setMarkupissueVAQ2(getMarkupissueVAQ2());
		clone.setMakerVAQ2(getMakerVAQ2());
		clone.setCheckerVAQ2(getCheckerVAQ2());
		clone.setMakerVAQ2modified(getMakerVAQ2modified());
		clone.setCheckerVAQ2modified(getCheckerVAQ2modified());
		clone.setMarkupissueVAQ3(getMarkupissueVAQ3());
		clone.setMakerVAQ3(getMakerVAQ3());
		clone.setCheckerVAQ3(getCheckerVAQ3());
		clone.setApproverVAQ3(getApproverVAQ3());
		clone.setMakerVAQ3modified(getMakerVAQ3modified());
		clone.setCheckerVAQ3modified(getCheckerVAQ3modified());
		clone.setApproverVAQ3modified(getApproverVAQ3modified());
		clone.setDefectStatus(getDefectStatus());
		clone.setSynchdate(getSynchdate());

		return clone;
	}

	@Override
	public int compareTo(IssueTracking issueTracking) {
		int value = 0;

		if (getId() < issueTracking.getId()) {
			value = -1;
		}
		else if (getId() > issueTracking.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof IssueTrackingClp)) {
			return false;
		}

		IssueTrackingClp issueTracking = (IssueTrackingClp)obj;

		long primaryKey = issueTracking.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(107);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", importercode=");
		sb.append(getImportercode());
		sb.append(", importername=");
		sb.append(getImportername());
		sb.append(", registerednumber=");
		sb.append(getRegisterednumber());
		sb.append(", inspectionrecordno=");
		sb.append(getInspectionrecordno());
		sb.append(", inspectionRecordDate=");
		sb.append(getInspectionRecordDate());
		sb.append(", corporationId=");
		sb.append(getCorporationId());
		sb.append(", inspectorId=");
		sb.append(getInspectorId());
		sb.append(", vehicleClass=");
		sb.append(getVehicleClass());
		sb.append(", productcode=");
		sb.append(getProductcode());
		sb.append(", productname=");
		sb.append(getProductname());
		sb.append(", totalvehicle=");
		sb.append(getTotalvehicle());
		sb.append(", codeNumber=");
		sb.append(getCodeNumber());
		sb.append(", chassisNumber=");
		sb.append(getChassisNumber());
		sb.append(", engineNumber=");
		sb.append(getEngineNumber());
		sb.append(", importedorassembled=");
		sb.append(getImportedorassembled());
		sb.append(", issuetrackingfromcustomer=");
		sb.append(getIssuetrackingfromcustomer());
		sb.append(", issuetrackingbycorporation=");
		sb.append(getIssuetrackingbycorporation());
		sb.append(", issuetrackingbyimportedgroup=");
		sb.append(getIssuetrackingbyimportedgroup());
		sb.append(", issuediscovery=");
		sb.append(getIssuediscovery());
		sb.append(", issuedescription=");
		sb.append(getIssuedescription());
		sb.append(", issueVAQ1reason=");
		sb.append(getIssueVAQ1reason());
		sb.append(", issueVAQ2troubleshooting=");
		sb.append(getIssueVAQ2troubleshooting());
		sb.append(", issueVAQ3longtermsolution=");
		sb.append(getIssueVAQ3longtermsolution());
		sb.append(", issueVAQ4precaution=");
		sb.append(getIssueVAQ4precaution());
		sb.append(", creator=");
		sb.append(getCreator());
		sb.append(", createddate=");
		sb.append(getCreateddate());
		sb.append(", markupissueVAQ4=");
		sb.append(getMarkupissueVAQ4());
		sb.append(", makerVAQ4=");
		sb.append(getMakerVAQ4());
		sb.append(", checkerVAQ4=");
		sb.append(getCheckerVAQ4());
		sb.append(", approverVAQ4=");
		sb.append(getApproverVAQ4());
		sb.append(", makerVAQ4modified=");
		sb.append(getMakerVAQ4modified());
		sb.append(", checkerVAQ4modified=");
		sb.append(getCheckerVAQ4modified());
		sb.append(", approverVAQ4modified=");
		sb.append(getApproverVAQ4modified());
		sb.append(", markupissueVAQ1=");
		sb.append(getMarkupissueVAQ1());
		sb.append(", makerVAQ1=");
		sb.append(getMakerVAQ1());
		sb.append(", checkerVAQ1=");
		sb.append(getCheckerVAQ1());
		sb.append(", makerVAQ1modified=");
		sb.append(getMakerVAQ1modified());
		sb.append(", checkerVAQ1modified=");
		sb.append(getCheckerVAQ1modified());
		sb.append(", markupissueVAQ2=");
		sb.append(getMarkupissueVAQ2());
		sb.append(", makerVAQ2=");
		sb.append(getMakerVAQ2());
		sb.append(", checkerVAQ2=");
		sb.append(getCheckerVAQ2());
		sb.append(", makerVAQ2modified=");
		sb.append(getMakerVAQ2modified());
		sb.append(", checkerVAQ2modified=");
		sb.append(getCheckerVAQ2modified());
		sb.append(", markupissueVAQ3=");
		sb.append(getMarkupissueVAQ3());
		sb.append(", makerVAQ3=");
		sb.append(getMakerVAQ3());
		sb.append(", checkerVAQ3=");
		sb.append(getCheckerVAQ3());
		sb.append(", approverVAQ3=");
		sb.append(getApproverVAQ3());
		sb.append(", makerVAQ3modified=");
		sb.append(getMakerVAQ3modified());
		sb.append(", checkerVAQ3modified=");
		sb.append(getCheckerVAQ3modified());
		sb.append(", approverVAQ3modified=");
		sb.append(getApproverVAQ3modified());
		sb.append(", defectStatus=");
		sb.append(getDefectStatus());
		sb.append(", synchdate=");
		sb.append(getSynchdate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(163);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importercode</column-name><column-value><![CDATA[");
		sb.append(getImportercode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importername</column-name><column-value><![CDATA[");
		sb.append(getImportername());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registerednumber</column-name><column-value><![CDATA[");
		sb.append(getRegisterednumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionrecordno</column-name><column-value><![CDATA[");
		sb.append(getInspectionrecordno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionRecordDate</column-name><column-value><![CDATA[");
		sb.append(getInspectionRecordDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporationId</column-name><column-value><![CDATA[");
		sb.append(getCorporationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorId</column-name><column-value><![CDATA[");
		sb.append(getInspectorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleClass</column-name><column-value><![CDATA[");
		sb.append(getVehicleClass());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productcode</column-name><column-value><![CDATA[");
		sb.append(getProductcode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productname</column-name><column-value><![CDATA[");
		sb.append(getProductname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalvehicle</column-name><column-value><![CDATA[");
		sb.append(getTotalvehicle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codeNumber</column-name><column-value><![CDATA[");
		sb.append(getCodeNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chassisNumber</column-name><column-value><![CDATA[");
		sb.append(getChassisNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>engineNumber</column-name><column-value><![CDATA[");
		sb.append(getEngineNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importedorassembled</column-name><column-value><![CDATA[");
		sb.append(getImportedorassembled());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issuetrackingfromcustomer</column-name><column-value><![CDATA[");
		sb.append(getIssuetrackingfromcustomer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issuetrackingbycorporation</column-name><column-value><![CDATA[");
		sb.append(getIssuetrackingbycorporation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issuetrackingbyimportedgroup</column-name><column-value><![CDATA[");
		sb.append(getIssuetrackingbyimportedgroup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issuediscovery</column-name><column-value><![CDATA[");
		sb.append(getIssuediscovery());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issuedescription</column-name><column-value><![CDATA[");
		sb.append(getIssuedescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueVAQ1reason</column-name><column-value><![CDATA[");
		sb.append(getIssueVAQ1reason());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueVAQ2troubleshooting</column-name><column-value><![CDATA[");
		sb.append(getIssueVAQ2troubleshooting());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueVAQ3longtermsolution</column-name><column-value><![CDATA[");
		sb.append(getIssueVAQ3longtermsolution());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueVAQ4precaution</column-name><column-value><![CDATA[");
		sb.append(getIssueVAQ4precaution());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>creator</column-name><column-value><![CDATA[");
		sb.append(getCreator());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createddate</column-name><column-value><![CDATA[");
		sb.append(getCreateddate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupissueVAQ4</column-name><column-value><![CDATA[");
		sb.append(getMarkupissueVAQ4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>makerVAQ4</column-name><column-value><![CDATA[");
		sb.append(getMakerVAQ4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkerVAQ4</column-name><column-value><![CDATA[");
		sb.append(getCheckerVAQ4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approverVAQ4</column-name><column-value><![CDATA[");
		sb.append(getApproverVAQ4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>makerVAQ4modified</column-name><column-value><![CDATA[");
		sb.append(getMakerVAQ4modified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkerVAQ4modified</column-name><column-value><![CDATA[");
		sb.append(getCheckerVAQ4modified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approverVAQ4modified</column-name><column-value><![CDATA[");
		sb.append(getApproverVAQ4modified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupissueVAQ1</column-name><column-value><![CDATA[");
		sb.append(getMarkupissueVAQ1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>makerVAQ1</column-name><column-value><![CDATA[");
		sb.append(getMakerVAQ1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkerVAQ1</column-name><column-value><![CDATA[");
		sb.append(getCheckerVAQ1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>makerVAQ1modified</column-name><column-value><![CDATA[");
		sb.append(getMakerVAQ1modified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkerVAQ1modified</column-name><column-value><![CDATA[");
		sb.append(getCheckerVAQ1modified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupissueVAQ2</column-name><column-value><![CDATA[");
		sb.append(getMarkupissueVAQ2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>makerVAQ2</column-name><column-value><![CDATA[");
		sb.append(getMakerVAQ2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkerVAQ2</column-name><column-value><![CDATA[");
		sb.append(getCheckerVAQ2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>makerVAQ2modified</column-name><column-value><![CDATA[");
		sb.append(getMakerVAQ2modified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkerVAQ2modified</column-name><column-value><![CDATA[");
		sb.append(getCheckerVAQ2modified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupissueVAQ3</column-name><column-value><![CDATA[");
		sb.append(getMarkupissueVAQ3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>makerVAQ3</column-name><column-value><![CDATA[");
		sb.append(getMakerVAQ3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkerVAQ3</column-name><column-value><![CDATA[");
		sb.append(getCheckerVAQ3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approverVAQ3</column-name><column-value><![CDATA[");
		sb.append(getApproverVAQ3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>makerVAQ3modified</column-name><column-value><![CDATA[");
		sb.append(getMakerVAQ3modified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>checkerVAQ3modified</column-name><column-value><![CDATA[");
		sb.append(getCheckerVAQ3modified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approverVAQ3modified</column-name><column-value><![CDATA[");
		sb.append(getApproverVAQ3modified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>defectStatus</column-name><column-value><![CDATA[");
		sb.append(getDefectStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>synchdate</column-name><column-value><![CDATA[");
		sb.append(getSynchdate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _issueTrackingRemoteModel;
}