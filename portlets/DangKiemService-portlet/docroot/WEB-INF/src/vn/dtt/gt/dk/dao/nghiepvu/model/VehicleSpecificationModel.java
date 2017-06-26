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

import java.util.Date;

/**
 * The base model interface for the VehicleSpecification service. Represents a row in the &quot;vr_vehiclespecification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationImpl}.
 * </p>
 *
 * @author huymq
 * @see VehicleSpecification
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl
 * @generated
 */
public interface VehicleSpecificationModel extends BaseModel<VehicleSpecification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vehicle specification model instance should use the {@link VehicleSpecification} interface instead.
	 */

	/**
	 * Returns the primary key of this vehicle specification.
	 *
	 * @return the primary key of this vehicle specification
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vehicle specification.
	 *
	 * @param primaryKey the primary key of this vehicle specification
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vehicle specification.
	 *
	 * @return the ID of this vehicle specification
	 */
	public long getId();

	/**
	 * Sets the ID of this vehicle specification.
	 *
	 * @param id the ID of this vehicle specification
	 */
	public void setId(long id);

	/**
	 * Returns the vehicle group ID of this vehicle specification.
	 *
	 * @return the vehicle group ID of this vehicle specification
	 */
	public long getVehicleGroupId();

	/**
	 * Sets the vehicle group ID of this vehicle specification.
	 *
	 * @param vehicleGroupId the vehicle group ID of this vehicle specification
	 */
	public void setVehicleGroupId(long vehicleGroupId);

	/**
	 * Returns the specification version of this vehicle specification.
	 *
	 * @return the specification version of this vehicle specification
	 */
	public long getSpecificationVersion();

	/**
	 * Sets the specification version of this vehicle specification.
	 *
	 * @param specificationVersion the specification version of this vehicle specification
	 */
	public void setSpecificationVersion(long specificationVersion);

	/**
	 * Returns the specification source code of this vehicle specification.
	 *
	 * @return the specification source code of this vehicle specification
	 */
	@AutoEscape
	public String getSpecificationSourceCode();

	/**
	 * Sets the specification source code of this vehicle specification.
	 *
	 * @param specificationSourceCode the specification source code of this vehicle specification
	 */
	public void setSpecificationSourceCode(String specificationSourceCode);

	/**
	 * Returns the specification code of this vehicle specification.
	 *
	 * @return the specification code of this vehicle specification
	 */
	@AutoEscape
	public String getSpecificationCode();

	/**
	 * Sets the specification code of this vehicle specification.
	 *
	 * @param specificationCode the specification code of this vehicle specification
	 */
	public void setSpecificationCode(String specificationCode);

	/**
	 * Returns the specification name of this vehicle specification.
	 *
	 * @return the specification name of this vehicle specification
	 */
	@AutoEscape
	public String getSpecificationName();

	/**
	 * Sets the specification name of this vehicle specification.
	 *
	 * @param specificationName the specification name of this vehicle specification
	 */
	public void setSpecificationName(String specificationName);

	/**
	 * Returns the specification value of this vehicle specification.
	 *
	 * @return the specification value of this vehicle specification
	 */
	@AutoEscape
	public String getSpecificationValue();

	/**
	 * Sets the specification value of this vehicle specification.
	 *
	 * @param specificationValue the specification value of this vehicle specification
	 */
	public void setSpecificationValue(String specificationValue);

	/**
	 * Returns the safety test report ID of this vehicle specification.
	 *
	 * @return the safety test report ID of this vehicle specification
	 */
	public long getSafetyTestReportId();

	/**
	 * Sets the safety test report ID of this vehicle specification.
	 *
	 * @param safetyTestReportId the safety test report ID of this vehicle specification
	 */
	public void setSafetyTestReportId(long safetyTestReportId);

	/**
	 * Returns the inspection record ID of this vehicle specification.
	 *
	 * @return the inspection record ID of this vehicle specification
	 */
	public long getInspectionRecordId();

	/**
	 * Sets the inspection record ID of this vehicle specification.
	 *
	 * @param inspectionRecordId the inspection record ID of this vehicle specification
	 */
	public void setInspectionRecordId(long inspectionRecordId);

	/**
	 * Returns the specific result of this vehicle specification.
	 *
	 * @return the specific result of this vehicle specification
	 */
	public long getSpecificResult();

	/**
	 * Sets the specific result of this vehicle specification.
	 *
	 * @param specificResult the specific result of this vehicle specification
	 */
	public void setSpecificResult(long specificResult);

	/**
	 * Returns the synchdate of this vehicle specification.
	 *
	 * @return the synchdate of this vehicle specification
	 */
	public Date getSynchdate();

	/**
	 * Sets the synchdate of this vehicle specification.
	 *
	 * @param synchdate the synchdate of this vehicle specification
	 */
	public void setSynchdate(Date synchdate);

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
	public int compareTo(VehicleSpecification vehicleSpecification);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VehicleSpecification> toCacheModel();

	@Override
	public VehicleSpecification toEscapedModel();

	@Override
	public VehicleSpecification toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}