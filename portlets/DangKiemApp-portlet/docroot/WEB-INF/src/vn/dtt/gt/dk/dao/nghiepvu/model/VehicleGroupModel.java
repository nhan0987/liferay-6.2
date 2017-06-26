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
 * The base model interface for the VehicleGroup service. Represents a row in the &quot;vr_vehiclegroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl}.
 * </p>
 *
 * @author win_64
 * @see VehicleGroup
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl
 * @generated
 */
public interface VehicleGroupModel extends BaseModel<VehicleGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vehicle group model instance should use the {@link VehicleGroup} interface instead.
	 */

	/**
	 * Returns the primary key of this vehicle group.
	 *
	 * @return the primary key of this vehicle group
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vehicle group.
	 *
	 * @param primaryKey the primary key of this vehicle group
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vehicle group.
	 *
	 * @return the ID of this vehicle group
	 */
	public long getId();

	/**
	 * Sets the ID of this vehicle group.
	 *
	 * @param id the ID of this vehicle group
	 */
	public void setId(long id);

	/**
	 * Returns the vehicle class of this vehicle group.
	 *
	 * @return the vehicle class of this vehicle group
	 */
	@AutoEscape
	public String getVehicleClass();

	/**
	 * Sets the vehicle class of this vehicle group.
	 *
	 * @param vehicleClass the vehicle class of this vehicle group
	 */
	public void setVehicleClass(String vehicleClass);

	/**
	 * Returns the registered inspection ID of this vehicle group.
	 *
	 * @return the registered inspection ID of this vehicle group
	 */
	public long getRegisteredInspectionId();

	/**
	 * Sets the registered inspection ID of this vehicle group.
	 *
	 * @param registeredInspectionId the registered inspection ID of this vehicle group
	 */
	public void setRegisteredInspectionId(long registeredInspectionId);

	/**
	 * Returns the technical spec code of this vehicle group.
	 *
	 * @return the technical spec code of this vehicle group
	 */
	@AutoEscape
	public String getTechnicalSpecCode();

	/**
	 * Sets the technical spec code of this vehicle group.
	 *
	 * @param technicalSpecCode the technical spec code of this vehicle group
	 */
	public void setTechnicalSpecCode(String technicalSpecCode);

	/**
	 * Returns the reference certificate no of this vehicle group.
	 *
	 * @return the reference certificate no of this vehicle group
	 */
	@AutoEscape
	public String getReferenceCertificateNo();

	/**
	 * Sets the reference certificate no of this vehicle group.
	 *
	 * @param referenceCertificateNo the reference certificate no of this vehicle group
	 */
	public void setReferenceCertificateNo(String referenceCertificateNo);

	/**
	 * Returns the safetytestreport no of this vehicle group.
	 *
	 * @return the safetytestreport no of this vehicle group
	 */
	@AutoEscape
	public String getSafetytestreportNo();

	/**
	 * Sets the safetytestreport no of this vehicle group.
	 *
	 * @param safetytestreportNo the safetytestreport no of this vehicle group
	 */
	public void setSafetytestreportNo(String safetytestreportNo);

	/**
	 * Returns the emissiontestreport no of this vehicle group.
	 *
	 * @return the emissiontestreport no of this vehicle group
	 */
	@AutoEscape
	public String getEmissiontestreportNo();

	/**
	 * Sets the emissiontestreport no of this vehicle group.
	 *
	 * @param emissiontestreportNo the emissiontestreport no of this vehicle group
	 */
	public void setEmissiontestreportNo(String emissiontestreportNo);

	/**
	 * Returns the copreport no of this vehicle group.
	 *
	 * @return the copreport no of this vehicle group
	 */
	@AutoEscape
	public String getCopreportNo();

	/**
	 * Sets the copreport no of this vehicle group.
	 *
	 * @param copreportNo the copreport no of this vehicle group
	 */
	public void setCopreportNo(String copreportNo);

	/**
	 * Returns the controlreport no of this vehicle group.
	 *
	 * @return the controlreport no of this vehicle group
	 */
	@AutoEscape
	public String getControlreportNo();

	/**
	 * Sets the controlreport no of this vehicle group.
	 *
	 * @param controlreportNo the controlreport no of this vehicle group
	 */
	public void setControlreportNo(String controlreportNo);

	/**
	 * Returns the vehicle type of this vehicle group.
	 *
	 * @return the vehicle type of this vehicle group
	 */
	@AutoEscape
	public String getVehicleType();

	/**
	 * Sets the vehicle type of this vehicle group.
	 *
	 * @param vehicleType the vehicle type of this vehicle group
	 */
	public void setVehicleType(String vehicleType);

	/**
	 * Returns the engine type of this vehicle group.
	 *
	 * @return the engine type of this vehicle group
	 */
	@AutoEscape
	public String getEngineType();

	/**
	 * Sets the engine type of this vehicle group.
	 *
	 * @param engineType the engine type of this vehicle group
	 */
	public void setEngineType(String engineType);

	/**
	 * Returns the trade mark of this vehicle group.
	 *
	 * @return the trade mark of this vehicle group
	 */
	@AutoEscape
	public String getTradeMark();

	/**
	 * Sets the trade mark of this vehicle group.
	 *
	 * @param tradeMark the trade mark of this vehicle group
	 */
	public void setTradeMark(String tradeMark);

	/**
	 * Returns the mark as vehicle of this vehicle group.
	 *
	 * @return the mark as vehicle of this vehicle group
	 */
	public int getMarkAsVehicle();

	/**
	 * Sets the mark as vehicle of this vehicle group.
	 *
	 * @param markAsVehicle the mark as vehicle of this vehicle group
	 */
	public void setMarkAsVehicle(int markAsVehicle);

	/**
	 * Returns the commercial name of this vehicle group.
	 *
	 * @return the commercial name of this vehicle group
	 */
	@AutoEscape
	public String getCommercialName();

	/**
	 * Sets the commercial name of this vehicle group.
	 *
	 * @param commercialName the commercial name of this vehicle group
	 */
	public void setCommercialName(String commercialName);

	/**
	 * Returns the model code of this vehicle group.
	 *
	 * @return the model code of this vehicle group
	 */
	@AutoEscape
	public String getModelCode();

	/**
	 * Sets the model code of this vehicle group.
	 *
	 * @param modelCode the model code of this vehicle group
	 */
	public void setModelCode(String modelCode);

	/**
	 * Returns the production plant of this vehicle group.
	 *
	 * @return the production plant of this vehicle group
	 */
	@AutoEscape
	public String getProductionPlant();

	/**
	 * Sets the production plant of this vehicle group.
	 *
	 * @param productionPlant the production plant of this vehicle group
	 */
	public void setProductionPlant(String productionPlant);

	/**
	 * Returns the address of production plant of this vehicle group.
	 *
	 * @return the address of production plant of this vehicle group
	 */
	@AutoEscape
	public String getAddressOfProductionPlant();

	/**
	 * Sets the address of production plant of this vehicle group.
	 *
	 * @param addressOfProductionPlant the address of production plant of this vehicle group
	 */
	public void setAddressOfProductionPlant(String addressOfProductionPlant);

	/**
	 * Returns the emission standard of this vehicle group.
	 *
	 * @return the emission standard of this vehicle group
	 */
	@AutoEscape
	public String getEmissionStandard();

	/**
	 * Sets the emission standard of this vehicle group.
	 *
	 * @param emissionStandard the emission standard of this vehicle group
	 */
	public void setEmissionStandard(String emissionStandard);

	/**
	 * Returns the safety test report ID of this vehicle group.
	 *
	 * @return the safety test report ID of this vehicle group
	 */
	public long getSafetyTestReportId();

	/**
	 * Sets the safety test report ID of this vehicle group.
	 *
	 * @param safetyTestReportId the safety test report ID of this vehicle group
	 */
	public void setSafetyTestReportId(long safetyTestReportId);

	/**
	 * Returns the emission test report ID of this vehicle group.
	 *
	 * @return the emission test report ID of this vehicle group
	 */
	public long getEmissionTestReportId();

	/**
	 * Sets the emission test report ID of this vehicle group.
	 *
	 * @param emissionTestReportId the emission test report ID of this vehicle group
	 */
	public void setEmissionTestReportId(long emissionTestReportId);

	/**
	 * Returns the cop report ID of this vehicle group.
	 *
	 * @return the cop report ID of this vehicle group
	 */
	public long getCopReportId();

	/**
	 * Sets the cop report ID of this vehicle group.
	 *
	 * @param copReportId the cop report ID of this vehicle group
	 */
	public void setCopReportId(long copReportId);

	/**
	 * Returns the controlreport ID of this vehicle group.
	 *
	 * @return the controlreport ID of this vehicle group
	 */
	public long getControlreportId();

	/**
	 * Sets the controlreport ID of this vehicle group.
	 *
	 * @param controlreportId the controlreport ID of this vehicle group
	 */
	public void setControlreportId(long controlreportId);

	/**
	 * Returns the specification version of this vehicle group.
	 *
	 * @return the specification version of this vehicle group
	 */
	public long getSpecificationVersion();

	/**
	 * Sets the specification version of this vehicle group.
	 *
	 * @param specificationVersion the specification version of this vehicle group
	 */
	public void setSpecificationVersion(long specificationVersion);

	/**
	 * Returns the ho so thu tuc ID of this vehicle group.
	 *
	 * @return the ho so thu tuc ID of this vehicle group
	 */
	public long getHoSoThuTucId();

	/**
	 * Sets the ho so thu tuc ID of this vehicle group.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID of this vehicle group
	 */
	public void setHoSoThuTucId(long hoSoThuTucId);

	/**
	 * Returns the remarks of this vehicle group.
	 *
	 * @return the remarks of this vehicle group
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this vehicle group.
	 *
	 * @param remarks the remarks of this vehicle group
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the attached file of this vehicle group.
	 *
	 * @return the attached file of this vehicle group
	 */
	public long getAttachedFile();

	/**
	 * Sets the attached file of this vehicle group.
	 *
	 * @param attachedFile the attached file of this vehicle group
	 */
	public void setAttachedFile(long attachedFile);

	/**
	 * Returns the synch date of this vehicle group.
	 *
	 * @return the synch date of this vehicle group
	 */
	public Date getSynchDate();

	/**
	 * Sets the synch date of this vehicle group.
	 *
	 * @param SynchDate the synch date of this vehicle group
	 */
	public void setSynchDate(Date SynchDate);

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
	public int compareTo(VehicleGroup vehicleGroup);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VehicleGroup> toCacheModel();

	@Override
	public VehicleGroup toEscapedModel();

	@Override
	public VehicleGroup toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}