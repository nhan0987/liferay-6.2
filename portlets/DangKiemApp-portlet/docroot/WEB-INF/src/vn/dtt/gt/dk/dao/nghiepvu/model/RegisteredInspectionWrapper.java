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
 * This class is a wrapper for {@link RegisteredInspection}.
 * </p>
 *
 * @author win_64
 * @see RegisteredInspection
 * @generated
 */
public class RegisteredInspectionWrapper implements RegisteredInspection,
	ModelWrapper<RegisteredInspection> {
	public RegisteredInspectionWrapper(
		RegisteredInspection registeredInspection) {
		_registeredInspection = registeredInspection;
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

	/**
	* Returns the primary key of this registered inspection.
	*
	* @return the primary key of this registered inspection
	*/
	@Override
	public long getPrimaryKey() {
		return _registeredInspection.getPrimaryKey();
	}

	/**
	* Sets the primary key of this registered inspection.
	*
	* @param primaryKey the primary key of this registered inspection
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_registeredInspection.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this registered inspection.
	*
	* @return the ID of this registered inspection
	*/
	@Override
	public long getId() {
		return _registeredInspection.getId();
	}

	/**
	* Sets the ID of this registered inspection.
	*
	* @param id the ID of this registered inspection
	*/
	@Override
	public void setId(long id) {
		_registeredInspection.setId(id);
	}

	/**
	* Returns the registered number of this registered inspection.
	*
	* @return the registered number of this registered inspection
	*/
	@Override
	public java.lang.String getRegisteredNumber() {
		return _registeredInspection.getRegisteredNumber();
	}

	/**
	* Sets the registered number of this registered inspection.
	*
	* @param registeredNumber the registered number of this registered inspection
	*/
	@Override
	public void setRegisteredNumber(java.lang.String registeredNumber) {
		_registeredInspection.setRegisteredNumber(registeredNumber);
	}

	/**
	* Returns the dossier ID of this registered inspection.
	*
	* @return the dossier ID of this registered inspection
	*/
	@Override
	public long getDossierId() {
		return _registeredInspection.getDossierId();
	}

	/**
	* Sets the dossier ID of this registered inspection.
	*
	* @param dossierId the dossier ID of this registered inspection
	*/
	@Override
	public void setDossierId(long dossierId) {
		_registeredInspection.setDossierId(dossierId);
	}

	/**
	* Returns the attached file of this registered inspection.
	*
	* @return the attached file of this registered inspection
	*/
	@Override
	public long getAttachedFile() {
		return _registeredInspection.getAttachedFile();
	}

	/**
	* Sets the attached file of this registered inspection.
	*
	* @param attachedFile the attached file of this registered inspection
	*/
	@Override
	public void setAttachedFile(long attachedFile) {
		_registeredInspection.setAttachedFile(attachedFile);
	}

	/**
	* Returns the importer code of this registered inspection.
	*
	* @return the importer code of this registered inspection
	*/
	@Override
	public java.lang.String getImporterCode() {
		return _registeredInspection.getImporterCode();
	}

	/**
	* Sets the importer code of this registered inspection.
	*
	* @param importerCode the importer code of this registered inspection
	*/
	@Override
	public void setImporterCode(java.lang.String importerCode) {
		_registeredInspection.setImporterCode(importerCode);
	}

	/**
	* Returns the importer name of this registered inspection.
	*
	* @return the importer name of this registered inspection
	*/
	@Override
	public java.lang.String getImporterName() {
		return _registeredInspection.getImporterName();
	}

	/**
	* Sets the importer name of this registered inspection.
	*
	* @param importerName the importer name of this registered inspection
	*/
	@Override
	public void setImporterName(java.lang.String importerName) {
		_registeredInspection.setImporterName(importerName);
	}

	/**
	* Returns the importer address of this registered inspection.
	*
	* @return the importer address of this registered inspection
	*/
	@Override
	public java.lang.String getImporterAddress() {
		return _registeredInspection.getImporterAddress();
	}

	/**
	* Sets the importer address of this registered inspection.
	*
	* @param importerAddress the importer address of this registered inspection
	*/
	@Override
	public void setImporterAddress(java.lang.String importerAddress) {
		_registeredInspection.setImporterAddress(importerAddress);
	}

	/**
	* Returns the representative of this registered inspection.
	*
	* @return the representative of this registered inspection
	*/
	@Override
	public java.lang.String getRepresentative() {
		return _registeredInspection.getRepresentative();
	}

	/**
	* Sets the representative of this registered inspection.
	*
	* @param representative the representative of this registered inspection
	*/
	@Override
	public void setRepresentative(java.lang.String representative) {
		_registeredInspection.setRepresentative(representative);
	}

	/**
	* Returns the phone of this registered inspection.
	*
	* @return the phone of this registered inspection
	*/
	@Override
	public java.lang.String getPhone() {
		return _registeredInspection.getPhone();
	}

	/**
	* Sets the phone of this registered inspection.
	*
	* @param phone the phone of this registered inspection
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_registeredInspection.setPhone(phone);
	}

	/**
	* Returns the fax of this registered inspection.
	*
	* @return the fax of this registered inspection
	*/
	@Override
	public java.lang.String getFax() {
		return _registeredInspection.getFax();
	}

	/**
	* Sets the fax of this registered inspection.
	*
	* @param fax the fax of this registered inspection
	*/
	@Override
	public void setFax(java.lang.String fax) {
		_registeredInspection.setFax(fax);
	}

	/**
	* Returns the email of this registered inspection.
	*
	* @return the email of this registered inspection
	*/
	@Override
	public java.lang.String getEmail() {
		return _registeredInspection.getEmail();
	}

	/**
	* Sets the email of this registered inspection.
	*
	* @param email the email of this registered inspection
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_registeredInspection.setEmail(email);
	}

	/**
	* Returns the inspection date of this registered inspection.
	*
	* @return the inspection date of this registered inspection
	*/
	@Override
	public java.util.Date getInspectionDate() {
		return _registeredInspection.getInspectionDate();
	}

	/**
	* Sets the inspection date of this registered inspection.
	*
	* @param inspectionDate the inspection date of this registered inspection
	*/
	@Override
	public void setInspectionDate(java.util.Date inspectionDate) {
		_registeredInspection.setInspectionDate(inspectionDate);
	}

	/**
	* Returns the inspection site of this registered inspection.
	*
	* @return the inspection site of this registered inspection
	*/
	@Override
	public java.lang.String getInspectionSite() {
		return _registeredInspection.getInspectionSite();
	}

	/**
	* Sets the inspection site of this registered inspection.
	*
	* @param inspectionSite the inspection site of this registered inspection
	*/
	@Override
	public void setInspectionSite(java.lang.String inspectionSite) {
		_registeredInspection.setInspectionSite(inspectionSite);
	}

	/**
	* Returns the inspection district code of this registered inspection.
	*
	* @return the inspection district code of this registered inspection
	*/
	@Override
	public java.lang.String getInspectionDistrictCode() {
		return _registeredInspection.getInspectionDistrictCode();
	}

	/**
	* Sets the inspection district code of this registered inspection.
	*
	* @param inspectionDistrictCode the inspection district code of this registered inspection
	*/
	@Override
	public void setInspectionDistrictCode(
		java.lang.String inspectionDistrictCode) {
		_registeredInspection.setInspectionDistrictCode(inspectionDistrictCode);
	}

	/**
	* Returns the inspection province code of this registered inspection.
	*
	* @return the inspection province code of this registered inspection
	*/
	@Override
	public java.lang.String getInspectionProvinceCode() {
		return _registeredInspection.getInspectionProvinceCode();
	}

	/**
	* Sets the inspection province code of this registered inspection.
	*
	* @param inspectionProvinceCode the inspection province code of this registered inspection
	*/
	@Override
	public void setInspectionProvinceCode(
		java.lang.String inspectionProvinceCode) {
		_registeredInspection.setInspectionProvinceCode(inspectionProvinceCode);
	}

	/**
	* Returns the contact name of this registered inspection.
	*
	* @return the contact name of this registered inspection
	*/
	@Override
	public java.lang.String getContactName() {
		return _registeredInspection.getContactName();
	}

	/**
	* Sets the contact name of this registered inspection.
	*
	* @param contactName the contact name of this registered inspection
	*/
	@Override
	public void setContactName(java.lang.String contactName) {
		_registeredInspection.setContactName(contactName);
	}

	/**
	* Returns the contact phone of this registered inspection.
	*
	* @return the contact phone of this registered inspection
	*/
	@Override
	public java.lang.String getContactPhone() {
		return _registeredInspection.getContactPhone();
	}

	/**
	* Sets the contact phone of this registered inspection.
	*
	* @param contactPhone the contact phone of this registered inspection
	*/
	@Override
	public void setContactPhone(java.lang.String contactPhone) {
		_registeredInspection.setContactPhone(contactPhone);
	}

	/**
	* Returns the contact email of this registered inspection.
	*
	* @return the contact email of this registered inspection
	*/
	@Override
	public java.lang.String getContactEmail() {
		return _registeredInspection.getContactEmail();
	}

	/**
	* Sets the contact email of this registered inspection.
	*
	* @param contactEmail the contact email of this registered inspection
	*/
	@Override
	public void setContactEmail(java.lang.String contactEmail) {
		_registeredInspection.setContactEmail(contactEmail);
	}

	/**
	* Returns the importer sign name of this registered inspection.
	*
	* @return the importer sign name of this registered inspection
	*/
	@Override
	public java.lang.String getImporterSignName() {
		return _registeredInspection.getImporterSignName();
	}

	/**
	* Sets the importer sign name of this registered inspection.
	*
	* @param importerSignName the importer sign name of this registered inspection
	*/
	@Override
	public void setImporterSignName(java.lang.String importerSignName) {
		_registeredInspection.setImporterSignName(importerSignName);
	}

	/**
	* Returns the importer sign title of this registered inspection.
	*
	* @return the importer sign title of this registered inspection
	*/
	@Override
	public java.lang.String getImporterSignTitle() {
		return _registeredInspection.getImporterSignTitle();
	}

	/**
	* Sets the importer sign title of this registered inspection.
	*
	* @param importerSignTitle the importer sign title of this registered inspection
	*/
	@Override
	public void setImporterSignTitle(java.lang.String importerSignTitle) {
		_registeredInspection.setImporterSignTitle(importerSignTitle);
	}

	/**
	* Returns the importer sign place of this registered inspection.
	*
	* @return the importer sign place of this registered inspection
	*/
	@Override
	public java.lang.String getImporterSignPlace() {
		return _registeredInspection.getImporterSignPlace();
	}

	/**
	* Sets the importer sign place of this registered inspection.
	*
	* @param importerSignPlace the importer sign place of this registered inspection
	*/
	@Override
	public void setImporterSignPlace(java.lang.String importerSignPlace) {
		_registeredInspection.setImporterSignPlace(importerSignPlace);
	}

	/**
	* Returns the importer sign date of this registered inspection.
	*
	* @return the importer sign date of this registered inspection
	*/
	@Override
	public java.util.Date getImporterSignDate() {
		return _registeredInspection.getImporterSignDate();
	}

	/**
	* Sets the importer sign date of this registered inspection.
	*
	* @param importerSignDate the importer sign date of this registered inspection
	*/
	@Override
	public void setImporterSignDate(java.util.Date importerSignDate) {
		_registeredInspection.setImporterSignDate(importerSignDate);
	}

	/**
	* Returns the inspector organization of this registered inspection.
	*
	* @return the inspector organization of this registered inspection
	*/
	@Override
	public java.lang.String getInspectorOrganization() {
		return _registeredInspection.getInspectorOrganization();
	}

	/**
	* Sets the inspector organization of this registered inspection.
	*
	* @param inspectorOrganization the inspector organization of this registered inspection
	*/
	@Override
	public void setInspectorOrganization(java.lang.String inspectorOrganization) {
		_registeredInspection.setInspectorOrganization(inspectorOrganization);
	}

	/**
	* Returns the inspector division of this registered inspection.
	*
	* @return the inspector division of this registered inspection
	*/
	@Override
	public java.lang.String getInspectorDivision() {
		return _registeredInspection.getInspectorDivision();
	}

	/**
	* Sets the inspector division of this registered inspection.
	*
	* @param inspectorDivision the inspector division of this registered inspection
	*/
	@Override
	public void setInspectorDivision(java.lang.String inspectorDivision) {
		_registeredInspection.setInspectorDivision(inspectorDivision);
	}

	/**
	* Returns the inspector sig nname of this registered inspection.
	*
	* @return the inspector sig nname of this registered inspection
	*/
	@Override
	public java.lang.String getInspectorSigNname() {
		return _registeredInspection.getInspectorSigNname();
	}

	/**
	* Sets the inspector sig nname of this registered inspection.
	*
	* @param inspectorSigNname the inspector sig nname of this registered inspection
	*/
	@Override
	public void setInspectorSigNname(java.lang.String inspectorSigNname) {
		_registeredInspection.setInspectorSigNname(inspectorSigNname);
	}

	/**
	* Returns the inspector sign title of this registered inspection.
	*
	* @return the inspector sign title of this registered inspection
	*/
	@Override
	public java.lang.String getInspectorSignTitle() {
		return _registeredInspection.getInspectorSignTitle();
	}

	/**
	* Sets the inspector sign title of this registered inspection.
	*
	* @param inspectorSignTitle the inspector sign title of this registered inspection
	*/
	@Override
	public void setInspectorSignTitle(java.lang.String inspectorSignTitle) {
		_registeredInspection.setInspectorSignTitle(inspectorSignTitle);
	}

	/**
	* Returns the inspector sign place of this registered inspection.
	*
	* @return the inspector sign place of this registered inspection
	*/
	@Override
	public java.lang.String getInspectorSignPlace() {
		return _registeredInspection.getInspectorSignPlace();
	}

	/**
	* Sets the inspector sign place of this registered inspection.
	*
	* @param inspectorSignPlace the inspector sign place of this registered inspection
	*/
	@Override
	public void setInspectorSignPlace(java.lang.String inspectorSignPlace) {
		_registeredInspection.setInspectorSignPlace(inspectorSignPlace);
	}

	/**
	* Returns the inspector sign date of this registered inspection.
	*
	* @return the inspector sign date of this registered inspection
	*/
	@Override
	public java.util.Date getInspectorSignDate() {
		return _registeredInspection.getInspectorSignDate();
	}

	/**
	* Sets the inspector sign date of this registered inspection.
	*
	* @param inspectorSignDate the inspector sign date of this registered inspection
	*/
	@Override
	public void setInspectorSignDate(java.util.Date inspectorSignDate) {
		_registeredInspection.setInspectorSignDate(inspectorSignDate);
	}

	/**
	* Returns the synch date of this registered inspection.
	*
	* @return the synch date of this registered inspection
	*/
	@Override
	public java.util.Date getSynchDate() {
		return _registeredInspection.getSynchDate();
	}

	/**
	* Sets the synch date of this registered inspection.
	*
	* @param SynchDate the synch date of this registered inspection
	*/
	@Override
	public void setSynchDate(java.util.Date SynchDate) {
		_registeredInspection.setSynchDate(SynchDate);
	}

	@Override
	public boolean isNew() {
		return _registeredInspection.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_registeredInspection.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _registeredInspection.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_registeredInspection.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _registeredInspection.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _registeredInspection.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_registeredInspection.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _registeredInspection.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_registeredInspection.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_registeredInspection.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_registeredInspection.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RegisteredInspectionWrapper((RegisteredInspection)_registeredInspection.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection registeredInspection) {
		return _registeredInspection.compareTo(registeredInspection);
	}

	@Override
	public int hashCode() {
		return _registeredInspection.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection> toCacheModel() {
		return _registeredInspection.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection toEscapedModel() {
		return new RegisteredInspectionWrapper(_registeredInspection.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.RegisteredInspection toUnescapedModel() {
		return new RegisteredInspectionWrapper(_registeredInspection.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _registeredInspection.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _registeredInspection.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_registeredInspection.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RegisteredInspectionWrapper)) {
			return false;
		}

		RegisteredInspectionWrapper registeredInspectionWrapper = (RegisteredInspectionWrapper)obj;

		if (Validator.equals(_registeredInspection,
					registeredInspectionWrapper._registeredInspection)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public RegisteredInspection getWrappedRegisteredInspection() {
		return _registeredInspection;
	}

	@Override
	public RegisteredInspection getWrappedModel() {
		return _registeredInspection;
	}

	@Override
	public void resetOriginalValues() {
		_registeredInspection.resetOriginalValues();
	}

	private RegisteredInspection _registeredInspection;
}