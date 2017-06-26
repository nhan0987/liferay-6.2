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
 * This class is a wrapper for {@link CfgTechnicalspec}.
 * </p>
 *
 * @author huymq
 * @see CfgTechnicalspec
 * @generated
 */
public class CfgTechnicalspecWrapper implements CfgTechnicalspec,
	ModelWrapper<CfgTechnicalspec> {
	public CfgTechnicalspecWrapper(CfgTechnicalspec cfgTechnicalspec) {
		_cfgTechnicalspec = cfgTechnicalspec;
	}

	@Override
	public Class<?> getModelClass() {
		return CfgTechnicalspec.class;
	}

	@Override
	public String getModelClassName() {
		return CfgTechnicalspec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicleTypeCode", getVehicleTypeCode());
		attributes.put("vehicleTypeName", getVehicleTypeName());
		attributes.put("sequenceno", getSequenceno());
		attributes.put("specificationCode", getSpecificationCode());
		attributes.put("specificationName", getSpecificationName());
		attributes.put("specDescription", getSpecDescription());
		attributes.put("specCategory", getSpecCategory());
		attributes.put("specificationGroup", getSpecificationGroup());
		attributes.put("searchingIncluded", getSearchingIncluded());
		attributes.put("referenceIncluded", getReferenceIncluded());
		attributes.put("certificateIncluded", getCertificateIncluded());
		attributes.put("datagroupid", getDatagroupid());
		attributes.put("synchdate", getSynchdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String vehicleTypeCode = (String)attributes.get("vehicleTypeCode");

		if (vehicleTypeCode != null) {
			setVehicleTypeCode(vehicleTypeCode);
		}

		String vehicleTypeName = (String)attributes.get("vehicleTypeName");

		if (vehicleTypeName != null) {
			setVehicleTypeName(vehicleTypeName);
		}

		Long sequenceno = (Long)attributes.get("sequenceno");

		if (sequenceno != null) {
			setSequenceno(sequenceno);
		}

		String specificationCode = (String)attributes.get("specificationCode");

		if (specificationCode != null) {
			setSpecificationCode(specificationCode);
		}

		String specificationName = (String)attributes.get("specificationName");

		if (specificationName != null) {
			setSpecificationName(specificationName);
		}

		String specDescription = (String)attributes.get("specDescription");

		if (specDescription != null) {
			setSpecDescription(specDescription);
		}

		String specCategory = (String)attributes.get("specCategory");

		if (specCategory != null) {
			setSpecCategory(specCategory);
		}

		Long specificationGroup = (Long)attributes.get("specificationGroup");

		if (specificationGroup != null) {
			setSpecificationGroup(specificationGroup);
		}

		Long searchingIncluded = (Long)attributes.get("searchingIncluded");

		if (searchingIncluded != null) {
			setSearchingIncluded(searchingIncluded);
		}

		Long referenceIncluded = (Long)attributes.get("referenceIncluded");

		if (referenceIncluded != null) {
			setReferenceIncluded(referenceIncluded);
		}

		Long certificateIncluded = (Long)attributes.get("certificateIncluded");

		if (certificateIncluded != null) {
			setCertificateIncluded(certificateIncluded);
		}

		Long datagroupid = (Long)attributes.get("datagroupid");

		if (datagroupid != null) {
			setDatagroupid(datagroupid);
		}

		Date synchdate = (Date)attributes.get("synchdate");

		if (synchdate != null) {
			setSynchdate(synchdate);
		}
	}

	/**
	* Returns the primary key of this cfg technicalspec.
	*
	* @return the primary key of this cfg technicalspec
	*/
	@Override
	public long getPrimaryKey() {
		return _cfgTechnicalspec.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cfg technicalspec.
	*
	* @param primaryKey the primary key of this cfg technicalspec
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cfgTechnicalspec.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this cfg technicalspec.
	*
	* @return the ID of this cfg technicalspec
	*/
	@Override
	public long getId() {
		return _cfgTechnicalspec.getId();
	}

	/**
	* Sets the ID of this cfg technicalspec.
	*
	* @param id the ID of this cfg technicalspec
	*/
	@Override
	public void setId(long id) {
		_cfgTechnicalspec.setId(id);
	}

	/**
	* Returns the vehicle type code of this cfg technicalspec.
	*
	* @return the vehicle type code of this cfg technicalspec
	*/
	@Override
	public java.lang.String getVehicleTypeCode() {
		return _cfgTechnicalspec.getVehicleTypeCode();
	}

	/**
	* Sets the vehicle type code of this cfg technicalspec.
	*
	* @param vehicleTypeCode the vehicle type code of this cfg technicalspec
	*/
	@Override
	public void setVehicleTypeCode(java.lang.String vehicleTypeCode) {
		_cfgTechnicalspec.setVehicleTypeCode(vehicleTypeCode);
	}

	/**
	* Returns the vehicle type name of this cfg technicalspec.
	*
	* @return the vehicle type name of this cfg technicalspec
	*/
	@Override
	public java.lang.String getVehicleTypeName() {
		return _cfgTechnicalspec.getVehicleTypeName();
	}

	/**
	* Sets the vehicle type name of this cfg technicalspec.
	*
	* @param vehicleTypeName the vehicle type name of this cfg technicalspec
	*/
	@Override
	public void setVehicleTypeName(java.lang.String vehicleTypeName) {
		_cfgTechnicalspec.setVehicleTypeName(vehicleTypeName);
	}

	/**
	* Returns the sequenceno of this cfg technicalspec.
	*
	* @return the sequenceno of this cfg technicalspec
	*/
	@Override
	public long getSequenceno() {
		return _cfgTechnicalspec.getSequenceno();
	}

	/**
	* Sets the sequenceno of this cfg technicalspec.
	*
	* @param sequenceno the sequenceno of this cfg technicalspec
	*/
	@Override
	public void setSequenceno(long sequenceno) {
		_cfgTechnicalspec.setSequenceno(sequenceno);
	}

	/**
	* Returns the specification code of this cfg technicalspec.
	*
	* @return the specification code of this cfg technicalspec
	*/
	@Override
	public java.lang.String getSpecificationCode() {
		return _cfgTechnicalspec.getSpecificationCode();
	}

	/**
	* Sets the specification code of this cfg technicalspec.
	*
	* @param specificationCode the specification code of this cfg technicalspec
	*/
	@Override
	public void setSpecificationCode(java.lang.String specificationCode) {
		_cfgTechnicalspec.setSpecificationCode(specificationCode);
	}

	/**
	* Returns the specification name of this cfg technicalspec.
	*
	* @return the specification name of this cfg technicalspec
	*/
	@Override
	public java.lang.String getSpecificationName() {
		return _cfgTechnicalspec.getSpecificationName();
	}

	/**
	* Sets the specification name of this cfg technicalspec.
	*
	* @param specificationName the specification name of this cfg technicalspec
	*/
	@Override
	public void setSpecificationName(java.lang.String specificationName) {
		_cfgTechnicalspec.setSpecificationName(specificationName);
	}

	/**
	* Returns the spec description of this cfg technicalspec.
	*
	* @return the spec description of this cfg technicalspec
	*/
	@Override
	public java.lang.String getSpecDescription() {
		return _cfgTechnicalspec.getSpecDescription();
	}

	/**
	* Sets the spec description of this cfg technicalspec.
	*
	* @param specDescription the spec description of this cfg technicalspec
	*/
	@Override
	public void setSpecDescription(java.lang.String specDescription) {
		_cfgTechnicalspec.setSpecDescription(specDescription);
	}

	/**
	* Returns the spec category of this cfg technicalspec.
	*
	* @return the spec category of this cfg technicalspec
	*/
	@Override
	public java.lang.String getSpecCategory() {
		return _cfgTechnicalspec.getSpecCategory();
	}

	/**
	* Sets the spec category of this cfg technicalspec.
	*
	* @param specCategory the spec category of this cfg technicalspec
	*/
	@Override
	public void setSpecCategory(java.lang.String specCategory) {
		_cfgTechnicalspec.setSpecCategory(specCategory);
	}

	/**
	* Returns the specification group of this cfg technicalspec.
	*
	* @return the specification group of this cfg technicalspec
	*/
	@Override
	public long getSpecificationGroup() {
		return _cfgTechnicalspec.getSpecificationGroup();
	}

	/**
	* Sets the specification group of this cfg technicalspec.
	*
	* @param specificationGroup the specification group of this cfg technicalspec
	*/
	@Override
	public void setSpecificationGroup(long specificationGroup) {
		_cfgTechnicalspec.setSpecificationGroup(specificationGroup);
	}

	/**
	* Returns the searching included of this cfg technicalspec.
	*
	* @return the searching included of this cfg technicalspec
	*/
	@Override
	public long getSearchingIncluded() {
		return _cfgTechnicalspec.getSearchingIncluded();
	}

	/**
	* Sets the searching included of this cfg technicalspec.
	*
	* @param searchingIncluded the searching included of this cfg technicalspec
	*/
	@Override
	public void setSearchingIncluded(long searchingIncluded) {
		_cfgTechnicalspec.setSearchingIncluded(searchingIncluded);
	}

	/**
	* Returns the reference included of this cfg technicalspec.
	*
	* @return the reference included of this cfg technicalspec
	*/
	@Override
	public long getReferenceIncluded() {
		return _cfgTechnicalspec.getReferenceIncluded();
	}

	/**
	* Sets the reference included of this cfg technicalspec.
	*
	* @param referenceIncluded the reference included of this cfg technicalspec
	*/
	@Override
	public void setReferenceIncluded(long referenceIncluded) {
		_cfgTechnicalspec.setReferenceIncluded(referenceIncluded);
	}

	/**
	* Returns the certificate included of this cfg technicalspec.
	*
	* @return the certificate included of this cfg technicalspec
	*/
	@Override
	public long getCertificateIncluded() {
		return _cfgTechnicalspec.getCertificateIncluded();
	}

	/**
	* Sets the certificate included of this cfg technicalspec.
	*
	* @param certificateIncluded the certificate included of this cfg technicalspec
	*/
	@Override
	public void setCertificateIncluded(long certificateIncluded) {
		_cfgTechnicalspec.setCertificateIncluded(certificateIncluded);
	}

	/**
	* Returns the datagroupid of this cfg technicalspec.
	*
	* @return the datagroupid of this cfg technicalspec
	*/
	@Override
	public long getDatagroupid() {
		return _cfgTechnicalspec.getDatagroupid();
	}

	/**
	* Sets the datagroupid of this cfg technicalspec.
	*
	* @param datagroupid the datagroupid of this cfg technicalspec
	*/
	@Override
	public void setDatagroupid(long datagroupid) {
		_cfgTechnicalspec.setDatagroupid(datagroupid);
	}

	/**
	* Returns the synchdate of this cfg technicalspec.
	*
	* @return the synchdate of this cfg technicalspec
	*/
	@Override
	public java.util.Date getSynchdate() {
		return _cfgTechnicalspec.getSynchdate();
	}

	/**
	* Sets the synchdate of this cfg technicalspec.
	*
	* @param synchdate the synchdate of this cfg technicalspec
	*/
	@Override
	public void setSynchdate(java.util.Date synchdate) {
		_cfgTechnicalspec.setSynchdate(synchdate);
	}

	@Override
	public boolean isNew() {
		return _cfgTechnicalspec.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_cfgTechnicalspec.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _cfgTechnicalspec.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cfgTechnicalspec.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _cfgTechnicalspec.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _cfgTechnicalspec.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cfgTechnicalspec.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cfgTechnicalspec.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_cfgTechnicalspec.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_cfgTechnicalspec.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cfgTechnicalspec.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CfgTechnicalspecWrapper((CfgTechnicalspec)_cfgTechnicalspec.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec cfgTechnicalspec) {
		return _cfgTechnicalspec.compareTo(cfgTechnicalspec);
	}

	@Override
	public int hashCode() {
		return _cfgTechnicalspec.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> toCacheModel() {
		return _cfgTechnicalspec.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec toEscapedModel() {
		return new CfgTechnicalspecWrapper(_cfgTechnicalspec.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec toUnescapedModel() {
		return new CfgTechnicalspecWrapper(_cfgTechnicalspec.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cfgTechnicalspec.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cfgTechnicalspec.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cfgTechnicalspec.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CfgTechnicalspecWrapper)) {
			return false;
		}

		CfgTechnicalspecWrapper cfgTechnicalspecWrapper = (CfgTechnicalspecWrapper)obj;

		if (Validator.equals(_cfgTechnicalspec,
					cfgTechnicalspecWrapper._cfgTechnicalspec)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CfgTechnicalspec getWrappedCfgTechnicalspec() {
		return _cfgTechnicalspec;
	}

	@Override
	public CfgTechnicalspec getWrappedModel() {
		return _cfgTechnicalspec;
	}

	@Override
	public void resetOriginalValues() {
		_cfgTechnicalspec.resetOriginalValues();
	}

	private CfgTechnicalspec _cfgTechnicalspec;
}