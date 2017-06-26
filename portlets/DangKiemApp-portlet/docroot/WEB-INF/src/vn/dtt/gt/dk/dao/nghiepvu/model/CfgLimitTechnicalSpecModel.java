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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the CfgLimitTechnicalSpec service. Represents a row in the &quot;vr_cfg_limit_technicalspec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgLimitTechnicalSpecModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgLimitTechnicalSpecImpl}.
 * </p>
 *
 * @author win_64
 * @see CfgLimitTechnicalSpec
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgLimitTechnicalSpecImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgLimitTechnicalSpecModelImpl
 * @generated
 */
public interface CfgLimitTechnicalSpecModel extends BaseModel<CfgLimitTechnicalSpec> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cfg limit technical spec model instance should use the {@link CfgLimitTechnicalSpec} interface instead.
	 */

	/**
	 * Returns the primary key of this cfg limit technical spec.
	 *
	 * @return the primary key of this cfg limit technical spec
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cfg limit technical spec.
	 *
	 * @param primaryKey the primary key of this cfg limit technical spec
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this cfg limit technical spec.
	 *
	 * @return the ID of this cfg limit technical spec
	 */
	public long getId();

	/**
	 * Sets the ID of this cfg limit technical spec.
	 *
	 * @param id the ID of this cfg limit technical spec
	 */
	public void setId(long id);

	/**
	 * Returns the vehicletypecode of this cfg limit technical spec.
	 *
	 * @return the vehicletypecode of this cfg limit technical spec
	 */
	@AutoEscape
	public String getVehicletypecode();

	/**
	 * Sets the vehicletypecode of this cfg limit technical spec.
	 *
	 * @param vehicletypecode the vehicletypecode of this cfg limit technical spec
	 */
	public void setVehicletypecode(String vehicletypecode);

	/**
	 * Returns the vehicletypename of this cfg limit technical spec.
	 *
	 * @return the vehicletypename of this cfg limit technical spec
	 */
	@AutoEscape
	public String getVehicletypename();

	/**
	 * Sets the vehicletypename of this cfg limit technical spec.
	 *
	 * @param vehicletypename the vehicletypename of this cfg limit technical spec
	 */
	public void setVehicletypename(String vehicletypename);

	/**
	 * Returns the reference_code_3 of this cfg limit technical spec.
	 *
	 * @return the reference_code_3 of this cfg limit technical spec
	 */
	@AutoEscape
	public String getReference_code_3();

	/**
	 * Sets the reference_code_3 of this cfg limit technical spec.
	 *
	 * @param reference_code_3 the reference_code_3 of this cfg limit technical spec
	 */
	public void setReference_code_3(String reference_code_3);

	/**
	 * Returns the reference_name of this cfg limit technical spec.
	 *
	 * @return the reference_name of this cfg limit technical spec
	 */
	@AutoEscape
	public String getReference_name();

	/**
	 * Sets the reference_name of this cfg limit technical spec.
	 *
	 * @param reference_name the reference_name of this cfg limit technical spec
	 */
	public void setReference_name(String reference_name);

	/**
	 * Returns the searching_drive_config of this cfg limit technical spec.
	 *
	 * @return the searching_drive_config of this cfg limit technical spec
	 */
	public int getSearching_drive_config();

	/**
	 * Sets the searching_drive_config of this cfg limit technical spec.
	 *
	 * @param searching_drive_config the searching_drive_config of this cfg limit technical spec
	 */
	public void setSearching_drive_config(int searching_drive_config);

	/**
	 * Returns the altername of this cfg limit technical spec.
	 *
	 * @return the altername of this cfg limit technical spec
	 */
	@AutoEscape
	public String getAltername();

	/**
	 * Sets the altername of this cfg limit technical spec.
	 *
	 * @param altername the altername of this cfg limit technical spec
	 */
	public void setAltername(String altername);

	/**
	 * Returns the sequenceno of this cfg limit technical spec.
	 *
	 * @return the sequenceno of this cfg limit technical spec
	 */
	public int getSequenceno();

	/**
	 * Sets the sequenceno of this cfg limit technical spec.
	 *
	 * @param sequenceno the sequenceno of this cfg limit technical spec
	 */
	public void setSequenceno(int sequenceno);

	/**
	 * Returns the specificationcode of this cfg limit technical spec.
	 *
	 * @return the specificationcode of this cfg limit technical spec
	 */
	@AutoEscape
	public String getSpecificationcode();

	/**
	 * Sets the specificationcode of this cfg limit technical spec.
	 *
	 * @param specificationcode the specificationcode of this cfg limit technical spec
	 */
	public void setSpecificationcode(String specificationcode);

	/**
	 * Returns the specificationname of this cfg limit technical spec.
	 *
	 * @return the specificationname of this cfg limit technical spec
	 */
	@AutoEscape
	public String getSpecificationname();

	/**
	 * Sets the specificationname of this cfg limit technical spec.
	 *
	 * @param specificationname the specificationname of this cfg limit technical spec
	 */
	public void setSpecificationname(String specificationname);

	/**
	 * Returns the spec_description of this cfg limit technical spec.
	 *
	 * @return the spec_description of this cfg limit technical spec
	 */
	@AutoEscape
	public String getSpec_description();

	/**
	 * Sets the spec_description of this cfg limit technical spec.
	 *
	 * @param spec_description the spec_description of this cfg limit technical spec
	 */
	public void setSpec_description(String spec_description);

	/**
	 * Returns the spec_category of this cfg limit technical spec.
	 *
	 * @return the spec_category of this cfg limit technical spec
	 */
	@AutoEscape
	public String getSpec_category();

	/**
	 * Sets the spec_category of this cfg limit technical spec.
	 *
	 * @param spec_category the spec_category of this cfg limit technical spec
	 */
	public void setSpec_category(String spec_category);

	/**
	 * Returns the datagroupid of this cfg limit technical spec.
	 *
	 * @return the datagroupid of this cfg limit technical spec
	 */
	public long getDatagroupid();

	/**
	 * Sets the datagroupid of this cfg limit technical spec.
	 *
	 * @param datagroupid the datagroupid of this cfg limit technical spec
	 */
	public void setDatagroupid(long datagroupid);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CfgLimitTechnicalSpec cfgLimitTechnicalSpec);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CfgLimitTechnicalSpec> toCacheModel();

	@Override
	public CfgLimitTechnicalSpec toEscapedModel();

	@Override
	public CfgLimitTechnicalSpec toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}