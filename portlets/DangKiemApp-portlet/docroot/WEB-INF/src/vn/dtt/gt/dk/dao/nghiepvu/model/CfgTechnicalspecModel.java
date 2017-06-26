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
 * The base model interface for the CfgTechnicalspec service. Represents a row in the &quot;vr_cfg_technicalspec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecImpl}.
 * </p>
 *
 * @author win_64
 * @see CfgTechnicalspec
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.CfgTechnicalspecModelImpl
 * @generated
 */
public interface CfgTechnicalspecModel extends BaseModel<CfgTechnicalspec> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cfg technicalspec model instance should use the {@link CfgTechnicalspec} interface instead.
	 */

	/**
	 * Returns the primary key of this cfg technicalspec.
	 *
	 * @return the primary key of this cfg technicalspec
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cfg technicalspec.
	 *
	 * @param primaryKey the primary key of this cfg technicalspec
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this cfg technicalspec.
	 *
	 * @return the ID of this cfg technicalspec
	 */
	public long getId();

	/**
	 * Sets the ID of this cfg technicalspec.
	 *
	 * @param id the ID of this cfg technicalspec
	 */
	public void setId(long id);

	/**
	 * Returns the vehicle type code of this cfg technicalspec.
	 *
	 * @return the vehicle type code of this cfg technicalspec
	 */
	@AutoEscape
	public String getVehicleTypeCode();

	/**
	 * Sets the vehicle type code of this cfg technicalspec.
	 *
	 * @param vehicleTypeCode the vehicle type code of this cfg technicalspec
	 */
	public void setVehicleTypeCode(String vehicleTypeCode);

	/**
	 * Returns the vehicle type name of this cfg technicalspec.
	 *
	 * @return the vehicle type name of this cfg technicalspec
	 */
	@AutoEscape
	public String getVehicleTypeName();

	/**
	 * Sets the vehicle type name of this cfg technicalspec.
	 *
	 * @param vehicleTypeName the vehicle type name of this cfg technicalspec
	 */
	public void setVehicleTypeName(String vehicleTypeName);

	/**
	 * Returns the sequenceno of this cfg technicalspec.
	 *
	 * @return the sequenceno of this cfg technicalspec
	 */
	public long getSequenceno();

	/**
	 * Sets the sequenceno of this cfg technicalspec.
	 *
	 * @param sequenceno the sequenceno of this cfg technicalspec
	 */
	public void setSequenceno(long sequenceno);

	/**
	 * Returns the specification code of this cfg technicalspec.
	 *
	 * @return the specification code of this cfg technicalspec
	 */
	@AutoEscape
	public String getSpecificationCode();

	/**
	 * Sets the specification code of this cfg technicalspec.
	 *
	 * @param specificationCode the specification code of this cfg technicalspec
	 */
	public void setSpecificationCode(String specificationCode);

	/**
	 * Returns the specification name of this cfg technicalspec.
	 *
	 * @return the specification name of this cfg technicalspec
	 */
	@AutoEscape
	public String getSpecificationName();

	/**
	 * Sets the specification name of this cfg technicalspec.
	 *
	 * @param specificationName the specification name of this cfg technicalspec
	 */
	public void setSpecificationName(String specificationName);

	/**
	 * Returns the spec description of this cfg technicalspec.
	 *
	 * @return the spec description of this cfg technicalspec
	 */
	@AutoEscape
	public String getSpecDescription();

	/**
	 * Sets the spec description of this cfg technicalspec.
	 *
	 * @param specDescription the spec description of this cfg technicalspec
	 */
	public void setSpecDescription(String specDescription);

	/**
	 * Returns the spec category of this cfg technicalspec.
	 *
	 * @return the spec category of this cfg technicalspec
	 */
	@AutoEscape
	public String getSpecCategory();

	/**
	 * Sets the spec category of this cfg technicalspec.
	 *
	 * @param specCategory the spec category of this cfg technicalspec
	 */
	public void setSpecCategory(String specCategory);

	/**
	 * Returns the specification group of this cfg technicalspec.
	 *
	 * @return the specification group of this cfg technicalspec
	 */
	public long getSpecificationGroup();

	/**
	 * Sets the specification group of this cfg technicalspec.
	 *
	 * @param specificationGroup the specification group of this cfg technicalspec
	 */
	public void setSpecificationGroup(long specificationGroup);

	/**
	 * Returns the searching included of this cfg technicalspec.
	 *
	 * @return the searching included of this cfg technicalspec
	 */
	public long getSearchingIncluded();

	/**
	 * Sets the searching included of this cfg technicalspec.
	 *
	 * @param searchingIncluded the searching included of this cfg technicalspec
	 */
	public void setSearchingIncluded(long searchingIncluded);

	/**
	 * Returns the reference included of this cfg technicalspec.
	 *
	 * @return the reference included of this cfg technicalspec
	 */
	public long getReferenceIncluded();

	/**
	 * Sets the reference included of this cfg technicalspec.
	 *
	 * @param referenceIncluded the reference included of this cfg technicalspec
	 */
	public void setReferenceIncluded(long referenceIncluded);

	/**
	 * Returns the certificate included of this cfg technicalspec.
	 *
	 * @return the certificate included of this cfg technicalspec
	 */
	public long getCertificateIncluded();

	/**
	 * Sets the certificate included of this cfg technicalspec.
	 *
	 * @param certificateIncluded the certificate included of this cfg technicalspec
	 */
	public void setCertificateIncluded(long certificateIncluded);

	/**
	 * Returns the datagroupid of this cfg technicalspec.
	 *
	 * @return the datagroupid of this cfg technicalspec
	 */
	public long getDatagroupid();

	/**
	 * Sets the datagroupid of this cfg technicalspec.
	 *
	 * @param datagroupid the datagroupid of this cfg technicalspec
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
	public int compareTo(
		vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec cfgTechnicalspec);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec> toCacheModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec toEscapedModel();

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CfgTechnicalspec toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}