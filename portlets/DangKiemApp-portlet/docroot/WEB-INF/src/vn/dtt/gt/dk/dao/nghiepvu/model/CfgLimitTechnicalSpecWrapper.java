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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CfgLimitTechnicalSpec}.
 * </p>
 *
 * @author win_64
 * @see CfgLimitTechnicalSpec
 * @generated
 */
public class CfgLimitTechnicalSpecWrapper implements CfgLimitTechnicalSpec,
	ModelWrapper<CfgLimitTechnicalSpec> {
	public CfgLimitTechnicalSpecWrapper(
		CfgLimitTechnicalSpec cfgLimitTechnicalSpec) {
		_cfgLimitTechnicalSpec = cfgLimitTechnicalSpec;
	}

	@Override
	public Class<?> getModelClass() {
		return CfgLimitTechnicalSpec.class;
	}

	@Override
	public String getModelClassName() {
		return CfgLimitTechnicalSpec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("vehicletypecode", getVehicletypecode());
		attributes.put("vehicletypename", getVehicletypename());
		attributes.put("reference_code_3", getReference_code_3());
		attributes.put("reference_name", getReference_name());
		attributes.put("searching_drive_config", getSearching_drive_config());
		attributes.put("altername", getAltername());
		attributes.put("sequenceno", getSequenceno());
		attributes.put("specificationcode", getSpecificationcode());
		attributes.put("specificationname", getSpecificationname());
		attributes.put("spec_description", getSpec_description());
		attributes.put("spec_category", getSpec_category());
		attributes.put("datagroupid", getDatagroupid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String vehicletypecode = (String)attributes.get("vehicletypecode");

		if (vehicletypecode != null) {
			setVehicletypecode(vehicletypecode);
		}

		String vehicletypename = (String)attributes.get("vehicletypename");

		if (vehicletypename != null) {
			setVehicletypename(vehicletypename);
		}

		String reference_code_3 = (String)attributes.get("reference_code_3");

		if (reference_code_3 != null) {
			setReference_code_3(reference_code_3);
		}

		String reference_name = (String)attributes.get("reference_name");

		if (reference_name != null) {
			setReference_name(reference_name);
		}

		Integer searching_drive_config = (Integer)attributes.get(
				"searching_drive_config");

		if (searching_drive_config != null) {
			setSearching_drive_config(searching_drive_config);
		}

		String altername = (String)attributes.get("altername");

		if (altername != null) {
			setAltername(altername);
		}

		Integer sequenceno = (Integer)attributes.get("sequenceno");

		if (sequenceno != null) {
			setSequenceno(sequenceno);
		}

		String specificationcode = (String)attributes.get("specificationcode");

		if (specificationcode != null) {
			setSpecificationcode(specificationcode);
		}

		String specificationname = (String)attributes.get("specificationname");

		if (specificationname != null) {
			setSpecificationname(specificationname);
		}

		String spec_description = (String)attributes.get("spec_description");

		if (spec_description != null) {
			setSpec_description(spec_description);
		}

		String spec_category = (String)attributes.get("spec_category");

		if (spec_category != null) {
			setSpec_category(spec_category);
		}

		Long datagroupid = (Long)attributes.get("datagroupid");

		if (datagroupid != null) {
			setDatagroupid(datagroupid);
		}
	}

	/**
	* Returns the primary key of this cfg limit technical spec.
	*
	* @return the primary key of this cfg limit technical spec
	*/
	@Override
	public long getPrimaryKey() {
		return _cfgLimitTechnicalSpec.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cfg limit technical spec.
	*
	* @param primaryKey the primary key of this cfg limit technical spec
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cfgLimitTechnicalSpec.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this cfg limit technical spec.
	*
	* @return the ID of this cfg limit technical spec
	*/
	@Override
	public long getId() {
		return _cfgLimitTechnicalSpec.getId();
	}

	/**
	* Sets the ID of this cfg limit technical spec.
	*
	* @param id the ID of this cfg limit technical spec
	*/
	@Override
	public void setId(long id) {
		_cfgLimitTechnicalSpec.setId(id);
	}

	/**
	* Returns the vehicletypecode of this cfg limit technical spec.
	*
	* @return the vehicletypecode of this cfg limit technical spec
	*/
	@Override
	public java.lang.String getVehicletypecode() {
		return _cfgLimitTechnicalSpec.getVehicletypecode();
	}

	/**
	* Sets the vehicletypecode of this cfg limit technical spec.
	*
	* @param vehicletypecode the vehicletypecode of this cfg limit technical spec
	*/
	@Override
	public void setVehicletypecode(java.lang.String vehicletypecode) {
		_cfgLimitTechnicalSpec.setVehicletypecode(vehicletypecode);
	}

	/**
	* Returns the vehicletypename of this cfg limit technical spec.
	*
	* @return the vehicletypename of this cfg limit technical spec
	*/
	@Override
	public java.lang.String getVehicletypename() {
		return _cfgLimitTechnicalSpec.getVehicletypename();
	}

	/**
	* Sets the vehicletypename of this cfg limit technical spec.
	*
	* @param vehicletypename the vehicletypename of this cfg limit technical spec
	*/
	@Override
	public void setVehicletypename(java.lang.String vehicletypename) {
		_cfgLimitTechnicalSpec.setVehicletypename(vehicletypename);
	}

	/**
	* Returns the reference_code_3 of this cfg limit technical spec.
	*
	* @return the reference_code_3 of this cfg limit technical spec
	*/
	@Override
	public java.lang.String getReference_code_3() {
		return _cfgLimitTechnicalSpec.getReference_code_3();
	}

	/**
	* Sets the reference_code_3 of this cfg limit technical spec.
	*
	* @param reference_code_3 the reference_code_3 of this cfg limit technical spec
	*/
	@Override
	public void setReference_code_3(java.lang.String reference_code_3) {
		_cfgLimitTechnicalSpec.setReference_code_3(reference_code_3);
	}

	/**
	* Returns the reference_name of this cfg limit technical spec.
	*
	* @return the reference_name of this cfg limit technical spec
	*/
	@Override
	public java.lang.String getReference_name() {
		return _cfgLimitTechnicalSpec.getReference_name();
	}

	/**
	* Sets the reference_name of this cfg limit technical spec.
	*
	* @param reference_name the reference_name of this cfg limit technical spec
	*/
	@Override
	public void setReference_name(java.lang.String reference_name) {
		_cfgLimitTechnicalSpec.setReference_name(reference_name);
	}

	/**
	* Returns the searching_drive_config of this cfg limit technical spec.
	*
	* @return the searching_drive_config of this cfg limit technical spec
	*/
	@Override
	public int getSearching_drive_config() {
		return _cfgLimitTechnicalSpec.getSearching_drive_config();
	}

	/**
	* Sets the searching_drive_config of this cfg limit technical spec.
	*
	* @param searching_drive_config the searching_drive_config of this cfg limit technical spec
	*/
	@Override
	public void setSearching_drive_config(int searching_drive_config) {
		_cfgLimitTechnicalSpec.setSearching_drive_config(searching_drive_config);
	}

	/**
	* Returns the altername of this cfg limit technical spec.
	*
	* @return the altername of this cfg limit technical spec
	*/
	@Override
	public java.lang.String getAltername() {
		return _cfgLimitTechnicalSpec.getAltername();
	}

	/**
	* Sets the altername of this cfg limit technical spec.
	*
	* @param altername the altername of this cfg limit technical spec
	*/
	@Override
	public void setAltername(java.lang.String altername) {
		_cfgLimitTechnicalSpec.setAltername(altername);
	}

	/**
	* Returns the sequenceno of this cfg limit technical spec.
	*
	* @return the sequenceno of this cfg limit technical spec
	*/
	@Override
	public int getSequenceno() {
		return _cfgLimitTechnicalSpec.getSequenceno();
	}

	/**
	* Sets the sequenceno of this cfg limit technical spec.
	*
	* @param sequenceno the sequenceno of this cfg limit technical spec
	*/
	@Override
	public void setSequenceno(int sequenceno) {
		_cfgLimitTechnicalSpec.setSequenceno(sequenceno);
	}

	/**
	* Returns the specificationcode of this cfg limit technical spec.
	*
	* @return the specificationcode of this cfg limit technical spec
	*/
	@Override
	public java.lang.String getSpecificationcode() {
		return _cfgLimitTechnicalSpec.getSpecificationcode();
	}

	/**
	* Sets the specificationcode of this cfg limit technical spec.
	*
	* @param specificationcode the specificationcode of this cfg limit technical spec
	*/
	@Override
	public void setSpecificationcode(java.lang.String specificationcode) {
		_cfgLimitTechnicalSpec.setSpecificationcode(specificationcode);
	}

	/**
	* Returns the specificationname of this cfg limit technical spec.
	*
	* @return the specificationname of this cfg limit technical spec
	*/
	@Override
	public java.lang.String getSpecificationname() {
		return _cfgLimitTechnicalSpec.getSpecificationname();
	}

	/**
	* Sets the specificationname of this cfg limit technical spec.
	*
	* @param specificationname the specificationname of this cfg limit technical spec
	*/
	@Override
	public void setSpecificationname(java.lang.String specificationname) {
		_cfgLimitTechnicalSpec.setSpecificationname(specificationname);
	}

	/**
	* Returns the spec_description of this cfg limit technical spec.
	*
	* @return the spec_description of this cfg limit technical spec
	*/
	@Override
	public java.lang.String getSpec_description() {
		return _cfgLimitTechnicalSpec.getSpec_description();
	}

	/**
	* Sets the spec_description of this cfg limit technical spec.
	*
	* @param spec_description the spec_description of this cfg limit technical spec
	*/
	@Override
	public void setSpec_description(java.lang.String spec_description) {
		_cfgLimitTechnicalSpec.setSpec_description(spec_description);
	}

	/**
	* Returns the spec_category of this cfg limit technical spec.
	*
	* @return the spec_category of this cfg limit technical spec
	*/
	@Override
	public java.lang.String getSpec_category() {
		return _cfgLimitTechnicalSpec.getSpec_category();
	}

	/**
	* Sets the spec_category of this cfg limit technical spec.
	*
	* @param spec_category the spec_category of this cfg limit technical spec
	*/
	@Override
	public void setSpec_category(java.lang.String spec_category) {
		_cfgLimitTechnicalSpec.setSpec_category(spec_category);
	}

	/**
	* Returns the datagroupid of this cfg limit technical spec.
	*
	* @return the datagroupid of this cfg limit technical spec
	*/
	@Override
	public long getDatagroupid() {
		return _cfgLimitTechnicalSpec.getDatagroupid();
	}

	/**
	* Sets the datagroupid of this cfg limit technical spec.
	*
	* @param datagroupid the datagroupid of this cfg limit technical spec
	*/
	@Override
	public void setDatagroupid(long datagroupid) {
		_cfgLimitTechnicalSpec.setDatagroupid(datagroupid);
	}

	@Override
	public boolean isNew() {
		return _cfgLimitTechnicalSpec.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_cfgLimitTechnicalSpec.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _cfgLimitTechnicalSpec.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cfgLimitTechnicalSpec.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _cfgLimitTechnicalSpec.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _cfgLimitTechnicalSpec.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cfgLimitTechnicalSpec.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cfgLimitTechnicalSpec.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_cfgLimitTechnicalSpec.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_cfgLimitTechnicalSpec.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cfgLimitTechnicalSpec.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CfgLimitTechnicalSpecWrapper((CfgLimitTechnicalSpec)_cfgLimitTechnicalSpec.clone());
	}

	@Override
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec cfgLimitTechnicalSpec) {
		return _cfgLimitTechnicalSpec.compareTo(cfgLimitTechnicalSpec);
	}

	@Override
	public int hashCode() {
		return _cfgLimitTechnicalSpec.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec> toCacheModel() {
		return _cfgLimitTechnicalSpec.toCacheModel();
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec toEscapedModel() {
		return new CfgLimitTechnicalSpecWrapper(_cfgLimitTechnicalSpec.toEscapedModel());
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CfgLimitTechnicalSpec toUnescapedModel() {
		return new CfgLimitTechnicalSpecWrapper(_cfgLimitTechnicalSpec.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cfgLimitTechnicalSpec.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cfgLimitTechnicalSpec.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cfgLimitTechnicalSpec.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CfgLimitTechnicalSpecWrapper)) {
			return false;
		}

		CfgLimitTechnicalSpecWrapper cfgLimitTechnicalSpecWrapper = (CfgLimitTechnicalSpecWrapper)obj;

		if (Validator.equals(_cfgLimitTechnicalSpec,
					cfgLimitTechnicalSpecWrapper._cfgLimitTechnicalSpec)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CfgLimitTechnicalSpec getWrappedCfgLimitTechnicalSpec() {
		return _cfgLimitTechnicalSpec;
	}

	@Override
	public CfgLimitTechnicalSpec getWrappedModel() {
		return _cfgLimitTechnicalSpec;
	}

	@Override
	public void resetOriginalValues() {
		_cfgLimitTechnicalSpec.resetOriginalValues();
	}

	private CfgLimitTechnicalSpec _cfgLimitTechnicalSpec;
}