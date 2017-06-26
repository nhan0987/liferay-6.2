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
 * The base model interface for the VehicleGroupInitial service. Represents a row in the &quot;vr_vehiclegroup_initial&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialImpl}.
 * </p>
 *
 * @author win_64
 * @see VehicleGroupInitial
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialImpl
 * @see vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialModelImpl
 * @generated
 */
public interface VehicleGroupInitialModel extends BaseModel<VehicleGroupInitial> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vehicle group initial model instance should use the {@link VehicleGroupInitial} interface instead.
	 */

	/**
	 * Returns the primary key of this vehicle group initial.
	 *
	 * @return the primary key of this vehicle group initial
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vehicle group initial.
	 *
	 * @param primaryKey the primary key of this vehicle group initial
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vehicle group initial.
	 *
	 * @return the ID of this vehicle group initial
	 */
	public long getId();

	/**
	 * Sets the ID of this vehicle group initial.
	 *
	 * @param id the ID of this vehicle group initial
	 */
	public void setId(long id);

	/**
	 * Returns the vehicle class of this vehicle group initial.
	 *
	 * @return the vehicle class of this vehicle group initial
	 */
	@AutoEscape
	public String getVehicleClass();

	/**
	 * Sets the vehicle class of this vehicle group initial.
	 *
	 * @param vehicleClass the vehicle class of this vehicle group initial
	 */
	public void setVehicleClass(String vehicleClass);

	/**
	 * Returns the registered inspection ID of this vehicle group initial.
	 *
	 * @return the registered inspection ID of this vehicle group initial
	 */
	public long getRegisteredInspectionId();

	/**
	 * Sets the registered inspection ID of this vehicle group initial.
	 *
	 * @param registeredInspectionId the registered inspection ID of this vehicle group initial
	 */
	public void setRegisteredInspectionId(long registeredInspectionId);

	/**
	 * Returns the technical spec code of this vehicle group initial.
	 *
	 * @return the technical spec code of this vehicle group initial
	 */
	@AutoEscape
	public String getTechnicalSpecCode();

	/**
	 * Sets the technical spec code of this vehicle group initial.
	 *
	 * @param technicalSpecCode the technical spec code of this vehicle group initial
	 */
	public void setTechnicalSpecCode(String technicalSpecCode);

	/**
	 * Returns the reference certificate no of this vehicle group initial.
	 *
	 * @return the reference certificate no of this vehicle group initial
	 */
	@AutoEscape
	public String getReferenceCertificateNo();

	/**
	 * Sets the reference certificate no of this vehicle group initial.
	 *
	 * @param referenceCertificateNo the reference certificate no of this vehicle group initial
	 */
	public void setReferenceCertificateNo(String referenceCertificateNo);

	/**
	 * Returns the safetytestreport no of this vehicle group initial.
	 *
	 * @return the safetytestreport no of this vehicle group initial
	 */
	@AutoEscape
	public String getSafetytestreportNo();

	/**
	 * Sets the safetytestreport no of this vehicle group initial.
	 *
	 * @param safetytestreportNo the safetytestreport no of this vehicle group initial
	 */
	public void setSafetytestreportNo(String safetytestreportNo);

	/**
	 * Returns the emissiontestreport no of this vehicle group initial.
	 *
	 * @return the emissiontestreport no of this vehicle group initial
	 */
	@AutoEscape
	public String getEmissiontestreportNo();

	/**
	 * Sets the emissiontestreport no of this vehicle group initial.
	 *
	 * @param emissiontestreportNo the emissiontestreport no of this vehicle group initial
	 */
	public void setEmissiontestreportNo(String emissiontestreportNo);

	/**
	 * Returns the copreport no of this vehicle group initial.
	 *
	 * @return the copreport no of this vehicle group initial
	 */
	@AutoEscape
	public String getCopreportNo();

	/**
	 * Sets the copreport no of this vehicle group initial.
	 *
	 * @param copreportNo the copreport no of this vehicle group initial
	 */
	public void setCopreportNo(String copreportNo);

	/**
	 * Returns the controlreport no of this vehicle group initial.
	 *
	 * @return the controlreport no of this vehicle group initial
	 */
	@AutoEscape
	public String getControlreportNo();

	/**
	 * Sets the controlreport no of this vehicle group initial.
	 *
	 * @param controlreportNo the controlreport no of this vehicle group initial
	 */
	public void setControlreportNo(String controlreportNo);

	/**
	 * Returns the vehicle type of this vehicle group initial.
	 *
	 * @return the vehicle type of this vehicle group initial
	 */
	@AutoEscape
	public String getVehicleType();

	/**
	 * Sets the vehicle type of this vehicle group initial.
	 *
	 * @param vehicleType the vehicle type of this vehicle group initial
	 */
	public void setVehicleType(String vehicleType);

	/**
	 * Returns the engine type of this vehicle group initial.
	 *
	 * @return the engine type of this vehicle group initial
	 */
	@AutoEscape
	public String getEngineType();

	/**
	 * Sets the engine type of this vehicle group initial.
	 *
	 * @param engineType the engine type of this vehicle group initial
	 */
	public void setEngineType(String engineType);

	/**
	 * Returns the trade mark of this vehicle group initial.
	 *
	 * @return the trade mark of this vehicle group initial
	 */
	@AutoEscape
	public String getTradeMark();

	/**
	 * Sets the trade mark of this vehicle group initial.
	 *
	 * @param tradeMark the trade mark of this vehicle group initial
	 */
	public void setTradeMark(String tradeMark);

	/**
	 * Returns the mark as vehicle of this vehicle group initial.
	 *
	 * @return the mark as vehicle of this vehicle group initial
	 */
	public int getMarkAsVehicle();

	/**
	 * Sets the mark as vehicle of this vehicle group initial.
	 *
	 * @param markAsVehicle the mark as vehicle of this vehicle group initial
	 */
	public void setMarkAsVehicle(int markAsVehicle);

	/**
	 * Returns the commercial name of this vehicle group initial.
	 *
	 * @return the commercial name of this vehicle group initial
	 */
	@AutoEscape
	public String getCommercialName();

	/**
	 * Sets the commercial name of this vehicle group initial.
	 *
	 * @param commercialName the commercial name of this vehicle group initial
	 */
	public void setCommercialName(String commercialName);

	/**
	 * Returns the model code of this vehicle group initial.
	 *
	 * @return the model code of this vehicle group initial
	 */
	@AutoEscape
	public String getModelCode();

	/**
	 * Sets the model code of this vehicle group initial.
	 *
	 * @param modelCode the model code of this vehicle group initial
	 */
	public void setModelCode(String modelCode);

	/**
	 * Returns the production plant of this vehicle group initial.
	 *
	 * @return the production plant of this vehicle group initial
	 */
	@AutoEscape
	public String getProductionPlant();

	/**
	 * Sets the production plant of this vehicle group initial.
	 *
	 * @param productionPlant the production plant of this vehicle group initial
	 */
	public void setProductionPlant(String productionPlant);

	/**
	 * Returns the address of production plant of this vehicle group initial.
	 *
	 * @return the address of production plant of this vehicle group initial
	 */
	@AutoEscape
	public String getAddressOfProductionPlant();

	/**
	 * Sets the address of production plant of this vehicle group initial.
	 *
	 * @param addressOfProductionPlant the address of production plant of this vehicle group initial
	 */
	public void setAddressOfProductionPlant(String addressOfProductionPlant);

	/**
	 * Returns the emission standard of this vehicle group initial.
	 *
	 * @return the emission standard of this vehicle group initial
	 */
	@AutoEscape
	public String getEmissionStandard();

	/**
	 * Sets the emission standard of this vehicle group initial.
	 *
	 * @param emissionStandard the emission standard of this vehicle group initial
	 */
	public void setEmissionStandard(String emissionStandard);

	/**
	 * Returns the safety test report ID of this vehicle group initial.
	 *
	 * @return the safety test report ID of this vehicle group initial
	 */
	public long getSafetyTestReportId();

	/**
	 * Sets the safety test report ID of this vehicle group initial.
	 *
	 * @param safetyTestReportId the safety test report ID of this vehicle group initial
	 */
	public void setSafetyTestReportId(long safetyTestReportId);

	/**
	 * Returns the emission test report ID of this vehicle group initial.
	 *
	 * @return the emission test report ID of this vehicle group initial
	 */
	public long getEmissionTestReportId();

	/**
	 * Sets the emission test report ID of this vehicle group initial.
	 *
	 * @param emissionTestReportId the emission test report ID of this vehicle group initial
	 */
	public void setEmissionTestReportId(long emissionTestReportId);

	/**
	 * Returns the cop report ID of this vehicle group initial.
	 *
	 * @return the cop report ID of this vehicle group initial
	 */
	public long getCopReportId();

	/**
	 * Sets the cop report ID of this vehicle group initial.
	 *
	 * @param copReportId the cop report ID of this vehicle group initial
	 */
	public void setCopReportId(long copReportId);

	/**
	 * Returns the controlreport ID of this vehicle group initial.
	 *
	 * @return the controlreport ID of this vehicle group initial
	 */
	public long getControlreportId();

	/**
	 * Sets the controlreport ID of this vehicle group initial.
	 *
	 * @param controlreportId the controlreport ID of this vehicle group initial
	 */
	public void setControlreportId(long controlreportId);

	/**
	 * Returns the specification version of this vehicle group initial.
	 *
	 * @return the specification version of this vehicle group initial
	 */
	public long getSpecificationVersion();

	/**
	 * Sets the specification version of this vehicle group initial.
	 *
	 * @param specificationVersion the specification version of this vehicle group initial
	 */
	public void setSpecificationVersion(long specificationVersion);

	/**
	 * Returns the remarks of this vehicle group initial.
	 *
	 * @return the remarks of this vehicle group initial
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this vehicle group initial.
	 *
	 * @param remarks the remarks of this vehicle group initial
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the attached file of this vehicle group initial.
	 *
	 * @return the attached file of this vehicle group initial
	 */
	public long getAttachedFile();

	/**
	 * Sets the attached file of this vehicle group initial.
	 *
	 * @param attachedFile the attached file of this vehicle group initial
	 */
	public void setAttachedFile(long attachedFile);

	/**
	 * Returns the synch date of this vehicle group initial.
	 *
	 * @return the synch date of this vehicle group initial
	 */
	public Date getSynchDate();

	/**
	 * Sets the synch date of this vehicle group initial.
	 *
	 * @param SynchDate the synch date of this vehicle group initial
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
	public int compareTo(VehicleGroupInitial vehicleGroupInitial);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VehicleGroupInitial> toCacheModel();

	@Override
	public VehicleGroupInitial toEscapedModel();

	@Override
	public VehicleGroupInitial toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}