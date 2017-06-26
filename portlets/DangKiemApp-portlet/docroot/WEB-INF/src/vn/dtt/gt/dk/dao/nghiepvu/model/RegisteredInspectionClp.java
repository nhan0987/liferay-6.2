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
import vn.dtt.gt.dk.dao.nghiepvu.service.RegisteredInspectionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author win_64
 */
public class RegisteredInspectionClp extends BaseModelImpl<RegisteredInspection>
	implements RegisteredInspection {
	public RegisteredInspectionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return RegisteredInspection.class;
	}

	@Override
	public String getModelClassName() {
		return RegisteredInspection.class.getName();
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
		attributes.put("registeredNumber", getRegisteredNumber());
		attributes.put("dossierId", getDossierId());
		attributes.put("attachedFile", getAttachedFile());
		attributes.put("importerCode", getImporterCode());
		attributes.put("importerName", getImporterName());
		attributes.put("importerAddress", getImporterAddress());
		attributes.put("representative", getRepresentative());
		attributes.put("phone", getPhone());
		attributes.put("fax", getFax());
		attributes.put("email", getEmail());
		attributes.put("inspectionDate", getInspectionDate());
		attributes.put("inspectionSite", getInspectionSite());
		attributes.put("inspectionDistrictCode", getInspectionDistrictCode());
		attributes.put("inspectionProvinceCode", getInspectionProvinceCode());
		attributes.put("contactName", getContactName());
		attributes.put("contactPhone", getContactPhone());
		attributes.put("contactEmail", getContactEmail());
		attributes.put("importerSignName", getImporterSignName());
		attributes.put("importerSignTitle", getImporterSignTitle());
		attributes.put("importerSignPlace", getImporterSignPlace());
		attributes.put("importerSignDate", getImporterSignDate());
		attributes.put("inspectorOrganization", getInspectorOrganization());
		attributes.put("inspectorDivision", getInspectorDivision());
		attributes.put("inspectorSigNname", getInspectorSigNname());
		attributes.put("inspectorSignTitle", getInspectorSignTitle());
		attributes.put("inspectorSignPlace", getInspectorSignPlace());
		attributes.put("inspectorSignDate", getInspectorSignDate());
		attributes.put("SynchDate", getSynchDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String registeredNumber = (String)attributes.get("registeredNumber");

		if (registeredNumber != null) {
			setRegisteredNumber(registeredNumber);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long attachedFile = (Long)attributes.get("attachedFile");

		if (attachedFile != null) {
			setAttachedFile(attachedFile);
		}

		String importerCode = (String)attributes.get("importerCode");

		if (importerCode != null) {
			setImporterCode(importerCode);
		}

		String importerName = (String)attributes.get("importerName");

		if (importerName != null) {
			setImporterName(importerName);
		}

		String importerAddress = (String)attributes.get("importerAddress");

		if (importerAddress != null) {
			setImporterAddress(importerAddress);
		}

		String representative = (String)attributes.get("representative");

		if (representative != null) {
			setRepresentative(representative);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Date inspectionDate = (Date)attributes.get("inspectionDate");

		if (inspectionDate != null) {
			setInspectionDate(inspectionDate);
		}

		String inspectionSite = (String)attributes.get("inspectionSite");

		if (inspectionSite != null) {
			setInspectionSite(inspectionSite);
		}

		String inspectionDistrictCode = (String)attributes.get(
				"inspectionDistrictCode");

		if (inspectionDistrictCode != null) {
			setInspectionDistrictCode(inspectionDistrictCode);
		}

		String inspectionProvinceCode = (String)attributes.get(
				"inspectionProvinceCode");

		if (inspectionProvinceCode != null) {
			setInspectionProvinceCode(inspectionProvinceCode);
		}

		String contactName = (String)attributes.get("contactName");

		if (contactName != null) {
			setContactName(contactName);
		}

		String contactPhone = (String)attributes.get("contactPhone");

		if (contactPhone != null) {
			setContactPhone(contactPhone);
		}

		String contactEmail = (String)attributes.get("contactEmail");

		if (contactEmail != null) {
			setContactEmail(contactEmail);
		}

		String importerSignName = (String)attributes.get("importerSignName");

		if (importerSignName != null) {
			setImporterSignName(importerSignName);
		}

		String importerSignTitle = (String)attributes.get("importerSignTitle");

		if (importerSignTitle != null) {
			setImporterSignTitle(importerSignTitle);
		}

		String importerSignPlace = (String)attributes.get("importerSignPlace");

		if (importerSignPlace != null) {
			setImporterSignPlace(importerSignPlace);
		}

		Date importerSignDate = (Date)attributes.get("importerSignDate");

		if (importerSignDate != null) {
			setImporterSignDate(importerSignDate);
		}

		String inspectorOrganization = (String)attributes.get(
				"inspectorOrganization");

		if (inspectorOrganization != null) {
			setInspectorOrganization(inspectorOrganization);
		}

		String inspectorDivision = (String)attributes.get("inspectorDivision");

		if (inspectorDivision != null) {
			setInspectorDivision(inspectorDivision);
		}

		String inspectorSigNname = (String)attributes.get("inspectorSigNname");

		if (inspectorSigNname != null) {
			setInspectorSigNname(inspectorSigNname);
		}

		String inspectorSignTitle = (String)attributes.get("inspectorSignTitle");

		if (inspectorSignTitle != null) {
			setInspectorSignTitle(inspectorSignTitle);
		}

		String inspectorSignPlace = (String)attributes.get("inspectorSignPlace");

		if (inspectorSignPlace != null) {
			setInspectorSignPlace(inspectorSignPlace);
		}

		Date inspectorSignDate = (Date)attributes.get("inspectorSignDate");

		if (inspectorSignDate != null) {
			setInspectorSignDate(inspectorSignDate);
		}

		Date SynchDate = (Date)attributes.get("SynchDate");

		if (SynchDate != null) {
			setSynchDate(SynchDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_registeredInspectionRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegisteredNumber() {
		return _registeredNumber;
	}

	@Override
	public void setRegisteredNumber(String registeredNumber) {
		_registeredNumber = registeredNumber;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setRegisteredNumber",
						String.class);

				method.invoke(_registeredInspectionRemoteModel, registeredNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_dossierId = dossierId;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierId", long.class);

				method.invoke(_registeredInspectionRemoteModel, dossierId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAttachedFile() {
		return _attachedFile;
	}

	@Override
	public void setAttachedFile(long attachedFile) {
		_attachedFile = attachedFile;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachedFile", long.class);

				method.invoke(_registeredInspectionRemoteModel, attachedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImporterCode() {
		return _importerCode;
	}

	@Override
	public void setImporterCode(String importerCode) {
		_importerCode = importerCode;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setImporterCode", String.class);

				method.invoke(_registeredInspectionRemoteModel, importerCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImporterName() {
		return _importerName;
	}

	@Override
	public void setImporterName(String importerName) {
		_importerName = importerName;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setImporterName", String.class);

				method.invoke(_registeredInspectionRemoteModel, importerName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImporterAddress() {
		return _importerAddress;
	}

	@Override
	public void setImporterAddress(String importerAddress) {
		_importerAddress = importerAddress;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setImporterAddress",
						String.class);

				method.invoke(_registeredInspectionRemoteModel, importerAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRepresentative() {
		return _representative;
	}

	@Override
	public void setRepresentative(String representative) {
		_representative = representative;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setRepresentative",
						String.class);

				method.invoke(_registeredInspectionRemoteModel, representative);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhone() {
		return _phone;
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setPhone", String.class);

				method.invoke(_registeredInspectionRemoteModel, phone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFax() {
		return _fax;
	}

	@Override
	public void setFax(String fax) {
		_fax = fax;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setFax", String.class);

				method.invoke(_registeredInspectionRemoteModel, fax);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_registeredInspectionRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInspectionDate() {
		return _inspectionDate;
	}

	@Override
	public void setInspectionDate(Date inspectionDate) {
		_inspectionDate = inspectionDate;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionDate", Date.class);

				method.invoke(_registeredInspectionRemoteModel, inspectionDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionSite() {
		return _inspectionSite;
	}

	@Override
	public void setInspectionSite(String inspectionSite) {
		_inspectionSite = inspectionSite;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionSite",
						String.class);

				method.invoke(_registeredInspectionRemoteModel, inspectionSite);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionDistrictCode() {
		return _inspectionDistrictCode;
	}

	@Override
	public void setInspectionDistrictCode(String inspectionDistrictCode) {
		_inspectionDistrictCode = inspectionDistrictCode;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionDistrictCode",
						String.class);

				method.invoke(_registeredInspectionRemoteModel,
					inspectionDistrictCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectionProvinceCode() {
		return _inspectionProvinceCode;
	}

	@Override
	public void setInspectionProvinceCode(String inspectionProvinceCode) {
		_inspectionProvinceCode = inspectionProvinceCode;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectionProvinceCode",
						String.class);

				method.invoke(_registeredInspectionRemoteModel,
					inspectionProvinceCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactName() {
		return _contactName;
	}

	@Override
	public void setContactName(String contactName) {
		_contactName = contactName;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setContactName", String.class);

				method.invoke(_registeredInspectionRemoteModel, contactName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactPhone() {
		return _contactPhone;
	}

	@Override
	public void setContactPhone(String contactPhone) {
		_contactPhone = contactPhone;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setContactPhone", String.class);

				method.invoke(_registeredInspectionRemoteModel, contactPhone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactEmail() {
		return _contactEmail;
	}

	@Override
	public void setContactEmail(String contactEmail) {
		_contactEmail = contactEmail;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setContactEmail", String.class);

				method.invoke(_registeredInspectionRemoteModel, contactEmail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImporterSignName() {
		return _importerSignName;
	}

	@Override
	public void setImporterSignName(String importerSignName) {
		_importerSignName = importerSignName;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setImporterSignName",
						String.class);

				method.invoke(_registeredInspectionRemoteModel, importerSignName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImporterSignTitle() {
		return _importerSignTitle;
	}

	@Override
	public void setImporterSignTitle(String importerSignTitle) {
		_importerSignTitle = importerSignTitle;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setImporterSignTitle",
						String.class);

				method.invoke(_registeredInspectionRemoteModel,
					importerSignTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImporterSignPlace() {
		return _importerSignPlace;
	}

	@Override
	public void setImporterSignPlace(String importerSignPlace) {
		_importerSignPlace = importerSignPlace;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setImporterSignPlace",
						String.class);

				method.invoke(_registeredInspectionRemoteModel,
					importerSignPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getImporterSignDate() {
		return _importerSignDate;
	}

	@Override
	public void setImporterSignDate(Date importerSignDate) {
		_importerSignDate = importerSignDate;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setImporterSignDate",
						Date.class);

				method.invoke(_registeredInspectionRemoteModel, importerSignDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorOrganization() {
		return _inspectorOrganization;
	}

	@Override
	public void setInspectorOrganization(String inspectorOrganization) {
		_inspectorOrganization = inspectorOrganization;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorOrganization",
						String.class);

				method.invoke(_registeredInspectionRemoteModel,
					inspectorOrganization);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorDivision() {
		return _inspectorDivision;
	}

	@Override
	public void setInspectorDivision(String inspectorDivision) {
		_inspectorDivision = inspectorDivision;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorDivision",
						String.class);

				method.invoke(_registeredInspectionRemoteModel,
					inspectorDivision);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorSigNname() {
		return _inspectorSigNname;
	}

	@Override
	public void setInspectorSigNname(String inspectorSigNname) {
		_inspectorSigNname = inspectorSigNname;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorSigNname",
						String.class);

				method.invoke(_registeredInspectionRemoteModel,
					inspectorSigNname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorSignTitle() {
		return _inspectorSignTitle;
	}

	@Override
	public void setInspectorSignTitle(String inspectorSignTitle) {
		_inspectorSignTitle = inspectorSignTitle;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorSignTitle",
						String.class);

				method.invoke(_registeredInspectionRemoteModel,
					inspectorSignTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInspectorSignPlace() {
		return _inspectorSignPlace;
	}

	@Override
	public void setInspectorSignPlace(String inspectorSignPlace) {
		_inspectorSignPlace = inspectorSignPlace;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorSignPlace",
						String.class);

				method.invoke(_registeredInspectionRemoteModel,
					inspectorSignPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getInspectorSignDate() {
		return _inspectorSignDate;
	}

	@Override
	public void setInspectorSignDate(Date inspectorSignDate) {
		_inspectorSignDate = inspectorSignDate;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setInspectorSignDate",
						Date.class);

				method.invoke(_registeredInspectionRemoteModel,
					inspectorSignDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSynchDate() {
		return _SynchDate;
	}

	@Override
	public void setSynchDate(Date SynchDate) {
		_SynchDate = SynchDate;

		if (_registeredInspectionRemoteModel != null) {
			try {
				Class<?> clazz = _registeredInspectionRemoteModel.getClass();

				Method method = clazz.getMethod("setSynchDate", Date.class);

				method.invoke(_registeredInspectionRemoteModel, SynchDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRegisteredInspectionRemoteModel() {
		return _registeredInspectionRemoteModel;
	}

	public void setRegisteredInspectionRemoteModel(
		BaseModel<?> registeredInspectionRemoteModel) {
		_registeredInspectionRemoteModel = registeredInspectionRemoteModel;
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

		Class<?> remoteModelClass = _registeredInspectionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_registeredInspectionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RegisteredInspectionLocalServiceUtil.addRegisteredInspection(this);
		}
		else {
			RegisteredInspectionLocalServiceUtil.updateRegisteredInspection(this);
		}
	}

	@Override
	public RegisteredInspection toEscapedModel() {
		return (RegisteredInspection)ProxyUtil.newProxyInstance(RegisteredInspection.class.getClassLoader(),
			new Class[] { RegisteredInspection.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RegisteredInspectionClp clone = new RegisteredInspectionClp();

		clone.setId(getId());
		clone.setRegisteredNumber(getRegisteredNumber());
		clone.setDossierId(getDossierId());
		clone.setAttachedFile(getAttachedFile());
		clone.setImporterCode(getImporterCode());
		clone.setImporterName(getImporterName());
		clone.setImporterAddress(getImporterAddress());
		clone.setRepresentative(getRepresentative());
		clone.setPhone(getPhone());
		clone.setFax(getFax());
		clone.setEmail(getEmail());
		clone.setInspectionDate(getInspectionDate());
		clone.setInspectionSite(getInspectionSite());
		clone.setInspectionDistrictCode(getInspectionDistrictCode());
		clone.setInspectionProvinceCode(getInspectionProvinceCode());
		clone.setContactName(getContactName());
		clone.setContactPhone(getContactPhone());
		clone.setContactEmail(getContactEmail());
		clone.setImporterSignName(getImporterSignName());
		clone.setImporterSignTitle(getImporterSignTitle());
		clone.setImporterSignPlace(getImporterSignPlace());
		clone.setImporterSignDate(getImporterSignDate());
		clone.setInspectorOrganization(getInspectorOrganization());
		clone.setInspectorDivision(getInspectorDivision());
		clone.setInspectorSigNname(getInspectorSigNname());
		clone.setInspectorSignTitle(getInspectorSignTitle());
		clone.setInspectorSignPlace(getInspectorSignPlace());
		clone.setInspectorSignDate(getInspectorSignDate());
		clone.setSynchDate(getSynchDate());

		return clone;
	}

	@Override
	public int compareTo(RegisteredInspection registeredInspection) {
		int value = 0;

		if (getId() < registeredInspection.getId()) {
			value = -1;
		}
		else if (getId() > registeredInspection.getId()) {
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

		if (!(obj instanceof RegisteredInspectionClp)) {
			return false;
		}

		RegisteredInspectionClp registeredInspection = (RegisteredInspectionClp)obj;

		long primaryKey = registeredInspection.getPrimaryKey();

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
		StringBundler sb = new StringBundler(59);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", registeredNumber=");
		sb.append(getRegisteredNumber());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", attachedFile=");
		sb.append(getAttachedFile());
		sb.append(", importerCode=");
		sb.append(getImporterCode());
		sb.append(", importerName=");
		sb.append(getImporterName());
		sb.append(", importerAddress=");
		sb.append(getImporterAddress());
		sb.append(", representative=");
		sb.append(getRepresentative());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", inspectionDate=");
		sb.append(getInspectionDate());
		sb.append(", inspectionSite=");
		sb.append(getInspectionSite());
		sb.append(", inspectionDistrictCode=");
		sb.append(getInspectionDistrictCode());
		sb.append(", inspectionProvinceCode=");
		sb.append(getInspectionProvinceCode());
		sb.append(", contactName=");
		sb.append(getContactName());
		sb.append(", contactPhone=");
		sb.append(getContactPhone());
		sb.append(", contactEmail=");
		sb.append(getContactEmail());
		sb.append(", importerSignName=");
		sb.append(getImporterSignName());
		sb.append(", importerSignTitle=");
		sb.append(getImporterSignTitle());
		sb.append(", importerSignPlace=");
		sb.append(getImporterSignPlace());
		sb.append(", importerSignDate=");
		sb.append(getImporterSignDate());
		sb.append(", inspectorOrganization=");
		sb.append(getInspectorOrganization());
		sb.append(", inspectorDivision=");
		sb.append(getInspectorDivision());
		sb.append(", inspectorSigNname=");
		sb.append(getInspectorSigNname());
		sb.append(", inspectorSignTitle=");
		sb.append(getInspectorSignTitle());
		sb.append(", inspectorSignPlace=");
		sb.append(getInspectorSignPlace());
		sb.append(", inspectorSignDate=");
		sb.append(getInspectorSignDate());
		sb.append(", SynchDate=");
		sb.append(getSynchDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(91);

		sb.append("<model><model-name>");
		sb.append("vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registeredNumber</column-name><column-value><![CDATA[");
		sb.append(getRegisteredNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachedFile</column-name><column-value><![CDATA[");
		sb.append(getAttachedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importerCode</column-name><column-value><![CDATA[");
		sb.append(getImporterCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importerName</column-name><column-value><![CDATA[");
		sb.append(getImporterName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importerAddress</column-name><column-value><![CDATA[");
		sb.append(getImporterAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>representative</column-name><column-value><![CDATA[");
		sb.append(getRepresentative());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDate</column-name><column-value><![CDATA[");
		sb.append(getInspectionDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionSite</column-name><column-value><![CDATA[");
		sb.append(getInspectionSite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionDistrictCode</column-name><column-value><![CDATA[");
		sb.append(getInspectionDistrictCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectionProvinceCode</column-name><column-value><![CDATA[");
		sb.append(getInspectionProvinceCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactName</column-name><column-value><![CDATA[");
		sb.append(getContactName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactPhone</column-name><column-value><![CDATA[");
		sb.append(getContactPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactEmail</column-name><column-value><![CDATA[");
		sb.append(getContactEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importerSignName</column-name><column-value><![CDATA[");
		sb.append(getImporterSignName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importerSignTitle</column-name><column-value><![CDATA[");
		sb.append(getImporterSignTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importerSignPlace</column-name><column-value><![CDATA[");
		sb.append(getImporterSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>importerSignDate</column-name><column-value><![CDATA[");
		sb.append(getImporterSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorOrganization</column-name><column-value><![CDATA[");
		sb.append(getInspectorOrganization());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorDivision</column-name><column-value><![CDATA[");
		sb.append(getInspectorDivision());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorSigNname</column-name><column-value><![CDATA[");
		sb.append(getInspectorSigNname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorSignTitle</column-name><column-value><![CDATA[");
		sb.append(getInspectorSignTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorSignPlace</column-name><column-value><![CDATA[");
		sb.append(getInspectorSignPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inspectorSignDate</column-name><column-value><![CDATA[");
		sb.append(getInspectorSignDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>SynchDate</column-name><column-value><![CDATA[");
		sb.append(getSynchDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private Date _SynchDate;
	private BaseModel<?> _registeredInspectionRemoteModel;
}